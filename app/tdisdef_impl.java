package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdisdef_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
         n833TipDefCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A833TipDefCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DEFECTOS DISPOSICION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public tdisdef_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdisdef_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdisdef_impl.class ));
   }

   public tdisdef_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDISDEF.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Suma Porcentajes defectos", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumPor_Internalname, GXutil.ltrim( localUtil.ntoc( A828SumPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A828SumPor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A828SumPor), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumPor_Jsonclick, 0, "", "", "", "", "", 1, edtSumPor_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISDEF.htm");
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
         nBlankRcdCount37 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_37 = (short)(1) ;
            scanStart0T37( ) ;
            while ( RcdFound37 != 0 )
            {
               init_level_properties37( ) ;
               getByPrimaryKey0T37( ) ;
               addRow0T37( ) ;
               scanNext0T37( ) ;
            }
            scanEnd0T37( ) ;
            nBlankRcdCount37 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B828SumPor = A828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         standaloneNotModal0T37( ) ;
         standaloneModal0T37( ) ;
         sMode37 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow0T37( ) ;
            edtavnRcdDeleted_37_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_37_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_37_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_37_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtTipDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtDefPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFPOR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDefPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefPor_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtTipDefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_37 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0T37( ) ;
            }
            sendRow0T37( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A828SumPor = B828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount37 = (short)(5) ;
         nRcdExists_37 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart0T37( ) ;
            while ( RcdFound37 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_4037( ) ;
               init_level_properties37( ) ;
               standaloneNotModal0T37( ) ;
               getByPrimaryKey0T37( ) ;
               standaloneModal0T37( ) ;
               addRow0T37( ) ;
               scanNext0T37( ) ;
            }
            scanEnd0T37( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode37 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_4037( ) ;
         initAll0T37( ) ;
         init_level_properties37( ) ;
         B828SumPor = A828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         nRcdExists_37 = (short)(0) ;
         nIsMod_37 = (short)(0) ;
         nRcdDeleted_37 = (short)(0) ;
         nBlankRcdCount37 = (short)(nBlankRcdUsr37+nBlankRcdCount37) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount37 > 0 )
         {
            standaloneNotModal0T37( ) ;
            standaloneModal0T37( ) ;
            addRow0T37( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount37 = (short)(nBlankRcdCount37-1) ;
         }
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A828SumPor = B828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDISDEF.htm");
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
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O828SumPor = (short)(localUtil.ctol( httpContext.cgiGet( "O828SumPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31Pgmname = httpContext.cgiGet( "vPGMNAME") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26Olddef = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDDEF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A828SumPor = (short)(localUtil.ctol( httpContext.cgiGet( edtSumPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TDISDEF");
         forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tdisdef:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons( ) ;
            standaloneModal( ) ;
         }
         else
         {
            if ( isDsp( ) )
            {
               sMode34 = Gx_mode ;
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               Gx_mode = sMode34 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            }
            standaloneModal( ) ;
            if ( ! isIns( ) )
            {
               getByPrimaryKey( ) ;
               if ( RcdFound34 == 1 )
               {
                  if ( isDlt( ) )
                  {
                     /* Confirm record */
                     confirm_0T0( ) ;
                     if ( AnyError == 0 )
                     {
                        GX_FocusControl = bttBtn_enter_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
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
            initAll0T34( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes0T34( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_37_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_37_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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

   public void confirm_0T0( )
   {
      beforeValidate0T34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0T34( ) ;
         }
         else
         {
            checkExtendedTable0T34( ) ;
            if ( AnyError == 0 )
            {
               zm0T34( 9) ;
               zm0T34( 10) ;
            }
            closeExtendedTableCursors0T34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_0T37( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues0T0( ) ;
      }
   }

   public void confirm_0T37( )
   {
      s828SumPor = O828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow0T37( ) ;
         if ( ( nRcdExists_37 != 0 ) || ( nIsMod_37 != 0 ) )
         {
            getKey0T37( ) ;
            if ( ( nRcdExists_37 == 0 ) && ( nRcdDeleted_37 == 0 ) )
            {
               if ( RcdFound37 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0T37( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0T37( ) ;
                     if ( AnyError == 0 )
                     {
                        zm0T37( 12) ;
                     }
                     closeExtendedTableCursors0T37( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O828SumPor = A828SumPor ;
                     n828SumPor = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
                  }
               }
               else
               {
                  GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipDefCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound37 != 0 )
               {
                  if ( nRcdDeleted_37 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0T37( ) ;
                     load0T37( ) ;
                     beforeValidate0T37( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0T37( ) ;
                        O828SumPor = A828SumPor ;
                        n828SumPor = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_37 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0T37( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0T37( ) ;
                           if ( AnyError == 0 )
                           {
                              zm0T37( 12) ;
                           }
                           closeExtendedTableCursors0T37( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O828SumPor = A828SumPor ;
                           n828SumPor = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_37 == 0 )
                  {
                     GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_37_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDefPor_Internalname, GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipDefDsc_Internalname, GXutil.rtrim( A834TipDefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z319DefPor_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T833TipDefCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T319DefPor_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_37_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_37_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_37_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_37 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_37_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_37_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFPOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O828SumPor = s828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0T0( )
   {
   }

   public void zm0T34( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -8 )
      {
         Z361DisCod = A361DisCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z828SumPor = A828SumPor ;
      }
   }

   public void standaloneNotModal( )
   {
      AV31Pgmname = "TDISDEF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T000T7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T000T7_A407EmprNom[0] ;
      n407EmprNom = T000T7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T000T9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A828SumPor = T000T9_A828SumPor[0] ;
         n828SumPor = T000T9_n828SumPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         A828SumPor = (short)(0) ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      O828SumPor = A828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  || isUpd( )  || isDsp( ) || isDlt( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
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

   public void load0T34( )
   {
      /* Using cursor T000T11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T000T11_A407EmprNom[0] ;
         n407EmprNom = T000T11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A828SumPor = T000T11_A828SumPor[0] ;
         n828SumPor = T000T11_n828SumPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         zm0T34( -8) ;
      }
      pr_default.close(7);
      onLoadActions0T34( ) ;
   }

   public void onLoadActions0T34( )
   {
      O828SumPor = A828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
   }

   public void checkExtendedTable0T34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors0T34( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0T34( )
   {
      /* Using cursor T000T12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000T6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T000T6_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T000T6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0T34( 8) ;
         RcdFound34 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0T34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey0T34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey0T34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey0T34( ) ;
      if ( RcdFound34 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T000T13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T000T13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000T13_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T000T13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000T13_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T000T14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T000T14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000T14_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T000T14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000T14_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0T34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A828SumPor = O828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         insert0T34( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A828SumPor = O828SumPor ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A828SumPor = O828SumPor ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               update0T34( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               /* Insert record */
               A828SumPor = O828SumPor ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               insert0T34( ) ;
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
                  /* Insert record */
                  A828SumPor = O828SumPor ;
                  n828SumPor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
                  insert0T34( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A828SumPor = O828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey0T34( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
         {
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
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
         {
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisdef");
   }

   public void insert_check( )
   {
      confirm_0T0( ) ;
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

   public void checkOptimisticConcurrency0T34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000T5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0T34( )
   {
      beforeValidate0T34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0T34( 0) ;
         checkOptimisticConcurrency0T34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0T34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000T15 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A361DisCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel0T34( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
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
            load0T34( ) ;
         }
         endLevel0T34( ) ;
      }
      closeExtendedTableCursors0T34( ) ;
   }

   public void update0T34( )
   {
      beforeValidate0T34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0T34( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPDISPOS */
                  deferredUpdate0T34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                     tdisdef_impl.this.A396EmprCod = GXv_char1[0] ;
                     tdisdef_impl.this.A361DisCod = GXv_int2[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0T34( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel0T34( ) ;
      }
      closeExtendedTableCursors0T34( ) ;
   }

   public void deferredUpdate0T34( )
   {
   }

   public void delete( )
   {
      beforeValidate0T34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0T34( ) ;
         afterConfirm0T34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0T34( ) ;
            if ( AnyError == 0 )
            {
               A828SumPor = O828SumPor ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               scanStart0T37( ) ;
               while ( RcdFound37 != 0 )
               {
                  getByPrimaryKey0T37( ) ;
                  delete0T37( ) ;
                  scanNext0T37( ) ;
                  O828SumPor = A828SumPor ;
                  n828SumPor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               }
               scanEnd0T37( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000T16 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
      }
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0T34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0T34( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000T17 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000T18 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T000T19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T000T20 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T000T21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T000T22 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T000T23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T000T24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T000T25 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T000T26 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T000T27 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T000T28 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void processNestedLevel0T37( )
   {
      s828SumPor = O828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow0T37( ) ;
         if ( ( nRcdExists_37 != 0 ) || ( nIsMod_37 != 0 ) )
         {
            standaloneNotModal0T37( ) ;
            getKey0T37( ) ;
            if ( ( nRcdExists_37 == 0 ) && ( nRcdDeleted_37 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0T37( ) ;
            }
            else
            {
               if ( RcdFound37 != 0 )
               {
                  if ( ( nRcdDeleted_37 != 0 ) && ( nRcdExists_37 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0T37( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_37 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0T37( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_37 == 0 )
                  {
                     GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O828SumPor = A828SumPor ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_37_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDefPor_Internalname, GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipDefDsc_Internalname, GXutil.rtrim( A834TipDefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z319DefPor_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T833TipDefCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T319DefPor_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_37_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_37_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_37_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_37 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_37_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_37_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFPOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0T37( ) ;
      if ( AnyError != 0 )
      {
         O828SumPor = s828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      nRcdExists_37 = (short)(0) ;
      nIsMod_37 = (short)(0) ;
      nRcdDeleted_37 = (short)(0) ;
   }

   public void processLevel0T34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel0T37( ) ;
      if ( AnyError != 0 )
      {
         O828SumPor = s828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel0T34( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0T34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdisdef");
         if ( AnyError == 0 )
         {
            confirmValues0T0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisdef");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0T34( )
   {
      /* Scan By routine */
      /* Using cursor T000T29 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0T34( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd0T34( )
   {
      pr_default.close(25);
   }

   public void afterConfirm0T34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0T34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0T34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0T34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0T34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0T34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0T34( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtSumPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPor_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm0T37( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z319DefPor = T000T3_A319DefPor[0] ;
         }
         else
         {
            Z319DefPor = A319DefPor ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z361DisCod = A361DisCod ;
         Z319DefPor = A319DefPor ;
         Z396EmprCod = A396EmprCod ;
         Z833TipDefCod = A833TipDefCod ;
         Z834TipDefDsc = A834TipDefDsc ;
      }
   }

   public void standaloneNotModal0T37( )
   {
   }

   public void standaloneModal0T37( )
   {
      if ( isIns( )  && (0==A319DefPor) && ( Gx_BScreen == 0 ) )
      {
         A319DefPor = (short)(100) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTipDefCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtTipDefCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load0T37( )
   {
      /* Using cursor T000T30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A319DefPor = T000T30_A319DefPor[0] ;
         A834TipDefDsc = T000T30_A834TipDefDsc[0] ;
         n834TipDefDsc = T000T30_n834TipDefDsc[0] ;
         zm0T37( -11) ;
      }
      pr_default.close(26);
      onLoadActions0T37( ) ;
   }

   public void onLoadActions0T37( )
   {
      AV26Olddef = O833TipDefCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Olddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Olddef), 4, 0));
      if ( isIns( )  )
      {
         A828SumPor = (short)(O828SumPor+A319DefPor) ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A828SumPor = (short)(O828SumPor+A319DefPor-O319DefPor) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A828SumPor = (short)(O828SumPor-O319DefPor) ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
            }
         }
      }
   }

   public void checkExtendedTable0T37( )
   {
      nIsDirty_37 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal0T37( ) ;
      /* Using cursor T000T4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T000T4_A834TipDefDsc[0] ;
      n834TipDefDsc = T000T4_n834TipDefDsc[0] ;
      pr_default.close(2);
      AV26Olddef = O833TipDefCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Olddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Olddef), 4, 0));
      if ( isIns( )  )
      {
         nIsDirty_37 = (short)(1) ;
         A828SumPor = (short)(O828SumPor+A319DefPor) ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_37 = (short)(1) ;
            A828SumPor = (short)(O828SumPor+A319DefPor-O319DefPor) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_37 = (short)(1) ;
               A828SumPor = (short)(O828SumPor-O319DefPor) ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
            }
         }
      }
      if ( A828SumPor > 100 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. La suma de porcentajes no puede ser superior a 100", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A319DefPor > 100 )
      {
         GXCCtl = "DEFPOR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. El porcentaje no puede ser superior a 100", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDefPor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0T37( )
   {
      pr_default.close(2);
   }

   public void enableDisable0T37( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          short A833TipDefCod )
   {
      /* Using cursor T000T31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T000T31_A834TipDefDsc[0] ;
      n834TipDefDsc = T000T31_n834TipDefDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A834TipDefDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void getKey0T37( )
   {
      /* Using cursor T000T32 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound37 = (short)(1) ;
      }
      else
      {
         RcdFound37 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKey0T37( )
   {
      /* Using cursor T000T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T000T3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T000T3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0T37( 11) ;
         RcdFound37 = (short)(1) ;
         initializeNonKey0T37( ) ;
         A319DefPor = T000T3_A319DefPor[0] ;
         A833TipDefCod = T000T3_A833TipDefCod[0] ;
         n833TipDefCod = T000T3_n833TipDefCod[0] ;
         O833TipDefCod = A833TipDefCod ;
         n833TipDefCod = false ;
         O319DefPor = A319DefPor ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z833TipDefCod = A833TipDefCod ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0T37( ) ;
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound37 = (short)(0) ;
         initializeNonKey0T37( ) ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0T37( ) ;
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes0T37( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0T37( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000T2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISDEF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z319DefPor != T000T2_A319DefPor[0] ) )
         {
            if ( Z319DefPor != T000T2_A319DefPor[0] )
            {
               GXutil.writeLogln("tdisdef:[seudo value changed for attri]"+"DefPor");
               GXutil.writeLogRaw("Old: ",Z319DefPor);
               GXutil.writeLogRaw("Current: ",T000T2_A319DefPor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISDEF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0T37( )
   {
      beforeValidate0T37( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T37( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0T37( 0) ;
         checkOptimisticConcurrency0T37( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T37( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0T37( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000T33 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A361DisCod), Short.valueOf(A319DefPor), A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
                  if ( (pr_default.getStatus(29) == 1) )
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
            load0T37( ) ;
         }
         endLevel0T37( ) ;
      }
      closeExtendedTableCursors0T37( ) ;
   }

   public void update0T37( )
   {
      beforeValidate0T37( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T37( ) ;
      }
      if ( ( nIsMod_37 != 0 ) || ( nIsDirty_37 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency0T37( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm0T37( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate0T37( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T000T34 */
                     pr_default.execute(30, new Object[] {Short.valueOf(A319DefPor), A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISDEF"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate0T37( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char1[0] = A396EmprCod ;
                        GXv_int2[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                        tdisdef_impl.this.A396EmprCod = GXv_char1[0] ;
                        tdisdef_impl.this.A361DisCod = GXv_int2[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey0T37( ) ;
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
            endLevel0T37( ) ;
         }
      }
      closeExtendedTableCursors0T37( ) ;
   }

   public void deferredUpdate0T37( )
   {
   }

   public void delete0T37( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0T37( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T37( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0T37( ) ;
         afterConfirm0T37( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0T37( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000T35 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
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
      sMode37 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0T37( ) ;
      Gx_mode = sMode37 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0T37( )
   {
      standaloneModal0T37( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000T36 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         A834TipDefDsc = T000T36_A834TipDefDsc[0] ;
         n834TipDefDsc = T000T36_n834TipDefDsc[0] ;
         pr_default.close(32);
         AV26Olddef = O833TipDefCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Olddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Olddef), 4, 0));
         if ( isIns( )  )
         {
            A828SumPor = (short)(O828SumPor+A319DefPor) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A828SumPor = (short)(O828SumPor+A319DefPor-O319DefPor) ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A828SumPor = (short)(O828SumPor-O319DefPor) ;
                  n828SumPor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000T37 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void endLevel0T37( )
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

   public void scanStart0T37( )
   {
      /* Scan By routine */
      /* Using cursor T000T38 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A833TipDefCod = T000T38_A833TipDefCod[0] ;
         n833TipDefCod = T000T38_n833TipDefCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0T37( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A833TipDefCod = T000T38_A833TipDefCod[0] ;
         n833TipDefCod = T000T38_n833TipDefCod[0] ;
      }
   }

   public void scanEnd0T37( )
   {
      pr_default.close(34);
   }

   public void afterConfirm0T37( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && isDlt( )  )
      {
         AV25Inc_obs = httpContext.getMessage( httpContext.getMessage( "Delete #", ""), "") + GXutil.str( AV26Olddef, 4, 0) + " " + A834TipDefDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
      }
      else
      {
         if ( true /* After */ && isIns( )  )
         {
            AV25Inc_obs = httpContext.getMessage( httpContext.getMessage( "Insert #", ""), "") + GXutil.str( A833TipDefCod, 4, 0) + " " + A834TipDefDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
         }
      }
   }

   public void beforeInsert0T37( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0T37( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0T37( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0T37( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0T37( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0T37( )
   {
      edtTipDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtDefPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefPor_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtTipDefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes0T37( )
   {
   }

   public void send_integrity_lvl_hashes0T34( )
   {
   }

   public void subsflControlProps_4037( )
   {
      edtavnRcdDeleted_37_Internalname = "vNRCDDELETED_37_"+sGXsfl_40_idx ;
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_40_idx ;
      edtDefPor_Internalname = "DEFPOR_"+sGXsfl_40_idx ;
      edtTipDefDsc_Internalname = "TIPDEFDSC_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_4037( )
   {
      edtavnRcdDeleted_37_Internalname = "vNRCDDELETED_37_"+sGXsfl_40_fel_idx ;
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_40_fel_idx ;
      edtDefPor_Internalname = "DEFPOR_"+sGXsfl_40_fel_idx ;
      edtTipDefDsc_Internalname = "TIPDEFDSC_"+sGXsfl_40_fel_idx ;
   }

   public void addRow0T37( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4037( ) ;
      sendRow0T37( ) ;
   }

   public void sendRow0T37( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_37_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_37_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_37_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_37), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_37), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_37_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_37_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_37_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefCod_Internalname,GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipDefCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_37_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDefPor_Internalname,GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDefPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A319DefPor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A319DefPor), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDefPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDefPor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefDsc_Internalname,GXutil.rtrim( A834TipDefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipDefDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes0T37( ) ;
      GXCCtl = "Z833TipDefCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z319DefPor_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O833TipDefCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O319DefPor_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_37_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_37_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_37_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_37_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_37_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEFPOR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow0T37( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4037( ) ;
      edtavnRcdDeleted_37_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_37_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDefPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFPOR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipDefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_37_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_37_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_37");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_37_Internalname ;
         wbErr = true ;
         nRcdDeleted_37 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_37 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_37_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         wbErr = true ;
         A833TipDefCod = (short)(0) ;
         n833TipDefCod = false ;
      }
      else
      {
         A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n833TipDefCod = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "DEFPOR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDefPor_Internalname ;
         wbErr = true ;
         A319DefPor = (short)(0) ;
      }
      else
      {
         A319DefPor = (short)(localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A834TipDefDsc = httpContext.cgiGet( edtTipDefDsc_Internalname) ;
      n834TipDefDsc = false ;
      GXCCtl = "Z833TipDefCod_" + sGXsfl_40_idx ;
      Z833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z319DefPor_" + sGXsfl_40_idx ;
      Z319DefPor = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O833TipDefCod_" + sGXsfl_40_idx ;
      O833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O319DefPor_" + sGXsfl_40_idx ;
      O319DefPor = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_37_" + sGXsfl_40_idx ;
      nRcdDeleted_37 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_37_" + sGXsfl_40_idx ;
      nRcdExists_37 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_37_" + sGXsfl_40_idx ;
      nIsMod_37 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTipDefCod_Enabled = edtTipDefCod_Enabled ;
   }

   public void confirmValues0T0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4037( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4037( ) ;
         httpContext.changePostValue( "Z833TipDefCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z833TipDefCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z319DefPor_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z319DefPor_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z319DefPor_"+sGXsfl_40_idx) ;
      }
      httpContext.changePostValue( "O833TipDefCod", httpContext.cgiGet( "T833TipDefCod")) ;
      httpContext.deletePostValue( "T833TipDefCod") ;
      httpContext.changePostValue( "O319DefPor", httpContext.cgiGet( "T319DefPor")) ;
      httpContext.deletePostValue( "T319DefPor") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdisdef", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TDISDEF");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdisdef:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O828SumPor", GXutil.ltrim( localUtil.ntoc( O828SumPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV31Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDDEF", GXutil.ltrim( localUtil.ntoc( AV26Olddef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV25Inc_obs);
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
      return formatLink("app.tdisdef", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TDISDEF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DEFECTOS DISPOSICION", "") ;
   }

   public void initializeNonKey0T34( )
   {
      O828SumPor = A828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
   }

   public void initAll0T34( )
   {
      initializeNonKey0T34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0T37( )
   {
      AV26Olddef = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Olddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Olddef), 4, 0));
      AV25Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_obs", AV25Inc_obs);
      A834TipDefDsc = "" ;
      n834TipDefDsc = false ;
      A319DefPor = (short)(100) ;
      O319DefPor = A319DefPor ;
      Z319DefPor = (short)(0) ;
   }

   public void initAll0T37( )
   {
      A833TipDefCod = (short)(0) ;
      n833TipDefCod = false ;
      initializeNonKey0T37( ) ;
   }

   public void standaloneModalInsert0T37( )
   {
      A319DefPor = i319DefPor ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682414595185", true, true);
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
      httpContext.AddJavascriptSource("tdisdef.js", "?202682414595186", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties37( )
   {
      edtTipDefCod_Enabled = defedtTipDefCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_37_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDefPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A834TipDefDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtSumPor_Internalname = "SUMPOR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_37_Internalname = "vNRCDDELETED_37" ;
      edtTipDefCod_Internalname = "TIPDEFCOD" ;
      edtDefPor_Internalname = "DEFPOR" ;
      edtTipDefDsc_Internalname = "TIPDEFDSC" ;
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
      Form.setCaption( httpContext.getMessage( "DEFECTOS DISPOSICION", "") );
      edtTipDefDsc_Jsonclick = "" ;
      edtDefPor_Jsonclick = "" ;
      edtTipDefCod_Jsonclick = "" ;
      edtavnRcdDeleted_37_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTipDefDsc_Enabled = 0 ;
      edtDefPor_Enabled = 1 ;
      edtTipDefCod_Enabled = 1 ;
      edtavnRcdDeleted_37_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtSumPor_Jsonclick = "" ;
      edtSumPor_Backcolor = (int)(0xFFFFFF) ;
      edtSumPor_Enabled = 0 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
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
      subsflControlProps_4037( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0T37( ) ;
         standaloneModal0T37( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow0T37( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4037( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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

   public void valid_Tipdefcod( )
   {
      n833TipDefCod = false ;
      n834TipDefDsc = false ;
      /* Using cursor T000T36 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
      }
      A834TipDefDsc = T000T36_A834TipDefDsc[0] ;
      n834TipDefDsc = T000T36_n834TipDefDsc[0] ;
      pr_default.close(32);
      AV26Olddef = O833TipDefCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", GXutil.rtrim( A834TipDefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Olddef", GXutil.ltrim( localUtil.ntoc( AV26Olddef, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_SUMPOR","{handler:'valid_Sumpor',iparms:[]");
      setEventMetadata("VALID_SUMPOR",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFCOD","{handler:'valid_Tipdefcod',iparms:[{av:'O833TipDefCod'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'AV26Olddef',fld:'vOLDDEF',pic:'ZZZ9'}]");
      setEventMetadata("VALID_TIPDEFCOD",",oparms:[{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'AV26Olddef',fld:'vOLDDEF',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEFPOR","{handler:'valid_Defpor',iparms:[]");
      setEventMetadata("VALID_DEFPOR",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFDSC","{handler:'valid_Tipdefdsc',iparms:[]");
      setEventMetadata("VALID_TIPDEFDSC",",oparms:[]}");
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
      pr_default.close(32);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode37 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV31Pgmname = "" ;
      AV25Inc_obs = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode34 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A834TipDefDsc = "" ;
      Z407EmprNom = "" ;
      T000T7_A407EmprNom = new String[] {""} ;
      T000T7_n407EmprNom = new boolean[] {false} ;
      T000T9_A828SumPor = new short[1] ;
      T000T9_n828SumPor = new boolean[] {false} ;
      T000T11_A361DisCod = new int[1] ;
      T000T11_A407EmprNom = new String[] {""} ;
      T000T11_n407EmprNom = new boolean[] {false} ;
      T000T11_A396EmprCod = new String[] {""} ;
      T000T11_A828SumPor = new short[1] ;
      T000T11_n828SumPor = new boolean[] {false} ;
      T000T12_A396EmprCod = new String[] {""} ;
      T000T12_A361DisCod = new int[1] ;
      T000T6_A361DisCod = new int[1] ;
      T000T6_A396EmprCod = new String[] {""} ;
      T000T13_A396EmprCod = new String[] {""} ;
      T000T13_A361DisCod = new int[1] ;
      T000T14_A396EmprCod = new String[] {""} ;
      T000T14_A361DisCod = new int[1] ;
      T000T5_A361DisCod = new int[1] ;
      T000T5_A396EmprCod = new String[] {""} ;
      T000T17_A396EmprCod = new String[] {""} ;
      T000T17_A361DisCod = new int[1] ;
      T000T17_A13376DisTraID = new String[] {""} ;
      T000T18_A396EmprCod = new String[] {""} ;
      T000T18_A361DisCod = new int[1] ;
      T000T18_A13213DisNormID = new String[] {""} ;
      T000T19_A396EmprCod = new String[] {""} ;
      T000T19_A361DisCod = new int[1] ;
      T000T19_A13081DisDGLin = new byte[1] ;
      T000T19_A13082DisDGDibCl = new String[] {""} ;
      T000T19_A13083DisDGDibIn = new int[1] ;
      T000T19_A13084DisDGComb = new String[] {""} ;
      T000T19_A13085DisDGFondo = new String[] {""} ;
      T000T20_A396EmprCod = new String[] {""} ;
      T000T20_A361DisCod = new int[1] ;
      T000T20_A7068DisNotLin = new byte[1] ;
      T000T21_A396EmprCod = new String[] {""} ;
      T000T21_A361DisCod = new int[1] ;
      T000T21_A10197ProEspCod = new String[] {""} ;
      T000T22_A396EmprCod = new String[] {""} ;
      T000T22_A361DisCod = new int[1] ;
      T000T22_A4594AccCod = new short[1] ;
      T000T23_A396EmprCod = new String[] {""} ;
      T000T23_A361DisCod = new int[1] ;
      T000T23_A2524DisComLin = new byte[1] ;
      T000T23_A1056DisComCod = new String[] {""} ;
      T000T23_A1032FonCod = new String[] {""} ;
      T000T24_A396EmprCod = new String[] {""} ;
      T000T24_A361DisCod = new int[1] ;
      T000T24_A3398DisRefBarC = new int[1] ;
      T000T24_A3399DisRefBCRe = new byte[1] ;
      T000T24_A3400DisRefBCPa = new String[] {""} ;
      T000T24_A3607DisRefBPie = new String[] {""} ;
      T000T25_A396EmprCod = new String[] {""} ;
      T000T25_A361DisCod = new int[1] ;
      T000T25_A376DisObsLin = new byte[1] ;
      T000T26_A396EmprCod = new String[] {""} ;
      T000T26_A361DisCod = new int[1] ;
      T000T26_A758ProCod = new String[] {""} ;
      T000T27_A396EmprCod = new String[] {""} ;
      T000T27_A129BarCod = new int[1] ;
      T000T27_A132BarCodReo = new byte[1] ;
      T000T27_A130BarCodPar = new String[] {""} ;
      T000T28_A396EmprCod = new String[] {""} ;
      T000T28_A361DisCod = new int[1] ;
      T000T28_A44AlbRecCod = new int[1] ;
      T000T29_A396EmprCod = new String[] {""} ;
      T000T29_A361DisCod = new int[1] ;
      Z834TipDefDsc = "" ;
      T000T30_A361DisCod = new int[1] ;
      T000T30_A319DefPor = new short[1] ;
      T000T30_A834TipDefDsc = new String[] {""} ;
      T000T30_n834TipDefDsc = new boolean[] {false} ;
      T000T30_A396EmprCod = new String[] {""} ;
      T000T30_A833TipDefCod = new short[1] ;
      T000T30_n833TipDefCod = new boolean[] {false} ;
      T000T4_A834TipDefDsc = new String[] {""} ;
      T000T4_n834TipDefDsc = new boolean[] {false} ;
      T000T31_A834TipDefDsc = new String[] {""} ;
      T000T31_n834TipDefDsc = new boolean[] {false} ;
      T000T32_A396EmprCod = new String[] {""} ;
      T000T32_A361DisCod = new int[1] ;
      T000T32_A833TipDefCod = new short[1] ;
      T000T32_n833TipDefCod = new boolean[] {false} ;
      T000T3_A361DisCod = new int[1] ;
      T000T3_A319DefPor = new short[1] ;
      T000T3_A396EmprCod = new String[] {""} ;
      T000T3_A833TipDefCod = new short[1] ;
      T000T3_n833TipDefCod = new boolean[] {false} ;
      T000T2_A361DisCod = new int[1] ;
      T000T2_A319DefPor = new short[1] ;
      T000T2_A396EmprCod = new String[] {""} ;
      T000T2_A833TipDefCod = new short[1] ;
      T000T2_n833TipDefCod = new boolean[] {false} ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      T000T36_A834TipDefDsc = new String[] {""} ;
      T000T36_n834TipDefDsc = new boolean[] {false} ;
      T000T37_A396EmprCod = new String[] {""} ;
      T000T37_A129BarCod = new int[1] ;
      T000T37_A132BarCodReo = new byte[1] ;
      T000T37_A130BarCodPar = new String[] {""} ;
      T000T38_A396EmprCod = new String[] {""} ;
      T000T38_A361DisCod = new int[1] ;
      T000T38_A833TipDefCod = new short[1] ;
      T000T38_n833TipDefCod = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdisdef__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdisdef__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdisdef__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdisdef__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdisdef__default(),
         new Object[] {
             new Object[] {
            T000T2_A361DisCod, T000T2_A319DefPor, T000T2_A396EmprCod, T000T2_A833TipDefCod
            }
            , new Object[] {
            T000T3_A361DisCod, T000T3_A319DefPor, T000T3_A396EmprCod, T000T3_A833TipDefCod
            }
            , new Object[] {
            T000T4_A834TipDefDsc, T000T4_n834TipDefDsc
            }
            , new Object[] {
            T000T5_A361DisCod, T000T5_A396EmprCod
            }
            , new Object[] {
            T000T6_A361DisCod, T000T6_A396EmprCod
            }
            , new Object[] {
            T000T7_A407EmprNom, T000T7_n407EmprNom
            }
            , new Object[] {
            T000T9_A828SumPor, T000T9_n828SumPor
            }
            , new Object[] {
            T000T11_A361DisCod, T000T11_A407EmprNom, T000T11_n407EmprNom, T000T11_A396EmprCod, T000T11_A828SumPor, T000T11_n828SumPor
            }
            , new Object[] {
            T000T12_A396EmprCod, T000T12_A361DisCod
            }
            , new Object[] {
            T000T13_A396EmprCod, T000T13_A361DisCod
            }
            , new Object[] {
            T000T14_A396EmprCod, T000T14_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000T17_A396EmprCod, T000T17_A361DisCod, T000T17_A13376DisTraID
            }
            , new Object[] {
            T000T18_A396EmprCod, T000T18_A361DisCod, T000T18_A13213DisNormID
            }
            , new Object[] {
            T000T19_A396EmprCod, T000T19_A361DisCod, T000T19_A13081DisDGLin, T000T19_A13082DisDGDibCl, T000T19_A13083DisDGDibIn, T000T19_A13084DisDGComb, T000T19_A13085DisDGFondo
            }
            , new Object[] {
            T000T20_A396EmprCod, T000T20_A361DisCod, T000T20_A7068DisNotLin
            }
            , new Object[] {
            T000T21_A396EmprCod, T000T21_A361DisCod, T000T21_A10197ProEspCod
            }
            , new Object[] {
            T000T22_A396EmprCod, T000T22_A361DisCod, T000T22_A4594AccCod
            }
            , new Object[] {
            T000T23_A396EmprCod, T000T23_A361DisCod, T000T23_A2524DisComLin, T000T23_A1056DisComCod, T000T23_A1032FonCod
            }
            , new Object[] {
            T000T24_A396EmprCod, T000T24_A361DisCod, T000T24_A3398DisRefBarC, T000T24_A3399DisRefBCRe, T000T24_A3400DisRefBCPa, T000T24_A3607DisRefBPie
            }
            , new Object[] {
            T000T25_A396EmprCod, T000T25_A361DisCod, T000T25_A376DisObsLin
            }
            , new Object[] {
            T000T26_A396EmprCod, T000T26_A361DisCod, T000T26_A758ProCod
            }
            , new Object[] {
            T000T27_A396EmprCod, T000T27_A129BarCod, T000T27_A132BarCodReo, T000T27_A130BarCodPar
            }
            , new Object[] {
            T000T28_A396EmprCod, T000T28_A361DisCod, T000T28_A44AlbRecCod
            }
            , new Object[] {
            T000T29_A396EmprCod, T000T29_A361DisCod
            }
            , new Object[] {
            T000T30_A361DisCod, T000T30_A319DefPor, T000T30_A834TipDefDsc, T000T30_n834TipDefDsc, T000T30_A396EmprCod, T000T30_A833TipDefCod
            }
            , new Object[] {
            T000T31_A834TipDefDsc, T000T31_n834TipDefDsc
            }
            , new Object[] {
            T000T32_A396EmprCod, T000T32_A361DisCod, T000T32_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000T36_A834TipDefDsc, T000T36_n834TipDefDsc
            }
            , new Object[] {
            T000T37_A396EmprCod, T000T37_A129BarCod, T000T37_A132BarCodReo, T000T37_A130BarCodPar
            }
            , new Object[] {
            T000T38_A396EmprCod, T000T38_A361DisCod, T000T38_A833TipDefCod
            }
         }
      );
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV31Pgmname = "TDISDEF" ;
      Z319DefPor = (short)(100) ;
      O319DefPor = (short)(100) ;
      A319DefPor = (short)(100) ;
      T319DefPor = (short)(100) ;
      i319DefPor = (short)(100) ;
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
   private short O828SumPor ;
   private short Z833TipDefCod ;
   private short Z319DefPor ;
   private short O833TipDefCod ;
   private short O319DefPor ;
   private short nRcdDeleted_37 ;
   private short nRcdExists_37 ;
   private short nIsMod_37 ;
   private short A833TipDefCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A828SumPor ;
   private short nBlankRcdCount37 ;
   private short RcdFound37 ;
   private short B828SumPor ;
   private short nBlankRcdUsr37 ;
   private short AV26Olddef ;
   private short RcdFound34 ;
   private short s828SumPor ;
   private short A319DefPor ;
   private short T833TipDefCod ;
   private short T319DefPor ;
   private short Z828SumPor ;
   private short nIsDirty_34 ;
   private short nIsDirty_37 ;
   private short i319DefPor ;
   private short ZV26Olddef ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtSumPor_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_37_Enabled ;
   private int edtTipDefCod_Enabled ;
   private int edtDefPor_Enabled ;
   private int edtTipDefDsc_Enabled ;
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
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtTipDefCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtSumPor_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtSumPor_Internalname ;
   private String edtSumPor_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode37 ;
   private String edtavnRcdDeleted_37_Internalname ;
   private String edtTipDefCod_Internalname ;
   private String edtDefPor_Internalname ;
   private String edtTipDefDsc_Internalname ;
   private String GX_FocusControl ;
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
   private String AV31Pgmname ;
   private String hsh ;
   private String sMode34 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A834TipDefDsc ;
   private String Z407EmprNom ;
   private String Z834TipDefDsc ;
   private String GXv_char1[] ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_37_Jsonclick ;
   private String edtTipDefCod_Jsonclick ;
   private String edtDefPor_Jsonclick ;
   private String edtTipDefDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n833TipDefCod ;
   private boolean wbErr ;
   private boolean n828SumPor ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n834TipDefDsc ;
   private String AV25Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T000T7_A407EmprNom ;
   private boolean[] T000T7_n407EmprNom ;
   private short[] T000T9_A828SumPor ;
   private boolean[] T000T9_n828SumPor ;
   private int[] T000T11_A361DisCod ;
   private String[] T000T11_A407EmprNom ;
   private boolean[] T000T11_n407EmprNom ;
   private String[] T000T11_A396EmprCod ;
   private short[] T000T11_A828SumPor ;
   private boolean[] T000T11_n828SumPor ;
   private String[] T000T12_A396EmprCod ;
   private int[] T000T12_A361DisCod ;
   private int[] T000T6_A361DisCod ;
   private String[] T000T6_A396EmprCod ;
   private String[] T000T13_A396EmprCod ;
   private int[] T000T13_A361DisCod ;
   private String[] T000T14_A396EmprCod ;
   private int[] T000T14_A361DisCod ;
   private int[] T000T5_A361DisCod ;
   private String[] T000T5_A396EmprCod ;
   private String[] T000T17_A396EmprCod ;
   private int[] T000T17_A361DisCod ;
   private String[] T000T17_A13376DisTraID ;
   private String[] T000T18_A396EmprCod ;
   private int[] T000T18_A361DisCod ;
   private String[] T000T18_A13213DisNormID ;
   private String[] T000T19_A396EmprCod ;
   private int[] T000T19_A361DisCod ;
   private byte[] T000T19_A13081DisDGLin ;
   private String[] T000T19_A13082DisDGDibCl ;
   private int[] T000T19_A13083DisDGDibIn ;
   private String[] T000T19_A13084DisDGComb ;
   private String[] T000T19_A13085DisDGFondo ;
   private String[] T000T20_A396EmprCod ;
   private int[] T000T20_A361DisCod ;
   private byte[] T000T20_A7068DisNotLin ;
   private String[] T000T21_A396EmprCod ;
   private int[] T000T21_A361DisCod ;
   private String[] T000T21_A10197ProEspCod ;
   private String[] T000T22_A396EmprCod ;
   private int[] T000T22_A361DisCod ;
   private short[] T000T22_A4594AccCod ;
   private String[] T000T23_A396EmprCod ;
   private int[] T000T23_A361DisCod ;
   private byte[] T000T23_A2524DisComLin ;
   private String[] T000T23_A1056DisComCod ;
   private String[] T000T23_A1032FonCod ;
   private String[] T000T24_A396EmprCod ;
   private int[] T000T24_A361DisCod ;
   private int[] T000T24_A3398DisRefBarC ;
   private byte[] T000T24_A3399DisRefBCRe ;
   private String[] T000T24_A3400DisRefBCPa ;
   private String[] T000T24_A3607DisRefBPie ;
   private String[] T000T25_A396EmprCod ;
   private int[] T000T25_A361DisCod ;
   private byte[] T000T25_A376DisObsLin ;
   private String[] T000T26_A396EmprCod ;
   private int[] T000T26_A361DisCod ;
   private String[] T000T26_A758ProCod ;
   private String[] T000T27_A396EmprCod ;
   private int[] T000T27_A129BarCod ;
   private byte[] T000T27_A132BarCodReo ;
   private String[] T000T27_A130BarCodPar ;
   private String[] T000T28_A396EmprCod ;
   private int[] T000T28_A361DisCod ;
   private int[] T000T28_A44AlbRecCod ;
   private String[] T000T29_A396EmprCod ;
   private int[] T000T29_A361DisCod ;
   private int[] T000T30_A361DisCod ;
   private short[] T000T30_A319DefPor ;
   private String[] T000T30_A834TipDefDsc ;
   private boolean[] T000T30_n834TipDefDsc ;
   private String[] T000T30_A396EmprCod ;
   private short[] T000T30_A833TipDefCod ;
   private boolean[] T000T30_n833TipDefCod ;
   private String[] T000T4_A834TipDefDsc ;
   private boolean[] T000T4_n834TipDefDsc ;
   private String[] T000T31_A834TipDefDsc ;
   private boolean[] T000T31_n834TipDefDsc ;
   private String[] T000T32_A396EmprCod ;
   private int[] T000T32_A361DisCod ;
   private short[] T000T32_A833TipDefCod ;
   private boolean[] T000T32_n833TipDefCod ;
   private int[] T000T3_A361DisCod ;
   private short[] T000T3_A319DefPor ;
   private String[] T000T3_A396EmprCod ;
   private short[] T000T3_A833TipDefCod ;
   private boolean[] T000T3_n833TipDefCod ;
   private int[] T000T2_A361DisCod ;
   private short[] T000T2_A319DefPor ;
   private String[] T000T2_A396EmprCod ;
   private short[] T000T2_A833TipDefCod ;
   private boolean[] T000T2_n833TipDefCod ;
   private String[] T000T36_A834TipDefDsc ;
   private boolean[] T000T36_n834TipDefDsc ;
   private String[] T000T37_A396EmprCod ;
   private int[] T000T37_A129BarCod ;
   private byte[] T000T37_A132BarCodReo ;
   private String[] T000T37_A130BarCodPar ;
   private String[] T000T38_A396EmprCod ;
   private int[] T000T38_A361DisCod ;
   private short[] T000T38_A833TipDefCod ;
   private boolean[] T000T38_n833TipDefCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdisdef__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisdef__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisdef__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisdef__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000T2", "SELECT DisCod, DefPor, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?  FOR UPDATE OF DefPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000T3", "SELECT DisCod, DefPor, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000T4", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T5", "SELECT DisCod, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T6", "SELECT DisCod, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T9", "SELECT COALESCE( T1.SumPor, 0) AS SumPor FROM (SELECT SUM(DefPor) AS SumPor, EmprCod, DisCod FROM TXPDISDEF GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T11", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, T2.EmprNom, TM1.EmprCod, COALESCE( T3.SumPor, 0) AS SumPor FROM ((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DefPor) AS SumPor, EmprCod, DisCod FROM TXPDISDEF GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000T15", "INSERT INTO TXPDISPOS(DisCod, EmprCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T000T16", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T000T17", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T18", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T19", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T20", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T21", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T22", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T23", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T24", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T25", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T26", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T28", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T30", "SELECT T1.DisCod, T1.DefPor, T2.TipDefDsc, T1.EmprCod, T1.TipDefCod FROM (TXPDISDEF T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.TipDefCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.TipDefCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000T31", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000T32", "SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000T33", "INSERT INTO TXPDISDEF(DisCod, DefPor, EmprCod, TipDefCod, DefMaqcod, DefCausa, DefResp) VALUES(?, ?, ?, ?, ' ', 0, 0)", GX_NOMASK, "TXPDISDEF")
         ,new UpdateCursor("T000T34", "UPDATE TXPDISDEF SET DefPor=?  WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPDISDEF")
         ,new UpdateCursor("T000T35", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPDISDEF")
         ,new ForEachCursor("T000T36", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000T37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000T38", "SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, TipDefCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

