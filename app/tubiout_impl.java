package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tubiout_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A9756Dis_CUb = httpContext.GetPar( "Dis_CUb") ;
         A9759Dis_PzU = (int)(GXutil.lval( httpContext.GetPar( "Dis_PzU"))) ;
         n9759Dis_PzU = false ;
         A9758Dis_UnU = CommonUtil.decimalVal( httpContext.GetPar( "Dis_UnU"), ".") ;
         n9758Dis_UnU = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1521279( A396EmprCod, A44AlbRecCod, A9756Dis_CUb, A9759Dis_PzU, A9758Dis_UnU) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A9756Dis_CUb = httpContext.GetPar( "Dis_CUb") ;
         AV34Oldpz = (int)(GXutil.lval( httpContext.GetPar( "Oldpz"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
         AV35OldUn = CommonUtil.decimalVal( httpContext.GetPar( "OldUn"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
         A9759Dis_PzU = (int)(GXutil.lval( httpContext.GetPar( "Dis_PzU"))) ;
         n9759Dis_PzU = false ;
         A9758Dis_UnU = CommonUtil.decimalVal( httpContext.GetPar( "Dis_UnU"), ".") ;
         n9758Dis_UnU = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_1521279( A396EmprCod, A44AlbRecCod, A9756Dis_CUb, AV34Oldpz, AV35OldUn, A9759Dis_PzU, A9758Dis_UnU) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A9756Dis_CUb = httpContext.GetPar( "Dis_CUb") ;
         AV34Oldpz = (int)(GXutil.lval( httpContext.GetPar( "Oldpz"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
         AV35OldUn = CommonUtil.decimalVal( httpContext.GetPar( "OldUn"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_1521279( A396EmprCod, A44AlbRecCod, A9756Dis_CUb, AV34Oldpz, AV35OldUn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"DIS_UBD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A9756Dis_CUb = httpContext.GetPar( "Dis_CUb") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asadis_ubd1521279( A396EmprCod, A44AlbRecCod, A9756Dis_CUb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"DIS_PZD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A9756Dis_CUb = httpContext.GetPar( "Dis_CUb") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asadis_pzd1521279( A396EmprCod, A44AlbRecCod, A9756Dis_CUb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"DIS_DUB") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9756Dis_CUb = httpContext.GetPar( "Dis_CUb") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asadis_dub1521279( A396EmprCod, A9756Dis_CUb) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "SALIDAS DE UBICACIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPiezas_Internalname ;
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
      nRC_GXsfl_100 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_100"))) ;
      nGXsfl_100_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_100_idx"))) ;
      sGXsfl_100_idx = httpContext.GetPar( "sGXsfl_100_idx") ;
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

   public tubiout_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tubiout_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tubiout_impl.class ));
   }

   public tubiout_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
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
      /* Execute user event: Exit */
      e111522 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TUBIOUT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Unidad Medida", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TUBIOUT.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPiezas_Internalname, GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPiezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPiezas_Jsonclick, 0, "", "", "", "", "", 1, edtPiezas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Kilos Dispuestos", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKilos_Enabled!=0) ? localUtil.format( A595Kilos, "ZZZZZ9.99") : localUtil.format( A595Kilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKilos_Jsonclick, 0, "", "", "", "", "", 1, edtKilos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Metros Dispuestos", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetros_Enabled!=0) ? localUtil.format( A631Metros, "ZZZZZ9.99") : localUtil.format( A631Metros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetros_Jsonclick, 0, "", "", "", "", "", 1, edtMetros_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Tot Un", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDis_SUn_Internalname, GXutil.ltrim( localUtil.ntoc( A9760Dis_SUn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDis_SUn_Enabled!=0) ? localUtil.format( A9760Dis_SUn, "ZZZZZ9.99") : localUtil.format( A9760Dis_SUn, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDis_SUn_Jsonclick, 0, "", "", "", "", "", 1, edtDis_SUn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Tot Pz", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDis_SPz_Internalname, GXutil.ltrim( localUtil.ntoc( A9761Dis_SPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDis_SPz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9761Dis_SPz), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9761Dis_SPz), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDis_SPz_Jsonclick, 0, "", "", "", "", "", 1, edtDis_SPz_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIOUT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol100( ) ;
      nGXsfl_100_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1279 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1279 = (short)(1) ;
            scanStart1521279( ) ;
            while ( RcdFound1279 != 0 )
            {
               init_level_properties1279( ) ;
               getByPrimaryKey1521279( ) ;
               addRow1521279( ) ;
               scanNext1521279( ) ;
            }
            scanEnd1521279( ) ;
            nBlankRcdCount1279 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9761Dis_SPz = A9761Dis_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         B9760Dis_SUn = A9760Dis_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         standaloneNotModal1521279( ) ;
         standaloneModal1521279( ) ;
         sMode1279 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRow1521279( ) ;
            edtavnRcdDeleted_1279_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1279_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1279_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1279_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDis_CUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_CUB_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDis_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_CUb_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDis_DUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_DUB_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDis_DUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_DUb_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDis_UnU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_UNU_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDis_UnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_UnU_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDis_PzU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_PZU_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDis_PzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_PzU_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDis_PzD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_PZD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDis_PzD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_PzD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtDis_UbD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_UBD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDis_UbD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_UbD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            if ( ( nRcdExists_1279 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1521279( ) ;
            }
            sendRow1521279( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode1279 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9761Dis_SPz = B9761Dis_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         A9760Dis_SUn = B9760Dis_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1279 = (short)(5) ;
         nRcdExists_1279 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1521279( ) ;
            while ( RcdFound1279 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1001279( ) ;
               init_level_properties1279( ) ;
               standaloneNotModal1521279( ) ;
               getByPrimaryKey1521279( ) ;
               standaloneModal1521279( ) ;
               addRow1521279( ) ;
               scanNext1521279( ) ;
            }
            scanEnd1521279( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1279 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001279( ) ;
      initAll1521279( ) ;
      init_level_properties1279( ) ;
      B9761Dis_SPz = A9761Dis_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      B9760Dis_SUn = A9760Dis_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      nRcdExists_1279 = (short)(0) ;
      nIsMod_1279 = (short)(0) ;
      nRcdDeleted_1279 = (short)(0) ;
      nBlankRcdCount1279 = (short)(nBlankRcdUsr1279+nBlankRcdCount1279) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1279 > 0 )
      {
         standaloneNotModal1521279( ) ;
         standaloneModal1521279( ) ;
         addRow1521279( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDis_CUb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1279 = (short)(nBlankRcdCount1279-1) ;
      }
      Gx_mode = sMode1279 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A9761Dis_SPz = B9761Dis_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      A9760Dis_SUn = B9760Dis_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIOUT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TUBIOUT.htm");
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
      e121522 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( "Z673Piezas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z595Kilos = localUtil.ctond( httpContext.cgiGet( "Z595Kilos")) ;
            Z631Metros = localUtil.ctond( httpContext.cgiGet( "Z631Metros")) ;
            O9761Dis_SPz = (int)(localUtil.ctol( httpContext.cgiGet( "O9761Dis_SPz"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O9760Dis_SUn = localUtil.ctond( httpContext.cgiGet( "O9760Dis_SUn")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV35OldUn = localUtil.ctond( httpContext.cgiGet( "vOLDUN")) ;
            AV34Oldpz = (int)(localUtil.ctol( httpContext.cgiGet( "vOLDPZ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PIEZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPiezas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A673Piezas = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
            }
            else
            {
               A673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "KILOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtKilos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A595Kilos = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
            }
            else
            {
               A595Kilos = localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METROS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetros_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A631Metros = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
            }
            else
            {
               A631Metros = localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
            }
            A9760Dis_SUn = localUtil.ctond( httpContext.cgiGet( edtDis_SUn_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
            A9761Dis_SPz = (int)(localUtil.ctol( httpContext.cgiGet( edtDis_SPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
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
                        e121522 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111522 ();
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
            initAll15235( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1279_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1279_Enabled), 5, 0), !bGXsfl_100_Refreshing);
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
      disableAttributes15235( ) ;
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

   public void confirm_1520( )
   {
      beforeValidate15235( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15235( ) ;
         }
         else
         {
            checkExtendedTable15235( ) ;
            if ( AnyError == 0 )
            {
               zm15235( 20) ;
               zm15235( 21) ;
               zm15235( 22) ;
               zm15235( 23) ;
            }
            closeExtendedTableCursors15235( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode35 = Gx_mode ;
         confirm_1521279( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode35 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1520( ) ;
      }
   }

   public void confirm_1521279( )
   {
      s9761Dis_SPz = O9761Dis_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      s9760Dis_SUn = O9760Dis_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1521279( ) ;
         if ( ( nRcdExists_1279 != 0 ) || ( nIsMod_1279 != 0 ) )
         {
            getKey1521279( ) ;
            if ( ( nRcdExists_1279 == 0 ) && ( nRcdDeleted_1279 == 0 ) )
            {
               if ( RcdFound1279 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1521279( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1521279( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1521279( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9761Dis_SPz = A9761Dis_SPz ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
                     O9760Dis_SUn = A9760Dis_SUn ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "DIS_CUB_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDis_CUb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1279 != 0 )
               {
                  if ( nRcdDeleted_1279 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1521279( ) ;
                     load1521279( ) ;
                     beforeValidate1521279( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1521279( ) ;
                        O9761Dis_SPz = A9761Dis_SPz ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
                        O9760Dis_SUn = A9760Dis_SUn ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1279 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1521279( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1521279( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1521279( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9761Dis_SPz = A9761Dis_SPz ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
                           O9760Dis_SUn = A9760Dis_SUn ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1279 == 0 )
                  {
                     GXCCtl = "DIS_CUB_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDis_CUb_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1279_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDis_CUb_Internalname, GXutil.rtrim( A9756Dis_CUb)) ;
         httpContext.changePostValue( edtDis_DUb_Internalname, GXutil.rtrim( A9757Dis_DUb)) ;
         httpContext.changePostValue( edtDis_UnU_Internalname, GXutil.ltrim( localUtil.ntoc( A9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDis_PzU_Internalname, GXutil.ltrim( localUtil.ntoc( A9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDis_PzD_Internalname, GXutil.ltrim( localUtil.ntoc( A9762Dis_PzD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDis_UbD_Internalname, GXutil.ltrim( localUtil.ntoc( A9763Dis_UbD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9756Dis_CUb_"+sGXsfl_100_idx, GXutil.rtrim( Z9756Dis_CUb)) ;
         httpContext.changePostValue( "ZT_"+"Z9758Dis_UnU_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9759Dis_PzU_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9759Dis_PzU_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9758Dis_UnU_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1279_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1279_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1279_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1279 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1279_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1279_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_CUB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_CUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_DUB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_DUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_UNU_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_UnU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_PZU_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_PzU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_PZD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_PzD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_UBD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_UbD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9761Dis_SPz = s9761Dis_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      O9760Dis_SUn = s9760Dis_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1520( )
   {
   }

   public void e121522( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1266_", ""), (byte)(99), GXv_char2) ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1099_", ""), (byte)(99), GXv_char2) ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV19Lit7 = httpContext.getMessage( "Piezas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      AV20Lit8 = httpContext.getMessage( "Kilos", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      AV13Lit9 = httpContext.getMessage( "Metros", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tubiout_impl.this.A396EmprCod = GXv_char2[0] ;
      tubiout_impl.this.AV11EmprNom = GXv_char3[0] ;
      tubiout_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111522 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e111522( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A361DisCod ;
      GXv_int6[0] = A44AlbRecCod ;
      new app.pubiout(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A361DisCod = GXv_int5[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      /*  Sending Event outputs  */
   }

   public void zm15235( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z673Piezas = T01525_A673Piezas[0] ;
            Z595Kilos = T01525_A595Kilos[0] ;
            Z631Metros = T01525_A631Metros[0] ;
         }
         else
         {
            Z673Piezas = A673Piezas ;
            Z595Kilos = A595Kilos ;
            Z631Metros = A631Metros ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z673Piezas = A673Piezas ;
         Z595Kilos = A595Kilos ;
         Z631Metros = A631Metros ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z361DisCod = A361DisCod ;
         Z407EmprNom = A407EmprNom ;
         Z56AlbRUni = A56AlbRUni ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z9760Dis_SUn = A9760Dis_SUn ;
         Z9761Dis_SPz = A9761Dis_SPz ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TUBIOUT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      /* Using cursor T01526 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01526_A407EmprNom[0] ;
      n407EmprNom = T01526_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01528 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      /* Using cursor T01527 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A56AlbRUni = T01527_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A58AlbRUniEnt = T01527_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = T01527_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A60AlbRUniUti = T01527_A60AlbRUniUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = T01527_A54AlbRPieUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      pr_default.close(5);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      /* Using cursor T015210 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A9760Dis_SUn = T015210_A9760Dis_SUn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         A9761Dis_SPz = T015210_A9761Dis_SPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      }
      else
      {
         A9760Dis_SUn = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         A9761Dis_SPz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      }
      O9760Dis_SUn = A9760Dis_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      O9761Dis_SPz = A9761Dis_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      pr_default.close(7);
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

   public void load15235( )
   {
      /* Using cursor T015212 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A407EmprNom = T015212_A407EmprNom[0] ;
         n407EmprNom = T015212_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A56AlbRUni = T015212_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A58AlbRUniEnt = T015212_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T015212_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A60AlbRUniUti = T015212_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A54AlbRPieUti = T015212_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A673Piezas = T015212_A673Piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         A595Kilos = T015212_A595Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         A631Metros = T015212_A631Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         A9760Dis_SUn = T015212_A9760Dis_SUn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         A9761Dis_SPz = T015212_A9761Dis_SPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         zm15235( -19) ;
      }
      pr_default.close(8);
      onLoadActions15235( ) ;
   }

   public void onLoadActions15235( )
   {
      O9761Dis_SPz = A9761Dis_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      O9760Dis_SUn = A9760Dis_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
   }

   public void checkExtendedTable15235( )
   {
      nIsDirty_35 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors15235( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15235( )
   {
      /* Using cursor T015213 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01525 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01525_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01525_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01525_A361DisCod[0] == A361DisCod ) )
      {
         zm15235( 19) ;
         RcdFound35 = (short)(1) ;
         A673Piezas = T01525_A673Piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         A595Kilos = T01525_A595Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         A631Metros = T01525_A631Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15235( ) ;
         if ( AnyError == 1 )
         {
            RcdFound35 = (short)(0) ;
            initializeNonKey15235( ) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey15235( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey15235( ) ;
      if ( RcdFound35 == 0 )
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
      RcdFound35 = (short)(0) ;
      /* Using cursor T015214 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T015214_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015214_A44AlbRecCod[0] == A44AlbRecCod ) && ( T015214_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T015214_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015214_A44AlbRecCod[0] == A44AlbRecCod ) && ( T015214_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T015215 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T015215_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015215_A44AlbRecCod[0] == A44AlbRecCod ) && ( T015215_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T015215_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015215_A44AlbRecCod[0] == A44AlbRecCod ) && ( T015215_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15235( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9761Dis_SPz = O9761Dis_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         A9760Dis_SUn = O9760Dis_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         GX_FocusControl = edtPiezas_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15235( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound35 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9761Dis_SPz = O9761Dis_SPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
               A9760Dis_SUn = O9760Dis_SUn ;
               httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPiezas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A9761Dis_SPz = O9761Dis_SPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
               A9760Dis_SUn = O9760Dis_SUn ;
               httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
               update15235( ) ;
               GX_FocusControl = edtPiezas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A9761Dis_SPz = O9761Dis_SPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
               A9760Dis_SUn = O9760Dis_SUn ;
               httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
               GX_FocusControl = edtPiezas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15235( ) ;
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
                  A9761Dis_SPz = O9761Dis_SPz ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
                  A9760Dis_SUn = O9760Dis_SUn ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
                  GX_FocusControl = edtPiezas_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15235( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9761Dis_SPz = O9761Dis_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         A9760Dis_SUn = O9760Dis_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPiezas_Internalname ;
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
      getKey15235( ) ;
      if ( RcdFound35 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tubiout");
      GX_FocusControl = edtPiezas_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1520( ) ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPiezas_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15235( ) ;
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPiezas_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15235( ) ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPiezas_Internalname ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPiezas_Internalname ;
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
      scanStart15235( ) ;
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound35 != 0 )
         {
            scanNext15235( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPiezas_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15235( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15235( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01524 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z673Piezas != T01524_A673Piezas[0] ) || ( DecimalUtil.compareTo(Z595Kilos, T01524_A595Kilos[0]) != 0 ) || ( DecimalUtil.compareTo(Z631Metros, T01524_A631Metros[0]) != 0 ) )
         {
            if ( Z673Piezas != T01524_A673Piezas[0] )
            {
               GXutil.writeLogln("tubiout:[seudo value changed for attri]"+"Piezas");
               GXutil.writeLogRaw("Old: ",Z673Piezas);
               GXutil.writeLogRaw("Current: ",T01524_A673Piezas[0]);
            }
            if ( DecimalUtil.compareTo(Z595Kilos, T01524_A595Kilos[0]) != 0 )
            {
               GXutil.writeLogln("tubiout:[seudo value changed for attri]"+"Kilos");
               GXutil.writeLogRaw("Old: ",Z595Kilos);
               GXutil.writeLogRaw("Current: ",T01524_A595Kilos[0]);
            }
            if ( DecimalUtil.compareTo(Z631Metros, T01524_A631Metros[0]) != 0 )
            {
               GXutil.writeLogln("tubiout:[seudo value changed for attri]"+"Metros");
               GXutil.writeLogRaw("Old: ",Z631Metros);
               GXutil.writeLogRaw("Current: ",T01524_A631Metros[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15235( )
   {
      beforeValidate15235( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15235( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15235( 0) ;
         checkOptimisticConcurrency15235( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15235( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15235( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015216 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A673Piezas), A595Kilos, A631Metros, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
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
                        processLevel15235( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1520( ) ;
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
            load15235( ) ;
         }
         endLevel15235( ) ;
      }
      closeExtendedTableCursors15235( ) ;
   }

   public void update15235( )
   {
      beforeValidate15235( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15235( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15235( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15235( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15235( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015217 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A673Piezas), A595Kilos, A631Metros, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15235( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel15235( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1520( ) ;
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
         endLevel15235( ) ;
      }
      closeExtendedTableCursors15235( ) ;
   }

   public void deferredUpdate15235( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15235( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15235( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15235( ) ;
         afterConfirm15235( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15235( ) ;
            if ( AnyError == 0 )
            {
               A9761Dis_SPz = O9761Dis_SPz ;
               httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
               A9760Dis_SUn = O9760Dis_SUn ;
               httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
               scanStart1521279( ) ;
               while ( RcdFound1279 != 0 )
               {
                  getByPrimaryKey1521279( ) ;
                  delete1521279( ) ;
                  scanNext1521279( ) ;
                  O9761Dis_SPz = A9761Dis_SPz ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
                  O9760Dis_SUn = A9760Dis_SUn ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
               }
               scanEnd1521279( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015218 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound35 == 0 )
                        {
                           initAll15235( ) ;
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
                        resetCaption1520( ) ;
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
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15235( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15235( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T015219 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1521279( )
   {
      s9761Dis_SPz = O9761Dis_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      s9760Dis_SUn = O9760Dis_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1521279( ) ;
         if ( ( nRcdExists_1279 != 0 ) || ( nIsMod_1279 != 0 ) )
         {
            standaloneNotModal1521279( ) ;
            getKey1521279( ) ;
            if ( ( nRcdExists_1279 == 0 ) && ( nRcdDeleted_1279 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1521279( ) ;
            }
            else
            {
               if ( RcdFound1279 != 0 )
               {
                  if ( ( nRcdDeleted_1279 != 0 ) && ( nRcdExists_1279 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1521279( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1279 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1521279( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1279 == 0 )
                  {
                     GXCCtl = "DIS_CUB_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDis_CUb_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9761Dis_SPz = A9761Dis_SPz ;
            httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
            O9760Dis_SUn = A9760Dis_SUn ;
            httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1279_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDis_CUb_Internalname, GXutil.rtrim( A9756Dis_CUb)) ;
         httpContext.changePostValue( edtDis_DUb_Internalname, GXutil.rtrim( A9757Dis_DUb)) ;
         httpContext.changePostValue( edtDis_UnU_Internalname, GXutil.ltrim( localUtil.ntoc( A9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDis_PzU_Internalname, GXutil.ltrim( localUtil.ntoc( A9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDis_PzD_Internalname, GXutil.ltrim( localUtil.ntoc( A9762Dis_PzD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDis_UbD_Internalname, GXutil.ltrim( localUtil.ntoc( A9763Dis_UbD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9756Dis_CUb_"+sGXsfl_100_idx, GXutil.rtrim( Z9756Dis_CUb)) ;
         httpContext.changePostValue( "ZT_"+"Z9758Dis_UnU_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9759Dis_PzU_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9759Dis_PzU_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9758Dis_UnU_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( O9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1279_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1279_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1279_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1279 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1279_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1279_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_CUB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_CUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_DUB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_DUb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_UNU_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_UnU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_PZU_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_PzU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_PZD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_PzD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIS_UBD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_UbD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1521279( ) ;
      if ( AnyError != 0 )
      {
         O9761Dis_SPz = s9761Dis_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         O9760Dis_SUn = s9760Dis_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      }
      nRcdExists_1279 = (short)(0) ;
      nIsMod_1279 = (short)(0) ;
      nRcdDeleted_1279 = (short)(0) ;
   }

   public void processLevel15235( )
   {
      /* Save parent mode. */
      sMode35 = Gx_mode ;
      processNestedLevel1521279( ) ;
      if ( AnyError != 0 )
      {
         O9761Dis_SPz = s9761Dis_SPz ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         O9760Dis_SUn = s9760Dis_SUn ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel15235( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15235( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tubiout");
         if ( AnyError == 0 )
         {
            confirmValues1520( ) ;
         }
         /* After transaction rules */
         if ( ( A673Piezas != A9761Dis_SPz ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.No coincide el Total Piezas UBICADAS con el Total Dispuesto", ""), 1, "PIEZAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPiezas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            return  ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tubiout");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15235( )
   {
      /* Scan By routine */
      /* Using cursor T015220 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15235( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
   }

   public void scanEnd15235( )
   {
      pr_default.close(16);
   }

   public void afterConfirm15235( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15235( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15235( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15235( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15235( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15235( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15235( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtPiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezas_Enabled), 5, 0), true);
      edtKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Enabled), 5, 0), true);
      edtMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Enabled), 5, 0), true);
      edtDis_SUn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_SUn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_SUn_Enabled), 5, 0), true);
      edtDis_SPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_SPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_SPz_Enabled), 5, 0), true);
   }

   public void zm1521279( int GX_JID )
   {
      if ( ( GX_JID == 24 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9758Dis_UnU = T01523_A9758Dis_UnU[0] ;
            Z9759Dis_PzU = T01523_A9759Dis_PzU[0] ;
         }
         else
         {
            Z9758Dis_UnU = A9758Dis_UnU ;
            Z9759Dis_PzU = A9759Dis_PzU ;
         }
      }
      if ( GX_JID == -24 )
      {
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z9756Dis_CUb = A9756Dis_CUb ;
         Z9758Dis_UnU = A9758Dis_UnU ;
         Z9759Dis_PzU = A9759Dis_PzU ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1521279( )
   {
   }

   public void standaloneModal1521279( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDis_CUb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDis_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_CUb_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
      else
      {
         edtDis_CUb_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDis_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_CUb_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
   }

   public void load1521279( )
   {
      /* Using cursor T015221 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A9756Dis_CUb});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1279 = (short)(1) ;
         A9758Dis_UnU = T015221_A9758Dis_UnU[0] ;
         n9758Dis_UnU = T015221_n9758Dis_UnU[0] ;
         A9759Dis_PzU = T015221_A9759Dis_PzU[0] ;
         n9759Dis_PzU = T015221_n9759Dis_PzU[0] ;
         zm1521279( -24) ;
      }
      pr_default.close(17);
      onLoadActions1521279( ) ;
   }

   public void onLoadActions1521279( )
   {
      GXt_decimal7 = A9763Dis_UbD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A44AlbRecCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_int8[0] = (short)(DecimalUtil.decToDouble(GXt_decimal7)) ;
      GXv_decimal9[0] = DecimalUtil.ZERO ;
      new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int8, GXv_decimal9) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int6[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_decimal7 = DecimalUtil.doubleToDec(GXv_int8[0]) ;
      A9763Dis_UbD = GXt_decimal7 ;
      GXt_int10 = (byte)(A9762Dis_PzD) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A44AlbRecCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_int8[0] = GXt_int10 ;
      GXv_int11[0] = (byte)(0) ;
      new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int8, GXv_int11) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int6[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_int10 = (byte)((byte)(GXv_int8[0])) ;
      A9762Dis_PzD = GXt_int10 ;
      GXt_char1 = A9757Dis_DUb ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9757Dis_DUb = GXt_char1 ;
      if ( isIns( )  )
      {
         A9760Dis_SUn = O9760Dis_SUn.add(A9758Dis_UnU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9760Dis_SUn = O9760Dis_SUn.add(A9758Dis_UnU).subtract(O9758Dis_UnU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9760Dis_SUn = O9760Dis_SUn.subtract(O9758Dis_UnU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
            }
         }
      }
      AV35OldUn = O9758Dis_UnU ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
      if ( isIns( )  )
      {
         A9761Dis_SPz = (int)(O9761Dis_SPz+A9759Dis_PzU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9761Dis_SPz = (int)(O9761Dis_SPz+A9759Dis_PzU-O9759Dis_PzU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9761Dis_SPz = (int)(O9761Dis_SPz-O9759Dis_PzU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
            }
         }
      }
      AV34Oldpz = O9759Dis_PzU ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
   }

   public void checkExtendedTable1521279( )
   {
      nIsDirty_1279 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1521279( ) ;
      nIsDirty_1279 = (short)(1) ;
      GXt_decimal7 = A9763Dis_UbD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A44AlbRecCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_int8[0] = (short)(DecimalUtil.decToDouble(GXt_decimal7)) ;
      GXv_decimal9[0] = DecimalUtil.ZERO ;
      new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int8, GXv_decimal9) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int6[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_decimal7 = DecimalUtil.doubleToDec(GXv_int8[0]) ;
      A9763Dis_UbD = GXt_decimal7 ;
      nIsDirty_1279 = (short)(1) ;
      GXt_int10 = (byte)(A9762Dis_PzD) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A44AlbRecCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_int8[0] = GXt_int10 ;
      GXv_int11[0] = (byte)(0) ;
      new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int8, GXv_int11) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int6[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_int10 = (byte)((byte)(GXv_int8[0])) ;
      A9762Dis_PzD = GXt_int10 ;
      nIsDirty_1279 = (short)(1) ;
      GXt_char1 = A9757Dis_DUb ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9757Dis_DUb = GXt_char1 ;
      if ( ( GXutil.strcmp(A9757Dis_DUb, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "DIS_CUB_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No existe Ubicacion", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDis_CUb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_1279 = (short)(1) ;
         A9760Dis_SUn = O9760Dis_SUn.add(A9758Dis_UnU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1279 = (short)(1) ;
            A9760Dis_SUn = O9760Dis_SUn.add(A9758Dis_UnU).subtract(O9758Dis_UnU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1279 = (short)(1) ;
               A9760Dis_SUn = O9760Dis_SUn.subtract(O9758Dis_UnU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
            }
         }
      }
      AV35OldUn = O9758Dis_UnU ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
      if ( isIns( )  )
      {
         nIsDirty_1279 = (short)(1) ;
         A9761Dis_SPz = (int)(O9761Dis_SPz+A9759Dis_PzU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1279 = (short)(1) ;
            A9761Dis_SPz = (int)(O9761Dis_SPz+A9759Dis_PzU-O9759Dis_PzU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1279 = (short)(1) ;
               A9761Dis_SPz = (int)(O9761Dis_SPz-O9759Dis_PzU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
            }
         }
      }
      AV34Oldpz = O9759Dis_PzU ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
   }

   public void closeExtendedTableCursors1521279( )
   {
   }

   public void enableDisable1521279( )
   {
   }

   public void getKey1521279( )
   {
      /* Using cursor T015222 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A9756Dis_CUb});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1279 = (short)(1) ;
      }
      else
      {
         RcdFound1279 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1521279( )
   {
      /* Using cursor T01523 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A9756Dis_CUb});
      if ( (pr_default.getStatus(1) != 101) && ( T01523_A361DisCod[0] == A361DisCod ) && ( T01523_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01523_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1521279( 24) ;
         RcdFound1279 = (short)(1) ;
         initializeNonKey1521279( ) ;
         A9756Dis_CUb = T01523_A9756Dis_CUb[0] ;
         A9758Dis_UnU = T01523_A9758Dis_UnU[0] ;
         n9758Dis_UnU = T01523_n9758Dis_UnU[0] ;
         A9759Dis_PzU = T01523_A9759Dis_PzU[0] ;
         n9759Dis_PzU = T01523_n9759Dis_PzU[0] ;
         O9759Dis_PzU = A9759Dis_PzU ;
         n9759Dis_PzU = false ;
         O9758Dis_UnU = A9758Dis_UnU ;
         n9758Dis_UnU = false ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z9756Dis_CUb = A9756Dis_CUb ;
         sMode1279 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1521279( ) ;
         load1521279( ) ;
         Gx_mode = sMode1279 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1279 = (short)(0) ;
         initializeNonKey1521279( ) ;
         sMode1279 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1521279( ) ;
         Gx_mode = sMode1279 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1521279( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1521279( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01522 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A9756Dis_CUb});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIOUT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9758Dis_UnU, T01522_A9758Dis_UnU[0]) != 0 ) || ( Z9759Dis_PzU != T01522_A9759Dis_PzU[0] ) )
         {
            if ( DecimalUtil.compareTo(Z9758Dis_UnU, T01522_A9758Dis_UnU[0]) != 0 )
            {
               GXutil.writeLogln("tubiout:[seudo value changed for attri]"+"Dis_UnU");
               GXutil.writeLogRaw("Old: ",Z9758Dis_UnU);
               GXutil.writeLogRaw("Current: ",T01522_A9758Dis_UnU[0]);
            }
            if ( Z9759Dis_PzU != T01522_A9759Dis_PzU[0] )
            {
               GXutil.writeLogln("tubiout:[seudo value changed for attri]"+"Dis_PzU");
               GXutil.writeLogRaw("Old: ",Z9759Dis_PzU);
               GXutil.writeLogRaw("Current: ",T01522_A9759Dis_PzU[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUBIOUT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1521279( )
   {
      beforeValidate1521279( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1521279( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1521279( 0) ;
         checkOptimisticConcurrency1521279( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1521279( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1521279( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015223 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A9756Dis_CUb, Boolean.valueOf(n9758Dis_UnU), A9758Dis_UnU, Boolean.valueOf(n9759Dis_PzU), Integer.valueOf(A9759Dis_PzU), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIOUT");
                  if ( (pr_default.getStatus(19) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A44AlbRecCod ;
                        GXv_char3[0] = A9756Dis_CUb ;
                        GXv_int8[0] = (short)(0) ;
                        GXv_int5[0] = 0 ;
                        GXv_decimal9[0] = DecimalUtil.doubleToDec(A9759Dis_PzU) ;
                        GXv_int12[0] = (int)(DecimalUtil.decToDouble(A9758Dis_UnU)) ;
                        GXv_decimal13[0] = DecimalUtil.ZERO ;
                        new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int8, GXv_int5, GXv_decimal9, GXv_int12, GXv_decimal13) ;
                        tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
                        tubiout_impl.this.A44AlbRecCod = GXv_int6[0] ;
                        tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
                        tubiout_impl.this.A9759Dis_PzU = (int)(DecimalUtil.decToDouble(GXv_decimal9[0])) ;
                        tubiout_impl.this.A9758Dis_UnU = DecimalUtil.doubleToDec(GXv_int12[0]) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                     }
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
            load1521279( ) ;
         }
         endLevel1521279( ) ;
      }
      closeExtendedTableCursors1521279( ) ;
   }

   public void update1521279( )
   {
      beforeValidate1521279( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1521279( ) ;
      }
      if ( ( nIsMod_1279 != 0 ) || ( nIsDirty_1279 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1521279( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1521279( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1521279( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015224 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n9758Dis_UnU), A9758Dis_UnU, Boolean.valueOf(n9759Dis_PzU), Integer.valueOf(A9759Dis_PzU), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A9756Dis_CUb});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIOUT");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIOUT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1521279( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int12[0] = A44AlbRecCod ;
                           GXv_char3[0] = A9756Dis_CUb ;
                           GXv_int8[0] = (short)(AV34Oldpz) ;
                           GXv_int6[0] = (int)(DecimalUtil.decToDouble(AV35OldUn)) ;
                           GXv_decimal13[0] = DecimalUtil.doubleToDec(A9759Dis_PzU) ;
                           GXv_int5[0] = (int)(DecimalUtil.decToDouble(A9758Dis_UnU)) ;
                           GXv_decimal9[0] = DecimalUtil.ZERO ;
                           new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_int6, GXv_decimal13, GXv_int5, GXv_decimal9) ;
                           tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
                           tubiout_impl.this.A44AlbRecCod = GXv_int12[0] ;
                           tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
                           tubiout_impl.this.AV34Oldpz = GXv_int8[0] ;
                           tubiout_impl.this.AV35OldUn = DecimalUtil.doubleToDec(GXv_int6[0]) ;
                           tubiout_impl.this.A9759Dis_PzU = (int)(DecimalUtil.decToDouble(GXv_decimal13[0])) ;
                           tubiout_impl.this.A9758Dis_UnU = DecimalUtil.doubleToDec(GXv_int5[0]) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1521279( ) ;
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
            endLevel1521279( ) ;
         }
      }
      closeExtendedTableCursors1521279( ) ;
   }

   public void deferredUpdate1521279( )
   {
   }

   public void delete1521279( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1521279( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1521279( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1521279( ) ;
         afterConfirm1521279( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1521279( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015225 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A9756Dis_CUb});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIOUT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int12[0] = A44AlbRecCod ;
                     GXv_char3[0] = A9756Dis_CUb ;
                     GXv_int8[0] = (short)(AV34Oldpz) ;
                     GXv_int6[0] = (int)(DecimalUtil.decToDouble(AV35OldUn)) ;
                     GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_int5[0] = 0 ;
                     GXv_decimal9[0] = DecimalUtil.ZERO ;
                     new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_int6, GXv_decimal13, GXv_int5, GXv_decimal9) ;
                     tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
                     tubiout_impl.this.A44AlbRecCod = GXv_int12[0] ;
                     tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
                     tubiout_impl.this.AV34Oldpz = GXv_int8[0] ;
                     tubiout_impl.this.AV35OldUn = DecimalUtil.doubleToDec(GXv_int6[0]) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
                  }
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
      sMode1279 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1521279( ) ;
      Gx_mode = sMode1279 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1521279( )
   {
      standaloneModal1521279( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_decimal7 = A9763Dis_UbD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A44AlbRecCod ;
         GXv_char3[0] = A9756Dis_CUb ;
         GXv_int8[0] = (short)(DecimalUtil.decToDouble(GXt_decimal7)) ;
         GXv_decimal13[0] = DecimalUtil.ZERO ;
         new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_decimal13) ;
         tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
         tubiout_impl.this.A44AlbRecCod = GXv_int12[0] ;
         tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
         tubiout_impl.this.GXt_decimal7 = DecimalUtil.doubleToDec(GXv_int8[0]) ;
         A9763Dis_UbD = GXt_decimal7 ;
         GXt_int10 = (byte)(A9762Dis_PzD) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A44AlbRecCod ;
         GXv_char3[0] = A9756Dis_CUb ;
         GXv_int8[0] = GXt_int10 ;
         GXv_int11[0] = (byte)(0) ;
         new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_int11) ;
         tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
         tubiout_impl.this.A44AlbRecCod = GXv_int12[0] ;
         tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
         tubiout_impl.this.GXt_int10 = (byte)((byte)(GXv_int8[0])) ;
         A9762Dis_PzD = GXt_int10 ;
         GXt_char1 = A9757Dis_DUb ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A9756Dis_CUb ;
         GXv_char2[0] = GXt_char1 ;
         new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
         tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
         tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9757Dis_DUb = GXt_char1 ;
         if ( isIns( )  )
         {
            A9760Dis_SUn = O9760Dis_SUn.add(A9758Dis_UnU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9760Dis_SUn = O9760Dis_SUn.add(A9758Dis_UnU).subtract(O9758Dis_UnU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9760Dis_SUn = O9760Dis_SUn.subtract(O9758Dis_UnU) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
               }
            }
         }
         AV35OldUn = O9758Dis_UnU ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
         if ( isIns( )  )
         {
            A9761Dis_SPz = (int)(O9761Dis_SPz+A9759Dis_PzU) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9761Dis_SPz = (int)(O9761Dis_SPz+A9759Dis_PzU-O9759Dis_PzU) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9761Dis_SPz = (int)(O9761Dis_SPz-O9759Dis_PzU) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
               }
            }
         }
         AV34Oldpz = O9759Dis_PzU ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
      }
   }

   public void endLevel1521279( )
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

   public void scanStart1521279( )
   {
      /* Scan By routine */
      /* Using cursor T015226 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound1279 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1279 = (short)(1) ;
         A9756Dis_CUb = T015226_A9756Dis_CUb[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1521279( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1279 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1279 = (short)(1) ;
         A9756Dis_CUb = T015226_A9756Dis_CUb[0] ;
      }
   }

   public void scanEnd1521279( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1521279( )
   {
      /* After Confirm Rules */
      if ( ( A9758Dis_UnU.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "DIS_UNU_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. No ha entrado Unidades", ""), 0, GXCCtl);
      }
      if ( ( A9759Dis_PzU == 0 ) && true /* After */ )
      {
         GXCCtl = "DIS_PZU_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No ha entrado Piezas", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDis_PzU_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( ( A9759Dis_PzU - AV34Oldpz ) > A9762Dis_PzD ) && true /* After */ && true /* After */ )
      {
         GXCCtl = "DIS_PZU_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Piezas superior a las disponibles en Ubicacion", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDis_PzU_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1521279( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1521279( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1521279( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1521279( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1521279( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1521279( )
   {
      edtDis_CUb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_CUb_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtDis_DUb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_DUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_DUb_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtDis_UnU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_UnU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_UnU_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtDis_PzU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_PzU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_PzU_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtDis_PzD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_PzD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_PzD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtDis_UbD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_UbD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_UbD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void send_integrity_lvl_hashes1521279( )
   {
   }

   public void send_integrity_lvl_hashes15235( )
   {
   }

   public void subsflControlProps_1001279( )
   {
      edtavnRcdDeleted_1279_Internalname = "vNRCDDELETED_1279_"+sGXsfl_100_idx ;
      edtDis_CUb_Internalname = "DIS_CUB_"+sGXsfl_100_idx ;
      edtDis_DUb_Internalname = "DIS_DUB_"+sGXsfl_100_idx ;
      edtDis_UnU_Internalname = "DIS_UNU_"+sGXsfl_100_idx ;
      edtDis_PzU_Internalname = "DIS_PZU_"+sGXsfl_100_idx ;
      edtDis_PzD_Internalname = "DIS_PZD_"+sGXsfl_100_idx ;
      edtDis_UbD_Internalname = "DIS_UBD_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_1001279( )
   {
      edtavnRcdDeleted_1279_Internalname = "vNRCDDELETED_1279_"+sGXsfl_100_fel_idx ;
      edtDis_CUb_Internalname = "DIS_CUB_"+sGXsfl_100_fel_idx ;
      edtDis_DUb_Internalname = "DIS_DUB_"+sGXsfl_100_fel_idx ;
      edtDis_UnU_Internalname = "DIS_UNU_"+sGXsfl_100_fel_idx ;
      edtDis_PzU_Internalname = "DIS_PZU_"+sGXsfl_100_fel_idx ;
      edtDis_PzD_Internalname = "DIS_PZD_"+sGXsfl_100_fel_idx ;
      edtDis_UbD_Internalname = "DIS_UBD_"+sGXsfl_100_fel_idx ;
   }

   public void addRow1521279( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001279( ) ;
      sendRow1521279( ) ;
   }

   public void sendRow1521279( )
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
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1279_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1279_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1279_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1279), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1279), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1279_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1279_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1279_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDis_CUb_Internalname,GXutil.rtrim( A9756Dis_CUb),GXutil.rtrim( localUtil.format( A9756Dis_CUb, "!!!/!!!!!!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDis_CUb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDis_CUb_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDis_DUb_Internalname,GXutil.rtrim( A9757Dis_DUb),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDis_DUb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDis_DUb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1279_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDis_UnU_Internalname,GXutil.ltrim( localUtil.ntoc( A9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDis_UnU_Enabled!=0) ? localUtil.format( A9758Dis_UnU, "ZZZZZ9.99") : localUtil.format( A9758Dis_UnU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDis_UnU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDis_UnU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1279_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDis_PzU_Internalname,GXutil.ltrim( localUtil.ntoc( A9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDis_PzU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9759Dis_PzU), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9759Dis_PzU), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDis_PzU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDis_PzU_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDis_PzD_Internalname,GXutil.ltrim( localUtil.ntoc( A9762Dis_PzD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDis_PzD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9762Dis_PzD), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9762Dis_PzD), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDis_PzD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDis_PzD_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDis_UbD_Internalname,GXutil.ltrim( localUtil.ntoc( A9763Dis_UbD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDis_UbD_Enabled!=0) ? localUtil.format( A9763Dis_UbD, "ZZZZZ9.99") : localUtil.format( A9763Dis_UbD, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDis_UbD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDis_UbD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1521279( ) ;
      GXCCtl = "Z9756Dis_CUb_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9756Dis_CUb));
      GXCCtl = "Z9758Dis_UnU_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9759Dis_PzU_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9759Dis_PzU_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9759Dis_PzU, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9758Dis_UnU_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9758Dis_UnU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1279_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1279_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1279_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1279, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1279_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1279_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIS_CUB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_CUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIS_DUB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_DUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIS_UNU_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_UnU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIS_PZU_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_PzU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIS_PZD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_PzD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIS_UBD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_UbD_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1521279( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001279( ) ;
      edtavnRcdDeleted_1279_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1279_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDis_CUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_CUB_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDis_DUb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_DUB_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDis_UnU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_UNU_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDis_PzU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_PZU_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDis_PzD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_PZD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDis_UbD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIS_UBD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1279_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1279_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1279");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1279_Internalname ;
         wbErr = true ;
         nRcdDeleted_1279 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1279 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1279_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9756Dis_CUb = httpContext.cgiGet( edtDis_CUb_Internalname) ;
      A9757Dis_DUb = httpContext.cgiGet( edtDis_DUb_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDis_UnU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDis_UnU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DIS_UNU_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDis_UnU_Internalname ;
         wbErr = true ;
         A9758Dis_UnU = DecimalUtil.ZERO ;
         n9758Dis_UnU = false ;
      }
      else
      {
         A9758Dis_UnU = localUtil.ctond( httpContext.cgiGet( edtDis_UnU_Internalname)) ;
         n9758Dis_UnU = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDis_PzU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDis_PzU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "DIS_PZU_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDis_PzU_Internalname ;
         wbErr = true ;
         A9759Dis_PzU = 0 ;
         n9759Dis_PzU = false ;
      }
      else
      {
         A9759Dis_PzU = (int)(localUtil.ctol( httpContext.cgiGet( edtDis_PzU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9759Dis_PzU = false ;
      }
      A9762Dis_PzD = (int)(localUtil.ctol( httpContext.cgiGet( edtDis_PzD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A9763Dis_UbD = localUtil.ctond( httpContext.cgiGet( edtDis_UbD_Internalname)) ;
      GXCCtl = "Z9756Dis_CUb_" + sGXsfl_100_idx ;
      Z9756Dis_CUb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9758Dis_UnU_" + sGXsfl_100_idx ;
      Z9758Dis_UnU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9759Dis_PzU_" + sGXsfl_100_idx ;
      Z9759Dis_PzU = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O9759Dis_PzU_" + sGXsfl_100_idx ;
      O9759Dis_PzU = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O9758Dis_UnU_" + sGXsfl_100_idx ;
      O9758Dis_UnU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1279_" + sGXsfl_100_idx ;
      nRcdDeleted_1279 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1279_" + sGXsfl_100_idx ;
      nRcdExists_1279 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1279_" + sGXsfl_100_idx ;
      nIsMod_1279 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDis_CUb_Enabled = edtDis_CUb_Enabled ;
   }

   public void confirmValues1520( )
   {
      nGXsfl_100_idx = 0 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001279( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001279( ) ;
         httpContext.changePostValue( "Z9756Dis_CUb_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z9756Dis_CUb_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9756Dis_CUb_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z9758Dis_UnU_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z9758Dis_UnU_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9758Dis_UnU_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z9759Dis_PzU_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z9759Dis_PzU_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9759Dis_PzU_"+sGXsfl_100_idx) ;
      }
      httpContext.changePostValue( "O9759Dis_PzU", httpContext.cgiGet( "T9759Dis_PzU")) ;
      httpContext.deletePostValue( "T9759Dis_PzU") ;
      httpContext.changePostValue( "O9758Dis_UnU", httpContext.cgiGet( "T9758Dis_UnU")) ;
      httpContext.deletePostValue( "T9758Dis_UnU") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tubiout", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","DisCod","AlbRecCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z673Piezas", GXutil.ltrim( localUtil.ntoc( Z673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z595Kilos", GXutil.ltrim( localUtil.ntoc( Z595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z631Metros", GXutil.ltrim( localUtil.ntoc( Z631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9761Dis_SPz", GXutil.ltrim( localUtil.ntoc( O9761Dis_SPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O9760Dis_SUn", GXutil.ltrim( localUtil.ntoc( O9760Dis_SUn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDUN", GXutil.ltrim( localUtil.ntoc( AV35OldUn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPZ", GXutil.ltrim( localUtil.ntoc( AV34Oldpz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tubiout", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","DisCod","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "TUBIOUT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "SALIDAS DE UBICACIONES", "") ;
   }

   public void initializeNonKey15235( )
   {
      A673Piezas = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      A595Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      A631Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      O9761Dis_SPz = A9761Dis_SPz ;
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      O9760Dis_SUn = A9760Dis_SUn ;
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
      Z673Piezas = 0 ;
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
   }

   public void initAll15235( )
   {
      initializeNonKey15235( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1521279( )
   {
      AV35OldUn = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
      AV34Oldpz = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
      A9757Dis_DUb = "" ;
      A9762Dis_PzD = 0 ;
      A9763Dis_UbD = DecimalUtil.ZERO ;
      A9758Dis_UnU = DecimalUtil.ZERO ;
      n9758Dis_UnU = false ;
      A9759Dis_PzU = 0 ;
      n9759Dis_PzU = false ;
      O9759Dis_PzU = A9759Dis_PzU ;
      n9759Dis_PzU = false ;
      O9758Dis_UnU = A9758Dis_UnU ;
      n9758Dis_UnU = false ;
      Z9758Dis_UnU = DecimalUtil.ZERO ;
      Z9759Dis_PzU = 0 ;
   }

   public void initAll1521279( )
   {
      A9756Dis_CUb = "" ;
      initializeNonKey1521279( ) ;
   }

   public void standaloneModalInsert1521279( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543198", true, true);
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
      httpContext.AddJavascriptSource("tubiout.js", "?20268241543198", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1279( )
   {
      edtDis_CUb_Enabled = defedtDis_CUb_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDis_CUb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDis_CUb_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void startgridcontrol100( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1279, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1279_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9756Dis_CUb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_CUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9757Dis_DUb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_DUb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9758Dis_UnU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_UnU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9759Dis_PzU, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_PzU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9762Dis_PzD, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_PzD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9763Dis_UbD, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDis_UbD_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPiezas_Internalname = "PIEZAS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtKilos_Internalname = "KILOS" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtMetros_Internalname = "METROS" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDis_SUn_Internalname = "DIS_SUN" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDis_SPz_Internalname = "DIS_SPZ" ;
      edtavnRcdDeleted_1279_Internalname = "vNRCDDELETED_1279" ;
      edtDis_CUb_Internalname = "DIS_CUB" ;
      edtDis_DUb_Internalname = "DIS_DUB" ;
      edtDis_UnU_Internalname = "DIS_UNU" ;
      edtDis_PzU_Internalname = "DIS_PZU" ;
      edtDis_PzD_Internalname = "DIS_PZD" ;
      edtDis_UbD_Internalname = "DIS_UBD" ;
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
      Form.setCaption( httpContext.getMessage( "SALIDAS DE UBICACIONES", "") );
      edtDis_UbD_Jsonclick = "" ;
      edtDis_PzD_Jsonclick = "" ;
      edtDis_PzU_Jsonclick = "" ;
      edtDis_UnU_Jsonclick = "" ;
      edtDis_DUb_Jsonclick = "" ;
      edtDis_CUb_Jsonclick = "" ;
      edtavnRcdDeleted_1279_Jsonclick = "" ;
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
      edtDis_UbD_Enabled = 0 ;
      edtDis_PzD_Enabled = 0 ;
      edtDis_PzU_Enabled = 1 ;
      edtDis_UnU_Enabled = 1 ;
      edtDis_DUb_Enabled = 0 ;
      edtDis_CUb_Enabled = 1 ;
      edtavnRcdDeleted_1279_Enabled = 1 ;
      edtDis_SPz_Jsonclick = "" ;
      edtDis_SPz_Backcolor = (int)(0xFFFFFF) ;
      edtDis_SPz_Enabled = 0 ;
      edtDis_SUn_Jsonclick = "" ;
      edtDis_SUn_Backcolor = (int)(0xFFFFFF) ;
      edtDis_SUn_Enabled = 0 ;
      edtMetros_Jsonclick = "" ;
      edtMetros_Backcolor = (int)(0xFFFFFF) ;
      edtMetros_Enabled = 1 ;
      edtKilos_Jsonclick = "" ;
      edtKilos_Backcolor = (int)(0xFFFFFF) ;
      edtKilos_Enabled = 1 ;
      edtPiezas_Jsonclick = "" ;
      edtPiezas_Backcolor = (int)(0xFFFFFF) ;
      edtPiezas_Enabled = 1 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniEnt_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      cmbAlbRUni.setIBackground( (int)(0xFFFFFF) );
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 0 ;
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

   public void gx4asadis_ubd1521279( String A396EmprCod ,
                                     int A44AlbRecCod ,
                                     String A9756Dis_CUb )
   {
      GXt_decimal7 = A9763Dis_UbD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A44AlbRecCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_int8[0] = (short)(DecimalUtil.decToDouble(GXt_decimal7)) ;
      GXv_decimal13[0] = DecimalUtil.ZERO ;
      new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_decimal13) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int12[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_decimal7 = DecimalUtil.doubleToDec(GXv_int8[0]) ;
      A9763Dis_UbD = GXt_decimal7 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9763Dis_UbD, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asadis_pzd1521279( String A396EmprCod ,
                                     int A44AlbRecCod ,
                                     String A9756Dis_CUb )
   {
      GXt_int10 = (byte)(A9762Dis_PzD) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A44AlbRecCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_int8[0] = GXt_int10 ;
      GXv_int11[0] = (byte)(0) ;
      new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_int11) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int12[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_int10 = (byte)((byte)(GXv_int8[0])) ;
      A9762Dis_PzD = GXt_int10 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9762Dis_PzD, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asadis_dub1521279( String A396EmprCod ,
                                     String A9756Dis_CUb )
   {
      GXt_char1 = A9757Dis_DUb ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9757Dis_DUb = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9757Dis_DUb))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_15_1521279( String A396EmprCod ,
                              int A44AlbRecCod ,
                              String A9756Dis_CUb ,
                              int A9759Dis_PzU ,
                              java.math.BigDecimal A9758Dis_UnU )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A44AlbRecCod ;
         GXv_char3[0] = A9756Dis_CUb ;
         GXv_int8[0] = (short)(0) ;
         GXv_int6[0] = 0 ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(A9759Dis_PzU) ;
         GXv_int5[0] = (int)(DecimalUtil.decToDouble(A9758Dis_UnU)) ;
         GXv_decimal9[0] = DecimalUtil.ZERO ;
         new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_int6, GXv_decimal13, GXv_int5, GXv_decimal9) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int12[0] ;
         A9756Dis_CUb = GXv_char3[0] ;
         A9759Dis_PzU = (int)(DecimalUtil.decToDouble(GXv_decimal13[0])) ;
         A9758Dis_UnU = DecimalUtil.doubleToDec(GXv_int5[0]) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9756Dis_CUb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9759Dis_PzU, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9758Dis_UnU, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_16_1521279( String A396EmprCod ,
                              int A44AlbRecCod ,
                              String A9756Dis_CUb ,
                              int AV34Oldpz ,
                              java.math.BigDecimal AV35OldUn ,
                              int A9759Dis_PzU ,
                              java.math.BigDecimal A9758Dis_UnU )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A44AlbRecCod ;
         GXv_char3[0] = A9756Dis_CUb ;
         GXv_int8[0] = (short)(AV34Oldpz) ;
         GXv_int6[0] = (int)(DecimalUtil.decToDouble(AV35OldUn)) ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(A9759Dis_PzU) ;
         GXv_int5[0] = (int)(DecimalUtil.decToDouble(A9758Dis_UnU)) ;
         GXv_decimal9[0] = DecimalUtil.ZERO ;
         new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_int6, GXv_decimal13, GXv_int5, GXv_decimal9) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int12[0] ;
         A9756Dis_CUb = GXv_char3[0] ;
         AV34Oldpz = GXv_int8[0] ;
         AV35OldUn = DecimalUtil.doubleToDec(GXv_int6[0]) ;
         A9759Dis_PzU = (int)(DecimalUtil.decToDouble(GXv_decimal13[0])) ;
         A9758Dis_UnU = DecimalUtil.doubleToDec(GXv_int5[0]) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9756Dis_CUb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV34Oldpz, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35OldUn, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9759Dis_PzU, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9758Dis_UnU, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_17_1521279( String A396EmprCod ,
                              int A44AlbRecCod ,
                              String A9756Dis_CUb ,
                              int AV34Oldpz ,
                              java.math.BigDecimal AV35OldUn )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A44AlbRecCod ;
         GXv_char3[0] = A9756Dis_CUb ;
         GXv_int8[0] = (short)(AV34Oldpz) ;
         GXv_int6[0] = (int)(DecimalUtil.decToDouble(AV35OldUn)) ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int5[0] = 0 ;
         GXv_decimal9[0] = DecimalUtil.ZERO ;
         new app.pubiins(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_int6, GXv_decimal13, GXv_int5, GXv_decimal9) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int12[0] ;
         A9756Dis_CUb = GXv_char3[0] ;
         AV34Oldpz = GXv_int8[0] ;
         AV35OldUn = DecimalUtil.doubleToDec(GXv_int6[0]) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Oldpz), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrimstr( AV35OldUn, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9756Dis_CUb))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV34Oldpz, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35OldUn, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1001279( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1521279( ) ;
         standaloneModal1521279( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1521279( ) ;
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001279( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T015227 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015227_A407EmprNom[0] ;
      n407EmprNom = T015227_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T015228 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(24);
      /* Using cursor T015229 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A56AlbRUni = T015229_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A58AlbRUniEnt = T015229_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = T015229_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A60AlbRUniUti = T015229_A60AlbRUniUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = T015229_A54AlbRPieUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      pr_default.close(25);
      /* Using cursor T015231 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A9760Dis_SUn = T015231_A9760Dis_SUn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         A9761Dis_SPz = T015231_A9761Dis_SPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      }
      else
      {
         A9760Dis_SUn = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrimstr( A9760Dis_SUn, 9, 2));
         A9761Dis_SPz = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9761Dis_SPz), 6, 0));
      }
      pr_default.close(26);
      GX_FocusControl = edtPiezas_Internalname ;
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

   public void valid_Albreccod( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9760Dis_SUn", GXutil.ltrim( localUtil.ntoc( A9760Dis_SUn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9761Dis_SPz", GXutil.ltrim( localUtil.ntoc( A9761Dis_SPz, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z673Piezas", GXutil.ltrim( localUtil.ntoc( Z673Piezas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z595Kilos", GXutil.ltrim( localUtil.ntoc( Z595Kilos, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z631Metros", GXutil.ltrim( localUtil.ntoc( Z631Metros, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9760Dis_SUn", GXutil.ltrim( localUtil.ntoc( Z9760Dis_SUn, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9761Dis_SPz", GXutil.ltrim( localUtil.ntoc( Z9761Dis_SPz, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9761Dis_SPz", GXutil.ltrim( localUtil.ntoc( O9761Dis_SPz, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O9760Dis_SUn", GXutil.ltrim( localUtil.ntoc( O9760Dis_SUn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Dis_cub( )
   {
      GXt_decimal7 = A9763Dis_UbD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A44AlbRecCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_int8[0] = (short)(DecimalUtil.decToDouble(GXt_decimal7)) ;
      GXv_decimal13[0] = DecimalUtil.ZERO ;
      new app.pubisalu(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_decimal13) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int12[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_decimal7 = DecimalUtil.doubleToDec(GXv_int8[0]) ;
      A9763Dis_UbD = GXt_decimal7 ;
      GXt_int10 = (byte)(A9762Dis_PzD) ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A44AlbRecCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_int8[0] = GXt_int10 ;
      GXv_int11[0] = (byte)(0) ;
      new app.pubisalp(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_int8, GXv_int11) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A44AlbRecCod = GXv_int12[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_int10 = (byte)((byte)(GXv_int8[0])) ;
      A9762Dis_PzD = GXt_int10 ;
      GXt_char1 = A9757Dis_DUb ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9756Dis_CUb ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexiubi(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tubiout_impl.this.A396EmprCod = GXv_char4[0] ;
      tubiout_impl.this.A9756Dis_CUb = GXv_char3[0] ;
      tubiout_impl.this.GXt_char1 = GXv_char2[0] ;
      A9757Dis_DUb = GXt_char1 ;
      if ( ( GXutil.strcmp(A9757Dis_DUb, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No existe Ubicacion", ""), 1, "DIS_CUB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDis_CUb_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9763Dis_UbD", GXutil.ltrim( localUtil.ntoc( A9763Dis_UbD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9762Dis_PzD", GXutil.ltrim( localUtil.ntoc( A9762Dis_PzD, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9757Dis_DUb", GXutil.rtrim( A9757Dis_DUb));
   }

   public void valid_Dis_unu( )
   {
      n9758Dis_UnU = false ;
      AV35OldUn = O9758Dis_UnU ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldUn", GXutil.ltrim( localUtil.ntoc( AV35OldUn, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Dis_pzu( )
   {
      n9759Dis_PzU = false ;
      AV34Oldpz = O9759Dis_PzU ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV34Oldpz", GXutil.ltrim( localUtil.ntoc( AV34Oldpz, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("EXIT","{handler:'e111522',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("EXIT",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A9760Dis_SUn',fld:'DIS_SUN',pic:'ZZZZZ9.99'},{av:'A9761Dis_SPz',fld:'DIS_SPZ',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z44AlbRecCod'},{av:'Z51AlbRPieDis'},{av:'Z57AlbRUniDis'},{av:'Z407EmprNom'},{av:'Z56AlbRUni'},{av:'Z58AlbRUniEnt'},{av:'Z52AlbRPieEnt'},{av:'Z60AlbRUniUti'},{av:'Z54AlbRPieUti'},{av:'Z673Piezas'},{av:'Z595Kilos'},{av:'Z631Metros'},{av:'Z9760Dis_SUn'},{av:'Z9761Dis_SPz'},{av:'O9761Dis_SPz'},{av:'O9760Dis_SUn'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_PIEZAS","{handler:'valid_Piezas',iparms:[]");
      setEventMetadata("VALID_PIEZAS",",oparms:[]}");
      setEventMetadata("VALID_DIS_SPZ","{handler:'valid_Dis_spz',iparms:[]");
      setEventMetadata("VALID_DIS_SPZ",",oparms:[]}");
      setEventMetadata("VALID_DIS_CUB","{handler:'valid_Dis_cub',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A9756Dis_CUb',fld:'DIS_CUB',pic:'!!!/!!!!!!'},{av:'A9763Dis_UbD',fld:'DIS_UBD',pic:'ZZZZZ9.99'},{av:'A9762Dis_PzD',fld:'DIS_PZD',pic:'ZZZZZ9'},{av:'A9757Dis_DUb',fld:'DIS_DUB',pic:''}]");
      setEventMetadata("VALID_DIS_CUB",",oparms:[{av:'A9763Dis_UbD',fld:'DIS_UBD',pic:'ZZZZZ9.99'},{av:'A9762Dis_PzD',fld:'DIS_PZD',pic:'ZZZZZ9'},{av:'A9757Dis_DUb',fld:'DIS_DUB',pic:''}]}");
      setEventMetadata("VALID_DIS_UNU","{handler:'valid_Dis_unu',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O9758Dis_UnU'},{av:'O9760Dis_SUn'},{av:'A9758Dis_UnU',fld:'DIS_UNU',pic:'ZZZZZ9.99'},{av:'AV35OldUn',fld:'vOLDUN',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_DIS_UNU",",oparms:[{av:'AV35OldUn',fld:'vOLDUN',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_DIS_PZU","{handler:'valid_Dis_pzu',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O9759Dis_PzU'},{av:'O9761Dis_SPz'},{av:'A9759Dis_PzU',fld:'DIS_PZU',pic:'ZZZZZ9'},{av:'AV34Oldpz',fld:'vOLDPZ',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_DIS_PZU",",oparms:[{av:'AV34Oldpz',fld:'vOLDPZ',pic:'ZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'valid_Dis_ubd',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(24);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      O9760Dis_SUn = DecimalUtil.ZERO ;
      Z9756Dis_CUb = "" ;
      Z9758Dis_UnU = DecimalUtil.ZERO ;
      O9758Dis_UnU = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9756Dis_CUb = "" ;
      A9758Dis_UnU = DecimalUtil.ZERO ;
      AV35OldUn = DecimalUtil.ZERO ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A56AlbRUni = "" ;
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
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A631Metros = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A9760Dis_SUn = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9760Dis_SUn = DecimalUtil.ZERO ;
      sMode1279 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV36Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode35 = "" ;
      s9760Dis_SUn = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9757Dis_DUb = "" ;
      A9763Dis_UbD = DecimalUtil.ZERO ;
      T9758Dis_UnU = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV13Lit9 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z56AlbRUni = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z9760Dis_SUn = DecimalUtil.ZERO ;
      T01526_A407EmprNom = new String[] {""} ;
      T01526_n407EmprNom = new boolean[] {false} ;
      T01528_A396EmprCod = new String[] {""} ;
      T01527_A56AlbRUni = new String[] {""} ;
      T01527_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01527_A52AlbRPieEnt = new int[1] ;
      T01527_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01527_A54AlbRPieUti = new int[1] ;
      T015210_A9760Dis_SUn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015210_A9761Dis_SPz = new int[1] ;
      T015212_A407EmprNom = new String[] {""} ;
      T015212_n407EmprNom = new boolean[] {false} ;
      T015212_A56AlbRUni = new String[] {""} ;
      T015212_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015212_A52AlbRPieEnt = new int[1] ;
      T015212_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015212_A54AlbRPieUti = new int[1] ;
      T015212_A673Piezas = new int[1] ;
      T015212_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015212_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015212_A396EmprCod = new String[] {""} ;
      T015212_A44AlbRecCod = new int[1] ;
      T015212_A361DisCod = new int[1] ;
      T015212_A9760Dis_SUn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015212_A9761Dis_SPz = new int[1] ;
      T015213_A396EmprCod = new String[] {""} ;
      T015213_A361DisCod = new int[1] ;
      T015213_A44AlbRecCod = new int[1] ;
      T01525_A673Piezas = new int[1] ;
      T01525_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01525_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01525_A396EmprCod = new String[] {""} ;
      T01525_A44AlbRecCod = new int[1] ;
      T01525_A361DisCod = new int[1] ;
      T015214_A396EmprCod = new String[] {""} ;
      T015214_A44AlbRecCod = new int[1] ;
      T015214_A361DisCod = new int[1] ;
      T015215_A396EmprCod = new String[] {""} ;
      T015215_A44AlbRecCod = new int[1] ;
      T015215_A361DisCod = new int[1] ;
      T01524_A673Piezas = new int[1] ;
      T01524_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01524_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01524_A396EmprCod = new String[] {""} ;
      T01524_A44AlbRecCod = new int[1] ;
      T01524_A361DisCod = new int[1] ;
      T015219_A396EmprCod = new String[] {""} ;
      T015219_A361DisCod = new int[1] ;
      T015219_A44AlbRecCod = new int[1] ;
      T015219_A380DisPieCod = new String[] {""} ;
      T015220_A396EmprCod = new String[] {""} ;
      T015220_A361DisCod = new int[1] ;
      T015220_A44AlbRecCod = new int[1] ;
      T015221_A361DisCod = new int[1] ;
      T015221_A44AlbRecCod = new int[1] ;
      T015221_A9756Dis_CUb = new String[] {""} ;
      T015221_A9758Dis_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015221_n9758Dis_UnU = new boolean[] {false} ;
      T015221_A9759Dis_PzU = new int[1] ;
      T015221_n9759Dis_PzU = new boolean[] {false} ;
      T015221_A396EmprCod = new String[] {""} ;
      T015222_A396EmprCod = new String[] {""} ;
      T015222_A361DisCod = new int[1] ;
      T015222_A44AlbRecCod = new int[1] ;
      T015222_A9756Dis_CUb = new String[] {""} ;
      T01523_A361DisCod = new int[1] ;
      T01523_A44AlbRecCod = new int[1] ;
      T01523_A9756Dis_CUb = new String[] {""} ;
      T01523_A9758Dis_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01523_n9758Dis_UnU = new boolean[] {false} ;
      T01523_A9759Dis_PzU = new int[1] ;
      T01523_n9759Dis_PzU = new boolean[] {false} ;
      T01523_A396EmprCod = new String[] {""} ;
      T01522_A361DisCod = new int[1] ;
      T01522_A44AlbRecCod = new int[1] ;
      T01522_A9756Dis_CUb = new String[] {""} ;
      T01522_A9758Dis_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01522_n9758Dis_UnU = new boolean[] {false} ;
      T01522_A9759Dis_PzU = new int[1] ;
      T01522_n9759Dis_PzU = new boolean[] {false} ;
      T01522_A396EmprCod = new String[] {""} ;
      T015226_A396EmprCod = new String[] {""} ;
      T015226_A361DisCod = new int[1] ;
      T015226_A44AlbRecCod = new int[1] ;
      T015226_A9756Dis_CUb = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int6 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      T015227_A407EmprNom = new String[] {""} ;
      T015227_n407EmprNom = new boolean[] {false} ;
      T015228_A396EmprCod = new String[] {""} ;
      T015229_A56AlbRUni = new String[] {""} ;
      T015229_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015229_A52AlbRPieEnt = new int[1] ;
      T015229_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015229_A54AlbRPieUti = new int[1] ;
      T015231_A9760Dis_SUn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015231_A9761Dis_SPz = new int[1] ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ56AlbRUni = "" ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ595Kilos = DecimalUtil.ZERO ;
      ZZ631Metros = DecimalUtil.ZERO ;
      ZZ9760Dis_SUn = DecimalUtil.ZERO ;
      ZO9760Dis_SUn = DecimalUtil.ZERO ;
      GXt_decimal7 = DecimalUtil.ZERO ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int12 = new int[1] ;
      GXv_int8 = new short[1] ;
      GXv_int11 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z9763Dis_UbD = DecimalUtil.ZERO ;
      Z9757Dis_DUb = "" ;
      ZV35OldUn = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tubiout__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tubiout__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tubiout__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tubiout__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tubiout__default(),
         new Object[] {
             new Object[] {
            T01522_A361DisCod, T01522_A44AlbRecCod, T01522_A9756Dis_CUb, T01522_A9758Dis_UnU, T01522_n9758Dis_UnU, T01522_A9759Dis_PzU, T01522_n9759Dis_PzU, T01522_A396EmprCod
            }
            , new Object[] {
            T01523_A361DisCod, T01523_A44AlbRecCod, T01523_A9756Dis_CUb, T01523_A9758Dis_UnU, T01523_n9758Dis_UnU, T01523_A9759Dis_PzU, T01523_n9759Dis_PzU, T01523_A396EmprCod
            }
            , new Object[] {
            T01524_A673Piezas, T01524_A595Kilos, T01524_A631Metros, T01524_A396EmprCod, T01524_A44AlbRecCod, T01524_A361DisCod
            }
            , new Object[] {
            T01525_A673Piezas, T01525_A595Kilos, T01525_A631Metros, T01525_A396EmprCod, T01525_A44AlbRecCod, T01525_A361DisCod
            }
            , new Object[] {
            T01526_A407EmprNom, T01526_n407EmprNom
            }
            , new Object[] {
            T01527_A56AlbRUni, T01527_A58AlbRUniEnt, T01527_A52AlbRPieEnt, T01527_A60AlbRUniUti, T01527_A54AlbRPieUti
            }
            , new Object[] {
            T01528_A396EmprCod
            }
            , new Object[] {
            T015210_A9760Dis_SUn, T015210_A9761Dis_SPz
            }
            , new Object[] {
            T015212_A407EmprNom, T015212_n407EmprNom, T015212_A56AlbRUni, T015212_A58AlbRUniEnt, T015212_A52AlbRPieEnt, T015212_A60AlbRUniUti, T015212_A54AlbRPieUti, T015212_A673Piezas, T015212_A595Kilos, T015212_A631Metros,
            T015212_A396EmprCod, T015212_A44AlbRecCod, T015212_A361DisCod, T015212_A9760Dis_SUn, T015212_A9761Dis_SPz
            }
            , new Object[] {
            T015213_A396EmprCod, T015213_A361DisCod, T015213_A44AlbRecCod
            }
            , new Object[] {
            T015214_A396EmprCod, T015214_A44AlbRecCod, T015214_A361DisCod
            }
            , new Object[] {
            T015215_A396EmprCod, T015215_A44AlbRecCod, T015215_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015219_A396EmprCod, T015219_A361DisCod, T015219_A44AlbRecCod, T015219_A380DisPieCod
            }
            , new Object[] {
            T015220_A396EmprCod, T015220_A361DisCod, T015220_A44AlbRecCod
            }
            , new Object[] {
            T015221_A361DisCod, T015221_A44AlbRecCod, T015221_A9756Dis_CUb, T015221_A9758Dis_UnU, T015221_n9758Dis_UnU, T015221_A9759Dis_PzU, T015221_n9759Dis_PzU, T015221_A396EmprCod
            }
            , new Object[] {
            T015222_A396EmprCod, T015222_A361DisCod, T015222_A44AlbRecCod, T015222_A9756Dis_CUb
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015226_A396EmprCod, T015226_A361DisCod, T015226_A44AlbRecCod, T015226_A9756Dis_CUb
            }
            , new Object[] {
            T015227_A407EmprNom, T015227_n407EmprNom
            }
            , new Object[] {
            T015228_A396EmprCod
            }
            , new Object[] {
            T015229_A56AlbRUni, T015229_A58AlbRUniEnt, T015229_A52AlbRPieEnt, T015229_A60AlbRUniUti, T015229_A54AlbRPieUti
            }
            , new Object[] {
            T015231_A9760Dis_SUn, T015231_A9761Dis_SPz
            }
         }
      );
      Z44AlbRecCod = 0 ;
      A44AlbRecCod = 0 ;
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TUBIOUT" ;
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
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private short nRcdDeleted_1279 ;
   private short nRcdExists_1279 ;
   private short nIsMod_1279 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1279 ;
   private short RcdFound1279 ;
   private short nBlankRcdUsr1279 ;
   private short RcdFound35 ;
   private short nIsDirty_35 ;
   private short nIsDirty_1279 ;
   private short GXv_int8[] ;
   private int wcpOA361DisCod ;
   private int wcpOA44AlbRecCod ;
   private int Z361DisCod ;
   private int Z44AlbRecCod ;
   private int Z673Piezas ;
   private int O9761Dis_SPz ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int Z9759Dis_PzU ;
   private int O9759Dis_PzU ;
   private int A44AlbRecCod ;
   private int A9759Dis_PzU ;
   private int AV34Oldpz ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A673Piezas ;
   private int edtPiezas_Enabled ;
   private int edtKilos_Enabled ;
   private int edtMetros_Enabled ;
   private int edtDis_SUn_Enabled ;
   private int A9761Dis_SPz ;
   private int edtDis_SPz_Enabled ;
   private int B9761Dis_SPz ;
   private int edtavnRcdDeleted_1279_Enabled ;
   private int edtDis_CUb_Enabled ;
   private int edtDis_DUb_Enabled ;
   private int edtDis_UnU_Enabled ;
   private int edtDis_PzU_Enabled ;
   private int edtDis_PzD_Enabled ;
   private int edtDis_UbD_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s9761Dis_SPz ;
   private int A9762Dis_PzD ;
   private int T9759Dis_PzU ;
   private int GX_JID ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z9761Dis_SPz ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtDis_CUb_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtDis_SPz_Backcolor ;
   private int edtDis_SUn_Backcolor ;
   private int edtMetros_Backcolor ;
   private int edtKilos_Backcolor ;
   private int edtPiezas_Backcolor ;
   private int edtAlbRUniDis_Backcolor ;
   private int edtAlbRPieDis_Backcolor ;
   private int edtAlbRPieUti_Backcolor ;
   private int edtAlbRUniUti_Backcolor ;
   private int edtAlbRPieEnt_Backcolor ;
   private int edtAlbRUniEnt_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int Z51AlbRPieDis ;
   private int ZZ361DisCod ;
   private int ZZ44AlbRecCod ;
   private int ZZ51AlbRPieDis ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ54AlbRPieUti ;
   private int ZZ673Piezas ;
   private int ZZ9761Dis_SPz ;
   private int ZO9761Dis_SPz ;
   private int GXv_int12[] ;
   private int Z9762Dis_PzD ;
   private int ZV34Oldpz ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z595Kilos ;
   private java.math.BigDecimal Z631Metros ;
   private java.math.BigDecimal O9760Dis_SUn ;
   private java.math.BigDecimal Z9758Dis_UnU ;
   private java.math.BigDecimal O9758Dis_UnU ;
   private java.math.BigDecimal A9758Dis_UnU ;
   private java.math.BigDecimal AV35OldUn ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A9760Dis_SUn ;
   private java.math.BigDecimal B9760Dis_SUn ;
   private java.math.BigDecimal s9760Dis_SUn ;
   private java.math.BigDecimal A9763Dis_UbD ;
   private java.math.BigDecimal T9758Dis_UnU ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z9760Dis_SUn ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ595Kilos ;
   private java.math.BigDecimal ZZ631Metros ;
   private java.math.BigDecimal ZZ9760Dis_SUn ;
   private java.math.BigDecimal ZO9760Dis_SUn ;
   private java.math.BigDecimal GXt_decimal7 ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal Z9763Dis_UbD ;
   private java.math.BigDecimal ZV35OldUn ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z9756Dis_CUb ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9756Dis_CUb ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPiezas_Internalname ;
   private String sGXsfl_100_idx="0001" ;
   private String Gx_mode ;
   private String A56AlbRUni ;
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
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPiezas_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtKilos_Internalname ;
   private String edtKilos_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtMetros_Internalname ;
   private String edtMetros_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDis_SUn_Internalname ;
   private String edtDis_SUn_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDis_SPz_Internalname ;
   private String edtDis_SPz_Jsonclick ;
   private String sMode1279 ;
   private String edtavnRcdDeleted_1279_Internalname ;
   private String edtDis_CUb_Internalname ;
   private String edtDis_DUb_Internalname ;
   private String edtDis_UnU_Internalname ;
   private String edtDis_PzU_Internalname ;
   private String edtDis_PzD_Internalname ;
   private String edtDis_UbD_Internalname ;
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
   private String AV36Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode35 ;
   private String GXCCtl ;
   private String A9757Dis_DUb ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV13Lit9 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z56AlbRUni ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1279_Jsonclick ;
   private String edtDis_CUb_Jsonclick ;
   private String edtDis_DUb_Jsonclick ;
   private String edtDis_UnU_Jsonclick ;
   private String edtDis_PzU_Jsonclick ;
   private String edtDis_PzD_Jsonclick ;
   private String edtDis_UbD_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ56AlbRUni ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z9757Dis_DUb ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9759Dis_PzU ;
   private boolean n9758Dis_UnU ;
   private boolean wbErr ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] T01526_A407EmprNom ;
   private boolean[] T01526_n407EmprNom ;
   private String[] T01528_A396EmprCod ;
   private String[] T01527_A56AlbRUni ;
   private java.math.BigDecimal[] T01527_A58AlbRUniEnt ;
   private int[] T01527_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01527_A60AlbRUniUti ;
   private int[] T01527_A54AlbRPieUti ;
   private java.math.BigDecimal[] T015210_A9760Dis_SUn ;
   private int[] T015210_A9761Dis_SPz ;
   private String[] T015212_A407EmprNom ;
   private boolean[] T015212_n407EmprNom ;
   private String[] T015212_A56AlbRUni ;
   private java.math.BigDecimal[] T015212_A58AlbRUniEnt ;
   private int[] T015212_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T015212_A60AlbRUniUti ;
   private int[] T015212_A54AlbRPieUti ;
   private int[] T015212_A673Piezas ;
   private java.math.BigDecimal[] T015212_A595Kilos ;
   private java.math.BigDecimal[] T015212_A631Metros ;
   private String[] T015212_A396EmprCod ;
   private int[] T015212_A44AlbRecCod ;
   private int[] T015212_A361DisCod ;
   private java.math.BigDecimal[] T015212_A9760Dis_SUn ;
   private int[] T015212_A9761Dis_SPz ;
   private String[] T015213_A396EmprCod ;
   private int[] T015213_A361DisCod ;
   private int[] T015213_A44AlbRecCod ;
   private int[] T01525_A673Piezas ;
   private java.math.BigDecimal[] T01525_A595Kilos ;
   private java.math.BigDecimal[] T01525_A631Metros ;
   private String[] T01525_A396EmprCod ;
   private int[] T01525_A44AlbRecCod ;
   private int[] T01525_A361DisCod ;
   private String[] T015214_A396EmprCod ;
   private int[] T015214_A44AlbRecCod ;
   private int[] T015214_A361DisCod ;
   private String[] T015215_A396EmprCod ;
   private int[] T015215_A44AlbRecCod ;
   private int[] T015215_A361DisCod ;
   private int[] T01524_A673Piezas ;
   private java.math.BigDecimal[] T01524_A595Kilos ;
   private java.math.BigDecimal[] T01524_A631Metros ;
   private String[] T01524_A396EmprCod ;
   private int[] T01524_A44AlbRecCod ;
   private int[] T01524_A361DisCod ;
   private String[] T015219_A396EmprCod ;
   private int[] T015219_A361DisCod ;
   private int[] T015219_A44AlbRecCod ;
   private String[] T015219_A380DisPieCod ;
   private String[] T015220_A396EmprCod ;
   private int[] T015220_A361DisCod ;
   private int[] T015220_A44AlbRecCod ;
   private int[] T015221_A361DisCod ;
   private int[] T015221_A44AlbRecCod ;
   private String[] T015221_A9756Dis_CUb ;
   private java.math.BigDecimal[] T015221_A9758Dis_UnU ;
   private boolean[] T015221_n9758Dis_UnU ;
   private int[] T015221_A9759Dis_PzU ;
   private boolean[] T015221_n9759Dis_PzU ;
   private String[] T015221_A396EmprCod ;
   private String[] T015222_A396EmprCod ;
   private int[] T015222_A361DisCod ;
   private int[] T015222_A44AlbRecCod ;
   private String[] T015222_A9756Dis_CUb ;
   private int[] T01523_A361DisCod ;
   private int[] T01523_A44AlbRecCod ;
   private String[] T01523_A9756Dis_CUb ;
   private java.math.BigDecimal[] T01523_A9758Dis_UnU ;
   private boolean[] T01523_n9758Dis_UnU ;
   private int[] T01523_A9759Dis_PzU ;
   private boolean[] T01523_n9759Dis_PzU ;
   private String[] T01523_A396EmprCod ;
   private int[] T01522_A361DisCod ;
   private int[] T01522_A44AlbRecCod ;
   private String[] T01522_A9756Dis_CUb ;
   private java.math.BigDecimal[] T01522_A9758Dis_UnU ;
   private boolean[] T01522_n9758Dis_UnU ;
   private int[] T01522_A9759Dis_PzU ;
   private boolean[] T01522_n9759Dis_PzU ;
   private String[] T01522_A396EmprCod ;
   private String[] T015226_A396EmprCod ;
   private int[] T015226_A361DisCod ;
   private int[] T015226_A44AlbRecCod ;
   private String[] T015226_A9756Dis_CUb ;
   private String[] T015227_A407EmprNom ;
   private boolean[] T015227_n407EmprNom ;
   private String[] T015228_A396EmprCod ;
   private String[] T015229_A56AlbRUni ;
   private java.math.BigDecimal[] T015229_A58AlbRUniEnt ;
   private int[] T015229_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T015229_A60AlbRUniUti ;
   private int[] T015229_A54AlbRPieUti ;
   private java.math.BigDecimal[] T015231_A9760Dis_SUn ;
   private int[] T015231_A9761Dis_SPz ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tubiout__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubiout__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubiout__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubiout__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubiout__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01522", "SELECT DisCod, AlbRecCod, Dis_CUb, Dis_UnU, Dis_PzU, EmprCod FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND Dis_CUb = ?  FOR UPDATE OF Dis_UnU, Dis_PzU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01523", "SELECT DisCod, AlbRecCod, Dis_CUb, Dis_UnU, Dis_PzU, EmprCod FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND Dis_CUb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01524", "SELECT Piezas, Kilos, Metros, EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?  FOR UPDATE OF Piezas, Kilos, Metros NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01525", "SELECT Piezas, Kilos, Metros, EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01526", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01527", "SELECT AlbRUni, AlbRUniEnt, AlbRPieEnt, AlbRUniUti, AlbRPieUti FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01528", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015210", "SELECT COALESCE( T1.Dis_SUn, 0) AS Dis_SUn, COALESCE( T1.Dis_SPz, 0) AS Dis_SPz FROM (SELECT SUM(Dis_UnU) AS Dis_SUn, EmprCod, DisCod, AlbRecCod, SUM(Dis_PzU) AS Dis_SPz FROM TXPUBIOUT GROUP BY EmprCod, DisCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015212", "SELECT /*+ FIRST_ROWS(1) */ T2.EmprNom, T3.AlbRUni, T3.AlbRUniEnt, T3.AlbRPieEnt, T3.AlbRUniUti, T3.AlbRPieUti, TM1.Piezas, TM1.Kilos, TM1.Metros, TM1.EmprCod, TM1.AlbRecCod, TM1.DisCod, COALESCE( T4.Dis_SUn, 0) AS Dis_SUn, COALESCE( T4.Dis_SPz, 0) AS Dis_SPz FROM (((TXPDISALB TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPALBREC T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) LEFT JOIN (SELECT SUM(Dis_UnU) AS Dis_SUn, EmprCod, DisCod, AlbRecCod, SUM(Dis_PzU) AS Dis_SPz FROM TXPUBIOUT GROUP BY EmprCod, DisCod, AlbRecCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.DisCod = TM1.DisCod AND T4.AlbRecCod = TM1.AlbRecCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015213", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015214", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? and AlbRecCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015215", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? and AlbRecCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015216", "INSERT INTO TXPDISALB(Piezas, Kilos, Metros, EmprCod, AlbRecCod, DisCod, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T015217", "UPDATE TXPDISALB SET Piezas=?, Kilos=?, Metros=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T015218", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new ForEachCursor("T015219", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015220", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and AlbRecCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015221", "SELECT DisCod, AlbRecCod, Dis_CUb, Dis_UnU, Dis_PzU, EmprCod FROM TXPUBIOUT WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? and Dis_CUb = ? ORDER BY EmprCod, DisCod, AlbRecCod, Dis_CUb ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015222", "SELECT EmprCod, DisCod, AlbRecCod, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND Dis_CUb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015223", "INSERT INTO TXPUBIOUT(DisCod, AlbRecCod, Dis_CUb, Dis_UnU, Dis_PzU, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPUBIOUT")
         ,new UpdateCursor("T015224", "UPDATE TXPUBIOUT SET Dis_UnU=?, Dis_PzU=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND Dis_CUb = ?", GX_NOMASK, "TXPUBIOUT")
         ,new UpdateCursor("T015225", "DELETE FROM TXPUBIOUT  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND Dis_CUb = ?", GX_NOMASK, "TXPUBIOUT")
         ,new ForEachCursor("T015226", "SELECT EmprCod, DisCod, AlbRecCod, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, Dis_CUb ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015227", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015228", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015229", "SELECT AlbRUni, AlbRUniEnt, AlbRPieEnt, AlbRUniUti, AlbRPieUti FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015231", "SELECT COALESCE( T1.Dis_SUn, 0) AS Dis_SUn, COALESCE( T1.Dis_SPz, 0) AS Dis_SPz FROM (SELECT SUM(Dis_UnU) AS Dis_SUn, EmprCod, DisCod, AlbRecCod, SUM(Dis_PzU) AS Dis_SPz FROM TXPUBIOUT GROUP BY EmprCod, DisCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 26 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               stmt.setString(6, (String)parms[7], 3);
               return;
            case 20 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setString(6, (String)parms[7], 10);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

