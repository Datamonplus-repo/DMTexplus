package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trecpot_impl extends GXDataArea
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
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPot_num_Internalname ;
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
      nRC_GXsfl_90 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_90"))) ;
      nGXsfl_90_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_90_idx"))) ;
      sGXsfl_90_idx = httpContext.GetPar( "sGXsfl_90_idx") ;
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

   public trecpot_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trecpot_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trecpot_impl.class ));
   }

   public trecpot_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRECPOT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Receta", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_num_Internalname, GXutil.ltrim( localUtil.ntoc( A11270Pot_num, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPot_num_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11270Pot_num), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11270Pot_num), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_num_Jsonclick, 0, "", "", "", "", "", 1, edtPot_num_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dia Creacion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPot_dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_dia_Internalname, localUtil.format(A11257Pot_dia, "99/99/99"), localUtil.format( A11257Pot_dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_dia_Jsonclick, 0, "", "", "", "", "", 1, edtPot_dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPOT.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPot_dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPot_dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRECPOT.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Hora Creacion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPot_hor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_hor_Internalname, localUtil.ttoc( A11258Pot_hor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11258Pot_hor, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_hor_Jsonclick, 0, "", "", "", "", "", 1, edtPot_hor_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPOT.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPot_hor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPot_hor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRECPOT.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Usuario Creacion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_usu_Internalname, GXutil.rtrim( A11259Pot_usu), GXutil.rtrim( localUtil.format( A11259Pot_usu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_usu_Jsonclick, 0, "", "", "", "", "", 1, edtPot_usu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Terminal Creacion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_term_Internalname, GXutil.rtrim( A11260Pot_term), GXutil.rtrim( localUtil.format( A11260Pot_term, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_term_Jsonclick, 0, "", "", "", "", "", 1, edtPot_term_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Proceso Formula ID", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Usuario Pesaje", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_usuP_Internalname, GXutil.rtrim( A11261Pot_usuP), GXutil.rtrim( localUtil.format( A11261Pot_usuP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_usuP_Jsonclick, 0, "", "", "", "", "", 1, edtPot_usuP_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Dia Pesaje", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPot_diaP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_diaP_Internalname, localUtil.format(A11262Pot_diaP, "99/99/99"), localUtil.format( A11262Pot_diaP, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_diaP_Jsonclick, 0, "", "", "", "", "", 1, edtPot_diaP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPOT.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPot_diaP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPot_diaP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRECPOT.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Hora Pesaje", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPot_horP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_horP_Internalname, localUtil.ttoc( A11263Pot_horP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11263Pot_horP, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_horP_Jsonclick, 0, "", "", "", "", "", 1, edtPot_horP_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPOT.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPot_horP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPot_horP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRECPOT.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Volumen", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_Vol_Internalname, GXutil.ltrim( localUtil.ntoc( A11264Pot_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPot_Vol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11264Pot_Vol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11264Pot_Vol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_Vol_Jsonclick, 0, "", "", "", "", "", 1, edtPot_Vol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPot_est_Internalname, GXutil.ltrim( localUtil.ntoc( A11265Pot_est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPot_est_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11265Pot_est), "9") : localUtil.format( DecimalUtil.doubleToDec(A11265Pot_est), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPot_est_Jsonclick, 0, "", "", "", "", "", 1, edtPot_est_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECPOT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol90( ) ;
      nGXsfl_90_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1501 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1501 = (short)(1) ;
            scanStart1BC1501( ) ;
            while ( RcdFound1501 != 0 )
            {
               init_level_properties1501( ) ;
               getByPrimaryKey1BC1501( ) ;
               addRow1BC1501( ) ;
               scanNext1BC1501( ) ;
            }
            scanEnd1BC1501( ) ;
            nBlankRcdCount1501 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1BC1501( ) ;
         standaloneModal1BC1501( ) ;
         sMode1501 = Gx_mode ;
         while ( nGXsfl_90_idx < nRC_GXsfl_90 )
         {
            bGXsfl_90_Refreshing = true ;
            readRow1BC1501( ) ;
            edtavnRcdDeleted_1501_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1501_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1501_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1501_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPot_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_LIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPot_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_lin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPot_cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_CANT_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPot_cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_cant_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPot_cantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_CANTP_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPot_cantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_cantP_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPot_und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_UND_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPot_und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_und_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtPot_pre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_PRE_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPot_pre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_pre_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            if ( ( nRcdExists_1501 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BC1501( ) ;
            }
            sendRow1BC1501( ) ;
            bGXsfl_90_Refreshing = false ;
         }
         Gx_mode = sMode1501 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1501 = (short)(5) ;
         nRcdExists_1501 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BC1501( ) ;
            while ( RcdFound1501 != 0 )
            {
               sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_901501( ) ;
               init_level_properties1501( ) ;
               standaloneNotModal1BC1501( ) ;
               getByPrimaryKey1BC1501( ) ;
               standaloneModal1BC1501( ) ;
               addRow1BC1501( ) ;
               scanNext1BC1501( ) ;
            }
            scanEnd1BC1501( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1501 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_901501( ) ;
      initAll1BC1501( ) ;
      init_level_properties1501( ) ;
      nRcdExists_1501 = (short)(0) ;
      nIsMod_1501 = (short)(0) ;
      nRcdDeleted_1501 = (short)(0) ;
      nBlankRcdCount1501 = (short)(nBlankRcdUsr1501+nBlankRcdCount1501) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1501 > 0 )
      {
         standaloneNotModal1BC1501( ) ;
         standaloneModal1BC1501( ) ;
         addRow1BC1501( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPot_lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1501 = (short)(nBlankRcdCount1501-1) ;
      }
      Gx_mode = sMode1501 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECPOT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRECPOT.htm");
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
      e111BC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11270Pot_num = (int)(localUtil.ctol( httpContext.cgiGet( "Z11270Pot_num"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11257Pot_dia = localUtil.ctod( httpContext.cgiGet( "Z11257Pot_dia"), 0) ;
            Z11258Pot_hor = localUtil.ctot( httpContext.cgiGet( "Z11258Pot_hor"), 0) ;
            Z11259Pot_usu = httpContext.cgiGet( "Z11259Pot_usu") ;
            Z11260Pot_term = httpContext.cgiGet( "Z11260Pot_term") ;
            Z11261Pot_usuP = httpContext.cgiGet( "Z11261Pot_usuP") ;
            Z11262Pot_diaP = localUtil.ctod( httpContext.cgiGet( "Z11262Pot_diaP"), 0) ;
            Z11263Pot_horP = localUtil.ctot( httpContext.cgiGet( "Z11263Pot_horP"), 0) ;
            Z11264Pot_Vol = (int)(localUtil.ctol( httpContext.cgiGet( "Z11264Pot_Vol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11265Pot_est = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11265Pot_est"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_90 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_90"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPot_num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPot_num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "POT_NUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPot_num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11270Pot_num = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
            }
            else
            {
               A11270Pot_num = (int)(localUtil.ctol( httpContext.cgiGet( edtPot_num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPot_dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "POT_DIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPot_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11257Pot_dia = GXutil.nullDate() ;
               n11257Pot_dia = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11257Pot_dia", localUtil.format(A11257Pot_dia, "99/99/99"));
            }
            else
            {
               A11257Pot_dia = localUtil.ctod( httpContext.cgiGet( edtPot_dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n11257Pot_dia = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11257Pot_dia", localUtil.format(A11257Pot_dia, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtPot_hor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "POT_HOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPot_hor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11258Pot_hor = GXutil.resetTime( GXutil.nullDate() );
               n11258Pot_hor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11258Pot_hor", localUtil.ttoc( A11258Pot_hor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A11258Pot_hor = localUtil.ctot( httpContext.cgiGet( edtPot_hor_Internalname)) ;
               n11258Pot_hor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11258Pot_hor", localUtil.ttoc( A11258Pot_hor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A11259Pot_usu = httpContext.cgiGet( edtPot_usu_Internalname) ;
            n11259Pot_usu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11259Pot_usu", A11259Pot_usu);
            A11260Pot_term = httpContext.cgiGet( edtPot_term_Internalname) ;
            n11260Pot_term = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11260Pot_term", A11260Pot_term);
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
            A11261Pot_usuP = httpContext.cgiGet( edtPot_usuP_Internalname) ;
            n11261Pot_usuP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11261Pot_usuP", A11261Pot_usuP);
            if ( localUtil.vcdate( httpContext.cgiGet( edtPot_diaP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "POT_DIAP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPot_diaP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11262Pot_diaP = GXutil.nullDate() ;
               n11262Pot_diaP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11262Pot_diaP", localUtil.format(A11262Pot_diaP, "99/99/99"));
            }
            else
            {
               A11262Pot_diaP = localUtil.ctod( httpContext.cgiGet( edtPot_diaP_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n11262Pot_diaP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11262Pot_diaP", localUtil.format(A11262Pot_diaP, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtPot_horP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "POT_HORP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPot_horP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11263Pot_horP = GXutil.resetTime( GXutil.nullDate() );
               n11263Pot_horP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11263Pot_horP", localUtil.ttoc( A11263Pot_horP, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A11263Pot_horP = localUtil.ctot( httpContext.cgiGet( edtPot_horP_Internalname)) ;
               n11263Pot_horP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11263Pot_horP", localUtil.ttoc( A11263Pot_horP, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPot_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPot_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "POT_VOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPot_Vol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11264Pot_Vol = 0 ;
               n11264Pot_Vol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11264Pot_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11264Pot_Vol), 5, 0));
            }
            else
            {
               A11264Pot_Vol = (int)(localUtil.ctol( httpContext.cgiGet( edtPot_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11264Pot_Vol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11264Pot_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11264Pot_Vol), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPot_est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPot_est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "POT_EST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPot_est_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11265Pot_est = (byte)(0) ;
               n11265Pot_est = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11265Pot_est", GXutil.str( A11265Pot_est, 1, 0));
            }
            else
            {
               A11265Pot_est = (byte)(localUtil.ctol( httpContext.cgiGet( edtPot_est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11265Pot_est = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11265Pot_est", GXutil.str( A11265Pot_est, 1, 0));
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
               A11270Pot_num = (int)(GXutil.lval( httpContext.GetPar( "Pot_num"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
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
                        e111BC2 ();
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
            initAll1BC1500( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1501_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1501_Enabled), 5, 0), !bGXsfl_90_Refreshing);
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
      disableAttributes1BC1500( ) ;
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

   public void confirm_1BC0( )
   {
      beforeValidate1BC1500( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BC1500( ) ;
         }
         else
         {
            checkExtendedTable1BC1500( ) ;
            if ( AnyError == 0 )
            {
               zm1BC1500( 2) ;
               zm1BC1500( 3) ;
            }
            closeExtendedTableCursors1BC1500( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1500 = Gx_mode ;
         confirm_1BC1501( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1500 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1500 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1BC0( ) ;
      }
   }

   public void confirm_1BC1501( )
   {
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1BC1501( ) ;
         if ( ( nRcdExists_1501 != 0 ) || ( nIsMod_1501 != 0 ) )
         {
            getKey1BC1501( ) ;
            if ( ( nRcdExists_1501 == 0 ) && ( nRcdDeleted_1501 == 0 ) )
            {
               if ( RcdFound1501 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BC1501( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BC1501( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1BC1501( 5) ;
                     }
                     closeExtendedTableCursors1BC1501( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "POT_LIN_" + sGXsfl_90_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPot_lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1501 != 0 )
               {
                  if ( nRcdDeleted_1501 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BC1501( ) ;
                     load1BC1501( ) ;
                     beforeValidate1BC1501( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BC1501( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1501 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BC1501( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BC1501( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1BC1501( 5) ;
                           }
                           closeExtendedTableCursors1BC1501( ) ;
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
                  if ( nRcdDeleted_1501 == 0 )
                  {
                     GXCCtl = "POT_LIN_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPot_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1501_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPot_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A11271Pot_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPot_cant_Internalname, GXutil.ltrim( localUtil.ntoc( A11266Pot_cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPot_cantP_Internalname, GXutil.ltrim( localUtil.ntoc( A11267Pot_cantP, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPot_und_Internalname, GXutil.rtrim( A11268Pot_und)) ;
         httpContext.changePostValue( edtPot_pre_Internalname, GXutil.ltrim( localUtil.ntoc( A11269Pot_pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11271Pot_lin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z11271Pot_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11266Pot_cant_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z11266Pot_cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11267Pot_cantP_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z11267Pot_cantP, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11268Pot_und_"+sGXsfl_90_idx, GXutil.rtrim( Z11268Pot_und)) ;
         httpContext.changePostValue( "ZT_"+"Z11269Pot_pre_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z11269Pot_pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_90_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1501_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1501_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1501_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1501 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1501_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1501_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_LIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_CANT_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_CANTP_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_cantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_UND_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_PRE_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_pre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BC0( )
   {
   }

   public void e111BC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      trecpot_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      trecpot_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      trecpot_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      trecpot_impl.this.A396EmprCod = GXv_char2[0] ;
      trecpot_impl.this.AV11EmprNom = GXv_char3[0] ;
      trecpot_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1BC1500( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11257Pot_dia = T01BC6_A11257Pot_dia[0] ;
            Z11258Pot_hor = T01BC6_A11258Pot_hor[0] ;
            Z11259Pot_usu = T01BC6_A11259Pot_usu[0] ;
            Z11260Pot_term = T01BC6_A11260Pot_term[0] ;
            Z11261Pot_usuP = T01BC6_A11261Pot_usuP[0] ;
            Z11262Pot_diaP = T01BC6_A11262Pot_diaP[0] ;
            Z11263Pot_horP = T01BC6_A11263Pot_horP[0] ;
            Z11264Pot_Vol = T01BC6_A11264Pot_Vol[0] ;
            Z11265Pot_est = T01BC6_A11265Pot_est[0] ;
            Z764ProForCod = T01BC6_A764ProForCod[0] ;
         }
         else
         {
            Z11257Pot_dia = A11257Pot_dia ;
            Z11258Pot_hor = A11258Pot_hor ;
            Z11259Pot_usu = A11259Pot_usu ;
            Z11260Pot_term = A11260Pot_term ;
            Z11261Pot_usuP = A11261Pot_usuP ;
            Z11262Pot_diaP = A11262Pot_diaP ;
            Z11263Pot_horP = A11263Pot_horP ;
            Z11264Pot_Vol = A11264Pot_Vol ;
            Z11265Pot_est = A11265Pot_est ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11270Pot_num = A11270Pot_num ;
         Z11257Pot_dia = A11257Pot_dia ;
         Z11258Pot_hor = A11258Pot_hor ;
         Z11259Pot_usu = A11259Pot_usu ;
         Z11260Pot_term = A11260Pot_term ;
         Z11261Pot_usuP = A11261Pot_usuP ;
         Z11262Pot_diaP = A11262Pot_diaP ;
         Z11263Pot_horP = A11263Pot_horP ;
         Z11264Pot_Vol = A11264Pot_Vol ;
         Z11265Pot_est = A11265Pot_est ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z407EmprNom = A407EmprNom ;
         Z766ProForDsc = A766ProForDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TRECPOT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01BC7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BC7_A407EmprNom[0] ;
      n407EmprNom = T01BC7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
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

   public void load1BC1500( )
   {
      /* Using cursor T01BC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1500 = (short)(1) ;
         A407EmprNom = T01BC9_A407EmprNom[0] ;
         n407EmprNom = T01BC9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11257Pot_dia = T01BC9_A11257Pot_dia[0] ;
         n11257Pot_dia = T01BC9_n11257Pot_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11257Pot_dia", localUtil.format(A11257Pot_dia, "99/99/99"));
         A11258Pot_hor = T01BC9_A11258Pot_hor[0] ;
         n11258Pot_hor = T01BC9_n11258Pot_hor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11258Pot_hor", localUtil.ttoc( A11258Pot_hor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11259Pot_usu = T01BC9_A11259Pot_usu[0] ;
         n11259Pot_usu = T01BC9_n11259Pot_usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11259Pot_usu", A11259Pot_usu);
         A11260Pot_term = T01BC9_A11260Pot_term[0] ;
         n11260Pot_term = T01BC9_n11260Pot_term[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11260Pot_term", A11260Pot_term);
         A766ProForDsc = T01BC9_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A11261Pot_usuP = T01BC9_A11261Pot_usuP[0] ;
         n11261Pot_usuP = T01BC9_n11261Pot_usuP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11261Pot_usuP", A11261Pot_usuP);
         A11262Pot_diaP = T01BC9_A11262Pot_diaP[0] ;
         n11262Pot_diaP = T01BC9_n11262Pot_diaP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11262Pot_diaP", localUtil.format(A11262Pot_diaP, "99/99/99"));
         A11263Pot_horP = T01BC9_A11263Pot_horP[0] ;
         n11263Pot_horP = T01BC9_n11263Pot_horP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11263Pot_horP", localUtil.ttoc( A11263Pot_horP, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11264Pot_Vol = T01BC9_A11264Pot_Vol[0] ;
         n11264Pot_Vol = T01BC9_n11264Pot_Vol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11264Pot_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11264Pot_Vol), 5, 0));
         A11265Pot_est = T01BC9_A11265Pot_est[0] ;
         n11265Pot_est = T01BC9_n11265Pot_est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11265Pot_est", GXutil.str( A11265Pot_est, 1, 0));
         A764ProForCod = T01BC9_A764ProForCod[0] ;
         n764ProForCod = T01BC9_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         zm1BC1500( -1) ;
      }
      pr_default.close(7);
      onLoadActions1BC1500( ) ;
   }

   public void onLoadActions1BC1500( )
   {
   }

   public void checkExtendedTable1BC1500( )
   {
      nIsDirty_1500 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01BC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01BC8_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1BC1500( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A764ProForCod )
   {
      /* Using cursor T01BC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01BC10_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1BC1500( )
   {
      /* Using cursor T01BC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1500 = (short)(1) ;
      }
      else
      {
         RcdFound1500 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BC6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01BC6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BC1500( 1) ;
         RcdFound1500 = (short)(1) ;
         A11270Pot_num = T01BC6_A11270Pot_num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
         A11257Pot_dia = T01BC6_A11257Pot_dia[0] ;
         n11257Pot_dia = T01BC6_n11257Pot_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11257Pot_dia", localUtil.format(A11257Pot_dia, "99/99/99"));
         A11258Pot_hor = T01BC6_A11258Pot_hor[0] ;
         n11258Pot_hor = T01BC6_n11258Pot_hor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11258Pot_hor", localUtil.ttoc( A11258Pot_hor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11259Pot_usu = T01BC6_A11259Pot_usu[0] ;
         n11259Pot_usu = T01BC6_n11259Pot_usu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11259Pot_usu", A11259Pot_usu);
         A11260Pot_term = T01BC6_A11260Pot_term[0] ;
         n11260Pot_term = T01BC6_n11260Pot_term[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11260Pot_term", A11260Pot_term);
         A11261Pot_usuP = T01BC6_A11261Pot_usuP[0] ;
         n11261Pot_usuP = T01BC6_n11261Pot_usuP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11261Pot_usuP", A11261Pot_usuP);
         A11262Pot_diaP = T01BC6_A11262Pot_diaP[0] ;
         n11262Pot_diaP = T01BC6_n11262Pot_diaP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11262Pot_diaP", localUtil.format(A11262Pot_diaP, "99/99/99"));
         A11263Pot_horP = T01BC6_A11263Pot_horP[0] ;
         n11263Pot_horP = T01BC6_n11263Pot_horP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11263Pot_horP", localUtil.ttoc( A11263Pot_horP, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11264Pot_Vol = T01BC6_A11264Pot_Vol[0] ;
         n11264Pot_Vol = T01BC6_n11264Pot_Vol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11264Pot_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11264Pot_Vol), 5, 0));
         A11265Pot_est = T01BC6_A11265Pot_est[0] ;
         n11265Pot_est = T01BC6_n11265Pot_est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11265Pot_est", GXutil.str( A11265Pot_est, 1, 0));
         A764ProForCod = T01BC6_A764ProForCod[0] ;
         n764ProForCod = T01BC6_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         Z396EmprCod = A396EmprCod ;
         Z11270Pot_num = A11270Pot_num ;
         sMode1500 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BC1500( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1500 = (short)(0) ;
            initializeNonKey1BC1500( ) ;
         }
         Gx_mode = sMode1500 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1500 = (short)(0) ;
         initializeNonKey1BC1500( ) ;
         sMode1500 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1500 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1BC1500( ) ;
      if ( RcdFound1500 == 0 )
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
      RcdFound1500 = (short)(0) ;
      /* Using cursor T01BC12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A11270Pot_num), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01BC12_A11270Pot_num[0] < A11270Pot_num ) ) && ( GXutil.strcmp(T01BC12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01BC12_A11270Pot_num[0] > A11270Pot_num ) ) && ( GXutil.strcmp(T01BC12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11270Pot_num = T01BC12_A11270Pot_num[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
            RcdFound1500 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1500 = (short)(0) ;
      /* Using cursor T01BC13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A11270Pot_num), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01BC13_A11270Pot_num[0] > A11270Pot_num ) ) && ( GXutil.strcmp(T01BC13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01BC13_A11270Pot_num[0] < A11270Pot_num ) ) && ( GXutil.strcmp(T01BC13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11270Pot_num = T01BC13_A11270Pot_num[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
            RcdFound1500 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BC1500( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPot_num_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BC1500( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1500 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11270Pot_num != Z11270Pot_num ) )
            {
               A11270Pot_num = Z11270Pot_num ;
               httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPot_num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1BC1500( ) ;
               GX_FocusControl = edtPot_num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11270Pot_num != Z11270Pot_num ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPot_num_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1BC1500( ) ;
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
                  GX_FocusControl = edtPot_num_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1BC1500( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11270Pot_num != Z11270Pot_num ) )
      {
         A11270Pot_num = Z11270Pot_num ;
         httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPot_num_Internalname ;
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
      getKey1BC1500( ) ;
      if ( RcdFound1500 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11270Pot_num != Z11270Pot_num ) )
         {
            A11270Pot_num = Z11270Pot_num ;
            httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11270Pot_num != Z11270Pot_num ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trecpot");
      GX_FocusControl = edtPot_dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1BC0( ) ;
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
      if ( RcdFound1500 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPot_dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1BC1500( ) ;
      if ( RcdFound1500 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPot_dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BC1500( ) ;
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
      if ( RcdFound1500 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPot_dia_Internalname ;
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
      if ( RcdFound1500 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPot_dia_Internalname ;
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
      scanStart1BC1500( ) ;
      if ( RcdFound1500 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1500 != 0 )
         {
            scanNext1BC1500( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPot_dia_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BC1500( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BC1500( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BC5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPOT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z11257Pot_dia), GXutil.resetTime(T01BC5_A11257Pot_dia[0])) ) || !( GXutil.dateCompare(Z11258Pot_hor, T01BC5_A11258Pot_hor[0]) ) || ( GXutil.strcmp(Z11259Pot_usu, T01BC5_A11259Pot_usu[0]) != 0 ) || ( GXutil.strcmp(Z11260Pot_term, T01BC5_A11260Pot_term[0]) != 0 ) || ( GXutil.strcmp(Z11261Pot_usuP, T01BC5_A11261Pot_usuP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z11262Pot_diaP), GXutil.resetTime(T01BC5_A11262Pot_diaP[0])) ) || !( GXutil.dateCompare(Z11263Pot_horP, T01BC5_A11263Pot_horP[0]) ) || ( Z11264Pot_Vol != T01BC5_A11264Pot_Vol[0] ) || ( Z11265Pot_est != T01BC5_A11265Pot_est[0] ) || ( GXutil.strcmp(Z764ProForCod, T01BC5_A764ProForCod[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11257Pot_dia), GXutil.resetTime(T01BC5_A11257Pot_dia[0])) ) )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_dia");
               GXutil.writeLogRaw("Old: ",Z11257Pot_dia);
               GXutil.writeLogRaw("Current: ",T01BC5_A11257Pot_dia[0]);
            }
            if ( !( GXutil.dateCompare(Z11258Pot_hor, T01BC5_A11258Pot_hor[0]) ) )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_hor");
               GXutil.writeLogRaw("Old: ",Z11258Pot_hor);
               GXutil.writeLogRaw("Current: ",T01BC5_A11258Pot_hor[0]);
            }
            if ( GXutil.strcmp(Z11259Pot_usu, T01BC5_A11259Pot_usu[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_usu");
               GXutil.writeLogRaw("Old: ",Z11259Pot_usu);
               GXutil.writeLogRaw("Current: ",T01BC5_A11259Pot_usu[0]);
            }
            if ( GXutil.strcmp(Z11260Pot_term, T01BC5_A11260Pot_term[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_term");
               GXutil.writeLogRaw("Old: ",Z11260Pot_term);
               GXutil.writeLogRaw("Current: ",T01BC5_A11260Pot_term[0]);
            }
            if ( GXutil.strcmp(Z11261Pot_usuP, T01BC5_A11261Pot_usuP[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_usuP");
               GXutil.writeLogRaw("Old: ",Z11261Pot_usuP);
               GXutil.writeLogRaw("Current: ",T01BC5_A11261Pot_usuP[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11262Pot_diaP), GXutil.resetTime(T01BC5_A11262Pot_diaP[0])) ) )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_diaP");
               GXutil.writeLogRaw("Old: ",Z11262Pot_diaP);
               GXutil.writeLogRaw("Current: ",T01BC5_A11262Pot_diaP[0]);
            }
            if ( !( GXutil.dateCompare(Z11263Pot_horP, T01BC5_A11263Pot_horP[0]) ) )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_horP");
               GXutil.writeLogRaw("Old: ",Z11263Pot_horP);
               GXutil.writeLogRaw("Current: ",T01BC5_A11263Pot_horP[0]);
            }
            if ( Z11264Pot_Vol != T01BC5_A11264Pot_Vol[0] )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_Vol");
               GXutil.writeLogRaw("Old: ",Z11264Pot_Vol);
               GXutil.writeLogRaw("Current: ",T01BC5_A11264Pot_Vol[0]);
            }
            if ( Z11265Pot_est != T01BC5_A11265Pot_est[0] )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_est");
               GXutil.writeLogRaw("Old: ",Z11265Pot_est);
               GXutil.writeLogRaw("Current: ",T01BC5_A11265Pot_est[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T01BC5_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01BC5_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECPOT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BC1500( )
   {
      beforeValidate1BC1500( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BC1500( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BC1500( 0) ;
         checkOptimisticConcurrency1BC1500( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BC1500( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BC1500( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BC14 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A11270Pot_num), Boolean.valueOf(n11257Pot_dia), A11257Pot_dia, Boolean.valueOf(n11258Pot_hor), A11258Pot_hor, Boolean.valueOf(n11259Pot_usu), A11259Pot_usu, Boolean.valueOf(n11260Pot_term), A11260Pot_term, Boolean.valueOf(n11261Pot_usuP), A11261Pot_usuP, Boolean.valueOf(n11262Pot_diaP), A11262Pot_diaP, Boolean.valueOf(n11263Pot_horP), A11263Pot_horP, Boolean.valueOf(n11264Pot_Vol), Integer.valueOf(A11264Pot_Vol), Boolean.valueOf(n11265Pot_est), Byte.valueOf(A11265Pot_est), A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPOT");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel1BC1500( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BC0( ) ;
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
            load1BC1500( ) ;
         }
         endLevel1BC1500( ) ;
      }
      closeExtendedTableCursors1BC1500( ) ;
   }

   public void update1BC1500( )
   {
      beforeValidate1BC1500( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BC1500( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BC1500( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BC1500( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BC1500( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BC15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n11257Pot_dia), A11257Pot_dia, Boolean.valueOf(n11258Pot_hor), A11258Pot_hor, Boolean.valueOf(n11259Pot_usu), A11259Pot_usu, Boolean.valueOf(n11260Pot_term), A11260Pot_term, Boolean.valueOf(n11261Pot_usuP), A11261Pot_usuP, Boolean.valueOf(n11262Pot_diaP), A11262Pot_diaP, Boolean.valueOf(n11263Pot_horP), A11263Pot_horP, Boolean.valueOf(n11264Pot_Vol), Integer.valueOf(A11264Pot_Vol), Boolean.valueOf(n11265Pot_est), Byte.valueOf(A11265Pot_est), Boolean.valueOf(n764ProForCod), A764ProForCod, A396EmprCod, Integer.valueOf(A11270Pot_num)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPOT");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPOT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BC1500( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BC1500( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BC0( ) ;
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
         endLevel1BC1500( ) ;
      }
      closeExtendedTableCursors1BC1500( ) ;
   }

   public void deferredUpdate1BC1500( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BC1500( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BC1500( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BC1500( ) ;
         afterConfirm1BC1500( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BC1500( ) ;
            if ( AnyError == 0 )
            {
               scanStart1BC1501( ) ;
               while ( RcdFound1501 != 0 )
               {
                  getByPrimaryKey1BC1501( ) ;
                  delete1BC1501( ) ;
                  scanNext1BC1501( ) ;
               }
               scanEnd1BC1501( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BC16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPOT");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1500 == 0 )
                        {
                           initAll1BC1500( ) ;
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
                        resetCaption1BC0( ) ;
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
      sMode1500 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BC1500( ) ;
      Gx_mode = sMode1500 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BC1500( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01BC17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         A766ProForDsc = T01BC17_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         pr_default.close(15);
      }
   }

   public void processNestedLevel1BC1501( )
   {
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1BC1501( ) ;
         if ( ( nRcdExists_1501 != 0 ) || ( nIsMod_1501 != 0 ) )
         {
            standaloneNotModal1BC1501( ) ;
            getKey1BC1501( ) ;
            if ( ( nRcdExists_1501 == 0 ) && ( nRcdDeleted_1501 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BC1501( ) ;
            }
            else
            {
               if ( RcdFound1501 != 0 )
               {
                  if ( ( nRcdDeleted_1501 != 0 ) && ( nRcdExists_1501 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BC1501( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1501 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BC1501( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1501 == 0 )
                  {
                     GXCCtl = "POT_LIN_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPot_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1501_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPot_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A11271Pot_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPot_cant_Internalname, GXutil.ltrim( localUtil.ntoc( A11266Pot_cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPot_cantP_Internalname, GXutil.ltrim( localUtil.ntoc( A11267Pot_cantP, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPot_und_Internalname, GXutil.rtrim( A11268Pot_und)) ;
         httpContext.changePostValue( edtPot_pre_Internalname, GXutil.ltrim( localUtil.ntoc( A11269Pot_pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11271Pot_lin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z11271Pot_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11266Pot_cant_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z11266Pot_cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11267Pot_cantP_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z11267Pot_cantP, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11268Pot_und_"+sGXsfl_90_idx, GXutil.rtrim( Z11268Pot_und)) ;
         httpContext.changePostValue( "ZT_"+"Z11269Pot_pre_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z11269Pot_pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_90_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1501_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1501_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1501_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1501 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1501_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1501_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_LIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_CANT_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_CANTP_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_cantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_UND_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "POT_PRE_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_pre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BC1501( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1501 = (short)(0) ;
      nIsMod_1501 = (short)(0) ;
      nRcdDeleted_1501 = (short)(0) ;
   }

   public void processLevel1BC1500( )
   {
      /* Save parent mode. */
      sMode1500 = Gx_mode ;
      processNestedLevel1BC1501( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1500 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BC1500( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BC1500( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trecpot");
         if ( AnyError == 0 )
         {
            confirmValues1BC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trecpot");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BC1500( )
   {
      /* Scan By routine */
      /* Using cursor T01BC18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1500 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1500 = (short)(1) ;
         A11270Pot_num = T01BC18_A11270Pot_num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BC1500( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1500 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1500 = (short)(1) ;
         A11270Pot_num = T01BC18_A11270Pot_num[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
      }
   }

   public void scanEnd1BC1500( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1BC1500( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BC1500( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BC1500( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BC1500( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BC1500( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BC1500( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BC1500( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPot_num_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_num_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_num_Enabled), 5, 0), true);
      edtPot_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_dia_Enabled), 5, 0), true);
      edtPot_hor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_hor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_hor_Enabled), 5, 0), true);
      edtPot_usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_usu_Enabled), 5, 0), true);
      edtPot_term_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_term_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtPot_usuP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_usuP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_usuP_Enabled), 5, 0), true);
      edtPot_diaP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_diaP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_diaP_Enabled), 5, 0), true);
      edtPot_horP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_horP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_horP_Enabled), 5, 0), true);
      edtPot_Vol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_Vol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_Vol_Enabled), 5, 0), true);
      edtPot_est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_est_Enabled), 5, 0), true);
   }

   public void zm1BC1501( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11266Pot_cant = T01BC3_A11266Pot_cant[0] ;
            Z11267Pot_cantP = T01BC3_A11267Pot_cantP[0] ;
            Z11268Pot_und = T01BC3_A11268Pot_und[0] ;
            Z11269Pot_pre = T01BC3_A11269Pot_pre[0] ;
            Z719PrdNum = T01BC3_A719PrdNum[0] ;
         }
         else
         {
            Z11266Pot_cant = A11266Pot_cant ;
            Z11267Pot_cantP = A11267Pot_cantP ;
            Z11268Pot_und = A11268Pot_und ;
            Z11269Pot_pre = A11269Pot_pre ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z11270Pot_num = A11270Pot_num ;
         Z11271Pot_lin = A11271Pot_lin ;
         Z11266Pot_cant = A11266Pot_cant ;
         Z11267Pot_cantP = A11267Pot_cantP ;
         Z11268Pot_und = A11268Pot_und ;
         Z11269Pot_pre = A11269Pot_pre ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
      }
   }

   public void standaloneNotModal1BC1501( )
   {
   }

   public void standaloneModal1BC1501( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPot_lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPot_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_lin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
      else
      {
         edtPot_lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPot_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_lin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
   }

   public void load1BC1501( )
   {
      /* Using cursor T01BC19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num), Short.valueOf(A11271Pot_lin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1501 = (short)(1) ;
         A11266Pot_cant = T01BC19_A11266Pot_cant[0] ;
         n11266Pot_cant = T01BC19_n11266Pot_cant[0] ;
         A11267Pot_cantP = T01BC19_A11267Pot_cantP[0] ;
         n11267Pot_cantP = T01BC19_n11267Pot_cantP[0] ;
         A11268Pot_und = T01BC19_A11268Pot_und[0] ;
         n11268Pot_und = T01BC19_n11268Pot_und[0] ;
         A11269Pot_pre = T01BC19_A11269Pot_pre[0] ;
         n11269Pot_pre = T01BC19_n11269Pot_pre[0] ;
         A719PrdNum = T01BC19_A719PrdNum[0] ;
         n719PrdNum = T01BC19_n719PrdNum[0] ;
         zm1BC1501( -4) ;
      }
      pr_default.close(17);
      onLoadActions1BC1501( ) ;
   }

   public void onLoadActions1BC1501( )
   {
   }

   public void checkExtendedTable1BC1501( )
   {
      nIsDirty_1501 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BC1501( ) ;
      /* Using cursor T01BC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1BC1501( )
   {
      pr_default.close(2);
   }

   public void enableDisable1BC1501( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01BC20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1BC1501( )
   {
      /* Using cursor T01BC21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num), Short.valueOf(A11271Pot_lin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1501 = (short)(1) ;
      }
      else
      {
         RcdFound1501 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1BC1501( )
   {
      /* Using cursor T01BC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num), Short.valueOf(A11271Pot_lin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01BC3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BC1501( 4) ;
         RcdFound1501 = (short)(1) ;
         initializeNonKey1BC1501( ) ;
         A11271Pot_lin = T01BC3_A11271Pot_lin[0] ;
         A11266Pot_cant = T01BC3_A11266Pot_cant[0] ;
         n11266Pot_cant = T01BC3_n11266Pot_cant[0] ;
         A11267Pot_cantP = T01BC3_A11267Pot_cantP[0] ;
         n11267Pot_cantP = T01BC3_n11267Pot_cantP[0] ;
         A11268Pot_und = T01BC3_A11268Pot_und[0] ;
         n11268Pot_und = T01BC3_n11268Pot_und[0] ;
         A11269Pot_pre = T01BC3_A11269Pot_pre[0] ;
         n11269Pot_pre = T01BC3_n11269Pot_pre[0] ;
         A719PrdNum = T01BC3_A719PrdNum[0] ;
         n719PrdNum = T01BC3_n719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11270Pot_num = A11270Pot_num ;
         Z11271Pot_lin = A11271Pot_lin ;
         sMode1501 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BC1501( ) ;
         load1BC1501( ) ;
         Gx_mode = sMode1501 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1501 = (short)(0) ;
         initializeNonKey1BC1501( ) ;
         sMode1501 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BC1501( ) ;
         Gx_mode = sMode1501 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BC1501( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BC1501( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num), Short.valueOf(A11271Pot_lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPO1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11266Pot_cant, T01BC2_A11266Pot_cant[0]) != 0 ) || ( DecimalUtil.compareTo(Z11267Pot_cantP, T01BC2_A11267Pot_cantP[0]) != 0 ) || ( GXutil.strcmp(Z11268Pot_und, T01BC2_A11268Pot_und[0]) != 0 ) || ( DecimalUtil.compareTo(Z11269Pot_pre, T01BC2_A11269Pot_pre[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01BC2_A719PrdNum[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11266Pot_cant, T01BC2_A11266Pot_cant[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_cant");
               GXutil.writeLogRaw("Old: ",Z11266Pot_cant);
               GXutil.writeLogRaw("Current: ",T01BC2_A11266Pot_cant[0]);
            }
            if ( DecimalUtil.compareTo(Z11267Pot_cantP, T01BC2_A11267Pot_cantP[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_cantP");
               GXutil.writeLogRaw("Old: ",Z11267Pot_cantP);
               GXutil.writeLogRaw("Current: ",T01BC2_A11267Pot_cantP[0]);
            }
            if ( GXutil.strcmp(Z11268Pot_und, T01BC2_A11268Pot_und[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_und");
               GXutil.writeLogRaw("Old: ",Z11268Pot_und);
               GXutil.writeLogRaw("Current: ",T01BC2_A11268Pot_und[0]);
            }
            if ( DecimalUtil.compareTo(Z11269Pot_pre, T01BC2_A11269Pot_pre[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"Pot_pre");
               GXutil.writeLogRaw("Old: ",Z11269Pot_pre);
               GXutil.writeLogRaw("Current: ",T01BC2_A11269Pot_pre[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01BC2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("trecpot:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01BC2_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECPO1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BC1501( )
   {
      beforeValidate1BC1501( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BC1501( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BC1501( 0) ;
         checkOptimisticConcurrency1BC1501( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BC1501( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BC1501( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BC22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A11270Pot_num), Short.valueOf(A11271Pot_lin), Boolean.valueOf(n11266Pot_cant), A11266Pot_cant, Boolean.valueOf(n11267Pot_cantP), A11267Pot_cantP, Boolean.valueOf(n11268Pot_und), A11268Pot_und, Boolean.valueOf(n11269Pot_pre), A11269Pot_pre, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPO1");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1BC1501( ) ;
         }
         endLevel1BC1501( ) ;
      }
      closeExtendedTableCursors1BC1501( ) ;
   }

   public void update1BC1501( )
   {
      beforeValidate1BC1501( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BC1501( ) ;
      }
      if ( ( nIsMod_1501 != 0 ) || ( nIsDirty_1501 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BC1501( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BC1501( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BC1501( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BC23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n11266Pot_cant), A11266Pot_cant, Boolean.valueOf(n11267Pot_cantP), A11267Pot_cantP, Boolean.valueOf(n11268Pot_und), A11268Pot_und, Boolean.valueOf(n11269Pot_pre), A11269Pot_pre, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Integer.valueOf(A11270Pot_num), Short.valueOf(A11271Pot_lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPO1");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPO1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BC1501( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BC1501( ) ;
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
            endLevel1BC1501( ) ;
         }
      }
      closeExtendedTableCursors1BC1501( ) ;
   }

   public void deferredUpdate1BC1501( )
   {
   }

   public void delete1BC1501( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BC1501( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BC1501( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BC1501( ) ;
         afterConfirm1BC1501( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BC1501( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BC24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num), Short.valueOf(A11271Pot_lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPO1");
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
      sMode1501 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BC1501( ) ;
      Gx_mode = sMode1501 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BC1501( )
   {
      standaloneModal1BC1501( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1BC1501( )
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

   public void scanStart1BC1501( )
   {
      /* Scan By routine */
      /* Using cursor T01BC25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A11270Pot_num)});
      RcdFound1501 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1501 = (short)(1) ;
         A11271Pot_lin = T01BC25_A11271Pot_lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BC1501( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1501 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1501 = (short)(1) ;
         A11271Pot_lin = T01BC25_A11271Pot_lin[0] ;
      }
   }

   public void scanEnd1BC1501( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1BC1501( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BC1501( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BC1501( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BC1501( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BC1501( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BC1501( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BC1501( )
   {
      edtPot_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_lin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPot_cant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_cant_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPot_cantP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_cantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_cantP_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPot_und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_und_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtPot_pre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_pre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_pre_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void send_integrity_lvl_hashes1BC1501( )
   {
   }

   public void send_integrity_lvl_hashes1BC1500( )
   {
   }

   public void subsflControlProps_901501( )
   {
      edtavnRcdDeleted_1501_Internalname = "vNRCDDELETED_1501_"+sGXsfl_90_idx ;
      edtPot_lin_Internalname = "POT_LIN_"+sGXsfl_90_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_90_idx ;
      edtPot_cant_Internalname = "POT_CANT_"+sGXsfl_90_idx ;
      edtPot_cantP_Internalname = "POT_CANTP_"+sGXsfl_90_idx ;
      edtPot_und_Internalname = "POT_UND_"+sGXsfl_90_idx ;
      edtPot_pre_Internalname = "POT_PRE_"+sGXsfl_90_idx ;
   }

   public void subsflControlProps_fel_901501( )
   {
      edtavnRcdDeleted_1501_Internalname = "vNRCDDELETED_1501_"+sGXsfl_90_fel_idx ;
      edtPot_lin_Internalname = "POT_LIN_"+sGXsfl_90_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_90_fel_idx ;
      edtPot_cant_Internalname = "POT_CANT_"+sGXsfl_90_fel_idx ;
      edtPot_cantP_Internalname = "POT_CANTP_"+sGXsfl_90_fel_idx ;
      edtPot_und_Internalname = "POT_UND_"+sGXsfl_90_fel_idx ;
      edtPot_pre_Internalname = "POT_PRE_"+sGXsfl_90_fel_idx ;
   }

   public void addRow1BC1501( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901501( ) ;
      sendRow1BC1501( ) ;
   }

   public void sendRow1BC1501( )
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
         if ( ((int)((nGXsfl_90_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1501_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1501_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1501_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1501), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1501), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1501_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1501_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1501_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPot_lin_Internalname,GXutil.ltrim( localUtil.ntoc( A11271Pot_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11271Pot_lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPot_lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPot_lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1501_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1501_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPot_cant_Internalname,GXutil.ltrim( localUtil.ntoc( A11266Pot_cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPot_cant_Enabled!=0) ? localUtil.format( A11266Pot_cant, "ZZZZZZ9.999") : localUtil.format( A11266Pot_cant, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPot_cant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPot_cant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1501_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPot_cantP_Internalname,GXutil.ltrim( localUtil.ntoc( A11267Pot_cantP, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPot_cantP_Enabled!=0) ? localUtil.format( A11267Pot_cantP, "ZZZZZZ9.999") : localUtil.format( A11267Pot_cantP, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPot_cantP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPot_cantP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1501_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPot_und_Internalname,GXutil.rtrim( A11268Pot_und),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPot_und_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPot_und_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1501_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPot_pre_Internalname,GXutil.ltrim( localUtil.ntoc( A11269Pot_pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPot_pre_Enabled!=0) ? localUtil.format( A11269Pot_pre, "ZZZZZZZ9.99999") : localUtil.format( A11269Pot_pre, "ZZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPot_pre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPot_pre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BC1501( ) ;
      GXCCtl = "Z11271Pot_lin_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11271Pot_lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11266Pot_cant_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11266Pot_cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11267Pot_cantP_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11267Pot_cantP, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11268Pot_und_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11268Pot_und));
      GXCCtl = "Z11269Pot_pre_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11269Pot_pre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1501_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1501_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1501_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1501, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1501_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1501_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POT_LIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POT_CANT_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POT_CANTP_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_cantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POT_UND_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_und_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POT_PRE_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_pre_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BC1501( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901501( ) ;
      edtavnRcdDeleted_1501_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1501_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPot_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_LIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPot_cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_CANT_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPot_cantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_CANTP_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPot_und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_UND_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPot_pre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "POT_PRE_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1501_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1501_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1501");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1501_Internalname ;
         wbErr = true ;
         nRcdDeleted_1501 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1501 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1501_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPot_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPot_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "POT_LIN_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPot_lin_Internalname ;
         wbErr = true ;
         A11271Pot_lin = (short)(0) ;
      }
      else
      {
         A11271Pot_lin = (short)(localUtil.ctol( httpContext.cgiGet( edtPot_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPot_cant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPot_cant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "POT_CANT_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPot_cant_Internalname ;
         wbErr = true ;
         A11266Pot_cant = DecimalUtil.ZERO ;
         n11266Pot_cant = false ;
      }
      else
      {
         A11266Pot_cant = localUtil.ctond( httpContext.cgiGet( edtPot_cant_Internalname)) ;
         n11266Pot_cant = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPot_cantP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPot_cantP_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "POT_CANTP_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPot_cantP_Internalname ;
         wbErr = true ;
         A11267Pot_cantP = DecimalUtil.ZERO ;
         n11267Pot_cantP = false ;
      }
      else
      {
         A11267Pot_cantP = localUtil.ctond( httpContext.cgiGet( edtPot_cantP_Internalname)) ;
         n11267Pot_cantP = false ;
      }
      A11268Pot_und = httpContext.cgiGet( edtPot_und_Internalname) ;
      n11268Pot_und = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPot_pre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPot_pre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "POT_PRE_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPot_pre_Internalname ;
         wbErr = true ;
         A11269Pot_pre = DecimalUtil.ZERO ;
         n11269Pot_pre = false ;
      }
      else
      {
         A11269Pot_pre = localUtil.ctond( httpContext.cgiGet( edtPot_pre_Internalname)) ;
         n11269Pot_pre = false ;
      }
      GXCCtl = "Z11271Pot_lin_" + sGXsfl_90_idx ;
      Z11271Pot_lin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11266Pot_cant_" + sGXsfl_90_idx ;
      Z11266Pot_cant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11267Pot_cantP_" + sGXsfl_90_idx ;
      Z11267Pot_cantP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11268Pot_und_" + sGXsfl_90_idx ;
      Z11268Pot_und = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11269Pot_pre_" + sGXsfl_90_idx ;
      Z11269Pot_pre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_90_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1501_" + sGXsfl_90_idx ;
      nRcdDeleted_1501 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1501_" + sGXsfl_90_idx ;
      nRcdExists_1501 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1501_" + sGXsfl_90_idx ;
      nIsMod_1501 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPot_lin_Enabled = edtPot_lin_Enabled ;
   }

   public void confirmValues1BC0( )
   {
      nGXsfl_90_idx = 0 ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901501( ) ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901501( ) ;
         httpContext.changePostValue( "Z11271Pot_lin_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z11271Pot_lin_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11271Pot_lin_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z11266Pot_cant_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z11266Pot_cant_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11266Pot_cant_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z11267Pot_cantP_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z11267Pot_cantP_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11267Pot_cantP_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z11268Pot_und_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z11268Pot_und_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11268Pot_und_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z11269Pot_pre_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z11269Pot_pre_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11269Pot_pre_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_90_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trecpot", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11270Pot_num", GXutil.ltrim( localUtil.ntoc( Z11270Pot_num, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11257Pot_dia", localUtil.dtoc( Z11257Pot_dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11258Pot_hor", localUtil.ttoc( Z11258Pot_hor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11259Pot_usu", GXutil.rtrim( Z11259Pot_usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11260Pot_term", GXutil.rtrim( Z11260Pot_term));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11261Pot_usuP", GXutil.rtrim( Z11261Pot_usuP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11262Pot_diaP", localUtil.dtoc( Z11262Pot_diaP, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11263Pot_horP", localUtil.ttoc( Z11263Pot_horP, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11264Pot_Vol", GXutil.ltrim( localUtil.ntoc( Z11264Pot_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11265Pot_est", GXutil.ltrim( localUtil.ntoc( Z11265Pot_est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_90", GXutil.ltrim( localUtil.ntoc( nGXsfl_90_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.trecpot", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TRECPOT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", "") ;
   }

   public void initializeNonKey1BC1500( )
   {
      A11257Pot_dia = GXutil.nullDate() ;
      n11257Pot_dia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11257Pot_dia", localUtil.format(A11257Pot_dia, "99/99/99"));
      A11258Pot_hor = GXutil.resetTime( GXutil.nullDate() );
      n11258Pot_hor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11258Pot_hor", localUtil.ttoc( A11258Pot_hor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11259Pot_usu = "" ;
      n11259Pot_usu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11259Pot_usu", A11259Pot_usu);
      A11260Pot_term = "" ;
      n11260Pot_term = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11260Pot_term", A11260Pot_term);
      A764ProForCod = "" ;
      n764ProForCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A11261Pot_usuP = "" ;
      n11261Pot_usuP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11261Pot_usuP", A11261Pot_usuP);
      A11262Pot_diaP = GXutil.nullDate() ;
      n11262Pot_diaP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11262Pot_diaP", localUtil.format(A11262Pot_diaP, "99/99/99"));
      A11263Pot_horP = GXutil.resetTime( GXutil.nullDate() );
      n11263Pot_horP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11263Pot_horP", localUtil.ttoc( A11263Pot_horP, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11264Pot_Vol = 0 ;
      n11264Pot_Vol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11264Pot_Vol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11264Pot_Vol), 5, 0));
      A11265Pot_est = (byte)(0) ;
      n11265Pot_est = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11265Pot_est", GXutil.str( A11265Pot_est, 1, 0));
      Z11257Pot_dia = GXutil.nullDate() ;
      Z11258Pot_hor = GXutil.resetTime( GXutil.nullDate() );
      Z11259Pot_usu = "" ;
      Z11260Pot_term = "" ;
      Z11261Pot_usuP = "" ;
      Z11262Pot_diaP = GXutil.nullDate() ;
      Z11263Pot_horP = GXutil.resetTime( GXutil.nullDate() );
      Z11264Pot_Vol = 0 ;
      Z11265Pot_est = (byte)(0) ;
      Z764ProForCod = "" ;
   }

   public void initAll1BC1500( )
   {
      A11270Pot_num = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11270Pot_num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11270Pot_num), 8, 0));
      initializeNonKey1BC1500( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BC1501( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A11266Pot_cant = DecimalUtil.ZERO ;
      n11266Pot_cant = false ;
      A11267Pot_cantP = DecimalUtil.ZERO ;
      n11267Pot_cantP = false ;
      A11268Pot_und = "" ;
      n11268Pot_und = false ;
      A11269Pot_pre = DecimalUtil.ZERO ;
      n11269Pot_pre = false ;
      Z11266Pot_cant = DecimalUtil.ZERO ;
      Z11267Pot_cantP = DecimalUtil.ZERO ;
      Z11268Pot_und = "" ;
      Z11269Pot_pre = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
   }

   public void initAll1BC1501( )
   {
      A11271Pot_lin = (short)(0) ;
      initializeNonKey1BC1501( ) ;
   }

   public void standaloneModalInsert1BC1501( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564082", true, true);
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
      httpContext.AddJavascriptSource("trecpot.js", "?20268241564083", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1501( )
   {
      edtPot_lin_Enabled = defedtPot_lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPot_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPot_lin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void startgridcontrol90( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1501, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1501_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11271Pot_lin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11266Pot_cant, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11267Pot_cantP, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_cantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11268Pot_und));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_und_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11269Pot_pre, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPot_pre_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPot_num_Internalname = "POT_NUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPot_dia_Internalname = "POT_DIA" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPot_hor_Internalname = "POT_HOR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPot_usu_Internalname = "POT_USU" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPot_term_Internalname = "POT_TERM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPot_usuP_Internalname = "POT_USUP" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPot_diaP_Internalname = "POT_DIAP" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPot_horP_Internalname = "POT_HORP" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPot_Vol_Internalname = "POT_VOL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtPot_est_Internalname = "POT_EST" ;
      edtavnRcdDeleted_1501_Internalname = "vNRCDDELETED_1501" ;
      edtPot_lin_Internalname = "POT_LIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPot_cant_Internalname = "POT_CANT" ;
      edtPot_cantP_Internalname = "POT_CANTP" ;
      edtPot_und_Internalname = "POT_UND" ;
      edtPot_pre_Internalname = "POT_PRE" ;
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
      Form.setCaption( httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", "") );
      edtPot_pre_Jsonclick = "" ;
      edtPot_und_Jsonclick = "" ;
      edtPot_cantP_Jsonclick = "" ;
      edtPot_cant_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtPot_lin_Jsonclick = "" ;
      edtavnRcdDeleted_1501_Jsonclick = "" ;
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
      edtPot_pre_Enabled = 1 ;
      edtPot_und_Enabled = 1 ;
      edtPot_cantP_Enabled = 1 ;
      edtPot_cant_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtPot_lin_Enabled = 1 ;
      edtavnRcdDeleted_1501_Enabled = 1 ;
      edtPot_est_Jsonclick = "" ;
      edtPot_est_Backcolor = (int)(0xFFFFFF) ;
      edtPot_est_Enabled = 1 ;
      edtPot_Vol_Jsonclick = "" ;
      edtPot_Vol_Backcolor = (int)(0xFFFFFF) ;
      edtPot_Vol_Enabled = 1 ;
      edtPot_horP_Jsonclick = "" ;
      edtPot_horP_Backcolor = (int)(0xFFFFFF) ;
      edtPot_horP_Enabled = 1 ;
      edtPot_diaP_Jsonclick = "" ;
      edtPot_diaP_Backcolor = (int)(0xFFFFFF) ;
      edtPot_diaP_Enabled = 1 ;
      edtPot_usuP_Jsonclick = "" ;
      edtPot_usuP_Backcolor = (int)(0xFFFFFF) ;
      edtPot_usuP_Enabled = 1 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Backcolor = (int)(0xFFFFFF) ;
      edtProForCod_Enabled = 1 ;
      edtPot_term_Jsonclick = "" ;
      edtPot_term_Backcolor = (int)(0xFFFFFF) ;
      edtPot_term_Enabled = 1 ;
      edtPot_usu_Jsonclick = "" ;
      edtPot_usu_Backcolor = (int)(0xFFFFFF) ;
      edtPot_usu_Enabled = 1 ;
      edtPot_hor_Jsonclick = "" ;
      edtPot_hor_Backcolor = (int)(0xFFFFFF) ;
      edtPot_hor_Enabled = 1 ;
      edtPot_dia_Jsonclick = "" ;
      edtPot_dia_Backcolor = (int)(0xFFFFFF) ;
      edtPot_dia_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPot_num_Jsonclick = "" ;
      edtPot_num_Backcolor = (int)(0xFFFFFF) ;
      edtPot_num_Enabled = 1 ;
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
      subsflControlProps_901501( ) ;
      while ( nGXsfl_90_idx <= nRC_GXsfl_90 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BC1501( ) ;
         standaloneModal1BC1501( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BC1501( ) ;
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901501( ) ;
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
      /* Using cursor T01BC26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BC26_A407EmprNom[0] ;
      n407EmprNom = T01BC26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      GX_FocusControl = edtPot_dia_Internalname ;
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

   public void valid_Pot_num( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11257Pot_dia", localUtil.format(A11257Pot_dia, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11258Pot_hor", localUtil.ttoc( A11258Pot_hor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11259Pot_usu", GXutil.rtrim( A11259Pot_usu));
      httpContext.ajax_rsp_assign_attri("", false, "A11260Pot_term", GXutil.rtrim( A11260Pot_term));
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", GXutil.rtrim( A764ProForCod));
      httpContext.ajax_rsp_assign_attri("", false, "A11261Pot_usuP", GXutil.rtrim( A11261Pot_usuP));
      httpContext.ajax_rsp_assign_attri("", false, "A11262Pot_diaP", localUtil.format(A11262Pot_diaP, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11263Pot_horP", localUtil.ttoc( A11263Pot_horP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11264Pot_Vol", GXutil.ltrim( localUtil.ntoc( A11264Pot_Vol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11265Pot_est", GXutil.ltrim( localUtil.ntoc( A11265Pot_est, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11270Pot_num", GXutil.ltrim( localUtil.ntoc( Z11270Pot_num, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11257Pot_dia", localUtil.format(Z11257Pot_dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11258Pot_hor", localUtil.ttoc( Z11258Pot_hor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11259Pot_usu", GXutil.rtrim( Z11259Pot_usu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11260Pot_term", GXutil.rtrim( Z11260Pot_term));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11261Pot_usuP", GXutil.rtrim( Z11261Pot_usuP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11262Pot_diaP", localUtil.format(Z11262Pot_diaP, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11263Pot_horP", localUtil.ttoc( Z11263Pot_horP, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11264Pot_Vol", GXutil.ltrim( localUtil.ntoc( Z11264Pot_Vol, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11265Pot_est", GXutil.ltrim( localUtil.ntoc( Z11265Pot_est, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      /* Using cursor T01BC17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T01BC17_A766ProForDsc[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01BC27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      pr_default.close(25);
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
      setEventMetadata("VALID_POT_NUM","{handler:'valid_Pot_num',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11270Pot_num',fld:'POT_NUM',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_POT_NUM",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11257Pot_dia',fld:'POT_DIA',pic:''},{av:'A11258Pot_hor',fld:'POT_HOR',pic:'99/99/99 99:99'},{av:'A11259Pot_usu',fld:'POT_USU',pic:''},{av:'A11260Pot_term',fld:'POT_TERM',pic:''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A11261Pot_usuP',fld:'POT_USUP',pic:''},{av:'A11262Pot_diaP',fld:'POT_DIAP',pic:''},{av:'A11263Pot_horP',fld:'POT_HORP',pic:'99/99/99 99:99'},{av:'A11264Pot_Vol',fld:'POT_VOL',pic:'ZZZZ9'},{av:'A11265Pot_est',fld:'POT_EST',pic:'9'},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11270Pot_num'},{av:'Z407EmprNom'},{av:'Z11257Pot_dia'},{av:'Z11258Pot_hor'},{av:'Z11259Pot_usu'},{av:'Z11260Pot_term'},{av:'Z764ProForCod'},{av:'Z11261Pot_usuP'},{av:'Z11262Pot_diaP'},{av:'Z11263Pot_horP'},{av:'Z11264Pot_Vol'},{av:'Z11265Pot_est'},{av:'Z766ProForDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]}");
      setEventMetadata("VALID_POT_LIN","{handler:'valid_Pot_lin',iparms:[]");
      setEventMetadata("VALID_POT_LIN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pot_pre',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11257Pot_dia = GXutil.nullDate() ;
      Z11258Pot_hor = GXutil.resetTime( GXutil.nullDate() );
      Z11259Pot_usu = "" ;
      Z11260Pot_term = "" ;
      Z11261Pot_usuP = "" ;
      Z11262Pot_diaP = GXutil.nullDate() ;
      Z11263Pot_horP = GXutil.resetTime( GXutil.nullDate() );
      Z764ProForCod = "" ;
      Z11266Pot_cant = DecimalUtil.ZERO ;
      Z11267Pot_cantP = DecimalUtil.ZERO ;
      Z11268Pot_und = "" ;
      Z11269Pot_pre = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A719PrdNum = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A11257Pot_dia = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      A11258Pot_hor = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock6_Jsonclick = "" ;
      A11259Pot_usu = "" ;
      lblTextblock7_Jsonclick = "" ;
      A11260Pot_term = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A766ProForDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A11261Pot_usuP = "" ;
      lblTextblock11_Jsonclick = "" ;
      A11262Pot_diaP = GXutil.nullDate() ;
      lblTextblock12_Jsonclick = "" ;
      A11263Pot_horP = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1501 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1500 = "" ;
      GXCCtl = "" ;
      A11266Pot_cant = DecimalUtil.ZERO ;
      A11267Pot_cantP = DecimalUtil.ZERO ;
      A11268Pot_und = "" ;
      A11269Pot_pre = DecimalUtil.ZERO ;
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
      Z766ProForDsc = "" ;
      T01BC7_A407EmprNom = new String[] {""} ;
      T01BC7_n407EmprNom = new boolean[] {false} ;
      T01BC9_A11270Pot_num = new int[1] ;
      T01BC9_A407EmprNom = new String[] {""} ;
      T01BC9_n407EmprNom = new boolean[] {false} ;
      T01BC9_A11257Pot_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC9_n11257Pot_dia = new boolean[] {false} ;
      T01BC9_A11258Pot_hor = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC9_n11258Pot_hor = new boolean[] {false} ;
      T01BC9_A11259Pot_usu = new String[] {""} ;
      T01BC9_n11259Pot_usu = new boolean[] {false} ;
      T01BC9_A11260Pot_term = new String[] {""} ;
      T01BC9_n11260Pot_term = new boolean[] {false} ;
      T01BC9_A766ProForDsc = new String[] {""} ;
      T01BC9_A11261Pot_usuP = new String[] {""} ;
      T01BC9_n11261Pot_usuP = new boolean[] {false} ;
      T01BC9_A11262Pot_diaP = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC9_n11262Pot_diaP = new boolean[] {false} ;
      T01BC9_A11263Pot_horP = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC9_n11263Pot_horP = new boolean[] {false} ;
      T01BC9_A11264Pot_Vol = new int[1] ;
      T01BC9_n11264Pot_Vol = new boolean[] {false} ;
      T01BC9_A11265Pot_est = new byte[1] ;
      T01BC9_n11265Pot_est = new boolean[] {false} ;
      T01BC9_A396EmprCod = new String[] {""} ;
      T01BC9_A764ProForCod = new String[] {""} ;
      T01BC9_n764ProForCod = new boolean[] {false} ;
      T01BC8_A766ProForDsc = new String[] {""} ;
      T01BC10_A766ProForDsc = new String[] {""} ;
      T01BC11_A396EmprCod = new String[] {""} ;
      T01BC11_A11270Pot_num = new int[1] ;
      T01BC6_A11270Pot_num = new int[1] ;
      T01BC6_A11257Pot_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC6_n11257Pot_dia = new boolean[] {false} ;
      T01BC6_A11258Pot_hor = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC6_n11258Pot_hor = new boolean[] {false} ;
      T01BC6_A11259Pot_usu = new String[] {""} ;
      T01BC6_n11259Pot_usu = new boolean[] {false} ;
      T01BC6_A11260Pot_term = new String[] {""} ;
      T01BC6_n11260Pot_term = new boolean[] {false} ;
      T01BC6_A11261Pot_usuP = new String[] {""} ;
      T01BC6_n11261Pot_usuP = new boolean[] {false} ;
      T01BC6_A11262Pot_diaP = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC6_n11262Pot_diaP = new boolean[] {false} ;
      T01BC6_A11263Pot_horP = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC6_n11263Pot_horP = new boolean[] {false} ;
      T01BC6_A11264Pot_Vol = new int[1] ;
      T01BC6_n11264Pot_Vol = new boolean[] {false} ;
      T01BC6_A11265Pot_est = new byte[1] ;
      T01BC6_n11265Pot_est = new boolean[] {false} ;
      T01BC6_A396EmprCod = new String[] {""} ;
      T01BC6_A764ProForCod = new String[] {""} ;
      T01BC6_n764ProForCod = new boolean[] {false} ;
      T01BC12_A396EmprCod = new String[] {""} ;
      T01BC12_A11270Pot_num = new int[1] ;
      T01BC13_A396EmprCod = new String[] {""} ;
      T01BC13_A11270Pot_num = new int[1] ;
      T01BC5_A11270Pot_num = new int[1] ;
      T01BC5_A11257Pot_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC5_n11257Pot_dia = new boolean[] {false} ;
      T01BC5_A11258Pot_hor = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC5_n11258Pot_hor = new boolean[] {false} ;
      T01BC5_A11259Pot_usu = new String[] {""} ;
      T01BC5_n11259Pot_usu = new boolean[] {false} ;
      T01BC5_A11260Pot_term = new String[] {""} ;
      T01BC5_n11260Pot_term = new boolean[] {false} ;
      T01BC5_A11261Pot_usuP = new String[] {""} ;
      T01BC5_n11261Pot_usuP = new boolean[] {false} ;
      T01BC5_A11262Pot_diaP = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC5_n11262Pot_diaP = new boolean[] {false} ;
      T01BC5_A11263Pot_horP = new java.util.Date[] {GXutil.nullDate()} ;
      T01BC5_n11263Pot_horP = new boolean[] {false} ;
      T01BC5_A11264Pot_Vol = new int[1] ;
      T01BC5_n11264Pot_Vol = new boolean[] {false} ;
      T01BC5_A11265Pot_est = new byte[1] ;
      T01BC5_n11265Pot_est = new boolean[] {false} ;
      T01BC5_A396EmprCod = new String[] {""} ;
      T01BC5_A764ProForCod = new String[] {""} ;
      T01BC5_n764ProForCod = new boolean[] {false} ;
      T01BC17_A766ProForDsc = new String[] {""} ;
      T01BC18_A396EmprCod = new String[] {""} ;
      T01BC18_A11270Pot_num = new int[1] ;
      T01BC19_A11270Pot_num = new int[1] ;
      T01BC19_A11271Pot_lin = new short[1] ;
      T01BC19_A11266Pot_cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC19_n11266Pot_cant = new boolean[] {false} ;
      T01BC19_A11267Pot_cantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC19_n11267Pot_cantP = new boolean[] {false} ;
      T01BC19_A11268Pot_und = new String[] {""} ;
      T01BC19_n11268Pot_und = new boolean[] {false} ;
      T01BC19_A11269Pot_pre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC19_n11269Pot_pre = new boolean[] {false} ;
      T01BC19_A396EmprCod = new String[] {""} ;
      T01BC19_A719PrdNum = new String[] {""} ;
      T01BC19_n719PrdNum = new boolean[] {false} ;
      T01BC4_A396EmprCod = new String[] {""} ;
      T01BC20_A396EmprCod = new String[] {""} ;
      T01BC21_A396EmprCod = new String[] {""} ;
      T01BC21_A11270Pot_num = new int[1] ;
      T01BC21_A11271Pot_lin = new short[1] ;
      T01BC3_A11270Pot_num = new int[1] ;
      T01BC3_A11271Pot_lin = new short[1] ;
      T01BC3_A11266Pot_cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC3_n11266Pot_cant = new boolean[] {false} ;
      T01BC3_A11267Pot_cantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC3_n11267Pot_cantP = new boolean[] {false} ;
      T01BC3_A11268Pot_und = new String[] {""} ;
      T01BC3_n11268Pot_und = new boolean[] {false} ;
      T01BC3_A11269Pot_pre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC3_n11269Pot_pre = new boolean[] {false} ;
      T01BC3_A396EmprCod = new String[] {""} ;
      T01BC3_A719PrdNum = new String[] {""} ;
      T01BC3_n719PrdNum = new boolean[] {false} ;
      T01BC2_A11270Pot_num = new int[1] ;
      T01BC2_A11271Pot_lin = new short[1] ;
      T01BC2_A11266Pot_cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC2_n11266Pot_cant = new boolean[] {false} ;
      T01BC2_A11267Pot_cantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC2_n11267Pot_cantP = new boolean[] {false} ;
      T01BC2_A11268Pot_und = new String[] {""} ;
      T01BC2_n11268Pot_und = new boolean[] {false} ;
      T01BC2_A11269Pot_pre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BC2_n11269Pot_pre = new boolean[] {false} ;
      T01BC2_A396EmprCod = new String[] {""} ;
      T01BC2_A719PrdNum = new String[] {""} ;
      T01BC2_n719PrdNum = new boolean[] {false} ;
      T01BC25_A396EmprCod = new String[] {""} ;
      T01BC25_A11270Pot_num = new int[1] ;
      T01BC25_A11271Pot_lin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01BC26_A407EmprNom = new String[] {""} ;
      T01BC26_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ11257Pot_dia = GXutil.nullDate() ;
      ZZ11258Pot_hor = GXutil.resetTime( GXutil.nullDate() );
      ZZ11259Pot_usu = "" ;
      ZZ11260Pot_term = "" ;
      ZZ764ProForCod = "" ;
      ZZ11261Pot_usuP = "" ;
      ZZ11262Pot_diaP = GXutil.nullDate() ;
      ZZ11263Pot_horP = GXutil.resetTime( GXutil.nullDate() );
      ZZ766ProForDsc = "" ;
      T01BC27_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trecpot__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trecpot__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trecpot__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trecpot__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trecpot__default(),
         new Object[] {
             new Object[] {
            T01BC2_A11270Pot_num, T01BC2_A11271Pot_lin, T01BC2_A11266Pot_cant, T01BC2_n11266Pot_cant, T01BC2_A11267Pot_cantP, T01BC2_n11267Pot_cantP, T01BC2_A11268Pot_und, T01BC2_n11268Pot_und, T01BC2_A11269Pot_pre, T01BC2_n11269Pot_pre,
            T01BC2_A396EmprCod, T01BC2_A719PrdNum, T01BC2_n719PrdNum
            }
            , new Object[] {
            T01BC3_A11270Pot_num, T01BC3_A11271Pot_lin, T01BC3_A11266Pot_cant, T01BC3_n11266Pot_cant, T01BC3_A11267Pot_cantP, T01BC3_n11267Pot_cantP, T01BC3_A11268Pot_und, T01BC3_n11268Pot_und, T01BC3_A11269Pot_pre, T01BC3_n11269Pot_pre,
            T01BC3_A396EmprCod, T01BC3_A719PrdNum, T01BC3_n719PrdNum
            }
            , new Object[] {
            T01BC4_A396EmprCod
            }
            , new Object[] {
            T01BC5_A11270Pot_num, T01BC5_A11257Pot_dia, T01BC5_n11257Pot_dia, T01BC5_A11258Pot_hor, T01BC5_n11258Pot_hor, T01BC5_A11259Pot_usu, T01BC5_n11259Pot_usu, T01BC5_A11260Pot_term, T01BC5_n11260Pot_term, T01BC5_A11261Pot_usuP,
            T01BC5_n11261Pot_usuP, T01BC5_A11262Pot_diaP, T01BC5_n11262Pot_diaP, T01BC5_A11263Pot_horP, T01BC5_n11263Pot_horP, T01BC5_A11264Pot_Vol, T01BC5_n11264Pot_Vol, T01BC5_A11265Pot_est, T01BC5_n11265Pot_est, T01BC5_A396EmprCod,
            T01BC5_A764ProForCod, T01BC5_n764ProForCod
            }
            , new Object[] {
            T01BC6_A11270Pot_num, T01BC6_A11257Pot_dia, T01BC6_n11257Pot_dia, T01BC6_A11258Pot_hor, T01BC6_n11258Pot_hor, T01BC6_A11259Pot_usu, T01BC6_n11259Pot_usu, T01BC6_A11260Pot_term, T01BC6_n11260Pot_term, T01BC6_A11261Pot_usuP,
            T01BC6_n11261Pot_usuP, T01BC6_A11262Pot_diaP, T01BC6_n11262Pot_diaP, T01BC6_A11263Pot_horP, T01BC6_n11263Pot_horP, T01BC6_A11264Pot_Vol, T01BC6_n11264Pot_Vol, T01BC6_A11265Pot_est, T01BC6_n11265Pot_est, T01BC6_A396EmprCod,
            T01BC6_A764ProForCod, T01BC6_n764ProForCod
            }
            , new Object[] {
            T01BC7_A407EmprNom, T01BC7_n407EmprNom
            }
            , new Object[] {
            T01BC8_A766ProForDsc
            }
            , new Object[] {
            T01BC9_A11270Pot_num, T01BC9_A407EmprNom, T01BC9_n407EmprNom, T01BC9_A11257Pot_dia, T01BC9_n11257Pot_dia, T01BC9_A11258Pot_hor, T01BC9_n11258Pot_hor, T01BC9_A11259Pot_usu, T01BC9_n11259Pot_usu, T01BC9_A11260Pot_term,
            T01BC9_n11260Pot_term, T01BC9_A766ProForDsc, T01BC9_A11261Pot_usuP, T01BC9_n11261Pot_usuP, T01BC9_A11262Pot_diaP, T01BC9_n11262Pot_diaP, T01BC9_A11263Pot_horP, T01BC9_n11263Pot_horP, T01BC9_A11264Pot_Vol, T01BC9_n11264Pot_Vol,
            T01BC9_A11265Pot_est, T01BC9_n11265Pot_est, T01BC9_A396EmprCod, T01BC9_A764ProForCod, T01BC9_n764ProForCod
            }
            , new Object[] {
            T01BC10_A766ProForDsc
            }
            , new Object[] {
            T01BC11_A396EmprCod, T01BC11_A11270Pot_num
            }
            , new Object[] {
            T01BC12_A396EmprCod, T01BC12_A11270Pot_num
            }
            , new Object[] {
            T01BC13_A396EmprCod, T01BC13_A11270Pot_num
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BC17_A766ProForDsc
            }
            , new Object[] {
            T01BC18_A396EmprCod, T01BC18_A11270Pot_num
            }
            , new Object[] {
            T01BC19_A11270Pot_num, T01BC19_A11271Pot_lin, T01BC19_A11266Pot_cant, T01BC19_n11266Pot_cant, T01BC19_A11267Pot_cantP, T01BC19_n11267Pot_cantP, T01BC19_A11268Pot_und, T01BC19_n11268Pot_und, T01BC19_A11269Pot_pre, T01BC19_n11269Pot_pre,
            T01BC19_A396EmprCod, T01BC19_A719PrdNum, T01BC19_n719PrdNum
            }
            , new Object[] {
            T01BC20_A396EmprCod
            }
            , new Object[] {
            T01BC21_A396EmprCod, T01BC21_A11270Pot_num, T01BC21_A11271Pot_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BC25_A396EmprCod, T01BC25_A11270Pot_num, T01BC25_A11271Pot_lin
            }
            , new Object[] {
            T01BC26_A407EmprNom, T01BC26_n407EmprNom
            }
            , new Object[] {
            T01BC27_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TRECPOT" ;
   }

   private byte Z11265Pot_est ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11265Pot_est ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ11265Pot_est ;
   private short Z11271Pot_lin ;
   private short nRcdDeleted_1501 ;
   private short nRcdExists_1501 ;
   private short nIsMod_1501 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1501 ;
   private short RcdFound1501 ;
   private short nBlankRcdUsr1501 ;
   private short A11271Pot_lin ;
   private short RcdFound1500 ;
   private short nIsDirty_1500 ;
   private short nIsDirty_1501 ;
   private int Z11270Pot_num ;
   private int Z11264Pot_Vol ;
   private int nRC_GXsfl_90 ;
   private int nGXsfl_90_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A11270Pot_num ;
   private int edtPot_num_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPot_dia_Enabled ;
   private int edtPot_hor_Enabled ;
   private int edtPot_usu_Enabled ;
   private int edtPot_term_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtPot_usuP_Enabled ;
   private int edtPot_diaP_Enabled ;
   private int edtPot_horP_Enabled ;
   private int A11264Pot_Vol ;
   private int edtPot_Vol_Enabled ;
   private int edtPot_est_Enabled ;
   private int edtavnRcdDeleted_1501_Enabled ;
   private int edtPot_lin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPot_cant_Enabled ;
   private int edtPot_cantP_Enabled ;
   private int edtPot_und_Enabled ;
   private int edtPot_pre_Enabled ;
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
   private int defedtPot_lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPot_est_Backcolor ;
   private int edtPot_Vol_Backcolor ;
   private int edtPot_horP_Backcolor ;
   private int edtPot_diaP_Backcolor ;
   private int edtPot_usuP_Backcolor ;
   private int edtProForDsc_Backcolor ;
   private int edtProForCod_Backcolor ;
   private int edtPot_term_Backcolor ;
   private int edtPot_usu_Backcolor ;
   private int edtPot_hor_Backcolor ;
   private int edtPot_dia_Backcolor ;
   private int edtPot_num_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11270Pot_num ;
   private int ZZ11264Pot_Vol ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11266Pot_cant ;
   private java.math.BigDecimal Z11267Pot_cantP ;
   private java.math.BigDecimal Z11269Pot_pre ;
   private java.math.BigDecimal A11266Pot_cant ;
   private java.math.BigDecimal A11267Pot_cantP ;
   private java.math.BigDecimal A11269Pot_pre ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11259Pot_usu ;
   private String Z11260Pot_term ;
   private String Z11261Pot_usuP ;
   private String Z764ProForCod ;
   private String Z11268Pot_und ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPot_num_Internalname ;
   private String sGXsfl_90_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPot_num_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPot_dia_Internalname ;
   private String edtPot_dia_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPot_hor_Internalname ;
   private String edtPot_hor_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPot_usu_Internalname ;
   private String A11259Pot_usu ;
   private String edtPot_usu_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPot_term_Internalname ;
   private String A11260Pot_term ;
   private String edtPot_term_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPot_usuP_Internalname ;
   private String A11261Pot_usuP ;
   private String edtPot_usuP_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPot_diaP_Internalname ;
   private String edtPot_diaP_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPot_horP_Internalname ;
   private String edtPot_horP_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPot_Vol_Internalname ;
   private String edtPot_Vol_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtPot_est_Internalname ;
   private String edtPot_est_Jsonclick ;
   private String sMode1501 ;
   private String edtavnRcdDeleted_1501_Internalname ;
   private String edtPot_lin_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPot_cant_Internalname ;
   private String edtPot_cantP_Internalname ;
   private String edtPot_und_Internalname ;
   private String edtPot_pre_Internalname ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1500 ;
   private String GXCCtl ;
   private String A11268Pot_und ;
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
   private String Z766ProForDsc ;
   private String sGXsfl_90_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1501_Jsonclick ;
   private String edtPot_lin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPot_cant_Jsonclick ;
   private String edtPot_cantP_Jsonclick ;
   private String edtPot_und_Jsonclick ;
   private String edtPot_pre_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ11259Pot_usu ;
   private String ZZ11260Pot_term ;
   private String ZZ764ProForCod ;
   private String ZZ11261Pot_usuP ;
   private String ZZ766ProForDsc ;
   private java.util.Date Z11258Pot_hor ;
   private java.util.Date Z11263Pot_horP ;
   private java.util.Date A11258Pot_hor ;
   private java.util.Date A11263Pot_horP ;
   private java.util.Date ZZ11258Pot_hor ;
   private java.util.Date ZZ11263Pot_horP ;
   private java.util.Date Z11257Pot_dia ;
   private java.util.Date Z11262Pot_diaP ;
   private java.util.Date A11257Pot_dia ;
   private java.util.Date A11262Pot_diaP ;
   private java.util.Date ZZ11257Pot_dia ;
   private java.util.Date ZZ11262Pot_diaP ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n764ProForCod ;
   private boolean n719PrdNum ;
   private boolean wbErr ;
   private boolean bGXsfl_90_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11257Pot_dia ;
   private boolean n11258Pot_hor ;
   private boolean n11259Pot_usu ;
   private boolean n11260Pot_term ;
   private boolean n11261Pot_usuP ;
   private boolean n11262Pot_diaP ;
   private boolean n11263Pot_horP ;
   private boolean n11264Pot_Vol ;
   private boolean n11265Pot_est ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n11266Pot_cant ;
   private boolean n11267Pot_cantP ;
   private boolean n11268Pot_und ;
   private boolean n11269Pot_pre ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01BC7_A407EmprNom ;
   private boolean[] T01BC7_n407EmprNom ;
   private int[] T01BC9_A11270Pot_num ;
   private String[] T01BC9_A407EmprNom ;
   private boolean[] T01BC9_n407EmprNom ;
   private java.util.Date[] T01BC9_A11257Pot_dia ;
   private boolean[] T01BC9_n11257Pot_dia ;
   private java.util.Date[] T01BC9_A11258Pot_hor ;
   private boolean[] T01BC9_n11258Pot_hor ;
   private String[] T01BC9_A11259Pot_usu ;
   private boolean[] T01BC9_n11259Pot_usu ;
   private String[] T01BC9_A11260Pot_term ;
   private boolean[] T01BC9_n11260Pot_term ;
   private String[] T01BC9_A766ProForDsc ;
   private String[] T01BC9_A11261Pot_usuP ;
   private boolean[] T01BC9_n11261Pot_usuP ;
   private java.util.Date[] T01BC9_A11262Pot_diaP ;
   private boolean[] T01BC9_n11262Pot_diaP ;
   private java.util.Date[] T01BC9_A11263Pot_horP ;
   private boolean[] T01BC9_n11263Pot_horP ;
   private int[] T01BC9_A11264Pot_Vol ;
   private boolean[] T01BC9_n11264Pot_Vol ;
   private byte[] T01BC9_A11265Pot_est ;
   private boolean[] T01BC9_n11265Pot_est ;
   private String[] T01BC9_A396EmprCod ;
   private String[] T01BC9_A764ProForCod ;
   private boolean[] T01BC9_n764ProForCod ;
   private String[] T01BC8_A766ProForDsc ;
   private String[] T01BC10_A766ProForDsc ;
   private String[] T01BC11_A396EmprCod ;
   private int[] T01BC11_A11270Pot_num ;
   private int[] T01BC6_A11270Pot_num ;
   private java.util.Date[] T01BC6_A11257Pot_dia ;
   private boolean[] T01BC6_n11257Pot_dia ;
   private java.util.Date[] T01BC6_A11258Pot_hor ;
   private boolean[] T01BC6_n11258Pot_hor ;
   private String[] T01BC6_A11259Pot_usu ;
   private boolean[] T01BC6_n11259Pot_usu ;
   private String[] T01BC6_A11260Pot_term ;
   private boolean[] T01BC6_n11260Pot_term ;
   private String[] T01BC6_A11261Pot_usuP ;
   private boolean[] T01BC6_n11261Pot_usuP ;
   private java.util.Date[] T01BC6_A11262Pot_diaP ;
   private boolean[] T01BC6_n11262Pot_diaP ;
   private java.util.Date[] T01BC6_A11263Pot_horP ;
   private boolean[] T01BC6_n11263Pot_horP ;
   private int[] T01BC6_A11264Pot_Vol ;
   private boolean[] T01BC6_n11264Pot_Vol ;
   private byte[] T01BC6_A11265Pot_est ;
   private boolean[] T01BC6_n11265Pot_est ;
   private String[] T01BC6_A396EmprCod ;
   private String[] T01BC6_A764ProForCod ;
   private boolean[] T01BC6_n764ProForCod ;
   private String[] T01BC12_A396EmprCod ;
   private int[] T01BC12_A11270Pot_num ;
   private String[] T01BC13_A396EmprCod ;
   private int[] T01BC13_A11270Pot_num ;
   private int[] T01BC5_A11270Pot_num ;
   private java.util.Date[] T01BC5_A11257Pot_dia ;
   private boolean[] T01BC5_n11257Pot_dia ;
   private java.util.Date[] T01BC5_A11258Pot_hor ;
   private boolean[] T01BC5_n11258Pot_hor ;
   private String[] T01BC5_A11259Pot_usu ;
   private boolean[] T01BC5_n11259Pot_usu ;
   private String[] T01BC5_A11260Pot_term ;
   private boolean[] T01BC5_n11260Pot_term ;
   private String[] T01BC5_A11261Pot_usuP ;
   private boolean[] T01BC5_n11261Pot_usuP ;
   private java.util.Date[] T01BC5_A11262Pot_diaP ;
   private boolean[] T01BC5_n11262Pot_diaP ;
   private java.util.Date[] T01BC5_A11263Pot_horP ;
   private boolean[] T01BC5_n11263Pot_horP ;
   private int[] T01BC5_A11264Pot_Vol ;
   private boolean[] T01BC5_n11264Pot_Vol ;
   private byte[] T01BC5_A11265Pot_est ;
   private boolean[] T01BC5_n11265Pot_est ;
   private String[] T01BC5_A396EmprCod ;
   private String[] T01BC5_A764ProForCod ;
   private boolean[] T01BC5_n764ProForCod ;
   private String[] T01BC17_A766ProForDsc ;
   private String[] T01BC18_A396EmprCod ;
   private int[] T01BC18_A11270Pot_num ;
   private int[] T01BC19_A11270Pot_num ;
   private short[] T01BC19_A11271Pot_lin ;
   private java.math.BigDecimal[] T01BC19_A11266Pot_cant ;
   private boolean[] T01BC19_n11266Pot_cant ;
   private java.math.BigDecimal[] T01BC19_A11267Pot_cantP ;
   private boolean[] T01BC19_n11267Pot_cantP ;
   private String[] T01BC19_A11268Pot_und ;
   private boolean[] T01BC19_n11268Pot_und ;
   private java.math.BigDecimal[] T01BC19_A11269Pot_pre ;
   private boolean[] T01BC19_n11269Pot_pre ;
   private String[] T01BC19_A396EmprCod ;
   private String[] T01BC19_A719PrdNum ;
   private boolean[] T01BC19_n719PrdNum ;
   private String[] T01BC4_A396EmprCod ;
   private String[] T01BC20_A396EmprCod ;
   private String[] T01BC21_A396EmprCod ;
   private int[] T01BC21_A11270Pot_num ;
   private short[] T01BC21_A11271Pot_lin ;
   private int[] T01BC3_A11270Pot_num ;
   private short[] T01BC3_A11271Pot_lin ;
   private java.math.BigDecimal[] T01BC3_A11266Pot_cant ;
   private boolean[] T01BC3_n11266Pot_cant ;
   private java.math.BigDecimal[] T01BC3_A11267Pot_cantP ;
   private boolean[] T01BC3_n11267Pot_cantP ;
   private String[] T01BC3_A11268Pot_und ;
   private boolean[] T01BC3_n11268Pot_und ;
   private java.math.BigDecimal[] T01BC3_A11269Pot_pre ;
   private boolean[] T01BC3_n11269Pot_pre ;
   private String[] T01BC3_A396EmprCod ;
   private String[] T01BC3_A719PrdNum ;
   private boolean[] T01BC3_n719PrdNum ;
   private int[] T01BC2_A11270Pot_num ;
   private short[] T01BC2_A11271Pot_lin ;
   private java.math.BigDecimal[] T01BC2_A11266Pot_cant ;
   private boolean[] T01BC2_n11266Pot_cant ;
   private java.math.BigDecimal[] T01BC2_A11267Pot_cantP ;
   private boolean[] T01BC2_n11267Pot_cantP ;
   private String[] T01BC2_A11268Pot_und ;
   private boolean[] T01BC2_n11268Pot_und ;
   private java.math.BigDecimal[] T01BC2_A11269Pot_pre ;
   private boolean[] T01BC2_n11269Pot_pre ;
   private String[] T01BC2_A396EmprCod ;
   private String[] T01BC2_A719PrdNum ;
   private boolean[] T01BC2_n719PrdNum ;
   private String[] T01BC25_A396EmprCod ;
   private int[] T01BC25_A11270Pot_num ;
   private short[] T01BC25_A11271Pot_lin ;
   private String[] T01BC26_A407EmprNom ;
   private boolean[] T01BC26_n407EmprNom ;
   private String[] T01BC27_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trecpot__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecpot__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecpot__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecpot__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecpot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BC2", "SELECT Pot_num, Pot_lin, Pot_cant, Pot_cantP, Pot_und, Pot_pre, EmprCod, PrdNum FROM TXPRECPO1 WHERE EmprCod = ? AND Pot_num = ? AND Pot_lin = ?  FOR UPDATE OF Pot_cant, Pot_cantP, Pot_und, Pot_pre, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC3", "SELECT Pot_num, Pot_lin, Pot_cant, Pot_cantP, Pot_und, Pot_pre, EmprCod, PrdNum FROM TXPRECPO1 WHERE EmprCod = ? AND Pot_num = ? AND Pot_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC4", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC5", "SELECT Pot_num, Pot_dia, Pot_hor, Pot_usu, Pot_term, Pot_usuP, Pot_diaP, Pot_horP, Pot_Vol, Pot_est, EmprCod, ProForCod FROM TXPRECPOT WHERE EmprCod = ? AND Pot_num = ?  FOR UPDATE OF Pot_dia, Pot_hor, Pot_usu, Pot_term, Pot_usuP, Pot_diaP, Pot_horP, Pot_Vol, Pot_est, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC6", "SELECT Pot_num, Pot_dia, Pot_hor, Pot_usu, Pot_term, Pot_usuP, Pot_diaP, Pot_horP, Pot_Vol, Pot_est, EmprCod, ProForCod FROM TXPRECPOT WHERE EmprCod = ? AND Pot_num = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC8", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC9", "SELECT /*+ FIRST_ROWS(100) */ TM1.Pot_num, T2.EmprNom, TM1.Pot_dia, TM1.Pot_hor, TM1.Pot_usu, TM1.Pot_term, T3.ProForDsc, TM1.Pot_usuP, TM1.Pot_diaP, TM1.Pot_horP, TM1.Pot_Vol, TM1.Pot_est, TM1.EmprCod, TM1.ProForCod FROM ((TXPRECPOT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCPROFO T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProForCod = TM1.ProForCod) WHERE TM1.EmprCod = ? and TM1.Pot_num = ? ORDER BY TM1.EmprCod, TM1.Pot_num ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC10", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pot_num FROM TXPRECPOT WHERE EmprCod = ? AND Pot_num = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pot_num FROM TXPRECPOT WHERE ( Pot_num > ?) and EmprCod = ? ORDER BY EmprCod, Pot_num) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BC13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pot_num FROM TXPRECPOT WHERE ( Pot_num < ?) and EmprCod = ? ORDER BY EmprCod DESC, Pot_num DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BC14", "INSERT INTO TXPRECPOT(Pot_num, Pot_dia, Pot_hor, Pot_usu, Pot_term, Pot_usuP, Pot_diaP, Pot_horP, Pot_Vol, Pot_est, EmprCod, ProForCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRECPOT")
         ,new UpdateCursor("T01BC15", "UPDATE TXPRECPOT SET Pot_dia=?, Pot_hor=?, Pot_usu=?, Pot_term=?, Pot_usuP=?, Pot_diaP=?, Pot_horP=?, Pot_Vol=?, Pot_est=?, ProForCod=?  WHERE EmprCod = ? AND Pot_num = ?", GX_NOMASK, "TXPRECPOT")
         ,new UpdateCursor("T01BC16", "DELETE FROM TXPRECPOT  WHERE EmprCod = ? AND Pot_num = ?", GX_NOMASK, "TXPRECPOT")
         ,new ForEachCursor("T01BC17", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Pot_num FROM TXPRECPOT WHERE EmprCod = ? ORDER BY EmprCod, Pot_num ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC19", "SELECT Pot_num, Pot_lin, Pot_cant, Pot_cantP, Pot_und, Pot_pre, EmprCod, PrdNum FROM TXPRECPO1 WHERE EmprCod = ? and Pot_num = ? and Pot_lin = ? ORDER BY EmprCod, Pot_num, Pot_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC20", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC21", "SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND Pot_num = ? AND Pot_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BC22", "INSERT INTO TXPRECPO1(Pot_num, Pot_lin, Pot_cant, Pot_cantP, Pot_und, Pot_pre, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRECPO1")
         ,new UpdateCursor("T01BC23", "UPDATE TXPRECPO1 SET Pot_cant=?, Pot_cantP=?, Pot_und=?, Pot_pre=?, PrdNum=?  WHERE EmprCod = ? AND Pot_num = ? AND Pot_lin = ?", GX_NOMASK, "TXPRECPO1")
         ,new UpdateCursor("T01BC24", "DELETE FROM TXPRECPO1  WHERE EmprCod = ? AND Pot_num = ? AND Pot_lin = ?", GX_NOMASK, "TXPRECPO1")
         ,new ForEachCursor("T01BC25", "SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? and Pot_num = ? ORDER BY EmprCod, Pot_num, Pot_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BC27", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((String[]) buf[20])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               ((String[]) buf[20])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               ((String[]) buf[23])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
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
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[14], false);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               stmt.setString(11, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 6);
               }
               return;
            case 13 :
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 6);
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setInt(12, ((Number) parms[21]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 5);
               }
               stmt.setString(7, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 6);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

