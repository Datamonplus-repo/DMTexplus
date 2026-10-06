package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxneces_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tablas NECES y NECMOV", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxNecCod_Internalname ;
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
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

   public tvxneces_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxneces_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxneces_impl.class ));
   }

   public tvxneces_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxNeces.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Necesidad", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxNeces.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxNecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14116VxNecCod, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxNecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14116VxNecCod), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14116VxNecCod), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxNecCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxNecCod_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Tipo de Pedido", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxNeces.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXNecPedTi_Internalname, GXutil.rtrim( A14132VXNecPedTi), GXutil.rtrim( localUtil.format( A14132VXNecPedTi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXNecPedTi_Jsonclick, 0, "", "", "", "", "", 1, edtVXNecPedTi_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxNeces.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código de Pedido", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxNeces.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxNecPedCo_Internalname, GXutil.ltrim( localUtil.ntoc( A14133VxNecPedCo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxNecPedCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14133VxNecPedCo), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14133VxNecPedCo), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxNecPedCo_Jsonclick, 0, "", "", "", "", "", 1, edtVxNecPedCo_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxNeces.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Línea de Pedido", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxNeces.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxNecPedLi_Internalname, GXutil.ltrim( localUtil.ntoc( A14139VxNecPedLi, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxNecPedLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14139VxNecPedLi), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14139VxNecPedLi), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxNecPedLi_Jsonclick, 0, "", "", "", "", "", 1, edtVxNecPedLi_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxNeces.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol40( ) ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1890 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1890 = (short)(1) ;
            scanStart1T81890( ) ;
            while ( RcdFound1890 != 0 )
            {
               init_level_properties1890( ) ;
               getByPrimaryKey1T81890( ) ;
               addRow1T81890( ) ;
               scanNext1T81890( ) ;
            }
            scanEnd1T81890( ) ;
            nBlankRcdCount1890 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1T81890( ) ;
         standaloneModal1T81890( ) ;
         sMode1890 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1T81890( ) ;
            edtavnRcdDeleted_1890_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1890_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1890_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1890_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtVxNecMov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMOV_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxNecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMov_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtVxNecMTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMTIP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxNecMTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMTip_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtVxNecMDoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMDOC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxNecMDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMDoc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtVxNecMCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMCAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxNecMCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMCan_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtVxNecMOFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMOFAB_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxNecMOFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMOFab_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtVxNecMAnu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMANU_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxNecMAnu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMAnu_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1890 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1T81890( ) ;
            }
            sendRow1T81890( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1890 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1890 = (short)(5) ;
         nRcdExists_1890 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1T81890( ) ;
            while ( RcdFound1890 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401890( ) ;
               init_level_properties1890( ) ;
               standaloneNotModal1T81890( ) ;
               getByPrimaryKey1T81890( ) ;
               standaloneModal1T81890( ) ;
               addRow1T81890( ) ;
               scanNext1T81890( ) ;
            }
            scanEnd1T81890( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1890 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401890( ) ;
      initAll1T81890( ) ;
      init_level_properties1890( ) ;
      nRcdExists_1890 = (short)(0) ;
      nIsMod_1890 = (short)(0) ;
      nRcdDeleted_1890 = (short)(0) ;
      nBlankRcdCount1890 = (short)(nBlankRcdUsr1890+nBlankRcdCount1890) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1890 > 0 )
      {
         standaloneNotModal1T81890( ) ;
         standaloneModal1T81890( ) ;
         addRow1T81890( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtVxNecMov_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1890 = (short)(nBlankRcdCount1890-1) ;
      }
      Gx_mode = sMode1890 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxNeces.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxNeces.htm");
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
         Z14116VxNecCod = localUtil.ctol( httpContext.cgiGet( "Z14116VxNecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z14132VXNecPedTi = httpContext.cgiGet( "Z14132VXNecPedTi") ;
         Z14133VxNecPedCo = (int)(localUtil.ctol( httpContext.cgiGet( "Z14133VxNecPedCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14139VxNecPedLi = (short)(localUtil.ctol( httpContext.cgiGet( "Z14139VxNecPedLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXNECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxNecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14116VxNecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
         }
         else
         {
            A14116VxNecCod = localUtil.ctol( httpContext.cgiGet( edtVxNecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
         }
         A14132VXNecPedTi = httpContext.cgiGet( edtVXNecPedTi_Internalname) ;
         n14132VXNecPedTi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14132VXNecPedTi", A14132VXNecPedTi);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecPedCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecPedCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXNECPEDCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxNecPedCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14133VxNecPedCo = 0 ;
            n14133VxNecPedCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14133VxNecPedCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14133VxNecPedCo), 8, 0));
         }
         else
         {
            A14133VxNecPedCo = (int)(localUtil.ctol( httpContext.cgiGet( edtVxNecPedCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14133VxNecPedCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14133VxNecPedCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14133VxNecPedCo), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecPedLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecPedLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXNECPEDLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxNecPedLi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14139VxNecPedLi = (short)(0) ;
            n14139VxNecPedLi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14139VxNecPedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14139VxNecPedLi), 3, 0));
         }
         else
         {
            A14139VxNecPedLi = (short)(localUtil.ctol( httpContext.cgiGet( edtVxNecPedLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14139VxNecPedLi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14139VxNecPedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14139VxNecPedLi), 3, 0));
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
            A14116VxNecCod = GXutil.lval( httpContext.GetPar( "VxNecCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
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
            initAll1T81889( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1890_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1890_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1T81889( ) ;
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

   public void confirm_1T80( )
   {
      beforeValidate1T81889( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T81889( ) ;
         }
         else
         {
            checkExtendedTable1T81889( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1T81889( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1889 = Gx_mode ;
         confirm_1T81890( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1889 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1889 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1T80( ) ;
      }
   }

   public void confirm_1T81890( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1T81890( ) ;
         if ( ( nRcdExists_1890 != 0 ) || ( nIsMod_1890 != 0 ) )
         {
            getKey1T81890( ) ;
            if ( ( nRcdExists_1890 == 0 ) && ( nRcdDeleted_1890 == 0 ) )
            {
               if ( RcdFound1890 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1T81890( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1T81890( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1T81890( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "VXNECMOV_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxNecMov_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1890 != 0 )
               {
                  if ( nRcdDeleted_1890 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1T81890( ) ;
                     load1T81890( ) ;
                     beforeValidate1T81890( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1T81890( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1890 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1T81890( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1T81890( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1T81890( ) ;
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
                  if ( nRcdDeleted_1890 == 0 )
                  {
                     GXCCtl = "VXNECMOV_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxNecMov_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1890_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxNecMov_Internalname, GXutil.ltrim( localUtil.ntoc( A14117VxNecMov, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxNecMTip_Internalname, GXutil.rtrim( A14142VxNecMTip)) ;
         httpContext.changePostValue( edtVxNecMDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A14140VxNecMDoc, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxNecMCan_Internalname, GXutil.ltrim( localUtil.ntoc( A14143VxNecMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxNecMOFab_Internalname, GXutil.rtrim( A14141VxNecMOFab)) ;
         httpContext.changePostValue( edtVxNecMAnu_Internalname, GXutil.rtrim( A14144VxNecMAnu)) ;
         httpContext.changePostValue( "ZT_"+"Z14117VxNecMov_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14117VxNecMov, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14142VxNecMTip_"+sGXsfl_40_idx, GXutil.rtrim( Z14142VxNecMTip)) ;
         httpContext.changePostValue( "ZT_"+"Z14140VxNecMDoc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14140VxNecMDoc, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14143VxNecMCan_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14143VxNecMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14141VxNecMOFab_"+sGXsfl_40_idx, GXutil.rtrim( Z14141VxNecMOFab)) ;
         httpContext.changePostValue( "ZT_"+"Z14144VxNecMAnu_"+sGXsfl_40_idx, GXutil.rtrim( Z14144VxNecMAnu)) ;
         httpContext.changePostValue( "nRcdDeleted_1890_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1890_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1890_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1890 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1890_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1890_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMOV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMTIP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMDOC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMDoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMCAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMOFAB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMOFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMANU_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMAnu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1T80( )
   {
   }

   public void zm1T81889( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14132VXNecPedTi = T01T85_A14132VXNecPedTi[0] ;
            Z14133VxNecPedCo = T01T85_A14133VxNecPedCo[0] ;
            Z14139VxNecPedLi = T01T85_A14139VxNecPedLi[0] ;
         }
         else
         {
            Z14132VXNecPedTi = A14132VXNecPedTi ;
            Z14133VxNecPedCo = A14133VxNecPedCo ;
            Z14139VxNecPedLi = A14139VxNecPedLi ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z14116VxNecCod = A14116VxNecCod ;
         Z14132VXNecPedTi = A14132VXNecPedTi ;
         Z14133VxNecPedCo = A14133VxNecPedCo ;
         Z14139VxNecPedLi = A14139VxNecPedLi ;
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

   public void load1T81889( )
   {
      /* Using cursor T01T86 */
      pr_vertex.execute(4, new Object[] {Long.valueOf(A14116VxNecCod)});
      if ( (pr_vertex.getStatus(4) != 101) )
      {
         RcdFound1889 = (short)(1) ;
         A14132VXNecPedTi = T01T86_A14132VXNecPedTi[0] ;
         n14132VXNecPedTi = T01T86_n14132VXNecPedTi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14132VXNecPedTi", A14132VXNecPedTi);
         A14133VxNecPedCo = T01T86_A14133VxNecPedCo[0] ;
         n14133VxNecPedCo = T01T86_n14133VxNecPedCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14133VxNecPedCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14133VxNecPedCo), 8, 0));
         A14139VxNecPedLi = T01T86_A14139VxNecPedLi[0] ;
         n14139VxNecPedLi = T01T86_n14139VxNecPedLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14139VxNecPedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14139VxNecPedLi), 3, 0));
         zm1T81889( -1) ;
      }
      pr_vertex.close(4);
      onLoadActions1T81889( ) ;
   }

   public void onLoadActions1T81889( )
   {
   }

   public void checkExtendedTable1T81889( )
   {
      nIsDirty_1889 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1T81889( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1T81889( )
   {
      /* Using cursor T01T87 */
      pr_vertex.execute(5, new Object[] {Long.valueOf(A14116VxNecCod)});
      if ( (pr_vertex.getStatus(5) != 101) )
      {
         RcdFound1889 = (short)(1) ;
      }
      else
      {
         RcdFound1889 = (short)(0) ;
      }
      pr_vertex.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01T85 */
      pr_vertex.execute(3, new Object[] {Long.valueOf(A14116VxNecCod)});
      if ( (pr_vertex.getStatus(3) != 101) )
      {
         zm1T81889( 1) ;
         RcdFound1889 = (short)(1) ;
         A14116VxNecCod = T01T85_A14116VxNecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
         A14132VXNecPedTi = T01T85_A14132VXNecPedTi[0] ;
         n14132VXNecPedTi = T01T85_n14132VXNecPedTi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14132VXNecPedTi", A14132VXNecPedTi);
         A14133VxNecPedCo = T01T85_A14133VxNecPedCo[0] ;
         n14133VxNecPedCo = T01T85_n14133VxNecPedCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14133VxNecPedCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14133VxNecPedCo), 8, 0));
         A14139VxNecPedLi = T01T85_A14139VxNecPedLi[0] ;
         n14139VxNecPedLi = T01T85_n14139VxNecPedLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14139VxNecPedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14139VxNecPedLi), 3, 0));
         Z14116VxNecCod = A14116VxNecCod ;
         sMode1889 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1T81889( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1889 = (short)(0) ;
            initializeNonKey1T81889( ) ;
         }
         Gx_mode = sMode1889 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1889 = (short)(0) ;
         initializeNonKey1T81889( ) ;
         sMode1889 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1889 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_vertex.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1T81889( ) ;
      if ( RcdFound1889 == 0 )
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
      RcdFound1889 = (short)(0) ;
      /* Using cursor T01T88 */
      pr_vertex.execute(6, new Object[] {Long.valueOf(A14116VxNecCod)});
      if ( (pr_vertex.getStatus(6) != 101) )
      {
         while ( (pr_vertex.getStatus(6) != 101) && ( ( T01T88_A14116VxNecCod[0] < A14116VxNecCod ) ) )
         {
            pr_vertex.readNext(6);
         }
         if ( (pr_vertex.getStatus(6) != 101) && ( ( T01T88_A14116VxNecCod[0] > A14116VxNecCod ) ) )
         {
            A14116VxNecCod = T01T88_A14116VxNecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
            RcdFound1889 = (short)(1) ;
         }
      }
      pr_vertex.close(6);
   }

   public void move_previous( )
   {
      RcdFound1889 = (short)(0) ;
      /* Using cursor T01T89 */
      pr_vertex.execute(7, new Object[] {Long.valueOf(A14116VxNecCod)});
      if ( (pr_vertex.getStatus(7) != 101) )
      {
         while ( (pr_vertex.getStatus(7) != 101) && ( ( T01T89_A14116VxNecCod[0] > A14116VxNecCod ) ) )
         {
            pr_vertex.readNext(7);
         }
         if ( (pr_vertex.getStatus(7) != 101) && ( ( T01T89_A14116VxNecCod[0] < A14116VxNecCod ) ) )
         {
            A14116VxNecCod = T01T89_A14116VxNecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
            RcdFound1889 = (short)(1) ;
         }
      }
      pr_vertex.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T81889( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxNecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T81889( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1889 == 1 )
         {
            if ( A14116VxNecCod != Z14116VxNecCod )
            {
               A14116VxNecCod = Z14116VxNecCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXNECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxNecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxNecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1T81889( ) ;
               GX_FocusControl = edtVxNecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A14116VxNecCod != Z14116VxNecCod )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxNecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1T81889( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXNECCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxNecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxNecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1T81889( ) ;
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
      if ( A14116VxNecCod != Z14116VxNecCod )
      {
         A14116VxNecCod = Z14116VxNecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXNECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxNecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxNecCod_Internalname ;
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
      getKey1T81889( ) ;
      if ( RcdFound1889 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXNECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxNecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A14116VxNecCod != Z14116VxNecCod )
         {
            A14116VxNecCod = Z14116VxNecCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXNECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxNecCod_Internalname ;
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
         if ( A14116VxNecCod != Z14116VxNecCod )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXNECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxNecCod_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxneces");
      GX_FocusControl = edtVXNecPedTi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1T80( ) ;
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
      if ( RcdFound1889 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXNECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxNecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVXNecPedTi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1T81889( ) ;
      if ( RcdFound1889 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVXNecPedTi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1T81889( ) ;
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
      if ( RcdFound1889 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVXNecPedTi_Internalname ;
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
      if ( RcdFound1889 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVXNecPedTi_Internalname ;
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
      scanStart1T81889( ) ;
      if ( RcdFound1889 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1889 != 0 )
         {
            scanNext1T81889( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVXNecPedTi_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1T81889( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1T81889( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T84 */
         pr_vertex.execute(2, new Object[] {Long.valueOf(A14116VxNecCod)});
         if ( (pr_vertex.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"NECES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_vertex.getStatus(2) == 101) || ( GXutil.strcmp(Z14132VXNecPedTi, T01T84_A14132VXNecPedTi[0]) != 0 ) || ( Z14133VxNecPedCo != T01T84_A14133VxNecPedCo[0] ) || ( Z14139VxNecPedLi != T01T84_A14139VxNecPedLi[0] ) )
         {
            if ( GXutil.strcmp(Z14132VXNecPedTi, T01T84_A14132VXNecPedTi[0]) != 0 )
            {
               GXutil.writeLogln("tvxneces:[seudo value changed for attri]"+"VXNecPedTi");
               GXutil.writeLogRaw("Old: ",Z14132VXNecPedTi);
               GXutil.writeLogRaw("Current: ",T01T84_A14132VXNecPedTi[0]);
            }
            if ( Z14133VxNecPedCo != T01T84_A14133VxNecPedCo[0] )
            {
               GXutil.writeLogln("tvxneces:[seudo value changed for attri]"+"VxNecPedCo");
               GXutil.writeLogRaw("Old: ",Z14133VxNecPedCo);
               GXutil.writeLogRaw("Current: ",T01T84_A14133VxNecPedCo[0]);
            }
            if ( Z14139VxNecPedLi != T01T84_A14139VxNecPedLi[0] )
            {
               GXutil.writeLogln("tvxneces:[seudo value changed for attri]"+"VxNecPedLi");
               GXutil.writeLogRaw("Old: ",Z14139VxNecPedLi);
               GXutil.writeLogRaw("Current: ",T01T84_A14139VxNecPedLi[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"NECES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T81889( )
   {
      beforeValidate1T81889( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T81889( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T81889( 0) ;
         checkOptimisticConcurrency1T81889( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T81889( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T81889( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T810 */
                  pr_vertex.execute(8, new Object[] {Long.valueOf(A14116VxNecCod), Boolean.valueOf(n14132VXNecPedTi), A14132VXNecPedTi, Boolean.valueOf(n14133VxNecPedCo), Integer.valueOf(A14133VxNecPedCo), Boolean.valueOf(n14139VxNecPedLi), Short.valueOf(A14139VxNecPedLi)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("NECES");
                  if ( (pr_vertex.getStatus(8) == 1) )
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
                        processLevel1T81889( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1T80( ) ;
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
            load1T81889( ) ;
         }
         endLevel1T81889( ) ;
      }
      closeExtendedTableCursors1T81889( ) ;
   }

   public void update1T81889( )
   {
      beforeValidate1T81889( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T81889( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T81889( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T81889( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T81889( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T811 */
                  pr_vertex.execute(9, new Object[] {Boolean.valueOf(n14132VXNecPedTi), A14132VXNecPedTi, Boolean.valueOf(n14133VxNecPedCo), Integer.valueOf(A14133VxNecPedCo), Boolean.valueOf(n14139VxNecPedLi), Short.valueOf(A14139VxNecPedLi), Long.valueOf(A14116VxNecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("NECES");
                  if ( (pr_vertex.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"NECES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T81889( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1T81889( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1T80( ) ;
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
         endLevel1T81889( ) ;
      }
      closeExtendedTableCursors1T81889( ) ;
   }

   public void deferredUpdate1T81889( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1T81889( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T81889( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T81889( ) ;
         afterConfirm1T81889( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T81889( ) ;
            if ( AnyError == 0 )
            {
               scanStart1T81890( ) ;
               while ( RcdFound1890 != 0 )
               {
                  getByPrimaryKey1T81890( ) ;
                  delete1T81890( ) ;
                  scanNext1T81890( ) ;
               }
               scanEnd1T81890( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T812 */
                  pr_vertex.execute(10, new Object[] {Long.valueOf(A14116VxNecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("NECES");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1889 == 0 )
                        {
                           initAll1T81889( ) ;
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
                        resetCaption1T80( ) ;
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
      sMode1889 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T81889( ) ;
      Gx_mode = sMode1889 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T81889( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1T81890( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1T81890( ) ;
         if ( ( nRcdExists_1890 != 0 ) || ( nIsMod_1890 != 0 ) )
         {
            standaloneNotModal1T81890( ) ;
            getKey1T81890( ) ;
            if ( ( nRcdExists_1890 == 0 ) && ( nRcdDeleted_1890 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1T81890( ) ;
            }
            else
            {
               if ( RcdFound1890 != 0 )
               {
                  if ( ( nRcdDeleted_1890 != 0 ) && ( nRcdExists_1890 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1T81890( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1890 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1T81890( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1890 == 0 )
                  {
                     GXCCtl = "VXNECMOV_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxNecMov_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1890_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxNecMov_Internalname, GXutil.ltrim( localUtil.ntoc( A14117VxNecMov, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxNecMTip_Internalname, GXutil.rtrim( A14142VxNecMTip)) ;
         httpContext.changePostValue( edtVxNecMDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A14140VxNecMDoc, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxNecMCan_Internalname, GXutil.ltrim( localUtil.ntoc( A14143VxNecMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxNecMOFab_Internalname, GXutil.rtrim( A14141VxNecMOFab)) ;
         httpContext.changePostValue( edtVxNecMAnu_Internalname, GXutil.rtrim( A14144VxNecMAnu)) ;
         httpContext.changePostValue( "ZT_"+"Z14117VxNecMov_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14117VxNecMov, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14142VxNecMTip_"+sGXsfl_40_idx, GXutil.rtrim( Z14142VxNecMTip)) ;
         httpContext.changePostValue( "ZT_"+"Z14140VxNecMDoc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14140VxNecMDoc, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14143VxNecMCan_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14143VxNecMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14141VxNecMOFab_"+sGXsfl_40_idx, GXutil.rtrim( Z14141VxNecMOFab)) ;
         httpContext.changePostValue( "ZT_"+"Z14144VxNecMAnu_"+sGXsfl_40_idx, GXutil.rtrim( Z14144VxNecMAnu)) ;
         httpContext.changePostValue( "nRcdDeleted_1890_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1890_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1890_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1890 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1890_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1890_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMOV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMTIP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMDOC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMDoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMCAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMOFAB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMOFab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXNECMANU_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMAnu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1T81890( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1890 = (short)(0) ;
      nIsMod_1890 = (short)(0) ;
      nRcdDeleted_1890 = (short)(0) ;
   }

   public void processLevel1T81889( )
   {
      /* Save parent mode. */
      sMode1889 = Gx_mode ;
      processNestedLevel1T81890( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1889 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1T81889( )
   {
      if ( ! isIns( ) )
      {
         pr_vertex.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1T81889( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxneces");
         if ( AnyError == 0 )
         {
            confirmValues1T80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxneces");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T81889( )
   {
      /* Using cursor T01T813 */
      pr_vertex.execute(11);
      RcdFound1889 = (short)(0) ;
      if ( (pr_vertex.getStatus(11) != 101) )
      {
         RcdFound1889 = (short)(1) ;
         A14116VxNecCod = T01T813_A14116VxNecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T81889( )
   {
      /* Scan next routine */
      pr_vertex.readNext(11);
      RcdFound1889 = (short)(0) ;
      if ( (pr_vertex.getStatus(11) != 101) )
      {
         RcdFound1889 = (short)(1) ;
         A14116VxNecCod = T01T813_A14116VxNecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
      }
   }

   public void scanEnd1T81889( )
   {
      pr_vertex.close(11);
   }

   public void afterConfirm1T81889( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T81889( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T81889( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T81889( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T81889( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T81889( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T81889( )
   {
      edtVxNecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecCod_Enabled), 5, 0), true);
      edtVXNecPedTi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXNecPedTi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXNecPedTi_Enabled), 5, 0), true);
      edtVxNecPedCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecPedCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecPedCo_Enabled), 5, 0), true);
      edtVxNecPedLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecPedLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecPedLi_Enabled), 5, 0), true);
   }

   public void zm1T81890( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14142VxNecMTip = T01T83_A14142VxNecMTip[0] ;
            Z14140VxNecMDoc = T01T83_A14140VxNecMDoc[0] ;
            Z14143VxNecMCan = T01T83_A14143VxNecMCan[0] ;
            Z14141VxNecMOFab = T01T83_A14141VxNecMOFab[0] ;
            Z14144VxNecMAnu = T01T83_A14144VxNecMAnu[0] ;
         }
         else
         {
            Z14142VxNecMTip = A14142VxNecMTip ;
            Z14140VxNecMDoc = A14140VxNecMDoc ;
            Z14143VxNecMCan = A14143VxNecMCan ;
            Z14141VxNecMOFab = A14141VxNecMOFab ;
            Z14144VxNecMAnu = A14144VxNecMAnu ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z14116VxNecCod = A14116VxNecCod ;
         Z14117VxNecMov = A14117VxNecMov ;
         Z14142VxNecMTip = A14142VxNecMTip ;
         Z14140VxNecMDoc = A14140VxNecMDoc ;
         Z14143VxNecMCan = A14143VxNecMCan ;
         Z14141VxNecMOFab = A14141VxNecMOFab ;
         Z14144VxNecMAnu = A14144VxNecMAnu ;
      }
   }

   public void standaloneNotModal1T81890( )
   {
   }

   public void standaloneModal1T81890( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtVxNecMov_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxNecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMov_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtVxNecMov_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxNecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMov_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1T81890( )
   {
      /* Using cursor T01T814 */
      pr_vertex.execute(12, new Object[] {Long.valueOf(A14116VxNecCod), Integer.valueOf(A14117VxNecMov)});
      if ( (pr_vertex.getStatus(12) != 101) )
      {
         RcdFound1890 = (short)(1) ;
         A14142VxNecMTip = T01T814_A14142VxNecMTip[0] ;
         n14142VxNecMTip = T01T814_n14142VxNecMTip[0] ;
         A14140VxNecMDoc = T01T814_A14140VxNecMDoc[0] ;
         n14140VxNecMDoc = T01T814_n14140VxNecMDoc[0] ;
         A14143VxNecMCan = T01T814_A14143VxNecMCan[0] ;
         n14143VxNecMCan = T01T814_n14143VxNecMCan[0] ;
         A14141VxNecMOFab = T01T814_A14141VxNecMOFab[0] ;
         n14141VxNecMOFab = T01T814_n14141VxNecMOFab[0] ;
         A14144VxNecMAnu = T01T814_A14144VxNecMAnu[0] ;
         n14144VxNecMAnu = T01T814_n14144VxNecMAnu[0] ;
         zm1T81890( -2) ;
      }
      pr_vertex.close(12);
      onLoadActions1T81890( ) ;
   }

   public void onLoadActions1T81890( )
   {
   }

   public void checkExtendedTable1T81890( )
   {
      nIsDirty_1890 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1T81890( ) ;
   }

   public void closeExtendedTableCursors1T81890( )
   {
   }

   public void enableDisable1T81890( )
   {
   }

   public void getKey1T81890( )
   {
      /* Using cursor T01T815 */
      pr_vertex.execute(13, new Object[] {Long.valueOf(A14116VxNecCod), Integer.valueOf(A14117VxNecMov)});
      if ( (pr_vertex.getStatus(13) != 101) )
      {
         RcdFound1890 = (short)(1) ;
      }
      else
      {
         RcdFound1890 = (short)(0) ;
      }
      pr_vertex.close(13);
   }

   public void getByPrimaryKey1T81890( )
   {
      /* Using cursor T01T83 */
      pr_vertex.execute(1, new Object[] {Long.valueOf(A14116VxNecCod), Integer.valueOf(A14117VxNecMov)});
      if ( (pr_vertex.getStatus(1) != 101) )
      {
         zm1T81890( 2) ;
         RcdFound1890 = (short)(1) ;
         initializeNonKey1T81890( ) ;
         A14117VxNecMov = T01T83_A14117VxNecMov[0] ;
         A14142VxNecMTip = T01T83_A14142VxNecMTip[0] ;
         n14142VxNecMTip = T01T83_n14142VxNecMTip[0] ;
         A14140VxNecMDoc = T01T83_A14140VxNecMDoc[0] ;
         n14140VxNecMDoc = T01T83_n14140VxNecMDoc[0] ;
         A14143VxNecMCan = T01T83_A14143VxNecMCan[0] ;
         n14143VxNecMCan = T01T83_n14143VxNecMCan[0] ;
         A14141VxNecMOFab = T01T83_A14141VxNecMOFab[0] ;
         n14141VxNecMOFab = T01T83_n14141VxNecMOFab[0] ;
         A14144VxNecMAnu = T01T83_A14144VxNecMAnu[0] ;
         n14144VxNecMAnu = T01T83_n14144VxNecMAnu[0] ;
         Z14116VxNecCod = A14116VxNecCod ;
         Z14117VxNecMov = A14117VxNecMov ;
         sMode1890 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1T81890( ) ;
         load1T81890( ) ;
         Gx_mode = sMode1890 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1890 = (short)(0) ;
         initializeNonKey1T81890( ) ;
         sMode1890 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1T81890( ) ;
         Gx_mode = sMode1890 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1T81890( ) ;
      }
      pr_vertex.close(1);
   }

   public void checkOptimisticConcurrency1T81890( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T82 */
         pr_vertex.execute(0, new Object[] {Long.valueOf(A14116VxNecCod), Integer.valueOf(A14117VxNecMov)});
         if ( (pr_vertex.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"NECMOV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_vertex.getStatus(0) == 101) || ( GXutil.strcmp(Z14142VxNecMTip, T01T82_A14142VxNecMTip[0]) != 0 ) || ( Z14140VxNecMDoc != T01T82_A14140VxNecMDoc[0] ) || ( DecimalUtil.compareTo(Z14143VxNecMCan, T01T82_A14143VxNecMCan[0]) != 0 ) || ( GXutil.strcmp(Z14141VxNecMOFab, T01T82_A14141VxNecMOFab[0]) != 0 ) || ( GXutil.strcmp(Z14144VxNecMAnu, T01T82_A14144VxNecMAnu[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14142VxNecMTip, T01T82_A14142VxNecMTip[0]) != 0 )
            {
               GXutil.writeLogln("tvxneces:[seudo value changed for attri]"+"VxNecMTip");
               GXutil.writeLogRaw("Old: ",Z14142VxNecMTip);
               GXutil.writeLogRaw("Current: ",T01T82_A14142VxNecMTip[0]);
            }
            if ( Z14140VxNecMDoc != T01T82_A14140VxNecMDoc[0] )
            {
               GXutil.writeLogln("tvxneces:[seudo value changed for attri]"+"VxNecMDoc");
               GXutil.writeLogRaw("Old: ",Z14140VxNecMDoc);
               GXutil.writeLogRaw("Current: ",T01T82_A14140VxNecMDoc[0]);
            }
            if ( DecimalUtil.compareTo(Z14143VxNecMCan, T01T82_A14143VxNecMCan[0]) != 0 )
            {
               GXutil.writeLogln("tvxneces:[seudo value changed for attri]"+"VxNecMCan");
               GXutil.writeLogRaw("Old: ",Z14143VxNecMCan);
               GXutil.writeLogRaw("Current: ",T01T82_A14143VxNecMCan[0]);
            }
            if ( GXutil.strcmp(Z14141VxNecMOFab, T01T82_A14141VxNecMOFab[0]) != 0 )
            {
               GXutil.writeLogln("tvxneces:[seudo value changed for attri]"+"VxNecMOFab");
               GXutil.writeLogRaw("Old: ",Z14141VxNecMOFab);
               GXutil.writeLogRaw("Current: ",T01T82_A14141VxNecMOFab[0]);
            }
            if ( GXutil.strcmp(Z14144VxNecMAnu, T01T82_A14144VxNecMAnu[0]) != 0 )
            {
               GXutil.writeLogln("tvxneces:[seudo value changed for attri]"+"VxNecMAnu");
               GXutil.writeLogRaw("Old: ",Z14144VxNecMAnu);
               GXutil.writeLogRaw("Current: ",T01T82_A14144VxNecMAnu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"NECMOV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T81890( )
   {
      beforeValidate1T81890( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T81890( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T81890( 0) ;
         checkOptimisticConcurrency1T81890( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T81890( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T81890( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T816 */
                  pr_vertex.execute(14, new Object[] {Long.valueOf(A14116VxNecCod), Integer.valueOf(A14117VxNecMov), Boolean.valueOf(n14142VxNecMTip), A14142VxNecMTip, Boolean.valueOf(n14140VxNecMDoc), Long.valueOf(A14140VxNecMDoc), Boolean.valueOf(n14143VxNecMCan), A14143VxNecMCan, Boolean.valueOf(n14141VxNecMOFab), A14141VxNecMOFab, Boolean.valueOf(n14144VxNecMAnu), A14144VxNecMAnu});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("NECMOV");
                  if ( (pr_vertex.getStatus(14) == 1) )
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
            load1T81890( ) ;
         }
         endLevel1T81890( ) ;
      }
      closeExtendedTableCursors1T81890( ) ;
   }

   public void update1T81890( )
   {
      beforeValidate1T81890( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T81890( ) ;
      }
      if ( ( nIsMod_1890 != 0 ) || ( nIsDirty_1890 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1T81890( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1T81890( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1T81890( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01T817 */
                     pr_vertex.execute(15, new Object[] {Boolean.valueOf(n14142VxNecMTip), A14142VxNecMTip, Boolean.valueOf(n14140VxNecMDoc), Long.valueOf(A14140VxNecMDoc), Boolean.valueOf(n14143VxNecMCan), A14143VxNecMCan, Boolean.valueOf(n14141VxNecMOFab), A14141VxNecMOFab, Boolean.valueOf(n14144VxNecMAnu), A14144VxNecMAnu, Long.valueOf(A14116VxNecCod), Integer.valueOf(A14117VxNecMov)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("NECMOV");
                     if ( (pr_vertex.getStatus(15) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"NECMOV"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1T81890( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1T81890( ) ;
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
            endLevel1T81890( ) ;
         }
      }
      closeExtendedTableCursors1T81890( ) ;
   }

   public void deferredUpdate1T81890( )
   {
   }

   public void delete1T81890( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1T81890( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T81890( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T81890( ) ;
         afterConfirm1T81890( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T81890( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T818 */
               pr_vertex.execute(16, new Object[] {Long.valueOf(A14116VxNecCod), Integer.valueOf(A14117VxNecMov)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("NECMOV");
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
      sMode1890 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T81890( ) ;
      Gx_mode = sMode1890 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T81890( )
   {
      standaloneModal1T81890( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1T81890( )
   {
      if ( ! isIns( ) )
      {
         pr_vertex.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T81890( )
   {
      /* Scan By routine */
      /* Using cursor T01T819 */
      pr_vertex.execute(17, new Object[] {Long.valueOf(A14116VxNecCod)});
      RcdFound1890 = (short)(0) ;
      if ( (pr_vertex.getStatus(17) != 101) )
      {
         RcdFound1890 = (short)(1) ;
         A14117VxNecMov = T01T819_A14117VxNecMov[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T81890( )
   {
      /* Scan next routine */
      pr_vertex.readNext(17);
      RcdFound1890 = (short)(0) ;
      if ( (pr_vertex.getStatus(17) != 101) )
      {
         RcdFound1890 = (short)(1) ;
         A14117VxNecMov = T01T819_A14117VxNecMov[0] ;
      }
   }

   public void scanEnd1T81890( )
   {
      pr_vertex.close(17);
   }

   public void afterConfirm1T81890( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T81890( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T81890( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T81890( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T81890( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T81890( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T81890( )
   {
      edtVxNecMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMov_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtVxNecMTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecMTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMTip_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtVxNecMDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecMDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMDoc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtVxNecMCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecMCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMCan_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtVxNecMOFab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecMOFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMOFab_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtVxNecMAnu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecMAnu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMAnu_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1T81890( )
   {
   }

   public void send_integrity_lvl_hashes1T81889( )
   {
   }

   public void subsflControlProps_401890( )
   {
      edtavnRcdDeleted_1890_Internalname = "vNRCDDELETED_1890_"+sGXsfl_40_idx ;
      edtVxNecMov_Internalname = "VXNECMOV_"+sGXsfl_40_idx ;
      edtVxNecMTip_Internalname = "VXNECMTIP_"+sGXsfl_40_idx ;
      edtVxNecMDoc_Internalname = "VXNECMDOC_"+sGXsfl_40_idx ;
      edtVxNecMCan_Internalname = "VXNECMCAN_"+sGXsfl_40_idx ;
      edtVxNecMOFab_Internalname = "VXNECMOFAB_"+sGXsfl_40_idx ;
      edtVxNecMAnu_Internalname = "VXNECMANU_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401890( )
   {
      edtavnRcdDeleted_1890_Internalname = "vNRCDDELETED_1890_"+sGXsfl_40_fel_idx ;
      edtVxNecMov_Internalname = "VXNECMOV_"+sGXsfl_40_fel_idx ;
      edtVxNecMTip_Internalname = "VXNECMTIP_"+sGXsfl_40_fel_idx ;
      edtVxNecMDoc_Internalname = "VXNECMDOC_"+sGXsfl_40_fel_idx ;
      edtVxNecMCan_Internalname = "VXNECMCAN_"+sGXsfl_40_fel_idx ;
      edtVxNecMOFab_Internalname = "VXNECMOFAB_"+sGXsfl_40_fel_idx ;
      edtVxNecMAnu_Internalname = "VXNECMANU_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1T81890( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401890( ) ;
      sendRow1T81890( ) ;
   }

   public void sendRow1T81890( )
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
         if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1890_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1890_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1890_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1890), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1890), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1890_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1890_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1890_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxNecMov_Internalname,GXutil.ltrim( localUtil.ntoc( A14117VxNecMov, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14117VxNecMov), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxNecMov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxNecMov_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1890_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxNecMTip_Internalname,GXutil.rtrim( A14142VxNecMTip),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxNecMTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxNecMTip_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1890_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxNecMDoc_Internalname,GXutil.ltrim( localUtil.ntoc( A14140VxNecMDoc, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxNecMDoc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14140VxNecMDoc), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14140VxNecMDoc), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxNecMDoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxNecMDoc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1890_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxNecMCan_Internalname,GXutil.ltrim( localUtil.ntoc( A14143VxNecMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxNecMCan_Enabled!=0) ? localUtil.format( A14143VxNecMCan, "ZZZZZ9.99") : localUtil.format( A14143VxNecMCan, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxNecMCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxNecMCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1890_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxNecMOFab_Internalname,GXutil.rtrim( A14141VxNecMOFab),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxNecMOFab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxNecMOFab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1890_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxNecMAnu_Internalname,GXutil.rtrim( A14144VxNecMAnu),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxNecMAnu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxNecMAnu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1T81890( ) ;
      GXCCtl = "Z14117VxNecMov_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14117VxNecMov, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14142VxNecMTip_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14142VxNecMTip));
      GXCCtl = "Z14140VxNecMDoc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14140VxNecMDoc, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14143VxNecMCan_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14143VxNecMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14141VxNecMOFab_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14141VxNecMOFab));
      GXCCtl = "Z14144VxNecMAnu_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14144VxNecMAnu));
      GXCCtl = "nRcdDeleted_1890_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1890_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1890_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1890, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1890_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1890_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXNECMOV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMov_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXNECMTIP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXNECMDOC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMDoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXNECMCAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXNECMOFAB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMOFab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXNECMANU_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMAnu_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1T81890( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401890( ) ;
      edtavnRcdDeleted_1890_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1890_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxNecMov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMOV_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxNecMTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMTIP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxNecMDoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMDOC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxNecMCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMCAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxNecMOFab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMOFAB_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxNecMAnu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXNECMANU_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1890_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1890_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1890");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1890_Internalname ;
         wbErr = true ;
         nRcdDeleted_1890 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1890 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1890_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "VXNECMOV_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxNecMov_Internalname ;
         wbErr = true ;
         A14117VxNecMov = 0 ;
      }
      else
      {
         A14117VxNecMov = (int)(localUtil.ctol( httpContext.cgiGet( edtVxNecMov_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A14142VxNecMTip = httpContext.cgiGet( edtVxNecMTip_Internalname) ;
      n14142VxNecMTip = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecMDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxNecMDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
      {
         GXCCtl = "VXNECMDOC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxNecMDoc_Internalname ;
         wbErr = true ;
         A14140VxNecMDoc = 0 ;
         n14140VxNecMDoc = false ;
      }
      else
      {
         A14140VxNecMDoc = localUtil.ctol( httpContext.cgiGet( edtVxNecMDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14140VxNecMDoc = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxNecMCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxNecMCan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "VXNECMCAN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxNecMCan_Internalname ;
         wbErr = true ;
         A14143VxNecMCan = DecimalUtil.ZERO ;
         n14143VxNecMCan = false ;
      }
      else
      {
         A14143VxNecMCan = localUtil.ctond( httpContext.cgiGet( edtVxNecMCan_Internalname)) ;
         n14143VxNecMCan = false ;
      }
      A14141VxNecMOFab = httpContext.cgiGet( edtVxNecMOFab_Internalname) ;
      n14141VxNecMOFab = false ;
      A14144VxNecMAnu = httpContext.cgiGet( edtVxNecMAnu_Internalname) ;
      n14144VxNecMAnu = false ;
      GXCCtl = "Z14117VxNecMov_" + sGXsfl_40_idx ;
      Z14117VxNecMov = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14142VxNecMTip_" + sGXsfl_40_idx ;
      Z14142VxNecMTip = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14140VxNecMDoc_" + sGXsfl_40_idx ;
      Z14140VxNecMDoc = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z14143VxNecMCan_" + sGXsfl_40_idx ;
      Z14143VxNecMCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14141VxNecMOFab_" + sGXsfl_40_idx ;
      Z14141VxNecMOFab = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14144VxNecMAnu_" + sGXsfl_40_idx ;
      Z14144VxNecMAnu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1890_" + sGXsfl_40_idx ;
      nRcdDeleted_1890 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1890_" + sGXsfl_40_idx ;
      nRcdExists_1890 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1890_" + sGXsfl_40_idx ;
      nIsMod_1890 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtVxNecMov_Enabled = edtVxNecMov_Enabled ;
   }

   public void confirmValues1T80( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401890( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401890( ) ;
         httpContext.changePostValue( "Z14117VxNecMov_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14117VxNecMov_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14117VxNecMov_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14142VxNecMTip_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14142VxNecMTip_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14142VxNecMTip_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14140VxNecMDoc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14140VxNecMDoc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14140VxNecMDoc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14143VxNecMCan_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14143VxNecMCan_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14143VxNecMCan_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14141VxNecMOFab_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14141VxNecMOFab_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14141VxNecMOFab_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14144VxNecMAnu_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14144VxNecMAnu_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14144VxNecMAnu_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxneces", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14116VxNecCod", GXutil.ltrim( localUtil.ntoc( Z14116VxNecCod, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14132VXNecPedTi", GXutil.rtrim( Z14132VXNecPedTi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14133VxNecPedCo", GXutil.ltrim( localUtil.ntoc( Z14133VxNecPedCo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14139VxNecPedLi", GXutil.ltrim( localUtil.ntoc( Z14139VxNecPedLi, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvxneces", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxNeces" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tablas NECES y NECMOV", "") ;
   }

   public void initializeNonKey1T81889( )
   {
      A14132VXNecPedTi = "" ;
      n14132VXNecPedTi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14132VXNecPedTi", A14132VXNecPedTi);
      A14133VxNecPedCo = 0 ;
      n14133VxNecPedCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14133VxNecPedCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14133VxNecPedCo), 8, 0));
      A14139VxNecPedLi = (short)(0) ;
      n14139VxNecPedLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14139VxNecPedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14139VxNecPedLi), 3, 0));
      Z14132VXNecPedTi = "" ;
      Z14133VxNecPedCo = 0 ;
      Z14139VxNecPedLi = (short)(0) ;
   }

   public void initAll1T81889( )
   {
      A14116VxNecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14116VxNecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14116VxNecCod), 12, 0));
      initializeNonKey1T81889( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1T81890( )
   {
      A14142VxNecMTip = "" ;
      n14142VxNecMTip = false ;
      A14140VxNecMDoc = 0 ;
      n14140VxNecMDoc = false ;
      A14143VxNecMCan = DecimalUtil.ZERO ;
      n14143VxNecMCan = false ;
      A14141VxNecMOFab = "" ;
      n14141VxNecMOFab = false ;
      A14144VxNecMAnu = "" ;
      n14144VxNecMAnu = false ;
      Z14142VxNecMTip = "" ;
      Z14140VxNecMDoc = 0 ;
      Z14143VxNecMCan = DecimalUtil.ZERO ;
      Z14141VxNecMOFab = "" ;
      Z14144VxNecMAnu = "" ;
   }

   public void initAll1T81890( )
   {
      A14117VxNecMov = 0 ;
      initializeNonKey1T81890( ) ;
   }

   public void standaloneModalInsert1T81890( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612519102487", true, true);
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
      httpContext.AddJavascriptSource("tvxneces.js", "?202612519102487", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1890( )
   {
      edtVxNecMov_Enabled = defedtVxNecMov_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxNecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxNecMov_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void startgridcontrol40( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1890, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1890_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14117VxNecMov, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMov_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A14142VxNecMTip));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14140VxNecMDoc, (byte)(12), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMDoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14143VxNecMCan, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A14141VxNecMOFab));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMOFab_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A14144VxNecMAnu));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxNecMAnu_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtVxNecCod_Internalname = "VXNECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVXNecPedTi_Internalname = "VXNECPEDTI" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxNecPedCo_Internalname = "VXNECPEDCO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxNecPedLi_Internalname = "VXNECPEDLI" ;
      edtavnRcdDeleted_1890_Internalname = "vNRCDDELETED_1890" ;
      edtVxNecMov_Internalname = "VXNECMOV" ;
      edtVxNecMTip_Internalname = "VXNECMTIP" ;
      edtVxNecMDoc_Internalname = "VXNECMDOC" ;
      edtVxNecMCan_Internalname = "VXNECMCAN" ;
      edtVxNecMOFab_Internalname = "VXNECMOFAB" ;
      edtVxNecMAnu_Internalname = "VXNECMANU" ;
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
      Form.setCaption( httpContext.getMessage( "Tablas NECES y NECMOV", "") );
      edtVxNecMAnu_Jsonclick = "" ;
      edtVxNecMOFab_Jsonclick = "" ;
      edtVxNecMCan_Jsonclick = "" ;
      edtVxNecMDoc_Jsonclick = "" ;
      edtVxNecMTip_Jsonclick = "" ;
      edtVxNecMov_Jsonclick = "" ;
      edtavnRcdDeleted_1890_Jsonclick = "" ;
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
      edtVxNecMAnu_Enabled = 1 ;
      edtVxNecMOFab_Enabled = 1 ;
      edtVxNecMCan_Enabled = 1 ;
      edtVxNecMDoc_Enabled = 1 ;
      edtVxNecMTip_Enabled = 1 ;
      edtVxNecMov_Enabled = 1 ;
      edtavnRcdDeleted_1890_Enabled = 1 ;
      edtVxNecPedLi_Jsonclick = "" ;
      edtVxNecPedLi_Backcolor = (int)(0xFFFFFF) ;
      edtVxNecPedLi_Enabled = 1 ;
      edtVxNecPedCo_Jsonclick = "" ;
      edtVxNecPedCo_Backcolor = (int)(0xFFFFFF) ;
      edtVxNecPedCo_Enabled = 1 ;
      edtVXNecPedTi_Jsonclick = "" ;
      edtVXNecPedTi_Backcolor = (int)(0xFFFFFF) ;
      edtVXNecPedTi_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxNecCod_Jsonclick = "" ;
      edtVxNecCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxNecCod_Enabled = 1 ;
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
      subsflControlProps_401890( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1T81890( ) ;
         standaloneModal1T81890( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1T81890( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401890( ) ;
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
      GX_FocusControl = edtVXNecPedTi_Internalname ;
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

   public void valid_Vxneccod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14132VXNecPedTi", GXutil.rtrim( A14132VXNecPedTi));
      httpContext.ajax_rsp_assign_attri("", false, "A14133VxNecPedCo", GXutil.ltrim( localUtil.ntoc( A14133VxNecPedCo, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14139VxNecPedLi", GXutil.ltrim( localUtil.ntoc( A14139VxNecPedLi, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14116VxNecCod", GXutil.ltrim( localUtil.ntoc( Z14116VxNecCod, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14132VXNecPedTi", GXutil.rtrim( Z14132VXNecPedTi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14133VxNecPedCo", GXutil.ltrim( localUtil.ntoc( Z14133VxNecPedCo, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14139VxNecPedLi", GXutil.ltrim( localUtil.ntoc( Z14139VxNecPedLi, (byte)(3), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_VXNECCOD","{handler:'valid_Vxneccod',iparms:[{av:'A14116VxNecCod',fld:'VXNECCOD',pic:'ZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXNECCOD",",oparms:[{av:'A14132VXNecPedTi',fld:'VXNECPEDTI',pic:''},{av:'A14133VxNecPedCo',fld:'VXNECPEDCO',pic:'ZZZZZZZ9'},{av:'A14139VxNecPedLi',fld:'VXNECPEDLI',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z14116VxNecCod'},{av:'Z14132VXNecPedTi'},{av:'Z14133VxNecPedCo'},{av:'Z14139VxNecPedLi'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXNECMOV","{handler:'valid_Vxnecmov',iparms:[]");
      setEventMetadata("VALID_VXNECMOV",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Vxnecmanu',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z14132VXNecPedTi = "" ;
      Z14142VxNecMTip = "" ;
      Z14143VxNecMCan = DecimalUtil.ZERO ;
      Z14141VxNecMOFab = "" ;
      Z14144VxNecMAnu = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A14132VXNecPedTi = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1890 = "" ;
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
      sMode1889 = "" ;
      GXCCtl = "" ;
      A14142VxNecMTip = "" ;
      A14143VxNecMCan = DecimalUtil.ZERO ;
      A14141VxNecMOFab = "" ;
      A14144VxNecMAnu = "" ;
      T01T86_A14116VxNecCod = new long[1] ;
      T01T86_A14132VXNecPedTi = new String[] {""} ;
      T01T86_n14132VXNecPedTi = new boolean[] {false} ;
      T01T86_A14133VxNecPedCo = new int[1] ;
      T01T86_n14133VxNecPedCo = new boolean[] {false} ;
      T01T86_A14139VxNecPedLi = new short[1] ;
      T01T86_n14139VxNecPedLi = new boolean[] {false} ;
      T01T87_A14116VxNecCod = new long[1] ;
      T01T85_A14116VxNecCod = new long[1] ;
      T01T85_A14132VXNecPedTi = new String[] {""} ;
      T01T85_n14132VXNecPedTi = new boolean[] {false} ;
      T01T85_A14133VxNecPedCo = new int[1] ;
      T01T85_n14133VxNecPedCo = new boolean[] {false} ;
      T01T85_A14139VxNecPedLi = new short[1] ;
      T01T85_n14139VxNecPedLi = new boolean[] {false} ;
      T01T88_A14116VxNecCod = new long[1] ;
      T01T89_A14116VxNecCod = new long[1] ;
      T01T84_A14116VxNecCod = new long[1] ;
      T01T84_A14132VXNecPedTi = new String[] {""} ;
      T01T84_n14132VXNecPedTi = new boolean[] {false} ;
      T01T84_A14133VxNecPedCo = new int[1] ;
      T01T84_n14133VxNecPedCo = new boolean[] {false} ;
      T01T84_A14139VxNecPedLi = new short[1] ;
      T01T84_n14139VxNecPedLi = new boolean[] {false} ;
      T01T813_A14116VxNecCod = new long[1] ;
      T01T814_A14116VxNecCod = new long[1] ;
      T01T814_A14117VxNecMov = new int[1] ;
      T01T814_A14142VxNecMTip = new String[] {""} ;
      T01T814_n14142VxNecMTip = new boolean[] {false} ;
      T01T814_A14140VxNecMDoc = new long[1] ;
      T01T814_n14140VxNecMDoc = new boolean[] {false} ;
      T01T814_A14143VxNecMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T814_n14143VxNecMCan = new boolean[] {false} ;
      T01T814_A14141VxNecMOFab = new String[] {""} ;
      T01T814_n14141VxNecMOFab = new boolean[] {false} ;
      T01T814_A14144VxNecMAnu = new String[] {""} ;
      T01T814_n14144VxNecMAnu = new boolean[] {false} ;
      T01T815_A14116VxNecCod = new long[1] ;
      T01T815_A14117VxNecMov = new int[1] ;
      T01T83_A14116VxNecCod = new long[1] ;
      T01T83_A14117VxNecMov = new int[1] ;
      T01T83_A14142VxNecMTip = new String[] {""} ;
      T01T83_n14142VxNecMTip = new boolean[] {false} ;
      T01T83_A14140VxNecMDoc = new long[1] ;
      T01T83_n14140VxNecMDoc = new boolean[] {false} ;
      T01T83_A14143VxNecMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T83_n14143VxNecMCan = new boolean[] {false} ;
      T01T83_A14141VxNecMOFab = new String[] {""} ;
      T01T83_n14141VxNecMOFab = new boolean[] {false} ;
      T01T83_A14144VxNecMAnu = new String[] {""} ;
      T01T83_n14144VxNecMAnu = new boolean[] {false} ;
      T01T82_A14116VxNecCod = new long[1] ;
      T01T82_A14117VxNecMov = new int[1] ;
      T01T82_A14142VxNecMTip = new String[] {""} ;
      T01T82_n14142VxNecMTip = new boolean[] {false} ;
      T01T82_A14140VxNecMDoc = new long[1] ;
      T01T82_n14140VxNecMDoc = new boolean[] {false} ;
      T01T82_A14143VxNecMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T82_n14143VxNecMCan = new boolean[] {false} ;
      T01T82_A14141VxNecMOFab = new String[] {""} ;
      T01T82_n14141VxNecMOFab = new boolean[] {false} ;
      T01T82_A14144VxNecMAnu = new String[] {""} ;
      T01T82_n14144VxNecMAnu = new boolean[] {false} ;
      T01T819_A14116VxNecCod = new long[1] ;
      T01T819_A14117VxNecMov = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ14132VXNecPedTi = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxneces__vertex(),
         new Object[] {
             new Object[] {
            T01T82_A14116VxNecCod, T01T82_A14117VxNecMov, T01T82_A14142VxNecMTip, T01T82_n14142VxNecMTip, T01T82_A14140VxNecMDoc, T01T82_n14140VxNecMDoc, T01T82_A14143VxNecMCan, T01T82_n14143VxNecMCan, T01T82_A14141VxNecMOFab, T01T82_n14141VxNecMOFab,
            T01T82_A14144VxNecMAnu, T01T82_n14144VxNecMAnu
            }
            , new Object[] {
            T01T83_A14116VxNecCod, T01T83_A14117VxNecMov, T01T83_A14142VxNecMTip, T01T83_n14142VxNecMTip, T01T83_A14140VxNecMDoc, T01T83_n14140VxNecMDoc, T01T83_A14143VxNecMCan, T01T83_n14143VxNecMCan, T01T83_A14141VxNecMOFab, T01T83_n14141VxNecMOFab,
            T01T83_A14144VxNecMAnu, T01T83_n14144VxNecMAnu
            }
            , new Object[] {
            T01T84_A14116VxNecCod, T01T84_A14132VXNecPedTi, T01T84_n14132VXNecPedTi, T01T84_A14133VxNecPedCo, T01T84_n14133VxNecPedCo, T01T84_A14139VxNecPedLi, T01T84_n14139VxNecPedLi
            }
            , new Object[] {
            T01T85_A14116VxNecCod, T01T85_A14132VXNecPedTi, T01T85_n14132VXNecPedTi, T01T85_A14133VxNecPedCo, T01T85_n14133VxNecPedCo, T01T85_A14139VxNecPedLi, T01T85_n14139VxNecPedLi
            }
            , new Object[] {
            T01T86_A14116VxNecCod, T01T86_A14132VXNecPedTi, T01T86_n14132VXNecPedTi, T01T86_A14133VxNecPedCo, T01T86_n14133VxNecPedCo, T01T86_A14139VxNecPedLi, T01T86_n14139VxNecPedLi
            }
            , new Object[] {
            T01T87_A14116VxNecCod
            }
            , new Object[] {
            T01T88_A14116VxNecCod
            }
            , new Object[] {
            T01T89_A14116VxNecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T813_A14116VxNecCod
            }
            , new Object[] {
            T01T814_A14116VxNecCod, T01T814_A14117VxNecMov, T01T814_A14142VxNecMTip, T01T814_n14142VxNecMTip, T01T814_A14140VxNecMDoc, T01T814_n14140VxNecMDoc, T01T814_A14143VxNecMCan, T01T814_n14143VxNecMCan, T01T814_A14141VxNecMOFab, T01T814_n14141VxNecMOFab,
            T01T814_A14144VxNecMAnu, T01T814_n14144VxNecMAnu
            }
            , new Object[] {
            T01T815_A14116VxNecCod, T01T815_A14117VxNecMov
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T819_A14116VxNecCod, T01T819_A14117VxNecMov
            }
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxneces__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxneces__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxneces__default(),
         new Object[] {
         }
      );
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
   private short Z14139VxNecPedLi ;
   private short nRcdDeleted_1890 ;
   private short nRcdExists_1890 ;
   private short nIsMod_1890 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14139VxNecPedLi ;
   private short nBlankRcdCount1890 ;
   private short RcdFound1890 ;
   private short nBlankRcdUsr1890 ;
   private short RcdFound1889 ;
   private short nIsDirty_1889 ;
   private short nIsDirty_1890 ;
   private short ZZ14139VxNecPedLi ;
   private int Z14133VxNecPedCo ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int Z14117VxNecMov ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxNecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVXNecPedTi_Enabled ;
   private int A14133VxNecPedCo ;
   private int edtVxNecPedCo_Enabled ;
   private int edtVxNecPedLi_Enabled ;
   private int edtavnRcdDeleted_1890_Enabled ;
   private int edtVxNecMov_Enabled ;
   private int edtVxNecMTip_Enabled ;
   private int edtVxNecMDoc_Enabled ;
   private int edtVxNecMCan_Enabled ;
   private int edtVxNecMOFab_Enabled ;
   private int edtVxNecMAnu_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A14117VxNecMov ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtVxNecMov_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtVxNecPedLi_Backcolor ;
   private int edtVxNecPedCo_Backcolor ;
   private int edtVXNecPedTi_Backcolor ;
   private int edtVxNecCod_Backcolor ;
   private int ZZ14133VxNecPedCo ;
   private long Z14116VxNecCod ;
   private long Z14140VxNecMDoc ;
   private long A14116VxNecCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long A14140VxNecMDoc ;
   private long ZZ14116VxNecCod ;
   private java.math.BigDecimal Z14143VxNecMCan ;
   private java.math.BigDecimal A14143VxNecMCan ;
   private String sPrefix ;
   private String Z14132VXNecPedTi ;
   private String Z14142VxNecMTip ;
   private String Z14141VxNecMOFab ;
   private String Z14144VxNecMAnu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxNecCod_Internalname ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtVxNecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVXNecPedTi_Internalname ;
   private String A14132VXNecPedTi ;
   private String edtVXNecPedTi_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxNecPedCo_Internalname ;
   private String edtVxNecPedCo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxNecPedLi_Internalname ;
   private String edtVxNecPedLi_Jsonclick ;
   private String sMode1890 ;
   private String edtavnRcdDeleted_1890_Internalname ;
   private String edtVxNecMov_Internalname ;
   private String edtVxNecMTip_Internalname ;
   private String edtVxNecMDoc_Internalname ;
   private String edtVxNecMCan_Internalname ;
   private String edtVxNecMOFab_Internalname ;
   private String edtVxNecMAnu_Internalname ;
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
   private String sMode1889 ;
   private String GXCCtl ;
   private String A14142VxNecMTip ;
   private String A14141VxNecMOFab ;
   private String A14144VxNecMAnu ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1890_Jsonclick ;
   private String edtVxNecMov_Jsonclick ;
   private String edtVxNecMTip_Jsonclick ;
   private String edtVxNecMDoc_Jsonclick ;
   private String edtVxNecMCan_Jsonclick ;
   private String edtVxNecMOFab_Jsonclick ;
   private String edtVxNecMAnu_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ14132VXNecPedTi ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n14132VXNecPedTi ;
   private boolean n14133VxNecPedCo ;
   private boolean n14139VxNecPedLi ;
   private boolean n14142VxNecMTip ;
   private boolean n14140VxNecMDoc ;
   private boolean n14143VxNecMCan ;
   private boolean n14141VxNecMOFab ;
   private boolean n14144VxNecMAnu ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_vertex ;
   private long[] T01T86_A14116VxNecCod ;
   private String[] T01T86_A14132VXNecPedTi ;
   private boolean[] T01T86_n14132VXNecPedTi ;
   private int[] T01T86_A14133VxNecPedCo ;
   private boolean[] T01T86_n14133VxNecPedCo ;
   private short[] T01T86_A14139VxNecPedLi ;
   private boolean[] T01T86_n14139VxNecPedLi ;
   private long[] T01T87_A14116VxNecCod ;
   private long[] T01T85_A14116VxNecCod ;
   private String[] T01T85_A14132VXNecPedTi ;
   private boolean[] T01T85_n14132VXNecPedTi ;
   private int[] T01T85_A14133VxNecPedCo ;
   private boolean[] T01T85_n14133VxNecPedCo ;
   private short[] T01T85_A14139VxNecPedLi ;
   private boolean[] T01T85_n14139VxNecPedLi ;
   private long[] T01T88_A14116VxNecCod ;
   private long[] T01T89_A14116VxNecCod ;
   private IDataStoreProvider pr_default ;
   private long[] T01T84_A14116VxNecCod ;
   private String[] T01T84_A14132VXNecPedTi ;
   private boolean[] T01T84_n14132VXNecPedTi ;
   private int[] T01T84_A14133VxNecPedCo ;
   private boolean[] T01T84_n14133VxNecPedCo ;
   private short[] T01T84_A14139VxNecPedLi ;
   private boolean[] T01T84_n14139VxNecPedLi ;
   private long[] T01T813_A14116VxNecCod ;
   private long[] T01T814_A14116VxNecCod ;
   private int[] T01T814_A14117VxNecMov ;
   private String[] T01T814_A14142VxNecMTip ;
   private boolean[] T01T814_n14142VxNecMTip ;
   private long[] T01T814_A14140VxNecMDoc ;
   private boolean[] T01T814_n14140VxNecMDoc ;
   private java.math.BigDecimal[] T01T814_A14143VxNecMCan ;
   private boolean[] T01T814_n14143VxNecMCan ;
   private String[] T01T814_A14141VxNecMOFab ;
   private boolean[] T01T814_n14141VxNecMOFab ;
   private String[] T01T814_A14144VxNecMAnu ;
   private boolean[] T01T814_n14144VxNecMAnu ;
   private long[] T01T815_A14116VxNecCod ;
   private int[] T01T815_A14117VxNecMov ;
   private long[] T01T83_A14116VxNecCod ;
   private int[] T01T83_A14117VxNecMov ;
   private String[] T01T83_A14142VxNecMTip ;
   private boolean[] T01T83_n14142VxNecMTip ;
   private long[] T01T83_A14140VxNecMDoc ;
   private boolean[] T01T83_n14140VxNecMDoc ;
   private java.math.BigDecimal[] T01T83_A14143VxNecMCan ;
   private boolean[] T01T83_n14143VxNecMCan ;
   private String[] T01T83_A14141VxNecMOFab ;
   private boolean[] T01T83_n14141VxNecMOFab ;
   private String[] T01T83_A14144VxNecMAnu ;
   private boolean[] T01T83_n14144VxNecMAnu ;
   private long[] T01T82_A14116VxNecCod ;
   private int[] T01T82_A14117VxNecMov ;
   private String[] T01T82_A14142VxNecMTip ;
   private boolean[] T01T82_n14142VxNecMTip ;
   private long[] T01T82_A14140VxNecMDoc ;
   private boolean[] T01T82_n14140VxNecMDoc ;
   private java.math.BigDecimal[] T01T82_A14143VxNecMCan ;
   private boolean[] T01T82_n14143VxNecMCan ;
   private String[] T01T82_A14141VxNecMOFab ;
   private boolean[] T01T82_n14141VxNecMOFab ;
   private String[] T01T82_A14144VxNecMAnu ;
   private boolean[] T01T82_n14144VxNecMAnu ;
   private long[] T01T819_A14116VxNecCod ;
   private int[] T01T819_A14117VxNecMov ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxneces__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T82", "SELECT NecCod AS VxNecCod, NecMov, NecMTip, NecMDoc, NecMCan, NecMOFabT, NecMAnu FROM NECMOV WHERE NecCod = ? AND NecMov = ?  FOR UPDATE OF NecMTip, NecMDoc, NecMCan, NecMOFabT, NecMAnu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T83", "SELECT NecCod AS VxNecCod, NecMov, NecMTip, NecMDoc, NecMCan, NecMOFabT, NecMAnu FROM NECMOV WHERE NecCod = ? AND NecMov = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T84", "SELECT NecCod AS VxNecCod, NecPedTip, NecPedCod, NecPedLin FROM NECES WHERE NecCod = ?  FOR UPDATE OF NecPedTip, NecPedCod, NecPedLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T85", "SELECT NecCod AS VxNecCod, NecPedTip, NecPedCod, NecPedLin FROM NECES WHERE NecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T86", "SELECT /*+ FIRST_ROWS(100) */ TM1.NecCod AS VxNecCod, TM1.NecPedTip, TM1.NecPedCod, TM1.NecPedLin FROM NECES TM1 WHERE TM1.NecCod = ? ORDER BY TM1.NecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T87", "SELECT /*+ FIRST_ROWS(1) */ NecCod AS VxNecCod FROM NECES WHERE NecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T88", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NecCod AS VxNecCod FROM NECES WHERE ( NecCod > ?) ORDER BY NecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T89", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NecCod AS VxNecCod FROM NECES WHERE ( NecCod < ?) ORDER BY NecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01T810", "INSERT INTO NECES(NecCod, NecPedTip, NecPedCod, NecPedLin) VALUES(?, ?, ?, ?)", GX_NOMASK, "NECES")
         ,new UpdateCursor("T01T811", "UPDATE NECES SET NecPedTip=?, NecPedCod=?, NecPedLin=?  WHERE NecCod = ?", GX_NOMASK, "NECES")
         ,new UpdateCursor("T01T812", "DELETE FROM NECES  WHERE NecCod = ?", GX_NOMASK, "NECES")
         ,new ForEachCursor("T01T813", "SELECT /*+ FIRST_ROWS(100) */ NecCod AS VxNecCod FROM NECES ORDER BY NecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T814", "SELECT NecCod AS VxNecCod, NecMov, NecMTip, NecMDoc, NecMCan, NecMOFabT, NecMAnu FROM NECMOV WHERE NecCod = ? and NecMov = ? ORDER BY NecCod, NecMov ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T815", "SELECT NecCod AS VxNecCod, NecMov FROM NECMOV WHERE NecCod = ? AND NecMov = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T816", "INSERT INTO NECMOV(NecCod, NecMov, NecMTip, NecMDoc, NecMCan, NecMOFabT, NecMAnu) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "NECMOV")
         ,new UpdateCursor("T01T817", "UPDATE NECMOV SET NecMTip=?, NecMDoc=?, NecMCan=?, NecMOFabT=?, NecMAnu=?  WHERE NecCod = ? AND NecMov = ?", GX_NOMASK, "NECMOV")
         ,new UpdateCursor("T01T818", "DELETE FROM NECMOV  WHERE NecCod = ? AND NecMov = ?", GX_NOMASK, "NECMOV")
         ,new ForEachCursor("T01T819", "SELECT NecCod AS VxNecCod, NecMov FROM NECMOV WHERE NecCod = ? ORDER BY NecCod, NecMov ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setLong(4, ((Number) parms[6]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[5]).longValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[3]).longValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               stmt.setInt(7, ((Number) parms[11]).intValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class tvxneces__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxneces__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxneces__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

}

