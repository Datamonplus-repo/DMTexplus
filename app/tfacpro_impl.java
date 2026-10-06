package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfacpro_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "EST. FACTURACION PRODUCCION", ""), (short)(0)) ;
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

   public tfacpro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfacpro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfacpro_impl.class ));
   }

   public tfacpro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFACPRO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Año", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacProAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3661FacProAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacProAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3661FacProAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3661FacProAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacProAny_Jsonclick, 0, "", "", "", "", "", 1, edtFacProAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacProSer_Internalname, GXutil.rtrim( A3662FacProSer), GXutil.rtrim( localUtil.format( A3662FacProSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacProSer_Jsonclick, 0, "", "", "", "", "", 1, edtFacProSer_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Intensidad", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacProInt_Internalname, GXutil.ltrim( localUtil.ntoc( A3663FacProInt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacProInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3663FacProInt), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3663FacProInt), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacProInt_Jsonclick, 0, "", "", "", "", "", 1, edtFacProInt_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacProTip_Internalname, GXutil.ltrim( localUtil.ntoc( A3664FacProTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacProTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3664FacProTip), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3664FacProTip), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacProTip_Jsonclick, 0, "", "", "", "", "", 1, edtFacProTip_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacProTar_Internalname, GXutil.ltrim( localUtil.ntoc( A3665FacProTar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacProTar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3665FacProTar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3665FacProTar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacProTar_Jsonclick, 0, "", "", "", "", "", 1, edtFacProTar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFACPRO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFACPRO.htm");
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
         nBlankRcdCount513 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_513 = (short)(1) ;
            scanStartDR513( ) ;
            while ( RcdFound513 != 0 )
            {
               init_level_properties513( ) ;
               getByPrimaryKeyDR513( ) ;
               addRowDR513( ) ;
               scanNextDR513( ) ;
            }
            scanEndDR513( ) ;
            nBlankRcdCount513 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalDR513( ) ;
         standaloneModalDR513( ) ;
         sMode513 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRowDR513( ) ;
            edtavnRcdDeleted_513_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_513_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_513_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_513_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtFacProMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROMES_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacProMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProMes_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtFacProKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROKGS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacProKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProKgs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtFacProMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROMTS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacProMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProMts_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtFacProVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROVAL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacProVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProVal_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtFacProValM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROVALM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacProValM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProValM_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_513 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalDR513( ) ;
            }
            sendRowDR513( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode513 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount513 = (short)(5) ;
         nRcdExists_513 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartDR513( ) ;
            while ( RcdFound513 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60513( ) ;
               init_level_properties513( ) ;
               standaloneNotModalDR513( ) ;
               getByPrimaryKeyDR513( ) ;
               standaloneModalDR513( ) ;
               addRowDR513( ) ;
               scanNextDR513( ) ;
            }
            scanEndDR513( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode513 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60513( ) ;
      initAllDR513( ) ;
      init_level_properties513( ) ;
      nRcdExists_513 = (short)(0) ;
      nIsMod_513 = (short)(0) ;
      nRcdDeleted_513 = (short)(0) ;
      nBlankRcdCount513 = (short)(nBlankRcdUsr513+nBlankRcdCount513) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount513 > 0 )
      {
         standaloneNotModalDR513( ) ;
         standaloneModalDR513( ) ;
         addRowDR513( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFacProMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount513 = (short)(nBlankRcdCount513-1) ;
      }
      Gx_mode = sMode513 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFACPRO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFACPRO.htm");
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
      e11DR2 ();
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
            Z3661FacProAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z3661FacProAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3662FacProSer = httpContext.cgiGet( "Z3662FacProSer") ;
            Z3663FacProInt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3663FacProInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3664FacProTip = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3664FacProTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3665FacProTar = (short)(localUtil.ctol( httpContext.cgiGet( "Z3665FacProTar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacProAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacProAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACPROANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacProAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3661FacProAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
            }
            else
            {
               A3661FacProAny = (short)(localUtil.ctol( httpContext.cgiGet( edtFacProAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
            }
            A3662FacProSer = httpContext.cgiGet( edtFacProSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacProInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacProInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACPROINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacProInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3663FacProInt = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
            }
            else
            {
               A3663FacProInt = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacProInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACPROTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacProTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3664FacProTip = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
            }
            else
            {
               A3664FacProTip = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacProTar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacProTar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACPROTAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacProTar_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3665FacProTar = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
            }
            else
            {
               A3665FacProTar = (short)(localUtil.ctol( httpContext.cgiGet( edtFacProTar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
            }
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
               A3661FacProAny = (short)(GXutil.lval( httpContext.GetPar( "FacProAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
               A3662FacProSer = httpContext.GetPar( "FacProSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
               A3663FacProInt = (byte)(GXutil.lval( httpContext.GetPar( "FacProInt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
               A3664FacProTip = (byte)(GXutil.lval( httpContext.GetPar( "FacProTip"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
               A3665FacProTar = (short)(GXutil.lval( httpContext.GetPar( "FacProTar"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
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
                        e11DR2 ();
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
            initAllDR512( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_513_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_513_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributesDR512( ) ;
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

   public void confirm_DR0( )
   {
      beforeValidateDR512( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsDR512( ) ;
         }
         else
         {
            checkExtendedTableDR512( ) ;
            if ( AnyError == 0 )
            {
               zmDR512( 2) ;
               zmDR512( 3) ;
            }
            closeExtendedTableCursorsDR512( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode512 = Gx_mode ;
         confirm_DR513( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode512 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode512 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesDR0( ) ;
      }
   }

   public void confirm_DR513( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowDR513( ) ;
         if ( ( nRcdExists_513 != 0 ) || ( nIsMod_513 != 0 ) )
         {
            getKeyDR513( ) ;
            if ( ( nRcdExists_513 == 0 ) && ( nRcdDeleted_513 == 0 ) )
            {
               if ( RcdFound513 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateDR513( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableDR513( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsDR513( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FACPROMES_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFacProMes_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound513 != 0 )
               {
                  if ( nRcdDeleted_513 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyDR513( ) ;
                     loadDR513( ) ;
                     beforeValidateDR513( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsDR513( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_513 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateDR513( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableDR513( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsDR513( ) ;
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
                  if ( nRcdDeleted_513 == 0 )
                  {
                     GXCCtl = "FACPROMES_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacProMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_513_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProMes_Internalname, GXutil.ltrim( localUtil.ntoc( A3666FacProMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A3667FacProKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProMts_Internalname, GXutil.ltrim( localUtil.ntoc( A3677FacProMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProVal_Internalname, GXutil.ltrim( localUtil.ntoc( A3668FacProVal, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProValM_Internalname, GXutil.ltrim( localUtil.ntoc( A3678FacProValM, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3666FacProMes_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3666FacProMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3667FacProKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3667FacProKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3677FacProMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3677FacProMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3668FacProVal_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3668FacProVal, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3678FacProValM_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3678FacProValM, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_513_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_513_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_513_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_513 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_513_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_513_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROMES_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROVALM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProValM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionDR0( )
   {
   }

   public void e11DR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      tfacpro_impl.this.A396EmprCod = GXv_char1[0] ;
      tfacpro_impl.this.AV16EmprNom = GXv_char2[0] ;
      tfacpro_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV20LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LitFe", AV20LitFe);
      GXt_char4 = AV19Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char4 = AV21lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21lit1", AV21lit1);
      GXt_char4 = AV25lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1392_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV25lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25lit5", AV25lit5);
      GXt_char4 = AV26lit6 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT257_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV26lit6 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26lit6", AV26lit6);
      GXt_char4 = AV27lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV27lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27lit7", AV27lit7);
      GXt_char4 = AV28lit8 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1390_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV28lit8 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28lit8", AV28lit8);
      GXt_char4 = AV29lit9 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1390_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV29lit9 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29lit9", AV29lit9);
      GXt_char4 = AV50lit30 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV50lit30 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50lit30", AV50lit30);
      GXt_char4 = AV51lit31 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT139_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV51lit31 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51lit31", AV51lit31);
      GXt_char4 = AV52lit32 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2135_", ""), (byte)(99), GXv_char3) ;
      tfacpro_impl.this.GXt_char4 = GXv_char3[0] ;
      AV52lit32 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52lit32", AV52lit32);
      AV53P0 = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53P0", AV53P0);
      AV54P1 = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54P1", AV54P1);
   }

   public void zmDR512( int GX_JID )
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
         Z3661FacProAny = A3661FacProAny ;
         Z3662FacProSer = A3662FacProSer ;
         Z3663FacProInt = A3663FacProInt ;
         Z3664FacProTip = A3664FacProTip ;
         Z3665FacProTar = A3665FacProTar ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00DR6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00DR6_A407EmprNom[0] ;
      n407EmprNom = T00DR6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void loadDR512( )
   {
      /* Using cursor T00DR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound512 = (short)(1) ;
         A407EmprNom = T00DR8_A407EmprNom[0] ;
         n407EmprNom = T00DR8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmDR512( -1) ;
      }
      pr_default.close(6);
      onLoadActionsDR512( ) ;
   }

   public void onLoadActionsDR512( )
   {
   }

   public void checkExtendedTableDR512( )
   {
      nIsDirty_512 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00DR7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsDR512( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T00DR9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKeyDR512( )
   {
      /* Using cursor T00DR10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound512 = (short)(1) ;
      }
      else
      {
         RcdFound512 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00DR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00DR5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmDR512( 1) ;
         RcdFound512 = (short)(1) ;
         A3661FacProAny = T00DR5_A3661FacProAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
         A3662FacProSer = T00DR5_A3662FacProSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
         A3663FacProInt = T00DR5_A3663FacProInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
         A3664FacProTip = T00DR5_A3664FacProTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
         A3665FacProTar = T00DR5_A3665FacProTar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
         A252CliCod = T00DR5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z3661FacProAny = A3661FacProAny ;
         Z3662FacProSer = A3662FacProSer ;
         Z3663FacProInt = A3663FacProInt ;
         Z3664FacProTip = A3664FacProTip ;
         Z3665FacProTar = A3665FacProTar ;
         sMode512 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadDR512( ) ;
         if ( AnyError == 1 )
         {
            RcdFound512 = (short)(0) ;
            initializeNonKeyDR512( ) ;
         }
         Gx_mode = sMode512 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound512 = (short)(0) ;
         initializeNonKeyDR512( ) ;
         sMode512 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode512 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyDR512( ) ;
      if ( RcdFound512 == 0 )
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
      RcdFound512 = (short)(0) ;
      /* Using cursor T00DR11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), Short.valueOf(A3661FacProAny), Integer.valueOf(A252CliCod), A3662FacProSer, A3662FacProSer, Short.valueOf(A3661FacProAny), Integer.valueOf(A252CliCod), Byte.valueOf(A3663FacProInt), Byte.valueOf(A3663FacProInt), A3662FacProSer, Short.valueOf(A3661FacProAny), Integer.valueOf(A252CliCod), Byte.valueOf(A3664FacProTip), Byte.valueOf(A3664FacProTip), Byte.valueOf(A3663FacProInt), A3662FacProSer, Short.valueOf(A3661FacProAny), Integer.valueOf(A252CliCod), Short.valueOf(A3665FacProTar), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00DR11_A252CliCod[0] < A252CliCod ) || ( T00DR11_A252CliCod[0] == A252CliCod ) && ( T00DR11_A3661FacProAny[0] < A3661FacProAny ) || ( T00DR11_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00DR11_A3662FacProSer[0], A3662FacProSer) < 0 ) || ( GXutil.strcmp(T00DR11_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR11_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR11_A252CliCod[0] == A252CliCod ) && ( T00DR11_A3663FacProInt[0] < A3663FacProInt ) || ( T00DR11_A3663FacProInt[0] == A3663FacProInt ) && ( GXutil.strcmp(T00DR11_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR11_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR11_A252CliCod[0] == A252CliCod ) && ( T00DR11_A3664FacProTip[0] < A3664FacProTip ) || ( T00DR11_A3664FacProTip[0] == A3664FacProTip ) && ( T00DR11_A3663FacProInt[0] == A3663FacProInt ) && ( GXutil.strcmp(T00DR11_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR11_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR11_A252CliCod[0] == A252CliCod ) && ( T00DR11_A3665FacProTar[0] < A3665FacProTar ) ) && ( GXutil.strcmp(T00DR11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00DR11_A252CliCod[0] > A252CliCod ) || ( T00DR11_A252CliCod[0] == A252CliCod ) && ( T00DR11_A3661FacProAny[0] > A3661FacProAny ) || ( T00DR11_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00DR11_A3662FacProSer[0], A3662FacProSer) > 0 ) || ( GXutil.strcmp(T00DR11_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR11_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR11_A252CliCod[0] == A252CliCod ) && ( T00DR11_A3663FacProInt[0] > A3663FacProInt ) || ( T00DR11_A3663FacProInt[0] == A3663FacProInt ) && ( GXutil.strcmp(T00DR11_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR11_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR11_A252CliCod[0] == A252CliCod ) && ( T00DR11_A3664FacProTip[0] > A3664FacProTip ) || ( T00DR11_A3664FacProTip[0] == A3664FacProTip ) && ( T00DR11_A3663FacProInt[0] == A3663FacProInt ) && ( GXutil.strcmp(T00DR11_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR11_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR11_A252CliCod[0] == A252CliCod ) && ( T00DR11_A3665FacProTar[0] > A3665FacProTar ) ) && ( GXutil.strcmp(T00DR11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T00DR11_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A3661FacProAny = T00DR11_A3661FacProAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
            A3662FacProSer = T00DR11_A3662FacProSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
            A3663FacProInt = T00DR11_A3663FacProInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
            A3664FacProTip = T00DR11_A3664FacProTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
            A3665FacProTar = T00DR11_A3665FacProTar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
            RcdFound512 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound512 = (short)(0) ;
      /* Using cursor T00DR12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), Short.valueOf(A3661FacProAny), Integer.valueOf(A252CliCod), A3662FacProSer, A3662FacProSer, Short.valueOf(A3661FacProAny), Integer.valueOf(A252CliCod), Byte.valueOf(A3663FacProInt), Byte.valueOf(A3663FacProInt), A3662FacProSer, Short.valueOf(A3661FacProAny), Integer.valueOf(A252CliCod), Byte.valueOf(A3664FacProTip), Byte.valueOf(A3664FacProTip), Byte.valueOf(A3663FacProInt), A3662FacProSer, Short.valueOf(A3661FacProAny), Integer.valueOf(A252CliCod), Short.valueOf(A3665FacProTar), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T00DR12_A252CliCod[0] > A252CliCod ) || ( T00DR12_A252CliCod[0] == A252CliCod ) && ( T00DR12_A3661FacProAny[0] > A3661FacProAny ) || ( T00DR12_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00DR12_A3662FacProSer[0], A3662FacProSer) > 0 ) || ( GXutil.strcmp(T00DR12_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR12_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR12_A252CliCod[0] == A252CliCod ) && ( T00DR12_A3663FacProInt[0] > A3663FacProInt ) || ( T00DR12_A3663FacProInt[0] == A3663FacProInt ) && ( GXutil.strcmp(T00DR12_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR12_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR12_A252CliCod[0] == A252CliCod ) && ( T00DR12_A3664FacProTip[0] > A3664FacProTip ) || ( T00DR12_A3664FacProTip[0] == A3664FacProTip ) && ( T00DR12_A3663FacProInt[0] == A3663FacProInt ) && ( GXutil.strcmp(T00DR12_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR12_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR12_A252CliCod[0] == A252CliCod ) && ( T00DR12_A3665FacProTar[0] > A3665FacProTar ) ) && ( GXutil.strcmp(T00DR12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T00DR12_A252CliCod[0] < A252CliCod ) || ( T00DR12_A252CliCod[0] == A252CliCod ) && ( T00DR12_A3661FacProAny[0] < A3661FacProAny ) || ( T00DR12_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00DR12_A3662FacProSer[0], A3662FacProSer) < 0 ) || ( GXutil.strcmp(T00DR12_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR12_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR12_A252CliCod[0] == A252CliCod ) && ( T00DR12_A3663FacProInt[0] < A3663FacProInt ) || ( T00DR12_A3663FacProInt[0] == A3663FacProInt ) && ( GXutil.strcmp(T00DR12_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR12_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR12_A252CliCod[0] == A252CliCod ) && ( T00DR12_A3664FacProTip[0] < A3664FacProTip ) || ( T00DR12_A3664FacProTip[0] == A3664FacProTip ) && ( T00DR12_A3663FacProInt[0] == A3663FacProInt ) && ( GXutil.strcmp(T00DR12_A3662FacProSer[0], A3662FacProSer) == 0 ) && ( T00DR12_A3661FacProAny[0] == A3661FacProAny ) && ( T00DR12_A252CliCod[0] == A252CliCod ) && ( T00DR12_A3665FacProTar[0] < A3665FacProTar ) ) && ( GXutil.strcmp(T00DR12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T00DR12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A3661FacProAny = T00DR12_A3661FacProAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
            A3662FacProSer = T00DR12_A3662FacProSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
            A3663FacProInt = T00DR12_A3663FacProInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
            A3664FacProTip = T00DR12_A3664FacProTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
            A3665FacProTar = T00DR12_A3665FacProTar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
            RcdFound512 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyDR512( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertDR512( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound512 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A3661FacProAny != Z3661FacProAny ) || ( GXutil.strcmp(A3662FacProSer, Z3662FacProSer) != 0 ) || ( A3663FacProInt != Z3663FacProInt ) || ( A3664FacProTip != Z3664FacProTip ) || ( A3665FacProTar != Z3665FacProTar ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A3661FacProAny = Z3661FacProAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
               A3662FacProSer = Z3662FacProSer ;
               httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
               A3663FacProInt = Z3663FacProInt ;
               httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
               A3664FacProTip = Z3664FacProTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
               A3665FacProTar = Z3665FacProTar ;
               httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
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
               updateDR512( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A3661FacProAny != Z3661FacProAny ) || ( GXutil.strcmp(A3662FacProSer, Z3662FacProSer) != 0 ) || ( A3663FacProInt != Z3663FacProInt ) || ( A3664FacProTip != Z3664FacProTip ) || ( A3665FacProTar != Z3665FacProTar ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertDR512( ) ;
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
                  insertDR512( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A3661FacProAny != Z3661FacProAny ) || ( GXutil.strcmp(A3662FacProSer, Z3662FacProSer) != 0 ) || ( A3663FacProInt != Z3663FacProInt ) || ( A3664FacProTip != Z3664FacProTip ) || ( A3665FacProTar != Z3665FacProTar ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A3661FacProAny = Z3661FacProAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
         A3662FacProSer = Z3662FacProSer ;
         httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
         A3663FacProInt = Z3663FacProInt ;
         httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
         A3664FacProTip = Z3664FacProTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
         A3665FacProTar = Z3665FacProTar ;
         httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
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
      getKeyDR512( ) ;
      if ( RcdFound512 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A3661FacProAny != Z3661FacProAny ) || ( GXutil.strcmp(A3662FacProSer, Z3662FacProSer) != 0 ) || ( A3663FacProInt != Z3663FacProInt ) || ( A3664FacProTip != Z3664FacProTip ) || ( A3665FacProTar != Z3665FacProTar ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A3661FacProAny = Z3661FacProAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
            A3662FacProSer = Z3662FacProSer ;
            httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
            A3663FacProInt = Z3663FacProInt ;
            httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
            A3664FacProTip = Z3664FacProTip ;
            httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
            A3665FacProTar = Z3665FacProTar ;
            httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A3661FacProAny != Z3661FacProAny ) || ( GXutil.strcmp(A3662FacProSer, Z3662FacProSer) != 0 ) || ( A3663FacProInt != Z3663FacProInt ) || ( A3664FacProTip != Z3664FacProTip ) || ( A3665FacProTar != Z3665FacProTar ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfacpro");
   }

   public void insert_check( )
   {
      confirm_DR0( ) ;
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
      if ( RcdFound512 == 0 )
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
      scanStartDR512( ) ;
      if ( RcdFound512 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndDR512( ) ;
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
      if ( RcdFound512 == 0 )
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
      if ( RcdFound512 == 0 )
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
      scanStartDR512( ) ;
      if ( RcdFound512 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound512 != 0 )
         {
            scanNextDR512( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndDR512( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyDR512( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00DR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFACPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFACPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertDR512( )
   {
      beforeValidateDR512( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDR512( ) ;
      }
      if ( AnyError == 0 )
      {
         zmDR512( 0) ;
         checkOptimisticConcurrencyDR512( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDR512( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertDR512( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DR13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACPRO");
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
                        processLevelDR512( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionDR0( ) ;
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
            loadDR512( ) ;
         }
         endLevelDR512( ) ;
      }
      closeExtendedTableCursorsDR512( ) ;
   }

   public void updateDR512( )
   {
      beforeValidateDR512( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDR512( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDR512( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDR512( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateDR512( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPFACPRO */
                  deferredUpdateDR512( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelDR512( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionDR0( ) ;
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
         endLevelDR512( ) ;
      }
      closeExtendedTableCursorsDR512( ) ;
   }

   public void deferredUpdateDR512( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateDR512( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDR512( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsDR512( ) ;
         afterConfirmDR512( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteDR512( ) ;
            if ( AnyError == 0 )
            {
               scanStartDR513( ) ;
               while ( RcdFound513 != 0 )
               {
                  getByPrimaryKeyDR513( ) ;
                  deleteDR513( ) ;
                  scanNextDR513( ) ;
               }
               scanEndDR513( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DR14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACPRO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound512 == 0 )
                        {
                           initAllDR512( ) ;
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
                        resetCaptionDR0( ) ;
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
      sMode512 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelDR512( ) ;
      Gx_mode = sMode512 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsDR512( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelDR513( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowDR513( ) ;
         if ( ( nRcdExists_513 != 0 ) || ( nIsMod_513 != 0 ) )
         {
            standaloneNotModalDR513( ) ;
            getKeyDR513( ) ;
            if ( ( nRcdExists_513 == 0 ) && ( nRcdDeleted_513 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertDR513( ) ;
            }
            else
            {
               if ( RcdFound513 != 0 )
               {
                  if ( ( nRcdDeleted_513 != 0 ) && ( nRcdExists_513 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteDR513( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_513 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateDR513( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_513 == 0 )
                  {
                     GXCCtl = "FACPROMES_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacProMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_513_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProMes_Internalname, GXutil.ltrim( localUtil.ntoc( A3666FacProMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A3667FacProKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProMts_Internalname, GXutil.ltrim( localUtil.ntoc( A3677FacProMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProVal_Internalname, GXutil.ltrim( localUtil.ntoc( A3668FacProVal, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacProValM_Internalname, GXutil.ltrim( localUtil.ntoc( A3678FacProValM, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3666FacProMes_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3666FacProMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3667FacProKgs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3667FacProKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3677FacProMts_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3677FacProMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3668FacProVal_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3668FacProVal, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3678FacProValM_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3678FacProValM, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_513_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_513_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_513_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_513 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_513_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_513_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROMES_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPROVALM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProValM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllDR513( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_513 = (short)(0) ;
      nIsMod_513 = (short)(0) ;
      nRcdDeleted_513 = (short)(0) ;
   }

   public void processLevelDR512( )
   {
      /* Save parent mode. */
      sMode512 = Gx_mode ;
      processNestedLevelDR513( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode512 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelDR512( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteDR512( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfacpro");
         if ( AnyError == 0 )
         {
            confirmValuesDR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfacpro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartDR512( )
   {
      /* Scan By routine */
      /* Using cursor T00DR15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound512 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound512 = (short)(1) ;
         A252CliCod = T00DR15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A3661FacProAny = T00DR15_A3661FacProAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
         A3662FacProSer = T00DR15_A3662FacProSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
         A3663FacProInt = T00DR15_A3663FacProInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
         A3664FacProTip = T00DR15_A3664FacProTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
         A3665FacProTar = T00DR15_A3665FacProTar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextDR512( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound512 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound512 = (short)(1) ;
         A252CliCod = T00DR15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A3661FacProAny = T00DR15_A3661FacProAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
         A3662FacProSer = T00DR15_A3662FacProSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
         A3663FacProInt = T00DR15_A3663FacProInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
         A3664FacProTip = T00DR15_A3664FacProTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
         A3665FacProTar = T00DR15_A3665FacProTar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
      }
   }

   public void scanEndDR512( )
   {
      pr_default.close(13);
   }

   public void afterConfirmDR512( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertDR512( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateDR512( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteDR512( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteDR512( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateDR512( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesDR512( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtFacProAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProAny_Enabled), 5, 0), true);
      edtFacProSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProSer_Enabled), 5, 0), true);
      edtFacProInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProInt_Enabled), 5, 0), true);
      edtFacProTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProTip_Enabled), 5, 0), true);
      edtFacProTar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProTar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProTar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmDR513( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3667FacProKgs = T00DR3_A3667FacProKgs[0] ;
            Z3677FacProMts = T00DR3_A3677FacProMts[0] ;
            Z3668FacProVal = T00DR3_A3668FacProVal[0] ;
            Z3678FacProValM = T00DR3_A3678FacProValM[0] ;
         }
         else
         {
            Z3667FacProKgs = A3667FacProKgs ;
            Z3677FacProMts = A3677FacProMts ;
            Z3668FacProVal = A3668FacProVal ;
            Z3678FacProValM = A3678FacProValM ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z252CliCod = A252CliCod ;
         Z3661FacProAny = A3661FacProAny ;
         Z3662FacProSer = A3662FacProSer ;
         Z3663FacProInt = A3663FacProInt ;
         Z3664FacProTip = A3664FacProTip ;
         Z3665FacProTar = A3665FacProTar ;
         Z3666FacProMes = A3666FacProMes ;
         Z3667FacProKgs = A3667FacProKgs ;
         Z3677FacProMts = A3677FacProMts ;
         Z3668FacProVal = A3668FacProVal ;
         Z3678FacProValM = A3678FacProValM ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalDR513( )
   {
   }

   public void standaloneModalDR513( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFacProMes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacProMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProMes_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtFacProMes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacProMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProMes_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void loadDR513( )
   {
      /* Using cursor T00DR16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound513 = (short)(1) ;
         A3667FacProKgs = T00DR16_A3667FacProKgs[0] ;
         n3667FacProKgs = T00DR16_n3667FacProKgs[0] ;
         A3677FacProMts = T00DR16_A3677FacProMts[0] ;
         n3677FacProMts = T00DR16_n3677FacProMts[0] ;
         A3668FacProVal = T00DR16_A3668FacProVal[0] ;
         n3668FacProVal = T00DR16_n3668FacProVal[0] ;
         A3678FacProValM = T00DR16_A3678FacProValM[0] ;
         n3678FacProValM = T00DR16_n3678FacProValM[0] ;
         zmDR513( -4) ;
      }
      pr_default.close(14);
      onLoadActionsDR513( ) ;
   }

   public void onLoadActionsDR513( )
   {
   }

   public void checkExtendedTableDR513( )
   {
      nIsDirty_513 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalDR513( ) ;
   }

   public void closeExtendedTableCursorsDR513( )
   {
   }

   public void enableDisableDR513( )
   {
   }

   public void getKeyDR513( )
   {
      /* Using cursor T00DR17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound513 = (short)(1) ;
      }
      else
      {
         RcdFound513 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKeyDR513( )
   {
      /* Using cursor T00DR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00DR3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmDR513( 4) ;
         RcdFound513 = (short)(1) ;
         initializeNonKeyDR513( ) ;
         A3666FacProMes = T00DR3_A3666FacProMes[0] ;
         A3667FacProKgs = T00DR3_A3667FacProKgs[0] ;
         n3667FacProKgs = T00DR3_n3667FacProKgs[0] ;
         A3677FacProMts = T00DR3_A3677FacProMts[0] ;
         n3677FacProMts = T00DR3_n3677FacProMts[0] ;
         A3668FacProVal = T00DR3_A3668FacProVal[0] ;
         n3668FacProVal = T00DR3_n3668FacProVal[0] ;
         A3678FacProValM = T00DR3_A3678FacProValM[0] ;
         n3678FacProValM = T00DR3_n3678FacProValM[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z3661FacProAny = A3661FacProAny ;
         Z3662FacProSer = A3662FacProSer ;
         Z3663FacProInt = A3663FacProInt ;
         Z3664FacProTip = A3664FacProTip ;
         Z3665FacProTar = A3665FacProTar ;
         Z3666FacProMes = A3666FacProMes ;
         sMode513 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalDR513( ) ;
         loadDR513( ) ;
         Gx_mode = sMode513 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound513 = (short)(0) ;
         initializeNonKeyDR513( ) ;
         sMode513 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalDR513( ) ;
         Gx_mode = sMode513 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesDR513( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyDR513( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00DR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFACPR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3667FacProKgs, T00DR2_A3667FacProKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z3677FacProMts, T00DR2_A3677FacProMts[0]) != 0 ) || ( DecimalUtil.compareTo(Z3668FacProVal, T00DR2_A3668FacProVal[0]) != 0 ) || ( DecimalUtil.compareTo(Z3678FacProValM, T00DR2_A3678FacProValM[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3667FacProKgs, T00DR2_A3667FacProKgs[0]) != 0 )
            {
               GXutil.writeLogln("tfacpro:[seudo value changed for attri]"+"FacProKgs");
               GXutil.writeLogRaw("Old: ",Z3667FacProKgs);
               GXutil.writeLogRaw("Current: ",T00DR2_A3667FacProKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z3677FacProMts, T00DR2_A3677FacProMts[0]) != 0 )
            {
               GXutil.writeLogln("tfacpro:[seudo value changed for attri]"+"FacProMts");
               GXutil.writeLogRaw("Old: ",Z3677FacProMts);
               GXutil.writeLogRaw("Current: ",T00DR2_A3677FacProMts[0]);
            }
            if ( DecimalUtil.compareTo(Z3668FacProVal, T00DR2_A3668FacProVal[0]) != 0 )
            {
               GXutil.writeLogln("tfacpro:[seudo value changed for attri]"+"FacProVal");
               GXutil.writeLogRaw("Old: ",Z3668FacProVal);
               GXutil.writeLogRaw("Current: ",T00DR2_A3668FacProVal[0]);
            }
            if ( DecimalUtil.compareTo(Z3678FacProValM, T00DR2_A3678FacProValM[0]) != 0 )
            {
               GXutil.writeLogln("tfacpro:[seudo value changed for attri]"+"FacProValM");
               GXutil.writeLogRaw("Old: ",Z3678FacProValM);
               GXutil.writeLogRaw("Current: ",T00DR2_A3678FacProValM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLFACPR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertDR513( )
   {
      beforeValidateDR513( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDR513( ) ;
      }
      if ( AnyError == 0 )
      {
         zmDR513( 0) ;
         checkOptimisticConcurrencyDR513( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDR513( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertDR513( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DR18 */
                  pr_default.execute(16, new Object[] {Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes), Boolean.valueOf(n3667FacProKgs), A3667FacProKgs, Boolean.valueOf(n3677FacProMts), A3677FacProMts, Boolean.valueOf(n3668FacProVal), A3668FacProVal, Boolean.valueOf(n3678FacProValM), A3678FacProValM, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFACPR");
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
            loadDR513( ) ;
         }
         endLevelDR513( ) ;
      }
      closeExtendedTableCursorsDR513( ) ;
   }

   public void updateDR513( )
   {
      beforeValidateDR513( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDR513( ) ;
      }
      if ( ( nIsMod_513 != 0 ) || ( nIsDirty_513 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyDR513( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmDR513( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateDR513( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00DR19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n3667FacProKgs), A3667FacProKgs, Boolean.valueOf(n3677FacProMts), A3677FacProMts, Boolean.valueOf(n3668FacProVal), A3668FacProVal, Boolean.valueOf(n3678FacProValM), A3678FacProValM, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFACPR");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFACPR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateDR513( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyDR513( ) ;
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
            endLevelDR513( ) ;
         }
      }
      closeExtendedTableCursorsDR513( ) ;
   }

   public void deferredUpdateDR513( )
   {
   }

   public void deleteDR513( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateDR513( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDR513( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsDR513( ) ;
         afterConfirmDR513( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteDR513( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00DR20 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar), Byte.valueOf(A3666FacProMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFACPR");
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
      sMode513 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelDR513( ) ;
      Gx_mode = sMode513 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsDR513( )
   {
      standaloneModalDR513( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelDR513( )
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

   public void scanStartDR513( )
   {
      /* Scan By routine */
      /* Using cursor T00DR21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3661FacProAny), A3662FacProSer, Byte.valueOf(A3663FacProInt), Byte.valueOf(A3664FacProTip), Short.valueOf(A3665FacProTar)});
      RcdFound513 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound513 = (short)(1) ;
         A3666FacProMes = T00DR21_A3666FacProMes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextDR513( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound513 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound513 = (short)(1) ;
         A3666FacProMes = T00DR21_A3666FacProMes[0] ;
      }
   }

   public void scanEndDR513( )
   {
      pr_default.close(19);
   }

   public void afterConfirmDR513( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertDR513( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateDR513( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteDR513( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteDR513( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateDR513( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesDR513( )
   {
      edtFacProMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProMes_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtFacProKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProKgs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtFacProMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProMts_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtFacProVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProVal_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtFacProValM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProValM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProValM_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashesDR513( )
   {
   }

   public void send_integrity_lvl_hashesDR512( )
   {
   }

   public void subsflControlProps_60513( )
   {
      edtavnRcdDeleted_513_Internalname = "vNRCDDELETED_513_"+sGXsfl_60_idx ;
      edtFacProMes_Internalname = "FACPROMES_"+sGXsfl_60_idx ;
      edtFacProKgs_Internalname = "FACPROKGS_"+sGXsfl_60_idx ;
      edtFacProMts_Internalname = "FACPROMTS_"+sGXsfl_60_idx ;
      edtFacProVal_Internalname = "FACPROVAL_"+sGXsfl_60_idx ;
      edtFacProValM_Internalname = "FACPROVALM_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60513( )
   {
      edtavnRcdDeleted_513_Internalname = "vNRCDDELETED_513_"+sGXsfl_60_fel_idx ;
      edtFacProMes_Internalname = "FACPROMES_"+sGXsfl_60_fel_idx ;
      edtFacProKgs_Internalname = "FACPROKGS_"+sGXsfl_60_fel_idx ;
      edtFacProMts_Internalname = "FACPROMTS_"+sGXsfl_60_fel_idx ;
      edtFacProVal_Internalname = "FACPROVAL_"+sGXsfl_60_fel_idx ;
      edtFacProValM_Internalname = "FACPROVALM_"+sGXsfl_60_fel_idx ;
   }

   public void addRowDR513( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60513( ) ;
      sendRowDR513( ) ;
   }

   public void sendRowDR513( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_513_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_513_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_513_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_513), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_513), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_513_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_513_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_513_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacProMes_Internalname,GXutil.ltrim( localUtil.ntoc( A3666FacProMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3666FacProMes), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacProMes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFacProMes_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_513_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacProKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A3667FacProKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacProKgs_Enabled!=0) ? localUtil.format( A3667FacProKgs, "ZZZZZZ9.99") : localUtil.format( A3667FacProKgs, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacProKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFacProKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_513_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacProMts_Internalname,GXutil.ltrim( localUtil.ntoc( A3677FacProMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacProMts_Enabled!=0) ? localUtil.format( A3677FacProMts, "ZZZZZZ9.99") : localUtil.format( A3677FacProMts, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacProMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFacProMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_513_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacProVal_Internalname,GXutil.ltrim( localUtil.ntoc( A3668FacProVal, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacProVal_Enabled!=0) ? localUtil.format( A3668FacProVal, "ZZZZZZZZZ9.99") : localUtil.format( A3668FacProVal, "ZZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacProVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFacProVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_513_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacProValM_Internalname,GXutil.ltrim( localUtil.ntoc( A3678FacProValM, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacProValM_Enabled!=0) ? localUtil.format( A3678FacProValM, "ZZZZZZZZZ9.99") : localUtil.format( A3678FacProValM, "ZZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacProValM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFacProValM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesDR513( ) ;
      GXCCtl = "Z3666FacProMes_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3666FacProMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3667FacProKgs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3667FacProKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3677FacProMts_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3677FacProMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3668FacProVal_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3668FacProVal, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3678FacProValM_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3678FacProValM, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_513_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_513_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_513_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_513, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_513_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_513_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPROMES_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPROKGS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPROMTS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPROVAL_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPROVALM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProValM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowDR513( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60513( ) ;
      edtavnRcdDeleted_513_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_513_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacProMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROMES_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacProKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROKGS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacProMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROMTS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacProVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROVAL_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacProValM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPROVALM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_513_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_513_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_513");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_513_Internalname ;
         wbErr = true ;
         nRcdDeleted_513 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_513 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_513_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacProMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacProMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "FACPROMES_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacProMes_Internalname ;
         wbErr = true ;
         A3666FacProMes = (byte)(0) ;
      }
      else
      {
         A3666FacProMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacProMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacProKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacProKgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACPROKGS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacProKgs_Internalname ;
         wbErr = true ;
         A3667FacProKgs = DecimalUtil.ZERO ;
         n3667FacProKgs = false ;
      }
      else
      {
         A3667FacProKgs = localUtil.ctond( httpContext.cgiGet( edtFacProKgs_Internalname)) ;
         n3667FacProKgs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacProMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacProMts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACPROMTS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacProMts_Internalname ;
         wbErr = true ;
         A3677FacProMts = DecimalUtil.ZERO ;
         n3677FacProMts = false ;
      }
      else
      {
         A3677FacProMts = localUtil.ctond( httpContext.cgiGet( edtFacProMts_Internalname)) ;
         n3677FacProMts = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacProVal_Internalname)), DecimalUtil.stringToDec("-999999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacProVal_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACPROVAL_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacProVal_Internalname ;
         wbErr = true ;
         A3668FacProVal = DecimalUtil.ZERO ;
         n3668FacProVal = false ;
      }
      else
      {
         A3668FacProVal = localUtil.ctond( httpContext.cgiGet( edtFacProVal_Internalname)) ;
         n3668FacProVal = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacProValM_Internalname)), DecimalUtil.stringToDec("-999999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacProValM_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACPROVALM_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacProValM_Internalname ;
         wbErr = true ;
         A3678FacProValM = DecimalUtil.ZERO ;
         n3678FacProValM = false ;
      }
      else
      {
         A3678FacProValM = localUtil.ctond( httpContext.cgiGet( edtFacProValM_Internalname)) ;
         n3678FacProValM = false ;
      }
      GXCCtl = "Z3666FacProMes_" + sGXsfl_60_idx ;
      Z3666FacProMes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3667FacProKgs_" + sGXsfl_60_idx ;
      Z3667FacProKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3677FacProMts_" + sGXsfl_60_idx ;
      Z3677FacProMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3668FacProVal_" + sGXsfl_60_idx ;
      Z3668FacProVal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3678FacProValM_" + sGXsfl_60_idx ;
      Z3678FacProValM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_513_" + sGXsfl_60_idx ;
      nRcdDeleted_513 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_513_" + sGXsfl_60_idx ;
      nRcdExists_513 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_513_" + sGXsfl_60_idx ;
      nIsMod_513 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFacProMes_Enabled = edtFacProMes_Enabled ;
   }

   public void confirmValuesDR0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60513( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60513( ) ;
         httpContext.changePostValue( "Z3666FacProMes_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3666FacProMes_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3666FacProMes_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3667FacProKgs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3667FacProKgs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3667FacProKgs_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3677FacProMts_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3677FacProMts_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3677FacProMts_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3668FacProVal_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3668FacProVal_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3668FacProVal_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3678FacProValM_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3678FacProValM_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3678FacProValM_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfacpro", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3661FacProAny", GXutil.ltrim( localUtil.ntoc( Z3661FacProAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3662FacProSer", GXutil.rtrim( Z3662FacProSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3663FacProInt", GXutil.ltrim( localUtil.ntoc( Z3663FacProInt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3664FacProTip", GXutil.ltrim( localUtil.ntoc( Z3664FacProTip, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3665FacProTar", GXutil.ltrim( localUtil.ntoc( Z3665FacProTar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tfacpro", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TFACPRO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "EST. FACTURACION PRODUCCION", "") ;
   }

   public void initializeNonKeyDR512( )
   {
   }

   public void initAllDR512( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A3661FacProAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3661FacProAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3661FacProAny), 4, 0));
      A3662FacProSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3662FacProSer", A3662FacProSer);
      A3663FacProInt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3663FacProInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3663FacProInt), 2, 0));
      A3664FacProTip = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3664FacProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3664FacProTip), 2, 0));
      A3665FacProTar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3665FacProTar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3665FacProTar), 4, 0));
      initializeNonKeyDR512( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyDR513( )
   {
      A3667FacProKgs = DecimalUtil.ZERO ;
      n3667FacProKgs = false ;
      A3677FacProMts = DecimalUtil.ZERO ;
      n3677FacProMts = false ;
      A3668FacProVal = DecimalUtil.ZERO ;
      n3668FacProVal = false ;
      A3678FacProValM = DecimalUtil.ZERO ;
      n3678FacProValM = false ;
      Z3667FacProKgs = DecimalUtil.ZERO ;
      Z3677FacProMts = DecimalUtil.ZERO ;
      Z3668FacProVal = DecimalUtil.ZERO ;
      Z3678FacProValM = DecimalUtil.ZERO ;
   }

   public void initAllDR513( )
   {
      A3666FacProMes = (byte)(0) ;
      initializeNonKeyDR513( ) ;
   }

   public void standaloneModalInsertDR513( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241514219", true, true);
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
      httpContext.AddJavascriptSource("tfacpro.js", "?20268241514219", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties513( )
   {
      edtFacProMes_Enabled = defedtFacProMes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacProMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacProMes_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_513, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_513_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3666FacProMes, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3667FacProKgs, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3677FacProMts, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3668FacProVal, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3678FacProValM, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacProValM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtFacProAny_Internalname = "FACPROANY" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFacProSer_Internalname = "FACPROSER" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtFacProInt_Internalname = "FACPROINT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtFacProTip_Internalname = "FACPROTIP" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFacProTar_Internalname = "FACPROTAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_513_Internalname = "vNRCDDELETED_513" ;
      edtFacProMes_Internalname = "FACPROMES" ;
      edtFacProKgs_Internalname = "FACPROKGS" ;
      edtFacProMts_Internalname = "FACPROMTS" ;
      edtFacProVal_Internalname = "FACPROVAL" ;
      edtFacProValM_Internalname = "FACPROVALM" ;
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
      Form.setCaption( httpContext.getMessage( "EST. FACTURACION PRODUCCION", "") );
      edtFacProValM_Jsonclick = "" ;
      edtFacProVal_Jsonclick = "" ;
      edtFacProMts_Jsonclick = "" ;
      edtFacProKgs_Jsonclick = "" ;
      edtFacProMes_Jsonclick = "" ;
      edtavnRcdDeleted_513_Jsonclick = "" ;
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
      edtFacProValM_Enabled = 1 ;
      edtFacProVal_Enabled = 1 ;
      edtFacProMts_Enabled = 1 ;
      edtFacProKgs_Enabled = 1 ;
      edtFacProMes_Enabled = 1 ;
      edtavnRcdDeleted_513_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtFacProTar_Jsonclick = "" ;
      edtFacProTar_Backcolor = (int)(0xFFFFFF) ;
      edtFacProTar_Enabled = 1 ;
      edtFacProTip_Jsonclick = "" ;
      edtFacProTip_Backcolor = (int)(0xFFFFFF) ;
      edtFacProTip_Enabled = 1 ;
      edtFacProInt_Jsonclick = "" ;
      edtFacProInt_Backcolor = (int)(0xFFFFFF) ;
      edtFacProInt_Enabled = 1 ;
      edtFacProSer_Jsonclick = "" ;
      edtFacProSer_Backcolor = (int)(0xFFFFFF) ;
      edtFacProSer_Enabled = 1 ;
      edtFacProAny_Jsonclick = "" ;
      edtFacProAny_Backcolor = (int)(0xFFFFFF) ;
      edtFacProAny_Enabled = 1 ;
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
      subsflControlProps_60513( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalDR513( ) ;
         standaloneModalDR513( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowDR513( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60513( ) ;
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
      /* Using cursor T00DR22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00DR22_A407EmprNom[0] ;
      n407EmprNom = T00DR22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T00DR23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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

   public void valid_Clicod( )
   {
      /* Using cursor T00DR23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Facprotar( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3661FacProAny", GXutil.ltrim( localUtil.ntoc( Z3661FacProAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3662FacProSer", GXutil.rtrim( Z3662FacProSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3663FacProInt", GXutil.ltrim( localUtil.ntoc( Z3663FacProInt, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3664FacProTip", GXutil.ltrim( localUtil.ntoc( Z3664FacProTip, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3665FacProTar", GXutil.ltrim( localUtil.ntoc( Z3665FacProTar, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FACPROANY","{handler:'valid_Facproany',iparms:[]");
      setEventMetadata("VALID_FACPROANY",",oparms:[]}");
      setEventMetadata("VALID_FACPROSER","{handler:'valid_Facproser',iparms:[]");
      setEventMetadata("VALID_FACPROSER",",oparms:[]}");
      setEventMetadata("VALID_FACPROINT","{handler:'valid_Facproint',iparms:[]");
      setEventMetadata("VALID_FACPROINT",",oparms:[]}");
      setEventMetadata("VALID_FACPROTIP","{handler:'valid_Facprotip',iparms:[]");
      setEventMetadata("VALID_FACPROTIP",",oparms:[]}");
      setEventMetadata("VALID_FACPROTAR","{handler:'valid_Facprotar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A3661FacProAny',fld:'FACPROANY',pic:'ZZZ9'},{av:'A3662FacProSer',fld:'FACPROSER',pic:''},{av:'A3663FacProInt',fld:'FACPROINT',pic:'Z9'},{av:'A3664FacProTip',fld:'FACPROTIP',pic:'Z9'},{av:'A3665FacProTar',fld:'FACPROTAR',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FACPROTAR",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z3661FacProAny'},{av:'Z3662FacProSer'},{av:'Z3663FacProInt'},{av:'Z3664FacProTip'},{av:'Z3665FacProTar'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FACPROMES","{handler:'valid_Facpromes',iparms:[]");
      setEventMetadata("VALID_FACPROMES",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Facprovalm',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z3662FacProSer = "" ;
      Z3667FacProKgs = DecimalUtil.ZERO ;
      Z3677FacProMts = DecimalUtil.ZERO ;
      Z3668FacProVal = DecimalUtil.ZERO ;
      Z3678FacProValM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A3662FacProSer = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode513 = "" ;
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
      sMode512 = "" ;
      GXCCtl = "" ;
      A3667FacProKgs = DecimalUtil.ZERO ;
      A3677FacProMts = DecimalUtil.ZERO ;
      A3668FacProVal = DecimalUtil.ZERO ;
      A3678FacProValM = DecimalUtil.ZERO ;
      AV18Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV17UsurCod = "" ;
      AV20LitFe = "" ;
      AV19Lit0 = "" ;
      AV21lit1 = "" ;
      AV25lit5 = "" ;
      AV26lit6 = "" ;
      AV27lit7 = "" ;
      AV28lit8 = "" ;
      AV29lit9 = "" ;
      AV50lit30 = "" ;
      AV51lit31 = "" ;
      AV52lit32 = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV53P0 = "" ;
      AV54P1 = "" ;
      Z407EmprNom = "" ;
      T00DR6_A407EmprNom = new String[] {""} ;
      T00DR6_n407EmprNom = new boolean[] {false} ;
      T00DR8_A3661FacProAny = new short[1] ;
      T00DR8_A3662FacProSer = new String[] {""} ;
      T00DR8_A3663FacProInt = new byte[1] ;
      T00DR8_A3664FacProTip = new byte[1] ;
      T00DR8_A3665FacProTar = new short[1] ;
      T00DR8_A407EmprNom = new String[] {""} ;
      T00DR8_n407EmprNom = new boolean[] {false} ;
      T00DR8_A396EmprCod = new String[] {""} ;
      T00DR8_A252CliCod = new int[1] ;
      T00DR7_A396EmprCod = new String[] {""} ;
      T00DR9_A396EmprCod = new String[] {""} ;
      T00DR10_A396EmprCod = new String[] {""} ;
      T00DR10_A252CliCod = new int[1] ;
      T00DR10_A3661FacProAny = new short[1] ;
      T00DR10_A3662FacProSer = new String[] {""} ;
      T00DR10_A3663FacProInt = new byte[1] ;
      T00DR10_A3664FacProTip = new byte[1] ;
      T00DR10_A3665FacProTar = new short[1] ;
      T00DR5_A3661FacProAny = new short[1] ;
      T00DR5_A3662FacProSer = new String[] {""} ;
      T00DR5_A3663FacProInt = new byte[1] ;
      T00DR5_A3664FacProTip = new byte[1] ;
      T00DR5_A3665FacProTar = new short[1] ;
      T00DR5_A396EmprCod = new String[] {""} ;
      T00DR5_A252CliCod = new int[1] ;
      T00DR11_A396EmprCod = new String[] {""} ;
      T00DR11_A252CliCod = new int[1] ;
      T00DR11_A3661FacProAny = new short[1] ;
      T00DR11_A3662FacProSer = new String[] {""} ;
      T00DR11_A3663FacProInt = new byte[1] ;
      T00DR11_A3664FacProTip = new byte[1] ;
      T00DR11_A3665FacProTar = new short[1] ;
      T00DR12_A396EmprCod = new String[] {""} ;
      T00DR12_A252CliCod = new int[1] ;
      T00DR12_A3661FacProAny = new short[1] ;
      T00DR12_A3662FacProSer = new String[] {""} ;
      T00DR12_A3663FacProInt = new byte[1] ;
      T00DR12_A3664FacProTip = new byte[1] ;
      T00DR12_A3665FacProTar = new short[1] ;
      T00DR4_A3661FacProAny = new short[1] ;
      T00DR4_A3662FacProSer = new String[] {""} ;
      T00DR4_A3663FacProInt = new byte[1] ;
      T00DR4_A3664FacProTip = new byte[1] ;
      T00DR4_A3665FacProTar = new short[1] ;
      T00DR4_A396EmprCod = new String[] {""} ;
      T00DR4_A252CliCod = new int[1] ;
      T00DR15_A396EmprCod = new String[] {""} ;
      T00DR15_A252CliCod = new int[1] ;
      T00DR15_A3661FacProAny = new short[1] ;
      T00DR15_A3662FacProSer = new String[] {""} ;
      T00DR15_A3663FacProInt = new byte[1] ;
      T00DR15_A3664FacProTip = new byte[1] ;
      T00DR15_A3665FacProTar = new short[1] ;
      T00DR16_A252CliCod = new int[1] ;
      T00DR16_A3661FacProAny = new short[1] ;
      T00DR16_A3662FacProSer = new String[] {""} ;
      T00DR16_A3663FacProInt = new byte[1] ;
      T00DR16_A3664FacProTip = new byte[1] ;
      T00DR16_A3665FacProTar = new short[1] ;
      T00DR16_A3666FacProMes = new byte[1] ;
      T00DR16_A3667FacProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR16_n3667FacProKgs = new boolean[] {false} ;
      T00DR16_A3677FacProMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR16_n3677FacProMts = new boolean[] {false} ;
      T00DR16_A3668FacProVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR16_n3668FacProVal = new boolean[] {false} ;
      T00DR16_A3678FacProValM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR16_n3678FacProValM = new boolean[] {false} ;
      T00DR16_A396EmprCod = new String[] {""} ;
      T00DR17_A396EmprCod = new String[] {""} ;
      T00DR17_A252CliCod = new int[1] ;
      T00DR17_A3661FacProAny = new short[1] ;
      T00DR17_A3662FacProSer = new String[] {""} ;
      T00DR17_A3663FacProInt = new byte[1] ;
      T00DR17_A3664FacProTip = new byte[1] ;
      T00DR17_A3665FacProTar = new short[1] ;
      T00DR17_A3666FacProMes = new byte[1] ;
      T00DR3_A252CliCod = new int[1] ;
      T00DR3_A3661FacProAny = new short[1] ;
      T00DR3_A3662FacProSer = new String[] {""} ;
      T00DR3_A3663FacProInt = new byte[1] ;
      T00DR3_A3664FacProTip = new byte[1] ;
      T00DR3_A3665FacProTar = new short[1] ;
      T00DR3_A3666FacProMes = new byte[1] ;
      T00DR3_A3667FacProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR3_n3667FacProKgs = new boolean[] {false} ;
      T00DR3_A3677FacProMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR3_n3677FacProMts = new boolean[] {false} ;
      T00DR3_A3668FacProVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR3_n3668FacProVal = new boolean[] {false} ;
      T00DR3_A3678FacProValM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR3_n3678FacProValM = new boolean[] {false} ;
      T00DR3_A396EmprCod = new String[] {""} ;
      T00DR2_A252CliCod = new int[1] ;
      T00DR2_A3661FacProAny = new short[1] ;
      T00DR2_A3662FacProSer = new String[] {""} ;
      T00DR2_A3663FacProInt = new byte[1] ;
      T00DR2_A3664FacProTip = new byte[1] ;
      T00DR2_A3665FacProTar = new short[1] ;
      T00DR2_A3666FacProMes = new byte[1] ;
      T00DR2_A3667FacProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR2_n3667FacProKgs = new boolean[] {false} ;
      T00DR2_A3677FacProMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR2_n3677FacProMts = new boolean[] {false} ;
      T00DR2_A3668FacProVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR2_n3668FacProVal = new boolean[] {false} ;
      T00DR2_A3678FacProValM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DR2_n3678FacProValM = new boolean[] {false} ;
      T00DR2_A396EmprCod = new String[] {""} ;
      T00DR21_A396EmprCod = new String[] {""} ;
      T00DR21_A252CliCod = new int[1] ;
      T00DR21_A3661FacProAny = new short[1] ;
      T00DR21_A3662FacProSer = new String[] {""} ;
      T00DR21_A3663FacProInt = new byte[1] ;
      T00DR21_A3664FacProTip = new byte[1] ;
      T00DR21_A3665FacProTar = new short[1] ;
      T00DR21_A3666FacProMes = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00DR22_A407EmprNom = new String[] {""} ;
      T00DR22_n407EmprNom = new boolean[] {false} ;
      T00DR23_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ3662FacProSer = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfacpro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfacpro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfacpro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfacpro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfacpro__default(),
         new Object[] {
             new Object[] {
            T00DR2_A252CliCod, T00DR2_A3661FacProAny, T00DR2_A3662FacProSer, T00DR2_A3663FacProInt, T00DR2_A3664FacProTip, T00DR2_A3665FacProTar, T00DR2_A3666FacProMes, T00DR2_A3667FacProKgs, T00DR2_n3667FacProKgs, T00DR2_A3677FacProMts,
            T00DR2_n3677FacProMts, T00DR2_A3668FacProVal, T00DR2_n3668FacProVal, T00DR2_A3678FacProValM, T00DR2_n3678FacProValM, T00DR2_A396EmprCod
            }
            , new Object[] {
            T00DR3_A252CliCod, T00DR3_A3661FacProAny, T00DR3_A3662FacProSer, T00DR3_A3663FacProInt, T00DR3_A3664FacProTip, T00DR3_A3665FacProTar, T00DR3_A3666FacProMes, T00DR3_A3667FacProKgs, T00DR3_n3667FacProKgs, T00DR3_A3677FacProMts,
            T00DR3_n3677FacProMts, T00DR3_A3668FacProVal, T00DR3_n3668FacProVal, T00DR3_A3678FacProValM, T00DR3_n3678FacProValM, T00DR3_A396EmprCod
            }
            , new Object[] {
            T00DR4_A3661FacProAny, T00DR4_A3662FacProSer, T00DR4_A3663FacProInt, T00DR4_A3664FacProTip, T00DR4_A3665FacProTar, T00DR4_A396EmprCod, T00DR4_A252CliCod
            }
            , new Object[] {
            T00DR5_A3661FacProAny, T00DR5_A3662FacProSer, T00DR5_A3663FacProInt, T00DR5_A3664FacProTip, T00DR5_A3665FacProTar, T00DR5_A396EmprCod, T00DR5_A252CliCod
            }
            , new Object[] {
            T00DR6_A407EmprNom, T00DR6_n407EmprNom
            }
            , new Object[] {
            T00DR7_A396EmprCod
            }
            , new Object[] {
            T00DR8_A3661FacProAny, T00DR8_A3662FacProSer, T00DR8_A3663FacProInt, T00DR8_A3664FacProTip, T00DR8_A3665FacProTar, T00DR8_A407EmprNom, T00DR8_n407EmprNom, T00DR8_A396EmprCod, T00DR8_A252CliCod
            }
            , new Object[] {
            T00DR9_A396EmprCod
            }
            , new Object[] {
            T00DR10_A396EmprCod, T00DR10_A252CliCod, T00DR10_A3661FacProAny, T00DR10_A3662FacProSer, T00DR10_A3663FacProInt, T00DR10_A3664FacProTip, T00DR10_A3665FacProTar
            }
            , new Object[] {
            T00DR11_A396EmprCod, T00DR11_A252CliCod, T00DR11_A3661FacProAny, T00DR11_A3662FacProSer, T00DR11_A3663FacProInt, T00DR11_A3664FacProTip, T00DR11_A3665FacProTar
            }
            , new Object[] {
            T00DR12_A396EmprCod, T00DR12_A252CliCod, T00DR12_A3661FacProAny, T00DR12_A3662FacProSer, T00DR12_A3663FacProInt, T00DR12_A3664FacProTip, T00DR12_A3665FacProTar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00DR15_A396EmprCod, T00DR15_A252CliCod, T00DR15_A3661FacProAny, T00DR15_A3662FacProSer, T00DR15_A3663FacProInt, T00DR15_A3664FacProTip, T00DR15_A3665FacProTar
            }
            , new Object[] {
            T00DR16_A252CliCod, T00DR16_A3661FacProAny, T00DR16_A3662FacProSer, T00DR16_A3663FacProInt, T00DR16_A3664FacProTip, T00DR16_A3665FacProTar, T00DR16_A3666FacProMes, T00DR16_A3667FacProKgs, T00DR16_n3667FacProKgs, T00DR16_A3677FacProMts,
            T00DR16_n3677FacProMts, T00DR16_A3668FacProVal, T00DR16_n3668FacProVal, T00DR16_A3678FacProValM, T00DR16_n3678FacProValM, T00DR16_A396EmprCod
            }
            , new Object[] {
            T00DR17_A396EmprCod, T00DR17_A252CliCod, T00DR17_A3661FacProAny, T00DR17_A3662FacProSer, T00DR17_A3663FacProInt, T00DR17_A3664FacProTip, T00DR17_A3665FacProTar, T00DR17_A3666FacProMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00DR21_A396EmprCod, T00DR21_A252CliCod, T00DR21_A3661FacProAny, T00DR21_A3662FacProSer, T00DR21_A3663FacProInt, T00DR21_A3664FacProTip, T00DR21_A3665FacProTar, T00DR21_A3666FacProMes
            }
            , new Object[] {
            T00DR22_A407EmprNom, T00DR22_n407EmprNom
            }
            , new Object[] {
            T00DR23_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z3663FacProInt ;
   private byte Z3664FacProTip ;
   private byte Z3666FacProMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A3663FacProInt ;
   private byte A3664FacProTip ;
   private byte A3666FacProMes ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ3663FacProInt ;
   private byte ZZ3664FacProTip ;
   private short Z3661FacProAny ;
   private short Z3665FacProTar ;
   private short nRcdDeleted_513 ;
   private short nRcdExists_513 ;
   private short nIsMod_513 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3661FacProAny ;
   private short A3665FacProTar ;
   private short nBlankRcdCount513 ;
   private short RcdFound513 ;
   private short nBlankRcdUsr513 ;
   private short RcdFound512 ;
   private short nIsDirty_512 ;
   private short nIsDirty_513 ;
   private short ZZ3661FacProAny ;
   private short ZZ3665FacProTar ;
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
   private int edtFacProAny_Enabled ;
   private int edtFacProSer_Enabled ;
   private int edtFacProInt_Enabled ;
   private int edtFacProTip_Enabled ;
   private int edtFacProTar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_513_Enabled ;
   private int edtFacProMes_Enabled ;
   private int edtFacProKgs_Enabled ;
   private int edtFacProMts_Enabled ;
   private int edtFacProVal_Enabled ;
   private int edtFacProValM_Enabled ;
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
   private int defedtFacProMes_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtFacProTar_Backcolor ;
   private int edtFacProTip_Backcolor ;
   private int edtFacProInt_Backcolor ;
   private int edtFacProSer_Backcolor ;
   private int edtFacProAny_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z3667FacProKgs ;
   private java.math.BigDecimal Z3677FacProMts ;
   private java.math.BigDecimal Z3668FacProVal ;
   private java.math.BigDecimal Z3678FacProValM ;
   private java.math.BigDecimal A3667FacProKgs ;
   private java.math.BigDecimal A3677FacProMts ;
   private java.math.BigDecimal A3668FacProVal ;
   private java.math.BigDecimal A3678FacProValM ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z3662FacProSer ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtFacProAny_Internalname ;
   private String edtFacProAny_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtFacProSer_Internalname ;
   private String A3662FacProSer ;
   private String edtFacProSer_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtFacProInt_Internalname ;
   private String edtFacProInt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtFacProTip_Internalname ;
   private String edtFacProTip_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFacProTar_Internalname ;
   private String edtFacProTar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode513 ;
   private String edtavnRcdDeleted_513_Internalname ;
   private String edtFacProMes_Internalname ;
   private String edtFacProKgs_Internalname ;
   private String edtFacProMts_Internalname ;
   private String edtFacProVal_Internalname ;
   private String edtFacProValM_Internalname ;
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
   private String sMode512 ;
   private String GXCCtl ;
   private String AV18Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV17UsurCod ;
   private String AV20LitFe ;
   private String AV19Lit0 ;
   private String AV21lit1 ;
   private String AV25lit5 ;
   private String AV26lit6 ;
   private String AV27lit7 ;
   private String AV28lit8 ;
   private String AV29lit9 ;
   private String AV50lit30 ;
   private String AV51lit31 ;
   private String AV52lit32 ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV53P0 ;
   private String AV54P1 ;
   private String Z407EmprNom ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_513_Jsonclick ;
   private String edtFacProMes_Jsonclick ;
   private String edtFacProKgs_Jsonclick ;
   private String edtFacProMts_Jsonclick ;
   private String edtFacProVal_Jsonclick ;
   private String edtFacProValM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ3662FacProSer ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3667FacProKgs ;
   private boolean n3677FacProMts ;
   private boolean n3668FacProVal ;
   private boolean n3678FacProValM ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00DR6_A407EmprNom ;
   private boolean[] T00DR6_n407EmprNom ;
   private short[] T00DR8_A3661FacProAny ;
   private String[] T00DR8_A3662FacProSer ;
   private byte[] T00DR8_A3663FacProInt ;
   private byte[] T00DR8_A3664FacProTip ;
   private short[] T00DR8_A3665FacProTar ;
   private String[] T00DR8_A407EmprNom ;
   private boolean[] T00DR8_n407EmprNom ;
   private String[] T00DR8_A396EmprCod ;
   private int[] T00DR8_A252CliCod ;
   private String[] T00DR7_A396EmprCod ;
   private String[] T00DR9_A396EmprCod ;
   private String[] T00DR10_A396EmprCod ;
   private int[] T00DR10_A252CliCod ;
   private short[] T00DR10_A3661FacProAny ;
   private String[] T00DR10_A3662FacProSer ;
   private byte[] T00DR10_A3663FacProInt ;
   private byte[] T00DR10_A3664FacProTip ;
   private short[] T00DR10_A3665FacProTar ;
   private short[] T00DR5_A3661FacProAny ;
   private String[] T00DR5_A3662FacProSer ;
   private byte[] T00DR5_A3663FacProInt ;
   private byte[] T00DR5_A3664FacProTip ;
   private short[] T00DR5_A3665FacProTar ;
   private String[] T00DR5_A396EmprCod ;
   private int[] T00DR5_A252CliCod ;
   private String[] T00DR11_A396EmprCod ;
   private int[] T00DR11_A252CliCod ;
   private short[] T00DR11_A3661FacProAny ;
   private String[] T00DR11_A3662FacProSer ;
   private byte[] T00DR11_A3663FacProInt ;
   private byte[] T00DR11_A3664FacProTip ;
   private short[] T00DR11_A3665FacProTar ;
   private String[] T00DR12_A396EmprCod ;
   private int[] T00DR12_A252CliCod ;
   private short[] T00DR12_A3661FacProAny ;
   private String[] T00DR12_A3662FacProSer ;
   private byte[] T00DR12_A3663FacProInt ;
   private byte[] T00DR12_A3664FacProTip ;
   private short[] T00DR12_A3665FacProTar ;
   private short[] T00DR4_A3661FacProAny ;
   private String[] T00DR4_A3662FacProSer ;
   private byte[] T00DR4_A3663FacProInt ;
   private byte[] T00DR4_A3664FacProTip ;
   private short[] T00DR4_A3665FacProTar ;
   private String[] T00DR4_A396EmprCod ;
   private int[] T00DR4_A252CliCod ;
   private String[] T00DR15_A396EmprCod ;
   private int[] T00DR15_A252CliCod ;
   private short[] T00DR15_A3661FacProAny ;
   private String[] T00DR15_A3662FacProSer ;
   private byte[] T00DR15_A3663FacProInt ;
   private byte[] T00DR15_A3664FacProTip ;
   private short[] T00DR15_A3665FacProTar ;
   private int[] T00DR16_A252CliCod ;
   private short[] T00DR16_A3661FacProAny ;
   private String[] T00DR16_A3662FacProSer ;
   private byte[] T00DR16_A3663FacProInt ;
   private byte[] T00DR16_A3664FacProTip ;
   private short[] T00DR16_A3665FacProTar ;
   private byte[] T00DR16_A3666FacProMes ;
   private java.math.BigDecimal[] T00DR16_A3667FacProKgs ;
   private boolean[] T00DR16_n3667FacProKgs ;
   private java.math.BigDecimal[] T00DR16_A3677FacProMts ;
   private boolean[] T00DR16_n3677FacProMts ;
   private java.math.BigDecimal[] T00DR16_A3668FacProVal ;
   private boolean[] T00DR16_n3668FacProVal ;
   private java.math.BigDecimal[] T00DR16_A3678FacProValM ;
   private boolean[] T00DR16_n3678FacProValM ;
   private String[] T00DR16_A396EmprCod ;
   private String[] T00DR17_A396EmprCod ;
   private int[] T00DR17_A252CliCod ;
   private short[] T00DR17_A3661FacProAny ;
   private String[] T00DR17_A3662FacProSer ;
   private byte[] T00DR17_A3663FacProInt ;
   private byte[] T00DR17_A3664FacProTip ;
   private short[] T00DR17_A3665FacProTar ;
   private byte[] T00DR17_A3666FacProMes ;
   private int[] T00DR3_A252CliCod ;
   private short[] T00DR3_A3661FacProAny ;
   private String[] T00DR3_A3662FacProSer ;
   private byte[] T00DR3_A3663FacProInt ;
   private byte[] T00DR3_A3664FacProTip ;
   private short[] T00DR3_A3665FacProTar ;
   private byte[] T00DR3_A3666FacProMes ;
   private java.math.BigDecimal[] T00DR3_A3667FacProKgs ;
   private boolean[] T00DR3_n3667FacProKgs ;
   private java.math.BigDecimal[] T00DR3_A3677FacProMts ;
   private boolean[] T00DR3_n3677FacProMts ;
   private java.math.BigDecimal[] T00DR3_A3668FacProVal ;
   private boolean[] T00DR3_n3668FacProVal ;
   private java.math.BigDecimal[] T00DR3_A3678FacProValM ;
   private boolean[] T00DR3_n3678FacProValM ;
   private String[] T00DR3_A396EmprCod ;
   private int[] T00DR2_A252CliCod ;
   private short[] T00DR2_A3661FacProAny ;
   private String[] T00DR2_A3662FacProSer ;
   private byte[] T00DR2_A3663FacProInt ;
   private byte[] T00DR2_A3664FacProTip ;
   private short[] T00DR2_A3665FacProTar ;
   private byte[] T00DR2_A3666FacProMes ;
   private java.math.BigDecimal[] T00DR2_A3667FacProKgs ;
   private boolean[] T00DR2_n3667FacProKgs ;
   private java.math.BigDecimal[] T00DR2_A3677FacProMts ;
   private boolean[] T00DR2_n3677FacProMts ;
   private java.math.BigDecimal[] T00DR2_A3668FacProVal ;
   private boolean[] T00DR2_n3668FacProVal ;
   private java.math.BigDecimal[] T00DR2_A3678FacProValM ;
   private boolean[] T00DR2_n3678FacProValM ;
   private String[] T00DR2_A396EmprCod ;
   private String[] T00DR21_A396EmprCod ;
   private int[] T00DR21_A252CliCod ;
   private short[] T00DR21_A3661FacProAny ;
   private String[] T00DR21_A3662FacProSer ;
   private byte[] T00DR21_A3663FacProInt ;
   private byte[] T00DR21_A3664FacProTip ;
   private short[] T00DR21_A3665FacProTar ;
   private byte[] T00DR21_A3666FacProMes ;
   private String[] T00DR22_A407EmprNom ;
   private boolean[] T00DR22_n407EmprNom ;
   private String[] T00DR23_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfacpro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacpro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacpro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacpro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00DR2", "SELECT CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes, FacProKgs, FacProMts, FacProVal, FacProValM, EmprCod FROM TXPLFACPR WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ? AND FacProMes = ?  FOR UPDATE OF FacProKgs, FacProMts, FacProVal, FacProValM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR3", "SELECT CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes, FacProKgs, FacProMts, FacProVal, FacProValM, EmprCod FROM TXPLFACPR WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ? AND FacProMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR4", "SELECT FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, EmprCod, CliCod FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ?  FOR UPDATE OF FacProAny NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR5", "SELECT FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, EmprCod, CliCod FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR7", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR8", "SELECT /*+ FIRST_ROWS(100) */ TM1.FacProAny, TM1.FacProSer, TM1.FacProInt, TM1.FacProTip, TM1.FacProTar, T2.EmprNom, TM1.EmprCod, TM1.CliCod FROM (TXPFACPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.FacProAny = ? and TM1.FacProSer = ? and TM1.FacProInt = ? and TM1.FacProTip = ? and TM1.FacProTar = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.FacProAny, TM1.FacProSer, TM1.FacProInt, TM1.FacProTip, TM1.FacProTar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR9", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE ( CliCod > ? or CliCod = ? and FacProAny > ? or FacProAny = ? and CliCod = ? and FacProSer > ? or FacProSer = ? and FacProAny = ? and CliCod = ? and FacProInt > ? or FacProInt = ? and FacProSer = ? and FacProAny = ? and CliCod = ? and FacProTip > ? or FacProTip = ? and FacProInt = ? and FacProSer = ? and FacProAny = ? and CliCod = ? and FacProTar > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DR12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE ( CliCod < ? or CliCod = ? and FacProAny < ? or FacProAny = ? and CliCod = ? and FacProSer < ? or FacProSer = ? and FacProAny = ? and CliCod = ? and FacProInt < ? or FacProInt = ? and FacProSer = ? and FacProAny = ? and CliCod = ? and FacProTip < ? or FacProTip = ? and FacProInt = ? and FacProSer = ? and FacProAny = ? and CliCod = ? and FacProTar < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, FacProAny DESC, FacProSer DESC, FacProInt DESC, FacProTip DESC, FacProTar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00DR13", "INSERT INTO TXPFACPRO(FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFACPRO")
         ,new UpdateCursor("T00DR14", "DELETE FROM TXPFACPRO  WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ?", GX_NOMASK, "TXPFACPRO")
         ,new ForEachCursor("T00DR15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? ORDER BY EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR16", "SELECT CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes, FacProKgs, FacProMts, FacProVal, FacProValM, EmprCod FROM TXPLFACPR WHERE EmprCod = ? and CliCod = ? and FacProAny = ? and FacProSer = ? and FacProInt = ? and FacProTip = ? and FacProTar = ? and FacProMes = ? ORDER BY EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR17", "SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes FROM TXPLFACPR WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ? AND FacProMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00DR18", "INSERT INTO TXPLFACPR(CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes, FacProKgs, FacProMts, FacProVal, FacProValM, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLFACPR")
         ,new UpdateCursor("T00DR19", "UPDATE TXPLFACPR SET FacProKgs=?, FacProMts=?, FacProVal=?, FacProValM=?  WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ? AND FacProMes = ?", GX_NOMASK, "TXPLFACPR")
         ,new UpdateCursor("T00DR20", "DELETE FROM TXPLFACPR  WHERE EmprCod = ? AND CliCod = ? AND FacProAny = ? AND FacProSer = ? AND FacProInt = ? AND FacProTip = ? AND FacProTar = ? AND FacProMes = ?", GX_NOMASK, "TXPLFACPR")
         ,new ForEachCursor("T00DR21", "SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes FROM TXPLFACPR WHERE EmprCod = ? and CliCod = ? and FacProAny = ? and FacProSer = ? and FacProInt = ? and FacProTip = ? and FacProTar = ? ORDER BY EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar, FacProMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DR23", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
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
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 3);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 3);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               stmt.setString(12, (String)parms[15], 3);
               return;
            case 17 :
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
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               stmt.setString(8, (String)parms[11], 3);
               stmt.setByte(9, ((Number) parms[12]).byteValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setShort(11, ((Number) parms[14]).shortValue());
               stmt.setByte(12, ((Number) parms[15]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

