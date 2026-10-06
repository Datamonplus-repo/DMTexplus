package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttohos3_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PAROS INFOTINT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTh_Maq_Internalname ;
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

   public ttohos3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttohos3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttohos3_impl.class ));
   }

   public ttohos3_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTOHOS3.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_Maq_Internalname, GXutil.rtrim( A10894Th_Maq), GXutil.rtrim( localUtil.format( A10894Th_Maq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_Maq_Jsonclick, 0, "", "", "", "", "", 1, edtTh_Maq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha Paro", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTh_FecParo_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_FecParo_Internalname, localUtil.format(A10913Th_FecParo, "99/99/99"), localUtil.format( A10913Th_FecParo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_FecParo_Jsonclick, 0, "", "", "", "", "", 1, edtTh_FecParo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOS3.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTh_FecParo_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTh_FecParo_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTOHOS3.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea Paro", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTOHOS3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTh_UltP_Internalname, GXutil.ltrim( localUtil.ntoc( A10908Th_UltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTh_UltP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10908Th_UltP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10908Th_UltP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTh_UltP_Jsonclick, 0, "", "", "", "", "", 1, edtTh_UltP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTOHOS3.htm");
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
         nBlankRcdCount1456 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1456 = (short)(1) ;
            scanStart19Y1456( ) ;
            while ( RcdFound1456 != 0 )
            {
               init_level_properties1456( ) ;
               getByPrimaryKey19Y1456( ) ;
               addRow19Y1456( ) ;
               scanNext19Y1456( ) ;
            }
            scanEnd19Y1456( ) ;
            nBlankRcdCount1456 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal19Y1456( ) ;
         standaloneModal19Y1456( ) ;
         sMode1456 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow19Y1456( ) ;
            edtavnRcdDeleted_1456_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1456_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1456_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1456_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtTh_LinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_LINP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_LinP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtTh_Paro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PARO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_Paro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Paro_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtTh_Ope_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_OPE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_Ope_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Ope_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtTh_Tiempo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_TIEMPO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTh_Tiempo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Tiempo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1456 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal19Y1456( ) ;
            }
            sendRow19Y1456( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1456 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1456 = (short)(5) ;
         nRcdExists_1456 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart19Y1456( ) ;
            while ( RcdFound1456 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451456( ) ;
               init_level_properties1456( ) ;
               standaloneNotModal19Y1456( ) ;
               getByPrimaryKey19Y1456( ) ;
               standaloneModal19Y1456( ) ;
               addRow19Y1456( ) ;
               scanNext19Y1456( ) ;
            }
            scanEnd19Y1456( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1456 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451456( ) ;
      initAll19Y1456( ) ;
      init_level_properties1456( ) ;
      nRcdExists_1456 = (short)(0) ;
      nIsMod_1456 = (short)(0) ;
      nRcdDeleted_1456 = (short)(0) ;
      nBlankRcdCount1456 = (short)(nBlankRcdUsr1456+nBlankRcdCount1456) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1456 > 0 )
      {
         standaloneNotModal19Y1456( ) ;
         standaloneModal19Y1456( ) ;
         addRow19Y1456( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTh_LinP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1456 = (short)(nBlankRcdCount1456-1) ;
      }
      Gx_mode = sMode1456 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTOHOS3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTOHOS3.htm");
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
      e1119Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10894Th_Maq = httpContext.cgiGet( "Z10894Th_Maq") ;
            Z10913Th_FecParo = localUtil.ctod( httpContext.cgiGet( "Z10913Th_FecParo"), 0) ;
            Z10908Th_UltP = (short)(localUtil.ctol( httpContext.cgiGet( "Z10908Th_UltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A10894Th_Maq = httpContext.cgiGet( edtTh_Maq_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
            if ( localUtil.vcdate( httpContext.cgiGet( edtTh_FecParo_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TH_FECPARO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_FecParo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10913Th_FecParo = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
            }
            else
            {
               A10913Th_FecParo = localUtil.ctod( httpContext.cgiGet( edtTh_FecParo_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_UltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_UltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TH_ULTP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTh_UltP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10908Th_UltP = (short)(0) ;
               n10908Th_UltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10908Th_UltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10908Th_UltP), 4, 0));
            }
            else
            {
               A10908Th_UltP = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_UltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10908Th_UltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10908Th_UltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10908Th_UltP), 4, 0));
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
               A10894Th_Maq = httpContext.GetPar( "Th_Maq") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
               A10913Th_FecParo = localUtil.parseDateParm( httpContext.GetPar( "Th_FecParo")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
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
                        e1119Y2 ();
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
            initAll19Y1455( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1456_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1456_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes19Y1455( ) ;
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

   public void confirm_19Y0( )
   {
      beforeValidate19Y1455( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls19Y1455( ) ;
         }
         else
         {
            checkExtendedTable19Y1455( ) ;
            if ( AnyError == 0 )
            {
               zm19Y1455( 2) ;
            }
            closeExtendedTableCursors19Y1455( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1455 = Gx_mode ;
         confirm_19Y1456( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1455 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1455 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues19Y0( ) ;
      }
   }

   public void confirm_19Y1456( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow19Y1456( ) ;
         if ( ( nRcdExists_1456 != 0 ) || ( nIsMod_1456 != 0 ) )
         {
            getKey19Y1456( ) ;
            if ( ( nRcdExists_1456 == 0 ) && ( nRcdDeleted_1456 == 0 ) )
            {
               if ( RcdFound1456 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate19Y1456( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable19Y1456( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors19Y1456( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TH_LINP_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTh_LinP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1456 != 0 )
               {
                  if ( nRcdDeleted_1456 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey19Y1456( ) ;
                     load19Y1456( ) ;
                     beforeValidate19Y1456( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls19Y1456( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1456 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate19Y1456( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable19Y1456( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors19Y1456( ) ;
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
                  if ( nRcdDeleted_1456 == 0 )
                  {
                     GXCCtl = "TH_LINP_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTh_LinP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1456_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_LinP_Internalname, GXutil.ltrim( localUtil.ntoc( A10909Th_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Paro_Internalname, GXutil.ltrim( localUtil.ntoc( A10910Th_Paro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Ope_Internalname, GXutil.ltrim( localUtil.ntoc( A10911Th_Ope, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Tiempo_Internalname, GXutil.ltrim( localUtil.ntoc( A10912Th_Tiempo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10909Th_LinP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10909Th_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10910Th_Paro_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10910Th_Paro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10911Th_Ope_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10911Th_Ope, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10912Th_Tiempo_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10912Th_Tiempo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1456_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1456_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1456_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1456 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1456_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1456_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_LINP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_LinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PARO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Paro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_OPE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Ope_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_TIEMPO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Tiempo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption19Y0( )
   {
   }

   public void e1119Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttohos3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttohos3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttohos3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttohos3_impl.this.A396EmprCod = GXv_char2[0] ;
      ttohos3_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttohos3_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm19Y1455( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10908Th_UltP = T019Y5_A10908Th_UltP[0] ;
         }
         else
         {
            Z10908Th_UltP = A10908Th_UltP ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10894Th_Maq = A10894Th_Maq ;
         Z10913Th_FecParo = A10913Th_FecParo ;
         Z10908Th_UltP = A10908Th_UltP ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTOHOS3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T019Y6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019Y6_A407EmprNom[0] ;
      n407EmprNom = T019Y6_n407EmprNom[0] ;
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

   public void load19Y1455( )
   {
      /* Using cursor T019Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1455 = (short)(1) ;
         A407EmprNom = T019Y7_A407EmprNom[0] ;
         n407EmprNom = T019Y7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10908Th_UltP = T019Y7_A10908Th_UltP[0] ;
         n10908Th_UltP = T019Y7_n10908Th_UltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10908Th_UltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10908Th_UltP), 4, 0));
         zm19Y1455( -1) ;
      }
      pr_default.close(5);
      onLoadActions19Y1455( ) ;
   }

   public void onLoadActions19Y1455( )
   {
   }

   public void checkExtendedTable19Y1455( )
   {
      nIsDirty_1455 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors19Y1455( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey19Y1455( )
   {
      /* Using cursor T019Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1455 = (short)(1) ;
      }
      else
      {
         RcdFound1455 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T019Y5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T019Y5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm19Y1455( 1) ;
         RcdFound1455 = (short)(1) ;
         A10894Th_Maq = T019Y5_A10894Th_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
         A10913Th_FecParo = T019Y5_A10913Th_FecParo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
         A10908Th_UltP = T019Y5_A10908Th_UltP[0] ;
         n10908Th_UltP = T019Y5_n10908Th_UltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10908Th_UltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10908Th_UltP), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z10894Th_Maq = A10894Th_Maq ;
         Z10913Th_FecParo = A10913Th_FecParo ;
         sMode1455 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load19Y1455( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1455 = (short)(0) ;
            initializeNonKey19Y1455( ) ;
         }
         Gx_mode = sMode1455 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1455 = (short)(0) ;
         initializeNonKey19Y1455( ) ;
         sMode1455 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1455 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey19Y1455( ) ;
      if ( RcdFound1455 == 0 )
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
      RcdFound1455 = (short)(0) ;
      /* Using cursor T019Y9 */
      pr_default.execute(7, new Object[] {A10894Th_Maq, A10894Th_Maq, A10913Th_FecParo, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T019Y9_A10894Th_Maq[0], A10894Th_Maq) < 0 ) || ( GXutil.strcmp(T019Y9_A10894Th_Maq[0], A10894Th_Maq) == 0 ) && GXutil.resetTime(T019Y9_A10913Th_FecParo[0]).before( GXutil.resetTime( A10913Th_FecParo )) ) && ( GXutil.strcmp(T019Y9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T019Y9_A10894Th_Maq[0], A10894Th_Maq) > 0 ) || ( GXutil.strcmp(T019Y9_A10894Th_Maq[0], A10894Th_Maq) == 0 ) && GXutil.resetTime(T019Y9_A10913Th_FecParo[0]).after( GXutil.resetTime( A10913Th_FecParo )) ) && ( GXutil.strcmp(T019Y9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10894Th_Maq = T019Y9_A10894Th_Maq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
            A10913Th_FecParo = T019Y9_A10913Th_FecParo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
            RcdFound1455 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1455 = (short)(0) ;
      /* Using cursor T019Y10 */
      pr_default.execute(8, new Object[] {A10894Th_Maq, A10894Th_Maq, A10913Th_FecParo, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T019Y10_A10894Th_Maq[0], A10894Th_Maq) > 0 ) || ( GXutil.strcmp(T019Y10_A10894Th_Maq[0], A10894Th_Maq) == 0 ) && GXutil.resetTime(T019Y10_A10913Th_FecParo[0]).after( GXutil.resetTime( A10913Th_FecParo )) ) && ( GXutil.strcmp(T019Y10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T019Y10_A10894Th_Maq[0], A10894Th_Maq) < 0 ) || ( GXutil.strcmp(T019Y10_A10894Th_Maq[0], A10894Th_Maq) == 0 ) && GXutil.resetTime(T019Y10_A10913Th_FecParo[0]).before( GXutil.resetTime( A10913Th_FecParo )) ) && ( GXutil.strcmp(T019Y10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10894Th_Maq = T019Y10_A10894Th_Maq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
            A10913Th_FecParo = T019Y10_A10913Th_FecParo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
            RcdFound1455 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey19Y1455( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTh_Maq_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert19Y1455( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1455 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10894Th_Maq, Z10894Th_Maq) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10913Th_FecParo), GXutil.resetTime(Z10913Th_FecParo)) ) )
            {
               A10894Th_Maq = Z10894Th_Maq ;
               httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
               A10913Th_FecParo = Z10913Th_FecParo ;
               httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTh_Maq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update19Y1455( ) ;
               GX_FocusControl = edtTh_Maq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10894Th_Maq, Z10894Th_Maq) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10913Th_FecParo), GXutil.resetTime(Z10913Th_FecParo)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTh_Maq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert19Y1455( ) ;
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
                  GX_FocusControl = edtTh_Maq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert19Y1455( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10894Th_Maq, Z10894Th_Maq) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10913Th_FecParo), GXutil.resetTime(Z10913Th_FecParo)) ) )
      {
         A10894Th_Maq = Z10894Th_Maq ;
         httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
         A10913Th_FecParo = Z10913Th_FecParo ;
         httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTh_Maq_Internalname ;
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
      getKey19Y1455( ) ;
      if ( RcdFound1455 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10894Th_Maq, Z10894Th_Maq) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10913Th_FecParo), GXutil.resetTime(Z10913Th_FecParo)) ) )
         {
            A10894Th_Maq = Z10894Th_Maq ;
            httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
            A10913Th_FecParo = Z10913Th_FecParo ;
            httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10894Th_Maq, Z10894Th_Maq) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10913Th_FecParo), GXutil.resetTime(Z10913Th_FecParo)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttohos3");
      GX_FocusControl = edtTh_UltP_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_19Y0( ) ;
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
      if ( RcdFound1455 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTh_UltP_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart19Y1455( ) ;
      if ( RcdFound1455 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTh_UltP_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19Y1455( ) ;
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
      if ( RcdFound1455 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTh_UltP_Internalname ;
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
      if ( RcdFound1455 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTh_UltP_Internalname ;
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
      scanStart19Y1455( ) ;
      if ( RcdFound1455 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1455 != 0 )
         {
            scanNext19Y1455( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTh_UltP_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd19Y1455( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency19Y1455( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019Y4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTOHOS3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z10908Th_UltP != T019Y4_A10908Th_UltP[0] ) )
         {
            if ( Z10908Th_UltP != T019Y4_A10908Th_UltP[0] )
            {
               GXutil.writeLogln("ttohos3:[seudo value changed for attri]"+"Th_UltP");
               GXutil.writeLogRaw("Old: ",Z10908Th_UltP);
               GXutil.writeLogRaw("Current: ",T019Y4_A10908Th_UltP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTOHOS3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19Y1455( )
   {
      beforeValidate19Y1455( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19Y1455( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19Y1455( 0) ;
         checkOptimisticConcurrency19Y1455( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19Y1455( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19Y1455( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019Y11 */
                  pr_default.execute(9, new Object[] {A10894Th_Maq, A10913Th_FecParo, Boolean.valueOf(n10908Th_UltP), Short.valueOf(A10908Th_UltP), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS3");
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
                        processLevel19Y1455( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption19Y0( ) ;
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
            load19Y1455( ) ;
         }
         endLevel19Y1455( ) ;
      }
      closeExtendedTableCursors19Y1455( ) ;
   }

   public void update19Y1455( )
   {
      beforeValidate19Y1455( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19Y1455( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19Y1455( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19Y1455( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate19Y1455( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019Y12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n10908Th_UltP), Short.valueOf(A10908Th_UltP), A396EmprCod, A10894Th_Maq, A10913Th_FecParo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS3");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTOHOS3"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate19Y1455( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel19Y1455( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption19Y0( ) ;
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
         endLevel19Y1455( ) ;
      }
      closeExtendedTableCursors19Y1455( ) ;
   }

   public void deferredUpdate19Y1455( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19Y1455( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19Y1455( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19Y1455( ) ;
         afterConfirm19Y1455( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19Y1455( ) ;
            if ( AnyError == 0 )
            {
               scanStart19Y1456( ) ;
               while ( RcdFound1456 != 0 )
               {
                  getByPrimaryKey19Y1456( ) ;
                  delete19Y1456( ) ;
                  scanNext19Y1456( ) ;
               }
               scanEnd19Y1456( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019Y13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS3");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1455 == 0 )
                        {
                           initAll19Y1455( ) ;
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
                        resetCaption19Y0( ) ;
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
      sMode1455 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel19Y1455( ) ;
      Gx_mode = sMode1455 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19Y1455( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel19Y1456( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow19Y1456( ) ;
         if ( ( nRcdExists_1456 != 0 ) || ( nIsMod_1456 != 0 ) )
         {
            standaloneNotModal19Y1456( ) ;
            getKey19Y1456( ) ;
            if ( ( nRcdExists_1456 == 0 ) && ( nRcdDeleted_1456 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert19Y1456( ) ;
            }
            else
            {
               if ( RcdFound1456 != 0 )
               {
                  if ( ( nRcdDeleted_1456 != 0 ) && ( nRcdExists_1456 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete19Y1456( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1456 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update19Y1456( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1456 == 0 )
                  {
                     GXCCtl = "TH_LINP_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTh_LinP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1456_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_LinP_Internalname, GXutil.ltrim( localUtil.ntoc( A10909Th_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Paro_Internalname, GXutil.ltrim( localUtil.ntoc( A10910Th_Paro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Ope_Internalname, GXutil.ltrim( localUtil.ntoc( A10911Th_Ope, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTh_Tiempo_Internalname, GXutil.ltrim( localUtil.ntoc( A10912Th_Tiempo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10909Th_LinP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10909Th_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10910Th_Paro_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10910Th_Paro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10911Th_Ope_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10911Th_Ope, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10912Th_Tiempo_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10912Th_Tiempo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1456_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1456_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1456_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1456 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1456_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1456_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_LINP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_LinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_PARO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Paro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_OPE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Ope_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TH_TIEMPO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Tiempo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll19Y1456( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1456 = (short)(0) ;
      nIsMod_1456 = (short)(0) ;
      nRcdDeleted_1456 = (short)(0) ;
   }

   public void processLevel19Y1455( )
   {
      /* Save parent mode. */
      sMode1455 = Gx_mode ;
      processNestedLevel19Y1456( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1455 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel19Y1455( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete19Y1455( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttohos3");
         if ( AnyError == 0 )
         {
            confirmValues19Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttohos3");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart19Y1455( )
   {
      /* Scan By routine */
      /* Using cursor T019Y14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound1455 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1455 = (short)(1) ;
         A10894Th_Maq = T019Y14_A10894Th_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
         A10913Th_FecParo = T019Y14_A10913Th_FecParo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19Y1455( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1455 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1455 = (short)(1) ;
         A10894Th_Maq = T019Y14_A10894Th_Maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
         A10913Th_FecParo = T019Y14_A10913Th_FecParo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
      }
   }

   public void scanEnd19Y1455( )
   {
      pr_default.close(12);
   }

   public void afterConfirm19Y1455( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19Y1455( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19Y1455( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19Y1455( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19Y1455( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19Y1455( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19Y1455( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTh_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Maq_Enabled), 5, 0), true);
      edtTh_FecParo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_FecParo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_FecParo_Enabled), 5, 0), true);
      edtTh_UltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_UltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_UltP_Enabled), 5, 0), true);
   }

   public void zm19Y1456( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10910Th_Paro = T019Y3_A10910Th_Paro[0] ;
            Z10911Th_Ope = T019Y3_A10911Th_Ope[0] ;
            Z10912Th_Tiempo = T019Y3_A10912Th_Tiempo[0] ;
         }
         else
         {
            Z10910Th_Paro = A10910Th_Paro ;
            Z10911Th_Ope = A10911Th_Ope ;
            Z10912Th_Tiempo = A10912Th_Tiempo ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z10894Th_Maq = A10894Th_Maq ;
         Z10913Th_FecParo = A10913Th_FecParo ;
         Z10909Th_LinP = A10909Th_LinP ;
         Z10910Th_Paro = A10910Th_Paro ;
         Z10911Th_Ope = A10911Th_Ope ;
         Z10912Th_Tiempo = A10912Th_Tiempo ;
      }
   }

   public void standaloneNotModal19Y1456( )
   {
   }

   public void standaloneModal19Y1456( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTh_LinP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTh_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_LinP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtTh_LinP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTh_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_LinP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load19Y1456( )
   {
      /* Using cursor T019Y15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo, Short.valueOf(A10909Th_LinP)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1456 = (short)(1) ;
         A10910Th_Paro = T019Y15_A10910Th_Paro[0] ;
         n10910Th_Paro = T019Y15_n10910Th_Paro[0] ;
         A10911Th_Ope = T019Y15_A10911Th_Ope[0] ;
         n10911Th_Ope = T019Y15_n10911Th_Ope[0] ;
         A10912Th_Tiempo = T019Y15_A10912Th_Tiempo[0] ;
         n10912Th_Tiempo = T019Y15_n10912Th_Tiempo[0] ;
         zm19Y1456( -3) ;
      }
      pr_default.close(13);
      onLoadActions19Y1456( ) ;
   }

   public void onLoadActions19Y1456( )
   {
   }

   public void checkExtendedTable19Y1456( )
   {
      nIsDirty_1456 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal19Y1456( ) ;
   }

   public void closeExtendedTableCursors19Y1456( )
   {
   }

   public void enableDisable19Y1456( )
   {
   }

   public void getKey19Y1456( )
   {
      /* Using cursor T019Y16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo, Short.valueOf(A10909Th_LinP)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1456 = (short)(1) ;
      }
      else
      {
         RcdFound1456 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey19Y1456( )
   {
      /* Using cursor T019Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo, Short.valueOf(A10909Th_LinP)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T019Y3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm19Y1456( 3) ;
         RcdFound1456 = (short)(1) ;
         initializeNonKey19Y1456( ) ;
         A10909Th_LinP = T019Y3_A10909Th_LinP[0] ;
         A10910Th_Paro = T019Y3_A10910Th_Paro[0] ;
         n10910Th_Paro = T019Y3_n10910Th_Paro[0] ;
         A10911Th_Ope = T019Y3_A10911Th_Ope[0] ;
         n10911Th_Ope = T019Y3_n10911Th_Ope[0] ;
         A10912Th_Tiempo = T019Y3_A10912Th_Tiempo[0] ;
         n10912Th_Tiempo = T019Y3_n10912Th_Tiempo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10894Th_Maq = A10894Th_Maq ;
         Z10913Th_FecParo = A10913Th_FecParo ;
         Z10909Th_LinP = A10909Th_LinP ;
         sMode1456 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal19Y1456( ) ;
         load19Y1456( ) ;
         Gx_mode = sMode1456 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1456 = (short)(0) ;
         initializeNonKey19Y1456( ) ;
         sMode1456 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal19Y1456( ) ;
         Gx_mode = sMode1456 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes19Y1456( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency19Y1456( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo, Short.valueOf(A10909Th_LinP)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTOHOS2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z10910Th_Paro != T019Y2_A10910Th_Paro[0] ) || ( Z10911Th_Ope != T019Y2_A10911Th_Ope[0] ) || ( Z10912Th_Tiempo != T019Y2_A10912Th_Tiempo[0] ) )
         {
            if ( Z10910Th_Paro != T019Y2_A10910Th_Paro[0] )
            {
               GXutil.writeLogln("ttohos3:[seudo value changed for attri]"+"Th_Paro");
               GXutil.writeLogRaw("Old: ",Z10910Th_Paro);
               GXutil.writeLogRaw("Current: ",T019Y2_A10910Th_Paro[0]);
            }
            if ( Z10911Th_Ope != T019Y2_A10911Th_Ope[0] )
            {
               GXutil.writeLogln("ttohos3:[seudo value changed for attri]"+"Th_Ope");
               GXutil.writeLogRaw("Old: ",Z10911Th_Ope);
               GXutil.writeLogRaw("Current: ",T019Y2_A10911Th_Ope[0]);
            }
            if ( Z10912Th_Tiempo != T019Y2_A10912Th_Tiempo[0] )
            {
               GXutil.writeLogln("ttohos3:[seudo value changed for attri]"+"Th_Tiempo");
               GXutil.writeLogRaw("Old: ",Z10912Th_Tiempo);
               GXutil.writeLogRaw("Current: ",T019Y2_A10912Th_Tiempo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTOHOS2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19Y1456( )
   {
      beforeValidate19Y1456( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19Y1456( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19Y1456( 0) ;
         checkOptimisticConcurrency19Y1456( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19Y1456( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19Y1456( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019Y17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo, Short.valueOf(A10909Th_LinP), Boolean.valueOf(n10910Th_Paro), Short.valueOf(A10910Th_Paro), Boolean.valueOf(n10911Th_Ope), Integer.valueOf(A10911Th_Ope), Boolean.valueOf(n10912Th_Tiempo), Integer.valueOf(A10912Th_Tiempo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS2");
                  if ( (pr_default.getStatus(15) == 1) )
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
            load19Y1456( ) ;
         }
         endLevel19Y1456( ) ;
      }
      closeExtendedTableCursors19Y1456( ) ;
   }

   public void update19Y1456( )
   {
      beforeValidate19Y1456( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19Y1456( ) ;
      }
      if ( ( nIsMod_1456 != 0 ) || ( nIsDirty_1456 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency19Y1456( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm19Y1456( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate19Y1456( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T019Y18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n10910Th_Paro), Short.valueOf(A10910Th_Paro), Boolean.valueOf(n10911Th_Ope), Integer.valueOf(A10911Th_Ope), Boolean.valueOf(n10912Th_Tiempo), Integer.valueOf(A10912Th_Tiempo), A396EmprCod, A10894Th_Maq, A10913Th_FecParo, Short.valueOf(A10909Th_LinP)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS2");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTOHOS2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate19Y1456( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey19Y1456( ) ;
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
            endLevel19Y1456( ) ;
         }
      }
      closeExtendedTableCursors19Y1456( ) ;
   }

   public void deferredUpdate19Y1456( )
   {
   }

   public void delete19Y1456( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19Y1456( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19Y1456( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19Y1456( ) ;
         afterConfirm19Y1456( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19Y1456( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T019Y19 */
               pr_default.execute(17, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo, Short.valueOf(A10909Th_LinP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTOHOS2");
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
      sMode1456 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel19Y1456( ) ;
      Gx_mode = sMode1456 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19Y1456( )
   {
      standaloneModal19Y1456( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel19Y1456( )
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

   public void scanStart19Y1456( )
   {
      /* Scan By routine */
      /* Using cursor T019Y20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A10894Th_Maq, A10913Th_FecParo});
      RcdFound1456 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1456 = (short)(1) ;
         A10909Th_LinP = T019Y20_A10909Th_LinP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19Y1456( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1456 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1456 = (short)(1) ;
         A10909Th_LinP = T019Y20_A10909Th_LinP[0] ;
      }
   }

   public void scanEnd19Y1456( )
   {
      pr_default.close(18);
   }

   public void afterConfirm19Y1456( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19Y1456( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19Y1456( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19Y1456( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19Y1456( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19Y1456( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19Y1456( )
   {
      edtTh_LinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_LinP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtTh_Paro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Paro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Paro_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtTh_Ope_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Ope_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Ope_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtTh_Tiempo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_Tiempo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_Tiempo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes19Y1456( )
   {
   }

   public void send_integrity_lvl_hashes19Y1455( )
   {
   }

   public void subsflControlProps_451456( )
   {
      edtavnRcdDeleted_1456_Internalname = "vNRCDDELETED_1456_"+sGXsfl_45_idx ;
      edtTh_LinP_Internalname = "TH_LINP_"+sGXsfl_45_idx ;
      edtTh_Paro_Internalname = "TH_PARO_"+sGXsfl_45_idx ;
      edtTh_Ope_Internalname = "TH_OPE_"+sGXsfl_45_idx ;
      edtTh_Tiempo_Internalname = "TH_TIEMPO_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451456( )
   {
      edtavnRcdDeleted_1456_Internalname = "vNRCDDELETED_1456_"+sGXsfl_45_fel_idx ;
      edtTh_LinP_Internalname = "TH_LINP_"+sGXsfl_45_fel_idx ;
      edtTh_Paro_Internalname = "TH_PARO_"+sGXsfl_45_fel_idx ;
      edtTh_Ope_Internalname = "TH_OPE_"+sGXsfl_45_fel_idx ;
      edtTh_Tiempo_Internalname = "TH_TIEMPO_"+sGXsfl_45_fel_idx ;
   }

   public void addRow19Y1456( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451456( ) ;
      sendRow19Y1456( ) ;
   }

   public void sendRow19Y1456( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1456_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1456_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1456_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1456), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1456), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1456_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1456_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1456_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_LinP_Internalname,GXutil.ltrim( localUtil.ntoc( A10909Th_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10909Th_LinP), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_LinP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_LinP_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1456_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_Paro_Internalname,GXutil.ltrim( localUtil.ntoc( A10910Th_Paro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTh_Paro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10910Th_Paro), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10910Th_Paro), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_Paro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_Paro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1456_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_Ope_Internalname,GXutil.ltrim( localUtil.ntoc( A10911Th_Ope, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTh_Ope_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10911Th_Ope), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10911Th_Ope), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_Ope_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_Ope_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1456_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTh_Tiempo_Internalname,GXutil.ltrim( localUtil.ntoc( A10912Th_Tiempo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTh_Tiempo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10912Th_Tiempo), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10912Th_Tiempo), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTh_Tiempo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTh_Tiempo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes19Y1456( ) ;
      GXCCtl = "Z10909Th_LinP_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10909Th_LinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10910Th_Paro_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10910Th_Paro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10911Th_Ope_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10911Th_Ope, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10912Th_Tiempo_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10912Th_Tiempo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1456_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1456_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1456_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1456, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1456_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1456_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_LINP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_LinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_PARO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Paro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_OPE_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Ope_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TH_TIEMPO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Tiempo_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow19Y1456( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451456( ) ;
      edtavnRcdDeleted_1456_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1456_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_LinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_LINP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_Paro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_PARO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_Ope_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_OPE_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTh_Tiempo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TH_TIEMPO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1456_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1456_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1456");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1456_Internalname ;
         wbErr = true ;
         nRcdDeleted_1456 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1456 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1456_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_LinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_LinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TH_LINP_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_LinP_Internalname ;
         wbErr = true ;
         A10909Th_LinP = (short)(0) ;
      }
      else
      {
         A10909Th_LinP = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_LinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Paro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Paro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TH_PARO_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_Paro_Internalname ;
         wbErr = true ;
         A10910Th_Paro = (short)(0) ;
         n10910Th_Paro = false ;
      }
      else
      {
         A10910Th_Paro = (short)(localUtil.ctol( httpContext.cgiGet( edtTh_Paro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10910Th_Paro = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Ope_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Ope_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "TH_OPE_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_Ope_Internalname ;
         wbErr = true ;
         A10911Th_Ope = 0 ;
         n10911Th_Ope = false ;
      }
      else
      {
         A10911Th_Ope = (int)(localUtil.ctol( httpContext.cgiGet( edtTh_Ope_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10911Th_Ope = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Tiempo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTh_Tiempo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "TH_TIEMPO_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTh_Tiempo_Internalname ;
         wbErr = true ;
         A10912Th_Tiempo = 0 ;
         n10912Th_Tiempo = false ;
      }
      else
      {
         A10912Th_Tiempo = (int)(localUtil.ctol( httpContext.cgiGet( edtTh_Tiempo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10912Th_Tiempo = false ;
      }
      GXCCtl = "Z10909Th_LinP_" + sGXsfl_45_idx ;
      Z10909Th_LinP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10910Th_Paro_" + sGXsfl_45_idx ;
      Z10910Th_Paro = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10911Th_Ope_" + sGXsfl_45_idx ;
      Z10911Th_Ope = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10912Th_Tiempo_" + sGXsfl_45_idx ;
      Z10912Th_Tiempo = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1456_" + sGXsfl_45_idx ;
      nRcdDeleted_1456 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1456_" + sGXsfl_45_idx ;
      nRcdExists_1456 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1456_" + sGXsfl_45_idx ;
      nIsMod_1456 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTh_LinP_Enabled = edtTh_LinP_Enabled ;
   }

   public void confirmValues19Y0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451456( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451456( ) ;
         httpContext.changePostValue( "Z10909Th_LinP_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10909Th_LinP_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10909Th_LinP_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10910Th_Paro_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10910Th_Paro_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10910Th_Paro_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10911Th_Ope_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10911Th_Ope_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10911Th_Ope_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10912Th_Tiempo_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10912Th_Tiempo_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10912Th_Tiempo_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttohos3", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10894Th_Maq", GXutil.rtrim( Z10894Th_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10913Th_FecParo", localUtil.dtoc( Z10913Th_FecParo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10908Th_UltP", GXutil.ltrim( localUtil.ntoc( Z10908Th_UltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttohos3", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTOHOS3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PAROS INFOTINT", "") ;
   }

   public void initializeNonKey19Y1455( )
   {
      A10908Th_UltP = (short)(0) ;
      n10908Th_UltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10908Th_UltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10908Th_UltP), 4, 0));
      Z10908Th_UltP = (short)(0) ;
   }

   public void initAll19Y1455( )
   {
      A10894Th_Maq = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10894Th_Maq", A10894Th_Maq);
      A10913Th_FecParo = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10913Th_FecParo", localUtil.format(A10913Th_FecParo, "99/99/99"));
      initializeNonKey19Y1455( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey19Y1456( )
   {
      A10910Th_Paro = (short)(0) ;
      n10910Th_Paro = false ;
      A10911Th_Ope = 0 ;
      n10911Th_Ope = false ;
      A10912Th_Tiempo = 0 ;
      n10912Th_Tiempo = false ;
      Z10910Th_Paro = (short)(0) ;
      Z10911Th_Ope = 0 ;
      Z10912Th_Tiempo = 0 ;
   }

   public void initAll19Y1456( )
   {
      A10909Th_LinP = (short)(0) ;
      initializeNonKey19Y1456( ) ;
   }

   public void standaloneModalInsert19Y1456( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156964", true, true);
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
      httpContext.AddJavascriptSource("ttohos3.js", "?2026824156964", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1456( )
   {
      edtTh_LinP_Enabled = defedtTh_LinP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTh_LinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTh_LinP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void startgridcontrol45( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1456, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1456_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10909Th_LinP, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_LinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10910Th_Paro, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Paro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10911Th_Ope, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Ope_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10912Th_Tiempo, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTh_Tiempo_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTh_Maq_Internalname = "TH_MAQ" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTh_FecParo_Internalname = "TH_FECPARO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTh_UltP_Internalname = "TH_ULTP" ;
      edtavnRcdDeleted_1456_Internalname = "vNRCDDELETED_1456" ;
      edtTh_LinP_Internalname = "TH_LINP" ;
      edtTh_Paro_Internalname = "TH_PARO" ;
      edtTh_Ope_Internalname = "TH_OPE" ;
      edtTh_Tiempo_Internalname = "TH_TIEMPO" ;
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
      Form.setCaption( httpContext.getMessage( "PAROS INFOTINT", "") );
      edtTh_Tiempo_Jsonclick = "" ;
      edtTh_Ope_Jsonclick = "" ;
      edtTh_Paro_Jsonclick = "" ;
      edtTh_LinP_Jsonclick = "" ;
      edtavnRcdDeleted_1456_Jsonclick = "" ;
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
      edtTh_Tiempo_Enabled = 1 ;
      edtTh_Ope_Enabled = 1 ;
      edtTh_Paro_Enabled = 1 ;
      edtTh_LinP_Enabled = 1 ;
      edtavnRcdDeleted_1456_Enabled = 1 ;
      edtTh_UltP_Jsonclick = "" ;
      edtTh_UltP_Backcolor = (int)(0xFFFFFF) ;
      edtTh_UltP_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTh_FecParo_Jsonclick = "" ;
      edtTh_FecParo_Backcolor = (int)(0xFFFFFF) ;
      edtTh_FecParo_Enabled = 1 ;
      edtTh_Maq_Jsonclick = "" ;
      edtTh_Maq_Backcolor = (int)(0xFFFFFF) ;
      edtTh_Maq_Enabled = 1 ;
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
      subsflControlProps_451456( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal19Y1456( ) ;
         standaloneModal19Y1456( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow19Y1456( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451456( ) ;
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
      /* Using cursor T019Y21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019Y21_A407EmprNom[0] ;
      n407EmprNom = T019Y21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      GX_FocusControl = edtTh_UltP_Internalname ;
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

   public void valid_Th_fecparo( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10908Th_UltP", GXutil.ltrim( localUtil.ntoc( A10908Th_UltP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10894Th_Maq", GXutil.rtrim( Z10894Th_Maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10913Th_FecParo", localUtil.format(Z10913Th_FecParo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10908Th_UltP", GXutil.ltrim( localUtil.ntoc( Z10908Th_UltP, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_TH_MAQ","{handler:'valid_Th_maq',iparms:[]");
      setEventMetadata("VALID_TH_MAQ",",oparms:[]}");
      setEventMetadata("VALID_TH_FECPARO","{handler:'valid_Th_fecparo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10894Th_Maq',fld:'TH_MAQ',pic:''},{av:'A10913Th_FecParo',fld:'TH_FECPARO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TH_FECPARO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10908Th_UltP',fld:'TH_ULTP',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10894Th_Maq'},{av:'Z10913Th_FecParo'},{av:'Z407EmprNom'},{av:'Z10908Th_UltP'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TH_LINP","{handler:'valid_Th_linp',iparms:[]");
      setEventMetadata("VALID_TH_LINP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Th_tiempo',iparms:[]");
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
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10894Th_Maq = "" ;
      Z10913Th_FecParo = GXutil.nullDate() ;
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
      A10894Th_Maq = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10913Th_FecParo = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1456 = "" ;
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
      sMode1455 = "" ;
      GXCCtl = "" ;
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
      T019Y6_A407EmprNom = new String[] {""} ;
      T019Y6_n407EmprNom = new boolean[] {false} ;
      T019Y7_A10894Th_Maq = new String[] {""} ;
      T019Y7_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y7_A407EmprNom = new String[] {""} ;
      T019Y7_n407EmprNom = new boolean[] {false} ;
      T019Y7_A10908Th_UltP = new short[1] ;
      T019Y7_n10908Th_UltP = new boolean[] {false} ;
      T019Y7_A396EmprCod = new String[] {""} ;
      T019Y8_A396EmprCod = new String[] {""} ;
      T019Y8_A10894Th_Maq = new String[] {""} ;
      T019Y8_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y5_A10894Th_Maq = new String[] {""} ;
      T019Y5_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y5_A10908Th_UltP = new short[1] ;
      T019Y5_n10908Th_UltP = new boolean[] {false} ;
      T019Y5_A396EmprCod = new String[] {""} ;
      T019Y9_A396EmprCod = new String[] {""} ;
      T019Y9_A10894Th_Maq = new String[] {""} ;
      T019Y9_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y10_A396EmprCod = new String[] {""} ;
      T019Y10_A10894Th_Maq = new String[] {""} ;
      T019Y10_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y4_A10894Th_Maq = new String[] {""} ;
      T019Y4_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y4_A10908Th_UltP = new short[1] ;
      T019Y4_n10908Th_UltP = new boolean[] {false} ;
      T019Y4_A396EmprCod = new String[] {""} ;
      T019Y14_A396EmprCod = new String[] {""} ;
      T019Y14_A10894Th_Maq = new String[] {""} ;
      T019Y14_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y15_A396EmprCod = new String[] {""} ;
      T019Y15_A10894Th_Maq = new String[] {""} ;
      T019Y15_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y15_A10909Th_LinP = new short[1] ;
      T019Y15_A10910Th_Paro = new short[1] ;
      T019Y15_n10910Th_Paro = new boolean[] {false} ;
      T019Y15_A10911Th_Ope = new int[1] ;
      T019Y15_n10911Th_Ope = new boolean[] {false} ;
      T019Y15_A10912Th_Tiempo = new int[1] ;
      T019Y15_n10912Th_Tiempo = new boolean[] {false} ;
      T019Y16_A396EmprCod = new String[] {""} ;
      T019Y16_A10894Th_Maq = new String[] {""} ;
      T019Y16_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y16_A10909Th_LinP = new short[1] ;
      T019Y3_A396EmprCod = new String[] {""} ;
      T019Y3_A10894Th_Maq = new String[] {""} ;
      T019Y3_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y3_A10909Th_LinP = new short[1] ;
      T019Y3_A10910Th_Paro = new short[1] ;
      T019Y3_n10910Th_Paro = new boolean[] {false} ;
      T019Y3_A10911Th_Ope = new int[1] ;
      T019Y3_n10911Th_Ope = new boolean[] {false} ;
      T019Y3_A10912Th_Tiempo = new int[1] ;
      T019Y3_n10912Th_Tiempo = new boolean[] {false} ;
      T019Y2_A396EmprCod = new String[] {""} ;
      T019Y2_A10894Th_Maq = new String[] {""} ;
      T019Y2_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y2_A10909Th_LinP = new short[1] ;
      T019Y2_A10910Th_Paro = new short[1] ;
      T019Y2_n10910Th_Paro = new boolean[] {false} ;
      T019Y2_A10911Th_Ope = new int[1] ;
      T019Y2_n10911Th_Ope = new boolean[] {false} ;
      T019Y2_A10912Th_Tiempo = new int[1] ;
      T019Y2_n10912Th_Tiempo = new boolean[] {false} ;
      T019Y20_A396EmprCod = new String[] {""} ;
      T019Y20_A10894Th_Maq = new String[] {""} ;
      T019Y20_A10913Th_FecParo = new java.util.Date[] {GXutil.nullDate()} ;
      T019Y20_A10909Th_LinP = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T019Y21_A407EmprNom = new String[] {""} ;
      T019Y21_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10894Th_Maq = "" ;
      ZZ10913Th_FecParo = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttohos3__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttohos3__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttohos3__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttohos3__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttohos3__default(),
         new Object[] {
             new Object[] {
            T019Y2_A396EmprCod, T019Y2_A10894Th_Maq, T019Y2_A10913Th_FecParo, T019Y2_A10909Th_LinP, T019Y2_A10910Th_Paro, T019Y2_n10910Th_Paro, T019Y2_A10911Th_Ope, T019Y2_n10911Th_Ope, T019Y2_A10912Th_Tiempo, T019Y2_n10912Th_Tiempo
            }
            , new Object[] {
            T019Y3_A396EmprCod, T019Y3_A10894Th_Maq, T019Y3_A10913Th_FecParo, T019Y3_A10909Th_LinP, T019Y3_A10910Th_Paro, T019Y3_n10910Th_Paro, T019Y3_A10911Th_Ope, T019Y3_n10911Th_Ope, T019Y3_A10912Th_Tiempo, T019Y3_n10912Th_Tiempo
            }
            , new Object[] {
            T019Y4_A10894Th_Maq, T019Y4_A10913Th_FecParo, T019Y4_A10908Th_UltP, T019Y4_n10908Th_UltP, T019Y4_A396EmprCod
            }
            , new Object[] {
            T019Y5_A10894Th_Maq, T019Y5_A10913Th_FecParo, T019Y5_A10908Th_UltP, T019Y5_n10908Th_UltP, T019Y5_A396EmprCod
            }
            , new Object[] {
            T019Y6_A407EmprNom, T019Y6_n407EmprNom
            }
            , new Object[] {
            T019Y7_A10894Th_Maq, T019Y7_A10913Th_FecParo, T019Y7_A407EmprNom, T019Y7_n407EmprNom, T019Y7_A10908Th_UltP, T019Y7_n10908Th_UltP, T019Y7_A396EmprCod
            }
            , new Object[] {
            T019Y8_A396EmprCod, T019Y8_A10894Th_Maq, T019Y8_A10913Th_FecParo
            }
            , new Object[] {
            T019Y9_A396EmprCod, T019Y9_A10894Th_Maq, T019Y9_A10913Th_FecParo
            }
            , new Object[] {
            T019Y10_A396EmprCod, T019Y10_A10894Th_Maq, T019Y10_A10913Th_FecParo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019Y14_A396EmprCod, T019Y14_A10894Th_Maq, T019Y14_A10913Th_FecParo
            }
            , new Object[] {
            T019Y15_A396EmprCod, T019Y15_A10894Th_Maq, T019Y15_A10913Th_FecParo, T019Y15_A10909Th_LinP, T019Y15_A10910Th_Paro, T019Y15_n10910Th_Paro, T019Y15_A10911Th_Ope, T019Y15_n10911Th_Ope, T019Y15_A10912Th_Tiempo, T019Y15_n10912Th_Tiempo
            }
            , new Object[] {
            T019Y16_A396EmprCod, T019Y16_A10894Th_Maq, T019Y16_A10913Th_FecParo, T019Y16_A10909Th_LinP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019Y20_A396EmprCod, T019Y20_A10894Th_Maq, T019Y20_A10913Th_FecParo, T019Y20_A10909Th_LinP
            }
            , new Object[] {
            T019Y21_A407EmprNom, T019Y21_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTOHOS3" ;
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
   private short Z10908Th_UltP ;
   private short Z10909Th_LinP ;
   private short Z10910Th_Paro ;
   private short nRcdDeleted_1456 ;
   private short nRcdExists_1456 ;
   private short nIsMod_1456 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10908Th_UltP ;
   private short nBlankRcdCount1456 ;
   private short RcdFound1456 ;
   private short nBlankRcdUsr1456 ;
   private short A10909Th_LinP ;
   private short A10910Th_Paro ;
   private short RcdFound1455 ;
   private short nIsDirty_1455 ;
   private short nIsDirty_1456 ;
   private short ZZ10908Th_UltP ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z10911Th_Ope ;
   private int Z10912Th_Tiempo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTh_Maq_Enabled ;
   private int edtTh_FecParo_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTh_UltP_Enabled ;
   private int edtavnRcdDeleted_1456_Enabled ;
   private int edtTh_LinP_Enabled ;
   private int edtTh_Paro_Enabled ;
   private int edtTh_Ope_Enabled ;
   private int edtTh_Tiempo_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10911Th_Ope ;
   private int A10912Th_Tiempo ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtTh_LinP_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTh_UltP_Backcolor ;
   private int edtTh_FecParo_Backcolor ;
   private int edtTh_Maq_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10894Th_Maq ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTh_Maq_Internalname ;
   private String sGXsfl_45_idx="0001" ;
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
   private String A10894Th_Maq ;
   private String edtTh_Maq_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTh_FecParo_Internalname ;
   private String edtTh_FecParo_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTh_UltP_Internalname ;
   private String edtTh_UltP_Jsonclick ;
   private String sMode1456 ;
   private String edtavnRcdDeleted_1456_Internalname ;
   private String edtTh_LinP_Internalname ;
   private String edtTh_Paro_Internalname ;
   private String edtTh_Ope_Internalname ;
   private String edtTh_Tiempo_Internalname ;
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
   private String sMode1455 ;
   private String GXCCtl ;
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
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1456_Jsonclick ;
   private String edtTh_LinP_Jsonclick ;
   private String edtTh_Paro_Jsonclick ;
   private String edtTh_Ope_Jsonclick ;
   private String edtTh_Tiempo_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ10894Th_Maq ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10913Th_FecParo ;
   private java.util.Date A10913Th_FecParo ;
   private java.util.Date ZZ10913Th_FecParo ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10908Th_UltP ;
   private boolean returnInSub ;
   private boolean n10910Th_Paro ;
   private boolean n10911Th_Ope ;
   private boolean n10912Th_Tiempo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T019Y6_A407EmprNom ;
   private boolean[] T019Y6_n407EmprNom ;
   private String[] T019Y7_A10894Th_Maq ;
   private java.util.Date[] T019Y7_A10913Th_FecParo ;
   private String[] T019Y7_A407EmprNom ;
   private boolean[] T019Y7_n407EmprNom ;
   private short[] T019Y7_A10908Th_UltP ;
   private boolean[] T019Y7_n10908Th_UltP ;
   private String[] T019Y7_A396EmprCod ;
   private String[] T019Y8_A396EmprCod ;
   private String[] T019Y8_A10894Th_Maq ;
   private java.util.Date[] T019Y8_A10913Th_FecParo ;
   private String[] T019Y5_A10894Th_Maq ;
   private java.util.Date[] T019Y5_A10913Th_FecParo ;
   private short[] T019Y5_A10908Th_UltP ;
   private boolean[] T019Y5_n10908Th_UltP ;
   private String[] T019Y5_A396EmprCod ;
   private String[] T019Y9_A396EmprCod ;
   private String[] T019Y9_A10894Th_Maq ;
   private java.util.Date[] T019Y9_A10913Th_FecParo ;
   private String[] T019Y10_A396EmprCod ;
   private String[] T019Y10_A10894Th_Maq ;
   private java.util.Date[] T019Y10_A10913Th_FecParo ;
   private String[] T019Y4_A10894Th_Maq ;
   private java.util.Date[] T019Y4_A10913Th_FecParo ;
   private short[] T019Y4_A10908Th_UltP ;
   private boolean[] T019Y4_n10908Th_UltP ;
   private String[] T019Y4_A396EmprCod ;
   private String[] T019Y14_A396EmprCod ;
   private String[] T019Y14_A10894Th_Maq ;
   private java.util.Date[] T019Y14_A10913Th_FecParo ;
   private String[] T019Y15_A396EmprCod ;
   private String[] T019Y15_A10894Th_Maq ;
   private java.util.Date[] T019Y15_A10913Th_FecParo ;
   private short[] T019Y15_A10909Th_LinP ;
   private short[] T019Y15_A10910Th_Paro ;
   private boolean[] T019Y15_n10910Th_Paro ;
   private int[] T019Y15_A10911Th_Ope ;
   private boolean[] T019Y15_n10911Th_Ope ;
   private int[] T019Y15_A10912Th_Tiempo ;
   private boolean[] T019Y15_n10912Th_Tiempo ;
   private String[] T019Y16_A396EmprCod ;
   private String[] T019Y16_A10894Th_Maq ;
   private java.util.Date[] T019Y16_A10913Th_FecParo ;
   private short[] T019Y16_A10909Th_LinP ;
   private String[] T019Y3_A396EmprCod ;
   private String[] T019Y3_A10894Th_Maq ;
   private java.util.Date[] T019Y3_A10913Th_FecParo ;
   private short[] T019Y3_A10909Th_LinP ;
   private short[] T019Y3_A10910Th_Paro ;
   private boolean[] T019Y3_n10910Th_Paro ;
   private int[] T019Y3_A10911Th_Ope ;
   private boolean[] T019Y3_n10911Th_Ope ;
   private int[] T019Y3_A10912Th_Tiempo ;
   private boolean[] T019Y3_n10912Th_Tiempo ;
   private String[] T019Y2_A396EmprCod ;
   private String[] T019Y2_A10894Th_Maq ;
   private java.util.Date[] T019Y2_A10913Th_FecParo ;
   private short[] T019Y2_A10909Th_LinP ;
   private short[] T019Y2_A10910Th_Paro ;
   private boolean[] T019Y2_n10910Th_Paro ;
   private int[] T019Y2_A10911Th_Ope ;
   private boolean[] T019Y2_n10911Th_Ope ;
   private int[] T019Y2_A10912Th_Tiempo ;
   private boolean[] T019Y2_n10912Th_Tiempo ;
   private String[] T019Y20_A396EmprCod ;
   private String[] T019Y20_A10894Th_Maq ;
   private java.util.Date[] T019Y20_A10913Th_FecParo ;
   private short[] T019Y20_A10909Th_LinP ;
   private String[] T019Y21_A407EmprNom ;
   private boolean[] T019Y21_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttohos3__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttohos3__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttohos3__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttohos3__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttohos3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T019Y2", "SELECT EmprCod, Th_Maq, Th_FecParo, Th_LinP, Th_Paro, Th_Ope, Th_Tiempo FROM TXPTOHOS2 WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ? AND Th_LinP = ?  FOR UPDATE OF Th_Paro, Th_Ope, Th_Tiempo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y3", "SELECT EmprCod, Th_Maq, Th_FecParo, Th_LinP, Th_Paro, Th_Ope, Th_Tiempo FROM TXPTOHOS2 WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ? AND Th_LinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y4", "SELECT Th_Maq, Th_FecParo, Th_UltP, EmprCod FROM TXPTOHOS3 WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ?  FOR UPDATE OF Th_UltP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y5", "SELECT Th_Maq, Th_FecParo, Th_UltP, EmprCod FROM TXPTOHOS3 WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y7", "SELECT /*+ FIRST_ROWS(100) */ TM1.Th_Maq, TM1.Th_FecParo, T2.EmprNom, TM1.Th_UltP, TM1.EmprCod FROM (TXPTOHOS3 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Th_Maq = ? and TM1.Th_FecParo = ? ORDER BY TM1.EmprCod, TM1.Th_Maq, TM1.Th_FecParo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Th_Maq, Th_FecParo FROM TXPTOHOS3 WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Th_Maq, Th_FecParo FROM TXPTOHOS3 WHERE ( Th_Maq > ? or Th_Maq = ? and Th_FecParo > ?) and EmprCod = ? ORDER BY EmprCod, Th_Maq, Th_FecParo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019Y10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Th_Maq, Th_FecParo FROM TXPTOHOS3 WHERE ( Th_Maq < ? or Th_Maq = ? and Th_FecParo < ?) and EmprCod = ? ORDER BY EmprCod DESC, Th_Maq DESC, Th_FecParo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T019Y11", "INSERT INTO TXPTOHOS3(Th_Maq, Th_FecParo, Th_UltP, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPTOHOS3")
         ,new UpdateCursor("T019Y12", "UPDATE TXPTOHOS3 SET Th_UltP=?  WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ?", GX_NOMASK, "TXPTOHOS3")
         ,new UpdateCursor("T019Y13", "DELETE FROM TXPTOHOS3  WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ?", GX_NOMASK, "TXPTOHOS3")
         ,new ForEachCursor("T019Y14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Th_Maq, Th_FecParo FROM TXPTOHOS3 WHERE EmprCod = ? ORDER BY EmprCod, Th_Maq, Th_FecParo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y15", "SELECT EmprCod, Th_Maq, Th_FecParo, Th_LinP, Th_Paro, Th_Ope, Th_Tiempo FROM TXPTOHOS2 WHERE EmprCod = ? and Th_Maq = ? and Th_FecParo = ? and Th_LinP = ? ORDER BY EmprCod, Th_Maq, Th_FecParo, Th_LinP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y16", "SELECT EmprCod, Th_Maq, Th_FecParo, Th_LinP FROM TXPTOHOS2 WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ? AND Th_LinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T019Y17", "INSERT INTO TXPTOHOS2(EmprCod, Th_Maq, Th_FecParo, Th_LinP, Th_Paro, Th_Ope, Th_Tiempo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTOHOS2")
         ,new UpdateCursor("T019Y18", "UPDATE TXPTOHOS2 SET Th_Paro=?, Th_Ope=?, Th_Tiempo=?  WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ? AND Th_LinP = ?", GX_NOMASK, "TXPTOHOS2")
         ,new UpdateCursor("T019Y19", "DELETE FROM TXPTOHOS2  WHERE EmprCod = ? AND Th_Maq = ? AND Th_FecParo = ? AND Th_LinP = ?", GX_NOMASK, "TXPTOHOS2")
         ,new ForEachCursor("T019Y20", "SELECT EmprCod, Th_Maq, Th_FecParo, Th_LinP FROM TXPTOHOS2 WHERE EmprCod = ? and Th_Maq = ? and Th_FecParo = ? ORDER BY EmprCod, Th_Maq, Th_FecParo, Th_LinP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019Y21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDate(2, (java.util.Date)parms[1]);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               return;
            case 16 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 6);
               stmt.setDate(6, (java.util.Date)parms[8]);
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

