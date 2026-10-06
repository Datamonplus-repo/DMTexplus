package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr0900_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA PEDIDOS CLIENTES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTd_NumInt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttr0900_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr0900_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr0900_impl.class ));
   }

   public ttr0900_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR0900.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Numero Sistema ERP", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_NumInt_Internalname, GXutil.ltrim( localUtil.ntoc( A10398Td_NumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_NumInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10398Td_NumInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10398Td_NumInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_NumInt_Jsonclick, 0, "", "", "", "", "", 1, edtTd_NumInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_PedCli_Internalname, GXutil.rtrim( A10399Td_PedCli), GXutil.rtrim( localUtil.format( A10399Td_PedCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_PedCli_Jsonclick, 0, "", "", "", "", "", 1, edtTd_PedCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Tipo Pedido", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Tipo_Internalname, GXutil.rtrim( A10400Td_Tipo), GXutil.rtrim( localUtil.format( A10400Td_Tipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Tipo_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Tipo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Client_Internalname, GXutil.ltrim( localUtil.ntoc( A10401Td_Client, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_Client_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10401Td_Client), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10401Td_Client), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Client_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Client_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Art_Internalname, GXutil.rtrim( A10402Td_Art), GXutil.rtrim( localUtil.format( A10402Td_Art, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Art_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Art_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTd_Fec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Fec_Internalname, localUtil.format(A10403Td_Fec, "99/99/99"), localUtil.format( A10403Td_Fec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Fec_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Fec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTd_Fec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTd_Fec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTR0900.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Color Nombre", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_ColN_Internalname, GXutil.rtrim( A10404Td_ColN), GXutil.rtrim( localUtil.format( A10404Td_ColN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_ColN_Jsonclick, 0, "", "", "", "", "", 1, edtTd_ColN_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_ColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A10405Td_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_ColNn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10405Td_ColNn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10405Td_ColNn), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_ColNn_Jsonclick, 0, "", "", "", "", "", 1, edtTd_ColNn_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Unidad K,M", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Und_Internalname, GXutil.rtrim( A10406Td_Und), GXutil.rtrim( localUtil.format( A10406Td_Und, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Und_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Und_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A10407Td_Cant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_Cant_Enabled!=0) ? localUtil.format( A10407Td_Cant, "ZZZZZ9.99") : localUtil.format( A10407Td_Cant, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Cant_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Cant_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A10408Td_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_Pzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10408Td_Pzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10408Td_Pzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Pzs_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Pzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Ref_Internalname, GXutil.rtrim( A10409Td_Ref), GXutil.rtrim( localUtil.format( A10409Td_Ref, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Ref_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Ref_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_stat_Internalname, GXutil.ltrim( localUtil.ntoc( A10410Td_stat, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_stat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10410Td_stat), "9") : localUtil.format( DecimalUtil.doubleToDec(A10410Td_stat), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_stat_Jsonclick, 0, "", "", "", "", "", 1, edtTd_stat_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Fecha-hora Envio T+", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTd_Fect_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Fect_Internalname, localUtil.ttoc( A10411Td_Fect, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10411Td_Fect, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Fect_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Fect_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTd_Fect_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTd_Fect_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTR0900.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Color Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_ColNC_Internalname, GXutil.rtrim( A10424Td_ColNC), GXutil.rtrim( localUtil.format( A10424Td_ColNC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_ColNC_Jsonclick, 0, "", "", "", "", "", 1, edtTd_ColNC_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_ColNnC_Internalname, GXutil.ltrim( localUtil.ntoc( A10425Td_ColNnC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_ColNnC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10425Td_ColNnC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10425Td_ColNnC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_ColNnC_Jsonclick, 0, "", "", "", "", "", 1, edtTd_ColNnC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Albaran Procedencia", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_AlbPro_Internalname, GXutil.rtrim( A10426Td_AlbPro), GXutil.rtrim( localUtil.format( A10426Td_AlbPro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_AlbPro_Jsonclick, 0, "", "", "", "", "", 1, edtTd_AlbPro_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Procedencia", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Proc_Internalname, GXutil.rtrim( A10427Td_Proc), GXutil.rtrim( localUtil.format( A10427Td_Proc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Proc_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Proc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Grm", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_grm_Internalname, GXutil.ltrim( localUtil.ntoc( A10428Td_grm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_grm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10428Td_grm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10428Td_grm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_grm_Jsonclick, 0, "", "", "", "", "", 1, edtTd_grm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_anc_Internalname, GXutil.ltrim( localUtil.ntoc( A10429Td_anc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_anc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10429Td_anc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10429Td_anc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_anc_Jsonclick, 0, "", "", "", "", "", 1, edtTd_anc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "P Kg", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_pk_Internalname, GXutil.ltrim( localUtil.ntoc( A10430Td_pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_pk_Enabled!=0) ? localUtil.format( A10430Td_pk, "ZZZZZZ9.999") : localUtil.format( A10430Td_pk, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_pk_Jsonclick, 0, "", "", "", "", "", 1, edtTd_pk_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "P Mt", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_pm_Internalname, GXutil.ltrim( localUtil.ntoc( A10431Td_pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTd_pm_Enabled!=0) ? localUtil.format( A10431Td_pm, "ZZZZZZ9.999") : localUtil.format( A10431Td_pm, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_pm_Jsonclick, 0, "", "", "", "", "", 1, edtTd_pm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Pro_Internalname, GXutil.rtrim( A10432Td_Pro), GXutil.rtrim( localUtil.format( A10432Td_Pro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Pro_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Pro_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Maquina Malheiro", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Maquina_Internalname, GXutil.rtrim( A10586Td_Maquina), GXutil.rtrim( localUtil.format( A10586Td_Maquina, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Maquina_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Maquina_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_Lote_Internalname, GXutil.rtrim( A10587Td_Lote), GXutil.rtrim( localUtil.format( A10587Td_Lote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_Lote_Jsonclick, 0, "", "", "", "", "", 1, edtTd_Lote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Encomenda Cliente", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTd_EncCli_Internalname, GXutil.rtrim( A10763Td_EncCli), GXutil.rtrim( localUtil.format( A10763Td_EncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTd_EncCli_Jsonclick, 0, "", "", "", "", "", 1, edtTd_EncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtTd_obs_Internalname, A10774Td_obs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", (short)(0), 1, edtTd_obs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TTR0900.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0900.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR0900.htm");
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
      e111832 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10398Td_NumInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z10398Td_NumInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10399Td_PedCli = httpContext.cgiGet( "Z10399Td_PedCli") ;
            Z10400Td_Tipo = httpContext.cgiGet( "Z10400Td_Tipo") ;
            Z10401Td_Client = (int)(localUtil.ctol( httpContext.cgiGet( "Z10401Td_Client"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10402Td_Art = httpContext.cgiGet( "Z10402Td_Art") ;
            Z10403Td_Fec = localUtil.ctod( httpContext.cgiGet( "Z10403Td_Fec"), 0) ;
            Z10404Td_ColN = httpContext.cgiGet( "Z10404Td_ColN") ;
            Z10405Td_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( "Z10405Td_ColNn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10406Td_Und = httpContext.cgiGet( "Z10406Td_Und") ;
            Z10407Td_Cant = localUtil.ctond( httpContext.cgiGet( "Z10407Td_Cant")) ;
            Z10408Td_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( "Z10408Td_Pzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10409Td_Ref = httpContext.cgiGet( "Z10409Td_Ref") ;
            Z10410Td_stat = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10410Td_stat"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10411Td_Fect = localUtil.ctot( httpContext.cgiGet( "Z10411Td_Fect"), 0) ;
            Z10424Td_ColNC = httpContext.cgiGet( "Z10424Td_ColNC") ;
            Z10425Td_ColNnC = (int)(localUtil.ctol( httpContext.cgiGet( "Z10425Td_ColNnC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10426Td_AlbPro = httpContext.cgiGet( "Z10426Td_AlbPro") ;
            Z10427Td_Proc = httpContext.cgiGet( "Z10427Td_Proc") ;
            Z10428Td_grm = (short)(localUtil.ctol( httpContext.cgiGet( "Z10428Td_grm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10429Td_anc = (short)(localUtil.ctol( httpContext.cgiGet( "Z10429Td_anc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10430Td_pk = localUtil.ctond( httpContext.cgiGet( "Z10430Td_pk")) ;
            Z10431Td_pm = localUtil.ctond( httpContext.cgiGet( "Z10431Td_pm")) ;
            Z10432Td_Pro = httpContext.cgiGet( "Z10432Td_Pro") ;
            Z10586Td_Maquina = httpContext.cgiGet( "Z10586Td_Maquina") ;
            Z10587Td_Lote = httpContext.cgiGet( "Z10587Td_Lote") ;
            Z10763Td_EncCli = httpContext.cgiGet( "Z10763Td_EncCli") ;
            Z10774Td_obs = httpContext.cgiGet( "Z10774Td_obs") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTd_NumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTd_NumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_NUMINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_NumInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10398Td_NumInt = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
            }
            else
            {
               A10398Td_NumInt = (int)(localUtil.ctol( httpContext.cgiGet( edtTd_NumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
            }
            A10399Td_PedCli = httpContext.cgiGet( edtTd_PedCli_Internalname) ;
            n10399Td_PedCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10399Td_PedCli", A10399Td_PedCli);
            A10400Td_Tipo = httpContext.cgiGet( edtTd_Tipo_Internalname) ;
            n10400Td_Tipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10400Td_Tipo", A10400Td_Tipo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTd_Client_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTd_Client_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_CLIENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_Client_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10401Td_Client = 0 ;
               n10401Td_Client = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10401Td_Client", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10401Td_Client), 6, 0));
            }
            else
            {
               A10401Td_Client = (int)(localUtil.ctol( httpContext.cgiGet( edtTd_Client_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10401Td_Client = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10401Td_Client", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10401Td_Client), 6, 0));
            }
            A10402Td_Art = httpContext.cgiGet( edtTd_Art_Internalname) ;
            n10402Td_Art = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10402Td_Art", A10402Td_Art);
            if ( localUtil.vcdate( httpContext.cgiGet( edtTd_Fec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TD_FEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_Fec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10403Td_Fec = GXutil.nullDate() ;
               n10403Td_Fec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10403Td_Fec", localUtil.format(A10403Td_Fec, "99/99/99"));
            }
            else
            {
               A10403Td_Fec = localUtil.ctod( httpContext.cgiGet( edtTd_Fec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10403Td_Fec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10403Td_Fec", localUtil.format(A10403Td_Fec, "99/99/99"));
            }
            A10404Td_ColN = httpContext.cgiGet( edtTd_ColN_Internalname) ;
            n10404Td_ColN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10404Td_ColN", A10404Td_ColN);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTd_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTd_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_COLNN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_ColNn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10405Td_ColNn = 0 ;
               n10405Td_ColNn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10405Td_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10405Td_ColNn), 6, 0));
            }
            else
            {
               A10405Td_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( edtTd_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10405Td_ColNn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10405Td_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10405Td_ColNn), 6, 0));
            }
            A10406Td_Und = GXutil.upper( httpContext.cgiGet( edtTd_Und_Internalname)) ;
            n10406Td_Und = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10406Td_Und", A10406Td_Und);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTd_Cant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTd_Cant_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_CANT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_Cant_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10407Td_Cant = DecimalUtil.ZERO ;
               n10407Td_Cant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10407Td_Cant", GXutil.ltrimstr( A10407Td_Cant, 9, 2));
            }
            else
            {
               A10407Td_Cant = localUtil.ctond( httpContext.cgiGet( edtTd_Cant_Internalname)) ;
               n10407Td_Cant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10407Td_Cant", GXutil.ltrimstr( A10407Td_Cant, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTd_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTd_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_PZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_Pzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10408Td_Pzs = (short)(0) ;
               n10408Td_Pzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10408Td_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10408Td_Pzs), 4, 0));
            }
            else
            {
               A10408Td_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( edtTd_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10408Td_Pzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10408Td_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10408Td_Pzs), 4, 0));
            }
            A10409Td_Ref = httpContext.cgiGet( edtTd_Ref_Internalname) ;
            n10409Td_Ref = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10409Td_Ref", A10409Td_Ref);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTd_stat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTd_stat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_STAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_stat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10410Td_stat = (byte)(0) ;
               n10410Td_stat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10410Td_stat", GXutil.str( A10410Td_stat, 1, 0));
            }
            else
            {
               A10410Td_stat = (byte)(localUtil.ctol( httpContext.cgiGet( edtTd_stat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10410Td_stat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10410Td_stat", GXutil.str( A10410Td_stat, 1, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTd_Fect_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TD_FECT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_Fect_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10411Td_Fect = GXutil.resetTime( GXutil.nullDate() );
               n10411Td_Fect = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10411Td_Fect", localUtil.ttoc( A10411Td_Fect, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10411Td_Fect = localUtil.ctot( httpContext.cgiGet( edtTd_Fect_Internalname)) ;
               n10411Td_Fect = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10411Td_Fect", localUtil.ttoc( A10411Td_Fect, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A10424Td_ColNC = httpContext.cgiGet( edtTd_ColNC_Internalname) ;
            n10424Td_ColNC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10424Td_ColNC", A10424Td_ColNC);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTd_ColNnC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTd_ColNnC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_COLNNC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_ColNnC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10425Td_ColNnC = 0 ;
               n10425Td_ColNnC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10425Td_ColNnC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10425Td_ColNnC), 6, 0));
            }
            else
            {
               A10425Td_ColNnC = (int)(localUtil.ctol( httpContext.cgiGet( edtTd_ColNnC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10425Td_ColNnC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10425Td_ColNnC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10425Td_ColNnC), 6, 0));
            }
            A10426Td_AlbPro = httpContext.cgiGet( edtTd_AlbPro_Internalname) ;
            n10426Td_AlbPro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10426Td_AlbPro", A10426Td_AlbPro);
            A10427Td_Proc = httpContext.cgiGet( edtTd_Proc_Internalname) ;
            n10427Td_Proc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10427Td_Proc", A10427Td_Proc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTd_grm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTd_grm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_GRM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_grm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10428Td_grm = (short)(0) ;
               n10428Td_grm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10428Td_grm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10428Td_grm), 4, 0));
            }
            else
            {
               A10428Td_grm = (short)(localUtil.ctol( httpContext.cgiGet( edtTd_grm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10428Td_grm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10428Td_grm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10428Td_grm), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTd_anc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTd_anc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_ANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_anc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10429Td_anc = (short)(0) ;
               n10429Td_anc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10429Td_anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10429Td_anc), 3, 0));
            }
            else
            {
               A10429Td_anc = (short)(localUtil.ctol( httpContext.cgiGet( edtTd_anc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10429Td_anc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10429Td_anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10429Td_anc), 3, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTd_pk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTd_pk_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_PK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_pk_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10430Td_pk = DecimalUtil.ZERO ;
               n10430Td_pk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10430Td_pk", GXutil.ltrimstr( A10430Td_pk, 13, 5));
            }
            else
            {
               A10430Td_pk = localUtil.ctond( httpContext.cgiGet( edtTd_pk_Internalname)) ;
               n10430Td_pk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10430Td_pk", GXutil.ltrimstr( A10430Td_pk, 13, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTd_pm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTd_pm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TD_PM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTd_pm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10431Td_pm = DecimalUtil.ZERO ;
               n10431Td_pm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10431Td_pm", GXutil.ltrimstr( A10431Td_pm, 13, 5));
            }
            else
            {
               A10431Td_pm = localUtil.ctond( httpContext.cgiGet( edtTd_pm_Internalname)) ;
               n10431Td_pm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10431Td_pm", GXutil.ltrimstr( A10431Td_pm, 13, 5));
            }
            A10432Td_Pro = httpContext.cgiGet( edtTd_Pro_Internalname) ;
            n10432Td_Pro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10432Td_Pro", A10432Td_Pro);
            A10586Td_Maquina = httpContext.cgiGet( edtTd_Maquina_Internalname) ;
            n10586Td_Maquina = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10586Td_Maquina", A10586Td_Maquina);
            A10587Td_Lote = httpContext.cgiGet( edtTd_Lote_Internalname) ;
            n10587Td_Lote = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10587Td_Lote", A10587Td_Lote);
            A10763Td_EncCli = httpContext.cgiGet( edtTd_EncCli_Internalname) ;
            n10763Td_EncCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10763Td_EncCli", A10763Td_EncCli);
            A10774Td_obs = httpContext.cgiGet( edtTd_obs_Internalname) ;
            n10774Td_obs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10774Td_obs", A10774Td_obs);
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
               A10398Td_NumInt = (int)(GXutil.lval( httpContext.GetPar( "Td_NumInt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
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
                        e111832 ();
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
            initAll1831407( ) ;
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
      disableAttributes1831407( ) ;
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

   public void confirm_1830( )
   {
      beforeValidate1831407( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1831407( ) ;
         }
         else
         {
            checkExtendedTable1831407( ) ;
            if ( AnyError == 0 )
            {
               zm1831407( 2) ;
            }
            closeExtendedTableCursors1831407( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1830( ) ;
      }
   }

   public void resetCaption1830( )
   {
   }

   public void e111832( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr0900_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttr0900_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr0900_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttr0900_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr0900_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr0900_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1831407( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10399Td_PedCli = T01833_A10399Td_PedCli[0] ;
            Z10400Td_Tipo = T01833_A10400Td_Tipo[0] ;
            Z10401Td_Client = T01833_A10401Td_Client[0] ;
            Z10402Td_Art = T01833_A10402Td_Art[0] ;
            Z10403Td_Fec = T01833_A10403Td_Fec[0] ;
            Z10404Td_ColN = T01833_A10404Td_ColN[0] ;
            Z10405Td_ColNn = T01833_A10405Td_ColNn[0] ;
            Z10406Td_Und = T01833_A10406Td_Und[0] ;
            Z10407Td_Cant = T01833_A10407Td_Cant[0] ;
            Z10408Td_Pzs = T01833_A10408Td_Pzs[0] ;
            Z10409Td_Ref = T01833_A10409Td_Ref[0] ;
            Z10410Td_stat = T01833_A10410Td_stat[0] ;
            Z10411Td_Fect = T01833_A10411Td_Fect[0] ;
            Z10424Td_ColNC = T01833_A10424Td_ColNC[0] ;
            Z10425Td_ColNnC = T01833_A10425Td_ColNnC[0] ;
            Z10426Td_AlbPro = T01833_A10426Td_AlbPro[0] ;
            Z10427Td_Proc = T01833_A10427Td_Proc[0] ;
            Z10428Td_grm = T01833_A10428Td_grm[0] ;
            Z10429Td_anc = T01833_A10429Td_anc[0] ;
            Z10430Td_pk = T01833_A10430Td_pk[0] ;
            Z10431Td_pm = T01833_A10431Td_pm[0] ;
            Z10432Td_Pro = T01833_A10432Td_Pro[0] ;
            Z10586Td_Maquina = T01833_A10586Td_Maquina[0] ;
            Z10587Td_Lote = T01833_A10587Td_Lote[0] ;
            Z10763Td_EncCli = T01833_A10763Td_EncCli[0] ;
            Z10774Td_obs = T01833_A10774Td_obs[0] ;
         }
         else
         {
            Z10399Td_PedCli = A10399Td_PedCli ;
            Z10400Td_Tipo = A10400Td_Tipo ;
            Z10401Td_Client = A10401Td_Client ;
            Z10402Td_Art = A10402Td_Art ;
            Z10403Td_Fec = A10403Td_Fec ;
            Z10404Td_ColN = A10404Td_ColN ;
            Z10405Td_ColNn = A10405Td_ColNn ;
            Z10406Td_Und = A10406Td_Und ;
            Z10407Td_Cant = A10407Td_Cant ;
            Z10408Td_Pzs = A10408Td_Pzs ;
            Z10409Td_Ref = A10409Td_Ref ;
            Z10410Td_stat = A10410Td_stat ;
            Z10411Td_Fect = A10411Td_Fect ;
            Z10424Td_ColNC = A10424Td_ColNC ;
            Z10425Td_ColNnC = A10425Td_ColNnC ;
            Z10426Td_AlbPro = A10426Td_AlbPro ;
            Z10427Td_Proc = A10427Td_Proc ;
            Z10428Td_grm = A10428Td_grm ;
            Z10429Td_anc = A10429Td_anc ;
            Z10430Td_pk = A10430Td_pk ;
            Z10431Td_pm = A10431Td_pm ;
            Z10432Td_Pro = A10432Td_Pro ;
            Z10586Td_Maquina = A10586Td_Maquina ;
            Z10587Td_Lote = A10587Td_Lote ;
            Z10763Td_EncCli = A10763Td_EncCli ;
            Z10774Td_obs = A10774Td_obs ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10398Td_NumInt = A10398Td_NumInt ;
         Z10399Td_PedCli = A10399Td_PedCli ;
         Z10400Td_Tipo = A10400Td_Tipo ;
         Z10401Td_Client = A10401Td_Client ;
         Z10402Td_Art = A10402Td_Art ;
         Z10403Td_Fec = A10403Td_Fec ;
         Z10404Td_ColN = A10404Td_ColN ;
         Z10405Td_ColNn = A10405Td_ColNn ;
         Z10406Td_Und = A10406Td_Und ;
         Z10407Td_Cant = A10407Td_Cant ;
         Z10408Td_Pzs = A10408Td_Pzs ;
         Z10409Td_Ref = A10409Td_Ref ;
         Z10410Td_stat = A10410Td_stat ;
         Z10411Td_Fect = A10411Td_Fect ;
         Z10424Td_ColNC = A10424Td_ColNC ;
         Z10425Td_ColNnC = A10425Td_ColNnC ;
         Z10426Td_AlbPro = A10426Td_AlbPro ;
         Z10427Td_Proc = A10427Td_Proc ;
         Z10428Td_grm = A10428Td_grm ;
         Z10429Td_anc = A10429Td_anc ;
         Z10430Td_pk = A10430Td_pk ;
         Z10431Td_pm = A10431Td_pm ;
         Z10432Td_Pro = A10432Td_Pro ;
         Z10586Td_Maquina = A10586Td_Maquina ;
         Z10587Td_Lote = A10587Td_Lote ;
         Z10763Td_EncCli = A10763Td_EncCli ;
         Z10774Td_obs = A10774Td_obs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTR0900" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01834 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01834_A407EmprNom[0] ;
      n407EmprNom = T01834_n407EmprNom[0] ;
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

   public void load1831407( )
   {
      /* Using cursor T01835 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10398Td_NumInt)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1407 = (short)(1) ;
         A407EmprNom = T01835_A407EmprNom[0] ;
         n407EmprNom = T01835_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10399Td_PedCli = T01835_A10399Td_PedCli[0] ;
         n10399Td_PedCli = T01835_n10399Td_PedCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10399Td_PedCli", A10399Td_PedCli);
         A10400Td_Tipo = T01835_A10400Td_Tipo[0] ;
         n10400Td_Tipo = T01835_n10400Td_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10400Td_Tipo", A10400Td_Tipo);
         A10401Td_Client = T01835_A10401Td_Client[0] ;
         n10401Td_Client = T01835_n10401Td_Client[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10401Td_Client", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10401Td_Client), 6, 0));
         A10402Td_Art = T01835_A10402Td_Art[0] ;
         n10402Td_Art = T01835_n10402Td_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10402Td_Art", A10402Td_Art);
         A10403Td_Fec = T01835_A10403Td_Fec[0] ;
         n10403Td_Fec = T01835_n10403Td_Fec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10403Td_Fec", localUtil.format(A10403Td_Fec, "99/99/99"));
         A10404Td_ColN = T01835_A10404Td_ColN[0] ;
         n10404Td_ColN = T01835_n10404Td_ColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10404Td_ColN", A10404Td_ColN);
         A10405Td_ColNn = T01835_A10405Td_ColNn[0] ;
         n10405Td_ColNn = T01835_n10405Td_ColNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10405Td_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10405Td_ColNn), 6, 0));
         A10406Td_Und = T01835_A10406Td_Und[0] ;
         n10406Td_Und = T01835_n10406Td_Und[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10406Td_Und", A10406Td_Und);
         A10407Td_Cant = T01835_A10407Td_Cant[0] ;
         n10407Td_Cant = T01835_n10407Td_Cant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10407Td_Cant", GXutil.ltrimstr( A10407Td_Cant, 9, 2));
         A10408Td_Pzs = T01835_A10408Td_Pzs[0] ;
         n10408Td_Pzs = T01835_n10408Td_Pzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10408Td_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10408Td_Pzs), 4, 0));
         A10409Td_Ref = T01835_A10409Td_Ref[0] ;
         n10409Td_Ref = T01835_n10409Td_Ref[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10409Td_Ref", A10409Td_Ref);
         A10410Td_stat = T01835_A10410Td_stat[0] ;
         n10410Td_stat = T01835_n10410Td_stat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10410Td_stat", GXutil.str( A10410Td_stat, 1, 0));
         A10411Td_Fect = T01835_A10411Td_Fect[0] ;
         n10411Td_Fect = T01835_n10411Td_Fect[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10411Td_Fect", localUtil.ttoc( A10411Td_Fect, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10424Td_ColNC = T01835_A10424Td_ColNC[0] ;
         n10424Td_ColNC = T01835_n10424Td_ColNC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10424Td_ColNC", A10424Td_ColNC);
         A10425Td_ColNnC = T01835_A10425Td_ColNnC[0] ;
         n10425Td_ColNnC = T01835_n10425Td_ColNnC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10425Td_ColNnC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10425Td_ColNnC), 6, 0));
         A10426Td_AlbPro = T01835_A10426Td_AlbPro[0] ;
         n10426Td_AlbPro = T01835_n10426Td_AlbPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10426Td_AlbPro", A10426Td_AlbPro);
         A10427Td_Proc = T01835_A10427Td_Proc[0] ;
         n10427Td_Proc = T01835_n10427Td_Proc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10427Td_Proc", A10427Td_Proc);
         A10428Td_grm = T01835_A10428Td_grm[0] ;
         n10428Td_grm = T01835_n10428Td_grm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10428Td_grm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10428Td_grm), 4, 0));
         A10429Td_anc = T01835_A10429Td_anc[0] ;
         n10429Td_anc = T01835_n10429Td_anc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10429Td_anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10429Td_anc), 3, 0));
         A10430Td_pk = T01835_A10430Td_pk[0] ;
         n10430Td_pk = T01835_n10430Td_pk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10430Td_pk", GXutil.ltrimstr( A10430Td_pk, 13, 5));
         A10431Td_pm = T01835_A10431Td_pm[0] ;
         n10431Td_pm = T01835_n10431Td_pm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10431Td_pm", GXutil.ltrimstr( A10431Td_pm, 13, 5));
         A10432Td_Pro = T01835_A10432Td_Pro[0] ;
         n10432Td_Pro = T01835_n10432Td_Pro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10432Td_Pro", A10432Td_Pro);
         A10586Td_Maquina = T01835_A10586Td_Maquina[0] ;
         n10586Td_Maquina = T01835_n10586Td_Maquina[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10586Td_Maquina", A10586Td_Maquina);
         A10587Td_Lote = T01835_A10587Td_Lote[0] ;
         n10587Td_Lote = T01835_n10587Td_Lote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10587Td_Lote", A10587Td_Lote);
         A10763Td_EncCli = T01835_A10763Td_EncCli[0] ;
         n10763Td_EncCli = T01835_n10763Td_EncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10763Td_EncCli", A10763Td_EncCli);
         A10774Td_obs = T01835_A10774Td_obs[0] ;
         n10774Td_obs = T01835_n10774Td_obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10774Td_obs", A10774Td_obs);
         zm1831407( -1) ;
      }
      pr_default.close(3);
      onLoadActions1831407( ) ;
   }

   public void onLoadActions1831407( )
   {
   }

   public void checkExtendedTable1831407( )
   {
      nIsDirty_1407 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1831407( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1831407( )
   {
      /* Using cursor T01836 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A10398Td_NumInt)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1407 = (short)(1) ;
      }
      else
      {
         RcdFound1407 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01833 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10398Td_NumInt)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01833_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1831407( 1) ;
         RcdFound1407 = (short)(1) ;
         A10398Td_NumInt = T01833_A10398Td_NumInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
         A10399Td_PedCli = T01833_A10399Td_PedCli[0] ;
         n10399Td_PedCli = T01833_n10399Td_PedCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10399Td_PedCli", A10399Td_PedCli);
         A10400Td_Tipo = T01833_A10400Td_Tipo[0] ;
         n10400Td_Tipo = T01833_n10400Td_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10400Td_Tipo", A10400Td_Tipo);
         A10401Td_Client = T01833_A10401Td_Client[0] ;
         n10401Td_Client = T01833_n10401Td_Client[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10401Td_Client", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10401Td_Client), 6, 0));
         A10402Td_Art = T01833_A10402Td_Art[0] ;
         n10402Td_Art = T01833_n10402Td_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10402Td_Art", A10402Td_Art);
         A10403Td_Fec = T01833_A10403Td_Fec[0] ;
         n10403Td_Fec = T01833_n10403Td_Fec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10403Td_Fec", localUtil.format(A10403Td_Fec, "99/99/99"));
         A10404Td_ColN = T01833_A10404Td_ColN[0] ;
         n10404Td_ColN = T01833_n10404Td_ColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10404Td_ColN", A10404Td_ColN);
         A10405Td_ColNn = T01833_A10405Td_ColNn[0] ;
         n10405Td_ColNn = T01833_n10405Td_ColNn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10405Td_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10405Td_ColNn), 6, 0));
         A10406Td_Und = T01833_A10406Td_Und[0] ;
         n10406Td_Und = T01833_n10406Td_Und[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10406Td_Und", A10406Td_Und);
         A10407Td_Cant = T01833_A10407Td_Cant[0] ;
         n10407Td_Cant = T01833_n10407Td_Cant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10407Td_Cant", GXutil.ltrimstr( A10407Td_Cant, 9, 2));
         A10408Td_Pzs = T01833_A10408Td_Pzs[0] ;
         n10408Td_Pzs = T01833_n10408Td_Pzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10408Td_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10408Td_Pzs), 4, 0));
         A10409Td_Ref = T01833_A10409Td_Ref[0] ;
         n10409Td_Ref = T01833_n10409Td_Ref[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10409Td_Ref", A10409Td_Ref);
         A10410Td_stat = T01833_A10410Td_stat[0] ;
         n10410Td_stat = T01833_n10410Td_stat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10410Td_stat", GXutil.str( A10410Td_stat, 1, 0));
         A10411Td_Fect = T01833_A10411Td_Fect[0] ;
         n10411Td_Fect = T01833_n10411Td_Fect[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10411Td_Fect", localUtil.ttoc( A10411Td_Fect, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10424Td_ColNC = T01833_A10424Td_ColNC[0] ;
         n10424Td_ColNC = T01833_n10424Td_ColNC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10424Td_ColNC", A10424Td_ColNC);
         A10425Td_ColNnC = T01833_A10425Td_ColNnC[0] ;
         n10425Td_ColNnC = T01833_n10425Td_ColNnC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10425Td_ColNnC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10425Td_ColNnC), 6, 0));
         A10426Td_AlbPro = T01833_A10426Td_AlbPro[0] ;
         n10426Td_AlbPro = T01833_n10426Td_AlbPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10426Td_AlbPro", A10426Td_AlbPro);
         A10427Td_Proc = T01833_A10427Td_Proc[0] ;
         n10427Td_Proc = T01833_n10427Td_Proc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10427Td_Proc", A10427Td_Proc);
         A10428Td_grm = T01833_A10428Td_grm[0] ;
         n10428Td_grm = T01833_n10428Td_grm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10428Td_grm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10428Td_grm), 4, 0));
         A10429Td_anc = T01833_A10429Td_anc[0] ;
         n10429Td_anc = T01833_n10429Td_anc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10429Td_anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10429Td_anc), 3, 0));
         A10430Td_pk = T01833_A10430Td_pk[0] ;
         n10430Td_pk = T01833_n10430Td_pk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10430Td_pk", GXutil.ltrimstr( A10430Td_pk, 13, 5));
         A10431Td_pm = T01833_A10431Td_pm[0] ;
         n10431Td_pm = T01833_n10431Td_pm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10431Td_pm", GXutil.ltrimstr( A10431Td_pm, 13, 5));
         A10432Td_Pro = T01833_A10432Td_Pro[0] ;
         n10432Td_Pro = T01833_n10432Td_Pro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10432Td_Pro", A10432Td_Pro);
         A10586Td_Maquina = T01833_A10586Td_Maquina[0] ;
         n10586Td_Maquina = T01833_n10586Td_Maquina[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10586Td_Maquina", A10586Td_Maquina);
         A10587Td_Lote = T01833_A10587Td_Lote[0] ;
         n10587Td_Lote = T01833_n10587Td_Lote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10587Td_Lote", A10587Td_Lote);
         A10763Td_EncCli = T01833_A10763Td_EncCli[0] ;
         n10763Td_EncCli = T01833_n10763Td_EncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10763Td_EncCli", A10763Td_EncCli);
         A10774Td_obs = T01833_A10774Td_obs[0] ;
         n10774Td_obs = T01833_n10774Td_obs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10774Td_obs", A10774Td_obs);
         Z396EmprCod = A396EmprCod ;
         Z10398Td_NumInt = A10398Td_NumInt ;
         sMode1407 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1831407( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1407 = (short)(0) ;
            initializeNonKey1831407( ) ;
         }
         Gx_mode = sMode1407 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1407 = (short)(0) ;
         initializeNonKey1831407( ) ;
         sMode1407 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1407 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1831407( ) ;
      if ( RcdFound1407 == 0 )
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
      RcdFound1407 = (short)(0) ;
      /* Using cursor T01837 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A10398Td_NumInt), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01837_A10398Td_NumInt[0] < A10398Td_NumInt ) ) && ( GXutil.strcmp(T01837_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01837_A10398Td_NumInt[0] > A10398Td_NumInt ) ) && ( GXutil.strcmp(T01837_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10398Td_NumInt = T01837_A10398Td_NumInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
            RcdFound1407 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1407 = (short)(0) ;
      /* Using cursor T01838 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A10398Td_NumInt), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01838_A10398Td_NumInt[0] > A10398Td_NumInt ) ) && ( GXutil.strcmp(T01838_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01838_A10398Td_NumInt[0] < A10398Td_NumInt ) ) && ( GXutil.strcmp(T01838_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10398Td_NumInt = T01838_A10398Td_NumInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
            RcdFound1407 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1831407( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTd_NumInt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1831407( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1407 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10398Td_NumInt != Z10398Td_NumInt ) )
            {
               A10398Td_NumInt = Z10398Td_NumInt ;
               httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTd_NumInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1831407( ) ;
               GX_FocusControl = edtTd_NumInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10398Td_NumInt != Z10398Td_NumInt ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTd_NumInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1831407( ) ;
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
                  GX_FocusControl = edtTd_NumInt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1831407( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10398Td_NumInt != Z10398Td_NumInt ) )
      {
         A10398Td_NumInt = Z10398Td_NumInt ;
         httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTd_NumInt_Internalname ;
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
      getKey1831407( ) ;
      if ( RcdFound1407 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10398Td_NumInt != Z10398Td_NumInt ) )
         {
            A10398Td_NumInt = Z10398Td_NumInt ;
            httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10398Td_NumInt != Z10398Td_NumInt ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0900");
      GX_FocusControl = edtTd_PedCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1830( ) ;
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
      if ( RcdFound1407 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTd_PedCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1831407( ) ;
      if ( RcdFound1407 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTd_PedCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1831407( ) ;
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
      if ( RcdFound1407 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTd_PedCli_Internalname ;
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
      if ( RcdFound1407 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTd_PedCli_Internalname ;
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
      scanStart1831407( ) ;
      if ( RcdFound1407 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1407 != 0 )
         {
            scanNext1831407( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTd_PedCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1831407( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1831407( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01832 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10398Td_NumInt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0900"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10399Td_PedCli, T01832_A10399Td_PedCli[0]) != 0 ) || ( GXutil.strcmp(Z10400Td_Tipo, T01832_A10400Td_Tipo[0]) != 0 ) || ( Z10401Td_Client != T01832_A10401Td_Client[0] ) || ( GXutil.strcmp(Z10402Td_Art, T01832_A10402Td_Art[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10403Td_Fec), GXutil.resetTime(T01832_A10403Td_Fec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10404Td_ColN, T01832_A10404Td_ColN[0]) != 0 ) || ( Z10405Td_ColNn != T01832_A10405Td_ColNn[0] ) || ( GXutil.strcmp(Z10406Td_Und, T01832_A10406Td_Und[0]) != 0 ) || ( DecimalUtil.compareTo(Z10407Td_Cant, T01832_A10407Td_Cant[0]) != 0 ) || ( Z10408Td_Pzs != T01832_A10408Td_Pzs[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10409Td_Ref, T01832_A10409Td_Ref[0]) != 0 ) || ( Z10410Td_stat != T01832_A10410Td_stat[0] ) || !( GXutil.dateCompare(Z10411Td_Fect, T01832_A10411Td_Fect[0]) ) || ( GXutil.strcmp(Z10424Td_ColNC, T01832_A10424Td_ColNC[0]) != 0 ) || ( Z10425Td_ColNnC != T01832_A10425Td_ColNnC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10426Td_AlbPro, T01832_A10426Td_AlbPro[0]) != 0 ) || ( GXutil.strcmp(Z10427Td_Proc, T01832_A10427Td_Proc[0]) != 0 ) || ( Z10428Td_grm != T01832_A10428Td_grm[0] ) || ( Z10429Td_anc != T01832_A10429Td_anc[0] ) || ( DecimalUtil.compareTo(Z10430Td_pk, T01832_A10430Td_pk[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10431Td_pm, T01832_A10431Td_pm[0]) != 0 ) || ( GXutil.strcmp(Z10432Td_Pro, T01832_A10432Td_Pro[0]) != 0 ) || ( GXutil.strcmp(Z10586Td_Maquina, T01832_A10586Td_Maquina[0]) != 0 ) || ( GXutil.strcmp(Z10587Td_Lote, T01832_A10587Td_Lote[0]) != 0 ) || ( GXutil.strcmp(Z10763Td_EncCli, T01832_A10763Td_EncCli[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10774Td_obs, T01832_A10774Td_obs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10399Td_PedCli, T01832_A10399Td_PedCli[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_PedCli");
               GXutil.writeLogRaw("Old: ",Z10399Td_PedCli);
               GXutil.writeLogRaw("Current: ",T01832_A10399Td_PedCli[0]);
            }
            if ( GXutil.strcmp(Z10400Td_Tipo, T01832_A10400Td_Tipo[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Tipo");
               GXutil.writeLogRaw("Old: ",Z10400Td_Tipo);
               GXutil.writeLogRaw("Current: ",T01832_A10400Td_Tipo[0]);
            }
            if ( Z10401Td_Client != T01832_A10401Td_Client[0] )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Client");
               GXutil.writeLogRaw("Old: ",Z10401Td_Client);
               GXutil.writeLogRaw("Current: ",T01832_A10401Td_Client[0]);
            }
            if ( GXutil.strcmp(Z10402Td_Art, T01832_A10402Td_Art[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Art");
               GXutil.writeLogRaw("Old: ",Z10402Td_Art);
               GXutil.writeLogRaw("Current: ",T01832_A10402Td_Art[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10403Td_Fec), GXutil.resetTime(T01832_A10403Td_Fec[0])) ) )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Fec");
               GXutil.writeLogRaw("Old: ",Z10403Td_Fec);
               GXutil.writeLogRaw("Current: ",T01832_A10403Td_Fec[0]);
            }
            if ( GXutil.strcmp(Z10404Td_ColN, T01832_A10404Td_ColN[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_ColN");
               GXutil.writeLogRaw("Old: ",Z10404Td_ColN);
               GXutil.writeLogRaw("Current: ",T01832_A10404Td_ColN[0]);
            }
            if ( Z10405Td_ColNn != T01832_A10405Td_ColNn[0] )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_ColNn");
               GXutil.writeLogRaw("Old: ",Z10405Td_ColNn);
               GXutil.writeLogRaw("Current: ",T01832_A10405Td_ColNn[0]);
            }
            if ( GXutil.strcmp(Z10406Td_Und, T01832_A10406Td_Und[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Und");
               GXutil.writeLogRaw("Old: ",Z10406Td_Und);
               GXutil.writeLogRaw("Current: ",T01832_A10406Td_Und[0]);
            }
            if ( DecimalUtil.compareTo(Z10407Td_Cant, T01832_A10407Td_Cant[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Cant");
               GXutil.writeLogRaw("Old: ",Z10407Td_Cant);
               GXutil.writeLogRaw("Current: ",T01832_A10407Td_Cant[0]);
            }
            if ( Z10408Td_Pzs != T01832_A10408Td_Pzs[0] )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Pzs");
               GXutil.writeLogRaw("Old: ",Z10408Td_Pzs);
               GXutil.writeLogRaw("Current: ",T01832_A10408Td_Pzs[0]);
            }
            if ( GXutil.strcmp(Z10409Td_Ref, T01832_A10409Td_Ref[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Ref");
               GXutil.writeLogRaw("Old: ",Z10409Td_Ref);
               GXutil.writeLogRaw("Current: ",T01832_A10409Td_Ref[0]);
            }
            if ( Z10410Td_stat != T01832_A10410Td_stat[0] )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_stat");
               GXutil.writeLogRaw("Old: ",Z10410Td_stat);
               GXutil.writeLogRaw("Current: ",T01832_A10410Td_stat[0]);
            }
            if ( !( GXutil.dateCompare(Z10411Td_Fect, T01832_A10411Td_Fect[0]) ) )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Fect");
               GXutil.writeLogRaw("Old: ",Z10411Td_Fect);
               GXutil.writeLogRaw("Current: ",T01832_A10411Td_Fect[0]);
            }
            if ( GXutil.strcmp(Z10424Td_ColNC, T01832_A10424Td_ColNC[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_ColNC");
               GXutil.writeLogRaw("Old: ",Z10424Td_ColNC);
               GXutil.writeLogRaw("Current: ",T01832_A10424Td_ColNC[0]);
            }
            if ( Z10425Td_ColNnC != T01832_A10425Td_ColNnC[0] )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_ColNnC");
               GXutil.writeLogRaw("Old: ",Z10425Td_ColNnC);
               GXutil.writeLogRaw("Current: ",T01832_A10425Td_ColNnC[0]);
            }
            if ( GXutil.strcmp(Z10426Td_AlbPro, T01832_A10426Td_AlbPro[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_AlbPro");
               GXutil.writeLogRaw("Old: ",Z10426Td_AlbPro);
               GXutil.writeLogRaw("Current: ",T01832_A10426Td_AlbPro[0]);
            }
            if ( GXutil.strcmp(Z10427Td_Proc, T01832_A10427Td_Proc[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Proc");
               GXutil.writeLogRaw("Old: ",Z10427Td_Proc);
               GXutil.writeLogRaw("Current: ",T01832_A10427Td_Proc[0]);
            }
            if ( Z10428Td_grm != T01832_A10428Td_grm[0] )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_grm");
               GXutil.writeLogRaw("Old: ",Z10428Td_grm);
               GXutil.writeLogRaw("Current: ",T01832_A10428Td_grm[0]);
            }
            if ( Z10429Td_anc != T01832_A10429Td_anc[0] )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_anc");
               GXutil.writeLogRaw("Old: ",Z10429Td_anc);
               GXutil.writeLogRaw("Current: ",T01832_A10429Td_anc[0]);
            }
            if ( DecimalUtil.compareTo(Z10430Td_pk, T01832_A10430Td_pk[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_pk");
               GXutil.writeLogRaw("Old: ",Z10430Td_pk);
               GXutil.writeLogRaw("Current: ",T01832_A10430Td_pk[0]);
            }
            if ( DecimalUtil.compareTo(Z10431Td_pm, T01832_A10431Td_pm[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_pm");
               GXutil.writeLogRaw("Old: ",Z10431Td_pm);
               GXutil.writeLogRaw("Current: ",T01832_A10431Td_pm[0]);
            }
            if ( GXutil.strcmp(Z10432Td_Pro, T01832_A10432Td_Pro[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Pro");
               GXutil.writeLogRaw("Old: ",Z10432Td_Pro);
               GXutil.writeLogRaw("Current: ",T01832_A10432Td_Pro[0]);
            }
            if ( GXutil.strcmp(Z10586Td_Maquina, T01832_A10586Td_Maquina[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Maquina");
               GXutil.writeLogRaw("Old: ",Z10586Td_Maquina);
               GXutil.writeLogRaw("Current: ",T01832_A10586Td_Maquina[0]);
            }
            if ( GXutil.strcmp(Z10587Td_Lote, T01832_A10587Td_Lote[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_Lote");
               GXutil.writeLogRaw("Old: ",Z10587Td_Lote);
               GXutil.writeLogRaw("Current: ",T01832_A10587Td_Lote[0]);
            }
            if ( GXutil.strcmp(Z10763Td_EncCli, T01832_A10763Td_EncCli[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_EncCli");
               GXutil.writeLogRaw("Old: ",Z10763Td_EncCli);
               GXutil.writeLogRaw("Current: ",T01832_A10763Td_EncCli[0]);
            }
            if ( GXutil.strcmp(Z10774Td_obs, T01832_A10774Td_obs[0]) != 0 )
            {
               GXutil.writeLogln("ttr0900:[seudo value changed for attri]"+"Td_obs");
               GXutil.writeLogRaw("Old: ",Z10774Td_obs);
               GXutil.writeLogRaw("Current: ",T01832_A10774Td_obs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0900"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1831407( )
   {
      beforeValidate1831407( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1831407( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1831407( 0) ;
         checkOptimisticConcurrency1831407( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1831407( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1831407( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01839 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A10398Td_NumInt), Boolean.valueOf(n10399Td_PedCli), A10399Td_PedCli, Boolean.valueOf(n10400Td_Tipo), A10400Td_Tipo, Boolean.valueOf(n10401Td_Client), Integer.valueOf(A10401Td_Client), Boolean.valueOf(n10402Td_Art), A10402Td_Art, Boolean.valueOf(n10403Td_Fec), A10403Td_Fec, Boolean.valueOf(n10404Td_ColN), A10404Td_ColN, Boolean.valueOf(n10405Td_ColNn), Integer.valueOf(A10405Td_ColNn), Boolean.valueOf(n10406Td_Und), A10406Td_Und, Boolean.valueOf(n10407Td_Cant), A10407Td_Cant, Boolean.valueOf(n10408Td_Pzs), Short.valueOf(A10408Td_Pzs), Boolean.valueOf(n10409Td_Ref), A10409Td_Ref, Boolean.valueOf(n10410Td_stat), Byte.valueOf(A10410Td_stat), Boolean.valueOf(n10411Td_Fect), A10411Td_Fect, Boolean.valueOf(n10424Td_ColNC), A10424Td_ColNC, Boolean.valueOf(n10425Td_ColNnC), Integer.valueOf(A10425Td_ColNnC), Boolean.valueOf(n10426Td_AlbPro), A10426Td_AlbPro, Boolean.valueOf(n10427Td_Proc), A10427Td_Proc, Boolean.valueOf(n10428Td_grm), Short.valueOf(A10428Td_grm), Boolean.valueOf(n10429Td_anc), Short.valueOf(A10429Td_anc), Boolean.valueOf(n10430Td_pk), A10430Td_pk, Boolean.valueOf(n10431Td_pm), A10431Td_pm, Boolean.valueOf(n10432Td_Pro), A10432Td_Pro, Boolean.valueOf(n10586Td_Maquina), A10586Td_Maquina, Boolean.valueOf(n10587Td_Lote), A10587Td_Lote, Boolean.valueOf(n10763Td_EncCli), A10763Td_EncCli, Boolean.valueOf(n10774Td_obs), A10774Td_obs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0900");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption1830( ) ;
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
            load1831407( ) ;
         }
         endLevel1831407( ) ;
      }
      closeExtendedTableCursors1831407( ) ;
   }

   public void update1831407( )
   {
      beforeValidate1831407( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1831407( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1831407( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1831407( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1831407( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018310 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n10399Td_PedCli), A10399Td_PedCli, Boolean.valueOf(n10400Td_Tipo), A10400Td_Tipo, Boolean.valueOf(n10401Td_Client), Integer.valueOf(A10401Td_Client), Boolean.valueOf(n10402Td_Art), A10402Td_Art, Boolean.valueOf(n10403Td_Fec), A10403Td_Fec, Boolean.valueOf(n10404Td_ColN), A10404Td_ColN, Boolean.valueOf(n10405Td_ColNn), Integer.valueOf(A10405Td_ColNn), Boolean.valueOf(n10406Td_Und), A10406Td_Und, Boolean.valueOf(n10407Td_Cant), A10407Td_Cant, Boolean.valueOf(n10408Td_Pzs), Short.valueOf(A10408Td_Pzs), Boolean.valueOf(n10409Td_Ref), A10409Td_Ref, Boolean.valueOf(n10410Td_stat), Byte.valueOf(A10410Td_stat), Boolean.valueOf(n10411Td_Fect), A10411Td_Fect, Boolean.valueOf(n10424Td_ColNC), A10424Td_ColNC, Boolean.valueOf(n10425Td_ColNnC), Integer.valueOf(A10425Td_ColNnC), Boolean.valueOf(n10426Td_AlbPro), A10426Td_AlbPro, Boolean.valueOf(n10427Td_Proc), A10427Td_Proc, Boolean.valueOf(n10428Td_grm), Short.valueOf(A10428Td_grm), Boolean.valueOf(n10429Td_anc), Short.valueOf(A10429Td_anc), Boolean.valueOf(n10430Td_pk), A10430Td_pk, Boolean.valueOf(n10431Td_pm), A10431Td_pm, Boolean.valueOf(n10432Td_Pro), A10432Td_Pro, Boolean.valueOf(n10586Td_Maquina), A10586Td_Maquina, Boolean.valueOf(n10587Td_Lote), A10587Td_Lote, Boolean.valueOf(n10763Td_EncCli), A10763Td_EncCli, Boolean.valueOf(n10774Td_obs), A10774Td_obs, A396EmprCod, Integer.valueOf(A10398Td_NumInt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0900");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0900"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1831407( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1830( ) ;
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
         endLevel1831407( ) ;
      }
      closeExtendedTableCursors1831407( ) ;
   }

   public void deferredUpdate1831407( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1831407( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1831407( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1831407( ) ;
         afterConfirm1831407( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1831407( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018311 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A10398Td_NumInt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0900");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1407 == 0 )
                     {
                        initAll1831407( ) ;
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
                     resetCaption1830( ) ;
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
      sMode1407 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1831407( ) ;
      Gx_mode = sMode1407 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1831407( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1831407( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1831407( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr0900");
         if ( AnyError == 0 )
         {
            confirmValues1830( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0900");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1831407( )
   {
      /* Scan By routine */
      /* Using cursor T018312 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1407 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1407 = (short)(1) ;
         A10398Td_NumInt = T018312_A10398Td_NumInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1831407( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1407 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1407 = (short)(1) ;
         A10398Td_NumInt = T018312_A10398Td_NumInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
      }
   }

   public void scanEnd1831407( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1831407( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1831407( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1831407( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1831407( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1831407( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1831407( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1831407( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTd_NumInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_NumInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_NumInt_Enabled), 5, 0), true);
      edtTd_PedCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_PedCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_PedCli_Enabled), 5, 0), true);
      edtTd_Tipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Tipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Tipo_Enabled), 5, 0), true);
      edtTd_Client_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Client_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Client_Enabled), 5, 0), true);
      edtTd_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Art_Enabled), 5, 0), true);
      edtTd_Fec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Fec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Fec_Enabled), 5, 0), true);
      edtTd_ColN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_ColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_ColN_Enabled), 5, 0), true);
      edtTd_ColNn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_ColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_ColNn_Enabled), 5, 0), true);
      edtTd_Und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Und_Enabled), 5, 0), true);
      edtTd_Cant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Cant_Enabled), 5, 0), true);
      edtTd_Pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Pzs_Enabled), 5, 0), true);
      edtTd_Ref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Ref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Ref_Enabled), 5, 0), true);
      edtTd_stat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_stat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_stat_Enabled), 5, 0), true);
      edtTd_Fect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Fect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Fect_Enabled), 5, 0), true);
      edtTd_ColNC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_ColNC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_ColNC_Enabled), 5, 0), true);
      edtTd_ColNnC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_ColNnC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_ColNnC_Enabled), 5, 0), true);
      edtTd_AlbPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_AlbPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_AlbPro_Enabled), 5, 0), true);
      edtTd_Proc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Proc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Proc_Enabled), 5, 0), true);
      edtTd_grm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_grm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_grm_Enabled), 5, 0), true);
      edtTd_anc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_anc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_anc_Enabled), 5, 0), true);
      edtTd_pk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_pk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_pk_Enabled), 5, 0), true);
      edtTd_pm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_pm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_pm_Enabled), 5, 0), true);
      edtTd_Pro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Pro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Pro_Enabled), 5, 0), true);
      edtTd_Maquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Maquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Maquina_Enabled), 5, 0), true);
      edtTd_Lote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_Lote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_Lote_Enabled), 5, 0), true);
      edtTd_EncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_EncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_EncCli_Enabled), 5, 0), true);
      edtTd_obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTd_obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTd_obs_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1831407( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1830( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr0900", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10398Td_NumInt", GXutil.ltrim( localUtil.ntoc( Z10398Td_NumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10399Td_PedCli", GXutil.rtrim( Z10399Td_PedCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10400Td_Tipo", GXutil.rtrim( Z10400Td_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10401Td_Client", GXutil.ltrim( localUtil.ntoc( Z10401Td_Client, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10402Td_Art", GXutil.rtrim( Z10402Td_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10403Td_Fec", localUtil.dtoc( Z10403Td_Fec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10404Td_ColN", GXutil.rtrim( Z10404Td_ColN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10405Td_ColNn", GXutil.ltrim( localUtil.ntoc( Z10405Td_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10406Td_Und", GXutil.rtrim( Z10406Td_Und));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10407Td_Cant", GXutil.ltrim( localUtil.ntoc( Z10407Td_Cant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10408Td_Pzs", GXutil.ltrim( localUtil.ntoc( Z10408Td_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10409Td_Ref", GXutil.rtrim( Z10409Td_Ref));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10410Td_stat", GXutil.ltrim( localUtil.ntoc( Z10410Td_stat, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10411Td_Fect", localUtil.ttoc( Z10411Td_Fect, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10424Td_ColNC", GXutil.rtrim( Z10424Td_ColNC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10425Td_ColNnC", GXutil.ltrim( localUtil.ntoc( Z10425Td_ColNnC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10426Td_AlbPro", GXutil.rtrim( Z10426Td_AlbPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10427Td_Proc", GXutil.rtrim( Z10427Td_Proc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10428Td_grm", GXutil.ltrim( localUtil.ntoc( Z10428Td_grm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10429Td_anc", GXutil.ltrim( localUtil.ntoc( Z10429Td_anc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10430Td_pk", GXutil.ltrim( localUtil.ntoc( Z10430Td_pk, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10431Td_pm", GXutil.ltrim( localUtil.ntoc( Z10431Td_pm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10432Td_Pro", GXutil.rtrim( Z10432Td_Pro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10586Td_Maquina", GXutil.rtrim( Z10586Td_Maquina));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10587Td_Lote", GXutil.rtrim( Z10587Td_Lote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10763Td_EncCli", GXutil.rtrim( Z10763Td_EncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10774Td_obs", Z10774Td_obs);
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
      return formatLink("app.ttr0900", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTR0900" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA PEDIDOS CLIENTES", "") ;
   }

   public void initializeNonKey1831407( )
   {
      A10399Td_PedCli = "" ;
      n10399Td_PedCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10399Td_PedCli", A10399Td_PedCli);
      A10400Td_Tipo = "" ;
      n10400Td_Tipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10400Td_Tipo", A10400Td_Tipo);
      A10401Td_Client = 0 ;
      n10401Td_Client = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10401Td_Client", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10401Td_Client), 6, 0));
      A10402Td_Art = "" ;
      n10402Td_Art = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10402Td_Art", A10402Td_Art);
      A10403Td_Fec = GXutil.nullDate() ;
      n10403Td_Fec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10403Td_Fec", localUtil.format(A10403Td_Fec, "99/99/99"));
      A10404Td_ColN = "" ;
      n10404Td_ColN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10404Td_ColN", A10404Td_ColN);
      A10405Td_ColNn = 0 ;
      n10405Td_ColNn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10405Td_ColNn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10405Td_ColNn), 6, 0));
      A10406Td_Und = "" ;
      n10406Td_Und = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10406Td_Und", A10406Td_Und);
      A10407Td_Cant = DecimalUtil.ZERO ;
      n10407Td_Cant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10407Td_Cant", GXutil.ltrimstr( A10407Td_Cant, 9, 2));
      A10408Td_Pzs = (short)(0) ;
      n10408Td_Pzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10408Td_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10408Td_Pzs), 4, 0));
      A10409Td_Ref = "" ;
      n10409Td_Ref = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10409Td_Ref", A10409Td_Ref);
      A10410Td_stat = (byte)(0) ;
      n10410Td_stat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10410Td_stat", GXutil.str( A10410Td_stat, 1, 0));
      A10411Td_Fect = GXutil.resetTime( GXutil.nullDate() );
      n10411Td_Fect = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10411Td_Fect", localUtil.ttoc( A10411Td_Fect, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10424Td_ColNC = "" ;
      n10424Td_ColNC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10424Td_ColNC", A10424Td_ColNC);
      A10425Td_ColNnC = 0 ;
      n10425Td_ColNnC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10425Td_ColNnC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10425Td_ColNnC), 6, 0));
      A10426Td_AlbPro = "" ;
      n10426Td_AlbPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10426Td_AlbPro", A10426Td_AlbPro);
      A10427Td_Proc = "" ;
      n10427Td_Proc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10427Td_Proc", A10427Td_Proc);
      A10428Td_grm = (short)(0) ;
      n10428Td_grm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10428Td_grm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10428Td_grm), 4, 0));
      A10429Td_anc = (short)(0) ;
      n10429Td_anc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10429Td_anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10429Td_anc), 3, 0));
      A10430Td_pk = DecimalUtil.ZERO ;
      n10430Td_pk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10430Td_pk", GXutil.ltrimstr( A10430Td_pk, 13, 5));
      A10431Td_pm = DecimalUtil.ZERO ;
      n10431Td_pm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10431Td_pm", GXutil.ltrimstr( A10431Td_pm, 13, 5));
      A10432Td_Pro = "" ;
      n10432Td_Pro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10432Td_Pro", A10432Td_Pro);
      A10586Td_Maquina = "" ;
      n10586Td_Maquina = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10586Td_Maquina", A10586Td_Maquina);
      A10587Td_Lote = "" ;
      n10587Td_Lote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10587Td_Lote", A10587Td_Lote);
      A10763Td_EncCli = "" ;
      n10763Td_EncCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10763Td_EncCli", A10763Td_EncCli);
      A10774Td_obs = "" ;
      n10774Td_obs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10774Td_obs", A10774Td_obs);
      Z10399Td_PedCli = "" ;
      Z10400Td_Tipo = "" ;
      Z10401Td_Client = 0 ;
      Z10402Td_Art = "" ;
      Z10403Td_Fec = GXutil.nullDate() ;
      Z10404Td_ColN = "" ;
      Z10405Td_ColNn = 0 ;
      Z10406Td_Und = "" ;
      Z10407Td_Cant = DecimalUtil.ZERO ;
      Z10408Td_Pzs = (short)(0) ;
      Z10409Td_Ref = "" ;
      Z10410Td_stat = (byte)(0) ;
      Z10411Td_Fect = GXutil.resetTime( GXutil.nullDate() );
      Z10424Td_ColNC = "" ;
      Z10425Td_ColNnC = 0 ;
      Z10426Td_AlbPro = "" ;
      Z10427Td_Proc = "" ;
      Z10428Td_grm = (short)(0) ;
      Z10429Td_anc = (short)(0) ;
      Z10430Td_pk = DecimalUtil.ZERO ;
      Z10431Td_pm = DecimalUtil.ZERO ;
      Z10432Td_Pro = "" ;
      Z10586Td_Maquina = "" ;
      Z10587Td_Lote = "" ;
      Z10763Td_EncCli = "" ;
      Z10774Td_obs = "" ;
   }

   public void initAll1831407( )
   {
      A10398Td_NumInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10398Td_NumInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10398Td_NumInt), 8, 0));
      initializeNonKey1831407( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241553123", true, true);
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
      httpContext.AddJavascriptSource("ttr0900.js", "?20268241553124", false, true);
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
      edtTd_NumInt_Internalname = "TD_NUMINT" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTd_PedCli_Internalname = "TD_PEDCLI" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTd_Tipo_Internalname = "TD_TIPO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTd_Client_Internalname = "TD_CLIENT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTd_Art_Internalname = "TD_ART" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTd_Fec_Internalname = "TD_FEC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTd_ColN_Internalname = "TD_COLN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTd_ColNn_Internalname = "TD_COLNN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtTd_Und_Internalname = "TD_UND" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTd_Cant_Internalname = "TD_CANT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtTd_Pzs_Internalname = "TD_PZS" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtTd_Ref_Internalname = "TD_REF" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtTd_stat_Internalname = "TD_STAT" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtTd_Fect_Internalname = "TD_FECT" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtTd_ColNC_Internalname = "TD_COLNC" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtTd_ColNnC_Internalname = "TD_COLNNC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtTd_AlbPro_Internalname = "TD_ALBPRO" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtTd_Proc_Internalname = "TD_PROC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtTd_grm_Internalname = "TD_GRM" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtTd_anc_Internalname = "TD_ANC" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtTd_pk_Internalname = "TD_PK" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtTd_pm_Internalname = "TD_PM" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtTd_Pro_Internalname = "TD_PRO" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtTd_Maquina_Internalname = "TD_MAQUINA" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtTd_Lote_Internalname = "TD_LOTE" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtTd_EncCli_Internalname = "TD_ENCCLI" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtTd_obs_Internalname = "TD_OBS" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA PEDIDOS CLIENTES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTd_obs_Backcolor = (int)(0xFFFFFF) ;
      edtTd_obs_Enabled = 1 ;
      edtTd_EncCli_Jsonclick = "" ;
      edtTd_EncCli_Backcolor = (int)(0xFFFFFF) ;
      edtTd_EncCli_Enabled = 1 ;
      edtTd_Lote_Jsonclick = "" ;
      edtTd_Lote_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Lote_Enabled = 1 ;
      edtTd_Maquina_Jsonclick = "" ;
      edtTd_Maquina_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Maquina_Enabled = 1 ;
      edtTd_Pro_Jsonclick = "" ;
      edtTd_Pro_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Pro_Enabled = 1 ;
      edtTd_pm_Jsonclick = "" ;
      edtTd_pm_Backcolor = (int)(0xFFFFFF) ;
      edtTd_pm_Enabled = 1 ;
      edtTd_pk_Jsonclick = "" ;
      edtTd_pk_Backcolor = (int)(0xFFFFFF) ;
      edtTd_pk_Enabled = 1 ;
      edtTd_anc_Jsonclick = "" ;
      edtTd_anc_Backcolor = (int)(0xFFFFFF) ;
      edtTd_anc_Enabled = 1 ;
      edtTd_grm_Jsonclick = "" ;
      edtTd_grm_Backcolor = (int)(0xFFFFFF) ;
      edtTd_grm_Enabled = 1 ;
      edtTd_Proc_Jsonclick = "" ;
      edtTd_Proc_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Proc_Enabled = 1 ;
      edtTd_AlbPro_Jsonclick = "" ;
      edtTd_AlbPro_Backcolor = (int)(0xFFFFFF) ;
      edtTd_AlbPro_Enabled = 1 ;
      edtTd_ColNnC_Jsonclick = "" ;
      edtTd_ColNnC_Backcolor = (int)(0xFFFFFF) ;
      edtTd_ColNnC_Enabled = 1 ;
      edtTd_ColNC_Jsonclick = "" ;
      edtTd_ColNC_Backcolor = (int)(0xFFFFFF) ;
      edtTd_ColNC_Enabled = 1 ;
      edtTd_Fect_Jsonclick = "" ;
      edtTd_Fect_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Fect_Enabled = 1 ;
      edtTd_stat_Jsonclick = "" ;
      edtTd_stat_Backcolor = (int)(0xFFFFFF) ;
      edtTd_stat_Enabled = 1 ;
      edtTd_Ref_Jsonclick = "" ;
      edtTd_Ref_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Ref_Enabled = 1 ;
      edtTd_Pzs_Jsonclick = "" ;
      edtTd_Pzs_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Pzs_Enabled = 1 ;
      edtTd_Cant_Jsonclick = "" ;
      edtTd_Cant_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Cant_Enabled = 1 ;
      edtTd_Und_Jsonclick = "" ;
      edtTd_Und_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Und_Enabled = 1 ;
      edtTd_ColNn_Jsonclick = "" ;
      edtTd_ColNn_Backcolor = (int)(0xFFFFFF) ;
      edtTd_ColNn_Enabled = 1 ;
      edtTd_ColN_Jsonclick = "" ;
      edtTd_ColN_Backcolor = (int)(0xFFFFFF) ;
      edtTd_ColN_Enabled = 1 ;
      edtTd_Fec_Jsonclick = "" ;
      edtTd_Fec_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Fec_Enabled = 1 ;
      edtTd_Art_Jsonclick = "" ;
      edtTd_Art_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Art_Enabled = 1 ;
      edtTd_Client_Jsonclick = "" ;
      edtTd_Client_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Client_Enabled = 1 ;
      edtTd_Tipo_Jsonclick = "" ;
      edtTd_Tipo_Backcolor = (int)(0xFFFFFF) ;
      edtTd_Tipo_Enabled = 1 ;
      edtTd_PedCli_Jsonclick = "" ;
      edtTd_PedCli_Backcolor = (int)(0xFFFFFF) ;
      edtTd_PedCli_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTd_NumInt_Jsonclick = "" ;
      edtTd_NumInt_Backcolor = (int)(0xFFFFFF) ;
      edtTd_NumInt_Enabled = 1 ;
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
      /* Using cursor T018313 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018313_A407EmprNom[0] ;
      n407EmprNom = T018313_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtTd_PedCli_Internalname ;
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

   public void valid_Td_numint( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10399Td_PedCli", GXutil.rtrim( A10399Td_PedCli));
      httpContext.ajax_rsp_assign_attri("", false, "A10400Td_Tipo", GXutil.rtrim( A10400Td_Tipo));
      httpContext.ajax_rsp_assign_attri("", false, "A10401Td_Client", GXutil.ltrim( localUtil.ntoc( A10401Td_Client, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10402Td_Art", GXutil.rtrim( A10402Td_Art));
      httpContext.ajax_rsp_assign_attri("", false, "A10403Td_Fec", localUtil.format(A10403Td_Fec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10404Td_ColN", GXutil.rtrim( A10404Td_ColN));
      httpContext.ajax_rsp_assign_attri("", false, "A10405Td_ColNn", GXutil.ltrim( localUtil.ntoc( A10405Td_ColNn, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10406Td_Und", GXutil.rtrim( A10406Td_Und));
      httpContext.ajax_rsp_assign_attri("", false, "A10407Td_Cant", GXutil.ltrim( localUtil.ntoc( A10407Td_Cant, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10408Td_Pzs", GXutil.ltrim( localUtil.ntoc( A10408Td_Pzs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10409Td_Ref", GXutil.rtrim( A10409Td_Ref));
      httpContext.ajax_rsp_assign_attri("", false, "A10410Td_stat", GXutil.ltrim( localUtil.ntoc( A10410Td_stat, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10411Td_Fect", localUtil.ttoc( A10411Td_Fect, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10424Td_ColNC", GXutil.rtrim( A10424Td_ColNC));
      httpContext.ajax_rsp_assign_attri("", false, "A10425Td_ColNnC", GXutil.ltrim( localUtil.ntoc( A10425Td_ColNnC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10426Td_AlbPro", GXutil.rtrim( A10426Td_AlbPro));
      httpContext.ajax_rsp_assign_attri("", false, "A10427Td_Proc", GXutil.rtrim( A10427Td_Proc));
      httpContext.ajax_rsp_assign_attri("", false, "A10428Td_grm", GXutil.ltrim( localUtil.ntoc( A10428Td_grm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10429Td_anc", GXutil.ltrim( localUtil.ntoc( A10429Td_anc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10430Td_pk", GXutil.ltrim( localUtil.ntoc( A10430Td_pk, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10431Td_pm", GXutil.ltrim( localUtil.ntoc( A10431Td_pm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10432Td_Pro", GXutil.rtrim( A10432Td_Pro));
      httpContext.ajax_rsp_assign_attri("", false, "A10586Td_Maquina", GXutil.rtrim( A10586Td_Maquina));
      httpContext.ajax_rsp_assign_attri("", false, "A10587Td_Lote", GXutil.rtrim( A10587Td_Lote));
      httpContext.ajax_rsp_assign_attri("", false, "A10763Td_EncCli", GXutil.rtrim( A10763Td_EncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A10774Td_obs", A10774Td_obs);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10398Td_NumInt", GXutil.ltrim( localUtil.ntoc( Z10398Td_NumInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10399Td_PedCli", GXutil.rtrim( Z10399Td_PedCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10400Td_Tipo", GXutil.rtrim( Z10400Td_Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10401Td_Client", GXutil.ltrim( localUtil.ntoc( Z10401Td_Client, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10402Td_Art", GXutil.rtrim( Z10402Td_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10403Td_Fec", localUtil.format(Z10403Td_Fec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10404Td_ColN", GXutil.rtrim( Z10404Td_ColN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10405Td_ColNn", GXutil.ltrim( localUtil.ntoc( Z10405Td_ColNn, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10406Td_Und", GXutil.rtrim( Z10406Td_Und));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10407Td_Cant", GXutil.ltrim( localUtil.ntoc( Z10407Td_Cant, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10408Td_Pzs", GXutil.ltrim( localUtil.ntoc( Z10408Td_Pzs, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10409Td_Ref", GXutil.rtrim( Z10409Td_Ref));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10410Td_stat", GXutil.ltrim( localUtil.ntoc( Z10410Td_stat, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10411Td_Fect", localUtil.ttoc( Z10411Td_Fect, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10424Td_ColNC", GXutil.rtrim( Z10424Td_ColNC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10425Td_ColNnC", GXutil.ltrim( localUtil.ntoc( Z10425Td_ColNnC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10426Td_AlbPro", GXutil.rtrim( Z10426Td_AlbPro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10427Td_Proc", GXutil.rtrim( Z10427Td_Proc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10428Td_grm", GXutil.ltrim( localUtil.ntoc( Z10428Td_grm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10429Td_anc", GXutil.ltrim( localUtil.ntoc( Z10429Td_anc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10430Td_pk", GXutil.ltrim( localUtil.ntoc( Z10430Td_pk, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10431Td_pm", GXutil.ltrim( localUtil.ntoc( Z10431Td_pm, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10432Td_Pro", GXutil.rtrim( Z10432Td_Pro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10586Td_Maquina", GXutil.rtrim( Z10586Td_Maquina));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10587Td_Lote", GXutil.rtrim( Z10587Td_Lote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10763Td_EncCli", GXutil.rtrim( Z10763Td_EncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10774Td_obs", Z10774Td_obs);
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
      setEventMetadata("VALID_TD_NUMINT","{handler:'valid_Td_numint',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10398Td_NumInt',fld:'TD_NUMINT',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TD_NUMINT",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10399Td_PedCli',fld:'TD_PEDCLI',pic:''},{av:'A10400Td_Tipo',fld:'TD_TIPO',pic:''},{av:'A10401Td_Client',fld:'TD_CLIENT',pic:'ZZZZZ9'},{av:'A10402Td_Art',fld:'TD_ART',pic:''},{av:'A10403Td_Fec',fld:'TD_FEC',pic:''},{av:'A10404Td_ColN',fld:'TD_COLN',pic:''},{av:'A10405Td_ColNn',fld:'TD_COLNN',pic:'ZZZZZ9'},{av:'A10406Td_Und',fld:'TD_UND',pic:'@!'},{av:'A10407Td_Cant',fld:'TD_CANT',pic:'ZZZZZ9.99'},{av:'A10408Td_Pzs',fld:'TD_PZS',pic:'ZZZ9'},{av:'A10409Td_Ref',fld:'TD_REF',pic:''},{av:'A10410Td_stat',fld:'TD_STAT',pic:'9'},{av:'A10411Td_Fect',fld:'TD_FECT',pic:'99/99/99 99:99'},{av:'A10424Td_ColNC',fld:'TD_COLNC',pic:''},{av:'A10425Td_ColNnC',fld:'TD_COLNNC',pic:'ZZZZZ9'},{av:'A10426Td_AlbPro',fld:'TD_ALBPRO',pic:''},{av:'A10427Td_Proc',fld:'TD_PROC',pic:''},{av:'A10428Td_grm',fld:'TD_GRM',pic:'ZZZ9'},{av:'A10429Td_anc',fld:'TD_ANC',pic:'ZZ9'},{av:'A10430Td_pk',fld:'TD_PK',pic:'ZZZZZZ9.999'},{av:'A10431Td_pm',fld:'TD_PM',pic:'ZZZZZZ9.999'},{av:'A10432Td_Pro',fld:'TD_PRO',pic:''},{av:'A10586Td_Maquina',fld:'TD_MAQUINA',pic:''},{av:'A10587Td_Lote',fld:'TD_LOTE',pic:''},{av:'A10763Td_EncCli',fld:'TD_ENCCLI',pic:''},{av:'A10774Td_obs',fld:'TD_OBS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10398Td_NumInt'},{av:'Z407EmprNom'},{av:'Z10399Td_PedCli'},{av:'Z10400Td_Tipo'},{av:'Z10401Td_Client'},{av:'Z10402Td_Art'},{av:'Z10403Td_Fec'},{av:'Z10404Td_ColN'},{av:'Z10405Td_ColNn'},{av:'Z10406Td_Und'},{av:'Z10407Td_Cant'},{av:'Z10408Td_Pzs'},{av:'Z10409Td_Ref'},{av:'Z10410Td_stat'},{av:'Z10411Td_Fect'},{av:'Z10424Td_ColNC'},{av:'Z10425Td_ColNnC'},{av:'Z10426Td_AlbPro'},{av:'Z10427Td_Proc'},{av:'Z10428Td_grm'},{av:'Z10429Td_anc'},{av:'Z10430Td_pk'},{av:'Z10431Td_pm'},{av:'Z10432Td_Pro'},{av:'Z10586Td_Maquina'},{av:'Z10587Td_Lote'},{av:'Z10763Td_EncCli'},{av:'Z10774Td_obs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10399Td_PedCli = "" ;
      Z10400Td_Tipo = "" ;
      Z10402Td_Art = "" ;
      Z10403Td_Fec = GXutil.nullDate() ;
      Z10404Td_ColN = "" ;
      Z10406Td_Und = "" ;
      Z10407Td_Cant = DecimalUtil.ZERO ;
      Z10409Td_Ref = "" ;
      Z10411Td_Fect = GXutil.resetTime( GXutil.nullDate() );
      Z10424Td_ColNC = "" ;
      Z10426Td_AlbPro = "" ;
      Z10427Td_Proc = "" ;
      Z10430Td_pk = DecimalUtil.ZERO ;
      Z10431Td_pm = DecimalUtil.ZERO ;
      Z10432Td_Pro = "" ;
      Z10586Td_Maquina = "" ;
      Z10587Td_Lote = "" ;
      Z10763Td_EncCli = "" ;
      Z10774Td_obs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10399Td_PedCli = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10400Td_Tipo = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10402Td_Art = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10403Td_Fec = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A10404Td_ColN = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10406Td_Und = "" ;
      lblTextblock12_Jsonclick = "" ;
      A10407Td_Cant = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A10409Td_Ref = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A10411Td_Fect = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock17_Jsonclick = "" ;
      A10424Td_ColNC = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A10426Td_AlbPro = "" ;
      lblTextblock20_Jsonclick = "" ;
      A10427Td_Proc = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A10430Td_pk = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A10431Td_pm = DecimalUtil.ZERO ;
      lblTextblock25_Jsonclick = "" ;
      A10432Td_Pro = "" ;
      lblTextblock26_Jsonclick = "" ;
      A10586Td_Maquina = "" ;
      lblTextblock27_Jsonclick = "" ;
      A10587Td_Lote = "" ;
      lblTextblock28_Jsonclick = "" ;
      A10763Td_EncCli = "" ;
      lblTextblock29_Jsonclick = "" ;
      A10774Td_obs = "" ;
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
      T01834_A407EmprNom = new String[] {""} ;
      T01834_n407EmprNom = new boolean[] {false} ;
      T01835_A10398Td_NumInt = new int[1] ;
      T01835_A407EmprNom = new String[] {""} ;
      T01835_n407EmprNom = new boolean[] {false} ;
      T01835_A10399Td_PedCli = new String[] {""} ;
      T01835_n10399Td_PedCli = new boolean[] {false} ;
      T01835_A10400Td_Tipo = new String[] {""} ;
      T01835_n10400Td_Tipo = new boolean[] {false} ;
      T01835_A10401Td_Client = new int[1] ;
      T01835_n10401Td_Client = new boolean[] {false} ;
      T01835_A10402Td_Art = new String[] {""} ;
      T01835_n10402Td_Art = new boolean[] {false} ;
      T01835_A10403Td_Fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01835_n10403Td_Fec = new boolean[] {false} ;
      T01835_A10404Td_ColN = new String[] {""} ;
      T01835_n10404Td_ColN = new boolean[] {false} ;
      T01835_A10405Td_ColNn = new int[1] ;
      T01835_n10405Td_ColNn = new boolean[] {false} ;
      T01835_A10406Td_Und = new String[] {""} ;
      T01835_n10406Td_Und = new boolean[] {false} ;
      T01835_A10407Td_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01835_n10407Td_Cant = new boolean[] {false} ;
      T01835_A10408Td_Pzs = new short[1] ;
      T01835_n10408Td_Pzs = new boolean[] {false} ;
      T01835_A10409Td_Ref = new String[] {""} ;
      T01835_n10409Td_Ref = new boolean[] {false} ;
      T01835_A10410Td_stat = new byte[1] ;
      T01835_n10410Td_stat = new boolean[] {false} ;
      T01835_A10411Td_Fect = new java.util.Date[] {GXutil.nullDate()} ;
      T01835_n10411Td_Fect = new boolean[] {false} ;
      T01835_A10424Td_ColNC = new String[] {""} ;
      T01835_n10424Td_ColNC = new boolean[] {false} ;
      T01835_A10425Td_ColNnC = new int[1] ;
      T01835_n10425Td_ColNnC = new boolean[] {false} ;
      T01835_A10426Td_AlbPro = new String[] {""} ;
      T01835_n10426Td_AlbPro = new boolean[] {false} ;
      T01835_A10427Td_Proc = new String[] {""} ;
      T01835_n10427Td_Proc = new boolean[] {false} ;
      T01835_A10428Td_grm = new short[1] ;
      T01835_n10428Td_grm = new boolean[] {false} ;
      T01835_A10429Td_anc = new short[1] ;
      T01835_n10429Td_anc = new boolean[] {false} ;
      T01835_A10430Td_pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01835_n10430Td_pk = new boolean[] {false} ;
      T01835_A10431Td_pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01835_n10431Td_pm = new boolean[] {false} ;
      T01835_A10432Td_Pro = new String[] {""} ;
      T01835_n10432Td_Pro = new boolean[] {false} ;
      T01835_A10586Td_Maquina = new String[] {""} ;
      T01835_n10586Td_Maquina = new boolean[] {false} ;
      T01835_A10587Td_Lote = new String[] {""} ;
      T01835_n10587Td_Lote = new boolean[] {false} ;
      T01835_A10763Td_EncCli = new String[] {""} ;
      T01835_n10763Td_EncCli = new boolean[] {false} ;
      T01835_A10774Td_obs = new String[] {""} ;
      T01835_n10774Td_obs = new boolean[] {false} ;
      T01835_A396EmprCod = new String[] {""} ;
      T01836_A396EmprCod = new String[] {""} ;
      T01836_A10398Td_NumInt = new int[1] ;
      T01833_A10398Td_NumInt = new int[1] ;
      T01833_A10399Td_PedCli = new String[] {""} ;
      T01833_n10399Td_PedCli = new boolean[] {false} ;
      T01833_A10400Td_Tipo = new String[] {""} ;
      T01833_n10400Td_Tipo = new boolean[] {false} ;
      T01833_A10401Td_Client = new int[1] ;
      T01833_n10401Td_Client = new boolean[] {false} ;
      T01833_A10402Td_Art = new String[] {""} ;
      T01833_n10402Td_Art = new boolean[] {false} ;
      T01833_A10403Td_Fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01833_n10403Td_Fec = new boolean[] {false} ;
      T01833_A10404Td_ColN = new String[] {""} ;
      T01833_n10404Td_ColN = new boolean[] {false} ;
      T01833_A10405Td_ColNn = new int[1] ;
      T01833_n10405Td_ColNn = new boolean[] {false} ;
      T01833_A10406Td_Und = new String[] {""} ;
      T01833_n10406Td_Und = new boolean[] {false} ;
      T01833_A10407Td_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01833_n10407Td_Cant = new boolean[] {false} ;
      T01833_A10408Td_Pzs = new short[1] ;
      T01833_n10408Td_Pzs = new boolean[] {false} ;
      T01833_A10409Td_Ref = new String[] {""} ;
      T01833_n10409Td_Ref = new boolean[] {false} ;
      T01833_A10410Td_stat = new byte[1] ;
      T01833_n10410Td_stat = new boolean[] {false} ;
      T01833_A10411Td_Fect = new java.util.Date[] {GXutil.nullDate()} ;
      T01833_n10411Td_Fect = new boolean[] {false} ;
      T01833_A10424Td_ColNC = new String[] {""} ;
      T01833_n10424Td_ColNC = new boolean[] {false} ;
      T01833_A10425Td_ColNnC = new int[1] ;
      T01833_n10425Td_ColNnC = new boolean[] {false} ;
      T01833_A10426Td_AlbPro = new String[] {""} ;
      T01833_n10426Td_AlbPro = new boolean[] {false} ;
      T01833_A10427Td_Proc = new String[] {""} ;
      T01833_n10427Td_Proc = new boolean[] {false} ;
      T01833_A10428Td_grm = new short[1] ;
      T01833_n10428Td_grm = new boolean[] {false} ;
      T01833_A10429Td_anc = new short[1] ;
      T01833_n10429Td_anc = new boolean[] {false} ;
      T01833_A10430Td_pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01833_n10430Td_pk = new boolean[] {false} ;
      T01833_A10431Td_pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01833_n10431Td_pm = new boolean[] {false} ;
      T01833_A10432Td_Pro = new String[] {""} ;
      T01833_n10432Td_Pro = new boolean[] {false} ;
      T01833_A10586Td_Maquina = new String[] {""} ;
      T01833_n10586Td_Maquina = new boolean[] {false} ;
      T01833_A10587Td_Lote = new String[] {""} ;
      T01833_n10587Td_Lote = new boolean[] {false} ;
      T01833_A10763Td_EncCli = new String[] {""} ;
      T01833_n10763Td_EncCli = new boolean[] {false} ;
      T01833_A10774Td_obs = new String[] {""} ;
      T01833_n10774Td_obs = new boolean[] {false} ;
      T01833_A396EmprCod = new String[] {""} ;
      sMode1407 = "" ;
      T01837_A396EmprCod = new String[] {""} ;
      T01837_A10398Td_NumInt = new int[1] ;
      T01838_A396EmprCod = new String[] {""} ;
      T01838_A10398Td_NumInt = new int[1] ;
      T01832_A10398Td_NumInt = new int[1] ;
      T01832_A10399Td_PedCli = new String[] {""} ;
      T01832_n10399Td_PedCli = new boolean[] {false} ;
      T01832_A10400Td_Tipo = new String[] {""} ;
      T01832_n10400Td_Tipo = new boolean[] {false} ;
      T01832_A10401Td_Client = new int[1] ;
      T01832_n10401Td_Client = new boolean[] {false} ;
      T01832_A10402Td_Art = new String[] {""} ;
      T01832_n10402Td_Art = new boolean[] {false} ;
      T01832_A10403Td_Fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01832_n10403Td_Fec = new boolean[] {false} ;
      T01832_A10404Td_ColN = new String[] {""} ;
      T01832_n10404Td_ColN = new boolean[] {false} ;
      T01832_A10405Td_ColNn = new int[1] ;
      T01832_n10405Td_ColNn = new boolean[] {false} ;
      T01832_A10406Td_Und = new String[] {""} ;
      T01832_n10406Td_Und = new boolean[] {false} ;
      T01832_A10407Td_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01832_n10407Td_Cant = new boolean[] {false} ;
      T01832_A10408Td_Pzs = new short[1] ;
      T01832_n10408Td_Pzs = new boolean[] {false} ;
      T01832_A10409Td_Ref = new String[] {""} ;
      T01832_n10409Td_Ref = new boolean[] {false} ;
      T01832_A10410Td_stat = new byte[1] ;
      T01832_n10410Td_stat = new boolean[] {false} ;
      T01832_A10411Td_Fect = new java.util.Date[] {GXutil.nullDate()} ;
      T01832_n10411Td_Fect = new boolean[] {false} ;
      T01832_A10424Td_ColNC = new String[] {""} ;
      T01832_n10424Td_ColNC = new boolean[] {false} ;
      T01832_A10425Td_ColNnC = new int[1] ;
      T01832_n10425Td_ColNnC = new boolean[] {false} ;
      T01832_A10426Td_AlbPro = new String[] {""} ;
      T01832_n10426Td_AlbPro = new boolean[] {false} ;
      T01832_A10427Td_Proc = new String[] {""} ;
      T01832_n10427Td_Proc = new boolean[] {false} ;
      T01832_A10428Td_grm = new short[1] ;
      T01832_n10428Td_grm = new boolean[] {false} ;
      T01832_A10429Td_anc = new short[1] ;
      T01832_n10429Td_anc = new boolean[] {false} ;
      T01832_A10430Td_pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01832_n10430Td_pk = new boolean[] {false} ;
      T01832_A10431Td_pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01832_n10431Td_pm = new boolean[] {false} ;
      T01832_A10432Td_Pro = new String[] {""} ;
      T01832_n10432Td_Pro = new boolean[] {false} ;
      T01832_A10586Td_Maquina = new String[] {""} ;
      T01832_n10586Td_Maquina = new boolean[] {false} ;
      T01832_A10587Td_Lote = new String[] {""} ;
      T01832_n10587Td_Lote = new boolean[] {false} ;
      T01832_A10763Td_EncCli = new String[] {""} ;
      T01832_n10763Td_EncCli = new boolean[] {false} ;
      T01832_A10774Td_obs = new String[] {""} ;
      T01832_n10774Td_obs = new boolean[] {false} ;
      T01832_A396EmprCod = new String[] {""} ;
      T018312_A396EmprCod = new String[] {""} ;
      T018312_A10398Td_NumInt = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T018313_A407EmprNom = new String[] {""} ;
      T018313_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ10399Td_PedCli = "" ;
      ZZ10400Td_Tipo = "" ;
      ZZ10402Td_Art = "" ;
      ZZ10403Td_Fec = GXutil.nullDate() ;
      ZZ10404Td_ColN = "" ;
      ZZ10406Td_Und = "" ;
      ZZ10407Td_Cant = DecimalUtil.ZERO ;
      ZZ10409Td_Ref = "" ;
      ZZ10411Td_Fect = GXutil.resetTime( GXutil.nullDate() );
      ZZ10424Td_ColNC = "" ;
      ZZ10426Td_AlbPro = "" ;
      ZZ10427Td_Proc = "" ;
      ZZ10430Td_pk = DecimalUtil.ZERO ;
      ZZ10431Td_pm = DecimalUtil.ZERO ;
      ZZ10432Td_Pro = "" ;
      ZZ10586Td_Maquina = "" ;
      ZZ10587Td_Lote = "" ;
      ZZ10763Td_EncCli = "" ;
      ZZ10774Td_obs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr0900__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr0900__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr0900__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr0900__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr0900__default(),
         new Object[] {
             new Object[] {
            T01832_A10398Td_NumInt, T01832_A10399Td_PedCli, T01832_n10399Td_PedCli, T01832_A10400Td_Tipo, T01832_n10400Td_Tipo, T01832_A10401Td_Client, T01832_n10401Td_Client, T01832_A10402Td_Art, T01832_n10402Td_Art, T01832_A10403Td_Fec,
            T01832_n10403Td_Fec, T01832_A10404Td_ColN, T01832_n10404Td_ColN, T01832_A10405Td_ColNn, T01832_n10405Td_ColNn, T01832_A10406Td_Und, T01832_n10406Td_Und, T01832_A10407Td_Cant, T01832_n10407Td_Cant, T01832_A10408Td_Pzs,
            T01832_n10408Td_Pzs, T01832_A10409Td_Ref, T01832_n10409Td_Ref, T01832_A10410Td_stat, T01832_n10410Td_stat, T01832_A10411Td_Fect, T01832_n10411Td_Fect, T01832_A10424Td_ColNC, T01832_n10424Td_ColNC, T01832_A10425Td_ColNnC,
            T01832_n10425Td_ColNnC, T01832_A10426Td_AlbPro, T01832_n10426Td_AlbPro, T01832_A10427Td_Proc, T01832_n10427Td_Proc, T01832_A10428Td_grm, T01832_n10428Td_grm, T01832_A10429Td_anc, T01832_n10429Td_anc, T01832_A10430Td_pk,
            T01832_n10430Td_pk, T01832_A10431Td_pm, T01832_n10431Td_pm, T01832_A10432Td_Pro, T01832_n10432Td_Pro, T01832_A10586Td_Maquina, T01832_n10586Td_Maquina, T01832_A10587Td_Lote, T01832_n10587Td_Lote, T01832_A10763Td_EncCli,
            T01832_n10763Td_EncCli, T01832_A10774Td_obs, T01832_n10774Td_obs, T01832_A396EmprCod
            }
            , new Object[] {
            T01833_A10398Td_NumInt, T01833_A10399Td_PedCli, T01833_n10399Td_PedCli, T01833_A10400Td_Tipo, T01833_n10400Td_Tipo, T01833_A10401Td_Client, T01833_n10401Td_Client, T01833_A10402Td_Art, T01833_n10402Td_Art, T01833_A10403Td_Fec,
            T01833_n10403Td_Fec, T01833_A10404Td_ColN, T01833_n10404Td_ColN, T01833_A10405Td_ColNn, T01833_n10405Td_ColNn, T01833_A10406Td_Und, T01833_n10406Td_Und, T01833_A10407Td_Cant, T01833_n10407Td_Cant, T01833_A10408Td_Pzs,
            T01833_n10408Td_Pzs, T01833_A10409Td_Ref, T01833_n10409Td_Ref, T01833_A10410Td_stat, T01833_n10410Td_stat, T01833_A10411Td_Fect, T01833_n10411Td_Fect, T01833_A10424Td_ColNC, T01833_n10424Td_ColNC, T01833_A10425Td_ColNnC,
            T01833_n10425Td_ColNnC, T01833_A10426Td_AlbPro, T01833_n10426Td_AlbPro, T01833_A10427Td_Proc, T01833_n10427Td_Proc, T01833_A10428Td_grm, T01833_n10428Td_grm, T01833_A10429Td_anc, T01833_n10429Td_anc, T01833_A10430Td_pk,
            T01833_n10430Td_pk, T01833_A10431Td_pm, T01833_n10431Td_pm, T01833_A10432Td_Pro, T01833_n10432Td_Pro, T01833_A10586Td_Maquina, T01833_n10586Td_Maquina, T01833_A10587Td_Lote, T01833_n10587Td_Lote, T01833_A10763Td_EncCli,
            T01833_n10763Td_EncCli, T01833_A10774Td_obs, T01833_n10774Td_obs, T01833_A396EmprCod
            }
            , new Object[] {
            T01834_A407EmprNom, T01834_n407EmprNom
            }
            , new Object[] {
            T01835_A10398Td_NumInt, T01835_A407EmprNom, T01835_n407EmprNom, T01835_A10399Td_PedCli, T01835_n10399Td_PedCli, T01835_A10400Td_Tipo, T01835_n10400Td_Tipo, T01835_A10401Td_Client, T01835_n10401Td_Client, T01835_A10402Td_Art,
            T01835_n10402Td_Art, T01835_A10403Td_Fec, T01835_n10403Td_Fec, T01835_A10404Td_ColN, T01835_n10404Td_ColN, T01835_A10405Td_ColNn, T01835_n10405Td_ColNn, T01835_A10406Td_Und, T01835_n10406Td_Und, T01835_A10407Td_Cant,
            T01835_n10407Td_Cant, T01835_A10408Td_Pzs, T01835_n10408Td_Pzs, T01835_A10409Td_Ref, T01835_n10409Td_Ref, T01835_A10410Td_stat, T01835_n10410Td_stat, T01835_A10411Td_Fect, T01835_n10411Td_Fect, T01835_A10424Td_ColNC,
            T01835_n10424Td_ColNC, T01835_A10425Td_ColNnC, T01835_n10425Td_ColNnC, T01835_A10426Td_AlbPro, T01835_n10426Td_AlbPro, T01835_A10427Td_Proc, T01835_n10427Td_Proc, T01835_A10428Td_grm, T01835_n10428Td_grm, T01835_A10429Td_anc,
            T01835_n10429Td_anc, T01835_A10430Td_pk, T01835_n10430Td_pk, T01835_A10431Td_pm, T01835_n10431Td_pm, T01835_A10432Td_Pro, T01835_n10432Td_Pro, T01835_A10586Td_Maquina, T01835_n10586Td_Maquina, T01835_A10587Td_Lote,
            T01835_n10587Td_Lote, T01835_A10763Td_EncCli, T01835_n10763Td_EncCli, T01835_A10774Td_obs, T01835_n10774Td_obs, T01835_A396EmprCod
            }
            , new Object[] {
            T01836_A396EmprCod, T01836_A10398Td_NumInt
            }
            , new Object[] {
            T01837_A396EmprCod, T01837_A10398Td_NumInt
            }
            , new Object[] {
            T01838_A396EmprCod, T01838_A10398Td_NumInt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018312_A396EmprCod, T018312_A10398Td_NumInt
            }
            , new Object[] {
            T018313_A407EmprNom, T018313_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTR0900" ;
   }

   private byte Z10410Td_stat ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10410Td_stat ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ10410Td_stat ;
   private short Z10408Td_Pzs ;
   private short Z10428Td_grm ;
   private short Z10429Td_anc ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10408Td_Pzs ;
   private short A10428Td_grm ;
   private short A10429Td_anc ;
   private short RcdFound1407 ;
   private short nIsDirty_1407 ;
   private short ZZ10408Td_Pzs ;
   private short ZZ10428Td_grm ;
   private short ZZ10429Td_anc ;
   private int Z10398Td_NumInt ;
   private int Z10401Td_Client ;
   private int Z10405Td_ColNn ;
   private int Z10425Td_ColNnC ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A10398Td_NumInt ;
   private int edtTd_NumInt_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTd_PedCli_Enabled ;
   private int edtTd_Tipo_Enabled ;
   private int A10401Td_Client ;
   private int edtTd_Client_Enabled ;
   private int edtTd_Art_Enabled ;
   private int edtTd_Fec_Enabled ;
   private int edtTd_ColN_Enabled ;
   private int A10405Td_ColNn ;
   private int edtTd_ColNn_Enabled ;
   private int edtTd_Und_Enabled ;
   private int edtTd_Cant_Enabled ;
   private int edtTd_Pzs_Enabled ;
   private int edtTd_Ref_Enabled ;
   private int edtTd_stat_Enabled ;
   private int edtTd_Fect_Enabled ;
   private int edtTd_ColNC_Enabled ;
   private int A10425Td_ColNnC ;
   private int edtTd_ColNnC_Enabled ;
   private int edtTd_AlbPro_Enabled ;
   private int edtTd_Proc_Enabled ;
   private int edtTd_grm_Enabled ;
   private int edtTd_anc_Enabled ;
   private int edtTd_pk_Enabled ;
   private int edtTd_pm_Enabled ;
   private int edtTd_Pro_Enabled ;
   private int edtTd_Maquina_Enabled ;
   private int edtTd_Lote_Enabled ;
   private int edtTd_EncCli_Enabled ;
   private int edtTd_obs_Enabled ;
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
   private int edtTd_obs_Backcolor ;
   private int edtTd_EncCli_Backcolor ;
   private int edtTd_Lote_Backcolor ;
   private int edtTd_Maquina_Backcolor ;
   private int edtTd_Pro_Backcolor ;
   private int edtTd_pm_Backcolor ;
   private int edtTd_pk_Backcolor ;
   private int edtTd_anc_Backcolor ;
   private int edtTd_grm_Backcolor ;
   private int edtTd_Proc_Backcolor ;
   private int edtTd_AlbPro_Backcolor ;
   private int edtTd_ColNnC_Backcolor ;
   private int edtTd_ColNC_Backcolor ;
   private int edtTd_Fect_Backcolor ;
   private int edtTd_stat_Backcolor ;
   private int edtTd_Ref_Backcolor ;
   private int edtTd_Pzs_Backcolor ;
   private int edtTd_Cant_Backcolor ;
   private int edtTd_Und_Backcolor ;
   private int edtTd_ColNn_Backcolor ;
   private int edtTd_ColN_Backcolor ;
   private int edtTd_Fec_Backcolor ;
   private int edtTd_Art_Backcolor ;
   private int edtTd_Client_Backcolor ;
   private int edtTd_Tipo_Backcolor ;
   private int edtTd_PedCli_Backcolor ;
   private int edtTd_NumInt_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10398Td_NumInt ;
   private int ZZ10401Td_Client ;
   private int ZZ10405Td_ColNn ;
   private int ZZ10425Td_ColNnC ;
   private java.math.BigDecimal Z10407Td_Cant ;
   private java.math.BigDecimal Z10430Td_pk ;
   private java.math.BigDecimal Z10431Td_pm ;
   private java.math.BigDecimal A10407Td_Cant ;
   private java.math.BigDecimal A10430Td_pk ;
   private java.math.BigDecimal A10431Td_pm ;
   private java.math.BigDecimal ZZ10407Td_Cant ;
   private java.math.BigDecimal ZZ10430Td_pk ;
   private java.math.BigDecimal ZZ10431Td_pm ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10399Td_PedCli ;
   private String Z10400Td_Tipo ;
   private String Z10402Td_Art ;
   private String Z10404Td_ColN ;
   private String Z10406Td_Und ;
   private String Z10409Td_Ref ;
   private String Z10424Td_ColNC ;
   private String Z10426Td_AlbPro ;
   private String Z10427Td_Proc ;
   private String Z10432Td_Pro ;
   private String Z10586Td_Maquina ;
   private String Z10587Td_Lote ;
   private String Z10763Td_EncCli ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTd_NumInt_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTd_NumInt_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTd_PedCli_Internalname ;
   private String A10399Td_PedCli ;
   private String edtTd_PedCli_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTd_Tipo_Internalname ;
   private String A10400Td_Tipo ;
   private String edtTd_Tipo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTd_Client_Internalname ;
   private String edtTd_Client_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTd_Art_Internalname ;
   private String A10402Td_Art ;
   private String edtTd_Art_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTd_Fec_Internalname ;
   private String edtTd_Fec_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTd_ColN_Internalname ;
   private String A10404Td_ColN ;
   private String edtTd_ColN_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTd_ColNn_Internalname ;
   private String edtTd_ColNn_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtTd_Und_Internalname ;
   private String A10406Td_Und ;
   private String edtTd_Und_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTd_Cant_Internalname ;
   private String edtTd_Cant_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtTd_Pzs_Internalname ;
   private String edtTd_Pzs_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtTd_Ref_Internalname ;
   private String A10409Td_Ref ;
   private String edtTd_Ref_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtTd_stat_Internalname ;
   private String edtTd_stat_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtTd_Fect_Internalname ;
   private String edtTd_Fect_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtTd_ColNC_Internalname ;
   private String A10424Td_ColNC ;
   private String edtTd_ColNC_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtTd_ColNnC_Internalname ;
   private String edtTd_ColNnC_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtTd_AlbPro_Internalname ;
   private String A10426Td_AlbPro ;
   private String edtTd_AlbPro_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtTd_Proc_Internalname ;
   private String A10427Td_Proc ;
   private String edtTd_Proc_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtTd_grm_Internalname ;
   private String edtTd_grm_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtTd_anc_Internalname ;
   private String edtTd_anc_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtTd_pk_Internalname ;
   private String edtTd_pk_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtTd_pm_Internalname ;
   private String edtTd_pm_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtTd_Pro_Internalname ;
   private String A10432Td_Pro ;
   private String edtTd_Pro_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtTd_Maquina_Internalname ;
   private String A10586Td_Maquina ;
   private String edtTd_Maquina_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtTd_Lote_Internalname ;
   private String A10587Td_Lote ;
   private String edtTd_Lote_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtTd_EncCli_Internalname ;
   private String A10763Td_EncCli ;
   private String edtTd_EncCli_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtTd_obs_Internalname ;
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
   private String sMode1407 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ10399Td_PedCli ;
   private String ZZ10400Td_Tipo ;
   private String ZZ10402Td_Art ;
   private String ZZ10404Td_ColN ;
   private String ZZ10406Td_Und ;
   private String ZZ10409Td_Ref ;
   private String ZZ10424Td_ColNC ;
   private String ZZ10426Td_AlbPro ;
   private String ZZ10427Td_Proc ;
   private String ZZ10432Td_Pro ;
   private String ZZ10586Td_Maquina ;
   private String ZZ10587Td_Lote ;
   private String ZZ10763Td_EncCli ;
   private java.util.Date Z10411Td_Fect ;
   private java.util.Date A10411Td_Fect ;
   private java.util.Date ZZ10411Td_Fect ;
   private java.util.Date Z10403Td_Fec ;
   private java.util.Date A10403Td_Fec ;
   private java.util.Date ZZ10403Td_Fec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10399Td_PedCli ;
   private boolean n10400Td_Tipo ;
   private boolean n10401Td_Client ;
   private boolean n10402Td_Art ;
   private boolean n10403Td_Fec ;
   private boolean n10404Td_ColN ;
   private boolean n10405Td_ColNn ;
   private boolean n10406Td_Und ;
   private boolean n10407Td_Cant ;
   private boolean n10408Td_Pzs ;
   private boolean n10409Td_Ref ;
   private boolean n10410Td_stat ;
   private boolean n10411Td_Fect ;
   private boolean n10424Td_ColNC ;
   private boolean n10425Td_ColNnC ;
   private boolean n10426Td_AlbPro ;
   private boolean n10427Td_Proc ;
   private boolean n10428Td_grm ;
   private boolean n10429Td_anc ;
   private boolean n10430Td_pk ;
   private boolean n10431Td_pm ;
   private boolean n10432Td_Pro ;
   private boolean n10586Td_Maquina ;
   private boolean n10587Td_Lote ;
   private boolean n10763Td_EncCli ;
   private boolean n10774Td_obs ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z10774Td_obs ;
   private String A10774Td_obs ;
   private String ZZ10774Td_obs ;
   private IDataStoreProvider pr_default ;
   private String[] T01834_A407EmprNom ;
   private boolean[] T01834_n407EmprNom ;
   private int[] T01835_A10398Td_NumInt ;
   private String[] T01835_A407EmprNom ;
   private boolean[] T01835_n407EmprNom ;
   private String[] T01835_A10399Td_PedCli ;
   private boolean[] T01835_n10399Td_PedCli ;
   private String[] T01835_A10400Td_Tipo ;
   private boolean[] T01835_n10400Td_Tipo ;
   private int[] T01835_A10401Td_Client ;
   private boolean[] T01835_n10401Td_Client ;
   private String[] T01835_A10402Td_Art ;
   private boolean[] T01835_n10402Td_Art ;
   private java.util.Date[] T01835_A10403Td_Fec ;
   private boolean[] T01835_n10403Td_Fec ;
   private String[] T01835_A10404Td_ColN ;
   private boolean[] T01835_n10404Td_ColN ;
   private int[] T01835_A10405Td_ColNn ;
   private boolean[] T01835_n10405Td_ColNn ;
   private String[] T01835_A10406Td_Und ;
   private boolean[] T01835_n10406Td_Und ;
   private java.math.BigDecimal[] T01835_A10407Td_Cant ;
   private boolean[] T01835_n10407Td_Cant ;
   private short[] T01835_A10408Td_Pzs ;
   private boolean[] T01835_n10408Td_Pzs ;
   private String[] T01835_A10409Td_Ref ;
   private boolean[] T01835_n10409Td_Ref ;
   private byte[] T01835_A10410Td_stat ;
   private boolean[] T01835_n10410Td_stat ;
   private java.util.Date[] T01835_A10411Td_Fect ;
   private boolean[] T01835_n10411Td_Fect ;
   private String[] T01835_A10424Td_ColNC ;
   private boolean[] T01835_n10424Td_ColNC ;
   private int[] T01835_A10425Td_ColNnC ;
   private boolean[] T01835_n10425Td_ColNnC ;
   private String[] T01835_A10426Td_AlbPro ;
   private boolean[] T01835_n10426Td_AlbPro ;
   private String[] T01835_A10427Td_Proc ;
   private boolean[] T01835_n10427Td_Proc ;
   private short[] T01835_A10428Td_grm ;
   private boolean[] T01835_n10428Td_grm ;
   private short[] T01835_A10429Td_anc ;
   private boolean[] T01835_n10429Td_anc ;
   private java.math.BigDecimal[] T01835_A10430Td_pk ;
   private boolean[] T01835_n10430Td_pk ;
   private java.math.BigDecimal[] T01835_A10431Td_pm ;
   private boolean[] T01835_n10431Td_pm ;
   private String[] T01835_A10432Td_Pro ;
   private boolean[] T01835_n10432Td_Pro ;
   private String[] T01835_A10586Td_Maquina ;
   private boolean[] T01835_n10586Td_Maquina ;
   private String[] T01835_A10587Td_Lote ;
   private boolean[] T01835_n10587Td_Lote ;
   private String[] T01835_A10763Td_EncCli ;
   private boolean[] T01835_n10763Td_EncCli ;
   private String[] T01835_A10774Td_obs ;
   private boolean[] T01835_n10774Td_obs ;
   private String[] T01835_A396EmprCod ;
   private String[] T01836_A396EmprCod ;
   private int[] T01836_A10398Td_NumInt ;
   private int[] T01833_A10398Td_NumInt ;
   private String[] T01833_A10399Td_PedCli ;
   private boolean[] T01833_n10399Td_PedCli ;
   private String[] T01833_A10400Td_Tipo ;
   private boolean[] T01833_n10400Td_Tipo ;
   private int[] T01833_A10401Td_Client ;
   private boolean[] T01833_n10401Td_Client ;
   private String[] T01833_A10402Td_Art ;
   private boolean[] T01833_n10402Td_Art ;
   private java.util.Date[] T01833_A10403Td_Fec ;
   private boolean[] T01833_n10403Td_Fec ;
   private String[] T01833_A10404Td_ColN ;
   private boolean[] T01833_n10404Td_ColN ;
   private int[] T01833_A10405Td_ColNn ;
   private boolean[] T01833_n10405Td_ColNn ;
   private String[] T01833_A10406Td_Und ;
   private boolean[] T01833_n10406Td_Und ;
   private java.math.BigDecimal[] T01833_A10407Td_Cant ;
   private boolean[] T01833_n10407Td_Cant ;
   private short[] T01833_A10408Td_Pzs ;
   private boolean[] T01833_n10408Td_Pzs ;
   private String[] T01833_A10409Td_Ref ;
   private boolean[] T01833_n10409Td_Ref ;
   private byte[] T01833_A10410Td_stat ;
   private boolean[] T01833_n10410Td_stat ;
   private java.util.Date[] T01833_A10411Td_Fect ;
   private boolean[] T01833_n10411Td_Fect ;
   private String[] T01833_A10424Td_ColNC ;
   private boolean[] T01833_n10424Td_ColNC ;
   private int[] T01833_A10425Td_ColNnC ;
   private boolean[] T01833_n10425Td_ColNnC ;
   private String[] T01833_A10426Td_AlbPro ;
   private boolean[] T01833_n10426Td_AlbPro ;
   private String[] T01833_A10427Td_Proc ;
   private boolean[] T01833_n10427Td_Proc ;
   private short[] T01833_A10428Td_grm ;
   private boolean[] T01833_n10428Td_grm ;
   private short[] T01833_A10429Td_anc ;
   private boolean[] T01833_n10429Td_anc ;
   private java.math.BigDecimal[] T01833_A10430Td_pk ;
   private boolean[] T01833_n10430Td_pk ;
   private java.math.BigDecimal[] T01833_A10431Td_pm ;
   private boolean[] T01833_n10431Td_pm ;
   private String[] T01833_A10432Td_Pro ;
   private boolean[] T01833_n10432Td_Pro ;
   private String[] T01833_A10586Td_Maquina ;
   private boolean[] T01833_n10586Td_Maquina ;
   private String[] T01833_A10587Td_Lote ;
   private boolean[] T01833_n10587Td_Lote ;
   private String[] T01833_A10763Td_EncCli ;
   private boolean[] T01833_n10763Td_EncCli ;
   private String[] T01833_A10774Td_obs ;
   private boolean[] T01833_n10774Td_obs ;
   private String[] T01833_A396EmprCod ;
   private String[] T01837_A396EmprCod ;
   private int[] T01837_A10398Td_NumInt ;
   private String[] T01838_A396EmprCod ;
   private int[] T01838_A10398Td_NumInt ;
   private int[] T01832_A10398Td_NumInt ;
   private String[] T01832_A10399Td_PedCli ;
   private boolean[] T01832_n10399Td_PedCli ;
   private String[] T01832_A10400Td_Tipo ;
   private boolean[] T01832_n10400Td_Tipo ;
   private int[] T01832_A10401Td_Client ;
   private boolean[] T01832_n10401Td_Client ;
   private String[] T01832_A10402Td_Art ;
   private boolean[] T01832_n10402Td_Art ;
   private java.util.Date[] T01832_A10403Td_Fec ;
   private boolean[] T01832_n10403Td_Fec ;
   private String[] T01832_A10404Td_ColN ;
   private boolean[] T01832_n10404Td_ColN ;
   private int[] T01832_A10405Td_ColNn ;
   private boolean[] T01832_n10405Td_ColNn ;
   private String[] T01832_A10406Td_Und ;
   private boolean[] T01832_n10406Td_Und ;
   private java.math.BigDecimal[] T01832_A10407Td_Cant ;
   private boolean[] T01832_n10407Td_Cant ;
   private short[] T01832_A10408Td_Pzs ;
   private boolean[] T01832_n10408Td_Pzs ;
   private String[] T01832_A10409Td_Ref ;
   private boolean[] T01832_n10409Td_Ref ;
   private byte[] T01832_A10410Td_stat ;
   private boolean[] T01832_n10410Td_stat ;
   private java.util.Date[] T01832_A10411Td_Fect ;
   private boolean[] T01832_n10411Td_Fect ;
   private String[] T01832_A10424Td_ColNC ;
   private boolean[] T01832_n10424Td_ColNC ;
   private int[] T01832_A10425Td_ColNnC ;
   private boolean[] T01832_n10425Td_ColNnC ;
   private String[] T01832_A10426Td_AlbPro ;
   private boolean[] T01832_n10426Td_AlbPro ;
   private String[] T01832_A10427Td_Proc ;
   private boolean[] T01832_n10427Td_Proc ;
   private short[] T01832_A10428Td_grm ;
   private boolean[] T01832_n10428Td_grm ;
   private short[] T01832_A10429Td_anc ;
   private boolean[] T01832_n10429Td_anc ;
   private java.math.BigDecimal[] T01832_A10430Td_pk ;
   private boolean[] T01832_n10430Td_pk ;
   private java.math.BigDecimal[] T01832_A10431Td_pm ;
   private boolean[] T01832_n10431Td_pm ;
   private String[] T01832_A10432Td_Pro ;
   private boolean[] T01832_n10432Td_Pro ;
   private String[] T01832_A10586Td_Maquina ;
   private boolean[] T01832_n10586Td_Maquina ;
   private String[] T01832_A10587Td_Lote ;
   private boolean[] T01832_n10587Td_Lote ;
   private String[] T01832_A10763Td_EncCli ;
   private boolean[] T01832_n10763Td_EncCli ;
   private String[] T01832_A10774Td_obs ;
   private boolean[] T01832_n10774Td_obs ;
   private String[] T01832_A396EmprCod ;
   private String[] T018312_A396EmprCod ;
   private int[] T018312_A10398Td_NumInt ;
   private String[] T018313_A407EmprNom ;
   private boolean[] T018313_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr0900__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0900__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0900__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0900__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0900__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01832", "SELECT Td_NumInt, Td_PedCli, Td_Tipo, Td_Client, Td_Art, Td_Fec, Td_ColN, Td_ColNn, Td_Und, Td_Cant, Td_Pzs, Td_Ref, Td_stat, Td_Fect, Td_ColNC, Td_ColNnC, Td_AlbPro, Td_Proc, Td_grm, Td_anc, Td_pk, Td_pm, Td_Pro, Td_Maquina, Td_Lote, Td_EncCli, Td_obs, EmprCod FROM TXPTR0900 WHERE EmprCod = ? AND Td_NumInt = ?  FOR UPDATE OF Td_PedCli, Td_Tipo, Td_Client, Td_Art, Td_Fec, Td_ColN, Td_ColNn, Td_Und, Td_Cant, Td_Pzs, Td_Ref, Td_stat, Td_Fect, Td_ColNC, Td_ColNnC, Td_AlbPro, Td_Proc, Td_grm, Td_anc, Td_pk, Td_pm, Td_Pro, Td_Maquina, Td_Lote, Td_EncCli, Td_obs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01833", "SELECT Td_NumInt, Td_PedCli, Td_Tipo, Td_Client, Td_Art, Td_Fec, Td_ColN, Td_ColNn, Td_Und, Td_Cant, Td_Pzs, Td_Ref, Td_stat, Td_Fect, Td_ColNC, Td_ColNnC, Td_AlbPro, Td_Proc, Td_grm, Td_anc, Td_pk, Td_pm, Td_Pro, Td_Maquina, Td_Lote, Td_EncCli, Td_obs, EmprCod FROM TXPTR0900 WHERE EmprCod = ? AND Td_NumInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01834", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01835", "SELECT /*+ FIRST_ROWS(100) */ TM1.Td_NumInt, T2.EmprNom, TM1.Td_PedCli, TM1.Td_Tipo, TM1.Td_Client, TM1.Td_Art, TM1.Td_Fec, TM1.Td_ColN, TM1.Td_ColNn, TM1.Td_Und, TM1.Td_Cant, TM1.Td_Pzs, TM1.Td_Ref, TM1.Td_stat, TM1.Td_Fect, TM1.Td_ColNC, TM1.Td_ColNnC, TM1.Td_AlbPro, TM1.Td_Proc, TM1.Td_grm, TM1.Td_anc, TM1.Td_pk, TM1.Td_pm, TM1.Td_Pro, TM1.Td_Maquina, TM1.Td_Lote, TM1.Td_EncCli, TM1.Td_obs, TM1.EmprCod FROM (TXPTR0900 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Td_NumInt = ? ORDER BY TM1.EmprCod, TM1.Td_NumInt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01836", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Td_NumInt FROM TXPTR0900 WHERE EmprCod = ? AND Td_NumInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01837", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Td_NumInt FROM TXPTR0900 WHERE ( Td_NumInt > ?) and EmprCod = ? ORDER BY EmprCod, Td_NumInt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01838", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Td_NumInt FROM TXPTR0900 WHERE ( Td_NumInt < ?) and EmprCod = ? ORDER BY EmprCod DESC, Td_NumInt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01839", "INSERT INTO TXPTR0900(Td_NumInt, Td_PedCli, Td_Tipo, Td_Client, Td_Art, Td_Fec, Td_ColN, Td_ColNn, Td_Und, Td_Cant, Td_Pzs, Td_Ref, Td_stat, Td_Fect, Td_ColNC, Td_ColNnC, Td_AlbPro, Td_Proc, Td_grm, Td_anc, Td_pk, Td_pm, Td_Pro, Td_Maquina, Td_Lote, Td_EncCli, Td_obs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR0900")
         ,new UpdateCursor("T018310", "UPDATE TXPTR0900 SET Td_PedCli=?, Td_Tipo=?, Td_Client=?, Td_Art=?, Td_Fec=?, Td_ColN=?, Td_ColNn=?, Td_Und=?, Td_Cant=?, Td_Pzs=?, Td_Ref=?, Td_stat=?, Td_Fect=?, Td_ColNC=?, Td_ColNnC=?, Td_AlbPro=?, Td_Proc=?, Td_grm=?, Td_anc=?, Td_pk=?, Td_pm=?, Td_Pro=?, Td_Maquina=?, Td_Lote=?, Td_EncCli=?, Td_obs=?  WHERE EmprCod = ? AND Td_NumInt = ?", GX_NOMASK, "TXPTR0900")
         ,new UpdateCursor("T018311", "DELETE FROM TXPTR0900  WHERE EmprCod = ? AND Td_NumInt = ?", GX_NOMASK, "TXPTR0900")
         ,new ForEachCursor("T018312", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Td_NumInt FROM TXPTR0900 WHERE EmprCod = ? ORDER BY EmprCod, Td_NumInt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018313", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 40);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,5);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 40);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,5);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 40);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(23,5);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 20);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
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
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 16);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 13);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 8);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 20);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 20);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 20);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[52], 200);
               }
               stmt.setString(28, (String)parms[53], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
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
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 16);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 13);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 20);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 8);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 20);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 20);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 20);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 200);
               }
               stmt.setString(27, (String)parms[52], 3);
               stmt.setInt(28, ((Number) parms[53]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

