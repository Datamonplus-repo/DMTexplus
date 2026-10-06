package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tccstd_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = httpContext.GetPar( "CCFColNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A252CliCod, A65ArtCod, A4058CCFColNom, A4059CCFColNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A4031CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control de Calidad Standard", ""), (short)(0)) ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
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

   public tccstd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tccstd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccstd_impl.class ));
   }

   public tccstd_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTLinTpoD = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCCStd.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"3chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"16chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre del Color", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFColNom_Internalname, GXutil.rtrim( A4058CCFColNom), GXutil.rtrim( localUtil.format( A4058CCFColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"13chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFColNom_Jsonclick, 0, "", "", "", "", "", 1, edtCCFColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Número del Color", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4059CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCFColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4059CCFColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4059CCFColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFColNum_Jsonclick, 0, "", "", "", "", "", 1, edtCCFColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"6chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción del Test", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"30chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TCCStd.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount629 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_629 = (short)(1) ;
            scanStartIE629( ) ;
            while ( RcdFound629 != 0 )
            {
               init_level_properties629( ) ;
               getByPrimaryKeyIE629( ) ;
               addRowIE629( ) ;
               scanNextIE629( ) ;
            }
            scanEndIE629( ) ;
            nBlankRcdCount629 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalIE629( ) ;
         standaloneModalIE629( ) ;
         sMode629 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRowIE629( ) ;
            edtavnRcdDeleted_629_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_629_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_629_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_629_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            cmbCCTLinTpoD.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
            edtCCTLinLgoD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINLGOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtCCTLinPict_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINPICT_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtCCSVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCSVAL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCSVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSVal_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_629 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalIE629( ) ;
            }
            sendRowIE629( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode629 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount629 = (short)(5) ;
         nRcdExists_629 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartIE629( ) ;
            while ( RcdFound629 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_65629( ) ;
               init_level_properties629( ) ;
               standaloneNotModalIE629( ) ;
               getByPrimaryKeyIE629( ) ;
               standaloneModalIE629( ) ;
               addRowIE629( ) ;
               scanNextIE629( ) ;
            }
            scanEndIE629( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode629 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_65629( ) ;
      initAllIE629( ) ;
      init_level_properties629( ) ;
      nRcdExists_629 = (short)(0) ;
      nIsMod_629 = (short)(0) ;
      nRcdDeleted_629 = (short)(0) ;
      nBlankRcdCount629 = (short)(nBlankRcdUsr629+nBlankRcdCount629) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount629 > 0 )
      {
         standaloneNotModalIE629( ) ;
         standaloneModalIE629( ) ;
         addRowIE629( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCCTLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount629 = (short)(nBlankRcdCount629-1) ;
      }
      Gx_mode = sMode629 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TCCStd.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TCCStd.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
         Z4058CCFColNom = httpContext.cgiGet( "Z4058CCFColNom") ;
         Z4059CCFColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z4059CCFColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A11482CCSMin = httpContext.cgiGet( "CCSMIN") ;
         n11482CCSMin = false ;
         A11483CCSMax = httpContext.cgiGet( "CCSMAX") ;
         n11483CCSMax = false ;
         A11530CCSAuto = (byte)(localUtil.ctol( httpContext.cgiGet( "CCSAUTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A11531CCSVCod = httpContext.cgiGet( "CCSVCOD") ;
         A11532CCSVTol = localUtil.ctond( httpContext.cgiGet( "CCSVTOL")) ;
         A13247CCSMetodo = httpContext.cgiGet( "CCSMETODO") ;
         n13247CCSMetodo = false ;
         A13248CCSEspecif = httpContext.cgiGet( "CCSESPECIF") ;
         n13248CCSEspecif = false ;
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
         A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = httpContext.cgiGet( edtCCFColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCFCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCFColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4059CCFColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         }
         else
         {
            A4059CCFColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtCCFColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCTCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4031CCTCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         }
         else
         {
            A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         }
         A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
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
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4058CCFColNom = httpContext.GetPar( "CCFColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = (int)(GXutil.lval( httpContext.GetPar( "CCFColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
            initAllIE628( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_629_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_629_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributesIE628( ) ;
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

   public void confirm_IE0( )
   {
      beforeValidateIE628( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsIE628( ) ;
         }
         else
         {
            checkExtendedTableIE628( ) ;
            if ( AnyError == 0 )
            {
               zmIE628( 2) ;
               zmIE628( 3) ;
               zmIE628( 4) ;
               zmIE628( 5) ;
            }
            closeExtendedTableCursorsIE628( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode628 = Gx_mode ;
         confirm_IE629( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode628 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode628 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesIE0( ) ;
      }
   }

   public void confirm_IE629( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRowIE629( ) ;
         if ( ( nRcdExists_629 != 0 ) || ( nIsMod_629 != 0 ) )
         {
            getKeyIE629( ) ;
            if ( ( nRcdExists_629 == 0 ) && ( nRcdDeleted_629 == 0 ) )
            {
               if ( RcdFound629 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateIE629( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableIE629( ) ;
                     if ( AnyError == 0 )
                     {
                        zmIE629( 7) ;
                     }
                     closeExtendedTableCursorsIE629( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCTLIN_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound629 != 0 )
               {
                  if ( nRcdDeleted_629 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyIE629( ) ;
                     loadIE629( ) ;
                     beforeValidateIE629( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsIE629( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_629 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateIE629( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableIE629( ) ;
                           if ( AnyError == 0 )
                           {
                              zmIE629( 7) ;
                           }
                           closeExtendedTableCursorsIE629( ) ;
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
                  if ( nRcdDeleted_629 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_629_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( cmbCCTLinTpoD.getInternalname(), GXutil.rtrim( A4044CCTLinTpoD)) ;
         httpContext.changePostValue( edtCCTLinLgoD_Internalname, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinPict_Internalname, GXutil.rtrim( A4046CCTLinPict)) ;
         httpContext.changePostValue( edtCCSVal_Internalname, GXutil.rtrim( A4060CCSVal)) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4060CCSVal_"+sGXsfl_65_idx, GXutil.rtrim( Z4060CCSVal)) ;
         httpContext.changePostValue( "ZT_"+"Z11482CCSMin_"+sGXsfl_65_idx, GXutil.rtrim( Z11482CCSMin)) ;
         httpContext.changePostValue( "ZT_"+"Z11483CCSMax_"+sGXsfl_65_idx, GXutil.rtrim( Z11483CCSMax)) ;
         httpContext.changePostValue( "ZT_"+"Z11530CCSAuto_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11530CCSAuto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11531CCSVCod_"+sGXsfl_65_idx, GXutil.rtrim( Z11531CCSVCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11532CCSVTol_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11532CCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13247CCSMetodo_"+sGXsfl_65_idx, GXutil.rtrim( Z13247CCSMetodo)) ;
         httpContext.changePostValue( "ZT_"+"Z13248CCSEspecif_"+sGXsfl_65_idx, GXutil.rtrim( Z13248CCSEspecif)) ;
         httpContext.changePostValue( "nRcdDeleted_629_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_629_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_629_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_629 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_629_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_629_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINLGOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINPICT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCSVAL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCSVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionIE0( )
   {
   }

   public void zmIE628( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4058CCFColNom = A4058CCFColNom ;
         Z4059CCFColNum = A4059CCFColNum ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z4036CCTDsc = A4036CCTDsc ;
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

   public void loadIE628( )
   {
      /* Using cursor T00IE11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(A4031CCTCod), A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound628 = (short)(1) ;
         A407EmprNom = T00IE11_A407EmprNom[0] ;
         n407EmprNom = T00IE11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T00IE11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A4036CCTDsc = T00IE11_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         zmIE628( -1) ;
      }
      pr_default.close(9);
      onLoadActionsIE628( ) ;
   }

   public void onLoadActionsIE628( )
   {
   }

   public void checkExtendedTableIE628( )
   {
      nIsDirty_628 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00IE7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00IE7_A407EmprNom[0] ;
      n407EmprNom = T00IE7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00IE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00IE8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T00IE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCSerie", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCFCOLNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(8);
      /* Using cursor T00IE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T00IE9_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(7);
   }

   public void closeExtendedTableCursorsIE628( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T00IE12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00IE12_A407EmprNom[0] ;
      n407EmprNom = T00IE12_n407EmprNom[0] ;
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
                         int A252CliCod )
   {
      /* Using cursor T00IE13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00IE13_A279CliNom[0] ;
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

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod ,
                         String A4058CCFColNom ,
                         int A4059CCFColNum )
   {
      /* Using cursor T00IE14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCSerie", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCFCOLNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void gxload_4( String A396EmprCod ,
                         int A4031CCTCod )
   {
      /* Using cursor T00IE15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T00IE15_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4036CCTDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKeyIE628( )
   {
      /* Using cursor T00IE16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound628 = (short)(1) ;
      }
      else
      {
         RcdFound628 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00IE6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zmIE628( 1) ;
         RcdFound628 = (short)(1) ;
         A396EmprCod = T00IE6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00IE6_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00IE6_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4031CCTCod = T00IE6_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4058CCFColNom = T00IE6_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T00IE6_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4058CCFColNom = A4058CCFColNom ;
         Z4059CCFColNum = A4059CCFColNum ;
         Z4031CCTCod = A4031CCTCod ;
         sMode628 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadIE628( ) ;
         if ( AnyError == 1 )
         {
            RcdFound628 = (short)(0) ;
            initializeNonKeyIE628( ) ;
         }
         Gx_mode = sMode628 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound628 = (short)(0) ;
         initializeNonKeyIE628( ) ;
         sMode628 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode628 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyIE628( ) ;
      if ( RcdFound628 == 0 )
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
      RcdFound628 = (short)(0) ;
      /* Using cursor T00IE17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A4058CCFColNom, A4058CCFColNom, Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE17_A252CliCod[0] < A252CliCod ) || ( T00IE17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00IE17_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T00IE17_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE17_A4031CCTCod[0] < A4031CCTCod ) || ( T00IE17_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00IE17_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00IE17_A4058CCFColNom[0], A4058CCFColNom) < 0 ) || ( GXutil.strcmp(T00IE17_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( T00IE17_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00IE17_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE17_A4059CCFColNum[0] < A4059CCFColNum ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE17_A252CliCod[0] > A252CliCod ) || ( T00IE17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00IE17_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T00IE17_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE17_A4031CCTCod[0] > A4031CCTCod ) || ( T00IE17_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00IE17_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00IE17_A4058CCFColNom[0], A4058CCFColNom) > 0 ) || ( GXutil.strcmp(T00IE17_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( T00IE17_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00IE17_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE17_A4059CCFColNum[0] > A4059CCFColNum ) ) )
         {
            A396EmprCod = T00IE17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T00IE17_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T00IE17_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4031CCTCod = T00IE17_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4058CCFColNom = T00IE17_A4058CCFColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = T00IE17_A4059CCFColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            RcdFound628 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound628 = (short)(0) ;
      /* Using cursor T00IE18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, A4058CCFColNom, A4058CCFColNom, Integer.valueOf(A4031CCTCod), A65ArtCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE18_A252CliCod[0] > A252CliCod ) || ( T00IE18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00IE18_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T00IE18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE18_A4031CCTCod[0] > A4031CCTCod ) || ( T00IE18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00IE18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00IE18_A4058CCFColNom[0], A4058CCFColNom) > 0 ) || ( GXutil.strcmp(T00IE18_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( T00IE18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00IE18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE18_A4059CCFColNum[0] > A4059CCFColNum ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE18_A252CliCod[0] < A252CliCod ) || ( T00IE18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00IE18_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T00IE18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE18_A4031CCTCod[0] < A4031CCTCod ) || ( T00IE18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00IE18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00IE18_A4058CCFColNom[0], A4058CCFColNom) < 0 ) || ( GXutil.strcmp(T00IE18_A4058CCFColNom[0], A4058CCFColNom) == 0 ) && ( T00IE18_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00IE18_A65ArtCod[0], A65ArtCod) == 0 ) && ( T00IE18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00IE18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00IE18_A4059CCFColNum[0] < A4059CCFColNum ) ) )
         {
            A396EmprCod = T00IE18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T00IE18_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T00IE18_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4031CCTCod = T00IE18_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A4058CCFColNom = T00IE18_A4058CCFColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = T00IE18_A4059CCFColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            RcdFound628 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyIE628( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertIE628( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound628 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4058CCFColNom = Z4058CCFColNom ;
               httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
               A4059CCFColNum = Z4059CCFColNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
               updateIE628( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertIE628( ) ;
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
                  insertIE628( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) || ( A4031CCTCod != Z4031CCTCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = Z4058CCFColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = Z4059CCFColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
      getKeyIE628( ) ;
      if ( RcdFound628 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) || ( A4031CCTCod != Z4031CCTCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = Z65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4058CCFColNom = Z4058CCFColNom ;
            httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
            A4059CCFColNum = Z4059CCFColNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
            A4031CCTCod = Z4031CCTCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4058CCFColNom, Z4058CCFColNom) != 0 ) || ( A4059CCFColNum != Z4059CCFColNum ) || ( A4031CCTCod != Z4031CCTCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccstd");
   }

   public void insert_check( )
   {
      confirm_IE0( ) ;
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
      if ( RcdFound628 == 0 )
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
      scanStartIE628( ) ;
      if ( RcdFound628 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndIE628( ) ;
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
      if ( RcdFound628 == 0 )
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
      if ( RcdFound628 == 0 )
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
      scanStartIE628( ) ;
      if ( RcdFound628 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound628 != 0 )
         {
            scanNextIE628( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndIE628( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyIE628( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00IE5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCSer1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCSer1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertIE628( )
   {
      beforeValidateIE628( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIE628( ) ;
      }
      if ( AnyError == 0 )
      {
         zmIE628( 0) ;
         checkOptimisticConcurrencyIE628( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIE628( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertIE628( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IE19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(A4031CCTCod), A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        processLevelIE628( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionIE0( ) ;
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
            loadIE628( ) ;
         }
         endLevelIE628( ) ;
      }
      closeExtendedTableCursorsIE628( ) ;
   }

   public void updateIE628( )
   {
      beforeValidateIE628( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIE628( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIE628( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIE628( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateIE628( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCCSer1 */
                  deferredUpdateIE628( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelIE628( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionIE0( ) ;
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
         endLevelIE628( ) ;
      }
      closeExtendedTableCursorsIE628( ) ;
   }

   public void deferredUpdateIE628( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateIE628( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIE628( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsIE628( ) ;
         afterConfirmIE628( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteIE628( ) ;
            if ( AnyError == 0 )
            {
               scanStartIE629( ) ;
               while ( RcdFound629 != 0 )
               {
                  getByPrimaryKeyIE629( ) ;
                  deleteIE629( ) ;
                  scanNextIE629( ) ;
               }
               scanEndIE629( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IE20 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound628 == 0 )
                        {
                           initAllIE628( ) ;
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
                        resetCaptionIE0( ) ;
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
      sMode628 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelIE628( ) ;
      Gx_mode = sMode628 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsIE628( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00IE21 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         A407EmprNom = T00IE21_A407EmprNom[0] ;
         n407EmprNom = T00IE21_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(19);
         /* Using cursor T00IE22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T00IE22_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(20);
         /* Using cursor T00IE23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T00IE23_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         pr_default.close(21);
      }
   }

   public void processNestedLevelIE629( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRowIE629( ) ;
         if ( ( nRcdExists_629 != 0 ) || ( nIsMod_629 != 0 ) )
         {
            standaloneNotModalIE629( ) ;
            getKeyIE629( ) ;
            if ( ( nRcdExists_629 == 0 ) && ( nRcdDeleted_629 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertIE629( ) ;
            }
            else
            {
               if ( RcdFound629 != 0 )
               {
                  if ( ( nRcdDeleted_629 != 0 ) && ( nRcdExists_629 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteIE629( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_629 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateIE629( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_629 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_629_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( cmbCCTLinTpoD.getInternalname(), GXutil.rtrim( A4044CCTLinTpoD)) ;
         httpContext.changePostValue( edtCCTLinLgoD_Internalname, GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinPict_Internalname, GXutil.rtrim( A4046CCTLinPict)) ;
         httpContext.changePostValue( edtCCSVal_Internalname, GXutil.rtrim( A4060CCSVal)) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4060CCSVal_"+sGXsfl_65_idx, GXutil.rtrim( Z4060CCSVal)) ;
         httpContext.changePostValue( "ZT_"+"Z11482CCSMin_"+sGXsfl_65_idx, GXutil.rtrim( Z11482CCSMin)) ;
         httpContext.changePostValue( "ZT_"+"Z11483CCSMax_"+sGXsfl_65_idx, GXutil.rtrim( Z11483CCSMax)) ;
         httpContext.changePostValue( "ZT_"+"Z11530CCSAuto_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11530CCSAuto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11531CCSVCod_"+sGXsfl_65_idx, GXutil.rtrim( Z11531CCSVCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11532CCSVTol_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11532CCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13247CCSMetodo_"+sGXsfl_65_idx, GXutil.rtrim( Z13247CCSMetodo)) ;
         httpContext.changePostValue( "ZT_"+"Z13248CCSEspecif_"+sGXsfl_65_idx, GXutil.rtrim( Z13248CCSEspecif)) ;
         httpContext.changePostValue( "nRcdDeleted_629_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_629_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_629_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_629 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_629_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_629_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINTPOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINLGOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINPICT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCSVAL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCSVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllIE629( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_629 = (short)(0) ;
      nIsMod_629 = (short)(0) ;
      nRcdDeleted_629 = (short)(0) ;
   }

   public void processLevelIE628( )
   {
      /* Save parent mode. */
      sMode628 = Gx_mode ;
      processNestedLevelIE629( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode628 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelIE628( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteIE628( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccstd");
         if ( AnyError == 0 )
         {
            confirmValuesIE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tccstd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartIE628( )
   {
      /* Using cursor T00IE24 */
      pr_default.execute(22);
      RcdFound628 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound628 = (short)(1) ;
         A396EmprCod = T00IE24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00IE24_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00IE24_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = T00IE24_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T00IE24_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         A4031CCTCod = T00IE24_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextIE628( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound628 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound628 = (short)(1) ;
         A396EmprCod = T00IE24_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00IE24_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00IE24_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4058CCFColNom = T00IE24_A4058CCFColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
         A4059CCFColNum = T00IE24_A4059CCFColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
         A4031CCTCod = T00IE24_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
   }

   public void scanEndIE628( )
   {
      pr_default.close(22);
   }

   public void afterConfirmIE628( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertIE628( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateIE628( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteIE628( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteIE628( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateIE628( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesIE628( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCCFColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNom_Enabled), 5, 0), true);
      edtCCFColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFColNum_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
   }

   public void zmIE629( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4060CCSVal = T00IE3_A4060CCSVal[0] ;
            Z11482CCSMin = T00IE3_A11482CCSMin[0] ;
            Z11483CCSMax = T00IE3_A11483CCSMax[0] ;
            Z11530CCSAuto = T00IE3_A11530CCSAuto[0] ;
            Z11531CCSVCod = T00IE3_A11531CCSVCod[0] ;
            Z11532CCSVTol = T00IE3_A11532CCSVTol[0] ;
            Z13247CCSMetodo = T00IE3_A13247CCSMetodo[0] ;
            Z13248CCSEspecif = T00IE3_A13248CCSEspecif[0] ;
         }
         else
         {
            Z4060CCSVal = A4060CCSVal ;
            Z11482CCSMin = A11482CCSMin ;
            Z11483CCSMax = A11483CCSMax ;
            Z11530CCSAuto = A11530CCSAuto ;
            Z11531CCSVCod = A11531CCSVCod ;
            Z11532CCSVTol = A11532CCSVTol ;
            Z13247CCSMetodo = A13247CCSMetodo ;
            Z13248CCSEspecif = A13248CCSEspecif ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4058CCFColNom = A4058CCFColNom ;
         Z4059CCFColNum = A4059CCFColNum ;
         Z4060CCSVal = A4060CCSVal ;
         Z11482CCSMin = A11482CCSMin ;
         Z11483CCSMax = A11483CCSMax ;
         Z11530CCSAuto = A11530CCSAuto ;
         Z11531CCSVCod = A11531CCSVCod ;
         Z11532CCSVTol = A11532CCSVTol ;
         Z13247CCSMetodo = A13247CCSMetodo ;
         Z13248CCSEspecif = A13248CCSEspecif ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z4043CCTLinDsc = A4043CCTLinDsc ;
         Z4044CCTLinTpoD = A4044CCTLinTpoD ;
         Z4045CCTLinLgoD = A4045CCTLinLgoD ;
         Z4046CCTLinPict = A4046CCTLinPict ;
      }
   }

   public void standaloneNotModalIE629( )
   {
   }

   public void standaloneModalIE629( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtCCTLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void loadIE629( )
   {
      /* Using cursor T00IE25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound629 = (short)(1) ;
         A4043CCTLinDsc = T00IE25_A4043CCTLinDsc[0] ;
         A4044CCTLinTpoD = T00IE25_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = T00IE25_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = T00IE25_A4046CCTLinPict[0] ;
         A4060CCSVal = T00IE25_A4060CCSVal[0] ;
         n4060CCSVal = T00IE25_n4060CCSVal[0] ;
         A11482CCSMin = T00IE25_A11482CCSMin[0] ;
         n11482CCSMin = T00IE25_n11482CCSMin[0] ;
         A11483CCSMax = T00IE25_A11483CCSMax[0] ;
         n11483CCSMax = T00IE25_n11483CCSMax[0] ;
         A11530CCSAuto = T00IE25_A11530CCSAuto[0] ;
         A11531CCSVCod = T00IE25_A11531CCSVCod[0] ;
         A11532CCSVTol = T00IE25_A11532CCSVTol[0] ;
         A13247CCSMetodo = T00IE25_A13247CCSMetodo[0] ;
         n13247CCSMetodo = T00IE25_n13247CCSMetodo[0] ;
         A13248CCSEspecif = T00IE25_A13248CCSEspecif[0] ;
         n13248CCSEspecif = T00IE25_n13248CCSEspecif[0] ;
         zmIE629( -6) ;
      }
      pr_default.close(23);
      onLoadActionsIE629( ) ;
   }

   public void onLoadActionsIE629( )
   {
   }

   public void checkExtendedTableIE629( )
   {
      nIsDirty_629 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalIE629( ) ;
      /* Using cursor T00IE4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T00IE4_A4043CCTLinDsc[0] ;
      A4044CCTLinTpoD = T00IE4_A4044CCTLinTpoD[0] ;
      A4045CCTLinLgoD = T00IE4_A4045CCTLinLgoD[0] ;
      A4046CCTLinPict = T00IE4_A4046CCTLinPict[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsIE629( )
   {
      pr_default.close(2);
   }

   public void enableDisableIE629( )
   {
   }

   public void gxload_7( String A396EmprCod ,
                         int A4031CCTCod ,
                         short A4034CCTLin )
   {
      /* Using cursor T00IE26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T00IE26_A4043CCTLinDsc[0] ;
      A4044CCTLinTpoD = T00IE26_A4044CCTLinTpoD[0] ;
      A4045CCTLinLgoD = T00IE26_A4045CCTLinLgoD[0] ;
      A4046CCTLinPict = T00IE26_A4046CCTLinPict[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4043CCTLinDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4044CCTLinTpoD))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4046CCTLinPict))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKeyIE629( )
   {
      /* Using cursor T00IE27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound629 = (short)(1) ;
      }
      else
      {
         RcdFound629 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKeyIE629( )
   {
      /* Using cursor T00IE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmIE629( 6) ;
         RcdFound629 = (short)(1) ;
         initializeNonKeyIE629( ) ;
         A4060CCSVal = T00IE3_A4060CCSVal[0] ;
         n4060CCSVal = T00IE3_n4060CCSVal[0] ;
         A11482CCSMin = T00IE3_A11482CCSMin[0] ;
         n11482CCSMin = T00IE3_n11482CCSMin[0] ;
         A11483CCSMax = T00IE3_A11483CCSMax[0] ;
         n11483CCSMax = T00IE3_n11483CCSMax[0] ;
         A11530CCSAuto = T00IE3_A11530CCSAuto[0] ;
         A11531CCSVCod = T00IE3_A11531CCSVCod[0] ;
         A11532CCSVTol = T00IE3_A11532CCSVTol[0] ;
         A13247CCSMetodo = T00IE3_A13247CCSMetodo[0] ;
         n13247CCSMetodo = T00IE3_n13247CCSMetodo[0] ;
         A13248CCSEspecif = T00IE3_A13248CCSEspecif[0] ;
         n13248CCSEspecif = T00IE3_n13248CCSEspecif[0] ;
         A4034CCTLin = T00IE3_A4034CCTLin[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4058CCFColNom = A4058CCFColNom ;
         Z4059CCFColNum = A4059CCFColNum ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode629 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalIE629( ) ;
         loadIE629( ) ;
         Gx_mode = sMode629 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound629 = (short)(0) ;
         initializeNonKeyIE629( ) ;
         sMode629 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalIE629( ) ;
         Gx_mode = sMode629 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesIE629( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyIE629( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00IE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCSta"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4060CCSVal, T00IE2_A4060CCSVal[0]) != 0 ) || ( GXutil.strcmp(Z11482CCSMin, T00IE2_A11482CCSMin[0]) != 0 ) || ( GXutil.strcmp(Z11483CCSMax, T00IE2_A11483CCSMax[0]) != 0 ) || ( Z11530CCSAuto != T00IE2_A11530CCSAuto[0] ) || ( GXutil.strcmp(Z11531CCSVCod, T00IE2_A11531CCSVCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11532CCSVTol, T00IE2_A11532CCSVTol[0]) != 0 ) || ( GXutil.strcmp(Z13247CCSMetodo, T00IE2_A13247CCSMetodo[0]) != 0 ) || ( GXutil.strcmp(Z13248CCSEspecif, T00IE2_A13248CCSEspecif[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4060CCSVal, T00IE2_A4060CCSVal[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccstd:[seudo value changed for attri]"+"CCSVal");
               GXutil.writeLogRaw("Old: ",Z4060CCSVal);
               GXutil.writeLogRaw("Current: ",T00IE2_A4060CCSVal[0]);
            }
            if ( GXutil.strcmp(Z11482CCSMin, T00IE2_A11482CCSMin[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccstd:[seudo value changed for attri]"+"CCSMin");
               GXutil.writeLogRaw("Old: ",Z11482CCSMin);
               GXutil.writeLogRaw("Current: ",T00IE2_A11482CCSMin[0]);
            }
            if ( GXutil.strcmp(Z11483CCSMax, T00IE2_A11483CCSMax[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccstd:[seudo value changed for attri]"+"CCSMax");
               GXutil.writeLogRaw("Old: ",Z11483CCSMax);
               GXutil.writeLogRaw("Current: ",T00IE2_A11483CCSMax[0]);
            }
            if ( Z11530CCSAuto != T00IE2_A11530CCSAuto[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tccstd:[seudo value changed for attri]"+"CCSAuto");
               GXutil.writeLogRaw("Old: ",Z11530CCSAuto);
               GXutil.writeLogRaw("Current: ",T00IE2_A11530CCSAuto[0]);
            }
            if ( GXutil.strcmp(Z11531CCSVCod, T00IE2_A11531CCSVCod[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccstd:[seudo value changed for attri]"+"CCSVCod");
               GXutil.writeLogRaw("Old: ",Z11531CCSVCod);
               GXutil.writeLogRaw("Current: ",T00IE2_A11531CCSVCod[0]);
            }
            if ( DecimalUtil.compareTo(Z11532CCSVTol, T00IE2_A11532CCSVTol[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccstd:[seudo value changed for attri]"+"CCSVTol");
               GXutil.writeLogRaw("Old: ",Z11532CCSVTol);
               GXutil.writeLogRaw("Current: ",T00IE2_A11532CCSVTol[0]);
            }
            if ( GXutil.strcmp(Z13247CCSMetodo, T00IE2_A13247CCSMetodo[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccstd:[seudo value changed for attri]"+"CCSMetodo");
               GXutil.writeLogRaw("Old: ",Z13247CCSMetodo);
               GXutil.writeLogRaw("Current: ",T00IE2_A13247CCSMetodo[0]);
            }
            if ( GXutil.strcmp(Z13248CCSEspecif, T00IE2_A13248CCSEspecif[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tccstd:[seudo value changed for attri]"+"CCSEspecif");
               GXutil.writeLogRaw("Old: ",Z13248CCSEspecif);
               GXutil.writeLogRaw("Current: ",T00IE2_A13248CCSEspecif[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCSta"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertIE629( )
   {
      beforeValidateIE629( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIE629( ) ;
      }
      if ( AnyError == 0 )
      {
         zmIE629( 0) ;
         checkOptimisticConcurrencyIE629( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmIE629( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertIE629( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00IE28 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Boolean.valueOf(n4060CCSVal), A4060CCSVal, Boolean.valueOf(n11482CCSMin), A11482CCSMin, Boolean.valueOf(n11483CCSMax), A11483CCSMax, Byte.valueOf(A11530CCSAuto), A11531CCSVCod, A11532CCSVTol, Boolean.valueOf(n13247CCSMetodo), A13247CCSMetodo, Boolean.valueOf(n13248CCSEspecif), A13248CCSEspecif, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
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
            loadIE629( ) ;
         }
         endLevelIE629( ) ;
      }
      closeExtendedTableCursorsIE629( ) ;
   }

   public void updateIE629( )
   {
      beforeValidateIE629( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableIE629( ) ;
      }
      if ( ( nIsMod_629 != 0 ) || ( nIsDirty_629 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyIE629( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmIE629( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateIE629( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00IE29 */
                     pr_default.execute(27, new Object[] {Boolean.valueOf(n4060CCSVal), A4060CCSVal, Boolean.valueOf(n11482CCSMin), A11482CCSMin, Boolean.valueOf(n11483CCSMax), A11483CCSMax, Byte.valueOf(A11530CCSAuto), A11531CCSVCod, A11532CCSVTol, Boolean.valueOf(n13247CCSMetodo), A13247CCSMetodo, Boolean.valueOf(n13248CCSEspecif), A13248CCSEspecif, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCSta"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateIE629( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyIE629( ) ;
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
            endLevelIE629( ) ;
         }
      }
      closeExtendedTableCursorsIE629( ) ;
   }

   public void deferredUpdateIE629( )
   {
   }

   public void deleteIE629( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateIE629( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyIE629( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsIE629( ) ;
         afterConfirmIE629( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteIE629( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00IE30 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
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
      sMode629 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelIE629( ) ;
      Gx_mode = sMode629 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsIE629( )
   {
      standaloneModalIE629( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00IE31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         A4043CCTLinDsc = T00IE31_A4043CCTLinDsc[0] ;
         A4044CCTLinTpoD = T00IE31_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = T00IE31_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = T00IE31_A4046CCTLinPict[0] ;
         pr_default.close(29);
      }
   }

   public void endLevelIE629( )
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

   public void scanStartIE629( )
   {
      /* Scan By routine */
      /* Using cursor T00IE32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      RcdFound629 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound629 = (short)(1) ;
         A4034CCTLin = T00IE32_A4034CCTLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextIE629( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound629 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound629 = (short)(1) ;
         A4034CCTLin = T00IE32_A4034CCTLin[0] ;
      }
   }

   public void scanEndIE629( )
   {
      pr_default.close(30);
   }

   public void afterConfirmIE629( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertIE629( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateIE629( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteIE629( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteIE629( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateIE629( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesIE629( )
   {
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtCCTLinDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      cmbCCTLinTpoD.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTLinTpoD.getEnabled(), 5, 0), !bGXsfl_65_Refreshing);
      edtCCTLinLgoD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinLgoD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinLgoD_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtCCTLinPict_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinPict_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinPict_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtCCSVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCSVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCSVal_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashesIE629( )
   {
   }

   public void send_integrity_lvl_hashesIE628( )
   {
   }

   public void subsflControlProps_65629( )
   {
      edtavnRcdDeleted_629_Internalname = "vNRCDDELETED_629_"+sGXsfl_65_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_65_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_65_idx ;
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD_"+sGXsfl_65_idx );
      edtCCTLinLgoD_Internalname = "CCTLINLGOD_"+sGXsfl_65_idx ;
      edtCCTLinPict_Internalname = "CCTLINPICT_"+sGXsfl_65_idx ;
      edtCCSVal_Internalname = "CCSVAL_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_65629( )
   {
      edtavnRcdDeleted_629_Internalname = "vNRCDDELETED_629_"+sGXsfl_65_fel_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_65_fel_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_65_fel_idx ;
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD_"+sGXsfl_65_fel_idx );
      edtCCTLinLgoD_Internalname = "CCTLINLGOD_"+sGXsfl_65_fel_idx ;
      edtCCTLinPict_Internalname = "CCTLINPICT_"+sGXsfl_65_fel_idx ;
      edtCCSVal_Internalname = "CCSVAL_"+sGXsfl_65_fel_idx ;
   }

   public void addRowIE629( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65629( ) ;
      sendRowIE629( ) ;
   }

   public void sendRowIE629( )
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_629_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_629_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_629_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_629), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_629), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_629_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_629_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_629_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,GXutil.rtrim( A4043CCTLinDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLinDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      GXCCtl = "CCTLINTPOD_" + sGXsfl_65_idx ;
      cmbCCTLinTpoD.setName( GXCCtl );
      cmbCCTLinTpoD.setWebtags( "" );
      cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCCTLinTpoD,cmbCCTLinTpoD.getInternalname(),GXutil.rtrim( A4044CCTLinTpoD),Integer.valueOf(1),cmbCCTLinTpoD.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbCCTLinTpoD.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), !bGXsfl_65_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinLgoD_Internalname,GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCCTLinLgoD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinLgoD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLinLgoD_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinPict_Internalname,GXutil.rtrim( A4046CCTLinPict),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinPict_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLinPict_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_629_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCSVal_Internalname,GXutil.rtrim( A4060CCSVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCSVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCSVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesIE629( ) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4060CCSVal_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4060CCSVal));
      GXCCtl = "Z11482CCSMin_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11482CCSMin));
      GXCCtl = "Z11483CCSMax_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11483CCSMax));
      GXCCtl = "Z11530CCSAuto_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11530CCSAuto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11531CCSVCod_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11531CCSVCod));
      GXCCtl = "Z11532CCSVTol_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11532CCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13247CCSMetodo_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13247CCSMetodo));
      GXCCtl = "Z13248CCSEspecif_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13248CCSEspecif));
      GXCCtl = "nRcdDeleted_629_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_629_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_629_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_629, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_629_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_629_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINTPOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINLGOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINPICT_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSVAL_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCSVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowIE629( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65629( ) ;
      edtavnRcdDeleted_629_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_629_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCCTLinTpoD.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINTPOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtCCTLinLgoD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINLGOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinPict_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINPICT_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCSVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCSVAL_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_629_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_629_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_629");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_629_Internalname ;
         wbErr = true ;
         nRcdDeleted_629 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_629 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_629_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         wbErr = true ;
         A4034CCTLin = (short)(0) ;
      }
      else
      {
         A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
      cmbCCTLinTpoD.setName( cmbCCTLinTpoD.getInternalname() );
      cmbCCTLinTpoD.setValue( httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) );
      A4044CCTLinTpoD = httpContext.cgiGet( cmbCCTLinTpoD.getInternalname()) ;
      A4045CCTLinLgoD = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLinLgoD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4046CCTLinPict = httpContext.cgiGet( edtCCTLinPict_Internalname) ;
      A4060CCSVal = httpContext.cgiGet( edtCCSVal_Internalname) ;
      n4060CCSVal = false ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_65_idx ;
      Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4060CCSVal_" + sGXsfl_65_idx ;
      Z4060CCSVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11482CCSMin_" + sGXsfl_65_idx ;
      Z11482CCSMin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11483CCSMax_" + sGXsfl_65_idx ;
      Z11483CCSMax = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11530CCSAuto_" + sGXsfl_65_idx ;
      Z11530CCSAuto = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11531CCSVCod_" + sGXsfl_65_idx ;
      Z11531CCSVCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11532CCSVTol_" + sGXsfl_65_idx ;
      Z11532CCSVTol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13247CCSMetodo_" + sGXsfl_65_idx ;
      Z13247CCSMetodo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13248CCSEspecif_" + sGXsfl_65_idx ;
      Z13248CCSEspecif = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11482CCSMin_" + sGXsfl_65_idx ;
      A11482CCSMin = httpContext.cgiGet( GXCCtl) ;
      n11482CCSMin = false ;
      GXCCtl = "Z11483CCSMax_" + sGXsfl_65_idx ;
      A11483CCSMax = httpContext.cgiGet( GXCCtl) ;
      n11483CCSMax = false ;
      GXCCtl = "Z11530CCSAuto_" + sGXsfl_65_idx ;
      A11530CCSAuto = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11531CCSVCod_" + sGXsfl_65_idx ;
      A11531CCSVCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11532CCSVTol_" + sGXsfl_65_idx ;
      A11532CCSVTol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13247CCSMetodo_" + sGXsfl_65_idx ;
      A13247CCSMetodo = httpContext.cgiGet( GXCCtl) ;
      n13247CCSMetodo = false ;
      GXCCtl = "Z13248CCSEspecif_" + sGXsfl_65_idx ;
      A13248CCSEspecif = httpContext.cgiGet( GXCCtl) ;
      n13248CCSEspecif = false ;
      GXCCtl = "nRcdDeleted_629_" + sGXsfl_65_idx ;
      nRcdDeleted_629 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_629_" + sGXsfl_65_idx ;
      nRcdExists_629 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_629_" + sGXsfl_65_idx ;
      nIsMod_629 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCCTLin_Enabled = edtCCTLin_Enabled ;
   }

   public void confirmValuesIE0( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65629( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65629( ) ;
         httpContext.changePostValue( "Z4034CCTLin_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z4034CCTLin_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z4060CCSVal_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z4060CCSVal_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4060CCSVal_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11482CCSMin_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11482CCSMin_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11482CCSMin_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11483CCSMax_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11483CCSMax_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11483CCSMax_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11530CCSAuto_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11530CCSAuto_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11530CCSAuto_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11531CCSVCod_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11531CCSVCod_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11531CCSVCod_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11532CCSVTol_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11532CCSVTol_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11532CCSVTol_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z13247CCSMetodo_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z13247CCSMetodo_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13247CCSMetodo_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z13248CCSEspecif_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z13248CCSEspecif_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13248CCSEspecif_"+sGXsfl_65_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.tccstd", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4058CCFColNom", GXutil.rtrim( Z4058CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4059CCFColNum", GXutil.ltrim( localUtil.ntoc( Z4059CCFColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSMIN", GXutil.rtrim( A11482CCSMin));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSMAX", GXutil.rtrim( A11483CCSMax));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSAUTO", GXutil.ltrim( localUtil.ntoc( A11530CCSAuto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSVCOD", GXutil.rtrim( A11531CCSVCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSVTOL", GXutil.ltrim( localUtil.ntoc( A11532CCSVTol, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSMETODO", GXutil.rtrim( A13247CCSMetodo));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSESPECIF", GXutil.rtrim( A13248CCSEspecif));
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
      return AForm ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.controlcalidadhtd.tccstd", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.TCCStd" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control de Calidad Standard", "") ;
   }

   public void initializeNonKeyIE628( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A4036CCTDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
   }

   public void initAllIE628( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A4058CCFColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4058CCFColNom", A4058CCFColNom);
      A4059CCFColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4059CCFColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4059CCFColNum), 6, 0));
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      initializeNonKeyIE628( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyIE629( )
   {
      A4043CCTLinDsc = "" ;
      A4044CCTLinTpoD = "" ;
      A4045CCTLinLgoD = (short)(0) ;
      A4046CCTLinPict = "" ;
      A4060CCSVal = "" ;
      n4060CCSVal = false ;
      A11482CCSMin = "" ;
      n11482CCSMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11482CCSMin", A11482CCSMin);
      A11483CCSMax = "" ;
      n11483CCSMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11483CCSMax", A11483CCSMax);
      A11530CCSAuto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11530CCSAuto", GXutil.str( A11530CCSAuto, 1, 0));
      A11531CCSVCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11531CCSVCod", A11531CCSVCod);
      A11532CCSVTol = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11532CCSVTol", GXutil.ltrimstr( A11532CCSVTol, 5, 2));
      A13247CCSMetodo = "" ;
      n13247CCSMetodo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13247CCSMetodo", A13247CCSMetodo);
      A13248CCSEspecif = "" ;
      n13248CCSEspecif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13248CCSEspecif", A13248CCSEspecif);
      Z4060CCSVal = "" ;
      Z11482CCSMin = "" ;
      Z11483CCSMax = "" ;
      Z11530CCSAuto = (byte)(0) ;
      Z11531CCSVCod = "" ;
      Z11532CCSVTol = DecimalUtil.ZERO ;
      Z13247CCSMetodo = "" ;
      Z13248CCSEspecif = "" ;
   }

   public void initAllIE629( )
   {
      A4034CCTLin = (short)(0) ;
      initializeNonKeyIE629( ) ;
   }

   public void standaloneModalInsertIE629( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241515285", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/tccstd.js", "?20268241515285", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties629( )
   {
      edtCCTLin_Enabled = defedtCCTLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_629, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_629_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4043CCTLinDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4044CCTLinTpoD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCCTLinTpoD.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinLgoD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4046CCTLinPict));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinPict_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4060CCSVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCSVal_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCCFColNom_Internalname = "CCFCOLNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCCFColNum_Internalname = "CCFCOLNUM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      edtavnRcdDeleted_629_Internalname = "vNRCDDELETED_629" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      cmbCCTLinTpoD.setInternalname( "CCTLINTPOD" );
      edtCCTLinLgoD_Internalname = "CCTLINLGOD" ;
      edtCCTLinPict_Internalname = "CCTLINPICT" ;
      edtCCSVal_Internalname = "CCSVAL" ;
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
      Form.setCaption( httpContext.getMessage( "Control de Calidad Standard", "") );
      edtCCSVal_Jsonclick = "" ;
      edtCCTLinPict_Jsonclick = "" ;
      edtCCTLinLgoD_Jsonclick = "" ;
      cmbCCTLinTpoD.setJsonclick( "" );
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLin_Jsonclick = "" ;
      edtavnRcdDeleted_629_Jsonclick = "" ;
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
      edtCCSVal_Enabled = 1 ;
      edtCCTLinPict_Enabled = 0 ;
      edtCCTLinLgoD_Enabled = 0 ;
      cmbCCTLinTpoD.setEnabled( 0 );
      edtCCTLinDsc_Enabled = 0 ;
      edtCCTLin_Enabled = 1 ;
      edtavnRcdDeleted_629_Enabled = 1 ;
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCCTDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCTCod_Enabled = 1 ;
      edtCCFColNum_Jsonclick = "" ;
      edtCCFColNum_Backcolor = (int)(0xFFFFFF) ;
      edtCCFColNum_Enabled = 1 ;
      edtCCFColNom_Jsonclick = "" ;
      edtCCFColNom_Backcolor = (int)(0xFFFFFF) ;
      edtCCFColNom_Enabled = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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
      subsflControlProps_65629( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalIE629( ) ;
         standaloneModalIE629( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowIE629( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65629( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "CCTLINTPOD_" + sGXsfl_65_idx ;
      cmbCCTLinTpoD.setName( GXCCtl );
      cmbCCTLinTpoD.setWebtags( "" );
      cmbCCTLinTpoD.addItem("F", httpContext.getMessage( "Fecha", ""), (short)(0));
      cmbCCTLinTpoD.addItem("N", httpContext.getMessage( "Numérico", ""), (short)(0));
      cmbCCTLinTpoD.addItem("H", httpContext.getMessage( "Hora", ""), (short)(0));
      cmbCCTLinTpoD.addItem("C", httpContext.getMessage( "Caracteres", ""), (short)(0));
      cmbCCTLinTpoD.addItem("T", httpContext.getMessage( "Título", ""), (short)(0));
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00IE21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00IE21_A407EmprNom[0] ;
      n407EmprNom = T00IE21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      /* Using cursor T00IE22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00IE22_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(20);
      /* Using cursor T00IE33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCSerie", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCFCOLNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(31);
      /* Using cursor T00IE23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T00IE23_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(21);
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
      /* Using cursor T00IE21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00IE21_A407EmprNom[0] ;
      n407EmprNom = T00IE21_n407EmprNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      /* Using cursor T00IE22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T00IE22_A279CliNom[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Ccfcolnum( )
   {
      /* Using cursor T00IE33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCSerie", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCFCOLNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Cctcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00IE23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A4036CCTDsc = T00IE23_A4036CCTDsc[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4058CCFColNom", GXutil.rtrim( Z4058CCFColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4059CCFColNum", GXutil.ltrim( localUtil.ntoc( Z4059CCFColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4036CCTDsc", GXutil.rtrim( Z4036CCTDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cctlin( )
   {
      A4044CCTLinTpoD = cmbCCTLinTpoD.getValue() ;
      cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      /* Using cursor T00IE31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
      }
      A4043CCTLinDsc = T00IE31_A4043CCTLinDsc[0] ;
      A4044CCTLinTpoD = T00IE31_A4044CCTLinTpoD[0] ;
      cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      A4045CCTLinLgoD = T00IE31_A4045CCTLinLgoD[0] ;
      A4046CCTLinPict = T00IE31_A4046CCTLinPict[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      if ( cmbCCTLinTpoD.getItemCount() > 0 )
      {
         A4044CCTLinTpoD = cmbCCTLinTpoD.getValidValue(A4044CCTLinTpoD) ;
         cmbCCTLinTpoD.setValue( A4044CCTLinTpoD );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4044CCTLinTpoD", GXutil.rtrim( A4044CCTLinTpoD));
      cmbCCTLinTpoD.setValue( GXutil.rtrim( A4044CCTLinTpoD) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTLinTpoD.getInternalname(), "Values", cmbCCTLinTpoD.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4045CCTLinLgoD", GXutil.ltrim( localUtil.ntoc( A4045CCTLinLgoD, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4046CCTLinPict", GXutil.rtrim( A4046CCTLinPict));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_CCFCOLNOM","{handler:'valid_Ccfcolnom',iparms:[]");
      setEventMetadata("VALID_CCFCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_CCFCOLNUM","{handler:'valid_Ccfcolnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CCFCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4058CCFColNom',fld:'CCFCOLNOM',pic:''},{av:'A4059CCFColNum',fld:'CCFCOLNUM',pic:'ZZZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z4058CCFColNom'},{av:'Z4059CCFColNum'},{av:'Z4031CCTCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z4036CCTDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'cmbCCTLinTpoD'},{av:'A4044CCTLinTpoD',fld:'CCTLINTPOD',pic:''},{av:'A4045CCTLinLgoD',fld:'CCTLINLGOD',pic:'ZZ9'},{av:'A4046CCTLinPict',fld:'CCTLINPICT',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ccsval',iparms:[]");
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
      pr_default.close(20);
      pr_default.close(19);
      pr_default.close(21);
      pr_default.close(31);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z4058CCFColNom = "" ;
      Z4060CCSVal = "" ;
      Z11482CCSMin = "" ;
      Z11483CCSMax = "" ;
      Z11531CCSVCod = "" ;
      Z11532CCSVTol = DecimalUtil.ZERO ;
      Z13247CCSMetodo = "" ;
      Z13248CCSEspecif = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A4058CCFColNom = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      AForm = new com.genexus.webpanels.GXWebForm();
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
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A4036CCTDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode629 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A11482CCSMin = "" ;
      A11483CCSMax = "" ;
      A11531CCSVCod = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A13247CCSMetodo = "" ;
      A13248CCSEspecif = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode628 = "" ;
      GXCCtl = "" ;
      A4043CCTLinDsc = "" ;
      A4044CCTLinTpoD = "" ;
      A4046CCTLinPict = "" ;
      A4060CCSVal = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z4036CCTDsc = "" ;
      T00IE11_A407EmprNom = new String[] {""} ;
      T00IE11_n407EmprNom = new boolean[] {false} ;
      T00IE11_A279CliNom = new String[] {""} ;
      T00IE11_A4036CCTDsc = new String[] {""} ;
      T00IE11_A396EmprCod = new String[] {""} ;
      T00IE11_A252CliCod = new int[1] ;
      T00IE11_A65ArtCod = new String[] {""} ;
      T00IE11_A4031CCTCod = new int[1] ;
      T00IE11_A4058CCFColNom = new String[] {""} ;
      T00IE11_A4059CCFColNum = new int[1] ;
      T00IE7_A407EmprNom = new String[] {""} ;
      T00IE7_n407EmprNom = new boolean[] {false} ;
      T00IE8_A279CliNom = new String[] {""} ;
      T00IE10_A396EmprCod = new String[] {""} ;
      T00IE9_A4036CCTDsc = new String[] {""} ;
      T00IE12_A407EmprNom = new String[] {""} ;
      T00IE12_n407EmprNom = new boolean[] {false} ;
      T00IE13_A279CliNom = new String[] {""} ;
      T00IE14_A396EmprCod = new String[] {""} ;
      T00IE15_A4036CCTDsc = new String[] {""} ;
      T00IE16_A396EmprCod = new String[] {""} ;
      T00IE16_A252CliCod = new int[1] ;
      T00IE16_A65ArtCod = new String[] {""} ;
      T00IE16_A4058CCFColNom = new String[] {""} ;
      T00IE16_A4059CCFColNum = new int[1] ;
      T00IE16_A4031CCTCod = new int[1] ;
      T00IE6_A396EmprCod = new String[] {""} ;
      T00IE6_A252CliCod = new int[1] ;
      T00IE6_A65ArtCod = new String[] {""} ;
      T00IE6_A4031CCTCod = new int[1] ;
      T00IE6_A4058CCFColNom = new String[] {""} ;
      T00IE6_A4059CCFColNum = new int[1] ;
      T00IE17_A396EmprCod = new String[] {""} ;
      T00IE17_A252CliCod = new int[1] ;
      T00IE17_A65ArtCod = new String[] {""} ;
      T00IE17_A4031CCTCod = new int[1] ;
      T00IE17_A4058CCFColNom = new String[] {""} ;
      T00IE17_A4059CCFColNum = new int[1] ;
      T00IE18_A396EmprCod = new String[] {""} ;
      T00IE18_A252CliCod = new int[1] ;
      T00IE18_A65ArtCod = new String[] {""} ;
      T00IE18_A4031CCTCod = new int[1] ;
      T00IE18_A4058CCFColNom = new String[] {""} ;
      T00IE18_A4059CCFColNum = new int[1] ;
      T00IE5_A396EmprCod = new String[] {""} ;
      T00IE5_A252CliCod = new int[1] ;
      T00IE5_A65ArtCod = new String[] {""} ;
      T00IE5_A4031CCTCod = new int[1] ;
      T00IE5_A4058CCFColNom = new String[] {""} ;
      T00IE5_A4059CCFColNum = new int[1] ;
      T00IE21_A407EmprNom = new String[] {""} ;
      T00IE21_n407EmprNom = new boolean[] {false} ;
      T00IE22_A279CliNom = new String[] {""} ;
      T00IE23_A4036CCTDsc = new String[] {""} ;
      T00IE24_A396EmprCod = new String[] {""} ;
      T00IE24_A252CliCod = new int[1] ;
      T00IE24_A65ArtCod = new String[] {""} ;
      T00IE24_A4058CCFColNom = new String[] {""} ;
      T00IE24_A4059CCFColNum = new int[1] ;
      T00IE24_A4031CCTCod = new int[1] ;
      Z4043CCTLinDsc = "" ;
      Z4044CCTLinTpoD = "" ;
      Z4046CCTLinPict = "" ;
      T00IE25_A252CliCod = new int[1] ;
      T00IE25_A65ArtCod = new String[] {""} ;
      T00IE25_A4058CCFColNom = new String[] {""} ;
      T00IE25_A4059CCFColNum = new int[1] ;
      T00IE25_A4043CCTLinDsc = new String[] {""} ;
      T00IE25_A4044CCTLinTpoD = new String[] {""} ;
      T00IE25_A4045CCTLinLgoD = new short[1] ;
      T00IE25_A4046CCTLinPict = new String[] {""} ;
      T00IE25_A4060CCSVal = new String[] {""} ;
      T00IE25_n4060CCSVal = new boolean[] {false} ;
      T00IE25_A11482CCSMin = new String[] {""} ;
      T00IE25_n11482CCSMin = new boolean[] {false} ;
      T00IE25_A11483CCSMax = new String[] {""} ;
      T00IE25_n11483CCSMax = new boolean[] {false} ;
      T00IE25_A11530CCSAuto = new byte[1] ;
      T00IE25_A11531CCSVCod = new String[] {""} ;
      T00IE25_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00IE25_A13247CCSMetodo = new String[] {""} ;
      T00IE25_n13247CCSMetodo = new boolean[] {false} ;
      T00IE25_A13248CCSEspecif = new String[] {""} ;
      T00IE25_n13248CCSEspecif = new boolean[] {false} ;
      T00IE25_A396EmprCod = new String[] {""} ;
      T00IE25_A4031CCTCod = new int[1] ;
      T00IE25_A4034CCTLin = new short[1] ;
      T00IE4_A4043CCTLinDsc = new String[] {""} ;
      T00IE4_A4044CCTLinTpoD = new String[] {""} ;
      T00IE4_A4045CCTLinLgoD = new short[1] ;
      T00IE4_A4046CCTLinPict = new String[] {""} ;
      T00IE26_A4043CCTLinDsc = new String[] {""} ;
      T00IE26_A4044CCTLinTpoD = new String[] {""} ;
      T00IE26_A4045CCTLinLgoD = new short[1] ;
      T00IE26_A4046CCTLinPict = new String[] {""} ;
      T00IE27_A396EmprCod = new String[] {""} ;
      T00IE27_A252CliCod = new int[1] ;
      T00IE27_A65ArtCod = new String[] {""} ;
      T00IE27_A4058CCFColNom = new String[] {""} ;
      T00IE27_A4059CCFColNum = new int[1] ;
      T00IE27_A4031CCTCod = new int[1] ;
      T00IE27_A4034CCTLin = new short[1] ;
      T00IE3_A252CliCod = new int[1] ;
      T00IE3_A65ArtCod = new String[] {""} ;
      T00IE3_A4058CCFColNom = new String[] {""} ;
      T00IE3_A4059CCFColNum = new int[1] ;
      T00IE3_A4060CCSVal = new String[] {""} ;
      T00IE3_n4060CCSVal = new boolean[] {false} ;
      T00IE3_A11482CCSMin = new String[] {""} ;
      T00IE3_n11482CCSMin = new boolean[] {false} ;
      T00IE3_A11483CCSMax = new String[] {""} ;
      T00IE3_n11483CCSMax = new boolean[] {false} ;
      T00IE3_A11530CCSAuto = new byte[1] ;
      T00IE3_A11531CCSVCod = new String[] {""} ;
      T00IE3_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00IE3_A13247CCSMetodo = new String[] {""} ;
      T00IE3_n13247CCSMetodo = new boolean[] {false} ;
      T00IE3_A13248CCSEspecif = new String[] {""} ;
      T00IE3_n13248CCSEspecif = new boolean[] {false} ;
      T00IE3_A396EmprCod = new String[] {""} ;
      T00IE3_A4031CCTCod = new int[1] ;
      T00IE3_A4034CCTLin = new short[1] ;
      T00IE2_A252CliCod = new int[1] ;
      T00IE2_A65ArtCod = new String[] {""} ;
      T00IE2_A4058CCFColNom = new String[] {""} ;
      T00IE2_A4059CCFColNum = new int[1] ;
      T00IE2_A4060CCSVal = new String[] {""} ;
      T00IE2_n4060CCSVal = new boolean[] {false} ;
      T00IE2_A11482CCSMin = new String[] {""} ;
      T00IE2_n11482CCSMin = new boolean[] {false} ;
      T00IE2_A11483CCSMax = new String[] {""} ;
      T00IE2_n11483CCSMax = new boolean[] {false} ;
      T00IE2_A11530CCSAuto = new byte[1] ;
      T00IE2_A11531CCSVCod = new String[] {""} ;
      T00IE2_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00IE2_A13247CCSMetodo = new String[] {""} ;
      T00IE2_n13247CCSMetodo = new boolean[] {false} ;
      T00IE2_A13248CCSEspecif = new String[] {""} ;
      T00IE2_n13248CCSEspecif = new boolean[] {false} ;
      T00IE2_A396EmprCod = new String[] {""} ;
      T00IE2_A4031CCTCod = new int[1] ;
      T00IE2_A4034CCTLin = new short[1] ;
      T00IE31_A4043CCTLinDsc = new String[] {""} ;
      T00IE31_A4044CCTLinTpoD = new String[] {""} ;
      T00IE31_A4045CCTLinLgoD = new short[1] ;
      T00IE31_A4046CCTLinPict = new String[] {""} ;
      T00IE32_A396EmprCod = new String[] {""} ;
      T00IE32_A252CliCod = new int[1] ;
      T00IE32_A65ArtCod = new String[] {""} ;
      T00IE32_A4058CCFColNom = new String[] {""} ;
      T00IE32_A4059CCFColNum = new int[1] ;
      T00IE32_A4031CCTCod = new int[1] ;
      T00IE32_A4034CCTLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AForm = new com.genexus.webpanels.GXWebForm();
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00IE33_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ4058CCFColNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ4036CCTDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccstd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccstd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccstd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccstd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tccstd__default(),
         new Object[] {
             new Object[] {
            T00IE2_A252CliCod, T00IE2_A65ArtCod, T00IE2_A4058CCFColNom, T00IE2_A4059CCFColNum, T00IE2_A4060CCSVal, T00IE2_n4060CCSVal, T00IE2_A11482CCSMin, T00IE2_n11482CCSMin, T00IE2_A11483CCSMax, T00IE2_n11483CCSMax,
            T00IE2_A11530CCSAuto, T00IE2_A11531CCSVCod, T00IE2_A11532CCSVTol, T00IE2_A13247CCSMetodo, T00IE2_n13247CCSMetodo, T00IE2_A13248CCSEspecif, T00IE2_n13248CCSEspecif, T00IE2_A396EmprCod, T00IE2_A4031CCTCod, T00IE2_A4034CCTLin
            }
            , new Object[] {
            T00IE3_A252CliCod, T00IE3_A65ArtCod, T00IE3_A4058CCFColNom, T00IE3_A4059CCFColNum, T00IE3_A4060CCSVal, T00IE3_n4060CCSVal, T00IE3_A11482CCSMin, T00IE3_n11482CCSMin, T00IE3_A11483CCSMax, T00IE3_n11483CCSMax,
            T00IE3_A11530CCSAuto, T00IE3_A11531CCSVCod, T00IE3_A11532CCSVTol, T00IE3_A13247CCSMetodo, T00IE3_n13247CCSMetodo, T00IE3_A13248CCSEspecif, T00IE3_n13248CCSEspecif, T00IE3_A396EmprCod, T00IE3_A4031CCTCod, T00IE3_A4034CCTLin
            }
            , new Object[] {
            T00IE4_A4043CCTLinDsc, T00IE4_A4044CCTLinTpoD, T00IE4_A4045CCTLinLgoD, T00IE4_A4046CCTLinPict
            }
            , new Object[] {
            T00IE5_A396EmprCod, T00IE5_A252CliCod, T00IE5_A65ArtCod, T00IE5_A4031CCTCod, T00IE5_A4058CCFColNom, T00IE5_A4059CCFColNum
            }
            , new Object[] {
            T00IE6_A396EmprCod, T00IE6_A252CliCod, T00IE6_A65ArtCod, T00IE6_A4031CCTCod, T00IE6_A4058CCFColNom, T00IE6_A4059CCFColNum
            }
            , new Object[] {
            T00IE7_A407EmprNom, T00IE7_n407EmprNom
            }
            , new Object[] {
            T00IE8_A279CliNom
            }
            , new Object[] {
            T00IE9_A4036CCTDsc
            }
            , new Object[] {
            T00IE10_A396EmprCod
            }
            , new Object[] {
            T00IE11_A407EmprNom, T00IE11_n407EmprNom, T00IE11_A279CliNom, T00IE11_A4036CCTDsc, T00IE11_A396EmprCod, T00IE11_A252CliCod, T00IE11_A65ArtCod, T00IE11_A4031CCTCod, T00IE11_A4058CCFColNom, T00IE11_A4059CCFColNum
            }
            , new Object[] {
            T00IE12_A407EmprNom, T00IE12_n407EmprNom
            }
            , new Object[] {
            T00IE13_A279CliNom
            }
            , new Object[] {
            T00IE14_A396EmprCod
            }
            , new Object[] {
            T00IE15_A4036CCTDsc
            }
            , new Object[] {
            T00IE16_A396EmprCod, T00IE16_A252CliCod, T00IE16_A65ArtCod, T00IE16_A4058CCFColNom, T00IE16_A4059CCFColNum, T00IE16_A4031CCTCod
            }
            , new Object[] {
            T00IE17_A396EmprCod, T00IE17_A252CliCod, T00IE17_A65ArtCod, T00IE17_A4031CCTCod, T00IE17_A4058CCFColNom, T00IE17_A4059CCFColNum
            }
            , new Object[] {
            T00IE18_A396EmprCod, T00IE18_A252CliCod, T00IE18_A65ArtCod, T00IE18_A4031CCTCod, T00IE18_A4058CCFColNom, T00IE18_A4059CCFColNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00IE21_A407EmprNom, T00IE21_n407EmprNom
            }
            , new Object[] {
            T00IE22_A279CliNom
            }
            , new Object[] {
            T00IE23_A4036CCTDsc
            }
            , new Object[] {
            T00IE24_A396EmprCod, T00IE24_A252CliCod, T00IE24_A65ArtCod, T00IE24_A4058CCFColNom, T00IE24_A4059CCFColNum, T00IE24_A4031CCTCod
            }
            , new Object[] {
            T00IE25_A252CliCod, T00IE25_A65ArtCod, T00IE25_A4058CCFColNom, T00IE25_A4059CCFColNum, T00IE25_A4043CCTLinDsc, T00IE25_A4044CCTLinTpoD, T00IE25_A4045CCTLinLgoD, T00IE25_A4046CCTLinPict, T00IE25_A4060CCSVal, T00IE25_n4060CCSVal,
            T00IE25_A11482CCSMin, T00IE25_n11482CCSMin, T00IE25_A11483CCSMax, T00IE25_n11483CCSMax, T00IE25_A11530CCSAuto, T00IE25_A11531CCSVCod, T00IE25_A11532CCSVTol, T00IE25_A13247CCSMetodo, T00IE25_n13247CCSMetodo, T00IE25_A13248CCSEspecif,
            T00IE25_n13248CCSEspecif, T00IE25_A396EmprCod, T00IE25_A4031CCTCod, T00IE25_A4034CCTLin
            }
            , new Object[] {
            T00IE26_A4043CCTLinDsc, T00IE26_A4044CCTLinTpoD, T00IE26_A4045CCTLinLgoD, T00IE26_A4046CCTLinPict
            }
            , new Object[] {
            T00IE27_A396EmprCod, T00IE27_A252CliCod, T00IE27_A65ArtCod, T00IE27_A4058CCFColNom, T00IE27_A4059CCFColNum, T00IE27_A4031CCTCod, T00IE27_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00IE31_A4043CCTLinDsc, T00IE31_A4044CCTLinTpoD, T00IE31_A4045CCTLinLgoD, T00IE31_A4046CCTLinPict
            }
            , new Object[] {
            T00IE32_A396EmprCod, T00IE32_A252CliCod, T00IE32_A65ArtCod, T00IE32_A4058CCFColNom, T00IE32_A4059CCFColNum, T00IE32_A4031CCTCod, T00IE32_A4034CCTLin
            }
            , new Object[] {
            T00IE33_A396EmprCod
            }
         }
      );
   }

   private byte Z11530CCSAuto ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11530CCSAuto ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z4034CCTLin ;
   private short nRcdDeleted_629 ;
   private short nRcdExists_629 ;
   private short nIsMod_629 ;
   private short A4034CCTLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount629 ;
   private short RcdFound629 ;
   private short nBlankRcdUsr629 ;
   private short A4045CCTLinLgoD ;
   private short RcdFound628 ;
   private short nIsDirty_628 ;
   private short Z4045CCTLinLgoD ;
   private short nIsDirty_629 ;
   private int Z252CliCod ;
   private int Z4059CCFColNum ;
   private int Z4031CCTCod ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A4031CCTCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtCCFColNom_Enabled ;
   private int edtCCFColNum_Enabled ;
   private int edtCCTCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtavnRcdDeleted_629_Enabled ;
   private int edtCCTLin_Enabled ;
   private int edtCCTLinDsc_Enabled ;
   private int edtCCTLinLgoD_Enabled ;
   private int edtCCTLinPict_Enabled ;
   private int edtCCSVal_Enabled ;
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
   private int defedtCCTLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCCTDsc_Backcolor ;
   private int edtCCTCod_Backcolor ;
   private int edtCCFColNum_Backcolor ;
   private int edtCCFColNom_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ4059CCFColNum ;
   private int ZZ4031CCTCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11532CCSVTol ;
   private java.math.BigDecimal A11532CCSVTol ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z4058CCFColNom ;
   private String Z4060CCSVal ;
   private String Z11482CCSMin ;
   private String Z11483CCSMax ;
   private String Z11531CCSVCod ;
   private String Z13247CCSMetodo ;
   private String Z13248CCSEspecif ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_65_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCCFColNom_Internalname ;
   private String edtCCFColNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCCFColNum_Internalname ;
   private String edtCCFColNum_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String sMode629 ;
   private String edtavnRcdDeleted_629_Internalname ;
   private String edtCCTLin_Internalname ;
   private String edtCCTLinDsc_Internalname ;
   private String edtCCTLinLgoD_Internalname ;
   private String edtCCTLinPict_Internalname ;
   private String edtCCSVal_Internalname ;
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
   private String A11482CCSMin ;
   private String A11483CCSMax ;
   private String A11531CCSVCod ;
   private String A13247CCSMetodo ;
   private String A13248CCSEspecif ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode628 ;
   private String GXCCtl ;
   private String A4043CCTLinDsc ;
   private String A4044CCTLinTpoD ;
   private String A4046CCTLinPict ;
   private String A4060CCSVal ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z4036CCTDsc ;
   private String Z4043CCTLinDsc ;
   private String Z4044CCTLinTpoD ;
   private String Z4046CCTLinPict ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_629_Jsonclick ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCTLinLgoD_Jsonclick ;
   private String edtCCTLinPict_Jsonclick ;
   private String edtCCSVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ4058CCFColNom ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ4036CCTDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n11482CCSMin ;
   private boolean n11483CCSMax ;
   private boolean n13247CCSMetodo ;
   private boolean n13248CCSEspecif ;
   private boolean n407EmprNom ;
   private boolean n4060CCSVal ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbCCTLinTpoD ;
   private IDataStoreProvider pr_default ;
   private String[] T00IE11_A407EmprNom ;
   private boolean[] T00IE11_n407EmprNom ;
   private String[] T00IE11_A279CliNom ;
   private String[] T00IE11_A4036CCTDsc ;
   private String[] T00IE11_A396EmprCod ;
   private int[] T00IE11_A252CliCod ;
   private String[] T00IE11_A65ArtCod ;
   private int[] T00IE11_A4031CCTCod ;
   private String[] T00IE11_A4058CCFColNom ;
   private int[] T00IE11_A4059CCFColNum ;
   private String[] T00IE7_A407EmprNom ;
   private boolean[] T00IE7_n407EmprNom ;
   private String[] T00IE8_A279CliNom ;
   private String[] T00IE10_A396EmprCod ;
   private String[] T00IE9_A4036CCTDsc ;
   private String[] T00IE12_A407EmprNom ;
   private boolean[] T00IE12_n407EmprNom ;
   private String[] T00IE13_A279CliNom ;
   private String[] T00IE14_A396EmprCod ;
   private String[] T00IE15_A4036CCTDsc ;
   private String[] T00IE16_A396EmprCod ;
   private int[] T00IE16_A252CliCod ;
   private String[] T00IE16_A65ArtCod ;
   private String[] T00IE16_A4058CCFColNom ;
   private int[] T00IE16_A4059CCFColNum ;
   private int[] T00IE16_A4031CCTCod ;
   private String[] T00IE6_A396EmprCod ;
   private int[] T00IE6_A252CliCod ;
   private String[] T00IE6_A65ArtCod ;
   private int[] T00IE6_A4031CCTCod ;
   private String[] T00IE6_A4058CCFColNom ;
   private int[] T00IE6_A4059CCFColNum ;
   private String[] T00IE17_A396EmprCod ;
   private int[] T00IE17_A252CliCod ;
   private String[] T00IE17_A65ArtCod ;
   private int[] T00IE17_A4031CCTCod ;
   private String[] T00IE17_A4058CCFColNom ;
   private int[] T00IE17_A4059CCFColNum ;
   private String[] T00IE18_A396EmprCod ;
   private int[] T00IE18_A252CliCod ;
   private String[] T00IE18_A65ArtCod ;
   private int[] T00IE18_A4031CCTCod ;
   private String[] T00IE18_A4058CCFColNom ;
   private int[] T00IE18_A4059CCFColNum ;
   private String[] T00IE5_A396EmprCod ;
   private int[] T00IE5_A252CliCod ;
   private String[] T00IE5_A65ArtCod ;
   private int[] T00IE5_A4031CCTCod ;
   private String[] T00IE5_A4058CCFColNom ;
   private int[] T00IE5_A4059CCFColNum ;
   private String[] T00IE21_A407EmprNom ;
   private boolean[] T00IE21_n407EmprNom ;
   private String[] T00IE22_A279CliNom ;
   private String[] T00IE23_A4036CCTDsc ;
   private String[] T00IE24_A396EmprCod ;
   private int[] T00IE24_A252CliCod ;
   private String[] T00IE24_A65ArtCod ;
   private String[] T00IE24_A4058CCFColNom ;
   private int[] T00IE24_A4059CCFColNum ;
   private int[] T00IE24_A4031CCTCod ;
   private int[] T00IE25_A252CliCod ;
   private String[] T00IE25_A65ArtCod ;
   private String[] T00IE25_A4058CCFColNom ;
   private int[] T00IE25_A4059CCFColNum ;
   private String[] T00IE25_A4043CCTLinDsc ;
   private String[] T00IE25_A4044CCTLinTpoD ;
   private short[] T00IE25_A4045CCTLinLgoD ;
   private String[] T00IE25_A4046CCTLinPict ;
   private String[] T00IE25_A4060CCSVal ;
   private boolean[] T00IE25_n4060CCSVal ;
   private String[] T00IE25_A11482CCSMin ;
   private boolean[] T00IE25_n11482CCSMin ;
   private String[] T00IE25_A11483CCSMax ;
   private boolean[] T00IE25_n11483CCSMax ;
   private byte[] T00IE25_A11530CCSAuto ;
   private String[] T00IE25_A11531CCSVCod ;
   private java.math.BigDecimal[] T00IE25_A11532CCSVTol ;
   private String[] T00IE25_A13247CCSMetodo ;
   private boolean[] T00IE25_n13247CCSMetodo ;
   private String[] T00IE25_A13248CCSEspecif ;
   private boolean[] T00IE25_n13248CCSEspecif ;
   private String[] T00IE25_A396EmprCod ;
   private int[] T00IE25_A4031CCTCod ;
   private short[] T00IE25_A4034CCTLin ;
   private String[] T00IE4_A4043CCTLinDsc ;
   private String[] T00IE4_A4044CCTLinTpoD ;
   private short[] T00IE4_A4045CCTLinLgoD ;
   private String[] T00IE4_A4046CCTLinPict ;
   private String[] T00IE26_A4043CCTLinDsc ;
   private String[] T00IE26_A4044CCTLinTpoD ;
   private short[] T00IE26_A4045CCTLinLgoD ;
   private String[] T00IE26_A4046CCTLinPict ;
   private String[] T00IE27_A396EmprCod ;
   private int[] T00IE27_A252CliCod ;
   private String[] T00IE27_A65ArtCod ;
   private String[] T00IE27_A4058CCFColNom ;
   private int[] T00IE27_A4059CCFColNum ;
   private int[] T00IE27_A4031CCTCod ;
   private short[] T00IE27_A4034CCTLin ;
   private int[] T00IE3_A252CliCod ;
   private String[] T00IE3_A65ArtCod ;
   private String[] T00IE3_A4058CCFColNom ;
   private int[] T00IE3_A4059CCFColNum ;
   private String[] T00IE3_A4060CCSVal ;
   private boolean[] T00IE3_n4060CCSVal ;
   private String[] T00IE3_A11482CCSMin ;
   private boolean[] T00IE3_n11482CCSMin ;
   private String[] T00IE3_A11483CCSMax ;
   private boolean[] T00IE3_n11483CCSMax ;
   private byte[] T00IE3_A11530CCSAuto ;
   private String[] T00IE3_A11531CCSVCod ;
   private java.math.BigDecimal[] T00IE3_A11532CCSVTol ;
   private String[] T00IE3_A13247CCSMetodo ;
   private boolean[] T00IE3_n13247CCSMetodo ;
   private String[] T00IE3_A13248CCSEspecif ;
   private boolean[] T00IE3_n13248CCSEspecif ;
   private String[] T00IE3_A396EmprCod ;
   private int[] T00IE3_A4031CCTCod ;
   private short[] T00IE3_A4034CCTLin ;
   private int[] T00IE2_A252CliCod ;
   private String[] T00IE2_A65ArtCod ;
   private String[] T00IE2_A4058CCFColNom ;
   private int[] T00IE2_A4059CCFColNum ;
   private String[] T00IE2_A4060CCSVal ;
   private boolean[] T00IE2_n4060CCSVal ;
   private String[] T00IE2_A11482CCSMin ;
   private boolean[] T00IE2_n11482CCSMin ;
   private String[] T00IE2_A11483CCSMax ;
   private boolean[] T00IE2_n11483CCSMax ;
   private byte[] T00IE2_A11530CCSAuto ;
   private String[] T00IE2_A11531CCSVCod ;
   private java.math.BigDecimal[] T00IE2_A11532CCSVTol ;
   private String[] T00IE2_A13247CCSMetodo ;
   private boolean[] T00IE2_n13247CCSMetodo ;
   private String[] T00IE2_A13248CCSEspecif ;
   private boolean[] T00IE2_n13248CCSEspecif ;
   private String[] T00IE2_A396EmprCod ;
   private int[] T00IE2_A4031CCTCod ;
   private short[] T00IE2_A4034CCTLin ;
   private String[] T00IE31_A4043CCTLinDsc ;
   private String[] T00IE31_A4044CCTLinTpoD ;
   private short[] T00IE31_A4045CCTLinLgoD ;
   private String[] T00IE31_A4046CCTLinPict ;
   private String[] T00IE32_A396EmprCod ;
   private int[] T00IE32_A252CliCod ;
   private String[] T00IE32_A65ArtCod ;
   private String[] T00IE32_A4058CCFColNom ;
   private int[] T00IE32_A4059CCFColNum ;
   private int[] T00IE32_A4031CCTCod ;
   private short[] T00IE32_A4034CCTLin ;
   private String[] T00IE33_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWebForm AForm ;
}

final  class tccstd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccstd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccstd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccstd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccstd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00IE2", "SELECT CliCod, ArtCod, CCFColNom, CCFColNum, CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif, EmprCod, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE3", "SELECT CliCod, ArtCod, CCFColNom, CCFColNum, CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif, EmprCod, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE4", "SELECT CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE5", "SELECT EmprCod, CliCod, ArtCod, CCTCod, CCFColNom, CCFColNum FROM TXPCCSer1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE6", "SELECT EmprCod, CliCod, ArtCod, CCTCod, CCFColNom, CCFColNum FROM TXPCCSer1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE9", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE10", "SELECT EmprCod FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE11", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.CliNom, T4.CCTDsc, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.CCTCod, TM1.CCFColNom, TM1.CCFColNum FROM (((TXPCCSer1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPCCDef T4 ON T4.EmprCod = TM1.EmprCod AND T4.CCTCod = TM1.CCTCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.CCTCod = ? and TM1.CCFColNom = ? and TM1.CCFColNum = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.CCFColNom, TM1.CCFColNum, TM1.CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE13", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE14", "SELECT EmprCod FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE15", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod FROM TXPCCSer1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCTCod, CCFColNom, CCFColNum FROM TXPCCSer1 WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EmprCod = ? and CCTCod > ? or CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNom > ? or CCFColNom = ? and CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNum > ?) ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00IE18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, CCTCod, CCFColNom, CCFColNum FROM TXPCCSer1 WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EmprCod = ? and CCTCod < ? or CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNom < ? or CCFColNom = ? and CCTCod = ? and ArtCod = ? and CliCod = ? and EmprCod = ? and CCFColNum < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, CCFColNom DESC, CCFColNum DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00IE19", "INSERT INTO TXPCCSer1(EmprCod, CliCod, ArtCod, CCTCod, CCFColNom, CCFColNum) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCSer1")
         ,new UpdateCursor("T00IE20", "DELETE FROM TXPCCSer1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ?", GX_NOMASK, "TXPCCSer1")
         ,new ForEachCursor("T00IE21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE22", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE23", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod FROM TXPCCSer1 ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE25", "SELECT T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T2.CCTLinDsc, T2.CCTLinTpoD, T2.CCTLinLgoD, T2.CCTLinPict, T1.CCSVal, T1.CCSMin, T1.CCSMax, T1.CCSAuto, T1.CCSVCod, T1.CCSVTol, T1.CCSMetodo, T1.CCSEspecif, T1.EmprCod, T1.CCTCod, T1.CCTLin FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.CCFColNom = ? and T1.CCFColNum = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE26", "SELECT CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE27", "SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00IE28", "INSERT INTO TXPCCSta(CliCod, ArtCod, CCFColNom, CCFColNum, CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif, EmprCod, CCTCod, CCTLin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCSta")
         ,new UpdateCursor("T00IE29", "UPDATE TXPCCSta SET CCSVal=?, CCSMin=?, CCSMax=?, CCSAuto=?, CCSVCod=?, CCSVTol=?, CCSMetodo=?, CCSEspecif=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCSta")
         ,new UpdateCursor("T00IE30", "DELETE FROM TXPCCSta  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCCSta")
         ,new ForEachCursor("T00IE31", "SELECT CCTLinDsc, CCTLinTpoD, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE32", "SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin FROM TXPCCSta WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? and CCTCod = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00IE33", "SELECT EmprCod FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND CCFColNom = ? AND CCFColNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 10);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 3);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 31 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 13);
               stmt.setString(16, (String)parms[15], 13);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 13);
               stmt.setString(16, (String)parms[15], 13);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 40);
               }
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               stmt.setString(9, (String)parms[11], 10);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 30);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 30);
               }
               stmt.setString(13, (String)parms[17], 3);
               stmt.setInt(14, ((Number) parms[18]).intValue());
               stmt.setShort(15, ((Number) parms[19]).shortValue());
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 40);
               }
               stmt.setByte(4, ((Number) parms[6]).byteValue());
               stmt.setString(5, (String)parms[7], 10);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 30);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 30);
               }
               stmt.setString(9, (String)parms[13], 3);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setString(11, (String)parms[15], 16);
               stmt.setString(12, (String)parms[16], 13);
               stmt.setInt(13, ((Number) parms[17]).intValue());
               stmt.setInt(14, ((Number) parms[18]).intValue());
               stmt.setShort(15, ((Number) parms[19]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

