package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tobsest_impl extends GXDataArea
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
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = httpContext.GetPar( "EstNomCol") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A252CliCod, A65ArtCod, A4061EstNomCol) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "obsest", ""), (short)(0)) ;
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

   public tobsest_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tobsest_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tobsest_impl.class ));
   }

   public tobsest_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Tobsest.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNomCol_Internalname, GXutil.rtrim( A4061EstNomCol), GXutil.rtrim( localUtil.format( A4061EstNomCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNomCol_Jsonclick, 0, "", "", "", "", "", 1, edtEstNomCol_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Contador linea obser formulas", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstObsLin2_Internalname, GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstObsLin2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4073EstObsLin2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4073EstObsLin2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstObsLin2_Jsonclick, 0, "", "", "", "", "", 1, edtEstObsLin2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Observaciones Formula", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstobs2_Internalname, GXutil.rtrim( A4074Estobs2), GXutil.rtrim( localUtil.format( A4074Estobs2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstobs2_Jsonclick, 0, "", "", "", "", "", 1, edtEstobs2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tobsest.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tobsest.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_Tobsest.htm");
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
      e111G02 ();
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
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z4061EstNomCol = httpContext.cgiGet( "Z4061EstNomCol") ;
            Z4073EstObsLin2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4073EstObsLin2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4074Estobs2 = httpContext.cgiGet( "Z4074Estobs2") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = httpContext.cgiGet( edtEstNomCol_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstObsLin2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstObsLin2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTOBSLIN2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstObsLin2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4073EstObsLin2 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
            }
            else
            {
               A4073EstObsLin2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstObsLin2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4074Estobs2 = httpContext.cgiGet( edtEstobs2_Internalname) ;
            n4074Estobs2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4074Estobs2", A4074Estobs2);
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4061EstNomCol = httpContext.GetPar( "EstNomCol") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
               A4073EstObsLin2 = (byte)(GXutil.lval( httpContext.GetPar( "EstObsLin2"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
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
                        e111G02 ();
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
            initAll1G01592( ) ;
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
      disableAttributes1G01592( ) ;
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

   public void confirm_1G00( )
   {
      beforeValidate1G01592( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1G01592( ) ;
         }
         else
         {
            checkExtendedTable1G01592( ) ;
            if ( AnyError == 0 )
            {
               zm1G01592( 2) ;
               zm1G01592( 3) ;
            }
            closeExtendedTableCursors1G01592( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1G00( ) ;
      }
   }

   public void resetCaption1G00( )
   {
   }

   public void e111G02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tobsest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tobsest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tobsest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tobsest_impl.this.A396EmprCod = GXv_char2[0] ;
      tobsest_impl.this.AV11EmprNom = GXv_char3[0] ;
      tobsest_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1G01592( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4074Estobs2 = T01G03_A4074Estobs2[0] ;
         }
         else
         {
            Z4074Estobs2 = A4074Estobs2 ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4073EstObsLin2 = A4073EstObsLin2 ;
         Z4074Estobs2 = A4074Estobs2 ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "Tobsest" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01G04 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01G04_A407EmprNom[0] ;
      n407EmprNom = T01G04_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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

   public void load1G01592( )
   {
      /* Using cursor T01G06 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A407EmprNom = T01G06_A407EmprNom[0] ;
         n407EmprNom = T01G06_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4074Estobs2 = T01G06_A4074Estobs2[0] ;
         n4074Estobs2 = T01G06_n4074Estobs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4074Estobs2", A4074Estobs2);
         zm1G01592( -1) ;
      }
      pr_default.close(4);
      onLoadActions1G01592( ) ;
   }

   public void onLoadActions1G01592( )
   {
   }

   public void checkExtendedTable1G01592( )
   {
      nIsDirty_1592 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01G05 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Formula Estampación", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTNOMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1G01592( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod ,
                         String A4061EstNomCol )
   {
      /* Using cursor T01G07 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Formula Estampación", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTNOMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1G01592( )
   {
      /* Using cursor T01G08 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1592 = (short)(1) ;
      }
      else
      {
         RcdFound1592 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01G03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01G03_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1G01592( 1) ;
         RcdFound1592 = (short)(1) ;
         A4073EstObsLin2 = T01G03_A4073EstObsLin2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
         A4074Estobs2 = T01G03_A4074Estobs2[0] ;
         n4074Estobs2 = T01G03_n4074Estobs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4074Estobs2", A4074Estobs2);
         A252CliCod = T01G03_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01G03_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = T01G03_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         Z4073EstObsLin2 = A4073EstObsLin2 ;
         sMode1592 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G01592( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1592 = (short)(0) ;
            initializeNonKey1G01592( ) ;
         }
         Gx_mode = sMode1592 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1592 = (short)(0) ;
         initializeNonKey1G01592( ) ;
         sMode1592 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1592 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1G01592( ) ;
      if ( RcdFound1592 == 0 )
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
      RcdFound1592 = (short)(0) ;
      /* Using cursor T01G09 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A4061EstNomCol, A4061EstNomCol, A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A4073EstObsLin2), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01G09_A252CliCod[0] < A252CliCod ) || ( T01G09_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G09_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01G09_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01G09_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G09_A4061EstNomCol[0], A4061EstNomCol) < 0 ) || ( GXutil.strcmp(T01G09_A4061EstNomCol[0], A4061EstNomCol) == 0 ) && ( GXutil.strcmp(T01G09_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01G09_A252CliCod[0] == A252CliCod ) && ( T01G09_A4073EstObsLin2[0] < A4073EstObsLin2 ) ) && ( GXutil.strcmp(T01G09_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01G09_A252CliCod[0] > A252CliCod ) || ( T01G09_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G09_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01G09_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01G09_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G09_A4061EstNomCol[0], A4061EstNomCol) > 0 ) || ( GXutil.strcmp(T01G09_A4061EstNomCol[0], A4061EstNomCol) == 0 ) && ( GXutil.strcmp(T01G09_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01G09_A252CliCod[0] == A252CliCod ) && ( T01G09_A4073EstObsLin2[0] > A4073EstObsLin2 ) ) && ( GXutil.strcmp(T01G09_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01G09_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01G09_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = T01G09_A4061EstNomCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            A4073EstObsLin2 = T01G09_A4073EstObsLin2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
            RcdFound1592 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1592 = (short)(0) ;
      /* Using cursor T01G010 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A4061EstNomCol, A4061EstNomCol, A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A4073EstObsLin2), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01G010_A252CliCod[0] > A252CliCod ) || ( T01G010_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G010_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01G010_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01G010_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G010_A4061EstNomCol[0], A4061EstNomCol) > 0 ) || ( GXutil.strcmp(T01G010_A4061EstNomCol[0], A4061EstNomCol) == 0 ) && ( GXutil.strcmp(T01G010_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01G010_A252CliCod[0] == A252CliCod ) && ( T01G010_A4073EstObsLin2[0] > A4073EstObsLin2 ) ) && ( GXutil.strcmp(T01G010_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01G010_A252CliCod[0] < A252CliCod ) || ( T01G010_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G010_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01G010_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01G010_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01G010_A4061EstNomCol[0], A4061EstNomCol) < 0 ) || ( GXutil.strcmp(T01G010_A4061EstNomCol[0], A4061EstNomCol) == 0 ) && ( GXutil.strcmp(T01G010_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01G010_A252CliCod[0] == A252CliCod ) && ( T01G010_A4073EstObsLin2[0] < A4073EstObsLin2 ) ) && ( GXutil.strcmp(T01G010_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01G010_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01G010_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = T01G010_A4061EstNomCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            A4073EstObsLin2 = T01G010_A4073EstObsLin2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
            RcdFound1592 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G01592( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1G01592( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1592 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) || ( A4073EstObsLin2 != Z4073EstObsLin2 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4061EstNomCol = Z4061EstNomCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
               A4073EstObsLin2 = Z4073EstObsLin2 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
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
               update1G01592( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) || ( A4073EstObsLin2 != Z4073EstObsLin2 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1G01592( ) ;
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
                  insert1G01592( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) || ( A4073EstObsLin2 != Z4073EstObsLin2 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = Z4061EstNomCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
         A4073EstObsLin2 = Z4073EstObsLin2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
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
      getKey1G01592( ) ;
      if ( RcdFound1592 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) || ( A4073EstObsLin2 != Z4073EstObsLin2 ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = Z65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = Z4061EstNomCol ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            A4073EstObsLin2 = Z4073EstObsLin2 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) || ( A4073EstObsLin2 != Z4073EstObsLin2 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tobsest");
      GX_FocusControl = edtEstobs2_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1G00( ) ;
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
      if ( RcdFound1592 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEstobs2_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1G01592( ) ;
      if ( RcdFound1592 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstobs2_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G01592( ) ;
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
      if ( RcdFound1592 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstobs2_Internalname ;
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
      if ( RcdFound1592 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstobs2_Internalname ;
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
      scanStart1G01592( ) ;
      if ( RcdFound1592 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1592 != 0 )
         {
            scanNext1G01592( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstobs2_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G01592( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1G01592( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01G02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPObsest"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4074Estobs2, T01G02_A4074Estobs2[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4074Estobs2, T01G02_A4074Estobs2[0]) != 0 )
            {
               GXutil.writeLogln("tobsest:[seudo value changed for attri]"+"Estobs2");
               GXutil.writeLogRaw("Old: ",Z4074Estobs2);
               GXutil.writeLogRaw("Current: ",T01G02_A4074Estobs2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPObsest"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G01592( )
   {
      beforeValidate1G01592( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G01592( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G01592( 0) ;
         checkOptimisticConcurrency1G01592( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G01592( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G01592( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G011 */
                  pr_default.execute(9, new Object[] {Byte.valueOf(A4073EstObsLin2), Boolean.valueOf(n4074Estobs2), A4074Estobs2, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        resetCaption1G00( ) ;
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
            load1G01592( ) ;
         }
         endLevel1G01592( ) ;
      }
      closeExtendedTableCursors1G01592( ) ;
   }

   public void update1G01592( )
   {
      beforeValidate1G01592( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G01592( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G01592( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G01592( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G01592( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01G012 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n4074Estobs2), A4074Estobs2, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPObsest"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G01592( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1G00( ) ;
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
         endLevel1G01592( ) ;
      }
      closeExtendedTableCursors1G01592( ) ;
   }

   public void deferredUpdate1G01592( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G01592( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G01592( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G01592( ) ;
         afterConfirm1G01592( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G01592( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01G013 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1592 == 0 )
                     {
                        initAll1G01592( ) ;
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
                     resetCaption1G00( ) ;
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
      sMode1592 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G01592( ) ;
      Gx_mode = sMode1592 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G01592( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1G01592( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1G01592( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tobsest");
         if ( AnyError == 0 )
         {
            confirmValues1G00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tobsest");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G01592( )
   {
      /* Scan By routine */
      /* Using cursor T01G014 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound1592 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A252CliCod = T01G014_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01G014_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = T01G014_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
         A4073EstObsLin2 = T01G014_A4073EstObsLin2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G01592( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1592 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A252CliCod = T01G014_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01G014_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A4061EstNomCol = T01G014_A4061EstNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
         A4073EstObsLin2 = T01G014_A4073EstObsLin2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
      }
   }

   public void scanEnd1G01592( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1G01592( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G01592( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G01592( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G01592( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G01592( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G01592( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G01592( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtEstNomCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNomCol_Enabled), 5, 0), true);
      edtEstObsLin2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEstobs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstobs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstobs2_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1G01592( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1G00( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tobsest", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4061EstNomCol", GXutil.rtrim( Z4061EstNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4073EstObsLin2", GXutil.ltrim( localUtil.ntoc( Z4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4074Estobs2", GXutil.rtrim( Z4074Estobs2));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.tobsest", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Tobsest" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "obsest", "") ;
   }

   public void initializeNonKey1G01592( )
   {
      A4074Estobs2 = "" ;
      n4074Estobs2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4074Estobs2", A4074Estobs2);
      Z4074Estobs2 = "" ;
   }

   public void initAll1G01592( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A4061EstNomCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
      A4073EstObsLin2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4073EstObsLin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4073EstObsLin2), 2, 0));
      initializeNonKey1G01592( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241572994", true, true);
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
      httpContext.AddJavascriptSource("tobsest.js", "?20268241572995", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEstNomCol_Internalname = "ESTNOMCOL" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEstObsLin2_Internalname = "ESTOBSLIN2" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEstobs2_Internalname = "ESTOBS2" ;
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
      Form.setCaption( httpContext.getMessage( "obsest", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEstobs2_Jsonclick = "" ;
      edtEstobs2_Backcolor = (int)(0xFFFFFF) ;
      edtEstobs2_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEstObsLin2_Jsonclick = "" ;
      edtEstObsLin2_Backcolor = (int)(0xFFFFFF) ;
      edtEstObsLin2_Enabled = 1 ;
      edtEstNomCol_Jsonclick = "" ;
      edtEstNomCol_Backcolor = (int)(0xFFFFFF) ;
      edtEstNomCol_Enabled = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01G015 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01G015_A407EmprNom[0] ;
      n407EmprNom = T01G015_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01G016 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Formula Estampación", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTNOMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(14);
      GX_FocusControl = edtEstobs2_Internalname ;
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

   public void valid_Estnomcol( )
   {
      /* Using cursor T01G016 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Formula Estampación", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTNOMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Estobslin2( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4074Estobs2", GXutil.rtrim( A4074Estobs2));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4061EstNomCol", GXutil.rtrim( Z4061EstNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4073EstObsLin2", GXutil.ltrim( localUtil.ntoc( Z4073EstObsLin2, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4074Estobs2", GXutil.rtrim( Z4074Estobs2));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTNOMCOL","{handler:'valid_Estnomcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4061EstNomCol',fld:'ESTNOMCOL',pic:''}]");
      setEventMetadata("VALID_ESTNOMCOL",",oparms:[]}");
      setEventMetadata("VALID_ESTOBSLIN2","{handler:'valid_Estobslin2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4061EstNomCol',fld:'ESTNOMCOL',pic:''},{av:'A4073EstObsLin2',fld:'ESTOBSLIN2',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTOBSLIN2",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4074Estobs2',fld:'ESTOBS2',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z4061EstNomCol'},{av:'Z4073EstObsLin2'},{av:'Z407EmprNom'},{av:'Z4074Estobs2'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z4061EstNomCol = "" ;
      Z4074Estobs2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A4061EstNomCol = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A4074Estobs2 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01G04_A407EmprNom = new String[] {""} ;
      T01G04_n407EmprNom = new boolean[] {false} ;
      T01G06_A4073EstObsLin2 = new byte[1] ;
      T01G06_A407EmprNom = new String[] {""} ;
      T01G06_n407EmprNom = new boolean[] {false} ;
      T01G06_A4074Estobs2 = new String[] {""} ;
      T01G06_n4074Estobs2 = new boolean[] {false} ;
      T01G06_A396EmprCod = new String[] {""} ;
      T01G06_A252CliCod = new int[1] ;
      T01G06_A65ArtCod = new String[] {""} ;
      T01G06_A4061EstNomCol = new String[] {""} ;
      T01G05_A396EmprCod = new String[] {""} ;
      T01G07_A396EmprCod = new String[] {""} ;
      T01G08_A396EmprCod = new String[] {""} ;
      T01G08_A252CliCod = new int[1] ;
      T01G08_A65ArtCod = new String[] {""} ;
      T01G08_A4061EstNomCol = new String[] {""} ;
      T01G08_A4073EstObsLin2 = new byte[1] ;
      T01G03_A4073EstObsLin2 = new byte[1] ;
      T01G03_A4074Estobs2 = new String[] {""} ;
      T01G03_n4074Estobs2 = new boolean[] {false} ;
      T01G03_A396EmprCod = new String[] {""} ;
      T01G03_A252CliCod = new int[1] ;
      T01G03_A65ArtCod = new String[] {""} ;
      T01G03_A4061EstNomCol = new String[] {""} ;
      sMode1592 = "" ;
      T01G09_A396EmprCod = new String[] {""} ;
      T01G09_A252CliCod = new int[1] ;
      T01G09_A65ArtCod = new String[] {""} ;
      T01G09_A4061EstNomCol = new String[] {""} ;
      T01G09_A4073EstObsLin2 = new byte[1] ;
      T01G010_A396EmprCod = new String[] {""} ;
      T01G010_A252CliCod = new int[1] ;
      T01G010_A65ArtCod = new String[] {""} ;
      T01G010_A4061EstNomCol = new String[] {""} ;
      T01G010_A4073EstObsLin2 = new byte[1] ;
      T01G02_A4073EstObsLin2 = new byte[1] ;
      T01G02_A4074Estobs2 = new String[] {""} ;
      T01G02_n4074Estobs2 = new boolean[] {false} ;
      T01G02_A396EmprCod = new String[] {""} ;
      T01G02_A252CliCod = new int[1] ;
      T01G02_A65ArtCod = new String[] {""} ;
      T01G02_A4061EstNomCol = new String[] {""} ;
      T01G014_A396EmprCod = new String[] {""} ;
      T01G014_A252CliCod = new int[1] ;
      T01G014_A65ArtCod = new String[] {""} ;
      T01G014_A4061EstNomCol = new String[] {""} ;
      T01G014_A4073EstObsLin2 = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01G015_A407EmprNom = new String[] {""} ;
      T01G015_n407EmprNom = new boolean[] {false} ;
      T01G016_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ4061EstNomCol = "" ;
      ZZ407EmprNom = "" ;
      ZZ4074Estobs2 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tobsest__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tobsest__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tobsest__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tobsest__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tobsest__default(),
         new Object[] {
             new Object[] {
            T01G02_A4073EstObsLin2, T01G02_A4074Estobs2, T01G02_n4074Estobs2, T01G02_A396EmprCod, T01G02_A252CliCod, T01G02_A65ArtCod, T01G02_A4061EstNomCol
            }
            , new Object[] {
            T01G03_A4073EstObsLin2, T01G03_A4074Estobs2, T01G03_n4074Estobs2, T01G03_A396EmprCod, T01G03_A252CliCod, T01G03_A65ArtCod, T01G03_A4061EstNomCol
            }
            , new Object[] {
            T01G04_A407EmprNom, T01G04_n407EmprNom
            }
            , new Object[] {
            T01G05_A396EmprCod
            }
            , new Object[] {
            T01G06_A4073EstObsLin2, T01G06_A407EmprNom, T01G06_n407EmprNom, T01G06_A4074Estobs2, T01G06_n4074Estobs2, T01G06_A396EmprCod, T01G06_A252CliCod, T01G06_A65ArtCod, T01G06_A4061EstNomCol
            }
            , new Object[] {
            T01G07_A396EmprCod
            }
            , new Object[] {
            T01G08_A396EmprCod, T01G08_A252CliCod, T01G08_A65ArtCod, T01G08_A4061EstNomCol, T01G08_A4073EstObsLin2
            }
            , new Object[] {
            T01G09_A396EmprCod, T01G09_A252CliCod, T01G09_A65ArtCod, T01G09_A4061EstNomCol, T01G09_A4073EstObsLin2
            }
            , new Object[] {
            T01G010_A396EmprCod, T01G010_A252CliCod, T01G010_A65ArtCod, T01G010_A4061EstNomCol, T01G010_A4073EstObsLin2
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01G014_A396EmprCod, T01G014_A252CliCod, T01G014_A65ArtCod, T01G014_A4061EstNomCol, T01G014_A4073EstObsLin2
            }
            , new Object[] {
            T01G015_A407EmprNom, T01G015_n407EmprNom
            }
            , new Object[] {
            T01G016_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "Tobsest" ;
   }

   private byte Z4073EstObsLin2 ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4073EstObsLin2 ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ4073EstObsLin2 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1592 ;
   private short nIsDirty_1592 ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtEstNomCol_Enabled ;
   private int edtEstObsLin2_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEstobs2_Enabled ;
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
   private int edtEstobs2_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEstObsLin2_Backcolor ;
   private int edtEstNomCol_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z4061EstNomCol ;
   private String Z4074Estobs2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4061EstNomCol ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
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
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEstNomCol_Internalname ;
   private String edtEstNomCol_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEstObsLin2_Internalname ;
   private String edtEstObsLin2_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEstobs2_Internalname ;
   private String A4074Estobs2 ;
   private String edtEstobs2_Jsonclick ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode1592 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ4061EstNomCol ;
   private String ZZ407EmprNom ;
   private String ZZ4074Estobs2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n4074Estobs2 ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T01G04_A407EmprNom ;
   private boolean[] T01G04_n407EmprNom ;
   private byte[] T01G06_A4073EstObsLin2 ;
   private String[] T01G06_A407EmprNom ;
   private boolean[] T01G06_n407EmprNom ;
   private String[] T01G06_A4074Estobs2 ;
   private boolean[] T01G06_n4074Estobs2 ;
   private String[] T01G06_A396EmprCod ;
   private int[] T01G06_A252CliCod ;
   private String[] T01G06_A65ArtCod ;
   private String[] T01G06_A4061EstNomCol ;
   private String[] T01G05_A396EmprCod ;
   private String[] T01G07_A396EmprCod ;
   private String[] T01G08_A396EmprCod ;
   private int[] T01G08_A252CliCod ;
   private String[] T01G08_A65ArtCod ;
   private String[] T01G08_A4061EstNomCol ;
   private byte[] T01G08_A4073EstObsLin2 ;
   private byte[] T01G03_A4073EstObsLin2 ;
   private String[] T01G03_A4074Estobs2 ;
   private boolean[] T01G03_n4074Estobs2 ;
   private String[] T01G03_A396EmprCod ;
   private int[] T01G03_A252CliCod ;
   private String[] T01G03_A65ArtCod ;
   private String[] T01G03_A4061EstNomCol ;
   private String[] T01G09_A396EmprCod ;
   private int[] T01G09_A252CliCod ;
   private String[] T01G09_A65ArtCod ;
   private String[] T01G09_A4061EstNomCol ;
   private byte[] T01G09_A4073EstObsLin2 ;
   private String[] T01G010_A396EmprCod ;
   private int[] T01G010_A252CliCod ;
   private String[] T01G010_A65ArtCod ;
   private String[] T01G010_A4061EstNomCol ;
   private byte[] T01G010_A4073EstObsLin2 ;
   private byte[] T01G02_A4073EstObsLin2 ;
   private String[] T01G02_A4074Estobs2 ;
   private boolean[] T01G02_n4074Estobs2 ;
   private String[] T01G02_A396EmprCod ;
   private int[] T01G02_A252CliCod ;
   private String[] T01G02_A65ArtCod ;
   private String[] T01G02_A4061EstNomCol ;
   private String[] T01G014_A396EmprCod ;
   private int[] T01G014_A252CliCod ;
   private String[] T01G014_A65ArtCod ;
   private String[] T01G014_A4061EstNomCol ;
   private byte[] T01G014_A4073EstObsLin2 ;
   private String[] T01G015_A407EmprNom ;
   private boolean[] T01G015_n407EmprNom ;
   private String[] T01G016_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tobsest__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tobsest__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tobsest__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tobsest__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tobsest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01G02", "SELECT EstObsLin2, Estobs2, EmprCod, CliCod, ArtCod, EstNomCol FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?  FOR UPDATE OF Estobs2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G03", "SELECT EstObsLin2, Estobs2, EmprCod, CliCod, ArtCod, EstNomCol FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G04", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G05", "SELECT EmprCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G06", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstObsLin2, T2.EmprNom, TM1.Estobs2, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.EstNomCol FROM (TXPObsest TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.EstNomCol = ? and TM1.EstObsLin2 = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.EstNomCol, TM1.EstObsLin2 ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G07", "SELECT EmprCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G08", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G09", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE ( CliCod > ? or CliCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EstNomCol > ? or EstNomCol = ? and ArtCod = ? and CliCod = ? and EstObsLin2 > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01G010", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE ( CliCod < ? or CliCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EstNomCol < ? or EstNomCol = ? and ArtCod = ? and CliCod = ? and EstObsLin2 < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, EstNomCol DESC, EstObsLin2 DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01G011", "INSERT INTO TXPObsest(EstObsLin2, Estobs2, EmprCod, CliCod, ArtCod, EstNomCol) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPObsest")
         ,new UpdateCursor("T01G012", "UPDATE TXPObsest SET Estobs2=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?", GX_NOMASK, "TXPObsest")
         ,new UpdateCursor("T01G013", "DELETE FROM TXPObsest  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?", GX_NOMASK, "TXPObsest")
         ,new ForEachCursor("T01G014", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G015", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01G016", "SELECT EmprCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 40);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
               stmt.setString(6, (String)parms[6], 13);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
      }
   }

}

