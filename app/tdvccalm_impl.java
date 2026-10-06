package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdvccalm_impl extends GXDataArea
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
         A11935DVPrdNum = httpContext.GetPar( "DVPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11941DVCC_AlmCo = (byte)(GXutil.lval( httpContext.GetPar( "DVCC_AlmCo"))) ;
         n11941DVCC_AlmCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A11935DVPrdNum, A11941DVCC_AlmCo) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Movimeintos Productos por Almacen Data View", ""), (short)(0)) ;
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

   public tdvccalm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdvccalm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdvccalm_impl.class ));
   }

   public tdvccalm_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDVCCAlm.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Producto Dv", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVPrdNum_Internalname, GXutil.rtrim( A11935DVPrdNum), GXutil.rtrim( localUtil.format( A11935DVPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtDVPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A11936DVCC_Lin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_Lin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11936DVCC_Lin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11936DVCC_Lin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Lin_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Lin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDVCC_Fech_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Fech_Internalname, localUtil.ttoc( A11937DVCC_Fech, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11937DVCC_Fech, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Fech_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Fech_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCAlm.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDVCC_Fech_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDVCC_Fech_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDVCCAlm.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Usu_Internalname, GXutil.rtrim( A11938DVCC_Usu), GXutil.rtrim( localUtil.format( A11938DVCC_Usu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Usu_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Usu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Treminal", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Term_Internalname, GXutil.rtrim( A11939DVCC_Term), GXutil.rtrim( localUtil.format( A11939DVCC_Term, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Term_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Term_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A11940DVCC_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_Cant_Enabled!=0) ? localUtil.format( A11940DVCC_Cant, "ZZZZZZ9.9999") : localUtil.format( A11940DVCC_Cant, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Cant_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Cant_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Almacen", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_AlmCo_Internalname, GXutil.ltrim( localUtil.ntoc( A11941DVCC_AlmCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_AlmCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_AlmCo_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_AlmCo_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Codigo Tipo Movimiento", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVTipMvCc_Internalname, GXutil.rtrim( A11942DVTipMvCc), GXutil.rtrim( localUtil.format( A11942DVTipMvCc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVTipMvCc_Jsonclick, 0, "", "", "", "", "", 1, edtDVTipMvCc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripcion Mov", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Desc_Internalname, GXutil.rtrim( A11943DVCC_Desc), GXutil.rtrim( localUtil.format( A11943DVCC_Desc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Desc_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Desc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Precio", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Prec_Internalname, GXutil.ltrim( localUtil.ntoc( A11944DVCC_Prec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_Prec_Enabled!=0) ? localUtil.format( A11944DVCC_Prec, "ZZZZZZZ9.99999") : localUtil.format( A11944DVCC_Prec, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Prec_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Prec_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Albaran", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_NumAl_Internalname, GXutil.ltrim( localUtil.ntoc( A11945DVCC_NumAl, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_NumAl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11945DVCC_NumAl), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11945DVCC_NumAl), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_NumAl_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_NumAl_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "HDR", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_HDR_Internalname, GXutil.rtrim( A11946DVCC_HDR), GXutil.rtrim( localUtil.format( A11946DVCC_HDR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_HDR_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_HDR_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Hdr1_Internalname, GXutil.ltrim( localUtil.ntoc( A11947DVCC_Hdr1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_Hdr1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11947DVCC_Hdr1), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11947DVCC_Hdr1), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Hdr1_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Hdr1_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Hdr2_Internalname, GXutil.ltrim( localUtil.ntoc( A11948DVCC_Hdr2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDVCC_Hdr2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11948DVCC_Hdr2), "9") : localUtil.format( DecimalUtil.doubleToDec(A11948DVCC_Hdr2), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Hdr2_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Hdr2_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDVCC_Hdr3_Internalname, GXutil.rtrim( A11949DVCC_Hdr3), GXutil.rtrim( localUtil.format( A11949DVCC_Hdr3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDVCC_Hdr3_Jsonclick, 0, "", "", "", "", "", 1, edtDVCC_Hdr3_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDVCCAlm.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDVCCAlm.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDVCCAlm.htm");
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
         Z11935DVPrdNum = httpContext.cgiGet( "Z11935DVPrdNum") ;
         Z11936DVCC_Lin = localUtil.ctol( httpContext.cgiGet( "Z11936DVCC_Lin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z11937DVCC_Fech = localUtil.ctot( httpContext.cgiGet( "Z11937DVCC_Fech"), 0) ;
         Z11938DVCC_Usu = httpContext.cgiGet( "Z11938DVCC_Usu") ;
         Z11939DVCC_Term = httpContext.cgiGet( "Z11939DVCC_Term") ;
         Z11940DVCC_Cant = localUtil.ctond( httpContext.cgiGet( "Z11940DVCC_Cant")) ;
         Z11942DVTipMvCc = httpContext.cgiGet( "Z11942DVTipMvCc") ;
         Z11943DVCC_Desc = httpContext.cgiGet( "Z11943DVCC_Desc") ;
         Z11944DVCC_Prec = localUtil.ctond( httpContext.cgiGet( "Z11944DVCC_Prec")) ;
         Z11945DVCC_NumAl = (int)(localUtil.ctol( httpContext.cgiGet( "Z11945DVCC_NumAl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11946DVCC_HDR = httpContext.cgiGet( "Z11946DVCC_HDR") ;
         Z11947DVCC_Hdr1 = (int)(localUtil.ctol( httpContext.cgiGet( "Z11947DVCC_Hdr1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11948DVCC_Hdr2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11948DVCC_Hdr2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11949DVCC_Hdr3 = httpContext.cgiGet( "Z11949DVCC_Hdr3") ;
         Z11941DVCC_AlmCo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11941DVCC_AlmCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = httpContext.cgiGet( edtDVPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_LIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_Lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11936DVCC_Lin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
         }
         else
         {
            A11936DVCC_Lin = localUtil.ctol( httpContext.cgiGet( edtDVCC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtDVCC_Fech_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DVCC_FECH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_Fech_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11937DVCC_Fech = GXutil.resetTime( GXutil.nullDate() );
            n11937DVCC_Fech = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11937DVCC_Fech", localUtil.ttoc( A11937DVCC_Fech, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11937DVCC_Fech = localUtil.ctot( httpContext.cgiGet( edtDVCC_Fech_Internalname)) ;
            n11937DVCC_Fech = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11937DVCC_Fech", localUtil.ttoc( A11937DVCC_Fech, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A11938DVCC_Usu = httpContext.cgiGet( edtDVCC_Usu_Internalname) ;
         n11938DVCC_Usu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11938DVCC_Usu", A11938DVCC_Usu);
         A11939DVCC_Term = httpContext.cgiGet( edtDVCC_Term_Internalname) ;
         n11939DVCC_Term = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11939DVCC_Term", A11939DVCC_Term);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVCC_Cant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVCC_Cant_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_CANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_Cant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11940DVCC_Cant = DecimalUtil.ZERO ;
            n11940DVCC_Cant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11940DVCC_Cant", GXutil.ltrimstr( A11940DVCC_Cant, 12, 4));
         }
         else
         {
            A11940DVCC_Cant = localUtil.ctond( httpContext.cgiGet( edtDVCC_Cant_Internalname)) ;
            n11940DVCC_Cant = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11940DVCC_Cant", GXutil.ltrimstr( A11940DVCC_Cant, 12, 4));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_AlmCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_AlmCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_ALMCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_AlmCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11941DVCC_AlmCo = (byte)(0) ;
            n11941DVCC_AlmCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
         }
         else
         {
            A11941DVCC_AlmCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVCC_AlmCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11941DVCC_AlmCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
         }
         A11942DVTipMvCc = httpContext.cgiGet( edtDVTipMvCc_Internalname) ;
         n11942DVTipMvCc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11942DVTipMvCc", A11942DVTipMvCc);
         A11943DVCC_Desc = httpContext.cgiGet( edtDVCC_Desc_Internalname) ;
         n11943DVCC_Desc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11943DVCC_Desc", A11943DVCC_Desc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDVCC_Prec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDVCC_Prec_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_PREC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_Prec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11944DVCC_Prec = DecimalUtil.ZERO ;
            n11944DVCC_Prec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11944DVCC_Prec", GXutil.ltrimstr( A11944DVCC_Prec, 14, 5));
         }
         else
         {
            A11944DVCC_Prec = localUtil.ctond( httpContext.cgiGet( edtDVCC_Prec_Internalname)) ;
            n11944DVCC_Prec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11944DVCC_Prec", GXutil.ltrimstr( A11944DVCC_Prec, 14, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_NumAl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_NumAl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_NUMAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_NumAl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11945DVCC_NumAl = 0 ;
            n11945DVCC_NumAl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11945DVCC_NumAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11945DVCC_NumAl), 8, 0));
         }
         else
         {
            A11945DVCC_NumAl = (int)(localUtil.ctol( httpContext.cgiGet( edtDVCC_NumAl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11945DVCC_NumAl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11945DVCC_NumAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11945DVCC_NumAl), 8, 0));
         }
         A11946DVCC_HDR = httpContext.cgiGet( edtDVCC_HDR_Internalname) ;
         n11946DVCC_HDR = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11946DVCC_HDR", A11946DVCC_HDR);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_Hdr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_Hdr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_HDR1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_Hdr1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11947DVCC_Hdr1 = 0 ;
            n11947DVCC_Hdr1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11947DVCC_Hdr1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11947DVCC_Hdr1), 8, 0));
         }
         else
         {
            A11947DVCC_Hdr1 = (int)(localUtil.ctol( httpContext.cgiGet( edtDVCC_Hdr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11947DVCC_Hdr1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11947DVCC_Hdr1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11947DVCC_Hdr1), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_Hdr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDVCC_Hdr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DVCC_HDR2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDVCC_Hdr2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11948DVCC_Hdr2 = (byte)(0) ;
            n11948DVCC_Hdr2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11948DVCC_Hdr2", GXutil.str( A11948DVCC_Hdr2, 1, 0));
         }
         else
         {
            A11948DVCC_Hdr2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtDVCC_Hdr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11948DVCC_Hdr2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11948DVCC_Hdr2", GXutil.str( A11948DVCC_Hdr2, 1, 0));
         }
         A11949DVCC_Hdr3 = httpContext.cgiGet( edtDVCC_Hdr3_Internalname) ;
         n11949DVCC_Hdr3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11949DVCC_Hdr3", A11949DVCC_Hdr3);
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
            A11935DVPrdNum = httpContext.GetPar( "DVPrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11936DVCC_Lin = GXutil.lval( httpContext.GetPar( "DVCC_Lin")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
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
            initAll1IQ1674( ) ;
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
      disableAttributes1IQ1674( ) ;
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

   public void confirm_1IQ0( )
   {
      beforeValidate1IQ1674( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IQ1674( ) ;
         }
         else
         {
            checkExtendedTable1IQ1674( ) ;
            if ( AnyError == 0 )
            {
               zm1IQ1674( 2) ;
            }
            closeExtendedTableCursors1IQ1674( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1IQ0( ) ;
      }
   }

   public void resetCaption1IQ0( )
   {
   }

   public void zm1IQ1674( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11937DVCC_Fech = T01IQ3_A11937DVCC_Fech[0] ;
            Z11938DVCC_Usu = T01IQ3_A11938DVCC_Usu[0] ;
            Z11939DVCC_Term = T01IQ3_A11939DVCC_Term[0] ;
            Z11940DVCC_Cant = T01IQ3_A11940DVCC_Cant[0] ;
            Z11942DVTipMvCc = T01IQ3_A11942DVTipMvCc[0] ;
            Z11943DVCC_Desc = T01IQ3_A11943DVCC_Desc[0] ;
            Z11944DVCC_Prec = T01IQ3_A11944DVCC_Prec[0] ;
            Z11945DVCC_NumAl = T01IQ3_A11945DVCC_NumAl[0] ;
            Z11946DVCC_HDR = T01IQ3_A11946DVCC_HDR[0] ;
            Z11947DVCC_Hdr1 = T01IQ3_A11947DVCC_Hdr1[0] ;
            Z11948DVCC_Hdr2 = T01IQ3_A11948DVCC_Hdr2[0] ;
            Z11949DVCC_Hdr3 = T01IQ3_A11949DVCC_Hdr3[0] ;
            Z11941DVCC_AlmCo = T01IQ3_A11941DVCC_AlmCo[0] ;
         }
         else
         {
            Z11937DVCC_Fech = A11937DVCC_Fech ;
            Z11938DVCC_Usu = A11938DVCC_Usu ;
            Z11939DVCC_Term = A11939DVCC_Term ;
            Z11940DVCC_Cant = A11940DVCC_Cant ;
            Z11942DVTipMvCc = A11942DVTipMvCc ;
            Z11943DVCC_Desc = A11943DVCC_Desc ;
            Z11944DVCC_Prec = A11944DVCC_Prec ;
            Z11945DVCC_NumAl = A11945DVCC_NumAl ;
            Z11946DVCC_HDR = A11946DVCC_HDR ;
            Z11947DVCC_Hdr1 = A11947DVCC_Hdr1 ;
            Z11948DVCC_Hdr2 = A11948DVCC_Hdr2 ;
            Z11949DVCC_Hdr3 = A11949DVCC_Hdr3 ;
            Z11941DVCC_AlmCo = A11941DVCC_AlmCo ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11936DVCC_Lin = A11936DVCC_Lin ;
         Z11937DVCC_Fech = A11937DVCC_Fech ;
         Z11938DVCC_Usu = A11938DVCC_Usu ;
         Z11939DVCC_Term = A11939DVCC_Term ;
         Z11940DVCC_Cant = A11940DVCC_Cant ;
         Z11942DVTipMvCc = A11942DVTipMvCc ;
         Z11943DVCC_Desc = A11943DVCC_Desc ;
         Z11944DVCC_Prec = A11944DVCC_Prec ;
         Z11945DVCC_NumAl = A11945DVCC_NumAl ;
         Z11946DVCC_HDR = A11946DVCC_HDR ;
         Z11947DVCC_Hdr1 = A11947DVCC_Hdr1 ;
         Z11948DVCC_Hdr2 = A11948DVCC_Hdr2 ;
         Z11949DVCC_Hdr3 = A11949DVCC_Hdr3 ;
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
         Z11941DVCC_AlmCo = A11941DVCC_AlmCo ;
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

   public void load1IQ1674( )
   {
      /* Using cursor T01IQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1674 = (short)(1) ;
         A11937DVCC_Fech = T01IQ5_A11937DVCC_Fech[0] ;
         n11937DVCC_Fech = T01IQ5_n11937DVCC_Fech[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11937DVCC_Fech", localUtil.ttoc( A11937DVCC_Fech, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11938DVCC_Usu = T01IQ5_A11938DVCC_Usu[0] ;
         n11938DVCC_Usu = T01IQ5_n11938DVCC_Usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11938DVCC_Usu", A11938DVCC_Usu);
         A11939DVCC_Term = T01IQ5_A11939DVCC_Term[0] ;
         n11939DVCC_Term = T01IQ5_n11939DVCC_Term[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11939DVCC_Term", A11939DVCC_Term);
         A11940DVCC_Cant = T01IQ5_A11940DVCC_Cant[0] ;
         n11940DVCC_Cant = T01IQ5_n11940DVCC_Cant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11940DVCC_Cant", GXutil.ltrimstr( A11940DVCC_Cant, 12, 4));
         A11942DVTipMvCc = T01IQ5_A11942DVTipMvCc[0] ;
         n11942DVTipMvCc = T01IQ5_n11942DVTipMvCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11942DVTipMvCc", A11942DVTipMvCc);
         A11943DVCC_Desc = T01IQ5_A11943DVCC_Desc[0] ;
         n11943DVCC_Desc = T01IQ5_n11943DVCC_Desc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11943DVCC_Desc", A11943DVCC_Desc);
         A11944DVCC_Prec = T01IQ5_A11944DVCC_Prec[0] ;
         n11944DVCC_Prec = T01IQ5_n11944DVCC_Prec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11944DVCC_Prec", GXutil.ltrimstr( A11944DVCC_Prec, 14, 5));
         A11945DVCC_NumAl = T01IQ5_A11945DVCC_NumAl[0] ;
         n11945DVCC_NumAl = T01IQ5_n11945DVCC_NumAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11945DVCC_NumAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11945DVCC_NumAl), 8, 0));
         A11946DVCC_HDR = T01IQ5_A11946DVCC_HDR[0] ;
         n11946DVCC_HDR = T01IQ5_n11946DVCC_HDR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11946DVCC_HDR", A11946DVCC_HDR);
         A11947DVCC_Hdr1 = T01IQ5_A11947DVCC_Hdr1[0] ;
         n11947DVCC_Hdr1 = T01IQ5_n11947DVCC_Hdr1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11947DVCC_Hdr1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11947DVCC_Hdr1), 8, 0));
         A11948DVCC_Hdr2 = T01IQ5_A11948DVCC_Hdr2[0] ;
         n11948DVCC_Hdr2 = T01IQ5_n11948DVCC_Hdr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11948DVCC_Hdr2", GXutil.str( A11948DVCC_Hdr2, 1, 0));
         A11949DVCC_Hdr3 = T01IQ5_A11949DVCC_Hdr3[0] ;
         n11949DVCC_Hdr3 = T01IQ5_n11949DVCC_Hdr3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11949DVCC_Hdr3", A11949DVCC_Hdr3);
         A11941DVCC_AlmCo = T01IQ5_A11941DVCC_AlmCo[0] ;
         n11941DVCC_AlmCo = T01IQ5_n11941DVCC_AlmCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
         zm1IQ1674( -1) ;
      }
      pr_default.close(3);
      onLoadActions1IQ1674( ) ;
   }

   public void onLoadActions1IQ1674( )
   {
   }

   public void checkExtendedTable1IQ1674( )
   {
      nIsDirty_1674 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DVPrd Alm", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVCC_ALMCO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1IQ1674( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         String A11935DVPrdNum ,
                         byte A11941DVCC_AlmCo )
   {
      /* Using cursor T01IQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DVPrd Alm", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVCC_ALMCO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1IQ1674( )
   {
      /* Using cursor T01IQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1674 = (short)(1) ;
      }
      else
      {
         RcdFound1674 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1IQ1674( 1) ;
         RcdFound1674 = (short)(1) ;
         A11936DVCC_Lin = T01IQ3_A11936DVCC_Lin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
         A11937DVCC_Fech = T01IQ3_A11937DVCC_Fech[0] ;
         n11937DVCC_Fech = T01IQ3_n11937DVCC_Fech[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11937DVCC_Fech", localUtil.ttoc( A11937DVCC_Fech, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11938DVCC_Usu = T01IQ3_A11938DVCC_Usu[0] ;
         n11938DVCC_Usu = T01IQ3_n11938DVCC_Usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11938DVCC_Usu", A11938DVCC_Usu);
         A11939DVCC_Term = T01IQ3_A11939DVCC_Term[0] ;
         n11939DVCC_Term = T01IQ3_n11939DVCC_Term[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11939DVCC_Term", A11939DVCC_Term);
         A11940DVCC_Cant = T01IQ3_A11940DVCC_Cant[0] ;
         n11940DVCC_Cant = T01IQ3_n11940DVCC_Cant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11940DVCC_Cant", GXutil.ltrimstr( A11940DVCC_Cant, 12, 4));
         A11942DVTipMvCc = T01IQ3_A11942DVTipMvCc[0] ;
         n11942DVTipMvCc = T01IQ3_n11942DVTipMvCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11942DVTipMvCc", A11942DVTipMvCc);
         A11943DVCC_Desc = T01IQ3_A11943DVCC_Desc[0] ;
         n11943DVCC_Desc = T01IQ3_n11943DVCC_Desc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11943DVCC_Desc", A11943DVCC_Desc);
         A11944DVCC_Prec = T01IQ3_A11944DVCC_Prec[0] ;
         n11944DVCC_Prec = T01IQ3_n11944DVCC_Prec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11944DVCC_Prec", GXutil.ltrimstr( A11944DVCC_Prec, 14, 5));
         A11945DVCC_NumAl = T01IQ3_A11945DVCC_NumAl[0] ;
         n11945DVCC_NumAl = T01IQ3_n11945DVCC_NumAl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11945DVCC_NumAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11945DVCC_NumAl), 8, 0));
         A11946DVCC_HDR = T01IQ3_A11946DVCC_HDR[0] ;
         n11946DVCC_HDR = T01IQ3_n11946DVCC_HDR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11946DVCC_HDR", A11946DVCC_HDR);
         A11947DVCC_Hdr1 = T01IQ3_A11947DVCC_Hdr1[0] ;
         n11947DVCC_Hdr1 = T01IQ3_n11947DVCC_Hdr1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11947DVCC_Hdr1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11947DVCC_Hdr1), 8, 0));
         A11948DVCC_Hdr2 = T01IQ3_A11948DVCC_Hdr2[0] ;
         n11948DVCC_Hdr2 = T01IQ3_n11948DVCC_Hdr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11948DVCC_Hdr2", GXutil.str( A11948DVCC_Hdr2, 1, 0));
         A11949DVCC_Hdr3 = T01IQ3_A11949DVCC_Hdr3[0] ;
         n11949DVCC_Hdr3 = T01IQ3_n11949DVCC_Hdr3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11949DVCC_Hdr3", A11949DVCC_Hdr3);
         A396EmprCod = T01IQ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IQ3_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11941DVCC_AlmCo = T01IQ3_A11941DVCC_AlmCo[0] ;
         n11941DVCC_AlmCo = T01IQ3_n11941DVCC_AlmCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z11935DVPrdNum = A11935DVPrdNum ;
         Z11936DVCC_Lin = A11936DVCC_Lin ;
         sMode1674 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IQ1674( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1674 = (short)(0) ;
            initializeNonKey1IQ1674( ) ;
         }
         Gx_mode = sMode1674 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1674 = (short)(0) ;
         initializeNonKey1IQ1674( ) ;
         sMode1674 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1674 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1IQ1674( ) ;
      if ( RcdFound1674 == 0 )
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
      RcdFound1674 = (short)(0) ;
      /* Using cursor T01IQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum, A11935DVPrdNum, A396EmprCod, Long.valueOf(A11936DVCC_Lin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IQ8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IQ8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IQ8_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) || ( GXutil.strcmp(T01IQ8_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IQ8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IQ8_A11936DVCC_Lin[0] < A11936DVCC_Lin ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01IQ8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IQ8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IQ8_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) || ( GXutil.strcmp(T01IQ8_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IQ8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IQ8_A11936DVCC_Lin[0] > A11936DVCC_Lin ) ) )
         {
            A396EmprCod = T01IQ8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IQ8_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11936DVCC_Lin = T01IQ8_A11936DVCC_Lin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
            RcdFound1674 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1674 = (short)(0) ;
      /* Using cursor T01IQ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A11935DVPrdNum, A11935DVPrdNum, A396EmprCod, Long.valueOf(A11936DVCC_Lin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IQ9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IQ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IQ9_A11935DVPrdNum[0], A11935DVPrdNum) > 0 ) || ( GXutil.strcmp(T01IQ9_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IQ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IQ9_A11936DVCC_Lin[0] > A11936DVCC_Lin ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01IQ9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IQ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01IQ9_A11935DVPrdNum[0], A11935DVPrdNum) < 0 ) || ( GXutil.strcmp(T01IQ9_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) && ( GXutil.strcmp(T01IQ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IQ9_A11936DVCC_Lin[0] < A11936DVCC_Lin ) ) )
         {
            A396EmprCod = T01IQ9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = T01IQ9_A11935DVPrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11936DVCC_Lin = T01IQ9_A11936DVCC_Lin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
            RcdFound1674 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IQ1674( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IQ1674( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1674 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11936DVCC_Lin != Z11936DVCC_Lin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11935DVPrdNum = Z11935DVPrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
               A11936DVCC_Lin = Z11936DVCC_Lin ;
               httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
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
               update1IQ1674( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11936DVCC_Lin != Z11936DVCC_Lin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IQ1674( ) ;
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
                  insert1IQ1674( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11936DVCC_Lin != Z11936DVCC_Lin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = Z11935DVPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11936DVCC_Lin = Z11936DVCC_Lin ;
         httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
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
      getKey1IQ1674( ) ;
      if ( RcdFound1674 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11936DVCC_Lin != Z11936DVCC_Lin ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11935DVPrdNum = Z11935DVPrdNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
            A11936DVCC_Lin = Z11936DVCC_Lin ;
            httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11935DVPrdNum, Z11935DVPrdNum) != 0 ) || ( A11936DVCC_Lin != Z11936DVCC_Lin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdvccalm");
      GX_FocusControl = edtDVCC_Fech_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IQ0( ) ;
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
      if ( RcdFound1674 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDVCC_Fech_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IQ1674( ) ;
      if ( RcdFound1674 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCC_Fech_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IQ1674( ) ;
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
      if ( RcdFound1674 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCC_Fech_Internalname ;
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
      if ( RcdFound1674 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCC_Fech_Internalname ;
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
      scanStart1IQ1674( ) ;
      if ( RcdFound1674 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1674 != 0 )
         {
            scanNext1IQ1674( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDVCC_Fech_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IQ1674( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IQ1674( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNCCALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z11937DVCC_Fech, T01IQ2_A11937DVCC_Fech[0]) ) || ( GXutil.strcmp(Z11938DVCC_Usu, T01IQ2_A11938DVCC_Usu[0]) != 0 ) || ( GXutil.strcmp(Z11939DVCC_Term, T01IQ2_A11939DVCC_Term[0]) != 0 ) || ( DecimalUtil.compareTo(Z11940DVCC_Cant, T01IQ2_A11940DVCC_Cant[0]) != 0 ) || ( GXutil.strcmp(Z11942DVTipMvCc, T01IQ2_A11942DVTipMvCc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11943DVCC_Desc, T01IQ2_A11943DVCC_Desc[0]) != 0 ) || ( DecimalUtil.compareTo(Z11944DVCC_Prec, T01IQ2_A11944DVCC_Prec[0]) != 0 ) || ( Z11945DVCC_NumAl != T01IQ2_A11945DVCC_NumAl[0] ) || ( GXutil.strcmp(Z11946DVCC_HDR, T01IQ2_A11946DVCC_HDR[0]) != 0 ) || ( Z11947DVCC_Hdr1 != T01IQ2_A11947DVCC_Hdr1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11948DVCC_Hdr2 != T01IQ2_A11948DVCC_Hdr2[0] ) || ( GXutil.strcmp(Z11949DVCC_Hdr3, T01IQ2_A11949DVCC_Hdr3[0]) != 0 ) || ( Z11941DVCC_AlmCo != T01IQ2_A11941DVCC_AlmCo[0] ) )
         {
            if ( !( GXutil.dateCompare(Z11937DVCC_Fech, T01IQ2_A11937DVCC_Fech[0]) ) )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Fech");
               GXutil.writeLogRaw("Old: ",Z11937DVCC_Fech);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11937DVCC_Fech[0]);
            }
            if ( GXutil.strcmp(Z11938DVCC_Usu, T01IQ2_A11938DVCC_Usu[0]) != 0 )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Usu");
               GXutil.writeLogRaw("Old: ",Z11938DVCC_Usu);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11938DVCC_Usu[0]);
            }
            if ( GXutil.strcmp(Z11939DVCC_Term, T01IQ2_A11939DVCC_Term[0]) != 0 )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Term");
               GXutil.writeLogRaw("Old: ",Z11939DVCC_Term);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11939DVCC_Term[0]);
            }
            if ( DecimalUtil.compareTo(Z11940DVCC_Cant, T01IQ2_A11940DVCC_Cant[0]) != 0 )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Cant");
               GXutil.writeLogRaw("Old: ",Z11940DVCC_Cant);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11940DVCC_Cant[0]);
            }
            if ( GXutil.strcmp(Z11942DVTipMvCc, T01IQ2_A11942DVTipMvCc[0]) != 0 )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVTipMvCc");
               GXutil.writeLogRaw("Old: ",Z11942DVTipMvCc);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11942DVTipMvCc[0]);
            }
            if ( GXutil.strcmp(Z11943DVCC_Desc, T01IQ2_A11943DVCC_Desc[0]) != 0 )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Desc");
               GXutil.writeLogRaw("Old: ",Z11943DVCC_Desc);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11943DVCC_Desc[0]);
            }
            if ( DecimalUtil.compareTo(Z11944DVCC_Prec, T01IQ2_A11944DVCC_Prec[0]) != 0 )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Prec");
               GXutil.writeLogRaw("Old: ",Z11944DVCC_Prec);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11944DVCC_Prec[0]);
            }
            if ( Z11945DVCC_NumAl != T01IQ2_A11945DVCC_NumAl[0] )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_NumAl");
               GXutil.writeLogRaw("Old: ",Z11945DVCC_NumAl);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11945DVCC_NumAl[0]);
            }
            if ( GXutil.strcmp(Z11946DVCC_HDR, T01IQ2_A11946DVCC_HDR[0]) != 0 )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_HDR");
               GXutil.writeLogRaw("Old: ",Z11946DVCC_HDR);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11946DVCC_HDR[0]);
            }
            if ( Z11947DVCC_Hdr1 != T01IQ2_A11947DVCC_Hdr1[0] )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Hdr1");
               GXutil.writeLogRaw("Old: ",Z11947DVCC_Hdr1);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11947DVCC_Hdr1[0]);
            }
            if ( Z11948DVCC_Hdr2 != T01IQ2_A11948DVCC_Hdr2[0] )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Hdr2");
               GXutil.writeLogRaw("Old: ",Z11948DVCC_Hdr2);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11948DVCC_Hdr2[0]);
            }
            if ( GXutil.strcmp(Z11949DVCC_Hdr3, T01IQ2_A11949DVCC_Hdr3[0]) != 0 )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_Hdr3");
               GXutil.writeLogRaw("Old: ",Z11949DVCC_Hdr3);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11949DVCC_Hdr3[0]);
            }
            if ( Z11941DVCC_AlmCo != T01IQ2_A11941DVCC_AlmCo[0] )
            {
               GXutil.writeLogln("tdvccalm:[seudo value changed for attri]"+"DVCC_AlmCo");
               GXutil.writeLogRaw("Old: ",Z11941DVCC_AlmCo);
               GXutil.writeLogRaw("Current: ",T01IQ2_A11941DVCC_AlmCo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"LVNCCALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IQ1674( )
   {
      beforeValidate1IQ1674( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IQ1674( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IQ1674( 0) ;
         checkOptimisticConcurrency1IQ1674( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IQ1674( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IQ1674( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IQ10 */
                  pr_default.execute(8, new Object[] {Long.valueOf(A11936DVCC_Lin), Boolean.valueOf(n11937DVCC_Fech), A11937DVCC_Fech, Boolean.valueOf(n11938DVCC_Usu), A11938DVCC_Usu, Boolean.valueOf(n11939DVCC_Term), A11939DVCC_Term, Boolean.valueOf(n11940DVCC_Cant), A11940DVCC_Cant, Boolean.valueOf(n11942DVTipMvCc), A11942DVTipMvCc, Boolean.valueOf(n11943DVCC_Desc), A11943DVCC_Desc, Boolean.valueOf(n11944DVCC_Prec), A11944DVCC_Prec, Boolean.valueOf(n11945DVCC_NumAl), Integer.valueOf(A11945DVCC_NumAl), Boolean.valueOf(n11946DVCC_HDR), A11946DVCC_HDR, Boolean.valueOf(n11947DVCC_Hdr1), Integer.valueOf(A11947DVCC_Hdr1), Boolean.valueOf(n11948DVCC_Hdr2), Byte.valueOf(A11948DVCC_Hdr2), Boolean.valueOf(n11949DVCC_Hdr3), A11949DVCC_Hdr3, A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCALM");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption1IQ0( ) ;
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
            load1IQ1674( ) ;
         }
         endLevel1IQ1674( ) ;
      }
      closeExtendedTableCursors1IQ1674( ) ;
   }

   public void update1IQ1674( )
   {
      beforeValidate1IQ1674( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IQ1674( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IQ1674( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IQ1674( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IQ1674( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IQ11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n11937DVCC_Fech), A11937DVCC_Fech, Boolean.valueOf(n11938DVCC_Usu), A11938DVCC_Usu, Boolean.valueOf(n11939DVCC_Term), A11939DVCC_Term, Boolean.valueOf(n11940DVCC_Cant), A11940DVCC_Cant, Boolean.valueOf(n11942DVTipMvCc), A11942DVTipMvCc, Boolean.valueOf(n11943DVCC_Desc), A11943DVCC_Desc, Boolean.valueOf(n11944DVCC_Prec), A11944DVCC_Prec, Boolean.valueOf(n11945DVCC_NumAl), Integer.valueOf(A11945DVCC_NumAl), Boolean.valueOf(n11946DVCC_HDR), A11946DVCC_HDR, Boolean.valueOf(n11947DVCC_Hdr1), Integer.valueOf(A11947DVCC_Hdr1), Boolean.valueOf(n11948DVCC_Hdr2), Byte.valueOf(A11948DVCC_Hdr2), Boolean.valueOf(n11949DVCC_Hdr3), A11949DVCC_Hdr3, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo), A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCALM");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"LVNCCALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IQ1674( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1IQ0( ) ;
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
         endLevel1IQ1674( ) ;
      }
      closeExtendedTableCursors1IQ1674( ) ;
   }

   public void deferredUpdate1IQ1674( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IQ1674( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IQ1674( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IQ1674( ) ;
         afterConfirm1IQ1674( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IQ1674( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IQ12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A11935DVPrdNum, Long.valueOf(A11936DVCC_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNCCALM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1674 == 0 )
                     {
                        initAll1IQ1674( ) ;
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
                     resetCaption1IQ0( ) ;
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
      sMode1674 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IQ1674( ) ;
      Gx_mode = sMode1674 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IQ1674( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1IQ1674( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IQ1674( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdvccalm");
         if ( AnyError == 0 )
         {
            confirmValues1IQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdvccalm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IQ1674( )
   {
      /* Using cursor T01IQ13 */
      pr_default.execute(11);
      RcdFound1674 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1674 = (short)(1) ;
         A396EmprCod = T01IQ13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IQ13_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11936DVCC_Lin = T01IQ13_A11936DVCC_Lin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IQ1674( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1674 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1674 = (short)(1) ;
         A396EmprCod = T01IQ13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11935DVPrdNum = T01IQ13_A11935DVPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
         A11936DVCC_Lin = T01IQ13_A11936DVCC_Lin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
      }
   }

   public void scanEnd1IQ1674( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1IQ1674( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IQ1674( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IQ1674( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IQ1674( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IQ1674( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IQ1674( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IQ1674( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDVPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVPrdNum_Enabled), 5, 0), true);
      edtDVCC_Lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Lin_Enabled), 5, 0), true);
      edtDVCC_Fech_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Fech_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Fech_Enabled), 5, 0), true);
      edtDVCC_Usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Usu_Enabled), 5, 0), true);
      edtDVCC_Term_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Term_Enabled), 5, 0), true);
      edtDVCC_Cant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Cant_Enabled), 5, 0), true);
      edtDVCC_AlmCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_AlmCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_AlmCo_Enabled), 5, 0), true);
      edtDVTipMvCc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVTipMvCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVTipMvCc_Enabled), 5, 0), true);
      edtDVCC_Desc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Desc_Enabled), 5, 0), true);
      edtDVCC_Prec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Prec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Prec_Enabled), 5, 0), true);
      edtDVCC_NumAl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_NumAl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_NumAl_Enabled), 5, 0), true);
      edtDVCC_HDR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_HDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_HDR_Enabled), 5, 0), true);
      edtDVCC_Hdr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Hdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Hdr1_Enabled), 5, 0), true);
      edtDVCC_Hdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Hdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Hdr2_Enabled), 5, 0), true);
      edtDVCC_Hdr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDVCC_Hdr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDVCC_Hdr3_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1IQ1674( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1IQ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdvccalm", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11935DVPrdNum", GXutil.rtrim( Z11935DVPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11936DVCC_Lin", GXutil.ltrim( localUtil.ntoc( Z11936DVCC_Lin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11937DVCC_Fech", localUtil.ttoc( Z11937DVCC_Fech, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11938DVCC_Usu", GXutil.rtrim( Z11938DVCC_Usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11939DVCC_Term", GXutil.rtrim( Z11939DVCC_Term));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11940DVCC_Cant", GXutil.ltrim( localUtil.ntoc( Z11940DVCC_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11942DVTipMvCc", GXutil.rtrim( Z11942DVTipMvCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11943DVCC_Desc", GXutil.rtrim( Z11943DVCC_Desc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11944DVCC_Prec", GXutil.ltrim( localUtil.ntoc( Z11944DVCC_Prec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11945DVCC_NumAl", GXutil.ltrim( localUtil.ntoc( Z11945DVCC_NumAl, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11946DVCC_HDR", GXutil.rtrim( Z11946DVCC_HDR));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11947DVCC_Hdr1", GXutil.ltrim( localUtil.ntoc( Z11947DVCC_Hdr1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11948DVCC_Hdr2", GXutil.ltrim( localUtil.ntoc( Z11948DVCC_Hdr2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11949DVCC_Hdr3", GXutil.rtrim( Z11949DVCC_Hdr3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11941DVCC_AlmCo", GXutil.ltrim( localUtil.ntoc( Z11941DVCC_AlmCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdvccalm", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDVCCAlm" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Movimeintos Productos por Almacen Data View", "") ;
   }

   public void initializeNonKey1IQ1674( )
   {
      A11937DVCC_Fech = GXutil.resetTime( GXutil.nullDate() );
      n11937DVCC_Fech = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11937DVCC_Fech", localUtil.ttoc( A11937DVCC_Fech, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11938DVCC_Usu = "" ;
      n11938DVCC_Usu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11938DVCC_Usu", A11938DVCC_Usu);
      A11939DVCC_Term = "" ;
      n11939DVCC_Term = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11939DVCC_Term", A11939DVCC_Term);
      A11940DVCC_Cant = DecimalUtil.ZERO ;
      n11940DVCC_Cant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11940DVCC_Cant", GXutil.ltrimstr( A11940DVCC_Cant, 12, 4));
      A11941DVCC_AlmCo = (byte)(0) ;
      n11941DVCC_AlmCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11941DVCC_AlmCo), 2, 0));
      A11942DVTipMvCc = "" ;
      n11942DVTipMvCc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11942DVTipMvCc", A11942DVTipMvCc);
      A11943DVCC_Desc = "" ;
      n11943DVCC_Desc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11943DVCC_Desc", A11943DVCC_Desc);
      A11944DVCC_Prec = DecimalUtil.ZERO ;
      n11944DVCC_Prec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11944DVCC_Prec", GXutil.ltrimstr( A11944DVCC_Prec, 14, 5));
      A11945DVCC_NumAl = 0 ;
      n11945DVCC_NumAl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11945DVCC_NumAl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11945DVCC_NumAl), 8, 0));
      A11946DVCC_HDR = "" ;
      n11946DVCC_HDR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11946DVCC_HDR", A11946DVCC_HDR);
      A11947DVCC_Hdr1 = 0 ;
      n11947DVCC_Hdr1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11947DVCC_Hdr1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11947DVCC_Hdr1), 8, 0));
      A11948DVCC_Hdr2 = (byte)(0) ;
      n11948DVCC_Hdr2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11948DVCC_Hdr2", GXutil.str( A11948DVCC_Hdr2, 1, 0));
      A11949DVCC_Hdr3 = "" ;
      n11949DVCC_Hdr3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11949DVCC_Hdr3", A11949DVCC_Hdr3);
      Z11937DVCC_Fech = GXutil.resetTime( GXutil.nullDate() );
      Z11938DVCC_Usu = "" ;
      Z11939DVCC_Term = "" ;
      Z11940DVCC_Cant = DecimalUtil.ZERO ;
      Z11942DVTipMvCc = "" ;
      Z11943DVCC_Desc = "" ;
      Z11944DVCC_Prec = DecimalUtil.ZERO ;
      Z11945DVCC_NumAl = 0 ;
      Z11946DVCC_HDR = "" ;
      Z11947DVCC_Hdr1 = 0 ;
      Z11948DVCC_Hdr2 = (byte)(0) ;
      Z11949DVCC_Hdr3 = "" ;
      Z11941DVCC_AlmCo = (byte)(0) ;
   }

   public void initAll1IQ1674( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11935DVPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11935DVPrdNum", A11935DVPrdNum);
      A11936DVCC_Lin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11936DVCC_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11936DVCC_Lin), 12, 0));
      initializeNonKey1IQ1674( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101633038", true, true);
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
      httpContext.AddJavascriptSource("tdvccalm.js", "?20266101633039", false, true);
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
      edtDVPrdNum_Internalname = "DVPRDNUM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDVCC_Lin_Internalname = "DVCC_LIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDVCC_Fech_Internalname = "DVCC_FECH" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDVCC_Usu_Internalname = "DVCC_USU" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDVCC_Term_Internalname = "DVCC_TERM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDVCC_Cant_Internalname = "DVCC_CANT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDVCC_AlmCo_Internalname = "DVCC_ALMCO" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDVTipMvCc_Internalname = "DVTIPMVCC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDVCC_Desc_Internalname = "DVCC_DESC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDVCC_Prec_Internalname = "DVCC_PREC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDVCC_NumAl_Internalname = "DVCC_NUMAL" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDVCC_HDR_Internalname = "DVCC_HDR" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDVCC_Hdr1_Internalname = "DVCC_HDR1" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDVCC_Hdr2_Internalname = "DVCC_HDR2" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDVCC_Hdr3_Internalname = "DVCC_HDR3" ;
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
      Form.setCaption( httpContext.getMessage( "Movimeintos Productos por Almacen Data View", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDVCC_Hdr3_Jsonclick = "" ;
      edtDVCC_Hdr3_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Hdr3_Enabled = 1 ;
      edtDVCC_Hdr2_Jsonclick = "" ;
      edtDVCC_Hdr2_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Hdr2_Enabled = 1 ;
      edtDVCC_Hdr1_Jsonclick = "" ;
      edtDVCC_Hdr1_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Hdr1_Enabled = 1 ;
      edtDVCC_HDR_Jsonclick = "" ;
      edtDVCC_HDR_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_HDR_Enabled = 1 ;
      edtDVCC_NumAl_Jsonclick = "" ;
      edtDVCC_NumAl_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_NumAl_Enabled = 1 ;
      edtDVCC_Prec_Jsonclick = "" ;
      edtDVCC_Prec_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Prec_Enabled = 1 ;
      edtDVCC_Desc_Jsonclick = "" ;
      edtDVCC_Desc_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Desc_Enabled = 1 ;
      edtDVTipMvCc_Jsonclick = "" ;
      edtDVTipMvCc_Backcolor = (int)(0xFFFFFF) ;
      edtDVTipMvCc_Enabled = 1 ;
      edtDVCC_AlmCo_Jsonclick = "" ;
      edtDVCC_AlmCo_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_AlmCo_Enabled = 1 ;
      edtDVCC_Cant_Jsonclick = "" ;
      edtDVCC_Cant_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Cant_Enabled = 1 ;
      edtDVCC_Term_Jsonclick = "" ;
      edtDVCC_Term_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Term_Enabled = 1 ;
      edtDVCC_Usu_Jsonclick = "" ;
      edtDVCC_Usu_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Usu_Enabled = 1 ;
      edtDVCC_Fech_Jsonclick = "" ;
      edtDVCC_Fech_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Fech_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDVCC_Lin_Jsonclick = "" ;
      edtDVCC_Lin_Backcolor = (int)(0xFFFFFF) ;
      edtDVCC_Lin_Enabled = 1 ;
      edtDVPrdNum_Jsonclick = "" ;
      edtDVPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtDVPrdNum_Enabled = 1 ;
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
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtDVCC_Fech_Internalname ;
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

   public void valid_Dvcc_lin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11937DVCC_Fech", localUtil.ttoc( A11937DVCC_Fech, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11938DVCC_Usu", GXutil.rtrim( A11938DVCC_Usu));
      httpContext.ajax_rsp_assign_attri("", false, "A11939DVCC_Term", GXutil.rtrim( A11939DVCC_Term));
      httpContext.ajax_rsp_assign_attri("", false, "A11940DVCC_Cant", GXutil.ltrim( localUtil.ntoc( A11940DVCC_Cant, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11941DVCC_AlmCo", GXutil.ltrim( localUtil.ntoc( A11941DVCC_AlmCo, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11942DVTipMvCc", GXutil.rtrim( A11942DVTipMvCc));
      httpContext.ajax_rsp_assign_attri("", false, "A11943DVCC_Desc", GXutil.rtrim( A11943DVCC_Desc));
      httpContext.ajax_rsp_assign_attri("", false, "A11944DVCC_Prec", GXutil.ltrim( localUtil.ntoc( A11944DVCC_Prec, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11945DVCC_NumAl", GXutil.ltrim( localUtil.ntoc( A11945DVCC_NumAl, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11946DVCC_HDR", GXutil.rtrim( A11946DVCC_HDR));
      httpContext.ajax_rsp_assign_attri("", false, "A11947DVCC_Hdr1", GXutil.ltrim( localUtil.ntoc( A11947DVCC_Hdr1, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11948DVCC_Hdr2", GXutil.ltrim( localUtil.ntoc( A11948DVCC_Hdr2, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11949DVCC_Hdr3", GXutil.rtrim( A11949DVCC_Hdr3));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11935DVPrdNum", GXutil.rtrim( Z11935DVPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11936DVCC_Lin", GXutil.ltrim( localUtil.ntoc( Z11936DVCC_Lin, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11937DVCC_Fech", localUtil.ttoc( Z11937DVCC_Fech, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11938DVCC_Usu", GXutil.rtrim( Z11938DVCC_Usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11939DVCC_Term", GXutil.rtrim( Z11939DVCC_Term));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11940DVCC_Cant", GXutil.ltrim( localUtil.ntoc( Z11940DVCC_Cant, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11941DVCC_AlmCo", GXutil.ltrim( localUtil.ntoc( Z11941DVCC_AlmCo, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11942DVTipMvCc", GXutil.rtrim( Z11942DVTipMvCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11943DVCC_Desc", GXutil.rtrim( Z11943DVCC_Desc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11944DVCC_Prec", GXutil.ltrim( localUtil.ntoc( Z11944DVCC_Prec, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11945DVCC_NumAl", GXutil.ltrim( localUtil.ntoc( Z11945DVCC_NumAl, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11946DVCC_HDR", GXutil.rtrim( Z11946DVCC_HDR));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11947DVCC_Hdr1", GXutil.ltrim( localUtil.ntoc( Z11947DVCC_Hdr1, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11948DVCC_Hdr2", GXutil.ltrim( localUtil.ntoc( Z11948DVCC_Hdr2, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11949DVCC_Hdr3", GXutil.rtrim( Z11949DVCC_Hdr3));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Dvcc_almco( )
   {
      n11941DVCC_AlmCo = false ;
      /* Using cursor T01IQ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n11941DVCC_AlmCo), Byte.valueOf(A11941DVCC_AlmCo)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DVPrd Alm", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DVCC_ALMCO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(12);
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DVPRDNUM","{handler:'valid_Dvprdnum',iparms:[]");
      setEventMetadata("VALID_DVPRDNUM",",oparms:[]}");
      setEventMetadata("VALID_DVCC_LIN","{handler:'valid_Dvcc_lin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11935DVPrdNum',fld:'DVPRDNUM',pic:''},{av:'A11936DVCC_Lin',fld:'DVCC_LIN',pic:'ZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DVCC_LIN",",oparms:[{av:'A11937DVCC_Fech',fld:'DVCC_FECH',pic:'99/99/99 99:99'},{av:'A11938DVCC_Usu',fld:'DVCC_USU',pic:''},{av:'A11939DVCC_Term',fld:'DVCC_TERM',pic:''},{av:'A11940DVCC_Cant',fld:'DVCC_CANT',pic:'ZZZZZZ9.9999'},{av:'A11941DVCC_AlmCo',fld:'DVCC_ALMCO',pic:'Z9'},{av:'A11942DVTipMvCc',fld:'DVTIPMVCC',pic:''},{av:'A11943DVCC_Desc',fld:'DVCC_DESC',pic:''},{av:'A11944DVCC_Prec',fld:'DVCC_PREC',pic:'ZZZZZZZ9.99999'},{av:'A11945DVCC_NumAl',fld:'DVCC_NUMAL',pic:'ZZZZZZZ9'},{av:'A11946DVCC_HDR',fld:'DVCC_HDR',pic:''},{av:'A11947DVCC_Hdr1',fld:'DVCC_HDR1',pic:'ZZZZZZZ9'},{av:'A11948DVCC_Hdr2',fld:'DVCC_HDR2',pic:'9'},{av:'A11949DVCC_Hdr3',fld:'DVCC_HDR3',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11935DVPrdNum'},{av:'Z11936DVCC_Lin'},{av:'Z11937DVCC_Fech'},{av:'Z11938DVCC_Usu'},{av:'Z11939DVCC_Term'},{av:'Z11940DVCC_Cant'},{av:'Z11941DVCC_AlmCo'},{av:'Z11942DVTipMvCc'},{av:'Z11943DVCC_Desc'},{av:'Z11944DVCC_Prec'},{av:'Z11945DVCC_NumAl'},{av:'Z11946DVCC_HDR'},{av:'Z11947DVCC_Hdr1'},{av:'Z11948DVCC_Hdr2'},{av:'Z11949DVCC_Hdr3'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DVCC_ALMCO","{handler:'valid_Dvcc_almco',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11935DVPrdNum',fld:'DVPRDNUM',pic:''},{av:'A11941DVCC_AlmCo',fld:'DVCC_ALMCO',pic:'Z9'}]");
      setEventMetadata("VALID_DVCC_ALMCO",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11935DVPrdNum = "" ;
      Z11937DVCC_Fech = GXutil.resetTime( GXutil.nullDate() );
      Z11938DVCC_Usu = "" ;
      Z11939DVCC_Term = "" ;
      Z11940DVCC_Cant = DecimalUtil.ZERO ;
      Z11942DVTipMvCc = "" ;
      Z11943DVCC_Desc = "" ;
      Z11944DVCC_Prec = DecimalUtil.ZERO ;
      Z11946DVCC_HDR = "" ;
      Z11949DVCC_Hdr3 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11935DVPrdNum = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A11937DVCC_Fech = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock5_Jsonclick = "" ;
      A11938DVCC_Usu = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11939DVCC_Term = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11940DVCC_Cant = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A11942DVTipMvCc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A11943DVCC_Desc = "" ;
      lblTextblock11_Jsonclick = "" ;
      A11944DVCC_Prec = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A11946DVCC_HDR = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A11949DVCC_Hdr3 = "" ;
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
      T01IQ5_A11936DVCC_Lin = new long[1] ;
      T01IQ5_A11937DVCC_Fech = new java.util.Date[] {GXutil.nullDate()} ;
      T01IQ5_n11937DVCC_Fech = new boolean[] {false} ;
      T01IQ5_A11938DVCC_Usu = new String[] {""} ;
      T01IQ5_n11938DVCC_Usu = new boolean[] {false} ;
      T01IQ5_A11939DVCC_Term = new String[] {""} ;
      T01IQ5_n11939DVCC_Term = new boolean[] {false} ;
      T01IQ5_A11940DVCC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IQ5_n11940DVCC_Cant = new boolean[] {false} ;
      T01IQ5_A11942DVTipMvCc = new String[] {""} ;
      T01IQ5_n11942DVTipMvCc = new boolean[] {false} ;
      T01IQ5_A11943DVCC_Desc = new String[] {""} ;
      T01IQ5_n11943DVCC_Desc = new boolean[] {false} ;
      T01IQ5_A11944DVCC_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IQ5_n11944DVCC_Prec = new boolean[] {false} ;
      T01IQ5_A11945DVCC_NumAl = new int[1] ;
      T01IQ5_n11945DVCC_NumAl = new boolean[] {false} ;
      T01IQ5_A11946DVCC_HDR = new String[] {""} ;
      T01IQ5_n11946DVCC_HDR = new boolean[] {false} ;
      T01IQ5_A11947DVCC_Hdr1 = new int[1] ;
      T01IQ5_n11947DVCC_Hdr1 = new boolean[] {false} ;
      T01IQ5_A11948DVCC_Hdr2 = new byte[1] ;
      T01IQ5_n11948DVCC_Hdr2 = new boolean[] {false} ;
      T01IQ5_A11949DVCC_Hdr3 = new String[] {""} ;
      T01IQ5_n11949DVCC_Hdr3 = new boolean[] {false} ;
      T01IQ5_A396EmprCod = new String[] {""} ;
      T01IQ5_A11935DVPrdNum = new String[] {""} ;
      T01IQ5_A11941DVCC_AlmCo = new byte[1] ;
      T01IQ5_n11941DVCC_AlmCo = new boolean[] {false} ;
      T01IQ4_A396EmprCod = new String[] {""} ;
      T01IQ6_A396EmprCod = new String[] {""} ;
      T01IQ7_A396EmprCod = new String[] {""} ;
      T01IQ7_A11935DVPrdNum = new String[] {""} ;
      T01IQ7_A11936DVCC_Lin = new long[1] ;
      T01IQ3_A11936DVCC_Lin = new long[1] ;
      T01IQ3_A11937DVCC_Fech = new java.util.Date[] {GXutil.nullDate()} ;
      T01IQ3_n11937DVCC_Fech = new boolean[] {false} ;
      T01IQ3_A11938DVCC_Usu = new String[] {""} ;
      T01IQ3_n11938DVCC_Usu = new boolean[] {false} ;
      T01IQ3_A11939DVCC_Term = new String[] {""} ;
      T01IQ3_n11939DVCC_Term = new boolean[] {false} ;
      T01IQ3_A11940DVCC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IQ3_n11940DVCC_Cant = new boolean[] {false} ;
      T01IQ3_A11942DVTipMvCc = new String[] {""} ;
      T01IQ3_n11942DVTipMvCc = new boolean[] {false} ;
      T01IQ3_A11943DVCC_Desc = new String[] {""} ;
      T01IQ3_n11943DVCC_Desc = new boolean[] {false} ;
      T01IQ3_A11944DVCC_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IQ3_n11944DVCC_Prec = new boolean[] {false} ;
      T01IQ3_A11945DVCC_NumAl = new int[1] ;
      T01IQ3_n11945DVCC_NumAl = new boolean[] {false} ;
      T01IQ3_A11946DVCC_HDR = new String[] {""} ;
      T01IQ3_n11946DVCC_HDR = new boolean[] {false} ;
      T01IQ3_A11947DVCC_Hdr1 = new int[1] ;
      T01IQ3_n11947DVCC_Hdr1 = new boolean[] {false} ;
      T01IQ3_A11948DVCC_Hdr2 = new byte[1] ;
      T01IQ3_n11948DVCC_Hdr2 = new boolean[] {false} ;
      T01IQ3_A11949DVCC_Hdr3 = new String[] {""} ;
      T01IQ3_n11949DVCC_Hdr3 = new boolean[] {false} ;
      T01IQ3_A396EmprCod = new String[] {""} ;
      T01IQ3_A11935DVPrdNum = new String[] {""} ;
      T01IQ3_A11941DVCC_AlmCo = new byte[1] ;
      T01IQ3_n11941DVCC_AlmCo = new boolean[] {false} ;
      sMode1674 = "" ;
      T01IQ8_A396EmprCod = new String[] {""} ;
      T01IQ8_A11935DVPrdNum = new String[] {""} ;
      T01IQ8_A11936DVCC_Lin = new long[1] ;
      T01IQ9_A396EmprCod = new String[] {""} ;
      T01IQ9_A11935DVPrdNum = new String[] {""} ;
      T01IQ9_A11936DVCC_Lin = new long[1] ;
      T01IQ2_A11936DVCC_Lin = new long[1] ;
      T01IQ2_A11937DVCC_Fech = new java.util.Date[] {GXutil.nullDate()} ;
      T01IQ2_n11937DVCC_Fech = new boolean[] {false} ;
      T01IQ2_A11938DVCC_Usu = new String[] {""} ;
      T01IQ2_n11938DVCC_Usu = new boolean[] {false} ;
      T01IQ2_A11939DVCC_Term = new String[] {""} ;
      T01IQ2_n11939DVCC_Term = new boolean[] {false} ;
      T01IQ2_A11940DVCC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IQ2_n11940DVCC_Cant = new boolean[] {false} ;
      T01IQ2_A11942DVTipMvCc = new String[] {""} ;
      T01IQ2_n11942DVTipMvCc = new boolean[] {false} ;
      T01IQ2_A11943DVCC_Desc = new String[] {""} ;
      T01IQ2_n11943DVCC_Desc = new boolean[] {false} ;
      T01IQ2_A11944DVCC_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IQ2_n11944DVCC_Prec = new boolean[] {false} ;
      T01IQ2_A11945DVCC_NumAl = new int[1] ;
      T01IQ2_n11945DVCC_NumAl = new boolean[] {false} ;
      T01IQ2_A11946DVCC_HDR = new String[] {""} ;
      T01IQ2_n11946DVCC_HDR = new boolean[] {false} ;
      T01IQ2_A11947DVCC_Hdr1 = new int[1] ;
      T01IQ2_n11947DVCC_Hdr1 = new boolean[] {false} ;
      T01IQ2_A11948DVCC_Hdr2 = new byte[1] ;
      T01IQ2_n11948DVCC_Hdr2 = new boolean[] {false} ;
      T01IQ2_A11949DVCC_Hdr3 = new String[] {""} ;
      T01IQ2_n11949DVCC_Hdr3 = new boolean[] {false} ;
      T01IQ2_A396EmprCod = new String[] {""} ;
      T01IQ2_A11935DVPrdNum = new String[] {""} ;
      T01IQ2_A11941DVCC_AlmCo = new byte[1] ;
      T01IQ2_n11941DVCC_AlmCo = new boolean[] {false} ;
      T01IQ13_A396EmprCod = new String[] {""} ;
      T01IQ13_A11935DVPrdNum = new String[] {""} ;
      T01IQ13_A11936DVCC_Lin = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ11935DVPrdNum = "" ;
      ZZ11937DVCC_Fech = GXutil.resetTime( GXutil.nullDate() );
      ZZ11938DVCC_Usu = "" ;
      ZZ11939DVCC_Term = "" ;
      ZZ11940DVCC_Cant = DecimalUtil.ZERO ;
      ZZ11942DVTipMvCc = "" ;
      ZZ11943DVCC_Desc = "" ;
      ZZ11944DVCC_Prec = DecimalUtil.ZERO ;
      ZZ11946DVCC_HDR = "" ;
      ZZ11949DVCC_Hdr3 = "" ;
      T01IQ14_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdvccalm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdvccalm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdvccalm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdvccalm__default(),
         new Object[] {
             new Object[] {
            T01IQ2_A11936DVCC_Lin, T01IQ2_A11937DVCC_Fech, T01IQ2_n11937DVCC_Fech, T01IQ2_A11938DVCC_Usu, T01IQ2_n11938DVCC_Usu, T01IQ2_A11939DVCC_Term, T01IQ2_n11939DVCC_Term, T01IQ2_A11940DVCC_Cant, T01IQ2_n11940DVCC_Cant, T01IQ2_A11942DVTipMvCc,
            T01IQ2_n11942DVTipMvCc, T01IQ2_A11943DVCC_Desc, T01IQ2_n11943DVCC_Desc, T01IQ2_A11944DVCC_Prec, T01IQ2_n11944DVCC_Prec, T01IQ2_A11945DVCC_NumAl, T01IQ2_n11945DVCC_NumAl, T01IQ2_A11946DVCC_HDR, T01IQ2_n11946DVCC_HDR, T01IQ2_A11947DVCC_Hdr1,
            T01IQ2_n11947DVCC_Hdr1, T01IQ2_A11948DVCC_Hdr2, T01IQ2_n11948DVCC_Hdr2, T01IQ2_A11949DVCC_Hdr3, T01IQ2_n11949DVCC_Hdr3, T01IQ2_A396EmprCod, T01IQ2_A11935DVPrdNum, T01IQ2_A11941DVCC_AlmCo, T01IQ2_n11941DVCC_AlmCo
            }
            , new Object[] {
            T01IQ3_A11936DVCC_Lin, T01IQ3_A11937DVCC_Fech, T01IQ3_n11937DVCC_Fech, T01IQ3_A11938DVCC_Usu, T01IQ3_n11938DVCC_Usu, T01IQ3_A11939DVCC_Term, T01IQ3_n11939DVCC_Term, T01IQ3_A11940DVCC_Cant, T01IQ3_n11940DVCC_Cant, T01IQ3_A11942DVTipMvCc,
            T01IQ3_n11942DVTipMvCc, T01IQ3_A11943DVCC_Desc, T01IQ3_n11943DVCC_Desc, T01IQ3_A11944DVCC_Prec, T01IQ3_n11944DVCC_Prec, T01IQ3_A11945DVCC_NumAl, T01IQ3_n11945DVCC_NumAl, T01IQ3_A11946DVCC_HDR, T01IQ3_n11946DVCC_HDR, T01IQ3_A11947DVCC_Hdr1,
            T01IQ3_n11947DVCC_Hdr1, T01IQ3_A11948DVCC_Hdr2, T01IQ3_n11948DVCC_Hdr2, T01IQ3_A11949DVCC_Hdr3, T01IQ3_n11949DVCC_Hdr3, T01IQ3_A396EmprCod, T01IQ3_A11935DVPrdNum, T01IQ3_A11941DVCC_AlmCo, T01IQ3_n11941DVCC_AlmCo
            }
            , new Object[] {
            T01IQ4_A396EmprCod
            }
            , new Object[] {
            T01IQ5_A11936DVCC_Lin, T01IQ5_A11937DVCC_Fech, T01IQ5_n11937DVCC_Fech, T01IQ5_A11938DVCC_Usu, T01IQ5_n11938DVCC_Usu, T01IQ5_A11939DVCC_Term, T01IQ5_n11939DVCC_Term, T01IQ5_A11940DVCC_Cant, T01IQ5_n11940DVCC_Cant, T01IQ5_A11942DVTipMvCc,
            T01IQ5_n11942DVTipMvCc, T01IQ5_A11943DVCC_Desc, T01IQ5_n11943DVCC_Desc, T01IQ5_A11944DVCC_Prec, T01IQ5_n11944DVCC_Prec, T01IQ5_A11945DVCC_NumAl, T01IQ5_n11945DVCC_NumAl, T01IQ5_A11946DVCC_HDR, T01IQ5_n11946DVCC_HDR, T01IQ5_A11947DVCC_Hdr1,
            T01IQ5_n11947DVCC_Hdr1, T01IQ5_A11948DVCC_Hdr2, T01IQ5_n11948DVCC_Hdr2, T01IQ5_A11949DVCC_Hdr3, T01IQ5_n11949DVCC_Hdr3, T01IQ5_A396EmprCod, T01IQ5_A11935DVPrdNum, T01IQ5_A11941DVCC_AlmCo, T01IQ5_n11941DVCC_AlmCo
            }
            , new Object[] {
            T01IQ6_A396EmprCod
            }
            , new Object[] {
            T01IQ7_A396EmprCod, T01IQ7_A11935DVPrdNum, T01IQ7_A11936DVCC_Lin
            }
            , new Object[] {
            T01IQ8_A396EmprCod, T01IQ8_A11935DVPrdNum, T01IQ8_A11936DVCC_Lin
            }
            , new Object[] {
            T01IQ9_A396EmprCod, T01IQ9_A11935DVPrdNum, T01IQ9_A11936DVCC_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IQ13_A396EmprCod, T01IQ13_A11935DVPrdNum, T01IQ13_A11936DVCC_Lin
            }
            , new Object[] {
            T01IQ14_A396EmprCod
            }
         }
      );
   }

   private byte Z11948DVCC_Hdr2 ;
   private byte Z11941DVCC_AlmCo ;
   private byte GxWebError ;
   private byte A11941DVCC_AlmCo ;
   private byte nKeyPressed ;
   private byte A11948DVCC_Hdr2 ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11941DVCC_AlmCo ;
   private byte ZZ11948DVCC_Hdr2 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1674 ;
   private short nIsDirty_1674 ;
   private int Z11945DVCC_NumAl ;
   private int Z11947DVCC_Hdr1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDVPrdNum_Enabled ;
   private int edtDVCC_Lin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDVCC_Fech_Enabled ;
   private int edtDVCC_Usu_Enabled ;
   private int edtDVCC_Term_Enabled ;
   private int edtDVCC_Cant_Enabled ;
   private int edtDVCC_AlmCo_Enabled ;
   private int edtDVTipMvCc_Enabled ;
   private int edtDVCC_Desc_Enabled ;
   private int edtDVCC_Prec_Enabled ;
   private int A11945DVCC_NumAl ;
   private int edtDVCC_NumAl_Enabled ;
   private int edtDVCC_HDR_Enabled ;
   private int A11947DVCC_Hdr1 ;
   private int edtDVCC_Hdr1_Enabled ;
   private int edtDVCC_Hdr2_Enabled ;
   private int edtDVCC_Hdr3_Enabled ;
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
   private int edtDVCC_Hdr3_Backcolor ;
   private int edtDVCC_Hdr2_Backcolor ;
   private int edtDVCC_Hdr1_Backcolor ;
   private int edtDVCC_HDR_Backcolor ;
   private int edtDVCC_NumAl_Backcolor ;
   private int edtDVCC_Prec_Backcolor ;
   private int edtDVCC_Desc_Backcolor ;
   private int edtDVTipMvCc_Backcolor ;
   private int edtDVCC_AlmCo_Backcolor ;
   private int edtDVCC_Cant_Backcolor ;
   private int edtDVCC_Term_Backcolor ;
   private int edtDVCC_Usu_Backcolor ;
   private int edtDVCC_Fech_Backcolor ;
   private int edtDVCC_Lin_Backcolor ;
   private int edtDVPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11945DVCC_NumAl ;
   private int ZZ11947DVCC_Hdr1 ;
   private long Z11936DVCC_Lin ;
   private long A11936DVCC_Lin ;
   private long ZZ11936DVCC_Lin ;
   private java.math.BigDecimal Z11940DVCC_Cant ;
   private java.math.BigDecimal Z11944DVCC_Prec ;
   private java.math.BigDecimal A11940DVCC_Cant ;
   private java.math.BigDecimal A11944DVCC_Prec ;
   private java.math.BigDecimal ZZ11940DVCC_Cant ;
   private java.math.BigDecimal ZZ11944DVCC_Prec ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11935DVPrdNum ;
   private String Z11938DVCC_Usu ;
   private String Z11939DVCC_Term ;
   private String Z11942DVTipMvCc ;
   private String Z11943DVCC_Desc ;
   private String Z11946DVCC_HDR ;
   private String Z11949DVCC_Hdr3 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11935DVPrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtDVPrdNum_Internalname ;
   private String edtDVPrdNum_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDVCC_Lin_Internalname ;
   private String edtDVCC_Lin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDVCC_Fech_Internalname ;
   private String edtDVCC_Fech_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDVCC_Usu_Internalname ;
   private String A11938DVCC_Usu ;
   private String edtDVCC_Usu_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDVCC_Term_Internalname ;
   private String A11939DVCC_Term ;
   private String edtDVCC_Term_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDVCC_Cant_Internalname ;
   private String edtDVCC_Cant_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDVCC_AlmCo_Internalname ;
   private String edtDVCC_AlmCo_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDVTipMvCc_Internalname ;
   private String A11942DVTipMvCc ;
   private String edtDVTipMvCc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDVCC_Desc_Internalname ;
   private String A11943DVCC_Desc ;
   private String edtDVCC_Desc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDVCC_Prec_Internalname ;
   private String edtDVCC_Prec_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDVCC_NumAl_Internalname ;
   private String edtDVCC_NumAl_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDVCC_HDR_Internalname ;
   private String A11946DVCC_HDR ;
   private String edtDVCC_HDR_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDVCC_Hdr1_Internalname ;
   private String edtDVCC_Hdr1_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDVCC_Hdr2_Internalname ;
   private String edtDVCC_Hdr2_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDVCC_Hdr3_Internalname ;
   private String A11949DVCC_Hdr3 ;
   private String edtDVCC_Hdr3_Jsonclick ;
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
   private String sMode1674 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ11935DVPrdNum ;
   private String ZZ11938DVCC_Usu ;
   private String ZZ11939DVCC_Term ;
   private String ZZ11942DVTipMvCc ;
   private String ZZ11943DVCC_Desc ;
   private String ZZ11946DVCC_HDR ;
   private String ZZ11949DVCC_Hdr3 ;
   private java.util.Date Z11937DVCC_Fech ;
   private java.util.Date A11937DVCC_Fech ;
   private java.util.Date ZZ11937DVCC_Fech ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n11941DVCC_AlmCo ;
   private boolean wbErr ;
   private boolean n11937DVCC_Fech ;
   private boolean n11938DVCC_Usu ;
   private boolean n11939DVCC_Term ;
   private boolean n11940DVCC_Cant ;
   private boolean n11942DVTipMvCc ;
   private boolean n11943DVCC_Desc ;
   private boolean n11944DVCC_Prec ;
   private boolean n11945DVCC_NumAl ;
   private boolean n11946DVCC_HDR ;
   private boolean n11947DVCC_Hdr1 ;
   private boolean n11948DVCC_Hdr2 ;
   private boolean n11949DVCC_Hdr3 ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private long[] T01IQ5_A11936DVCC_Lin ;
   private java.util.Date[] T01IQ5_A11937DVCC_Fech ;
   private boolean[] T01IQ5_n11937DVCC_Fech ;
   private String[] T01IQ5_A11938DVCC_Usu ;
   private boolean[] T01IQ5_n11938DVCC_Usu ;
   private String[] T01IQ5_A11939DVCC_Term ;
   private boolean[] T01IQ5_n11939DVCC_Term ;
   private java.math.BigDecimal[] T01IQ5_A11940DVCC_Cant ;
   private boolean[] T01IQ5_n11940DVCC_Cant ;
   private String[] T01IQ5_A11942DVTipMvCc ;
   private boolean[] T01IQ5_n11942DVTipMvCc ;
   private String[] T01IQ5_A11943DVCC_Desc ;
   private boolean[] T01IQ5_n11943DVCC_Desc ;
   private java.math.BigDecimal[] T01IQ5_A11944DVCC_Prec ;
   private boolean[] T01IQ5_n11944DVCC_Prec ;
   private int[] T01IQ5_A11945DVCC_NumAl ;
   private boolean[] T01IQ5_n11945DVCC_NumAl ;
   private String[] T01IQ5_A11946DVCC_HDR ;
   private boolean[] T01IQ5_n11946DVCC_HDR ;
   private int[] T01IQ5_A11947DVCC_Hdr1 ;
   private boolean[] T01IQ5_n11947DVCC_Hdr1 ;
   private byte[] T01IQ5_A11948DVCC_Hdr2 ;
   private boolean[] T01IQ5_n11948DVCC_Hdr2 ;
   private String[] T01IQ5_A11949DVCC_Hdr3 ;
   private boolean[] T01IQ5_n11949DVCC_Hdr3 ;
   private String[] T01IQ5_A396EmprCod ;
   private String[] T01IQ5_A11935DVPrdNum ;
   private byte[] T01IQ5_A11941DVCC_AlmCo ;
   private boolean[] T01IQ5_n11941DVCC_AlmCo ;
   private String[] T01IQ4_A396EmprCod ;
   private String[] T01IQ6_A396EmprCod ;
   private String[] T01IQ7_A396EmprCod ;
   private String[] T01IQ7_A11935DVPrdNum ;
   private long[] T01IQ7_A11936DVCC_Lin ;
   private long[] T01IQ3_A11936DVCC_Lin ;
   private java.util.Date[] T01IQ3_A11937DVCC_Fech ;
   private boolean[] T01IQ3_n11937DVCC_Fech ;
   private String[] T01IQ3_A11938DVCC_Usu ;
   private boolean[] T01IQ3_n11938DVCC_Usu ;
   private String[] T01IQ3_A11939DVCC_Term ;
   private boolean[] T01IQ3_n11939DVCC_Term ;
   private java.math.BigDecimal[] T01IQ3_A11940DVCC_Cant ;
   private boolean[] T01IQ3_n11940DVCC_Cant ;
   private String[] T01IQ3_A11942DVTipMvCc ;
   private boolean[] T01IQ3_n11942DVTipMvCc ;
   private String[] T01IQ3_A11943DVCC_Desc ;
   private boolean[] T01IQ3_n11943DVCC_Desc ;
   private java.math.BigDecimal[] T01IQ3_A11944DVCC_Prec ;
   private boolean[] T01IQ3_n11944DVCC_Prec ;
   private int[] T01IQ3_A11945DVCC_NumAl ;
   private boolean[] T01IQ3_n11945DVCC_NumAl ;
   private String[] T01IQ3_A11946DVCC_HDR ;
   private boolean[] T01IQ3_n11946DVCC_HDR ;
   private int[] T01IQ3_A11947DVCC_Hdr1 ;
   private boolean[] T01IQ3_n11947DVCC_Hdr1 ;
   private byte[] T01IQ3_A11948DVCC_Hdr2 ;
   private boolean[] T01IQ3_n11948DVCC_Hdr2 ;
   private String[] T01IQ3_A11949DVCC_Hdr3 ;
   private boolean[] T01IQ3_n11949DVCC_Hdr3 ;
   private String[] T01IQ3_A396EmprCod ;
   private String[] T01IQ3_A11935DVPrdNum ;
   private byte[] T01IQ3_A11941DVCC_AlmCo ;
   private boolean[] T01IQ3_n11941DVCC_AlmCo ;
   private String[] T01IQ8_A396EmprCod ;
   private String[] T01IQ8_A11935DVPrdNum ;
   private long[] T01IQ8_A11936DVCC_Lin ;
   private String[] T01IQ9_A396EmprCod ;
   private String[] T01IQ9_A11935DVPrdNum ;
   private long[] T01IQ9_A11936DVCC_Lin ;
   private long[] T01IQ2_A11936DVCC_Lin ;
   private java.util.Date[] T01IQ2_A11937DVCC_Fech ;
   private boolean[] T01IQ2_n11937DVCC_Fech ;
   private String[] T01IQ2_A11938DVCC_Usu ;
   private boolean[] T01IQ2_n11938DVCC_Usu ;
   private String[] T01IQ2_A11939DVCC_Term ;
   private boolean[] T01IQ2_n11939DVCC_Term ;
   private java.math.BigDecimal[] T01IQ2_A11940DVCC_Cant ;
   private boolean[] T01IQ2_n11940DVCC_Cant ;
   private String[] T01IQ2_A11942DVTipMvCc ;
   private boolean[] T01IQ2_n11942DVTipMvCc ;
   private String[] T01IQ2_A11943DVCC_Desc ;
   private boolean[] T01IQ2_n11943DVCC_Desc ;
   private java.math.BigDecimal[] T01IQ2_A11944DVCC_Prec ;
   private boolean[] T01IQ2_n11944DVCC_Prec ;
   private int[] T01IQ2_A11945DVCC_NumAl ;
   private boolean[] T01IQ2_n11945DVCC_NumAl ;
   private String[] T01IQ2_A11946DVCC_HDR ;
   private boolean[] T01IQ2_n11946DVCC_HDR ;
   private int[] T01IQ2_A11947DVCC_Hdr1 ;
   private boolean[] T01IQ2_n11947DVCC_Hdr1 ;
   private byte[] T01IQ2_A11948DVCC_Hdr2 ;
   private boolean[] T01IQ2_n11948DVCC_Hdr2 ;
   private String[] T01IQ2_A11949DVCC_Hdr3 ;
   private boolean[] T01IQ2_n11949DVCC_Hdr3 ;
   private String[] T01IQ2_A396EmprCod ;
   private String[] T01IQ2_A11935DVPrdNum ;
   private byte[] T01IQ2_A11941DVCC_AlmCo ;
   private boolean[] T01IQ2_n11941DVCC_AlmCo ;
   private String[] T01IQ13_A396EmprCod ;
   private String[] T01IQ13_A11935DVPrdNum ;
   private long[] T01IQ13_A11936DVCC_Lin ;
   private String[] T01IQ14_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdvccalm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvccalm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvccalm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdvccalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IQ2", "SELECT CC_lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, TipMovCc, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3, Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_AlmCod AS DVCC_AlmCo FROM LVNCCALM WHERE Emprcod = ? AND Prdnum = ? AND CC_lin = ?  FOR UPDATE OF CC_Fech, CC_Usu, CC_Term, CC_Cant, TipMovCc, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3, CC_AlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IQ3", "SELECT CC_lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, TipMovCc, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3, Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_AlmCod AS DVCC_AlmCo FROM LVNCCALM WHERE Emprcod = ? AND Prdnum = ? AND CC_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IQ4", "SELECT Emprcod AS EmprCod FROM LVNPRDALM WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IQ5", "SELECT /*+ FIRST_ROWS(100) */ TM1.CC_lin, TM1.CC_Fech, TM1.CC_Usu, TM1.CC_Term, TM1.CC_Cant, TM1.TipMovCc, TM1.CC_Desc, TM1.CC_Prec, TM1.CC_NumAlb, TM1.CC_HDR, TM1.CC_Hdr1, TM1.CC_Hdr2, TM1.CC_Hdr3, TM1.Emprcod AS EmprCod, TM1.Prdnum AS DVPrdNum, TM1.CC_AlmCod AS DVCC_AlmCo FROM LVNCCALM TM1 WHERE TM1.Emprcod = ? and TM1.Prdnum = ? and TM1.CC_lin = ? ORDER BY TM1.Emprcod, TM1.Prdnum, TM1.CC_lin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IQ6", "SELECT Emprcod AS EmprCod FROM LVNPRDALM WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IQ7", "SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_lin FROM LVNCCALM WHERE Emprcod = ? AND Prdnum = ? AND CC_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IQ8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_lin FROM LVNCCALM WHERE ( Emprcod > ? or Emprcod = ? and Prdnum > ? or Prdnum = ? and Emprcod = ? and CC_lin > ?) ORDER BY Emprcod, Prdnum, CC_lin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IQ9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_lin FROM LVNCCALM WHERE ( Emprcod < ? or Emprcod = ? and Prdnum < ? or Prdnum = ? and Emprcod = ? and CC_lin < ?) ORDER BY Emprcod DESC, Prdnum DESC, CC_lin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IQ10", "INSERT INTO LVNCCALM(CC_lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, TipMovCc, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3, Emprcod, Prdnum, CC_AlmCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "LVNCCALM")
         ,new UpdateCursor("T01IQ11", "UPDATE LVNCCALM SET CC_Fech=?, CC_Usu=?, CC_Term=?, CC_Cant=?, TipMovCc=?, CC_Desc=?, CC_Prec=?, CC_NumAlb=?, CC_HDR=?, CC_Hdr1=?, CC_Hdr2=?, CC_Hdr3=?, CC_AlmCod=?  WHERE Emprcod = ? AND Prdnum = ? AND CC_lin = ?", GX_NOMASK, "LVNCCALM")
         ,new UpdateCursor("T01IQ12", "DELETE FROM LVNCCALM  WHERE Emprcod = ? AND Prdnum = ? AND CC_lin = ?", GX_NOMASK, "LVNCCALM")
         ,new ForEachCursor("T01IQ13", "SELECT /*+ FIRST_ROWS(100) */ Emprcod AS EmprCod, Prdnum AS DVPrdNum, CC_lin FROM LVNCCALM ORDER BY Emprcod, Prdnum, CC_lin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IQ14", "SELECT Emprcod AS EmprCod FROM LVNPRDALM WHERE Emprcod = ? AND Prdnum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((String[]) buf[26])[0] = rslt.getString(15, 6);
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((String[]) buf[26])[0] = rslt.getString(15, 6);
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((String[]) buf[26])[0] = rslt.getString(15, 6);
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 12 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 4);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 10);
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
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 1);
               }
               stmt.setString(14, (String)parms[25], 3);
               stmt.setString(15, (String)parms[26], 6);
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[28]).byteValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 10);
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
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               stmt.setString(14, (String)parms[26], 3);
               stmt.setString(15, (String)parms[27], 6);
               stmt.setLong(16, ((Number) parms[28]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
      }
   }

}

