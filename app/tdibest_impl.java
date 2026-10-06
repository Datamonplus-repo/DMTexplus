package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdibest_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A425EstAny = (short)(GXutil.lval( httpContext.GetPar( "EstAny"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
         A3913DibSerFac = httpContext.GetPar( "DibSerFac") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A425EstAny, A3913DibSerFac) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ESTADISTICAS DE DIBUJOS", ""), (short)(0)) ;
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

   public tdibest_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdibest_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdibest_impl.class ));
   }

   public tdibest_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDIBEST.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Año", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstAny_Internalname, GXutil.ltrim( localUtil.ntoc( A425EstAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A425EstAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A425EstAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstAny_Jsonclick, 0, "", "", "", "", "", 1, edtEstAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Serie Factura", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibSerFac_Internalname, GXutil.rtrim( A3913DibSerFac), GXutil.rtrim( localUtil.format( A3913DibSerFac, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibSerFac_Jsonclick, 0, "", "", "", "", "", 1, edtDibSerFac_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Acumulado metros estampados", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcuMtrEst_Internalname, GXutil.ltrim( localUtil.ntoc( A1083AcuMtrEst, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcuMtrEst_Enabled!=0) ? localUtil.format( A1083AcuMtrEst, "ZZZZZZ9.99") : localUtil.format( A1083AcuMtrEst, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcuMtrEst_Jsonclick, 0, "", "", "", "", "", 1, edtAcuMtrEst_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Acumulado Mtr. Estampados 1", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcuMtrEst1_Internalname, GXutil.ltrim( localUtil.ntoc( A1135AcuMtrEst1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcuMtrEst1_Enabled!=0) ? localUtil.format( A1135AcuMtrEst1, "ZZZZZZ9.99") : localUtil.format( A1135AcuMtrEst1, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcuMtrEst1_Jsonclick, 0, "", "", "", "", "", 1, edtAcuMtrEst1_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Metros Facturados", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcuMtrFac_Internalname, GXutil.ltrim( localUtil.ntoc( A1084AcuMtrFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcuMtrFac_Enabled!=0) ? localUtil.format( A1084AcuMtrFac, "ZZZZZZ9.99") : localUtil.format( A1084AcuMtrFac, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcuMtrFac_Jsonclick, 0, "", "", "", "", "", 1, edtAcuMtrFac_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Acumulado Mtr. Facturados 1", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcuMtrFac1_Internalname, GXutil.ltrim( localUtil.ntoc( A1136AcuMtrFac1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcuMtrFac1_Enabled!=0) ? localUtil.format( A1136AcuMtrFac1, "ZZZZZZ9.99") : localUtil.format( A1136AcuMtrFac1, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcuMtrFac1_Jsonclick, 0, "", "", "", "", "", 1, edtAcuMtrFac1_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Acumulado Importe Facturado", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcuImpFac_Internalname, GXutil.ltrim( localUtil.ntoc( A1085AcuImpFac, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcuImpFac_Enabled!=0) ? localUtil.format( A1085AcuImpFac, "ZZZZZZZZ9.99") : localUtil.format( A1085AcuImpFac, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcuImpFac_Jsonclick, 0, "", "", "", "", "", 1, edtAcuImpFac_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Acumulado Facturación 1", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAcuImpFac1_Internalname, GXutil.ltrim( localUtil.ntoc( A1133AcuImpFac1, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAcuImpFac1_Enabled!=0) ? localUtil.format( A1133AcuImpFac1, "ZZZZZZZZ9.99") : localUtil.format( A1133AcuImpFac1, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAcuImpFac1_Jsonclick, 0, "", "", "", "", "", 1, edtAcuImpFac1_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDIBEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDIBEST.htm");
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
         nBlankRcdCount547 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_547 = (short)(1) ;
            scanStartFR547( ) ;
            while ( RcdFound547 != 0 )
            {
               init_level_properties547( ) ;
               getByPrimaryKeyFR547( ) ;
               addRowFR547( ) ;
               scanNextFR547( ) ;
            }
            scanEndFR547( ) ;
            nBlankRcdCount547 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1133AcuImpFac1 = A1133AcuImpFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         B1085AcuImpFac = A1085AcuImpFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         B1136AcuMtrFac1 = A1136AcuMtrFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         B1084AcuMtrFac = A1084AcuMtrFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         B1135AcuMtrEst1 = A1135AcuMtrEst1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         B1083AcuMtrEst = A1083AcuMtrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         standaloneNotModalFR547( ) ;
         standaloneModalFR547( ) ;
         sMode547 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRowFR547( ) ;
            edtavnRcdDeleted_547_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_547_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_547_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_547_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtEstMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTMES_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMes_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtMtrEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTREST_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrEst_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtMtrEst1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTREST1_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtrEst1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrEst1_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtMtrFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTRFAC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtrFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrFac_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtMtrFac1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTRFAC1_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtrFac1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrFac1_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtImpFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IMPFAC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtImpFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpFac_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtImpFac1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IMPFAC1_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtImpFac1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpFac1_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_547 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalFR547( ) ;
            }
            sendRowFR547( ) ;
            bGXsfl_85_Refreshing = false ;
         }
         Gx_mode = sMode547 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1133AcuImpFac1 = B1133AcuImpFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         A1085AcuImpFac = B1085AcuImpFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1136AcuMtrFac1 = B1136AcuMtrFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1084AcuMtrFac = B1084AcuMtrFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1135AcuMtrEst1 = B1135AcuMtrEst1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1083AcuMtrEst = B1083AcuMtrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount547 = (short)(5) ;
         nRcdExists_547 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartFR547( ) ;
            while ( RcdFound547 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_85547( ) ;
               init_level_properties547( ) ;
               standaloneNotModalFR547( ) ;
               getByPrimaryKeyFR547( ) ;
               standaloneModalFR547( ) ;
               addRowFR547( ) ;
               scanNextFR547( ) ;
            }
            scanEndFR547( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode547 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_85547( ) ;
      initAllFR547( ) ;
      init_level_properties547( ) ;
      B1133AcuImpFac1 = A1133AcuImpFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      B1085AcuImpFac = A1085AcuImpFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      B1136AcuMtrFac1 = A1136AcuMtrFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      B1084AcuMtrFac = A1084AcuMtrFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      B1135AcuMtrEst1 = A1135AcuMtrEst1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      B1083AcuMtrEst = A1083AcuMtrEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      nRcdExists_547 = (short)(0) ;
      nIsMod_547 = (short)(0) ;
      nRcdDeleted_547 = (short)(0) ;
      nBlankRcdCount547 = (short)(nBlankRcdUsr547+nBlankRcdCount547) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount547 > 0 )
      {
         standaloneNotModalFR547( ) ;
         standaloneModalFR547( ) ;
         addRowFR547( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEstMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount547 = (short)(nBlankRcdCount547-1) ;
      }
      Gx_mode = sMode547 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1133AcuImpFac1 = B1133AcuImpFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      A1085AcuImpFac = B1085AcuImpFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      A1136AcuMtrFac1 = B1136AcuMtrFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      A1084AcuMtrFac = B1084AcuMtrFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      A1135AcuMtrEst1 = B1135AcuMtrEst1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      A1083AcuMtrEst = B1083AcuMtrEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDIBEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDIBEST.htm");
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
      e11FR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1013DibCli = httpContext.cgiGet( "Z1013DibCli") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1014DibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z425EstAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z425EstAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3913DibSerFac = httpContext.cgiGet( "Z3913DibSerFac") ;
            O1133AcuImpFac1 = localUtil.ctond( httpContext.cgiGet( "O1133AcuImpFac1")) ;
            O1085AcuImpFac = localUtil.ctond( httpContext.cgiGet( "O1085AcuImpFac")) ;
            O1136AcuMtrFac1 = localUtil.ctond( httpContext.cgiGet( "O1136AcuMtrFac1")) ;
            O1084AcuMtrFac = localUtil.ctond( httpContext.cgiGet( "O1084AcuMtrFac")) ;
            O1135AcuMtrEst1 = localUtil.ctond( httpContext.cgiGet( "O1135AcuMtrEst1")) ;
            O1083AcuMtrEst = localUtil.ctond( httpContext.cgiGet( "O1083AcuMtrEst")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1014DibInt = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            }
            else
            {
               A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A425EstAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
            }
            else
            {
               A425EstAny = (short)(localUtil.ctol( httpContext.cgiGet( edtEstAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
            }
            A3913DibSerFac = httpContext.cgiGet( edtDibSerFac_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
            A1083AcuMtrEst = localUtil.ctond( httpContext.cgiGet( edtAcuMtrEst_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
            A1135AcuMtrEst1 = localUtil.ctond( httpContext.cgiGet( edtAcuMtrEst1_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
            A1084AcuMtrFac = localUtil.ctond( httpContext.cgiGet( edtAcuMtrFac_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
            A1136AcuMtrFac1 = localUtil.ctond( httpContext.cgiGet( edtAcuMtrFac1_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
            A1085AcuImpFac = localUtil.ctond( httpContext.cgiGet( edtAcuImpFac_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
            A1133AcuImpFac1 = localUtil.ctond( httpContext.cgiGet( edtAcuImpFac1_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
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
               A1013DibCli = httpContext.GetPar( "DibCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               A425EstAny = (short)(GXutil.lval( httpContext.GetPar( "EstAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
               A3913DibSerFac = httpContext.GetPar( "DibSerFac") ;
               httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
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
                        e11FR2 ();
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
            initAllFR546( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_547_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_547_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      disableAttributesFR546( ) ;
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

   public void confirm_FR0( )
   {
      beforeValidateFR546( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsFR546( ) ;
         }
         else
         {
            checkExtendedTableFR546( ) ;
            if ( AnyError == 0 )
            {
               zmFR546( 8) ;
               zmFR546( 9) ;
               zmFR546( 10) ;
            }
            closeExtendedTableCursorsFR546( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode546 = Gx_mode ;
         confirm_FR547( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode546 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode546 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesFR0( ) ;
      }
   }

   public void confirm_FR547( )
   {
      s1133AcuImpFac1 = O1133AcuImpFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      s1085AcuImpFac = O1085AcuImpFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      s1136AcuMtrFac1 = O1136AcuMtrFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      s1084AcuMtrFac = O1084AcuMtrFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      s1135AcuMtrEst1 = O1135AcuMtrEst1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      s1083AcuMtrEst = O1083AcuMtrEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRowFR547( ) ;
         if ( ( nRcdExists_547 != 0 ) || ( nIsMod_547 != 0 ) )
         {
            getKeyFR547( ) ;
            if ( ( nRcdExists_547 == 0 ) && ( nRcdDeleted_547 == 0 ) )
            {
               if ( RcdFound547 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateFR547( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableFR547( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsFR547( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1133AcuImpFac1 = A1133AcuImpFac1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
                     O1085AcuImpFac = A1085AcuImpFac ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
                     O1136AcuMtrFac1 = A1136AcuMtrFac1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
                     O1084AcuMtrFac = A1084AcuMtrFac ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
                     O1135AcuMtrEst1 = A1135AcuMtrEst1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
                     O1083AcuMtrEst = A1083AcuMtrEst ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
                  }
               }
               else
               {
                  GXCCtl = "ESTMES_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEstMes_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound547 != 0 )
               {
                  if ( nRcdDeleted_547 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyFR547( ) ;
                     loadFR547( ) ;
                     beforeValidateFR547( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsFR547( ) ;
                        O1133AcuImpFac1 = A1133AcuImpFac1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
                        O1085AcuImpFac = A1085AcuImpFac ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
                        O1136AcuMtrFac1 = A1136AcuMtrFac1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
                        O1084AcuMtrFac = A1084AcuMtrFac ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
                        O1135AcuMtrEst1 = A1135AcuMtrEst1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
                        O1083AcuMtrEst = A1083AcuMtrEst ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_547 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateFR547( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableFR547( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsFR547( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1133AcuImpFac1 = A1133AcuImpFac1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
                           O1085AcuImpFac = A1085AcuImpFac ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
                           O1136AcuMtrFac1 = A1136AcuMtrFac1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
                           O1084AcuMtrFac = A1084AcuMtrFac ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
                           O1135AcuMtrEst1 = A1135AcuMtrEst1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
                           O1083AcuMtrEst = A1083AcuMtrEst ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_547 == 0 )
                  {
                     GXCCtl = "ESTMES_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_547_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstMes_Internalname, GXutil.ltrim( localUtil.ntoc( A426EstMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrEst_Internalname, GXutil.ltrim( localUtil.ntoc( A1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrEst1_Internalname, GXutil.ltrim( localUtil.ntoc( A1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrFac_Internalname, GXutil.ltrim( localUtil.ntoc( A1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrFac1_Internalname, GXutil.ltrim( localUtil.ntoc( A1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtImpFac_Internalname, GXutil.ltrim( localUtil.ntoc( A1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtImpFac1_Internalname, GXutil.ltrim( localUtil.ntoc( A1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z426EstMes_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z426EstMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1086MtrEst_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1137MtrEst1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1087MtrFac_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1138MtrFac1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1088ImpFac_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1134ImpFac1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1134ImpFac1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1088ImpFac_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1138MtrFac1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1087MtrFac_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1137MtrEst1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1086MtrEst_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_547_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_547_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_547_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_547 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_547_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_547_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTMES_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTREST_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTREST1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrEst1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTRFAC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTRFAC1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrFac1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IMPFAC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtImpFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IMPFAC1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtImpFac1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1133AcuImpFac1 = s1133AcuImpFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      O1085AcuImpFac = s1085AcuImpFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      O1136AcuMtrFac1 = s1136AcuMtrFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      O1084AcuMtrFac = s1084AcuMtrFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      O1135AcuMtrEst1 = s1135AcuMtrEst1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      O1083AcuMtrEst = s1083AcuMtrEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionFR0( )
   {
   }

   public void e11FR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV6Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV6Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Lit0", AV6Lit0);
      GXt_char1 = AV7Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit1", AV7Lit1);
      GXt_char1 = AV8Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Lit2", AV8Lit2);
      GXt_char1 = AV9Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Lit3", AV9Lit3);
      GXt_char1 = AV10Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit4", AV10Lit4);
      GXt_char1 = AV11Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Lit5", AV11Lit5);
      GXt_char1 = AV12Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Lit6", AV12Lit6);
      GXt_char1 = AV13Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit7", AV13Lit7);
      GXt_char1 = AV14Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit8", AV14Lit8);
      GXt_char1 = AV15Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit9", AV15Lit9);
      GXt_char1 = AV16Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit10", AV16Lit10);
      GXt_char1 = AV17Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit11", AV17Lit11);
      GXt_char1 = AV18Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN", ""), (byte)(0), GXv_char2) ;
      tdibest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit12", AV18Lit12);
   }

   public void zmFR546( int GX_JID )
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
         Z425EstAny = A425EstAny ;
         Z3913DibSerFac = A3913DibSerFac ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z407EmprNom = A407EmprNom ;
         Z1083AcuMtrEst = A1083AcuMtrEst ;
         Z1135AcuMtrEst1 = A1135AcuMtrEst1 ;
         Z1084AcuMtrFac = A1084AcuMtrFac ;
         Z1136AcuMtrFac1 = A1136AcuMtrFac1 ;
         Z1085AcuImpFac = A1085AcuImpFac ;
         Z1133AcuImpFac1 = A1133AcuImpFac1 ;
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

   public void loadFR546( )
   {
      /* Using cursor T00FR11 */
      pr_default.execute(7, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound546 = (short)(1) ;
         A407EmprNom = T00FR11_A407EmprNom[0] ;
         n407EmprNom = T00FR11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1083AcuMtrEst = T00FR11_A1083AcuMtrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         A1135AcuMtrEst1 = T00FR11_A1135AcuMtrEst1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1084AcuMtrFac = T00FR11_A1084AcuMtrFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1136AcuMtrFac1 = T00FR11_A1136AcuMtrFac1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1085AcuImpFac = T00FR11_A1085AcuImpFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1133AcuImpFac1 = T00FR11_A1133AcuImpFac1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         zmFR546( -7) ;
      }
      pr_default.close(7);
      onLoadActionsFR546( ) ;
   }

   public void onLoadActionsFR546( )
   {
      O1133AcuImpFac1 = A1133AcuImpFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      O1085AcuImpFac = A1085AcuImpFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      O1136AcuMtrFac1 = A1136AcuMtrFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      O1084AcuMtrFac = A1084AcuMtrFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      O1135AcuMtrEst1 = A1135AcuMtrEst1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      O1083AcuMtrEst = A1083AcuMtrEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
   }

   public void checkExtendedTableFR546( )
   {
      nIsDirty_546 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00FR6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00FR6_A407EmprNom[0] ;
      n407EmprNom = T00FR6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00FR7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T00FR9 */
      pr_default.execute(6, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A1083AcuMtrEst = T00FR9_A1083AcuMtrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         A1135AcuMtrEst1 = T00FR9_A1135AcuMtrEst1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1084AcuMtrFac = T00FR9_A1084AcuMtrFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1136AcuMtrFac1 = T00FR9_A1136AcuMtrFac1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1085AcuImpFac = T00FR9_A1085AcuImpFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1133AcuImpFac1 = T00FR9_A1133AcuImpFac1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      }
      else
      {
         nIsDirty_546 = (short)(1) ;
         A1083AcuMtrEst = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         nIsDirty_546 = (short)(1) ;
         A1135AcuMtrEst1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         nIsDirty_546 = (short)(1) ;
         A1084AcuMtrFac = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         nIsDirty_546 = (short)(1) ;
         A1136AcuMtrFac1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         nIsDirty_546 = (short)(1) ;
         A1085AcuImpFac = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         nIsDirty_546 = (short)(1) ;
         A1133AcuImpFac1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursorsFR546( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod )
   {
      /* Using cursor T00FR12 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00FR12_A407EmprNom[0] ;
      n407EmprNom = T00FR12_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_9( String A396EmprCod ,
                         String A1013DibCli ,
                         int A252CliCod ,
                         int A1014DibInt )
   {
      /* Using cursor T00FR13 */
      pr_default.execute(9, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void gxload_10( String A396EmprCod ,
                          String A1013DibCli ,
                          int A252CliCod ,
                          int A1014DibInt ,
                          short A425EstAny ,
                          String A3913DibSerFac )
   {
      /* Using cursor T00FR15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A1083AcuMtrEst = T00FR15_A1083AcuMtrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         A1135AcuMtrEst1 = T00FR15_A1135AcuMtrEst1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1084AcuMtrFac = T00FR15_A1084AcuMtrFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1136AcuMtrFac1 = T00FR15_A1136AcuMtrFac1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1085AcuImpFac = T00FR15_A1085AcuImpFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1133AcuImpFac1 = T00FR15_A1133AcuImpFac1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      }
      else
      {
         A1083AcuMtrEst = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         A1135AcuMtrEst1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1084AcuMtrFac = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1136AcuMtrFac1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1085AcuImpFac = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1133AcuImpFac1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1083AcuMtrEst, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1135AcuMtrEst1, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1084AcuMtrFac, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1136AcuMtrFac1, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1085AcuImpFac, (byte)(12), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1133AcuImpFac1, (byte)(12), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKeyFR546( )
   {
      /* Using cursor T00FR16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound546 = (short)(1) ;
      }
      else
      {
         RcdFound546 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00FR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmFR546( 7) ;
         RcdFound546 = (short)(1) ;
         A425EstAny = T00FR5_A425EstAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
         A3913DibSerFac = T00FR5_A3913DibSerFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
         A396EmprCod = T00FR5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00FR5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1013DibCli = T00FR5_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T00FR5_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z425EstAny = A425EstAny ;
         Z3913DibSerFac = A3913DibSerFac ;
         sMode546 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadFR546( ) ;
         if ( AnyError == 1 )
         {
            RcdFound546 = (short)(0) ;
            initializeNonKeyFR546( ) ;
         }
         Gx_mode = sMode546 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound546 = (short)(0) ;
         initializeNonKeyFR546( ) ;
         sMode546 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode546 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyFR546( ) ;
      if ( RcdFound546 == 0 )
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
      RcdFound546 = (short)(0) ;
      /* Using cursor T00FR17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, A1013DibCli, A1013DibCli, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A1013DibCli, A396EmprCod, Integer.valueOf(A1014DibInt), Integer.valueOf(A1014DibInt), Integer.valueOf(A252CliCod), A1013DibCli, A396EmprCod, Short.valueOf(A425EstAny), Short.valueOf(A425EstAny), Integer.valueOf(A1014DibInt), Integer.valueOf(A252CliCod), A1013DibCli, A396EmprCod, A3913DibSerFac});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) < 0 ) || ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR17_A252CliCod[0] < A252CliCod ) || ( T00FR17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR17_A1014DibInt[0] < A1014DibInt ) || ( T00FR17_A1014DibInt[0] == A1014DibInt ) && ( T00FR17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR17_A425EstAny[0] < A425EstAny ) || ( T00FR17_A425EstAny[0] == A425EstAny ) && ( T00FR17_A1014DibInt[0] == A1014DibInt ) && ( T00FR17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00FR17_A3913DibSerFac[0], A3913DibSerFac) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) > 0 ) || ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR17_A252CliCod[0] > A252CliCod ) || ( T00FR17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR17_A1014DibInt[0] > A1014DibInt ) || ( T00FR17_A1014DibInt[0] == A1014DibInt ) && ( T00FR17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR17_A425EstAny[0] > A425EstAny ) || ( T00FR17_A425EstAny[0] == A425EstAny ) && ( T00FR17_A1014DibInt[0] == A1014DibInt ) && ( T00FR17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR17_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00FR17_A3913DibSerFac[0], A3913DibSerFac) > 0 ) ) )
         {
            A396EmprCod = T00FR17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1013DibCli = T00FR17_A1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = T00FR17_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = T00FR17_A1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A425EstAny = T00FR17_A425EstAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
            A3913DibSerFac = T00FR17_A3913DibSerFac[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
            RcdFound546 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound546 = (short)(0) ;
      /* Using cursor T00FR18 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A1013DibCli, A1013DibCli, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A1013DibCli, A396EmprCod, Integer.valueOf(A1014DibInt), Integer.valueOf(A1014DibInt), Integer.valueOf(A252CliCod), A1013DibCli, A396EmprCod, Short.valueOf(A425EstAny), Short.valueOf(A425EstAny), Integer.valueOf(A1014DibInt), Integer.valueOf(A252CliCod), A1013DibCli, A396EmprCod, A3913DibSerFac});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) > 0 ) || ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR18_A252CliCod[0] > A252CliCod ) || ( T00FR18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR18_A1014DibInt[0] > A1014DibInt ) || ( T00FR18_A1014DibInt[0] == A1014DibInt ) && ( T00FR18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR18_A425EstAny[0] > A425EstAny ) || ( T00FR18_A425EstAny[0] == A425EstAny ) && ( T00FR18_A1014DibInt[0] == A1014DibInt ) && ( T00FR18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00FR18_A3913DibSerFac[0], A3913DibSerFac) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) < 0 ) || ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR18_A252CliCod[0] < A252CliCod ) || ( T00FR18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR18_A1014DibInt[0] < A1014DibInt ) || ( T00FR18_A1014DibInt[0] == A1014DibInt ) && ( T00FR18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00FR18_A425EstAny[0] < A425EstAny ) || ( T00FR18_A425EstAny[0] == A425EstAny ) && ( T00FR18_A1014DibInt[0] == A1014DibInt ) && ( T00FR18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00FR18_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T00FR18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00FR18_A3913DibSerFac[0], A3913DibSerFac) < 0 ) ) )
         {
            A396EmprCod = T00FR18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1013DibCli = T00FR18_A1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = T00FR18_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = T00FR18_A1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A425EstAny = T00FR18_A425EstAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
            A3913DibSerFac = T00FR18_A3913DibSerFac[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
            RcdFound546 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyFR546( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1133AcuImpFac1 = O1133AcuImpFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         A1085AcuImpFac = O1085AcuImpFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1136AcuMtrFac1 = O1136AcuMtrFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1084AcuMtrFac = O1084AcuMtrFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1135AcuMtrEst1 = O1135AcuMtrEst1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1083AcuMtrEst = O1083AcuMtrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertFR546( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound546 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) || ( A425EstAny != Z425EstAny ) || ( GXutil.strcmp(A3913DibSerFac, Z3913DibSerFac) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A1013DibCli = Z1013DibCli ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A1014DibInt = Z1014DibInt ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               A425EstAny = Z425EstAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
               A3913DibSerFac = Z3913DibSerFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1133AcuImpFac1 = O1133AcuImpFac1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
               A1085AcuImpFac = O1085AcuImpFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
               A1136AcuMtrFac1 = O1136AcuMtrFac1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
               A1084AcuMtrFac = O1084AcuMtrFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
               A1135AcuMtrEst1 = O1135AcuMtrEst1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
               A1083AcuMtrEst = O1083AcuMtrEst ;
               httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
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
               A1133AcuImpFac1 = O1133AcuImpFac1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
               A1085AcuImpFac = O1085AcuImpFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
               A1136AcuMtrFac1 = O1136AcuMtrFac1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
               A1084AcuMtrFac = O1084AcuMtrFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
               A1135AcuMtrEst1 = O1135AcuMtrEst1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
               A1083AcuMtrEst = O1083AcuMtrEst ;
               httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
               updateFR546( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) || ( A425EstAny != Z425EstAny ) || ( GXutil.strcmp(A3913DibSerFac, Z3913DibSerFac) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A1133AcuImpFac1 = O1133AcuImpFac1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
               A1085AcuImpFac = O1085AcuImpFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
               A1136AcuMtrFac1 = O1136AcuMtrFac1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
               A1084AcuMtrFac = O1084AcuMtrFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
               A1135AcuMtrEst1 = O1135AcuMtrEst1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
               A1083AcuMtrEst = O1083AcuMtrEst ;
               httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertFR546( ) ;
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
                  A1133AcuImpFac1 = O1133AcuImpFac1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
                  A1085AcuImpFac = O1085AcuImpFac ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
                  A1136AcuMtrFac1 = O1136AcuMtrFac1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
                  A1084AcuMtrFac = O1084AcuMtrFac ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
                  A1135AcuMtrEst1 = O1135AcuMtrEst1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
                  A1083AcuMtrEst = O1083AcuMtrEst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertFR546( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) || ( A425EstAny != Z425EstAny ) || ( GXutil.strcmp(A3913DibSerFac, Z3913DibSerFac) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = Z1013DibCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = Z1014DibInt ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A425EstAny = Z425EstAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
         A3913DibSerFac = Z3913DibSerFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1133AcuImpFac1 = O1133AcuImpFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         A1085AcuImpFac = O1085AcuImpFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1136AcuMtrFac1 = O1136AcuMtrFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1084AcuMtrFac = O1084AcuMtrFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1135AcuMtrEst1 = O1135AcuMtrEst1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1083AcuMtrEst = O1083AcuMtrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
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
      getKeyFR546( ) ;
      if ( RcdFound546 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) || ( A425EstAny != Z425EstAny ) || ( GXutil.strcmp(A3913DibSerFac, Z3913DibSerFac) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1013DibCli = Z1013DibCli ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1014DibInt = Z1014DibInt ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A425EstAny = Z425EstAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
            A3913DibSerFac = Z3913DibSerFac ;
            httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A1014DibInt != Z1014DibInt ) || ( A425EstAny != Z425EstAny ) || ( GXutil.strcmp(A3913DibSerFac, Z3913DibSerFac) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdibest");
   }

   public void insert_check( )
   {
      confirm_FR0( ) ;
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
      if ( RcdFound546 == 0 )
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
      scanStartFR546( ) ;
      if ( RcdFound546 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndFR546( ) ;
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
      if ( RcdFound546 == 0 )
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
      if ( RcdFound546 == 0 )
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
      scanStartFR546( ) ;
      if ( RcdFound546 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound546 != 0 )
         {
            scanNextFR546( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndFR546( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyFR546( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00FR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTDI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESTDI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertFR546( )
   {
      beforeValidateFR546( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFR546( ) ;
      }
      if ( AnyError == 0 )
      {
         zmFR546( 0) ;
         checkOptimisticConcurrencyFR546( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFR546( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertFR546( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FR19 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A425EstAny), A3913DibSerFac, A396EmprCod, Integer.valueOf(A252CliCod), A1013DibCli, Integer.valueOf(A1014DibInt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTDI");
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
                        processLevelFR546( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionFR0( ) ;
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
            loadFR546( ) ;
         }
         endLevelFR546( ) ;
      }
      closeExtendedTableCursorsFR546( ) ;
   }

   public void updateFR546( )
   {
      beforeValidateFR546( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFR546( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFR546( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFR546( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateFR546( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCESTDI */
                  deferredUpdateFR546( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelFR546( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionFR0( ) ;
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
         endLevelFR546( ) ;
      }
      closeExtendedTableCursorsFR546( ) ;
   }

   public void deferredUpdateFR546( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateFR546( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFR546( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsFR546( ) ;
         afterConfirmFR546( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteFR546( ) ;
            if ( AnyError == 0 )
            {
               A1133AcuImpFac1 = O1133AcuImpFac1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
               A1085AcuImpFac = O1085AcuImpFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
               A1136AcuMtrFac1 = O1136AcuMtrFac1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
               A1084AcuMtrFac = O1084AcuMtrFac ;
               httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
               A1135AcuMtrEst1 = O1135AcuMtrEst1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
               A1083AcuMtrEst = O1083AcuMtrEst ;
               httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
               scanStartFR547( ) ;
               while ( RcdFound547 != 0 )
               {
                  getByPrimaryKeyFR547( ) ;
                  deleteFR547( ) ;
                  scanNextFR547( ) ;
                  O1133AcuImpFac1 = A1133AcuImpFac1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
                  O1085AcuImpFac = A1085AcuImpFac ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
                  O1136AcuMtrFac1 = A1136AcuMtrFac1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
                  O1084AcuMtrFac = A1084AcuMtrFac ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
                  O1135AcuMtrEst1 = A1135AcuMtrEst1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
                  O1083AcuMtrEst = A1083AcuMtrEst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
               }
               scanEndFR547( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FR20 */
                  pr_default.execute(15, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTDI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound546 == 0 )
                        {
                           initAllFR546( ) ;
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
                        resetCaptionFR0( ) ;
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
      sMode546 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelFR546( ) ;
      Gx_mode = sMode546 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsFR546( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00FR21 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T00FR21_A407EmprNom[0] ;
         n407EmprNom = T00FR21_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(16);
         /* Using cursor T00FR23 */
         pr_default.execute(17, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
         if ( (pr_default.getStatus(17) != 101) )
         {
            A1083AcuMtrEst = T00FR23_A1083AcuMtrEst[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
            A1135AcuMtrEst1 = T00FR23_A1135AcuMtrEst1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
            A1084AcuMtrFac = T00FR23_A1084AcuMtrFac[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
            A1136AcuMtrFac1 = T00FR23_A1136AcuMtrFac1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
            A1085AcuImpFac = T00FR23_A1085AcuImpFac[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
            A1133AcuImpFac1 = T00FR23_A1133AcuImpFac1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         }
         else
         {
            A1083AcuMtrEst = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
            A1135AcuMtrEst1 = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
            A1084AcuMtrFac = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
            A1136AcuMtrFac1 = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
            A1085AcuImpFac = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
            A1133AcuImpFac1 = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevelFR547( )
   {
      s1133AcuImpFac1 = O1133AcuImpFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      s1085AcuImpFac = O1085AcuImpFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      s1136AcuMtrFac1 = O1136AcuMtrFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      s1084AcuMtrFac = O1084AcuMtrFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      s1135AcuMtrEst1 = O1135AcuMtrEst1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      s1083AcuMtrEst = O1083AcuMtrEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRowFR547( ) ;
         if ( ( nRcdExists_547 != 0 ) || ( nIsMod_547 != 0 ) )
         {
            standaloneNotModalFR547( ) ;
            getKeyFR547( ) ;
            if ( ( nRcdExists_547 == 0 ) && ( nRcdDeleted_547 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertFR547( ) ;
            }
            else
            {
               if ( RcdFound547 != 0 )
               {
                  if ( ( nRcdDeleted_547 != 0 ) && ( nRcdExists_547 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteFR547( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_547 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateFR547( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_547 == 0 )
                  {
                     GXCCtl = "ESTMES_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1133AcuImpFac1 = A1133AcuImpFac1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
            O1085AcuImpFac = A1085AcuImpFac ;
            httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
            O1136AcuMtrFac1 = A1136AcuMtrFac1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
            O1084AcuMtrFac = A1084AcuMtrFac ;
            httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
            O1135AcuMtrEst1 = A1135AcuMtrEst1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
            O1083AcuMtrEst = A1083AcuMtrEst ;
            httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_547_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstMes_Internalname, GXutil.ltrim( localUtil.ntoc( A426EstMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrEst_Internalname, GXutil.ltrim( localUtil.ntoc( A1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrEst1_Internalname, GXutil.ltrim( localUtil.ntoc( A1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrFac_Internalname, GXutil.ltrim( localUtil.ntoc( A1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtrFac1_Internalname, GXutil.ltrim( localUtil.ntoc( A1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtImpFac_Internalname, GXutil.ltrim( localUtil.ntoc( A1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtImpFac1_Internalname, GXutil.ltrim( localUtil.ntoc( A1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z426EstMes_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z426EstMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1086MtrEst_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1137MtrEst1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1087MtrFac_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1138MtrFac1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1088ImpFac_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1134ImpFac1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1134ImpFac1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1088ImpFac_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1138MtrFac1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1087MtrFac_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1137MtrEst1_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1086MtrEst_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_547_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_547_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_547_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_547 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_547_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_547_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTMES_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTREST_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTREST1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrEst1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTRFAC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTRFAC1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrFac1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IMPFAC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtImpFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "IMPFAC1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtImpFac1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllFR547( ) ;
      if ( AnyError != 0 )
      {
         O1133AcuImpFac1 = s1133AcuImpFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         O1085AcuImpFac = s1085AcuImpFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         O1136AcuMtrFac1 = s1136AcuMtrFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         O1084AcuMtrFac = s1084AcuMtrFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         O1135AcuMtrEst1 = s1135AcuMtrEst1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         O1083AcuMtrEst = s1083AcuMtrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      }
      nRcdExists_547 = (short)(0) ;
      nIsMod_547 = (short)(0) ;
      nRcdDeleted_547 = (short)(0) ;
   }

   public void processLevelFR546( )
   {
      /* Save parent mode. */
      sMode546 = Gx_mode ;
      processNestedLevelFR547( ) ;
      if ( AnyError != 0 )
      {
         O1133AcuImpFac1 = s1133AcuImpFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         O1085AcuImpFac = s1085AcuImpFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         O1136AcuMtrFac1 = s1136AcuMtrFac1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         O1084AcuMtrFac = s1084AcuMtrFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         O1135AcuMtrEst1 = s1135AcuMtrEst1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         O1083AcuMtrEst = s1083AcuMtrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode546 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelFR546( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteFR546( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdibest");
         if ( AnyError == 0 )
         {
            confirmValuesFR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdibest");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartFR546( )
   {
      /* Scan By routine */
      /* Using cursor T00FR24 */
      pr_default.execute(18);
      RcdFound546 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound546 = (short)(1) ;
         A396EmprCod = T00FR24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = T00FR24_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = T00FR24_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = T00FR24_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A425EstAny = T00FR24_A425EstAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
         A3913DibSerFac = T00FR24_A3913DibSerFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextFR546( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound546 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound546 = (short)(1) ;
         A396EmprCod = T00FR24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = T00FR24_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = T00FR24_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = T00FR24_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A425EstAny = T00FR24_A425EstAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
         A3913DibSerFac = T00FR24_A3913DibSerFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
      }
   }

   public void scanEndFR546( )
   {
      pr_default.close(18);
   }

   public void afterConfirmFR546( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertFR546( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateFR546( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteFR546( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteFR546( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateFR546( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesFR546( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtEstAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstAny_Enabled), 5, 0), true);
      edtDibSerFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibSerFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibSerFac_Enabled), 5, 0), true);
      edtAcuMtrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcuMtrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcuMtrEst_Enabled), 5, 0), true);
      edtAcuMtrEst1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcuMtrEst1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcuMtrEst1_Enabled), 5, 0), true);
      edtAcuMtrFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcuMtrFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcuMtrFac_Enabled), 5, 0), true);
      edtAcuMtrFac1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcuMtrFac1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcuMtrFac1_Enabled), 5, 0), true);
      edtAcuImpFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcuImpFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcuImpFac_Enabled), 5, 0), true);
      edtAcuImpFac1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAcuImpFac1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAcuImpFac1_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmFR547( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1086MtrEst = T00FR3_A1086MtrEst[0] ;
            Z1137MtrEst1 = T00FR3_A1137MtrEst1[0] ;
            Z1087MtrFac = T00FR3_A1087MtrFac[0] ;
            Z1138MtrFac1 = T00FR3_A1138MtrFac1[0] ;
            Z1088ImpFac = T00FR3_A1088ImpFac[0] ;
            Z1134ImpFac1 = T00FR3_A1134ImpFac1[0] ;
         }
         else
         {
            Z1086MtrEst = A1086MtrEst ;
            Z1137MtrEst1 = A1137MtrEst1 ;
            Z1087MtrFac = A1087MtrFac ;
            Z1138MtrFac1 = A1138MtrFac1 ;
            Z1088ImpFac = A1088ImpFac ;
            Z1134ImpFac1 = A1134ImpFac1 ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z425EstAny = A425EstAny ;
         Z3913DibSerFac = A3913DibSerFac ;
         Z426EstMes = A426EstMes ;
         Z1086MtrEst = A1086MtrEst ;
         Z1137MtrEst1 = A1137MtrEst1 ;
         Z1087MtrFac = A1087MtrFac ;
         Z1138MtrFac1 = A1138MtrFac1 ;
         Z1088ImpFac = A1088ImpFac ;
         Z1134ImpFac1 = A1134ImpFac1 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalFR547( )
   {
   }

   public void standaloneModalFR547( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEstMes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMes_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtEstMes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMes_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void loadFR547( )
   {
      /* Using cursor T00FR25 */
      pr_default.execute(19, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound547 = (short)(1) ;
         A1086MtrEst = T00FR25_A1086MtrEst[0] ;
         n1086MtrEst = T00FR25_n1086MtrEst[0] ;
         A1137MtrEst1 = T00FR25_A1137MtrEst1[0] ;
         n1137MtrEst1 = T00FR25_n1137MtrEst1[0] ;
         A1087MtrFac = T00FR25_A1087MtrFac[0] ;
         n1087MtrFac = T00FR25_n1087MtrFac[0] ;
         A1138MtrFac1 = T00FR25_A1138MtrFac1[0] ;
         n1138MtrFac1 = T00FR25_n1138MtrFac1[0] ;
         A1088ImpFac = T00FR25_A1088ImpFac[0] ;
         n1088ImpFac = T00FR25_n1088ImpFac[0] ;
         A1134ImpFac1 = T00FR25_A1134ImpFac1[0] ;
         n1134ImpFac1 = T00FR25_n1134ImpFac1[0] ;
         zmFR547( -11) ;
      }
      pr_default.close(19);
      onLoadActionsFR547( ) ;
   }

   public void onLoadActionsFR547( )
   {
      if ( isIns( )  )
      {
         A1083AcuMtrEst = O1083AcuMtrEst.add(A1086MtrEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1083AcuMtrEst = O1083AcuMtrEst.add(A1086MtrEst).subtract(O1086MtrEst) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1083AcuMtrEst = O1083AcuMtrEst.subtract(O1086MtrEst) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A1135AcuMtrEst1 = O1135AcuMtrEst1.add(A1137MtrEst1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1135AcuMtrEst1 = O1135AcuMtrEst1.add(A1137MtrEst1).subtract(O1137MtrEst1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1135AcuMtrEst1 = O1135AcuMtrEst1.subtract(O1137MtrEst1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A1084AcuMtrFac = O1084AcuMtrFac.add(A1087MtrFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1084AcuMtrFac = O1084AcuMtrFac.add(A1087MtrFac).subtract(O1087MtrFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1084AcuMtrFac = O1084AcuMtrFac.subtract(O1087MtrFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A1136AcuMtrFac1 = O1136AcuMtrFac1.add(A1138MtrFac1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1136AcuMtrFac1 = O1136AcuMtrFac1.add(A1138MtrFac1).subtract(O1138MtrFac1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1136AcuMtrFac1 = O1136AcuMtrFac1.subtract(O1138MtrFac1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A1085AcuImpFac = O1085AcuImpFac.add(A1088ImpFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1085AcuImpFac = O1085AcuImpFac.add(A1088ImpFac).subtract(O1088ImpFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1085AcuImpFac = O1085AcuImpFac.subtract(O1088ImpFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A1133AcuImpFac1 = O1133AcuImpFac1.add(A1134ImpFac1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1133AcuImpFac1 = O1133AcuImpFac1.add(A1134ImpFac1).subtract(O1134ImpFac1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1133AcuImpFac1 = O1133AcuImpFac1.subtract(O1134ImpFac1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
            }
         }
      }
   }

   public void checkExtendedTableFR547( )
   {
      nIsDirty_547 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalFR547( ) ;
      if ( isIns( )  )
      {
         nIsDirty_547 = (short)(1) ;
         A1083AcuMtrEst = O1083AcuMtrEst.add(A1086MtrEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_547 = (short)(1) ;
            A1083AcuMtrEst = O1083AcuMtrEst.add(A1086MtrEst).subtract(O1086MtrEst) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_547 = (short)(1) ;
               A1083AcuMtrEst = O1083AcuMtrEst.subtract(O1086MtrEst) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_547 = (short)(1) ;
         A1135AcuMtrEst1 = O1135AcuMtrEst1.add(A1137MtrEst1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_547 = (short)(1) ;
            A1135AcuMtrEst1 = O1135AcuMtrEst1.add(A1137MtrEst1).subtract(O1137MtrEst1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_547 = (short)(1) ;
               A1135AcuMtrEst1 = O1135AcuMtrEst1.subtract(O1137MtrEst1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_547 = (short)(1) ;
         A1084AcuMtrFac = O1084AcuMtrFac.add(A1087MtrFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_547 = (short)(1) ;
            A1084AcuMtrFac = O1084AcuMtrFac.add(A1087MtrFac).subtract(O1087MtrFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_547 = (short)(1) ;
               A1084AcuMtrFac = O1084AcuMtrFac.subtract(O1087MtrFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_547 = (short)(1) ;
         A1136AcuMtrFac1 = O1136AcuMtrFac1.add(A1138MtrFac1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_547 = (short)(1) ;
            A1136AcuMtrFac1 = O1136AcuMtrFac1.add(A1138MtrFac1).subtract(O1138MtrFac1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_547 = (short)(1) ;
               A1136AcuMtrFac1 = O1136AcuMtrFac1.subtract(O1138MtrFac1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_547 = (short)(1) ;
         A1085AcuImpFac = O1085AcuImpFac.add(A1088ImpFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_547 = (short)(1) ;
            A1085AcuImpFac = O1085AcuImpFac.add(A1088ImpFac).subtract(O1088ImpFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_547 = (short)(1) ;
               A1085AcuImpFac = O1085AcuImpFac.subtract(O1088ImpFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_547 = (short)(1) ;
         A1133AcuImpFac1 = O1133AcuImpFac1.add(A1134ImpFac1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_547 = (short)(1) ;
            A1133AcuImpFac1 = O1133AcuImpFac1.add(A1134ImpFac1).subtract(O1134ImpFac1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_547 = (short)(1) ;
               A1133AcuImpFac1 = O1133AcuImpFac1.subtract(O1134ImpFac1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursorsFR547( )
   {
   }

   public void enableDisableFR547( )
   {
   }

   public void getKeyFR547( )
   {
      /* Using cursor T00FR26 */
      pr_default.execute(20, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound547 = (short)(1) ;
      }
      else
      {
         RcdFound547 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKeyFR547( )
   {
      /* Using cursor T00FR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmFR547( 11) ;
         RcdFound547 = (short)(1) ;
         initializeNonKeyFR547( ) ;
         A426EstMes = T00FR3_A426EstMes[0] ;
         A1086MtrEst = T00FR3_A1086MtrEst[0] ;
         n1086MtrEst = T00FR3_n1086MtrEst[0] ;
         A1137MtrEst1 = T00FR3_A1137MtrEst1[0] ;
         n1137MtrEst1 = T00FR3_n1137MtrEst1[0] ;
         A1087MtrFac = T00FR3_A1087MtrFac[0] ;
         n1087MtrFac = T00FR3_n1087MtrFac[0] ;
         A1138MtrFac1 = T00FR3_A1138MtrFac1[0] ;
         n1138MtrFac1 = T00FR3_n1138MtrFac1[0] ;
         A1088ImpFac = T00FR3_A1088ImpFac[0] ;
         n1088ImpFac = T00FR3_n1088ImpFac[0] ;
         A1134ImpFac1 = T00FR3_A1134ImpFac1[0] ;
         n1134ImpFac1 = T00FR3_n1134ImpFac1[0] ;
         O1134ImpFac1 = A1134ImpFac1 ;
         n1134ImpFac1 = false ;
         O1088ImpFac = A1088ImpFac ;
         n1088ImpFac = false ;
         O1138MtrFac1 = A1138MtrFac1 ;
         n1138MtrFac1 = false ;
         O1087MtrFac = A1087MtrFac ;
         n1087MtrFac = false ;
         O1137MtrEst1 = A1137MtrEst1 ;
         n1137MtrEst1 = false ;
         O1086MtrEst = A1086MtrEst ;
         n1086MtrEst = false ;
         Z396EmprCod = A396EmprCod ;
         Z1013DibCli = A1013DibCli ;
         Z252CliCod = A252CliCod ;
         Z1014DibInt = A1014DibInt ;
         Z425EstAny = A425EstAny ;
         Z3913DibSerFac = A3913DibSerFac ;
         Z426EstMes = A426EstMes ;
         sMode547 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFR547( ) ;
         loadFR547( ) ;
         Gx_mode = sMode547 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound547 = (short)(0) ;
         initializeNonKeyFR547( ) ;
         sMode547 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFR547( ) ;
         Gx_mode = sMode547 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesFR547( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyFR547( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00FR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLESTDI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1086MtrEst, T00FR2_A1086MtrEst[0]) != 0 ) || ( DecimalUtil.compareTo(Z1137MtrEst1, T00FR2_A1137MtrEst1[0]) != 0 ) || ( DecimalUtil.compareTo(Z1087MtrFac, T00FR2_A1087MtrFac[0]) != 0 ) || ( DecimalUtil.compareTo(Z1138MtrFac1, T00FR2_A1138MtrFac1[0]) != 0 ) || ( DecimalUtil.compareTo(Z1088ImpFac, T00FR2_A1088ImpFac[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1134ImpFac1, T00FR2_A1134ImpFac1[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1086MtrEst, T00FR2_A1086MtrEst[0]) != 0 )
            {
               GXutil.writeLogln("tdibest:[seudo value changed for attri]"+"MtrEst");
               GXutil.writeLogRaw("Old: ",Z1086MtrEst);
               GXutil.writeLogRaw("Current: ",T00FR2_A1086MtrEst[0]);
            }
            if ( DecimalUtil.compareTo(Z1137MtrEst1, T00FR2_A1137MtrEst1[0]) != 0 )
            {
               GXutil.writeLogln("tdibest:[seudo value changed for attri]"+"MtrEst1");
               GXutil.writeLogRaw("Old: ",Z1137MtrEst1);
               GXutil.writeLogRaw("Current: ",T00FR2_A1137MtrEst1[0]);
            }
            if ( DecimalUtil.compareTo(Z1087MtrFac, T00FR2_A1087MtrFac[0]) != 0 )
            {
               GXutil.writeLogln("tdibest:[seudo value changed for attri]"+"MtrFac");
               GXutil.writeLogRaw("Old: ",Z1087MtrFac);
               GXutil.writeLogRaw("Current: ",T00FR2_A1087MtrFac[0]);
            }
            if ( DecimalUtil.compareTo(Z1138MtrFac1, T00FR2_A1138MtrFac1[0]) != 0 )
            {
               GXutil.writeLogln("tdibest:[seudo value changed for attri]"+"MtrFac1");
               GXutil.writeLogRaw("Old: ",Z1138MtrFac1);
               GXutil.writeLogRaw("Current: ",T00FR2_A1138MtrFac1[0]);
            }
            if ( DecimalUtil.compareTo(Z1088ImpFac, T00FR2_A1088ImpFac[0]) != 0 )
            {
               GXutil.writeLogln("tdibest:[seudo value changed for attri]"+"ImpFac");
               GXutil.writeLogRaw("Old: ",Z1088ImpFac);
               GXutil.writeLogRaw("Current: ",T00FR2_A1088ImpFac[0]);
            }
            if ( DecimalUtil.compareTo(Z1134ImpFac1, T00FR2_A1134ImpFac1[0]) != 0 )
            {
               GXutil.writeLogln("tdibest:[seudo value changed for attri]"+"ImpFac1");
               GXutil.writeLogRaw("Old: ",Z1134ImpFac1);
               GXutil.writeLogRaw("Current: ",T00FR2_A1134ImpFac1[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLESTDI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertFR547( )
   {
      beforeValidateFR547( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFR547( ) ;
      }
      if ( AnyError == 0 )
      {
         zmFR547( 0) ;
         checkOptimisticConcurrencyFR547( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFR547( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertFR547( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FR27 */
                  pr_default.execute(21, new Object[] {A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes), Boolean.valueOf(n1086MtrEst), A1086MtrEst, Boolean.valueOf(n1137MtrEst1), A1137MtrEst1, Boolean.valueOf(n1087MtrFac), A1087MtrFac, Boolean.valueOf(n1138MtrFac1), A1138MtrFac1, Boolean.valueOf(n1088ImpFac), A1088ImpFac, Boolean.valueOf(n1134ImpFac1), A1134ImpFac1, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESTDI");
                  if ( (pr_default.getStatus(21) == 1) )
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
            loadFR547( ) ;
         }
         endLevelFR547( ) ;
      }
      closeExtendedTableCursorsFR547( ) ;
   }

   public void updateFR547( )
   {
      beforeValidateFR547( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFR547( ) ;
      }
      if ( ( nIsMod_547 != 0 ) || ( nIsDirty_547 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyFR547( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmFR547( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateFR547( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00FR28 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n1086MtrEst), A1086MtrEst, Boolean.valueOf(n1137MtrEst1), A1137MtrEst1, Boolean.valueOf(n1087MtrFac), A1087MtrFac, Boolean.valueOf(n1138MtrFac1), A1138MtrFac1, Boolean.valueOf(n1088ImpFac), A1088ImpFac, Boolean.valueOf(n1134ImpFac1), A1134ImpFac1, A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESTDI");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLESTDI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateFR547( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyFR547( ) ;
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
            endLevelFR547( ) ;
         }
      }
      closeExtendedTableCursorsFR547( ) ;
   }

   public void deferredUpdateFR547( )
   {
   }

   public void deleteFR547( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateFR547( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFR547( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsFR547( ) ;
         afterConfirmFR547( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteFR547( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00FR29 */
               pr_default.execute(23, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESTDI");
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
      sMode547 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelFR547( ) ;
      Gx_mode = sMode547 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsFR547( )
   {
      standaloneModalFR547( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A1083AcuMtrEst = O1083AcuMtrEst.add(A1086MtrEst) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1083AcuMtrEst = O1083AcuMtrEst.add(A1086MtrEst).subtract(O1086MtrEst) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1083AcuMtrEst = O1083AcuMtrEst.subtract(O1086MtrEst) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A1135AcuMtrEst1 = O1135AcuMtrEst1.add(A1137MtrEst1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1135AcuMtrEst1 = O1135AcuMtrEst1.add(A1137MtrEst1).subtract(O1137MtrEst1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1135AcuMtrEst1 = O1135AcuMtrEst1.subtract(O1137MtrEst1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A1084AcuMtrFac = O1084AcuMtrFac.add(A1087MtrFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1084AcuMtrFac = O1084AcuMtrFac.add(A1087MtrFac).subtract(O1087MtrFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1084AcuMtrFac = O1084AcuMtrFac.subtract(O1087MtrFac) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A1136AcuMtrFac1 = O1136AcuMtrFac1.add(A1138MtrFac1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1136AcuMtrFac1 = O1136AcuMtrFac1.add(A1138MtrFac1).subtract(O1138MtrFac1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1136AcuMtrFac1 = O1136AcuMtrFac1.subtract(O1138MtrFac1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A1085AcuImpFac = O1085AcuImpFac.add(A1088ImpFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1085AcuImpFac = O1085AcuImpFac.add(A1088ImpFac).subtract(O1088ImpFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1085AcuImpFac = O1085AcuImpFac.subtract(O1088ImpFac) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A1133AcuImpFac1 = O1133AcuImpFac1.add(A1134ImpFac1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1133AcuImpFac1 = O1133AcuImpFac1.add(A1134ImpFac1).subtract(O1134ImpFac1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1133AcuImpFac1 = O1133AcuImpFac1.subtract(O1134ImpFac1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
               }
            }
         }
      }
   }

   public void endLevelFR547( )
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

   public void scanStartFR547( )
   {
      /* Scan By routine */
      /* Using cursor T00FR30 */
      pr_default.execute(24, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
      RcdFound547 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound547 = (short)(1) ;
         A426EstMes = T00FR30_A426EstMes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextFR547( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound547 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound547 = (short)(1) ;
         A426EstMes = T00FR30_A426EstMes[0] ;
      }
   }

   public void scanEndFR547( )
   {
      pr_default.close(24);
   }

   public void afterConfirmFR547( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertFR547( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateFR547( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteFR547( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteFR547( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateFR547( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesFR547( )
   {
      edtEstMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMes_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtMtrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrEst_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtMtrEst1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrEst1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrEst1_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtMtrFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrFac_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtMtrFac1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrFac1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrFac1_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtImpFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpFac_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtImpFac1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImpFac1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImpFac1_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void send_integrity_lvl_hashesFR547( )
   {
   }

   public void send_integrity_lvl_hashesFR546( )
   {
   }

   public void subsflControlProps_85547( )
   {
      edtavnRcdDeleted_547_Internalname = "vNRCDDELETED_547_"+sGXsfl_85_idx ;
      edtEstMes_Internalname = "ESTMES_"+sGXsfl_85_idx ;
      edtMtrEst_Internalname = "MTREST_"+sGXsfl_85_idx ;
      edtMtrEst1_Internalname = "MTREST1_"+sGXsfl_85_idx ;
      edtMtrFac_Internalname = "MTRFAC_"+sGXsfl_85_idx ;
      edtMtrFac1_Internalname = "MTRFAC1_"+sGXsfl_85_idx ;
      edtImpFac_Internalname = "IMPFAC_"+sGXsfl_85_idx ;
      edtImpFac1_Internalname = "IMPFAC1_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_85547( )
   {
      edtavnRcdDeleted_547_Internalname = "vNRCDDELETED_547_"+sGXsfl_85_fel_idx ;
      edtEstMes_Internalname = "ESTMES_"+sGXsfl_85_fel_idx ;
      edtMtrEst_Internalname = "MTREST_"+sGXsfl_85_fel_idx ;
      edtMtrEst1_Internalname = "MTREST1_"+sGXsfl_85_fel_idx ;
      edtMtrFac_Internalname = "MTRFAC_"+sGXsfl_85_fel_idx ;
      edtMtrFac1_Internalname = "MTRFAC1_"+sGXsfl_85_fel_idx ;
      edtImpFac_Internalname = "IMPFAC_"+sGXsfl_85_fel_idx ;
      edtImpFac1_Internalname = "IMPFAC1_"+sGXsfl_85_fel_idx ;
   }

   public void addRowFR547( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85547( ) ;
      sendRowFR547( ) ;
   }

   public void sendRowFR547( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_547_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_547_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_547_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_547), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_547), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_547_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_547_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_547_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstMes_Internalname,GXutil.ltrim( localUtil.ntoc( A426EstMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A426EstMes), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstMes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstMes_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_547_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrEst_Internalname,GXutil.ltrim( localUtil.ntoc( A1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtrEst_Enabled!=0) ? localUtil.format( A1086MtrEst, "ZZZZZ9.99") : localUtil.format( A1086MtrEst, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtrEst_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_547_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrEst1_Internalname,GXutil.ltrim( localUtil.ntoc( A1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtrEst1_Enabled!=0) ? localUtil.format( A1137MtrEst1, "ZZZZZ9.99") : localUtil.format( A1137MtrEst1, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtrEst1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtrEst1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_547_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrFac_Internalname,GXutil.ltrim( localUtil.ntoc( A1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtrFac_Enabled!=0) ? localUtil.format( A1087MtrFac, "ZZZZZ9.99") : localUtil.format( A1087MtrFac, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtrFac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtrFac_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_547_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtrFac1_Internalname,GXutil.ltrim( localUtil.ntoc( A1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtrFac1_Enabled!=0) ? localUtil.format( A1138MtrFac1, "ZZZZZ9.99") : localUtil.format( A1138MtrFac1, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtrFac1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtrFac1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_547_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtImpFac_Internalname,GXutil.ltrim( localUtil.ntoc( A1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtImpFac_Enabled!=0) ? localUtil.format( A1088ImpFac, "ZZZZZZZ9.99") : localUtil.format( A1088ImpFac, "ZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtImpFac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtImpFac_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_547_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtImpFac1_Internalname,GXutil.ltrim( localUtil.ntoc( A1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtImpFac1_Enabled!=0) ? localUtil.format( A1134ImpFac1, "ZZZZZZZ9.99") : localUtil.format( A1134ImpFac1, "ZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtImpFac1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtImpFac1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesFR547( ) ;
      GXCCtl = "Z426EstMes_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z426EstMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1086MtrEst_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1137MtrEst1_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1087MtrFac_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1138MtrFac1_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1088ImpFac_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1134ImpFac1_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1134ImpFac1_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1134ImpFac1, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1088ImpFac_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1088ImpFac, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1138MtrFac1_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1138MtrFac1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1087MtrFac_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1087MtrFac, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1137MtrEst1_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1137MtrEst1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1086MtrEst_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1086MtrEst, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_547_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_547_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_547_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_547, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_547_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_547_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTMES_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTREST_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTREST1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrEst1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTRFAC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTRFAC1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrFac1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IMPFAC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtImpFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IMPFAC1_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtImpFac1_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowFR547( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85547( ) ;
      edtavnRcdDeleted_547_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_547_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTMES_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtrEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTREST_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtrEst1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTREST1_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtrFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTRFAC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtrFac1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTRFAC1_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtImpFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IMPFAC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtImpFac1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "IMPFAC1_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_547_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_547_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_547");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_547_Internalname ;
         wbErr = true ;
         nRcdDeleted_547 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_547 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_547_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ESTMES_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstMes_Internalname ;
         wbErr = true ;
         A426EstMes = (byte)(0) ;
      }
      else
      {
         A426EstMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMtrEst_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMtrEst_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MTREST_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtrEst_Internalname ;
         wbErr = true ;
         A1086MtrEst = DecimalUtil.ZERO ;
         n1086MtrEst = false ;
      }
      else
      {
         A1086MtrEst = localUtil.ctond( httpContext.cgiGet( edtMtrEst_Internalname)) ;
         n1086MtrEst = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMtrEst1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMtrEst1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MTREST1_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtrEst1_Internalname ;
         wbErr = true ;
         A1137MtrEst1 = DecimalUtil.ZERO ;
         n1137MtrEst1 = false ;
      }
      else
      {
         A1137MtrEst1 = localUtil.ctond( httpContext.cgiGet( edtMtrEst1_Internalname)) ;
         n1137MtrEst1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMtrFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMtrFac_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MTRFAC_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtrFac_Internalname ;
         wbErr = true ;
         A1087MtrFac = DecimalUtil.ZERO ;
         n1087MtrFac = false ;
      }
      else
      {
         A1087MtrFac = localUtil.ctond( httpContext.cgiGet( edtMtrFac_Internalname)) ;
         n1087MtrFac = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMtrFac1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMtrFac1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MTRFAC1_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtrFac1_Internalname ;
         wbErr = true ;
         A1138MtrFac1 = DecimalUtil.ZERO ;
         n1138MtrFac1 = false ;
      }
      else
      {
         A1138MtrFac1 = localUtil.ctond( httpContext.cgiGet( edtMtrFac1_Internalname)) ;
         n1138MtrFac1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtImpFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtImpFac_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
      {
         GXCCtl = "IMPFAC_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtImpFac_Internalname ;
         wbErr = true ;
         A1088ImpFac = DecimalUtil.ZERO ;
         n1088ImpFac = false ;
      }
      else
      {
         A1088ImpFac = localUtil.ctond( httpContext.cgiGet( edtImpFac_Internalname)) ;
         n1088ImpFac = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtImpFac1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtImpFac1_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
      {
         GXCCtl = "IMPFAC1_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtImpFac1_Internalname ;
         wbErr = true ;
         A1134ImpFac1 = DecimalUtil.ZERO ;
         n1134ImpFac1 = false ;
      }
      else
      {
         A1134ImpFac1 = localUtil.ctond( httpContext.cgiGet( edtImpFac1_Internalname)) ;
         n1134ImpFac1 = false ;
      }
      GXCCtl = "Z426EstMes_" + sGXsfl_85_idx ;
      Z426EstMes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1086MtrEst_" + sGXsfl_85_idx ;
      Z1086MtrEst = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1137MtrEst1_" + sGXsfl_85_idx ;
      Z1137MtrEst1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1087MtrFac_" + sGXsfl_85_idx ;
      Z1087MtrFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1138MtrFac1_" + sGXsfl_85_idx ;
      Z1138MtrFac1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1088ImpFac_" + sGXsfl_85_idx ;
      Z1088ImpFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1134ImpFac1_" + sGXsfl_85_idx ;
      Z1134ImpFac1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1134ImpFac1_" + sGXsfl_85_idx ;
      O1134ImpFac1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1088ImpFac_" + sGXsfl_85_idx ;
      O1088ImpFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1138MtrFac1_" + sGXsfl_85_idx ;
      O1138MtrFac1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1087MtrFac_" + sGXsfl_85_idx ;
      O1087MtrFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1137MtrEst1_" + sGXsfl_85_idx ;
      O1137MtrEst1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1086MtrEst_" + sGXsfl_85_idx ;
      O1086MtrEst = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_547_" + sGXsfl_85_idx ;
      nRcdDeleted_547 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_547_" + sGXsfl_85_idx ;
      nRcdExists_547 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_547_" + sGXsfl_85_idx ;
      nIsMod_547 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEstMes_Enabled = edtEstMes_Enabled ;
   }

   public void confirmValuesFR0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_85547( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_85547( ) ;
         httpContext.changePostValue( "Z426EstMes_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z426EstMes_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z426EstMes_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1086MtrEst_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1086MtrEst_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1086MtrEst_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1137MtrEst1_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1137MtrEst1_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1137MtrEst1_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1087MtrFac_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1087MtrFac_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1087MtrFac_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1138MtrFac1_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1138MtrFac1_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1138MtrFac1_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1088ImpFac_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1088ImpFac_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1088ImpFac_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z1134ImpFac1_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z1134ImpFac1_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1134ImpFac1_"+sGXsfl_85_idx) ;
      }
      httpContext.changePostValue( "O1134ImpFac1", httpContext.cgiGet( "T1134ImpFac1")) ;
      httpContext.deletePostValue( "T1134ImpFac1") ;
      httpContext.changePostValue( "O1088ImpFac", httpContext.cgiGet( "T1088ImpFac")) ;
      httpContext.deletePostValue( "T1088ImpFac") ;
      httpContext.changePostValue( "O1138MtrFac1", httpContext.cgiGet( "T1138MtrFac1")) ;
      httpContext.deletePostValue( "T1138MtrFac1") ;
      httpContext.changePostValue( "O1087MtrFac", httpContext.cgiGet( "T1087MtrFac")) ;
      httpContext.deletePostValue( "T1087MtrFac") ;
      httpContext.changePostValue( "O1137MtrEst1", httpContext.cgiGet( "T1137MtrEst1")) ;
      httpContext.deletePostValue( "T1137MtrEst1") ;
      httpContext.changePostValue( "O1086MtrEst", httpContext.cgiGet( "T1086MtrEst")) ;
      httpContext.deletePostValue( "T1086MtrEst") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdibest", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z425EstAny", GXutil.ltrim( localUtil.ntoc( Z425EstAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3913DibSerFac", GXutil.rtrim( Z3913DibSerFac));
      app.GxWebStd.gx_hidden_field( httpContext, "O1133AcuImpFac1", GXutil.ltrim( localUtil.ntoc( O1133AcuImpFac1, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1085AcuImpFac", GXutil.ltrim( localUtil.ntoc( O1085AcuImpFac, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1136AcuMtrFac1", GXutil.ltrim( localUtil.ntoc( O1136AcuMtrFac1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1084AcuMtrFac", GXutil.ltrim( localUtil.ntoc( O1084AcuMtrFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1135AcuMtrEst1", GXutil.ltrim( localUtil.ntoc( O1135AcuMtrEst1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1083AcuMtrEst", GXutil.ltrim( localUtil.ntoc( O1083AcuMtrEst, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdibest", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDIBEST" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ESTADISTICAS DE DIBUJOS", "") ;
   }

   public void initializeNonKeyFR546( )
   {
      A1083AcuMtrEst = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
      A1135AcuMtrEst1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      A1084AcuMtrFac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      A1136AcuMtrFac1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      A1085AcuImpFac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      A1133AcuImpFac1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      O1133AcuImpFac1 = A1133AcuImpFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      O1085AcuImpFac = A1085AcuImpFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
      O1136AcuMtrFac1 = A1136AcuMtrFac1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
      O1084AcuMtrFac = A1084AcuMtrFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
      O1135AcuMtrEst1 = A1135AcuMtrEst1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
      O1083AcuMtrEst = A1083AcuMtrEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
   }

   public void initAllFR546( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1013DibCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1014DibInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      A425EstAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A425EstAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A425EstAny), 4, 0));
      A3913DibSerFac = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3913DibSerFac", A3913DibSerFac);
      initializeNonKeyFR546( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyFR547( )
   {
      A1086MtrEst = DecimalUtil.ZERO ;
      n1086MtrEst = false ;
      A1137MtrEst1 = DecimalUtil.ZERO ;
      n1137MtrEst1 = false ;
      A1087MtrFac = DecimalUtil.ZERO ;
      n1087MtrFac = false ;
      A1138MtrFac1 = DecimalUtil.ZERO ;
      n1138MtrFac1 = false ;
      A1088ImpFac = DecimalUtil.ZERO ;
      n1088ImpFac = false ;
      A1134ImpFac1 = DecimalUtil.ZERO ;
      n1134ImpFac1 = false ;
      O1134ImpFac1 = A1134ImpFac1 ;
      n1134ImpFac1 = false ;
      O1088ImpFac = A1088ImpFac ;
      n1088ImpFac = false ;
      O1138MtrFac1 = A1138MtrFac1 ;
      n1138MtrFac1 = false ;
      O1087MtrFac = A1087MtrFac ;
      n1087MtrFac = false ;
      O1137MtrEst1 = A1137MtrEst1 ;
      n1137MtrEst1 = false ;
      O1086MtrEst = A1086MtrEst ;
      n1086MtrEst = false ;
      Z1086MtrEst = DecimalUtil.ZERO ;
      Z1137MtrEst1 = DecimalUtil.ZERO ;
      Z1087MtrFac = DecimalUtil.ZERO ;
      Z1138MtrFac1 = DecimalUtil.ZERO ;
      Z1088ImpFac = DecimalUtil.ZERO ;
      Z1134ImpFac1 = DecimalUtil.ZERO ;
   }

   public void initAllFR547( )
   {
      A426EstMes = (byte)(0) ;
      initializeNonKeyFR547( ) ;
   }

   public void standaloneModalInsertFR547( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241515241", true, true);
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
      httpContext.AddJavascriptSource("tdibest.js", "?20268241515241", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties547( )
   {
      edtEstMes_Enabled = defedtEstMes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMes_Enabled), 5, 0), !bGXsfl_85_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_547, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_547_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A426EstMes, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1086MtrEst, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1137MtrEst1, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrEst1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1087MtrFac, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1138MtrFac1, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtrFac1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1088ImpFac, (byte)(11), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtImpFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1134ImpFac1, (byte)(11), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtImpFac1_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDibInt_Internalname = "DIBINT" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEstAny_Internalname = "ESTANY" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDibSerFac_Internalname = "DIBSERFAC" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAcuMtrEst_Internalname = "ACUMTREST" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAcuMtrEst1_Internalname = "ACUMTREST1" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAcuMtrFac_Internalname = "ACUMTRFAC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAcuMtrFac1_Internalname = "ACUMTRFAC1" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAcuImpFac_Internalname = "ACUIMPFAC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAcuImpFac1_Internalname = "ACUIMPFAC1" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_547_Internalname = "vNRCDDELETED_547" ;
      edtEstMes_Internalname = "ESTMES" ;
      edtMtrEst_Internalname = "MTREST" ;
      edtMtrEst1_Internalname = "MTREST1" ;
      edtMtrFac_Internalname = "MTRFAC" ;
      edtMtrFac1_Internalname = "MTRFAC1" ;
      edtImpFac_Internalname = "IMPFAC" ;
      edtImpFac1_Internalname = "IMPFAC1" ;
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
      Form.setCaption( httpContext.getMessage( "ESTADISTICAS DE DIBUJOS", "") );
      edtImpFac1_Jsonclick = "" ;
      edtImpFac_Jsonclick = "" ;
      edtMtrFac1_Jsonclick = "" ;
      edtMtrFac_Jsonclick = "" ;
      edtMtrEst1_Jsonclick = "" ;
      edtMtrEst_Jsonclick = "" ;
      edtEstMes_Jsonclick = "" ;
      edtavnRcdDeleted_547_Jsonclick = "" ;
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
      edtImpFac1_Enabled = 1 ;
      edtImpFac_Enabled = 1 ;
      edtMtrFac1_Enabled = 1 ;
      edtMtrFac_Enabled = 1 ;
      edtMtrEst1_Enabled = 1 ;
      edtMtrEst_Enabled = 1 ;
      edtEstMes_Enabled = 1 ;
      edtavnRcdDeleted_547_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtAcuImpFac1_Jsonclick = "" ;
      edtAcuImpFac1_Backcolor = (int)(0xFFFFFF) ;
      edtAcuImpFac1_Enabled = 0 ;
      edtAcuImpFac_Jsonclick = "" ;
      edtAcuImpFac_Backcolor = (int)(0xFFFFFF) ;
      edtAcuImpFac_Enabled = 0 ;
      edtAcuMtrFac1_Jsonclick = "" ;
      edtAcuMtrFac1_Backcolor = (int)(0xFFFFFF) ;
      edtAcuMtrFac1_Enabled = 0 ;
      edtAcuMtrFac_Jsonclick = "" ;
      edtAcuMtrFac_Backcolor = (int)(0xFFFFFF) ;
      edtAcuMtrFac_Enabled = 0 ;
      edtAcuMtrEst1_Jsonclick = "" ;
      edtAcuMtrEst1_Backcolor = (int)(0xFFFFFF) ;
      edtAcuMtrEst1_Enabled = 0 ;
      edtAcuMtrEst_Jsonclick = "" ;
      edtAcuMtrEst_Backcolor = (int)(0xFFFFFF) ;
      edtAcuMtrEst_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDibSerFac_Jsonclick = "" ;
      edtDibSerFac_Backcolor = (int)(0xFFFFFF) ;
      edtDibSerFac_Enabled = 1 ;
      edtEstAny_Jsonclick = "" ;
      edtEstAny_Backcolor = (int)(0xFFFFFF) ;
      edtEstAny_Enabled = 1 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 1 ;
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
      subsflControlProps_85547( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalFR547( ) ;
         standaloneModalFR547( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowFR547( ) ;
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_85547( ) ;
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
      /* Using cursor T00FR21 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00FR21_A407EmprNom[0] ;
      n407EmprNom = T00FR21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(16);
      /* Using cursor T00FR31 */
      pr_default.execute(25, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(25);
      /* Using cursor T00FR23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A1083AcuMtrEst = T00FR23_A1083AcuMtrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         A1135AcuMtrEst1 = T00FR23_A1135AcuMtrEst1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1084AcuMtrFac = T00FR23_A1084AcuMtrFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1136AcuMtrFac1 = T00FR23_A1136AcuMtrFac1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1085AcuImpFac = T00FR23_A1085AcuImpFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1133AcuImpFac1 = T00FR23_A1133AcuImpFac1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      }
      else
      {
         A1083AcuMtrEst = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrimstr( A1083AcuMtrEst, 10, 2));
         A1135AcuMtrEst1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrimstr( A1135AcuMtrEst1, 10, 2));
         A1084AcuMtrFac = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrimstr( A1084AcuMtrFac, 10, 2));
         A1136AcuMtrFac1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrimstr( A1136AcuMtrFac1, 10, 2));
         A1085AcuImpFac = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrimstr( A1085AcuImpFac, 12, 2));
         A1133AcuImpFac1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrimstr( A1133AcuImpFac1, 12, 2));
      }
      pr_default.close(17);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T00FR21 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00FR21_A407EmprNom[0] ;
      n407EmprNom = T00FR21_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Dibint( )
   {
      /* Using cursor T00FR31 */
      pr_default.execute(25, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Dibserfac( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00FR23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A1083AcuMtrEst = T00FR23_A1083AcuMtrEst[0] ;
         A1135AcuMtrEst1 = T00FR23_A1135AcuMtrEst1[0] ;
         A1084AcuMtrFac = T00FR23_A1084AcuMtrFac[0] ;
         A1136AcuMtrFac1 = T00FR23_A1136AcuMtrFac1[0] ;
         A1085AcuImpFac = T00FR23_A1085AcuImpFac[0] ;
         A1133AcuImpFac1 = T00FR23_A1133AcuImpFac1[0] ;
      }
      else
      {
         A1083AcuMtrEst = DecimalUtil.doubleToDec(0) ;
         A1135AcuMtrEst1 = DecimalUtil.doubleToDec(0) ;
         A1084AcuMtrFac = DecimalUtil.doubleToDec(0) ;
         A1136AcuMtrFac1 = DecimalUtil.doubleToDec(0) ;
         A1085AcuImpFac = DecimalUtil.doubleToDec(0) ;
         A1133AcuImpFac1 = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1083AcuMtrEst", GXutil.ltrim( localUtil.ntoc( A1083AcuMtrEst, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1135AcuMtrEst1", GXutil.ltrim( localUtil.ntoc( A1135AcuMtrEst1, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1084AcuMtrFac", GXutil.ltrim( localUtil.ntoc( A1084AcuMtrFac, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1136AcuMtrFac1", GXutil.ltrim( localUtil.ntoc( A1136AcuMtrFac1, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1085AcuImpFac", GXutil.ltrim( localUtil.ntoc( A1085AcuImpFac, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1133AcuImpFac1", GXutil.ltrim( localUtil.ntoc( A1133AcuImpFac1, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z425EstAny", GXutil.ltrim( localUtil.ntoc( Z425EstAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3913DibSerFac", GXutil.rtrim( Z3913DibSerFac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1083AcuMtrEst", GXutil.ltrim( localUtil.ntoc( Z1083AcuMtrEst, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1135AcuMtrEst1", GXutil.ltrim( localUtil.ntoc( Z1135AcuMtrEst1, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1084AcuMtrFac", GXutil.ltrim( localUtil.ntoc( Z1084AcuMtrFac, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1136AcuMtrFac1", GXutil.ltrim( localUtil.ntoc( Z1136AcuMtrFac1, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1085AcuImpFac", GXutil.ltrim( localUtil.ntoc( Z1085AcuImpFac, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1133AcuImpFac1", GXutil.ltrim( localUtil.ntoc( Z1133AcuImpFac1, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1133AcuImpFac1", GXutil.ltrim( localUtil.ntoc( O1133AcuImpFac1, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1085AcuImpFac", GXutil.ltrim( localUtil.ntoc( O1085AcuImpFac, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1136AcuMtrFac1", GXutil.ltrim( localUtil.ntoc( O1136AcuMtrFac1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1084AcuMtrFac", GXutil.ltrim( localUtil.ntoc( O1084AcuMtrFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1135AcuMtrEst1", GXutil.ltrim( localUtil.ntoc( O1135AcuMtrEst1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1083AcuMtrEst", GXutil.ltrim( localUtil.ntoc( O1083AcuMtrEst, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_DIBINT",",oparms:[]}");
      setEventMetadata("VALID_ESTANY","{handler:'valid_Estany',iparms:[]");
      setEventMetadata("VALID_ESTANY",",oparms:[]}");
      setEventMetadata("VALID_DIBSERFAC","{handler:'valid_Dibserfac',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A425EstAny',fld:'ESTANY',pic:'ZZZ9'},{av:'A3913DibSerFac',fld:'DIBSERFAC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DIBSERFAC",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1083AcuMtrEst',fld:'ACUMTREST',pic:'ZZZZZZ9.99'},{av:'A1135AcuMtrEst1',fld:'ACUMTREST1',pic:'ZZZZZZ9.99'},{av:'A1084AcuMtrFac',fld:'ACUMTRFAC',pic:'ZZZZZZ9.99'},{av:'A1136AcuMtrFac1',fld:'ACUMTRFAC1',pic:'ZZZZZZ9.99'},{av:'A1085AcuImpFac',fld:'ACUIMPFAC',pic:'ZZZZZZZZ9.99'},{av:'A1133AcuImpFac1',fld:'ACUIMPFAC1',pic:'ZZZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1013DibCli'},{av:'Z252CliCod'},{av:'Z1014DibInt'},{av:'Z425EstAny'},{av:'Z3913DibSerFac'},{av:'Z407EmprNom'},{av:'Z1083AcuMtrEst'},{av:'Z1135AcuMtrEst1'},{av:'Z1084AcuMtrFac'},{av:'Z1136AcuMtrFac1'},{av:'Z1085AcuImpFac'},{av:'Z1133AcuImpFac1'},{av:'O1133AcuImpFac1'},{av:'O1085AcuImpFac'},{av:'O1136AcuMtrFac1'},{av:'O1084AcuMtrFac'},{av:'O1135AcuMtrEst1'},{av:'O1083AcuMtrEst'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESTMES","{handler:'valid_Estmes',iparms:[]");
      setEventMetadata("VALID_ESTMES",",oparms:[]}");
      setEventMetadata("VALID_MTREST","{handler:'valid_Mtrest',iparms:[]");
      setEventMetadata("VALID_MTREST",",oparms:[]}");
      setEventMetadata("VALID_MTREST1","{handler:'valid_Mtrest1',iparms:[]");
      setEventMetadata("VALID_MTREST1",",oparms:[]}");
      setEventMetadata("VALID_MTRFAC","{handler:'valid_Mtrfac',iparms:[]");
      setEventMetadata("VALID_MTRFAC",",oparms:[]}");
      setEventMetadata("VALID_MTRFAC1","{handler:'valid_Mtrfac1',iparms:[]");
      setEventMetadata("VALID_MTRFAC1",",oparms:[]}");
      setEventMetadata("VALID_IMPFAC","{handler:'valid_Impfac',iparms:[]");
      setEventMetadata("VALID_IMPFAC",",oparms:[]}");
      setEventMetadata("VALID_IMPFAC1","{handler:'valid_Impfac1',iparms:[]");
      setEventMetadata("VALID_IMPFAC1",",oparms:[]}");
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
      pr_default.close(16);
      pr_default.close(25);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z1013DibCli = "" ;
      Z3913DibSerFac = "" ;
      O1133AcuImpFac1 = DecimalUtil.ZERO ;
      O1085AcuImpFac = DecimalUtil.ZERO ;
      O1136AcuMtrFac1 = DecimalUtil.ZERO ;
      O1084AcuMtrFac = DecimalUtil.ZERO ;
      O1135AcuMtrEst1 = DecimalUtil.ZERO ;
      O1083AcuMtrEst = DecimalUtil.ZERO ;
      Z1086MtrEst = DecimalUtil.ZERO ;
      Z1137MtrEst1 = DecimalUtil.ZERO ;
      Z1087MtrFac = DecimalUtil.ZERO ;
      Z1138MtrFac1 = DecimalUtil.ZERO ;
      Z1088ImpFac = DecimalUtil.ZERO ;
      Z1134ImpFac1 = DecimalUtil.ZERO ;
      O1134ImpFac1 = DecimalUtil.ZERO ;
      O1088ImpFac = DecimalUtil.ZERO ;
      O1138MtrFac1 = DecimalUtil.ZERO ;
      O1087MtrFac = DecimalUtil.ZERO ;
      O1137MtrEst1 = DecimalUtil.ZERO ;
      O1086MtrEst = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1013DibCli = "" ;
      A3913DibSerFac = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1083AcuMtrEst = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A1135AcuMtrEst1 = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A1084AcuMtrFac = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A1136AcuMtrFac1 = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A1085AcuImpFac = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A1133AcuImpFac1 = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B1133AcuImpFac1 = DecimalUtil.ZERO ;
      B1085AcuImpFac = DecimalUtil.ZERO ;
      B1136AcuMtrFac1 = DecimalUtil.ZERO ;
      B1084AcuMtrFac = DecimalUtil.ZERO ;
      B1135AcuMtrEst1 = DecimalUtil.ZERO ;
      B1083AcuMtrEst = DecimalUtil.ZERO ;
      sMode547 = "" ;
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
      sMode546 = "" ;
      s1133AcuImpFac1 = DecimalUtil.ZERO ;
      s1085AcuImpFac = DecimalUtil.ZERO ;
      s1136AcuMtrFac1 = DecimalUtil.ZERO ;
      s1084AcuMtrFac = DecimalUtil.ZERO ;
      s1135AcuMtrEst1 = DecimalUtil.ZERO ;
      s1083AcuMtrEst = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A1086MtrEst = DecimalUtil.ZERO ;
      A1137MtrEst1 = DecimalUtil.ZERO ;
      A1087MtrFac = DecimalUtil.ZERO ;
      A1138MtrFac1 = DecimalUtil.ZERO ;
      A1088ImpFac = DecimalUtil.ZERO ;
      A1134ImpFac1 = DecimalUtil.ZERO ;
      T1134ImpFac1 = DecimalUtil.ZERO ;
      T1088ImpFac = DecimalUtil.ZERO ;
      T1138MtrFac1 = DecimalUtil.ZERO ;
      T1087MtrFac = DecimalUtil.ZERO ;
      T1137MtrEst1 = DecimalUtil.ZERO ;
      T1086MtrEst = DecimalUtil.ZERO ;
      AV6Lit0 = "" ;
      AV7Lit1 = "" ;
      AV8Lit2 = "" ;
      AV9Lit3 = "" ;
      AV10Lit4 = "" ;
      AV11Lit5 = "" ;
      AV12Lit6 = "" ;
      AV13Lit7 = "" ;
      AV14Lit8 = "" ;
      AV15Lit9 = "" ;
      AV16Lit10 = "" ;
      AV17Lit11 = "" ;
      AV18Lit12 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z1083AcuMtrEst = DecimalUtil.ZERO ;
      Z1135AcuMtrEst1 = DecimalUtil.ZERO ;
      Z1084AcuMtrFac = DecimalUtil.ZERO ;
      Z1136AcuMtrFac1 = DecimalUtil.ZERO ;
      Z1085AcuImpFac = DecimalUtil.ZERO ;
      Z1133AcuImpFac1 = DecimalUtil.ZERO ;
      T00FR11_A425EstAny = new short[1] ;
      T00FR11_A3913DibSerFac = new String[] {""} ;
      T00FR11_A407EmprNom = new String[] {""} ;
      T00FR11_n407EmprNom = new boolean[] {false} ;
      T00FR11_A396EmprCod = new String[] {""} ;
      T00FR11_A252CliCod = new int[1] ;
      T00FR11_A1013DibCli = new String[] {""} ;
      T00FR11_A1014DibInt = new int[1] ;
      T00FR11_A1083AcuMtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR11_A1135AcuMtrEst1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR11_A1084AcuMtrFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR11_A1136AcuMtrFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR11_A1085AcuImpFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR11_A1133AcuImpFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR6_A407EmprNom = new String[] {""} ;
      T00FR6_n407EmprNom = new boolean[] {false} ;
      T00FR7_A396EmprCod = new String[] {""} ;
      T00FR9_A1083AcuMtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR9_A1135AcuMtrEst1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR9_A1084AcuMtrFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR9_A1136AcuMtrFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR9_A1085AcuImpFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR9_A1133AcuImpFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR12_A407EmprNom = new String[] {""} ;
      T00FR12_n407EmprNom = new boolean[] {false} ;
      T00FR13_A396EmprCod = new String[] {""} ;
      T00FR15_A1083AcuMtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR15_A1135AcuMtrEst1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR15_A1084AcuMtrFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR15_A1136AcuMtrFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR15_A1085AcuImpFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR15_A1133AcuImpFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR16_A396EmprCod = new String[] {""} ;
      T00FR16_A1013DibCli = new String[] {""} ;
      T00FR16_A252CliCod = new int[1] ;
      T00FR16_A1014DibInt = new int[1] ;
      T00FR16_A425EstAny = new short[1] ;
      T00FR16_A3913DibSerFac = new String[] {""} ;
      T00FR5_A425EstAny = new short[1] ;
      T00FR5_A3913DibSerFac = new String[] {""} ;
      T00FR5_A396EmprCod = new String[] {""} ;
      T00FR5_A252CliCod = new int[1] ;
      T00FR5_A1013DibCli = new String[] {""} ;
      T00FR5_A1014DibInt = new int[1] ;
      T00FR17_A396EmprCod = new String[] {""} ;
      T00FR17_A1013DibCli = new String[] {""} ;
      T00FR17_A252CliCod = new int[1] ;
      T00FR17_A1014DibInt = new int[1] ;
      T00FR17_A425EstAny = new short[1] ;
      T00FR17_A3913DibSerFac = new String[] {""} ;
      T00FR18_A396EmprCod = new String[] {""} ;
      T00FR18_A1013DibCli = new String[] {""} ;
      T00FR18_A252CliCod = new int[1] ;
      T00FR18_A1014DibInt = new int[1] ;
      T00FR18_A425EstAny = new short[1] ;
      T00FR18_A3913DibSerFac = new String[] {""} ;
      T00FR4_A425EstAny = new short[1] ;
      T00FR4_A3913DibSerFac = new String[] {""} ;
      T00FR4_A396EmprCod = new String[] {""} ;
      T00FR4_A252CliCod = new int[1] ;
      T00FR4_A1013DibCli = new String[] {""} ;
      T00FR4_A1014DibInt = new int[1] ;
      T00FR21_A407EmprNom = new String[] {""} ;
      T00FR21_n407EmprNom = new boolean[] {false} ;
      T00FR23_A1083AcuMtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR23_A1135AcuMtrEst1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR23_A1084AcuMtrFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR23_A1136AcuMtrFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR23_A1085AcuImpFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR23_A1133AcuImpFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR24_A396EmprCod = new String[] {""} ;
      T00FR24_A1013DibCli = new String[] {""} ;
      T00FR24_A252CliCod = new int[1] ;
      T00FR24_A1014DibInt = new int[1] ;
      T00FR24_A425EstAny = new short[1] ;
      T00FR24_A3913DibSerFac = new String[] {""} ;
      T00FR25_A1013DibCli = new String[] {""} ;
      T00FR25_A252CliCod = new int[1] ;
      T00FR25_A1014DibInt = new int[1] ;
      T00FR25_A425EstAny = new short[1] ;
      T00FR25_A3913DibSerFac = new String[] {""} ;
      T00FR25_A426EstMes = new byte[1] ;
      T00FR25_A1086MtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR25_n1086MtrEst = new boolean[] {false} ;
      T00FR25_A1137MtrEst1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR25_n1137MtrEst1 = new boolean[] {false} ;
      T00FR25_A1087MtrFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR25_n1087MtrFac = new boolean[] {false} ;
      T00FR25_A1138MtrFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR25_n1138MtrFac1 = new boolean[] {false} ;
      T00FR25_A1088ImpFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR25_n1088ImpFac = new boolean[] {false} ;
      T00FR25_A1134ImpFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR25_n1134ImpFac1 = new boolean[] {false} ;
      T00FR25_A396EmprCod = new String[] {""} ;
      T00FR26_A396EmprCod = new String[] {""} ;
      T00FR26_A1013DibCli = new String[] {""} ;
      T00FR26_A252CliCod = new int[1] ;
      T00FR26_A1014DibInt = new int[1] ;
      T00FR26_A425EstAny = new short[1] ;
      T00FR26_A3913DibSerFac = new String[] {""} ;
      T00FR26_A426EstMes = new byte[1] ;
      T00FR3_A1013DibCli = new String[] {""} ;
      T00FR3_A252CliCod = new int[1] ;
      T00FR3_A1014DibInt = new int[1] ;
      T00FR3_A425EstAny = new short[1] ;
      T00FR3_A3913DibSerFac = new String[] {""} ;
      T00FR3_A426EstMes = new byte[1] ;
      T00FR3_A1086MtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR3_n1086MtrEst = new boolean[] {false} ;
      T00FR3_A1137MtrEst1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR3_n1137MtrEst1 = new boolean[] {false} ;
      T00FR3_A1087MtrFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR3_n1087MtrFac = new boolean[] {false} ;
      T00FR3_A1138MtrFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR3_n1138MtrFac1 = new boolean[] {false} ;
      T00FR3_A1088ImpFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR3_n1088ImpFac = new boolean[] {false} ;
      T00FR3_A1134ImpFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR3_n1134ImpFac1 = new boolean[] {false} ;
      T00FR3_A396EmprCod = new String[] {""} ;
      T00FR2_A1013DibCli = new String[] {""} ;
      T00FR2_A252CliCod = new int[1] ;
      T00FR2_A1014DibInt = new int[1] ;
      T00FR2_A425EstAny = new short[1] ;
      T00FR2_A3913DibSerFac = new String[] {""} ;
      T00FR2_A426EstMes = new byte[1] ;
      T00FR2_A1086MtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR2_n1086MtrEst = new boolean[] {false} ;
      T00FR2_A1137MtrEst1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR2_n1137MtrEst1 = new boolean[] {false} ;
      T00FR2_A1087MtrFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR2_n1087MtrFac = new boolean[] {false} ;
      T00FR2_A1138MtrFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR2_n1138MtrFac1 = new boolean[] {false} ;
      T00FR2_A1088ImpFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR2_n1088ImpFac = new boolean[] {false} ;
      T00FR2_A1134ImpFac1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FR2_n1134ImpFac1 = new boolean[] {false} ;
      T00FR2_A396EmprCod = new String[] {""} ;
      T00FR30_A396EmprCod = new String[] {""} ;
      T00FR30_A1013DibCli = new String[] {""} ;
      T00FR30_A252CliCod = new int[1] ;
      T00FR30_A1014DibInt = new int[1] ;
      T00FR30_A425EstAny = new short[1] ;
      T00FR30_A3913DibSerFac = new String[] {""} ;
      T00FR30_A426EstMes = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00FR31_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ1013DibCli = "" ;
      ZZ3913DibSerFac = "" ;
      ZZ407EmprNom = "" ;
      ZZ1083AcuMtrEst = DecimalUtil.ZERO ;
      ZZ1135AcuMtrEst1 = DecimalUtil.ZERO ;
      ZZ1084AcuMtrFac = DecimalUtil.ZERO ;
      ZZ1136AcuMtrFac1 = DecimalUtil.ZERO ;
      ZZ1085AcuImpFac = DecimalUtil.ZERO ;
      ZZ1133AcuImpFac1 = DecimalUtil.ZERO ;
      ZO1133AcuImpFac1 = DecimalUtil.ZERO ;
      ZO1085AcuImpFac = DecimalUtil.ZERO ;
      ZO1136AcuMtrFac1 = DecimalUtil.ZERO ;
      ZO1084AcuMtrFac = DecimalUtil.ZERO ;
      ZO1135AcuMtrEst1 = DecimalUtil.ZERO ;
      ZO1083AcuMtrEst = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdibest__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdibest__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdibest__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdibest__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdibest__default(),
         new Object[] {
             new Object[] {
            T00FR2_A1013DibCli, T00FR2_A252CliCod, T00FR2_A1014DibInt, T00FR2_A425EstAny, T00FR2_A3913DibSerFac, T00FR2_A426EstMes, T00FR2_A1086MtrEst, T00FR2_n1086MtrEst, T00FR2_A1137MtrEst1, T00FR2_n1137MtrEst1,
            T00FR2_A1087MtrFac, T00FR2_n1087MtrFac, T00FR2_A1138MtrFac1, T00FR2_n1138MtrFac1, T00FR2_A1088ImpFac, T00FR2_n1088ImpFac, T00FR2_A1134ImpFac1, T00FR2_n1134ImpFac1, T00FR2_A396EmprCod
            }
            , new Object[] {
            T00FR3_A1013DibCli, T00FR3_A252CliCod, T00FR3_A1014DibInt, T00FR3_A425EstAny, T00FR3_A3913DibSerFac, T00FR3_A426EstMes, T00FR3_A1086MtrEst, T00FR3_n1086MtrEst, T00FR3_A1137MtrEst1, T00FR3_n1137MtrEst1,
            T00FR3_A1087MtrFac, T00FR3_n1087MtrFac, T00FR3_A1138MtrFac1, T00FR3_n1138MtrFac1, T00FR3_A1088ImpFac, T00FR3_n1088ImpFac, T00FR3_A1134ImpFac1, T00FR3_n1134ImpFac1, T00FR3_A396EmprCod
            }
            , new Object[] {
            T00FR4_A425EstAny, T00FR4_A3913DibSerFac, T00FR4_A396EmprCod, T00FR4_A252CliCod, T00FR4_A1013DibCli, T00FR4_A1014DibInt
            }
            , new Object[] {
            T00FR5_A425EstAny, T00FR5_A3913DibSerFac, T00FR5_A396EmprCod, T00FR5_A252CliCod, T00FR5_A1013DibCli, T00FR5_A1014DibInt
            }
            , new Object[] {
            T00FR6_A407EmprNom, T00FR6_n407EmprNom
            }
            , new Object[] {
            T00FR7_A396EmprCod
            }
            , new Object[] {
            T00FR9_A1083AcuMtrEst, T00FR9_A1135AcuMtrEst1, T00FR9_A1084AcuMtrFac, T00FR9_A1136AcuMtrFac1, T00FR9_A1085AcuImpFac, T00FR9_A1133AcuImpFac1
            }
            , new Object[] {
            T00FR11_A425EstAny, T00FR11_A3913DibSerFac, T00FR11_A407EmprNom, T00FR11_n407EmprNom, T00FR11_A396EmprCod, T00FR11_A252CliCod, T00FR11_A1013DibCli, T00FR11_A1014DibInt, T00FR11_A1083AcuMtrEst, T00FR11_A1135AcuMtrEst1,
            T00FR11_A1084AcuMtrFac, T00FR11_A1136AcuMtrFac1, T00FR11_A1085AcuImpFac, T00FR11_A1133AcuImpFac1
            }
            , new Object[] {
            T00FR12_A407EmprNom, T00FR12_n407EmprNom
            }
            , new Object[] {
            T00FR13_A396EmprCod
            }
            , new Object[] {
            T00FR15_A1083AcuMtrEst, T00FR15_A1135AcuMtrEst1, T00FR15_A1084AcuMtrFac, T00FR15_A1136AcuMtrFac1, T00FR15_A1085AcuImpFac, T00FR15_A1133AcuImpFac1
            }
            , new Object[] {
            T00FR16_A396EmprCod, T00FR16_A1013DibCli, T00FR16_A252CliCod, T00FR16_A1014DibInt, T00FR16_A425EstAny, T00FR16_A3913DibSerFac
            }
            , new Object[] {
            T00FR17_A396EmprCod, T00FR17_A1013DibCli, T00FR17_A252CliCod, T00FR17_A1014DibInt, T00FR17_A425EstAny, T00FR17_A3913DibSerFac
            }
            , new Object[] {
            T00FR18_A396EmprCod, T00FR18_A1013DibCli, T00FR18_A252CliCod, T00FR18_A1014DibInt, T00FR18_A425EstAny, T00FR18_A3913DibSerFac
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00FR21_A407EmprNom, T00FR21_n407EmprNom
            }
            , new Object[] {
            T00FR23_A1083AcuMtrEst, T00FR23_A1135AcuMtrEst1, T00FR23_A1084AcuMtrFac, T00FR23_A1136AcuMtrFac1, T00FR23_A1085AcuImpFac, T00FR23_A1133AcuImpFac1
            }
            , new Object[] {
            T00FR24_A396EmprCod, T00FR24_A1013DibCli, T00FR24_A252CliCod, T00FR24_A1014DibInt, T00FR24_A425EstAny, T00FR24_A3913DibSerFac
            }
            , new Object[] {
            T00FR25_A1013DibCli, T00FR25_A252CliCod, T00FR25_A1014DibInt, T00FR25_A425EstAny, T00FR25_A3913DibSerFac, T00FR25_A426EstMes, T00FR25_A1086MtrEst, T00FR25_n1086MtrEst, T00FR25_A1137MtrEst1, T00FR25_n1137MtrEst1,
            T00FR25_A1087MtrFac, T00FR25_n1087MtrFac, T00FR25_A1138MtrFac1, T00FR25_n1138MtrFac1, T00FR25_A1088ImpFac, T00FR25_n1088ImpFac, T00FR25_A1134ImpFac1, T00FR25_n1134ImpFac1, T00FR25_A396EmprCod
            }
            , new Object[] {
            T00FR26_A396EmprCod, T00FR26_A1013DibCli, T00FR26_A252CliCod, T00FR26_A1014DibInt, T00FR26_A425EstAny, T00FR26_A3913DibSerFac, T00FR26_A426EstMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00FR30_A396EmprCod, T00FR30_A1013DibCli, T00FR30_A252CliCod, T00FR30_A1014DibInt, T00FR30_A425EstAny, T00FR30_A3913DibSerFac, T00FR30_A426EstMes
            }
            , new Object[] {
            T00FR31_A396EmprCod
            }
         }
      );
   }

   private byte Z426EstMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A426EstMes ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z425EstAny ;
   private short nRcdDeleted_547 ;
   private short nRcdExists_547 ;
   private short nIsMod_547 ;
   private short A425EstAny ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount547 ;
   private short RcdFound547 ;
   private short nBlankRcdUsr547 ;
   private short RcdFound546 ;
   private short nIsDirty_546 ;
   private short nIsDirty_547 ;
   private short ZZ425EstAny ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtDibInt_Enabled ;
   private int edtEstAny_Enabled ;
   private int edtDibSerFac_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAcuMtrEst_Enabled ;
   private int edtAcuMtrEst1_Enabled ;
   private int edtAcuMtrFac_Enabled ;
   private int edtAcuMtrFac1_Enabled ;
   private int edtAcuImpFac_Enabled ;
   private int edtAcuImpFac1_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_547_Enabled ;
   private int edtEstMes_Enabled ;
   private int edtMtrEst_Enabled ;
   private int edtMtrEst1_Enabled ;
   private int edtMtrFac_Enabled ;
   private int edtMtrFac1_Enabled ;
   private int edtImpFac_Enabled ;
   private int edtImpFac1_Enabled ;
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
   private int defedtEstMes_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAcuImpFac1_Backcolor ;
   private int edtAcuImpFac_Backcolor ;
   private int edtAcuMtrFac1_Backcolor ;
   private int edtAcuMtrFac_Backcolor ;
   private int edtAcuMtrEst1_Backcolor ;
   private int edtAcuMtrEst_Backcolor ;
   private int edtDibSerFac_Backcolor ;
   private int edtEstAny_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ1014DibInt ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O1133AcuImpFac1 ;
   private java.math.BigDecimal O1085AcuImpFac ;
   private java.math.BigDecimal O1136AcuMtrFac1 ;
   private java.math.BigDecimal O1084AcuMtrFac ;
   private java.math.BigDecimal O1135AcuMtrEst1 ;
   private java.math.BigDecimal O1083AcuMtrEst ;
   private java.math.BigDecimal Z1086MtrEst ;
   private java.math.BigDecimal Z1137MtrEst1 ;
   private java.math.BigDecimal Z1087MtrFac ;
   private java.math.BigDecimal Z1138MtrFac1 ;
   private java.math.BigDecimal Z1088ImpFac ;
   private java.math.BigDecimal Z1134ImpFac1 ;
   private java.math.BigDecimal O1134ImpFac1 ;
   private java.math.BigDecimal O1088ImpFac ;
   private java.math.BigDecimal O1138MtrFac1 ;
   private java.math.BigDecimal O1087MtrFac ;
   private java.math.BigDecimal O1137MtrEst1 ;
   private java.math.BigDecimal O1086MtrEst ;
   private java.math.BigDecimal A1083AcuMtrEst ;
   private java.math.BigDecimal A1135AcuMtrEst1 ;
   private java.math.BigDecimal A1084AcuMtrFac ;
   private java.math.BigDecimal A1136AcuMtrFac1 ;
   private java.math.BigDecimal A1085AcuImpFac ;
   private java.math.BigDecimal A1133AcuImpFac1 ;
   private java.math.BigDecimal B1133AcuImpFac1 ;
   private java.math.BigDecimal B1085AcuImpFac ;
   private java.math.BigDecimal B1136AcuMtrFac1 ;
   private java.math.BigDecimal B1084AcuMtrFac ;
   private java.math.BigDecimal B1135AcuMtrEst1 ;
   private java.math.BigDecimal B1083AcuMtrEst ;
   private java.math.BigDecimal s1133AcuImpFac1 ;
   private java.math.BigDecimal s1085AcuImpFac ;
   private java.math.BigDecimal s1136AcuMtrFac1 ;
   private java.math.BigDecimal s1084AcuMtrFac ;
   private java.math.BigDecimal s1135AcuMtrEst1 ;
   private java.math.BigDecimal s1083AcuMtrEst ;
   private java.math.BigDecimal A1086MtrEst ;
   private java.math.BigDecimal A1137MtrEst1 ;
   private java.math.BigDecimal A1087MtrFac ;
   private java.math.BigDecimal A1138MtrFac1 ;
   private java.math.BigDecimal A1088ImpFac ;
   private java.math.BigDecimal A1134ImpFac1 ;
   private java.math.BigDecimal T1134ImpFac1 ;
   private java.math.BigDecimal T1088ImpFac ;
   private java.math.BigDecimal T1138MtrFac1 ;
   private java.math.BigDecimal T1087MtrFac ;
   private java.math.BigDecimal T1137MtrEst1 ;
   private java.math.BigDecimal T1086MtrEst ;
   private java.math.BigDecimal Z1083AcuMtrEst ;
   private java.math.BigDecimal Z1135AcuMtrEst1 ;
   private java.math.BigDecimal Z1084AcuMtrFac ;
   private java.math.BigDecimal Z1136AcuMtrFac1 ;
   private java.math.BigDecimal Z1085AcuImpFac ;
   private java.math.BigDecimal Z1133AcuImpFac1 ;
   private java.math.BigDecimal ZZ1083AcuMtrEst ;
   private java.math.BigDecimal ZZ1135AcuMtrEst1 ;
   private java.math.BigDecimal ZZ1084AcuMtrFac ;
   private java.math.BigDecimal ZZ1136AcuMtrFac1 ;
   private java.math.BigDecimal ZZ1085AcuImpFac ;
   private java.math.BigDecimal ZZ1133AcuImpFac1 ;
   private java.math.BigDecimal ZO1133AcuImpFac1 ;
   private java.math.BigDecimal ZO1085AcuImpFac ;
   private java.math.BigDecimal ZO1136AcuMtrFac1 ;
   private java.math.BigDecimal ZO1084AcuMtrFac ;
   private java.math.BigDecimal ZO1135AcuMtrEst1 ;
   private java.math.BigDecimal ZO1083AcuMtrEst ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z1013DibCli ;
   private String Z3913DibSerFac ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String A3913DibSerFac ;
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
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEstAny_Internalname ;
   private String edtEstAny_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDibSerFac_Internalname ;
   private String edtDibSerFac_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAcuMtrEst_Internalname ;
   private String edtAcuMtrEst_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAcuMtrEst1_Internalname ;
   private String edtAcuMtrEst1_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAcuMtrFac_Internalname ;
   private String edtAcuMtrFac_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAcuMtrFac1_Internalname ;
   private String edtAcuMtrFac1_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAcuImpFac_Internalname ;
   private String edtAcuImpFac_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAcuImpFac1_Internalname ;
   private String edtAcuImpFac1_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode547 ;
   private String edtavnRcdDeleted_547_Internalname ;
   private String edtEstMes_Internalname ;
   private String edtMtrEst_Internalname ;
   private String edtMtrEst1_Internalname ;
   private String edtMtrFac_Internalname ;
   private String edtMtrFac1_Internalname ;
   private String edtImpFac_Internalname ;
   private String edtImpFac1_Internalname ;
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
   private String sMode546 ;
   private String GXCCtl ;
   private String AV6Lit0 ;
   private String AV7Lit1 ;
   private String AV8Lit2 ;
   private String AV9Lit3 ;
   private String AV10Lit4 ;
   private String AV11Lit5 ;
   private String AV12Lit6 ;
   private String AV13Lit7 ;
   private String AV14Lit8 ;
   private String AV15Lit9 ;
   private String AV16Lit10 ;
   private String AV17Lit11 ;
   private String AV18Lit12 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_547_Jsonclick ;
   private String edtEstMes_Jsonclick ;
   private String edtMtrEst_Jsonclick ;
   private String edtMtrEst1_Jsonclick ;
   private String edtMtrFac_Jsonclick ;
   private String edtMtrFac1_Jsonclick ;
   private String edtImpFac_Jsonclick ;
   private String edtImpFac1_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ1013DibCli ;
   private String ZZ3913DibSerFac ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n1086MtrEst ;
   private boolean n1137MtrEst1 ;
   private boolean n1087MtrFac ;
   private boolean n1138MtrFac1 ;
   private boolean n1088ImpFac ;
   private boolean n1134ImpFac1 ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private short[] T00FR11_A425EstAny ;
   private String[] T00FR11_A3913DibSerFac ;
   private String[] T00FR11_A407EmprNom ;
   private boolean[] T00FR11_n407EmprNom ;
   private String[] T00FR11_A396EmprCod ;
   private int[] T00FR11_A252CliCod ;
   private String[] T00FR11_A1013DibCli ;
   private int[] T00FR11_A1014DibInt ;
   private java.math.BigDecimal[] T00FR11_A1083AcuMtrEst ;
   private java.math.BigDecimal[] T00FR11_A1135AcuMtrEst1 ;
   private java.math.BigDecimal[] T00FR11_A1084AcuMtrFac ;
   private java.math.BigDecimal[] T00FR11_A1136AcuMtrFac1 ;
   private java.math.BigDecimal[] T00FR11_A1085AcuImpFac ;
   private java.math.BigDecimal[] T00FR11_A1133AcuImpFac1 ;
   private String[] T00FR6_A407EmprNom ;
   private boolean[] T00FR6_n407EmprNom ;
   private String[] T00FR7_A396EmprCod ;
   private java.math.BigDecimal[] T00FR9_A1083AcuMtrEst ;
   private java.math.BigDecimal[] T00FR9_A1135AcuMtrEst1 ;
   private java.math.BigDecimal[] T00FR9_A1084AcuMtrFac ;
   private java.math.BigDecimal[] T00FR9_A1136AcuMtrFac1 ;
   private java.math.BigDecimal[] T00FR9_A1085AcuImpFac ;
   private java.math.BigDecimal[] T00FR9_A1133AcuImpFac1 ;
   private String[] T00FR12_A407EmprNom ;
   private boolean[] T00FR12_n407EmprNom ;
   private String[] T00FR13_A396EmprCod ;
   private java.math.BigDecimal[] T00FR15_A1083AcuMtrEst ;
   private java.math.BigDecimal[] T00FR15_A1135AcuMtrEst1 ;
   private java.math.BigDecimal[] T00FR15_A1084AcuMtrFac ;
   private java.math.BigDecimal[] T00FR15_A1136AcuMtrFac1 ;
   private java.math.BigDecimal[] T00FR15_A1085AcuImpFac ;
   private java.math.BigDecimal[] T00FR15_A1133AcuImpFac1 ;
   private String[] T00FR16_A396EmprCod ;
   private String[] T00FR16_A1013DibCli ;
   private int[] T00FR16_A252CliCod ;
   private int[] T00FR16_A1014DibInt ;
   private short[] T00FR16_A425EstAny ;
   private String[] T00FR16_A3913DibSerFac ;
   private short[] T00FR5_A425EstAny ;
   private String[] T00FR5_A3913DibSerFac ;
   private String[] T00FR5_A396EmprCod ;
   private int[] T00FR5_A252CliCod ;
   private String[] T00FR5_A1013DibCli ;
   private int[] T00FR5_A1014DibInt ;
   private String[] T00FR17_A396EmprCod ;
   private String[] T00FR17_A1013DibCli ;
   private int[] T00FR17_A252CliCod ;
   private int[] T00FR17_A1014DibInt ;
   private short[] T00FR17_A425EstAny ;
   private String[] T00FR17_A3913DibSerFac ;
   private String[] T00FR18_A396EmprCod ;
   private String[] T00FR18_A1013DibCli ;
   private int[] T00FR18_A252CliCod ;
   private int[] T00FR18_A1014DibInt ;
   private short[] T00FR18_A425EstAny ;
   private String[] T00FR18_A3913DibSerFac ;
   private short[] T00FR4_A425EstAny ;
   private String[] T00FR4_A3913DibSerFac ;
   private String[] T00FR4_A396EmprCod ;
   private int[] T00FR4_A252CliCod ;
   private String[] T00FR4_A1013DibCli ;
   private int[] T00FR4_A1014DibInt ;
   private String[] T00FR21_A407EmprNom ;
   private boolean[] T00FR21_n407EmprNom ;
   private java.math.BigDecimal[] T00FR23_A1083AcuMtrEst ;
   private java.math.BigDecimal[] T00FR23_A1135AcuMtrEst1 ;
   private java.math.BigDecimal[] T00FR23_A1084AcuMtrFac ;
   private java.math.BigDecimal[] T00FR23_A1136AcuMtrFac1 ;
   private java.math.BigDecimal[] T00FR23_A1085AcuImpFac ;
   private java.math.BigDecimal[] T00FR23_A1133AcuImpFac1 ;
   private String[] T00FR24_A396EmprCod ;
   private String[] T00FR24_A1013DibCli ;
   private int[] T00FR24_A252CliCod ;
   private int[] T00FR24_A1014DibInt ;
   private short[] T00FR24_A425EstAny ;
   private String[] T00FR24_A3913DibSerFac ;
   private String[] T00FR25_A1013DibCli ;
   private int[] T00FR25_A252CliCod ;
   private int[] T00FR25_A1014DibInt ;
   private short[] T00FR25_A425EstAny ;
   private String[] T00FR25_A3913DibSerFac ;
   private byte[] T00FR25_A426EstMes ;
   private java.math.BigDecimal[] T00FR25_A1086MtrEst ;
   private boolean[] T00FR25_n1086MtrEst ;
   private java.math.BigDecimal[] T00FR25_A1137MtrEst1 ;
   private boolean[] T00FR25_n1137MtrEst1 ;
   private java.math.BigDecimal[] T00FR25_A1087MtrFac ;
   private boolean[] T00FR25_n1087MtrFac ;
   private java.math.BigDecimal[] T00FR25_A1138MtrFac1 ;
   private boolean[] T00FR25_n1138MtrFac1 ;
   private java.math.BigDecimal[] T00FR25_A1088ImpFac ;
   private boolean[] T00FR25_n1088ImpFac ;
   private java.math.BigDecimal[] T00FR25_A1134ImpFac1 ;
   private boolean[] T00FR25_n1134ImpFac1 ;
   private String[] T00FR25_A396EmprCod ;
   private String[] T00FR26_A396EmprCod ;
   private String[] T00FR26_A1013DibCli ;
   private int[] T00FR26_A252CliCod ;
   private int[] T00FR26_A1014DibInt ;
   private short[] T00FR26_A425EstAny ;
   private String[] T00FR26_A3913DibSerFac ;
   private byte[] T00FR26_A426EstMes ;
   private String[] T00FR3_A1013DibCli ;
   private int[] T00FR3_A252CliCod ;
   private int[] T00FR3_A1014DibInt ;
   private short[] T00FR3_A425EstAny ;
   private String[] T00FR3_A3913DibSerFac ;
   private byte[] T00FR3_A426EstMes ;
   private java.math.BigDecimal[] T00FR3_A1086MtrEst ;
   private boolean[] T00FR3_n1086MtrEst ;
   private java.math.BigDecimal[] T00FR3_A1137MtrEst1 ;
   private boolean[] T00FR3_n1137MtrEst1 ;
   private java.math.BigDecimal[] T00FR3_A1087MtrFac ;
   private boolean[] T00FR3_n1087MtrFac ;
   private java.math.BigDecimal[] T00FR3_A1138MtrFac1 ;
   private boolean[] T00FR3_n1138MtrFac1 ;
   private java.math.BigDecimal[] T00FR3_A1088ImpFac ;
   private boolean[] T00FR3_n1088ImpFac ;
   private java.math.BigDecimal[] T00FR3_A1134ImpFac1 ;
   private boolean[] T00FR3_n1134ImpFac1 ;
   private String[] T00FR3_A396EmprCod ;
   private String[] T00FR2_A1013DibCli ;
   private int[] T00FR2_A252CliCod ;
   private int[] T00FR2_A1014DibInt ;
   private short[] T00FR2_A425EstAny ;
   private String[] T00FR2_A3913DibSerFac ;
   private byte[] T00FR2_A426EstMes ;
   private java.math.BigDecimal[] T00FR2_A1086MtrEst ;
   private boolean[] T00FR2_n1086MtrEst ;
   private java.math.BigDecimal[] T00FR2_A1137MtrEst1 ;
   private boolean[] T00FR2_n1137MtrEst1 ;
   private java.math.BigDecimal[] T00FR2_A1087MtrFac ;
   private boolean[] T00FR2_n1087MtrFac ;
   private java.math.BigDecimal[] T00FR2_A1138MtrFac1 ;
   private boolean[] T00FR2_n1138MtrFac1 ;
   private java.math.BigDecimal[] T00FR2_A1088ImpFac ;
   private boolean[] T00FR2_n1088ImpFac ;
   private java.math.BigDecimal[] T00FR2_A1134ImpFac1 ;
   private boolean[] T00FR2_n1134ImpFac1 ;
   private String[] T00FR2_A396EmprCod ;
   private String[] T00FR30_A396EmprCod ;
   private String[] T00FR30_A1013DibCli ;
   private int[] T00FR30_A252CliCod ;
   private int[] T00FR30_A1014DibInt ;
   private short[] T00FR30_A425EstAny ;
   private String[] T00FR30_A3913DibSerFac ;
   private byte[] T00FR30_A426EstMes ;
   private String[] T00FR31_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdibest__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdibest__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdibest__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdibest__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdibest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00FR2", "SELECT DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes, MtrEst, MtrEst1, MtrFac, MtrFac1, ImpFac, ImpFac1, EmprCod FROM TXPLESTDI WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? AND EstMes = ?  FOR UPDATE OF MtrEst, MtrEst1, MtrFac, MtrFac1, ImpFac, ImpFac1 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR3", "SELECT DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes, MtrEst, MtrEst1, MtrFac, MtrFac1, ImpFac, ImpFac1, EmprCod FROM TXPLESTDI WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? AND EstMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR4", "SELECT EstAny, DibSerFac, EmprCod, CliCod, DibCli, DibInt FROM TXPCESTDI WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ?  FOR UPDATE OF EstAny NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR5", "SELECT EstAny, DibSerFac, EmprCod, CliCod, DibCli, DibInt FROM TXPCESTDI WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR7", "SELECT EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR9", "SELECT COALESCE( T1.AcuMtrEst, 0) AS AcuMtrEst, COALESCE( T1.AcuMtrEst1, 0) AS AcuMtrEst1, COALESCE( T1.AcuMtrFac, 0) AS AcuMtrFac, COALESCE( T1.AcuMtrFac1, 0) AS AcuMtrFac1, COALESCE( T1.AcuImpFac, 0) AS AcuImpFac, COALESCE( T1.AcuImpFac1, 0) AS AcuImpFac1 FROM (SELECT SUM(MtrEst) AS AcuMtrEst, EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, SUM(MtrEst1) AS AcuMtrEst1, SUM(MtrFac) AS AcuMtrFac, SUM(MtrFac1) AS AcuMtrFac1, SUM(ImpFac) AS AcuImpFac, SUM(ImpFac1) AS AcuImpFac1 FROM TXPLESTDI GROUP BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac ) T1 WHERE T1.EmprCod = ? AND T1.DibCli = ? AND T1.CliCod = ? AND T1.DibInt = ? AND T1.EstAny = ? AND T1.DibSerFac = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR11", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstAny, TM1.DibSerFac, T2.EmprNom, TM1.EmprCod, TM1.CliCod, TM1.DibCli, TM1.DibInt, COALESCE( T3.AcuMtrEst, 0) AS AcuMtrEst, COALESCE( T3.AcuMtrEst1, 0) AS AcuMtrEst1, COALESCE( T3.AcuMtrFac, 0) AS AcuMtrFac, COALESCE( T3.AcuMtrFac1, 0) AS AcuMtrFac1, COALESCE( T3.AcuImpFac, 0) AS AcuImpFac, COALESCE( T3.AcuImpFac1, 0) AS AcuImpFac1 FROM ((TXPCESTDI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(MtrEst) AS AcuMtrEst, EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, SUM(MtrEst1) AS AcuMtrEst1, SUM(MtrFac) AS AcuMtrFac, SUM(MtrFac1) AS AcuMtrFac1, SUM(ImpFac) AS AcuImpFac, SUM(ImpFac1) AS AcuImpFac1 FROM TXPLESTDI GROUP BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DibCli = TM1.DibCli AND T3.CliCod = TM1.CliCod AND T3.DibInt = TM1.DibInt AND T3.EstAny = TM1.EstAny AND T3.DibSerFac = TM1.DibSerFac) WHERE TM1.EmprCod = ? and TM1.DibCli = ? and TM1.CliCod = ? and TM1.DibInt = ? and TM1.EstAny = ? and TM1.DibSerFac = ? ORDER BY TM1.EmprCod, TM1.DibCli, TM1.CliCod, TM1.DibInt, TM1.EstAny, TM1.DibSerFac ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR13", "SELECT EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR15", "SELECT COALESCE( T1.AcuMtrEst, 0) AS AcuMtrEst, COALESCE( T1.AcuMtrEst1, 0) AS AcuMtrEst1, COALESCE( T1.AcuMtrFac, 0) AS AcuMtrFac, COALESCE( T1.AcuMtrFac1, 0) AS AcuMtrFac1, COALESCE( T1.AcuImpFac, 0) AS AcuImpFac, COALESCE( T1.AcuImpFac1, 0) AS AcuImpFac1 FROM (SELECT SUM(MtrEst) AS AcuMtrEst, EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, SUM(MtrEst1) AS AcuMtrEst1, SUM(MtrFac) AS AcuMtrFac, SUM(MtrFac1) AS AcuMtrFac1, SUM(ImpFac) AS AcuImpFac, SUM(ImpFac1) AS AcuImpFac1 FROM TXPLESTDI GROUP BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac ) T1 WHERE T1.EmprCod = ? AND T1.DibCli = ? AND T1.CliCod = ? AND T1.DibInt = ? AND T1.EstAny = ? AND T1.DibSerFac = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac FROM TXPCESTDI WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac FROM TXPCESTDI WHERE ( EmprCod > ? or EmprCod = ? and DibCli > ? or DibCli = ? and EmprCod = ? and CliCod > ? or CliCod = ? and DibCli = ? and EmprCod = ? and DibInt > ? or DibInt = ? and CliCod = ? and DibCli = ? and EmprCod = ? and EstAny > ? or EstAny = ? and DibInt = ? and CliCod = ? and DibCli = ? and EmprCod = ? and DibSerFac > ?) ORDER BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FR18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac FROM TXPCESTDI WHERE ( EmprCod < ? or EmprCod = ? and DibCli < ? or DibCli = ? and EmprCod = ? and CliCod < ? or CliCod = ? and DibCli = ? and EmprCod = ? and DibInt < ? or DibInt = ? and CliCod = ? and DibCli = ? and EmprCod = ? and EstAny < ? or EstAny = ? and DibInt = ? and CliCod = ? and DibCli = ? and EmprCod = ? and DibSerFac < ?) ORDER BY EmprCod DESC, DibCli DESC, CliCod DESC, DibInt DESC, EstAny DESC, DibSerFac DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00FR19", "INSERT INTO TXPCESTDI(EstAny, DibSerFac, EmprCod, CliCod, DibCli, DibInt) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCESTDI")
         ,new UpdateCursor("T00FR20", "DELETE FROM TXPCESTDI  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ?", GX_NOMASK, "TXPCESTDI")
         ,new ForEachCursor("T00FR21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR23", "SELECT COALESCE( T1.AcuMtrEst, 0) AS AcuMtrEst, COALESCE( T1.AcuMtrEst1, 0) AS AcuMtrEst1, COALESCE( T1.AcuMtrFac, 0) AS AcuMtrFac, COALESCE( T1.AcuMtrFac1, 0) AS AcuMtrFac1, COALESCE( T1.AcuImpFac, 0) AS AcuImpFac, COALESCE( T1.AcuImpFac1, 0) AS AcuImpFac1 FROM (SELECT SUM(MtrEst) AS AcuMtrEst, EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, SUM(MtrEst1) AS AcuMtrEst1, SUM(MtrFac) AS AcuMtrFac, SUM(MtrFac1) AS AcuMtrFac1, SUM(ImpFac) AS AcuImpFac, SUM(ImpFac1) AS AcuImpFac1 FROM TXPLESTDI GROUP BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac ) T1 WHERE T1.EmprCod = ? AND T1.DibCli = ? AND T1.CliCod = ? AND T1.DibInt = ? AND T1.EstAny = ? AND T1.DibSerFac = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac FROM TXPCESTDI ORDER BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR25", "SELECT DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes, MtrEst, MtrEst1, MtrFac, MtrFac1, ImpFac, ImpFac1, EmprCod FROM TXPLESTDI WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and EstAny = ? and DibSerFac = ? and EstMes = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR26", "SELECT EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes FROM TXPLESTDI WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? AND EstMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00FR27", "INSERT INTO TXPLESTDI(DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes, MtrEst, MtrEst1, MtrFac, MtrFac1, ImpFac, ImpFac1, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLESTDI")
         ,new UpdateCursor("T00FR28", "UPDATE TXPLESTDI SET MtrEst=?, MtrEst1=?, MtrFac=?, MtrFac1=?, ImpFac=?, ImpFac1=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? AND EstMes = ?", GX_NOMASK, "TXPLESTDI")
         ,new UpdateCursor("T00FR29", "DELETE FROM TXPLESTDI  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? AND EstMes = ?", GX_NOMASK, "TXPLESTDI")
         ,new ForEachCursor("T00FR30", "SELECT EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes FROM TXPLESTDI WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and EstAny = ? and DibSerFac = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FR31", "SELECT EmprCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 25 :
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 16);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 16);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 16);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 16);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 3);
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 2);
               }
               stmt.setString(13, (String)parms[18], 3);
               return;
            case 22 :
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
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
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 16);
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setInt(10, ((Number) parms[15]).intValue());
               stmt.setShort(11, ((Number) parms[16]).shortValue());
               stmt.setString(12, (String)parms[17], 3);
               stmt.setByte(13, ((Number) parms[18]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

