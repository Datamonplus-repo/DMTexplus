package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr0300_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A652OpeCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ACTIVIDADES HISTORICO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOpeCod_Internalname ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public ttr0300_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr0300_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr0300_impl.class ));
   }

   public ttr0300_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR0300.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Dia", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAct_dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAct_dia_Internalname, localUtil.format(A10278Act_dia, "99/99/99"), localUtil.format( A10278Act_dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAct_dia_Jsonclick, 0, "", "", "", "", "", 1, edtAct_dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0300.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAct_dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAct_dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTR0300.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol45( ) ;
      nGXsfl_45_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1396 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1396 = (short)(1) ;
            scanStart17R1396( ) ;
            while ( RcdFound1396 != 0 )
            {
               init_level_properties1396( ) ;
               getByPrimaryKey17R1396( ) ;
               addRow17R1396( ) ;
               scanNext17R1396( ) ;
            }
            scanEnd17R1396( ) ;
            nBlankRcdCount1396 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal17R1396( ) ;
         standaloneModal17R1396( ) ;
         sMode1396 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow17R1396( ) ;
            edtavnRcdDeleted_1396_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1396_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1396_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1396_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_Maq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_MAQ_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_Maq_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_hhpp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HHPP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_hhpp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhpp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_hhppI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HHPPI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_hhppI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhppI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_hhpr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HHPR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_hhpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhpr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_hhprI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HHPRI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_hhprI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhprI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_hmmt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HMMT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_hmmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hmmt_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_hmmr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HMMR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_hmmr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hmmr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_vig_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_VIG_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_vig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_vig_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtAct_mod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_MOD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAct_mod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_mod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1396 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal17R1396( ) ;
            }
            sendRow17R1396( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1396 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1396 = (short)(5) ;
         nRcdExists_1396 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart17R1396( ) ;
            while ( RcdFound1396 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451396( ) ;
               init_level_properties1396( ) ;
               standaloneNotModal17R1396( ) ;
               getByPrimaryKey17R1396( ) ;
               standaloneModal17R1396( ) ;
               addRow17R1396( ) ;
               scanNext17R1396( ) ;
            }
            scanEnd17R1396( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1396 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451396( ) ;
      initAll17R1396( ) ;
      init_level_properties1396( ) ;
      nRcdExists_1396 = (short)(0) ;
      nIsMod_1396 = (short)(0) ;
      nRcdDeleted_1396 = (short)(0) ;
      nBlankRcdCount1396 = (short)(nBlankRcdUsr1396+nBlankRcdCount1396) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1396 > 0 )
      {
         standaloneNotModal17R1396( ) ;
         standaloneModal17R1396( ) ;
         addRow17R1396( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAct_hhppI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1396 = (short)(nBlankRcdCount1396-1) ;
      }
      Gx_mode = sMode1396 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0300.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR0300.htm");
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
      e1117R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10278Act_dia = localUtil.ctod( httpContext.cgiGet( "Z10278Act_dia"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A652OpeCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            }
            else
            {
               A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            }
            A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
            n653OpeNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
            if ( localUtil.vcdate( httpContext.cgiGet( edtAct_dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ACT_DIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAct_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10278Act_dia = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
            }
            else
            {
               A10278Act_dia = localUtil.ctod( httpContext.cgiGet( edtAct_dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
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
               A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
               A10278Act_dia = localUtil.parseDateParm( httpContext.GetPar( "Act_dia")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
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
                        e1117R2 ();
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
            initAll17R1395( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1396_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1396_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes17R1395( ) ;
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

   public void confirm_17R0( )
   {
      beforeValidate17R1395( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17R1395( ) ;
         }
         else
         {
            checkExtendedTable17R1395( ) ;
            if ( AnyError == 0 )
            {
               zm17R1395( 13) ;
               zm17R1395( 14) ;
            }
            closeExtendedTableCursors17R1395( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1395 = Gx_mode ;
         confirm_17R1396( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1395 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1395 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues17R0( ) ;
      }
   }

   public void confirm_17R1396( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow17R1396( ) ;
         if ( ( nRcdExists_1396 != 0 ) || ( nIsMod_1396 != 0 ) )
         {
            getKey17R1396( ) ;
            if ( ( nRcdExists_1396 == 0 ) && ( nRcdDeleted_1396 == 0 ) )
            {
               if ( RcdFound1396 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate17R1396( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable17R1396( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors17R1396( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "OPECOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1396 != 0 )
               {
                  if ( nRcdDeleted_1396 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey17R1396( ) ;
                     load17R1396( ) ;
                     beforeValidate17R1396( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls17R1396( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1396 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate17R1396( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable17R1396( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors17R1396( ) ;
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
                  if ( nRcdDeleted_1396 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "OPECOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1396_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_Maq_Internalname, GXutil.rtrim( A10279Act_Maq)) ;
         httpContext.changePostValue( edtAct_hhpp_Internalname, GXutil.ltrim( localUtil.ntoc( A10280Act_hhpp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hhppI_Internalname, GXutil.ltrim( localUtil.ntoc( A10281Act_hhppI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hhpr_Internalname, GXutil.ltrim( localUtil.ntoc( A10282Act_hhpr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hhprI_Internalname, GXutil.ltrim( localUtil.ntoc( A10283Act_hhprI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hmmt_Internalname, GXutil.ltrim( localUtil.ntoc( A10284Act_hmmt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hmmr_Internalname, GXutil.ltrim( localUtil.ntoc( A10285Act_hmmr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_vig_Internalname, GXutil.ltrim( localUtil.ntoc( A10286Act_vig, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_mod_Internalname, GXutil.ltrim( localUtil.ntoc( A10287Act_mod, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10279Act_Maq_"+sGXsfl_45_idx, GXutil.rtrim( Z10279Act_Maq)) ;
         httpContext.changePostValue( "ZT_"+"Z10286Act_vig_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10286Act_vig, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10287Act_mod_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10287Act_mod, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10280Act_hhpp_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10280Act_hhpp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10281Act_hhppI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10281Act_hhppI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10282Act_hhpr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10282Act_hhpr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10283Act_hhprI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10283Act_hhprI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10284Act_hmmt_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10284Act_hmmt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10285Act_hmmr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10285Act_hmmr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1396_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1396_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1396_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1396 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1396_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1396_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_MAQ_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_Maq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HHPP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhpp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HHPPI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhppI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HHPR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhpr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HHPRI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhprI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HMMT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hmmt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HMMR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hmmr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_VIG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_vig_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_MOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_mod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption17R0( )
   {
   }

   public void e1117R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr0300_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttr0300_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr0300_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttr0300_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr0300_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr0300_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17R1395( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -12 )
      {
         Z10278Act_dia = A10278Act_dia ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z407EmprNom = A407EmprNom ;
         Z653OpeNom = A653OpeNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTR0300" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T017R6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017R6_A407EmprNom[0] ;
      n407EmprNom = T017R6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load17R1395( )
   {
      /* Using cursor T017R8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1395 = (short)(1) ;
         A407EmprNom = T017R8_A407EmprNom[0] ;
         n407EmprNom = T017R8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A653OpeNom = T017R8_A653OpeNom[0] ;
         n653OpeNom = T017R8_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         zm17R1395( -12) ;
      }
      pr_default.close(6);
      onLoadActions17R1395( ) ;
   }

   public void onLoadActions17R1395( )
   {
   }

   public void checkExtendedTable17R1395( )
   {
      nIsDirty_1395 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T017R7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T017R7_A653OpeNom[0] ;
      n653OpeNom = T017R7_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors17R1395( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A396EmprCod ,
                          int A652OpeCod )
   {
      /* Using cursor T017R9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T017R9_A653OpeNom[0] ;
      n653OpeNom = T017R9_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey17R1395( )
   {
      /* Using cursor T017R10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1395 = (short)(1) ;
      }
      else
      {
         RcdFound1395 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017R5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T017R5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17R1395( 12) ;
         RcdFound1395 = (short)(1) ;
         A10278Act_dia = T017R5_A10278Act_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
         A652OpeCod = T017R5_A652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z10278Act_dia = A10278Act_dia ;
         sMode1395 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17R1395( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1395 = (short)(0) ;
            initializeNonKey17R1395( ) ;
         }
         Gx_mode = sMode1395 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1395 = (short)(0) ;
         initializeNonKey17R1395( ) ;
         sMode1395 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1395 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey17R1395( ) ;
      if ( RcdFound1395 == 0 )
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
      RcdFound1395 = (short)(0) ;
      /* Using cursor T017R11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A652OpeCod), Integer.valueOf(A652OpeCod), A10278Act_dia, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T017R11_A652OpeCod[0] < A652OpeCod ) || ( T017R11_A652OpeCod[0] == A652OpeCod ) && GXutil.resetTime(T017R11_A10278Act_dia[0]).before( GXutil.resetTime( A10278Act_dia )) ) && ( GXutil.strcmp(T017R11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T017R11_A652OpeCod[0] > A652OpeCod ) || ( T017R11_A652OpeCod[0] == A652OpeCod ) && GXutil.resetTime(T017R11_A10278Act_dia[0]).after( GXutil.resetTime( A10278Act_dia )) ) && ( GXutil.strcmp(T017R11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A652OpeCod = T017R11_A652OpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            A10278Act_dia = T017R11_A10278Act_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
            RcdFound1395 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1395 = (short)(0) ;
      /* Using cursor T017R12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A652OpeCod), Integer.valueOf(A652OpeCod), A10278Act_dia, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T017R12_A652OpeCod[0] > A652OpeCod ) || ( T017R12_A652OpeCod[0] == A652OpeCod ) && GXutil.resetTime(T017R12_A10278Act_dia[0]).after( GXutil.resetTime( A10278Act_dia )) ) && ( GXutil.strcmp(T017R12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T017R12_A652OpeCod[0] < A652OpeCod ) || ( T017R12_A652OpeCod[0] == A652OpeCod ) && GXutil.resetTime(T017R12_A10278Act_dia[0]).before( GXutil.resetTime( A10278Act_dia )) ) && ( GXutil.strcmp(T017R12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A652OpeCod = T017R12_A652OpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            A10278Act_dia = T017R12_A10278Act_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
            RcdFound1395 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17R1395( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17R1395( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1395 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A652OpeCod != Z652OpeCod ) || !( GXutil.dateCompare(GXutil.resetTime(A10278Act_dia), GXutil.resetTime(Z10278Act_dia)) ) )
            {
               A652OpeCod = Z652OpeCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
               A10278Act_dia = Z10278Act_dia ;
               httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17R1395( ) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A652OpeCod != Z652OpeCod ) || !( GXutil.dateCompare(GXutil.resetTime(A10278Act_dia), GXutil.resetTime(Z10278Act_dia)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17R1395( ) ;
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
                  GX_FocusControl = edtOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17R1395( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A652OpeCod != Z652OpeCod ) || !( GXutil.dateCompare(GXutil.resetTime(A10278Act_dia), GXutil.resetTime(Z10278Act_dia)) ) )
      {
         A652OpeCod = Z652OpeCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         A10278Act_dia = Z10278Act_dia ;
         httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOpeCod_Internalname ;
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
      getKey17R1395( ) ;
      if ( RcdFound1395 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A652OpeCod != Z652OpeCod ) || !( GXutil.dateCompare(GXutil.resetTime(A10278Act_dia), GXutil.resetTime(Z10278Act_dia)) ) )
         {
            A652OpeCod = Z652OpeCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            A10278Act_dia = Z10278Act_dia ;
            httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A652OpeCod != Z652OpeCod ) || !( GXutil.dateCompare(GXutil.resetTime(A10278Act_dia), GXutil.resetTime(Z10278Act_dia)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0300");
   }

   public void insert_check( )
   {
      confirm_17R0( ) ;
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
      if ( RcdFound1395 == 0 )
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
      scanStart17R1395( ) ;
      if ( RcdFound1395 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17R1395( ) ;
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
      if ( RcdFound1395 == 0 )
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
      if ( RcdFound1395 == 0 )
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
      scanStart17R1395( ) ;
      if ( RcdFound1395 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1395 != 0 )
         {
            scanNext17R1395( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17R1395( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17R1395( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017R4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0300"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0300"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17R1395( )
   {
      beforeValidate17R1395( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17R1395( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17R1395( 0) ;
         checkOptimisticConcurrency17R1395( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17R1395( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17R1395( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017R13 */
                  pr_default.execute(11, new Object[] {A10278Act_dia, A396EmprCod, Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0300");
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
                        processLevel17R1395( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption17R0( ) ;
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
            load17R1395( ) ;
         }
         endLevel17R1395( ) ;
      }
      closeExtendedTableCursors17R1395( ) ;
   }

   public void update17R1395( )
   {
      beforeValidate17R1395( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17R1395( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17R1395( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17R1395( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17R1395( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPTR0300 */
                  deferredUpdate17R1395( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel17R1395( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption17R0( ) ;
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
         endLevel17R1395( ) ;
      }
      closeExtendedTableCursors17R1395( ) ;
   }

   public void deferredUpdate17R1395( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17R1395( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17R1395( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17R1395( ) ;
         afterConfirm17R1395( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17R1395( ) ;
            if ( AnyError == 0 )
            {
               scanStart17R1396( ) ;
               while ( RcdFound1396 != 0 )
               {
                  getByPrimaryKey17R1396( ) ;
                  delete17R1396( ) ;
                  scanNext17R1396( ) ;
               }
               scanEnd17R1396( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017R14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0300");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1395 == 0 )
                        {
                           initAll17R1395( ) ;
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
                        resetCaption17R0( ) ;
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
      sMode1395 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17R1395( ) ;
      Gx_mode = sMode1395 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17R1395( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T017R15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
         A653OpeNom = T017R15_A653OpeNom[0] ;
         n653OpeNom = T017R15_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(13);
      }
   }

   public void processNestedLevel17R1396( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow17R1396( ) ;
         if ( ( nRcdExists_1396 != 0 ) || ( nIsMod_1396 != 0 ) )
         {
            standaloneNotModal17R1396( ) ;
            getKey17R1396( ) ;
            if ( ( nRcdExists_1396 == 0 ) && ( nRcdDeleted_1396 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert17R1396( ) ;
            }
            else
            {
               if ( RcdFound1396 != 0 )
               {
                  if ( ( nRcdDeleted_1396 != 0 ) && ( nRcdExists_1396 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete17R1396( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1396 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update17R1396( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1396 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "OPECOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1396_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_Maq_Internalname, GXutil.rtrim( A10279Act_Maq)) ;
         httpContext.changePostValue( edtAct_hhpp_Internalname, GXutil.ltrim( localUtil.ntoc( A10280Act_hhpp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hhppI_Internalname, GXutil.ltrim( localUtil.ntoc( A10281Act_hhppI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hhpr_Internalname, GXutil.ltrim( localUtil.ntoc( A10282Act_hhpr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hhprI_Internalname, GXutil.ltrim( localUtil.ntoc( A10283Act_hhprI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hmmt_Internalname, GXutil.ltrim( localUtil.ntoc( A10284Act_hmmt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_hmmr_Internalname, GXutil.ltrim( localUtil.ntoc( A10285Act_hmmr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_vig_Internalname, GXutil.ltrim( localUtil.ntoc( A10286Act_vig, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAct_mod_Internalname, GXutil.ltrim( localUtil.ntoc( A10287Act_mod, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10279Act_Maq_"+sGXsfl_45_idx, GXutil.rtrim( Z10279Act_Maq)) ;
         httpContext.changePostValue( "ZT_"+"Z10286Act_vig_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10286Act_vig, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10287Act_mod_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10287Act_mod, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10280Act_hhpp_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10280Act_hhpp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10281Act_hhppI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10281Act_hhppI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10282Act_hhpr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10282Act_hhpr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10283Act_hhprI_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10283Act_hhprI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10284Act_hmmt_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10284Act_hmmt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10285Act_hmmr_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10285Act_hmmr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1396_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1396_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1396_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1396 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1396_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1396_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_MAQ_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_Maq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HHPP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhpp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HHPPI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhppI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HHPR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhpr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HHPRI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhprI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HMMT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hmmt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_HMMR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hmmr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_VIG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_vig_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ACT_MOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_mod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll17R1396( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1396 = (short)(0) ;
      nIsMod_1396 = (short)(0) ;
      nRcdDeleted_1396 = (short)(0) ;
   }

   public void processLevel17R1395( )
   {
      /* Save parent mode. */
      sMode1395 = Gx_mode ;
      processNestedLevel17R1396( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1395 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel17R1395( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17R1395( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr0300");
         if ( AnyError == 0 )
         {
            confirmValues17R0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0300");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17R1395( )
   {
      /* Scan By routine */
      /* Using cursor T017R16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1395 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1395 = (short)(1) ;
         A652OpeCod = T017R16_A652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         A10278Act_dia = T017R16_A10278Act_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17R1395( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1395 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1395 = (short)(1) ;
         A652OpeCod = T017R16_A652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         A10278Act_dia = T017R16_A10278Act_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
      }
   }

   public void scanEnd17R1395( )
   {
      pr_default.close(14);
   }

   public void afterConfirm17R1395( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17R1395( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17R1395( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17R1395( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17R1395( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17R1395( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17R1395( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtAct_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_dia_Enabled), 5, 0), true);
   }

   public void zm17R1396( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10286Act_vig = T017R3_A10286Act_vig[0] ;
            Z10287Act_mod = T017R3_A10287Act_mod[0] ;
            Z10280Act_hhpp = T017R3_A10280Act_hhpp[0] ;
            Z10281Act_hhppI = T017R3_A10281Act_hhppI[0] ;
            Z10282Act_hhpr = T017R3_A10282Act_hhpr[0] ;
            Z10283Act_hhprI = T017R3_A10283Act_hhprI[0] ;
            Z10284Act_hmmt = T017R3_A10284Act_hmmt[0] ;
            Z10285Act_hmmr = T017R3_A10285Act_hmmr[0] ;
         }
         else
         {
            Z10286Act_vig = A10286Act_vig ;
            Z10287Act_mod = A10287Act_mod ;
            Z10280Act_hhpp = A10280Act_hhpp ;
            Z10281Act_hhppI = A10281Act_hhppI ;
            Z10282Act_hhpr = A10282Act_hhpr ;
            Z10283Act_hhprI = A10283Act_hhprI ;
            Z10284Act_hmmt = A10284Act_hmmt ;
            Z10285Act_hmmr = A10285Act_hmmr ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z10278Act_dia = A10278Act_dia ;
         Z10279Act_Maq = A10279Act_Maq ;
         Z10286Act_vig = A10286Act_vig ;
         Z10287Act_mod = A10287Act_mod ;
         Z10280Act_hhpp = A10280Act_hhpp ;
         Z10281Act_hhppI = A10281Act_hhppI ;
         Z10282Act_hhpr = A10282Act_hhpr ;
         Z10283Act_hhprI = A10283Act_hhprI ;
         Z10284Act_hmmt = A10284Act_hmmt ;
         Z10285Act_hmmr = A10285Act_hmmr ;
      }
   }

   public void standaloneNotModal17R1396( )
   {
      edtAct_mod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_mod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_mod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_vig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_vig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_vig_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_Maq_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hhpp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hhpp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhpp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hhpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hhpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhpr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hmmr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hmmr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hmmr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hmmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hmmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hmmt_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void standaloneModal17R1396( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A10282Act_hhpr.doubleValue() > 0 )
      {
         A10286Act_vig = (A10280Act_hhpp.divide(A10282Act_hhpr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         n10286Act_vig = false ;
      }
   }

   public void load17R1396( )
   {
      /* Using cursor T017R17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1396 = (short)(1) ;
         A10286Act_vig = T017R17_A10286Act_vig[0] ;
         n10286Act_vig = T017R17_n10286Act_vig[0] ;
         A10287Act_mod = T017R17_A10287Act_mod[0] ;
         n10287Act_mod = T017R17_n10287Act_mod[0] ;
         A10280Act_hhpp = T017R17_A10280Act_hhpp[0] ;
         n10280Act_hhpp = T017R17_n10280Act_hhpp[0] ;
         A10281Act_hhppI = T017R17_A10281Act_hhppI[0] ;
         n10281Act_hhppI = T017R17_n10281Act_hhppI[0] ;
         A10282Act_hhpr = T017R17_A10282Act_hhpr[0] ;
         n10282Act_hhpr = T017R17_n10282Act_hhpr[0] ;
         A10283Act_hhprI = T017R17_A10283Act_hhprI[0] ;
         n10283Act_hhprI = T017R17_n10283Act_hhprI[0] ;
         A10284Act_hmmt = T017R17_A10284Act_hmmt[0] ;
         n10284Act_hmmt = T017R17_n10284Act_hmmt[0] ;
         A10285Act_hmmr = T017R17_A10285Act_hmmr[0] ;
         n10285Act_hmmr = T017R17_n10285Act_hmmr[0] ;
         zm17R1396( -15) ;
      }
      pr_default.close(15);
      onLoadActions17R1396( ) ;
   }

   public void onLoadActions17R1396( )
   {
      if ( A10282Act_hhpr.doubleValue() > 0 )
      {
         A10287Act_mod = ((A10280Act_hhpp.add(A10281Act_hhppI)).divide((A10282Act_hhpr.add(A10283Act_hhprI)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         n10287Act_mod = false ;
      }
   }

   public void checkExtendedTable17R1396( )
   {
      nIsDirty_1396 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal17R1396( ) ;
      if ( A10282Act_hhpr.doubleValue() > 0 )
      {
         nIsDirty_1396 = (short)(1) ;
         A10287Act_mod = ((A10280Act_hhpp.add(A10281Act_hhppI)).divide((A10282Act_hhpr.add(A10283Act_hhprI)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         n10287Act_mod = false ;
      }
   }

   public void closeExtendedTableCursors17R1396( )
   {
   }

   public void enableDisable17R1396( )
   {
   }

   public void getKey17R1396( )
   {
      /* Using cursor T017R18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1396 = (short)(1) ;
      }
      else
      {
         RcdFound1396 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey17R1396( )
   {
      /* Using cursor T017R3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017R3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17R1396( 15) ;
         RcdFound1396 = (short)(1) ;
         initializeNonKey17R1396( ) ;
         A10279Act_Maq = T017R3_A10279Act_Maq[0] ;
         A10286Act_vig = T017R3_A10286Act_vig[0] ;
         n10286Act_vig = T017R3_n10286Act_vig[0] ;
         A10287Act_mod = T017R3_A10287Act_mod[0] ;
         n10287Act_mod = T017R3_n10287Act_mod[0] ;
         A10280Act_hhpp = T017R3_A10280Act_hhpp[0] ;
         n10280Act_hhpp = T017R3_n10280Act_hhpp[0] ;
         A10281Act_hhppI = T017R3_A10281Act_hhppI[0] ;
         n10281Act_hhppI = T017R3_n10281Act_hhppI[0] ;
         A10282Act_hhpr = T017R3_A10282Act_hhpr[0] ;
         n10282Act_hhpr = T017R3_n10282Act_hhpr[0] ;
         A10283Act_hhprI = T017R3_A10283Act_hhprI[0] ;
         n10283Act_hhprI = T017R3_n10283Act_hhprI[0] ;
         A10284Act_hmmt = T017R3_A10284Act_hmmt[0] ;
         n10284Act_hmmt = T017R3_n10284Act_hmmt[0] ;
         A10285Act_hmmr = T017R3_A10285Act_hmmr[0] ;
         n10285Act_hmmr = T017R3_n10285Act_hmmr[0] ;
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         Z10278Act_dia = A10278Act_dia ;
         Z10279Act_Maq = A10279Act_Maq ;
         sMode1396 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17R1396( ) ;
         load17R1396( ) ;
         Gx_mode = sMode1396 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1396 = (short)(0) ;
         initializeNonKey17R1396( ) ;
         sMode1396 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17R1396( ) ;
         Gx_mode = sMode1396 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes17R1396( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency17R1396( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0301"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10286Act_vig, T017R2_A10286Act_vig[0]) != 0 ) || ( DecimalUtil.compareTo(Z10287Act_mod, T017R2_A10287Act_mod[0]) != 0 ) || ( DecimalUtil.compareTo(Z10280Act_hhpp, T017R2_A10280Act_hhpp[0]) != 0 ) || ( DecimalUtil.compareTo(Z10281Act_hhppI, T017R2_A10281Act_hhppI[0]) != 0 ) || ( DecimalUtil.compareTo(Z10282Act_hhpr, T017R2_A10282Act_hhpr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10283Act_hhprI, T017R2_A10283Act_hhprI[0]) != 0 ) || ( DecimalUtil.compareTo(Z10284Act_hmmt, T017R2_A10284Act_hmmt[0]) != 0 ) || ( DecimalUtil.compareTo(Z10285Act_hmmr, T017R2_A10285Act_hmmr[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10286Act_vig, T017R2_A10286Act_vig[0]) != 0 )
            {
               GXutil.writeLogln("ttr0300:[seudo value changed for attri]"+"Act_vig");
               GXutil.writeLogRaw("Old: ",Z10286Act_vig);
               GXutil.writeLogRaw("Current: ",T017R2_A10286Act_vig[0]);
            }
            if ( DecimalUtil.compareTo(Z10287Act_mod, T017R2_A10287Act_mod[0]) != 0 )
            {
               GXutil.writeLogln("ttr0300:[seudo value changed for attri]"+"Act_mod");
               GXutil.writeLogRaw("Old: ",Z10287Act_mod);
               GXutil.writeLogRaw("Current: ",T017R2_A10287Act_mod[0]);
            }
            if ( DecimalUtil.compareTo(Z10280Act_hhpp, T017R2_A10280Act_hhpp[0]) != 0 )
            {
               GXutil.writeLogln("ttr0300:[seudo value changed for attri]"+"Act_hhpp");
               GXutil.writeLogRaw("Old: ",Z10280Act_hhpp);
               GXutil.writeLogRaw("Current: ",T017R2_A10280Act_hhpp[0]);
            }
            if ( DecimalUtil.compareTo(Z10281Act_hhppI, T017R2_A10281Act_hhppI[0]) != 0 )
            {
               GXutil.writeLogln("ttr0300:[seudo value changed for attri]"+"Act_hhppI");
               GXutil.writeLogRaw("Old: ",Z10281Act_hhppI);
               GXutil.writeLogRaw("Current: ",T017R2_A10281Act_hhppI[0]);
            }
            if ( DecimalUtil.compareTo(Z10282Act_hhpr, T017R2_A10282Act_hhpr[0]) != 0 )
            {
               GXutil.writeLogln("ttr0300:[seudo value changed for attri]"+"Act_hhpr");
               GXutil.writeLogRaw("Old: ",Z10282Act_hhpr);
               GXutil.writeLogRaw("Current: ",T017R2_A10282Act_hhpr[0]);
            }
            if ( DecimalUtil.compareTo(Z10283Act_hhprI, T017R2_A10283Act_hhprI[0]) != 0 )
            {
               GXutil.writeLogln("ttr0300:[seudo value changed for attri]"+"Act_hhprI");
               GXutil.writeLogRaw("Old: ",Z10283Act_hhprI);
               GXutil.writeLogRaw("Current: ",T017R2_A10283Act_hhprI[0]);
            }
            if ( DecimalUtil.compareTo(Z10284Act_hmmt, T017R2_A10284Act_hmmt[0]) != 0 )
            {
               GXutil.writeLogln("ttr0300:[seudo value changed for attri]"+"Act_hmmt");
               GXutil.writeLogRaw("Old: ",Z10284Act_hmmt);
               GXutil.writeLogRaw("Current: ",T017R2_A10284Act_hmmt[0]);
            }
            if ( DecimalUtil.compareTo(Z10285Act_hmmr, T017R2_A10285Act_hmmr[0]) != 0 )
            {
               GXutil.writeLogln("ttr0300:[seudo value changed for attri]"+"Act_hmmr");
               GXutil.writeLogRaw("Old: ",Z10285Act_hmmr);
               GXutil.writeLogRaw("Current: ",T017R2_A10285Act_hmmr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0301"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17R1396( )
   {
      beforeValidate17R1396( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17R1396( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17R1396( 0) ;
         checkOptimisticConcurrency17R1396( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17R1396( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17R1396( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017R19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq, Boolean.valueOf(n10286Act_vig), A10286Act_vig, Boolean.valueOf(n10287Act_mod), A10287Act_mod, Boolean.valueOf(n10280Act_hhpp), A10280Act_hhpp, Boolean.valueOf(n10281Act_hhppI), A10281Act_hhppI, Boolean.valueOf(n10282Act_hhpr), A10282Act_hhpr, Boolean.valueOf(n10283Act_hhprI), A10283Act_hhprI, Boolean.valueOf(n10284Act_hmmt), A10284Act_hmmt, Boolean.valueOf(n10285Act_hmmr), A10285Act_hmmr});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0301");
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
            load17R1396( ) ;
         }
         endLevel17R1396( ) ;
      }
      closeExtendedTableCursors17R1396( ) ;
   }

   public void update17R1396( )
   {
      beforeValidate17R1396( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17R1396( ) ;
      }
      if ( ( nIsMod_1396 != 0 ) || ( nIsDirty_1396 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency17R1396( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm17R1396( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate17R1396( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017R20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n10286Act_vig), A10286Act_vig, Boolean.valueOf(n10287Act_mod), A10287Act_mod, Boolean.valueOf(n10280Act_hhpp), A10280Act_hhpp, Boolean.valueOf(n10281Act_hhppI), A10281Act_hhppI, Boolean.valueOf(n10282Act_hhpr), A10282Act_hhpr, Boolean.valueOf(n10283Act_hhprI), A10283Act_hhprI, Boolean.valueOf(n10284Act_hmmt), A10284Act_hmmt, Boolean.valueOf(n10285Act_hmmr), A10285Act_hmmr, A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0301");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0301"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate17R1396( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey17R1396( ) ;
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
            endLevel17R1396( ) ;
         }
      }
      closeExtendedTableCursors17R1396( ) ;
   }

   public void deferredUpdate17R1396( )
   {
   }

   public void delete17R1396( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17R1396( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17R1396( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17R1396( ) ;
         afterConfirm17R1396( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17R1396( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017R21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia, A10279Act_Maq});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0301");
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
      sMode1396 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17R1396( ) ;
      Gx_mode = sMode1396 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17R1396( )
   {
      standaloneModal17R1396( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel17R1396( )
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

   public void scanStart17R1396( )
   {
      /* Scan By routine */
      /* Using cursor T017R22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod), A10278Act_dia});
      RcdFound1396 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1396 = (short)(1) ;
         A10279Act_Maq = T017R22_A10279Act_Maq[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17R1396( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1396 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1396 = (short)(1) ;
         A10279Act_Maq = T017R22_A10279Act_Maq[0] ;
      }
   }

   public void scanEnd17R1396( )
   {
      pr_default.close(20);
   }

   public void afterConfirm17R1396( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17R1396( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17R1396( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17R1396( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17R1396( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17R1396( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17R1396( )
   {
      edtAct_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_Maq_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hhpp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hhpp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhpp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hhppI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hhppI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhppI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hhpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hhpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhpr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hhprI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hhprI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhprI_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hmmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hmmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hmmt_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hmmr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hmmr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hmmr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_vig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_vig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_vig_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_mod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_mod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_mod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes17R1396( )
   {
   }

   public void send_integrity_lvl_hashes17R1395( )
   {
   }

   public void subsflControlProps_451396( )
   {
      edtavnRcdDeleted_1396_Internalname = "vNRCDDELETED_1396_"+sGXsfl_45_idx ;
      edtAct_Maq_Internalname = "ACT_MAQ_"+sGXsfl_45_idx ;
      edtAct_hhpp_Internalname = "ACT_HHPP_"+sGXsfl_45_idx ;
      edtAct_hhppI_Internalname = "ACT_HHPPI_"+sGXsfl_45_idx ;
      edtAct_hhpr_Internalname = "ACT_HHPR_"+sGXsfl_45_idx ;
      edtAct_hhprI_Internalname = "ACT_HHPRI_"+sGXsfl_45_idx ;
      edtAct_hmmt_Internalname = "ACT_HMMT_"+sGXsfl_45_idx ;
      edtAct_hmmr_Internalname = "ACT_HMMR_"+sGXsfl_45_idx ;
      edtAct_vig_Internalname = "ACT_VIG_"+sGXsfl_45_idx ;
      edtAct_mod_Internalname = "ACT_MOD_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451396( )
   {
      edtavnRcdDeleted_1396_Internalname = "vNRCDDELETED_1396_"+sGXsfl_45_fel_idx ;
      edtAct_Maq_Internalname = "ACT_MAQ_"+sGXsfl_45_fel_idx ;
      edtAct_hhpp_Internalname = "ACT_HHPP_"+sGXsfl_45_fel_idx ;
      edtAct_hhppI_Internalname = "ACT_HHPPI_"+sGXsfl_45_fel_idx ;
      edtAct_hhpr_Internalname = "ACT_HHPR_"+sGXsfl_45_fel_idx ;
      edtAct_hhprI_Internalname = "ACT_HHPRI_"+sGXsfl_45_fel_idx ;
      edtAct_hmmt_Internalname = "ACT_HMMT_"+sGXsfl_45_fel_idx ;
      edtAct_hmmr_Internalname = "ACT_HMMR_"+sGXsfl_45_fel_idx ;
      edtAct_vig_Internalname = "ACT_VIG_"+sGXsfl_45_fel_idx ;
      edtAct_mod_Internalname = "ACT_MOD_"+sGXsfl_45_fel_idx ;
   }

   public void addRow17R1396( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451396( ) ;
      sendRow17R1396( ) ;
   }

   public void sendRow17R1396( )
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
         if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1396_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1396_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1396_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1396), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1396), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1396_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1396_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_Maq_Internalname,GXutil.rtrim( A10279Act_Maq),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_Maq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_Maq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_hhpp_Internalname,GXutil.ltrim( localUtil.ntoc( A10280Act_hhpp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAct_hhpp_Enabled!=0) ? localUtil.format( A10280Act_hhpp, "ZZZZZ9.99") : localUtil.format( A10280Act_hhpp, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_hhpp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_hhpp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1396_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_hhppI_Internalname,GXutil.ltrim( localUtil.ntoc( A10281Act_hhppI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAct_hhppI_Enabled!=0) ? localUtil.format( A10281Act_hhppI, "ZZZZZ9.99") : localUtil.format( A10281Act_hhppI, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_hhppI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_hhppI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_hhpr_Internalname,GXutil.ltrim( localUtil.ntoc( A10282Act_hhpr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAct_hhpr_Enabled!=0) ? localUtil.format( A10282Act_hhpr, "ZZZZZ9.99") : localUtil.format( A10282Act_hhpr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_hhpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_hhpr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1396_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_hhprI_Internalname,GXutil.ltrim( localUtil.ntoc( A10283Act_hhprI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAct_hhprI_Enabled!=0) ? localUtil.format( A10283Act_hhprI, "ZZZZZ9.99") : localUtil.format( A10283Act_hhprI, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_hhprI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_hhprI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_hmmt_Internalname,GXutil.ltrim( localUtil.ntoc( A10284Act_hmmt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAct_hmmt_Enabled!=0) ? localUtil.format( A10284Act_hmmt, "ZZZZZ9.99") : localUtil.format( A10284Act_hmmt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_hmmt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_hmmt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_hmmr_Internalname,GXutil.ltrim( localUtil.ntoc( A10285Act_hmmr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAct_hmmr_Enabled!=0) ? localUtil.format( A10285Act_hmmr, "ZZZZZ9.99") : localUtil.format( A10285Act_hmmr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_hmmr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_hmmr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_vig_Internalname,GXutil.ltrim( localUtil.ntoc( A10286Act_vig, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAct_vig_Enabled!=0) ? localUtil.format( A10286Act_vig, "ZZZZ9.99") : localUtil.format( A10286Act_vig, "ZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_vig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_vig_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAct_mod_Internalname,GXutil.ltrim( localUtil.ntoc( A10287Act_mod, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAct_mod_Enabled!=0) ? localUtil.format( A10287Act_mod, "ZZZZ9.99") : localUtil.format( A10287Act_mod, "ZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAct_mod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAct_mod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes17R1396( ) ;
      GXCCtl = "Z10279Act_Maq_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10279Act_Maq));
      GXCCtl = "Z10286Act_vig_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10286Act_vig, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10287Act_mod_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10287Act_mod, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10280Act_hhpp_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10280Act_hhpp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10281Act_hhppI_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10281Act_hhppI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10282Act_hhpr_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10282Act_hhpr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10283Act_hhprI_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10283Act_hhprI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10284Act_hmmt_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10284Act_hmmt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10285Act_hmmr_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10285Act_hmmr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1396_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1396_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1396_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1396, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1396_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1396_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_MAQ_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_Maq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_HHPP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhpp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_HHPPI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhppI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_HHPR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhpr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_HHPRI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhprI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_HMMT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hmmt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_HMMR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hmmr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_VIG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_vig_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ACT_MOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_mod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow17R1396( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451396( ) ;
      edtavnRcdDeleted_1396_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1396_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_Maq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_MAQ_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_hhpp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HHPP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_hhppI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HHPPI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_hhpr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HHPR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_hhprI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HHPRI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_hmmt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HMMT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_hmmr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_HMMR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_vig_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_VIG_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAct_mod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ACT_MOD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1396_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1396_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1396");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1396_Internalname ;
         wbErr = true ;
         nRcdDeleted_1396 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1396 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1396_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10279Act_Maq = httpContext.cgiGet( edtAct_Maq_Internalname) ;
      A10280Act_hhpp = localUtil.ctond( httpContext.cgiGet( edtAct_hhpp_Internalname)) ;
      n10280Act_hhpp = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAct_hhppI_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAct_hhppI_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ACT_HHPPI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAct_hhppI_Internalname ;
         wbErr = true ;
         A10281Act_hhppI = DecimalUtil.ZERO ;
         n10281Act_hhppI = false ;
      }
      else
      {
         A10281Act_hhppI = localUtil.ctond( httpContext.cgiGet( edtAct_hhppI_Internalname)) ;
         n10281Act_hhppI = false ;
      }
      A10282Act_hhpr = localUtil.ctond( httpContext.cgiGet( edtAct_hhpr_Internalname)) ;
      n10282Act_hhpr = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAct_hhprI_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAct_hhprI_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ACT_HHPRI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAct_hhprI_Internalname ;
         wbErr = true ;
         A10283Act_hhprI = DecimalUtil.ZERO ;
         n10283Act_hhprI = false ;
      }
      else
      {
         A10283Act_hhprI = localUtil.ctond( httpContext.cgiGet( edtAct_hhprI_Internalname)) ;
         n10283Act_hhprI = false ;
      }
      A10284Act_hmmt = localUtil.ctond( httpContext.cgiGet( edtAct_hmmt_Internalname)) ;
      n10284Act_hmmt = false ;
      A10285Act_hmmr = localUtil.ctond( httpContext.cgiGet( edtAct_hmmr_Internalname)) ;
      n10285Act_hmmr = false ;
      A10286Act_vig = localUtil.ctond( httpContext.cgiGet( edtAct_vig_Internalname)) ;
      n10286Act_vig = false ;
      A10287Act_mod = localUtil.ctond( httpContext.cgiGet( edtAct_mod_Internalname)) ;
      n10287Act_mod = false ;
      GXCCtl = "Z10279Act_Maq_" + sGXsfl_45_idx ;
      Z10279Act_Maq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10286Act_vig_" + sGXsfl_45_idx ;
      Z10286Act_vig = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10287Act_mod_" + sGXsfl_45_idx ;
      Z10287Act_mod = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10280Act_hhpp_" + sGXsfl_45_idx ;
      Z10280Act_hhpp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10281Act_hhppI_" + sGXsfl_45_idx ;
      Z10281Act_hhppI = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10282Act_hhpr_" + sGXsfl_45_idx ;
      Z10282Act_hhpr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10283Act_hhprI_" + sGXsfl_45_idx ;
      Z10283Act_hhprI = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10284Act_hmmt_" + sGXsfl_45_idx ;
      Z10284Act_hmmt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10285Act_hmmr_" + sGXsfl_45_idx ;
      Z10285Act_hmmr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1396_" + sGXsfl_45_idx ;
      nRcdDeleted_1396 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1396_" + sGXsfl_45_idx ;
      nRcdExists_1396 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1396_" + sGXsfl_45_idx ;
      nIsMod_1396 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAct_mod_Enabled = edtAct_mod_Enabled ;
      defedtAct_vig_Enabled = edtAct_vig_Enabled ;
      defedtAct_hmmr_Enabled = edtAct_hmmr_Enabled ;
      defedtAct_hmmt_Enabled = edtAct_hmmt_Enabled ;
      defedtAct_hhpr_Enabled = edtAct_hhpr_Enabled ;
      defedtAct_hhpp_Enabled = edtAct_hhpp_Enabled ;
      defedtAct_Maq_Enabled = edtAct_Maq_Enabled ;
   }

   public void confirmValues17R0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451396( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451396( ) ;
         httpContext.changePostValue( "Z10279Act_Maq_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10279Act_Maq_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10279Act_Maq_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10286Act_vig_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10286Act_vig_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10286Act_vig_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10287Act_mod_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10287Act_mod_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10287Act_mod_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10280Act_hhpp_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10280Act_hhpp_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10280Act_hhpp_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10281Act_hhppI_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10281Act_hhppI_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10281Act_hhppI_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10282Act_hhpr_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10282Act_hhpr_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10282Act_hhpr_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10283Act_hhprI_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10283Act_hhprI_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10283Act_hhprI_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10284Act_hmmt_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10284Act_hmmt_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10284Act_hmmt_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10285Act_hmmr_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10285Act_hmmr_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10285Act_hmmr_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr0300", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10278Act_dia", localUtil.dtoc( Z10278Act_dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttr0300", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTR0300" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ACTIVIDADES HISTORICO", "") ;
   }

   public void initializeNonKey17R1395( )
   {
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
   }

   public void initAll17R1395( )
   {
      A652OpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A10278Act_dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10278Act_dia", localUtil.format(A10278Act_dia, "99/99/99"));
      initializeNonKey17R1395( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey17R1396( )
   {
      A10286Act_vig = DecimalUtil.ZERO ;
      n10286Act_vig = false ;
      A10287Act_mod = DecimalUtil.ZERO ;
      n10287Act_mod = false ;
      A10280Act_hhpp = DecimalUtil.ZERO ;
      n10280Act_hhpp = false ;
      A10281Act_hhppI = DecimalUtil.ZERO ;
      n10281Act_hhppI = false ;
      A10282Act_hhpr = DecimalUtil.ZERO ;
      n10282Act_hhpr = false ;
      A10283Act_hhprI = DecimalUtil.ZERO ;
      n10283Act_hhprI = false ;
      A10284Act_hmmt = DecimalUtil.ZERO ;
      n10284Act_hmmt = false ;
      A10285Act_hmmr = DecimalUtil.ZERO ;
      n10285Act_hmmr = false ;
      Z10286Act_vig = DecimalUtil.ZERO ;
      Z10287Act_mod = DecimalUtil.ZERO ;
      Z10280Act_hhpp = DecimalUtil.ZERO ;
      Z10281Act_hhppI = DecimalUtil.ZERO ;
      Z10282Act_hhpr = DecimalUtil.ZERO ;
      Z10283Act_hhprI = DecimalUtil.ZERO ;
      Z10284Act_hmmt = DecimalUtil.ZERO ;
      Z10285Act_hmmr = DecimalUtil.ZERO ;
   }

   public void initAll17R1396( )
   {
      A10279Act_Maq = "" ;
      initializeNonKey17R1396( ) ;
   }

   public void standaloneModalInsert17R1396( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241552410", true, true);
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
      httpContext.AddJavascriptSource("ttr0300.js", "?20268241552410", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1396( )
   {
      edtAct_mod_Enabled = defedtAct_mod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_mod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_mod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_vig_Enabled = defedtAct_vig_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_vig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_vig_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hmmr_Enabled = defedtAct_hmmr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hmmr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hmmr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hmmt_Enabled = defedtAct_hmmt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hmmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hmmt_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hhpr_Enabled = defedtAct_hhpr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hhpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhpr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_hhpp_Enabled = defedtAct_hhpp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_hhpp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_hhpp_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtAct_Maq_Enabled = defedtAct_Maq_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAct_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAct_Maq_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void startgridcontrol45( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1396, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1396_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10279Act_Maq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_Maq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10280Act_hhpp, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhpp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10281Act_hhppI, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhppI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10282Act_hhpr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhpr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10283Act_hhprI, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hhprI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10284Act_hmmt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hmmt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10285Act_hmmr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_hmmr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10286Act_vig, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_vig_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10287Act_mod, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAct_mod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAct_dia_Internalname = "ACT_DIA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1396_Internalname = "vNRCDDELETED_1396" ;
      edtAct_Maq_Internalname = "ACT_MAQ" ;
      edtAct_hhpp_Internalname = "ACT_HHPP" ;
      edtAct_hhppI_Internalname = "ACT_HHPPI" ;
      edtAct_hhpr_Internalname = "ACT_HHPR" ;
      edtAct_hhprI_Internalname = "ACT_HHPRI" ;
      edtAct_hmmt_Internalname = "ACT_HMMT" ;
      edtAct_hmmr_Internalname = "ACT_HMMR" ;
      edtAct_vig_Internalname = "ACT_VIG" ;
      edtAct_mod_Internalname = "ACT_MOD" ;
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
      Form.setCaption( httpContext.getMessage( "ACTIVIDADES HISTORICO", "") );
      edtAct_mod_Jsonclick = "" ;
      edtAct_vig_Jsonclick = "" ;
      edtAct_hmmr_Jsonclick = "" ;
      edtAct_hmmt_Jsonclick = "" ;
      edtAct_hhprI_Jsonclick = "" ;
      edtAct_hhpr_Jsonclick = "" ;
      edtAct_hhppI_Jsonclick = "" ;
      edtAct_hhpp_Jsonclick = "" ;
      edtAct_Maq_Jsonclick = "" ;
      edtavnRcdDeleted_1396_Jsonclick = "" ;
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
      edtAct_mod_Enabled = 0 ;
      edtAct_vig_Enabled = 0 ;
      edtAct_hmmr_Enabled = 0 ;
      edtAct_hmmt_Enabled = 0 ;
      edtAct_hhprI_Enabled = 1 ;
      edtAct_hhpr_Enabled = 0 ;
      edtAct_hhppI_Enabled = 1 ;
      edtAct_hhpp_Enabled = 0 ;
      edtAct_Maq_Enabled = 0 ;
      edtavnRcdDeleted_1396_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAct_dia_Jsonclick = "" ;
      edtAct_dia_Backcolor = (int)(0xFFFFFF) ;
      edtAct_dia_Enabled = 1 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
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
      subsflControlProps_451396( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal17R1396( ) ;
         standaloneModal17R1396( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow17R1396( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451396( ) ;
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
      /* Using cursor T017R23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017R23_A407EmprNom[0] ;
      n407EmprNom = T017R23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T017R15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T017R15_A653OpeNom[0] ;
      n653OpeNom = T017R15_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(13);
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

   public void valid_Opecod( )
   {
      n653OpeNom = false ;
      /* Using cursor T017R15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T017R15_A653OpeNom[0] ;
      n653OpeNom = T017R15_n653OpeNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
   }

   public void valid_Act_dia( )
   {
      n10282Act_hhpr = false ;
      n10280Act_hhpp = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10278Act_dia", localUtil.format(Z10278Act_dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
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
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_ACT_DIA","{handler:'valid_Act_dia',iparms:[{av:'A10282Act_hhpr',fld:'ACT_HHPR',pic:'ZZZZZ9.99'},{av:'A10280Act_hhpp',fld:'ACT_HHPP',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A10278Act_dia',fld:'ACT_DIA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ACT_DIA",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z652OpeCod'},{av:'Z10278Act_dia'},{av:'Z407EmprNom'},{av:'Z653OpeNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ACT_MAQ","{handler:'valid_Act_maq',iparms:[]");
      setEventMetadata("VALID_ACT_MAQ",",oparms:[]}");
      setEventMetadata("VALID_ACT_HHPP","{handler:'valid_Act_hhpp',iparms:[]");
      setEventMetadata("VALID_ACT_HHPP",",oparms:[]}");
      setEventMetadata("VALID_ACT_HHPPI","{handler:'valid_Act_hhppi',iparms:[]");
      setEventMetadata("VALID_ACT_HHPPI",",oparms:[]}");
      setEventMetadata("VALID_ACT_HHPR","{handler:'valid_Act_hhpr',iparms:[]");
      setEventMetadata("VALID_ACT_HHPR",",oparms:[]}");
      setEventMetadata("VALID_ACT_HHPRI","{handler:'valid_Act_hhpri',iparms:[]");
      setEventMetadata("VALID_ACT_HHPRI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Act_mod',iparms:[]");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10278Act_dia = GXutil.nullDate() ;
      Z10279Act_Maq = "" ;
      Z10286Act_vig = DecimalUtil.ZERO ;
      Z10287Act_mod = DecimalUtil.ZERO ;
      Z10280Act_hhpp = DecimalUtil.ZERO ;
      Z10281Act_hhppI = DecimalUtil.ZERO ;
      Z10282Act_hhpr = DecimalUtil.ZERO ;
      Z10283Act_hhprI = DecimalUtil.ZERO ;
      Z10284Act_hmmt = DecimalUtil.ZERO ;
      Z10285Act_hmmr = DecimalUtil.ZERO ;
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
      A653OpeNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10278Act_dia = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1396 = "" ;
      Gx_mode = "" ;
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
      sMode1395 = "" ;
      A10279Act_Maq = "" ;
      A10280Act_hhpp = DecimalUtil.ZERO ;
      A10281Act_hhppI = DecimalUtil.ZERO ;
      A10282Act_hhpr = DecimalUtil.ZERO ;
      A10283Act_hhprI = DecimalUtil.ZERO ;
      A10284Act_hmmt = DecimalUtil.ZERO ;
      A10285Act_hmmr = DecimalUtil.ZERO ;
      A10286Act_vig = DecimalUtil.ZERO ;
      A10287Act_mod = DecimalUtil.ZERO ;
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
      Z653OpeNom = "" ;
      T017R6_A407EmprNom = new String[] {""} ;
      T017R6_n407EmprNom = new boolean[] {false} ;
      T017R8_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R8_A407EmprNom = new String[] {""} ;
      T017R8_n407EmprNom = new boolean[] {false} ;
      T017R8_A653OpeNom = new String[] {""} ;
      T017R8_n653OpeNom = new boolean[] {false} ;
      T017R8_A396EmprCod = new String[] {""} ;
      T017R8_A652OpeCod = new int[1] ;
      T017R7_A653OpeNom = new String[] {""} ;
      T017R7_n653OpeNom = new boolean[] {false} ;
      T017R9_A653OpeNom = new String[] {""} ;
      T017R9_n653OpeNom = new boolean[] {false} ;
      T017R10_A396EmprCod = new String[] {""} ;
      T017R10_A652OpeCod = new int[1] ;
      T017R10_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R5_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R5_A396EmprCod = new String[] {""} ;
      T017R5_A652OpeCod = new int[1] ;
      T017R11_A396EmprCod = new String[] {""} ;
      T017R11_A652OpeCod = new int[1] ;
      T017R11_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R12_A396EmprCod = new String[] {""} ;
      T017R12_A652OpeCod = new int[1] ;
      T017R12_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R4_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R4_A396EmprCod = new String[] {""} ;
      T017R4_A652OpeCod = new int[1] ;
      T017R15_A653OpeNom = new String[] {""} ;
      T017R15_n653OpeNom = new boolean[] {false} ;
      T017R16_A396EmprCod = new String[] {""} ;
      T017R16_A652OpeCod = new int[1] ;
      T017R16_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R17_A396EmprCod = new String[] {""} ;
      T017R17_A652OpeCod = new int[1] ;
      T017R17_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R17_A10279Act_Maq = new String[] {""} ;
      T017R17_A10286Act_vig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R17_n10286Act_vig = new boolean[] {false} ;
      T017R17_A10287Act_mod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R17_n10287Act_mod = new boolean[] {false} ;
      T017R17_A10280Act_hhpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R17_n10280Act_hhpp = new boolean[] {false} ;
      T017R17_A10281Act_hhppI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R17_n10281Act_hhppI = new boolean[] {false} ;
      T017R17_A10282Act_hhpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R17_n10282Act_hhpr = new boolean[] {false} ;
      T017R17_A10283Act_hhprI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R17_n10283Act_hhprI = new boolean[] {false} ;
      T017R17_A10284Act_hmmt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R17_n10284Act_hmmt = new boolean[] {false} ;
      T017R17_A10285Act_hmmr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R17_n10285Act_hmmr = new boolean[] {false} ;
      T017R18_A396EmprCod = new String[] {""} ;
      T017R18_A652OpeCod = new int[1] ;
      T017R18_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R18_A10279Act_Maq = new String[] {""} ;
      T017R3_A396EmprCod = new String[] {""} ;
      T017R3_A652OpeCod = new int[1] ;
      T017R3_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R3_A10279Act_Maq = new String[] {""} ;
      T017R3_A10286Act_vig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R3_n10286Act_vig = new boolean[] {false} ;
      T017R3_A10287Act_mod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R3_n10287Act_mod = new boolean[] {false} ;
      T017R3_A10280Act_hhpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R3_n10280Act_hhpp = new boolean[] {false} ;
      T017R3_A10281Act_hhppI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R3_n10281Act_hhppI = new boolean[] {false} ;
      T017R3_A10282Act_hhpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R3_n10282Act_hhpr = new boolean[] {false} ;
      T017R3_A10283Act_hhprI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R3_n10283Act_hhprI = new boolean[] {false} ;
      T017R3_A10284Act_hmmt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R3_n10284Act_hmmt = new boolean[] {false} ;
      T017R3_A10285Act_hmmr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R3_n10285Act_hmmr = new boolean[] {false} ;
      T017R2_A396EmprCod = new String[] {""} ;
      T017R2_A652OpeCod = new int[1] ;
      T017R2_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R2_A10279Act_Maq = new String[] {""} ;
      T017R2_A10286Act_vig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R2_n10286Act_vig = new boolean[] {false} ;
      T017R2_A10287Act_mod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R2_n10287Act_mod = new boolean[] {false} ;
      T017R2_A10280Act_hhpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R2_n10280Act_hhpp = new boolean[] {false} ;
      T017R2_A10281Act_hhppI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R2_n10281Act_hhppI = new boolean[] {false} ;
      T017R2_A10282Act_hhpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R2_n10282Act_hhpr = new boolean[] {false} ;
      T017R2_A10283Act_hhprI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R2_n10283Act_hhprI = new boolean[] {false} ;
      T017R2_A10284Act_hmmt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R2_n10284Act_hmmt = new boolean[] {false} ;
      T017R2_A10285Act_hmmr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017R2_n10285Act_hmmr = new boolean[] {false} ;
      T017R22_A396EmprCod = new String[] {""} ;
      T017R22_A652OpeCod = new int[1] ;
      T017R22_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017R22_A10279Act_Maq = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017R23_A407EmprNom = new String[] {""} ;
      T017R23_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10278Act_dia = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ653OpeNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr0300__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr0300__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr0300__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr0300__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr0300__default(),
         new Object[] {
             new Object[] {
            T017R2_A396EmprCod, T017R2_A652OpeCod, T017R2_A10278Act_dia, T017R2_A10279Act_Maq, T017R2_A10286Act_vig, T017R2_n10286Act_vig, T017R2_A10287Act_mod, T017R2_n10287Act_mod, T017R2_A10280Act_hhpp, T017R2_n10280Act_hhpp,
            T017R2_A10281Act_hhppI, T017R2_n10281Act_hhppI, T017R2_A10282Act_hhpr, T017R2_n10282Act_hhpr, T017R2_A10283Act_hhprI, T017R2_n10283Act_hhprI, T017R2_A10284Act_hmmt, T017R2_n10284Act_hmmt, T017R2_A10285Act_hmmr, T017R2_n10285Act_hmmr
            }
            , new Object[] {
            T017R3_A396EmprCod, T017R3_A652OpeCod, T017R3_A10278Act_dia, T017R3_A10279Act_Maq, T017R3_A10286Act_vig, T017R3_n10286Act_vig, T017R3_A10287Act_mod, T017R3_n10287Act_mod, T017R3_A10280Act_hhpp, T017R3_n10280Act_hhpp,
            T017R3_A10281Act_hhppI, T017R3_n10281Act_hhppI, T017R3_A10282Act_hhpr, T017R3_n10282Act_hhpr, T017R3_A10283Act_hhprI, T017R3_n10283Act_hhprI, T017R3_A10284Act_hmmt, T017R3_n10284Act_hmmt, T017R3_A10285Act_hmmr, T017R3_n10285Act_hmmr
            }
            , new Object[] {
            T017R4_A10278Act_dia, T017R4_A396EmprCod, T017R4_A652OpeCod
            }
            , new Object[] {
            T017R5_A10278Act_dia, T017R5_A396EmprCod, T017R5_A652OpeCod
            }
            , new Object[] {
            T017R6_A407EmprNom, T017R6_n407EmprNom
            }
            , new Object[] {
            T017R7_A653OpeNom, T017R7_n653OpeNom
            }
            , new Object[] {
            T017R8_A10278Act_dia, T017R8_A407EmprNom, T017R8_n407EmprNom, T017R8_A653OpeNom, T017R8_n653OpeNom, T017R8_A396EmprCod, T017R8_A652OpeCod
            }
            , new Object[] {
            T017R9_A653OpeNom, T017R9_n653OpeNom
            }
            , new Object[] {
            T017R10_A396EmprCod, T017R10_A652OpeCod, T017R10_A10278Act_dia
            }
            , new Object[] {
            T017R11_A396EmprCod, T017R11_A652OpeCod, T017R11_A10278Act_dia
            }
            , new Object[] {
            T017R12_A396EmprCod, T017R12_A652OpeCod, T017R12_A10278Act_dia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017R15_A653OpeNom, T017R15_n653OpeNom
            }
            , new Object[] {
            T017R16_A396EmprCod, T017R16_A652OpeCod, T017R16_A10278Act_dia
            }
            , new Object[] {
            T017R17_A396EmprCod, T017R17_A652OpeCod, T017R17_A10278Act_dia, T017R17_A10279Act_Maq, T017R17_A10286Act_vig, T017R17_n10286Act_vig, T017R17_A10287Act_mod, T017R17_n10287Act_mod, T017R17_A10280Act_hhpp, T017R17_n10280Act_hhpp,
            T017R17_A10281Act_hhppI, T017R17_n10281Act_hhppI, T017R17_A10282Act_hhpr, T017R17_n10282Act_hhpr, T017R17_A10283Act_hhprI, T017R17_n10283Act_hhprI, T017R17_A10284Act_hmmt, T017R17_n10284Act_hmmt, T017R17_A10285Act_hmmr, T017R17_n10285Act_hmmr
            }
            , new Object[] {
            T017R18_A396EmprCod, T017R18_A652OpeCod, T017R18_A10278Act_dia, T017R18_A10279Act_Maq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017R22_A396EmprCod, T017R22_A652OpeCod, T017R22_A10278Act_dia, T017R22_A10279Act_Maq
            }
            , new Object[] {
            T017R23_A407EmprNom, T017R23_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTR0300" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1396 ;
   private short nRcdExists_1396 ;
   private short nIsMod_1396 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1396 ;
   private short RcdFound1396 ;
   private short nBlankRcdUsr1396 ;
   private short RcdFound1395 ;
   private short nIsDirty_1395 ;
   private short nIsDirty_1396 ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A652OpeCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtAct_dia_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1396_Enabled ;
   private int edtAct_Maq_Enabled ;
   private int edtAct_hhpp_Enabled ;
   private int edtAct_hhppI_Enabled ;
   private int edtAct_hhpr_Enabled ;
   private int edtAct_hhprI_Enabled ;
   private int edtAct_hmmt_Enabled ;
   private int edtAct_hmmr_Enabled ;
   private int edtAct_vig_Enabled ;
   private int edtAct_mod_Enabled ;
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
   private int defedtAct_mod_Enabled ;
   private int defedtAct_vig_Enabled ;
   private int defedtAct_hmmr_Enabled ;
   private int defedtAct_hmmt_Enabled ;
   private int defedtAct_hhpr_Enabled ;
   private int defedtAct_hhpp_Enabled ;
   private int defedtAct_Maq_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAct_dia_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ652OpeCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10286Act_vig ;
   private java.math.BigDecimal Z10287Act_mod ;
   private java.math.BigDecimal Z10280Act_hhpp ;
   private java.math.BigDecimal Z10281Act_hhppI ;
   private java.math.BigDecimal Z10282Act_hhpr ;
   private java.math.BigDecimal Z10283Act_hhprI ;
   private java.math.BigDecimal Z10284Act_hmmt ;
   private java.math.BigDecimal Z10285Act_hmmr ;
   private java.math.BigDecimal A10280Act_hhpp ;
   private java.math.BigDecimal A10281Act_hhppI ;
   private java.math.BigDecimal A10282Act_hhpr ;
   private java.math.BigDecimal A10283Act_hhprI ;
   private java.math.BigDecimal A10284Act_hmmt ;
   private java.math.BigDecimal A10285Act_hmmr ;
   private java.math.BigDecimal A10286Act_vig ;
   private java.math.BigDecimal A10287Act_mod ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10279Act_Maq ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOpeCod_Internalname ;
   private String sGXsfl_45_idx="0001" ;
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
   private String edtOpeCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtOpeNom_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAct_dia_Internalname ;
   private String edtAct_dia_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1396 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1396_Internalname ;
   private String edtAct_Maq_Internalname ;
   private String edtAct_hhpp_Internalname ;
   private String edtAct_hhppI_Internalname ;
   private String edtAct_hhpr_Internalname ;
   private String edtAct_hhprI_Internalname ;
   private String edtAct_hmmt_Internalname ;
   private String edtAct_hmmr_Internalname ;
   private String edtAct_vig_Internalname ;
   private String edtAct_mod_Internalname ;
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
   private String sMode1395 ;
   private String A10279Act_Maq ;
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
   private String Z653OpeNom ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1396_Jsonclick ;
   private String edtAct_Maq_Jsonclick ;
   private String edtAct_hhpp_Jsonclick ;
   private String edtAct_hhppI_Jsonclick ;
   private String edtAct_hhpr_Jsonclick ;
   private String edtAct_hhprI_Jsonclick ;
   private String edtAct_hmmt_Jsonclick ;
   private String edtAct_hmmr_Jsonclick ;
   private String edtAct_vig_Jsonclick ;
   private String edtAct_mod_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ653OpeNom ;
   private java.util.Date Z10278Act_dia ;
   private java.util.Date A10278Act_dia ;
   private java.util.Date ZZ10278Act_dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n653OpeNom ;
   private boolean returnInSub ;
   private boolean n10286Act_vig ;
   private boolean n10287Act_mod ;
   private boolean n10280Act_hhpp ;
   private boolean n10281Act_hhppI ;
   private boolean n10282Act_hhpr ;
   private boolean n10283Act_hhprI ;
   private boolean n10284Act_hmmt ;
   private boolean n10285Act_hmmr ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T017R6_A407EmprNom ;
   private boolean[] T017R6_n407EmprNom ;
   private java.util.Date[] T017R8_A10278Act_dia ;
   private String[] T017R8_A407EmprNom ;
   private boolean[] T017R8_n407EmprNom ;
   private String[] T017R8_A653OpeNom ;
   private boolean[] T017R8_n653OpeNom ;
   private String[] T017R8_A396EmprCod ;
   private int[] T017R8_A652OpeCod ;
   private String[] T017R7_A653OpeNom ;
   private boolean[] T017R7_n653OpeNom ;
   private String[] T017R9_A653OpeNom ;
   private boolean[] T017R9_n653OpeNom ;
   private String[] T017R10_A396EmprCod ;
   private int[] T017R10_A652OpeCod ;
   private java.util.Date[] T017R10_A10278Act_dia ;
   private java.util.Date[] T017R5_A10278Act_dia ;
   private String[] T017R5_A396EmprCod ;
   private int[] T017R5_A652OpeCod ;
   private String[] T017R11_A396EmprCod ;
   private int[] T017R11_A652OpeCod ;
   private java.util.Date[] T017R11_A10278Act_dia ;
   private String[] T017R12_A396EmprCod ;
   private int[] T017R12_A652OpeCod ;
   private java.util.Date[] T017R12_A10278Act_dia ;
   private java.util.Date[] T017R4_A10278Act_dia ;
   private String[] T017R4_A396EmprCod ;
   private int[] T017R4_A652OpeCod ;
   private String[] T017R15_A653OpeNom ;
   private boolean[] T017R15_n653OpeNom ;
   private String[] T017R16_A396EmprCod ;
   private int[] T017R16_A652OpeCod ;
   private java.util.Date[] T017R16_A10278Act_dia ;
   private String[] T017R17_A396EmprCod ;
   private int[] T017R17_A652OpeCod ;
   private java.util.Date[] T017R17_A10278Act_dia ;
   private String[] T017R17_A10279Act_Maq ;
   private java.math.BigDecimal[] T017R17_A10286Act_vig ;
   private boolean[] T017R17_n10286Act_vig ;
   private java.math.BigDecimal[] T017R17_A10287Act_mod ;
   private boolean[] T017R17_n10287Act_mod ;
   private java.math.BigDecimal[] T017R17_A10280Act_hhpp ;
   private boolean[] T017R17_n10280Act_hhpp ;
   private java.math.BigDecimal[] T017R17_A10281Act_hhppI ;
   private boolean[] T017R17_n10281Act_hhppI ;
   private java.math.BigDecimal[] T017R17_A10282Act_hhpr ;
   private boolean[] T017R17_n10282Act_hhpr ;
   private java.math.BigDecimal[] T017R17_A10283Act_hhprI ;
   private boolean[] T017R17_n10283Act_hhprI ;
   private java.math.BigDecimal[] T017R17_A10284Act_hmmt ;
   private boolean[] T017R17_n10284Act_hmmt ;
   private java.math.BigDecimal[] T017R17_A10285Act_hmmr ;
   private boolean[] T017R17_n10285Act_hmmr ;
   private String[] T017R18_A396EmprCod ;
   private int[] T017R18_A652OpeCod ;
   private java.util.Date[] T017R18_A10278Act_dia ;
   private String[] T017R18_A10279Act_Maq ;
   private String[] T017R3_A396EmprCod ;
   private int[] T017R3_A652OpeCod ;
   private java.util.Date[] T017R3_A10278Act_dia ;
   private String[] T017R3_A10279Act_Maq ;
   private java.math.BigDecimal[] T017R3_A10286Act_vig ;
   private boolean[] T017R3_n10286Act_vig ;
   private java.math.BigDecimal[] T017R3_A10287Act_mod ;
   private boolean[] T017R3_n10287Act_mod ;
   private java.math.BigDecimal[] T017R3_A10280Act_hhpp ;
   private boolean[] T017R3_n10280Act_hhpp ;
   private java.math.BigDecimal[] T017R3_A10281Act_hhppI ;
   private boolean[] T017R3_n10281Act_hhppI ;
   private java.math.BigDecimal[] T017R3_A10282Act_hhpr ;
   private boolean[] T017R3_n10282Act_hhpr ;
   private java.math.BigDecimal[] T017R3_A10283Act_hhprI ;
   private boolean[] T017R3_n10283Act_hhprI ;
   private java.math.BigDecimal[] T017R3_A10284Act_hmmt ;
   private boolean[] T017R3_n10284Act_hmmt ;
   private java.math.BigDecimal[] T017R3_A10285Act_hmmr ;
   private boolean[] T017R3_n10285Act_hmmr ;
   private String[] T017R2_A396EmprCod ;
   private int[] T017R2_A652OpeCod ;
   private java.util.Date[] T017R2_A10278Act_dia ;
   private String[] T017R2_A10279Act_Maq ;
   private java.math.BigDecimal[] T017R2_A10286Act_vig ;
   private boolean[] T017R2_n10286Act_vig ;
   private java.math.BigDecimal[] T017R2_A10287Act_mod ;
   private boolean[] T017R2_n10287Act_mod ;
   private java.math.BigDecimal[] T017R2_A10280Act_hhpp ;
   private boolean[] T017R2_n10280Act_hhpp ;
   private java.math.BigDecimal[] T017R2_A10281Act_hhppI ;
   private boolean[] T017R2_n10281Act_hhppI ;
   private java.math.BigDecimal[] T017R2_A10282Act_hhpr ;
   private boolean[] T017R2_n10282Act_hhpr ;
   private java.math.BigDecimal[] T017R2_A10283Act_hhprI ;
   private boolean[] T017R2_n10283Act_hhprI ;
   private java.math.BigDecimal[] T017R2_A10284Act_hmmt ;
   private boolean[] T017R2_n10284Act_hmmt ;
   private java.math.BigDecimal[] T017R2_A10285Act_hmmr ;
   private boolean[] T017R2_n10285Act_hmmr ;
   private String[] T017R22_A396EmprCod ;
   private int[] T017R22_A652OpeCod ;
   private java.util.Date[] T017R22_A10278Act_dia ;
   private String[] T017R22_A10279Act_Maq ;
   private String[] T017R23_A407EmprNom ;
   private boolean[] T017R23_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr0300__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0300__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0300__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0300__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0300__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017R2", "SELECT EmprCod, OpeCod, Act_dia, Act_Maq, Act_vig, Act_mod, Act_hhpp, Act_hhppI, Act_hhpr, Act_hhprI, Act_hmmt, Act_hmmr FROM TXPTR0301 WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ? AND Act_Maq = ?  FOR UPDATE OF Act_vig, Act_mod, Act_hhpp, Act_hhppI, Act_hhpr, Act_hhprI, Act_hmmt, Act_hmmr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R3", "SELECT EmprCod, OpeCod, Act_dia, Act_Maq, Act_vig, Act_mod, Act_hhpp, Act_hhppI, Act_hhpr, Act_hhprI, Act_hmmt, Act_hmmr FROM TXPTR0301 WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ? AND Act_Maq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R4", "SELECT Act_dia, EmprCod, OpeCod FROM TXPTR0300 WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ?  FOR UPDATE OF Act_dia NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R5", "SELECT Act_dia, EmprCod, OpeCod FROM TXPTR0300 WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R7", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Act_dia, T2.EmprNom, T3.OpeNom, TM1.EmprCod, TM1.OpeCod FROM ((TXPTR0300 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.OpeCod = ? and TM1.Act_dia = ? ORDER BY TM1.EmprCod, TM1.OpeCod, TM1.Act_dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R9", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OpeCod, Act_dia FROM TXPTR0300 WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OpeCod, Act_dia FROM TXPTR0300 WHERE ( OpeCod > ? or OpeCod = ? and Act_dia > ?) and EmprCod = ? ORDER BY EmprCod, OpeCod, Act_dia) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017R12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OpeCod, Act_dia FROM TXPTR0300 WHERE ( OpeCod < ? or OpeCod = ? and Act_dia < ?) and EmprCod = ? ORDER BY EmprCod DESC, OpeCod DESC, Act_dia DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017R13", "INSERT INTO TXPTR0300(Act_dia, EmprCod, OpeCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPTR0300")
         ,new UpdateCursor("T017R14", "DELETE FROM TXPTR0300  WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ?", GX_NOMASK, "TXPTR0300")
         ,new ForEachCursor("T017R15", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OpeCod, Act_dia FROM TXPTR0300 WHERE EmprCod = ? ORDER BY EmprCod, OpeCod, Act_dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R17", "SELECT EmprCod, OpeCod, Act_dia, Act_Maq, Act_vig, Act_mod, Act_hhpp, Act_hhppI, Act_hhpr, Act_hhprI, Act_hmmt, Act_hmmr FROM TXPTR0301 WHERE EmprCod = ? and OpeCod = ? and Act_dia = ? and Act_Maq = ? ORDER BY EmprCod, OpeCod, Act_dia, Act_Maq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R18", "SELECT EmprCod, OpeCod, Act_dia, Act_Maq FROM TXPTR0301 WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ? AND Act_Maq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017R19", "INSERT INTO TXPTR0301(EmprCod, OpeCod, Act_dia, Act_Maq, Act_vig, Act_mod, Act_hhpp, Act_hhppI, Act_hhpr, Act_hhprI, Act_hmmt, Act_hmmr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR0301")
         ,new UpdateCursor("T017R20", "UPDATE TXPTR0301 SET Act_vig=?, Act_mod=?, Act_hhpp=?, Act_hhppI=?, Act_hhpr=?, Act_hhprI=?, Act_hmmt=?, Act_hmmr=?  WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ? AND Act_Maq = ?", GX_NOMASK, "TXPTR0301")
         ,new UpdateCursor("T017R21", "DELETE FROM TXPTR0301  WHERE EmprCod = ? AND OpeCod = ? AND Act_dia = ? AND Act_Maq = ?", GX_NOMASK, "TXPTR0301")
         ,new ForEachCursor("T017R22", "SELECT EmprCod, OpeCod, Act_dia, Act_Maq FROM TXPTR0301 WHERE EmprCod = ? and OpeCod = ? and Act_dia = ? ORDER BY EmprCod, OpeCod, Act_dia, Act_Maq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017R23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[19], 2);
               }
               return;
            case 18 :
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setDate(11, (java.util.Date)parms[18]);
               stmt.setString(12, (String)parms[19], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

