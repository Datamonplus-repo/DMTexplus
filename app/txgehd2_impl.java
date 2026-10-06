package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txgehd2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"XSUMPZAS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaxsumpzasN5721( A396EmprCod, A4882XDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"XSUMCANT") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asaxsumcantN5721( A396EmprCod, A4882XDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"vTOT_K") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatot_kN5721( A396EmprCod, A4882XDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"vTOT_P") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asatot_pN5721( A396EmprCod, A4882XDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel18"+"_"+"vTOT_K") == 0 )
      {
         A4890XPdasNum = (short)(GXutil.lval( httpContext.GetPar( "XPdasNum"))) ;
         n4890XPdasNum = false ;
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx18asatot_kN5722( A4890XPdasNum, Gx_mode, A396EmprCod, A4882XDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"vTOT_K") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx19asatot_kN5722( A396EmprCod, A4882XDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel20"+"_"+"vTOT_P") == 0 )
      {
         A4890XPdasNum = (short)(GXutil.lval( httpContext.GetPar( "XPdasNum"))) ;
         n4890XPdasNum = false ;
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx20asatot_pN5722( A4890XPdasNum, Gx_mode, A396EmprCod, A4882XDisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"vTOT_P") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx21asatot_pN5722( A396EmprCod, A4882XDisCod) ;
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
            A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "GENERACION HDR MANUAL", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtXCantidad_Internalname ;
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
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
      edtXLinMan_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Title", edtXLinMan_Title, !bGXsfl_70_Refreshing);
      edtXPdasNum_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPdasNum_Internalname, "Title", edtXPdasNum_Title, !bGXsfl_70_Refreshing);
      edtXCantPdas_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCantPdas_Internalname, "Title", edtXCantPdas_Title, !bGXsfl_70_Refreshing);
      edtXPzasPdas_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPzasPdas_Internalname, "Title", edtXPzasPdas_Title, !bGXsfl_70_Refreshing);
      edtXNEstilo_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNEstilo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNEstilo_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtXNPda_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNPda_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPda_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtXNPda_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNPda_Internalname, "Title", edtXNPda_Title, !bGXsfl_70_Refreshing);
      edtXNEstilo_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNEstilo_Internalname, "Title", edtXNEstilo_Title, !bGXsfl_70_Refreshing);
      A4886XUltLin = (short)(GXutil.lval( httpContext.GetPar( "XUltLin"))) ;
      n4886XUltLin = false ;
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

   public txgehd2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txgehd2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txgehd2_impl.class ));
   }

   public txgehd2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXGEHD2.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"3chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Disposicion Interna", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4882XDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4882XDisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4882XDisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"8chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtXDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Ultimo Linea", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4886XUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4886XUltLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4886XUltLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"4chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXUltLin_Jsonclick, 0, "", "", "", "", "", 1, edtXUltLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Suma de Cantidad", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXSumCant_Internalname, GXutil.ltrim( localUtil.ntoc( A4887XSumCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXSumCant_Enabled!=0) ? localUtil.format( A4887XSumCant, "ZZZZZ9.99") : localUtil.format( A4887XSumCant, "ZZZZZ9.99"))), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"9chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXSumCant_Jsonclick, 0, "", "", "", "", "", 1, edtXSumCant_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Suma de Piezas", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXSumPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A4888XSumPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXSumPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4888XSumPzas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4888XSumPzas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"4chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXSumPzas_Jsonclick, 0, "", "", "", "", "", 1, edtXSumPzas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cantidad (Kilos o Metros)", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A4883XCantidad, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXCantidad_Enabled!=0) ? localUtil.format( A4883XCantidad, "ZZZZZ9.99") : localUtil.format( A4883XCantidad, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"9chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCantidad_Jsonclick, 0, "", "", "", "", "", 1, edtXCantidad_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXUnidad_Internalname, GXutil.rtrim( A4885XUnidad), GXutil.rtrim( localUtil.format( A4885XUnidad, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,51);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"1chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXUnidad_Jsonclick, 0, "", "", "", "", "", 1, edtXUnidad_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero de Piezas", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXPiezas_Internalname, GXutil.ltrim( localUtil.ntoc( A4884XPiezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXPiezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4884XPiezas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4884XPiezas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"4chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXPiezas_Jsonclick, 0, "", "", "", "", "", 1, edtXPiezas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "XCant Sum", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCantSum_Internalname, GXutil.ltrim( localUtil.ntoc( A10744XCantSum, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXCantSum_Enabled!=0) ? localUtil.format( A10744XCantSum, "ZZZZZ9.99") : localUtil.format( A10744XCantSum, "ZZZZZ9.99"))), ""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"9chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCantSum_Jsonclick, 0, "", "", "", "", "", 1, edtXCantSum_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "XPzs Sum", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXPzsSum_Internalname, GXutil.ltrim( localUtil.ntoc( A10745XPzsSum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXPzsSum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10745XPzsSum), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10745XPzsSum), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+""+" "+"gxheight=\"1row\""+" "+"gxwidth=\"4chr\""+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXPzsSum_Jsonclick, 0, "", "", "", "", "", 1, edtXPzsSum_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol70( ) ;
      nGXsfl_70_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount722 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_722 = (short)(1) ;
            scanStartN5722( ) ;
            while ( RcdFound722 != 0 )
            {
               init_level_properties722( ) ;
               getByPrimaryKeyN5722( ) ;
               addRowN5722( ) ;
               scanNextN5722( ) ;
            }
            scanEndN5722( ) ;
            nBlankRcdCount722 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4886XUltLin = A4886XUltLin ;
         n4886XUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         B10745XPzsSum = A10745XPzsSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         B10744XCantSum = A10744XCantSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         standaloneNotModalN5722( ) ;
         standaloneModalN5722( ) ;
         sMode722 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRowN5722( ) ;
            edtavnRcdDeleted_722_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_722_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_722_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_722_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXLinMan_Title = httpContext.cgiGet( "XLINMAN_"+sGXsfl_70_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Title", edtXLinMan_Title, !bGXsfl_70_Refreshing);
            edtXLinMan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XLINMAN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXLinMan_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXPdasNum_Title = httpContext.cgiGet( "XPDASNUM_"+sGXsfl_70_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtXPdasNum_Internalname, "Title", edtXPdasNum_Title, !bGXsfl_70_Refreshing);
            edtXPdasNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XPDASNUM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXPdasNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXPdasNum_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXCantPdas_Title = httpContext.cgiGet( "XCANTPDAS_"+sGXsfl_70_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtXCantPdas_Internalname, "Title", edtXCantPdas_Title, !bGXsfl_70_Refreshing);
            edtXCantPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XCANTPDAS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXCantPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCantPdas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXPzasPdas_Title = httpContext.cgiGet( "XPZASPDAS_"+sGXsfl_70_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtXPzasPdas_Internalname, "Title", edtXPzasPdas_Title, !bGXsfl_70_Refreshing);
            edtXPzasPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XPZASPDAS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXPzasPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXPzasPdas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXMaqPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XMAQPDAS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXMaqPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXMaqPdas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXTotCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTOTCANT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXTotCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotCant_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXTotPzas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTOTPZAS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXTotPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotPzas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXNEstilo_Title = httpContext.cgiGet( "XNESTILO_"+sGXsfl_70_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNEstilo_Internalname, "Title", edtXNEstilo_Title, !bGXsfl_70_Refreshing);
            edtXNEstilo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNESTILO_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNEstilo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNEstilo_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXNEstilo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "XNESTILO_"+sGXsfl_70_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNEstilo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNEstilo_Visible), 5, 0), !bGXsfl_70_Refreshing);
            edtXNPda_Title = httpContext.cgiGet( "XNPDA_"+sGXsfl_70_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNPda_Internalname, "Title", edtXNPda_Title, !bGXsfl_70_Refreshing);
            edtXNPda_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNPDA_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPda_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtXNPda_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "XNPDA_"+sGXsfl_70_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNPda_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPda_Visible), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_722 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalN5722( ) ;
            }
            sendRowN5722( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4886XUltLin = B4886XUltLin ;
         n4886XUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         A10745XPzsSum = B10745XPzsSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         A10744XCantSum = B10744XCantSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount722 = (short)(5) ;
         nRcdExists_722 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartN5722( ) ;
            while ( RcdFound722 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_70722( ) ;
               init_level_properties722( ) ;
               standaloneNotModalN5722( ) ;
               getByPrimaryKeyN5722( ) ;
               standaloneModalN5722( ) ;
               addRowN5722( ) ;
               scanNextN5722( ) ;
            }
            scanEndN5722( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode722 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_70722( ) ;
      initAllN5722( ) ;
      init_level_properties722( ) ;
      B4886XUltLin = A4886XUltLin ;
      n4886XUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      B10745XPzsSum = A10745XPzsSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      B10744XCantSum = A10744XCantSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      nRcdExists_722 = (short)(0) ;
      nIsMod_722 = (short)(0) ;
      nRcdDeleted_722 = (short)(0) ;
      nBlankRcdCount722 = (short)(nBlankRcdUsr722+nBlankRcdCount722) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount722 > 0 )
      {
         standaloneNotModalN5722( ) ;
         standaloneModalN5722( ) ;
         addRowN5722( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtXLinMan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount722 = (short)(nBlankRcdCount722-1) ;
      }
      Gx_mode = sMode722 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4886XUltLin = B4886XUltLin ;
      n4886XUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      A10745XPzsSum = B10745XPzsSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      A10744XCantSum = B10744XCantSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXGEHD2.htm");
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
      e11N52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4882XDisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4882XDisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4886XUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4886XUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4883XCantidad = localUtil.ctond( httpContext.cgiGet( "Z4883XCantidad")) ;
            Z4885XUnidad = httpContext.cgiGet( "Z4885XUnidad") ;
            Z4884XPiezas = (short)(localUtil.ctol( httpContext.cgiGet( "Z4884XPiezas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O4886XUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O4886XUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10745XPzsSum = (short)(localUtil.ctol( httpContext.cgiGet( "O10745XPzsSum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10744XCantSum = localUtil.ctond( httpContext.cgiGet( "O10744XCantSum")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Tot_k = localUtil.ctond( httpContext.cgiGet( "vTOT_K")) ;
            AV33Tot_p = (int)(localUtil.ctol( httpContext.cgiGet( "vTOT_P"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV44Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38VarAux1 = localUtil.ctond( httpContext.cgiGet( "vVARAUX1")) ;
            AV39VarAux2 = (short)(localUtil.ctol( httpContext.cgiGet( "vVARAUX2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4882XDisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtXDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
            A4886XUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtXUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4886XUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
            A4887XSumCant = localUtil.ctond( httpContext.cgiGet( edtXSumCant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4887XSumCant", GXutil.ltrimstr( A4887XSumCant, 9, 2));
            A4888XSumPzas = (short)(localUtil.ctol( httpContext.cgiGet( edtXSumPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4888XSumPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4888XSumPzas), 4, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXCantidad_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXCantidad_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XCANTIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXCantidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4883XCantidad = DecimalUtil.ZERO ;
               n4883XCantidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4883XCantidad", GXutil.ltrimstr( A4883XCantidad, 9, 2));
            }
            else
            {
               A4883XCantidad = localUtil.ctond( httpContext.cgiGet( edtXCantidad_Internalname)) ;
               n4883XCantidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4883XCantidad", GXutil.ltrimstr( A4883XCantidad, 9, 2));
            }
            A4885XUnidad = GXutil.upper( httpContext.cgiGet( edtXUnidad_Internalname)) ;
            n4885XUnidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4885XUnidad", A4885XUnidad);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XPIEZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXPiezas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4884XPiezas = (short)(0) ;
               n4884XPiezas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4884XPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4884XPiezas), 4, 0));
            }
            else
            {
               A4884XPiezas = (short)(localUtil.ctol( httpContext.cgiGet( edtXPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4884XPiezas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4884XPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4884XPiezas), 4, 0));
            }
            A10744XCantSum = localUtil.ctond( httpContext.cgiGet( edtXCantSum_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
            A10745XPzsSum = (short)(localUtil.ctol( httpContext.cgiGet( edtXPzsSum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
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
               A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
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
                        e11N52 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DELETE TABLA XGEHD3'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Delete tabla XGEHD3' */
                        e12N52 ();
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
            initAllN5721( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_722_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_722_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributesN5721( ) ;
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

   public void confirm_N50( )
   {
      beforeValidateN5721( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsN5721( ) ;
         }
         else
         {
            checkExtendedTableN5721( ) ;
            if ( AnyError == 0 )
            {
               zmN5721( 30) ;
               zmN5721( 31) ;
            }
            closeExtendedTableCursorsN5721( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode721 = Gx_mode ;
         confirm_N5722( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode721 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode721 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesN50( ) ;
      }
   }

   public void confirm_N5722( )
   {
      s4886XUltLin = O4886XUltLin ;
      n4886XUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      s10745XPzsSum = O10745XPzsSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      s10744XCantSum = O10744XCantSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      sV32Tot_k = OV32Tot_k ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      sV33Tot_p = OV33Tot_p ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRowN5722( ) ;
         if ( ( nRcdExists_722 != 0 ) || ( nIsMod_722 != 0 ) )
         {
            getKeyN5722( ) ;
            if ( ( nRcdExists_722 == 0 ) && ( nRcdDeleted_722 == 0 ) )
            {
               if ( RcdFound722 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateN5722( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableN5722( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsN5722( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4886XUltLin = A4886XUltLin ;
                     n4886XUltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
                     O10745XPzsSum = A10745XPzsSum ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
                     O10744XCantSum = A10744XCantSum ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
                     OV32Tot_k = AV32Tot_k ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                     OV33Tot_p = AV33Tot_p ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "XLINMAN_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXLinMan_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound722 != 0 )
               {
                  if ( nRcdDeleted_722 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyN5722( ) ;
                     loadN5722( ) ;
                     beforeValidateN5722( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsN5722( ) ;
                        O4886XUltLin = A4886XUltLin ;
                        n4886XUltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
                        O10745XPzsSum = A10745XPzsSum ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
                        O10744XCantSum = A10744XCantSum ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
                        OV32Tot_k = AV32Tot_k ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                        OV33Tot_p = AV33Tot_p ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_722 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateN5722( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableN5722( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsN5722( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4886XUltLin = A4886XUltLin ;
                           n4886XUltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
                           O10745XPzsSum = A10745XPzsSum ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
                           O10744XCantSum = A10744XCantSum ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
                           OV32Tot_k = AV32Tot_k ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                           OV33Tot_p = AV33Tot_p ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_722 == 0 )
                  {
                     GXCCtl = "XLINMAN_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXLinMan_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_722_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXLinMan_Internalname, GXutil.ltrim( localUtil.ntoc( A4889XLinMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXPdasNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXCantPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXPzasPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A4892XPzasPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXMaqPdas_Internalname, GXutil.rtrim( A4893XMaqPdas)) ;
         httpContext.changePostValue( edtXTotCant_Internalname, GXutil.ltrim( localUtil.ntoc( A4906XTotCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXTotPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A4907XTotPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXNEstilo_Internalname, GXutil.rtrim( A9788XNEstilo)) ;
         httpContext.changePostValue( edtXNPda_Internalname, GXutil.rtrim( A9791XNPda)) ;
         httpContext.changePostValue( "ZT_"+"Z4889XLinMan_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4889XLinMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4891XCantPdas_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9791XNPda_"+sGXsfl_70_idx, GXutil.rtrim( Z9791XNPda)) ;
         httpContext.changePostValue( "ZT_"+"Z9788XNEstilo_"+sGXsfl_70_idx, GXutil.rtrim( Z9788XNEstilo)) ;
         httpContext.changePostValue( "ZT_"+"Z4890XPdasNum_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4892XPzasPdas_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4892XPzasPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4893XMaqPdas_"+sGXsfl_70_idx, GXutil.rtrim( Z4893XMaqPdas)) ;
         httpContext.changePostValue( "T4890XPdasNum_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4891XCantPdas_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4907XTotPzas_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O4907XTotPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4906XTotCant_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O4906XTotCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_722_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_722_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_722_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_722 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_722_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_722_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XLINMAN_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXLinMan_Title)) ;
            httpContext.changePostValue( "XLINMAN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXLinMan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XPDASNUM_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXPdasNum_Title)) ;
            httpContext.changePostValue( "XPDASNUM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPdasNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XCANTPDAS_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXCantPdas_Title)) ;
            httpContext.changePostValue( "XCANTPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXCantPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XPZASPDAS_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXPzasPdas_Title)) ;
            httpContext.changePostValue( "XPZASPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPzasPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XMAQPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXMaqPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTOTCANT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTOTPZAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotPzas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNESTILO_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXNEstilo_Title)) ;
            httpContext.changePostValue( "XNESTILO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNEstilo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNESTILO_"+sGXsfl_70_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtXNEstilo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNPDA_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXNPda_Title)) ;
            httpContext.changePostValue( "XNPDA_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPda_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNPDA_"+sGXsfl_70_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtXNPda_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4886XUltLin = s4886XUltLin ;
      n4886XUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      O10745XPzsSum = s10745XPzsSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      O10744XCantSum = s10744XCantSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      OV32Tot_k = sV32Tot_k ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      OV33Tot_p = sV33Tot_p ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionN50( )
   {
   }

   public void e11N52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      txgehd2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      txgehd2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV30Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Station", AV30Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      txgehd2_impl.this.A396EmprCod = GXv_char2[0] ;
      txgehd2_impl.this.AV29EmprNom = GXv_char3[0] ;
      txgehd2_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprNom", AV29EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV10Lit1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV44Pgmname, (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV31Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN558_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV31Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit2", AV31Lit2);
      GXt_char1 = AV22Lit3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      GXt_char1 = AV23Lit4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      GXt_char1 = AV24Lit5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL022_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      GXt_char1 = AV25Lit6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV031_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit6", AV25Lit6);
      GXt_char1 = AV26Lit7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit7", AV26Lit7);
      GXt_char1 = AV28Lit9 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit9", AV28Lit9);
      GXt_char1 = AV12Lit11 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1663_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Lit11", AV12Lit11);
      GXt_char1 = AV11Lit10 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Lit10", AV11Lit10);
      GXt_char1 = AV27Lit8 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit8", AV27Lit8);
      GXt_char1 = AV13Lit12 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV046_", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit12", AV13Lit12);
      AV34Lit100 = httpContext.getMessage( "Color", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit100", AV34Lit100);
      edtXLinMan_Title = AV24Lit5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Title", edtXLinMan_Title, !bGXsfl_70_Refreshing);
      edtXPdasNum_Title = AV25Lit6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPdasNum_Internalname, "Title", edtXPdasNum_Title, !bGXsfl_70_Refreshing);
      edtXCantPdas_Title = AV26Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCantPdas_Internalname, "Title", edtXCantPdas_Title, !bGXsfl_70_Refreshing);
      edtXPzasPdas_Title = AV28Lit9 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPzasPdas_Internalname, "Title", edtXPzasPdas_Title, !bGXsfl_70_Refreshing);
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A4882XDisCod ;
      GXv_char3[0] = AV35Discolnom ;
      GXv_int6[0] = AV36Discolnum ;
      new app.pxgehd2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6) ;
      txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
      txgehd2_impl.this.A4882XDisCod = GXv_int5[0] ;
      txgehd2_impl.this.AV35Discolnom = GXv_char3[0] ;
      txgehd2_impl.this.AV36Discolnum = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Discolnom", AV35Discolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV36Discolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Discolnum), 6, 0));
      GXt_int7 = AV37Veritems ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERITM", ""), GXv_int8) ;
      txgehd2_impl.this.GXt_int7 = GXv_int8[0] ;
      AV37Veritems = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Veritems", GXutil.str( AV37Veritems, 1, 0));
      GXt_int7 = AV42Texfina ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int8) ;
      txgehd2_impl.this.GXt_int7 = GXv_int8[0] ;
      AV42Texfina = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Texfina", GXutil.str( AV42Texfina, 1, 0));
      if ( AV37Veritems == 0 )
      {
         edtXNEstilo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXNEstilo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNEstilo_Visible), 5, 0), !bGXsfl_70_Refreshing);
         edtXNPda_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXNPda_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPda_Visible), 5, 0), !bGXsfl_70_Refreshing);
      }
      GXt_char1 = AV40Lit101 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "XGEHD200", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV40Lit101 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit101", AV40Lit101);
      GXt_char1 = AV41Lit102 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "XGEHD201", ""), (byte)(99), GXv_char4) ;
      txgehd2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV41Lit102 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Lit102", AV41Lit102);
      edtXNPda_Title = AV40Lit101 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNPda_Internalname, "Title", edtXNPda_Title, !bGXsfl_70_Refreshing);
      edtXNEstilo_Title = AV41Lit102 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNEstilo_Internalname, "Title", edtXNEstilo_Title, !bGXsfl_70_Refreshing);
   }

   public void e12N52( )
   {
      /* 'Delete tabla XGEHD3' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A4882XDisCod ;
      new app.pdltxgehd(remoteHandle, context).execute( GXv_char4, GXv_int6) ;
      txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
      txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
      new app.pcommit(remoteHandle, context).execute( ) ;
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Informacion Tabla XGEHD3, eliminada", ""));
      /*  Sending Event outputs  */
   }

   public void zmN5721( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4886XUltLin = T00N55_A4886XUltLin[0] ;
            Z4883XCantidad = T00N55_A4883XCantidad[0] ;
            Z4885XUnidad = T00N55_A4885XUnidad[0] ;
            Z4884XPiezas = T00N55_A4884XPiezas[0] ;
         }
         else
         {
            Z4886XUltLin = A4886XUltLin ;
            Z4883XCantidad = A4883XCantidad ;
            Z4885XUnidad = A4885XUnidad ;
            Z4884XPiezas = A4884XPiezas ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z4882XDisCod = A4882XDisCod ;
         Z4886XUltLin = A4886XUltLin ;
         Z4883XCantidad = A4883XCantidad ;
         Z4885XUnidad = A4885XUnidad ;
         Z4884XPiezas = A4884XPiezas ;
         Z396EmprCod = A396EmprCod ;
         Z10744XCantSum = A10744XCantSum ;
         Z10745XPzsSum = A10745XPzsSum ;
      }
   }

   public void standaloneNotModal( )
   {
      edtXUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUltLin_Enabled), 5, 0), true);
      AV44Pgmname = "TXGEHD2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtXUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUltLin_Enabled), 5, 0), true);
      /* Using cursor T00N56 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
      /* Using cursor T00N58 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A10744XCantSum = T00N58_A10744XCantSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         A10745XPzsSum = T00N58_A10745XPzsSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      }
      else
      {
         A10744XCantSum = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         A10745XPzsSum = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      }
      O10744XCantSum = A10744XCantSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      O10745XPzsSum = A10745XPzsSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      pr_default.close(5);
      GXt_int9 = A4888XSumPzas ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A4882XDisCod ;
      GXv_int10[0] = GXt_int9 ;
      new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
      txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
      txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
      txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
      A4888XSumPzas = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4888XSumPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4888XSumPzas), 4, 0));
      GXt_decimal11 = A4887XSumCant ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A4882XDisCod ;
      GXv_decimal12[0] = GXt_decimal11 ;
      new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
      txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
      txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
      txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
      A4887XSumCant = GXt_decimal11 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4887XSumCant", GXutil.ltrimstr( A4887XSumCant, 9, 2));
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

   public void loadN5721( )
   {
      /* Using cursor T00N510 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound721 = (short)(1) ;
         A4886XUltLin = T00N510_A4886XUltLin[0] ;
         n4886XUltLin = T00N510_n4886XUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         A4883XCantidad = T00N510_A4883XCantidad[0] ;
         n4883XCantidad = T00N510_n4883XCantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4883XCantidad", GXutil.ltrimstr( A4883XCantidad, 9, 2));
         A4885XUnidad = T00N510_A4885XUnidad[0] ;
         n4885XUnidad = T00N510_n4885XUnidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4885XUnidad", A4885XUnidad);
         A4884XPiezas = T00N510_A4884XPiezas[0] ;
         n4884XPiezas = T00N510_n4884XPiezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4884XPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4884XPiezas), 4, 0));
         A10744XCantSum = T00N510_A10744XCantSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         A10745XPzsSum = T00N510_A10745XPzsSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         zmN5721( -29) ;
      }
      pr_default.close(6);
      onLoadActionsN5721( ) ;
   }

   public void onLoadActionsN5721( )
   {
      O10745XPzsSum = A10745XPzsSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      O10744XCantSum = A10744XCantSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
   }

   public void checkExtendedTableN5721( )
   {
      nIsDirty_721 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( DecimalUtil.compareTo(A10744XCantSum, A4883XCantidad) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad Distribuida superior al Pedido ¡¡¡", ""), 0, "XCANTIDAD");
      }
   }

   public void closeExtendedTableCursorsN5721( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyN5721( )
   {
      /* Using cursor T00N511 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound721 = (short)(1) ;
      }
      else
      {
         RcdFound721 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00N55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T00N55_A4882XDisCod[0] == A4882XDisCod ) && ( GXutil.strcmp(T00N55_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmN5721( 29) ;
         RcdFound721 = (short)(1) ;
         A4886XUltLin = T00N55_A4886XUltLin[0] ;
         n4886XUltLin = T00N55_n4886XUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         A4883XCantidad = T00N55_A4883XCantidad[0] ;
         n4883XCantidad = T00N55_n4883XCantidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4883XCantidad", GXutil.ltrimstr( A4883XCantidad, 9, 2));
         A4885XUnidad = T00N55_A4885XUnidad[0] ;
         n4885XUnidad = T00N55_n4885XUnidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4885XUnidad", A4885XUnidad);
         A4884XPiezas = T00N55_A4884XPiezas[0] ;
         n4884XPiezas = T00N55_n4884XPiezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4884XPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4884XPiezas), 4, 0));
         O4886XUltLin = A4886XUltLin ;
         n4886XUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
         sMode721 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadN5721( ) ;
         if ( AnyError == 1 )
         {
            RcdFound721 = (short)(0) ;
            initializeNonKeyN5721( ) ;
         }
         Gx_mode = sMode721 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound721 = (short)(0) ;
         initializeNonKeyN5721( ) ;
         sMode721 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode721 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyN5721( ) ;
      if ( RcdFound721 == 0 )
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
      RcdFound721 = (short)(0) ;
      /* Using cursor T00N512 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00N512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00N512_A4882XDisCod[0] == A4882XDisCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00N512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00N512_A4882XDisCod[0] == A4882XDisCod ) )
         {
            RcdFound721 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound721 = (short)(0) ;
      /* Using cursor T00N513 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00N513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00N513_A4882XDisCod[0] == A4882XDisCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00N513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00N513_A4882XDisCod[0] == A4882XDisCod ) )
         {
            RcdFound721 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyN5721( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4886XUltLin = O4886XUltLin ;
         n4886XUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         A10745XPzsSum = O10745XPzsSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         A10744XCantSum = O10744XCantSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         AV32Tot_k = OV32Tot_k ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
         AV33Tot_p = OV33Tot_p ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
         GX_FocusControl = edtXCantidad_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertN5721( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound721 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4886XUltLin = O4886XUltLin ;
               n4886XUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
               A10745XPzsSum = O10745XPzsSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
               A10744XCantSum = O10744XCantSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
               AV32Tot_k = OV32Tot_k ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
               AV33Tot_p = OV33Tot_p ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtXCantidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4886XUltLin = O4886XUltLin ;
               n4886XUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
               A10745XPzsSum = O10745XPzsSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
               A10744XCantSum = O10744XCantSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
               AV32Tot_k = OV32Tot_k ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
               AV33Tot_p = OV33Tot_p ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
               updateN5721( ) ;
               GX_FocusControl = edtXCantidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4886XUltLin = O4886XUltLin ;
               n4886XUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
               A10745XPzsSum = O10745XPzsSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
               A10744XCantSum = O10744XCantSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
               AV32Tot_k = OV32Tot_k ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
               AV33Tot_p = OV33Tot_p ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
               GX_FocusControl = edtXCantidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertN5721( ) ;
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
                  A4886XUltLin = O4886XUltLin ;
                  n4886XUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
                  A10745XPzsSum = O10745XPzsSum ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
                  A10744XCantSum = O10744XCantSum ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
                  AV32Tot_k = OV32Tot_k ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                  AV33Tot_p = OV33Tot_p ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                  GX_FocusControl = edtXCantidad_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertN5721( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4886XUltLin = O4886XUltLin ;
         n4886XUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         A10745XPzsSum = O10745XPzsSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         A10744XCantSum = O10744XCantSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         AV32Tot_k = OV32Tot_k ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
         AV33Tot_p = OV33Tot_p ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtXCantidad_Internalname ;
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
      getKeyN5721( ) ;
      if ( RcdFound721 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txgehd2");
      GX_FocusControl = edtXCantidad_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_N50( ) ;
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
      if ( RcdFound721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtXCantidad_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartN5721( ) ;
      if ( RcdFound721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCantidad_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndN5721( ) ;
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
      if ( RcdFound721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCantidad_Internalname ;
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
      if ( RcdFound721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCantidad_Internalname ;
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
      scanStartN5721( ) ;
      if ( RcdFound721 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound721 != 0 )
         {
            scanNextN5721( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCantidad_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndN5721( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyN5721( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00N54 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXGEHD1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z4886XUltLin != T00N54_A4886XUltLin[0] ) || ( DecimalUtil.compareTo(Z4883XCantidad, T00N54_A4883XCantidad[0]) != 0 ) || ( GXutil.strcmp(Z4885XUnidad, T00N54_A4885XUnidad[0]) != 0 ) || ( Z4884XPiezas != T00N54_A4884XPiezas[0] ) )
         {
            if ( Z4886XUltLin != T00N54_A4886XUltLin[0] )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XUltLin");
               GXutil.writeLogRaw("Old: ",Z4886XUltLin);
               GXutil.writeLogRaw("Current: ",T00N54_A4886XUltLin[0]);
            }
            if ( DecimalUtil.compareTo(Z4883XCantidad, T00N54_A4883XCantidad[0]) != 0 )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XCantidad");
               GXutil.writeLogRaw("Old: ",Z4883XCantidad);
               GXutil.writeLogRaw("Current: ",T00N54_A4883XCantidad[0]);
            }
            if ( GXutil.strcmp(Z4885XUnidad, T00N54_A4885XUnidad[0]) != 0 )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XUnidad");
               GXutil.writeLogRaw("Old: ",Z4885XUnidad);
               GXutil.writeLogRaw("Current: ",T00N54_A4885XUnidad[0]);
            }
            if ( Z4884XPiezas != T00N54_A4884XPiezas[0] )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XPiezas");
               GXutil.writeLogRaw("Old: ",Z4884XPiezas);
               GXutil.writeLogRaw("Current: ",T00N54_A4884XPiezas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXGEHD1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertN5721( )
   {
      beforeValidateN5721( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableN5721( ) ;
      }
      if ( AnyError == 0 )
      {
         zmN5721( 0) ;
         checkOptimisticConcurrencyN5721( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmN5721( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertN5721( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00N514 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A4882XDisCod), Boolean.valueOf(n4886XUltLin), Short.valueOf(A4886XUltLin), Boolean.valueOf(n4883XCantidad), A4883XCantidad, Boolean.valueOf(n4885XUnidad), A4885XUnidad, Boolean.valueOf(n4884XPiezas), Short.valueOf(A4884XPiezas), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD1");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ || true /* After */ )
                     {
                        GXt_decimal11 = AV32Tot_k ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A4882XDisCod ;
                        GXv_decimal12[0] = GXt_decimal11 ;
                        new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
                        txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                        txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                        txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                        AV32Tot_k = GXt_decimal11 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                     }
                     if ( true /* After */ || true /* After */ || true /* After */ )
                     {
                        GXt_int9 = (short)(AV33Tot_p) ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A4882XDisCod ;
                        GXv_int10[0] = GXt_int9 ;
                        new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
                        txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                        txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                        txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                        AV33Tot_p = GXt_int9 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelN5721( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionN50( ) ;
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
            loadN5721( ) ;
         }
         endLevelN5721( ) ;
      }
      closeExtendedTableCursorsN5721( ) ;
   }

   public void updateN5721( )
   {
      beforeValidateN5721( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableN5721( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyN5721( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmN5721( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateN5721( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00N515 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n4886XUltLin), Short.valueOf(A4886XUltLin), Boolean.valueOf(n4883XCantidad), A4883XCantidad, Boolean.valueOf(n4885XUnidad), A4885XUnidad, Boolean.valueOf(n4884XPiezas), Short.valueOf(A4884XPiezas), A396EmprCod, Integer.valueOf(A4882XDisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD1");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXGEHD1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateN5721( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ || true /* After */ )
                     {
                        GXt_decimal11 = AV32Tot_k ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A4882XDisCod ;
                        GXv_decimal12[0] = GXt_decimal11 ;
                        new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
                        txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                        txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                        txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                        AV32Tot_k = GXt_decimal11 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                     }
                     if ( true /* After */ || true /* After */ || true /* After */ )
                     {
                        GXt_int9 = (short)(AV33Tot_p) ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A4882XDisCod ;
                        GXv_int10[0] = GXt_int9 ;
                        new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
                        txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                        txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                        txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                        AV33Tot_p = GXt_int9 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelN5721( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionN50( ) ;
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
         endLevelN5721( ) ;
      }
      closeExtendedTableCursorsN5721( ) ;
   }

   public void deferredUpdateN5721( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateN5721( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyN5721( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsN5721( ) ;
         afterConfirmN5721( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteN5721( ) ;
            if ( AnyError == 0 )
            {
               A4886XUltLin = O4886XUltLin ;
               n4886XUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
               A10745XPzsSum = O10745XPzsSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
               A10744XCantSum = O10744XCantSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
               AV32Tot_k = OV32Tot_k ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
               AV33Tot_p = OV33Tot_p ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
               scanStartN5722( ) ;
               while ( RcdFound722 != 0 )
               {
                  getByPrimaryKeyN5722( ) ;
                  deleteN5722( ) ;
                  scanNextN5722( ) ;
                  O4886XUltLin = A4886XUltLin ;
                  n4886XUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
                  O10745XPzsSum = A10745XPzsSum ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
                  O10744XCantSum = A10744XCantSum ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
                  OV32Tot_k = AV32Tot_k ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                  OV33Tot_p = AV33Tot_p ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
               }
               scanEndN5722( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00N516 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     if ( true /* After */ || true /* After */ || true /* After */ )
                     {
                        GXt_decimal11 = AV32Tot_k ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A4882XDisCod ;
                        GXv_decimal12[0] = GXt_decimal11 ;
                        new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
                        txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                        txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                        txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                        AV32Tot_k = GXt_decimal11 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                     }
                     if ( true /* After */ || true /* After */ || true /* After */ )
                     {
                        GXt_int9 = (short)(AV33Tot_p) ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A4882XDisCod ;
                        GXv_int10[0] = GXt_int9 ;
                        new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
                        txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                        txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                        txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                        AV33Tot_p = GXt_int9 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                     }
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound721 == 0 )
                        {
                           initAllN5721( ) ;
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
                        resetCaptionN50( ) ;
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
      sMode721 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelN5721( ) ;
      Gx_mode = sMode721 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsN5721( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00N517 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "XGEHD3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevelN5722( )
   {
      s4886XUltLin = O4886XUltLin ;
      n4886XUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      s10745XPzsSum = O10745XPzsSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      s10744XCantSum = O10744XCantSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      sV32Tot_k = OV32Tot_k ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      sV33Tot_p = OV33Tot_p ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRowN5722( ) ;
         if ( ( nRcdExists_722 != 0 ) || ( nIsMod_722 != 0 ) )
         {
            standaloneNotModalN5722( ) ;
            getKeyN5722( ) ;
            if ( ( nRcdExists_722 == 0 ) && ( nRcdDeleted_722 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertN5722( ) ;
            }
            else
            {
               if ( RcdFound722 != 0 )
               {
                  if ( ( nRcdDeleted_722 != 0 ) && ( nRcdExists_722 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteN5722( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_722 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateN5722( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_722 == 0 )
                  {
                     GXCCtl = "XLINMAN_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXLinMan_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4886XUltLin = A4886XUltLin ;
            n4886XUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
            O10745XPzsSum = A10745XPzsSum ;
            httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
            O10744XCantSum = A10744XCantSum ;
            httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
            OV32Tot_k = AV32Tot_k ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
            OV33Tot_p = AV33Tot_p ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_722_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXLinMan_Internalname, GXutil.ltrim( localUtil.ntoc( A4889XLinMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXPdasNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXCantPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXPzasPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A4892XPzasPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXMaqPdas_Internalname, GXutil.rtrim( A4893XMaqPdas)) ;
         httpContext.changePostValue( edtXTotCant_Internalname, GXutil.ltrim( localUtil.ntoc( A4906XTotCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXTotPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A4907XTotPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXNEstilo_Internalname, GXutil.rtrim( A9788XNEstilo)) ;
         httpContext.changePostValue( edtXNPda_Internalname, GXutil.rtrim( A9791XNPda)) ;
         httpContext.changePostValue( "ZT_"+"Z4889XLinMan_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4889XLinMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4891XCantPdas_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9791XNPda_"+sGXsfl_70_idx, GXutil.rtrim( Z9791XNPda)) ;
         httpContext.changePostValue( "ZT_"+"Z9788XNEstilo_"+sGXsfl_70_idx, GXutil.rtrim( Z9788XNEstilo)) ;
         httpContext.changePostValue( "ZT_"+"Z4890XPdasNum_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4892XPzasPdas_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z4892XPzasPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4893XMaqPdas_"+sGXsfl_70_idx, GXutil.rtrim( Z4893XMaqPdas)) ;
         httpContext.changePostValue( "T4890XPdasNum_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4891XCantPdas_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4907XTotPzas_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O4907XTotPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4906XTotCant_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O4906XTotCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_722_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_722_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_722_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_722 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_722_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_722_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XLINMAN_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXLinMan_Title)) ;
            httpContext.changePostValue( "XLINMAN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXLinMan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XPDASNUM_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXPdasNum_Title)) ;
            httpContext.changePostValue( "XPDASNUM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPdasNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XCANTPDAS_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXCantPdas_Title)) ;
            httpContext.changePostValue( "XCANTPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXCantPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XPZASPDAS_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXPzasPdas_Title)) ;
            httpContext.changePostValue( "XPZASPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPzasPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XMAQPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXMaqPdas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTOTCANT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTOTPZAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotPzas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNESTILO_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXNEstilo_Title)) ;
            httpContext.changePostValue( "XNESTILO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNEstilo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNESTILO_"+sGXsfl_70_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtXNEstilo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNPDA_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXNPda_Title)) ;
            httpContext.changePostValue( "XNPDA_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPda_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNPDA_"+sGXsfl_70_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtXNPda_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllN5722( ) ;
      if ( AnyError != 0 )
      {
         O4886XUltLin = s4886XUltLin ;
         n4886XUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         O10745XPzsSum = s10745XPzsSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         O10744XCantSum = s10744XCantSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         OV32Tot_k = sV32Tot_k ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
         OV33Tot_p = sV33Tot_p ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      }
      nRcdExists_722 = (short)(0) ;
      nIsMod_722 = (short)(0) ;
      nRcdDeleted_722 = (short)(0) ;
   }

   public void processLevelN5721( )
   {
      /* Save parent mode. */
      sMode721 = Gx_mode ;
      processNestedLevelN5722( ) ;
      if ( AnyError != 0 )
      {
         O4886XUltLin = s4886XUltLin ;
         n4886XUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
         O10745XPzsSum = s10745XPzsSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         O10744XCantSum = s10744XCantSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         OV32Tot_k = sV32Tot_k ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
         OV33Tot_p = sV33Tot_p ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode721 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00N518 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n4886XUltLin), Short.valueOf(A4886XUltLin), A396EmprCod, Integer.valueOf(A4882XDisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD1");
   }

   public void endLevelN5721( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteN5721( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txgehd2");
         if ( AnyError == 0 )
         {
            confirmValuesN50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txgehd2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartN5721( )
   {
      /* Scan By routine */
      /* Using cursor T00N519 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      RcdFound721 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound721 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextN5721( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound721 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound721 = (short)(1) ;
      }
   }

   public void scanEndN5721( )
   {
      pr_default.close(15);
   }

   public void afterConfirmN5721( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertN5721( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateN5721( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteN5721( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteN5721( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateN5721( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesN5721( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtXDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXDisCod_Enabled), 5, 0), true);
      edtXUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUltLin_Enabled), 5, 0), true);
      edtXSumCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXSumCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXSumCant_Enabled), 5, 0), true);
      edtXSumPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXSumPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXSumPzas_Enabled), 5, 0), true);
      edtXCantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCantidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCantidad_Enabled), 5, 0), true);
      edtXUnidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUnidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUnidad_Enabled), 5, 0), true);
      edtXPiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXPiezas_Enabled), 5, 0), true);
      edtXCantSum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCantSum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCantSum_Enabled), 5, 0), true);
      edtXPzsSum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPzsSum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXPzsSum_Enabled), 5, 0), true);
   }

   public void zmN5722( int GX_JID )
   {
      if ( ( GX_JID == 32 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4891XCantPdas = T00N53_A4891XCantPdas[0] ;
            Z9791XNPda = T00N53_A9791XNPda[0] ;
            Z9788XNEstilo = T00N53_A9788XNEstilo[0] ;
            Z4890XPdasNum = T00N53_A4890XPdasNum[0] ;
            Z4892XPzasPdas = T00N53_A4892XPzasPdas[0] ;
            Z4893XMaqPdas = T00N53_A4893XMaqPdas[0] ;
         }
         else
         {
            Z4891XCantPdas = A4891XCantPdas ;
            Z9791XNPda = A9791XNPda ;
            Z9788XNEstilo = A9788XNEstilo ;
            Z4890XPdasNum = A4890XPdasNum ;
            Z4892XPzasPdas = A4892XPzasPdas ;
            Z4893XMaqPdas = A4893XMaqPdas ;
         }
      }
      if ( GX_JID == -32 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
         Z4889XLinMan = A4889XLinMan ;
         Z4891XCantPdas = A4891XCantPdas ;
         Z9791XNPda = A9791XNPda ;
         Z9788XNEstilo = A9788XNEstilo ;
         Z4890XPdasNum = A4890XPdasNum ;
         Z4892XPzasPdas = A4892XPzasPdas ;
         Z4893XMaqPdas = A4893XMaqPdas ;
      }
   }

   public void standaloneNotModalN5722( )
   {
      edtXTotCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTotCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotCant_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXTotPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTotPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotPzas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUltLin_Enabled), 5, 0), true);
      edtXUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXUltLin_Enabled), 5, 0), true);
   }

   public void standaloneModalN5722( )
   {
      if ( isIns( )  )
      {
         A4886XUltLin = (short)(O4886XUltLin+1) ;
         n4886XUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4889XLinMan = A4886XUltLin ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A9791XNPda)==0) && ( Gx_BScreen == 0 ) )
      {
         A9791XNPda = E9791XNPda ;
         n9791XNPda = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A9788XNEstilo)==0) && ( Gx_BScreen == 0 ) )
      {
         A9788XNEstilo = E9788XNEstilo ;
         n9788XNEstilo = false ;
      }
      if ( isIns( )  && (0==A4890XPdasNum) && ( Gx_BScreen == 0 ) )
      {
         A4890XPdasNum = (short)(1) ;
         n4890XPdasNum = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtXLinMan_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXLinMan_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtXLinMan_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXLinMan_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV39VarAux2 = O4890XPdasNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39VarAux2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39VarAux2), 4, 0));
         if ( true /* Level */ && true /* After */ && ( A4883XCantidad.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV32Tot_k, A4883XCantidad) != 0 ) && ( A4891XCantPdas.doubleValue() == 0 ) && ( AV42Texfina == 0 ) )
         {
            A4891XCantPdas = A4883XCantidad.subtract(AV32Tot_k) ;
            n4891XCantPdas = false ;
         }
         else
         {
            if ( true /* Level */ && true /* After */ && ( A4883XCantidad.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV32Tot_k, A4883XCantidad) != 0 ) && ( AV42Texfina == 1 ) && ( A4891XCantPdas.doubleValue() == 0 ) )
            {
               A4891XCantPdas = (A4883XCantidad.subtract(AV32Tot_k)).divide(DecimalUtil.doubleToDec(A4890XPdasNum), 18, java.math.RoundingMode.DOWN) ;
               n4891XCantPdas = false ;
            }
         }
         AV38VarAux1 = O4891XCantPdas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38VarAux1", GXutil.ltrimstr( AV38VarAux1, 9, 2));
         A4906XTotCant = (A4891XCantPdas.multiply(DecimalUtil.doubleToDec(A4890XPdasNum))) ;
         O4906XTotCant = A4906XTotCant ;
      }
   }

   public void loadN5722( )
   {
      /* Using cursor T00N520 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound722 = (short)(1) ;
         A4891XCantPdas = T00N520_A4891XCantPdas[0] ;
         n4891XCantPdas = T00N520_n4891XCantPdas[0] ;
         A9791XNPda = T00N520_A9791XNPda[0] ;
         n9791XNPda = T00N520_n9791XNPda[0] ;
         A9788XNEstilo = T00N520_A9788XNEstilo[0] ;
         n9788XNEstilo = T00N520_n9788XNEstilo[0] ;
         A4890XPdasNum = T00N520_A4890XPdasNum[0] ;
         n4890XPdasNum = T00N520_n4890XPdasNum[0] ;
         A4892XPzasPdas = T00N520_A4892XPzasPdas[0] ;
         n4892XPzasPdas = T00N520_n4892XPzasPdas[0] ;
         A4893XMaqPdas = T00N520_A4893XMaqPdas[0] ;
         n4893XMaqPdas = T00N520_n4893XMaqPdas[0] ;
         zmN5722( -32) ;
      }
      pr_default.close(16);
      onLoadActionsN5722( ) ;
   }

   public void onLoadActionsN5722( )
   {
      A4907XTotPzas = (short)((A4892XPzasPdas*A4890XPdasNum)) ;
      O4907XTotPzas = A4907XTotPzas ;
      if ( isIns( )  )
      {
         A10745XPzsSum = (short)(O10745XPzsSum+A4907XTotPzas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10745XPzsSum = (short)(O10745XPzsSum+A4907XTotPzas-O4907XTotPzas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10745XPzsSum = (short)(O10745XPzsSum-O4907XTotPzas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
            }
         }
      }
      AV39VarAux2 = O4890XPdasNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39VarAux2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39VarAux2), 4, 0));
      if ( true /* Level */ && true /* After */ && ( A4883XCantidad.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV32Tot_k, A4883XCantidad) != 0 ) && ( A4891XCantPdas.doubleValue() == 0 ) && ( AV42Texfina == 0 ) )
      {
         A4891XCantPdas = A4883XCantidad.subtract(AV32Tot_k) ;
         n4891XCantPdas = false ;
      }
      else
      {
         if ( true /* Level */ && true /* After */ && ( A4883XCantidad.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV32Tot_k, A4883XCantidad) != 0 ) && ( AV42Texfina == 1 ) && ( A4891XCantPdas.doubleValue() == 0 ) )
         {
            A4891XCantPdas = (A4883XCantidad.subtract(AV32Tot_k)).divide(DecimalUtil.doubleToDec(A4890XPdasNum), 18, java.math.RoundingMode.DOWN) ;
            n4891XCantPdas = false ;
         }
      }
      A4906XTotCant = (A4891XCantPdas.multiply(DecimalUtil.doubleToDec(A4890XPdasNum))) ;
      O4906XTotCant = A4906XTotCant ;
      if ( isIns( )  )
      {
         A10744XCantSum = O10744XCantSum.add(A4906XTotCant) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10744XCantSum = O10744XCantSum.add(A4906XTotCant).subtract(O4906XTotCant) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10744XCantSum = O10744XCantSum.subtract(O4906XTotCant) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
            }
         }
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_decimal11 = AV32Tot_k ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_decimal12[0] = GXt_decimal11 ;
         new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV32Tot_k = GXt_decimal11 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int9 = (short)(AV33Tot_p) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_int10[0] = GXt_int9 ;
         new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV33Tot_p = GXt_int9 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      }
      AV38VarAux1 = O4891XCantPdas ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38VarAux1", GXutil.ltrimstr( AV38VarAux1, 9, 2));
   }

   public void checkExtendedTableN5722( )
   {
      nIsDirty_722 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalN5722( ) ;
      nIsDirty_722 = (short)(1) ;
      A4907XTotPzas = (short)((A4892XPzasPdas*A4890XPdasNum)) ;
      if ( isIns( )  )
      {
         nIsDirty_722 = (short)(1) ;
         A10745XPzsSum = (short)(O10745XPzsSum+A4907XTotPzas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_722 = (short)(1) ;
            A10745XPzsSum = (short)(O10745XPzsSum+A4907XTotPzas-O4907XTotPzas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_722 = (short)(1) ;
               A10745XPzsSum = (short)(O10745XPzsSum-O4907XTotPzas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
            }
         }
      }
      AV39VarAux2 = O4890XPdasNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39VarAux2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39VarAux2), 4, 0));
      if ( true /* Level */ && true /* After */ && ( A4883XCantidad.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV32Tot_k, A4883XCantidad) != 0 ) && ( A4891XCantPdas.doubleValue() == 0 ) && ( AV42Texfina == 0 ) )
      {
         nIsDirty_722 = (short)(1) ;
         A4891XCantPdas = A4883XCantidad.subtract(AV32Tot_k) ;
         n4891XCantPdas = false ;
      }
      else
      {
         if ( true /* Level */ && true /* After */ && ( A4883XCantidad.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV32Tot_k, A4883XCantidad) != 0 ) && ( AV42Texfina == 1 ) && ( A4891XCantPdas.doubleValue() == 0 ) )
         {
            nIsDirty_722 = (short)(1) ;
            A4891XCantPdas = (A4883XCantidad.subtract(AV32Tot_k)).divide(DecimalUtil.doubleToDec(A4890XPdasNum), 18, java.math.RoundingMode.DOWN) ;
            n4891XCantPdas = false ;
         }
      }
      nIsDirty_722 = (short)(1) ;
      A4906XTotCant = (A4891XCantPdas.multiply(DecimalUtil.doubleToDec(A4890XPdasNum))) ;
      if ( isIns( )  )
      {
         nIsDirty_722 = (short)(1) ;
         A10744XCantSum = O10744XCantSum.add(A4906XTotCant) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_722 = (short)(1) ;
            A10744XCantSum = O10744XCantSum.add(A4906XTotCant).subtract(O4906XTotCant) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_722 = (short)(1) ;
               A10744XCantSum = O10744XCantSum.subtract(O4906XTotCant) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
            }
         }
      }
      if ( DecimalUtil.compareTo(A10744XCantSum, A4883XCantidad) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad Distribuida superior al Pedido ¡¡¡", ""), 0, "XCANTIDAD");
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_decimal11 = AV32Tot_k ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_decimal12[0] = GXt_decimal11 ;
         new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV32Tot_k = GXt_decimal11 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int9 = (short)(AV33Tot_p) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_int10[0] = GXt_int9 ;
         new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV33Tot_p = GXt_int9 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      }
      if ( ( A4890XPdasNum == 0 ) && true /* After */ )
      {
         GXCCtl = "XPDASNUM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de Partidas incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXPdasNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV38VarAux1 = O4891XCantPdas ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38VarAux1", GXutil.ltrimstr( AV38VarAux1, 9, 2));
      if ( ( A4891XCantPdas.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "XCANTPDAS_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad incorrecta", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXCantPdas_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsN5722( )
   {
   }

   public void enableDisableN5722( )
   {
   }

   public void getKeyN5722( )
   {
      /* Using cursor T00N521 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound722 = (short)(1) ;
      }
      else
      {
         RcdFound722 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKeyN5722( )
   {
      /* Using cursor T00N53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00N53_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00N53_A4882XDisCod[0] == A4882XDisCod ) )
      {
         zmN5722( 32) ;
         RcdFound722 = (short)(1) ;
         initializeNonKeyN5722( ) ;
         A4889XLinMan = T00N53_A4889XLinMan[0] ;
         A4891XCantPdas = T00N53_A4891XCantPdas[0] ;
         n4891XCantPdas = T00N53_n4891XCantPdas[0] ;
         A9791XNPda = T00N53_A9791XNPda[0] ;
         n9791XNPda = T00N53_n9791XNPda[0] ;
         A9788XNEstilo = T00N53_A9788XNEstilo[0] ;
         n9788XNEstilo = T00N53_n9788XNEstilo[0] ;
         A4890XPdasNum = T00N53_A4890XPdasNum[0] ;
         n4890XPdasNum = T00N53_n4890XPdasNum[0] ;
         A4892XPzasPdas = T00N53_A4892XPzasPdas[0] ;
         n4892XPzasPdas = T00N53_n4892XPzasPdas[0] ;
         A4893XMaqPdas = T00N53_A4893XMaqPdas[0] ;
         n4893XMaqPdas = T00N53_n4893XMaqPdas[0] ;
         O4890XPdasNum = A4890XPdasNum ;
         n4890XPdasNum = false ;
         O4891XCantPdas = A4891XCantPdas ;
         n4891XCantPdas = false ;
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
         Z4889XLinMan = A4889XLinMan ;
         sMode722 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalN5722( ) ;
         loadN5722( ) ;
         Gx_mode = sMode722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound722 = (short)(0) ;
         initializeNonKeyN5722( ) ;
         sMode722 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalN5722( ) ;
         Gx_mode = sMode722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesN5722( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyN5722( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00N52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXGEHD2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4891XCantPdas, T00N52_A4891XCantPdas[0]) != 0 ) || ( GXutil.strcmp(Z9791XNPda, T00N52_A9791XNPda[0]) != 0 ) || ( GXutil.strcmp(Z9788XNEstilo, T00N52_A9788XNEstilo[0]) != 0 ) || ( Z4890XPdasNum != T00N52_A4890XPdasNum[0] ) || ( Z4892XPzasPdas != T00N52_A4892XPzasPdas[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4893XMaqPdas, T00N52_A4893XMaqPdas[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z4891XCantPdas, T00N52_A4891XCantPdas[0]) != 0 )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XCantPdas");
               GXutil.writeLogRaw("Old: ",Z4891XCantPdas);
               GXutil.writeLogRaw("Current: ",T00N52_A4891XCantPdas[0]);
            }
            if ( GXutil.strcmp(Z9791XNPda, T00N52_A9791XNPda[0]) != 0 )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XNPda");
               GXutil.writeLogRaw("Old: ",Z9791XNPda);
               GXutil.writeLogRaw("Current: ",T00N52_A9791XNPda[0]);
            }
            if ( GXutil.strcmp(Z9788XNEstilo, T00N52_A9788XNEstilo[0]) != 0 )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XNEstilo");
               GXutil.writeLogRaw("Old: ",Z9788XNEstilo);
               GXutil.writeLogRaw("Current: ",T00N52_A9788XNEstilo[0]);
            }
            if ( Z4890XPdasNum != T00N52_A4890XPdasNum[0] )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XPdasNum");
               GXutil.writeLogRaw("Old: ",Z4890XPdasNum);
               GXutil.writeLogRaw("Current: ",T00N52_A4890XPdasNum[0]);
            }
            if ( Z4892XPzasPdas != T00N52_A4892XPzasPdas[0] )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XPzasPdas");
               GXutil.writeLogRaw("Old: ",Z4892XPzasPdas);
               GXutil.writeLogRaw("Current: ",T00N52_A4892XPzasPdas[0]);
            }
            if ( GXutil.strcmp(Z4893XMaqPdas, T00N52_A4893XMaqPdas[0]) != 0 )
            {
               GXutil.writeLogln("txgehd2:[seudo value changed for attri]"+"XMaqPdas");
               GXutil.writeLogRaw("Old: ",Z4893XMaqPdas);
               GXutil.writeLogRaw("Current: ",T00N52_A4893XMaqPdas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXGEHD2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertN5722( )
   {
      beforeValidateN5722( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableN5722( ) ;
      }
      if ( AnyError == 0 )
      {
         zmN5722( 0) ;
         checkOptimisticConcurrencyN5722( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmN5722( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertN5722( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00N522 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Boolean.valueOf(n4891XCantPdas), A4891XCantPdas, Boolean.valueOf(n9791XNPda), A9791XNPda, Boolean.valueOf(n9788XNEstilo), A9788XNEstilo, Boolean.valueOf(n4890XPdasNum), Short.valueOf(A4890XPdasNum), Boolean.valueOf(n4892XPzasPdas), Short.valueOf(A4892XPzasPdas), Boolean.valueOf(n4893XMaqPdas), A4893XMaqPdas});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD2");
                  if ( (pr_default.getStatus(18) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ || true /* After */ )
                     {
                        GXt_decimal11 = AV32Tot_k ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A4882XDisCod ;
                        GXv_decimal12[0] = GXt_decimal11 ;
                        new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
                        txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                        txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                        txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                        AV32Tot_k = GXt_decimal11 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                     }
                     if ( true /* After */ || true /* After */ || true /* After */ )
                     {
                        GXt_int9 = (short)(AV33Tot_p) ;
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A4882XDisCod ;
                        GXv_int10[0] = GXt_int9 ;
                        new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
                        txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                        txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                        txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                        AV33Tot_p = GXt_int9 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        E9788XNEstilo = A9788XNEstilo ;
                        n9788XNEstilo = false ;
                        E9791XNPda = A9791XNPda ;
                        n9791XNPda = false ;
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
            loadN5722( ) ;
         }
         endLevelN5722( ) ;
      }
      closeExtendedTableCursorsN5722( ) ;
   }

   public void updateN5722( )
   {
      beforeValidateN5722( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableN5722( ) ;
      }
      if ( ( nIsMod_722 != 0 ) || ( nIsDirty_722 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyN5722( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmN5722( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateN5722( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00N523 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n4891XCantPdas), A4891XCantPdas, Boolean.valueOf(n9791XNPda), A9791XNPda, Boolean.valueOf(n9788XNEstilo), A9788XNEstilo, Boolean.valueOf(n4890XPdasNum), Short.valueOf(A4890XPdasNum), Boolean.valueOf(n4892XPzasPdas), Short.valueOf(A4892XPzasPdas), Boolean.valueOf(n4893XMaqPdas), A4893XMaqPdas, A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD2");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXGEHD2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateN5722( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ || true /* After */ || true /* After */ )
                        {
                           GXt_decimal11 = AV32Tot_k ;
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int6[0] = A4882XDisCod ;
                           GXv_decimal12[0] = GXt_decimal11 ;
                           new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
                           txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                           txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                           txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                           AV32Tot_k = GXt_decimal11 ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                        }
                        if ( true /* After */ || true /* After */ || true /* After */ )
                        {
                           GXt_int9 = (short)(AV33Tot_p) ;
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int6[0] = A4882XDisCod ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
                           txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                           txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                           txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                           AV33Tot_p = GXt_int9 ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyN5722( ) ;
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
            endLevelN5722( ) ;
         }
      }
      closeExtendedTableCursorsN5722( ) ;
   }

   public void deferredUpdateN5722( )
   {
   }

   public void deleteN5722( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateN5722( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyN5722( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsN5722( ) ;
         afterConfirmN5722( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteN5722( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00N524 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD2");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ || true /* After */ || true /* After */ )
                  {
                     GXt_decimal11 = AV32Tot_k ;
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int6[0] = A4882XDisCod ;
                     GXv_decimal12[0] = GXt_decimal11 ;
                     new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
                     txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                     txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                     txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                     AV32Tot_k = GXt_decimal11 ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
                  }
                  if ( true /* After */ || true /* After */ || true /* After */ )
                  {
                     GXt_int9 = (short)(AV33Tot_p) ;
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int6[0] = A4882XDisCod ;
                     GXv_int10[0] = GXt_int9 ;
                     new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
                     txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
                     txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
                     txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
                     AV33Tot_p = GXt_int9 ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
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
      sMode722 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelN5722( ) ;
      Gx_mode = sMode722 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsN5722( )
   {
      standaloneModalN5722( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV39VarAux2 = O4890XPdasNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39VarAux2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39VarAux2), 4, 0));
         if ( isIns( )  && true /* After */ )
         {
            GXt_decimal11 = AV32Tot_k ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A4882XDisCod ;
            GXv_decimal12[0] = GXt_decimal11 ;
            new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
            txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
            txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
            txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
            AV32Tot_k = GXt_decimal11 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
         }
         if ( isIns( )  && true /* After */ )
         {
            GXt_int9 = (short)(AV33Tot_p) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int6[0] = A4882XDisCod ;
            GXv_int10[0] = GXt_int9 ;
            new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
            txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
            txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
            txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
            AV33Tot_p = GXt_int9 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
         }
         A4906XTotCant = (A4891XCantPdas.multiply(DecimalUtil.doubleToDec(A4890XPdasNum))) ;
         if ( isIns( )  )
         {
            A10744XCantSum = O10744XCantSum.add(A4906XTotCant) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A10744XCantSum = O10744XCantSum.add(A4906XTotCant).subtract(O4906XTotCant) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A10744XCantSum = O10744XCantSum.subtract(O4906XTotCant) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
               }
            }
         }
         AV38VarAux1 = O4891XCantPdas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38VarAux1", GXutil.ltrimstr( AV38VarAux1, 9, 2));
         A4907XTotPzas = (short)((A4892XPzasPdas*A4890XPdasNum)) ;
         if ( isIns( )  )
         {
            A10745XPzsSum = (short)(O10745XPzsSum+A4907XTotPzas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A10745XPzsSum = (short)(O10745XPzsSum+A4907XTotPzas-O4907XTotPzas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A10745XPzsSum = (short)(O10745XPzsSum-O4907XTotPzas) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00N525 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "XGEHD3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevelN5722( )
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

   public void scanStartN5722( )
   {
      /* Scan By routine */
      /* Using cursor T00N526 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      RcdFound722 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound722 = (short)(1) ;
         A4889XLinMan = T00N526_A4889XLinMan[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextN5722( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound722 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound722 = (short)(1) ;
         A4889XLinMan = T00N526_A4889XLinMan[0] ;
      }
   }

   public void scanEndN5722( )
   {
      pr_default.close(22);
   }

   public void afterConfirmN5722( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertN5722( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateN5722( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteN5722( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteN5722( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateN5722( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesN5722( )
   {
      edtXLinMan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXLinMan_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXPdasNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPdasNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXPdasNum_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXCantPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCantPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCantPdas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXPzasPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXPzasPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXPzasPdas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXMaqPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXMaqPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXMaqPdas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXTotCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTotCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotCant_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXTotPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTotPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotPzas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXNEstilo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNEstilo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNEstilo_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXNPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPda_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashesN5722( )
   {
   }

   public void send_integrity_lvl_hashesN5721( )
   {
   }

   public void subsflControlProps_70722( )
   {
      edtavnRcdDeleted_722_Internalname = "vNRCDDELETED_722_"+sGXsfl_70_idx ;
      edtXLinMan_Internalname = "XLINMAN_"+sGXsfl_70_idx ;
      edtXPdasNum_Internalname = "XPDASNUM_"+sGXsfl_70_idx ;
      edtXCantPdas_Internalname = "XCANTPDAS_"+sGXsfl_70_idx ;
      edtXPzasPdas_Internalname = "XPZASPDAS_"+sGXsfl_70_idx ;
      edtXMaqPdas_Internalname = "XMAQPDAS_"+sGXsfl_70_idx ;
      edtXTotCant_Internalname = "XTOTCANT_"+sGXsfl_70_idx ;
      edtXTotPzas_Internalname = "XTOTPZAS_"+sGXsfl_70_idx ;
      edtXNEstilo_Internalname = "XNESTILO_"+sGXsfl_70_idx ;
      edtXNPda_Internalname = "XNPDA_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_70722( )
   {
      edtavnRcdDeleted_722_Internalname = "vNRCDDELETED_722_"+sGXsfl_70_fel_idx ;
      edtXLinMan_Internalname = "XLINMAN_"+sGXsfl_70_fel_idx ;
      edtXPdasNum_Internalname = "XPDASNUM_"+sGXsfl_70_fel_idx ;
      edtXCantPdas_Internalname = "XCANTPDAS_"+sGXsfl_70_fel_idx ;
      edtXPzasPdas_Internalname = "XPZASPDAS_"+sGXsfl_70_fel_idx ;
      edtXMaqPdas_Internalname = "XMAQPDAS_"+sGXsfl_70_fel_idx ;
      edtXTotCant_Internalname = "XTOTCANT_"+sGXsfl_70_fel_idx ;
      edtXTotPzas_Internalname = "XTOTPZAS_"+sGXsfl_70_fel_idx ;
      edtXNEstilo_Internalname = "XNESTILO_"+sGXsfl_70_fel_idx ;
      edtXNPda_Internalname = "XNPDA_"+sGXsfl_70_fel_idx ;
   }

   public void addRowN5722( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70722( ) ;
      sendRowN5722( ) ;
   }

   public void sendRowN5722( )
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
         if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_722_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_722_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_722_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_722), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_722), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_722_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_722_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_722_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXLinMan_Internalname,GXutil.ltrim( localUtil.ntoc( A4889XLinMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4889XLinMan), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXLinMan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXLinMan_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_722_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXPdasNum_Internalname,GXutil.ltrim( localUtil.ntoc( A4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXPdasNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4890XPdasNum), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4890XPdasNum), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXPdasNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXPdasNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_722_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXCantPdas_Internalname,GXutil.ltrim( localUtil.ntoc( A4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXCantPdas_Enabled!=0) ? localUtil.format( A4891XCantPdas, "ZZZZZ9.99") : localUtil.format( A4891XCantPdas, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXCantPdas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXCantPdas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_722_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXPzasPdas_Internalname,GXutil.ltrim( localUtil.ntoc( A4892XPzasPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXPzasPdas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4892XPzasPdas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4892XPzasPdas), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXPzasPdas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXPzasPdas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_722_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXMaqPdas_Internalname,GXutil.rtrim( A4893XMaqPdas),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXMaqPdas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXMaqPdas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXTotCant_Internalname,GXutil.ltrim( localUtil.ntoc( A4906XTotCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXTotCant_Enabled!=0) ? localUtil.format( A4906XTotCant, "ZZZZZ9.99") : localUtil.format( A4906XTotCant, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXTotCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXTotCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXTotPzas_Internalname,GXutil.ltrim( localUtil.ntoc( A4907XTotPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXTotPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4907XTotPzas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4907XTotPzas), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXTotPzas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXTotPzas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_722_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXNEstilo_Internalname,GXutil.rtrim( A9788XNEstilo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXNEstilo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtXNEstilo_Visible),Integer.valueOf(edtXNEstilo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_722_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXNPda_Internalname,GXutil.rtrim( A9791XNPda),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXNPda_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtXNPda_Visible),Integer.valueOf(edtXNPda_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesN5722( ) ;
      GXCCtl = "Z4889XLinMan_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4889XLinMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4891XCantPdas_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9791XNPda_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9791XNPda));
      GXCCtl = "Z9788XNEstilo_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9788XNEstilo));
      GXCCtl = "Z4890XPdasNum_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4892XPzasPdas_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4892XPzasPdas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4893XMaqPdas_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4893XMaqPdas));
      GXCCtl = "O4890XPdasNum_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4890XPdasNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4891XCantPdas_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4891XCantPdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4907XTotPzas_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4907XTotPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4906XTotCant_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4906XTotCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_722_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_722_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_722_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_722, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_722_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_722_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XLINMAN_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXLinMan_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "XLINMAN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXLinMan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XPDASNUM_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXPdasNum_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "XPDASNUM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPdasNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XCANTPDAS_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXCantPdas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "XCANTPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXCantPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XPZASPDAS_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXPzasPdas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "XPZASPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXPzasPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XMAQPDAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXMaqPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XTOTCANT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XTOTPZAS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotPzas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XNESTILO_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXNEstilo_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "XNESTILO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNEstilo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XNESTILO_"+sGXsfl_70_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtXNEstilo_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XNPDA_"+sGXsfl_70_idx+"Title", GXutil.rtrim( edtXNPda_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "XNPDA_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPda_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XNPDA_"+sGXsfl_70_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtXNPda_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowN5722( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70722( ) ;
      edtavnRcdDeleted_722_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_722_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXLinMan_Title = httpContext.cgiGet( "XLINMAN_"+sGXsfl_70_idx+"Title") ;
      edtXLinMan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XLINMAN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXPdasNum_Title = httpContext.cgiGet( "XPDASNUM_"+sGXsfl_70_idx+"Title") ;
      edtXPdasNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XPDASNUM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXCantPdas_Title = httpContext.cgiGet( "XCANTPDAS_"+sGXsfl_70_idx+"Title") ;
      edtXCantPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XCANTPDAS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXPzasPdas_Title = httpContext.cgiGet( "XPZASPDAS_"+sGXsfl_70_idx+"Title") ;
      edtXPzasPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XPZASPDAS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXMaqPdas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XMAQPDAS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXTotCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTOTCANT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXTotPzas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTOTPZAS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXNEstilo_Title = httpContext.cgiGet( "XNESTILO_"+sGXsfl_70_idx+"Title") ;
      edtXNEstilo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNESTILO_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXNEstilo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "XNESTILO_"+sGXsfl_70_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXNPda_Title = httpContext.cgiGet( "XNPDA_"+sGXsfl_70_idx+"Title") ;
      edtXNPda_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNPDA_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXNPda_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "XNPDA_"+sGXsfl_70_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_722_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_722_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_722");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_722_Internalname ;
         wbErr = true ;
         nRcdDeleted_722 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_722 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_722_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXLinMan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXLinMan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "XLINMAN_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXLinMan_Internalname ;
         wbErr = true ;
         A4889XLinMan = (short)(0) ;
      }
      else
      {
         A4889XLinMan = (short)(localUtil.ctol( httpContext.cgiGet( edtXLinMan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXPdasNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXPdasNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "XPDASNUM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXPdasNum_Internalname ;
         wbErr = true ;
         A4890XPdasNum = (short)(0) ;
         n4890XPdasNum = false ;
      }
      else
      {
         A4890XPdasNum = (short)(localUtil.ctol( httpContext.cgiGet( edtXPdasNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4890XPdasNum = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXCantPdas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXCantPdas_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "XCANTPDAS_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXCantPdas_Internalname ;
         wbErr = true ;
         A4891XCantPdas = DecimalUtil.ZERO ;
         n4891XCantPdas = false ;
      }
      else
      {
         A4891XCantPdas = localUtil.ctond( httpContext.cgiGet( edtXCantPdas_Internalname)) ;
         n4891XCantPdas = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXPzasPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXPzasPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "XPZASPDAS_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXPzasPdas_Internalname ;
         wbErr = true ;
         A4892XPzasPdas = (short)(0) ;
         n4892XPzasPdas = false ;
      }
      else
      {
         A4892XPzasPdas = (short)(localUtil.ctol( httpContext.cgiGet( edtXPzasPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4892XPzasPdas = false ;
      }
      A4893XMaqPdas = httpContext.cgiGet( edtXMaqPdas_Internalname) ;
      n4893XMaqPdas = false ;
      A4906XTotCant = localUtil.ctond( httpContext.cgiGet( edtXTotCant_Internalname)) ;
      A4907XTotPzas = (short)(localUtil.ctol( httpContext.cgiGet( edtXTotPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A9788XNEstilo = httpContext.cgiGet( edtXNEstilo_Internalname) ;
      n9788XNEstilo = false ;
      A9791XNPda = httpContext.cgiGet( edtXNPda_Internalname) ;
      n9791XNPda = false ;
      GXCCtl = "Z4889XLinMan_" + sGXsfl_70_idx ;
      Z4889XLinMan = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4891XCantPdas_" + sGXsfl_70_idx ;
      Z4891XCantPdas = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9791XNPda_" + sGXsfl_70_idx ;
      Z9791XNPda = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9788XNEstilo_" + sGXsfl_70_idx ;
      Z9788XNEstilo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4890XPdasNum_" + sGXsfl_70_idx ;
      Z4890XPdasNum = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4892XPzasPdas_" + sGXsfl_70_idx ;
      Z4892XPzasPdas = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4893XMaqPdas_" + sGXsfl_70_idx ;
      Z4893XMaqPdas = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O4890XPdasNum_" + sGXsfl_70_idx ;
      O4890XPdasNum = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O4891XCantPdas_" + sGXsfl_70_idx ;
      O4891XCantPdas = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O4907XTotPzas_" + sGXsfl_70_idx ;
      O4907XTotPzas = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O4906XTotCant_" + sGXsfl_70_idx ;
      O4906XTotCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_722_" + sGXsfl_70_idx ;
      nRcdDeleted_722 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_722_" + sGXsfl_70_idx ;
      nRcdExists_722 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_722_" + sGXsfl_70_idx ;
      nIsMod_722 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtXTotPzas_Enabled = edtXTotPzas_Enabled ;
      defedtXTotCant_Enabled = edtXTotCant_Enabled ;
      defedtXLinMan_Enabled = edtXLinMan_Enabled ;
   }

   public void confirmValuesN50( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70722( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_70722( ) ;
         httpContext.changePostValue( "Z4889XLinMan_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z4889XLinMan_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4889XLinMan_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z4891XCantPdas_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z4891XCantPdas_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4891XCantPdas_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z9791XNPda_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z9791XNPda_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9791XNPda_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z9788XNEstilo_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z9788XNEstilo_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9788XNEstilo_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z4890XPdasNum_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z4890XPdasNum_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4890XPdasNum_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z4892XPzasPdas_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z4892XPzasPdas_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4892XPzasPdas_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z4893XMaqPdas_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z4893XMaqPdas_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4893XMaqPdas_"+sGXsfl_70_idx) ;
      }
      httpContext.changePostValue( "O4890XPdasNum", httpContext.cgiGet( "T4890XPdasNum")) ;
      httpContext.deletePostValue( "T4890XPdasNum") ;
      httpContext.changePostValue( "O4891XCantPdas", httpContext.cgiGet( "T4891XCantPdas")) ;
      httpContext.deletePostValue( "T4891XCantPdas") ;
      httpContext.changePostValue( "O4907XTotPzas", httpContext.cgiGet( "T4907XTotPzas")) ;
      httpContext.deletePostValue( "T4907XTotPzas") ;
      httpContext.changePostValue( "O4906XTotCant", httpContext.cgiGet( "T4906XTotCant")) ;
      httpContext.deletePostValue( "T4906XTotCant") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txgehd2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4882XDisCod,8,0))}, new String[] {"EmprCod","XDisCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4882XDisCod", GXutil.ltrim( localUtil.ntoc( Z4882XDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4886XUltLin", GXutil.ltrim( localUtil.ntoc( Z4886XUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4883XCantidad", GXutil.ltrim( localUtil.ntoc( Z4883XCantidad, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4885XUnidad", GXutil.rtrim( Z4885XUnidad));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4884XPiezas", GXutil.ltrim( localUtil.ntoc( Z4884XPiezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4886XUltLin", GXutil.ltrim( localUtil.ntoc( O4886XUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10745XPzsSum", GXutil.ltrim( localUtil.ntoc( O10745XPzsSum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10744XCantSum", GXutil.ltrim( localUtil.ntoc( O10744XCantSum, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_K", GXutil.ltrim( localUtil.ntoc( AV32Tot_k, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_P", GXutil.ltrim( localUtil.ntoc( AV33Tot_p, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV44Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVARAUX1", GXutil.ltrim( localUtil.ntoc( AV38VarAux1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVARAUX2", GXutil.ltrim( localUtil.ntoc( AV39VarAux2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.txgehd2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4882XDisCod,8,0))}, new String[] {"EmprCod","XDisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TXGEHD2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "GENERACION HDR MANUAL", "") ;
   }

   public void initializeNonKeyN5721( )
   {
      AV32Tot_k = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      AV33Tot_p = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      A4886XUltLin = (short)(0) ;
      n4886XUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      A4883XCantidad = DecimalUtil.ZERO ;
      n4883XCantidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4883XCantidad", GXutil.ltrimstr( A4883XCantidad, 9, 2));
      A4885XUnidad = "" ;
      n4885XUnidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4885XUnidad", A4885XUnidad);
      A4884XPiezas = (short)(0) ;
      n4884XPiezas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4884XPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4884XPiezas), 4, 0));
      O4886XUltLin = A4886XUltLin ;
      n4886XUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      O10745XPzsSum = A10745XPzsSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      O10744XCantSum = A10744XCantSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
      Z4886XUltLin = (short)(0) ;
      Z4883XCantidad = DecimalUtil.ZERO ;
      Z4885XUnidad = "" ;
      Z4884XPiezas = (short)(0) ;
   }

   public void initAllN5721( )
   {
      initializeNonKeyN5721( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyN5722( )
   {
      AV38VarAux1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38VarAux1", GXutil.ltrimstr( AV38VarAux1, 9, 2));
      AV39VarAux2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39VarAux2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39VarAux2), 4, 0));
      A4891XCantPdas = DecimalUtil.ZERO ;
      n4891XCantPdas = false ;
      A4906XTotCant = DecimalUtil.ZERO ;
      A4907XTotPzas = (short)(0) ;
      A4892XPzasPdas = (short)(0) ;
      n4892XPzasPdas = false ;
      A4893XMaqPdas = "" ;
      n4893XMaqPdas = false ;
      A9791XNPda = E9791XNPda ;
      n9791XNPda = false ;
      A9788XNEstilo = E9788XNEstilo ;
      n9788XNEstilo = false ;
      A4890XPdasNum = (short)(1) ;
      n4890XPdasNum = false ;
      O4890XPdasNum = A4890XPdasNum ;
      n4890XPdasNum = false ;
      O4891XCantPdas = A4891XCantPdas ;
      n4891XCantPdas = false ;
      O4907XTotPzas = A4907XTotPzas ;
      O4906XTotCant = A4906XTotCant ;
      Z4891XCantPdas = DecimalUtil.ZERO ;
      Z9791XNPda = "" ;
      Z9788XNEstilo = "" ;
      Z4890XPdasNum = (short)(0) ;
      Z4892XPzasPdas = (short)(0) ;
      Z4893XMaqPdas = "" ;
   }

   public void initAllN5722( )
   {
      A4889XLinMan = (short)(0) ;
      initializeNonKeyN5722( ) ;
   }

   public void standaloneModalInsertN5722( )
   {
      A4886XUltLin = i4886XUltLin ;
      n4886XUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4886XUltLin), 4, 0));
      A9791XNPda = i9791XNPda ;
      n9791XNPda = false ;
      A9788XNEstilo = i9788XNEstilo ;
      n9788XNEstilo = false ;
      A4890XPdasNum = i4890XPdasNum ;
      n4890XPdasNum = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241522711", true, true);
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
      httpContext.AddJavascriptSource("txgehd2.js", "?20268241522711", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties722( )
   {
      edtXTotPzas_Enabled = defedtXTotPzas_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTotPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotPzas_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXTotCant_Enabled = defedtXTotCant_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTotCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTotCant_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtXLinMan_Enabled = defedtXLinMan_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXLinMan_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void startgridcontrol70( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_722, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_722_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4889XLinMan, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtXLinMan_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXLinMan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4890XPdasNum, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtXPdasNum_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXPdasNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4891XCantPdas, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtXCantPdas_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXCantPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4892XPzasPdas, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtXPzasPdas_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXPzasPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4893XMaqPdas));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXMaqPdas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4906XTotCant, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4907XTotPzas, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXTotPzas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9788XNEstilo));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtXNEstilo_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXNEstilo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtXNEstilo_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9791XNPda));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtXNPda_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPda_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtXNPda_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtXDisCod_Internalname = "XDISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXUltLin_Internalname = "XULTLIN" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXSumCant_Internalname = "XSUMCANT" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXSumPzas_Internalname = "XSUMPZAS" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtXCantidad_Internalname = "XCANTIDAD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtXUnidad_Internalname = "XUNIDAD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXPiezas_Internalname = "XPIEZAS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXCantSum_Internalname = "XCANTSUM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtXPzsSum_Internalname = "XPZSSUM" ;
      edtavnRcdDeleted_722_Internalname = "vNRCDDELETED_722" ;
      edtXLinMan_Internalname = "XLINMAN" ;
      edtXPdasNum_Internalname = "XPDASNUM" ;
      edtXCantPdas_Internalname = "XCANTPDAS" ;
      edtXPzasPdas_Internalname = "XPZASPDAS" ;
      edtXMaqPdas_Internalname = "XMAQPDAS" ;
      edtXTotCant_Internalname = "XTOTCANT" ;
      edtXTotPzas_Internalname = "XTOTPZAS" ;
      edtXNEstilo_Internalname = "XNESTILO" ;
      edtXNPda_Internalname = "XNPDA" ;
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
      Form.setCaption( httpContext.getMessage( "GENERACION HDR MANUAL", "") );
      edtXNPda_Jsonclick = "" ;
      edtXNEstilo_Jsonclick = "" ;
      edtXTotPzas_Jsonclick = "" ;
      edtXTotCant_Jsonclick = "" ;
      edtXMaqPdas_Jsonclick = "" ;
      edtXPzasPdas_Jsonclick = "" ;
      edtXCantPdas_Jsonclick = "" ;
      edtXPdasNum_Jsonclick = "" ;
      edtXLinMan_Jsonclick = "" ;
      edtavnRcdDeleted_722_Jsonclick = "" ;
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
      edtXNPda_Enabled = 1 ;
      edtXNEstilo_Enabled = 1 ;
      edtXTotPzas_Enabled = 0 ;
      edtXTotCant_Enabled = 0 ;
      edtXMaqPdas_Enabled = 1 ;
      edtXPzasPdas_Enabled = 1 ;
      edtXCantPdas_Enabled = 1 ;
      edtXPdasNum_Enabled = 1 ;
      edtXLinMan_Enabled = 1 ;
      edtavnRcdDeleted_722_Enabled = 1 ;
      edtXPzsSum_Jsonclick = "" ;
      edtXPzsSum_Backcolor = (int)(0xFFFFFF) ;
      edtXPzsSum_Enabled = 0 ;
      edtXCantSum_Jsonclick = "" ;
      edtXCantSum_Backcolor = (int)(0xFFFFFF) ;
      edtXCantSum_Enabled = 0 ;
      edtXPiezas_Jsonclick = "" ;
      edtXPiezas_Backcolor = (int)(0xFFFFFF) ;
      edtXPiezas_Enabled = 1 ;
      edtXUnidad_Jsonclick = "" ;
      edtXUnidad_Backcolor = (int)(0xFFFFFF) ;
      edtXUnidad_Enabled = 1 ;
      edtXCantidad_Jsonclick = "" ;
      edtXCantidad_Backcolor = (int)(0xFFFFFF) ;
      edtXCantidad_Enabled = 1 ;
      edtXSumPzas_Jsonclick = "" ;
      edtXSumPzas_Backcolor = (int)(0xFFFFFF) ;
      edtXSumPzas_Enabled = 0 ;
      edtXSumCant_Jsonclick = "" ;
      edtXSumCant_Backcolor = (int)(0xFFFFFF) ;
      edtXSumCant_Enabled = 0 ;
      edtXUltLin_Jsonclick = "" ;
      edtXUltLin_Backcolor = (int)(0xFFFFFF) ;
      edtXUltLin_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXDisCod_Jsonclick = "" ;
      edtXDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtXDisCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      edtXNEstilo_Title = httpContext.getMessage( "N Estilo", "") ;
      edtXNPda_Title = httpContext.getMessage( "N Partida Cliente", "") ;
      edtXNPda_Visible = -1 ;
      edtXNEstilo_Visible = -1 ;
      edtXPzasPdas_Title = httpContext.getMessage( "Piezas p/Partidas", "") ;
      edtXCantPdas_Title = httpContext.getMessage( "Cantidad p/Partidas", "") ;
      edtXPdasNum_Title = httpContext.getMessage( "Numero de Partidas", "") ;
      edtXLinMan_Title = httpContext.getMessage( "Numero Linea", "") ;
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

   public void gx1asaxsumpzasN5721( String A396EmprCod ,
                                    int A4882XDisCod )
   {
      GXt_int9 = A4888XSumPzas ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A4882XDisCod ;
      GXv_int10[0] = GXt_int9 ;
      new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
      txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
      txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
      txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
      A4888XSumPzas = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4888XSumPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4888XSumPzas), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4888XSumPzas, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asaxsumcantN5721( String A396EmprCod ,
                                    int A4882XDisCod )
   {
      GXt_decimal11 = A4887XSumCant ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A4882XDisCod ;
      GXv_decimal12[0] = GXt_decimal11 ;
      new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
      txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
      txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
      txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
      A4887XSumCant = GXt_decimal11 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4887XSumCant", GXutil.ltrimstr( A4887XSumCant, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4887XSumCant, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asatot_kN5721( String A396EmprCod ,
                                 int A4882XDisCod )
   {
      if ( true /* After */ || true /* After */ || true /* After */ )
      {
         GXt_decimal11 = AV32Tot_k ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_decimal12[0] = GXt_decimal11 ;
         new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV32Tot_k = GXt_decimal11 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32Tot_k, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asatot_pN5721( String A396EmprCod ,
                                 int A4882XDisCod )
   {
      if ( true /* After */ || true /* After */ || true /* After */ )
      {
         GXt_int9 = (short)(AV33Tot_p) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_int10[0] = GXt_int9 ;
         new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV33Tot_p = GXt_int9 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Tot_p, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx18asatot_kN5722( short A4890XPdasNum ,
                                  String Gx_mode ,
                                  String A396EmprCod ,
                                  int A4882XDisCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_decimal11 = AV32Tot_k ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_decimal12[0] = GXt_decimal11 ;
         new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV32Tot_k = GXt_decimal11 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32Tot_k, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx19asatot_kN5722( String A396EmprCod ,
                                  int A4882XDisCod )
   {
      if ( true /* After */ || true /* After */ || true /* After */ )
      {
         GXt_decimal11 = AV32Tot_k ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_decimal12[0] = GXt_decimal11 ;
         new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV32Tot_k = GXt_decimal11 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrimstr( AV32Tot_k, 10, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV32Tot_k, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx20asatot_pN5722( short A4890XPdasNum ,
                                  String Gx_mode ,
                                  String A396EmprCod ,
                                  int A4882XDisCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_int9 = (short)(AV33Tot_p) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_int10[0] = GXt_int9 ;
         new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV33Tot_p = GXt_int9 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Tot_p, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx21asatot_pN5722( String A396EmprCod ,
                                  int A4882XDisCod )
   {
      if ( true /* After */ || true /* After */ || true /* After */ )
      {
         GXt_int9 = (short)(AV33Tot_p) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_int10[0] = GXt_int9 ;
         new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
         AV33Tot_p = GXt_int9 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Tot_p), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Tot_p, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_70722( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalN5722( ) ;
         standaloneModalN5722( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowN5722( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_70722( ) ;
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
      /* Using cursor T00N527 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(23);
      /* Using cursor T00N529 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A10744XCantSum = T00N529_A10744XCantSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         A10745XPzsSum = T00N529_A10745XPzsSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      }
      else
      {
         A10744XCantSum = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrimstr( A10744XCantSum, 9, 2));
         A10745XPzsSum = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10745XPzsSum), 4, 0));
      }
      pr_default.close(24);
      GX_FocusControl = edtXCantidad_Internalname ;
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

   public void valid_Xdiscod( )
   {
      n4886XUltLin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4887XSumCant", GXutil.ltrim( localUtil.ntoc( A4887XSumCant, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4888XSumPzas", GXutil.ltrim( localUtil.ntoc( A4888XSumPzas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4886XUltLin", GXutil.ltrim( localUtil.ntoc( A4886XUltLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4883XCantidad", GXutil.ltrim( localUtil.ntoc( A4883XCantidad, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4885XUnidad", GXutil.rtrim( A4885XUnidad));
      httpContext.ajax_rsp_assign_attri("", false, "A4884XPiezas", GXutil.ltrim( localUtil.ntoc( A4884XPiezas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10744XCantSum", GXutil.ltrim( localUtil.ntoc( A10744XCantSum, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10745XPzsSum", GXutil.ltrim( localUtil.ntoc( A10745XPzsSum, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4882XDisCod", GXutil.ltrim( localUtil.ntoc( Z4882XDisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4887XSumCant", GXutil.ltrim( localUtil.ntoc( Z4887XSumCant, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4888XSumPzas", GXutil.ltrim( localUtil.ntoc( Z4888XSumPzas, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4886XUltLin", GXutil.ltrim( localUtil.ntoc( Z4886XUltLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4883XCantidad", GXutil.ltrim( localUtil.ntoc( Z4883XCantidad, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4885XUnidad", GXutil.rtrim( Z4885XUnidad));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4884XPiezas", GXutil.ltrim( localUtil.ntoc( Z4884XPiezas, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10744XCantSum", GXutil.ltrim( localUtil.ntoc( Z10744XCantSum, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10745XPzsSum", GXutil.ltrim( localUtil.ntoc( Z10745XPzsSum, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4886XUltLin", GXutil.ltrim( localUtil.ntoc( O4886XUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10745XPzsSum", GXutil.ltrim( localUtil.ntoc( O10745XPzsSum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10744XCantSum", GXutil.ltrim( localUtil.ntoc( O10744XCantSum, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Xpdasnum( )
   {
      n4890XPdasNum = false ;
      n4891XCantPdas = false ;
      AV39VarAux2 = O4890XPdasNum ;
      if ( true /* Level */ && true /* After */ && ( A4883XCantidad.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV32Tot_k, A4883XCantidad) != 0 ) && ( A4891XCantPdas.doubleValue() == 0 ) && ( AV42Texfina == 0 ) )
      {
         A4891XCantPdas = A4883XCantidad.subtract(AV32Tot_k) ;
         n4891XCantPdas = false ;
      }
      else
      {
         if ( true /* Level */ && true /* After */ && ( A4883XCantidad.doubleValue() > 0 ) && ( DecimalUtil.compareTo(AV32Tot_k, A4883XCantidad) != 0 ) && ( AV42Texfina == 1 ) && ( A4891XCantPdas.doubleValue() == 0 ) )
         {
            A4891XCantPdas = (A4883XCantidad.subtract(AV32Tot_k)).divide(DecimalUtil.doubleToDec(A4890XPdasNum), 18, java.math.RoundingMode.DOWN) ;
            n4891XCantPdas = false ;
         }
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_decimal11 = AV32Tot_k ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_decimal12[0] = GXt_decimal11 ;
         new app.psumxk(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_decimal12) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_decimal11 = GXv_decimal12[0] ;
         AV32Tot_k = GXt_decimal11 ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXt_int9 = (short)(AV33Tot_p) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A4882XDisCod ;
         GXv_int10[0] = GXt_int9 ;
         new app.psumxp(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int10) ;
         txgehd2_impl.this.A396EmprCod = GXv_char4[0] ;
         txgehd2_impl.this.A4882XDisCod = GXv_int6[0] ;
         txgehd2_impl.this.GXt_int9 = GXv_int10[0] ;
         AV33Tot_p = GXt_int9 ;
      }
      if ( ( A4890XPdasNum == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de Partidas incorrecto", ""), 1, "XPDASNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXPdasNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV39VarAux2", GXutil.ltrim( localUtil.ntoc( AV39VarAux2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4891XCantPdas", GXutil.ltrim( localUtil.ntoc( A4891XCantPdas, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Tot_k", GXutil.ltrim( localUtil.ntoc( AV32Tot_k, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Tot_p", GXutil.ltrim( localUtil.ntoc( AV33Tot_p, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Xcantpdas( )
   {
      n4891XCantPdas = false ;
      n4890XPdasNum = false ;
      n4883XCantidad = false ;
      A4906XTotCant = (A4891XCantPdas.multiply(DecimalUtil.doubleToDec(A4890XPdasNum))) ;
      if ( DecimalUtil.compareTo(A10744XCantSum, A4883XCantidad) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Cantidad Distribuida superior al Pedido ¡¡¡", ""), 0, "XCANTIDAD");
      }
      AV38VarAux1 = O4891XCantPdas ;
      if ( ( A4891XCantPdas.doubleValue() == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad incorrecta", ""), 1, "XCANTPDAS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXCantPdas_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4906XTotCant", GXutil.ltrim( localUtil.ntoc( A4906XTotCant, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV38VarAux1", GXutil.ltrim( localUtil.ntoc( AV38VarAux1, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4882XDisCod',fld:'XDISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DELETE TABLA XGEHD3'","{handler:'e12N52',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4882XDisCod',fld:'XDISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DELETE TABLA XGEHD3'",",oparms:[{av:'A4882XDisCod',fld:'XDISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_XDISCOD","{handler:'valid_Xdiscod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A4886XUltLin',fld:'XULTLIN',pic:'ZZZ9'},{av:'edtXNEstilo_Title',ctrl:'XNESTILO',prop:'Title'},{av:'edtXNPda_Title',ctrl:'XNPDA',prop:'Title'},{av:'edtXNPda_Visible',ctrl:'XNPDA',prop:'Visible'},{av:'edtXNEstilo_Visible',ctrl:'XNESTILO',prop:'Visible'},{av:'edtXPzasPdas_Title',ctrl:'XPZASPDAS',prop:'Title'},{av:'edtXCantPdas_Title',ctrl:'XCANTPDAS',prop:'Title'},{av:'edtXPdasNum_Title',ctrl:'XPDASNUM',prop:'Title'},{av:'edtXLinMan_Title',ctrl:'XLINMAN',prop:'Title'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4882XDisCod',fld:'XDISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XDISCOD",",oparms:[{av:'A4887XSumCant',fld:'XSUMCANT',pic:'ZZZZZ9.99'},{av:'A4888XSumPzas',fld:'XSUMPZAS',pic:'ZZZ9'},{av:'A4886XUltLin',fld:'XULTLIN',pic:'ZZZ9'},{av:'A4883XCantidad',fld:'XCANTIDAD',pic:'ZZZZZ9.99'},{av:'A4885XUnidad',fld:'XUNIDAD',pic:'@!'},{av:'A4884XPiezas',fld:'XPIEZAS',pic:'ZZZ9'},{av:'A10744XCantSum',fld:'XCANTSUM',pic:'ZZZZZ9.99'},{av:'A10745XPzsSum',fld:'XPZSSUM',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4882XDisCod'},{av:'Z4887XSumCant'},{av:'Z4888XSumPzas'},{av:'Z4886XUltLin'},{av:'Z4883XCantidad'},{av:'Z4885XUnidad'},{av:'Z4884XPiezas'},{av:'Z10744XCantSum'},{av:'Z10745XPzsSum'},{av:'O4886XUltLin'},{av:'O10745XPzsSum'},{av:'O10744XCantSum'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_XULTLIN","{handler:'valid_Xultlin',iparms:[]");
      setEventMetadata("VALID_XULTLIN",",oparms:[]}");
      setEventMetadata("VALID_XCANTIDAD","{handler:'valid_Xcantidad',iparms:[]");
      setEventMetadata("VALID_XCANTIDAD",",oparms:[]}");
      setEventMetadata("VALID_XCANTSUM","{handler:'valid_Xcantsum',iparms:[]");
      setEventMetadata("VALID_XCANTSUM",",oparms:[]}");
      setEventMetadata("VALID_XLINMAN","{handler:'valid_Xlinman',iparms:[]");
      setEventMetadata("VALID_XLINMAN",",oparms:[]}");
      setEventMetadata("VALID_XPDASNUM","{handler:'valid_Xpdasnum',iparms:[{av:'A4882XDisCod',fld:'XDISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O4890XPdasNum'},{av:'A4890XPdasNum',fld:'XPDASNUM',pic:'ZZZ9'},{av:'AV39VarAux2',fld:'vVARAUX2',pic:'ZZZ9'},{av:'A4891XCantPdas',fld:'XCANTPDAS',pic:'ZZZZZ9.99'},{av:'AV32Tot_k',fld:'vTOT_K',pic:'ZZZZZZ9.99'},{av:'AV33Tot_p',fld:'vTOT_P',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_XPDASNUM",",oparms:[{av:'AV39VarAux2',fld:'vVARAUX2',pic:'ZZZ9'},{av:'A4891XCantPdas',fld:'XCANTPDAS',pic:'ZZZZZ9.99'},{av:'AV32Tot_k',fld:'vTOT_K',pic:'ZZZZZZ9.99'},{av:'AV33Tot_p',fld:'vTOT_P',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_XCANTPDAS","{handler:'valid_Xcantpdas',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O4891XCantPdas'},{av:'O4906XTotCant'},{av:'O10744XCantSum'},{av:'A4891XCantPdas',fld:'XCANTPDAS',pic:'ZZZZZ9.99'},{av:'A4890XPdasNum',fld:'XPDASNUM',pic:'ZZZ9'},{av:'A4906XTotCant',fld:'XTOTCANT',pic:'ZZZZZ9.99'},{av:'A10744XCantSum',fld:'XCANTSUM',pic:'ZZZZZ9.99'},{av:'A4883XCantidad',fld:'XCANTIDAD',pic:'ZZZZZ9.99'},{av:'AV38VarAux1',fld:'vVARAUX1',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_XCANTPDAS",",oparms:[{av:'A4906XTotCant',fld:'XTOTCANT',pic:'ZZZZZ9.99'},{av:'AV38VarAux1',fld:'vVARAUX1',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_XPZASPDAS","{handler:'valid_Xpzaspdas',iparms:[]");
      setEventMetadata("VALID_XPZASPDAS",",oparms:[]}");
      setEventMetadata("VALID_XTOTCANT","{handler:'valid_Xtotcant',iparms:[]");
      setEventMetadata("VALID_XTOTCANT",",oparms:[]}");
      setEventMetadata("VALID_XTOTPZAS","{handler:'valid_Xtotpzas',iparms:[]");
      setEventMetadata("VALID_XTOTPZAS",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Xnpda',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      E9788XNEstilo = "" ;
      E9791XNPda = "" ;
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4883XCantidad = DecimalUtil.ZERO ;
      Z4885XUnidad = "" ;
      O10744XCantSum = DecimalUtil.ZERO ;
      Z4891XCantPdas = DecimalUtil.ZERO ;
      Z9791XNPda = "" ;
      Z9788XNEstilo = "" ;
      Z4893XMaqPdas = "" ;
      O4891XCantPdas = DecimalUtil.ZERO ;
      O4906XTotCant = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A4887XSumCant = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A4883XCantidad = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A4885XUnidad = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10744XCantSum = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B10744XCantSum = DecimalUtil.ZERO ;
      sMode722 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV32Tot_k = DecimalUtil.ZERO ;
      AV44Pgmname = "" ;
      AV38VarAux1 = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode721 = "" ;
      s10744XCantSum = DecimalUtil.ZERO ;
      sV32Tot_k = DecimalUtil.ZERO ;
      OV32Tot_k = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A4891XCantPdas = DecimalUtil.ZERO ;
      A4893XMaqPdas = "" ;
      A4906XTotCant = DecimalUtil.ZERO ;
      A9788XNEstilo = "" ;
      A9791XNPda = "" ;
      T4891XCantPdas = DecimalUtil.ZERO ;
      T4906XTotCant = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      AV30Station = "" ;
      GXv_char2 = new String[1] ;
      AV29EmprNom = "" ;
      AV8UsurCod = "" ;
      AV10Lit1 = "" ;
      AV31Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV28Lit9 = "" ;
      AV12Lit11 = "" ;
      AV11Lit10 = "" ;
      AV27Lit8 = "" ;
      AV13Lit12 = "" ;
      AV34Lit100 = "" ;
      GXv_int5 = new int[1] ;
      AV35Discolnom = "" ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      AV40Lit101 = "" ;
      AV41Lit102 = "" ;
      GXt_char1 = "" ;
      Z10744XCantSum = DecimalUtil.ZERO ;
      T00N56_A396EmprCod = new String[] {""} ;
      T00N58_A10744XCantSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N58_A10745XPzsSum = new short[1] ;
      T00N510_A4882XDisCod = new int[1] ;
      T00N510_A4886XUltLin = new short[1] ;
      T00N510_n4886XUltLin = new boolean[] {false} ;
      T00N510_A4883XCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N510_n4883XCantidad = new boolean[] {false} ;
      T00N510_A4885XUnidad = new String[] {""} ;
      T00N510_n4885XUnidad = new boolean[] {false} ;
      T00N510_A4884XPiezas = new short[1] ;
      T00N510_n4884XPiezas = new boolean[] {false} ;
      T00N510_A396EmprCod = new String[] {""} ;
      T00N510_A10744XCantSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N510_A10745XPzsSum = new short[1] ;
      T00N511_A396EmprCod = new String[] {""} ;
      T00N511_A4882XDisCod = new int[1] ;
      T00N55_A4882XDisCod = new int[1] ;
      T00N55_A4886XUltLin = new short[1] ;
      T00N55_n4886XUltLin = new boolean[] {false} ;
      T00N55_A4883XCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N55_n4883XCantidad = new boolean[] {false} ;
      T00N55_A4885XUnidad = new String[] {""} ;
      T00N55_n4885XUnidad = new boolean[] {false} ;
      T00N55_A4884XPiezas = new short[1] ;
      T00N55_n4884XPiezas = new boolean[] {false} ;
      T00N55_A396EmprCod = new String[] {""} ;
      T00N512_A396EmprCod = new String[] {""} ;
      T00N512_A4882XDisCod = new int[1] ;
      T00N513_A396EmprCod = new String[] {""} ;
      T00N513_A4882XDisCod = new int[1] ;
      T00N54_A4882XDisCod = new int[1] ;
      T00N54_A4886XUltLin = new short[1] ;
      T00N54_n4886XUltLin = new boolean[] {false} ;
      T00N54_A4883XCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N54_n4883XCantidad = new boolean[] {false} ;
      T00N54_A4885XUnidad = new String[] {""} ;
      T00N54_n4885XUnidad = new boolean[] {false} ;
      T00N54_A4884XPiezas = new short[1] ;
      T00N54_n4884XPiezas = new boolean[] {false} ;
      T00N54_A396EmprCod = new String[] {""} ;
      T00N517_A396EmprCod = new String[] {""} ;
      T00N517_A4882XDisCod = new int[1] ;
      T00N517_A4889XLinMan = new short[1] ;
      T00N517_A9783XNRecep = new int[1] ;
      T00N519_A396EmprCod = new String[] {""} ;
      T00N519_A4882XDisCod = new int[1] ;
      E9791XNPda = "" ;
      E9788XNEstilo = "" ;
      T00N520_A396EmprCod = new String[] {""} ;
      T00N520_A4882XDisCod = new int[1] ;
      T00N520_A4889XLinMan = new short[1] ;
      T00N520_A4891XCantPdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N520_n4891XCantPdas = new boolean[] {false} ;
      T00N520_A9791XNPda = new String[] {""} ;
      T00N520_n9791XNPda = new boolean[] {false} ;
      T00N520_A9788XNEstilo = new String[] {""} ;
      T00N520_n9788XNEstilo = new boolean[] {false} ;
      T00N520_A4890XPdasNum = new short[1] ;
      T00N520_n4890XPdasNum = new boolean[] {false} ;
      T00N520_A4892XPzasPdas = new short[1] ;
      T00N520_n4892XPzasPdas = new boolean[] {false} ;
      T00N520_A4893XMaqPdas = new String[] {""} ;
      T00N520_n4893XMaqPdas = new boolean[] {false} ;
      T00N521_A396EmprCod = new String[] {""} ;
      T00N521_A4882XDisCod = new int[1] ;
      T00N521_A4889XLinMan = new short[1] ;
      T00N53_A396EmprCod = new String[] {""} ;
      T00N53_A4882XDisCod = new int[1] ;
      T00N53_A4889XLinMan = new short[1] ;
      T00N53_A4891XCantPdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N53_n4891XCantPdas = new boolean[] {false} ;
      T00N53_A9791XNPda = new String[] {""} ;
      T00N53_n9791XNPda = new boolean[] {false} ;
      T00N53_A9788XNEstilo = new String[] {""} ;
      T00N53_n9788XNEstilo = new boolean[] {false} ;
      T00N53_A4890XPdasNum = new short[1] ;
      T00N53_n4890XPdasNum = new boolean[] {false} ;
      T00N53_A4892XPzasPdas = new short[1] ;
      T00N53_n4892XPzasPdas = new boolean[] {false} ;
      T00N53_A4893XMaqPdas = new String[] {""} ;
      T00N53_n4893XMaqPdas = new boolean[] {false} ;
      T00N52_A396EmprCod = new String[] {""} ;
      T00N52_A4882XDisCod = new int[1] ;
      T00N52_A4889XLinMan = new short[1] ;
      T00N52_A4891XCantPdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N52_n4891XCantPdas = new boolean[] {false} ;
      T00N52_A9791XNPda = new String[] {""} ;
      T00N52_n9791XNPda = new boolean[] {false} ;
      T00N52_A9788XNEstilo = new String[] {""} ;
      T00N52_n9788XNEstilo = new boolean[] {false} ;
      T00N52_A4890XPdasNum = new short[1] ;
      T00N52_n4890XPdasNum = new boolean[] {false} ;
      T00N52_A4892XPzasPdas = new short[1] ;
      T00N52_n4892XPzasPdas = new boolean[] {false} ;
      T00N52_A4893XMaqPdas = new String[] {""} ;
      T00N52_n4893XMaqPdas = new boolean[] {false} ;
      T00N525_A396EmprCod = new String[] {""} ;
      T00N525_A4882XDisCod = new int[1] ;
      T00N525_A4889XLinMan = new short[1] ;
      T00N525_A9783XNRecep = new int[1] ;
      T00N526_A396EmprCod = new String[] {""} ;
      T00N526_A4882XDisCod = new int[1] ;
      T00N526_A4889XLinMan = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i9791XNPda = "" ;
      i9788XNEstilo = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00N527_A396EmprCod = new String[] {""} ;
      T00N529_A10744XCantSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00N529_A10745XPzsSum = new short[1] ;
      Z4887XSumCant = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ4887XSumCant = DecimalUtil.ZERO ;
      ZZ4883XCantidad = DecimalUtil.ZERO ;
      ZZ4885XUnidad = "" ;
      ZZ10744XCantSum = DecimalUtil.ZERO ;
      ZO10744XCantSum = DecimalUtil.ZERO ;
      GXt_decimal11 = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int10 = new short[1] ;
      ZV32Tot_k = DecimalUtil.ZERO ;
      Z4906XTotCant = DecimalUtil.ZERO ;
      ZV38VarAux1 = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.txgehd2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txgehd2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txgehd2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txgehd2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txgehd2__default(),
         new Object[] {
             new Object[] {
            T00N52_A396EmprCod, T00N52_A4882XDisCod, T00N52_A4889XLinMan, T00N52_A4891XCantPdas, T00N52_n4891XCantPdas, T00N52_A9791XNPda, T00N52_n9791XNPda, T00N52_A9788XNEstilo, T00N52_n9788XNEstilo, T00N52_A4890XPdasNum,
            T00N52_n4890XPdasNum, T00N52_A4892XPzasPdas, T00N52_n4892XPzasPdas, T00N52_A4893XMaqPdas, T00N52_n4893XMaqPdas
            }
            , new Object[] {
            T00N53_A396EmprCod, T00N53_A4882XDisCod, T00N53_A4889XLinMan, T00N53_A4891XCantPdas, T00N53_n4891XCantPdas, T00N53_A9791XNPda, T00N53_n9791XNPda, T00N53_A9788XNEstilo, T00N53_n9788XNEstilo, T00N53_A4890XPdasNum,
            T00N53_n4890XPdasNum, T00N53_A4892XPzasPdas, T00N53_n4892XPzasPdas, T00N53_A4893XMaqPdas, T00N53_n4893XMaqPdas
            }
            , new Object[] {
            T00N54_A4882XDisCod, T00N54_A4886XUltLin, T00N54_n4886XUltLin, T00N54_A4883XCantidad, T00N54_n4883XCantidad, T00N54_A4885XUnidad, T00N54_n4885XUnidad, T00N54_A4884XPiezas, T00N54_n4884XPiezas, T00N54_A396EmprCod
            }
            , new Object[] {
            T00N55_A4882XDisCod, T00N55_A4886XUltLin, T00N55_n4886XUltLin, T00N55_A4883XCantidad, T00N55_n4883XCantidad, T00N55_A4885XUnidad, T00N55_n4885XUnidad, T00N55_A4884XPiezas, T00N55_n4884XPiezas, T00N55_A396EmprCod
            }
            , new Object[] {
            T00N56_A396EmprCod
            }
            , new Object[] {
            T00N58_A10744XCantSum, T00N58_A10745XPzsSum
            }
            , new Object[] {
            T00N510_A4882XDisCod, T00N510_A4886XUltLin, T00N510_n4886XUltLin, T00N510_A4883XCantidad, T00N510_n4883XCantidad, T00N510_A4885XUnidad, T00N510_n4885XUnidad, T00N510_A4884XPiezas, T00N510_n4884XPiezas, T00N510_A396EmprCod,
            T00N510_A10744XCantSum, T00N510_A10745XPzsSum
            }
            , new Object[] {
            T00N511_A396EmprCod, T00N511_A4882XDisCod
            }
            , new Object[] {
            T00N512_A396EmprCod, T00N512_A4882XDisCod
            }
            , new Object[] {
            T00N513_A396EmprCod, T00N513_A4882XDisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00N517_A396EmprCod, T00N517_A4882XDisCod, T00N517_A4889XLinMan, T00N517_A9783XNRecep
            }
            , new Object[] {
            }
            , new Object[] {
            T00N519_A396EmprCod, T00N519_A4882XDisCod
            }
            , new Object[] {
            T00N520_A396EmprCod, T00N520_A4882XDisCod, T00N520_A4889XLinMan, T00N520_A4891XCantPdas, T00N520_n4891XCantPdas, T00N520_A9791XNPda, T00N520_n9791XNPda, T00N520_A9788XNEstilo, T00N520_n9788XNEstilo, T00N520_A4890XPdasNum,
            T00N520_n4890XPdasNum, T00N520_A4892XPzasPdas, T00N520_n4892XPzasPdas, T00N520_A4893XMaqPdas, T00N520_n4893XMaqPdas
            }
            , new Object[] {
            T00N521_A396EmprCod, T00N521_A4882XDisCod, T00N521_A4889XLinMan
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00N525_A396EmprCod, T00N525_A4882XDisCod, T00N525_A4889XLinMan, T00N525_A9783XNRecep
            }
            , new Object[] {
            T00N526_A396EmprCod, T00N526_A4882XDisCod, T00N526_A4889XLinMan
            }
            , new Object[] {
            T00N527_A396EmprCod
            }
            , new Object[] {
            T00N529_A10744XCantSum, T00N529_A10745XPzsSum
            }
         }
      );
      Z4882XDisCod = 0 ;
      A4882XDisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV44Pgmname = "TXGEHD2" ;
      Z4890XPdasNum = (short)(1) ;
      n4890XPdasNum = false ;
      O4890XPdasNum = (short)(1) ;
      n4890XPdasNum = false ;
      T4890XPdasNum = (short)(1) ;
      n4890XPdasNum = false ;
      i4890XPdasNum = (short)(1) ;
      n4890XPdasNum = false ;
      A4890XPdasNum = (short)(1) ;
      n4890XPdasNum = false ;
      Z9788XNEstilo = "" ;
      n9788XNEstilo = false ;
      A9788XNEstilo = "" ;
      n9788XNEstilo = false ;
      E9788XNEstilo = "" ;
      n9788XNEstilo = false ;
      i9788XNEstilo = "" ;
      n9788XNEstilo = false ;
      Z9791XNPda = "" ;
      n9791XNPda = false ;
      A9791XNPda = "" ;
      n9791XNPda = false ;
      E9791XNPda = "" ;
      n9791XNPda = false ;
      i9791XNPda = "" ;
      n9791XNPda = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV37Veritems ;
   private byte AV42Texfina ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z4886XUltLin ;
   private short Z4884XPiezas ;
   private short O4886XUltLin ;
   private short O10745XPzsSum ;
   private short Z4889XLinMan ;
   private short Z4890XPdasNum ;
   private short Z4892XPzasPdas ;
   private short O4890XPdasNum ;
   private short O4907XTotPzas ;
   private short nRcdDeleted_722 ;
   private short nRcdExists_722 ;
   private short nIsMod_722 ;
   private short A4890XPdasNum ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4886XUltLin ;
   private short A4888XSumPzas ;
   private short A4884XPiezas ;
   private short A10745XPzsSum ;
   private short nBlankRcdCount722 ;
   private short RcdFound722 ;
   private short B4886XUltLin ;
   private short B10745XPzsSum ;
   private short nBlankRcdUsr722 ;
   private short AV39VarAux2 ;
   private short s4886XUltLin ;
   private short s10745XPzsSum ;
   private short A4889XLinMan ;
   private short A4892XPzasPdas ;
   private short A4907XTotPzas ;
   private short T4890XPdasNum ;
   private short T4907XTotPzas ;
   private short Z10745XPzsSum ;
   private short RcdFound721 ;
   private short nIsDirty_721 ;
   private short nIsDirty_722 ;
   private short i4886XUltLin ;
   private short i4890XPdasNum ;
   private short Z4888XSumPzas ;
   private short ZZ4888XSumPzas ;
   private short ZZ4886XUltLin ;
   private short ZZ4884XPiezas ;
   private short ZZ10745XPzsSum ;
   private short ZO4886XUltLin ;
   private short ZO10745XPzsSum ;
   private short GXt_int9 ;
   private short GXv_int10[] ;
   private short ZV39VarAux2 ;
   private int wcpOA4882XDisCod ;
   private int Z4882XDisCod ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int A4882XDisCod ;
   private int trnEnded ;
   private int edtXNEstilo_Visible ;
   private int edtXNPda_Visible ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtXDisCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXUltLin_Enabled ;
   private int edtXSumCant_Enabled ;
   private int edtXSumPzas_Enabled ;
   private int edtXCantidad_Enabled ;
   private int edtXUnidad_Enabled ;
   private int edtXPiezas_Enabled ;
   private int edtXCantSum_Enabled ;
   private int edtXPzsSum_Enabled ;
   private int edtavnRcdDeleted_722_Enabled ;
   private int edtXLinMan_Enabled ;
   private int edtXPdasNum_Enabled ;
   private int edtXCantPdas_Enabled ;
   private int edtXPzasPdas_Enabled ;
   private int edtXMaqPdas_Enabled ;
   private int edtXTotCant_Enabled ;
   private int edtXTotPzas_Enabled ;
   private int edtXNEstilo_Enabled ;
   private int edtXNPda_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV33Tot_p ;
   private int sV33Tot_p ;
   private int OV33Tot_p ;
   private int GXv_int5[] ;
   private int AV36Discolnum ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtXTotPzas_Enabled ;
   private int defedtXTotCant_Enabled ;
   private int defedtXLinMan_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtXPzsSum_Backcolor ;
   private int edtXCantSum_Backcolor ;
   private int edtXPiezas_Backcolor ;
   private int edtXUnidad_Backcolor ;
   private int edtXCantidad_Backcolor ;
   private int edtXSumPzas_Backcolor ;
   private int edtXSumCant_Backcolor ;
   private int edtXUltLin_Backcolor ;
   private int edtXDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4882XDisCod ;
   private int GXv_int6[] ;
   private int ZV33Tot_p ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4883XCantidad ;
   private java.math.BigDecimal O10744XCantSum ;
   private java.math.BigDecimal Z4891XCantPdas ;
   private java.math.BigDecimal O4891XCantPdas ;
   private java.math.BigDecimal O4906XTotCant ;
   private java.math.BigDecimal A4887XSumCant ;
   private java.math.BigDecimal A4883XCantidad ;
   private java.math.BigDecimal A10744XCantSum ;
   private java.math.BigDecimal B10744XCantSum ;
   private java.math.BigDecimal AV32Tot_k ;
   private java.math.BigDecimal AV38VarAux1 ;
   private java.math.BigDecimal s10744XCantSum ;
   private java.math.BigDecimal sV32Tot_k ;
   private java.math.BigDecimal OV32Tot_k ;
   private java.math.BigDecimal A4891XCantPdas ;
   private java.math.BigDecimal A4906XTotCant ;
   private java.math.BigDecimal T4891XCantPdas ;
   private java.math.BigDecimal T4906XTotCant ;
   private java.math.BigDecimal Z10744XCantSum ;
   private java.math.BigDecimal Z4887XSumCant ;
   private java.math.BigDecimal ZZ4887XSumCant ;
   private java.math.BigDecimal ZZ4883XCantidad ;
   private java.math.BigDecimal ZZ10744XCantSum ;
   private java.math.BigDecimal ZO10744XCantSum ;
   private java.math.BigDecimal GXt_decimal11 ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal ZV32Tot_k ;
   private java.math.BigDecimal Z4906XTotCant ;
   private java.math.BigDecimal ZV38VarAux1 ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z4885XUnidad ;
   private String Z9791XNPda ;
   private String Z9788XNEstilo ;
   private String Z4893XMaqPdas ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtXCantidad_Internalname ;
   private String sGXsfl_70_idx="0001" ;
   private String edtXLinMan_Title ;
   private String edtXLinMan_Internalname ;
   private String edtXPdasNum_Title ;
   private String edtXPdasNum_Internalname ;
   private String edtXCantPdas_Title ;
   private String edtXCantPdas_Internalname ;
   private String edtXPzasPdas_Title ;
   private String edtXPzasPdas_Internalname ;
   private String edtXNEstilo_Internalname ;
   private String edtXNPda_Internalname ;
   private String edtXNPda_Title ;
   private String edtXNEstilo_Title ;
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
   private String edtXDisCod_Internalname ;
   private String edtXDisCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXUltLin_Internalname ;
   private String edtXUltLin_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXSumCant_Internalname ;
   private String edtXSumCant_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXSumPzas_Internalname ;
   private String edtXSumPzas_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtXCantidad_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtXUnidad_Internalname ;
   private String A4885XUnidad ;
   private String edtXUnidad_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXPiezas_Internalname ;
   private String edtXPiezas_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXCantSum_Internalname ;
   private String edtXCantSum_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtXPzsSum_Internalname ;
   private String edtXPzsSum_Jsonclick ;
   private String sMode722 ;
   private String edtavnRcdDeleted_722_Internalname ;
   private String edtXMaqPdas_Internalname ;
   private String edtXTotCant_Internalname ;
   private String edtXTotPzas_Internalname ;
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
   private String AV44Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode721 ;
   private String GXCCtl ;
   private String A4893XMaqPdas ;
   private String A9788XNEstilo ;
   private String A9791XNPda ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String AV30Station ;
   private String GXv_char2[] ;
   private String AV29EmprNom ;
   private String AV8UsurCod ;
   private String AV10Lit1 ;
   private String AV31Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV28Lit9 ;
   private String AV12Lit11 ;
   private String AV11Lit10 ;
   private String AV27Lit8 ;
   private String AV13Lit12 ;
   private String AV34Lit100 ;
   private String AV35Discolnom ;
   private String GXv_char3[] ;
   private String AV40Lit101 ;
   private String AV41Lit102 ;
   private String GXt_char1 ;
   private String E9791XNPda ;
   private String E9788XNEstilo ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_722_Jsonclick ;
   private String edtXLinMan_Jsonclick ;
   private String edtXPdasNum_Jsonclick ;
   private String edtXCantPdas_Jsonclick ;
   private String edtXPzasPdas_Jsonclick ;
   private String edtXMaqPdas_Jsonclick ;
   private String edtXTotCant_Jsonclick ;
   private String edtXTotPzas_Jsonclick ;
   private String edtXNEstilo_Jsonclick ;
   private String edtXNPda_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9791XNPda ;
   private String i9788XNEstilo ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ4885XUnidad ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4890XPdasNum ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n4886XUltLin ;
   private boolean n4883XCantidad ;
   private boolean n4885XUnidad ;
   private boolean n4884XPiezas ;
   private boolean returnInSub ;
   private boolean n9791XNPda ;
   private boolean n9788XNEstilo ;
   private boolean n4891XCantPdas ;
   private boolean n4892XPzasPdas ;
   private boolean n4893XMaqPdas ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00N56_A396EmprCod ;
   private java.math.BigDecimal[] T00N58_A10744XCantSum ;
   private short[] T00N58_A10745XPzsSum ;
   private int[] T00N510_A4882XDisCod ;
   private short[] T00N510_A4886XUltLin ;
   private boolean[] T00N510_n4886XUltLin ;
   private java.math.BigDecimal[] T00N510_A4883XCantidad ;
   private boolean[] T00N510_n4883XCantidad ;
   private String[] T00N510_A4885XUnidad ;
   private boolean[] T00N510_n4885XUnidad ;
   private short[] T00N510_A4884XPiezas ;
   private boolean[] T00N510_n4884XPiezas ;
   private String[] T00N510_A396EmprCod ;
   private java.math.BigDecimal[] T00N510_A10744XCantSum ;
   private short[] T00N510_A10745XPzsSum ;
   private String[] T00N511_A396EmprCod ;
   private int[] T00N511_A4882XDisCod ;
   private int[] T00N55_A4882XDisCod ;
   private short[] T00N55_A4886XUltLin ;
   private boolean[] T00N55_n4886XUltLin ;
   private java.math.BigDecimal[] T00N55_A4883XCantidad ;
   private boolean[] T00N55_n4883XCantidad ;
   private String[] T00N55_A4885XUnidad ;
   private boolean[] T00N55_n4885XUnidad ;
   private short[] T00N55_A4884XPiezas ;
   private boolean[] T00N55_n4884XPiezas ;
   private String[] T00N55_A396EmprCod ;
   private String[] T00N512_A396EmprCod ;
   private int[] T00N512_A4882XDisCod ;
   private String[] T00N513_A396EmprCod ;
   private int[] T00N513_A4882XDisCod ;
   private int[] T00N54_A4882XDisCod ;
   private short[] T00N54_A4886XUltLin ;
   private boolean[] T00N54_n4886XUltLin ;
   private java.math.BigDecimal[] T00N54_A4883XCantidad ;
   private boolean[] T00N54_n4883XCantidad ;
   private String[] T00N54_A4885XUnidad ;
   private boolean[] T00N54_n4885XUnidad ;
   private short[] T00N54_A4884XPiezas ;
   private boolean[] T00N54_n4884XPiezas ;
   private String[] T00N54_A396EmprCod ;
   private String[] T00N517_A396EmprCod ;
   private int[] T00N517_A4882XDisCod ;
   private short[] T00N517_A4889XLinMan ;
   private int[] T00N517_A9783XNRecep ;
   private String[] T00N519_A396EmprCod ;
   private int[] T00N519_A4882XDisCod ;
   private String[] T00N520_A396EmprCod ;
   private int[] T00N520_A4882XDisCod ;
   private short[] T00N520_A4889XLinMan ;
   private java.math.BigDecimal[] T00N520_A4891XCantPdas ;
   private boolean[] T00N520_n4891XCantPdas ;
   private String[] T00N520_A9791XNPda ;
   private boolean[] T00N520_n9791XNPda ;
   private String[] T00N520_A9788XNEstilo ;
   private boolean[] T00N520_n9788XNEstilo ;
   private short[] T00N520_A4890XPdasNum ;
   private boolean[] T00N520_n4890XPdasNum ;
   private short[] T00N520_A4892XPzasPdas ;
   private boolean[] T00N520_n4892XPzasPdas ;
   private String[] T00N520_A4893XMaqPdas ;
   private boolean[] T00N520_n4893XMaqPdas ;
   private String[] T00N521_A396EmprCod ;
   private int[] T00N521_A4882XDisCod ;
   private short[] T00N521_A4889XLinMan ;
   private String[] T00N53_A396EmprCod ;
   private int[] T00N53_A4882XDisCod ;
   private short[] T00N53_A4889XLinMan ;
   private java.math.BigDecimal[] T00N53_A4891XCantPdas ;
   private boolean[] T00N53_n4891XCantPdas ;
   private String[] T00N53_A9791XNPda ;
   private boolean[] T00N53_n9791XNPda ;
   private String[] T00N53_A9788XNEstilo ;
   private boolean[] T00N53_n9788XNEstilo ;
   private short[] T00N53_A4890XPdasNum ;
   private boolean[] T00N53_n4890XPdasNum ;
   private short[] T00N53_A4892XPzasPdas ;
   private boolean[] T00N53_n4892XPzasPdas ;
   private String[] T00N53_A4893XMaqPdas ;
   private boolean[] T00N53_n4893XMaqPdas ;
   private String[] T00N52_A396EmprCod ;
   private int[] T00N52_A4882XDisCod ;
   private short[] T00N52_A4889XLinMan ;
   private java.math.BigDecimal[] T00N52_A4891XCantPdas ;
   private boolean[] T00N52_n4891XCantPdas ;
   private String[] T00N52_A9791XNPda ;
   private boolean[] T00N52_n9791XNPda ;
   private String[] T00N52_A9788XNEstilo ;
   private boolean[] T00N52_n9788XNEstilo ;
   private short[] T00N52_A4890XPdasNum ;
   private boolean[] T00N52_n4890XPdasNum ;
   private short[] T00N52_A4892XPzasPdas ;
   private boolean[] T00N52_n4892XPzasPdas ;
   private String[] T00N52_A4893XMaqPdas ;
   private boolean[] T00N52_n4893XMaqPdas ;
   private String[] T00N525_A396EmprCod ;
   private int[] T00N525_A4882XDisCod ;
   private short[] T00N525_A4889XLinMan ;
   private int[] T00N525_A9783XNRecep ;
   private String[] T00N526_A396EmprCod ;
   private int[] T00N526_A4882XDisCod ;
   private short[] T00N526_A4889XLinMan ;
   private String[] T00N527_A396EmprCod ;
   private java.math.BigDecimal[] T00N529_A10744XCantSum ;
   private short[] T00N529_A10745XPzsSum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txgehd2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txgehd2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txgehd2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txgehd2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txgehd2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00N52", "SELECT EmprCod, XDisCod, XLinMan, XCantPdas, XNPda, XNEstilo, XPdasNum, XPzasPdas, XMaqPdas FROM TXPXGEHD2 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ?  FOR UPDATE OF XCantPdas, XNPda, XNEstilo, XPdasNum, XPzasPdas, XMaqPdas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00N53", "SELECT EmprCod, XDisCod, XLinMan, XCantPdas, XNPda, XNEstilo, XPdasNum, XPzasPdas, XMaqPdas FROM TXPXGEHD2 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00N54", "SELECT XDisCod, XUltLin, XCantidad, XUnidad, XPiezas, EmprCod FROM TXPXGEHD1 WHERE EmprCod = ? AND XDisCod = ?  FOR UPDATE OF XUltLin, XCantidad, XUnidad, XPiezas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N55", "SELECT XDisCod, XUltLin, XCantidad, XUnidad, XPiezas, EmprCod FROM TXPXGEHD1 WHERE EmprCod = ? AND XDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N56", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N58", "SELECT COALESCE( T1.XCantSum, 0) AS XCantSum, COALESCE( T1.XPzsSum, 0) AS XPzsSum FROM (SELECT SUM(( COALESCE( XCantPdas, 0) * CAST(COALESCE( XPdasNum, 0) AS NUMERIC(19,10)))) AS XCantSum, EmprCod, XDisCod, SUM(( COALESCE( XPzasPdas, 0) * CAST(COALESCE( XPdasNum, 0) AS NUMERIC(14,10)))) AS XPzsSum FROM TXPXGEHD2 GROUP BY EmprCod, XDisCod ) T1 WHERE T1.EmprCod = ? AND T1.XDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N510", "SELECT /*+ FIRST_ROWS(1) */ TM1.XDisCod, TM1.XUltLin, TM1.XCantidad, TM1.XUnidad, TM1.XPiezas, TM1.EmprCod, COALESCE( T2.XCantSum, 0) AS XCantSum, COALESCE( T2.XPzsSum, 0) AS XPzsSum FROM (TXPXGEHD1 TM1 LEFT JOIN (SELECT SUM(( COALESCE( XCantPdas, 0) * CAST(COALESCE( XPdasNum, 0) AS NUMERIC(19,10)))) AS XCantSum, EmprCod, XDisCod, SUM(( COALESCE( XPzasPdas, 0) * CAST(COALESCE( XPdasNum, 0) AS NUMERIC(14,10)))) AS XPzsSum FROM TXPXGEHD2 GROUP BY EmprCod, XDisCod ) T2 ON T2.EmprCod = TM1.EmprCod AND T2.XDisCod = TM1.XDisCod) WHERE TM1.EmprCod = ? and TM1.XDisCod = ? ORDER BY TM1.EmprCod, TM1.XDisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N511", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, XDisCod FROM TXPXGEHD1 WHERE EmprCod = ? AND XDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N512", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XDisCod FROM TXPXGEHD1 WHERE EmprCod = ? and XDisCod = ? ORDER BY EmprCod, XDisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N513", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XDisCod FROM TXPXGEHD1 WHERE EmprCod = ? and XDisCod = ? ORDER BY EmprCod DESC, XDisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00N514", "INSERT INTO TXPXGEHD1(XDisCod, XUltLin, XCantidad, XUnidad, XPiezas, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXGEHD1")
         ,new UpdateCursor("T00N515", "UPDATE TXPXGEHD1 SET XUltLin=?, XCantidad=?, XUnidad=?, XPiezas=?  WHERE EmprCod = ? AND XDisCod = ?", GX_NOMASK, "TXPXGEHD1")
         ,new UpdateCursor("T00N516", "DELETE FROM TXPXGEHD1  WHERE EmprCod = ? AND XDisCod = ?", GX_NOMASK, "TXPXGEHD1")
         ,new ForEachCursor("T00N517", "SELECT * FROM (SELECT EmprCod, XDisCod, XLinMan, XNRecep FROM TXPXGEHD3 WHERE EmprCod = ? AND XDisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00N518", "UPDATE TXPXGEHD1 SET XUltLin=?  WHERE EmprCod = ? AND XDisCod = ?", GX_NOMASK, "TXPXGEHD1")
         ,new ForEachCursor("T00N519", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, XDisCod FROM TXPXGEHD1 WHERE EmprCod = ? and XDisCod = ? ORDER BY EmprCod, XDisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N520", "SELECT EmprCod, XDisCod, XLinMan, XCantPdas, XNPda, XNEstilo, XPdasNum, XPzasPdas, XMaqPdas FROM TXPXGEHD2 WHERE EmprCod = ? and XDisCod = ? and XLinMan = ? ORDER BY EmprCod, XDisCod, XLinMan ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00N521", "SELECT EmprCod, XDisCod, XLinMan FROM TXPXGEHD2 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00N522", "INSERT INTO TXPXGEHD2(EmprCod, XDisCod, XLinMan, XCantPdas, XNPda, XNEstilo, XPdasNum, XPzasPdas, XMaqPdas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXGEHD2")
         ,new UpdateCursor("T00N523", "UPDATE TXPXGEHD2 SET XCantPdas=?, XNPda=?, XNEstilo=?, XPdasNum=?, XPzasPdas=?, XMaqPdas=?  WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ?", GX_NOMASK, "TXPXGEHD2")
         ,new UpdateCursor("T00N524", "DELETE FROM TXPXGEHD2  WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ?", GX_NOMASK, "TXPXGEHD2")
         ,new ForEachCursor("T00N525", "SELECT * FROM (SELECT EmprCod, XDisCod, XLinMan, XNRecep FROM TXPXGEHD3 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00N526", "SELECT EmprCod, XDisCod, XLinMan FROM TXPXGEHD2 WHERE EmprCod = ? and XDisCod = ? ORDER BY EmprCod, XDisCod, XLinMan ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00N527", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00N529", "SELECT COALESCE( T1.XCantSum, 0) AS XCantSum, COALESCE( T1.XPzsSum, 0) AS XPzsSum FROM (SELECT SUM(( COALESCE( XCantPdas, 0) * CAST(COALESCE( XPdasNum, 0) AS NUMERIC(19,10)))) AS XCantSum, EmprCod, XDisCod, SUM(( COALESCE( XPzasPdas, 0) * CAST(COALESCE( XPdasNum, 0) AS NUMERIC(14,10)))) AS XPzsSum FROM TXPXGEHD2 GROUP BY EmprCod, XDisCod ) T1 WHERE T1.EmprCod = ? AND T1.XDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[11])[0] = rslt.getShort(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               stmt.setString(6, (String)parms[9], 3);
               return;
            case 11 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 6);
               }
               return;
            case 19 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 6);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

