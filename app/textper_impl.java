package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class textper_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
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
         gxload_6( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         n2248ManCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A2248ManCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2406ExhAlbCod = (int)(GXutil.lval( httpContext.GetPar( "ExhAlbCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A2406ExhAlbCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
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
         gxload_11( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
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
         gxload_12( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ALBARANES EXTERNOS PERVAFIL", ""), (short)(0)) ;
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
      nRC_GXsfl_85 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_85"))) ;
      nGXsfl_85_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_85_idx"))) ;
      sGXsfl_85_idx = httpContext.GetPar( "sGXsfl_85_idx") ;
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

   public textper_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public textper_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( textper_impl.class ));
   }

   public textper_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TEXTPER.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Externo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtExhAlbCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2406ExhAlbCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtExhAlbCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2406ExhAlbCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2406ExhAlbCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExhAlbCod_Jsonclick, 0, "", "", "", "", "", 1, edtExhAlbCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Prioridad Alb.Externo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtExhAlbPri_Internalname, GXutil.rtrim( A2411ExhAlbPri), GXutil.rtrim( localUtil.format( A2411ExhAlbPri, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExhAlbPri_Jsonclick, 0, "", "", "", "", "", 1, edtExhAlbPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtManCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "", "", "", "", "", 1, edtManCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre Manuf", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtManNom_Internalname, GXutil.rtrim( A2249ManNom), GXutil.rtrim( localUtil.format( A2249ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManNom_Jsonclick, 0, "", "", "", "", "", 1, edtManNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Transportista", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Albaran Externo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtExhAlbFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtExhAlbFec_Internalname, localUtil.format(A2407ExhAlbFec, "99/99/99"), localUtil.format( A2407ExhAlbFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExhAlbFec_Jsonclick, 0, "", "", "", "", "", 1, edtExhAlbFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTPER.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtExhAlbFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtExhAlbFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TEXTPER.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Albaran Externo Listado 0/1", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtExhAlbLis_Internalname, GXutil.ltrim( localUtil.ntoc( A2409ExhAlbLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtExhAlbLis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2409ExhAlbLis), "9") : localUtil.format( DecimalUtil.doubleToDec(A2409ExhAlbLis), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExhAlbLis_Jsonclick, 0, "", "", "", "", "", 1, edtExhAlbLis_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Seccion Alb.Externo A / E", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtExhAlbSec_Internalname, GXutil.rtrim( A2412ExhAlbSec), GXutil.rtrim( localUtil.format( A2412ExhAlbSec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExhAlbSec_Jsonclick, 0, "", "", "", "", "", 1, edtExhAlbSec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Total Kilos Alb.Manuf.", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtExhAlbKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2408ExhAlbKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtExhAlbKgs_Enabled!=0) ? localUtil.format( A2408ExhAlbKgs, "ZZZZZ9.99") : localUtil.format( A2408ExhAlbKgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExhAlbKgs_Jsonclick, 0, "", "", "", "", "", 1, edtExhAlbKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Total Bultos Alb. Manuf.", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtExhAlbBul_Internalname, GXutil.ltrim( localUtil.ntoc( A2405ExhAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtExhAlbBul_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2405ExhAlbBul), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2405ExhAlbBul), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtExhAlbBul_Jsonclick, 0, "", "", "", "", "", 1, edtExhAlbBul_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTPER.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol85( ) ;
      nGXsfl_85_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount327 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_327 = (short)(1) ;
            scanStart84327( ) ;
            while ( RcdFound327 != 0 )
            {
               init_level_properties327( ) ;
               getByPrimaryKey84327( ) ;
               addRow84327( ) ;
               scanNext84327( ) ;
            }
            scanEnd84327( ) ;
            nBlankRcdCount327 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2405ExhAlbBul = A2405ExhAlbBul ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         B2408ExhAlbKgs = A2408ExhAlbKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         standaloneNotModal84327( ) ;
         standaloneModal84327( ) ;
         sMode327 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRow84327( ) ;
            edtavnRcdDeleted_327_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_327_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_327_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_327_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtExhKgsEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHKGSENT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExhKgsEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhKgsEnt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtExhBulEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHBULENT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExhBulEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhBulEnt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtExhEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHEST_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExhEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhEst_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarNumTen_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMTEN_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumTen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumTen_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarNMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNMTR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNMtr_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtBarKgsCl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGSCL_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKgsCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsCl_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtExhAlbObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHALBOBS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtExhAlbObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbObs_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_327 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal84327( ) ;
            }
            sendRow84327( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode327 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2405ExhAlbBul = B2405ExhAlbBul ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         A2408ExhAlbKgs = B2408ExhAlbKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount327 = (short)(5) ;
         nRcdExists_327 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart84327( ) ;
            while ( RcdFound327 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_85327( ) ;
               init_level_properties327( ) ;
               standaloneNotModal84327( ) ;
               getByPrimaryKey84327( ) ;
               standaloneModal84327( ) ;
               addRow84327( ) ;
               scanNext84327( ) ;
            }
            scanEnd84327( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode327 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_85327( ) ;
      initAll84327( ) ;
      init_level_properties327( ) ;
      B2405ExhAlbBul = A2405ExhAlbBul ;
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      B2408ExhAlbKgs = A2408ExhAlbKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      nRcdExists_327 = (short)(0) ;
      nIsMod_327 = (short)(0) ;
      nRcdDeleted_327 = (short)(0) ;
      nBlankRcdCount327 = (short)(nBlankRcdUsr327+nBlankRcdCount327) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount327 > 0 )
      {
         standaloneNotModal84327( ) ;
         standaloneModal84327( ) ;
         addRow84327( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount327 = (short)(nBlankRcdCount327-1) ;
      }
      Gx_mode = sMode327 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A2405ExhAlbBul = B2405ExhAlbBul ;
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      A2408ExhAlbKgs = B2408ExhAlbKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTPER.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TEXTPER.htm");
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
         Z2406ExhAlbCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z2406ExhAlbCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2411ExhAlbPri = httpContext.cgiGet( "Z2411ExhAlbPri") ;
         Z2407ExhAlbFec = localUtil.ctod( httpContext.cgiGet( "Z2407ExhAlbFec"), 0) ;
         Z2409ExhAlbLis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2409ExhAlbLis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2412ExhAlbSec = httpContext.cgiGet( "Z2412ExhAlbSec") ;
         Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O2405ExhAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( "O2405ExhAlbBul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O2408ExhAlbKgs = localUtil.ctond( httpContext.cgiGet( "O2408ExhAlbKgs")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExhAlbCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExhAlbCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EXHALBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtExhAlbCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2406ExhAlbCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
         }
         else
         {
            A2406ExhAlbCod = (int)(localUtil.ctol( httpContext.cgiGet( edtExhAlbCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
         }
         A2411ExhAlbPri = httpContext.cgiGet( edtExhAlbPri_Internalname) ;
         n2411ExhAlbPri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2411ExhAlbPri", A2411ExhAlbPri);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtManCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2248ManCod = (short)(0) ;
            n2248ManCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         else
         {
            A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2248ManCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
         n2249ManNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtExhAlbFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "EXHALBFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtExhAlbFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2407ExhAlbFec = GXutil.nullDate() ;
            n2407ExhAlbFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2407ExhAlbFec", localUtil.format(A2407ExhAlbFec, "99/99/99"));
         }
         else
         {
            A2407ExhAlbFec = localUtil.ctod( httpContext.cgiGet( edtExhAlbFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n2407ExhAlbFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2407ExhAlbFec", localUtil.format(A2407ExhAlbFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExhAlbLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExhAlbLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EXHALBLIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtExhAlbLis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2409ExhAlbLis = (byte)(0) ;
            n2409ExhAlbLis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2409ExhAlbLis", GXutil.str( A2409ExhAlbLis, 1, 0));
         }
         else
         {
            A2409ExhAlbLis = (byte)(localUtil.ctol( httpContext.cgiGet( edtExhAlbLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2409ExhAlbLis = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2409ExhAlbLis", GXutil.str( A2409ExhAlbLis, 1, 0));
         }
         A2412ExhAlbSec = httpContext.cgiGet( edtExhAlbSec_Internalname) ;
         n2412ExhAlbSec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2412ExhAlbSec", A2412ExhAlbSec);
         A2408ExhAlbKgs = localUtil.ctond( httpContext.cgiGet( edtExhAlbKgs_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         A2405ExhAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( edtExhAlbBul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
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
            A2406ExhAlbCod = (int)(GXutil.lval( httpContext.GetPar( "ExhAlbCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
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
            initAll84326( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_327_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_327_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      disableAttributes84326( ) ;
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

   public void confirm_840( )
   {
      beforeValidate84326( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls84326( ) ;
         }
         else
         {
            checkExtendedTable84326( ) ;
            if ( AnyError == 0 )
            {
               zm84326( 5) ;
               zm84326( 6) ;
               zm84326( 7) ;
               zm84326( 8) ;
            }
            closeExtendedTableCursors84326( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode326 = Gx_mode ;
         confirm_84327( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode326 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode326 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues840( ) ;
      }
   }

   public void confirm_84327( )
   {
      s2405ExhAlbBul = O2405ExhAlbBul ;
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      s2408ExhAlbKgs = O2408ExhAlbKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow84327( ) ;
         if ( ( nRcdExists_327 != 0 ) || ( nIsMod_327 != 0 ) )
         {
            getKey84327( ) ;
            if ( ( nRcdExists_327 == 0 ) && ( nRcdDeleted_327 == 0 ) )
            {
               if ( RcdFound327 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate84327( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable84327( ) ;
                     if ( AnyError == 0 )
                     {
                        zm84327( 10) ;
                        zm84327( 11) ;
                        zm84327( 12) ;
                     }
                     closeExtendedTableCursors84327( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2405ExhAlbBul = A2405ExhAlbBul ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
                     O2408ExhAlbKgs = A2408ExhAlbKgs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound327 != 0 )
               {
                  if ( nRcdDeleted_327 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey84327( ) ;
                     load84327( ) ;
                     beforeValidate84327( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls84327( ) ;
                        O2405ExhAlbBul = A2405ExhAlbBul ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
                        O2408ExhAlbKgs = A2408ExhAlbKgs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_327 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate84327( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable84327( ) ;
                           if ( AnyError == 0 )
                           {
                              zm84327( 10) ;
                              zm84327( 11) ;
                              zm84327( 12) ;
                           }
                           closeExtendedTableCursors84327( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2405ExhAlbBul = A2405ExhAlbBul ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
                           O2408ExhAlbKgs = A2408ExhAlbKgs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_327 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_327_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtExhKgsEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExhBulEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExhEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2414ExhEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarNumTen_Internalname, GXutil.rtrim( A1878BarNumTen)) ;
         httpContext.changePostValue( edtBarNMtr_Internalname, GXutil.rtrim( A1500BarNMtr)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKgsCl_Internalname, GXutil.ltrim( localUtil.ntoc( A10512BarKgsCl, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExhAlbObs_Internalname, GXutil.rtrim( A2410ExhAlbObs)) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_85_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z2415ExhKgsEnt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2413ExhBulEnt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2414ExhEst_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z2414ExhEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10512BarKgsCl_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z10512BarKgsCl, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2410ExhAlbObs_"+sGXsfl_85_idx, GXutil.rtrim( Z2410ExhAlbObs)) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_85_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "T2413ExhBulEnt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2415ExhKgsEnt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_327_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_327_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_327_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_327 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_327_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_327_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHKGSENT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhKgsEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHBULENT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhBulEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHEST_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMTEN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTen_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNMTR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGSCL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgsCl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHALBOBS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhAlbObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2405ExhAlbBul = s2405ExhAlbBul ;
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      O2408ExhAlbKgs = s2408ExhAlbKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption840( )
   {
   }

   public void zm84326( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2411ExhAlbPri = T00848_A2411ExhAlbPri[0] ;
            Z2407ExhAlbFec = T00848_A2407ExhAlbFec[0] ;
            Z2409ExhAlbLis = T00848_A2409ExhAlbLis[0] ;
            Z2412ExhAlbSec = T00848_A2412ExhAlbSec[0] ;
            Z840TrnCod = T00848_A840TrnCod[0] ;
            Z2248ManCod = T00848_A2248ManCod[0] ;
         }
         else
         {
            Z2411ExhAlbPri = A2411ExhAlbPri ;
            Z2407ExhAlbFec = A2407ExhAlbFec ;
            Z2409ExhAlbLis = A2409ExhAlbLis ;
            Z2412ExhAlbSec = A2412ExhAlbSec ;
            Z840TrnCod = A840TrnCod ;
            Z2248ManCod = A2248ManCod ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z2406ExhAlbCod = A2406ExhAlbCod ;
         Z2411ExhAlbPri = A2411ExhAlbPri ;
         Z2407ExhAlbFec = A2407ExhAlbFec ;
         Z2409ExhAlbLis = A2409ExhAlbLis ;
         Z2412ExhAlbSec = A2412ExhAlbSec ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z2248ManCod = A2248ManCod ;
         Z407EmprNom = A407EmprNom ;
         Z2408ExhAlbKgs = A2408ExhAlbKgs ;
         Z2405ExhAlbBul = A2405ExhAlbBul ;
         Z2249ManNom = A2249ManNom ;
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

   public void load84326( )
   {
      /* Using cursor T008415 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound326 = (short)(1) ;
         A2411ExhAlbPri = T008415_A2411ExhAlbPri[0] ;
         n2411ExhAlbPri = T008415_n2411ExhAlbPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2411ExhAlbPri", A2411ExhAlbPri);
         A407EmprNom = T008415_A407EmprNom[0] ;
         n407EmprNom = T008415_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2249ManNom = T008415_A2249ManNom[0] ;
         n2249ManNom = T008415_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A841TrnNom = T008415_A841TrnNom[0] ;
         n841TrnNom = T008415_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A2407ExhAlbFec = T008415_A2407ExhAlbFec[0] ;
         n2407ExhAlbFec = T008415_n2407ExhAlbFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2407ExhAlbFec", localUtil.format(A2407ExhAlbFec, "99/99/99"));
         A2409ExhAlbLis = T008415_A2409ExhAlbLis[0] ;
         n2409ExhAlbLis = T008415_n2409ExhAlbLis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2409ExhAlbLis", GXutil.str( A2409ExhAlbLis, 1, 0));
         A2412ExhAlbSec = T008415_A2412ExhAlbSec[0] ;
         n2412ExhAlbSec = T008415_n2412ExhAlbSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2412ExhAlbSec", A2412ExhAlbSec);
         A840TrnCod = T008415_A840TrnCod[0] ;
         n840TrnCod = T008415_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A2248ManCod = T008415_A2248ManCod[0] ;
         n2248ManCod = T008415_n2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2408ExhAlbKgs = T008415_A2408ExhAlbKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         A2405ExhAlbBul = T008415_A2405ExhAlbBul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         zm84326( -4) ;
      }
      pr_default.close(11);
      onLoadActions84326( ) ;
   }

   public void onLoadActions84326( )
   {
      O2405ExhAlbBul = A2405ExhAlbBul ;
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      O2408ExhAlbKgs = A2408ExhAlbKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
   }

   public void checkExtendedTable84326( )
   {
      nIsDirty_326 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00849 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00849_A407EmprNom[0] ;
      n407EmprNom = T00849_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
      /* Using cursor T008410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T008410_A841TrnNom[0] ;
      n841TrnNom = T008410_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(8);
      /* Using cursor T008411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T008411_A2249ManNom[0] ;
      n2249ManNom = T008411_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      pr_default.close(9);
      /* Using cursor T008413 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A2408ExhAlbKgs = T008413_A2408ExhAlbKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         A2405ExhAlbBul = T008413_A2405ExhAlbBul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      }
      else
      {
         nIsDirty_326 = (short)(1) ;
         A2408ExhAlbKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         nIsDirty_326 = (short)(1) ;
         A2405ExhAlbBul = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      }
      pr_default.close(10);
      if ( ! ( ( GXutil.strcmp(A2411ExhAlbPri, "0") == 0 ) || ( GXutil.strcmp(A2411ExhAlbPri, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad Alb.Externo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "EXHALBPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtExhAlbPri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors84326( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod )
   {
      /* Using cursor T008416 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T008416_A407EmprNom[0] ;
      n407EmprNom = T008416_n407EmprNom[0] ;
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

   public void gxload_6( String A396EmprCod ,
                         short A840TrnCod )
   {
      /* Using cursor T008417 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T008417_A841TrnNom[0] ;
      n841TrnNom = T008417_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_7( String A396EmprCod ,
                         short A2248ManCod )
   {
      /* Using cursor T008418 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T008418_A2249ManNom[0] ;
      n2249ManNom = T008418_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2249ManNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_8( String A396EmprCod ,
                         int A2406ExhAlbCod )
   {
      /* Using cursor T008420 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A2408ExhAlbKgs = T008420_A2408ExhAlbKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         A2405ExhAlbBul = T008420_A2405ExhAlbBul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      }
      else
      {
         A2408ExhAlbKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         A2405ExhAlbBul = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2408ExhAlbKgs, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2405ExhAlbBul, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey84326( )
   {
      /* Using cursor T008421 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound326 = (short)(1) ;
      }
      else
      {
         RcdFound326 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00848 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm84326( 4) ;
         RcdFound326 = (short)(1) ;
         A2406ExhAlbCod = T00848_A2406ExhAlbCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
         A2411ExhAlbPri = T00848_A2411ExhAlbPri[0] ;
         n2411ExhAlbPri = T00848_n2411ExhAlbPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2411ExhAlbPri", A2411ExhAlbPri);
         A2407ExhAlbFec = T00848_A2407ExhAlbFec[0] ;
         n2407ExhAlbFec = T00848_n2407ExhAlbFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2407ExhAlbFec", localUtil.format(A2407ExhAlbFec, "99/99/99"));
         A2409ExhAlbLis = T00848_A2409ExhAlbLis[0] ;
         n2409ExhAlbLis = T00848_n2409ExhAlbLis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2409ExhAlbLis", GXutil.str( A2409ExhAlbLis, 1, 0));
         A2412ExhAlbSec = T00848_A2412ExhAlbSec[0] ;
         n2412ExhAlbSec = T00848_n2412ExhAlbSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2412ExhAlbSec", A2412ExhAlbSec);
         A396EmprCod = T00848_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = T00848_A840TrnCod[0] ;
         n840TrnCod = T00848_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A2248ManCod = T00848_A2248ManCod[0] ;
         n2248ManCod = T00848_n2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z2406ExhAlbCod = A2406ExhAlbCod ;
         sMode326 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load84326( ) ;
         if ( AnyError == 1 )
         {
            RcdFound326 = (short)(0) ;
            initializeNonKey84326( ) ;
         }
         Gx_mode = sMode326 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound326 = (short)(0) ;
         initializeNonKey84326( ) ;
         sMode326 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode326 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey84326( ) ;
      if ( RcdFound326 == 0 )
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
      RcdFound326 = (short)(0) ;
      /* Using cursor T008422 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T008422_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T008422_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008422_A2406ExhAlbCod[0] < A2406ExhAlbCod ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T008422_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T008422_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008422_A2406ExhAlbCod[0] > A2406ExhAlbCod ) ) )
         {
            A396EmprCod = T008422_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2406ExhAlbCod = T008422_A2406ExhAlbCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
            RcdFound326 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound326 = (short)(0) ;
      /* Using cursor T008423 */
      pr_default.execute(18, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T008423_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T008423_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008423_A2406ExhAlbCod[0] > A2406ExhAlbCod ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T008423_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T008423_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008423_A2406ExhAlbCod[0] < A2406ExhAlbCod ) ) )
         {
            A396EmprCod = T008423_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2406ExhAlbCod = T008423_A2406ExhAlbCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
            RcdFound326 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey84326( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2405ExhAlbBul = O2405ExhAlbBul ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         A2408ExhAlbKgs = O2408ExhAlbKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert84326( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound326 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2406ExhAlbCod != Z2406ExhAlbCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2406ExhAlbCod = Z2406ExhAlbCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2405ExhAlbBul = O2405ExhAlbBul ;
               httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
               A2408ExhAlbKgs = O2408ExhAlbKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
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
               A2405ExhAlbBul = O2405ExhAlbBul ;
               httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
               A2408ExhAlbKgs = O2408ExhAlbKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
               update84326( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2406ExhAlbCod != Z2406ExhAlbCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A2405ExhAlbBul = O2405ExhAlbBul ;
               httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
               A2408ExhAlbKgs = O2408ExhAlbKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert84326( ) ;
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
                  A2405ExhAlbBul = O2405ExhAlbBul ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
                  A2408ExhAlbKgs = O2408ExhAlbKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert84326( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2406ExhAlbCod != Z2406ExhAlbCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2406ExhAlbCod = Z2406ExhAlbCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2405ExhAlbBul = O2405ExhAlbBul ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         A2408ExhAlbKgs = O2408ExhAlbKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
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
      getKey84326( ) ;
      if ( RcdFound326 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2406ExhAlbCod != Z2406ExhAlbCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2406ExhAlbCod = Z2406ExhAlbCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2406ExhAlbCod != Z2406ExhAlbCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "textper");
      GX_FocusControl = edtExhAlbPri_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_840( ) ;
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
      if ( RcdFound326 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtExhAlbPri_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart84326( ) ;
      if ( RcdFound326 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtExhAlbPri_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd84326( ) ;
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
      if ( RcdFound326 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtExhAlbPri_Internalname ;
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
      if ( RcdFound326 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtExhAlbPri_Internalname ;
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
      scanStart84326( ) ;
      if ( RcdFound326 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound326 != 0 )
         {
            scanNext84326( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtExhAlbPri_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd84326( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency84326( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00847 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXPER"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z2411ExhAlbPri, T00847_A2411ExhAlbPri[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z2407ExhAlbFec), GXutil.resetTime(T00847_A2407ExhAlbFec[0])) ) || ( Z2409ExhAlbLis != T00847_A2409ExhAlbLis[0] ) || ( GXutil.strcmp(Z2412ExhAlbSec, T00847_A2412ExhAlbSec[0]) != 0 ) || ( Z840TrnCod != T00847_A840TrnCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2248ManCod != T00847_A2248ManCod[0] ) )
         {
            if ( GXutil.strcmp(Z2411ExhAlbPri, T00847_A2411ExhAlbPri[0]) != 0 )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ExhAlbPri");
               GXutil.writeLogRaw("Old: ",Z2411ExhAlbPri);
               GXutil.writeLogRaw("Current: ",T00847_A2411ExhAlbPri[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2407ExhAlbFec), GXutil.resetTime(T00847_A2407ExhAlbFec[0])) ) )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ExhAlbFec");
               GXutil.writeLogRaw("Old: ",Z2407ExhAlbFec);
               GXutil.writeLogRaw("Current: ",T00847_A2407ExhAlbFec[0]);
            }
            if ( Z2409ExhAlbLis != T00847_A2409ExhAlbLis[0] )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ExhAlbLis");
               GXutil.writeLogRaw("Old: ",Z2409ExhAlbLis);
               GXutil.writeLogRaw("Current: ",T00847_A2409ExhAlbLis[0]);
            }
            if ( GXutil.strcmp(Z2412ExhAlbSec, T00847_A2412ExhAlbSec[0]) != 0 )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ExhAlbSec");
               GXutil.writeLogRaw("Old: ",Z2412ExhAlbSec);
               GXutil.writeLogRaw("Current: ",T00847_A2412ExhAlbSec[0]);
            }
            if ( Z840TrnCod != T00847_A840TrnCod[0] )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T00847_A840TrnCod[0]);
            }
            if ( Z2248ManCod != T00847_A2248ManCod[0] )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ManCod");
               GXutil.writeLogRaw("Old: ",Z2248ManCod);
               GXutil.writeLogRaw("Current: ",T00847_A2248ManCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCEXPER"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert84326( )
   {
      beforeValidate84326( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable84326( ) ;
      }
      if ( AnyError == 0 )
      {
         zm84326( 0) ;
         checkOptimisticConcurrency84326( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm84326( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert84326( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008424 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A2406ExhAlbCod), Boolean.valueOf(n2411ExhAlbPri), A2411ExhAlbPri, Boolean.valueOf(n2407ExhAlbFec), A2407ExhAlbFec, Boolean.valueOf(n2409ExhAlbLis), Byte.valueOf(A2409ExhAlbLis), Boolean.valueOf(n2412ExhAlbSec), A2412ExhAlbSec, A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXPER");
                  if ( (pr_default.getStatus(19) == 1) )
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
                        processLevel84326( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption840( ) ;
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
            load84326( ) ;
         }
         endLevel84326( ) ;
      }
      closeExtendedTableCursors84326( ) ;
   }

   public void update84326( )
   {
      beforeValidate84326( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable84326( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency84326( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm84326( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate84326( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008425 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n2411ExhAlbPri), A2411ExhAlbPri, Boolean.valueOf(n2407ExhAlbFec), A2407ExhAlbFec, Boolean.valueOf(n2409ExhAlbLis), Byte.valueOf(A2409ExhAlbLis), Boolean.valueOf(n2412ExhAlbSec), A2412ExhAlbSec, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod), A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXPER");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXPER"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate84326( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel84326( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption840( ) ;
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
         endLevel84326( ) ;
      }
      closeExtendedTableCursors84326( ) ;
   }

   public void deferredUpdate84326( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate84326( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency84326( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls84326( ) ;
         afterConfirm84326( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete84326( ) ;
            if ( AnyError == 0 )
            {
               A2405ExhAlbBul = O2405ExhAlbBul ;
               httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
               A2408ExhAlbKgs = O2408ExhAlbKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
               scanStart84327( ) ;
               while ( RcdFound327 != 0 )
               {
                  getByPrimaryKey84327( ) ;
                  delete84327( ) ;
                  scanNext84327( ) ;
                  O2405ExhAlbBul = A2405ExhAlbBul ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
                  O2408ExhAlbKgs = A2408ExhAlbKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
               }
               scanEnd84327( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008426 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXPER");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound326 == 0 )
                        {
                           initAll84326( ) ;
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
                        resetCaption840( ) ;
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
      sMode326 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel84326( ) ;
      Gx_mode = sMode326 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls84326( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T008427 */
         pr_default.execute(22, new Object[] {A396EmprCod});
         A407EmprNom = T008427_A407EmprNom[0] ;
         n407EmprNom = T008427_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(22);
         /* Using cursor T008429 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A2408ExhAlbKgs = T008429_A2408ExhAlbKgs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
            A2405ExhAlbBul = T008429_A2405ExhAlbBul[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         }
         else
         {
            A2408ExhAlbKgs = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
            A2405ExhAlbBul = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         }
         pr_default.close(23);
         /* Using cursor T008430 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
         A2249ManNom = T008430_A2249ManNom[0] ;
         n2249ManNom = T008430_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         pr_default.close(24);
         /* Using cursor T008431 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T008431_A841TrnNom[0] ;
         n841TrnNom = T008431_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(25);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T008432 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel84327( )
   {
      s2405ExhAlbBul = O2405ExhAlbBul ;
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      s2408ExhAlbKgs = O2408ExhAlbKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow84327( ) ;
         if ( ( nRcdExists_327 != 0 ) || ( nIsMod_327 != 0 ) )
         {
            standaloneNotModal84327( ) ;
            getKey84327( ) ;
            if ( ( nRcdExists_327 == 0 ) && ( nRcdDeleted_327 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert84327( ) ;
            }
            else
            {
               if ( RcdFound327 != 0 )
               {
                  if ( ( nRcdDeleted_327 != 0 ) && ( nRcdExists_327 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete84327( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_327 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update84327( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_327 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2405ExhAlbBul = A2405ExhAlbBul ;
            httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
            O2408ExhAlbKgs = A2408ExhAlbKgs ;
            httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_327_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtExhKgsEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExhBulEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExhEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2414ExhEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarNumTen_Internalname, GXutil.rtrim( A1878BarNumTen)) ;
         httpContext.changePostValue( edtBarNMtr_Internalname, GXutil.rtrim( A1500BarNMtr)) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKgsCl_Internalname, GXutil.ltrim( localUtil.ntoc( A10512BarKgsCl, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtExhAlbObs_Internalname, GXutil.rtrim( A2410ExhAlbObs)) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_85_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z2415ExhKgsEnt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2413ExhBulEnt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2414ExhEst_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z2414ExhEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10512BarKgsCl_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z10512BarKgsCl, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2410ExhAlbObs_"+sGXsfl_85_idx, GXutil.rtrim( Z2410ExhAlbObs)) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_85_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "T2413ExhBulEnt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2415ExhKgsEnt_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_327_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_327_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_327_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_327 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_327_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_327_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHKGSENT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhKgsEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHBULENT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhBulEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHEST_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMTEN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTen_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNMTR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGSCL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgsCl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EXHALBOBS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhAlbObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll84327( ) ;
      if ( AnyError != 0 )
      {
         O2405ExhAlbBul = s2405ExhAlbBul ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         O2408ExhAlbKgs = s2408ExhAlbKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      }
      nRcdExists_327 = (short)(0) ;
      nIsMod_327 = (short)(0) ;
      nRcdDeleted_327 = (short)(0) ;
   }

   public void processLevel84326( )
   {
      /* Save parent mode. */
      sMode326 = Gx_mode ;
      processNestedLevel84327( ) ;
      if ( AnyError != 0 )
      {
         O2405ExhAlbBul = s2405ExhAlbBul ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         O2408ExhAlbKgs = s2408ExhAlbKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode326 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel84326( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete84326( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "textper");
         if ( AnyError == 0 )
         {
            confirmValues840( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "textper");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart84326( )
   {
      /* Using cursor T008433 */
      pr_default.execute(27);
      RcdFound326 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound326 = (short)(1) ;
         A396EmprCod = T008433_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2406ExhAlbCod = T008433_A2406ExhAlbCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext84326( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound326 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound326 = (short)(1) ;
         A396EmprCod = T008433_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2406ExhAlbCod = T008433_A2406ExhAlbCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
      }
   }

   public void scanEnd84326( )
   {
      pr_default.close(27);
   }

   public void afterConfirm84326( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert84326( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate84326( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete84326( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete84326( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate84326( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes84326( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtExhAlbCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhAlbCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbCod_Enabled), 5, 0), true);
      edtExhAlbPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhAlbPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbPri_Enabled), 5, 0), true);
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtManNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNom_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtExhAlbFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhAlbFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbFec_Enabled), 5, 0), true);
      edtExhAlbLis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhAlbLis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbLis_Enabled), 5, 0), true);
      edtExhAlbSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhAlbSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbSec_Enabled), 5, 0), true);
      edtExhAlbKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhAlbKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbKgs_Enabled), 5, 0), true);
      edtExhAlbBul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhAlbBul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbBul_Enabled), 5, 0), true);
   }

   public void zm84327( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2415ExhKgsEnt = T00843_A2415ExhKgsEnt[0] ;
            Z2413ExhBulEnt = T00843_A2413ExhBulEnt[0] ;
            Z2414ExhEst = T00843_A2414ExhEst[0] ;
            Z10512BarKgsCl = T00843_A10512BarKgsCl[0] ;
            Z2410ExhAlbObs = T00843_A2410ExhAlbObs[0] ;
            Z457FasCod = T00843_A457FasCod[0] ;
         }
         else
         {
            Z2415ExhKgsEnt = A2415ExhKgsEnt ;
            Z2413ExhBulEnt = A2413ExhBulEnt ;
            Z2414ExhEst = A2414ExhEst ;
            Z10512BarKgsCl = A10512BarKgsCl ;
            Z2410ExhAlbObs = A2410ExhAlbObs ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z2406ExhAlbCod = A2406ExhAlbCod ;
         Z2415ExhKgsEnt = A2415ExhKgsEnt ;
         Z2413ExhBulEnt = A2413ExhBulEnt ;
         Z2414ExhEst = A2414ExhEst ;
         Z10512BarKgsCl = A10512BarKgsCl ;
         Z2410ExhAlbObs = A2410ExhAlbObs ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z212BarSer = A212BarSer ;
         Z1878BarNumTen = A1878BarNumTen ;
         Z1500BarNMtr = A1500BarNMtr ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal84327( )
   {
   }

   public void standaloneModal84327( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void load84327( )
   {
      /* Using cursor T008434 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound327 = (short)(1) ;
         A279CliNom = T008434_A279CliNom[0] ;
         A2415ExhKgsEnt = T008434_A2415ExhKgsEnt[0] ;
         n2415ExhKgsEnt = T008434_n2415ExhKgsEnt[0] ;
         A2413ExhBulEnt = T008434_A2413ExhBulEnt[0] ;
         n2413ExhBulEnt = T008434_n2413ExhBulEnt[0] ;
         A2414ExhEst = T008434_A2414ExhEst[0] ;
         n2414ExhEst = T008434_n2414ExhEst[0] ;
         A212BarSer = T008434_A212BarSer[0] ;
         A1878BarNumTen = T008434_A1878BarNumTen[0] ;
         A1500BarNMtr = T008434_A1500BarNMtr[0] ;
         A135BarColNom = T008434_A135BarColNom[0] ;
         A136BarColNum = T008434_A136BarColNum[0] ;
         A10512BarKgsCl = T008434_A10512BarKgsCl[0] ;
         n10512BarKgsCl = T008434_n10512BarKgsCl[0] ;
         A2410ExhAlbObs = T008434_A2410ExhAlbObs[0] ;
         n2410ExhAlbObs = T008434_n2410ExhAlbObs[0] ;
         A457FasCod = T008434_A457FasCod[0] ;
         n457FasCod = T008434_n457FasCod[0] ;
         A252CliCod = T008434_A252CliCod[0] ;
         n252CliCod = T008434_n252CliCod[0] ;
         zm84327( -9) ;
      }
      pr_default.close(28);
      onLoadActions84327( ) ;
   }

   public void onLoadActions84327( )
   {
      if ( isIns( )  )
      {
         A2408ExhAlbKgs = O2408ExhAlbKgs.add(A2415ExhKgsEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2408ExhAlbKgs = O2408ExhAlbKgs.add(A2415ExhKgsEnt).subtract(O2415ExhKgsEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2408ExhAlbKgs = O2408ExhAlbKgs.subtract(O2415ExhKgsEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A2405ExhAlbBul = (short)(O2405ExhAlbBul+A2413ExhBulEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A2405ExhAlbBul = (short)(O2405ExhAlbBul+A2413ExhBulEnt-O2413ExhBulEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A2405ExhAlbBul = (short)(O2405ExhAlbBul-O2413ExhBulEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
            }
         }
      }
   }

   public void checkExtendedTable84327( )
   {
      nIsDirty_327 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal84327( ) ;
      /* Using cursor T00844 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T00845 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T00845_A212BarSer[0] ;
      A1878BarNumTen = T00845_A1878BarNumTen[0] ;
      A1500BarNMtr = T00845_A1500BarNMtr[0] ;
      A135BarColNom = T00845_A135BarColNom[0] ;
      A136BarColNum = T00845_A136BarColNum[0] ;
      A252CliCod = T00845_A252CliCod[0] ;
      n252CliCod = T00845_n252CliCod[0] ;
      pr_default.close(3);
      /* Using cursor T00846 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            GXCCtl = "CLICOD_" + sGXsfl_85_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T00846_A279CliNom[0] ;
      pr_default.close(4);
      if ( isIns( )  )
      {
         nIsDirty_327 = (short)(1) ;
         A2408ExhAlbKgs = O2408ExhAlbKgs.add(A2415ExhKgsEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_327 = (short)(1) ;
            A2408ExhAlbKgs = O2408ExhAlbKgs.add(A2415ExhKgsEnt).subtract(O2415ExhKgsEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_327 = (short)(1) ;
               A2408ExhAlbKgs = O2408ExhAlbKgs.subtract(O2415ExhKgsEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_327 = (short)(1) ;
         A2405ExhAlbBul = (short)(O2405ExhAlbBul+A2413ExhBulEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_327 = (short)(1) ;
            A2405ExhAlbBul = (short)(O2405ExhAlbBul+A2413ExhBulEnt-O2413ExhBulEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_327 = (short)(1) ;
               A2405ExhAlbBul = (short)(O2405ExhAlbBul-O2413ExhBulEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors84327( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable84327( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T008435 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void gxload_11( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T008436 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T008436_A212BarSer[0] ;
      A1878BarNumTen = T008436_A1878BarNumTen[0] ;
      A1500BarNMtr = T008436_A1500BarNMtr[0] ;
      A135BarColNom = T008436_A135BarColNom[0] ;
      A136BarColNum = T008436_A136BarColNum[0] ;
      A252CliCod = T008436_A252CliCod[0] ;
      n252CliCod = T008436_n252CliCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1878BarNumTen))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1500BarNMtr))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void gxload_12( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T008437 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            GXCCtl = "CLICOD_" + sGXsfl_85_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T008437_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void getKey84327( )
   {
      /* Using cursor T008438 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound327 = (short)(1) ;
      }
      else
      {
         RcdFound327 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey84327( )
   {
      /* Using cursor T00843 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm84327( 9) ;
         RcdFound327 = (short)(1) ;
         initializeNonKey84327( ) ;
         A2415ExhKgsEnt = T00843_A2415ExhKgsEnt[0] ;
         n2415ExhKgsEnt = T00843_n2415ExhKgsEnt[0] ;
         A2413ExhBulEnt = T00843_A2413ExhBulEnt[0] ;
         n2413ExhBulEnt = T00843_n2413ExhBulEnt[0] ;
         A2414ExhEst = T00843_A2414ExhEst[0] ;
         n2414ExhEst = T00843_n2414ExhEst[0] ;
         A10512BarKgsCl = T00843_A10512BarKgsCl[0] ;
         n10512BarKgsCl = T00843_n10512BarKgsCl[0] ;
         A2410ExhAlbObs = T00843_A2410ExhAlbObs[0] ;
         n2410ExhAlbObs = T00843_n2410ExhAlbObs[0] ;
         A457FasCod = T00843_A457FasCod[0] ;
         n457FasCod = T00843_n457FasCod[0] ;
         A129BarCod = T00843_A129BarCod[0] ;
         A132BarCodReo = T00843_A132BarCodReo[0] ;
         A130BarCodPar = T00843_A130BarCodPar[0] ;
         O2413ExhBulEnt = A2413ExhBulEnt ;
         n2413ExhBulEnt = false ;
         O2415ExhKgsEnt = A2415ExhKgsEnt ;
         n2415ExhKgsEnt = false ;
         Z396EmprCod = A396EmprCod ;
         Z2406ExhAlbCod = A2406ExhAlbCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode327 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal84327( ) ;
         load84327( ) ;
         Gx_mode = sMode327 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound327 = (short)(0) ;
         initializeNonKey84327( ) ;
         sMode327 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal84327( ) ;
         Gx_mode = sMode327 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes84327( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency84327( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00842 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLEXPER"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2415ExhKgsEnt, T00842_A2415ExhKgsEnt[0]) != 0 ) || ( Z2413ExhBulEnt != T00842_A2413ExhBulEnt[0] ) || ( Z2414ExhEst != T00842_A2414ExhEst[0] ) || ( DecimalUtil.compareTo(Z10512BarKgsCl, T00842_A10512BarKgsCl[0]) != 0 ) || ( GXutil.strcmp(Z2410ExhAlbObs, T00842_A2410ExhAlbObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z457FasCod, T00842_A457FasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2415ExhKgsEnt, T00842_A2415ExhKgsEnt[0]) != 0 )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ExhKgsEnt");
               GXutil.writeLogRaw("Old: ",Z2415ExhKgsEnt);
               GXutil.writeLogRaw("Current: ",T00842_A2415ExhKgsEnt[0]);
            }
            if ( Z2413ExhBulEnt != T00842_A2413ExhBulEnt[0] )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ExhBulEnt");
               GXutil.writeLogRaw("Old: ",Z2413ExhBulEnt);
               GXutil.writeLogRaw("Current: ",T00842_A2413ExhBulEnt[0]);
            }
            if ( Z2414ExhEst != T00842_A2414ExhEst[0] )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ExhEst");
               GXutil.writeLogRaw("Old: ",Z2414ExhEst);
               GXutil.writeLogRaw("Current: ",T00842_A2414ExhEst[0]);
            }
            if ( DecimalUtil.compareTo(Z10512BarKgsCl, T00842_A10512BarKgsCl[0]) != 0 )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"BarKgsCl");
               GXutil.writeLogRaw("Old: ",Z10512BarKgsCl);
               GXutil.writeLogRaw("Current: ",T00842_A10512BarKgsCl[0]);
            }
            if ( GXutil.strcmp(Z2410ExhAlbObs, T00842_A2410ExhAlbObs[0]) != 0 )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"ExhAlbObs");
               GXutil.writeLogRaw("Old: ",Z2410ExhAlbObs);
               GXutil.writeLogRaw("Current: ",T00842_A2410ExhAlbObs[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T00842_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("textper:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00842_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLEXPER"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert84327( )
   {
      beforeValidate84327( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable84327( ) ;
      }
      if ( AnyError == 0 )
      {
         zm84327( 0) ;
         checkOptimisticConcurrency84327( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm84327( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert84327( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008439 */
                  pr_default.execute(33, new Object[] {Integer.valueOf(A2406ExhAlbCod), Boolean.valueOf(n2415ExhKgsEnt), A2415ExhKgsEnt, Boolean.valueOf(n2413ExhBulEnt), Short.valueOf(A2413ExhBulEnt), Boolean.valueOf(n2414ExhEst), Byte.valueOf(A2414ExhEst), Boolean.valueOf(n10512BarKgsCl), A10512BarKgsCl, Boolean.valueOf(n2410ExhAlbObs), A2410ExhAlbObs, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXPER");
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
            load84327( ) ;
         }
         endLevel84327( ) ;
      }
      closeExtendedTableCursors84327( ) ;
   }

   public void update84327( )
   {
      beforeValidate84327( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable84327( ) ;
      }
      if ( ( nIsMod_327 != 0 ) || ( nIsDirty_327 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency84327( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm84327( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate84327( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T008440 */
                     pr_default.execute(34, new Object[] {Boolean.valueOf(n2415ExhKgsEnt), A2415ExhKgsEnt, Boolean.valueOf(n2413ExhBulEnt), Short.valueOf(A2413ExhBulEnt), Boolean.valueOf(n2414ExhEst), Byte.valueOf(A2414ExhEst), Boolean.valueOf(n10512BarKgsCl), A10512BarKgsCl, Boolean.valueOf(n2410ExhAlbObs), A2410ExhAlbObs, Boolean.valueOf(n457FasCod), A457FasCod, A396EmprCod, Integer.valueOf(A2406ExhAlbCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXPER");
                     if ( (pr_default.getStatus(34) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLEXPER"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate84327( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey84327( ) ;
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
            endLevel84327( ) ;
         }
      }
      closeExtendedTableCursors84327( ) ;
   }

   public void deferredUpdate84327( )
   {
   }

   public void delete84327( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate84327( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency84327( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls84327( ) ;
         afterConfirm84327( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete84327( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T008441 */
               pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXPER");
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
      sMode327 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel84327( ) ;
      Gx_mode = sMode327 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls84327( )
   {
      standaloneModal84327( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T008442 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A212BarSer = T008442_A212BarSer[0] ;
         A1878BarNumTen = T008442_A1878BarNumTen[0] ;
         A1500BarNMtr = T008442_A1500BarNMtr[0] ;
         A135BarColNom = T008442_A135BarColNom[0] ;
         A136BarColNum = T008442_A136BarColNum[0] ;
         A252CliCod = T008442_A252CliCod[0] ;
         n252CliCod = T008442_n252CliCod[0] ;
         pr_default.close(36);
         /* Using cursor T008443 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T008443_A279CliNom[0] ;
         pr_default.close(37);
         if ( isIns( )  )
         {
            A2408ExhAlbKgs = O2408ExhAlbKgs.add(A2415ExhKgsEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2408ExhAlbKgs = O2408ExhAlbKgs.add(A2415ExhKgsEnt).subtract(O2415ExhKgsEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2408ExhAlbKgs = O2408ExhAlbKgs.subtract(O2415ExhKgsEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A2405ExhAlbBul = (short)(O2405ExhAlbBul+A2413ExhBulEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A2405ExhAlbBul = (short)(O2405ExhAlbBul+A2413ExhBulEnt-O2413ExhBulEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A2405ExhAlbBul = (short)(O2405ExhAlbBul-O2413ExhBulEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
               }
            }
         }
      }
   }

   public void endLevel84327( )
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

   public void scanStart84327( )
   {
      /* Scan By routine */
      /* Using cursor T008444 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      RcdFound327 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound327 = (short)(1) ;
         A129BarCod = T008444_A129BarCod[0] ;
         A132BarCodReo = T008444_A132BarCodReo[0] ;
         A130BarCodPar = T008444_A130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext84327( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound327 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound327 = (short)(1) ;
         A129BarCod = T008444_A129BarCod[0] ;
         A132BarCodReo = T008444_A132BarCodReo[0] ;
         A130BarCodPar = T008444_A130BarCodPar[0] ;
      }
   }

   public void scanEnd84327( )
   {
      pr_default.close(38);
   }

   public void afterConfirm84327( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert84327( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate84327( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete84327( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete84327( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate84327( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes84327( )
   {
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtExhKgsEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhKgsEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhKgsEnt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtExhBulEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhBulEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhBulEnt_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtExhEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhEst_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarNumTen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumTen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumTen_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarNMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNMtr_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarKgsCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgsCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsCl_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtExhAlbObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtExhAlbObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtExhAlbObs_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashes84327( )
   {
   }

   public void send_integrity_lvl_hashes84326( )
   {
   }

   public void subsflControlProps_85327( )
   {
      edtavnRcdDeleted_327_Internalname = "vNRCDDELETED_327_"+sGXsfl_85_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_85_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_85_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_85_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_85_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_85_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_85_idx ;
      edtExhKgsEnt_Internalname = "EXHKGSENT_"+sGXsfl_85_idx ;
      edtExhBulEnt_Internalname = "EXHBULENT_"+sGXsfl_85_idx ;
      edtExhEst_Internalname = "EXHEST_"+sGXsfl_85_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_85_idx ;
      edtBarNumTen_Internalname = "BARNUMTEN_"+sGXsfl_85_idx ;
      edtBarNMtr_Internalname = "BARNMTR_"+sGXsfl_85_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_85_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_85_idx ;
      edtBarKgsCl_Internalname = "BARKGSCL_"+sGXsfl_85_idx ;
      edtExhAlbObs_Internalname = "EXHALBOBS_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_85327( )
   {
      edtavnRcdDeleted_327_Internalname = "vNRCDDELETED_327_"+sGXsfl_85_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_85_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_85_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_85_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_85_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_85_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_85_fel_idx ;
      edtExhKgsEnt_Internalname = "EXHKGSENT_"+sGXsfl_85_fel_idx ;
      edtExhBulEnt_Internalname = "EXHBULENT_"+sGXsfl_85_fel_idx ;
      edtExhEst_Internalname = "EXHEST_"+sGXsfl_85_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_85_fel_idx ;
      edtBarNumTen_Internalname = "BARNUMTEN_"+sGXsfl_85_fel_idx ;
      edtBarNMtr_Internalname = "BARNMTR_"+sGXsfl_85_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_85_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_85_fel_idx ;
      edtBarKgsCl_Internalname = "BARKGSCL_"+sGXsfl_85_fel_idx ;
      edtExhAlbObs_Internalname = "EXHALBOBS_"+sGXsfl_85_fel_idx ;
   }

   public void addRow84327( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85327( ) ;
      sendRow84327( ) ;
   }

   public void sendRow84327( )
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
         if ( ((int)((nGXsfl_85_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_327_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_327_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_327), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_327), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_327_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_327_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExhKgsEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExhKgsEnt_Enabled!=0) ? localUtil.format( A2415ExhKgsEnt, "ZZZZZ9.99") : localUtil.format( A2415ExhKgsEnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExhKgsEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExhKgsEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExhBulEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExhBulEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2413ExhBulEnt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2413ExhBulEnt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExhBulEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExhBulEnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExhEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2414ExhEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtExhEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2414ExhEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A2414ExhEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExhEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExhEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumTen_Internalname,GXutil.rtrim( A1878BarNumTen),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumTen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNumTen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNMtr_Internalname,GXutil.rtrim( A1500BarNMtr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgsCl_Internalname,GXutil.ltrim( localUtil.ntoc( A10512BarKgsCl, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKgsCl_Enabled!=0) ? localUtil.format( A10512BarKgsCl, "ZZZZZ9.99") : localUtil.format( A10512BarKgsCl, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgsCl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarKgsCl_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_327_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtExhAlbObs_Internalname,GXutil.rtrim( A2410ExhAlbObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtExhAlbObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtExhAlbObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes84327( ) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "Z2415ExhKgsEnt_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2413ExhBulEnt_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2414ExhEst_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2414ExhEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10512BarKgsCl_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10512BarKgsCl, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2410ExhAlbObs_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2410ExhAlbObs));
      GXCCtl = "Z457FasCod_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "O2413ExhBulEnt_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2413ExhBulEnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2415ExhKgsEnt_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2415ExhKgsEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_327_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_327_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_327_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_327_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_327_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHKGSENT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhKgsEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHBULENT_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhBulEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHEST_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMTEN_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTen_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNMTR_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGSCL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgsCl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EXHALBOBS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtExhAlbObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow84327( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85327( ) ;
      edtavnRcdDeleted_327_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_327_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExhKgsEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHKGSENT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExhBulEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHBULENT_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExhEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHEST_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumTen_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMTEN_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNMTR_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKgsCl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGSCL_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtExhAlbObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EXHALBOBS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_327_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_327_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_327");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_327_Internalname ;
         wbErr = true ;
         nRcdDeleted_327 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_327 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_327_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_85_idx ;
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
         GXCCtl = "BARCODREO_" + sGXsfl_85_idx ;
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
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      n457FasCod = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtExhKgsEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtExhKgsEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "EXHKGSENT_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExhKgsEnt_Internalname ;
         wbErr = true ;
         A2415ExhKgsEnt = DecimalUtil.ZERO ;
         n2415ExhKgsEnt = false ;
      }
      else
      {
         A2415ExhKgsEnt = localUtil.ctond( httpContext.cgiGet( edtExhKgsEnt_Internalname)) ;
         n2415ExhKgsEnt = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExhBulEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExhBulEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "EXHBULENT_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExhBulEnt_Internalname ;
         wbErr = true ;
         A2413ExhBulEnt = (short)(0) ;
         n2413ExhBulEnt = false ;
      }
      else
      {
         A2413ExhBulEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtExhBulEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2413ExhBulEnt = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtExhEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtExhEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "EXHEST_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtExhEst_Internalname ;
         wbErr = true ;
         A2414ExhEst = (byte)(0) ;
         n2414ExhEst = false ;
      }
      else
      {
         A2414ExhEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtExhEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2414ExhEst = false ;
      }
      A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
      A1878BarNumTen = httpContext.cgiGet( edtBarNumTen_Internalname) ;
      A1500BarNMtr = httpContext.cgiGet( edtBarNMtr_Internalname) ;
      A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
      A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgsCl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgsCl_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARKGSCL_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarKgsCl_Internalname ;
         wbErr = true ;
         A10512BarKgsCl = DecimalUtil.ZERO ;
         n10512BarKgsCl = false ;
      }
      else
      {
         A10512BarKgsCl = localUtil.ctond( httpContext.cgiGet( edtBarKgsCl_Internalname)) ;
         n10512BarKgsCl = false ;
      }
      A2410ExhAlbObs = httpContext.cgiGet( edtExhAlbObs_Internalname) ;
      n2410ExhAlbObs = false ;
      GXCCtl = "Z129BarCod_" + sGXsfl_85_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_85_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_85_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2415ExhKgsEnt_" + sGXsfl_85_idx ;
      Z2415ExhKgsEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2413ExhBulEnt_" + sGXsfl_85_idx ;
      Z2413ExhBulEnt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2414ExhEst_" + sGXsfl_85_idx ;
      Z2414ExhEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10512BarKgsCl_" + sGXsfl_85_idx ;
      Z10512BarKgsCl = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2410ExhAlbObs_" + sGXsfl_85_idx ;
      Z2410ExhAlbObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_85_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O2413ExhBulEnt_" + sGXsfl_85_idx ;
      O2413ExhBulEnt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O2415ExhKgsEnt_" + sGXsfl_85_idx ;
      O2415ExhKgsEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_327_" + sGXsfl_85_idx ;
      nRcdDeleted_327 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_327_" + sGXsfl_85_idx ;
      nRcdExists_327 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_327_" + sGXsfl_85_idx ;
      nIsMod_327 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarCodPar_Enabled = edtBarCodPar_Enabled ;
      defedtBarCodReo_Enabled = edtBarCodReo_Enabled ;
      defedtBarCod_Enabled = edtBarCod_Enabled ;
   }

   public void confirmValues840( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85327( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_85327( ) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z2415ExhKgsEnt_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z2415ExhKgsEnt_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2415ExhKgsEnt_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z2413ExhBulEnt_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z2413ExhBulEnt_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2413ExhBulEnt_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z2414ExhEst_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z2414ExhEst_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2414ExhEst_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z10512BarKgsCl_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z10512BarKgsCl_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10512BarKgsCl_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z2410ExhAlbObs_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z2410ExhAlbObs_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2410ExhAlbObs_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_85_idx) ;
      }
      httpContext.changePostValue( "O2413ExhBulEnt", httpContext.cgiGet( "T2413ExhBulEnt")) ;
      httpContext.deletePostValue( "T2413ExhBulEnt") ;
      httpContext.changePostValue( "O2415ExhKgsEnt", httpContext.cgiGet( "T2415ExhKgsEnt")) ;
      httpContext.deletePostValue( "T2415ExhKgsEnt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.textper", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2406ExhAlbCod", GXutil.ltrim( localUtil.ntoc( Z2406ExhAlbCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2411ExhAlbPri", GXutil.rtrim( Z2411ExhAlbPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2407ExhAlbFec", localUtil.dtoc( Z2407ExhAlbFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2409ExhAlbLis", GXutil.ltrim( localUtil.ntoc( Z2409ExhAlbLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2412ExhAlbSec", GXutil.rtrim( Z2412ExhAlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2405ExhAlbBul", GXutil.ltrim( localUtil.ntoc( O2405ExhAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2408ExhAlbKgs", GXutil.ltrim( localUtil.ntoc( O2408ExhAlbKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.textper", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TEXTPER" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ALBARANES EXTERNOS PERVAFIL", "") ;
   }

   public void initializeNonKey84326( )
   {
      A2411ExhAlbPri = "" ;
      n2411ExhAlbPri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2411ExhAlbPri", A2411ExhAlbPri);
      A2248ManCod = (short)(0) ;
      n2248ManCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A2249ManNom = "" ;
      n2249ManNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A2407ExhAlbFec = GXutil.nullDate() ;
      n2407ExhAlbFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2407ExhAlbFec", localUtil.format(A2407ExhAlbFec, "99/99/99"));
      A2409ExhAlbLis = (byte)(0) ;
      n2409ExhAlbLis = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2409ExhAlbLis", GXutil.str( A2409ExhAlbLis, 1, 0));
      A2412ExhAlbSec = "" ;
      n2412ExhAlbSec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2412ExhAlbSec", A2412ExhAlbSec);
      A2408ExhAlbKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      A2405ExhAlbBul = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      O2405ExhAlbBul = A2405ExhAlbBul ;
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      O2408ExhAlbKgs = A2408ExhAlbKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
      Z2411ExhAlbPri = "" ;
      Z2407ExhAlbFec = GXutil.nullDate() ;
      Z2409ExhAlbLis = (byte)(0) ;
      Z2412ExhAlbSec = "" ;
      Z840TrnCod = (short)(0) ;
      Z2248ManCod = (short)(0) ;
   }

   public void initAll84326( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2406ExhAlbCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2406ExhAlbCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2406ExhAlbCod), 8, 0));
      initializeNonKey84326( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey84327( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      A279CliNom = "" ;
      A457FasCod = "" ;
      n457FasCod = false ;
      A2415ExhKgsEnt = DecimalUtil.ZERO ;
      n2415ExhKgsEnt = false ;
      A2413ExhBulEnt = (short)(0) ;
      n2413ExhBulEnt = false ;
      A2414ExhEst = (byte)(0) ;
      n2414ExhEst = false ;
      A212BarSer = "" ;
      A1878BarNumTen = "" ;
      A1500BarNMtr = "" ;
      A135BarColNom = "" ;
      A136BarColNum = 0 ;
      A10512BarKgsCl = DecimalUtil.ZERO ;
      n10512BarKgsCl = false ;
      A2410ExhAlbObs = "" ;
      n2410ExhAlbObs = false ;
      O2413ExhBulEnt = A2413ExhBulEnt ;
      n2413ExhBulEnt = false ;
      O2415ExhKgsEnt = A2415ExhKgsEnt ;
      n2415ExhKgsEnt = false ;
      Z2415ExhKgsEnt = DecimalUtil.ZERO ;
      Z2413ExhBulEnt = (short)(0) ;
      Z2414ExhEst = (byte)(0) ;
      Z10512BarKgsCl = DecimalUtil.ZERO ;
      Z2410ExhAlbObs = "" ;
      Z457FasCod = "" ;
   }

   public void initAll84327( )
   {
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      initializeNonKey84327( ) ;
   }

   public void standaloneModalInsert84327( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511212", true, true);
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
      httpContext.AddJavascriptSource("textper.js", "?20268241511212", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties327( )
   {
      edtBarCodPar_Enabled = defedtBarCodPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarCodReo_Enabled = defedtBarCodReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtBarCod_Enabled = defedtBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void startgridcontrol85( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_327, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_327_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2415ExhKgsEnt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExhKgsEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2413ExhBulEnt, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExhBulEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2414ExhEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExhEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1878BarNumTen));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTen_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1500BarNMtr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10512BarKgsCl, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgsCl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2410ExhAlbObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtExhAlbObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtExhAlbCod_Internalname = "EXHALBCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtExhAlbPri_Internalname = "EXHALBPRI" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtManCod_Internalname = "MANCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtManNom_Internalname = "MANNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtExhAlbFec_Internalname = "EXHALBFEC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtExhAlbLis_Internalname = "EXHALBLIS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtExhAlbSec_Internalname = "EXHALBSEC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtExhAlbKgs_Internalname = "EXHALBKGS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtExhAlbBul_Internalname = "EXHALBBUL" ;
      edtavnRcdDeleted_327_Internalname = "vNRCDDELETED_327" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtExhKgsEnt_Internalname = "EXHKGSENT" ;
      edtExhBulEnt_Internalname = "EXHBULENT" ;
      edtExhEst_Internalname = "EXHEST" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarNumTen_Internalname = "BARNUMTEN" ;
      edtBarNMtr_Internalname = "BARNMTR" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarKgsCl_Internalname = "BARKGSCL" ;
      edtExhAlbObs_Internalname = "EXHALBOBS" ;
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
      Form.setCaption( httpContext.getMessage( "ALBARANES EXTERNOS PERVAFIL", "") );
      edtExhAlbObs_Jsonclick = "" ;
      edtBarKgsCl_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarNMtr_Jsonclick = "" ;
      edtBarNumTen_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtExhEst_Jsonclick = "" ;
      edtExhBulEnt_Jsonclick = "" ;
      edtExhKgsEnt_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtavnRcdDeleted_327_Jsonclick = "" ;
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
      edtExhAlbObs_Enabled = 1 ;
      edtBarKgsCl_Enabled = 1 ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Enabled = 0 ;
      edtBarNMtr_Enabled = 0 ;
      edtBarNumTen_Enabled = 0 ;
      edtBarSer_Enabled = 0 ;
      edtExhEst_Enabled = 1 ;
      edtExhBulEnt_Enabled = 1 ;
      edtExhKgsEnt_Enabled = 1 ;
      edtFasCod_Enabled = 1 ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtavnRcdDeleted_327_Enabled = 1 ;
      edtExhAlbBul_Jsonclick = "" ;
      edtExhAlbBul_Backcolor = (int)(0xFFFFFF) ;
      edtExhAlbBul_Enabled = 0 ;
      edtExhAlbKgs_Jsonclick = "" ;
      edtExhAlbKgs_Backcolor = (int)(0xFFFFFF) ;
      edtExhAlbKgs_Enabled = 0 ;
      edtExhAlbSec_Jsonclick = "" ;
      edtExhAlbSec_Backcolor = (int)(0xFFFFFF) ;
      edtExhAlbSec_Enabled = 1 ;
      edtExhAlbLis_Jsonclick = "" ;
      edtExhAlbLis_Backcolor = (int)(0xFFFFFF) ;
      edtExhAlbLis_Enabled = 1 ;
      edtExhAlbFec_Jsonclick = "" ;
      edtExhAlbFec_Backcolor = (int)(0xFFFFFF) ;
      edtExhAlbFec_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Backcolor = (int)(0xFFFFFF) ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
      edtManNom_Jsonclick = "" ;
      edtManNom_Backcolor = (int)(0xFFFFFF) ;
      edtManNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Backcolor = (int)(0xFFFFFF) ;
      edtManCod_Enabled = 1 ;
      edtExhAlbPri_Jsonclick = "" ;
      edtExhAlbPri_Backcolor = (int)(0xFFFFFF) ;
      edtExhAlbPri_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtExhAlbCod_Jsonclick = "" ;
      edtExhAlbCod_Backcolor = (int)(0xFFFFFF) ;
      edtExhAlbCod_Enabled = 1 ;
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
      subsflControlProps_85327( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal84327( ) ;
         standaloneModal84327( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow84327( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_85327( ) ;
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
      /* Using cursor T008427 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T008427_A407EmprNom[0] ;
      n407EmprNom = T008427_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T008429 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A2408ExhAlbKgs = T008429_A2408ExhAlbKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         A2405ExhAlbBul = T008429_A2405ExhAlbBul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      }
      else
      {
         A2408ExhAlbKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrimstr( A2408ExhAlbKgs, 9, 2));
         A2405ExhAlbBul = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2405ExhAlbBul), 4, 0));
      }
      pr_default.close(23);
      GX_FocusControl = edtExhAlbPri_Internalname ;
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
      /* Using cursor T008427 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T008427_A407EmprNom[0] ;
      n407EmprNom = T008427_n407EmprNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Exhalbcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T008429 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A2406ExhAlbCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A2408ExhAlbKgs = T008429_A2408ExhAlbKgs[0] ;
         A2405ExhAlbBul = T008429_A2405ExhAlbBul[0] ;
      }
      else
      {
         A2408ExhAlbKgs = DecimalUtil.doubleToDec(0) ;
         A2405ExhAlbBul = (short)(0) ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2411ExhAlbPri", GXutil.rtrim( A2411ExhAlbPri));
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2407ExhAlbFec", localUtil.format(A2407ExhAlbFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A2409ExhAlbLis", GXutil.ltrim( localUtil.ntoc( A2409ExhAlbLis, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2412ExhAlbSec", GXutil.rtrim( A2412ExhAlbSec));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2408ExhAlbKgs", GXutil.ltrim( localUtil.ntoc( A2408ExhAlbKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2405ExhAlbBul", GXutil.ltrim( localUtil.ntoc( A2405ExhAlbBul, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2406ExhAlbCod", GXutil.ltrim( localUtil.ntoc( Z2406ExhAlbCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2411ExhAlbPri", GXutil.rtrim( Z2411ExhAlbPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2407ExhAlbFec", localUtil.format(Z2407ExhAlbFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2409ExhAlbLis", GXutil.ltrim( localUtil.ntoc( Z2409ExhAlbLis, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2412ExhAlbSec", GXutil.rtrim( Z2412ExhAlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2249ManNom", GXutil.rtrim( Z2249ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2408ExhAlbKgs", GXutil.ltrim( localUtil.ntoc( Z2408ExhAlbKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2405ExhAlbBul", GXutil.ltrim( localUtil.ntoc( Z2405ExhAlbBul, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2405ExhAlbBul", GXutil.ltrim( localUtil.ntoc( O2405ExhAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2408ExhAlbKgs", GXutil.ltrim( localUtil.ntoc( O2408ExhAlbKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mancod( )
   {
      n2248ManCod = false ;
      n2249ManNom = false ;
      /* Using cursor T008430 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A2249ManNom = T008430_A2249ManNom[0] ;
      n2249ManNom = T008430_n2249ManNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T008431 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A841TrnNom = T008431_A841TrnNom[0] ;
      n841TrnNom = T008431_n841TrnNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      /* Using cursor T008442 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A212BarSer = T008442_A212BarSer[0] ;
      A1878BarNumTen = T008442_A1878BarNumTen[0] ;
      A1500BarNMtr = T008442_A1500BarNMtr[0] ;
      A135BarColNom = T008442_A135BarColNom[0] ;
      A136BarColNum = T008442_A136BarColNum[0] ;
      A252CliCod = T008442_A252CliCod[0] ;
      n252CliCod = T008442_n252CliCod[0] ;
      pr_default.close(36);
      /* Using cursor T008443 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A279CliNom = T008443_A279CliNom[0] ;
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1878BarNumTen", GXutil.rtrim( A1878BarNumTen));
      httpContext.ajax_rsp_assign_attri("", false, "A1500BarNMtr", GXutil.rtrim( A1500BarNMtr));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Fascod( )
   {
      n457FasCod = false ;
      /* Using cursor T008445 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      pr_default.close(39);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_EXHALBCOD","{handler:'valid_Exhalbcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2406ExhAlbCod',fld:'EXHALBCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_EXHALBCOD",",oparms:[{av:'A2411ExhAlbPri',fld:'EXHALBPRI',pic:''},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A2407ExhAlbFec',fld:'EXHALBFEC',pic:''},{av:'A2409ExhAlbLis',fld:'EXHALBLIS',pic:'9'},{av:'A2412ExhAlbSec',fld:'EXHALBSEC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A2249ManNom',fld:'MANNOM',pic:''},{av:'A2408ExhAlbKgs',fld:'EXHALBKGS',pic:'ZZZZZ9.99'},{av:'A2405ExhAlbBul',fld:'EXHALBBUL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2406ExhAlbCod'},{av:'Z2411ExhAlbPri'},{av:'Z2248ManCod'},{av:'Z840TrnCod'},{av:'Z2407ExhAlbFec'},{av:'Z2409ExhAlbLis'},{av:'Z2412ExhAlbSec'},{av:'Z407EmprNom'},{av:'Z841TrnNom'},{av:'Z2249ManNom'},{av:'Z2408ExhAlbKgs'},{av:'Z2405ExhAlbBul'},{av:'O2405ExhAlbBul'},{av:'O2408ExhAlbKgs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_EXHALBPRI","{handler:'valid_Exhalbpri',iparms:[]");
      setEventMetadata("VALID_EXHALBPRI",",oparms:[]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''}]");
      setEventMetadata("VALID_MANCOD",",oparms:[{av:'A2249ManNom',fld:'MANNOM',pic:''}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1878BarNumTen',fld:'BARNUMTEN',pic:''},{av:'A1500BarNMtr',fld:'BARNMTR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1878BarNumTen',fld:'BARNUMTEN',pic:''},{av:'A1500BarNMtr',fld:'BARNMTR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_EXHKGSENT","{handler:'valid_Exhkgsent',iparms:[]");
      setEventMetadata("VALID_EXHKGSENT",",oparms:[]}");
      setEventMetadata("VALID_EXHBULENT","{handler:'valid_Exhbulent',iparms:[]");
      setEventMetadata("VALID_EXHBULENT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Exhalbobs',iparms:[]");
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
      pr_default.close(39);
      pr_default.close(36);
      pr_default.close(37);
      pr_default.close(22);
      pr_default.close(25);
      pr_default.close(24);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2411ExhAlbPri = "" ;
      Z2407ExhAlbFec = GXutil.nullDate() ;
      Z2412ExhAlbSec = "" ;
      O2408ExhAlbKgs = DecimalUtil.ZERO ;
      Z130BarCodPar = "" ;
      Z2415ExhKgsEnt = DecimalUtil.ZERO ;
      Z10512BarKgsCl = DecimalUtil.ZERO ;
      Z2410ExhAlbObs = "" ;
      Z457FasCod = "" ;
      O2415ExhKgsEnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A2411ExhAlbPri = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A2249ManNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A841TrnNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A2407ExhAlbFec = GXutil.nullDate() ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A2412ExhAlbSec = "" ;
      lblTextblock12_Jsonclick = "" ;
      A2408ExhAlbKgs = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B2408ExhAlbKgs = DecimalUtil.ZERO ;
      sMode327 = "" ;
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
      sMode326 = "" ;
      s2408ExhAlbKgs = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A279CliNom = "" ;
      A2415ExhKgsEnt = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A1878BarNumTen = "" ;
      A1500BarNMtr = "" ;
      A135BarColNom = "" ;
      A10512BarKgsCl = DecimalUtil.ZERO ;
      A2410ExhAlbObs = "" ;
      T2415ExhKgsEnt = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z2408ExhAlbKgs = DecimalUtil.ZERO ;
      Z2249ManNom = "" ;
      Z841TrnNom = "" ;
      T008415_A2406ExhAlbCod = new int[1] ;
      T008415_A2411ExhAlbPri = new String[] {""} ;
      T008415_n2411ExhAlbPri = new boolean[] {false} ;
      T008415_A407EmprNom = new String[] {""} ;
      T008415_n407EmprNom = new boolean[] {false} ;
      T008415_A2249ManNom = new String[] {""} ;
      T008415_n2249ManNom = new boolean[] {false} ;
      T008415_A841TrnNom = new String[] {""} ;
      T008415_n841TrnNom = new boolean[] {false} ;
      T008415_A2407ExhAlbFec = new java.util.Date[] {GXutil.nullDate()} ;
      T008415_n2407ExhAlbFec = new boolean[] {false} ;
      T008415_A2409ExhAlbLis = new byte[1] ;
      T008415_n2409ExhAlbLis = new boolean[] {false} ;
      T008415_A2412ExhAlbSec = new String[] {""} ;
      T008415_n2412ExhAlbSec = new boolean[] {false} ;
      T008415_A396EmprCod = new String[] {""} ;
      T008415_A840TrnCod = new short[1] ;
      T008415_n840TrnCod = new boolean[] {false} ;
      T008415_A2248ManCod = new short[1] ;
      T008415_n2248ManCod = new boolean[] {false} ;
      T008415_A2408ExhAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008415_A2405ExhAlbBul = new short[1] ;
      T00849_A407EmprNom = new String[] {""} ;
      T00849_n407EmprNom = new boolean[] {false} ;
      T008410_A841TrnNom = new String[] {""} ;
      T008410_n841TrnNom = new boolean[] {false} ;
      T008411_A2249ManNom = new String[] {""} ;
      T008411_n2249ManNom = new boolean[] {false} ;
      T008413_A2408ExhAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008413_A2405ExhAlbBul = new short[1] ;
      T008416_A407EmprNom = new String[] {""} ;
      T008416_n407EmprNom = new boolean[] {false} ;
      T008417_A841TrnNom = new String[] {""} ;
      T008417_n841TrnNom = new boolean[] {false} ;
      T008418_A2249ManNom = new String[] {""} ;
      T008418_n2249ManNom = new boolean[] {false} ;
      T008420_A2408ExhAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008420_A2405ExhAlbBul = new short[1] ;
      T008421_A396EmprCod = new String[] {""} ;
      T008421_A2406ExhAlbCod = new int[1] ;
      T00848_A2406ExhAlbCod = new int[1] ;
      T00848_A2411ExhAlbPri = new String[] {""} ;
      T00848_n2411ExhAlbPri = new boolean[] {false} ;
      T00848_A2407ExhAlbFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00848_n2407ExhAlbFec = new boolean[] {false} ;
      T00848_A2409ExhAlbLis = new byte[1] ;
      T00848_n2409ExhAlbLis = new boolean[] {false} ;
      T00848_A2412ExhAlbSec = new String[] {""} ;
      T00848_n2412ExhAlbSec = new boolean[] {false} ;
      T00848_A396EmprCod = new String[] {""} ;
      T00848_A840TrnCod = new short[1] ;
      T00848_n840TrnCod = new boolean[] {false} ;
      T00848_A2248ManCod = new short[1] ;
      T00848_n2248ManCod = new boolean[] {false} ;
      T008422_A396EmprCod = new String[] {""} ;
      T008422_A2406ExhAlbCod = new int[1] ;
      T008423_A396EmprCod = new String[] {""} ;
      T008423_A2406ExhAlbCod = new int[1] ;
      T00847_A2406ExhAlbCod = new int[1] ;
      T00847_A2411ExhAlbPri = new String[] {""} ;
      T00847_n2411ExhAlbPri = new boolean[] {false} ;
      T00847_A2407ExhAlbFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00847_n2407ExhAlbFec = new boolean[] {false} ;
      T00847_A2409ExhAlbLis = new byte[1] ;
      T00847_n2409ExhAlbLis = new boolean[] {false} ;
      T00847_A2412ExhAlbSec = new String[] {""} ;
      T00847_n2412ExhAlbSec = new boolean[] {false} ;
      T00847_A396EmprCod = new String[] {""} ;
      T00847_A840TrnCod = new short[1] ;
      T00847_n840TrnCod = new boolean[] {false} ;
      T00847_A2248ManCod = new short[1] ;
      T00847_n2248ManCod = new boolean[] {false} ;
      T008427_A407EmprNom = new String[] {""} ;
      T008427_n407EmprNom = new boolean[] {false} ;
      T008429_A2408ExhAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008429_A2405ExhAlbBul = new short[1] ;
      T008430_A2249ManNom = new String[] {""} ;
      T008430_n2249ManNom = new boolean[] {false} ;
      T008431_A841TrnNom = new String[] {""} ;
      T008431_n841TrnNom = new boolean[] {false} ;
      T008432_A396EmprCod = new String[] {""} ;
      T008432_A2406ExhAlbCod = new int[1] ;
      T008432_A2416ExhObsLin = new short[1] ;
      T008433_A396EmprCod = new String[] {""} ;
      T008433_A2406ExhAlbCod = new int[1] ;
      Z212BarSer = "" ;
      Z1878BarNumTen = "" ;
      Z1500BarNMtr = "" ;
      Z135BarColNom = "" ;
      Z279CliNom = "" ;
      T008434_A2406ExhAlbCod = new int[1] ;
      T008434_A279CliNom = new String[] {""} ;
      T008434_A2415ExhKgsEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008434_n2415ExhKgsEnt = new boolean[] {false} ;
      T008434_A2413ExhBulEnt = new short[1] ;
      T008434_n2413ExhBulEnt = new boolean[] {false} ;
      T008434_A2414ExhEst = new byte[1] ;
      T008434_n2414ExhEst = new boolean[] {false} ;
      T008434_A212BarSer = new String[] {""} ;
      T008434_A1878BarNumTen = new String[] {""} ;
      T008434_A1500BarNMtr = new String[] {""} ;
      T008434_A135BarColNom = new String[] {""} ;
      T008434_A136BarColNum = new int[1] ;
      T008434_A10512BarKgsCl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008434_n10512BarKgsCl = new boolean[] {false} ;
      T008434_A2410ExhAlbObs = new String[] {""} ;
      T008434_n2410ExhAlbObs = new boolean[] {false} ;
      T008434_A396EmprCod = new String[] {""} ;
      T008434_A457FasCod = new String[] {""} ;
      T008434_n457FasCod = new boolean[] {false} ;
      T008434_A129BarCod = new int[1] ;
      T008434_A132BarCodReo = new byte[1] ;
      T008434_A130BarCodPar = new String[] {""} ;
      T008434_A252CliCod = new int[1] ;
      T008434_n252CliCod = new boolean[] {false} ;
      T00844_A396EmprCod = new String[] {""} ;
      T00845_A212BarSer = new String[] {""} ;
      T00845_A1878BarNumTen = new String[] {""} ;
      T00845_A1500BarNMtr = new String[] {""} ;
      T00845_A135BarColNom = new String[] {""} ;
      T00845_A136BarColNum = new int[1] ;
      T00845_A252CliCod = new int[1] ;
      T00845_n252CliCod = new boolean[] {false} ;
      T00846_A279CliNom = new String[] {""} ;
      T008435_A396EmprCod = new String[] {""} ;
      T008436_A212BarSer = new String[] {""} ;
      T008436_A1878BarNumTen = new String[] {""} ;
      T008436_A1500BarNMtr = new String[] {""} ;
      T008436_A135BarColNom = new String[] {""} ;
      T008436_A136BarColNum = new int[1] ;
      T008436_A252CliCod = new int[1] ;
      T008436_n252CliCod = new boolean[] {false} ;
      T008437_A279CliNom = new String[] {""} ;
      T008438_A396EmprCod = new String[] {""} ;
      T008438_A2406ExhAlbCod = new int[1] ;
      T008438_A129BarCod = new int[1] ;
      T008438_A132BarCodReo = new byte[1] ;
      T008438_A130BarCodPar = new String[] {""} ;
      T00843_A2406ExhAlbCod = new int[1] ;
      T00843_A2415ExhKgsEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00843_n2415ExhKgsEnt = new boolean[] {false} ;
      T00843_A2413ExhBulEnt = new short[1] ;
      T00843_n2413ExhBulEnt = new boolean[] {false} ;
      T00843_A2414ExhEst = new byte[1] ;
      T00843_n2414ExhEst = new boolean[] {false} ;
      T00843_A10512BarKgsCl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00843_n10512BarKgsCl = new boolean[] {false} ;
      T00843_A2410ExhAlbObs = new String[] {""} ;
      T00843_n2410ExhAlbObs = new boolean[] {false} ;
      T00843_A396EmprCod = new String[] {""} ;
      T00843_A457FasCod = new String[] {""} ;
      T00843_n457FasCod = new boolean[] {false} ;
      T00843_A129BarCod = new int[1] ;
      T00843_A132BarCodReo = new byte[1] ;
      T00843_A130BarCodPar = new String[] {""} ;
      T00842_A2406ExhAlbCod = new int[1] ;
      T00842_A2415ExhKgsEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00842_n2415ExhKgsEnt = new boolean[] {false} ;
      T00842_A2413ExhBulEnt = new short[1] ;
      T00842_n2413ExhBulEnt = new boolean[] {false} ;
      T00842_A2414ExhEst = new byte[1] ;
      T00842_n2414ExhEst = new boolean[] {false} ;
      T00842_A10512BarKgsCl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00842_n10512BarKgsCl = new boolean[] {false} ;
      T00842_A2410ExhAlbObs = new String[] {""} ;
      T00842_n2410ExhAlbObs = new boolean[] {false} ;
      T00842_A396EmprCod = new String[] {""} ;
      T00842_A457FasCod = new String[] {""} ;
      T00842_n457FasCod = new boolean[] {false} ;
      T00842_A129BarCod = new int[1] ;
      T00842_A132BarCodReo = new byte[1] ;
      T00842_A130BarCodPar = new String[] {""} ;
      T008442_A212BarSer = new String[] {""} ;
      T008442_A1878BarNumTen = new String[] {""} ;
      T008442_A1500BarNMtr = new String[] {""} ;
      T008442_A135BarColNom = new String[] {""} ;
      T008442_A136BarColNum = new int[1] ;
      T008442_A252CliCod = new int[1] ;
      T008442_n252CliCod = new boolean[] {false} ;
      T008443_A279CliNom = new String[] {""} ;
      T008444_A396EmprCod = new String[] {""} ;
      T008444_A2406ExhAlbCod = new int[1] ;
      T008444_A129BarCod = new int[1] ;
      T008444_A132BarCodReo = new byte[1] ;
      T008444_A130BarCodPar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ2411ExhAlbPri = "" ;
      ZZ2407ExhAlbFec = GXutil.nullDate() ;
      ZZ2412ExhAlbSec = "" ;
      ZZ407EmprNom = "" ;
      ZZ841TrnNom = "" ;
      ZZ2249ManNom = "" ;
      ZZ2408ExhAlbKgs = DecimalUtil.ZERO ;
      ZO2408ExhAlbKgs = DecimalUtil.ZERO ;
      T008445_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.textper__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.textper__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.textper__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.textper__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.textper__default(),
         new Object[] {
             new Object[] {
            T00842_A2406ExhAlbCod, T00842_A2415ExhKgsEnt, T00842_n2415ExhKgsEnt, T00842_A2413ExhBulEnt, T00842_n2413ExhBulEnt, T00842_A2414ExhEst, T00842_n2414ExhEst, T00842_A10512BarKgsCl, T00842_n10512BarKgsCl, T00842_A2410ExhAlbObs,
            T00842_n2410ExhAlbObs, T00842_A396EmprCod, T00842_A457FasCod, T00842_n457FasCod, T00842_A129BarCod, T00842_A132BarCodReo, T00842_A130BarCodPar
            }
            , new Object[] {
            T00843_A2406ExhAlbCod, T00843_A2415ExhKgsEnt, T00843_n2415ExhKgsEnt, T00843_A2413ExhBulEnt, T00843_n2413ExhBulEnt, T00843_A2414ExhEst, T00843_n2414ExhEst, T00843_A10512BarKgsCl, T00843_n10512BarKgsCl, T00843_A2410ExhAlbObs,
            T00843_n2410ExhAlbObs, T00843_A396EmprCod, T00843_A457FasCod, T00843_n457FasCod, T00843_A129BarCod, T00843_A132BarCodReo, T00843_A130BarCodPar
            }
            , new Object[] {
            T00844_A396EmprCod
            }
            , new Object[] {
            T00845_A212BarSer, T00845_A1878BarNumTen, T00845_A1500BarNMtr, T00845_A135BarColNom, T00845_A136BarColNum, T00845_A252CliCod, T00845_n252CliCod
            }
            , new Object[] {
            T00846_A279CliNom
            }
            , new Object[] {
            T00847_A2406ExhAlbCod, T00847_A2411ExhAlbPri, T00847_n2411ExhAlbPri, T00847_A2407ExhAlbFec, T00847_n2407ExhAlbFec, T00847_A2409ExhAlbLis, T00847_n2409ExhAlbLis, T00847_A2412ExhAlbSec, T00847_n2412ExhAlbSec, T00847_A396EmprCod,
            T00847_A840TrnCod, T00847_n840TrnCod, T00847_A2248ManCod, T00847_n2248ManCod
            }
            , new Object[] {
            T00848_A2406ExhAlbCod, T00848_A2411ExhAlbPri, T00848_n2411ExhAlbPri, T00848_A2407ExhAlbFec, T00848_n2407ExhAlbFec, T00848_A2409ExhAlbLis, T00848_n2409ExhAlbLis, T00848_A2412ExhAlbSec, T00848_n2412ExhAlbSec, T00848_A396EmprCod,
            T00848_A840TrnCod, T00848_n840TrnCod, T00848_A2248ManCod, T00848_n2248ManCod
            }
            , new Object[] {
            T00849_A407EmprNom, T00849_n407EmprNom
            }
            , new Object[] {
            T008410_A841TrnNom, T008410_n841TrnNom
            }
            , new Object[] {
            T008411_A2249ManNom, T008411_n2249ManNom
            }
            , new Object[] {
            T008413_A2408ExhAlbKgs, T008413_A2405ExhAlbBul
            }
            , new Object[] {
            T008415_A2406ExhAlbCod, T008415_A2411ExhAlbPri, T008415_n2411ExhAlbPri, T008415_A407EmprNom, T008415_n407EmprNom, T008415_A2249ManNom, T008415_n2249ManNom, T008415_A841TrnNom, T008415_n841TrnNom, T008415_A2407ExhAlbFec,
            T008415_n2407ExhAlbFec, T008415_A2409ExhAlbLis, T008415_n2409ExhAlbLis, T008415_A2412ExhAlbSec, T008415_n2412ExhAlbSec, T008415_A396EmprCod, T008415_A840TrnCod, T008415_n840TrnCod, T008415_A2248ManCod, T008415_n2248ManCod,
            T008415_A2408ExhAlbKgs, T008415_A2405ExhAlbBul
            }
            , new Object[] {
            T008416_A407EmprNom, T008416_n407EmprNom
            }
            , new Object[] {
            T008417_A841TrnNom, T008417_n841TrnNom
            }
            , new Object[] {
            T008418_A2249ManNom, T008418_n2249ManNom
            }
            , new Object[] {
            T008420_A2408ExhAlbKgs, T008420_A2405ExhAlbBul
            }
            , new Object[] {
            T008421_A396EmprCod, T008421_A2406ExhAlbCod
            }
            , new Object[] {
            T008422_A396EmprCod, T008422_A2406ExhAlbCod
            }
            , new Object[] {
            T008423_A396EmprCod, T008423_A2406ExhAlbCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T008427_A407EmprNom, T008427_n407EmprNom
            }
            , new Object[] {
            T008429_A2408ExhAlbKgs, T008429_A2405ExhAlbBul
            }
            , new Object[] {
            T008430_A2249ManNom, T008430_n2249ManNom
            }
            , new Object[] {
            T008431_A841TrnNom, T008431_n841TrnNom
            }
            , new Object[] {
            T008432_A396EmprCod, T008432_A2406ExhAlbCod, T008432_A2416ExhObsLin
            }
            , new Object[] {
            T008433_A396EmprCod, T008433_A2406ExhAlbCod
            }
            , new Object[] {
            T008434_A2406ExhAlbCod, T008434_A279CliNom, T008434_A2415ExhKgsEnt, T008434_n2415ExhKgsEnt, T008434_A2413ExhBulEnt, T008434_n2413ExhBulEnt, T008434_A2414ExhEst, T008434_n2414ExhEst, T008434_A212BarSer, T008434_A1878BarNumTen,
            T008434_A1500BarNMtr, T008434_A135BarColNom, T008434_A136BarColNum, T008434_A10512BarKgsCl, T008434_n10512BarKgsCl, T008434_A2410ExhAlbObs, T008434_n2410ExhAlbObs, T008434_A396EmprCod, T008434_A457FasCod, T008434_n457FasCod,
            T008434_A129BarCod, T008434_A132BarCodReo, T008434_A130BarCodPar, T008434_A252CliCod, T008434_n252CliCod
            }
            , new Object[] {
            T008435_A396EmprCod
            }
            , new Object[] {
            T008436_A212BarSer, T008436_A1878BarNumTen, T008436_A1500BarNMtr, T008436_A135BarColNom, T008436_A136BarColNum, T008436_A252CliCod, T008436_n252CliCod
            }
            , new Object[] {
            T008437_A279CliNom
            }
            , new Object[] {
            T008438_A396EmprCod, T008438_A2406ExhAlbCod, T008438_A129BarCod, T008438_A132BarCodReo, T008438_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T008442_A212BarSer, T008442_A1878BarNumTen, T008442_A1500BarNMtr, T008442_A135BarColNom, T008442_A136BarColNum, T008442_A252CliCod, T008442_n252CliCod
            }
            , new Object[] {
            T008443_A279CliNom
            }
            , new Object[] {
            T008444_A396EmprCod, T008444_A2406ExhAlbCod, T008444_A129BarCod, T008444_A132BarCodReo, T008444_A130BarCodPar
            }
            , new Object[] {
            T008445_A396EmprCod
            }
         }
      );
   }

   private byte Z2409ExhAlbLis ;
   private byte Z132BarCodReo ;
   private byte Z2414ExhEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A2409ExhAlbLis ;
   private byte A2414ExhEst ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ2409ExhAlbLis ;
   private short Z840TrnCod ;
   private short Z2248ManCod ;
   private short O2405ExhAlbBul ;
   private short Z2413ExhBulEnt ;
   private short O2413ExhBulEnt ;
   private short nRcdDeleted_327 ;
   private short nRcdExists_327 ;
   private short nIsMod_327 ;
   private short A840TrnCod ;
   private short A2248ManCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2405ExhAlbBul ;
   private short nBlankRcdCount327 ;
   private short RcdFound327 ;
   private short B2405ExhAlbBul ;
   private short nBlankRcdUsr327 ;
   private short s2405ExhAlbBul ;
   private short A2413ExhBulEnt ;
   private short T2413ExhBulEnt ;
   private short Z2405ExhAlbBul ;
   private short RcdFound326 ;
   private short nIsDirty_326 ;
   private short nIsDirty_327 ;
   private short ZZ2248ManCod ;
   private short ZZ840TrnCod ;
   private short ZZ2405ExhAlbBul ;
   private short ZO2405ExhAlbBul ;
   private int Z2406ExhAlbCod ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
   private int Z129BarCod ;
   private int A2406ExhAlbCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtExhAlbCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtExhAlbPri_Enabled ;
   private int edtManCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtManNom_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtExhAlbFec_Enabled ;
   private int edtExhAlbLis_Enabled ;
   private int edtExhAlbSec_Enabled ;
   private int edtExhAlbKgs_Enabled ;
   private int edtExhAlbBul_Enabled ;
   private int edtavnRcdDeleted_327_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtExhKgsEnt_Enabled ;
   private int edtExhBulEnt_Enabled ;
   private int edtExhEst_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarNumTen_Enabled ;
   private int edtBarNMtr_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarColNum_Enabled ;
   private int edtBarKgsCl_Enabled ;
   private int edtExhAlbObs_Enabled ;
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
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtExhAlbBul_Backcolor ;
   private int edtExhAlbKgs_Backcolor ;
   private int edtExhAlbSec_Backcolor ;
   private int edtExhAlbLis_Backcolor ;
   private int edtExhAlbFec_Backcolor ;
   private int edtTrnNom_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtManNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtManCod_Backcolor ;
   private int edtExhAlbPri_Backcolor ;
   private int edtExhAlbCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ2406ExhAlbCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O2408ExhAlbKgs ;
   private java.math.BigDecimal Z2415ExhKgsEnt ;
   private java.math.BigDecimal Z10512BarKgsCl ;
   private java.math.BigDecimal O2415ExhKgsEnt ;
   private java.math.BigDecimal A2408ExhAlbKgs ;
   private java.math.BigDecimal B2408ExhAlbKgs ;
   private java.math.BigDecimal s2408ExhAlbKgs ;
   private java.math.BigDecimal A2415ExhKgsEnt ;
   private java.math.BigDecimal A10512BarKgsCl ;
   private java.math.BigDecimal T2415ExhKgsEnt ;
   private java.math.BigDecimal Z2408ExhAlbKgs ;
   private java.math.BigDecimal ZZ2408ExhAlbKgs ;
   private java.math.BigDecimal ZO2408ExhAlbKgs ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2411ExhAlbPri ;
   private String Z2412ExhAlbSec ;
   private String Z130BarCodPar ;
   private String Z2410ExhAlbObs ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_85_idx="0001" ;
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
   private String edtExhAlbCod_Internalname ;
   private String edtExhAlbCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtExhAlbPri_Internalname ;
   private String A2411ExhAlbPri ;
   private String edtExhAlbPri_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtManNom_Internalname ;
   private String A2249ManNom ;
   private String edtManNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtExhAlbFec_Internalname ;
   private String edtExhAlbFec_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtExhAlbLis_Internalname ;
   private String edtExhAlbLis_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtExhAlbSec_Internalname ;
   private String A2412ExhAlbSec ;
   private String edtExhAlbSec_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtExhAlbKgs_Internalname ;
   private String edtExhAlbKgs_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtExhAlbBul_Internalname ;
   private String edtExhAlbBul_Jsonclick ;
   private String sMode327 ;
   private String edtavnRcdDeleted_327_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliNom_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtExhKgsEnt_Internalname ;
   private String edtExhBulEnt_Internalname ;
   private String edtExhEst_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarNumTen_Internalname ;
   private String edtBarNMtr_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarKgsCl_Internalname ;
   private String edtExhAlbObs_Internalname ;
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
   private String sMode326 ;
   private String GXCCtl ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1878BarNumTen ;
   private String A1500BarNMtr ;
   private String A135BarColNom ;
   private String A2410ExhAlbObs ;
   private String Z407EmprNom ;
   private String Z2249ManNom ;
   private String Z841TrnNom ;
   private String Z212BarSer ;
   private String Z1878BarNumTen ;
   private String Z1500BarNMtr ;
   private String Z135BarColNom ;
   private String Z279CliNom ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_327_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtExhKgsEnt_Jsonclick ;
   private String edtExhBulEnt_Jsonclick ;
   private String edtExhEst_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarNumTen_Jsonclick ;
   private String edtBarNMtr_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarKgsCl_Jsonclick ;
   private String edtExhAlbObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2411ExhAlbPri ;
   private String ZZ2412ExhAlbSec ;
   private String ZZ407EmprNom ;
   private String ZZ841TrnNom ;
   private String ZZ2249ManNom ;
   private java.util.Date Z2407ExhAlbFec ;
   private java.util.Date A2407ExhAlbFec ;
   private java.util.Date ZZ2407ExhAlbFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean n2248ManCod ;
   private boolean n457FasCod ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n2411ExhAlbPri ;
   private boolean n407EmprNom ;
   private boolean n2249ManNom ;
   private boolean n841TrnNom ;
   private boolean n2407ExhAlbFec ;
   private boolean n2409ExhAlbLis ;
   private boolean n2412ExhAlbSec ;
   private boolean Gx_longc ;
   private boolean n2415ExhKgsEnt ;
   private boolean n2413ExhBulEnt ;
   private boolean n2414ExhEst ;
   private boolean n10512BarKgsCl ;
   private boolean n2410ExhAlbObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T008415_A2406ExhAlbCod ;
   private String[] T008415_A2411ExhAlbPri ;
   private boolean[] T008415_n2411ExhAlbPri ;
   private String[] T008415_A407EmprNom ;
   private boolean[] T008415_n407EmprNom ;
   private String[] T008415_A2249ManNom ;
   private boolean[] T008415_n2249ManNom ;
   private String[] T008415_A841TrnNom ;
   private boolean[] T008415_n841TrnNom ;
   private java.util.Date[] T008415_A2407ExhAlbFec ;
   private boolean[] T008415_n2407ExhAlbFec ;
   private byte[] T008415_A2409ExhAlbLis ;
   private boolean[] T008415_n2409ExhAlbLis ;
   private String[] T008415_A2412ExhAlbSec ;
   private boolean[] T008415_n2412ExhAlbSec ;
   private String[] T008415_A396EmprCod ;
   private short[] T008415_A840TrnCod ;
   private boolean[] T008415_n840TrnCod ;
   private short[] T008415_A2248ManCod ;
   private boolean[] T008415_n2248ManCod ;
   private java.math.BigDecimal[] T008415_A2408ExhAlbKgs ;
   private short[] T008415_A2405ExhAlbBul ;
   private String[] T00849_A407EmprNom ;
   private boolean[] T00849_n407EmprNom ;
   private String[] T008410_A841TrnNom ;
   private boolean[] T008410_n841TrnNom ;
   private String[] T008411_A2249ManNom ;
   private boolean[] T008411_n2249ManNom ;
   private java.math.BigDecimal[] T008413_A2408ExhAlbKgs ;
   private short[] T008413_A2405ExhAlbBul ;
   private String[] T008416_A407EmprNom ;
   private boolean[] T008416_n407EmprNom ;
   private String[] T008417_A841TrnNom ;
   private boolean[] T008417_n841TrnNom ;
   private String[] T008418_A2249ManNom ;
   private boolean[] T008418_n2249ManNom ;
   private java.math.BigDecimal[] T008420_A2408ExhAlbKgs ;
   private short[] T008420_A2405ExhAlbBul ;
   private String[] T008421_A396EmprCod ;
   private int[] T008421_A2406ExhAlbCod ;
   private int[] T00848_A2406ExhAlbCod ;
   private String[] T00848_A2411ExhAlbPri ;
   private boolean[] T00848_n2411ExhAlbPri ;
   private java.util.Date[] T00848_A2407ExhAlbFec ;
   private boolean[] T00848_n2407ExhAlbFec ;
   private byte[] T00848_A2409ExhAlbLis ;
   private boolean[] T00848_n2409ExhAlbLis ;
   private String[] T00848_A2412ExhAlbSec ;
   private boolean[] T00848_n2412ExhAlbSec ;
   private String[] T00848_A396EmprCod ;
   private short[] T00848_A840TrnCod ;
   private boolean[] T00848_n840TrnCod ;
   private short[] T00848_A2248ManCod ;
   private boolean[] T00848_n2248ManCod ;
   private String[] T008422_A396EmprCod ;
   private int[] T008422_A2406ExhAlbCod ;
   private String[] T008423_A396EmprCod ;
   private int[] T008423_A2406ExhAlbCod ;
   private int[] T00847_A2406ExhAlbCod ;
   private String[] T00847_A2411ExhAlbPri ;
   private boolean[] T00847_n2411ExhAlbPri ;
   private java.util.Date[] T00847_A2407ExhAlbFec ;
   private boolean[] T00847_n2407ExhAlbFec ;
   private byte[] T00847_A2409ExhAlbLis ;
   private boolean[] T00847_n2409ExhAlbLis ;
   private String[] T00847_A2412ExhAlbSec ;
   private boolean[] T00847_n2412ExhAlbSec ;
   private String[] T00847_A396EmprCod ;
   private short[] T00847_A840TrnCod ;
   private boolean[] T00847_n840TrnCod ;
   private short[] T00847_A2248ManCod ;
   private boolean[] T00847_n2248ManCod ;
   private String[] T008427_A407EmprNom ;
   private boolean[] T008427_n407EmprNom ;
   private java.math.BigDecimal[] T008429_A2408ExhAlbKgs ;
   private short[] T008429_A2405ExhAlbBul ;
   private String[] T008430_A2249ManNom ;
   private boolean[] T008430_n2249ManNom ;
   private String[] T008431_A841TrnNom ;
   private boolean[] T008431_n841TrnNom ;
   private String[] T008432_A396EmprCod ;
   private int[] T008432_A2406ExhAlbCod ;
   private short[] T008432_A2416ExhObsLin ;
   private String[] T008433_A396EmprCod ;
   private int[] T008433_A2406ExhAlbCod ;
   private int[] T008434_A2406ExhAlbCod ;
   private String[] T008434_A279CliNom ;
   private java.math.BigDecimal[] T008434_A2415ExhKgsEnt ;
   private boolean[] T008434_n2415ExhKgsEnt ;
   private short[] T008434_A2413ExhBulEnt ;
   private boolean[] T008434_n2413ExhBulEnt ;
   private byte[] T008434_A2414ExhEst ;
   private boolean[] T008434_n2414ExhEst ;
   private String[] T008434_A212BarSer ;
   private String[] T008434_A1878BarNumTen ;
   private String[] T008434_A1500BarNMtr ;
   private String[] T008434_A135BarColNom ;
   private int[] T008434_A136BarColNum ;
   private java.math.BigDecimal[] T008434_A10512BarKgsCl ;
   private boolean[] T008434_n10512BarKgsCl ;
   private String[] T008434_A2410ExhAlbObs ;
   private boolean[] T008434_n2410ExhAlbObs ;
   private String[] T008434_A396EmprCod ;
   private String[] T008434_A457FasCod ;
   private boolean[] T008434_n457FasCod ;
   private int[] T008434_A129BarCod ;
   private byte[] T008434_A132BarCodReo ;
   private String[] T008434_A130BarCodPar ;
   private int[] T008434_A252CliCod ;
   private boolean[] T008434_n252CliCod ;
   private String[] T00844_A396EmprCod ;
   private String[] T00845_A212BarSer ;
   private String[] T00845_A1878BarNumTen ;
   private String[] T00845_A1500BarNMtr ;
   private String[] T00845_A135BarColNom ;
   private int[] T00845_A136BarColNum ;
   private int[] T00845_A252CliCod ;
   private boolean[] T00845_n252CliCod ;
   private String[] T00846_A279CliNom ;
   private String[] T008435_A396EmprCod ;
   private String[] T008436_A212BarSer ;
   private String[] T008436_A1878BarNumTen ;
   private String[] T008436_A1500BarNMtr ;
   private String[] T008436_A135BarColNom ;
   private int[] T008436_A136BarColNum ;
   private int[] T008436_A252CliCod ;
   private boolean[] T008436_n252CliCod ;
   private String[] T008437_A279CliNom ;
   private String[] T008438_A396EmprCod ;
   private int[] T008438_A2406ExhAlbCod ;
   private int[] T008438_A129BarCod ;
   private byte[] T008438_A132BarCodReo ;
   private String[] T008438_A130BarCodPar ;
   private int[] T00843_A2406ExhAlbCod ;
   private java.math.BigDecimal[] T00843_A2415ExhKgsEnt ;
   private boolean[] T00843_n2415ExhKgsEnt ;
   private short[] T00843_A2413ExhBulEnt ;
   private boolean[] T00843_n2413ExhBulEnt ;
   private byte[] T00843_A2414ExhEst ;
   private boolean[] T00843_n2414ExhEst ;
   private java.math.BigDecimal[] T00843_A10512BarKgsCl ;
   private boolean[] T00843_n10512BarKgsCl ;
   private String[] T00843_A2410ExhAlbObs ;
   private boolean[] T00843_n2410ExhAlbObs ;
   private String[] T00843_A396EmprCod ;
   private String[] T00843_A457FasCod ;
   private boolean[] T00843_n457FasCod ;
   private int[] T00843_A129BarCod ;
   private byte[] T00843_A132BarCodReo ;
   private String[] T00843_A130BarCodPar ;
   private int[] T00842_A2406ExhAlbCod ;
   private java.math.BigDecimal[] T00842_A2415ExhKgsEnt ;
   private boolean[] T00842_n2415ExhKgsEnt ;
   private short[] T00842_A2413ExhBulEnt ;
   private boolean[] T00842_n2413ExhBulEnt ;
   private byte[] T00842_A2414ExhEst ;
   private boolean[] T00842_n2414ExhEst ;
   private java.math.BigDecimal[] T00842_A10512BarKgsCl ;
   private boolean[] T00842_n10512BarKgsCl ;
   private String[] T00842_A2410ExhAlbObs ;
   private boolean[] T00842_n2410ExhAlbObs ;
   private String[] T00842_A396EmprCod ;
   private String[] T00842_A457FasCod ;
   private boolean[] T00842_n457FasCod ;
   private int[] T00842_A129BarCod ;
   private byte[] T00842_A132BarCodReo ;
   private String[] T00842_A130BarCodPar ;
   private String[] T008442_A212BarSer ;
   private String[] T008442_A1878BarNumTen ;
   private String[] T008442_A1500BarNMtr ;
   private String[] T008442_A135BarColNom ;
   private int[] T008442_A136BarColNum ;
   private int[] T008442_A252CliCod ;
   private boolean[] T008442_n252CliCod ;
   private String[] T008443_A279CliNom ;
   private String[] T008444_A396EmprCod ;
   private int[] T008444_A2406ExhAlbCod ;
   private int[] T008444_A129BarCod ;
   private byte[] T008444_A132BarCodReo ;
   private String[] T008444_A130BarCodPar ;
   private String[] T008445_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class textper__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class textper__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class textper__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class textper__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class textper__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00842", "SELECT ExhAlbCod, ExhKgsEnt, ExhBulEnt, ExhEst, BarKgsCl, ExhAlbObs, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND ExhAlbCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF ExhKgsEnt, ExhBulEnt, ExhEst, BarKgsCl, ExhAlbObs, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00843", "SELECT ExhAlbCod, ExhKgsEnt, ExhBulEnt, ExhEst, BarKgsCl, ExhAlbObs, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND ExhAlbCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00844", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00845", "SELECT BarSer, BarNumTen, BarNMtr, BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00846", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00847", "SELECT ExhAlbCod, ExhAlbPri, ExhAlbFec, ExhAlbLis, ExhAlbSec, EmprCod, TrnCod, ManCod FROM TXPCEXPER WHERE EmprCod = ? AND ExhAlbCod = ?  FOR UPDATE OF ExhAlbPri, ExhAlbFec, ExhAlbLis, ExhAlbSec, TrnCod, ManCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00848", "SELECT ExhAlbCod, ExhAlbPri, ExhAlbFec, ExhAlbLis, ExhAlbSec, EmprCod, TrnCod, ManCod FROM TXPCEXPER WHERE EmprCod = ? AND ExhAlbCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00849", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008410", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008411", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008413", "SELECT COALESCE( T1.ExhAlbKgs, 0) AS ExhAlbKgs, COALESCE( T1.ExhAlbBul, 0) AS ExhAlbBul FROM (SELECT SUM(ExhKgsEnt) AS ExhAlbKgs, EmprCod, ExhAlbCod, SUM(ExhBulEnt) AS ExhAlbBul FROM TXPLEXPER GROUP BY EmprCod, ExhAlbCod ) T1 WHERE T1.EmprCod = ? AND T1.ExhAlbCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008415", "SELECT /*+ FIRST_ROWS(100) */ TM1.ExhAlbCod, TM1.ExhAlbPri, T2.EmprNom, T4.ManNom, T5.TrnNom, TM1.ExhAlbFec, TM1.ExhAlbLis, TM1.ExhAlbSec, TM1.EmprCod, TM1.TrnCod, TM1.ManCod, COALESCE( T3.ExhAlbKgs, 0) AS ExhAlbKgs, COALESCE( T3.ExhAlbBul, 0) AS ExhAlbBul FROM ((((TXPCEXPER TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(ExhKgsEnt) AS ExhAlbKgs, EmprCod, ExhAlbCod, SUM(ExhBulEnt) AS ExhAlbBul FROM TXPLEXPER GROUP BY EmprCod, ExhAlbCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.ExhAlbCod = TM1.ExhAlbCod) LEFT JOIN TXPMANUFA T4 ON T4.EmprCod = TM1.EmprCod AND T4.ManCod = TM1.ManCod) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = TM1.EmprCod AND T5.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.ExhAlbCod = ? ORDER BY TM1.EmprCod, TM1.ExhAlbCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008416", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008417", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008418", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008420", "SELECT COALESCE( T1.ExhAlbKgs, 0) AS ExhAlbKgs, COALESCE( T1.ExhAlbBul, 0) AS ExhAlbBul FROM (SELECT SUM(ExhKgsEnt) AS ExhAlbKgs, EmprCod, ExhAlbCod, SUM(ExhBulEnt) AS ExhAlbBul FROM TXPLEXPER GROUP BY EmprCod, ExhAlbCod ) T1 WHERE T1.EmprCod = ? AND T1.ExhAlbCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008421", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ExhAlbCod FROM TXPCEXPER WHERE EmprCod = ? AND ExhAlbCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008422", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ExhAlbCod FROM TXPCEXPER WHERE ( EmprCod > ? or EmprCod = ? and ExhAlbCod > ?) ORDER BY EmprCod, ExhAlbCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008423", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ExhAlbCod FROM TXPCEXPER WHERE ( EmprCod < ? or EmprCod = ? and ExhAlbCod < ?) ORDER BY EmprCod DESC, ExhAlbCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T008424", "INSERT INTO TXPCEXPER(ExhAlbCod, ExhAlbPri, ExhAlbFec, ExhAlbLis, ExhAlbSec, EmprCod, TrnCod, ManCod, ExhObsULin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPCEXPER")
         ,new UpdateCursor("T008425", "UPDATE TXPCEXPER SET ExhAlbPri=?, ExhAlbFec=?, ExhAlbLis=?, ExhAlbSec=?, TrnCod=?, ManCod=?  WHERE EmprCod = ? AND ExhAlbCod = ?", GX_NOMASK, "TXPCEXPER")
         ,new UpdateCursor("T008426", "DELETE FROM TXPCEXPER  WHERE EmprCod = ? AND ExhAlbCod = ?", GX_NOMASK, "TXPCEXPER")
         ,new ForEachCursor("T008427", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008429", "SELECT COALESCE( T1.ExhAlbKgs, 0) AS ExhAlbKgs, COALESCE( T1.ExhAlbBul, 0) AS ExhAlbBul FROM (SELECT SUM(ExhKgsEnt) AS ExhAlbKgs, EmprCod, ExhAlbCod, SUM(ExhBulEnt) AS ExhAlbBul FROM TXPLEXPER GROUP BY EmprCod, ExhAlbCod ) T1 WHERE T1.EmprCod = ? AND T1.ExhAlbCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008430", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008431", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008432", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, ExhObsLin FROM TXPOEXPER WHERE EmprCod = ? AND ExhAlbCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008433", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ExhAlbCod FROM TXPCEXPER ORDER BY EmprCod, ExhAlbCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008434", "SELECT T1.ExhAlbCod, T3.CliNom, T1.ExhKgsEnt, T1.ExhBulEnt, T1.ExhEst, T2.BarSer, T2.BarNumTen, T2.BarNMtr, T2.BarColNom, T2.BarColNum, T1.BarKgsCl, T1.ExhAlbObs, T1.EmprCod, T1.FasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod FROM ((TXPLEXPER T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.ExhAlbCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.ExhAlbCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008435", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008436", "SELECT BarSer, BarNumTen, BarNMtr, BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008437", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008438", "SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND ExhAlbCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T008439", "INSERT INTO TXPLEXPER(ExhAlbCod, ExhKgsEnt, ExhBulEnt, ExhEst, BarKgsCl, ExhAlbObs, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLEXPER")
         ,new UpdateCursor("T008440", "UPDATE TXPLEXPER SET ExhKgsEnt=?, ExhBulEnt=?, ExhEst=?, BarKgsCl=?, ExhAlbObs=?, FasCod=?  WHERE EmprCod = ? AND ExhAlbCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPLEXPER")
         ,new UpdateCursor("T008441", "DELETE FROM TXPLEXPER  WHERE EmprCod = ? AND ExhAlbCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPLEXPER")
         ,new ForEachCursor("T008442", "SELECT BarSer, BarNumTen, BarNMtr, BarColNom, BarColNum, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008443", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008444", "SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? and ExhAlbCod = ? ORDER BY EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008445", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[21])[0] = rslt.getShort(13);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((String[]) buf[18])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((byte[]) buf[21])[0] = rslt.getByte(16);
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((int[]) buf[23])[0] = rslt.getInt(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 39 :
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               stmt.setString(6, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
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
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
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
                  stmt.setString(6, (String)parms[10], 30);
               }
               stmt.setString(7, (String)parms[11], 3);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 8);
               }
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setString(11, (String)parms[16], 1);
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
                  stmt.setString(5, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setString(11, (String)parms[16], 1);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 37 :
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
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
      }
   }

}

