package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tworkrep_impl extends GXDataArea
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
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A2248ManCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
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
         gxload_5( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recepcion Trabajos Externos", ""), (short)(0)) ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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

   public tworkrep_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tworkrep_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tworkrep_impl.class ));
   }

   public tworkrep_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TWORKREP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtManCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "", "", "", "", "", 1, edtManCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha Recepcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRpExHdFe_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdFe_Internalname, localUtil.format(A2711RpExHdFe, "99/99/99"), localUtil.format( A2711RpExHdFe, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdFe_Jsonclick, 0, "", "", "", "", "", 1, edtRpExHdFe_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TWORKREP.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRpExHdFe_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRpExHdFe_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TWORKREP.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Manuf", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtManNom_Internalname, GXutil.rtrim( A2249ManNom), GXutil.rtrim( localUtil.format( A2249ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManNom_Jsonclick, 0, "", "", "", "", "", 1, edtManNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExHdUl_Internalname, GXutil.ltrim( localUtil.ntoc( A2712RpExHdUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRpExHdUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2712RpExHdUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2712RpExHdUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExHdUl_Jsonclick, 0, "", "", "", "", "", 1, edtRpExHdUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Doc Manufacturador", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRpExtDoc_Internalname, GXutil.rtrim( A11300RpExtDoc), GXutil.rtrim( localUtil.format( A11300RpExtDoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRpExtDoc_Jsonclick, 0, "", "", "", "", "", 1, edtRpExtDoc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TWORKREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount385 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_385 = (short)(1) ;
            scanStart1KA385( ) ;
            while ( RcdFound385 != 0 )
            {
               init_level_properties385( ) ;
               getByPrimaryKey1KA385( ) ;
               addRow1KA385( ) ;
               scanNext1KA385( ) ;
            }
            scanEnd1KA385( ) ;
            nBlankRcdCount385 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KA385( ) ;
         standaloneModal1KA385( ) ;
         sMode385 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1KA385( ) ;
            edtavnRcdDeleted_385_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_385_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_385_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_385_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExHdLi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDLI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExHdAlb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDALB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExHdAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdAlb_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExHdKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDKGS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExHdKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdKgs_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExHdCns_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDCNS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExHdCns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdCns_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExHdTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDTIP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExHdTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdTip_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExHdRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDRES_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExHdRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdRes_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExHdLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDLOC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLoc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExHdMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDMTS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExHdMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdMts_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtRpExSalLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXSALLN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRpExSalLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExSalLn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarSerDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_385 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KA385( ) ;
            }
            sendRow1KA385( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode385 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount385 = (short)(5) ;
         nRcdExists_385 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KA385( ) ;
            while ( RcdFound385 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_55385( ) ;
               init_level_properties385( ) ;
               standaloneNotModal1KA385( ) ;
               getByPrimaryKey1KA385( ) ;
               standaloneModal1KA385( ) ;
               addRow1KA385( ) ;
               scanNext1KA385( ) ;
            }
            scanEnd1KA385( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode385 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_55385( ) ;
      initAll1KA385( ) ;
      init_level_properties385( ) ;
      nRcdExists_385 = (short)(0) ;
      nIsMod_385 = (short)(0) ;
      nRcdDeleted_385 = (short)(0) ;
      nBlankRcdCount385 = (short)(nBlankRcdUsr385+nBlankRcdCount385) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount385 > 0 )
      {
         standaloneNotModal1KA385( ) ;
         standaloneModal1KA385( ) ;
         addRow1KA385( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRpExHdLi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount385 = (short)(nBlankRcdCount385-1) ;
      }
      Gx_mode = sMode385 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TWORKREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TWORKREP.htm");
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
         Z2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2711RpExHdFe = localUtil.ctod( httpContext.cgiGet( "Z2711RpExHdFe"), 0) ;
         Z2712RpExHdUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z2712RpExHdUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11300RpExtDoc = httpContext.cgiGet( "Z11300RpExtDoc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtManCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2248ManCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         else
         {
            A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtRpExHdFe_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RPEXHDFE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExHdFe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2711RpExHdFe = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         }
         else
         {
            A2711RpExHdFe = localUtil.ctod( httpContext.cgiGet( edtRpExHdFe_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         }
         A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
         n2249ManNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPEXHDUL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRpExHdUl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2712RpExHdUl = (short)(0) ;
            n2712RpExHdUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2712RpExHdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2712RpExHdUl), 4, 0));
         }
         else
         {
            A2712RpExHdUl = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExHdUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2712RpExHdUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2712RpExHdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2712RpExHdUl), 4, 0));
         }
         A11300RpExtDoc = httpContext.cgiGet( edtRpExtDoc_Internalname) ;
         n11300RpExtDoc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11300RpExtDoc", A11300RpExtDoc);
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
            A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2711RpExHdFe = localUtil.parseDateParm( httpContext.GetPar( "RpExHdFe")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
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
            initAll1KA384( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_385_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_385_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1KA384( ) ;
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

   public void confirm_1KA0( )
   {
      beforeValidate1KA384( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KA384( ) ;
         }
         else
         {
            checkExtendedTable1KA384( ) ;
            if ( AnyError == 0 )
            {
               zm1KA384( 2) ;
               zm1KA384( 3) ;
            }
            closeExtendedTableCursors1KA384( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode384 = Gx_mode ;
         confirm_1KA385( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode384 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode384 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1KA0( ) ;
      }
   }

   public void confirm_1KA385( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1KA385( ) ;
         if ( ( nRcdExists_385 != 0 ) || ( nIsMod_385 != 0 ) )
         {
            getKey1KA385( ) ;
            if ( ( nRcdExists_385 == 0 ) && ( nRcdDeleted_385 == 0 ) )
            {
               if ( RcdFound385 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KA385( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KA385( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1KA385( 5) ;
                     }
                     closeExtendedTableCursors1KA385( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RPEXHDLI_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRpExHdLi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound385 != 0 )
               {
                  if ( nRcdDeleted_385 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KA385( ) ;
                     load1KA385( ) ;
                     beforeValidate1KA385( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KA385( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_385 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KA385( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KA385( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1KA385( 5) ;
                           }
                           closeExtendedTableCursors1KA385( ) ;
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
                  if ( nRcdDeleted_385 == 0 )
                  {
                     GXCCtl = "RPEXHDLI_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRpExHdLi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_385_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExHdLi_Internalname, GXutil.ltrim( localUtil.ntoc( A2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtRpExHdAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExHdKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExHdCns_Internalname, GXutil.ltrim( localUtil.ntoc( A2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExHdTip_Internalname, GXutil.rtrim( A2717RpExHdTip)) ;
         httpContext.changePostValue( edtRpExHdRes_Internalname, GXutil.rtrim( A2718RpExHdRes)) ;
         httpContext.changePostValue( edtRpExHdLoc_Internalname, GXutil.rtrim( A2719RpExHdLoc)) ;
         httpContext.changePostValue( edtRpExHdMts_Internalname, GXutil.ltrim( localUtil.ntoc( A2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExSalLn_Internalname, GXutil.ltrim( localUtil.ntoc( A6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z2713RpExHdLi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2714RpExHdAlb_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2715RpExHdKgs_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2716RpExHdCns_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2717RpExHdTip_"+sGXsfl_55_idx, GXutil.rtrim( Z2717RpExHdTip)) ;
         httpContext.changePostValue( "ZT_"+"Z2718RpExHdRes_"+sGXsfl_55_idx, GXutil.rtrim( Z2718RpExHdRes)) ;
         httpContext.changePostValue( "ZT_"+"Z2719RpExHdLoc_"+sGXsfl_55_idx, GXutil.rtrim( Z2719RpExHdLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z2847RpExHdMts_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6262RpExSalLn_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "nRcdDeleted_385_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_385_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_385_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_385 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_385_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_385_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdLi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDALB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdAlb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDKGS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDCNS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdCns_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDRES_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDLOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDMTS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXSALLN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExSalLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KA0( )
   {
   }

   public void zm1KA384( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2712RpExHdUl = T01KA6_A2712RpExHdUl[0] ;
            Z11300RpExtDoc = T01KA6_A11300RpExtDoc[0] ;
         }
         else
         {
            Z2712RpExHdUl = A2712RpExHdUl ;
            Z11300RpExtDoc = A11300RpExtDoc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z2711RpExHdFe = A2711RpExHdFe ;
         Z2712RpExHdUl = A2712RpExHdUl ;
         Z11300RpExtDoc = A11300RpExtDoc ;
         Z396EmprCod = A396EmprCod ;
         Z2248ManCod = A2248ManCod ;
         Z407EmprNom = A407EmprNom ;
         Z2249ManNom = A2249ManNom ;
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

   public void load1KA384( )
   {
      /* Using cursor T01KA9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound384 = (short)(1) ;
         A2249ManNom = T01KA9_A2249ManNom[0] ;
         n2249ManNom = T01KA9_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A407EmprNom = T01KA9_A407EmprNom[0] ;
         n407EmprNom = T01KA9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2712RpExHdUl = T01KA9_A2712RpExHdUl[0] ;
         n2712RpExHdUl = T01KA9_n2712RpExHdUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2712RpExHdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2712RpExHdUl), 4, 0));
         A11300RpExtDoc = T01KA9_A11300RpExtDoc[0] ;
         n11300RpExtDoc = T01KA9_n11300RpExtDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11300RpExtDoc", A11300RpExtDoc);
         zm1KA384( -1) ;
      }
      pr_default.close(7);
      onLoadActions1KA384( ) ;
   }

   public void onLoadActions1KA384( )
   {
   }

   public void checkExtendedTable1KA384( )
   {
      nIsDirty_384 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01KA7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01KA7_A407EmprNom[0] ;
      n407EmprNom = T01KA7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01KA8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T01KA8_A2249ManNom[0] ;
      n2249ManNom = T01KA8_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1KA384( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01KA10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01KA10_A407EmprNom[0] ;
      n407EmprNom = T01KA10_n407EmprNom[0] ;
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

   public void gxload_3( String A396EmprCod ,
                         short A2248ManCod )
   {
      /* Using cursor T01KA11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T01KA11_A2249ManNom[0] ;
      n2249ManNom = T01KA11_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2249ManNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1KA384( )
   {
      /* Using cursor T01KA12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound384 = (short)(1) ;
      }
      else
      {
         RcdFound384 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1KA384( 1) ;
         RcdFound384 = (short)(1) ;
         A2711RpExHdFe = T01KA6_A2711RpExHdFe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
         A2712RpExHdUl = T01KA6_A2712RpExHdUl[0] ;
         n2712RpExHdUl = T01KA6_n2712RpExHdUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2712RpExHdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2712RpExHdUl), 4, 0));
         A11300RpExtDoc = T01KA6_A11300RpExtDoc[0] ;
         n11300RpExtDoc = T01KA6_n11300RpExtDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11300RpExtDoc", A11300RpExtDoc);
         A396EmprCod = T01KA6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = T01KA6_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z2248ManCod = A2248ManCod ;
         Z2711RpExHdFe = A2711RpExHdFe ;
         sMode384 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KA384( ) ;
         if ( AnyError == 1 )
         {
            RcdFound384 = (short)(0) ;
            initializeNonKey1KA384( ) ;
         }
         Gx_mode = sMode384 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound384 = (short)(0) ;
         initializeNonKey1KA384( ) ;
         sMode384 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode384 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1KA384( ) ;
      if ( RcdFound384 == 0 )
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
      RcdFound384 = (short)(0) ;
      /* Using cursor T01KA13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A2248ManCod), Short.valueOf(A2248ManCod), A396EmprCod, A2711RpExHdFe});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01KA13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01KA13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KA13_A2248ManCod[0] < A2248ManCod ) || ( T01KA13_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01KA13_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01KA13_A2711RpExHdFe[0]).before( GXutil.resetTime( A2711RpExHdFe )) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01KA13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01KA13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KA13_A2248ManCod[0] > A2248ManCod ) || ( T01KA13_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01KA13_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01KA13_A2711RpExHdFe[0]).after( GXutil.resetTime( A2711RpExHdFe )) ) )
         {
            A396EmprCod = T01KA13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2248ManCod = T01KA13_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2711RpExHdFe = T01KA13_A2711RpExHdFe[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
            RcdFound384 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound384 = (short)(0) ;
      /* Using cursor T01KA14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A2248ManCod), Short.valueOf(A2248ManCod), A396EmprCod, A2711RpExHdFe});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01KA14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01KA14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KA14_A2248ManCod[0] > A2248ManCod ) || ( T01KA14_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01KA14_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01KA14_A2711RpExHdFe[0]).after( GXutil.resetTime( A2711RpExHdFe )) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01KA14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01KA14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KA14_A2248ManCod[0] < A2248ManCod ) || ( T01KA14_A2248ManCod[0] == A2248ManCod ) && ( GXutil.strcmp(T01KA14_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01KA14_A2711RpExHdFe[0]).before( GXutil.resetTime( A2711RpExHdFe )) ) )
         {
            A396EmprCod = T01KA14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2248ManCod = T01KA14_A2248ManCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2711RpExHdFe = T01KA14_A2711RpExHdFe[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
            RcdFound384 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KA384( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KA384( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound384 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || !( GXutil.dateCompare(GXutil.resetTime(A2711RpExHdFe), GXutil.resetTime(Z2711RpExHdFe)) ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2248ManCod = Z2248ManCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
               A2711RpExHdFe = Z2711RpExHdFe ;
               httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
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
               update1KA384( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || !( GXutil.dateCompare(GXutil.resetTime(A2711RpExHdFe), GXutil.resetTime(Z2711RpExHdFe)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KA384( ) ;
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
                  insert1KA384( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || !( GXutil.dateCompare(GXutil.resetTime(A2711RpExHdFe), GXutil.resetTime(Z2711RpExHdFe)) ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = Z2248ManCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2711RpExHdFe = Z2711RpExHdFe ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
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
      getKey1KA384( ) ;
      if ( RcdFound384 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || !( GXutil.dateCompare(GXutil.resetTime(A2711RpExHdFe), GXutil.resetTime(Z2711RpExHdFe)) ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2248ManCod = Z2248ManCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            A2711RpExHdFe = Z2711RpExHdFe ;
            httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2248ManCod != Z2248ManCod ) || !( GXutil.dateCompare(GXutil.resetTime(A2711RpExHdFe), GXutil.resetTime(Z2711RpExHdFe)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tworkrep");
      GX_FocusControl = edtRpExHdUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KA0( ) ;
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
      if ( RcdFound384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRpExHdUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KA384( ) ;
      if ( RcdFound384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRpExHdUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KA384( ) ;
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
      if ( RcdFound384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRpExHdUl_Internalname ;
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
      if ( RcdFound384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRpExHdUl_Internalname ;
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
      scanStart1KA384( ) ;
      if ( RcdFound384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound384 != 0 )
         {
            scanNext1KA384( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRpExHdUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KA384( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KA384( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KA5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCREXHD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z2712RpExHdUl != T01KA5_A2712RpExHdUl[0] ) || ( GXutil.strcmp(Z11300RpExtDoc, T01KA5_A11300RpExtDoc[0]) != 0 ) )
         {
            if ( Z2712RpExHdUl != T01KA5_A2712RpExHdUl[0] )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExHdUl");
               GXutil.writeLogRaw("Old: ",Z2712RpExHdUl);
               GXutil.writeLogRaw("Current: ",T01KA5_A2712RpExHdUl[0]);
            }
            if ( GXutil.strcmp(Z11300RpExtDoc, T01KA5_A11300RpExtDoc[0]) != 0 )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExtDoc");
               GXutil.writeLogRaw("Old: ",Z11300RpExtDoc);
               GXutil.writeLogRaw("Current: ",T01KA5_A11300RpExtDoc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCREXHD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KA384( )
   {
      beforeValidate1KA384( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KA384( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KA384( 0) ;
         checkOptimisticConcurrency1KA384( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KA384( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KA384( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KA15 */
                  pr_default.execute(13, new Object[] {A2711RpExHdFe, Boolean.valueOf(n2712RpExHdUl), Short.valueOf(A2712RpExHdUl), Boolean.valueOf(n11300RpExtDoc), A11300RpExtDoc, A396EmprCod, Short.valueOf(A2248ManCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1KA384( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1KA0( ) ;
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
            load1KA384( ) ;
         }
         endLevel1KA384( ) ;
      }
      closeExtendedTableCursors1KA384( ) ;
   }

   public void update1KA384( )
   {
      beforeValidate1KA384( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KA384( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KA384( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KA384( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KA384( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KA16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n2712RpExHdUl), Short.valueOf(A2712RpExHdUl), Boolean.valueOf(n11300RpExtDoc), A11300RpExtDoc, A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCREXHD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KA384( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KA384( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1KA0( ) ;
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
         endLevel1KA384( ) ;
      }
      closeExtendedTableCursors1KA384( ) ;
   }

   public void deferredUpdate1KA384( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KA384( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KA384( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KA384( ) ;
         afterConfirm1KA384( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KA384( ) ;
            if ( AnyError == 0 )
            {
               scanStart1KA385( ) ;
               while ( RcdFound385 != 0 )
               {
                  getByPrimaryKey1KA385( ) ;
                  delete1KA385( ) ;
                  scanNext1KA385( ) ;
               }
               scanEnd1KA385( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KA17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound384 == 0 )
                        {
                           initAll1KA384( ) ;
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
                        resetCaption1KA0( ) ;
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
      sMode384 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KA384( ) ;
      Gx_mode = sMode384 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KA384( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01KA18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T01KA18_A407EmprNom[0] ;
         n407EmprNom = T01KA18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(16);
         /* Using cursor T01KA19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T01KA19_A2249ManNom[0] ;
         n2249ManNom = T01KA19_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         pr_default.close(17);
      }
   }

   public void processNestedLevel1KA385( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1KA385( ) ;
         if ( ( nRcdExists_385 != 0 ) || ( nIsMod_385 != 0 ) )
         {
            standaloneNotModal1KA385( ) ;
            getKey1KA385( ) ;
            if ( ( nRcdExists_385 == 0 ) && ( nRcdDeleted_385 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KA385( ) ;
            }
            else
            {
               if ( RcdFound385 != 0 )
               {
                  if ( ( nRcdDeleted_385 != 0 ) && ( nRcdExists_385 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KA385( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_385 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KA385( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_385 == 0 )
                  {
                     GXCCtl = "RPEXHDLI_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRpExHdLi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_385_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExHdLi_Internalname, GXutil.ltrim( localUtil.ntoc( A2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtRpExHdAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExHdKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExHdCns_Internalname, GXutil.ltrim( localUtil.ntoc( A2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExHdTip_Internalname, GXutil.rtrim( A2717RpExHdTip)) ;
         httpContext.changePostValue( edtRpExHdRes_Internalname, GXutil.rtrim( A2718RpExHdRes)) ;
         httpContext.changePostValue( edtRpExHdLoc_Internalname, GXutil.rtrim( A2719RpExHdLoc)) ;
         httpContext.changePostValue( edtRpExHdMts_Internalname, GXutil.ltrim( localUtil.ntoc( A2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRpExSalLn_Internalname, GXutil.ltrim( localUtil.ntoc( A6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom)) ;
         httpContext.changePostValue( edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z2713RpExHdLi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2714RpExHdAlb_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2715RpExHdKgs_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2716RpExHdCns_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2717RpExHdTip_"+sGXsfl_55_idx, GXutil.rtrim( Z2717RpExHdTip)) ;
         httpContext.changePostValue( "ZT_"+"Z2718RpExHdRes_"+sGXsfl_55_idx, GXutil.rtrim( Z2718RpExHdRes)) ;
         httpContext.changePostValue( "ZT_"+"Z2719RpExHdLoc_"+sGXsfl_55_idx, GXutil.rtrim( Z2719RpExHdLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z2847RpExHdMts_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6262RpExSalLn_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "nRcdDeleted_385_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_385_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_385_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_385 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_385_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_385_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdLi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDALB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdAlb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDKGS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDCNS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdCns_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDRES_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDLOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXHDMTS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RPEXSALLN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExSalLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KA385( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_385 = (short)(0) ;
      nIsMod_385 = (short)(0) ;
      nRcdDeleted_385 = (short)(0) ;
   }

   public void processLevel1KA384( )
   {
      /* Save parent mode. */
      sMode384 = Gx_mode ;
      processNestedLevel1KA385( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode384 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KA384( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KA384( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tworkrep");
         if ( AnyError == 0 )
         {
            confirmValues1KA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tworkrep");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KA384( )
   {
      /* Using cursor T01KA20 */
      pr_default.execute(18);
      RcdFound384 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound384 = (short)(1) ;
         A396EmprCod = T01KA20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = T01KA20_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2711RpExHdFe = T01KA20_A2711RpExHdFe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KA384( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound384 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound384 = (short)(1) ;
         A396EmprCod = T01KA20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = T01KA20_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         A2711RpExHdFe = T01KA20_A2711RpExHdFe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
      }
   }

   public void scanEnd1KA384( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1KA384( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KA384( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KA384( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KA384( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KA384( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KA384( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KA384( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtRpExHdFe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdFe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdFe_Enabled), 5, 0), true);
      edtManNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtRpExHdUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdUl_Enabled), 5, 0), true);
      edtRpExtDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExtDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExtDoc_Enabled), 5, 0), true);
   }

   public void zm1KA385( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2714RpExHdAlb = T01KA3_A2714RpExHdAlb[0] ;
            Z2715RpExHdKgs = T01KA3_A2715RpExHdKgs[0] ;
            Z2716RpExHdCns = T01KA3_A2716RpExHdCns[0] ;
            Z2717RpExHdTip = T01KA3_A2717RpExHdTip[0] ;
            Z2718RpExHdRes = T01KA3_A2718RpExHdRes[0] ;
            Z2719RpExHdLoc = T01KA3_A2719RpExHdLoc[0] ;
            Z2847RpExHdMts = T01KA3_A2847RpExHdMts[0] ;
            Z6262RpExSalLn = T01KA3_A6262RpExSalLn[0] ;
            Z129BarCod = T01KA3_A129BarCod[0] ;
            Z132BarCodReo = T01KA3_A132BarCodReo[0] ;
            Z130BarCodPar = T01KA3_A130BarCodPar[0] ;
         }
         else
         {
            Z2714RpExHdAlb = A2714RpExHdAlb ;
            Z2715RpExHdKgs = A2715RpExHdKgs ;
            Z2716RpExHdCns = A2716RpExHdCns ;
            Z2717RpExHdTip = A2717RpExHdTip ;
            Z2718RpExHdRes = A2718RpExHdRes ;
            Z2719RpExHdLoc = A2719RpExHdLoc ;
            Z2847RpExHdMts = A2847RpExHdMts ;
            Z6262RpExSalLn = A6262RpExSalLn ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z2248ManCod = A2248ManCod ;
         Z2711RpExHdFe = A2711RpExHdFe ;
         Z2713RpExHdLi = A2713RpExHdLi ;
         Z2714RpExHdAlb = A2714RpExHdAlb ;
         Z2715RpExHdKgs = A2715RpExHdKgs ;
         Z2716RpExHdCns = A2716RpExHdCns ;
         Z2717RpExHdTip = A2717RpExHdTip ;
         Z2718RpExHdRes = A2718RpExHdRes ;
         Z2719RpExHdLoc = A2719RpExHdLoc ;
         Z2847RpExHdMts = A2847RpExHdMts ;
         Z6262RpExSalLn = A6262RpExSalLn ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1KA385( )
   {
   }

   public void standaloneModal1KA385( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRpExHdLi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtRpExHdLi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1KA385( )
   {
      /* Using cursor T01KA21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound385 = (short)(1) ;
         A2714RpExHdAlb = T01KA21_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = T01KA21_n2714RpExHdAlb[0] ;
         A2715RpExHdKgs = T01KA21_A2715RpExHdKgs[0] ;
         n2715RpExHdKgs = T01KA21_n2715RpExHdKgs[0] ;
         A2716RpExHdCns = T01KA21_A2716RpExHdCns[0] ;
         n2716RpExHdCns = T01KA21_n2716RpExHdCns[0] ;
         A2717RpExHdTip = T01KA21_A2717RpExHdTip[0] ;
         n2717RpExHdTip = T01KA21_n2717RpExHdTip[0] ;
         A2718RpExHdRes = T01KA21_A2718RpExHdRes[0] ;
         n2718RpExHdRes = T01KA21_n2718RpExHdRes[0] ;
         A2719RpExHdLoc = T01KA21_A2719RpExHdLoc[0] ;
         n2719RpExHdLoc = T01KA21_n2719RpExHdLoc[0] ;
         A2847RpExHdMts = T01KA21_A2847RpExHdMts[0] ;
         n2847RpExHdMts = T01KA21_n2847RpExHdMts[0] ;
         A6262RpExSalLn = T01KA21_A6262RpExSalLn[0] ;
         n6262RpExSalLn = T01KA21_n6262RpExSalLn[0] ;
         A135BarColNom = T01KA21_A135BarColNom[0] ;
         A136BarColNum = T01KA21_A136BarColNum[0] ;
         A212BarSer = T01KA21_A212BarSer[0] ;
         A1652BarSerDsc = T01KA21_A1652BarSerDsc[0] ;
         A129BarCod = T01KA21_A129BarCod[0] ;
         A132BarCodReo = T01KA21_A132BarCodReo[0] ;
         A130BarCodPar = T01KA21_A130BarCodPar[0] ;
         A252CliCod = T01KA21_A252CliCod[0] ;
         n252CliCod = T01KA21_n252CliCod[0] ;
         zm1KA385( -4) ;
      }
      pr_default.close(19);
      onLoadActions1KA385( ) ;
   }

   public void onLoadActions1KA385( )
   {
   }

   public void checkExtendedTable1KA385( )
   {
      nIsDirty_385 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KA385( ) ;
      /* Using cursor T01KA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A135BarColNom = T01KA4_A135BarColNom[0] ;
      A136BarColNum = T01KA4_A136BarColNum[0] ;
      A212BarSer = T01KA4_A212BarSer[0] ;
      A1652BarSerDsc = T01KA4_A1652BarSerDsc[0] ;
      A252CliCod = T01KA4_A252CliCod[0] ;
      n252CliCod = T01KA4_n252CliCod[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1KA385( )
   {
      pr_default.close(2);
   }

   public void enableDisable1KA385( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01KA22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A135BarColNom = T01KA22_A135BarColNom[0] ;
      A136BarColNum = T01KA22_A136BarColNum[0] ;
      A212BarSer = T01KA22_A212BarSer[0] ;
      A1652BarSerDsc = T01KA22_A1652BarSerDsc[0] ;
      A252CliCod = T01KA22_A252CliCod[0] ;
      n252CliCod = T01KA22_n252CliCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1652BarSerDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1KA385( )
   {
      /* Using cursor T01KA23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound385 = (short)(1) ;
      }
      else
      {
         RcdFound385 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1KA385( )
   {
      /* Using cursor T01KA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1KA385( 4) ;
         RcdFound385 = (short)(1) ;
         initializeNonKey1KA385( ) ;
         A2713RpExHdLi = T01KA3_A2713RpExHdLi[0] ;
         A2714RpExHdAlb = T01KA3_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = T01KA3_n2714RpExHdAlb[0] ;
         A2715RpExHdKgs = T01KA3_A2715RpExHdKgs[0] ;
         n2715RpExHdKgs = T01KA3_n2715RpExHdKgs[0] ;
         A2716RpExHdCns = T01KA3_A2716RpExHdCns[0] ;
         n2716RpExHdCns = T01KA3_n2716RpExHdCns[0] ;
         A2717RpExHdTip = T01KA3_A2717RpExHdTip[0] ;
         n2717RpExHdTip = T01KA3_n2717RpExHdTip[0] ;
         A2718RpExHdRes = T01KA3_A2718RpExHdRes[0] ;
         n2718RpExHdRes = T01KA3_n2718RpExHdRes[0] ;
         A2719RpExHdLoc = T01KA3_A2719RpExHdLoc[0] ;
         n2719RpExHdLoc = T01KA3_n2719RpExHdLoc[0] ;
         A2847RpExHdMts = T01KA3_A2847RpExHdMts[0] ;
         n2847RpExHdMts = T01KA3_n2847RpExHdMts[0] ;
         A6262RpExSalLn = T01KA3_A6262RpExSalLn[0] ;
         n6262RpExSalLn = T01KA3_n6262RpExSalLn[0] ;
         A129BarCod = T01KA3_A129BarCod[0] ;
         A132BarCodReo = T01KA3_A132BarCodReo[0] ;
         A130BarCodPar = T01KA3_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z2248ManCod = A2248ManCod ;
         Z2711RpExHdFe = A2711RpExHdFe ;
         Z2713RpExHdLi = A2713RpExHdLi ;
         sMode385 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KA385( ) ;
         load1KA385( ) ;
         Gx_mode = sMode385 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound385 = (short)(0) ;
         initializeNonKey1KA385( ) ;
         sMode385 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KA385( ) ;
         Gx_mode = sMode385 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KA385( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KA385( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLREXHD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z2714RpExHdAlb != T01KA2_A2714RpExHdAlb[0] ) || ( DecimalUtil.compareTo(Z2715RpExHdKgs, T01KA2_A2715RpExHdKgs[0]) != 0 ) || ( Z2716RpExHdCns != T01KA2_A2716RpExHdCns[0] ) || ( GXutil.strcmp(Z2717RpExHdTip, T01KA2_A2717RpExHdTip[0]) != 0 ) || ( GXutil.strcmp(Z2718RpExHdRes, T01KA2_A2718RpExHdRes[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2719RpExHdLoc, T01KA2_A2719RpExHdLoc[0]) != 0 ) || ( DecimalUtil.compareTo(Z2847RpExHdMts, T01KA2_A2847RpExHdMts[0]) != 0 ) || ( Z6262RpExSalLn != T01KA2_A6262RpExSalLn[0] ) || ( Z129BarCod != T01KA2_A129BarCod[0] ) || ( Z132BarCodReo != T01KA2_A132BarCodReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z130BarCodPar, T01KA2_A130BarCodPar[0]) != 0 ) )
         {
            if ( Z2714RpExHdAlb != T01KA2_A2714RpExHdAlb[0] )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExHdAlb");
               GXutil.writeLogRaw("Old: ",Z2714RpExHdAlb);
               GXutil.writeLogRaw("Current: ",T01KA2_A2714RpExHdAlb[0]);
            }
            if ( DecimalUtil.compareTo(Z2715RpExHdKgs, T01KA2_A2715RpExHdKgs[0]) != 0 )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExHdKgs");
               GXutil.writeLogRaw("Old: ",Z2715RpExHdKgs);
               GXutil.writeLogRaw("Current: ",T01KA2_A2715RpExHdKgs[0]);
            }
            if ( Z2716RpExHdCns != T01KA2_A2716RpExHdCns[0] )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExHdCns");
               GXutil.writeLogRaw("Old: ",Z2716RpExHdCns);
               GXutil.writeLogRaw("Current: ",T01KA2_A2716RpExHdCns[0]);
            }
            if ( GXutil.strcmp(Z2717RpExHdTip, T01KA2_A2717RpExHdTip[0]) != 0 )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExHdTip");
               GXutil.writeLogRaw("Old: ",Z2717RpExHdTip);
               GXutil.writeLogRaw("Current: ",T01KA2_A2717RpExHdTip[0]);
            }
            if ( GXutil.strcmp(Z2718RpExHdRes, T01KA2_A2718RpExHdRes[0]) != 0 )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExHdRes");
               GXutil.writeLogRaw("Old: ",Z2718RpExHdRes);
               GXutil.writeLogRaw("Current: ",T01KA2_A2718RpExHdRes[0]);
            }
            if ( GXutil.strcmp(Z2719RpExHdLoc, T01KA2_A2719RpExHdLoc[0]) != 0 )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExHdLoc");
               GXutil.writeLogRaw("Old: ",Z2719RpExHdLoc);
               GXutil.writeLogRaw("Current: ",T01KA2_A2719RpExHdLoc[0]);
            }
            if ( DecimalUtil.compareTo(Z2847RpExHdMts, T01KA2_A2847RpExHdMts[0]) != 0 )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExHdMts");
               GXutil.writeLogRaw("Old: ",Z2847RpExHdMts);
               GXutil.writeLogRaw("Current: ",T01KA2_A2847RpExHdMts[0]);
            }
            if ( Z6262RpExSalLn != T01KA2_A6262RpExSalLn[0] )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"RpExSalLn");
               GXutil.writeLogRaw("Old: ",Z6262RpExSalLn);
               GXutil.writeLogRaw("Current: ",T01KA2_A6262RpExSalLn[0]);
            }
            if ( Z129BarCod != T01KA2_A129BarCod[0] )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01KA2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01KA2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01KA2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01KA2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tworkrep:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01KA2_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLREXHD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KA385( )
   {
      beforeValidate1KA385( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KA385( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KA385( 0) ;
         checkOptimisticConcurrency1KA385( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KA385( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KA385( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KA24 */
                  pr_default.execute(22, new Object[] {Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi), Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Boolean.valueOf(n2715RpExHdKgs), A2715RpExHdKgs, Boolean.valueOf(n2716RpExHdCns), Short.valueOf(A2716RpExHdCns), Boolean.valueOf(n2717RpExHdTip), A2717RpExHdTip, Boolean.valueOf(n2718RpExHdRes), A2718RpExHdRes, Boolean.valueOf(n2719RpExHdLoc), A2719RpExHdLoc, Boolean.valueOf(n2847RpExHdMts), A2847RpExHdMts, Boolean.valueOf(n6262RpExSalLn), Short.valueOf(A6262RpExSalLn), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
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
            load1KA385( ) ;
         }
         endLevel1KA385( ) ;
      }
      closeExtendedTableCursors1KA385( ) ;
   }

   public void update1KA385( )
   {
      beforeValidate1KA385( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KA385( ) ;
      }
      if ( ( nIsMod_385 != 0 ) || ( nIsDirty_385 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KA385( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KA385( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KA385( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01KA25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Boolean.valueOf(n2715RpExHdKgs), A2715RpExHdKgs, Boolean.valueOf(n2716RpExHdCns), Short.valueOf(A2716RpExHdCns), Boolean.valueOf(n2717RpExHdTip), A2717RpExHdTip, Boolean.valueOf(n2718RpExHdRes), A2718RpExHdRes, Boolean.valueOf(n2719RpExHdLoc), A2719RpExHdLoc, Boolean.valueOf(n2847RpExHdMts), A2847RpExHdMts, Boolean.valueOf(n6262RpExSalLn), Short.valueOf(A6262RpExSalLn), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLREXHD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1KA385( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KA385( ) ;
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
            endLevel1KA385( ) ;
         }
      }
      closeExtendedTableCursors1KA385( ) ;
   }

   public void deferredUpdate1KA385( )
   {
   }

   public void delete1KA385( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KA385( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KA385( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KA385( ) ;
         afterConfirm1KA385( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KA385( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KA26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
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
      sMode385 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KA385( ) ;
      Gx_mode = sMode385 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KA385( )
   {
      standaloneModal1KA385( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01KA27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A135BarColNom = T01KA27_A135BarColNom[0] ;
         A136BarColNum = T01KA27_A136BarColNum[0] ;
         A212BarSer = T01KA27_A212BarSer[0] ;
         A1652BarSerDsc = T01KA27_A1652BarSerDsc[0] ;
         A252CliCod = T01KA27_A252CliCod[0] ;
         n252CliCod = T01KA27_n252CliCod[0] ;
         pr_default.close(25);
      }
   }

   public void endLevel1KA385( )
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

   public void scanStart1KA385( )
   {
      /* Scan By routine */
      /* Using cursor T01KA28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
      RcdFound385 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound385 = (short)(1) ;
         A2713RpExHdLi = T01KA28_A2713RpExHdLi[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KA385( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound385 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound385 = (short)(1) ;
         A2713RpExHdLi = T01KA28_A2713RpExHdLi[0] ;
      }
   }

   public void scanEnd1KA385( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1KA385( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KA385( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KA385( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KA385( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KA385( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KA385( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KA385( )
   {
      edtRpExHdLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRpExHdAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdAlb_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRpExHdKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdKgs_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRpExHdCns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdCns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdCns_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRpExHdTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdTip_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRpExHdRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdRes_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRpExHdLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLoc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRpExHdMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdMts_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtRpExSalLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExSalLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExSalLn_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1KA385( )
   {
   }

   public void send_integrity_lvl_hashes1KA384( )
   {
   }

   public void subsflControlProps_55385( )
   {
      edtavnRcdDeleted_385_Internalname = "vNRCDDELETED_385_"+sGXsfl_55_idx ;
      edtRpExHdLi_Internalname = "RPEXHDLI_"+sGXsfl_55_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_idx ;
      edtRpExHdAlb_Internalname = "RPEXHDALB_"+sGXsfl_55_idx ;
      edtRpExHdKgs_Internalname = "RPEXHDKGS_"+sGXsfl_55_idx ;
      edtRpExHdCns_Internalname = "RPEXHDCNS_"+sGXsfl_55_idx ;
      edtRpExHdTip_Internalname = "RPEXHDTIP_"+sGXsfl_55_idx ;
      edtRpExHdRes_Internalname = "RPEXHDRES_"+sGXsfl_55_idx ;
      edtRpExHdLoc_Internalname = "RPEXHDLOC_"+sGXsfl_55_idx ;
      edtRpExHdMts_Internalname = "RPEXHDMTS_"+sGXsfl_55_idx ;
      edtRpExSalLn_Internalname = "RPEXSALLN_"+sGXsfl_55_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_55_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_55_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_55_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_55_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_55385( )
   {
      edtavnRcdDeleted_385_Internalname = "vNRCDDELETED_385_"+sGXsfl_55_fel_idx ;
      edtRpExHdLi_Internalname = "RPEXHDLI_"+sGXsfl_55_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_fel_idx ;
      edtRpExHdAlb_Internalname = "RPEXHDALB_"+sGXsfl_55_fel_idx ;
      edtRpExHdKgs_Internalname = "RPEXHDKGS_"+sGXsfl_55_fel_idx ;
      edtRpExHdCns_Internalname = "RPEXHDCNS_"+sGXsfl_55_fel_idx ;
      edtRpExHdTip_Internalname = "RPEXHDTIP_"+sGXsfl_55_fel_idx ;
      edtRpExHdRes_Internalname = "RPEXHDRES_"+sGXsfl_55_fel_idx ;
      edtRpExHdLoc_Internalname = "RPEXHDLOC_"+sGXsfl_55_fel_idx ;
      edtRpExHdMts_Internalname = "RPEXHDMTS_"+sGXsfl_55_fel_idx ;
      edtRpExSalLn_Internalname = "RPEXSALLN_"+sGXsfl_55_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_55_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_55_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_55_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_55_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1KA385( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55385( ) ;
      sendRow1KA385( ) ;
   }

   public void sendRow1KA385( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_385_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_385_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_385), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_385), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_385_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_385_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdLi_Internalname,GXutil.ltrim( localUtil.ntoc( A2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2713RpExHdLi), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdLi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExHdLi_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdAlb_Internalname,GXutil.ltrim( localUtil.ntoc( A2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRpExHdAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2714RpExHdAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2714RpExHdAlb), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdAlb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExHdAlb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRpExHdKgs_Enabled!=0) ? localUtil.format( A2715RpExHdKgs, "ZZZZZ9.99") : localUtil.format( A2715RpExHdKgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExHdKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdCns_Internalname,GXutil.ltrim( localUtil.ntoc( A2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRpExHdCns_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2716RpExHdCns), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2716RpExHdCns), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdCns_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExHdCns_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdTip_Internalname,GXutil.rtrim( A2717RpExHdTip),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExHdTip_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdRes_Internalname,GXutil.rtrim( A2718RpExHdRes),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExHdRes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdLoc_Internalname,GXutil.rtrim( A2719RpExHdLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExHdLoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExHdMts_Internalname,GXutil.ltrim( localUtil.ntoc( A2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRpExHdMts_Enabled!=0) ? localUtil.format( A2847RpExHdMts, "ZZZZZ9.99") : localUtil.format( A2847RpExHdMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExHdMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExHdMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_385_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpExSalLn_Internalname,GXutil.ltrim( localUtil.ntoc( A6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRpExSalLn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6262RpExSalLn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6262RpExSalLn), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpExSalLn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRpExSalLn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSerDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1KA385( ) ;
      GXCCtl = "Z2713RpExHdLi_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2713RpExHdLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2714RpExHdAlb_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2714RpExHdAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2715RpExHdKgs_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2715RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2716RpExHdCns_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2716RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2717RpExHdTip_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2717RpExHdTip));
      GXCCtl = "Z2718RpExHdRes_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2718RpExHdRes));
      GXCCtl = "Z2719RpExHdLoc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2719RpExHdLoc));
      GXCCtl = "Z2847RpExHdMts_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2847RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6262RpExSalLn_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6262RpExSalLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z129BarCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "nRcdDeleted_385_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_385_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_385_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_385, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_385_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_385_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXHDLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdLi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXHDALB_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdAlb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXHDKGS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXHDCNS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdCns_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXHDTIP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXHDRES_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXHDLOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXHDMTS_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RPEXSALLN_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExSalLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1KA385( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55385( ) ;
      edtavnRcdDeleted_385_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_385_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExHdLi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDLI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExHdAlb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDALB_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExHdKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDKGS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExHdCns_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDCNS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExHdTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDTIP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExHdRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDRES_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExHdLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDLOC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExHdMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXHDMTS_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRpExSalLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RPEXSALLN_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSerDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_385_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_385_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_385");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_385_Internalname ;
         wbErr = true ;
         nRcdDeleted_385 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_385 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_385_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "RPEXHDLI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpExHdLi_Internalname ;
         wbErr = true ;
         A2713RpExHdLi = (short)(0) ;
      }
      else
      {
         A2713RpExHdLi = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExHdLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_55_idx ;
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
         GXCCtl = "BARCODREO_" + sGXsfl_55_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "RPEXHDALB_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpExHdAlb_Internalname ;
         wbErr = true ;
         A2714RpExHdAlb = 0 ;
         n2714RpExHdAlb = false ;
      }
      else
      {
         A2714RpExHdAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtRpExHdAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2714RpExHdAlb = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRpExHdKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRpExHdKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "RPEXHDKGS_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpExHdKgs_Internalname ;
         wbErr = true ;
         A2715RpExHdKgs = DecimalUtil.ZERO ;
         n2715RpExHdKgs = false ;
      }
      else
      {
         A2715RpExHdKgs = localUtil.ctond( httpContext.cgiGet( edtRpExHdKgs_Internalname)) ;
         n2715RpExHdKgs = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdCns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExHdCns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "RPEXHDCNS_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpExHdCns_Internalname ;
         wbErr = true ;
         A2716RpExHdCns = (short)(0) ;
         n2716RpExHdCns = false ;
      }
      else
      {
         A2716RpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExHdCns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2716RpExHdCns = false ;
      }
      A2717RpExHdTip = httpContext.cgiGet( edtRpExHdTip_Internalname) ;
      n2717RpExHdTip = false ;
      A2718RpExHdRes = httpContext.cgiGet( edtRpExHdRes_Internalname) ;
      n2718RpExHdRes = false ;
      A2719RpExHdLoc = httpContext.cgiGet( edtRpExHdLoc_Internalname) ;
      n2719RpExHdLoc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRpExHdMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRpExHdMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "RPEXHDMTS_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpExHdMts_Internalname ;
         wbErr = true ;
         A2847RpExHdMts = DecimalUtil.ZERO ;
         n2847RpExHdMts = false ;
      }
      else
      {
         A2847RpExHdMts = localUtil.ctond( httpContext.cgiGet( edtRpExHdMts_Internalname)) ;
         n2847RpExHdMts = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRpExSalLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRpExSalLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "RPEXSALLN_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRpExSalLn_Internalname ;
         wbErr = true ;
         A6262RpExSalLn = (short)(0) ;
         n6262RpExSalLn = false ;
      }
      else
      {
         A6262RpExSalLn = (short)(localUtil.ctol( httpContext.cgiGet( edtRpExSalLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6262RpExSalLn = false ;
      }
      A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n252CliCod = false ;
      A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
      A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
      A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
      GXCCtl = "Z2713RpExHdLi_" + sGXsfl_55_idx ;
      Z2713RpExHdLi = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2714RpExHdAlb_" + sGXsfl_55_idx ;
      Z2714RpExHdAlb = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2715RpExHdKgs_" + sGXsfl_55_idx ;
      Z2715RpExHdKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2716RpExHdCns_" + sGXsfl_55_idx ;
      Z2716RpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2717RpExHdTip_" + sGXsfl_55_idx ;
      Z2717RpExHdTip = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2718RpExHdRes_" + sGXsfl_55_idx ;
      Z2718RpExHdRes = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2719RpExHdLoc_" + sGXsfl_55_idx ;
      Z2719RpExHdLoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2847RpExHdMts_" + sGXsfl_55_idx ;
      Z2847RpExHdMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6262RpExSalLn_" + sGXsfl_55_idx ;
      Z6262RpExSalLn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_55_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_55_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_55_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_385_" + sGXsfl_55_idx ;
      nRcdDeleted_385 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_385_" + sGXsfl_55_idx ;
      nRcdExists_385 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_385_" + sGXsfl_55_idx ;
      nIsMod_385 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRpExHdLi_Enabled = edtRpExHdLi_Enabled ;
   }

   public void confirmValues1KA0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55385( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55385( ) ;
         httpContext.changePostValue( "Z2713RpExHdLi_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2713RpExHdLi_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2713RpExHdLi_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2714RpExHdAlb_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2714RpExHdAlb_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2714RpExHdAlb_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2715RpExHdKgs_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2715RpExHdKgs_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2715RpExHdKgs_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2716RpExHdCns_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2716RpExHdCns_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2716RpExHdCns_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2717RpExHdTip_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2717RpExHdTip_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2717RpExHdTip_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2718RpExHdRes_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2718RpExHdRes_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2718RpExHdRes_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2719RpExHdLoc_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2719RpExHdLoc_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2719RpExHdLoc_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z2847RpExHdMts_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z2847RpExHdMts_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2847RpExHdMts_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z6262RpExSalLn_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z6262RpExSalLn_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6262RpExSalLn_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tworkrep", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2711RpExHdFe", localUtil.dtoc( Z2711RpExHdFe, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2712RpExHdUl", GXutil.ltrim( localUtil.ntoc( Z2712RpExHdUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11300RpExtDoc", GXutil.rtrim( Z11300RpExtDoc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tworkrep", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TWORKREP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recepcion Trabajos Externos", "") ;
   }

   public void initializeNonKey1KA384( )
   {
      A2249ManNom = "" ;
      n2249ManNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A2712RpExHdUl = (short)(0) ;
      n2712RpExHdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2712RpExHdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2712RpExHdUl), 4, 0));
      A11300RpExtDoc = "" ;
      n11300RpExtDoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11300RpExtDoc", A11300RpExtDoc);
      Z2712RpExHdUl = (short)(0) ;
      Z11300RpExtDoc = "" ;
   }

   public void initAll1KA384( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2248ManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      A2711RpExHdFe = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A2711RpExHdFe", localUtil.format(A2711RpExHdFe, "99/99/99"));
      initializeNonKey1KA384( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KA385( )
   {
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      A2714RpExHdAlb = 0 ;
      n2714RpExHdAlb = false ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      n2715RpExHdKgs = false ;
      A2716RpExHdCns = (short)(0) ;
      n2716RpExHdCns = false ;
      A2717RpExHdTip = "" ;
      n2717RpExHdTip = false ;
      A2718RpExHdRes = "" ;
      n2718RpExHdRes = false ;
      A2719RpExHdLoc = "" ;
      n2719RpExHdLoc = false ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      n2847RpExHdMts = false ;
      A6262RpExSalLn = (short)(0) ;
      n6262RpExSalLn = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      A135BarColNom = "" ;
      A136BarColNum = 0 ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      Z2714RpExHdAlb = 0 ;
      Z2715RpExHdKgs = DecimalUtil.ZERO ;
      Z2716RpExHdCns = (short)(0) ;
      Z2717RpExHdTip = "" ;
      Z2718RpExHdRes = "" ;
      Z2719RpExHdLoc = "" ;
      Z2847RpExHdMts = DecimalUtil.ZERO ;
      Z6262RpExSalLn = (short)(0) ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll1KA385( )
   {
      A2713RpExHdLi = (short)(0) ;
      initializeNonKey1KA385( ) ;
   }

   public void standaloneModalInsert1KA385( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241584617", true, true);
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
      httpContext.AddJavascriptSource("tworkrep.js", "?20268241584617", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties385( )
   {
      edtRpExHdLi_Enabled = defedtRpExHdLi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRpExHdLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRpExHdLi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_385, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_385_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2713RpExHdLi, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdLi_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2714RpExHdAlb, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdAlb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2715RpExHdKgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2716RpExHdCns, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdCns_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2717RpExHdTip));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2718RpExHdRes));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2719RpExHdLoc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2847RpExHdMts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExHdMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6262RpExSalLn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRpExSalLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtManCod_Internalname = "MANCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtRpExHdFe_Internalname = "RPEXHDFE" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtManNom_Internalname = "MANNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRpExHdUl_Internalname = "RPEXHDUL" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtRpExtDoc_Internalname = "RPEXTDOC" ;
      edtavnRcdDeleted_385_Internalname = "vNRCDDELETED_385" ;
      edtRpExHdLi_Internalname = "RPEXHDLI" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRpExHdAlb_Internalname = "RPEXHDALB" ;
      edtRpExHdKgs_Internalname = "RPEXHDKGS" ;
      edtRpExHdCns_Internalname = "RPEXHDCNS" ;
      edtRpExHdTip_Internalname = "RPEXHDTIP" ;
      edtRpExHdRes_Internalname = "RPEXHDRES" ;
      edtRpExHdLoc_Internalname = "RPEXHDLOC" ;
      edtRpExHdMts_Internalname = "RPEXHDMTS" ;
      edtRpExSalLn_Internalname = "RPEXSALLN" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
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
      Form.setCaption( httpContext.getMessage( "Recepcion Trabajos Externos", "") );
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtRpExSalLn_Jsonclick = "" ;
      edtRpExHdMts_Jsonclick = "" ;
      edtRpExHdLoc_Jsonclick = "" ;
      edtRpExHdRes_Jsonclick = "" ;
      edtRpExHdTip_Jsonclick = "" ;
      edtRpExHdCns_Jsonclick = "" ;
      edtRpExHdKgs_Jsonclick = "" ;
      edtRpExHdAlb_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtRpExHdLi_Jsonclick = "" ;
      edtavnRcdDeleted_385_Jsonclick = "" ;
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
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Enabled = 0 ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Enabled = 0 ;
      edtCliCod_Enabled = 0 ;
      edtRpExSalLn_Enabled = 1 ;
      edtRpExHdMts_Enabled = 1 ;
      edtRpExHdLoc_Enabled = 1 ;
      edtRpExHdRes_Enabled = 1 ;
      edtRpExHdTip_Enabled = 1 ;
      edtRpExHdCns_Enabled = 1 ;
      edtRpExHdKgs_Enabled = 1 ;
      edtRpExHdAlb_Enabled = 1 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtRpExHdLi_Enabled = 1 ;
      edtavnRcdDeleted_385_Enabled = 1 ;
      edtRpExtDoc_Jsonclick = "" ;
      edtRpExtDoc_Backcolor = (int)(0xFFFFFF) ;
      edtRpExtDoc_Enabled = 1 ;
      edtRpExHdUl_Jsonclick = "" ;
      edtRpExHdUl_Backcolor = (int)(0xFFFFFF) ;
      edtRpExHdUl_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtManNom_Jsonclick = "" ;
      edtManNom_Backcolor = (int)(0xFFFFFF) ;
      edtManNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRpExHdFe_Jsonclick = "" ;
      edtRpExHdFe_Backcolor = (int)(0xFFFFFF) ;
      edtRpExHdFe_Enabled = 1 ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Backcolor = (int)(0xFFFFFF) ;
      edtManCod_Enabled = 1 ;
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
      subsflControlProps_55385( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KA385( ) ;
         standaloneModal1KA385( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KA385( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55385( ) ;
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
      /* Using cursor T01KA18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01KA18_A407EmprNom[0] ;
      n407EmprNom = T01KA18_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(16);
      /* Using cursor T01KA19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T01KA19_A2249ManNom[0] ;
      n2249ManNom = T01KA19_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      pr_default.close(17);
      GX_FocusControl = edtRpExHdUl_Internalname ;
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
      /* Using cursor T01KA18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01KA18_A407EmprNom[0] ;
      n407EmprNom = T01KA18_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Mancod( )
   {
      n2249ManNom = false ;
      /* Using cursor T01KA19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MANUFA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A2249ManNom = T01KA19_A2249ManNom[0] ;
      n2249ManNom = T01KA19_n2249ManNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
   }

   public void valid_Rpexhdfe( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2712RpExHdUl", GXutil.ltrim( localUtil.ntoc( A2712RpExHdUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11300RpExtDoc", GXutil.rtrim( A11300RpExtDoc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2711RpExHdFe", localUtil.format(Z2711RpExHdFe, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2712RpExHdUl", GXutil.ltrim( localUtil.ntoc( Z2712RpExHdUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11300RpExtDoc", GXutil.rtrim( Z11300RpExtDoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2249ManNom", GXutil.rtrim( Z2249ManNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      /* Using cursor T01KA27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A135BarColNom = T01KA27_A135BarColNom[0] ;
      A136BarColNum = T01KA27_A136BarColNum[0] ;
      A212BarSer = T01KA27_A212BarSer[0] ;
      A1652BarSerDsc = T01KA27_A1652BarSerDsc[0] ;
      A252CliCod = T01KA27_A252CliCod[0] ;
      n252CliCod = T01KA27_n252CliCod[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''}]");
      setEventMetadata("VALID_MANCOD",",oparms:[{av:'A2249ManNom',fld:'MANNOM',pic:''}]}");
      setEventMetadata("VALID_RPEXHDFE","{handler:'valid_Rpexhdfe',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2711RpExHdFe',fld:'RPEXHDFE',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RPEXHDFE",",oparms:[{av:'A2712RpExHdUl',fld:'RPEXHDUL',pic:'ZZZ9'},{av:'A11300RpExtDoc',fld:'RPEXTDOC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2249ManNom',fld:'MANNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2248ManCod'},{av:'Z2711RpExHdFe'},{av:'Z2712RpExHdUl'},{av:'Z11300RpExtDoc'},{av:'Z407EmprNom'},{av:'Z2249ManNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RPEXHDLI","{handler:'valid_Rpexhdli',iparms:[]");
      setEventMetadata("VALID_RPEXHDLI",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'valid_Barserdsc',iparms:[]");
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
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2711RpExHdFe = GXutil.nullDate() ;
      Z11300RpExtDoc = "" ;
      Z2715RpExHdKgs = DecimalUtil.ZERO ;
      Z2717RpExHdTip = "" ;
      Z2718RpExHdRes = "" ;
      Z2719RpExHdLoc = "" ;
      Z2847RpExHdMts = DecimalUtil.ZERO ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      A2711RpExHdFe = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A2249ManNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11300RpExtDoc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode385 = "" ;
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
      sMode384 = "" ;
      GXCCtl = "" ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A2717RpExHdTip = "" ;
      A2718RpExHdRes = "" ;
      A2719RpExHdLoc = "" ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      Z407EmprNom = "" ;
      Z2249ManNom = "" ;
      T01KA9_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA9_A2249ManNom = new String[] {""} ;
      T01KA9_n2249ManNom = new boolean[] {false} ;
      T01KA9_A407EmprNom = new String[] {""} ;
      T01KA9_n407EmprNom = new boolean[] {false} ;
      T01KA9_A2712RpExHdUl = new short[1] ;
      T01KA9_n2712RpExHdUl = new boolean[] {false} ;
      T01KA9_A11300RpExtDoc = new String[] {""} ;
      T01KA9_n11300RpExtDoc = new boolean[] {false} ;
      T01KA9_A396EmprCod = new String[] {""} ;
      T01KA9_A2248ManCod = new short[1] ;
      T01KA7_A407EmprNom = new String[] {""} ;
      T01KA7_n407EmprNom = new boolean[] {false} ;
      T01KA8_A2249ManNom = new String[] {""} ;
      T01KA8_n2249ManNom = new boolean[] {false} ;
      T01KA10_A407EmprNom = new String[] {""} ;
      T01KA10_n407EmprNom = new boolean[] {false} ;
      T01KA11_A2249ManNom = new String[] {""} ;
      T01KA11_n2249ManNom = new boolean[] {false} ;
      T01KA12_A396EmprCod = new String[] {""} ;
      T01KA12_A2248ManCod = new short[1] ;
      T01KA12_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA6_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA6_A2712RpExHdUl = new short[1] ;
      T01KA6_n2712RpExHdUl = new boolean[] {false} ;
      T01KA6_A11300RpExtDoc = new String[] {""} ;
      T01KA6_n11300RpExtDoc = new boolean[] {false} ;
      T01KA6_A396EmprCod = new String[] {""} ;
      T01KA6_A2248ManCod = new short[1] ;
      T01KA13_A396EmprCod = new String[] {""} ;
      T01KA13_A2248ManCod = new short[1] ;
      T01KA13_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA14_A396EmprCod = new String[] {""} ;
      T01KA14_A2248ManCod = new short[1] ;
      T01KA14_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA5_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA5_A2712RpExHdUl = new short[1] ;
      T01KA5_n2712RpExHdUl = new boolean[] {false} ;
      T01KA5_A11300RpExtDoc = new String[] {""} ;
      T01KA5_n11300RpExtDoc = new boolean[] {false} ;
      T01KA5_A396EmprCod = new String[] {""} ;
      T01KA5_A2248ManCod = new short[1] ;
      T01KA18_A407EmprNom = new String[] {""} ;
      T01KA18_n407EmprNom = new boolean[] {false} ;
      T01KA19_A2249ManNom = new String[] {""} ;
      T01KA19_n2249ManNom = new boolean[] {false} ;
      T01KA20_A396EmprCod = new String[] {""} ;
      T01KA20_A2248ManCod = new short[1] ;
      T01KA20_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      Z135BarColNom = "" ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      T01KA21_A2248ManCod = new short[1] ;
      T01KA21_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA21_A2713RpExHdLi = new short[1] ;
      T01KA21_A2714RpExHdAlb = new int[1] ;
      T01KA21_n2714RpExHdAlb = new boolean[] {false} ;
      T01KA21_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KA21_n2715RpExHdKgs = new boolean[] {false} ;
      T01KA21_A2716RpExHdCns = new short[1] ;
      T01KA21_n2716RpExHdCns = new boolean[] {false} ;
      T01KA21_A2717RpExHdTip = new String[] {""} ;
      T01KA21_n2717RpExHdTip = new boolean[] {false} ;
      T01KA21_A2718RpExHdRes = new String[] {""} ;
      T01KA21_n2718RpExHdRes = new boolean[] {false} ;
      T01KA21_A2719RpExHdLoc = new String[] {""} ;
      T01KA21_n2719RpExHdLoc = new boolean[] {false} ;
      T01KA21_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KA21_n2847RpExHdMts = new boolean[] {false} ;
      T01KA21_A6262RpExSalLn = new short[1] ;
      T01KA21_n6262RpExSalLn = new boolean[] {false} ;
      T01KA21_A135BarColNom = new String[] {""} ;
      T01KA21_A136BarColNum = new int[1] ;
      T01KA21_A212BarSer = new String[] {""} ;
      T01KA21_A1652BarSerDsc = new String[] {""} ;
      T01KA21_A396EmprCod = new String[] {""} ;
      T01KA21_A129BarCod = new int[1] ;
      T01KA21_A132BarCodReo = new byte[1] ;
      T01KA21_A130BarCodPar = new String[] {""} ;
      T01KA21_A252CliCod = new int[1] ;
      T01KA21_n252CliCod = new boolean[] {false} ;
      T01KA4_A135BarColNom = new String[] {""} ;
      T01KA4_A136BarColNum = new int[1] ;
      T01KA4_A212BarSer = new String[] {""} ;
      T01KA4_A1652BarSerDsc = new String[] {""} ;
      T01KA4_A252CliCod = new int[1] ;
      T01KA4_n252CliCod = new boolean[] {false} ;
      T01KA22_A135BarColNom = new String[] {""} ;
      T01KA22_A136BarColNum = new int[1] ;
      T01KA22_A212BarSer = new String[] {""} ;
      T01KA22_A1652BarSerDsc = new String[] {""} ;
      T01KA22_A252CliCod = new int[1] ;
      T01KA22_n252CliCod = new boolean[] {false} ;
      T01KA23_A396EmprCod = new String[] {""} ;
      T01KA23_A2248ManCod = new short[1] ;
      T01KA23_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA23_A2713RpExHdLi = new short[1] ;
      T01KA3_A2248ManCod = new short[1] ;
      T01KA3_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA3_A2713RpExHdLi = new short[1] ;
      T01KA3_A2714RpExHdAlb = new int[1] ;
      T01KA3_n2714RpExHdAlb = new boolean[] {false} ;
      T01KA3_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KA3_n2715RpExHdKgs = new boolean[] {false} ;
      T01KA3_A2716RpExHdCns = new short[1] ;
      T01KA3_n2716RpExHdCns = new boolean[] {false} ;
      T01KA3_A2717RpExHdTip = new String[] {""} ;
      T01KA3_n2717RpExHdTip = new boolean[] {false} ;
      T01KA3_A2718RpExHdRes = new String[] {""} ;
      T01KA3_n2718RpExHdRes = new boolean[] {false} ;
      T01KA3_A2719RpExHdLoc = new String[] {""} ;
      T01KA3_n2719RpExHdLoc = new boolean[] {false} ;
      T01KA3_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KA3_n2847RpExHdMts = new boolean[] {false} ;
      T01KA3_A6262RpExSalLn = new short[1] ;
      T01KA3_n6262RpExSalLn = new boolean[] {false} ;
      T01KA3_A396EmprCod = new String[] {""} ;
      T01KA3_A129BarCod = new int[1] ;
      T01KA3_A132BarCodReo = new byte[1] ;
      T01KA3_A130BarCodPar = new String[] {""} ;
      T01KA2_A2248ManCod = new short[1] ;
      T01KA2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA2_A2713RpExHdLi = new short[1] ;
      T01KA2_A2714RpExHdAlb = new int[1] ;
      T01KA2_n2714RpExHdAlb = new boolean[] {false} ;
      T01KA2_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KA2_n2715RpExHdKgs = new boolean[] {false} ;
      T01KA2_A2716RpExHdCns = new short[1] ;
      T01KA2_n2716RpExHdCns = new boolean[] {false} ;
      T01KA2_A2717RpExHdTip = new String[] {""} ;
      T01KA2_n2717RpExHdTip = new boolean[] {false} ;
      T01KA2_A2718RpExHdRes = new String[] {""} ;
      T01KA2_n2718RpExHdRes = new boolean[] {false} ;
      T01KA2_A2719RpExHdLoc = new String[] {""} ;
      T01KA2_n2719RpExHdLoc = new boolean[] {false} ;
      T01KA2_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KA2_n2847RpExHdMts = new boolean[] {false} ;
      T01KA2_A6262RpExSalLn = new short[1] ;
      T01KA2_n6262RpExSalLn = new boolean[] {false} ;
      T01KA2_A396EmprCod = new String[] {""} ;
      T01KA2_A129BarCod = new int[1] ;
      T01KA2_A132BarCodReo = new byte[1] ;
      T01KA2_A130BarCodPar = new String[] {""} ;
      T01KA27_A135BarColNom = new String[] {""} ;
      T01KA27_A136BarColNum = new int[1] ;
      T01KA27_A212BarSer = new String[] {""} ;
      T01KA27_A1652BarSerDsc = new String[] {""} ;
      T01KA27_A252CliCod = new int[1] ;
      T01KA27_n252CliCod = new boolean[] {false} ;
      T01KA28_A396EmprCod = new String[] {""} ;
      T01KA28_A2248ManCod = new short[1] ;
      T01KA28_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01KA28_A2713RpExHdLi = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ2711RpExHdFe = GXutil.nullDate() ;
      ZZ11300RpExtDoc = "" ;
      ZZ407EmprNom = "" ;
      ZZ2249ManNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tworkrep__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tworkrep__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tworkrep__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tworkrep__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tworkrep__default(),
         new Object[] {
             new Object[] {
            T01KA2_A2248ManCod, T01KA2_A2711RpExHdFe, T01KA2_A2713RpExHdLi, T01KA2_A2714RpExHdAlb, T01KA2_n2714RpExHdAlb, T01KA2_A2715RpExHdKgs, T01KA2_n2715RpExHdKgs, T01KA2_A2716RpExHdCns, T01KA2_n2716RpExHdCns, T01KA2_A2717RpExHdTip,
            T01KA2_n2717RpExHdTip, T01KA2_A2718RpExHdRes, T01KA2_n2718RpExHdRes, T01KA2_A2719RpExHdLoc, T01KA2_n2719RpExHdLoc, T01KA2_A2847RpExHdMts, T01KA2_n2847RpExHdMts, T01KA2_A6262RpExSalLn, T01KA2_n6262RpExSalLn, T01KA2_A396EmprCod,
            T01KA2_A129BarCod, T01KA2_A132BarCodReo, T01KA2_A130BarCodPar
            }
            , new Object[] {
            T01KA3_A2248ManCod, T01KA3_A2711RpExHdFe, T01KA3_A2713RpExHdLi, T01KA3_A2714RpExHdAlb, T01KA3_n2714RpExHdAlb, T01KA3_A2715RpExHdKgs, T01KA3_n2715RpExHdKgs, T01KA3_A2716RpExHdCns, T01KA3_n2716RpExHdCns, T01KA3_A2717RpExHdTip,
            T01KA3_n2717RpExHdTip, T01KA3_A2718RpExHdRes, T01KA3_n2718RpExHdRes, T01KA3_A2719RpExHdLoc, T01KA3_n2719RpExHdLoc, T01KA3_A2847RpExHdMts, T01KA3_n2847RpExHdMts, T01KA3_A6262RpExSalLn, T01KA3_n6262RpExSalLn, T01KA3_A396EmprCod,
            T01KA3_A129BarCod, T01KA3_A132BarCodReo, T01KA3_A130BarCodPar
            }
            , new Object[] {
            T01KA4_A135BarColNom, T01KA4_A136BarColNum, T01KA4_A212BarSer, T01KA4_A1652BarSerDsc, T01KA4_A252CliCod, T01KA4_n252CliCod
            }
            , new Object[] {
            T01KA5_A2711RpExHdFe, T01KA5_A2712RpExHdUl, T01KA5_n2712RpExHdUl, T01KA5_A11300RpExtDoc, T01KA5_n11300RpExtDoc, T01KA5_A396EmprCod, T01KA5_A2248ManCod
            }
            , new Object[] {
            T01KA6_A2711RpExHdFe, T01KA6_A2712RpExHdUl, T01KA6_n2712RpExHdUl, T01KA6_A11300RpExtDoc, T01KA6_n11300RpExtDoc, T01KA6_A396EmprCod, T01KA6_A2248ManCod
            }
            , new Object[] {
            T01KA7_A407EmprNom, T01KA7_n407EmprNom
            }
            , new Object[] {
            T01KA8_A2249ManNom, T01KA8_n2249ManNom
            }
            , new Object[] {
            T01KA9_A2711RpExHdFe, T01KA9_A2249ManNom, T01KA9_n2249ManNom, T01KA9_A407EmprNom, T01KA9_n407EmprNom, T01KA9_A2712RpExHdUl, T01KA9_n2712RpExHdUl, T01KA9_A11300RpExtDoc, T01KA9_n11300RpExtDoc, T01KA9_A396EmprCod,
            T01KA9_A2248ManCod
            }
            , new Object[] {
            T01KA10_A407EmprNom, T01KA10_n407EmprNom
            }
            , new Object[] {
            T01KA11_A2249ManNom, T01KA11_n2249ManNom
            }
            , new Object[] {
            T01KA12_A396EmprCod, T01KA12_A2248ManCod, T01KA12_A2711RpExHdFe
            }
            , new Object[] {
            T01KA13_A396EmprCod, T01KA13_A2248ManCod, T01KA13_A2711RpExHdFe
            }
            , new Object[] {
            T01KA14_A396EmprCod, T01KA14_A2248ManCod, T01KA14_A2711RpExHdFe
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KA18_A407EmprNom, T01KA18_n407EmprNom
            }
            , new Object[] {
            T01KA19_A2249ManNom, T01KA19_n2249ManNom
            }
            , new Object[] {
            T01KA20_A396EmprCod, T01KA20_A2248ManCod, T01KA20_A2711RpExHdFe
            }
            , new Object[] {
            T01KA21_A2248ManCod, T01KA21_A2711RpExHdFe, T01KA21_A2713RpExHdLi, T01KA21_A2714RpExHdAlb, T01KA21_n2714RpExHdAlb, T01KA21_A2715RpExHdKgs, T01KA21_n2715RpExHdKgs, T01KA21_A2716RpExHdCns, T01KA21_n2716RpExHdCns, T01KA21_A2717RpExHdTip,
            T01KA21_n2717RpExHdTip, T01KA21_A2718RpExHdRes, T01KA21_n2718RpExHdRes, T01KA21_A2719RpExHdLoc, T01KA21_n2719RpExHdLoc, T01KA21_A2847RpExHdMts, T01KA21_n2847RpExHdMts, T01KA21_A6262RpExSalLn, T01KA21_n6262RpExSalLn, T01KA21_A135BarColNom,
            T01KA21_A136BarColNum, T01KA21_A212BarSer, T01KA21_A1652BarSerDsc, T01KA21_A396EmprCod, T01KA21_A129BarCod, T01KA21_A132BarCodReo, T01KA21_A130BarCodPar, T01KA21_A252CliCod, T01KA21_n252CliCod
            }
            , new Object[] {
            T01KA22_A135BarColNom, T01KA22_A136BarColNum, T01KA22_A212BarSer, T01KA22_A1652BarSerDsc, T01KA22_A252CliCod, T01KA22_n252CliCod
            }
            , new Object[] {
            T01KA23_A396EmprCod, T01KA23_A2248ManCod, T01KA23_A2711RpExHdFe, T01KA23_A2713RpExHdLi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KA27_A135BarColNom, T01KA27_A136BarColNum, T01KA27_A212BarSer, T01KA27_A1652BarSerDsc, T01KA27_A252CliCod, T01KA27_n252CliCod
            }
            , new Object[] {
            T01KA28_A396EmprCod, T01KA28_A2248ManCod, T01KA28_A2711RpExHdFe, T01KA28_A2713RpExHdLi
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z2248ManCod ;
   private short Z2712RpExHdUl ;
   private short Z2713RpExHdLi ;
   private short Z2716RpExHdCns ;
   private short Z6262RpExSalLn ;
   private short nRcdDeleted_385 ;
   private short nRcdExists_385 ;
   private short nIsMod_385 ;
   private short A2248ManCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2712RpExHdUl ;
   private short nBlankRcdCount385 ;
   private short RcdFound385 ;
   private short nBlankRcdUsr385 ;
   private short A2713RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A6262RpExSalLn ;
   private short RcdFound384 ;
   private short nIsDirty_384 ;
   private short nIsDirty_385 ;
   private short ZZ2248ManCod ;
   private short ZZ2712RpExHdUl ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z2714RpExHdAlb ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtManCod_Enabled ;
   private int edtRpExHdFe_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtManNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtRpExHdUl_Enabled ;
   private int edtRpExtDoc_Enabled ;
   private int edtavnRcdDeleted_385_Enabled ;
   private int edtRpExHdLi_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtRpExHdAlb_Enabled ;
   private int edtRpExHdKgs_Enabled ;
   private int edtRpExHdCns_Enabled ;
   private int edtRpExHdTip_Enabled ;
   private int edtRpExHdRes_Enabled ;
   private int edtRpExHdLoc_Enabled ;
   private int edtRpExHdMts_Enabled ;
   private int edtRpExSalLn_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarColNum_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A2714RpExHdAlb ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtRpExHdLi_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtRpExtDoc_Backcolor ;
   private int edtRpExHdUl_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtManNom_Backcolor ;
   private int edtRpExHdFe_Backcolor ;
   private int edtManCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2715RpExHdKgs ;
   private java.math.BigDecimal Z2847RpExHdMts ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11300RpExtDoc ;
   private String Z2717RpExHdTip ;
   private String Z2718RpExHdRes ;
   private String Z2719RpExHdLoc ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtRpExHdFe_Internalname ;
   private String edtRpExHdFe_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtManNom_Internalname ;
   private String A2249ManNom ;
   private String edtManNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtRpExHdUl_Internalname ;
   private String edtRpExHdUl_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtRpExtDoc_Internalname ;
   private String A11300RpExtDoc ;
   private String edtRpExtDoc_Jsonclick ;
   private String sMode385 ;
   private String edtavnRcdDeleted_385_Internalname ;
   private String edtRpExHdLi_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtRpExHdAlb_Internalname ;
   private String edtRpExHdKgs_Internalname ;
   private String edtRpExHdCns_Internalname ;
   private String edtRpExHdTip_Internalname ;
   private String edtRpExHdRes_Internalname ;
   private String edtRpExHdLoc_Internalname ;
   private String edtRpExHdMts_Internalname ;
   private String edtRpExSalLn_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarSerDsc_Internalname ;
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
   private String sMode384 ;
   private String GXCCtl ;
   private String A2717RpExHdTip ;
   private String A2718RpExHdRes ;
   private String A2719RpExHdLoc ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String Z407EmprNom ;
   private String Z2249ManNom ;
   private String Z135BarColNom ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_385_Jsonclick ;
   private String edtRpExHdLi_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRpExHdAlb_Jsonclick ;
   private String edtRpExHdKgs_Jsonclick ;
   private String edtRpExHdCns_Jsonclick ;
   private String edtRpExHdTip_Jsonclick ;
   private String edtRpExHdRes_Jsonclick ;
   private String edtRpExHdLoc_Jsonclick ;
   private String edtRpExHdMts_Jsonclick ;
   private String edtRpExSalLn_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ11300RpExtDoc ;
   private String ZZ407EmprNom ;
   private String ZZ2249ManNom ;
   private java.util.Date Z2711RpExHdFe ;
   private java.util.Date A2711RpExHdFe ;
   private java.util.Date ZZ2711RpExHdFe ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n2249ManNom ;
   private boolean n407EmprNom ;
   private boolean n2712RpExHdUl ;
   private boolean n11300RpExtDoc ;
   private boolean n2714RpExHdAlb ;
   private boolean n2715RpExHdKgs ;
   private boolean n2716RpExHdCns ;
   private boolean n2717RpExHdTip ;
   private boolean n2718RpExHdRes ;
   private boolean n2719RpExHdLoc ;
   private boolean n2847RpExHdMts ;
   private boolean n6262RpExSalLn ;
   private boolean n252CliCod ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T01KA9_A2711RpExHdFe ;
   private String[] T01KA9_A2249ManNom ;
   private boolean[] T01KA9_n2249ManNom ;
   private String[] T01KA9_A407EmprNom ;
   private boolean[] T01KA9_n407EmprNom ;
   private short[] T01KA9_A2712RpExHdUl ;
   private boolean[] T01KA9_n2712RpExHdUl ;
   private String[] T01KA9_A11300RpExtDoc ;
   private boolean[] T01KA9_n11300RpExtDoc ;
   private String[] T01KA9_A396EmprCod ;
   private short[] T01KA9_A2248ManCod ;
   private String[] T01KA7_A407EmprNom ;
   private boolean[] T01KA7_n407EmprNom ;
   private String[] T01KA8_A2249ManNom ;
   private boolean[] T01KA8_n2249ManNom ;
   private String[] T01KA10_A407EmprNom ;
   private boolean[] T01KA10_n407EmprNom ;
   private String[] T01KA11_A2249ManNom ;
   private boolean[] T01KA11_n2249ManNom ;
   private String[] T01KA12_A396EmprCod ;
   private short[] T01KA12_A2248ManCod ;
   private java.util.Date[] T01KA12_A2711RpExHdFe ;
   private java.util.Date[] T01KA6_A2711RpExHdFe ;
   private short[] T01KA6_A2712RpExHdUl ;
   private boolean[] T01KA6_n2712RpExHdUl ;
   private String[] T01KA6_A11300RpExtDoc ;
   private boolean[] T01KA6_n11300RpExtDoc ;
   private String[] T01KA6_A396EmprCod ;
   private short[] T01KA6_A2248ManCod ;
   private String[] T01KA13_A396EmprCod ;
   private short[] T01KA13_A2248ManCod ;
   private java.util.Date[] T01KA13_A2711RpExHdFe ;
   private String[] T01KA14_A396EmprCod ;
   private short[] T01KA14_A2248ManCod ;
   private java.util.Date[] T01KA14_A2711RpExHdFe ;
   private java.util.Date[] T01KA5_A2711RpExHdFe ;
   private short[] T01KA5_A2712RpExHdUl ;
   private boolean[] T01KA5_n2712RpExHdUl ;
   private String[] T01KA5_A11300RpExtDoc ;
   private boolean[] T01KA5_n11300RpExtDoc ;
   private String[] T01KA5_A396EmprCod ;
   private short[] T01KA5_A2248ManCod ;
   private String[] T01KA18_A407EmprNom ;
   private boolean[] T01KA18_n407EmprNom ;
   private String[] T01KA19_A2249ManNom ;
   private boolean[] T01KA19_n2249ManNom ;
   private String[] T01KA20_A396EmprCod ;
   private short[] T01KA20_A2248ManCod ;
   private java.util.Date[] T01KA20_A2711RpExHdFe ;
   private short[] T01KA21_A2248ManCod ;
   private java.util.Date[] T01KA21_A2711RpExHdFe ;
   private short[] T01KA21_A2713RpExHdLi ;
   private int[] T01KA21_A2714RpExHdAlb ;
   private boolean[] T01KA21_n2714RpExHdAlb ;
   private java.math.BigDecimal[] T01KA21_A2715RpExHdKgs ;
   private boolean[] T01KA21_n2715RpExHdKgs ;
   private short[] T01KA21_A2716RpExHdCns ;
   private boolean[] T01KA21_n2716RpExHdCns ;
   private String[] T01KA21_A2717RpExHdTip ;
   private boolean[] T01KA21_n2717RpExHdTip ;
   private String[] T01KA21_A2718RpExHdRes ;
   private boolean[] T01KA21_n2718RpExHdRes ;
   private String[] T01KA21_A2719RpExHdLoc ;
   private boolean[] T01KA21_n2719RpExHdLoc ;
   private java.math.BigDecimal[] T01KA21_A2847RpExHdMts ;
   private boolean[] T01KA21_n2847RpExHdMts ;
   private short[] T01KA21_A6262RpExSalLn ;
   private boolean[] T01KA21_n6262RpExSalLn ;
   private String[] T01KA21_A135BarColNom ;
   private int[] T01KA21_A136BarColNum ;
   private String[] T01KA21_A212BarSer ;
   private String[] T01KA21_A1652BarSerDsc ;
   private String[] T01KA21_A396EmprCod ;
   private int[] T01KA21_A129BarCod ;
   private byte[] T01KA21_A132BarCodReo ;
   private String[] T01KA21_A130BarCodPar ;
   private int[] T01KA21_A252CliCod ;
   private boolean[] T01KA21_n252CliCod ;
   private String[] T01KA4_A135BarColNom ;
   private int[] T01KA4_A136BarColNum ;
   private String[] T01KA4_A212BarSer ;
   private String[] T01KA4_A1652BarSerDsc ;
   private int[] T01KA4_A252CliCod ;
   private boolean[] T01KA4_n252CliCod ;
   private String[] T01KA22_A135BarColNom ;
   private int[] T01KA22_A136BarColNum ;
   private String[] T01KA22_A212BarSer ;
   private String[] T01KA22_A1652BarSerDsc ;
   private int[] T01KA22_A252CliCod ;
   private boolean[] T01KA22_n252CliCod ;
   private String[] T01KA23_A396EmprCod ;
   private short[] T01KA23_A2248ManCod ;
   private java.util.Date[] T01KA23_A2711RpExHdFe ;
   private short[] T01KA23_A2713RpExHdLi ;
   private short[] T01KA3_A2248ManCod ;
   private java.util.Date[] T01KA3_A2711RpExHdFe ;
   private short[] T01KA3_A2713RpExHdLi ;
   private int[] T01KA3_A2714RpExHdAlb ;
   private boolean[] T01KA3_n2714RpExHdAlb ;
   private java.math.BigDecimal[] T01KA3_A2715RpExHdKgs ;
   private boolean[] T01KA3_n2715RpExHdKgs ;
   private short[] T01KA3_A2716RpExHdCns ;
   private boolean[] T01KA3_n2716RpExHdCns ;
   private String[] T01KA3_A2717RpExHdTip ;
   private boolean[] T01KA3_n2717RpExHdTip ;
   private String[] T01KA3_A2718RpExHdRes ;
   private boolean[] T01KA3_n2718RpExHdRes ;
   private String[] T01KA3_A2719RpExHdLoc ;
   private boolean[] T01KA3_n2719RpExHdLoc ;
   private java.math.BigDecimal[] T01KA3_A2847RpExHdMts ;
   private boolean[] T01KA3_n2847RpExHdMts ;
   private short[] T01KA3_A6262RpExSalLn ;
   private boolean[] T01KA3_n6262RpExSalLn ;
   private String[] T01KA3_A396EmprCod ;
   private int[] T01KA3_A129BarCod ;
   private byte[] T01KA3_A132BarCodReo ;
   private String[] T01KA3_A130BarCodPar ;
   private short[] T01KA2_A2248ManCod ;
   private java.util.Date[] T01KA2_A2711RpExHdFe ;
   private short[] T01KA2_A2713RpExHdLi ;
   private int[] T01KA2_A2714RpExHdAlb ;
   private boolean[] T01KA2_n2714RpExHdAlb ;
   private java.math.BigDecimal[] T01KA2_A2715RpExHdKgs ;
   private boolean[] T01KA2_n2715RpExHdKgs ;
   private short[] T01KA2_A2716RpExHdCns ;
   private boolean[] T01KA2_n2716RpExHdCns ;
   private String[] T01KA2_A2717RpExHdTip ;
   private boolean[] T01KA2_n2717RpExHdTip ;
   private String[] T01KA2_A2718RpExHdRes ;
   private boolean[] T01KA2_n2718RpExHdRes ;
   private String[] T01KA2_A2719RpExHdLoc ;
   private boolean[] T01KA2_n2719RpExHdLoc ;
   private java.math.BigDecimal[] T01KA2_A2847RpExHdMts ;
   private boolean[] T01KA2_n2847RpExHdMts ;
   private short[] T01KA2_A6262RpExSalLn ;
   private boolean[] T01KA2_n6262RpExSalLn ;
   private String[] T01KA2_A396EmprCod ;
   private int[] T01KA2_A129BarCod ;
   private byte[] T01KA2_A132BarCodReo ;
   private String[] T01KA2_A130BarCodPar ;
   private String[] T01KA27_A135BarColNom ;
   private int[] T01KA27_A136BarColNum ;
   private String[] T01KA27_A212BarSer ;
   private String[] T01KA27_A1652BarSerDsc ;
   private int[] T01KA27_A252CliCod ;
   private boolean[] T01KA27_n252CliCod ;
   private String[] T01KA28_A396EmprCod ;
   private short[] T01KA28_A2248ManCod ;
   private java.util.Date[] T01KA28_A2711RpExHdFe ;
   private short[] T01KA28_A2713RpExHdLi ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tworkrep__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tworkrep__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tworkrep__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tworkrep__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tworkrep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KA2", "SELECT ManCod, RpExHdFe, RpExHdLi, RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPLREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?  FOR UPDATE OF RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA3", "SELECT ManCod, RpExHdFe, RpExHdLi, RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPLREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA4", "SELECT BarColNom, BarColNum, BarSer, BarSerDsc, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA5", "SELECT RpExHdFe, RpExHdUl, RpExtDoc, EmprCod, ManCod FROM TXPCREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?  FOR UPDATE OF RpExHdUl, RpExtDoc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA6", "SELECT RpExHdFe, RpExHdUl, RpExtDoc, EmprCod, ManCod FROM TXPCREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA8", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA9", "SELECT /*+ FIRST_ROWS(100) */ TM1.RpExHdFe, T3.ManNom, T2.EmprNom, TM1.RpExHdUl, TM1.RpExtDoc, TM1.EmprCod, TM1.ManCod FROM ((TXPCREXHD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = TM1.EmprCod AND T3.ManCod = TM1.ManCod) WHERE TM1.EmprCod = ? and TM1.ManCod = ? and TM1.RpExHdFe = ? ORDER BY TM1.EmprCod, TM1.ManCod, TM1.RpExHdFe ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA11", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, RpExHdFe FROM TXPCREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, RpExHdFe FROM TXPCREXHD WHERE ( EmprCod > ? or EmprCod = ? and ManCod > ? or ManCod = ? and EmprCod = ? and RpExHdFe > ?) ORDER BY EmprCod, ManCod, RpExHdFe) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KA14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ManCod, RpExHdFe FROM TXPCREXHD WHERE ( EmprCod < ? or EmprCod = ? and ManCod < ? or ManCod = ? and EmprCod = ? and RpExHdFe < ?) ORDER BY EmprCod DESC, ManCod DESC, RpExHdFe DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KA15", "INSERT INTO TXPCREXHD(RpExHdFe, RpExHdUl, RpExtDoc, EmprCod, ManCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCREXHD")
         ,new UpdateCursor("T01KA16", "UPDATE TXPCREXHD SET RpExHdUl=?, RpExtDoc=?  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?", GX_NOMASK, "TXPCREXHD")
         ,new UpdateCursor("T01KA17", "DELETE FROM TXPCREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?", GX_NOMASK, "TXPCREXHD")
         ,new ForEachCursor("T01KA18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA19", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ManCod, RpExHdFe FROM TXPCREXHD ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA21", "SELECT T1.ManCod, T1.RpExHdFe, T1.RpExHdLi, T1.RpExHdAlb, T1.RpExHdKgs, T1.RpExHdCns, T1.RpExHdTip, T1.RpExHdRes, T1.RpExHdLoc, T1.RpExHdMts, T1.RpExSalLn, T2.BarColNom, T2.BarColNum, T2.BarSer, T2.BarSerDsc, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod FROM (TXPLREXHD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.ManCod = ? and T1.RpExHdFe = ? and T1.RpExHdLi = ? ORDER BY T1.EmprCod, T1.ManCod, T1.RpExHdFe, T1.RpExHdLi ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA22", "SELECT BarColNom, BarColNum, BarSer, BarSerDsc, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA23", "SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KA24", "INSERT INTO TXPLREXHD(ManCod, RpExHdFe, RpExHdLi, RpExHdAlb, RpExHdKgs, RpExHdCns, RpExHdTip, RpExHdRes, RpExHdLoc, RpExHdMts, RpExSalLn, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLREXHD")
         ,new UpdateCursor("T01KA25", "UPDATE TXPLREXHD SET RpExHdAlb=?, RpExHdKgs=?, RpExHdCns=?, RpExHdTip=?, RpExHdRes=?, RpExHdLoc=?, RpExHdMts=?, RpExSalLn=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?", GX_NOMASK, "TXPLREXHD")
         ,new UpdateCursor("T01KA26", "DELETE FROM TXPLREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?", GX_NOMASK, "TXPLREXHD")
         ,new ForEachCursor("T01KA27", "SELECT BarColNom, BarColNum, BarSer, BarSerDsc, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KA28", "SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe, RpExHdLi ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((short[]) buf[10])[0] = rslt.getShort(7);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 13);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((String[]) buf[21])[0] = rslt.getString(14, 16);
               ((String[]) buf[22])[0] = rslt.getString(15, 26);
               ((String[]) buf[23])[0] = rslt.getString(16, 3);
               ((int[]) buf[24])[0] = rslt.getInt(17);
               ((byte[]) buf[25])[0] = rslt.getByte(18);
               ((String[]) buf[26])[0] = rslt.getString(19, 1);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 13 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 20);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setDate(5, (java.util.Date)parms[6]);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
               }
               stmt.setString(12, (String)parms[19], 3);
               stmt.setInt(13, ((Number) parms[20]).intValue());
               stmt.setByte(14, ((Number) parms[21]).byteValue());
               stmt.setString(15, (String)parms[22], 1);
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 10);
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
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               stmt.setInt(9, ((Number) parms[16]).intValue());
               stmt.setByte(10, ((Number) parms[17]).byteValue());
               stmt.setString(11, (String)parms[18], 1);
               stmt.setString(12, (String)parms[19], 3);
               stmt.setShort(13, ((Number) parms[20]).shortValue());
               stmt.setDate(14, (java.util.Date)parms[21]);
               stmt.setShort(15, ((Number) parms[22]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

