package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedroyo_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Pedidos Tejidos ROYO", ""), (short)(0)) ;
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

   public tpedroyo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpedroyo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedroyo_impl.class ));
   }

   public tpedroyo_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPEDRoyo.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero Albaran", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyNAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A12859PEDRoyNAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDRoyNAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyNAlb_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyNAlb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Color/Rollo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyCoNm_Internalname, GXutil.rtrim( A12860PEDRoyCoNm), GXutil.rtrim( localUtil.format( A12860PEDRoyCoNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyCoNm_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyCoNm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "O.A.", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyPed_Internalname, GXutil.rtrim( A12861PEDRoyPed), GXutil.rtrim( localUtil.format( A12861PEDRoyPed, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyPed_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyPed_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPEDRoyFPed_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyFPed_Internalname, localUtil.format(A12862PEDRoyFPed, "99/99/99"), localUtil.format( A12862PEDRoyFPed, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyFPed_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyFPed_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPEDRoyFPed_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPEDRoyFPed_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Fecha Compromiso", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPEDRoyFcom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyFcom_Internalname, localUtil.format(A12863PEDRoyFcom, "99/99/99"), localUtil.format( A12863PEDRoyFcom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyFcom_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyFcom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPEDRoyFcom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPEDRoyFcom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Articulo Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyArt_Internalname, GXutil.rtrim( A12864PEDRoyArt), GXutil.rtrim( localUtil.format( A12864PEDRoyArt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyArt_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyArt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A12865PEDRoyAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDRoyAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12865PEDRoyAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12865PEDRoyAnc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyAnc_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyAnc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPEDRoyObs_Internalname, A12866PEDRoyObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtPEDRoyObs_Enabled, 0, 80, "chr", 7, "row", (byte)(0), StyleString, ClassString, "", "", "540", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Estado Pedido", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyEst_Internalname, GXutil.ltrim( localUtil.ntoc( A12867PEDRoyEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDRoyEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12867PEDRoyEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A12867PEDRoyEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyEst_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "N disposicion Interna", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyID_Internalname, GXutil.ltrim( localUtil.ntoc( A12868PEDRoyID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDRoyID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12868PEDRoyID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12868PEDRoyID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyID_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyID_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Kilos Pedidos", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A12869PEDRoyKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDRoyKgs_Enabled!=0) ? localUtil.format( A12869PEDRoyKgs, "ZZZZZ9.99") : localUtil.format( A12869PEDRoyKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyKgs_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Metros Pedidos", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyMts_Internalname, GXutil.ltrim( localUtil.ntoc( A12870PEDRoyMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDRoyMts_Enabled!=0) ? localUtil.format( A12870PEDRoyMts, "ZZZZZ9.99") : localUtil.format( A12870PEDRoyMts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyMts_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Piezas Pedidos", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A12871PEDRoyPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDRoyPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12871PEDRoyPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12871PEDRoyPzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyPzs_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Articulo Txp", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyArtA_Internalname, GXutil.rtrim( A12872PEDRoyArtA), GXutil.rtrim( localUtil.format( A12872PEDRoyArtA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyArtA_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyArtA_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Ultima linea Observaciones", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyObsU_Internalname, GXutil.ltrim( localUtil.ntoc( A12873PEDRoyObsU, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPEDRoyObsU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12873PEDRoyObsU), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12873PEDRoyObsU), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyObsU_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyObsU_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Partida Trama", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyPTra_Internalname, GXutil.rtrim( A12874PEDRoyPTra), GXutil.rtrim( localUtil.format( A12874PEDRoyPTra, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyPTra_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyPTra_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Porcion", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyPorc_Internalname, GXutil.rtrim( A12875PEDRoyPorc), GXutil.rtrim( localUtil.format( A12875PEDRoyPorc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyPorc_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyPorc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Numero OF", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyOF_Internalname, GXutil.rtrim( A12876PEDRoyOF), GXutil.rtrim( localUtil.format( A12876PEDRoyOF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyOF_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyOF_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Proceso Cliente", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyProc_Internalname, GXutil.rtrim( A12877PEDRoyProc), GXutil.rtrim( localUtil.format( A12877PEDRoyProc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyProc_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyProc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Proceso Txp", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPEDRoyProA_Internalname, GXutil.rtrim( A12878PEDRoyProA), GXutil.rtrim( localUtil.format( A12878PEDRoyProA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPEDRoyProA_Jsonclick, 0, "", "", "", "", "", 1, edtPEDRoyProA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDRoyo.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDRoyo.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPEDRoyo.htm");
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
      e111LM2 ();
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
            Z12859PEDRoyNAlb = (int)(localUtil.ctol( httpContext.cgiGet( "Z12859PEDRoyNAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12860PEDRoyCoNm = httpContext.cgiGet( "Z12860PEDRoyCoNm") ;
            Z12861PEDRoyPed = httpContext.cgiGet( "Z12861PEDRoyPed") ;
            Z12862PEDRoyFPed = localUtil.ctod( httpContext.cgiGet( "Z12862PEDRoyFPed"), 0) ;
            Z12863PEDRoyFcom = localUtil.ctod( httpContext.cgiGet( "Z12863PEDRoyFcom"), 0) ;
            Z12864PEDRoyArt = httpContext.cgiGet( "Z12864PEDRoyArt") ;
            Z12865PEDRoyAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z12865PEDRoyAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12866PEDRoyObs = httpContext.cgiGet( "Z12866PEDRoyObs") ;
            Z12867PEDRoyEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12867PEDRoyEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12868PEDRoyID = (int)(localUtil.ctol( httpContext.cgiGet( "Z12868PEDRoyID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12869PEDRoyKgs = localUtil.ctond( httpContext.cgiGet( "Z12869PEDRoyKgs")) ;
            Z12870PEDRoyMts = localUtil.ctond( httpContext.cgiGet( "Z12870PEDRoyMts")) ;
            Z12871PEDRoyPzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z12871PEDRoyPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12872PEDRoyArtA = httpContext.cgiGet( "Z12872PEDRoyArtA") ;
            Z12873PEDRoyObsU = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12873PEDRoyObsU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12874PEDRoyPTra = httpContext.cgiGet( "Z12874PEDRoyPTra") ;
            Z12875PEDRoyPorc = httpContext.cgiGet( "Z12875PEDRoyPorc") ;
            Z12876PEDRoyOF = httpContext.cgiGet( "Z12876PEDRoyOF") ;
            Z12877PEDRoyProc = httpContext.cgiGet( "Z12877PEDRoyProc") ;
            Z12878PEDRoyProA = httpContext.cgiGet( "Z12878PEDRoyProA") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyNAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyNAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDROYNALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyNAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12859PEDRoyNAlb = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
            }
            else
            {
               A12859PEDRoyNAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtPEDRoyNAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
            }
            A12860PEDRoyCoNm = httpContext.cgiGet( edtPEDRoyCoNm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
            A12861PEDRoyPed = httpContext.cgiGet( edtPEDRoyPed_Internalname) ;
            n12861PEDRoyPed = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12861PEDRoyPed", A12861PEDRoyPed);
            if ( localUtil.vcdate( httpContext.cgiGet( edtPEDRoyFPed_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDROYFPED");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyFPed_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12862PEDRoyFPed = GXutil.nullDate() ;
               n12862PEDRoyFPed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12862PEDRoyFPed", localUtil.format(A12862PEDRoyFPed, "99/99/99"));
            }
            else
            {
               A12862PEDRoyFPed = localUtil.ctod( httpContext.cgiGet( edtPEDRoyFPed_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n12862PEDRoyFPed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12862PEDRoyFPed", localUtil.format(A12862PEDRoyFPed, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPEDRoyFcom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDROYFCOM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyFcom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12863PEDRoyFcom = GXutil.nullDate() ;
               n12863PEDRoyFcom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12863PEDRoyFcom", localUtil.format(A12863PEDRoyFcom, "99/99/99"));
            }
            else
            {
               A12863PEDRoyFcom = localUtil.ctod( httpContext.cgiGet( edtPEDRoyFcom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n12863PEDRoyFcom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12863PEDRoyFcom", localUtil.format(A12863PEDRoyFcom, "99/99/99"));
            }
            A12864PEDRoyArt = httpContext.cgiGet( edtPEDRoyArt_Internalname) ;
            n12864PEDRoyArt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12864PEDRoyArt", A12864PEDRoyArt);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDROYANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12865PEDRoyAnc = (short)(0) ;
               n12865PEDRoyAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12865PEDRoyAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12865PEDRoyAnc), 3, 0));
            }
            else
            {
               A12865PEDRoyAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtPEDRoyAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12865PEDRoyAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12865PEDRoyAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12865PEDRoyAnc), 3, 0));
            }
            A12866PEDRoyObs = httpContext.cgiGet( edtPEDRoyObs_Internalname) ;
            n12866PEDRoyObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12866PEDRoyObs", A12866PEDRoyObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDROYEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12867PEDRoyEst = (byte)(0) ;
               n12867PEDRoyEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12867PEDRoyEst", GXutil.str( A12867PEDRoyEst, 1, 0));
            }
            else
            {
               A12867PEDRoyEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtPEDRoyEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12867PEDRoyEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12867PEDRoyEst", GXutil.str( A12867PEDRoyEst, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDROYID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12868PEDRoyID = 0 ;
               n12868PEDRoyID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12868PEDRoyID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12868PEDRoyID), 8, 0));
            }
            else
            {
               A12868PEDRoyID = (int)(localUtil.ctol( httpContext.cgiGet( edtPEDRoyID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12868PEDRoyID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12868PEDRoyID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12868PEDRoyID), 8, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEDRoyKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEDRoyKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDROYKGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12869PEDRoyKgs = DecimalUtil.ZERO ;
               n12869PEDRoyKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12869PEDRoyKgs", GXutil.ltrimstr( A12869PEDRoyKgs, 9, 2));
            }
            else
            {
               A12869PEDRoyKgs = localUtil.ctond( httpContext.cgiGet( edtPEDRoyKgs_Internalname)) ;
               n12869PEDRoyKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12869PEDRoyKgs", GXutil.ltrimstr( A12869PEDRoyKgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPEDRoyMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPEDRoyMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDROYMTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyMts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12870PEDRoyMts = DecimalUtil.ZERO ;
               n12870PEDRoyMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12870PEDRoyMts", GXutil.ltrimstr( A12870PEDRoyMts, 9, 2));
            }
            else
            {
               A12870PEDRoyMts = localUtil.ctond( httpContext.cgiGet( edtPEDRoyMts_Internalname)) ;
               n12870PEDRoyMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12870PEDRoyMts", GXutil.ltrimstr( A12870PEDRoyMts, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDROYPZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyPzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12871PEDRoyPzs = 0 ;
               n12871PEDRoyPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12871PEDRoyPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12871PEDRoyPzs), 6, 0));
            }
            else
            {
               A12871PEDRoyPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtPEDRoyPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12871PEDRoyPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12871PEDRoyPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12871PEDRoyPzs), 6, 0));
            }
            A12872PEDRoyArtA = httpContext.cgiGet( edtPEDRoyArtA_Internalname) ;
            n12872PEDRoyArtA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12872PEDRoyArtA", A12872PEDRoyArtA);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyObsU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPEDRoyObsU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDROYOBSU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPEDRoyObsU_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12873PEDRoyObsU = (byte)(0) ;
               n12873PEDRoyObsU = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12873PEDRoyObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12873PEDRoyObsU), 2, 0));
            }
            else
            {
               A12873PEDRoyObsU = (byte)(localUtil.ctol( httpContext.cgiGet( edtPEDRoyObsU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12873PEDRoyObsU = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12873PEDRoyObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12873PEDRoyObsU), 2, 0));
            }
            A12874PEDRoyPTra = httpContext.cgiGet( edtPEDRoyPTra_Internalname) ;
            n12874PEDRoyPTra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12874PEDRoyPTra", A12874PEDRoyPTra);
            A12875PEDRoyPorc = httpContext.cgiGet( edtPEDRoyPorc_Internalname) ;
            n12875PEDRoyPorc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12875PEDRoyPorc", A12875PEDRoyPorc);
            A12876PEDRoyOF = httpContext.cgiGet( edtPEDRoyOF_Internalname) ;
            n12876PEDRoyOF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12876PEDRoyOF", A12876PEDRoyOF);
            A12877PEDRoyProc = httpContext.cgiGet( edtPEDRoyProc_Internalname) ;
            n12877PEDRoyProc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12877PEDRoyProc", A12877PEDRoyProc);
            A12878PEDRoyProA = httpContext.cgiGet( edtPEDRoyProA_Internalname) ;
            n12878PEDRoyProA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12878PEDRoyProA", A12878PEDRoyProA);
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
               A12859PEDRoyNAlb = (int)(GXutil.lval( httpContext.GetPar( "PEDRoyNAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
               A12860PEDRoyCoNm = httpContext.GetPar( "PEDRoyCoNm") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
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
                        e111LM2 ();
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
            initAll1LM1769( ) ;
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
      disableAttributes1LM1769( ) ;
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

   public void confirm_1LM0( )
   {
      beforeValidate1LM1769( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LM1769( ) ;
         }
         else
         {
            checkExtendedTable1LM1769( ) ;
            if ( AnyError == 0 )
            {
               zm1LM1769( 2) ;
               zm1LM1769( 3) ;
            }
            closeExtendedTableCursors1LM1769( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1LM0( ) ;
      }
   }

   public void resetCaption1LM0( )
   {
   }

   public void e111LM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpedroyo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tpedroyo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpedroyo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpedroyo_impl.this.A396EmprCod = GXv_char2[0] ;
      tpedroyo_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpedroyo_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1LM1769( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12861PEDRoyPed = T01LM3_A12861PEDRoyPed[0] ;
            Z12862PEDRoyFPed = T01LM3_A12862PEDRoyFPed[0] ;
            Z12863PEDRoyFcom = T01LM3_A12863PEDRoyFcom[0] ;
            Z12864PEDRoyArt = T01LM3_A12864PEDRoyArt[0] ;
            Z12865PEDRoyAnc = T01LM3_A12865PEDRoyAnc[0] ;
            Z12866PEDRoyObs = T01LM3_A12866PEDRoyObs[0] ;
            Z12867PEDRoyEst = T01LM3_A12867PEDRoyEst[0] ;
            Z12868PEDRoyID = T01LM3_A12868PEDRoyID[0] ;
            Z12869PEDRoyKgs = T01LM3_A12869PEDRoyKgs[0] ;
            Z12870PEDRoyMts = T01LM3_A12870PEDRoyMts[0] ;
            Z12871PEDRoyPzs = T01LM3_A12871PEDRoyPzs[0] ;
            Z12872PEDRoyArtA = T01LM3_A12872PEDRoyArtA[0] ;
            Z12873PEDRoyObsU = T01LM3_A12873PEDRoyObsU[0] ;
            Z12874PEDRoyPTra = T01LM3_A12874PEDRoyPTra[0] ;
            Z12875PEDRoyPorc = T01LM3_A12875PEDRoyPorc[0] ;
            Z12876PEDRoyOF = T01LM3_A12876PEDRoyOF[0] ;
            Z12877PEDRoyProc = T01LM3_A12877PEDRoyProc[0] ;
            Z12878PEDRoyProA = T01LM3_A12878PEDRoyProA[0] ;
         }
         else
         {
            Z12861PEDRoyPed = A12861PEDRoyPed ;
            Z12862PEDRoyFPed = A12862PEDRoyFPed ;
            Z12863PEDRoyFcom = A12863PEDRoyFcom ;
            Z12864PEDRoyArt = A12864PEDRoyArt ;
            Z12865PEDRoyAnc = A12865PEDRoyAnc ;
            Z12866PEDRoyObs = A12866PEDRoyObs ;
            Z12867PEDRoyEst = A12867PEDRoyEst ;
            Z12868PEDRoyID = A12868PEDRoyID ;
            Z12869PEDRoyKgs = A12869PEDRoyKgs ;
            Z12870PEDRoyMts = A12870PEDRoyMts ;
            Z12871PEDRoyPzs = A12871PEDRoyPzs ;
            Z12872PEDRoyArtA = A12872PEDRoyArtA ;
            Z12873PEDRoyObsU = A12873PEDRoyObsU ;
            Z12874PEDRoyPTra = A12874PEDRoyPTra ;
            Z12875PEDRoyPorc = A12875PEDRoyPorc ;
            Z12876PEDRoyOF = A12876PEDRoyOF ;
            Z12877PEDRoyProc = A12877PEDRoyProc ;
            Z12878PEDRoyProA = A12878PEDRoyProA ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12859PEDRoyNAlb = A12859PEDRoyNAlb ;
         Z12860PEDRoyCoNm = A12860PEDRoyCoNm ;
         Z12861PEDRoyPed = A12861PEDRoyPed ;
         Z12862PEDRoyFPed = A12862PEDRoyFPed ;
         Z12863PEDRoyFcom = A12863PEDRoyFcom ;
         Z12864PEDRoyArt = A12864PEDRoyArt ;
         Z12865PEDRoyAnc = A12865PEDRoyAnc ;
         Z12866PEDRoyObs = A12866PEDRoyObs ;
         Z12867PEDRoyEst = A12867PEDRoyEst ;
         Z12868PEDRoyID = A12868PEDRoyID ;
         Z12869PEDRoyKgs = A12869PEDRoyKgs ;
         Z12870PEDRoyMts = A12870PEDRoyMts ;
         Z12871PEDRoyPzs = A12871PEDRoyPzs ;
         Z12872PEDRoyArtA = A12872PEDRoyArtA ;
         Z12873PEDRoyObsU = A12873PEDRoyObsU ;
         Z12874PEDRoyPTra = A12874PEDRoyPTra ;
         Z12875PEDRoyPorc = A12875PEDRoyPorc ;
         Z12876PEDRoyOF = A12876PEDRoyOF ;
         Z12877PEDRoyProc = A12877PEDRoyProc ;
         Z12878PEDRoyProA = A12878PEDRoyProA ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TPEDRoyo" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01LM4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LM4_A407EmprNom[0] ;
      n407EmprNom = T01LM4_n407EmprNom[0] ;
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

   public void load1LM1769( )
   {
      /* Using cursor T01LM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A12859PEDRoyNAlb), A12860PEDRoyCoNm});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1769 = (short)(1) ;
         A407EmprNom = T01LM6_A407EmprNom[0] ;
         n407EmprNom = T01LM6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01LM6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A12861PEDRoyPed = T01LM6_A12861PEDRoyPed[0] ;
         n12861PEDRoyPed = T01LM6_n12861PEDRoyPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12861PEDRoyPed", A12861PEDRoyPed);
         A12862PEDRoyFPed = T01LM6_A12862PEDRoyFPed[0] ;
         n12862PEDRoyFPed = T01LM6_n12862PEDRoyFPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12862PEDRoyFPed", localUtil.format(A12862PEDRoyFPed, "99/99/99"));
         A12863PEDRoyFcom = T01LM6_A12863PEDRoyFcom[0] ;
         n12863PEDRoyFcom = T01LM6_n12863PEDRoyFcom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12863PEDRoyFcom", localUtil.format(A12863PEDRoyFcom, "99/99/99"));
         A12864PEDRoyArt = T01LM6_A12864PEDRoyArt[0] ;
         n12864PEDRoyArt = T01LM6_n12864PEDRoyArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12864PEDRoyArt", A12864PEDRoyArt);
         A12865PEDRoyAnc = T01LM6_A12865PEDRoyAnc[0] ;
         n12865PEDRoyAnc = T01LM6_n12865PEDRoyAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12865PEDRoyAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12865PEDRoyAnc), 3, 0));
         A12866PEDRoyObs = T01LM6_A12866PEDRoyObs[0] ;
         n12866PEDRoyObs = T01LM6_n12866PEDRoyObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12866PEDRoyObs", A12866PEDRoyObs);
         A12867PEDRoyEst = T01LM6_A12867PEDRoyEst[0] ;
         n12867PEDRoyEst = T01LM6_n12867PEDRoyEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12867PEDRoyEst", GXutil.str( A12867PEDRoyEst, 1, 0));
         A12868PEDRoyID = T01LM6_A12868PEDRoyID[0] ;
         n12868PEDRoyID = T01LM6_n12868PEDRoyID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12868PEDRoyID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12868PEDRoyID), 8, 0));
         A12869PEDRoyKgs = T01LM6_A12869PEDRoyKgs[0] ;
         n12869PEDRoyKgs = T01LM6_n12869PEDRoyKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12869PEDRoyKgs", GXutil.ltrimstr( A12869PEDRoyKgs, 9, 2));
         A12870PEDRoyMts = T01LM6_A12870PEDRoyMts[0] ;
         n12870PEDRoyMts = T01LM6_n12870PEDRoyMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12870PEDRoyMts", GXutil.ltrimstr( A12870PEDRoyMts, 9, 2));
         A12871PEDRoyPzs = T01LM6_A12871PEDRoyPzs[0] ;
         n12871PEDRoyPzs = T01LM6_n12871PEDRoyPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12871PEDRoyPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12871PEDRoyPzs), 6, 0));
         A12872PEDRoyArtA = T01LM6_A12872PEDRoyArtA[0] ;
         n12872PEDRoyArtA = T01LM6_n12872PEDRoyArtA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12872PEDRoyArtA", A12872PEDRoyArtA);
         A12873PEDRoyObsU = T01LM6_A12873PEDRoyObsU[0] ;
         n12873PEDRoyObsU = T01LM6_n12873PEDRoyObsU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12873PEDRoyObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12873PEDRoyObsU), 2, 0));
         A12874PEDRoyPTra = T01LM6_A12874PEDRoyPTra[0] ;
         n12874PEDRoyPTra = T01LM6_n12874PEDRoyPTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12874PEDRoyPTra", A12874PEDRoyPTra);
         A12875PEDRoyPorc = T01LM6_A12875PEDRoyPorc[0] ;
         n12875PEDRoyPorc = T01LM6_n12875PEDRoyPorc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12875PEDRoyPorc", A12875PEDRoyPorc);
         A12876PEDRoyOF = T01LM6_A12876PEDRoyOF[0] ;
         n12876PEDRoyOF = T01LM6_n12876PEDRoyOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12876PEDRoyOF", A12876PEDRoyOF);
         A12877PEDRoyProc = T01LM6_A12877PEDRoyProc[0] ;
         n12877PEDRoyProc = T01LM6_n12877PEDRoyProc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12877PEDRoyProc", A12877PEDRoyProc);
         A12878PEDRoyProA = T01LM6_A12878PEDRoyProA[0] ;
         n12878PEDRoyProA = T01LM6_n12878PEDRoyProA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12878PEDRoyProA", A12878PEDRoyProA);
         zm1LM1769( -1) ;
      }
      pr_default.close(4);
      onLoadActions1LM1769( ) ;
   }

   public void onLoadActions1LM1769( )
   {
   }

   public void checkExtendedTable1LM1769( )
   {
      nIsDirty_1769 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01LM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LM5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1LM1769( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01LM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LM7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1LM1769( )
   {
      /* Using cursor T01LM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A12859PEDRoyNAlb), A12860PEDRoyCoNm});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1769 = (short)(1) ;
      }
      else
      {
         RcdFound1769 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A12859PEDRoyNAlb), A12860PEDRoyCoNm});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01LM3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LM1769( 1) ;
         RcdFound1769 = (short)(1) ;
         A12859PEDRoyNAlb = T01LM3_A12859PEDRoyNAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
         A12860PEDRoyCoNm = T01LM3_A12860PEDRoyCoNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
         A12861PEDRoyPed = T01LM3_A12861PEDRoyPed[0] ;
         n12861PEDRoyPed = T01LM3_n12861PEDRoyPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12861PEDRoyPed", A12861PEDRoyPed);
         A12862PEDRoyFPed = T01LM3_A12862PEDRoyFPed[0] ;
         n12862PEDRoyFPed = T01LM3_n12862PEDRoyFPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12862PEDRoyFPed", localUtil.format(A12862PEDRoyFPed, "99/99/99"));
         A12863PEDRoyFcom = T01LM3_A12863PEDRoyFcom[0] ;
         n12863PEDRoyFcom = T01LM3_n12863PEDRoyFcom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12863PEDRoyFcom", localUtil.format(A12863PEDRoyFcom, "99/99/99"));
         A12864PEDRoyArt = T01LM3_A12864PEDRoyArt[0] ;
         n12864PEDRoyArt = T01LM3_n12864PEDRoyArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12864PEDRoyArt", A12864PEDRoyArt);
         A12865PEDRoyAnc = T01LM3_A12865PEDRoyAnc[0] ;
         n12865PEDRoyAnc = T01LM3_n12865PEDRoyAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12865PEDRoyAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12865PEDRoyAnc), 3, 0));
         A12866PEDRoyObs = T01LM3_A12866PEDRoyObs[0] ;
         n12866PEDRoyObs = T01LM3_n12866PEDRoyObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12866PEDRoyObs", A12866PEDRoyObs);
         A12867PEDRoyEst = T01LM3_A12867PEDRoyEst[0] ;
         n12867PEDRoyEst = T01LM3_n12867PEDRoyEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12867PEDRoyEst", GXutil.str( A12867PEDRoyEst, 1, 0));
         A12868PEDRoyID = T01LM3_A12868PEDRoyID[0] ;
         n12868PEDRoyID = T01LM3_n12868PEDRoyID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12868PEDRoyID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12868PEDRoyID), 8, 0));
         A12869PEDRoyKgs = T01LM3_A12869PEDRoyKgs[0] ;
         n12869PEDRoyKgs = T01LM3_n12869PEDRoyKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12869PEDRoyKgs", GXutil.ltrimstr( A12869PEDRoyKgs, 9, 2));
         A12870PEDRoyMts = T01LM3_A12870PEDRoyMts[0] ;
         n12870PEDRoyMts = T01LM3_n12870PEDRoyMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12870PEDRoyMts", GXutil.ltrimstr( A12870PEDRoyMts, 9, 2));
         A12871PEDRoyPzs = T01LM3_A12871PEDRoyPzs[0] ;
         n12871PEDRoyPzs = T01LM3_n12871PEDRoyPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12871PEDRoyPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12871PEDRoyPzs), 6, 0));
         A12872PEDRoyArtA = T01LM3_A12872PEDRoyArtA[0] ;
         n12872PEDRoyArtA = T01LM3_n12872PEDRoyArtA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12872PEDRoyArtA", A12872PEDRoyArtA);
         A12873PEDRoyObsU = T01LM3_A12873PEDRoyObsU[0] ;
         n12873PEDRoyObsU = T01LM3_n12873PEDRoyObsU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12873PEDRoyObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12873PEDRoyObsU), 2, 0));
         A12874PEDRoyPTra = T01LM3_A12874PEDRoyPTra[0] ;
         n12874PEDRoyPTra = T01LM3_n12874PEDRoyPTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12874PEDRoyPTra", A12874PEDRoyPTra);
         A12875PEDRoyPorc = T01LM3_A12875PEDRoyPorc[0] ;
         n12875PEDRoyPorc = T01LM3_n12875PEDRoyPorc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12875PEDRoyPorc", A12875PEDRoyPorc);
         A12876PEDRoyOF = T01LM3_A12876PEDRoyOF[0] ;
         n12876PEDRoyOF = T01LM3_n12876PEDRoyOF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12876PEDRoyOF", A12876PEDRoyOF);
         A12877PEDRoyProc = T01LM3_A12877PEDRoyProc[0] ;
         n12877PEDRoyProc = T01LM3_n12877PEDRoyProc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12877PEDRoyProc", A12877PEDRoyProc);
         A12878PEDRoyProA = T01LM3_A12878PEDRoyProA[0] ;
         n12878PEDRoyProA = T01LM3_n12878PEDRoyProA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12878PEDRoyProA", A12878PEDRoyProA);
         A252CliCod = T01LM3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z12859PEDRoyNAlb = A12859PEDRoyNAlb ;
         Z12860PEDRoyCoNm = A12860PEDRoyCoNm ;
         sMode1769 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1LM1769( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1769 = (short)(0) ;
            initializeNonKey1LM1769( ) ;
         }
         Gx_mode = sMode1769 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1769 = (short)(0) ;
         initializeNonKey1LM1769( ) ;
         sMode1769 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1769 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1LM1769( ) ;
      if ( RcdFound1769 == 0 )
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
      RcdFound1769 = (short)(0) ;
      /* Using cursor T01LM9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A12859PEDRoyNAlb), Integer.valueOf(A12859PEDRoyNAlb), Integer.valueOf(A252CliCod), A12860PEDRoyCoNm, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01LM9_A252CliCod[0] < A252CliCod ) || ( T01LM9_A252CliCod[0] == A252CliCod ) && ( T01LM9_A12859PEDRoyNAlb[0] < A12859PEDRoyNAlb ) || ( T01LM9_A12859PEDRoyNAlb[0] == A12859PEDRoyNAlb ) && ( T01LM9_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LM9_A12860PEDRoyCoNm[0], A12860PEDRoyCoNm) < 0 ) ) && ( GXutil.strcmp(T01LM9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01LM9_A252CliCod[0] > A252CliCod ) || ( T01LM9_A252CliCod[0] == A252CliCod ) && ( T01LM9_A12859PEDRoyNAlb[0] > A12859PEDRoyNAlb ) || ( T01LM9_A12859PEDRoyNAlb[0] == A12859PEDRoyNAlb ) && ( T01LM9_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LM9_A12860PEDRoyCoNm[0], A12860PEDRoyCoNm) > 0 ) ) && ( GXutil.strcmp(T01LM9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01LM9_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A12859PEDRoyNAlb = T01LM9_A12859PEDRoyNAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
            A12860PEDRoyCoNm = T01LM9_A12860PEDRoyCoNm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
            RcdFound1769 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1769 = (short)(0) ;
      /* Using cursor T01LM10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A12859PEDRoyNAlb), Integer.valueOf(A12859PEDRoyNAlb), Integer.valueOf(A252CliCod), A12860PEDRoyCoNm, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01LM10_A252CliCod[0] > A252CliCod ) || ( T01LM10_A252CliCod[0] == A252CliCod ) && ( T01LM10_A12859PEDRoyNAlb[0] > A12859PEDRoyNAlb ) || ( T01LM10_A12859PEDRoyNAlb[0] == A12859PEDRoyNAlb ) && ( T01LM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LM10_A12860PEDRoyCoNm[0], A12860PEDRoyCoNm) > 0 ) ) && ( GXutil.strcmp(T01LM10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01LM10_A252CliCod[0] < A252CliCod ) || ( T01LM10_A252CliCod[0] == A252CliCod ) && ( T01LM10_A12859PEDRoyNAlb[0] < A12859PEDRoyNAlb ) || ( T01LM10_A12859PEDRoyNAlb[0] == A12859PEDRoyNAlb ) && ( T01LM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LM10_A12860PEDRoyCoNm[0], A12860PEDRoyCoNm) < 0 ) ) && ( GXutil.strcmp(T01LM10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01LM10_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A12859PEDRoyNAlb = T01LM10_A12859PEDRoyNAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
            A12860PEDRoyCoNm = T01LM10_A12860PEDRoyCoNm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
            RcdFound1769 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LM1769( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LM1769( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1769 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A12859PEDRoyNAlb != Z12859PEDRoyNAlb ) || ( GXutil.strcmp(A12860PEDRoyCoNm, Z12860PEDRoyCoNm) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A12859PEDRoyNAlb = Z12859PEDRoyNAlb ;
               httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
               A12860PEDRoyCoNm = Z12860PEDRoyCoNm ;
               httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
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
               update1LM1769( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A12859PEDRoyNAlb != Z12859PEDRoyNAlb ) || ( GXutil.strcmp(A12860PEDRoyCoNm, Z12860PEDRoyCoNm) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LM1769( ) ;
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
                  insert1LM1769( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A12859PEDRoyNAlb != Z12859PEDRoyNAlb ) || ( GXutil.strcmp(A12860PEDRoyCoNm, Z12860PEDRoyCoNm) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A12859PEDRoyNAlb = Z12859PEDRoyNAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
         A12860PEDRoyCoNm = Z12860PEDRoyCoNm ;
         httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
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
      getKey1LM1769( ) ;
      if ( RcdFound1769 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A12859PEDRoyNAlb != Z12859PEDRoyNAlb ) || ( GXutil.strcmp(A12860PEDRoyCoNm, Z12860PEDRoyCoNm) != 0 ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A12859PEDRoyNAlb = Z12859PEDRoyNAlb ;
            httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
            A12860PEDRoyCoNm = Z12860PEDRoyCoNm ;
            httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A12859PEDRoyNAlb != Z12859PEDRoyNAlb ) || ( GXutil.strcmp(A12860PEDRoyCoNm, Z12860PEDRoyCoNm) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedroyo");
      GX_FocusControl = edtPEDRoyPed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1LM0( ) ;
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
      if ( RcdFound1769 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPEDRoyPed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1LM1769( ) ;
      if ( RcdFound1769 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPEDRoyPed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LM1769( ) ;
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
      if ( RcdFound1769 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPEDRoyPed_Internalname ;
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
      if ( RcdFound1769 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPEDRoyPed_Internalname ;
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
      scanStart1LM1769( ) ;
      if ( RcdFound1769 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1769 != 0 )
         {
            scanNext1LM1769( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPEDRoyPed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LM1769( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1LM1769( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A12859PEDRoyNAlb), A12860PEDRoyCoNm});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDROY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12861PEDRoyPed, T01LM2_A12861PEDRoyPed[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z12862PEDRoyFPed), GXutil.resetTime(T01LM2_A12862PEDRoyFPed[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z12863PEDRoyFcom), GXutil.resetTime(T01LM2_A12863PEDRoyFcom[0])) ) || ( GXutil.strcmp(Z12864PEDRoyArt, T01LM2_A12864PEDRoyArt[0]) != 0 ) || ( Z12865PEDRoyAnc != T01LM2_A12865PEDRoyAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12866PEDRoyObs, T01LM2_A12866PEDRoyObs[0]) != 0 ) || ( Z12867PEDRoyEst != T01LM2_A12867PEDRoyEst[0] ) || ( Z12868PEDRoyID != T01LM2_A12868PEDRoyID[0] ) || ( DecimalUtil.compareTo(Z12869PEDRoyKgs, T01LM2_A12869PEDRoyKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z12870PEDRoyMts, T01LM2_A12870PEDRoyMts[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12871PEDRoyPzs != T01LM2_A12871PEDRoyPzs[0] ) || ( GXutil.strcmp(Z12872PEDRoyArtA, T01LM2_A12872PEDRoyArtA[0]) != 0 ) || ( Z12873PEDRoyObsU != T01LM2_A12873PEDRoyObsU[0] ) || ( GXutil.strcmp(Z12874PEDRoyPTra, T01LM2_A12874PEDRoyPTra[0]) != 0 ) || ( GXutil.strcmp(Z12875PEDRoyPorc, T01LM2_A12875PEDRoyPorc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12876PEDRoyOF, T01LM2_A12876PEDRoyOF[0]) != 0 ) || ( GXutil.strcmp(Z12877PEDRoyProc, T01LM2_A12877PEDRoyProc[0]) != 0 ) || ( GXutil.strcmp(Z12878PEDRoyProA, T01LM2_A12878PEDRoyProA[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12861PEDRoyPed, T01LM2_A12861PEDRoyPed[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyPed");
               GXutil.writeLogRaw("Old: ",Z12861PEDRoyPed);
               GXutil.writeLogRaw("Current: ",T01LM2_A12861PEDRoyPed[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12862PEDRoyFPed), GXutil.resetTime(T01LM2_A12862PEDRoyFPed[0])) ) )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyFPed");
               GXutil.writeLogRaw("Old: ",Z12862PEDRoyFPed);
               GXutil.writeLogRaw("Current: ",T01LM2_A12862PEDRoyFPed[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12863PEDRoyFcom), GXutil.resetTime(T01LM2_A12863PEDRoyFcom[0])) ) )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyFcom");
               GXutil.writeLogRaw("Old: ",Z12863PEDRoyFcom);
               GXutil.writeLogRaw("Current: ",T01LM2_A12863PEDRoyFcom[0]);
            }
            if ( GXutil.strcmp(Z12864PEDRoyArt, T01LM2_A12864PEDRoyArt[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyArt");
               GXutil.writeLogRaw("Old: ",Z12864PEDRoyArt);
               GXutil.writeLogRaw("Current: ",T01LM2_A12864PEDRoyArt[0]);
            }
            if ( Z12865PEDRoyAnc != T01LM2_A12865PEDRoyAnc[0] )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyAnc");
               GXutil.writeLogRaw("Old: ",Z12865PEDRoyAnc);
               GXutil.writeLogRaw("Current: ",T01LM2_A12865PEDRoyAnc[0]);
            }
            if ( GXutil.strcmp(Z12866PEDRoyObs, T01LM2_A12866PEDRoyObs[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyObs");
               GXutil.writeLogRaw("Old: ",Z12866PEDRoyObs);
               GXutil.writeLogRaw("Current: ",T01LM2_A12866PEDRoyObs[0]);
            }
            if ( Z12867PEDRoyEst != T01LM2_A12867PEDRoyEst[0] )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyEst");
               GXutil.writeLogRaw("Old: ",Z12867PEDRoyEst);
               GXutil.writeLogRaw("Current: ",T01LM2_A12867PEDRoyEst[0]);
            }
            if ( Z12868PEDRoyID != T01LM2_A12868PEDRoyID[0] )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyID");
               GXutil.writeLogRaw("Old: ",Z12868PEDRoyID);
               GXutil.writeLogRaw("Current: ",T01LM2_A12868PEDRoyID[0]);
            }
            if ( DecimalUtil.compareTo(Z12869PEDRoyKgs, T01LM2_A12869PEDRoyKgs[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyKgs");
               GXutil.writeLogRaw("Old: ",Z12869PEDRoyKgs);
               GXutil.writeLogRaw("Current: ",T01LM2_A12869PEDRoyKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z12870PEDRoyMts, T01LM2_A12870PEDRoyMts[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyMts");
               GXutil.writeLogRaw("Old: ",Z12870PEDRoyMts);
               GXutil.writeLogRaw("Current: ",T01LM2_A12870PEDRoyMts[0]);
            }
            if ( Z12871PEDRoyPzs != T01LM2_A12871PEDRoyPzs[0] )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyPzs");
               GXutil.writeLogRaw("Old: ",Z12871PEDRoyPzs);
               GXutil.writeLogRaw("Current: ",T01LM2_A12871PEDRoyPzs[0]);
            }
            if ( GXutil.strcmp(Z12872PEDRoyArtA, T01LM2_A12872PEDRoyArtA[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyArtA");
               GXutil.writeLogRaw("Old: ",Z12872PEDRoyArtA);
               GXutil.writeLogRaw("Current: ",T01LM2_A12872PEDRoyArtA[0]);
            }
            if ( Z12873PEDRoyObsU != T01LM2_A12873PEDRoyObsU[0] )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyObsU");
               GXutil.writeLogRaw("Old: ",Z12873PEDRoyObsU);
               GXutil.writeLogRaw("Current: ",T01LM2_A12873PEDRoyObsU[0]);
            }
            if ( GXutil.strcmp(Z12874PEDRoyPTra, T01LM2_A12874PEDRoyPTra[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyPTra");
               GXutil.writeLogRaw("Old: ",Z12874PEDRoyPTra);
               GXutil.writeLogRaw("Current: ",T01LM2_A12874PEDRoyPTra[0]);
            }
            if ( GXutil.strcmp(Z12875PEDRoyPorc, T01LM2_A12875PEDRoyPorc[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyPorc");
               GXutil.writeLogRaw("Old: ",Z12875PEDRoyPorc);
               GXutil.writeLogRaw("Current: ",T01LM2_A12875PEDRoyPorc[0]);
            }
            if ( GXutil.strcmp(Z12876PEDRoyOF, T01LM2_A12876PEDRoyOF[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyOF");
               GXutil.writeLogRaw("Old: ",Z12876PEDRoyOF);
               GXutil.writeLogRaw("Current: ",T01LM2_A12876PEDRoyOF[0]);
            }
            if ( GXutil.strcmp(Z12877PEDRoyProc, T01LM2_A12877PEDRoyProc[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyProc");
               GXutil.writeLogRaw("Old: ",Z12877PEDRoyProc);
               GXutil.writeLogRaw("Current: ",T01LM2_A12877PEDRoyProc[0]);
            }
            if ( GXutil.strcmp(Z12878PEDRoyProA, T01LM2_A12878PEDRoyProA[0]) != 0 )
            {
               GXutil.writeLogln("tpedroyo:[seudo value changed for attri]"+"PEDRoyProA");
               GXutil.writeLogRaw("Old: ",Z12878PEDRoyProA);
               GXutil.writeLogRaw("Current: ",T01LM2_A12878PEDRoyProA[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPEDROY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LM1769( )
   {
      beforeValidate1LM1769( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LM1769( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LM1769( 0) ;
         checkOptimisticConcurrency1LM1769( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LM1769( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LM1769( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LM11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A12859PEDRoyNAlb), A12860PEDRoyCoNm, Boolean.valueOf(n12861PEDRoyPed), A12861PEDRoyPed, Boolean.valueOf(n12862PEDRoyFPed), A12862PEDRoyFPed, Boolean.valueOf(n12863PEDRoyFcom), A12863PEDRoyFcom, Boolean.valueOf(n12864PEDRoyArt), A12864PEDRoyArt, Boolean.valueOf(n12865PEDRoyAnc), Short.valueOf(A12865PEDRoyAnc), Boolean.valueOf(n12866PEDRoyObs), A12866PEDRoyObs, Boolean.valueOf(n12867PEDRoyEst), Byte.valueOf(A12867PEDRoyEst), Boolean.valueOf(n12868PEDRoyID), Integer.valueOf(A12868PEDRoyID), Boolean.valueOf(n12869PEDRoyKgs), A12869PEDRoyKgs, Boolean.valueOf(n12870PEDRoyMts), A12870PEDRoyMts, Boolean.valueOf(n12871PEDRoyPzs), Integer.valueOf(A12871PEDRoyPzs), Boolean.valueOf(n12872PEDRoyArtA), A12872PEDRoyArtA, Boolean.valueOf(n12873PEDRoyObsU), Byte.valueOf(A12873PEDRoyObsU), Boolean.valueOf(n12874PEDRoyPTra), A12874PEDRoyPTra, Boolean.valueOf(n12875PEDRoyPorc), A12875PEDRoyPorc, Boolean.valueOf(n12876PEDRoyOF), A12876PEDRoyOF, Boolean.valueOf(n12877PEDRoyProc), A12877PEDRoyProc, Boolean.valueOf(n12878PEDRoyProA), A12878PEDRoyProA, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDROY");
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
                        resetCaption1LM0( ) ;
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
            load1LM1769( ) ;
         }
         endLevel1LM1769( ) ;
      }
      closeExtendedTableCursors1LM1769( ) ;
   }

   public void update1LM1769( )
   {
      beforeValidate1LM1769( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LM1769( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LM1769( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LM1769( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LM1769( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LM12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n12861PEDRoyPed), A12861PEDRoyPed, Boolean.valueOf(n12862PEDRoyFPed), A12862PEDRoyFPed, Boolean.valueOf(n12863PEDRoyFcom), A12863PEDRoyFcom, Boolean.valueOf(n12864PEDRoyArt), A12864PEDRoyArt, Boolean.valueOf(n12865PEDRoyAnc), Short.valueOf(A12865PEDRoyAnc), Boolean.valueOf(n12866PEDRoyObs), A12866PEDRoyObs, Boolean.valueOf(n12867PEDRoyEst), Byte.valueOf(A12867PEDRoyEst), Boolean.valueOf(n12868PEDRoyID), Integer.valueOf(A12868PEDRoyID), Boolean.valueOf(n12869PEDRoyKgs), A12869PEDRoyKgs, Boolean.valueOf(n12870PEDRoyMts), A12870PEDRoyMts, Boolean.valueOf(n12871PEDRoyPzs), Integer.valueOf(A12871PEDRoyPzs), Boolean.valueOf(n12872PEDRoyArtA), A12872PEDRoyArtA, Boolean.valueOf(n12873PEDRoyObsU), Byte.valueOf(A12873PEDRoyObsU), Boolean.valueOf(n12874PEDRoyPTra), A12874PEDRoyPTra, Boolean.valueOf(n12875PEDRoyPorc), A12875PEDRoyPorc, Boolean.valueOf(n12876PEDRoyOF), A12876PEDRoyOF, Boolean.valueOf(n12877PEDRoyProc), A12877PEDRoyProc, Boolean.valueOf(n12878PEDRoyProA), A12878PEDRoyProA, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A12859PEDRoyNAlb), A12860PEDRoyCoNm});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDROY");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPEDROY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LM1769( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1LM0( ) ;
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
         endLevel1LM1769( ) ;
      }
      closeExtendedTableCursors1LM1769( ) ;
   }

   public void deferredUpdate1LM1769( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LM1769( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LM1769( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LM1769( ) ;
         afterConfirm1LM1769( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LM1769( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LM13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A12859PEDRoyNAlb), A12860PEDRoyCoNm});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDROY");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1769 == 0 )
                     {
                        initAll1LM1769( ) ;
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
                     resetCaption1LM0( ) ;
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
      sMode1769 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LM1769( ) ;
      Gx_mode = sMode1769 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LM1769( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LM14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01LM14_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(12);
      }
   }

   public void endLevel1LM1769( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LM1769( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpedroyo");
         if ( AnyError == 0 )
         {
            confirmValues1LM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedroyo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LM1769( )
   {
      /* Scan By routine */
      /* Using cursor T01LM15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1769 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1769 = (short)(1) ;
         A252CliCod = T01LM15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A12859PEDRoyNAlb = T01LM15_A12859PEDRoyNAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
         A12860PEDRoyCoNm = T01LM15_A12860PEDRoyCoNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LM1769( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1769 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1769 = (short)(1) ;
         A252CliCod = T01LM15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A12859PEDRoyNAlb = T01LM15_A12859PEDRoyNAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
         A12860PEDRoyCoNm = T01LM15_A12860PEDRoyCoNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
      }
   }

   public void scanEnd1LM1769( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1LM1769( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LM1769( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LM1769( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LM1769( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LM1769( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LM1769( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LM1769( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtPEDRoyNAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyNAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyNAlb_Enabled), 5, 0), true);
      edtPEDRoyCoNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyCoNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyCoNm_Enabled), 5, 0), true);
      edtPEDRoyPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyPed_Enabled), 5, 0), true);
      edtPEDRoyFPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyFPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyFPed_Enabled), 5, 0), true);
      edtPEDRoyFcom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyFcom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyFcom_Enabled), 5, 0), true);
      edtPEDRoyArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyArt_Enabled), 5, 0), true);
      edtPEDRoyAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyAnc_Enabled), 5, 0), true);
      edtPEDRoyObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyObs_Enabled), 5, 0), true);
      edtPEDRoyEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyEst_Enabled), 5, 0), true);
      edtPEDRoyID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyID_Enabled), 5, 0), true);
      edtPEDRoyKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyKgs_Enabled), 5, 0), true);
      edtPEDRoyMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyMts_Enabled), 5, 0), true);
      edtPEDRoyPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyPzs_Enabled), 5, 0), true);
      edtPEDRoyArtA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyArtA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyArtA_Enabled), 5, 0), true);
      edtPEDRoyObsU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyObsU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyObsU_Enabled), 5, 0), true);
      edtPEDRoyPTra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyPTra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyPTra_Enabled), 5, 0), true);
      edtPEDRoyPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyPorc_Enabled), 5, 0), true);
      edtPEDRoyOF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyOF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyOF_Enabled), 5, 0), true);
      edtPEDRoyProc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyProc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyProc_Enabled), 5, 0), true);
      edtPEDRoyProA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPEDRoyProA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPEDRoyProA_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1LM1769( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1LM0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpedroyo", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12859PEDRoyNAlb", GXutil.ltrim( localUtil.ntoc( Z12859PEDRoyNAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12860PEDRoyCoNm", GXutil.rtrim( Z12860PEDRoyCoNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12861PEDRoyPed", GXutil.rtrim( Z12861PEDRoyPed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12862PEDRoyFPed", localUtil.dtoc( Z12862PEDRoyFPed, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12863PEDRoyFcom", localUtil.dtoc( Z12863PEDRoyFcom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12864PEDRoyArt", GXutil.rtrim( Z12864PEDRoyArt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12865PEDRoyAnc", GXutil.ltrim( localUtil.ntoc( Z12865PEDRoyAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12866PEDRoyObs", Z12866PEDRoyObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12867PEDRoyEst", GXutil.ltrim( localUtil.ntoc( Z12867PEDRoyEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12868PEDRoyID", GXutil.ltrim( localUtil.ntoc( Z12868PEDRoyID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12869PEDRoyKgs", GXutil.ltrim( localUtil.ntoc( Z12869PEDRoyKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12870PEDRoyMts", GXutil.ltrim( localUtil.ntoc( Z12870PEDRoyMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12871PEDRoyPzs", GXutil.ltrim( localUtil.ntoc( Z12871PEDRoyPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12872PEDRoyArtA", GXutil.rtrim( Z12872PEDRoyArtA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12873PEDRoyObsU", GXutil.ltrim( localUtil.ntoc( Z12873PEDRoyObsU, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12874PEDRoyPTra", GXutil.rtrim( Z12874PEDRoyPTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12875PEDRoyPorc", GXutil.rtrim( Z12875PEDRoyPorc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12876PEDRoyOF", GXutil.rtrim( Z12876PEDRoyOF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12877PEDRoyProc", GXutil.rtrim( Z12877PEDRoyProc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12878PEDRoyProA", GXutil.rtrim( Z12878PEDRoyProA));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tpedroyo", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPEDRoyo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Pedidos Tejidos ROYO", "") ;
   }

   public void initializeNonKey1LM1769( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A12861PEDRoyPed = "" ;
      n12861PEDRoyPed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12861PEDRoyPed", A12861PEDRoyPed);
      A12862PEDRoyFPed = GXutil.nullDate() ;
      n12862PEDRoyFPed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12862PEDRoyFPed", localUtil.format(A12862PEDRoyFPed, "99/99/99"));
      A12863PEDRoyFcom = GXutil.nullDate() ;
      n12863PEDRoyFcom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12863PEDRoyFcom", localUtil.format(A12863PEDRoyFcom, "99/99/99"));
      A12864PEDRoyArt = "" ;
      n12864PEDRoyArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12864PEDRoyArt", A12864PEDRoyArt);
      A12865PEDRoyAnc = (short)(0) ;
      n12865PEDRoyAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12865PEDRoyAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12865PEDRoyAnc), 3, 0));
      A12866PEDRoyObs = "" ;
      n12866PEDRoyObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12866PEDRoyObs", A12866PEDRoyObs);
      A12867PEDRoyEst = (byte)(0) ;
      n12867PEDRoyEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12867PEDRoyEst", GXutil.str( A12867PEDRoyEst, 1, 0));
      A12868PEDRoyID = 0 ;
      n12868PEDRoyID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12868PEDRoyID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12868PEDRoyID), 8, 0));
      A12869PEDRoyKgs = DecimalUtil.ZERO ;
      n12869PEDRoyKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12869PEDRoyKgs", GXutil.ltrimstr( A12869PEDRoyKgs, 9, 2));
      A12870PEDRoyMts = DecimalUtil.ZERO ;
      n12870PEDRoyMts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12870PEDRoyMts", GXutil.ltrimstr( A12870PEDRoyMts, 9, 2));
      A12871PEDRoyPzs = 0 ;
      n12871PEDRoyPzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12871PEDRoyPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12871PEDRoyPzs), 6, 0));
      A12872PEDRoyArtA = "" ;
      n12872PEDRoyArtA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12872PEDRoyArtA", A12872PEDRoyArtA);
      A12873PEDRoyObsU = (byte)(0) ;
      n12873PEDRoyObsU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12873PEDRoyObsU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12873PEDRoyObsU), 2, 0));
      A12874PEDRoyPTra = "" ;
      n12874PEDRoyPTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12874PEDRoyPTra", A12874PEDRoyPTra);
      A12875PEDRoyPorc = "" ;
      n12875PEDRoyPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12875PEDRoyPorc", A12875PEDRoyPorc);
      A12876PEDRoyOF = "" ;
      n12876PEDRoyOF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12876PEDRoyOF", A12876PEDRoyOF);
      A12877PEDRoyProc = "" ;
      n12877PEDRoyProc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12877PEDRoyProc", A12877PEDRoyProc);
      A12878PEDRoyProA = "" ;
      n12878PEDRoyProA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12878PEDRoyProA", A12878PEDRoyProA);
      Z12861PEDRoyPed = "" ;
      Z12862PEDRoyFPed = GXutil.nullDate() ;
      Z12863PEDRoyFcom = GXutil.nullDate() ;
      Z12864PEDRoyArt = "" ;
      Z12865PEDRoyAnc = (short)(0) ;
      Z12866PEDRoyObs = "" ;
      Z12867PEDRoyEst = (byte)(0) ;
      Z12868PEDRoyID = 0 ;
      Z12869PEDRoyKgs = DecimalUtil.ZERO ;
      Z12870PEDRoyMts = DecimalUtil.ZERO ;
      Z12871PEDRoyPzs = 0 ;
      Z12872PEDRoyArtA = "" ;
      Z12873PEDRoyObsU = (byte)(0) ;
      Z12874PEDRoyPTra = "" ;
      Z12875PEDRoyPorc = "" ;
      Z12876PEDRoyOF = "" ;
      Z12877PEDRoyProc = "" ;
      Z12878PEDRoyProA = "" ;
   }

   public void initAll1LM1769( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A12859PEDRoyNAlb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12859PEDRoyNAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12859PEDRoyNAlb), 8, 0));
      A12860PEDRoyCoNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12860PEDRoyCoNm", A12860PEDRoyCoNm);
      initializeNonKey1LM1769( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241591549", true, true);
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
      httpContext.AddJavascriptSource("tpedroyo.js", "?20268241591549", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPEDRoyNAlb_Internalname = "PEDROYNALB" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPEDRoyCoNm_Internalname = "PEDROYCONM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPEDRoyPed_Internalname = "PEDROYPED" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPEDRoyFPed_Internalname = "PEDROYFPED" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPEDRoyFcom_Internalname = "PEDROYFCOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPEDRoyArt_Internalname = "PEDROYART" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPEDRoyAnc_Internalname = "PEDROYANC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPEDRoyObs_Internalname = "PEDROYOBS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPEDRoyEst_Internalname = "PEDROYEST" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtPEDRoyID_Internalname = "PEDROYID" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtPEDRoyKgs_Internalname = "PEDROYKGS" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtPEDRoyMts_Internalname = "PEDROYMTS" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtPEDRoyPzs_Internalname = "PEDROYPZS" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtPEDRoyArtA_Internalname = "PEDROYARTA" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtPEDRoyObsU_Internalname = "PEDROYOBSU" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtPEDRoyPTra_Internalname = "PEDROYPTRA" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtPEDRoyPorc_Internalname = "PEDROYPORC" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtPEDRoyOF_Internalname = "PEDROYOF" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtPEDRoyProc_Internalname = "PEDROYPROC" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtPEDRoyProA_Internalname = "PEDROYPROA" ;
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
      Form.setCaption( httpContext.getMessage( "Pedidos Tejidos ROYO", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPEDRoyProA_Jsonclick = "" ;
      edtPEDRoyProA_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyProA_Enabled = 1 ;
      edtPEDRoyProc_Jsonclick = "" ;
      edtPEDRoyProc_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyProc_Enabled = 1 ;
      edtPEDRoyOF_Jsonclick = "" ;
      edtPEDRoyOF_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyOF_Enabled = 1 ;
      edtPEDRoyPorc_Jsonclick = "" ;
      edtPEDRoyPorc_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyPorc_Enabled = 1 ;
      edtPEDRoyPTra_Jsonclick = "" ;
      edtPEDRoyPTra_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyPTra_Enabled = 1 ;
      edtPEDRoyObsU_Jsonclick = "" ;
      edtPEDRoyObsU_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyObsU_Enabled = 1 ;
      edtPEDRoyArtA_Jsonclick = "" ;
      edtPEDRoyArtA_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyArtA_Enabled = 1 ;
      edtPEDRoyPzs_Jsonclick = "" ;
      edtPEDRoyPzs_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyPzs_Enabled = 1 ;
      edtPEDRoyMts_Jsonclick = "" ;
      edtPEDRoyMts_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyMts_Enabled = 1 ;
      edtPEDRoyKgs_Jsonclick = "" ;
      edtPEDRoyKgs_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyKgs_Enabled = 1 ;
      edtPEDRoyID_Jsonclick = "" ;
      edtPEDRoyID_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyID_Enabled = 1 ;
      edtPEDRoyEst_Jsonclick = "" ;
      edtPEDRoyEst_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyEst_Enabled = 1 ;
      edtPEDRoyObs_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyObs_Enabled = 1 ;
      edtPEDRoyAnc_Jsonclick = "" ;
      edtPEDRoyAnc_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyAnc_Enabled = 1 ;
      edtPEDRoyArt_Jsonclick = "" ;
      edtPEDRoyArt_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyArt_Enabled = 1 ;
      edtPEDRoyFcom_Jsonclick = "" ;
      edtPEDRoyFcom_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyFcom_Enabled = 1 ;
      edtPEDRoyFPed_Jsonclick = "" ;
      edtPEDRoyFPed_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyFPed_Enabled = 1 ;
      edtPEDRoyPed_Jsonclick = "" ;
      edtPEDRoyPed_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyPed_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPEDRoyCoNm_Jsonclick = "" ;
      edtPEDRoyCoNm_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyCoNm_Enabled = 1 ;
      edtPEDRoyNAlb_Jsonclick = "" ;
      edtPEDRoyNAlb_Backcolor = (int)(0xFFFFFF) ;
      edtPEDRoyNAlb_Enabled = 1 ;
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
      /* Using cursor T01LM16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LM16_A407EmprNom[0] ;
      n407EmprNom = T01LM16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T01LM14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LM14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(12);
      GX_FocusControl = edtPEDRoyPed_Internalname ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01LM14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01LM14_A279CliNom[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Pedroyconm( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12861PEDRoyPed", GXutil.rtrim( A12861PEDRoyPed));
      httpContext.ajax_rsp_assign_attri("", false, "A12862PEDRoyFPed", localUtil.format(A12862PEDRoyFPed, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12863PEDRoyFcom", localUtil.format(A12863PEDRoyFcom, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12864PEDRoyArt", GXutil.rtrim( A12864PEDRoyArt));
      httpContext.ajax_rsp_assign_attri("", false, "A12865PEDRoyAnc", GXutil.ltrim( localUtil.ntoc( A12865PEDRoyAnc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12866PEDRoyObs", A12866PEDRoyObs);
      httpContext.ajax_rsp_assign_attri("", false, "A12867PEDRoyEst", GXutil.ltrim( localUtil.ntoc( A12867PEDRoyEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12868PEDRoyID", GXutil.ltrim( localUtil.ntoc( A12868PEDRoyID, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12869PEDRoyKgs", GXutil.ltrim( localUtil.ntoc( A12869PEDRoyKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12870PEDRoyMts", GXutil.ltrim( localUtil.ntoc( A12870PEDRoyMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12871PEDRoyPzs", GXutil.ltrim( localUtil.ntoc( A12871PEDRoyPzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12872PEDRoyArtA", GXutil.rtrim( A12872PEDRoyArtA));
      httpContext.ajax_rsp_assign_attri("", false, "A12873PEDRoyObsU", GXutil.ltrim( localUtil.ntoc( A12873PEDRoyObsU, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12874PEDRoyPTra", GXutil.rtrim( A12874PEDRoyPTra));
      httpContext.ajax_rsp_assign_attri("", false, "A12875PEDRoyPorc", GXutil.rtrim( A12875PEDRoyPorc));
      httpContext.ajax_rsp_assign_attri("", false, "A12876PEDRoyOF", GXutil.rtrim( A12876PEDRoyOF));
      httpContext.ajax_rsp_assign_attri("", false, "A12877PEDRoyProc", GXutil.rtrim( A12877PEDRoyProc));
      httpContext.ajax_rsp_assign_attri("", false, "A12878PEDRoyProA", GXutil.rtrim( A12878PEDRoyProA));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12859PEDRoyNAlb", GXutil.ltrim( localUtil.ntoc( Z12859PEDRoyNAlb, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12860PEDRoyCoNm", GXutil.rtrim( Z12860PEDRoyCoNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12861PEDRoyPed", GXutil.rtrim( Z12861PEDRoyPed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12862PEDRoyFPed", localUtil.format(Z12862PEDRoyFPed, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12863PEDRoyFcom", localUtil.format(Z12863PEDRoyFcom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12864PEDRoyArt", GXutil.rtrim( Z12864PEDRoyArt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12865PEDRoyAnc", GXutil.ltrim( localUtil.ntoc( Z12865PEDRoyAnc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12866PEDRoyObs", Z12866PEDRoyObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12867PEDRoyEst", GXutil.ltrim( localUtil.ntoc( Z12867PEDRoyEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12868PEDRoyID", GXutil.ltrim( localUtil.ntoc( Z12868PEDRoyID, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12869PEDRoyKgs", GXutil.ltrim( localUtil.ntoc( Z12869PEDRoyKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12870PEDRoyMts", GXutil.ltrim( localUtil.ntoc( Z12870PEDRoyMts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12871PEDRoyPzs", GXutil.ltrim( localUtil.ntoc( Z12871PEDRoyPzs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12872PEDRoyArtA", GXutil.rtrim( Z12872PEDRoyArtA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12873PEDRoyObsU", GXutil.ltrim( localUtil.ntoc( Z12873PEDRoyObsU, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12874PEDRoyPTra", GXutil.rtrim( Z12874PEDRoyPTra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12875PEDRoyPorc", GXutil.rtrim( Z12875PEDRoyPorc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12876PEDRoyOF", GXutil.rtrim( Z12876PEDRoyOF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12877PEDRoyProc", GXutil.rtrim( Z12877PEDRoyProc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12878PEDRoyProA", GXutil.rtrim( Z12878PEDRoyProA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_PEDROYNALB","{handler:'valid_Pedroynalb',iparms:[]");
      setEventMetadata("VALID_PEDROYNALB",",oparms:[]}");
      setEventMetadata("VALID_PEDROYCONM","{handler:'valid_Pedroyconm',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A12859PEDRoyNAlb',fld:'PEDROYNALB',pic:'ZZZZZZZ9'},{av:'A12860PEDRoyCoNm',fld:'PEDROYCONM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PEDROYCONM",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12861PEDRoyPed',fld:'PEDROYPED',pic:''},{av:'A12862PEDRoyFPed',fld:'PEDROYFPED',pic:''},{av:'A12863PEDRoyFcom',fld:'PEDROYFCOM',pic:''},{av:'A12864PEDRoyArt',fld:'PEDROYART',pic:''},{av:'A12865PEDRoyAnc',fld:'PEDROYANC',pic:'ZZ9'},{av:'A12866PEDRoyObs',fld:'PEDROYOBS',pic:''},{av:'A12867PEDRoyEst',fld:'PEDROYEST',pic:'9'},{av:'A12868PEDRoyID',fld:'PEDROYID',pic:'ZZZZZZZ9'},{av:'A12869PEDRoyKgs',fld:'PEDROYKGS',pic:'ZZZZZ9.99'},{av:'A12870PEDRoyMts',fld:'PEDROYMTS',pic:'ZZZZZ9.99'},{av:'A12871PEDRoyPzs',fld:'PEDROYPZS',pic:'ZZZZZ9'},{av:'A12872PEDRoyArtA',fld:'PEDROYARTA',pic:''},{av:'A12873PEDRoyObsU',fld:'PEDROYOBSU',pic:'Z9'},{av:'A12874PEDRoyPTra',fld:'PEDROYPTRA',pic:''},{av:'A12875PEDRoyPorc',fld:'PEDROYPORC',pic:''},{av:'A12876PEDRoyOF',fld:'PEDROYOF',pic:''},{av:'A12877PEDRoyProc',fld:'PEDROYPROC',pic:''},{av:'A12878PEDRoyProA',fld:'PEDROYPROA',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z12859PEDRoyNAlb'},{av:'Z12860PEDRoyCoNm'},{av:'Z407EmprNom'},{av:'Z12861PEDRoyPed'},{av:'Z12862PEDRoyFPed'},{av:'Z12863PEDRoyFcom'},{av:'Z12864PEDRoyArt'},{av:'Z12865PEDRoyAnc'},{av:'Z12866PEDRoyObs'},{av:'Z12867PEDRoyEst'},{av:'Z12868PEDRoyID'},{av:'Z12869PEDRoyKgs'},{av:'Z12870PEDRoyMts'},{av:'Z12871PEDRoyPzs'},{av:'Z12872PEDRoyArtA'},{av:'Z12873PEDRoyObsU'},{av:'Z12874PEDRoyPTra'},{av:'Z12875PEDRoyPorc'},{av:'Z12876PEDRoyOF'},{av:'Z12877PEDRoyProc'},{av:'Z12878PEDRoyProA'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(12);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12860PEDRoyCoNm = "" ;
      Z12861PEDRoyPed = "" ;
      Z12862PEDRoyFPed = GXutil.nullDate() ;
      Z12863PEDRoyFcom = GXutil.nullDate() ;
      Z12864PEDRoyArt = "" ;
      Z12866PEDRoyObs = "" ;
      Z12869PEDRoyKgs = DecimalUtil.ZERO ;
      Z12870PEDRoyMts = DecimalUtil.ZERO ;
      Z12872PEDRoyArtA = "" ;
      Z12874PEDRoyPTra = "" ;
      Z12875PEDRoyPorc = "" ;
      Z12876PEDRoyOF = "" ;
      Z12877PEDRoyProc = "" ;
      Z12878PEDRoyProA = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12860PEDRoyCoNm = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12861PEDRoyPed = "" ;
      lblTextblock8_Jsonclick = "" ;
      A12862PEDRoyFPed = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A12863PEDRoyFcom = GXutil.nullDate() ;
      lblTextblock10_Jsonclick = "" ;
      A12864PEDRoyArt = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A12866PEDRoyObs = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A12869PEDRoyKgs = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A12870PEDRoyMts = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A12872PEDRoyArtA = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A12874PEDRoyPTra = "" ;
      lblTextblock21_Jsonclick = "" ;
      A12875PEDRoyPorc = "" ;
      lblTextblock22_Jsonclick = "" ;
      A12876PEDRoyOF = "" ;
      lblTextblock23_Jsonclick = "" ;
      A12877PEDRoyProc = "" ;
      lblTextblock24_Jsonclick = "" ;
      A12878PEDRoyProA = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV33Pgmname = "" ;
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
      Z279CliNom = "" ;
      T01LM4_A407EmprNom = new String[] {""} ;
      T01LM4_n407EmprNom = new boolean[] {false} ;
      T01LM6_A12859PEDRoyNAlb = new int[1] ;
      T01LM6_A12860PEDRoyCoNm = new String[] {""} ;
      T01LM6_A407EmprNom = new String[] {""} ;
      T01LM6_n407EmprNom = new boolean[] {false} ;
      T01LM6_A279CliNom = new String[] {""} ;
      T01LM6_A12861PEDRoyPed = new String[] {""} ;
      T01LM6_n12861PEDRoyPed = new boolean[] {false} ;
      T01LM6_A12862PEDRoyFPed = new java.util.Date[] {GXutil.nullDate()} ;
      T01LM6_n12862PEDRoyFPed = new boolean[] {false} ;
      T01LM6_A12863PEDRoyFcom = new java.util.Date[] {GXutil.nullDate()} ;
      T01LM6_n12863PEDRoyFcom = new boolean[] {false} ;
      T01LM6_A12864PEDRoyArt = new String[] {""} ;
      T01LM6_n12864PEDRoyArt = new boolean[] {false} ;
      T01LM6_A12865PEDRoyAnc = new short[1] ;
      T01LM6_n12865PEDRoyAnc = new boolean[] {false} ;
      T01LM6_A12866PEDRoyObs = new String[] {""} ;
      T01LM6_n12866PEDRoyObs = new boolean[] {false} ;
      T01LM6_A12867PEDRoyEst = new byte[1] ;
      T01LM6_n12867PEDRoyEst = new boolean[] {false} ;
      T01LM6_A12868PEDRoyID = new int[1] ;
      T01LM6_n12868PEDRoyID = new boolean[] {false} ;
      T01LM6_A12869PEDRoyKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LM6_n12869PEDRoyKgs = new boolean[] {false} ;
      T01LM6_A12870PEDRoyMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LM6_n12870PEDRoyMts = new boolean[] {false} ;
      T01LM6_A12871PEDRoyPzs = new int[1] ;
      T01LM6_n12871PEDRoyPzs = new boolean[] {false} ;
      T01LM6_A12872PEDRoyArtA = new String[] {""} ;
      T01LM6_n12872PEDRoyArtA = new boolean[] {false} ;
      T01LM6_A12873PEDRoyObsU = new byte[1] ;
      T01LM6_n12873PEDRoyObsU = new boolean[] {false} ;
      T01LM6_A12874PEDRoyPTra = new String[] {""} ;
      T01LM6_n12874PEDRoyPTra = new boolean[] {false} ;
      T01LM6_A12875PEDRoyPorc = new String[] {""} ;
      T01LM6_n12875PEDRoyPorc = new boolean[] {false} ;
      T01LM6_A12876PEDRoyOF = new String[] {""} ;
      T01LM6_n12876PEDRoyOF = new boolean[] {false} ;
      T01LM6_A12877PEDRoyProc = new String[] {""} ;
      T01LM6_n12877PEDRoyProc = new boolean[] {false} ;
      T01LM6_A12878PEDRoyProA = new String[] {""} ;
      T01LM6_n12878PEDRoyProA = new boolean[] {false} ;
      T01LM6_A396EmprCod = new String[] {""} ;
      T01LM6_A252CliCod = new int[1] ;
      T01LM5_A279CliNom = new String[] {""} ;
      T01LM7_A279CliNom = new String[] {""} ;
      T01LM8_A396EmprCod = new String[] {""} ;
      T01LM8_A252CliCod = new int[1] ;
      T01LM8_A12859PEDRoyNAlb = new int[1] ;
      T01LM8_A12860PEDRoyCoNm = new String[] {""} ;
      T01LM3_A12859PEDRoyNAlb = new int[1] ;
      T01LM3_A12860PEDRoyCoNm = new String[] {""} ;
      T01LM3_A12861PEDRoyPed = new String[] {""} ;
      T01LM3_n12861PEDRoyPed = new boolean[] {false} ;
      T01LM3_A12862PEDRoyFPed = new java.util.Date[] {GXutil.nullDate()} ;
      T01LM3_n12862PEDRoyFPed = new boolean[] {false} ;
      T01LM3_A12863PEDRoyFcom = new java.util.Date[] {GXutil.nullDate()} ;
      T01LM3_n12863PEDRoyFcom = new boolean[] {false} ;
      T01LM3_A12864PEDRoyArt = new String[] {""} ;
      T01LM3_n12864PEDRoyArt = new boolean[] {false} ;
      T01LM3_A12865PEDRoyAnc = new short[1] ;
      T01LM3_n12865PEDRoyAnc = new boolean[] {false} ;
      T01LM3_A12866PEDRoyObs = new String[] {""} ;
      T01LM3_n12866PEDRoyObs = new boolean[] {false} ;
      T01LM3_A12867PEDRoyEst = new byte[1] ;
      T01LM3_n12867PEDRoyEst = new boolean[] {false} ;
      T01LM3_A12868PEDRoyID = new int[1] ;
      T01LM3_n12868PEDRoyID = new boolean[] {false} ;
      T01LM3_A12869PEDRoyKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LM3_n12869PEDRoyKgs = new boolean[] {false} ;
      T01LM3_A12870PEDRoyMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LM3_n12870PEDRoyMts = new boolean[] {false} ;
      T01LM3_A12871PEDRoyPzs = new int[1] ;
      T01LM3_n12871PEDRoyPzs = new boolean[] {false} ;
      T01LM3_A12872PEDRoyArtA = new String[] {""} ;
      T01LM3_n12872PEDRoyArtA = new boolean[] {false} ;
      T01LM3_A12873PEDRoyObsU = new byte[1] ;
      T01LM3_n12873PEDRoyObsU = new boolean[] {false} ;
      T01LM3_A12874PEDRoyPTra = new String[] {""} ;
      T01LM3_n12874PEDRoyPTra = new boolean[] {false} ;
      T01LM3_A12875PEDRoyPorc = new String[] {""} ;
      T01LM3_n12875PEDRoyPorc = new boolean[] {false} ;
      T01LM3_A12876PEDRoyOF = new String[] {""} ;
      T01LM3_n12876PEDRoyOF = new boolean[] {false} ;
      T01LM3_A12877PEDRoyProc = new String[] {""} ;
      T01LM3_n12877PEDRoyProc = new boolean[] {false} ;
      T01LM3_A12878PEDRoyProA = new String[] {""} ;
      T01LM3_n12878PEDRoyProA = new boolean[] {false} ;
      T01LM3_A396EmprCod = new String[] {""} ;
      T01LM3_A252CliCod = new int[1] ;
      sMode1769 = "" ;
      T01LM9_A396EmprCod = new String[] {""} ;
      T01LM9_A252CliCod = new int[1] ;
      T01LM9_A12859PEDRoyNAlb = new int[1] ;
      T01LM9_A12860PEDRoyCoNm = new String[] {""} ;
      T01LM10_A396EmprCod = new String[] {""} ;
      T01LM10_A252CliCod = new int[1] ;
      T01LM10_A12859PEDRoyNAlb = new int[1] ;
      T01LM10_A12860PEDRoyCoNm = new String[] {""} ;
      T01LM2_A12859PEDRoyNAlb = new int[1] ;
      T01LM2_A12860PEDRoyCoNm = new String[] {""} ;
      T01LM2_A12861PEDRoyPed = new String[] {""} ;
      T01LM2_n12861PEDRoyPed = new boolean[] {false} ;
      T01LM2_A12862PEDRoyFPed = new java.util.Date[] {GXutil.nullDate()} ;
      T01LM2_n12862PEDRoyFPed = new boolean[] {false} ;
      T01LM2_A12863PEDRoyFcom = new java.util.Date[] {GXutil.nullDate()} ;
      T01LM2_n12863PEDRoyFcom = new boolean[] {false} ;
      T01LM2_A12864PEDRoyArt = new String[] {""} ;
      T01LM2_n12864PEDRoyArt = new boolean[] {false} ;
      T01LM2_A12865PEDRoyAnc = new short[1] ;
      T01LM2_n12865PEDRoyAnc = new boolean[] {false} ;
      T01LM2_A12866PEDRoyObs = new String[] {""} ;
      T01LM2_n12866PEDRoyObs = new boolean[] {false} ;
      T01LM2_A12867PEDRoyEst = new byte[1] ;
      T01LM2_n12867PEDRoyEst = new boolean[] {false} ;
      T01LM2_A12868PEDRoyID = new int[1] ;
      T01LM2_n12868PEDRoyID = new boolean[] {false} ;
      T01LM2_A12869PEDRoyKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LM2_n12869PEDRoyKgs = new boolean[] {false} ;
      T01LM2_A12870PEDRoyMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LM2_n12870PEDRoyMts = new boolean[] {false} ;
      T01LM2_A12871PEDRoyPzs = new int[1] ;
      T01LM2_n12871PEDRoyPzs = new boolean[] {false} ;
      T01LM2_A12872PEDRoyArtA = new String[] {""} ;
      T01LM2_n12872PEDRoyArtA = new boolean[] {false} ;
      T01LM2_A12873PEDRoyObsU = new byte[1] ;
      T01LM2_n12873PEDRoyObsU = new boolean[] {false} ;
      T01LM2_A12874PEDRoyPTra = new String[] {""} ;
      T01LM2_n12874PEDRoyPTra = new boolean[] {false} ;
      T01LM2_A12875PEDRoyPorc = new String[] {""} ;
      T01LM2_n12875PEDRoyPorc = new boolean[] {false} ;
      T01LM2_A12876PEDRoyOF = new String[] {""} ;
      T01LM2_n12876PEDRoyOF = new boolean[] {false} ;
      T01LM2_A12877PEDRoyProc = new String[] {""} ;
      T01LM2_n12877PEDRoyProc = new boolean[] {false} ;
      T01LM2_A12878PEDRoyProA = new String[] {""} ;
      T01LM2_n12878PEDRoyProA = new boolean[] {false} ;
      T01LM2_A396EmprCod = new String[] {""} ;
      T01LM2_A252CliCod = new int[1] ;
      T01LM14_A279CliNom = new String[] {""} ;
      T01LM15_A396EmprCod = new String[] {""} ;
      T01LM15_A252CliCod = new int[1] ;
      T01LM15_A12859PEDRoyNAlb = new int[1] ;
      T01LM15_A12860PEDRoyCoNm = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01LM16_A407EmprNom = new String[] {""} ;
      T01LM16_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ12860PEDRoyCoNm = "" ;
      ZZ407EmprNom = "" ;
      ZZ12861PEDRoyPed = "" ;
      ZZ12862PEDRoyFPed = GXutil.nullDate() ;
      ZZ12863PEDRoyFcom = GXutil.nullDate() ;
      ZZ12864PEDRoyArt = "" ;
      ZZ12866PEDRoyObs = "" ;
      ZZ12869PEDRoyKgs = DecimalUtil.ZERO ;
      ZZ12870PEDRoyMts = DecimalUtil.ZERO ;
      ZZ12872PEDRoyArtA = "" ;
      ZZ12874PEDRoyPTra = "" ;
      ZZ12875PEDRoyPorc = "" ;
      ZZ12876PEDRoyOF = "" ;
      ZZ12877PEDRoyProc = "" ;
      ZZ12878PEDRoyProA = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpedroyo__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpedroyo__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpedroyo__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpedroyo__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedroyo__default(),
         new Object[] {
             new Object[] {
            T01LM2_A12859PEDRoyNAlb, T01LM2_A12860PEDRoyCoNm, T01LM2_A12861PEDRoyPed, T01LM2_n12861PEDRoyPed, T01LM2_A12862PEDRoyFPed, T01LM2_n12862PEDRoyFPed, T01LM2_A12863PEDRoyFcom, T01LM2_n12863PEDRoyFcom, T01LM2_A12864PEDRoyArt, T01LM2_n12864PEDRoyArt,
            T01LM2_A12865PEDRoyAnc, T01LM2_n12865PEDRoyAnc, T01LM2_A12866PEDRoyObs, T01LM2_n12866PEDRoyObs, T01LM2_A12867PEDRoyEst, T01LM2_n12867PEDRoyEst, T01LM2_A12868PEDRoyID, T01LM2_n12868PEDRoyID, T01LM2_A12869PEDRoyKgs, T01LM2_n12869PEDRoyKgs,
            T01LM2_A12870PEDRoyMts, T01LM2_n12870PEDRoyMts, T01LM2_A12871PEDRoyPzs, T01LM2_n12871PEDRoyPzs, T01LM2_A12872PEDRoyArtA, T01LM2_n12872PEDRoyArtA, T01LM2_A12873PEDRoyObsU, T01LM2_n12873PEDRoyObsU, T01LM2_A12874PEDRoyPTra, T01LM2_n12874PEDRoyPTra,
            T01LM2_A12875PEDRoyPorc, T01LM2_n12875PEDRoyPorc, T01LM2_A12876PEDRoyOF, T01LM2_n12876PEDRoyOF, T01LM2_A12877PEDRoyProc, T01LM2_n12877PEDRoyProc, T01LM2_A12878PEDRoyProA, T01LM2_n12878PEDRoyProA, T01LM2_A396EmprCod, T01LM2_A252CliCod
            }
            , new Object[] {
            T01LM3_A12859PEDRoyNAlb, T01LM3_A12860PEDRoyCoNm, T01LM3_A12861PEDRoyPed, T01LM3_n12861PEDRoyPed, T01LM3_A12862PEDRoyFPed, T01LM3_n12862PEDRoyFPed, T01LM3_A12863PEDRoyFcom, T01LM3_n12863PEDRoyFcom, T01LM3_A12864PEDRoyArt, T01LM3_n12864PEDRoyArt,
            T01LM3_A12865PEDRoyAnc, T01LM3_n12865PEDRoyAnc, T01LM3_A12866PEDRoyObs, T01LM3_n12866PEDRoyObs, T01LM3_A12867PEDRoyEst, T01LM3_n12867PEDRoyEst, T01LM3_A12868PEDRoyID, T01LM3_n12868PEDRoyID, T01LM3_A12869PEDRoyKgs, T01LM3_n12869PEDRoyKgs,
            T01LM3_A12870PEDRoyMts, T01LM3_n12870PEDRoyMts, T01LM3_A12871PEDRoyPzs, T01LM3_n12871PEDRoyPzs, T01LM3_A12872PEDRoyArtA, T01LM3_n12872PEDRoyArtA, T01LM3_A12873PEDRoyObsU, T01LM3_n12873PEDRoyObsU, T01LM3_A12874PEDRoyPTra, T01LM3_n12874PEDRoyPTra,
            T01LM3_A12875PEDRoyPorc, T01LM3_n12875PEDRoyPorc, T01LM3_A12876PEDRoyOF, T01LM3_n12876PEDRoyOF, T01LM3_A12877PEDRoyProc, T01LM3_n12877PEDRoyProc, T01LM3_A12878PEDRoyProA, T01LM3_n12878PEDRoyProA, T01LM3_A396EmprCod, T01LM3_A252CliCod
            }
            , new Object[] {
            T01LM4_A407EmprNom, T01LM4_n407EmprNom
            }
            , new Object[] {
            T01LM5_A279CliNom
            }
            , new Object[] {
            T01LM6_A12859PEDRoyNAlb, T01LM6_A12860PEDRoyCoNm, T01LM6_A407EmprNom, T01LM6_n407EmprNom, T01LM6_A279CliNom, T01LM6_A12861PEDRoyPed, T01LM6_n12861PEDRoyPed, T01LM6_A12862PEDRoyFPed, T01LM6_n12862PEDRoyFPed, T01LM6_A12863PEDRoyFcom,
            T01LM6_n12863PEDRoyFcom, T01LM6_A12864PEDRoyArt, T01LM6_n12864PEDRoyArt, T01LM6_A12865PEDRoyAnc, T01LM6_n12865PEDRoyAnc, T01LM6_A12866PEDRoyObs, T01LM6_n12866PEDRoyObs, T01LM6_A12867PEDRoyEst, T01LM6_n12867PEDRoyEst, T01LM6_A12868PEDRoyID,
            T01LM6_n12868PEDRoyID, T01LM6_A12869PEDRoyKgs, T01LM6_n12869PEDRoyKgs, T01LM6_A12870PEDRoyMts, T01LM6_n12870PEDRoyMts, T01LM6_A12871PEDRoyPzs, T01LM6_n12871PEDRoyPzs, T01LM6_A12872PEDRoyArtA, T01LM6_n12872PEDRoyArtA, T01LM6_A12873PEDRoyObsU,
            T01LM6_n12873PEDRoyObsU, T01LM6_A12874PEDRoyPTra, T01LM6_n12874PEDRoyPTra, T01LM6_A12875PEDRoyPorc, T01LM6_n12875PEDRoyPorc, T01LM6_A12876PEDRoyOF, T01LM6_n12876PEDRoyOF, T01LM6_A12877PEDRoyProc, T01LM6_n12877PEDRoyProc, T01LM6_A12878PEDRoyProA,
            T01LM6_n12878PEDRoyProA, T01LM6_A396EmprCod, T01LM6_A252CliCod
            }
            , new Object[] {
            T01LM7_A279CliNom
            }
            , new Object[] {
            T01LM8_A396EmprCod, T01LM8_A252CliCod, T01LM8_A12859PEDRoyNAlb, T01LM8_A12860PEDRoyCoNm
            }
            , new Object[] {
            T01LM9_A396EmprCod, T01LM9_A252CliCod, T01LM9_A12859PEDRoyNAlb, T01LM9_A12860PEDRoyCoNm
            }
            , new Object[] {
            T01LM10_A396EmprCod, T01LM10_A252CliCod, T01LM10_A12859PEDRoyNAlb, T01LM10_A12860PEDRoyCoNm
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LM14_A279CliNom
            }
            , new Object[] {
            T01LM15_A396EmprCod, T01LM15_A252CliCod, T01LM15_A12859PEDRoyNAlb, T01LM15_A12860PEDRoyCoNm
            }
            , new Object[] {
            T01LM16_A407EmprNom, T01LM16_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TPEDRoyo" ;
   }

   private byte Z12867PEDRoyEst ;
   private byte Z12873PEDRoyObsU ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12867PEDRoyEst ;
   private byte A12873PEDRoyObsU ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ12867PEDRoyEst ;
   private byte ZZ12873PEDRoyObsU ;
   private short Z12865PEDRoyAnc ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12865PEDRoyAnc ;
   private short RcdFound1769 ;
   private short nIsDirty_1769 ;
   private short ZZ12865PEDRoyAnc ;
   private int Z252CliCod ;
   private int Z12859PEDRoyNAlb ;
   private int Z12868PEDRoyID ;
   private int Z12871PEDRoyPzs ;
   private int A252CliCod ;
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
   private int A12859PEDRoyNAlb ;
   private int edtPEDRoyNAlb_Enabled ;
   private int edtPEDRoyCoNm_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPEDRoyPed_Enabled ;
   private int edtPEDRoyFPed_Enabled ;
   private int edtPEDRoyFcom_Enabled ;
   private int edtPEDRoyArt_Enabled ;
   private int edtPEDRoyAnc_Enabled ;
   private int edtPEDRoyObs_Enabled ;
   private int edtPEDRoyEst_Enabled ;
   private int A12868PEDRoyID ;
   private int edtPEDRoyID_Enabled ;
   private int edtPEDRoyKgs_Enabled ;
   private int edtPEDRoyMts_Enabled ;
   private int A12871PEDRoyPzs ;
   private int edtPEDRoyPzs_Enabled ;
   private int edtPEDRoyArtA_Enabled ;
   private int edtPEDRoyObsU_Enabled ;
   private int edtPEDRoyPTra_Enabled ;
   private int edtPEDRoyPorc_Enabled ;
   private int edtPEDRoyOF_Enabled ;
   private int edtPEDRoyProc_Enabled ;
   private int edtPEDRoyProA_Enabled ;
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
   private int edtPEDRoyProA_Backcolor ;
   private int edtPEDRoyProc_Backcolor ;
   private int edtPEDRoyOF_Backcolor ;
   private int edtPEDRoyPorc_Backcolor ;
   private int edtPEDRoyPTra_Backcolor ;
   private int edtPEDRoyObsU_Backcolor ;
   private int edtPEDRoyArtA_Backcolor ;
   private int edtPEDRoyPzs_Backcolor ;
   private int edtPEDRoyMts_Backcolor ;
   private int edtPEDRoyKgs_Backcolor ;
   private int edtPEDRoyID_Backcolor ;
   private int edtPEDRoyEst_Backcolor ;
   private int edtPEDRoyObs_Backcolor ;
   private int edtPEDRoyAnc_Backcolor ;
   private int edtPEDRoyArt_Backcolor ;
   private int edtPEDRoyFcom_Backcolor ;
   private int edtPEDRoyFPed_Backcolor ;
   private int edtPEDRoyPed_Backcolor ;
   private int edtPEDRoyCoNm_Backcolor ;
   private int edtPEDRoyNAlb_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ12859PEDRoyNAlb ;
   private int ZZ12868PEDRoyID ;
   private int ZZ12871PEDRoyPzs ;
   private java.math.BigDecimal Z12869PEDRoyKgs ;
   private java.math.BigDecimal Z12870PEDRoyMts ;
   private java.math.BigDecimal A12869PEDRoyKgs ;
   private java.math.BigDecimal A12870PEDRoyMts ;
   private java.math.BigDecimal ZZ12869PEDRoyKgs ;
   private java.math.BigDecimal ZZ12870PEDRoyMts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12860PEDRoyCoNm ;
   private String Z12861PEDRoyPed ;
   private String Z12864PEDRoyArt ;
   private String Z12872PEDRoyArtA ;
   private String Z12874PEDRoyPTra ;
   private String Z12875PEDRoyPorc ;
   private String Z12876PEDRoyOF ;
   private String Z12877PEDRoyProc ;
   private String Z12878PEDRoyProA ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPEDRoyNAlb_Internalname ;
   private String edtPEDRoyNAlb_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPEDRoyCoNm_Internalname ;
   private String A12860PEDRoyCoNm ;
   private String edtPEDRoyCoNm_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPEDRoyPed_Internalname ;
   private String A12861PEDRoyPed ;
   private String edtPEDRoyPed_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPEDRoyFPed_Internalname ;
   private String edtPEDRoyFPed_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPEDRoyFcom_Internalname ;
   private String edtPEDRoyFcom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPEDRoyArt_Internalname ;
   private String A12864PEDRoyArt ;
   private String edtPEDRoyArt_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPEDRoyAnc_Internalname ;
   private String edtPEDRoyAnc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPEDRoyObs_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPEDRoyEst_Internalname ;
   private String edtPEDRoyEst_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtPEDRoyID_Internalname ;
   private String edtPEDRoyID_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtPEDRoyKgs_Internalname ;
   private String edtPEDRoyKgs_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtPEDRoyMts_Internalname ;
   private String edtPEDRoyMts_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtPEDRoyPzs_Internalname ;
   private String edtPEDRoyPzs_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtPEDRoyArtA_Internalname ;
   private String A12872PEDRoyArtA ;
   private String edtPEDRoyArtA_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtPEDRoyObsU_Internalname ;
   private String edtPEDRoyObsU_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtPEDRoyPTra_Internalname ;
   private String A12874PEDRoyPTra ;
   private String edtPEDRoyPTra_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtPEDRoyPorc_Internalname ;
   private String A12875PEDRoyPorc ;
   private String edtPEDRoyPorc_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtPEDRoyOF_Internalname ;
   private String A12876PEDRoyOF ;
   private String edtPEDRoyOF_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtPEDRoyProc_Internalname ;
   private String A12877PEDRoyProc ;
   private String edtPEDRoyProc_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtPEDRoyProA_Internalname ;
   private String A12878PEDRoyProA ;
   private String edtPEDRoyProA_Jsonclick ;
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
   private String AV33Pgmname ;
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
   private String Z279CliNom ;
   private String sMode1769 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ12860PEDRoyCoNm ;
   private String ZZ407EmprNom ;
   private String ZZ12861PEDRoyPed ;
   private String ZZ12864PEDRoyArt ;
   private String ZZ12872PEDRoyArtA ;
   private String ZZ12874PEDRoyPTra ;
   private String ZZ12875PEDRoyPorc ;
   private String ZZ12876PEDRoyOF ;
   private String ZZ12877PEDRoyProc ;
   private String ZZ12878PEDRoyProA ;
   private String ZZ279CliNom ;
   private java.util.Date Z12862PEDRoyFPed ;
   private java.util.Date Z12863PEDRoyFcom ;
   private java.util.Date A12862PEDRoyFPed ;
   private java.util.Date A12863PEDRoyFcom ;
   private java.util.Date ZZ12862PEDRoyFPed ;
   private java.util.Date ZZ12863PEDRoyFcom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n12861PEDRoyPed ;
   private boolean n12862PEDRoyFPed ;
   private boolean n12863PEDRoyFcom ;
   private boolean n12864PEDRoyArt ;
   private boolean n12865PEDRoyAnc ;
   private boolean n12866PEDRoyObs ;
   private boolean n12867PEDRoyEst ;
   private boolean n12868PEDRoyID ;
   private boolean n12869PEDRoyKgs ;
   private boolean n12870PEDRoyMts ;
   private boolean n12871PEDRoyPzs ;
   private boolean n12872PEDRoyArtA ;
   private boolean n12873PEDRoyObsU ;
   private boolean n12874PEDRoyPTra ;
   private boolean n12875PEDRoyPorc ;
   private boolean n12876PEDRoyOF ;
   private boolean n12877PEDRoyProc ;
   private boolean n12878PEDRoyProA ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z12866PEDRoyObs ;
   private String A12866PEDRoyObs ;
   private String ZZ12866PEDRoyObs ;
   private IDataStoreProvider pr_default ;
   private String[] T01LM4_A407EmprNom ;
   private boolean[] T01LM4_n407EmprNom ;
   private int[] T01LM6_A12859PEDRoyNAlb ;
   private String[] T01LM6_A12860PEDRoyCoNm ;
   private String[] T01LM6_A407EmprNom ;
   private boolean[] T01LM6_n407EmprNom ;
   private String[] T01LM6_A279CliNom ;
   private String[] T01LM6_A12861PEDRoyPed ;
   private boolean[] T01LM6_n12861PEDRoyPed ;
   private java.util.Date[] T01LM6_A12862PEDRoyFPed ;
   private boolean[] T01LM6_n12862PEDRoyFPed ;
   private java.util.Date[] T01LM6_A12863PEDRoyFcom ;
   private boolean[] T01LM6_n12863PEDRoyFcom ;
   private String[] T01LM6_A12864PEDRoyArt ;
   private boolean[] T01LM6_n12864PEDRoyArt ;
   private short[] T01LM6_A12865PEDRoyAnc ;
   private boolean[] T01LM6_n12865PEDRoyAnc ;
   private String[] T01LM6_A12866PEDRoyObs ;
   private boolean[] T01LM6_n12866PEDRoyObs ;
   private byte[] T01LM6_A12867PEDRoyEst ;
   private boolean[] T01LM6_n12867PEDRoyEst ;
   private int[] T01LM6_A12868PEDRoyID ;
   private boolean[] T01LM6_n12868PEDRoyID ;
   private java.math.BigDecimal[] T01LM6_A12869PEDRoyKgs ;
   private boolean[] T01LM6_n12869PEDRoyKgs ;
   private java.math.BigDecimal[] T01LM6_A12870PEDRoyMts ;
   private boolean[] T01LM6_n12870PEDRoyMts ;
   private int[] T01LM6_A12871PEDRoyPzs ;
   private boolean[] T01LM6_n12871PEDRoyPzs ;
   private String[] T01LM6_A12872PEDRoyArtA ;
   private boolean[] T01LM6_n12872PEDRoyArtA ;
   private byte[] T01LM6_A12873PEDRoyObsU ;
   private boolean[] T01LM6_n12873PEDRoyObsU ;
   private String[] T01LM6_A12874PEDRoyPTra ;
   private boolean[] T01LM6_n12874PEDRoyPTra ;
   private String[] T01LM6_A12875PEDRoyPorc ;
   private boolean[] T01LM6_n12875PEDRoyPorc ;
   private String[] T01LM6_A12876PEDRoyOF ;
   private boolean[] T01LM6_n12876PEDRoyOF ;
   private String[] T01LM6_A12877PEDRoyProc ;
   private boolean[] T01LM6_n12877PEDRoyProc ;
   private String[] T01LM6_A12878PEDRoyProA ;
   private boolean[] T01LM6_n12878PEDRoyProA ;
   private String[] T01LM6_A396EmprCod ;
   private int[] T01LM6_A252CliCod ;
   private String[] T01LM5_A279CliNom ;
   private String[] T01LM7_A279CliNom ;
   private String[] T01LM8_A396EmprCod ;
   private int[] T01LM8_A252CliCod ;
   private int[] T01LM8_A12859PEDRoyNAlb ;
   private String[] T01LM8_A12860PEDRoyCoNm ;
   private int[] T01LM3_A12859PEDRoyNAlb ;
   private String[] T01LM3_A12860PEDRoyCoNm ;
   private String[] T01LM3_A12861PEDRoyPed ;
   private boolean[] T01LM3_n12861PEDRoyPed ;
   private java.util.Date[] T01LM3_A12862PEDRoyFPed ;
   private boolean[] T01LM3_n12862PEDRoyFPed ;
   private java.util.Date[] T01LM3_A12863PEDRoyFcom ;
   private boolean[] T01LM3_n12863PEDRoyFcom ;
   private String[] T01LM3_A12864PEDRoyArt ;
   private boolean[] T01LM3_n12864PEDRoyArt ;
   private short[] T01LM3_A12865PEDRoyAnc ;
   private boolean[] T01LM3_n12865PEDRoyAnc ;
   private String[] T01LM3_A12866PEDRoyObs ;
   private boolean[] T01LM3_n12866PEDRoyObs ;
   private byte[] T01LM3_A12867PEDRoyEst ;
   private boolean[] T01LM3_n12867PEDRoyEst ;
   private int[] T01LM3_A12868PEDRoyID ;
   private boolean[] T01LM3_n12868PEDRoyID ;
   private java.math.BigDecimal[] T01LM3_A12869PEDRoyKgs ;
   private boolean[] T01LM3_n12869PEDRoyKgs ;
   private java.math.BigDecimal[] T01LM3_A12870PEDRoyMts ;
   private boolean[] T01LM3_n12870PEDRoyMts ;
   private int[] T01LM3_A12871PEDRoyPzs ;
   private boolean[] T01LM3_n12871PEDRoyPzs ;
   private String[] T01LM3_A12872PEDRoyArtA ;
   private boolean[] T01LM3_n12872PEDRoyArtA ;
   private byte[] T01LM3_A12873PEDRoyObsU ;
   private boolean[] T01LM3_n12873PEDRoyObsU ;
   private String[] T01LM3_A12874PEDRoyPTra ;
   private boolean[] T01LM3_n12874PEDRoyPTra ;
   private String[] T01LM3_A12875PEDRoyPorc ;
   private boolean[] T01LM3_n12875PEDRoyPorc ;
   private String[] T01LM3_A12876PEDRoyOF ;
   private boolean[] T01LM3_n12876PEDRoyOF ;
   private String[] T01LM3_A12877PEDRoyProc ;
   private boolean[] T01LM3_n12877PEDRoyProc ;
   private String[] T01LM3_A12878PEDRoyProA ;
   private boolean[] T01LM3_n12878PEDRoyProA ;
   private String[] T01LM3_A396EmprCod ;
   private int[] T01LM3_A252CliCod ;
   private String[] T01LM9_A396EmprCod ;
   private int[] T01LM9_A252CliCod ;
   private int[] T01LM9_A12859PEDRoyNAlb ;
   private String[] T01LM9_A12860PEDRoyCoNm ;
   private String[] T01LM10_A396EmprCod ;
   private int[] T01LM10_A252CliCod ;
   private int[] T01LM10_A12859PEDRoyNAlb ;
   private String[] T01LM10_A12860PEDRoyCoNm ;
   private int[] T01LM2_A12859PEDRoyNAlb ;
   private String[] T01LM2_A12860PEDRoyCoNm ;
   private String[] T01LM2_A12861PEDRoyPed ;
   private boolean[] T01LM2_n12861PEDRoyPed ;
   private java.util.Date[] T01LM2_A12862PEDRoyFPed ;
   private boolean[] T01LM2_n12862PEDRoyFPed ;
   private java.util.Date[] T01LM2_A12863PEDRoyFcom ;
   private boolean[] T01LM2_n12863PEDRoyFcom ;
   private String[] T01LM2_A12864PEDRoyArt ;
   private boolean[] T01LM2_n12864PEDRoyArt ;
   private short[] T01LM2_A12865PEDRoyAnc ;
   private boolean[] T01LM2_n12865PEDRoyAnc ;
   private String[] T01LM2_A12866PEDRoyObs ;
   private boolean[] T01LM2_n12866PEDRoyObs ;
   private byte[] T01LM2_A12867PEDRoyEst ;
   private boolean[] T01LM2_n12867PEDRoyEst ;
   private int[] T01LM2_A12868PEDRoyID ;
   private boolean[] T01LM2_n12868PEDRoyID ;
   private java.math.BigDecimal[] T01LM2_A12869PEDRoyKgs ;
   private boolean[] T01LM2_n12869PEDRoyKgs ;
   private java.math.BigDecimal[] T01LM2_A12870PEDRoyMts ;
   private boolean[] T01LM2_n12870PEDRoyMts ;
   private int[] T01LM2_A12871PEDRoyPzs ;
   private boolean[] T01LM2_n12871PEDRoyPzs ;
   private String[] T01LM2_A12872PEDRoyArtA ;
   private boolean[] T01LM2_n12872PEDRoyArtA ;
   private byte[] T01LM2_A12873PEDRoyObsU ;
   private boolean[] T01LM2_n12873PEDRoyObsU ;
   private String[] T01LM2_A12874PEDRoyPTra ;
   private boolean[] T01LM2_n12874PEDRoyPTra ;
   private String[] T01LM2_A12875PEDRoyPorc ;
   private boolean[] T01LM2_n12875PEDRoyPorc ;
   private String[] T01LM2_A12876PEDRoyOF ;
   private boolean[] T01LM2_n12876PEDRoyOF ;
   private String[] T01LM2_A12877PEDRoyProc ;
   private boolean[] T01LM2_n12877PEDRoyProc ;
   private String[] T01LM2_A12878PEDRoyProA ;
   private boolean[] T01LM2_n12878PEDRoyProA ;
   private String[] T01LM2_A396EmprCod ;
   private int[] T01LM2_A252CliCod ;
   private String[] T01LM14_A279CliNom ;
   private String[] T01LM15_A396EmprCod ;
   private int[] T01LM15_A252CliCod ;
   private int[] T01LM15_A12859PEDRoyNAlb ;
   private String[] T01LM15_A12860PEDRoyCoNm ;
   private String[] T01LM16_A407EmprNom ;
   private boolean[] T01LM16_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpedroyo__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedroyo__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedroyo__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedroyo__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedroyo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LM2", "SELECT PEDRoyNAlb, PEDRoyCoNm, PEDRoyPed, PEDRoyFPed, PEDRoyFcom, PEDRoyArt, PEDRoyAnc, PEDRoyObs, PEDRoyEst, PEDRoyID, PEDRoyKgs, PEDRoyMts, PEDRoyPzs, PEDRoyArtA, PEDRoyObsU, PEDRoyPTra, PEDRoyPorc, PEDRoyOF, PEDRoyProc, PEDRoyProA, EmprCod, CliCod FROM TXPPEDROY WHERE EmprCod = ? AND CliCod = ? AND PEDRoyNAlb = ? AND PEDRoyCoNm = ?  FOR UPDATE OF PEDRoyPed, PEDRoyFPed, PEDRoyFcom, PEDRoyArt, PEDRoyAnc, PEDRoyObs, PEDRoyEst, PEDRoyID, PEDRoyKgs, PEDRoyMts, PEDRoyPzs, PEDRoyArtA, PEDRoyObsU, PEDRoyPTra, PEDRoyPorc, PEDRoyOF, PEDRoyProc, PEDRoyProA NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM3", "SELECT PEDRoyNAlb, PEDRoyCoNm, PEDRoyPed, PEDRoyFPed, PEDRoyFcom, PEDRoyArt, PEDRoyAnc, PEDRoyObs, PEDRoyEst, PEDRoyID, PEDRoyKgs, PEDRoyMts, PEDRoyPzs, PEDRoyArtA, PEDRoyObsU, PEDRoyPTra, PEDRoyPorc, PEDRoyOF, PEDRoyProc, PEDRoyProA, EmprCod, CliCod FROM TXPPEDROY WHERE EmprCod = ? AND CliCod = ? AND PEDRoyNAlb = ? AND PEDRoyCoNm = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM6", "SELECT /*+ FIRST_ROWS(100) */ TM1.PEDRoyNAlb, TM1.PEDRoyCoNm, T2.EmprNom, T3.CliNom, TM1.PEDRoyPed, TM1.PEDRoyFPed, TM1.PEDRoyFcom, TM1.PEDRoyArt, TM1.PEDRoyAnc, TM1.PEDRoyObs, TM1.PEDRoyEst, TM1.PEDRoyID, TM1.PEDRoyKgs, TM1.PEDRoyMts, TM1.PEDRoyPzs, TM1.PEDRoyArtA, TM1.PEDRoyObsU, TM1.PEDRoyPTra, TM1.PEDRoyPorc, TM1.PEDRoyOF, TM1.PEDRoyProc, TM1.PEDRoyProA, TM1.EmprCod, TM1.CliCod FROM ((TXPPEDROY TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.PEDRoyNAlb = ? and TM1.PEDRoyCoNm = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.PEDRoyNAlb, TM1.PEDRoyCoNm ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PEDRoyNAlb, PEDRoyCoNm FROM TXPPEDROY WHERE EmprCod = ? AND CliCod = ? AND PEDRoyNAlb = ? AND PEDRoyCoNm = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PEDRoyNAlb, PEDRoyCoNm FROM TXPPEDROY WHERE ( CliCod > ? or CliCod = ? and PEDRoyNAlb > ? or PEDRoyNAlb = ? and CliCod = ? and PEDRoyCoNm > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, PEDRoyNAlb, PEDRoyCoNm) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LM10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, PEDRoyNAlb, PEDRoyCoNm FROM TXPPEDROY WHERE ( CliCod < ? or CliCod = ? and PEDRoyNAlb < ? or PEDRoyNAlb = ? and CliCod = ? and PEDRoyCoNm < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, PEDRoyNAlb DESC, PEDRoyCoNm DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LM11", "INSERT INTO TXPPEDROY(PEDRoyNAlb, PEDRoyCoNm, PEDRoyPed, PEDRoyFPed, PEDRoyFcom, PEDRoyArt, PEDRoyAnc, PEDRoyObs, PEDRoyEst, PEDRoyID, PEDRoyKgs, PEDRoyMts, PEDRoyPzs, PEDRoyArtA, PEDRoyObsU, PEDRoyPTra, PEDRoyPorc, PEDRoyOF, PEDRoyProc, PEDRoyProA, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPEDROY")
         ,new UpdateCursor("T01LM12", "UPDATE TXPPEDROY SET PEDRoyPed=?, PEDRoyFPed=?, PEDRoyFcom=?, PEDRoyArt=?, PEDRoyAnc=?, PEDRoyObs=?, PEDRoyEst=?, PEDRoyID=?, PEDRoyKgs=?, PEDRoyMts=?, PEDRoyPzs=?, PEDRoyArtA=?, PEDRoyObsU=?, PEDRoyPTra=?, PEDRoyPorc=?, PEDRoyOF=?, PEDRoyProc=?, PEDRoyProA=?  WHERE EmprCod = ? AND CliCod = ? AND PEDRoyNAlb = ? AND PEDRoyCoNm = ?", GX_NOMASK, "TXPPEDROY")
         ,new UpdateCursor("T01LM13", "DELETE FROM TXPPEDROY  WHERE EmprCod = ? AND CliCod = ? AND PEDRoyNAlb = ? AND PEDRoyCoNm = ?", GX_NOMASK, "TXPPEDROY")
         ,new ForEachCursor("T01LM14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, PEDRoyNAlb, PEDRoyCoNm FROM TXPPEDROY WHERE EmprCod = ? ORDER BY EmprCod, CliCod, PEDRoyNAlb, PEDRoyCoNm ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LM16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 3);
               ((int[]) buf[39])[0] = rslt.getInt(22);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 3);
               ((int[]) buf[39])[0] = rslt.getInt(22);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
               ((int[]) buf[42])[0] = rslt.getInt(24);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 13);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 30);
               }
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 540);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 16);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 10);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[33], 10);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[35], 20);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[37], 8);
               }
               stmt.setString(21, (String)parms[38], 3);
               stmt.setInt(22, ((Number) parms[39]).intValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
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
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 540);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 16);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 10);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 10);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 20);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 8);
               }
               stmt.setString(19, (String)parms[36], 3);
               stmt.setInt(20, ((Number) parms[37]).intValue());
               stmt.setInt(21, ((Number) parms[38]).intValue());
               stmt.setString(22, (String)parms[39], 13);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

