package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqcos_impl extends GXDataArea
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
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
            A606MaqDsc = httpContext.GetPar( "MaqDsc") ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A606MaqDsc, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Costes Maquina por Año/Mes", ""), (short)(0)) ;
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
      edtMqCAdCt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAgua_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAmo_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCEner_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCGas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMoi_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCTotal_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAdCt_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Width), 9, 0), !bGXsfl_40_Refreshing);
      edtMqCAgua_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Width), 9, 0), !bGXsfl_40_Refreshing);
      edtMqCAmo_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Width), 9, 0), !bGXsfl_40_Refreshing);
      edtMqCEner_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Width), 9, 0), !bGXsfl_40_Refreshing);
      edtMqCGas_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Width), 9, 0), !bGXsfl_40_Refreshing);
      edtMqCMod_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Width), 9, 0), !bGXsfl_40_Refreshing);
      edtMqCMoi_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Width), 9, 0), !bGXsfl_40_Refreshing);
      edtMqCTotal_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Width), 9, 0), !bGXsfl_40_Refreshing);
      edtMqCMin_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMin_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Width), 9, 0), !bGXsfl_40_Refreshing);
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
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

   public tmaqcos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqcos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqcos_impl.class ));
   }

   public tmaqcos_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_CostesBasicos\\TMAQCOS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMAQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\TMAQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMAQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\TMAQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMAQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMAQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\TMAQCOS.htm");
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
         nBlankRcdCount1913 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1913 = (short)(1) ;
            scanStart1W01913( ) ;
            while ( RcdFound1913 != 0 )
            {
               init_level_properties1913( ) ;
               getByPrimaryKey1W01913( ) ;
               addRow1W01913( ) ;
               scanNext1W01913( ) ;
            }
            scanEnd1W01913( ) ;
            nBlankRcdCount1913 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1W01913( ) ;
         standaloneModal1W01913( ) ;
         sMode1913 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1W01913( ) ;
            edtavnRcdDeleted_1913_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1913_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1913_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1913_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCAnyo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCANYO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAnyo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAnyo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMES_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMes_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCMin_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMIN_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCMin_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMIN_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Width), 9, 0), !bGXsfl_40_Refreshing);
            edtMqCMod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCMod_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOD_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCMod_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOD_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Width), 9, 0), !bGXsfl_40_Refreshing);
            edtMqCMoi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOI_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCMoi_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOI_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCMoi_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOI_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Width), 9, 0), !bGXsfl_40_Refreshing);
            edtMqCEner_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCENER_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCEner_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCENER_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCEner_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCENER_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Width), 9, 0), !bGXsfl_40_Refreshing);
            edtMqCGas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCGAS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCGas_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCGAS_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCGas_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCGAS_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Width), 9, 0), !bGXsfl_40_Refreshing);
            edtMqCAgua_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAGUA_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCAgua_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAGUA_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCAgua_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAGUA_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Width), 9, 0), !bGXsfl_40_Refreshing);
            edtMqCAdCt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCADCT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCAdCt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCADCT_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCAdCt_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCADCT_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Width), 9, 0), !bGXsfl_40_Refreshing);
            edtMqCAmo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAMO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCAmo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAMO_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCAmo_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAMO_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Width), 9, 0), !bGXsfl_40_Refreshing);
            edtMqCTotal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCTOTAL_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCTotal_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCTOTAL_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Visible), 5, 0), !bGXsfl_40_Refreshing);
            edtMqCTotal_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCTOTAL_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Width), 9, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1913 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1W01913( ) ;
            }
            sendRow1W01913( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1913 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1913 = (short)(5) ;
         nRcdExists_1913 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1W01913( ) ;
            while ( RcdFound1913 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401913( ) ;
               init_level_properties1913( ) ;
               standaloneNotModal1W01913( ) ;
               getByPrimaryKey1W01913( ) ;
               standaloneModal1W01913( ) ;
               addRow1W01913( ) ;
               scanNext1W01913( ) ;
            }
            scanEnd1W01913( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1913 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401913( ) ;
      initAll1W01913( ) ;
      init_level_properties1913( ) ;
      nRcdExists_1913 = (short)(0) ;
      nIsMod_1913 = (short)(0) ;
      nRcdDeleted_1913 = (short)(0) ;
      nBlankRcdCount1913 = (short)(nBlankRcdUsr1913+nBlankRcdCount1913) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1913 > 0 )
      {
         standaloneNotModal1W01913( ) ;
         standaloneModal1W01913( ) ;
         addRow1W01913( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMqCAnyo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1913 = (short)(nBlankRcdCount1913-1) ;
      }
      Gx_mode = sMode1913 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMAQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_CostesBasicos\\TMAQCOS.htm");
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
      e111W02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A606MaqDsc, ""))));
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
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
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
                        e111W02 ();
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
            initAll1W065( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1913_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1913_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1W065( ) ;
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

   public void confirm_1W00( )
   {
      beforeValidate1W065( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1W065( ) ;
         }
         else
         {
            checkExtendedTable1W065( ) ;
            if ( AnyError == 0 )
            {
               zm1W065( 7) ;
            }
            closeExtendedTableCursors1W065( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode65 = Gx_mode ;
         confirm_1W01913( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode65 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1W00( ) ;
      }
   }

   public void confirm_1W01913( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1W01913( ) ;
         if ( ( nRcdExists_1913 != 0 ) || ( nIsMod_1913 != 0 ) )
         {
            getKey1W01913( ) ;
            if ( ( nRcdExists_1913 == 0 ) && ( nRcdDeleted_1913 == 0 ) )
            {
               if ( RcdFound1913 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1W01913( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1W01913( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1W01913( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MQCANYO_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMqCAnyo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1913 != 0 )
               {
                  if ( nRcdDeleted_1913 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1W01913( ) ;
                     load1W01913( ) ;
                     beforeValidate1W01913( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1W01913( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1913 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1W01913( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1W01913( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1W01913( ) ;
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
                  if ( nRcdDeleted_1913 == 0 )
                  {
                     GXCCtl = "MQCANYO_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMqCAnyo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1913_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCAnyo_Internalname, GXutil.ltrim( localUtil.ntoc( A14529MqCAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCMes_Internalname, GXutil.ltrim( localUtil.ntoc( A14530MqCMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCMin_Internalname, GXutil.ltrim( localUtil.ntoc( A14534MqCMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCMod_Internalname, GXutil.ltrim( localUtil.ntoc( A14535MqCMod, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCMoi_Internalname, GXutil.ltrim( localUtil.ntoc( A14536MqCMoi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCEner_Internalname, GXutil.ltrim( localUtil.ntoc( A14537MqCEner, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCGas_Internalname, GXutil.ltrim( localUtil.ntoc( A14538MqCGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCAgua_Internalname, GXutil.ltrim( localUtil.ntoc( A14539MqCAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCAdCt_Internalname, GXutil.ltrim( localUtil.ntoc( A14540MqCAdCt, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCAmo_Internalname, GXutil.ltrim( localUtil.ntoc( A14541MqCAmo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCTotal_Internalname, GXutil.ltrim( localUtil.ntoc( A14542MqCTotal, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14529MqCAnyo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14529MqCAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14530MqCMes_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14530MqCMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14534MqCMin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14534MqCMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14535MqCMod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14535MqCMod, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14536MqCMoi_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14536MqCMoi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14537MqCEner_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14537MqCEner, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14538MqCGas_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14538MqCGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14539MqCAgua_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14539MqCAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14540MqCAdCt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14540MqCAdCt, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14541MqCAmo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14541MqCAmo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1913_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1913_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1913_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1913 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1913_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1913_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCANYO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAnyo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMES_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMIN_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMIN_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOD_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOD_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOI_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOI_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCENER_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCENER_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCENER_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCGAS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCGAS_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCGAS_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAGUA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAGUA_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAGUA_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCADCT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCADCT_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCADCT_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAMO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAMO_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAMO_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCTOTAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCTOTAL_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCTOTAL_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Width, (byte)(9), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1W00( )
   {
   }

   public void e111W02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmaqcos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tmaqcos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmaqcos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaqcos_impl.this.A396EmprCod = GXv_char2[0] ;
      tmaqcos_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmaqcos_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV33TasasEstandar ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TASSTD", ""), GXv_int6) ;
      tmaqcos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33TasasEstandar = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TasasEstandar", GXutil.str( AV33TasasEstandar, 1, 0));
      edtMqCAdCt_Visible = AV33TasasEstandar ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAgua_Visible = AV33TasasEstandar ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAmo_Visible = AV33TasasEstandar ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCEner_Visible = AV33TasasEstandar ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCGas_Visible = AV33TasasEstandar ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMod_Visible = AV33TasasEstandar ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMoi_Visible = AV33TasasEstandar ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Visible), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCTotal_Visible = AV33TasasEstandar ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Visible), 5, 0), !bGXsfl_40_Refreshing);
      if ( AV33TasasEstandar == 0 )
      {
         edtMqCAdCt_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Width), 9, 0), !bGXsfl_40_Refreshing);
         edtMqCAgua_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Width), 9, 0), !bGXsfl_40_Refreshing);
         edtMqCAmo_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Width), 9, 0), !bGXsfl_40_Refreshing);
         edtMqCEner_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Width), 9, 0), !bGXsfl_40_Refreshing);
         edtMqCGas_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Width), 9, 0), !bGXsfl_40_Refreshing);
         edtMqCMod_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Width), 9, 0), !bGXsfl_40_Refreshing);
         edtMqCMoi_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Width), 9, 0), !bGXsfl_40_Refreshing);
         edtMqCTotal_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Width), 9, 0), !bGXsfl_40_Refreshing);
         edtMqCMin_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Visible), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtMqCMin_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Width), 9, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void zm1W065( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -6 )
      {
         Z602MaqCod = A602MaqCod ;
         Z606MaqDsc = A606MaqDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "CostesBasicos.TMAQCOS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      /* Using cursor T01W06 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01W06_A407EmprNom[0] ;
      n407EmprNom = T01W06_n407EmprNom[0] ;
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

   public void load1W065( )
   {
      /* Using cursor T01W07 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n606MaqDsc), A606MaqDsc});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A407EmprNom = T01W07_A407EmprNom[0] ;
         n407EmprNom = T01W07_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1W065( -6) ;
      }
      pr_default.close(5);
      onLoadActions1W065( ) ;
   }

   public void onLoadActions1W065( )
   {
   }

   public void checkExtendedTable1W065( )
   {
      nIsDirty_65 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1W065( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1W065( )
   {
      /* Using cursor T01W08 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W05 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01W05_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01W05_A606MaqDsc[0], A606MaqDsc) == 0 ) && ( GXutil.strcmp(T01W05_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1W065( 6) ;
         RcdFound65 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1W065( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKey1W065( ) ;
         }
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKey1W065( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1W065( ) ;
      if ( RcdFound65 == 0 )
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
      RcdFound65 = (short)(0) ;
      /* Using cursor T01W09 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n606MaqDsc), A606MaqDsc});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01W09_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W09_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01W09_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01W09_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W09_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01W09_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T01W010 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n606MaqDsc), A606MaqDsc});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01W010_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W010_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01W010_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01W010_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W010_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01W010_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W065( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1W065( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1W065( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1W065( ) ;
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
                  insert1W065( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
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
      getKey1W065( ) ;
      if ( RcdFound65 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "costesbasicos.tmaqcos");
   }

   public void insert_check( )
   {
      confirm_1W00( ) ;
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
      if ( RcdFound65 == 0 )
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
      scanStart1W065( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1W065( ) ;
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
      if ( RcdFound65 == 0 )
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
      if ( RcdFound65 == 0 )
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
      scanStart1W065( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound65 != 0 )
         {
            scanNext1W065( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1W065( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1W065( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQUIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W065( )
   {
      beforeValidate1W065( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W065( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W065( 0) ;
         checkOptimisticConcurrency1W065( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W065( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W065( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W011 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n606MaqDsc), A606MaqDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
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
                        processLevel1W065( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1W00( ) ;
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
            load1W065( ) ;
         }
         endLevel1W065( ) ;
      }
      closeExtendedTableCursors1W065( ) ;
   }

   public void update1W065( )
   {
      beforeValidate1W065( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W065( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W065( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W065( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W065( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W012 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n606MaqDsc), A606MaqDsc, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W065( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1W065( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1W00( ) ;
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
         endLevel1W065( ) ;
      }
      closeExtendedTableCursors1W065( ) ;
   }

   public void deferredUpdate1W065( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1W065( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W065( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W065( ) ;
         afterConfirm1W065( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W065( ) ;
            if ( AnyError == 0 )
            {
               scanStart1W01913( ) ;
               while ( RcdFound1913 != 0 )
               {
                  getByPrimaryKey1W01913( ) ;
                  delete1W01913( ) ;
                  scanNext1W01913( ) ;
               }
               scanEnd1W01913( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W013 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound65 == 0 )
                        {
                           initAll1W065( ) ;
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
                        resetCaption1W00( ) ;
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W065( ) ;
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W065( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01W014 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01W015 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01W016 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLNMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01W017 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01W018 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Recetas Lavados Maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01W019 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01W020 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01W021 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01W022 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01W023 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Uso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01W024 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01W025 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Documentos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01W026 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MQDDOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01W027 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATF1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01W028 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01W029 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFABS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01W030 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MSolicitudes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01W031 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MPreventivo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01W032 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01W033 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01W034 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONVPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01W035 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01W036 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTNQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01W037 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARTM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01W038 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01W039 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQGR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01W040 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Líneas Costes Retroalimentados", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01W041 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PlaMaq", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01W042 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01W043 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01W044 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01W045 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01W046 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01W047 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parámetros por maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01W048 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01W049 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPLATI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01W050 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQMAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01W051 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01W052 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01W053 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01W054 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMHPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01W055 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01W056 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQHNP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01W057 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01W058 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01W059 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01W060 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01W061 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01W062 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
      }
   }

   public void processNestedLevel1W01913( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1W01913( ) ;
         if ( ( nRcdExists_1913 != 0 ) || ( nIsMod_1913 != 0 ) )
         {
            standaloneNotModal1W01913( ) ;
            getKey1W01913( ) ;
            if ( ( nRcdExists_1913 == 0 ) && ( nRcdDeleted_1913 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1W01913( ) ;
            }
            else
            {
               if ( RcdFound1913 != 0 )
               {
                  if ( ( nRcdDeleted_1913 != 0 ) && ( nRcdExists_1913 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1W01913( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1913 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1W01913( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1913 == 0 )
                  {
                     GXCCtl = "MQCANYO_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMqCAnyo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1913_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCAnyo_Internalname, GXutil.ltrim( localUtil.ntoc( A14529MqCAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCMes_Internalname, GXutil.ltrim( localUtil.ntoc( A14530MqCMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCMin_Internalname, GXutil.ltrim( localUtil.ntoc( A14534MqCMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCMod_Internalname, GXutil.ltrim( localUtil.ntoc( A14535MqCMod, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCMoi_Internalname, GXutil.ltrim( localUtil.ntoc( A14536MqCMoi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCEner_Internalname, GXutil.ltrim( localUtil.ntoc( A14537MqCEner, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCGas_Internalname, GXutil.ltrim( localUtil.ntoc( A14538MqCGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCAgua_Internalname, GXutil.ltrim( localUtil.ntoc( A14539MqCAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCAdCt_Internalname, GXutil.ltrim( localUtil.ntoc( A14540MqCAdCt, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCAmo_Internalname, GXutil.ltrim( localUtil.ntoc( A14541MqCAmo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMqCTotal_Internalname, GXutil.ltrim( localUtil.ntoc( A14542MqCTotal, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14529MqCAnyo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14529MqCAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14530MqCMes_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14530MqCMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14534MqCMin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14534MqCMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14535MqCMod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14535MqCMod, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14536MqCMoi_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14536MqCMoi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14537MqCEner_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14537MqCEner, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14538MqCGas_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14538MqCGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14539MqCAgua_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14539MqCAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14540MqCAdCt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14540MqCAdCt, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14541MqCAmo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z14541MqCAmo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1913_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1913_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1913_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1913 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1913_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1913_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCANYO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAnyo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMES_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMIN_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMIN_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOD_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOD_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOI_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCMOI_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCENER_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCENER_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCENER_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCGAS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCGAS_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCGAS_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAGUA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAGUA_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAGUA_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCADCT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCADCT_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCADCT_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAMO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAMO_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCAMO_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCTOTAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCTOTAL_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQCTOTAL_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Width, (byte)(9), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1W01913( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1913 = (short)(0) ;
      nIsMod_1913 = (short)(0) ;
      nRcdDeleted_1913 = (short)(0) ;
   }

   public void processLevel1W065( )
   {
      /* Save parent mode. */
      sMode65 = Gx_mode ;
      processNestedLevel1W01913( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1W065( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W065( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "costesbasicos.tmaqcos");
         if ( AnyError == 0 )
         {
            confirmValues1W00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "costesbasicos.tmaqcos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W065( )
   {
      /* Scan By routine */
      /* Using cursor T01W063 */
      pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n606MaqDsc), A606MaqDsc});
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W065( )
   {
      /* Scan next routine */
      pr_default.readNext(61);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
   }

   public void scanEnd1W065( )
   {
      pr_default.close(61);
   }

   public void afterConfirm1W065( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W065( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W065( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W065( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W065( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W065( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W065( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
   }

   public void zm1W01913( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14534MqCMin = T01W03_A14534MqCMin[0] ;
            Z14535MqCMod = T01W03_A14535MqCMod[0] ;
            Z14536MqCMoi = T01W03_A14536MqCMoi[0] ;
            Z14537MqCEner = T01W03_A14537MqCEner[0] ;
            Z14538MqCGas = T01W03_A14538MqCGas[0] ;
            Z14539MqCAgua = T01W03_A14539MqCAgua[0] ;
            Z14540MqCAdCt = T01W03_A14540MqCAdCt[0] ;
            Z14541MqCAmo = T01W03_A14541MqCAmo[0] ;
         }
         else
         {
            Z14534MqCMin = A14534MqCMin ;
            Z14535MqCMod = A14535MqCMod ;
            Z14536MqCMoi = A14536MqCMoi ;
            Z14537MqCEner = A14537MqCEner ;
            Z14538MqCGas = A14538MqCGas ;
            Z14539MqCAgua = A14539MqCAgua ;
            Z14540MqCAdCt = A14540MqCAdCt ;
            Z14541MqCAmo = A14541MqCAmo ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z602MaqCod = A602MaqCod ;
         Z14529MqCAnyo = A14529MqCAnyo ;
         Z14530MqCMes = A14530MqCMes ;
         Z14534MqCMin = A14534MqCMin ;
         Z14535MqCMod = A14535MqCMod ;
         Z14536MqCMoi = A14536MqCMoi ;
         Z14537MqCEner = A14537MqCEner ;
         Z14538MqCGas = A14538MqCGas ;
         Z14539MqCAgua = A14539MqCAgua ;
         Z14540MqCAdCt = A14540MqCAdCt ;
         Z14541MqCAmo = A14541MqCAmo ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1W01913( )
   {
   }

   public void standaloneModal1W01913( )
   {
      if ( isIns( )  && (0==A14529MqCAnyo) && ( Gx_BScreen == 0 ) )
      {
         A14529MqCAnyo = (short)(GXutil.year( Gx_date)) ;
      }
      else
      {
         if ( isIns( )  && (0==A14529MqCAnyo) && ( Gx_BScreen == 0 ) )
         {
            A14529MqCAnyo = E14529MqCAnyo ;
         }
      }
      if ( isIns( )  && (0==A14530MqCMes) && ( Gx_BScreen == 0 ) )
      {
         A14530MqCMes = (byte)(GXutil.month( Gx_date)) ;
      }
      else
      {
         if ( isIns( )  && (0==A14530MqCMes) && ( Gx_BScreen == 0 ) )
         {
            A14530MqCMes = E14530MqCMes ;
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMqCAnyo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCAnyo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAnyo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtMqCAnyo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCAnyo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAnyo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMqCMes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMes_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtMqCMes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMqCMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMes_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1W01913( )
   {
      /* Using cursor T01W064 */
      pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound1913 = (short)(1) ;
         A14534MqCMin = T01W064_A14534MqCMin[0] ;
         n14534MqCMin = T01W064_n14534MqCMin[0] ;
         A14535MqCMod = T01W064_A14535MqCMod[0] ;
         n14535MqCMod = T01W064_n14535MqCMod[0] ;
         A14536MqCMoi = T01W064_A14536MqCMoi[0] ;
         n14536MqCMoi = T01W064_n14536MqCMoi[0] ;
         A14537MqCEner = T01W064_A14537MqCEner[0] ;
         n14537MqCEner = T01W064_n14537MqCEner[0] ;
         A14538MqCGas = T01W064_A14538MqCGas[0] ;
         n14538MqCGas = T01W064_n14538MqCGas[0] ;
         A14539MqCAgua = T01W064_A14539MqCAgua[0] ;
         n14539MqCAgua = T01W064_n14539MqCAgua[0] ;
         A14540MqCAdCt = T01W064_A14540MqCAdCt[0] ;
         n14540MqCAdCt = T01W064_n14540MqCAdCt[0] ;
         A14541MqCAmo = T01W064_A14541MqCAmo[0] ;
         n14541MqCAmo = T01W064_n14541MqCAmo[0] ;
         zm1W01913( -8) ;
      }
      pr_default.close(62);
      onLoadActions1W01913( ) ;
   }

   public void onLoadActions1W01913( )
   {
      A14542MqCTotal = A14540MqCAdCt.add(A14539MqCAgua).add(A14541MqCAmo).add(A14537MqCEner).add(A14538MqCGas).add(A14535MqCMod).add(A14536MqCMoi) ;
   }

   public void checkExtendedTable1W01913( )
   {
      nIsDirty_1913 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1W01913( ) ;
      if ( (0==A14529MqCAnyo) && true /* After */ )
      {
         GXCCtl = "MQCANYO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Año incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCAnyo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A14530MqCMes < 1 ) || ( A14530MqCMes > 12 ) && true /* After */ )
      {
         GXCCtl = "MQCMES_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Mes incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCMes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1913 = (short)(1) ;
      A14542MqCTotal = A14540MqCAdCt.add(A14539MqCAgua).add(A14541MqCAmo).add(A14537MqCEner).add(A14538MqCGas).add(A14535MqCMod).add(A14536MqCMoi) ;
   }

   public void closeExtendedTableCursors1W01913( )
   {
   }

   public void enableDisable1W01913( )
   {
   }

   public void getKey1W01913( )
   {
      /* Using cursor T01W065 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound1913 = (short)(1) ;
      }
      else
      {
         RcdFound1913 = (short)(0) ;
      }
      pr_default.close(63);
   }

   public void getByPrimaryKey1W01913( )
   {
      /* Using cursor T01W03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01W03_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01W03_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1W01913( 8) ;
         RcdFound1913 = (short)(1) ;
         initializeNonKey1W01913( ) ;
         A14529MqCAnyo = T01W03_A14529MqCAnyo[0] ;
         A14530MqCMes = T01W03_A14530MqCMes[0] ;
         A14534MqCMin = T01W03_A14534MqCMin[0] ;
         n14534MqCMin = T01W03_n14534MqCMin[0] ;
         A14535MqCMod = T01W03_A14535MqCMod[0] ;
         n14535MqCMod = T01W03_n14535MqCMod[0] ;
         A14536MqCMoi = T01W03_A14536MqCMoi[0] ;
         n14536MqCMoi = T01W03_n14536MqCMoi[0] ;
         A14537MqCEner = T01W03_A14537MqCEner[0] ;
         n14537MqCEner = T01W03_n14537MqCEner[0] ;
         A14538MqCGas = T01W03_A14538MqCGas[0] ;
         n14538MqCGas = T01W03_n14538MqCGas[0] ;
         A14539MqCAgua = T01W03_A14539MqCAgua[0] ;
         n14539MqCAgua = T01W03_n14539MqCAgua[0] ;
         A14540MqCAdCt = T01W03_A14540MqCAdCt[0] ;
         n14540MqCAdCt = T01W03_n14540MqCAdCt[0] ;
         A14541MqCAmo = T01W03_A14541MqCAmo[0] ;
         n14541MqCAmo = T01W03_n14541MqCAmo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z14529MqCAnyo = A14529MqCAnyo ;
         Z14530MqCMes = A14530MqCMes ;
         sMode1913 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1W01913( ) ;
         load1W01913( ) ;
         Gx_mode = sMode1913 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1913 = (short)(0) ;
         initializeNonKey1W01913( ) ;
         sMode1913 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1W01913( ) ;
         Gx_mode = sMode1913 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1W01913( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1W01913( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQCOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z14534MqCMin, T01W02_A14534MqCMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z14535MqCMod, T01W02_A14535MqCMod[0]) != 0 ) || ( DecimalUtil.compareTo(Z14536MqCMoi, T01W02_A14536MqCMoi[0]) != 0 ) || ( DecimalUtil.compareTo(Z14537MqCEner, T01W02_A14537MqCEner[0]) != 0 ) || ( DecimalUtil.compareTo(Z14538MqCGas, T01W02_A14538MqCGas[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14539MqCAgua, T01W02_A14539MqCAgua[0]) != 0 ) || ( DecimalUtil.compareTo(Z14540MqCAdCt, T01W02_A14540MqCAdCt[0]) != 0 ) || ( DecimalUtil.compareTo(Z14541MqCAmo, T01W02_A14541MqCAmo[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z14534MqCMin, T01W02_A14534MqCMin[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmaqcos:[seudo value changed for attri]"+"MqCMin");
               GXutil.writeLogRaw("Old: ",Z14534MqCMin);
               GXutil.writeLogRaw("Current: ",T01W02_A14534MqCMin[0]);
            }
            if ( DecimalUtil.compareTo(Z14535MqCMod, T01W02_A14535MqCMod[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmaqcos:[seudo value changed for attri]"+"MqCMod");
               GXutil.writeLogRaw("Old: ",Z14535MqCMod);
               GXutil.writeLogRaw("Current: ",T01W02_A14535MqCMod[0]);
            }
            if ( DecimalUtil.compareTo(Z14536MqCMoi, T01W02_A14536MqCMoi[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmaqcos:[seudo value changed for attri]"+"MqCMoi");
               GXutil.writeLogRaw("Old: ",Z14536MqCMoi);
               GXutil.writeLogRaw("Current: ",T01W02_A14536MqCMoi[0]);
            }
            if ( DecimalUtil.compareTo(Z14537MqCEner, T01W02_A14537MqCEner[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmaqcos:[seudo value changed for attri]"+"MqCEner");
               GXutil.writeLogRaw("Old: ",Z14537MqCEner);
               GXutil.writeLogRaw("Current: ",T01W02_A14537MqCEner[0]);
            }
            if ( DecimalUtil.compareTo(Z14538MqCGas, T01W02_A14538MqCGas[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmaqcos:[seudo value changed for attri]"+"MqCGas");
               GXutil.writeLogRaw("Old: ",Z14538MqCGas);
               GXutil.writeLogRaw("Current: ",T01W02_A14538MqCGas[0]);
            }
            if ( DecimalUtil.compareTo(Z14539MqCAgua, T01W02_A14539MqCAgua[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmaqcos:[seudo value changed for attri]"+"MqCAgua");
               GXutil.writeLogRaw("Old: ",Z14539MqCAgua);
               GXutil.writeLogRaw("Current: ",T01W02_A14539MqCAgua[0]);
            }
            if ( DecimalUtil.compareTo(Z14540MqCAdCt, T01W02_A14540MqCAdCt[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmaqcos:[seudo value changed for attri]"+"MqCAdCt");
               GXutil.writeLogRaw("Old: ",Z14540MqCAdCt);
               GXutil.writeLogRaw("Current: ",T01W02_A14540MqCAdCt[0]);
            }
            if ( DecimalUtil.compareTo(Z14541MqCAmo, T01W02_A14541MqCAmo[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmaqcos:[seudo value changed for attri]"+"MqCAmo");
               GXutil.writeLogRaw("Old: ",Z14541MqCAmo);
               GXutil.writeLogRaw("Current: ",T01W02_A14541MqCAmo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQCOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W01913( )
   {
      beforeValidate1W01913( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W01913( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W01913( 0) ;
         checkOptimisticConcurrency1W01913( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W01913( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W01913( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W066 */
                  pr_default.execute(64, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes), Boolean.valueOf(n14534MqCMin), A14534MqCMin, Boolean.valueOf(n14535MqCMod), A14535MqCMod, Boolean.valueOf(n14536MqCMoi), A14536MqCMoi, Boolean.valueOf(n14537MqCEner), A14537MqCEner, Boolean.valueOf(n14538MqCGas), A14538MqCGas, Boolean.valueOf(n14539MqCAgua), A14539MqCAgua, Boolean.valueOf(n14540MqCAdCt), A14540MqCAdCt, Boolean.valueOf(n14541MqCAmo), A14541MqCAmo, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQCOS");
                  if ( (pr_default.getStatus(64) == 1) )
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
                        E14530MqCMes = A14530MqCMes ;
                        E14529MqCAnyo = A14529MqCAnyo ;
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
            load1W01913( ) ;
         }
         endLevel1W01913( ) ;
      }
      closeExtendedTableCursors1W01913( ) ;
   }

   public void update1W01913( )
   {
      beforeValidate1W01913( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W01913( ) ;
      }
      if ( ( nIsMod_1913 != 0 ) || ( nIsDirty_1913 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1W01913( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1W01913( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1W01913( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01W067 */
                     pr_default.execute(65, new Object[] {Boolean.valueOf(n14534MqCMin), A14534MqCMin, Boolean.valueOf(n14535MqCMod), A14535MqCMod, Boolean.valueOf(n14536MqCMoi), A14536MqCMoi, Boolean.valueOf(n14537MqCEner), A14537MqCEner, Boolean.valueOf(n14538MqCGas), A14538MqCGas, Boolean.valueOf(n14539MqCAgua), A14539MqCAgua, Boolean.valueOf(n14540MqCAdCt), A14540MqCAdCt, Boolean.valueOf(n14541MqCAmo), A14541MqCAmo, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQCOS");
                     if ( (pr_default.getStatus(65) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQCOS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1W01913( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1W01913( ) ;
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
            endLevel1W01913( ) ;
         }
      }
      closeExtendedTableCursors1W01913( ) ;
   }

   public void deferredUpdate1W01913( )
   {
   }

   public void delete1W01913( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1W01913( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W01913( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W01913( ) ;
         afterConfirm1W01913( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W01913( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W068 */
               pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQCOS");
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
      sMode1913 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W01913( ) ;
      Gx_mode = sMode1913 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W01913( )
   {
      standaloneModal1W01913( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14542MqCTotal = A14540MqCAdCt.add(A14539MqCAgua).add(A14541MqCAmo).add(A14537MqCEner).add(A14538MqCGas).add(A14535MqCMod).add(A14536MqCMoi) ;
      }
   }

   public void endLevel1W01913( )
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

   public void scanStart1W01913( )
   {
      /* Scan By routine */
      /* Using cursor T01W069 */
      pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      RcdFound1913 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1913 = (short)(1) ;
         A14529MqCAnyo = T01W069_A14529MqCAnyo[0] ;
         A14530MqCMes = T01W069_A14530MqCMes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W01913( )
   {
      /* Scan next routine */
      pr_default.readNext(67);
      RcdFound1913 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1913 = (short)(1) ;
         A14529MqCAnyo = T01W069_A14529MqCAnyo[0] ;
         A14530MqCMes = T01W069_A14530MqCMes[0] ;
      }
   }

   public void scanEnd1W01913( )
   {
      pr_default.close(67);
   }

   public void afterConfirm1W01913( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1W01913( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W01913( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W01913( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W01913( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W01913( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W01913( )
   {
      edtMqCAnyo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAnyo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAnyo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMes_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCMoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCEner_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCGas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAgua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAdCt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAmo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCTotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1W01913( )
   {
   }

   public void send_integrity_lvl_hashes1W065( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A606MaqDsc, ""))));
   }

   public void subsflControlProps_401913( )
   {
      edtavnRcdDeleted_1913_Internalname = "vNRCDDELETED_1913_"+sGXsfl_40_idx ;
      edtMqCAnyo_Internalname = "MQCANYO_"+sGXsfl_40_idx ;
      edtMqCMes_Internalname = "MQCMES_"+sGXsfl_40_idx ;
      edtMqCMin_Internalname = "MQCMIN_"+sGXsfl_40_idx ;
      edtMqCMod_Internalname = "MQCMOD_"+sGXsfl_40_idx ;
      edtMqCMoi_Internalname = "MQCMOI_"+sGXsfl_40_idx ;
      edtMqCEner_Internalname = "MQCENER_"+sGXsfl_40_idx ;
      edtMqCGas_Internalname = "MQCGAS_"+sGXsfl_40_idx ;
      edtMqCAgua_Internalname = "MQCAGUA_"+sGXsfl_40_idx ;
      edtMqCAdCt_Internalname = "MQCADCT_"+sGXsfl_40_idx ;
      edtMqCAmo_Internalname = "MQCAMO_"+sGXsfl_40_idx ;
      edtMqCTotal_Internalname = "MQCTOTAL_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401913( )
   {
      edtavnRcdDeleted_1913_Internalname = "vNRCDDELETED_1913_"+sGXsfl_40_fel_idx ;
      edtMqCAnyo_Internalname = "MQCANYO_"+sGXsfl_40_fel_idx ;
      edtMqCMes_Internalname = "MQCMES_"+sGXsfl_40_fel_idx ;
      edtMqCMin_Internalname = "MQCMIN_"+sGXsfl_40_fel_idx ;
      edtMqCMod_Internalname = "MQCMOD_"+sGXsfl_40_fel_idx ;
      edtMqCMoi_Internalname = "MQCMOI_"+sGXsfl_40_fel_idx ;
      edtMqCEner_Internalname = "MQCENER_"+sGXsfl_40_fel_idx ;
      edtMqCGas_Internalname = "MQCGAS_"+sGXsfl_40_fel_idx ;
      edtMqCAgua_Internalname = "MQCAGUA_"+sGXsfl_40_fel_idx ;
      edtMqCAdCt_Internalname = "MQCADCT_"+sGXsfl_40_fel_idx ;
      edtMqCAmo_Internalname = "MQCAMO_"+sGXsfl_40_fel_idx ;
      edtMqCTotal_Internalname = "MQCTOTAL_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1W01913( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401913( ) ;
      sendRow1W01913( ) ;
   }

   public void sendRow1W01913( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1913_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1913_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1913), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1913), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1913_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1913_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCAnyo_Internalname,GXutil.ltrim( localUtil.ntoc( A14529MqCAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14529MqCAnyo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCAnyo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMqCAnyo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCMes_Internalname,GXutil.ltrim( localUtil.ntoc( A14530MqCMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14530MqCMes), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCMes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMqCMes_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCMin_Internalname,GXutil.ltrim( localUtil.ntoc( A14534MqCMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCMin_Enabled!=0) ? localUtil.format( A14534MqCMin, "ZZZZ9.9999") : localUtil.format( A14534MqCMin, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCMin_Visible),Integer.valueOf(edtMqCMin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCMin_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCMod_Internalname,GXutil.ltrim( localUtil.ntoc( A14535MqCMod, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCMod_Enabled!=0) ? localUtil.format( A14535MqCMod, "ZZZZ9.9999") : localUtil.format( A14535MqCMod, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCMod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCMod_Visible),Integer.valueOf(edtMqCMod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCMod_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCMoi_Internalname,GXutil.ltrim( localUtil.ntoc( A14536MqCMoi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCMoi_Enabled!=0) ? localUtil.format( A14536MqCMoi, "ZZZZ9.9999") : localUtil.format( A14536MqCMoi, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCMoi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCMoi_Visible),Integer.valueOf(edtMqCMoi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCMoi_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCEner_Internalname,GXutil.ltrim( localUtil.ntoc( A14537MqCEner, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCEner_Enabled!=0) ? localUtil.format( A14537MqCEner, "ZZZZ9.9999") : localUtil.format( A14537MqCEner, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCEner_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCEner_Visible),Integer.valueOf(edtMqCEner_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCEner_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCGas_Internalname,GXutil.ltrim( localUtil.ntoc( A14538MqCGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCGas_Enabled!=0) ? localUtil.format( A14538MqCGas, "ZZZZ9.9999") : localUtil.format( A14538MqCGas, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCGas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCGas_Visible),Integer.valueOf(edtMqCGas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCGas_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCAgua_Internalname,GXutil.ltrim( localUtil.ntoc( A14539MqCAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCAgua_Enabled!=0) ? localUtil.format( A14539MqCAgua, "ZZZZ9.9999") : localUtil.format( A14539MqCAgua, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCAgua_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCAgua_Visible),Integer.valueOf(edtMqCAgua_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCAgua_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCAdCt_Internalname,GXutil.ltrim( localUtil.ntoc( A14540MqCAdCt, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCAdCt_Enabled!=0) ? localUtil.format( A14540MqCAdCt, "ZZZZ9.9999") : localUtil.format( A14540MqCAdCt, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCAdCt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCAdCt_Visible),Integer.valueOf(edtMqCAdCt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCAdCt_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1913_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCAmo_Internalname,GXutil.ltrim( localUtil.ntoc( A14541MqCAmo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCAmo_Enabled!=0) ? localUtil.format( A14541MqCAmo, "ZZZZ9.9999") : localUtil.format( A14541MqCAmo, "ZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCAmo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCAmo_Visible),Integer.valueOf(edtMqCAmo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCAmo_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMqCTotal_Internalname,GXutil.ltrim( localUtil.ntoc( A14542MqCTotal, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMqCTotal_Enabled!=0) ? localUtil.format( A14542MqCTotal, "ZZZZ9.9999") : localUtil.format( A14542MqCTotal, "ZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMqCTotal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMqCTotal_Visible),Integer.valueOf(edtMqCTotal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(edtMqCTotal_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1W01913( ) ;
      GXCCtl = "Z14529MqCAnyo_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14529MqCAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14530MqCMes_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14530MqCMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14534MqCMin_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14534MqCMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14535MqCMod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14535MqCMod, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14536MqCMoi_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14536MqCMoi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14537MqCEner_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14537MqCEner, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14538MqCGas_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14538MqCGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14539MqCAgua_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14539MqCAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14540MqCAdCt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14540MqCAdCt, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14541MqCAmo_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14541MqCAmo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1913_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1913_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1913_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1913, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1913_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1913_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCANYO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAnyo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMES_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMIN_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMIN_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMOD_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMOD_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMOI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMOI_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCMOI_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCENER_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCENER_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCENER_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCGAS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCGAS_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCGAS_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCAGUA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCAGUA_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCAGUA_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCADCT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCADCT_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCADCT_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCAMO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCAMO_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCAMO_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCTOTAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCTOTAL_"+sGXsfl_40_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQCTOTAL_"+sGXsfl_40_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Width, (byte)(9), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1W01913( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401913( ) ;
      edtavnRcdDeleted_1913_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1913_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAnyo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCANYO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMES_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMin_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMIN_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMin_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMIN_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMod_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOD_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMod_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOD_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMoi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOI_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMoi_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOI_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCMoi_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCMOI_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCEner_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCENER_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCEner_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCENER_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCEner_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCENER_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCGas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCGAS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCGas_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCGAS_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCGas_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCGAS_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAgua_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAGUA_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAgua_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAGUA_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAgua_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAGUA_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAdCt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCADCT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAdCt_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCADCT_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAdCt_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCADCT_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAmo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAMO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAmo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAMO_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCAmo_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCAMO_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCTotal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQCTOTAL_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCTotal_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "MQCTOTAL_"+sGXsfl_40_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMqCTotal_Width = (int)(localUtil.ctol( httpContext.cgiGet( "MQCTOTAL_"+sGXsfl_40_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1913_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1913_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1913");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1913_Internalname ;
         wbErr = true ;
         nRcdDeleted_1913 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1913 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1913_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMqCAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMqCAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MQCANYO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCAnyo_Internalname ;
         wbErr = true ;
         A14529MqCAnyo = (short)(0) ;
      }
      else
      {
         A14529MqCAnyo = (short)(localUtil.ctol( httpContext.cgiGet( edtMqCAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMqCMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMqCMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MQCMES_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCMes_Internalname ;
         wbErr = true ;
         A14530MqCMes = (byte)(0) ;
      }
      else
      {
         A14530MqCMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtMqCMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCMin_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "MQCMIN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCMin_Internalname ;
         wbErr = true ;
         A14534MqCMin = DecimalUtil.ZERO ;
         n14534MqCMin = false ;
      }
      else
      {
         A14534MqCMin = localUtil.ctond( httpContext.cgiGet( edtMqCMin_Internalname)) ;
         n14534MqCMin = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCMod_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCMod_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "MQCMOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCMod_Internalname ;
         wbErr = true ;
         A14535MqCMod = DecimalUtil.ZERO ;
         n14535MqCMod = false ;
      }
      else
      {
         A14535MqCMod = localUtil.ctond( httpContext.cgiGet( edtMqCMod_Internalname)) ;
         n14535MqCMod = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCMoi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCMoi_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "MQCMOI_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCMoi_Internalname ;
         wbErr = true ;
         A14536MqCMoi = DecimalUtil.ZERO ;
         n14536MqCMoi = false ;
      }
      else
      {
         A14536MqCMoi = localUtil.ctond( httpContext.cgiGet( edtMqCMoi_Internalname)) ;
         n14536MqCMoi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCEner_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCEner_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "MQCENER_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCEner_Internalname ;
         wbErr = true ;
         A14537MqCEner = DecimalUtil.ZERO ;
         n14537MqCEner = false ;
      }
      else
      {
         A14537MqCEner = localUtil.ctond( httpContext.cgiGet( edtMqCEner_Internalname)) ;
         n14537MqCEner = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCGas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCGas_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "MQCGAS_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCGas_Internalname ;
         wbErr = true ;
         A14538MqCGas = DecimalUtil.ZERO ;
         n14538MqCGas = false ;
      }
      else
      {
         A14538MqCGas = localUtil.ctond( httpContext.cgiGet( edtMqCGas_Internalname)) ;
         n14538MqCGas = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCAgua_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCAgua_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "MQCAGUA_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCAgua_Internalname ;
         wbErr = true ;
         A14539MqCAgua = DecimalUtil.ZERO ;
         n14539MqCAgua = false ;
      }
      else
      {
         A14539MqCAgua = localUtil.ctond( httpContext.cgiGet( edtMqCAgua_Internalname)) ;
         n14539MqCAgua = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCAdCt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCAdCt_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "MQCADCT_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCAdCt_Internalname ;
         wbErr = true ;
         A14540MqCAdCt = DecimalUtil.ZERO ;
         n14540MqCAdCt = false ;
      }
      else
      {
         A14540MqCAdCt = localUtil.ctond( httpContext.cgiGet( edtMqCAdCt_Internalname)) ;
         n14540MqCAdCt = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCAmo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCAmo_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
      {
         GXCCtl = "MQCAMO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCAmo_Internalname ;
         wbErr = true ;
         A14541MqCAmo = DecimalUtil.ZERO ;
         n14541MqCAmo = false ;
      }
      else
      {
         A14541MqCAmo = localUtil.ctond( httpContext.cgiGet( edtMqCAmo_Internalname)) ;
         n14541MqCAmo = false ;
      }
      A14542MqCTotal = localUtil.ctond( httpContext.cgiGet( edtMqCTotal_Internalname)) ;
      GXCCtl = "Z14529MqCAnyo_" + sGXsfl_40_idx ;
      Z14529MqCAnyo = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14530MqCMes_" + sGXsfl_40_idx ;
      Z14530MqCMes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14534MqCMin_" + sGXsfl_40_idx ;
      Z14534MqCMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14535MqCMod_" + sGXsfl_40_idx ;
      Z14535MqCMod = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14536MqCMoi_" + sGXsfl_40_idx ;
      Z14536MqCMoi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14537MqCEner_" + sGXsfl_40_idx ;
      Z14537MqCEner = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14538MqCGas_" + sGXsfl_40_idx ;
      Z14538MqCGas = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14539MqCAgua_" + sGXsfl_40_idx ;
      Z14539MqCAgua = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14540MqCAdCt_" + sGXsfl_40_idx ;
      Z14540MqCAdCt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14541MqCAmo_" + sGXsfl_40_idx ;
      Z14541MqCAmo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1913_" + sGXsfl_40_idx ;
      nRcdDeleted_1913 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1913_" + sGXsfl_40_idx ;
      nRcdExists_1913 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1913_" + sGXsfl_40_idx ;
      nIsMod_1913 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMqCMes_Enabled = edtMqCMes_Enabled ;
      defedtMqCAnyo_Enabled = edtMqCAnyo_Enabled ;
   }

   public void confirmValues1W00( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401913( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401913( ) ;
         httpContext.changePostValue( "Z14529MqCAnyo_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14529MqCAnyo_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14529MqCAnyo_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14530MqCMes_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14530MqCMes_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14530MqCMes_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14534MqCMin_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14534MqCMin_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14534MqCMin_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14535MqCMod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14535MqCMod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14535MqCMod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14536MqCMoi_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14536MqCMoi_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14536MqCMoi_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14537MqCEner_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14537MqCEner_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14537MqCEner_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14538MqCGas_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14538MqCGas_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14538MqCGas_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14539MqCAgua_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14539MqCAgua_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14539MqCAgua_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14540MqCAdCt_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14540MqCAdCt_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14540MqCAdCt_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z14541MqCAmo_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z14541MqCAmo_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14541MqCAmo_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.costesbasicos.tmaqcos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.rtrim(A606MaqDsc))}, new String[] {"EmprCod","MaqCod","MaqDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A606MaqDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
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
      return formatLink("app.costesbasicos.tmaqcos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.rtrim(A606MaqDsc))}, new String[] {"EmprCod","MaqCod","MaqDsc"})  ;
   }

   public String getPgmname( )
   {
      return "CostesBasicos.TMAQCOS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Costes Maquina por Año/Mes", "") ;
   }

   public void initializeNonKey1W065( )
   {
   }

   public void initAll1W065( )
   {
      initializeNonKey1W065( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1W01913( )
   {
      A14542MqCTotal = DecimalUtil.ZERO ;
      A14534MqCMin = DecimalUtil.ZERO ;
      n14534MqCMin = false ;
      A14535MqCMod = DecimalUtil.ZERO ;
      n14535MqCMod = false ;
      A14536MqCMoi = DecimalUtil.ZERO ;
      n14536MqCMoi = false ;
      A14537MqCEner = DecimalUtil.ZERO ;
      n14537MqCEner = false ;
      A14538MqCGas = DecimalUtil.ZERO ;
      n14538MqCGas = false ;
      A14539MqCAgua = DecimalUtil.ZERO ;
      n14539MqCAgua = false ;
      A14540MqCAdCt = DecimalUtil.ZERO ;
      n14540MqCAdCt = false ;
      A14541MqCAmo = DecimalUtil.ZERO ;
      n14541MqCAmo = false ;
      Z14534MqCMin = DecimalUtil.ZERO ;
      Z14535MqCMod = DecimalUtil.ZERO ;
      Z14536MqCMoi = DecimalUtil.ZERO ;
      Z14537MqCEner = DecimalUtil.ZERO ;
      Z14538MqCGas = DecimalUtil.ZERO ;
      Z14539MqCAgua = DecimalUtil.ZERO ;
      Z14540MqCAdCt = DecimalUtil.ZERO ;
      Z14541MqCAmo = DecimalUtil.ZERO ;
   }

   public void initAll1W01913( )
   {
      A14529MqCAnyo = E14529MqCAnyo ;
      A14530MqCMes = E14530MqCMes ;
      initializeNonKey1W01913( ) ;
   }

   public void standaloneModalInsert1W01913( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513243", true, true);
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
      httpContext.AddJavascriptSource("costesbasicos/tmaqcos.js", "?20268241513243", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1913( )
   {
      edtMqCMes_Enabled = defedtMqCMes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMes_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMqCAnyo_Enabled = defedtMqCAnyo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAnyo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAnyo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1913, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1913_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14529MqCAnyo, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAnyo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14530MqCMes, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14534MqCMin, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCMin_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14535MqCMod, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCMod_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14536MqCMoi, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCMoi_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14537MqCEner, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCEner_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14538MqCGas, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCGas_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14539MqCAgua, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCAgua_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14540MqCAdCt, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCAdCt_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14541MqCAmo, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCAmo_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14542MqCTotal, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Visible, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtMqCTotal_Width, (byte)(9), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtavnRcdDeleted_1913_Internalname = "vNRCDDELETED_1913" ;
      edtMqCAnyo_Internalname = "MQCANYO" ;
      edtMqCMes_Internalname = "MQCMES" ;
      edtMqCMin_Internalname = "MQCMIN" ;
      edtMqCMod_Internalname = "MQCMOD" ;
      edtMqCMoi_Internalname = "MQCMOI" ;
      edtMqCEner_Internalname = "MQCENER" ;
      edtMqCGas_Internalname = "MQCGAS" ;
      edtMqCAgua_Internalname = "MQCAGUA" ;
      edtMqCAdCt_Internalname = "MQCADCT" ;
      edtMqCAmo_Internalname = "MQCAMO" ;
      edtMqCTotal_Internalname = "MQCTOTAL" ;
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
      Form.setCaption( httpContext.getMessage( "Costes Maquina por Año/Mes", "") );
      edtMqCTotal_Jsonclick = "" ;
      edtMqCAmo_Jsonclick = "" ;
      edtMqCAdCt_Jsonclick = "" ;
      edtMqCAgua_Jsonclick = "" ;
      edtMqCGas_Jsonclick = "" ;
      edtMqCEner_Jsonclick = "" ;
      edtMqCMoi_Jsonclick = "" ;
      edtMqCMod_Jsonclick = "" ;
      edtMqCMin_Jsonclick = "" ;
      edtMqCMes_Jsonclick = "" ;
      edtMqCAnyo_Jsonclick = "" ;
      edtavnRcdDeleted_1913_Jsonclick = "" ;
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
      edtMqCTotal_Enabled = 0 ;
      edtMqCAmo_Enabled = 1 ;
      edtMqCAdCt_Enabled = 1 ;
      edtMqCAgua_Enabled = 1 ;
      edtMqCGas_Enabled = 1 ;
      edtMqCEner_Enabled = 1 ;
      edtMqCMoi_Enabled = 1 ;
      edtMqCMod_Enabled = 1 ;
      edtMqCMin_Enabled = 1 ;
      edtMqCMes_Enabled = 1 ;
      edtMqCAnyo_Enabled = 1 ;
      edtavnRcdDeleted_1913_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 0 ;
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
      edtMqCMin_Width = 0 ;
      edtMqCMin_Visible = -1 ;
      edtMqCTotal_Width = 0 ;
      edtMqCMoi_Width = 0 ;
      edtMqCMod_Width = 0 ;
      edtMqCGas_Width = 0 ;
      edtMqCEner_Width = 0 ;
      edtMqCAmo_Width = 0 ;
      edtMqCAgua_Width = 0 ;
      edtMqCAdCt_Width = 0 ;
      edtMqCTotal_Visible = -1 ;
      edtMqCMoi_Visible = -1 ;
      edtMqCMod_Visible = -1 ;
      edtMqCGas_Visible = -1 ;
      edtMqCEner_Visible = -1 ;
      edtMqCAmo_Visible = -1 ;
      edtMqCAgua_Visible = -1 ;
      edtMqCAdCt_Visible = -1 ;
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
      subsflControlProps_401913( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1W01913( ) ;
         standaloneModal1W01913( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1W01913( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401913( ) ;
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
      /* Using cursor T01W070 */
      pr_default.execute(68, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(68) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01W070_A407EmprNom[0] ;
      n407EmprNom = T01W070_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(68);
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

   public void valid_Maqcod( )
   {
      n606MaqDsc = false ;
      n602MaqCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true},{av:'A606MaqDsc',fld:'MAQDSC',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true},{av:'A606MaqDsc',fld:'MAQDSC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'edtMqCMin_Width',ctrl:'MQCMIN',prop:'Width'},{av:'edtMqCMin_Visible',ctrl:'MQCMIN',prop:'Visible'},{av:'edtMqCTotal_Width',ctrl:'MQCTOTAL',prop:'Width'},{av:'edtMqCMoi_Width',ctrl:'MQCMOI',prop:'Width'},{av:'edtMqCMod_Width',ctrl:'MQCMOD',prop:'Width'},{av:'edtMqCGas_Width',ctrl:'MQCGAS',prop:'Width'},{av:'edtMqCEner_Width',ctrl:'MQCENER',prop:'Width'},{av:'edtMqCAmo_Width',ctrl:'MQCAMO',prop:'Width'},{av:'edtMqCAgua_Width',ctrl:'MQCAGUA',prop:'Width'},{av:'edtMqCAdCt_Width',ctrl:'MQCADCT',prop:'Width'},{av:'edtMqCTotal_Visible',ctrl:'MQCTOTAL',prop:'Visible'},{av:'edtMqCMoi_Visible',ctrl:'MQCMOI',prop:'Visible'},{av:'edtMqCMod_Visible',ctrl:'MQCMOD',prop:'Visible'},{av:'edtMqCGas_Visible',ctrl:'MQCGAS',prop:'Visible'},{av:'edtMqCEner_Visible',ctrl:'MQCENER',prop:'Visible'},{av:'edtMqCAmo_Visible',ctrl:'MQCAMO',prop:'Visible'},{av:'edtMqCAgua_Visible',ctrl:'MQCAGUA',prop:'Visible'},{av:'edtMqCAdCt_Visible',ctrl:'MQCADCT',prop:'Visible'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z407EmprNom'},{av:'Z606MaqDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MQCANYO","{handler:'valid_Mqcanyo',iparms:[]");
      setEventMetadata("VALID_MQCANYO",",oparms:[]}");
      setEventMetadata("VALID_MQCMES","{handler:'valid_Mqcmes',iparms:[]");
      setEventMetadata("VALID_MQCMES",",oparms:[]}");
      setEventMetadata("VALID_MQCMOD","{handler:'valid_Mqcmod',iparms:[]");
      setEventMetadata("VALID_MQCMOD",",oparms:[]}");
      setEventMetadata("VALID_MQCMOI","{handler:'valid_Mqcmoi',iparms:[]");
      setEventMetadata("VALID_MQCMOI",",oparms:[]}");
      setEventMetadata("VALID_MQCENER","{handler:'valid_Mqcener',iparms:[]");
      setEventMetadata("VALID_MQCENER",",oparms:[]}");
      setEventMetadata("VALID_MQCGAS","{handler:'valid_Mqcgas',iparms:[]");
      setEventMetadata("VALID_MQCGAS",",oparms:[]}");
      setEventMetadata("VALID_MQCAGUA","{handler:'valid_Mqcagua',iparms:[]");
      setEventMetadata("VALID_MQCAGUA",",oparms:[]}");
      setEventMetadata("VALID_MQCADCT","{handler:'valid_Mqcadct',iparms:[]");
      setEventMetadata("VALID_MQCADCT",",oparms:[]}");
      setEventMetadata("VALID_MQCAMO","{handler:'valid_Mqcamo',iparms:[]");
      setEventMetadata("VALID_MQCAMO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mqctotal',iparms:[]");
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
      pr_default.close(68);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      E14529MqCAnyo = (short)(0) ;
      E14530MqCMes = (byte)(0) ;
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA602MaqCod = "" ;
      wcpOA606MaqDsc = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z14534MqCMin = DecimalUtil.ZERO ;
      Z14535MqCMod = DecimalUtil.ZERO ;
      Z14536MqCMoi = DecimalUtil.ZERO ;
      Z14537MqCEner = DecimalUtil.ZERO ;
      Z14538MqCGas = DecimalUtil.ZERO ;
      Z14539MqCAgua = DecimalUtil.ZERO ;
      Z14540MqCAdCt = DecimalUtil.ZERO ;
      Z14541MqCAmo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      Gx_date = GXutil.nullDate() ;
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
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1913 = "" ;
      GX_FocusControl = "" ;
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
      sMode65 = "" ;
      GXCCtl = "" ;
      A14534MqCMin = DecimalUtil.ZERO ;
      A14535MqCMod = DecimalUtil.ZERO ;
      A14536MqCMoi = DecimalUtil.ZERO ;
      A14537MqCEner = DecimalUtil.ZERO ;
      A14538MqCGas = DecimalUtil.ZERO ;
      A14539MqCAgua = DecimalUtil.ZERO ;
      A14540MqCAdCt = DecimalUtil.ZERO ;
      A14541MqCAmo = DecimalUtil.ZERO ;
      A14542MqCTotal = DecimalUtil.ZERO ;
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
      GXv_int6 = new byte[1] ;
      Z606MaqDsc = "" ;
      Z407EmprNom = "" ;
      T01W06_A407EmprNom = new String[] {""} ;
      T01W06_n407EmprNom = new boolean[] {false} ;
      T01W07_A602MaqCod = new String[] {""} ;
      T01W07_n602MaqCod = new boolean[] {false} ;
      T01W07_A606MaqDsc = new String[] {""} ;
      T01W07_n606MaqDsc = new boolean[] {false} ;
      T01W07_A407EmprNom = new String[] {""} ;
      T01W07_n407EmprNom = new boolean[] {false} ;
      T01W07_A396EmprCod = new String[] {""} ;
      T01W08_A396EmprCod = new String[] {""} ;
      T01W08_A602MaqCod = new String[] {""} ;
      T01W08_n602MaqCod = new boolean[] {false} ;
      T01W05_A602MaqCod = new String[] {""} ;
      T01W05_n602MaqCod = new boolean[] {false} ;
      T01W05_A606MaqDsc = new String[] {""} ;
      T01W05_n606MaqDsc = new boolean[] {false} ;
      T01W05_A396EmprCod = new String[] {""} ;
      T01W09_A396EmprCod = new String[] {""} ;
      T01W09_A602MaqCod = new String[] {""} ;
      T01W09_n602MaqCod = new boolean[] {false} ;
      T01W09_A606MaqDsc = new String[] {""} ;
      T01W09_n606MaqDsc = new boolean[] {false} ;
      T01W010_A396EmprCod = new String[] {""} ;
      T01W010_A602MaqCod = new String[] {""} ;
      T01W010_n602MaqCod = new boolean[] {false} ;
      T01W010_A606MaqDsc = new String[] {""} ;
      T01W010_n606MaqDsc = new boolean[] {false} ;
      T01W04_A602MaqCod = new String[] {""} ;
      T01W04_n602MaqCod = new boolean[] {false} ;
      T01W04_A606MaqDsc = new String[] {""} ;
      T01W04_n606MaqDsc = new boolean[] {false} ;
      T01W04_A396EmprCod = new String[] {""} ;
      T01W014_A396EmprCod = new String[] {""} ;
      T01W014_A129BarCod = new int[1] ;
      T01W014_A132BarCodReo = new byte[1] ;
      T01W014_A130BarCodPar = new String[] {""} ;
      T01W014_A14152MEnvOrd = new short[1] ;
      T01W015_A396EmprCod = new String[] {""} ;
      T01W015_A13604RARID = new int[1] ;
      T01W015_A602MaqCod = new String[] {""} ;
      T01W015_n602MaqCod = new boolean[] {false} ;
      T01W016_A396EmprCod = new String[] {""} ;
      T01W016_A602MaqCod = new String[] {""} ;
      T01W016_n602MaqCod = new boolean[] {false} ;
      T01W016_A13193MaqHdr = new int[1] ;
      T01W016_A13194MaqHdrR = new byte[1] ;
      T01W016_A13195MaqHdrP = new String[] {""} ;
      T01W016_A13196MaqRecLinM = new short[1] ;
      T01W017_A396EmprCod = new String[] {""} ;
      T01W017_A13137NCHdr = new int[1] ;
      T01W017_A13138NCHdrr = new byte[1] ;
      T01W017_A13139NCHdrp = new String[] {""} ;
      T01W018_A396EmprCod = new String[] {""} ;
      T01W018_A12673LavMqId = new int[1] ;
      T01W019_A396EmprCod = new String[] {""} ;
      T01W019_A602MaqCod = new String[] {""} ;
      T01W019_n602MaqCod = new boolean[] {false} ;
      T01W019_A12444MaqAnyNP = new short[1] ;
      T01W019_A12445MaqMesNP = new byte[1] ;
      T01W020_A396EmprCod = new String[] {""} ;
      T01W020_A602MaqCod = new String[] {""} ;
      T01W020_n602MaqCod = new boolean[] {false} ;
      T01W020_A12434MaqAnyM = new short[1] ;
      T01W020_A12435MaqMesM = new byte[1] ;
      T01W021_A396EmprCod = new String[] {""} ;
      T01W021_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01W021_A5728JBCLLin = new short[1] ;
      T01W022_A396EmprCod = new String[] {""} ;
      T01W022_A11604PArtId = new int[1] ;
      T01W023_A396EmprCod = new String[] {""} ;
      T01W023_A602MaqCod = new String[] {""} ;
      T01W023_n602MaqCod = new boolean[] {false} ;
      T01W023_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01W024_A396EmprCod = new String[] {""} ;
      T01W024_A602MaqCod = new String[] {""} ;
      T01W024_n602MaqCod = new boolean[] {false} ;
      T01W024_A11438MaqEquCod = new String[] {""} ;
      T01W024_A11439MaqSEqCod = new String[] {""} ;
      T01W024_A11440MaqPieCod = new String[] {""} ;
      T01W025_A396EmprCod = new String[] {""} ;
      T01W025_A602MaqCod = new String[] {""} ;
      T01W025_n602MaqCod = new boolean[] {false} ;
      T01W025_A11432MaqDocId = new short[1] ;
      T01W026_A396EmprCod = new String[] {""} ;
      T01W026_A602MaqCod = new String[] {""} ;
      T01W026_n602MaqCod = new boolean[] {false} ;
      T01W026_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01W026_A10112Mq_Op = new int[1] ;
      T01W027_A396EmprCod = new String[] {""} ;
      T01W027_A252CliCod = new int[1] ;
      T01W027_A65ArtCod = new String[] {""} ;
      T01W027_A10041ArtSH = new String[] {""} ;
      T01W027_A10042ArtMqFa = new String[] {""} ;
      T01W028_A396EmprCod = new String[] {""} ;
      T01W028_A602MaqCod = new String[] {""} ;
      T01W028_n602MaqCod = new boolean[] {false} ;
      T01W028_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01W029_A396EmprCod = new String[] {""} ;
      T01W029_A602MaqCod = new String[] {""} ;
      T01W029_n602MaqCod = new boolean[] {false} ;
      T01W029_A9725MaqFabC = new String[] {""} ;
      T01W030_A396EmprCod = new String[] {""} ;
      T01W030_A9428SMCod = new int[1] ;
      T01W031_A396EmprCod = new String[] {""} ;
      T01W031_A9429PMCod = new int[1] ;
      T01W032_A396EmprCod = new String[] {""} ;
      T01W032_A9425OMCod = new int[1] ;
      T01W033_A396EmprCod = new String[] {""} ;
      T01W033_A602MaqCod = new String[] {""} ;
      T01W033_n602MaqCod = new boolean[] {false} ;
      T01W033_A8008Maq_Prg = new String[] {""} ;
      T01W034_A396EmprCod = new String[] {""} ;
      T01W034_A602MaqCod = new String[] {""} ;
      T01W034_n602MaqCod = new boolean[] {false} ;
      T01W034_A6874CPROCORIG = new String[] {""} ;
      T01W035_A396EmprCod = new String[] {""} ;
      T01W035_A6319C_Barcod = new int[1] ;
      T01W035_A6320C_Barcodre = new byte[1] ;
      T01W035_A6321C_Barcodpa = new String[] {""} ;
      T01W035_A6322C_Reclinma = new short[1] ;
      T01W036_A396EmprCod = new String[] {""} ;
      T01W036_A602MaqCod = new String[] {""} ;
      T01W036_n602MaqCod = new boolean[] {false} ;
      T01W036_A6260MaqTqn = new byte[1] ;
      T01W037_A396EmprCod = new String[] {""} ;
      T01W037_A6188MaqTArt = new short[1] ;
      T01W037_A602MaqCod = new String[] {""} ;
      T01W037_n602MaqCod = new boolean[] {false} ;
      T01W038_A396EmprCod = new String[] {""} ;
      T01W038_A602MaqCod = new String[] {""} ;
      T01W038_n602MaqCod = new boolean[] {false} ;
      T01W038_A6078MaqCliCod = new int[1] ;
      T01W038_A6079MaqArtCod = new String[] {""} ;
      T01W039_A396EmprCod = new String[] {""} ;
      T01W039_A6037Mq_Grupo = new byte[1] ;
      T01W039_A602MaqCod = new String[] {""} ;
      T01W039_n602MaqCod = new boolean[] {false} ;
      T01W040_A396EmprCod = new String[] {""} ;
      T01W040_A6000CRCod = new String[] {""} ;
      T01W040_A6005CRLin = new short[1] ;
      T01W041_A396EmprCod = new String[] {""} ;
      T01W041_A602MaqCod = new String[] {""} ;
      T01W041_n602MaqCod = new boolean[] {false} ;
      T01W041_A5879PlaMTAOrd = new short[1] ;
      T01W042_A396EmprCod = new String[] {""} ;
      T01W042_A5603PrdNumM = new String[] {""} ;
      T01W042_A602MaqCod = new String[] {""} ;
      T01W042_n602MaqCod = new boolean[] {false} ;
      T01W043_A396EmprCod = new String[] {""} ;
      T01W043_A602MaqCod = new String[] {""} ;
      T01W043_n602MaqCod = new boolean[] {false} ;
      T01W043_A5525MaqPrdNum = new String[] {""} ;
      T01W044_A396EmprCod = new String[] {""} ;
      T01W044_A764ProForCod = new String[] {""} ;
      T01W044_A5191ProForLC = new short[1] ;
      T01W045_A396EmprCod = new String[] {""} ;
      T01W045_A4686MaqTipArt = new short[1] ;
      T01W045_A602MaqCod = new String[] {""} ;
      T01W045_n602MaqCod = new boolean[] {false} ;
      T01W046_A396EmprCod = new String[] {""} ;
      T01W046_A3331LanBroCod = new byte[1] ;
      T01W046_A3333LanBroLin = new short[1] ;
      T01W047_A396EmprCod = new String[] {""} ;
      T01W047_A602MaqCod = new String[] {""} ;
      T01W047_n602MaqCod = new boolean[] {false} ;
      T01W047_A3047LOParId = new String[] {""} ;
      T01W048_A396EmprCod = new String[] {""} ;
      T01W048_A129BarCod = new int[1] ;
      T01W048_A132BarCodReo = new byte[1] ;
      T01W048_A130BarCodPar = new String[] {""} ;
      T01W048_A2804RecLinMaq = new short[1] ;
      T01W049_A396EmprCod = new String[] {""} ;
      T01W049_A602MaqCod = new String[] {""} ;
      T01W049_n602MaqCod = new boolean[] {false} ;
      T01W049_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01W050_A396EmprCod = new String[] {""} ;
      T01W050_A602MaqCod = new String[] {""} ;
      T01W050_n602MaqCod = new boolean[] {false} ;
      T01W050_A2019MaqMadLin = new short[1] ;
      T01W051_A396EmprCod = new String[] {""} ;
      T01W051_A602MaqCod = new String[] {""} ;
      T01W051_n602MaqCod = new boolean[] {false} ;
      T01W051_A2014MaqConLin = new short[1] ;
      T01W052_A396EmprCod = new String[] {""} ;
      T01W052_A1621CosTermCod = new String[] {""} ;
      T01W052_A1615CosLin = new int[1] ;
      T01W053_A396EmprCod = new String[] {""} ;
      T01W053_A602MaqCod = new String[] {""} ;
      T01W053_n602MaqCod = new boolean[] {false} ;
      T01W053_A1142MaqFCod = new String[] {""} ;
      T01W054_A396EmprCod = new String[] {""} ;
      T01W054_A602MaqCod = new String[] {""} ;
      T01W054_n602MaqCod = new boolean[] {false} ;
      T01W054_A634MhiMes = new byte[1] ;
      T01W054_A632MhiAny = new short[1] ;
      T01W055_A396EmprCod = new String[] {""} ;
      T01W055_A602MaqCod = new String[] {""} ;
      T01W055_n602MaqCod = new boolean[] {false} ;
      T01W055_A320DesTecLin = new byte[1] ;
      T01W056_A396EmprCod = new String[] {""} ;
      T01W056_A602MaqCod = new String[] {""} ;
      T01W056_n602MaqCod = new boolean[] {false} ;
      T01W056_A599MaqAny = new short[1] ;
      T01W056_A614MaqMes = new byte[1] ;
      T01W057_A396EmprCod = new String[] {""} ;
      T01W057_A539HisBarCod = new int[1] ;
      T01W057_A545HisCodReo = new byte[1] ;
      T01W057_A544HisCodPar = new String[] {""} ;
      T01W057_A833TipDefCod = new short[1] ;
      T01W058_A396EmprCod = new String[] {""} ;
      T01W058_A602MaqCod = new String[] {""} ;
      T01W058_n602MaqCod = new boolean[] {false} ;
      T01W058_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01W059_A396EmprCod = new String[] {""} ;
      T01W059_A501GruMaqCod = new String[] {""} ;
      T01W059_A602MaqCod = new String[] {""} ;
      T01W059_n602MaqCod = new boolean[] {false} ;
      T01W060_A396EmprCod = new String[] {""} ;
      T01W060_A457FasCod = new String[] {""} ;
      T01W061_A396EmprCod = new String[] {""} ;
      T01W061_A361DisCod = new int[1] ;
      T01W062_A396EmprCod = new String[] {""} ;
      T01W062_A129BarCod = new int[1] ;
      T01W062_A132BarCodReo = new byte[1] ;
      T01W062_A130BarCodPar = new String[] {""} ;
      T01W062_A758ProCod = new String[] {""} ;
      T01W062_A194BarOrdLin = new short[1] ;
      T01W063_A396EmprCod = new String[] {""} ;
      T01W063_A602MaqCod = new String[] {""} ;
      T01W063_n602MaqCod = new boolean[] {false} ;
      T01W064_A602MaqCod = new String[] {""} ;
      T01W064_n602MaqCod = new boolean[] {false} ;
      T01W064_A14529MqCAnyo = new short[1] ;
      T01W064_A14530MqCMes = new byte[1] ;
      T01W064_A14534MqCMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W064_n14534MqCMin = new boolean[] {false} ;
      T01W064_A14535MqCMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W064_n14535MqCMod = new boolean[] {false} ;
      T01W064_A14536MqCMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W064_n14536MqCMoi = new boolean[] {false} ;
      T01W064_A14537MqCEner = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W064_n14537MqCEner = new boolean[] {false} ;
      T01W064_A14538MqCGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W064_n14538MqCGas = new boolean[] {false} ;
      T01W064_A14539MqCAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W064_n14539MqCAgua = new boolean[] {false} ;
      T01W064_A14540MqCAdCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W064_n14540MqCAdCt = new boolean[] {false} ;
      T01W064_A14541MqCAmo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W064_n14541MqCAmo = new boolean[] {false} ;
      T01W064_A396EmprCod = new String[] {""} ;
      T01W065_A396EmprCod = new String[] {""} ;
      T01W065_A602MaqCod = new String[] {""} ;
      T01W065_n602MaqCod = new boolean[] {false} ;
      T01W065_A14529MqCAnyo = new short[1] ;
      T01W065_A14530MqCMes = new byte[1] ;
      T01W03_A602MaqCod = new String[] {""} ;
      T01W03_n602MaqCod = new boolean[] {false} ;
      T01W03_A14529MqCAnyo = new short[1] ;
      T01W03_A14530MqCMes = new byte[1] ;
      T01W03_A14534MqCMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W03_n14534MqCMin = new boolean[] {false} ;
      T01W03_A14535MqCMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W03_n14535MqCMod = new boolean[] {false} ;
      T01W03_A14536MqCMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W03_n14536MqCMoi = new boolean[] {false} ;
      T01W03_A14537MqCEner = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W03_n14537MqCEner = new boolean[] {false} ;
      T01W03_A14538MqCGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W03_n14538MqCGas = new boolean[] {false} ;
      T01W03_A14539MqCAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W03_n14539MqCAgua = new boolean[] {false} ;
      T01W03_A14540MqCAdCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W03_n14540MqCAdCt = new boolean[] {false} ;
      T01W03_A14541MqCAmo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W03_n14541MqCAmo = new boolean[] {false} ;
      T01W03_A396EmprCod = new String[] {""} ;
      T01W02_A602MaqCod = new String[] {""} ;
      T01W02_n602MaqCod = new boolean[] {false} ;
      T01W02_A14529MqCAnyo = new short[1] ;
      T01W02_A14530MqCMes = new byte[1] ;
      T01W02_A14534MqCMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W02_n14534MqCMin = new boolean[] {false} ;
      T01W02_A14535MqCMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W02_n14535MqCMod = new boolean[] {false} ;
      T01W02_A14536MqCMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W02_n14536MqCMoi = new boolean[] {false} ;
      T01W02_A14537MqCEner = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W02_n14537MqCEner = new boolean[] {false} ;
      T01W02_A14538MqCGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W02_n14538MqCGas = new boolean[] {false} ;
      T01W02_A14539MqCAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W02_n14539MqCAgua = new boolean[] {false} ;
      T01W02_A14540MqCAdCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W02_n14540MqCAdCt = new boolean[] {false} ;
      T01W02_A14541MqCAmo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W02_n14541MqCAmo = new boolean[] {false} ;
      T01W02_A396EmprCod = new String[] {""} ;
      T01W069_A396EmprCod = new String[] {""} ;
      T01W069_A602MaqCod = new String[] {""} ;
      T01W069_n602MaqCod = new boolean[] {false} ;
      T01W069_A14529MqCAnyo = new short[1] ;
      T01W069_A14530MqCMes = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01W070_A407EmprNom = new String[] {""} ;
      T01W070_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ606MaqDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmaqcos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmaqcos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmaqcos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmaqcos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmaqcos__default(),
         new Object[] {
             new Object[] {
            T01W02_A602MaqCod, T01W02_A14529MqCAnyo, T01W02_A14530MqCMes, T01W02_A14534MqCMin, T01W02_n14534MqCMin, T01W02_A14535MqCMod, T01W02_n14535MqCMod, T01W02_A14536MqCMoi, T01W02_n14536MqCMoi, T01W02_A14537MqCEner,
            T01W02_n14537MqCEner, T01W02_A14538MqCGas, T01W02_n14538MqCGas, T01W02_A14539MqCAgua, T01W02_n14539MqCAgua, T01W02_A14540MqCAdCt, T01W02_n14540MqCAdCt, T01W02_A14541MqCAmo, T01W02_n14541MqCAmo, T01W02_A396EmprCod
            }
            , new Object[] {
            T01W03_A602MaqCod, T01W03_A14529MqCAnyo, T01W03_A14530MqCMes, T01W03_A14534MqCMin, T01W03_n14534MqCMin, T01W03_A14535MqCMod, T01W03_n14535MqCMod, T01W03_A14536MqCMoi, T01W03_n14536MqCMoi, T01W03_A14537MqCEner,
            T01W03_n14537MqCEner, T01W03_A14538MqCGas, T01W03_n14538MqCGas, T01W03_A14539MqCAgua, T01W03_n14539MqCAgua, T01W03_A14540MqCAdCt, T01W03_n14540MqCAdCt, T01W03_A14541MqCAmo, T01W03_n14541MqCAmo, T01W03_A396EmprCod
            }
            , new Object[] {
            T01W04_A602MaqCod, T01W04_A606MaqDsc, T01W04_n606MaqDsc, T01W04_A396EmprCod
            }
            , new Object[] {
            T01W05_A602MaqCod, T01W05_A606MaqDsc, T01W05_n606MaqDsc, T01W05_A396EmprCod
            }
            , new Object[] {
            T01W06_A407EmprNom, T01W06_n407EmprNom
            }
            , new Object[] {
            T01W07_A602MaqCod, T01W07_A606MaqDsc, T01W07_n606MaqDsc, T01W07_A407EmprNom, T01W07_n407EmprNom, T01W07_A396EmprCod
            }
            , new Object[] {
            T01W08_A396EmprCod, T01W08_A602MaqCod
            }
            , new Object[] {
            T01W09_A396EmprCod, T01W09_A602MaqCod, T01W09_A606MaqDsc, T01W09_n606MaqDsc
            }
            , new Object[] {
            T01W010_A396EmprCod, T01W010_A602MaqCod, T01W010_A606MaqDsc, T01W010_n606MaqDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W014_A396EmprCod, T01W014_A129BarCod, T01W014_A132BarCodReo, T01W014_A130BarCodPar, T01W014_A14152MEnvOrd
            }
            , new Object[] {
            T01W015_A396EmprCod, T01W015_A13604RARID, T01W015_A602MaqCod
            }
            , new Object[] {
            T01W016_A396EmprCod, T01W016_A602MaqCod, T01W016_A13193MaqHdr, T01W016_A13194MaqHdrR, T01W016_A13195MaqHdrP, T01W016_A13196MaqRecLinM
            }
            , new Object[] {
            T01W017_A396EmprCod, T01W017_A13137NCHdr, T01W017_A13138NCHdrr, T01W017_A13139NCHdrp
            }
            , new Object[] {
            T01W018_A396EmprCod, T01W018_A12673LavMqId
            }
            , new Object[] {
            T01W019_A396EmprCod, T01W019_A602MaqCod, T01W019_A12444MaqAnyNP, T01W019_A12445MaqMesNP
            }
            , new Object[] {
            T01W020_A396EmprCod, T01W020_A602MaqCod, T01W020_A12434MaqAnyM, T01W020_A12435MaqMesM
            }
            , new Object[] {
            T01W021_A396EmprCod, T01W021_A4929Inc_Dia, T01W021_A5728JBCLLin
            }
            , new Object[] {
            T01W022_A396EmprCod, T01W022_A11604PArtId
            }
            , new Object[] {
            T01W023_A396EmprCod, T01W023_A602MaqCod, T01W023_A11445MaqFch
            }
            , new Object[] {
            T01W024_A396EmprCod, T01W024_A602MaqCod, T01W024_A11438MaqEquCod, T01W024_A11439MaqSEqCod, T01W024_A11440MaqPieCod
            }
            , new Object[] {
            T01W025_A396EmprCod, T01W025_A602MaqCod, T01W025_A11432MaqDocId
            }
            , new Object[] {
            T01W026_A396EmprCod, T01W026_A602MaqCod, T01W026_A10111Mq_Dia, T01W026_A10112Mq_Op
            }
            , new Object[] {
            T01W027_A396EmprCod, T01W027_A252CliCod, T01W027_A65ArtCod, T01W027_A10041ArtSH, T01W027_A10042ArtMqFa
            }
            , new Object[] {
            T01W028_A396EmprCod, T01W028_A602MaqCod, T01W028_A74MaqTMuIni
            }
            , new Object[] {
            T01W029_A396EmprCod, T01W029_A602MaqCod, T01W029_A9725MaqFabC
            }
            , new Object[] {
            T01W030_A396EmprCod, T01W030_A9428SMCod
            }
            , new Object[] {
            T01W031_A396EmprCod, T01W031_A9429PMCod
            }
            , new Object[] {
            T01W032_A396EmprCod, T01W032_A9425OMCod
            }
            , new Object[] {
            T01W033_A396EmprCod, T01W033_A602MaqCod, T01W033_A8008Maq_Prg
            }
            , new Object[] {
            T01W034_A396EmprCod, T01W034_A602MaqCod, T01W034_A6874CPROCORIG
            }
            , new Object[] {
            T01W035_A396EmprCod, T01W035_A6319C_Barcod, T01W035_A6320C_Barcodre, T01W035_A6321C_Barcodpa, T01W035_A6322C_Reclinma
            }
            , new Object[] {
            T01W036_A396EmprCod, T01W036_A602MaqCod, T01W036_A6260MaqTqn
            }
            , new Object[] {
            T01W037_A396EmprCod, T01W037_A6188MaqTArt, T01W037_A602MaqCod
            }
            , new Object[] {
            T01W038_A396EmprCod, T01W038_A602MaqCod, T01W038_A6078MaqCliCod, T01W038_A6079MaqArtCod
            }
            , new Object[] {
            T01W039_A396EmprCod, T01W039_A6037Mq_Grupo, T01W039_A602MaqCod
            }
            , new Object[] {
            T01W040_A396EmprCod, T01W040_A6000CRCod, T01W040_A6005CRLin
            }
            , new Object[] {
            T01W041_A396EmprCod, T01W041_A602MaqCod, T01W041_A5879PlaMTAOrd
            }
            , new Object[] {
            T01W042_A396EmprCod, T01W042_A5603PrdNumM, T01W042_A602MaqCod
            }
            , new Object[] {
            T01W043_A396EmprCod, T01W043_A602MaqCod, T01W043_A5525MaqPrdNum
            }
            , new Object[] {
            T01W044_A396EmprCod, T01W044_A764ProForCod, T01W044_A5191ProForLC
            }
            , new Object[] {
            T01W045_A396EmprCod, T01W045_A4686MaqTipArt, T01W045_A602MaqCod
            }
            , new Object[] {
            T01W046_A396EmprCod, T01W046_A3331LanBroCod, T01W046_A3333LanBroLin
            }
            , new Object[] {
            T01W047_A396EmprCod, T01W047_A602MaqCod, T01W047_A3047LOParId
            }
            , new Object[] {
            T01W048_A396EmprCod, T01W048_A129BarCod, T01W048_A132BarCodReo, T01W048_A130BarCodPar, T01W048_A2804RecLinMaq
            }
            , new Object[] {
            T01W049_A396EmprCod, T01W049_A602MaqCod, T01W049_A2461PlaFecTin
            }
            , new Object[] {
            T01W050_A396EmprCod, T01W050_A602MaqCod, T01W050_A2019MaqMadLin
            }
            , new Object[] {
            T01W051_A396EmprCod, T01W051_A602MaqCod, T01W051_A2014MaqConLin
            }
            , new Object[] {
            T01W052_A396EmprCod, T01W052_A1621CosTermCod, T01W052_A1615CosLin
            }
            , new Object[] {
            T01W053_A396EmprCod, T01W053_A602MaqCod, T01W053_A1142MaqFCod
            }
            , new Object[] {
            T01W054_A396EmprCod, T01W054_A602MaqCod, T01W054_A634MhiMes, T01W054_A632MhiAny
            }
            , new Object[] {
            T01W055_A396EmprCod, T01W055_A602MaqCod, T01W055_A320DesTecLin
            }
            , new Object[] {
            T01W056_A396EmprCod, T01W056_A602MaqCod, T01W056_A599MaqAny, T01W056_A614MaqMes
            }
            , new Object[] {
            T01W057_A396EmprCod, T01W057_A539HisBarCod, T01W057_A545HisCodReo, T01W057_A544HisCodPar, T01W057_A833TipDefCod
            }
            , new Object[] {
            T01W058_A396EmprCod, T01W058_A602MaqCod, T01W058_A558HisProFec
            }
            , new Object[] {
            T01W059_A396EmprCod, T01W059_A501GruMaqCod, T01W059_A602MaqCod
            }
            , new Object[] {
            T01W060_A396EmprCod, T01W060_A457FasCod
            }
            , new Object[] {
            T01W061_A396EmprCod, T01W061_A361DisCod
            }
            , new Object[] {
            T01W062_A396EmprCod, T01W062_A129BarCod, T01W062_A132BarCodReo, T01W062_A130BarCodPar, T01W062_A758ProCod, T01W062_A194BarOrdLin
            }
            , new Object[] {
            T01W063_A396EmprCod, T01W063_A602MaqCod
            }
            , new Object[] {
            T01W064_A602MaqCod, T01W064_A14529MqCAnyo, T01W064_A14530MqCMes, T01W064_A14534MqCMin, T01W064_n14534MqCMin, T01W064_A14535MqCMod, T01W064_n14535MqCMod, T01W064_A14536MqCMoi, T01W064_n14536MqCMoi, T01W064_A14537MqCEner,
            T01W064_n14537MqCEner, T01W064_A14538MqCGas, T01W064_n14538MqCGas, T01W064_A14539MqCAgua, T01W064_n14539MqCAgua, T01W064_A14540MqCAdCt, T01W064_n14540MqCAdCt, T01W064_A14541MqCAmo, T01W064_n14541MqCAmo, T01W064_A396EmprCod
            }
            , new Object[] {
            T01W065_A396EmprCod, T01W065_A602MaqCod, T01W065_A14529MqCAnyo, T01W065_A14530MqCMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W069_A396EmprCod, T01W069_A602MaqCod, T01W069_A14529MqCAnyo, T01W069_A14530MqCMes
            }
            , new Object[] {
            T01W070_A407EmprNom, T01W070_n407EmprNom
            }
         }
      );
      Z606MaqDsc = "" ;
      n606MaqDsc = false ;
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      Z602MaqCod = "" ;
      n602MaqCod = false ;
      A602MaqCod = "" ;
      n602MaqCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "CostesBasicos.TMAQCOS" ;
      Z14529MqCAnyo = (short)(0) ;
      A14529MqCAnyo = (short)(0) ;
      E14529MqCAnyo = (short)(0) ;
      Z14530MqCMes = (byte)(0) ;
      A14530MqCMes = (byte)(0) ;
      E14530MqCMes = (byte)(0) ;
      Z14530MqCMes = (byte)(0) ;
      A14530MqCMes = (byte)(0) ;
      E14530MqCMes = (byte)(0) ;
      Z14529MqCAnyo = (short)(0) ;
      A14529MqCAnyo = (short)(0) ;
      E14529MqCAnyo = (short)(0) ;
      Gx_date = GXutil.today( ) ;
   }

   private byte Z14530MqCMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A14530MqCMes ;
   private byte AV33TasasEstandar ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte E14530MqCMes ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z14529MqCAnyo ;
   private short nRcdDeleted_1913 ;
   private short nRcdExists_1913 ;
   private short nIsMod_1913 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1913 ;
   private short RcdFound1913 ;
   private short nBlankRcdUsr1913 ;
   private short A14529MqCAnyo ;
   private short RcdFound65 ;
   private short nIsDirty_65 ;
   private short E14529MqCAnyo ;
   private short nIsDirty_1913 ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int trnEnded ;
   private int edtMqCAdCt_Visible ;
   private int edtMqCAgua_Visible ;
   private int edtMqCAmo_Visible ;
   private int edtMqCEner_Visible ;
   private int edtMqCGas_Visible ;
   private int edtMqCMod_Visible ;
   private int edtMqCMoi_Visible ;
   private int edtMqCTotal_Visible ;
   private int edtMqCAdCt_Width ;
   private int edtMqCAgua_Width ;
   private int edtMqCAmo_Width ;
   private int edtMqCEner_Width ;
   private int edtMqCGas_Width ;
   private int edtMqCMod_Width ;
   private int edtMqCMoi_Width ;
   private int edtMqCTotal_Width ;
   private int edtMqCMin_Visible ;
   private int edtMqCMin_Width ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtavnRcdDeleted_1913_Enabled ;
   private int edtMqCAnyo_Enabled ;
   private int edtMqCMes_Enabled ;
   private int edtMqCMin_Enabled ;
   private int edtMqCMod_Enabled ;
   private int edtMqCMoi_Enabled ;
   private int edtMqCEner_Enabled ;
   private int edtMqCGas_Enabled ;
   private int edtMqCAgua_Enabled ;
   private int edtMqCAdCt_Enabled ;
   private int edtMqCAmo_Enabled ;
   private int edtMqCTotal_Enabled ;
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
   private int defedtMqCMes_Enabled ;
   private int defedtMqCAnyo_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqDsc_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z14534MqCMin ;
   private java.math.BigDecimal Z14535MqCMod ;
   private java.math.BigDecimal Z14536MqCMoi ;
   private java.math.BigDecimal Z14537MqCEner ;
   private java.math.BigDecimal Z14538MqCGas ;
   private java.math.BigDecimal Z14539MqCAgua ;
   private java.math.BigDecimal Z14540MqCAdCt ;
   private java.math.BigDecimal Z14541MqCAmo ;
   private java.math.BigDecimal A14534MqCMin ;
   private java.math.BigDecimal A14535MqCMod ;
   private java.math.BigDecimal A14536MqCMoi ;
   private java.math.BigDecimal A14537MqCEner ;
   private java.math.BigDecimal A14538MqCGas ;
   private java.math.BigDecimal A14539MqCAgua ;
   private java.math.BigDecimal A14540MqCAdCt ;
   private java.math.BigDecimal A14541MqCAmo ;
   private java.math.BigDecimal A14542MqCTotal ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA602MaqCod ;
   private String wcpOA606MaqDsc ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_40_idx="0001" ;
   private String edtMqCAdCt_Internalname ;
   private String edtMqCAgua_Internalname ;
   private String edtMqCAmo_Internalname ;
   private String edtMqCEner_Internalname ;
   private String edtMqCGas_Internalname ;
   private String edtMqCMod_Internalname ;
   private String edtMqCMoi_Internalname ;
   private String edtMqCTotal_Internalname ;
   private String edtMqCMin_Internalname ;
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
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String edtMaqDsc_Jsonclick ;
   private String sMode1913 ;
   private String edtavnRcdDeleted_1913_Internalname ;
   private String edtMqCAnyo_Internalname ;
   private String edtMqCMes_Internalname ;
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
   private String AV36Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode65 ;
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
   private String Z606MaqDsc ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1913_Jsonclick ;
   private String edtMqCAnyo_Jsonclick ;
   private String edtMqCMes_Jsonclick ;
   private String edtMqCMin_Jsonclick ;
   private String edtMqCMod_Jsonclick ;
   private String edtMqCMoi_Jsonclick ;
   private String edtMqCEner_Jsonclick ;
   private String edtMqCGas_Jsonclick ;
   private String edtMqCAgua_Jsonclick ;
   private String edtMqCAdCt_Jsonclick ;
   private String edtMqCAmo_Jsonclick ;
   private String edtMqCTotal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ606MaqDsc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n14534MqCMin ;
   private boolean n14535MqCMod ;
   private boolean n14536MqCMoi ;
   private boolean n14537MqCEner ;
   private boolean n14538MqCGas ;
   private boolean n14539MqCAgua ;
   private boolean n14540MqCAdCt ;
   private boolean n14541MqCAmo ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01W06_A407EmprNom ;
   private boolean[] T01W06_n407EmprNom ;
   private String[] T01W07_A602MaqCod ;
   private boolean[] T01W07_n602MaqCod ;
   private String[] T01W07_A606MaqDsc ;
   private boolean[] T01W07_n606MaqDsc ;
   private String[] T01W07_A407EmprNom ;
   private boolean[] T01W07_n407EmprNom ;
   private String[] T01W07_A396EmprCod ;
   private String[] T01W08_A396EmprCod ;
   private String[] T01W08_A602MaqCod ;
   private boolean[] T01W08_n602MaqCod ;
   private String[] T01W05_A602MaqCod ;
   private boolean[] T01W05_n602MaqCod ;
   private String[] T01W05_A606MaqDsc ;
   private boolean[] T01W05_n606MaqDsc ;
   private String[] T01W05_A396EmprCod ;
   private String[] T01W09_A396EmprCod ;
   private String[] T01W09_A602MaqCod ;
   private boolean[] T01W09_n602MaqCod ;
   private String[] T01W09_A606MaqDsc ;
   private boolean[] T01W09_n606MaqDsc ;
   private String[] T01W010_A396EmprCod ;
   private String[] T01W010_A602MaqCod ;
   private boolean[] T01W010_n602MaqCod ;
   private String[] T01W010_A606MaqDsc ;
   private boolean[] T01W010_n606MaqDsc ;
   private String[] T01W04_A602MaqCod ;
   private boolean[] T01W04_n602MaqCod ;
   private String[] T01W04_A606MaqDsc ;
   private boolean[] T01W04_n606MaqDsc ;
   private String[] T01W04_A396EmprCod ;
   private String[] T01W014_A396EmprCod ;
   private int[] T01W014_A129BarCod ;
   private byte[] T01W014_A132BarCodReo ;
   private String[] T01W014_A130BarCodPar ;
   private short[] T01W014_A14152MEnvOrd ;
   private String[] T01W015_A396EmprCod ;
   private int[] T01W015_A13604RARID ;
   private String[] T01W015_A602MaqCod ;
   private boolean[] T01W015_n602MaqCod ;
   private String[] T01W016_A396EmprCod ;
   private String[] T01W016_A602MaqCod ;
   private boolean[] T01W016_n602MaqCod ;
   private int[] T01W016_A13193MaqHdr ;
   private byte[] T01W016_A13194MaqHdrR ;
   private String[] T01W016_A13195MaqHdrP ;
   private short[] T01W016_A13196MaqRecLinM ;
   private String[] T01W017_A396EmprCod ;
   private int[] T01W017_A13137NCHdr ;
   private byte[] T01W017_A13138NCHdrr ;
   private String[] T01W017_A13139NCHdrp ;
   private String[] T01W018_A396EmprCod ;
   private int[] T01W018_A12673LavMqId ;
   private String[] T01W019_A396EmprCod ;
   private String[] T01W019_A602MaqCod ;
   private boolean[] T01W019_n602MaqCod ;
   private short[] T01W019_A12444MaqAnyNP ;
   private byte[] T01W019_A12445MaqMesNP ;
   private String[] T01W020_A396EmprCod ;
   private String[] T01W020_A602MaqCod ;
   private boolean[] T01W020_n602MaqCod ;
   private short[] T01W020_A12434MaqAnyM ;
   private byte[] T01W020_A12435MaqMesM ;
   private String[] T01W021_A396EmprCod ;
   private java.util.Date[] T01W021_A4929Inc_Dia ;
   private short[] T01W021_A5728JBCLLin ;
   private String[] T01W022_A396EmprCod ;
   private int[] T01W022_A11604PArtId ;
   private String[] T01W023_A396EmprCod ;
   private String[] T01W023_A602MaqCod ;
   private boolean[] T01W023_n602MaqCod ;
   private java.util.Date[] T01W023_A11445MaqFch ;
   private String[] T01W024_A396EmprCod ;
   private String[] T01W024_A602MaqCod ;
   private boolean[] T01W024_n602MaqCod ;
   private String[] T01W024_A11438MaqEquCod ;
   private String[] T01W024_A11439MaqSEqCod ;
   private String[] T01W024_A11440MaqPieCod ;
   private String[] T01W025_A396EmprCod ;
   private String[] T01W025_A602MaqCod ;
   private boolean[] T01W025_n602MaqCod ;
   private short[] T01W025_A11432MaqDocId ;
   private String[] T01W026_A396EmprCod ;
   private String[] T01W026_A602MaqCod ;
   private boolean[] T01W026_n602MaqCod ;
   private java.util.Date[] T01W026_A10111Mq_Dia ;
   private int[] T01W026_A10112Mq_Op ;
   private String[] T01W027_A396EmprCod ;
   private int[] T01W027_A252CliCod ;
   private String[] T01W027_A65ArtCod ;
   private String[] T01W027_A10041ArtSH ;
   private String[] T01W027_A10042ArtMqFa ;
   private String[] T01W028_A396EmprCod ;
   private String[] T01W028_A602MaqCod ;
   private boolean[] T01W028_n602MaqCod ;
   private java.util.Date[] T01W028_A74MaqTMuIni ;
   private String[] T01W029_A396EmprCod ;
   private String[] T01W029_A602MaqCod ;
   private boolean[] T01W029_n602MaqCod ;
   private String[] T01W029_A9725MaqFabC ;
   private String[] T01W030_A396EmprCod ;
   private int[] T01W030_A9428SMCod ;
   private String[] T01W031_A396EmprCod ;
   private int[] T01W031_A9429PMCod ;
   private String[] T01W032_A396EmprCod ;
   private int[] T01W032_A9425OMCod ;
   private String[] T01W033_A396EmprCod ;
   private String[] T01W033_A602MaqCod ;
   private boolean[] T01W033_n602MaqCod ;
   private String[] T01W033_A8008Maq_Prg ;
   private String[] T01W034_A396EmprCod ;
   private String[] T01W034_A602MaqCod ;
   private boolean[] T01W034_n602MaqCod ;
   private String[] T01W034_A6874CPROCORIG ;
   private String[] T01W035_A396EmprCod ;
   private int[] T01W035_A6319C_Barcod ;
   private byte[] T01W035_A6320C_Barcodre ;
   private String[] T01W035_A6321C_Barcodpa ;
   private short[] T01W035_A6322C_Reclinma ;
   private String[] T01W036_A396EmprCod ;
   private String[] T01W036_A602MaqCod ;
   private boolean[] T01W036_n602MaqCod ;
   private byte[] T01W036_A6260MaqTqn ;
   private String[] T01W037_A396EmprCod ;
   private short[] T01W037_A6188MaqTArt ;
   private String[] T01W037_A602MaqCod ;
   private boolean[] T01W037_n602MaqCod ;
   private String[] T01W038_A396EmprCod ;
   private String[] T01W038_A602MaqCod ;
   private boolean[] T01W038_n602MaqCod ;
   private int[] T01W038_A6078MaqCliCod ;
   private String[] T01W038_A6079MaqArtCod ;
   private String[] T01W039_A396EmprCod ;
   private byte[] T01W039_A6037Mq_Grupo ;
   private String[] T01W039_A602MaqCod ;
   private boolean[] T01W039_n602MaqCod ;
   private String[] T01W040_A396EmprCod ;
   private String[] T01W040_A6000CRCod ;
   private short[] T01W040_A6005CRLin ;
   private String[] T01W041_A396EmprCod ;
   private String[] T01W041_A602MaqCod ;
   private boolean[] T01W041_n602MaqCod ;
   private short[] T01W041_A5879PlaMTAOrd ;
   private String[] T01W042_A396EmprCod ;
   private String[] T01W042_A5603PrdNumM ;
   private String[] T01W042_A602MaqCod ;
   private boolean[] T01W042_n602MaqCod ;
   private String[] T01W043_A396EmprCod ;
   private String[] T01W043_A602MaqCod ;
   private boolean[] T01W043_n602MaqCod ;
   private String[] T01W043_A5525MaqPrdNum ;
   private String[] T01W044_A396EmprCod ;
   private String[] T01W044_A764ProForCod ;
   private short[] T01W044_A5191ProForLC ;
   private String[] T01W045_A396EmprCod ;
   private short[] T01W045_A4686MaqTipArt ;
   private String[] T01W045_A602MaqCod ;
   private boolean[] T01W045_n602MaqCod ;
   private String[] T01W046_A396EmprCod ;
   private byte[] T01W046_A3331LanBroCod ;
   private short[] T01W046_A3333LanBroLin ;
   private String[] T01W047_A396EmprCod ;
   private String[] T01W047_A602MaqCod ;
   private boolean[] T01W047_n602MaqCod ;
   private String[] T01W047_A3047LOParId ;
   private String[] T01W048_A396EmprCod ;
   private int[] T01W048_A129BarCod ;
   private byte[] T01W048_A132BarCodReo ;
   private String[] T01W048_A130BarCodPar ;
   private short[] T01W048_A2804RecLinMaq ;
   private String[] T01W049_A396EmprCod ;
   private String[] T01W049_A602MaqCod ;
   private boolean[] T01W049_n602MaqCod ;
   private java.util.Date[] T01W049_A2461PlaFecTin ;
   private String[] T01W050_A396EmprCod ;
   private String[] T01W050_A602MaqCod ;
   private boolean[] T01W050_n602MaqCod ;
   private short[] T01W050_A2019MaqMadLin ;
   private String[] T01W051_A396EmprCod ;
   private String[] T01W051_A602MaqCod ;
   private boolean[] T01W051_n602MaqCod ;
   private short[] T01W051_A2014MaqConLin ;
   private String[] T01W052_A396EmprCod ;
   private String[] T01W052_A1621CosTermCod ;
   private int[] T01W052_A1615CosLin ;
   private String[] T01W053_A396EmprCod ;
   private String[] T01W053_A602MaqCod ;
   private boolean[] T01W053_n602MaqCod ;
   private String[] T01W053_A1142MaqFCod ;
   private String[] T01W054_A396EmprCod ;
   private String[] T01W054_A602MaqCod ;
   private boolean[] T01W054_n602MaqCod ;
   private byte[] T01W054_A634MhiMes ;
   private short[] T01W054_A632MhiAny ;
   private String[] T01W055_A396EmprCod ;
   private String[] T01W055_A602MaqCod ;
   private boolean[] T01W055_n602MaqCod ;
   private byte[] T01W055_A320DesTecLin ;
   private String[] T01W056_A396EmprCod ;
   private String[] T01W056_A602MaqCod ;
   private boolean[] T01W056_n602MaqCod ;
   private short[] T01W056_A599MaqAny ;
   private byte[] T01W056_A614MaqMes ;
   private String[] T01W057_A396EmprCod ;
   private int[] T01W057_A539HisBarCod ;
   private byte[] T01W057_A545HisCodReo ;
   private String[] T01W057_A544HisCodPar ;
   private short[] T01W057_A833TipDefCod ;
   private String[] T01W058_A396EmprCod ;
   private String[] T01W058_A602MaqCod ;
   private boolean[] T01W058_n602MaqCod ;
   private java.util.Date[] T01W058_A558HisProFec ;
   private String[] T01W059_A396EmprCod ;
   private String[] T01W059_A501GruMaqCod ;
   private String[] T01W059_A602MaqCod ;
   private boolean[] T01W059_n602MaqCod ;
   private String[] T01W060_A396EmprCod ;
   private String[] T01W060_A457FasCod ;
   private String[] T01W061_A396EmprCod ;
   private int[] T01W061_A361DisCod ;
   private String[] T01W062_A396EmprCod ;
   private int[] T01W062_A129BarCod ;
   private byte[] T01W062_A132BarCodReo ;
   private String[] T01W062_A130BarCodPar ;
   private String[] T01W062_A758ProCod ;
   private short[] T01W062_A194BarOrdLin ;
   private String[] T01W063_A396EmprCod ;
   private String[] T01W063_A602MaqCod ;
   private boolean[] T01W063_n602MaqCod ;
   private String[] T01W064_A602MaqCod ;
   private boolean[] T01W064_n602MaqCod ;
   private short[] T01W064_A14529MqCAnyo ;
   private byte[] T01W064_A14530MqCMes ;
   private java.math.BigDecimal[] T01W064_A14534MqCMin ;
   private boolean[] T01W064_n14534MqCMin ;
   private java.math.BigDecimal[] T01W064_A14535MqCMod ;
   private boolean[] T01W064_n14535MqCMod ;
   private java.math.BigDecimal[] T01W064_A14536MqCMoi ;
   private boolean[] T01W064_n14536MqCMoi ;
   private java.math.BigDecimal[] T01W064_A14537MqCEner ;
   private boolean[] T01W064_n14537MqCEner ;
   private java.math.BigDecimal[] T01W064_A14538MqCGas ;
   private boolean[] T01W064_n14538MqCGas ;
   private java.math.BigDecimal[] T01W064_A14539MqCAgua ;
   private boolean[] T01W064_n14539MqCAgua ;
   private java.math.BigDecimal[] T01W064_A14540MqCAdCt ;
   private boolean[] T01W064_n14540MqCAdCt ;
   private java.math.BigDecimal[] T01W064_A14541MqCAmo ;
   private boolean[] T01W064_n14541MqCAmo ;
   private String[] T01W064_A396EmprCod ;
   private String[] T01W065_A396EmprCod ;
   private String[] T01W065_A602MaqCod ;
   private boolean[] T01W065_n602MaqCod ;
   private short[] T01W065_A14529MqCAnyo ;
   private byte[] T01W065_A14530MqCMes ;
   private String[] T01W03_A602MaqCod ;
   private boolean[] T01W03_n602MaqCod ;
   private short[] T01W03_A14529MqCAnyo ;
   private byte[] T01W03_A14530MqCMes ;
   private java.math.BigDecimal[] T01W03_A14534MqCMin ;
   private boolean[] T01W03_n14534MqCMin ;
   private java.math.BigDecimal[] T01W03_A14535MqCMod ;
   private boolean[] T01W03_n14535MqCMod ;
   private java.math.BigDecimal[] T01W03_A14536MqCMoi ;
   private boolean[] T01W03_n14536MqCMoi ;
   private java.math.BigDecimal[] T01W03_A14537MqCEner ;
   private boolean[] T01W03_n14537MqCEner ;
   private java.math.BigDecimal[] T01W03_A14538MqCGas ;
   private boolean[] T01W03_n14538MqCGas ;
   private java.math.BigDecimal[] T01W03_A14539MqCAgua ;
   private boolean[] T01W03_n14539MqCAgua ;
   private java.math.BigDecimal[] T01W03_A14540MqCAdCt ;
   private boolean[] T01W03_n14540MqCAdCt ;
   private java.math.BigDecimal[] T01W03_A14541MqCAmo ;
   private boolean[] T01W03_n14541MqCAmo ;
   private String[] T01W03_A396EmprCod ;
   private String[] T01W02_A602MaqCod ;
   private boolean[] T01W02_n602MaqCod ;
   private short[] T01W02_A14529MqCAnyo ;
   private byte[] T01W02_A14530MqCMes ;
   private java.math.BigDecimal[] T01W02_A14534MqCMin ;
   private boolean[] T01W02_n14534MqCMin ;
   private java.math.BigDecimal[] T01W02_A14535MqCMod ;
   private boolean[] T01W02_n14535MqCMod ;
   private java.math.BigDecimal[] T01W02_A14536MqCMoi ;
   private boolean[] T01W02_n14536MqCMoi ;
   private java.math.BigDecimal[] T01W02_A14537MqCEner ;
   private boolean[] T01W02_n14537MqCEner ;
   private java.math.BigDecimal[] T01W02_A14538MqCGas ;
   private boolean[] T01W02_n14538MqCGas ;
   private java.math.BigDecimal[] T01W02_A14539MqCAgua ;
   private boolean[] T01W02_n14539MqCAgua ;
   private java.math.BigDecimal[] T01W02_A14540MqCAdCt ;
   private boolean[] T01W02_n14540MqCAdCt ;
   private java.math.BigDecimal[] T01W02_A14541MqCAmo ;
   private boolean[] T01W02_n14541MqCAmo ;
   private String[] T01W02_A396EmprCod ;
   private String[] T01W069_A396EmprCod ;
   private String[] T01W069_A602MaqCod ;
   private boolean[] T01W069_n602MaqCod ;
   private short[] T01W069_A14529MqCAnyo ;
   private byte[] T01W069_A14530MqCMes ;
   private String[] T01W070_A407EmprNom ;
   private boolean[] T01W070_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmaqcos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqcos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqcos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqcos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqcos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W02", "SELECT MaqCod, MqCAnyo, MqCMes, MqCMin, MqCMod, MqCMoi, MqCEner, MqCGas, MqCAgua, MqCAdCt, MqCAmo, EmprCod FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ?  FOR UPDATE OF MqCMin, MqCMod, MqCMoi, MqCEner, MqCGas, MqCAgua, MqCAdCt, MqCAmo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W03", "SELECT MaqCod, MqCAnyo, MqCMes, MqCMin, MqCMod, MqCMoi, MqCEner, MqCGas, MqCAgua, MqCAdCt, MqCAmo, EmprCod FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W04", "SELECT MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ?  FOR UPDATE OF MaqDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W05", "SELECT MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W06", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W07", "SELECT /*+ FIRST_ROWS(1) */ TM1.MaqCod, TM1.MaqDsc, T2.EmprNom, TM1.EmprCod FROM (TXPMAQUIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.MaqDsc = ? ORDER BY TM1.EmprCod, TM1.MaqCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W08", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W09", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? and MaqDsc = ? ORDER BY EmprCod, MaqCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W010", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? and MaqDsc = ? ORDER BY EmprCod DESC, MaqCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W011", "INSERT INTO TXPMAQUIN(MaqCod, MaqDsc, EmprCod, MaqCodFor, MaqVolMax, MaqVolMin, MaqVolMed, MaqTemMax, MaqChp, MaqTinTip, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqFasUni, MaqConUlt, MaqMadUlt, MaqMicro, MaqVolRes, MaqVolTop, MaqCapac, MaqPri, MaqNhd, MaqNroTub, MaqRelBan, MaqTipMaq, TipMaqCod, MaqFormul, MaqKgsMin, MaqKgsMed, MaqKgsMax, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqCCoCod, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqPasw, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqUltDoc, MaqDTTipo, MaqDTMar, MaqDTMod, MaqDTRef, MaqDTSer, MaqDTFab, MaqDTOri, MaqDTAdqFc, MaqDTAdqFo, MaqDTPrv, MaqDTPrvDi, MaqDTAdqCo, MaqDTRepCo, MaqDTCar, MaqDTVolt, MaqDTReq, MaqDTMnt, MaqDTCal, MaqDTServ, MaqDTInv, MaqDTGarIn, MaqDTGarFi, MaqVolBal, MaqCosGen, MaqOgtId, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqDscLarg, MaqCuerdas, MaqGI, MaqAdCent, MaqAmort) VALUES(?, ?, ?, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T01W012", "UPDATE TXPMAQUIN SET MaqDsc=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T01W013", "DELETE FROM TXPMAQUIN  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new ForEachCursor("T01W014", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND MEnvMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W015", "SELECT * FROM (SELECT EmprCod, RARID, MaqCod FROM TXPDSPRA3 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W016", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W017", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W018", "SELECT * FROM (SELECT EmprCod, LavMqId FROM TXPLAVMQ0 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W019", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W020", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W021", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W022", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W023", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFch FROM TXPMAQUSO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W024", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W025", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqDocId FROM TXPMaqDoc WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W026", "SELECT * FROM (SELECT EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W027", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND ArtMqFa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W028", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTMuIni FROM TXPMAQTMU WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W029", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFabC FROM TXPMAQFAB WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W030", "SELECT * FROM (SELECT EmprCod, SMCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W031", "SELECT * FROM (SELECT EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? AND PMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W032", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W033", "SELECT * FROM (SELECT EmprCod, MaqCod, Maq_Prg FROM TXPMAQPRG WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W034", "SELECT * FROM (SELECT EmprCod, MaqCod, CPROCORIG FROM TXPCONVPR WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W035", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W036", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTqn FROM TXPMAQTNQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W037", "SELECT * FROM (SELECT EmprCod, MaqTArt, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W038", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W039", "SELECT * FROM (SELECT EmprCod, Mq_Grupo, MaqCod FROM TXPMAQGR1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W040", "SELECT * FROM (SELECT EmprCod, CRCod, CRLin FROM TXPLCOSRE WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W041", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaMTAOrd FROM TXPPlaMaq WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W042", "SELECT * FROM (SELECT EmprCod, PrdNumM, MaqCod FROM TXPPRDMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W043", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqPrdNum FROM TXPMAQPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W044", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W045", "SELECT * FROM (SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W046", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W047", "SELECT * FROM (SELECT EmprCod, MaqCod, LOParId FROM TXPLOMaqP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W048", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W049", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W050", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqMadLin FROM TXPLMAQMA WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W051", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqConLin FROM TXPLMAQCO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W052", "SELECT * FROM (SELECT EmprCod, CosTermCod, CosLin FROM TXPCOSTES WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W053", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W054", "SELECT * FROM (SELECT EmprCod, MaqCod, MhiMes, MhiAny FROM TXPCMHPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W055", "SELECT * FROM (SELECT EmprCod, MaqCod, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W056", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W057", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W058", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W059", "SELECT * FROM (SELECT EmprCod, GruMaqCod, MaqCod FROM TXPGRULIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W060", "SELECT * FROM (SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W061", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND MaqCodDis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W062", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND MaqCodBis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W063", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? and MaqDsc = ? ORDER BY EmprCod, MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W064", "SELECT MaqCod, MqCAnyo, MqCMes, MqCMin, MqCMod, MqCMoi, MqCEner, MqCGas, MqCAgua, MqCAdCt, MqCAmo, EmprCod FROM TXPMAQCOS WHERE EmprCod = ? and MaqCod = ? and MqCAnyo = ? and MqCMes = ? ORDER BY EmprCod, MaqCod, MqCAnyo, MqCMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W065", "SELECT EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01W066", "INSERT INTO TXPMAQCOS(MaqCod, MqCAnyo, MqCMes, MqCMin, MqCMod, MqCMoi, MqCEner, MqCGas, MqCAgua, MqCAdCt, MqCAmo, EmprCod, MqCgi) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMAQCOS")
         ,new UpdateCursor("T01W067", "UPDATE TXPMAQCOS SET MqCMin=?, MqCMod=?, MqCMoi=?, MqCEner=?, MqCGas=?, MqCAgua=?, MqCAdCt=?, MqCAmo=?  WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ?", GX_NOMASK, "TXPMAQCOS")
         ,new UpdateCursor("T01W068", "DELETE FROM TXPMAQCOS  WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ?", GX_NOMASK, "TXPMAQCOS")
         ,new ForEachCursor("T01W069", "SELECT EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, MqCAnyo, MqCMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W070", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,4);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 68 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setString(3, (String)parms[4], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 11 :
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
            case 12 :
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
            case 13 :
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
            case 14 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 17 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 20 :
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
            case 21 :
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
            case 22 :
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
            case 23 :
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
            case 24 :
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
            case 26 :
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
            case 27 :
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
            case 28 :
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
            case 29 :
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
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
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
            case 31 :
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
            case 32 :
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
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
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
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 4);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 4);
               }
               stmt.setString(12, (String)parms[20], 3);
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 4);
               }
               stmt.setString(9, (String)parms[16], 3);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 6);
               }
               stmt.setShort(11, ((Number) parms[19]).shortValue());
               stmt.setByte(12, ((Number) parms[20]).byteValue());
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 67 :
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
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

