package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class topbchd_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "OP de EKAMAT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBCNumeroOP_Internalname ;
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
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
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

   public topbchd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public topbchd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( topbchd_impl.class ));
   }

   public topbchd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TOPBCHD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "NumeroOP", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCNumeroOP_Internalname, GXutil.ltrim( localUtil.ntoc( A13465BCNumeroOP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCNumeroOP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13465BCNumeroOP), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13465BCNumeroOP), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCNumeroOP_Jsonclick, 0, "", "", "", "", "", 1, edtBCNumeroOP_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha Vto", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBCFechaVto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCFechaVto_Internalname, localUtil.format(A13466BCFechaVto, "99/99/99"), localUtil.format( A13466BCFechaVto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCFechaVto_Jsonclick, 0, "", "", "", "", "", 1, edtBCFechaVto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCHD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBCFechaVto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBCFechaVto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TOPBCHD.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCColor_Internalname, GXutil.rtrim( A13467BCColor), GXutil.rtrim( localUtil.format( A13467BCColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCColor_Jsonclick, 0, "", "", "", "", "", 1, edtBCColor_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCArticulo_Internalname, GXutil.rtrim( A13468BCArticulo), GXutil.rtrim( localUtil.format( A13468BCArticulo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCArticulo_Jsonclick, 0, "", "", "", "", "", 1, edtBCArticulo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Empesa", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCEmpesa_Internalname, GXutil.rtrim( A13469BCEmpesa), GXutil.rtrim( localUtil.format( A13469BCEmpesa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCEmpesa_Jsonclick, 0, "", "", "", "", "", 1, edtBCEmpesa_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "NumeroRuta", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCNumeroRu_Internalname, GXutil.rtrim( A13470BCNumeroRu), GXutil.rtrim( localUtil.format( A13470BCNumeroRu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCNumeroRu_Jsonclick, 0, "", "", "", "", "", 1, edtBCNumeroRu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "MetrosStk", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCMetrosSt_Internalname, GXutil.ltrim( localUtil.ntoc( A13471BCMetrosSt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCMetrosSt_Enabled!=0) ? localUtil.format( A13471BCMetrosSt, "ZZZZZ9.99") : localUtil.format( A13471BCMetrosSt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCMetrosSt_Jsonclick, 0, "", "", "", "", "", 1, edtBCMetrosSt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "MetrosCliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCMetrosCl_Internalname, GXutil.ltrim( localUtil.ntoc( A13472BCMetrosCl, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCMetrosCl_Enabled!=0) ? localUtil.format( A13472BCMetrosCl, "ZZZZZ9.99") : localUtil.format( A13472BCMetrosCl, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCMetrosCl_Jsonclick, 0, "", "", "", "", "", 1, edtBCMetrosCl_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A13473BCEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCEstado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13473BCEstado), "9") : localUtil.format( DecimalUtil.doubleToDec(A13473BCEstado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCEstado_Jsonclick, 0, "", "", "", "", "", 1, edtBCEstado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1843 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1843 = (short)(1) ;
            scanStart1OC1843( ) ;
            while ( RcdFound1843 != 0 )
            {
               init_level_properties1843( ) ;
               getByPrimaryKey1OC1843( ) ;
               addRow1OC1843( ) ;
               scanNext1OC1843( ) ;
            }
            scanEnd1OC1843( ) ;
            nBlankRcdCount1843 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1OC1843( ) ;
         standaloneModal1OC1843( ) ;
         sMode1843 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow1OC1843( ) ;
            edtavnRcdDeleted_1843_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1843_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1843_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1843_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBCPieza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCPIEZA_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPieza_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBCMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCMETROS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCMetros_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBCKIlos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCKILOS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCKIlos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCKIlos_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBCPiezaOri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCPIEZAORI_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCPiezaOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPiezaOri_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_1843 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OC1843( ) ;
            }
            sendRow1OC1843( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode1843 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1843 = (short)(5) ;
         nRcdExists_1843 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OC1843( ) ;
            while ( RcdFound1843 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_751843( ) ;
               init_level_properties1843( ) ;
               standaloneNotModal1OC1843( ) ;
               getByPrimaryKey1OC1843( ) ;
               standaloneModal1OC1843( ) ;
               addRow1OC1843( ) ;
               scanNext1OC1843( ) ;
            }
            scanEnd1OC1843( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1843 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_751843( ) ;
      initAll1OC1843( ) ;
      init_level_properties1843( ) ;
      nRcdExists_1843 = (short)(0) ;
      nIsMod_1843 = (short)(0) ;
      nRcdDeleted_1843 = (short)(0) ;
      nBlankRcdCount1843 = (short)(nBlankRcdUsr1843+nBlankRcdCount1843) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1843 > 0 )
      {
         standaloneNotModal1OC1843( ) ;
         standaloneModal1OC1843( ) ;
         addRow1OC1843( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBCPieza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1843 = (short)(nBlankRcdCount1843-1) ;
      }
      Gx_mode = sMode1843 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TOPBCHD.htm");
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
      e111OC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13465BCNumeroOP = (int)(localUtil.ctol( httpContext.cgiGet( "Z13465BCNumeroOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13466BCFechaVto = localUtil.ctod( httpContext.cgiGet( "Z13466BCFechaVto"), 0) ;
            Z13467BCColor = httpContext.cgiGet( "Z13467BCColor") ;
            Z13468BCArticulo = httpContext.cgiGet( "Z13468BCArticulo") ;
            Z13469BCEmpesa = httpContext.cgiGet( "Z13469BCEmpesa") ;
            Z13470BCNumeroRu = httpContext.cgiGet( "Z13470BCNumeroRu") ;
            Z13471BCMetrosSt = localUtil.ctond( httpContext.cgiGet( "Z13471BCMetrosSt")) ;
            Z13472BCMetrosCl = localUtil.ctond( httpContext.cgiGet( "Z13472BCMetrosCl")) ;
            Z13473BCEstado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13473BCEstado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCNUMEROOP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13465BCNumeroOP = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            }
            else
            {
               A13465BCNumeroOP = (int)(localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtBCFechaVto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BCFECHAVTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCFechaVto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13466BCFechaVto = GXutil.nullDate() ;
               n13466BCFechaVto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13466BCFechaVto", localUtil.format(A13466BCFechaVto, "99/99/99"));
            }
            else
            {
               A13466BCFechaVto = localUtil.ctod( httpContext.cgiGet( edtBCFechaVto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13466BCFechaVto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13466BCFechaVto", localUtil.format(A13466BCFechaVto, "99/99/99"));
            }
            A13467BCColor = httpContext.cgiGet( edtBCColor_Internalname) ;
            n13467BCColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13467BCColor", A13467BCColor);
            A13468BCArticulo = httpContext.cgiGet( edtBCArticulo_Internalname) ;
            n13468BCArticulo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13468BCArticulo", A13468BCArticulo);
            A13469BCEmpesa = httpContext.cgiGet( edtBCEmpesa_Internalname) ;
            n13469BCEmpesa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13469BCEmpesa", A13469BCEmpesa);
            A13470BCNumeroRu = httpContext.cgiGet( edtBCNumeroRu_Internalname) ;
            n13470BCNumeroRu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13470BCNumeroRu", A13470BCNumeroRu);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCMetrosSt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCMetrosSt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCMETROSST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCMetrosSt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13471BCMetrosSt = DecimalUtil.ZERO ;
               n13471BCMetrosSt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13471BCMetrosSt", GXutil.ltrimstr( A13471BCMetrosSt, 9, 2));
            }
            else
            {
               A13471BCMetrosSt = localUtil.ctond( httpContext.cgiGet( edtBCMetrosSt_Internalname)) ;
               n13471BCMetrosSt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13471BCMetrosSt", GXutil.ltrimstr( A13471BCMetrosSt, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCMetrosCl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCMetrosCl_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCMETROSCL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCMetrosCl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13472BCMetrosCl = DecimalUtil.ZERO ;
               n13472BCMetrosCl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13472BCMetrosCl", GXutil.ltrimstr( A13472BCMetrosCl, 9, 2));
            }
            else
            {
               A13472BCMetrosCl = localUtil.ctond( httpContext.cgiGet( edtBCMetrosCl_Internalname)) ;
               n13472BCMetrosCl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13472BCMetrosCl", GXutil.ltrimstr( A13472BCMetrosCl, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCESTADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCEstado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13473BCEstado = (byte)(0) ;
               n13473BCEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13473BCEstado", GXutil.str( A13473BCEstado, 1, 0));
            }
            else
            {
               A13473BCEstado = (byte)(localUtil.ctol( httpContext.cgiGet( edtBCEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13473BCEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13473BCEstado", GXutil.str( A13473BCEstado, 1, 0));
            }
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
               A13465BCNumeroOP = (int)(GXutil.lval( httpContext.GetPar( "BCNumeroOP"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
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
                        e111OC2 ();
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
            initAll1OC1842( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1843_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1843_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributes1OC1842( ) ;
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

   public void confirm_1OC0( )
   {
      beforeValidate1OC1842( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OC1842( ) ;
         }
         else
         {
            checkExtendedTable1OC1842( ) ;
            if ( AnyError == 0 )
            {
               zm1OC1842( 6) ;
            }
            closeExtendedTableCursors1OC1842( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1842 = Gx_mode ;
         confirm_1OC1843( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1842 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1842 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1OC0( ) ;
      }
   }

   public void confirm_1OC1843( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1OC1843( ) ;
         if ( ( nRcdExists_1843 != 0 ) || ( nIsMod_1843 != 0 ) )
         {
            getKey1OC1843( ) ;
            if ( ( nRcdExists_1843 == 0 ) && ( nRcdDeleted_1843 == 0 ) )
            {
               if ( RcdFound1843 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OC1843( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OC1843( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1OC1843( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BCPIEZA_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBCPieza_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1843 != 0 )
               {
                  if ( nRcdDeleted_1843 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OC1843( ) ;
                     load1OC1843( ) ;
                     beforeValidate1OC1843( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OC1843( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1843 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OC1843( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OC1843( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1OC1843( ) ;
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
                  if ( nRcdDeleted_1843 == 0 )
                  {
                     GXCCtl = "BCPIEZA_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBCPieza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1843_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCPieza_Internalname, GXutil.rtrim( A13474BCPieza)) ;
         httpContext.changePostValue( edtBCMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13475BCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCKIlos_Internalname, GXutil.ltrim( localUtil.ntoc( A13476BCKIlos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCPiezaOri_Internalname, GXutil.rtrim( A13477BCPiezaOri)) ;
         httpContext.changePostValue( "ZT_"+"Z13474BCPieza_"+sGXsfl_75_idx, GXutil.rtrim( Z13474BCPieza)) ;
         httpContext.changePostValue( "ZT_"+"Z13477BCPiezaOri_"+sGXsfl_75_idx, GXutil.rtrim( Z13477BCPiezaOri)) ;
         httpContext.changePostValue( "ZT_"+"Z13475BCMetros_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z13475BCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13476BCKIlos_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z13476BCKIlos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1843_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1843_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1843_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1843 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1843_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1843_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCPIEZA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPieza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCMETROS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCKILOS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCKIlos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCPIEZAORI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPiezaOri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1OC0( )
   {
   }

   public void e111OC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      topbchd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      topbchd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      topbchd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      topbchd_impl.this.A396EmprCod = GXv_char2[0] ;
      topbchd_impl.this.AV11EmprNom = GXv_char3[0] ;
      topbchd_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1OC1842( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13466BCFechaVto = T01OC5_A13466BCFechaVto[0] ;
            Z13467BCColor = T01OC5_A13467BCColor[0] ;
            Z13468BCArticulo = T01OC5_A13468BCArticulo[0] ;
            Z13469BCEmpesa = T01OC5_A13469BCEmpesa[0] ;
            Z13470BCNumeroRu = T01OC5_A13470BCNumeroRu[0] ;
            Z13471BCMetrosSt = T01OC5_A13471BCMetrosSt[0] ;
            Z13472BCMetrosCl = T01OC5_A13472BCMetrosCl[0] ;
            Z13473BCEstado = T01OC5_A13473BCEstado[0] ;
         }
         else
         {
            Z13466BCFechaVto = A13466BCFechaVto ;
            Z13467BCColor = A13467BCColor ;
            Z13468BCArticulo = A13468BCArticulo ;
            Z13469BCEmpesa = A13469BCEmpesa ;
            Z13470BCNumeroRu = A13470BCNumeroRu ;
            Z13471BCMetrosSt = A13471BCMetrosSt ;
            Z13472BCMetrosCl = A13472BCMetrosCl ;
            Z13473BCEstado = A13473BCEstado ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z13466BCFechaVto = A13466BCFechaVto ;
         Z13467BCColor = A13467BCColor ;
         Z13468BCArticulo = A13468BCArticulo ;
         Z13469BCEmpesa = A13469BCEmpesa ;
         Z13470BCNumeroRu = A13470BCNumeroRu ;
         Z13471BCMetrosSt = A13471BCMetrosSt ;
         Z13472BCMetrosCl = A13472BCMetrosCl ;
         Z13473BCEstado = A13473BCEstado ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TOPBCHD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01OC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OC6_A407EmprNom[0] ;
      n407EmprNom = T01OC6_n407EmprNom[0] ;
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

   public void load1OC1842( )
   {
      /* Using cursor T01OC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1842 = (short)(1) ;
         A407EmprNom = T01OC7_A407EmprNom[0] ;
         n407EmprNom = T01OC7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13466BCFechaVto = T01OC7_A13466BCFechaVto[0] ;
         n13466BCFechaVto = T01OC7_n13466BCFechaVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13466BCFechaVto", localUtil.format(A13466BCFechaVto, "99/99/99"));
         A13467BCColor = T01OC7_A13467BCColor[0] ;
         n13467BCColor = T01OC7_n13467BCColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13467BCColor", A13467BCColor);
         A13468BCArticulo = T01OC7_A13468BCArticulo[0] ;
         n13468BCArticulo = T01OC7_n13468BCArticulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13468BCArticulo", A13468BCArticulo);
         A13469BCEmpesa = T01OC7_A13469BCEmpesa[0] ;
         n13469BCEmpesa = T01OC7_n13469BCEmpesa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13469BCEmpesa", A13469BCEmpesa);
         A13470BCNumeroRu = T01OC7_A13470BCNumeroRu[0] ;
         n13470BCNumeroRu = T01OC7_n13470BCNumeroRu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13470BCNumeroRu", A13470BCNumeroRu);
         A13471BCMetrosSt = T01OC7_A13471BCMetrosSt[0] ;
         n13471BCMetrosSt = T01OC7_n13471BCMetrosSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13471BCMetrosSt", GXutil.ltrimstr( A13471BCMetrosSt, 9, 2));
         A13472BCMetrosCl = T01OC7_A13472BCMetrosCl[0] ;
         n13472BCMetrosCl = T01OC7_n13472BCMetrosCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13472BCMetrosCl", GXutil.ltrimstr( A13472BCMetrosCl, 9, 2));
         A13473BCEstado = T01OC7_A13473BCEstado[0] ;
         n13473BCEstado = T01OC7_n13473BCEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13473BCEstado", GXutil.str( A13473BCEstado, 1, 0));
         zm1OC1842( -5) ;
      }
      pr_default.close(5);
      onLoadActions1OC1842( ) ;
   }

   public void onLoadActions1OC1842( )
   {
   }

   public void checkExtendedTable1OC1842( )
   {
      nIsDirty_1842 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (0==A13465BCNumeroOP) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCNumeroOP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1OC1842( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1OC1842( )
   {
      /* Using cursor T01OC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1842 = (short)(1) ;
      }
      else
      {
         RcdFound1842 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01OC5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OC1842( 5) ;
         RcdFound1842 = (short)(1) ;
         A13465BCNumeroOP = T01OC5_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         A13466BCFechaVto = T01OC5_A13466BCFechaVto[0] ;
         n13466BCFechaVto = T01OC5_n13466BCFechaVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13466BCFechaVto", localUtil.format(A13466BCFechaVto, "99/99/99"));
         A13467BCColor = T01OC5_A13467BCColor[0] ;
         n13467BCColor = T01OC5_n13467BCColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13467BCColor", A13467BCColor);
         A13468BCArticulo = T01OC5_A13468BCArticulo[0] ;
         n13468BCArticulo = T01OC5_n13468BCArticulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13468BCArticulo", A13468BCArticulo);
         A13469BCEmpesa = T01OC5_A13469BCEmpesa[0] ;
         n13469BCEmpesa = T01OC5_n13469BCEmpesa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13469BCEmpesa", A13469BCEmpesa);
         A13470BCNumeroRu = T01OC5_A13470BCNumeroRu[0] ;
         n13470BCNumeroRu = T01OC5_n13470BCNumeroRu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13470BCNumeroRu", A13470BCNumeroRu);
         A13471BCMetrosSt = T01OC5_A13471BCMetrosSt[0] ;
         n13471BCMetrosSt = T01OC5_n13471BCMetrosSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13471BCMetrosSt", GXutil.ltrimstr( A13471BCMetrosSt, 9, 2));
         A13472BCMetrosCl = T01OC5_A13472BCMetrosCl[0] ;
         n13472BCMetrosCl = T01OC5_n13472BCMetrosCl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13472BCMetrosCl", GXutil.ltrimstr( A13472BCMetrosCl, 9, 2));
         A13473BCEstado = T01OC5_A13473BCEstado[0] ;
         n13473BCEstado = T01OC5_n13473BCEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13473BCEstado", GXutil.str( A13473BCEstado, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         sMode1842 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1OC1842( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1842 = (short)(0) ;
            initializeNonKey1OC1842( ) ;
         }
         Gx_mode = sMode1842 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1842 = (short)(0) ;
         initializeNonKey1OC1842( ) ;
         sMode1842 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1842 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1OC1842( ) ;
      if ( RcdFound1842 == 0 )
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
      RcdFound1842 = (short)(0) ;
      /* Using cursor T01OC9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A13465BCNumeroOP), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01OC9_A13465BCNumeroOP[0] < A13465BCNumeroOP ) ) && ( GXutil.strcmp(T01OC9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01OC9_A13465BCNumeroOP[0] > A13465BCNumeroOP ) ) && ( GXutil.strcmp(T01OC9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13465BCNumeroOP = T01OC9_A13465BCNumeroOP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            RcdFound1842 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1842 = (short)(0) ;
      /* Using cursor T01OC10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A13465BCNumeroOP), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01OC10_A13465BCNumeroOP[0] > A13465BCNumeroOP ) ) && ( GXutil.strcmp(T01OC10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01OC10_A13465BCNumeroOP[0] < A13465BCNumeroOP ) ) && ( GXutil.strcmp(T01OC10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13465BCNumeroOP = T01OC10_A13465BCNumeroOP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            RcdFound1842 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OC1842( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBCNumeroOP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OC1842( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1842 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) )
            {
               A13465BCNumeroOP = Z13465BCNumeroOP ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1OC1842( ) ;
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OC1842( ) ;
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
                  GX_FocusControl = edtBCNumeroOP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OC1842( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) )
      {
         A13465BCNumeroOP = Z13465BCNumeroOP ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBCNumeroOP_Internalname ;
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
      getKey1OC1842( ) ;
      if ( RcdFound1842 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) )
         {
            A13465BCNumeroOP = Z13465BCNumeroOP ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "topbchd");
      GX_FocusControl = edtBCFechaVto_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1OC0( ) ;
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
      if ( RcdFound1842 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBCFechaVto_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1OC1842( ) ;
      if ( RcdFound1842 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCFechaVto_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OC1842( ) ;
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
      if ( RcdFound1842 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCFechaVto_Internalname ;
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
      if ( RcdFound1842 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCFechaVto_Internalname ;
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
      scanStart1OC1842( ) ;
      if ( RcdFound1842 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1842 != 0 )
         {
            scanNext1OC1842( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCFechaVto_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OC1842( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1OC1842( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OC4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCHD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z13466BCFechaVto), GXutil.resetTime(T01OC4_A13466BCFechaVto[0])) ) || ( GXutil.strcmp(Z13467BCColor, T01OC4_A13467BCColor[0]) != 0 ) || ( GXutil.strcmp(Z13468BCArticulo, T01OC4_A13468BCArticulo[0]) != 0 ) || ( GXutil.strcmp(Z13469BCEmpesa, T01OC4_A13469BCEmpesa[0]) != 0 ) || ( GXutil.strcmp(Z13470BCNumeroRu, T01OC4_A13470BCNumeroRu[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z13471BCMetrosSt, T01OC4_A13471BCMetrosSt[0]) != 0 ) || ( DecimalUtil.compareTo(Z13472BCMetrosCl, T01OC4_A13472BCMetrosCl[0]) != 0 ) || ( Z13473BCEstado != T01OC4_A13473BCEstado[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13466BCFechaVto), GXutil.resetTime(T01OC4_A13466BCFechaVto[0])) ) )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCFechaVto");
               GXutil.writeLogRaw("Old: ",Z13466BCFechaVto);
               GXutil.writeLogRaw("Current: ",T01OC4_A13466BCFechaVto[0]);
            }
            if ( GXutil.strcmp(Z13467BCColor, T01OC4_A13467BCColor[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCColor");
               GXutil.writeLogRaw("Old: ",Z13467BCColor);
               GXutil.writeLogRaw("Current: ",T01OC4_A13467BCColor[0]);
            }
            if ( GXutil.strcmp(Z13468BCArticulo, T01OC4_A13468BCArticulo[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCArticulo");
               GXutil.writeLogRaw("Old: ",Z13468BCArticulo);
               GXutil.writeLogRaw("Current: ",T01OC4_A13468BCArticulo[0]);
            }
            if ( GXutil.strcmp(Z13469BCEmpesa, T01OC4_A13469BCEmpesa[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCEmpesa");
               GXutil.writeLogRaw("Old: ",Z13469BCEmpesa);
               GXutil.writeLogRaw("Current: ",T01OC4_A13469BCEmpesa[0]);
            }
            if ( GXutil.strcmp(Z13470BCNumeroRu, T01OC4_A13470BCNumeroRu[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCNumeroRu");
               GXutil.writeLogRaw("Old: ",Z13470BCNumeroRu);
               GXutil.writeLogRaw("Current: ",T01OC4_A13470BCNumeroRu[0]);
            }
            if ( DecimalUtil.compareTo(Z13471BCMetrosSt, T01OC4_A13471BCMetrosSt[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCMetrosSt");
               GXutil.writeLogRaw("Old: ",Z13471BCMetrosSt);
               GXutil.writeLogRaw("Current: ",T01OC4_A13471BCMetrosSt[0]);
            }
            if ( DecimalUtil.compareTo(Z13472BCMetrosCl, T01OC4_A13472BCMetrosCl[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCMetrosCl");
               GXutil.writeLogRaw("Old: ",Z13472BCMetrosCl);
               GXutil.writeLogRaw("Current: ",T01OC4_A13472BCMetrosCl[0]);
            }
            if ( Z13473BCEstado != T01OC4_A13473BCEstado[0] )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCEstado");
               GXutil.writeLogRaw("Old: ",Z13473BCEstado);
               GXutil.writeLogRaw("Current: ",T01OC4_A13473BCEstado[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOPBCHD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OC1842( )
   {
      beforeValidate1OC1842( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OC1842( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OC1842( 0) ;
         checkOptimisticConcurrency1OC1842( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OC1842( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OC1842( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OC11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A13465BCNumeroOP), Boolean.valueOf(n13466BCFechaVto), A13466BCFechaVto, Boolean.valueOf(n13467BCColor), A13467BCColor, Boolean.valueOf(n13468BCArticulo), A13468BCArticulo, Boolean.valueOf(n13469BCEmpesa), A13469BCEmpesa, Boolean.valueOf(n13470BCNumeroRu), A13470BCNumeroRu, Boolean.valueOf(n13471BCMetrosSt), A13471BCMetrosSt, Boolean.valueOf(n13472BCMetrosCl), A13472BCMetrosCl, Boolean.valueOf(n13473BCEstado), Byte.valueOf(A13473BCEstado), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCHD");
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
                        processLevel1OC1842( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1OC0( ) ;
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
            load1OC1842( ) ;
         }
         endLevel1OC1842( ) ;
      }
      closeExtendedTableCursors1OC1842( ) ;
   }

   public void update1OC1842( )
   {
      beforeValidate1OC1842( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OC1842( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OC1842( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OC1842( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OC1842( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OC12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n13466BCFechaVto), A13466BCFechaVto, Boolean.valueOf(n13467BCColor), A13467BCColor, Boolean.valueOf(n13468BCArticulo), A13468BCArticulo, Boolean.valueOf(n13469BCEmpesa), A13469BCEmpesa, Boolean.valueOf(n13470BCNumeroRu), A13470BCNumeroRu, Boolean.valueOf(n13471BCMetrosSt), A13471BCMetrosSt, Boolean.valueOf(n13472BCMetrosCl), A13472BCMetrosCl, Boolean.valueOf(n13473BCEstado), Byte.valueOf(A13473BCEstado), A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCHD");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCHD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OC1842( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OC1842( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1OC0( ) ;
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
         endLevel1OC1842( ) ;
      }
      closeExtendedTableCursors1OC1842( ) ;
   }

   public void deferredUpdate1OC1842( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OC1842( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OC1842( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OC1842( ) ;
         afterConfirm1OC1842( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OC1842( ) ;
            if ( AnyError == 0 )
            {
               scanStart1OC1843( ) ;
               while ( RcdFound1843 != 0 )
               {
                  getByPrimaryKey1OC1843( ) ;
                  delete1OC1843( ) ;
                  scanNext1OC1843( ) ;
               }
               scanEnd1OC1843( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OC13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCHD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1842 == 0 )
                        {
                           initAll1OC1842( ) ;
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
                        resetCaption1OC0( ) ;
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
      sMode1842 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OC1842( ) ;
      Gx_mode = sMode1842 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OC1842( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01OC14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OP_Costes_Detail", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01OC15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1OC1843( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1OC1843( ) ;
         if ( ( nRcdExists_1843 != 0 ) || ( nIsMod_1843 != 0 ) )
         {
            standaloneNotModal1OC1843( ) ;
            getKey1OC1843( ) ;
            if ( ( nRcdExists_1843 == 0 ) && ( nRcdDeleted_1843 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OC1843( ) ;
            }
            else
            {
               if ( RcdFound1843 != 0 )
               {
                  if ( ( nRcdDeleted_1843 != 0 ) && ( nRcdExists_1843 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OC1843( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1843 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OC1843( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1843 == 0 )
                  {
                     GXCCtl = "BCPIEZA_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBCPieza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1843_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCPieza_Internalname, GXutil.rtrim( A13474BCPieza)) ;
         httpContext.changePostValue( edtBCMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13475BCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCKIlos_Internalname, GXutil.ltrim( localUtil.ntoc( A13476BCKIlos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCPiezaOri_Internalname, GXutil.rtrim( A13477BCPiezaOri)) ;
         httpContext.changePostValue( "ZT_"+"Z13474BCPieza_"+sGXsfl_75_idx, GXutil.rtrim( Z13474BCPieza)) ;
         httpContext.changePostValue( "ZT_"+"Z13477BCPiezaOri_"+sGXsfl_75_idx, GXutil.rtrim( Z13477BCPiezaOri)) ;
         httpContext.changePostValue( "ZT_"+"Z13475BCMetros_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z13475BCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13476BCKIlos_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z13476BCKIlos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1843_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1843_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1843_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1843 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1843_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1843_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCPIEZA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPieza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCMETROS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCKILOS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCKIlos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCPIEZAORI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPiezaOri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OC1843( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1843 = (short)(0) ;
      nIsMod_1843 = (short)(0) ;
      nRcdDeleted_1843 = (short)(0) ;
   }

   public void processLevel1OC1842( )
   {
      /* Save parent mode. */
      sMode1842 = Gx_mode ;
      processNestedLevel1OC1843( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1842 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1OC1842( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OC1842( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "topbchd");
         if ( AnyError == 0 )
         {
            confirmValues1OC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "topbchd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OC1842( )
   {
      /* Scan By routine */
      /* Using cursor T01OC16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1842 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1842 = (short)(1) ;
         A13465BCNumeroOP = T01OC16_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OC1842( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1842 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1842 = (short)(1) ;
         A13465BCNumeroOP = T01OC16_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
      }
   }

   public void scanEnd1OC1842( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1OC1842( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OC1842( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OC1842( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OC1842( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OC1842( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OC1842( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OC1842( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBCNumeroOP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCNumeroOP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCNumeroOP_Enabled), 5, 0), true);
      edtBCFechaVto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCFechaVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCFechaVto_Enabled), 5, 0), true);
      edtBCColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCColor_Enabled), 5, 0), true);
      edtBCArticulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCArticulo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCArticulo_Enabled), 5, 0), true);
      edtBCEmpesa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCEmpesa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCEmpesa_Enabled), 5, 0), true);
      edtBCNumeroRu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCNumeroRu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCNumeroRu_Enabled), 5, 0), true);
      edtBCMetrosSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCMetrosSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCMetrosSt_Enabled), 5, 0), true);
      edtBCMetrosCl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCMetrosCl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCMetrosCl_Enabled), 5, 0), true);
      edtBCEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCEstado_Enabled), 5, 0), true);
   }

   public void zm1OC1843( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13477BCPiezaOri = T01OC3_A13477BCPiezaOri[0] ;
            Z13475BCMetros = T01OC3_A13475BCMetros[0] ;
            Z13476BCKIlos = T01OC3_A13476BCKIlos[0] ;
         }
         else
         {
            Z13477BCPiezaOri = A13477BCPiezaOri ;
            Z13475BCMetros = A13475BCMetros ;
            Z13476BCKIlos = A13476BCKIlos ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z13474BCPieza = A13474BCPieza ;
         Z13477BCPiezaOri = A13477BCPiezaOri ;
         Z13475BCMetros = A13475BCMetros ;
         Z13476BCKIlos = A13476BCKIlos ;
      }
   }

   public void standaloneNotModal1OC1843( )
   {
      edtBCPiezaOri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPiezaOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPiezaOri_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void standaloneModal1OC1843( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBCPieza_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBCPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPieza_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtBCPieza_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBCPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPieza_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load1OC1843( )
   {
      /* Using cursor T01OC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13474BCPieza});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1843 = (short)(1) ;
         A13477BCPiezaOri = T01OC17_A13477BCPiezaOri[0] ;
         n13477BCPiezaOri = T01OC17_n13477BCPiezaOri[0] ;
         A13475BCMetros = T01OC17_A13475BCMetros[0] ;
         n13475BCMetros = T01OC17_n13475BCMetros[0] ;
         A13476BCKIlos = T01OC17_A13476BCKIlos[0] ;
         n13476BCKIlos = T01OC17_n13476BCKIlos[0] ;
         zm1OC1843( -7) ;
      }
      pr_default.close(15);
      onLoadActions1OC1843( ) ;
   }

   public void onLoadActions1OC1843( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A13477BCPiezaOri)==0) && ( Gx_BScreen == 0 ) )
      {
         A13477BCPiezaOri = A13474BCPieza ;
         n13477BCPiezaOri = false ;
      }
   }

   public void checkExtendedTable1OC1843( )
   {
      nIsDirty_1843 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1OC1843( ) ;
      if ( isIns( )  && (GXutil.strcmp("", A13477BCPiezaOri)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1843 = (short)(1) ;
         A13477BCPiezaOri = A13474BCPieza ;
         n13477BCPiezaOri = false ;
      }
      if ( (GXutil.strcmp("", A13474BCPieza)==0) && true /* After */ )
      {
         GXCCtl = "BCPIEZA_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCPieza_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1OC1843( )
   {
   }

   public void enableDisable1OC1843( )
   {
   }

   public void getKey1OC1843( )
   {
      /* Using cursor T01OC18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13474BCPieza});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1843 = (short)(1) ;
      }
      else
      {
         RcdFound1843 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1OC1843( )
   {
      /* Using cursor T01OC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13474BCPieza});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01OC3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OC1843( 7) ;
         RcdFound1843 = (short)(1) ;
         initializeNonKey1OC1843( ) ;
         A13474BCPieza = T01OC3_A13474BCPieza[0] ;
         A13477BCPiezaOri = T01OC3_A13477BCPiezaOri[0] ;
         n13477BCPiezaOri = T01OC3_n13477BCPiezaOri[0] ;
         A13475BCMetros = T01OC3_A13475BCMetros[0] ;
         n13475BCMetros = T01OC3_n13475BCMetros[0] ;
         A13476BCKIlos = T01OC3_A13476BCKIlos[0] ;
         n13476BCKIlos = T01OC3_n13476BCKIlos[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z13474BCPieza = A13474BCPieza ;
         sMode1843 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OC1843( ) ;
         load1OC1843( ) ;
         Gx_mode = sMode1843 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1843 = (short)(0) ;
         initializeNonKey1OC1843( ) ;
         sMode1843 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OC1843( ) ;
         Gx_mode = sMode1843 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OC1843( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1OC1843( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13474BCPieza});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCDT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13477BCPiezaOri, T01OC2_A13477BCPiezaOri[0]) != 0 ) || ( DecimalUtil.compareTo(Z13475BCMetros, T01OC2_A13475BCMetros[0]) != 0 ) || ( DecimalUtil.compareTo(Z13476BCKIlos, T01OC2_A13476BCKIlos[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13477BCPiezaOri, T01OC2_A13477BCPiezaOri[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCPiezaOri");
               GXutil.writeLogRaw("Old: ",Z13477BCPiezaOri);
               GXutil.writeLogRaw("Current: ",T01OC2_A13477BCPiezaOri[0]);
            }
            if ( DecimalUtil.compareTo(Z13475BCMetros, T01OC2_A13475BCMetros[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCMetros");
               GXutil.writeLogRaw("Old: ",Z13475BCMetros);
               GXutil.writeLogRaw("Current: ",T01OC2_A13475BCMetros[0]);
            }
            if ( DecimalUtil.compareTo(Z13476BCKIlos, T01OC2_A13476BCKIlos[0]) != 0 )
            {
               GXutil.writeLogln("topbchd:[seudo value changed for attri]"+"BCKIlos");
               GXutil.writeLogRaw("Old: ",Z13476BCKIlos);
               GXutil.writeLogRaw("Current: ",T01OC2_A13476BCKIlos[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOPBCDT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OC1843( )
   {
      beforeValidate1OC1843( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OC1843( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OC1843( 0) ;
         checkOptimisticConcurrency1OC1843( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OC1843( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OC1843( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OC19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13474BCPieza, Boolean.valueOf(n13477BCPiezaOri), A13477BCPiezaOri, Boolean.valueOf(n13475BCMetros), A13475BCMetros, Boolean.valueOf(n13476BCKIlos), A13476BCKIlos});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCDT");
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
            load1OC1843( ) ;
         }
         endLevel1OC1843( ) ;
      }
      closeExtendedTableCursors1OC1843( ) ;
   }

   public void update1OC1843( )
   {
      beforeValidate1OC1843( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OC1843( ) ;
      }
      if ( ( nIsMod_1843 != 0 ) || ( nIsDirty_1843 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OC1843( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OC1843( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OC1843( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OC20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n13477BCPiezaOri), A13477BCPiezaOri, Boolean.valueOf(n13475BCMetros), A13475BCMetros, Boolean.valueOf(n13476BCKIlos), A13476BCKIlos, A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13474BCPieza});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCDT");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCDT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OC1843( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1OC1843( ) ;
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
            endLevel1OC1843( ) ;
         }
      }
      closeExtendedTableCursors1OC1843( ) ;
   }

   public void deferredUpdate1OC1843( )
   {
   }

   public void delete1OC1843( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OC1843( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OC1843( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OC1843( ) ;
         afterConfirm1OC1843( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OC1843( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OC21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13474BCPieza});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCDT");
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
      sMode1843 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OC1843( ) ;
      Gx_mode = sMode1843 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OC1843( )
   {
      standaloneModal1OC1843( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OC1843( )
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

   public void scanStart1OC1843( )
   {
      /* Scan By routine */
      /* Using cursor T01OC22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      RcdFound1843 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1843 = (short)(1) ;
         A13474BCPieza = T01OC22_A13474BCPieza[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OC1843( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1843 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1843 = (short)(1) ;
         A13474BCPieza = T01OC22_A13474BCPieza[0] ;
      }
   }

   public void scanEnd1OC1843( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1OC1843( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OC1843( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OC1843( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OC1843( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OC1843( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OC1843( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OC1843( )
   {
      edtBCPieza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPieza_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBCMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCMetros_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBCKIlos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCKIlos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCKIlos_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBCPiezaOri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPiezaOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPiezaOri_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes1OC1843( )
   {
   }

   public void send_integrity_lvl_hashes1OC1842( )
   {
   }

   public void subsflControlProps_751843( )
   {
      edtavnRcdDeleted_1843_Internalname = "vNRCDDELETED_1843_"+sGXsfl_75_idx ;
      edtBCPieza_Internalname = "BCPIEZA_"+sGXsfl_75_idx ;
      edtBCMetros_Internalname = "BCMETROS_"+sGXsfl_75_idx ;
      edtBCKIlos_Internalname = "BCKILOS_"+sGXsfl_75_idx ;
      edtBCPiezaOri_Internalname = "BCPIEZAORI_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_751843( )
   {
      edtavnRcdDeleted_1843_Internalname = "vNRCDDELETED_1843_"+sGXsfl_75_fel_idx ;
      edtBCPieza_Internalname = "BCPIEZA_"+sGXsfl_75_fel_idx ;
      edtBCMetros_Internalname = "BCMETROS_"+sGXsfl_75_fel_idx ;
      edtBCKIlos_Internalname = "BCKILOS_"+sGXsfl_75_fel_idx ;
      edtBCPiezaOri_Internalname = "BCPIEZAORI_"+sGXsfl_75_fel_idx ;
   }

   public void addRow1OC1843( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751843( ) ;
      sendRow1OC1843( ) ;
   }

   public void sendRow1OC1843( )
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
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1843_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1843_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1843_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1843), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1843), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1843_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1843_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1843_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCPieza_Internalname,GXutil.rtrim( A13474BCPieza),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCPieza_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCPieza_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1843_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCMetros_Internalname,GXutil.ltrim( localUtil.ntoc( A13475BCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBCMetros_Enabled!=0) ? localUtil.format( A13475BCMetros, "ZZZZZ9.99") : localUtil.format( A13475BCMetros, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCMetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCMetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1843_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCKIlos_Internalname,GXutil.ltrim( localUtil.ntoc( A13476BCKIlos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBCKIlos_Enabled!=0) ? localUtil.format( A13476BCKIlos, "ZZZZZ9.99") : localUtil.format( A13476BCKIlos, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCKIlos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCKIlos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCPiezaOri_Internalname,GXutil.rtrim( A13477BCPiezaOri),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCPiezaOri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCPiezaOri_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1OC1843( ) ;
      GXCCtl = "Z13474BCPieza_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13474BCPieza));
      GXCCtl = "Z13477BCPiezaOri_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13477BCPiezaOri));
      GXCCtl = "Z13475BCMetros_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13475BCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13476BCKIlos_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13476BCKIlos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1843_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1843_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1843_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1843, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1843_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1843_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCPIEZA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPieza_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCMETROS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCKILOS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCKIlos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCPIEZAORI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPiezaOri_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1OC1843( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751843( ) ;
      edtavnRcdDeleted_1843_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1843_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCPieza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCPIEZA_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCMETROS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCKIlos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCKILOS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCPiezaOri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCPIEZAORI_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1843_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1843_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1843");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1843_Internalname ;
         wbErr = true ;
         nRcdDeleted_1843 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1843 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1843_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13474BCPieza = httpContext.cgiGet( edtBCPieza_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BCMETROS_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCMetros_Internalname ;
         wbErr = true ;
         A13475BCMetros = DecimalUtil.ZERO ;
         n13475BCMetros = false ;
      }
      else
      {
         A13475BCMetros = localUtil.ctond( httpContext.cgiGet( edtBCMetros_Internalname)) ;
         n13475BCMetros = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCKIlos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCKIlos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BCKILOS_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCKIlos_Internalname ;
         wbErr = true ;
         A13476BCKIlos = DecimalUtil.ZERO ;
         n13476BCKIlos = false ;
      }
      else
      {
         A13476BCKIlos = localUtil.ctond( httpContext.cgiGet( edtBCKIlos_Internalname)) ;
         n13476BCKIlos = false ;
      }
      A13477BCPiezaOri = httpContext.cgiGet( edtBCPiezaOri_Internalname) ;
      n13477BCPiezaOri = false ;
      GXCCtl = "Z13474BCPieza_" + sGXsfl_75_idx ;
      Z13474BCPieza = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13477BCPiezaOri_" + sGXsfl_75_idx ;
      Z13477BCPiezaOri = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13475BCMetros_" + sGXsfl_75_idx ;
      Z13475BCMetros = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13476BCKIlos_" + sGXsfl_75_idx ;
      Z13476BCKIlos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1843_" + sGXsfl_75_idx ;
      nRcdDeleted_1843 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1843_" + sGXsfl_75_idx ;
      nRcdExists_1843 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1843_" + sGXsfl_75_idx ;
      nIsMod_1843 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBCPiezaOri_Enabled = edtBCPiezaOri_Enabled ;
      defedtBCPieza_Enabled = edtBCPieza_Enabled ;
   }

   public void confirmValues1OC0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751843( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_751843( ) ;
         httpContext.changePostValue( "Z13474BCPieza_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z13474BCPieza_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13474BCPieza_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z13477BCPiezaOri_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z13477BCPiezaOri_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13477BCPiezaOri_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z13475BCMetros_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z13475BCMetros_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13475BCMetros_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z13476BCKIlos_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z13476BCKIlos_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13476BCKIlos_"+sGXsfl_75_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.topbchd", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13465BCNumeroOP", GXutil.ltrim( localUtil.ntoc( Z13465BCNumeroOP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13466BCFechaVto", localUtil.dtoc( Z13466BCFechaVto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13467BCColor", GXutil.rtrim( Z13467BCColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13468BCArticulo", GXutil.rtrim( Z13468BCArticulo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13469BCEmpesa", GXutil.rtrim( Z13469BCEmpesa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13470BCNumeroRu", GXutil.rtrim( Z13470BCNumeroRu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13471BCMetrosSt", GXutil.ltrim( localUtil.ntoc( Z13471BCMetrosSt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13472BCMetrosCl", GXutil.ltrim( localUtil.ntoc( Z13472BCMetrosCl, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13473BCEstado", GXutil.ltrim( localUtil.ntoc( Z13473BCEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.topbchd", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TOPBCHD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OP de EKAMAT", "") ;
   }

   public void initializeNonKey1OC1842( )
   {
      A13466BCFechaVto = GXutil.nullDate() ;
      n13466BCFechaVto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13466BCFechaVto", localUtil.format(A13466BCFechaVto, "99/99/99"));
      A13467BCColor = "" ;
      n13467BCColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13467BCColor", A13467BCColor);
      A13468BCArticulo = "" ;
      n13468BCArticulo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13468BCArticulo", A13468BCArticulo);
      A13469BCEmpesa = "" ;
      n13469BCEmpesa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13469BCEmpesa", A13469BCEmpesa);
      A13470BCNumeroRu = "" ;
      n13470BCNumeroRu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13470BCNumeroRu", A13470BCNumeroRu);
      A13471BCMetrosSt = DecimalUtil.ZERO ;
      n13471BCMetrosSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13471BCMetrosSt", GXutil.ltrimstr( A13471BCMetrosSt, 9, 2));
      A13472BCMetrosCl = DecimalUtil.ZERO ;
      n13472BCMetrosCl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13472BCMetrosCl", GXutil.ltrimstr( A13472BCMetrosCl, 9, 2));
      A13473BCEstado = (byte)(0) ;
      n13473BCEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13473BCEstado", GXutil.str( A13473BCEstado, 1, 0));
      Z13466BCFechaVto = GXutil.nullDate() ;
      Z13467BCColor = "" ;
      Z13468BCArticulo = "" ;
      Z13469BCEmpesa = "" ;
      Z13470BCNumeroRu = "" ;
      Z13471BCMetrosSt = DecimalUtil.ZERO ;
      Z13472BCMetrosCl = DecimalUtil.ZERO ;
      Z13473BCEstado = (byte)(0) ;
   }

   public void initAll1OC1842( )
   {
      A13465BCNumeroOP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
      initializeNonKey1OC1842( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1OC1843( )
   {
      A13475BCMetros = DecimalUtil.ZERO ;
      n13475BCMetros = false ;
      A13476BCKIlos = DecimalUtil.ZERO ;
      n13476BCKIlos = false ;
      A13477BCPiezaOri = "" ;
      n13477BCPiezaOri = false ;
      Z13477BCPiezaOri = "" ;
      Z13475BCMetros = DecimalUtil.ZERO ;
      Z13476BCKIlos = DecimalUtil.ZERO ;
   }

   public void initAll1OC1843( )
   {
      A13474BCPieza = "" ;
      initializeNonKey1OC1843( ) ;
   }

   public void standaloneModalInsert1OC1843( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415104295", true, true);
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
      httpContext.AddJavascriptSource("topbchd.js", "?202682415104296", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1843( )
   {
      edtBCPiezaOri_Enabled = defedtBCPiezaOri_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPiezaOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPiezaOri_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBCPieza_Enabled = defedtBCPieza_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPieza_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1843, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1843_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13474BCPieza));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPieza_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13475BCMetros, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13476BCKIlos, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCKIlos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13477BCPiezaOri));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPiezaOri_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBCNumeroOP_Internalname = "BCNUMEROOP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBCFechaVto_Internalname = "BCFECHAVTO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBCColor_Internalname = "BCCOLOR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBCArticulo_Internalname = "BCARTICULO" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBCEmpesa_Internalname = "BCEMPESA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBCNumeroRu_Internalname = "BCNUMERORU" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBCMetrosSt_Internalname = "BCMETROSST" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBCMetrosCl_Internalname = "BCMETROSCL" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBCEstado_Internalname = "BCESTADO" ;
      edtavnRcdDeleted_1843_Internalname = "vNRCDDELETED_1843" ;
      edtBCPieza_Internalname = "BCPIEZA" ;
      edtBCMetros_Internalname = "BCMETROS" ;
      edtBCKIlos_Internalname = "BCKILOS" ;
      edtBCPiezaOri_Internalname = "BCPIEZAORI" ;
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
      Form.setCaption( httpContext.getMessage( "OP de EKAMAT", "") );
      edtBCPiezaOri_Jsonclick = "" ;
      edtBCKIlos_Jsonclick = "" ;
      edtBCMetros_Jsonclick = "" ;
      edtBCPieza_Jsonclick = "" ;
      edtavnRcdDeleted_1843_Jsonclick = "" ;
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
      edtBCPiezaOri_Enabled = 0 ;
      edtBCKIlos_Enabled = 1 ;
      edtBCMetros_Enabled = 1 ;
      edtBCPieza_Enabled = 1 ;
      edtavnRcdDeleted_1843_Enabled = 1 ;
      edtBCEstado_Jsonclick = "" ;
      edtBCEstado_Backcolor = (int)(0xFFFFFF) ;
      edtBCEstado_Enabled = 1 ;
      edtBCMetrosCl_Jsonclick = "" ;
      edtBCMetrosCl_Backcolor = (int)(0xFFFFFF) ;
      edtBCMetrosCl_Enabled = 1 ;
      edtBCMetrosSt_Jsonclick = "" ;
      edtBCMetrosSt_Backcolor = (int)(0xFFFFFF) ;
      edtBCMetrosSt_Enabled = 1 ;
      edtBCNumeroRu_Jsonclick = "" ;
      edtBCNumeroRu_Backcolor = (int)(0xFFFFFF) ;
      edtBCNumeroRu_Enabled = 1 ;
      edtBCEmpesa_Jsonclick = "" ;
      edtBCEmpesa_Backcolor = (int)(0xFFFFFF) ;
      edtBCEmpesa_Enabled = 1 ;
      edtBCArticulo_Jsonclick = "" ;
      edtBCArticulo_Backcolor = (int)(0xFFFFFF) ;
      edtBCArticulo_Enabled = 1 ;
      edtBCColor_Jsonclick = "" ;
      edtBCColor_Backcolor = (int)(0xFFFFFF) ;
      edtBCColor_Enabled = 1 ;
      edtBCFechaVto_Jsonclick = "" ;
      edtBCFechaVto_Backcolor = (int)(0xFFFFFF) ;
      edtBCFechaVto_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBCNumeroOP_Jsonclick = "" ;
      edtBCNumeroOP_Backcolor = (int)(0xFFFFFF) ;
      edtBCNumeroOP_Enabled = 1 ;
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
      subsflControlProps_751843( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OC1843( ) ;
         standaloneModal1OC1843( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OC1843( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_751843( ) ;
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
      /* Using cursor T01OC23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OC23_A407EmprNom[0] ;
      n407EmprNom = T01OC23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      GX_FocusControl = edtBCFechaVto_Internalname ;
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

   public void valid_Bcnumeroop( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( (0==A13465BCNumeroOP) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCNumeroOP_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13466BCFechaVto", localUtil.format(A13466BCFechaVto, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13467BCColor", GXutil.rtrim( A13467BCColor));
      httpContext.ajax_rsp_assign_attri("", false, "A13468BCArticulo", GXutil.rtrim( A13468BCArticulo));
      httpContext.ajax_rsp_assign_attri("", false, "A13469BCEmpesa", GXutil.rtrim( A13469BCEmpesa));
      httpContext.ajax_rsp_assign_attri("", false, "A13470BCNumeroRu", GXutil.rtrim( A13470BCNumeroRu));
      httpContext.ajax_rsp_assign_attri("", false, "A13471BCMetrosSt", GXutil.ltrim( localUtil.ntoc( A13471BCMetrosSt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13472BCMetrosCl", GXutil.ltrim( localUtil.ntoc( A13472BCMetrosCl, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13473BCEstado", GXutil.ltrim( localUtil.ntoc( A13473BCEstado, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13465BCNumeroOP", GXutil.ltrim( localUtil.ntoc( Z13465BCNumeroOP, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13466BCFechaVto", localUtil.format(Z13466BCFechaVto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13467BCColor", GXutil.rtrim( Z13467BCColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13468BCArticulo", GXutil.rtrim( Z13468BCArticulo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13469BCEmpesa", GXutil.rtrim( Z13469BCEmpesa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13470BCNumeroRu", GXutil.rtrim( Z13470BCNumeroRu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13471BCMetrosSt", GXutil.ltrim( localUtil.ntoc( Z13471BCMetrosSt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13472BCMetrosCl", GXutil.ltrim( localUtil.ntoc( Z13472BCMetrosCl, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13473BCEstado", GXutil.ltrim( localUtil.ntoc( Z13473BCEstado, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_BCNUMEROOP","{handler:'valid_Bcnumeroop',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13465BCNumeroOP',fld:'BCNUMEROOP',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BCNUMEROOP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13466BCFechaVto',fld:'BCFECHAVTO',pic:''},{av:'A13467BCColor',fld:'BCCOLOR',pic:''},{av:'A13468BCArticulo',fld:'BCARTICULO',pic:''},{av:'A13469BCEmpesa',fld:'BCEMPESA',pic:''},{av:'A13470BCNumeroRu',fld:'BCNUMERORU',pic:''},{av:'A13471BCMetrosSt',fld:'BCMETROSST',pic:'ZZZZZ9.99'},{av:'A13472BCMetrosCl',fld:'BCMETROSCL',pic:'ZZZZZ9.99'},{av:'A13473BCEstado',fld:'BCESTADO',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13465BCNumeroOP'},{av:'Z407EmprNom'},{av:'Z13466BCFechaVto'},{av:'Z13467BCColor'},{av:'Z13468BCArticulo'},{av:'Z13469BCEmpesa'},{av:'Z13470BCNumeroRu'},{av:'Z13471BCMetrosSt'},{av:'Z13472BCMetrosCl'},{av:'Z13473BCEstado'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BCPIEZA","{handler:'valid_Bcpieza',iparms:[]");
      setEventMetadata("VALID_BCPIEZA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Bcpiezaori',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13466BCFechaVto = GXutil.nullDate() ;
      Z13467BCColor = "" ;
      Z13468BCArticulo = "" ;
      Z13469BCEmpesa = "" ;
      Z13470BCNumeroRu = "" ;
      Z13471BCMetrosSt = DecimalUtil.ZERO ;
      Z13472BCMetrosCl = DecimalUtil.ZERO ;
      Z13474BCPieza = "" ;
      Z13477BCPiezaOri = "" ;
      Z13475BCMetros = DecimalUtil.ZERO ;
      Z13476BCKIlos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A13466BCFechaVto = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      A13467BCColor = "" ;
      lblTextblock6_Jsonclick = "" ;
      A13468BCArticulo = "" ;
      lblTextblock7_Jsonclick = "" ;
      A13469BCEmpesa = "" ;
      lblTextblock8_Jsonclick = "" ;
      A13470BCNumeroRu = "" ;
      lblTextblock9_Jsonclick = "" ;
      A13471BCMetrosSt = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A13472BCMetrosCl = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1843 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1842 = "" ;
      GXCCtl = "" ;
      A13474BCPieza = "" ;
      A13475BCMetros = DecimalUtil.ZERO ;
      A13476BCKIlos = DecimalUtil.ZERO ;
      A13477BCPiezaOri = "" ;
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
      T01OC6_A407EmprNom = new String[] {""} ;
      T01OC6_n407EmprNom = new boolean[] {false} ;
      T01OC7_A13465BCNumeroOP = new int[1] ;
      T01OC7_A407EmprNom = new String[] {""} ;
      T01OC7_n407EmprNom = new boolean[] {false} ;
      T01OC7_A13466BCFechaVto = new java.util.Date[] {GXutil.nullDate()} ;
      T01OC7_n13466BCFechaVto = new boolean[] {false} ;
      T01OC7_A13467BCColor = new String[] {""} ;
      T01OC7_n13467BCColor = new boolean[] {false} ;
      T01OC7_A13468BCArticulo = new String[] {""} ;
      T01OC7_n13468BCArticulo = new boolean[] {false} ;
      T01OC7_A13469BCEmpesa = new String[] {""} ;
      T01OC7_n13469BCEmpesa = new boolean[] {false} ;
      T01OC7_A13470BCNumeroRu = new String[] {""} ;
      T01OC7_n13470BCNumeroRu = new boolean[] {false} ;
      T01OC7_A13471BCMetrosSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC7_n13471BCMetrosSt = new boolean[] {false} ;
      T01OC7_A13472BCMetrosCl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC7_n13472BCMetrosCl = new boolean[] {false} ;
      T01OC7_A13473BCEstado = new byte[1] ;
      T01OC7_n13473BCEstado = new boolean[] {false} ;
      T01OC7_A396EmprCod = new String[] {""} ;
      T01OC8_A396EmprCod = new String[] {""} ;
      T01OC8_A13465BCNumeroOP = new int[1] ;
      T01OC5_A13465BCNumeroOP = new int[1] ;
      T01OC5_A13466BCFechaVto = new java.util.Date[] {GXutil.nullDate()} ;
      T01OC5_n13466BCFechaVto = new boolean[] {false} ;
      T01OC5_A13467BCColor = new String[] {""} ;
      T01OC5_n13467BCColor = new boolean[] {false} ;
      T01OC5_A13468BCArticulo = new String[] {""} ;
      T01OC5_n13468BCArticulo = new boolean[] {false} ;
      T01OC5_A13469BCEmpesa = new String[] {""} ;
      T01OC5_n13469BCEmpesa = new boolean[] {false} ;
      T01OC5_A13470BCNumeroRu = new String[] {""} ;
      T01OC5_n13470BCNumeroRu = new boolean[] {false} ;
      T01OC5_A13471BCMetrosSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC5_n13471BCMetrosSt = new boolean[] {false} ;
      T01OC5_A13472BCMetrosCl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC5_n13472BCMetrosCl = new boolean[] {false} ;
      T01OC5_A13473BCEstado = new byte[1] ;
      T01OC5_n13473BCEstado = new boolean[] {false} ;
      T01OC5_A396EmprCod = new String[] {""} ;
      T01OC9_A396EmprCod = new String[] {""} ;
      T01OC9_A13465BCNumeroOP = new int[1] ;
      T01OC10_A396EmprCod = new String[] {""} ;
      T01OC10_A13465BCNumeroOP = new int[1] ;
      T01OC4_A13465BCNumeroOP = new int[1] ;
      T01OC4_A13466BCFechaVto = new java.util.Date[] {GXutil.nullDate()} ;
      T01OC4_n13466BCFechaVto = new boolean[] {false} ;
      T01OC4_A13467BCColor = new String[] {""} ;
      T01OC4_n13467BCColor = new boolean[] {false} ;
      T01OC4_A13468BCArticulo = new String[] {""} ;
      T01OC4_n13468BCArticulo = new boolean[] {false} ;
      T01OC4_A13469BCEmpesa = new String[] {""} ;
      T01OC4_n13469BCEmpesa = new boolean[] {false} ;
      T01OC4_A13470BCNumeroRu = new String[] {""} ;
      T01OC4_n13470BCNumeroRu = new boolean[] {false} ;
      T01OC4_A13471BCMetrosSt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC4_n13471BCMetrosSt = new boolean[] {false} ;
      T01OC4_A13472BCMetrosCl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC4_n13472BCMetrosCl = new boolean[] {false} ;
      T01OC4_A13473BCEstado = new byte[1] ;
      T01OC4_n13473BCEstado = new boolean[] {false} ;
      T01OC4_A396EmprCod = new String[] {""} ;
      T01OC14_A396EmprCod = new String[] {""} ;
      T01OC14_A13465BCNumeroOP = new int[1] ;
      T01OC14_A13562BCCFOrden = new short[1] ;
      T01OC15_A396EmprCod = new String[] {""} ;
      T01OC15_A13465BCNumeroOP = new int[1] ;
      T01OC15_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OC15_A13501BCNumero = new short[1] ;
      T01OC16_A396EmprCod = new String[] {""} ;
      T01OC16_A13465BCNumeroOP = new int[1] ;
      T01OC17_A396EmprCod = new String[] {""} ;
      T01OC17_A13465BCNumeroOP = new int[1] ;
      T01OC17_A13474BCPieza = new String[] {""} ;
      T01OC17_A13477BCPiezaOri = new String[] {""} ;
      T01OC17_n13477BCPiezaOri = new boolean[] {false} ;
      T01OC17_A13475BCMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC17_n13475BCMetros = new boolean[] {false} ;
      T01OC17_A13476BCKIlos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC17_n13476BCKIlos = new boolean[] {false} ;
      T01OC18_A396EmprCod = new String[] {""} ;
      T01OC18_A13465BCNumeroOP = new int[1] ;
      T01OC18_A13474BCPieza = new String[] {""} ;
      T01OC3_A396EmprCod = new String[] {""} ;
      T01OC3_A13465BCNumeroOP = new int[1] ;
      T01OC3_A13474BCPieza = new String[] {""} ;
      T01OC3_A13477BCPiezaOri = new String[] {""} ;
      T01OC3_n13477BCPiezaOri = new boolean[] {false} ;
      T01OC3_A13475BCMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC3_n13475BCMetros = new boolean[] {false} ;
      T01OC3_A13476BCKIlos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC3_n13476BCKIlos = new boolean[] {false} ;
      T01OC2_A396EmprCod = new String[] {""} ;
      T01OC2_A13465BCNumeroOP = new int[1] ;
      T01OC2_A13474BCPieza = new String[] {""} ;
      T01OC2_A13477BCPiezaOri = new String[] {""} ;
      T01OC2_n13477BCPiezaOri = new boolean[] {false} ;
      T01OC2_A13475BCMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC2_n13475BCMetros = new boolean[] {false} ;
      T01OC2_A13476BCKIlos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OC2_n13476BCKIlos = new boolean[] {false} ;
      T01OC22_A396EmprCod = new String[] {""} ;
      T01OC22_A13465BCNumeroOP = new int[1] ;
      T01OC22_A13474BCPieza = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01OC23_A407EmprNom = new String[] {""} ;
      T01OC23_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ13466BCFechaVto = GXutil.nullDate() ;
      ZZ13467BCColor = "" ;
      ZZ13468BCArticulo = "" ;
      ZZ13469BCEmpesa = "" ;
      ZZ13470BCNumeroRu = "" ;
      ZZ13471BCMetrosSt = DecimalUtil.ZERO ;
      ZZ13472BCMetrosCl = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.topbchd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.topbchd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.topbchd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.topbchd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.topbchd__default(),
         new Object[] {
             new Object[] {
            T01OC2_A396EmprCod, T01OC2_A13465BCNumeroOP, T01OC2_A13474BCPieza, T01OC2_A13477BCPiezaOri, T01OC2_n13477BCPiezaOri, T01OC2_A13475BCMetros, T01OC2_n13475BCMetros, T01OC2_A13476BCKIlos, T01OC2_n13476BCKIlos
            }
            , new Object[] {
            T01OC3_A396EmprCod, T01OC3_A13465BCNumeroOP, T01OC3_A13474BCPieza, T01OC3_A13477BCPiezaOri, T01OC3_n13477BCPiezaOri, T01OC3_A13475BCMetros, T01OC3_n13475BCMetros, T01OC3_A13476BCKIlos, T01OC3_n13476BCKIlos
            }
            , new Object[] {
            T01OC4_A13465BCNumeroOP, T01OC4_A13466BCFechaVto, T01OC4_n13466BCFechaVto, T01OC4_A13467BCColor, T01OC4_n13467BCColor, T01OC4_A13468BCArticulo, T01OC4_n13468BCArticulo, T01OC4_A13469BCEmpesa, T01OC4_n13469BCEmpesa, T01OC4_A13470BCNumeroRu,
            T01OC4_n13470BCNumeroRu, T01OC4_A13471BCMetrosSt, T01OC4_n13471BCMetrosSt, T01OC4_A13472BCMetrosCl, T01OC4_n13472BCMetrosCl, T01OC4_A13473BCEstado, T01OC4_n13473BCEstado, T01OC4_A396EmprCod
            }
            , new Object[] {
            T01OC5_A13465BCNumeroOP, T01OC5_A13466BCFechaVto, T01OC5_n13466BCFechaVto, T01OC5_A13467BCColor, T01OC5_n13467BCColor, T01OC5_A13468BCArticulo, T01OC5_n13468BCArticulo, T01OC5_A13469BCEmpesa, T01OC5_n13469BCEmpesa, T01OC5_A13470BCNumeroRu,
            T01OC5_n13470BCNumeroRu, T01OC5_A13471BCMetrosSt, T01OC5_n13471BCMetrosSt, T01OC5_A13472BCMetrosCl, T01OC5_n13472BCMetrosCl, T01OC5_A13473BCEstado, T01OC5_n13473BCEstado, T01OC5_A396EmprCod
            }
            , new Object[] {
            T01OC6_A407EmprNom, T01OC6_n407EmprNom
            }
            , new Object[] {
            T01OC7_A13465BCNumeroOP, T01OC7_A407EmprNom, T01OC7_n407EmprNom, T01OC7_A13466BCFechaVto, T01OC7_n13466BCFechaVto, T01OC7_A13467BCColor, T01OC7_n13467BCColor, T01OC7_A13468BCArticulo, T01OC7_n13468BCArticulo, T01OC7_A13469BCEmpesa,
            T01OC7_n13469BCEmpesa, T01OC7_A13470BCNumeroRu, T01OC7_n13470BCNumeroRu, T01OC7_A13471BCMetrosSt, T01OC7_n13471BCMetrosSt, T01OC7_A13472BCMetrosCl, T01OC7_n13472BCMetrosCl, T01OC7_A13473BCEstado, T01OC7_n13473BCEstado, T01OC7_A396EmprCod
            }
            , new Object[] {
            T01OC8_A396EmprCod, T01OC8_A13465BCNumeroOP
            }
            , new Object[] {
            T01OC9_A396EmprCod, T01OC9_A13465BCNumeroOP
            }
            , new Object[] {
            T01OC10_A396EmprCod, T01OC10_A13465BCNumeroOP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OC14_A396EmprCod, T01OC14_A13465BCNumeroOP, T01OC14_A13562BCCFOrden
            }
            , new Object[] {
            T01OC15_A396EmprCod, T01OC15_A13465BCNumeroOP, T01OC15_A13500BCFecCierr, T01OC15_A13501BCNumero
            }
            , new Object[] {
            T01OC16_A396EmprCod, T01OC16_A13465BCNumeroOP
            }
            , new Object[] {
            T01OC17_A396EmprCod, T01OC17_A13465BCNumeroOP, T01OC17_A13474BCPieza, T01OC17_A13477BCPiezaOri, T01OC17_n13477BCPiezaOri, T01OC17_A13475BCMetros, T01OC17_n13475BCMetros, T01OC17_A13476BCKIlos, T01OC17_n13476BCKIlos
            }
            , new Object[] {
            T01OC18_A396EmprCod, T01OC18_A13465BCNumeroOP, T01OC18_A13474BCPieza
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OC22_A396EmprCod, T01OC22_A13465BCNumeroOP, T01OC22_A13474BCPieza
            }
            , new Object[] {
            T01OC23_A407EmprNom, T01OC23_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TOPBCHD" ;
      Z13477BCPiezaOri = "" ;
      n13477BCPiezaOri = false ;
      A13477BCPiezaOri = "" ;
      n13477BCPiezaOri = false ;
   }

   private byte Z13473BCEstado ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13473BCEstado ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ13473BCEstado ;
   private short nRcdDeleted_1843 ;
   private short nRcdExists_1843 ;
   private short nIsMod_1843 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1843 ;
   private short RcdFound1843 ;
   private short nBlankRcdUsr1843 ;
   private short RcdFound1842 ;
   private short nIsDirty_1842 ;
   private short nIsDirty_1843 ;
   private int Z13465BCNumeroOP ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A13465BCNumeroOP ;
   private int edtBCNumeroOP_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBCFechaVto_Enabled ;
   private int edtBCColor_Enabled ;
   private int edtBCArticulo_Enabled ;
   private int edtBCEmpesa_Enabled ;
   private int edtBCNumeroRu_Enabled ;
   private int edtBCMetrosSt_Enabled ;
   private int edtBCMetrosCl_Enabled ;
   private int edtBCEstado_Enabled ;
   private int edtavnRcdDeleted_1843_Enabled ;
   private int edtBCPieza_Enabled ;
   private int edtBCMetros_Enabled ;
   private int edtBCKIlos_Enabled ;
   private int edtBCPiezaOri_Enabled ;
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
   private int defedtBCPiezaOri_Enabled ;
   private int defedtBCPieza_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBCEstado_Backcolor ;
   private int edtBCMetrosCl_Backcolor ;
   private int edtBCMetrosSt_Backcolor ;
   private int edtBCNumeroRu_Backcolor ;
   private int edtBCEmpesa_Backcolor ;
   private int edtBCArticulo_Backcolor ;
   private int edtBCColor_Backcolor ;
   private int edtBCFechaVto_Backcolor ;
   private int edtBCNumeroOP_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13465BCNumeroOP ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13471BCMetrosSt ;
   private java.math.BigDecimal Z13472BCMetrosCl ;
   private java.math.BigDecimal Z13475BCMetros ;
   private java.math.BigDecimal Z13476BCKIlos ;
   private java.math.BigDecimal A13471BCMetrosSt ;
   private java.math.BigDecimal A13472BCMetrosCl ;
   private java.math.BigDecimal A13475BCMetros ;
   private java.math.BigDecimal A13476BCKIlos ;
   private java.math.BigDecimal ZZ13471BCMetrosSt ;
   private java.math.BigDecimal ZZ13472BCMetrosCl ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13467BCColor ;
   private String Z13468BCArticulo ;
   private String Z13469BCEmpesa ;
   private String Z13470BCNumeroRu ;
   private String Z13474BCPieza ;
   private String Z13477BCPiezaOri ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBCNumeroOP_Internalname ;
   private String sGXsfl_75_idx="0001" ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBCNumeroOP_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBCFechaVto_Internalname ;
   private String edtBCFechaVto_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBCColor_Internalname ;
   private String A13467BCColor ;
   private String edtBCColor_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBCArticulo_Internalname ;
   private String A13468BCArticulo ;
   private String edtBCArticulo_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBCEmpesa_Internalname ;
   private String A13469BCEmpesa ;
   private String edtBCEmpesa_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBCNumeroRu_Internalname ;
   private String A13470BCNumeroRu ;
   private String edtBCNumeroRu_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBCMetrosSt_Internalname ;
   private String edtBCMetrosSt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBCMetrosCl_Internalname ;
   private String edtBCMetrosCl_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBCEstado_Internalname ;
   private String edtBCEstado_Jsonclick ;
   private String sMode1843 ;
   private String edtavnRcdDeleted_1843_Internalname ;
   private String edtBCPieza_Internalname ;
   private String edtBCMetros_Internalname ;
   private String edtBCKIlos_Internalname ;
   private String edtBCPiezaOri_Internalname ;
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
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1842 ;
   private String GXCCtl ;
   private String A13474BCPieza ;
   private String A13477BCPiezaOri ;
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
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1843_Jsonclick ;
   private String edtBCPieza_Jsonclick ;
   private String edtBCMetros_Jsonclick ;
   private String edtBCKIlos_Jsonclick ;
   private String edtBCPiezaOri_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ13467BCColor ;
   private String ZZ13468BCArticulo ;
   private String ZZ13469BCEmpesa ;
   private String ZZ13470BCNumeroRu ;
   private java.util.Date Z13466BCFechaVto ;
   private java.util.Date A13466BCFechaVto ;
   private java.util.Date ZZ13466BCFechaVto ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13466BCFechaVto ;
   private boolean n13467BCColor ;
   private boolean n13468BCArticulo ;
   private boolean n13469BCEmpesa ;
   private boolean n13470BCNumeroRu ;
   private boolean n13471BCMetrosSt ;
   private boolean n13472BCMetrosCl ;
   private boolean n13473BCEstado ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n13477BCPiezaOri ;
   private boolean n13475BCMetros ;
   private boolean n13476BCKIlos ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01OC6_A407EmprNom ;
   private boolean[] T01OC6_n407EmprNom ;
   private int[] T01OC7_A13465BCNumeroOP ;
   private String[] T01OC7_A407EmprNom ;
   private boolean[] T01OC7_n407EmprNom ;
   private java.util.Date[] T01OC7_A13466BCFechaVto ;
   private boolean[] T01OC7_n13466BCFechaVto ;
   private String[] T01OC7_A13467BCColor ;
   private boolean[] T01OC7_n13467BCColor ;
   private String[] T01OC7_A13468BCArticulo ;
   private boolean[] T01OC7_n13468BCArticulo ;
   private String[] T01OC7_A13469BCEmpesa ;
   private boolean[] T01OC7_n13469BCEmpesa ;
   private String[] T01OC7_A13470BCNumeroRu ;
   private boolean[] T01OC7_n13470BCNumeroRu ;
   private java.math.BigDecimal[] T01OC7_A13471BCMetrosSt ;
   private boolean[] T01OC7_n13471BCMetrosSt ;
   private java.math.BigDecimal[] T01OC7_A13472BCMetrosCl ;
   private boolean[] T01OC7_n13472BCMetrosCl ;
   private byte[] T01OC7_A13473BCEstado ;
   private boolean[] T01OC7_n13473BCEstado ;
   private String[] T01OC7_A396EmprCod ;
   private String[] T01OC8_A396EmprCod ;
   private int[] T01OC8_A13465BCNumeroOP ;
   private int[] T01OC5_A13465BCNumeroOP ;
   private java.util.Date[] T01OC5_A13466BCFechaVto ;
   private boolean[] T01OC5_n13466BCFechaVto ;
   private String[] T01OC5_A13467BCColor ;
   private boolean[] T01OC5_n13467BCColor ;
   private String[] T01OC5_A13468BCArticulo ;
   private boolean[] T01OC5_n13468BCArticulo ;
   private String[] T01OC5_A13469BCEmpesa ;
   private boolean[] T01OC5_n13469BCEmpesa ;
   private String[] T01OC5_A13470BCNumeroRu ;
   private boolean[] T01OC5_n13470BCNumeroRu ;
   private java.math.BigDecimal[] T01OC5_A13471BCMetrosSt ;
   private boolean[] T01OC5_n13471BCMetrosSt ;
   private java.math.BigDecimal[] T01OC5_A13472BCMetrosCl ;
   private boolean[] T01OC5_n13472BCMetrosCl ;
   private byte[] T01OC5_A13473BCEstado ;
   private boolean[] T01OC5_n13473BCEstado ;
   private String[] T01OC5_A396EmprCod ;
   private String[] T01OC9_A396EmprCod ;
   private int[] T01OC9_A13465BCNumeroOP ;
   private String[] T01OC10_A396EmprCod ;
   private int[] T01OC10_A13465BCNumeroOP ;
   private int[] T01OC4_A13465BCNumeroOP ;
   private java.util.Date[] T01OC4_A13466BCFechaVto ;
   private boolean[] T01OC4_n13466BCFechaVto ;
   private String[] T01OC4_A13467BCColor ;
   private boolean[] T01OC4_n13467BCColor ;
   private String[] T01OC4_A13468BCArticulo ;
   private boolean[] T01OC4_n13468BCArticulo ;
   private String[] T01OC4_A13469BCEmpesa ;
   private boolean[] T01OC4_n13469BCEmpesa ;
   private String[] T01OC4_A13470BCNumeroRu ;
   private boolean[] T01OC4_n13470BCNumeroRu ;
   private java.math.BigDecimal[] T01OC4_A13471BCMetrosSt ;
   private boolean[] T01OC4_n13471BCMetrosSt ;
   private java.math.BigDecimal[] T01OC4_A13472BCMetrosCl ;
   private boolean[] T01OC4_n13472BCMetrosCl ;
   private byte[] T01OC4_A13473BCEstado ;
   private boolean[] T01OC4_n13473BCEstado ;
   private String[] T01OC4_A396EmprCod ;
   private String[] T01OC14_A396EmprCod ;
   private int[] T01OC14_A13465BCNumeroOP ;
   private short[] T01OC14_A13562BCCFOrden ;
   private String[] T01OC15_A396EmprCod ;
   private int[] T01OC15_A13465BCNumeroOP ;
   private java.util.Date[] T01OC15_A13500BCFecCierr ;
   private short[] T01OC15_A13501BCNumero ;
   private String[] T01OC16_A396EmprCod ;
   private int[] T01OC16_A13465BCNumeroOP ;
   private String[] T01OC17_A396EmprCod ;
   private int[] T01OC17_A13465BCNumeroOP ;
   private String[] T01OC17_A13474BCPieza ;
   private String[] T01OC17_A13477BCPiezaOri ;
   private boolean[] T01OC17_n13477BCPiezaOri ;
   private java.math.BigDecimal[] T01OC17_A13475BCMetros ;
   private boolean[] T01OC17_n13475BCMetros ;
   private java.math.BigDecimal[] T01OC17_A13476BCKIlos ;
   private boolean[] T01OC17_n13476BCKIlos ;
   private String[] T01OC18_A396EmprCod ;
   private int[] T01OC18_A13465BCNumeroOP ;
   private String[] T01OC18_A13474BCPieza ;
   private String[] T01OC3_A396EmprCod ;
   private int[] T01OC3_A13465BCNumeroOP ;
   private String[] T01OC3_A13474BCPieza ;
   private String[] T01OC3_A13477BCPiezaOri ;
   private boolean[] T01OC3_n13477BCPiezaOri ;
   private java.math.BigDecimal[] T01OC3_A13475BCMetros ;
   private boolean[] T01OC3_n13475BCMetros ;
   private java.math.BigDecimal[] T01OC3_A13476BCKIlos ;
   private boolean[] T01OC3_n13476BCKIlos ;
   private String[] T01OC2_A396EmprCod ;
   private int[] T01OC2_A13465BCNumeroOP ;
   private String[] T01OC2_A13474BCPieza ;
   private String[] T01OC2_A13477BCPiezaOri ;
   private boolean[] T01OC2_n13477BCPiezaOri ;
   private java.math.BigDecimal[] T01OC2_A13475BCMetros ;
   private boolean[] T01OC2_n13475BCMetros ;
   private java.math.BigDecimal[] T01OC2_A13476BCKIlos ;
   private boolean[] T01OC2_n13476BCKIlos ;
   private String[] T01OC22_A396EmprCod ;
   private int[] T01OC22_A13465BCNumeroOP ;
   private String[] T01OC22_A13474BCPieza ;
   private String[] T01OC23_A407EmprNom ;
   private boolean[] T01OC23_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class topbchd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbchd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbchd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbchd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbchd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OC2", "SELECT EmprCod, BCNumeroOP, BCPieza, BCPiezaOri, BCMetros, BCKIlos FROM TXPOPBCDT WHERE EmprCod = ? AND BCNumeroOP = ? AND BCPieza = ?  FOR UPDATE OF BCPiezaOri, BCMetros, BCKIlos NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC3", "SELECT EmprCod, BCNumeroOP, BCPieza, BCPiezaOri, BCMetros, BCKIlos FROM TXPOPBCDT WHERE EmprCod = ? AND BCNumeroOP = ? AND BCPieza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC4", "SELECT BCNumeroOP, BCFechaVto, BCColor, BCArticulo, BCEmpesa, BCNumeroRu, BCMetrosSt, BCMetrosCl, BCEstado, EmprCod FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ?  FOR UPDATE OF BCFechaVto, BCColor, BCArticulo, BCEmpesa, BCNumeroRu, BCMetrosSt, BCMetrosCl, BCEstado NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC5", "SELECT BCNumeroOP, BCFechaVto, BCColor, BCArticulo, BCEmpesa, BCNumeroRu, BCMetrosSt, BCMetrosCl, BCEstado, EmprCod FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC7", "SELECT /*+ FIRST_ROWS(100) */ TM1.BCNumeroOP, T2.EmprNom, TM1.BCFechaVto, TM1.BCColor, TM1.BCArticulo, TM1.BCEmpesa, TM1.BCNumeroRu, TM1.BCMetrosSt, TM1.BCMetrosCl, TM1.BCEstado, TM1.EmprCod FROM (TXPOPBCHD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BCNumeroOP = ? ORDER BY TM1.EmprCod, TM1.BCNumeroOP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP FROM TXPOPBCHD WHERE ( BCNumeroOP > ?) and EmprCod = ? ORDER BY EmprCod, BCNumeroOP) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OC10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP FROM TXPOPBCHD WHERE ( BCNumeroOP < ?) and EmprCod = ? ORDER BY EmprCod DESC, BCNumeroOP DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OC11", "INSERT INTO TXPOPBCHD(BCNumeroOP, BCFechaVto, BCColor, BCArticulo, BCEmpesa, BCNumeroRu, BCMetrosSt, BCMetrosCl, BCEstado, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOPBCHD")
         ,new UpdateCursor("T01OC12", "UPDATE TXPOPBCHD SET BCFechaVto=?, BCColor=?, BCArticulo=?, BCEmpesa=?, BCNumeroRu=?, BCMetrosSt=?, BCMetrosCl=?, BCEstado=?  WHERE EmprCod = ? AND BCNumeroOP = ?", GX_NOMASK, "TXPOPBCHD")
         ,new UpdateCursor("T01OC13", "DELETE FROM TXPOPBCHD  WHERE EmprCod = ? AND BCNumeroOP = ?", GX_NOMASK, "TXPOPBCHD")
         ,new ForEachCursor("T01OC14", "SELECT * FROM (SELECT EmprCod, BCNumeroOP, BCCFOrden FROM TXPOPBCCF WHERE EmprCod = ? AND BCNumeroOP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OC15", "SELECT * FROM (SELECT EmprCod, BCNumeroOP, BCFecCierr, BCNumero FROM TXPOPBCCH WHERE EmprCod = ? AND BCNumeroOP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OC16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BCNumeroOP FROM TXPOPBCHD WHERE EmprCod = ? ORDER BY EmprCod, BCNumeroOP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC17", "SELECT EmprCod, BCNumeroOP, BCPieza, BCPiezaOri, BCMetros, BCKIlos FROM TXPOPBCDT WHERE EmprCod = ? and BCNumeroOP = ? and BCPieza = ? ORDER BY EmprCod, BCNumeroOP, BCPieza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC18", "SELECT EmprCod, BCNumeroOP, BCPieza FROM TXPOPBCDT WHERE EmprCod = ? AND BCNumeroOP = ? AND BCPieza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OC19", "INSERT INTO TXPOPBCDT(EmprCod, BCNumeroOP, BCPieza, BCPiezaOri, BCMetros, BCKIlos) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOPBCDT")
         ,new UpdateCursor("T01OC20", "UPDATE TXPOPBCDT SET BCPiezaOri=?, BCMetros=?, BCKIlos=?  WHERE EmprCod = ? AND BCNumeroOP = ? AND BCPieza = ?", GX_NOMASK, "TXPOPBCDT")
         ,new UpdateCursor("T01OC21", "DELETE FROM TXPOPBCDT  WHERE EmprCod = ? AND BCNumeroOP = ? AND BCPieza = ?", GX_NOMASK, "TXPOPBCDT")
         ,new ForEachCursor("T01OC22", "SELECT EmprCod, BCNumeroOP, BCPieza FROM TXPOPBCDT WHERE EmprCod = ? and BCNumeroOP = ? ORDER BY EmprCod, BCNumeroOP, BCPieza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OC23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 21 :
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
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
                  stmt.setString(3, (String)parms[4], 13);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
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
                  stmt.setString(6, (String)parms[10], 8);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               stmt.setString(10, (String)parms[17], 3);
               return;
            case 10 :
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
                  stmt.setString(2, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
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
                  stmt.setString(5, (String)parms[9], 8);
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
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 9);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 9);
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
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

