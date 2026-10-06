package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tldes02_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
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
         gxload_15( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2107PasCod = httpContext.GetPar( "PasCod") ;
         n2107PasCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A2107PasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
            A13324LDESID = (int)(GXutil.lval( httpContext.GetPar( "LDESID"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
            A13333LDESNPeque = httpContext.GetPar( "LDESNPeque") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13333LDESNPeque", A13333LDESNPeque);
            A13337LDESComb = httpContext.GetPar( "LDESComb") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13337LDESComb", A13337LDESComb);
            A13339LDESFondo = httpContext.GetPar( "LDESFondo") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13339LDESFondo", A13339LDESFondo);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Lab Dip Estampacion (Productos,Pasta)", ""), (short)(0)) ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A13345LDESUltLP = (short)(GXutil.lval( httpContext.GetPar( "LDESUltLP"))) ;
      n13345LDESUltLP = false ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A13346LDESUltP = (short)(GXutil.lval( httpContext.GetPar( "LDESUltP"))) ;
      n13346LDESUltP = false ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tldes02_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tldes02_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tldes02_impl.class ));
   }

   public tldes02_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLDES02.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "ID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESID_Internalname, GXutil.ltrim( localUtil.ntoc( A13324LDESID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLDESID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13324LDESID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13324LDESID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESID_Jsonclick, 0, "", "", "", "", "", 1, edtLDESID_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "N Peque", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESNPeque_Internalname, GXutil.rtrim( A13333LDESNPeque), GXutil.rtrim( localUtil.format( A13333LDESNPeque, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESNPeque_Jsonclick, 0, "", "", "", "", "", 1, edtLDESNPeque_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Combinacion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESComb_Internalname, GXutil.rtrim( A13337LDESComb), GXutil.rtrim( localUtil.format( A13337LDESComb, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESComb_Jsonclick, 0, "", "", "", "", "", 1, edtLDESComb_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fondo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESFondo_Internalname, GXutil.rtrim( A13339LDESFondo), GXutil.rtrim( localUtil.format( A13339LDESFondo, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESFondo_Jsonclick, 0, "", "", "", "", "", 1, edtLDESFondo_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima linea Pastas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESUltP_Internalname, GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLDESUltP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13346LDESUltP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13346LDESUltP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESUltP_Jsonclick, 0, "", "", "", "", "", 1, edtLDESUltP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Ultima Linea Productos", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESUltLP_Internalname, GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLDESUltLP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13345LDESUltLP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13345LDESUltLP), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESUltLP_Jsonclick, 0, "", "", "", "", "", 1, edtLDESUltLP_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1827 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1827 = (short)(1) ;
            scanStart1NT1827( ) ;
            while ( RcdFound1827 != 0 )
            {
               init_level_properties1827( ) ;
               getByPrimaryKey1NT1827( ) ;
               addRow1NT1827( ) ;
               scanNext1NT1827( ) ;
            }
            scanEnd1NT1827( ) ;
            nBlankRcdCount1827 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13346LDESUltP = A13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         B13345LDESUltLP = A13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         standaloneNotModal1NT1827( ) ;
         standaloneModal1NT1827( ) ;
         sMode1827 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1NT1827( ) ;
            edtavnRcdDeleted_1827_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1827_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1827_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1827_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtLDESLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESLINEA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtLDESCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCANT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCant_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtLDESUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESUND_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUnd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1827 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NT1827( ) ;
            }
            sendRow1NT1827( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1827 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13346LDESUltP = B13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         A13345LDESUltLP = B13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1827 = (short)(5) ;
         nRcdExists_1827 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NT1827( ) ;
            while ( RcdFound1827 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601827( ) ;
               init_level_properties1827( ) ;
               standaloneNotModal1NT1827( ) ;
               getByPrimaryKey1NT1827( ) ;
               standaloneModal1NT1827( ) ;
               addRow1NT1827( ) ;
               scanNext1NT1827( ) ;
            }
            scanEnd1NT1827( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1827 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601827( ) ;
      initAll1NT1827( ) ;
      init_level_properties1827( ) ;
      B13346LDESUltP = A13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      B13345LDESUltLP = A13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      nRcdExists_1827 = (short)(0) ;
      nIsMod_1827 = (short)(0) ;
      nRcdDeleted_1827 = (short)(0) ;
      nBlankRcdCount1827 = (short)(nBlankRcdUsr1827+nBlankRcdCount1827) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1827 > 0 )
      {
         standaloneNotModal1NT1827( ) ;
         standaloneModal1NT1827( ) ;
         addRow1NT1827( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLDESLinea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1827 = (short)(nBlankRcdCount1827-1) ;
      }
      Gx_mode = sMode1827 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13346LDESUltP = B13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      A13345LDESUltLP = B13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
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
         nBlankRcdCount1826 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1826 = (short)(1) ;
            scanStart1NT1826( ) ;
            while ( RcdFound1826 != 0 )
            {
               init_level_properties1826( ) ;
               getByPrimaryKey1NT1826( ) ;
               addRow1NT1826( ) ;
               scanNext1NT1826( ) ;
            }
            scanEnd1NT1826( ) ;
            nBlankRcdCount1826 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13346LDESUltP = A13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         B13345LDESUltLP = A13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         standaloneNotModal1NT1826( ) ;
         standaloneModal1NT1826( ) ;
         sMode1826 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow1NT1826( ) ;
            edtavnRcdDeleted_1826_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1826_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1826_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1826_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtLDESLinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESLINP_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtPasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASCOD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasCod_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtPasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASDSC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtLDESCantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCANTP_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESCantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCantP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1826 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NT1826( ) ;
            }
            sendRow1NT1826( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1826 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13346LDESUltP = B13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         A13345LDESUltLP = B13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1826 = (short)(5) ;
         nRcdExists_1826 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NT1826( ) ;
            while ( RcdFound1826 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701826( ) ;
               init_level_properties1826( ) ;
               standaloneNotModal1NT1826( ) ;
               getByPrimaryKey1NT1826( ) ;
               standaloneModal1NT1826( ) ;
               addRow1NT1826( ) ;
               scanNext1NT1826( ) ;
            }
            scanEnd1NT1826( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1826 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701826( ) ;
      initAll1NT1826( ) ;
      init_level_properties1826( ) ;
      B13346LDESUltP = A13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      B13345LDESUltLP = A13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      nRcdExists_1826 = (short)(0) ;
      nIsMod_1826 = (short)(0) ;
      nRcdDeleted_1826 = (short)(0) ;
      nBlankRcdCount1826 = (short)(nBlankRcdUsr1826+nBlankRcdCount1826) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1826 > 0 )
      {
         standaloneNotModal1NT1826( ) ;
         standaloneModal1NT1826( ) ;
         addRow1NT1826( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLDESLinP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1826 = (short)(nBlankRcdCount1826-1) ;
      }
      Gx_mode = sMode1826 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13346LDESUltP = B13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      A13345LDESUltLP = B13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container, subGrid2_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TLDES02.htm");
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
      e111NT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13324LDESID = (int)(localUtil.ctol( httpContext.cgiGet( "Z13324LDESID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13333LDESNPeque = httpContext.cgiGet( "Z13333LDESNPeque") ;
            Z13337LDESComb = httpContext.cgiGet( "Z13337LDESComb") ;
            Z13339LDESFondo = httpContext.cgiGet( "Z13339LDESFondo") ;
            Z13346LDESUltP = (short)(localUtil.ctol( httpContext.cgiGet( "Z13346LDESUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13345LDESUltLP = (short)(localUtil.ctol( httpContext.cgiGet( "Z13345LDESUltLP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13346LDESUltP = (short)(localUtil.ctol( httpContext.cgiGet( "O13346LDESUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13345LDESUltLP = (short)(localUtil.ctol( httpContext.cgiGet( "O13345LDESUltLP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A13324LDESID = (int)(localUtil.ctol( httpContext.cgiGet( edtLDESID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
            A13333LDESNPeque = httpContext.cgiGet( edtLDESNPeque_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13333LDESNPeque", A13333LDESNPeque);
            A13337LDESComb = GXutil.upper( httpContext.cgiGet( edtLDESComb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13337LDESComb", A13337LDESComb);
            A13339LDESFondo = GXutil.upper( httpContext.cgiGet( edtLDESFondo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13339LDESFondo", A13339LDESFondo);
            A13346LDESUltP = (short)(localUtil.ctol( httpContext.cgiGet( edtLDESUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13346LDESUltP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
            A13345LDESUltLP = (short)(localUtil.ctol( httpContext.cgiGet( edtLDESUltLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13345LDESUltLP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A13324LDESID = (int)(GXutil.lval( httpContext.GetPar( "LDESID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
               A13333LDESNPeque = httpContext.GetPar( "LDESNPeque") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13333LDESNPeque", A13333LDESNPeque);
               A13337LDESComb = httpContext.GetPar( "LDESComb") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13337LDESComb", A13337LDESComb);
               A13339LDESFondo = httpContext.GetPar( "LDESFondo") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13339LDESFondo", A13339LDESFondo);
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
                        e111NT2 ();
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
            initAll1NT1825( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1827_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1827_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1826_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1826_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributes1NT1825( ) ;
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

   public void confirm_1NT0( )
   {
      beforeValidate1NT1825( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NT1825( ) ;
         }
         else
         {
            checkExtendedTable1NT1825( ) ;
            if ( AnyError == 0 )
            {
               zm1NT1825( 12) ;
               zm1NT1825( 13) ;
            }
            closeExtendedTableCursors1NT1825( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1825 = Gx_mode ;
         confirm_1NT1827( ) ;
         if ( AnyError == 0 )
         {
            confirm_1NT1826( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode1825 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1NT0( ) ;
      }
   }

   public void confirm_1NT1826( )
   {
      s13346LDESUltP = O13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1NT1826( ) ;
         if ( ( nRcdExists_1826 != 0 ) || ( nIsMod_1826 != 0 ) )
         {
            getKey1NT1826( ) ;
            if ( ( nRcdExists_1826 == 0 ) && ( nRcdDeleted_1826 == 0 ) )
            {
               if ( RcdFound1826 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NT1826( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NT1826( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1NT1826( 17) ;
                     }
                     closeExtendedTableCursors1NT1826( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13346LDESUltP = A13346LDESUltP ;
                     n13346LDESUltP = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "LDESLINP_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLDESLinP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1826 != 0 )
               {
                  if ( nRcdDeleted_1826 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NT1826( ) ;
                     load1NT1826( ) ;
                     beforeValidate1NT1826( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NT1826( ) ;
                        O13346LDESUltP = A13346LDESUltP ;
                        n13346LDESUltP = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1826 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NT1826( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NT1826( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1NT1826( 17) ;
                           }
                           closeExtendedTableCursors1NT1826( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13346LDESUltP = A13346LDESUltP ;
                           n13346LDESUltP = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1826 == 0 )
                  {
                     GXCCtl = "LDESLINP_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESLinP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1826_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESLinP_Internalname, GXutil.ltrim( localUtil.ntoc( A13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasCod_Internalname, GXutil.rtrim( A2107PasCod)) ;
         httpContext.changePostValue( edtPasDsc_Internalname, GXutil.rtrim( A2108PasDsc)) ;
         httpContext.changePostValue( edtLDESCantP_Internalname, GXutil.ltrim( localUtil.ntoc( A13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13340LDESLinP_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13341LDESCantP_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_70_idx, GXutil.rtrim( Z2107PasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1826_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1826_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1826_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1826 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1826_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1826_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESLINP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASCOD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASDSC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCANTP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13346LDESUltP = s13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1NT1827( )
   {
      s13345LDESUltLP = O13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1NT1827( ) ;
         if ( ( nRcdExists_1827 != 0 ) || ( nIsMod_1827 != 0 ) )
         {
            getKey1NT1827( ) ;
            if ( ( nRcdExists_1827 == 0 ) && ( nRcdDeleted_1827 == 0 ) )
            {
               if ( RcdFound1827 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NT1827( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NT1827( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1NT1827( 15) ;
                     }
                     closeExtendedTableCursors1NT1827( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13345LDESUltLP = A13345LDESUltLP ;
                     n13345LDESUltLP = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "LDESLINEA_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLDESLinea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1827 != 0 )
               {
                  if ( nRcdDeleted_1827 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NT1827( ) ;
                     load1NT1827( ) ;
                     beforeValidate1NT1827( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NT1827( ) ;
                        O13345LDESUltLP = A13345LDESUltLP ;
                        n13345LDESUltLP = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1827 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NT1827( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NT1827( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1NT1827( 15) ;
                           }
                           closeExtendedTableCursors1NT1827( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13345LDESUltLP = A13345LDESUltLP ;
                           n13345LDESUltLP = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1827 == 0 )
                  {
                     GXCCtl = "LDESLINEA_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESLinea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1827_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESLinea_Internalname, GXutil.ltrim( localUtil.ntoc( A13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtLDESCant_Internalname, GXutil.ltrim( localUtil.ntoc( A13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESUnd_Internalname, GXutil.rtrim( A13344LDESUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z13342LDESLinea_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13344LDESUnd_"+sGXsfl_60_idx, GXutil.rtrim( Z13344LDESUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z13343LDESCant_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_60_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1827_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1827_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1827_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1827 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1827_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1827_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESLINEA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCANT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESUND_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13345LDESUltLP = s13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NT0( )
   {
   }

   public void e111NT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tldes02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tldes02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tldes02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tldes02_impl.this.A396EmprCod = GXv_char2[0] ;
      tldes02_impl.this.AV11EmprNom = GXv_char3[0] ;
      tldes02_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV33ContCod1 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LDES00", ""), GXv_int6) ;
      tldes02_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33ContCod1 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod1", GXutil.str( AV33ContCod1, 1, 0));
      if ( AV33ContCod1 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Falta crear el contador de LAB DIP, LDES00", ""));
         httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A13324LDESID),A13333LDESNPeque,A13337LDESComb,A13339LDESFondo});
         httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A13324LDESID","A13333LDESNPeque","A13337LDESComb","A13339LDESFondo"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void zm1NT1825( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13346LDESUltP = T01NT9_A13346LDESUltP[0] ;
            Z13345LDESUltLP = T01NT9_A13345LDESUltLP[0] ;
         }
         else
         {
            Z13346LDESUltP = A13346LDESUltP ;
            Z13345LDESUltLP = A13345LDESUltLP ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13346LDESUltP = A13346LDESUltP ;
         Z13345LDESUltLP = A13345LDESUltLP ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtLDESUltLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), true);
      edtLDESUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), true);
      AV36Pgmname = "TLDES02" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtLDESUltLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), true);
      edtLDESUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), true);
      /* Using cursor T01NT10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NT10_A407EmprNom[0] ;
      n407EmprNom = T01NT10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      /* Using cursor T01NT11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Peques", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LDESNPEQUE");
         AnyError = (short)(1) ;
      }
      pr_default.close(9);
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

   public void load1NT1825( )
   {
      /* Using cursor T01NT12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1825 = (short)(1) ;
         A407EmprNom = T01NT12_A407EmprNom[0] ;
         n407EmprNom = T01NT12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13346LDESUltP = T01NT12_A13346LDESUltP[0] ;
         n13346LDESUltP = T01NT12_n13346LDESUltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         A13345LDESUltLP = T01NT12_A13345LDESUltLP[0] ;
         n13345LDESUltLP = T01NT12_n13345LDESUltLP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         zm1NT1825( -11) ;
      }
      pr_default.close(10);
      onLoadActions1NT1825( ) ;
   }

   public void onLoadActions1NT1825( )
   {
   }

   public void checkExtendedTable1NT1825( )
   {
      nIsDirty_1825 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1NT1825( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1NT1825( )
   {
      /* Using cursor T01NT13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1825 = (short)(1) ;
      }
      else
      {
         RcdFound1825 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NT9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01NT9_A13337LDESComb[0], A13337LDESComb) == 0 ) && ( GXutil.strcmp(T01NT9_A13339LDESFondo[0], A13339LDESFondo) == 0 ) && ( GXutil.strcmp(T01NT9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NT9_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NT9_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) )
      {
         zm1NT1825( 11) ;
         RcdFound1825 = (short)(1) ;
         A13346LDESUltP = T01NT9_A13346LDESUltP[0] ;
         n13346LDESUltP = T01NT9_n13346LDESUltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         A13345LDESUltLP = T01NT9_A13345LDESUltLP[0] ;
         n13345LDESUltLP = T01NT9_n13345LDESUltLP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         O13346LDESUltP = A13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         O13345LDESUltLP = A13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         sMode1825 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1NT1825( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1825 = (short)(0) ;
            initializeNonKey1NT1825( ) ;
         }
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1825 = (short)(0) ;
         initializeNonKey1NT1825( ) ;
         sMode1825 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1NT1825( ) ;
      if ( RcdFound1825 == 0 )
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
      RcdFound1825 = (short)(0) ;
      /* Using cursor T01NT14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01NT14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NT14_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NT14_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) && ( GXutil.strcmp(T01NT14_A13337LDESComb[0], A13337LDESComb) == 0 ) && ( GXutil.strcmp(T01NT14_A13339LDESFondo[0], A13339LDESFondo) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01NT14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NT14_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NT14_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) && ( GXutil.strcmp(T01NT14_A13337LDESComb[0], A13337LDESComb) == 0 ) && ( GXutil.strcmp(T01NT14_A13339LDESFondo[0], A13339LDESFondo) == 0 ) )
         {
            RcdFound1825 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1825 = (short)(0) ;
      /* Using cursor T01NT15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01NT15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NT15_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NT15_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) && ( GXutil.strcmp(T01NT15_A13337LDESComb[0], A13337LDESComb) == 0 ) && ( GXutil.strcmp(T01NT15_A13339LDESFondo[0], A13339LDESFondo) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(T01NT15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NT15_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NT15_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) && ( GXutil.strcmp(T01NT15_A13337LDESComb[0], A13337LDESComb) == 0 ) && ( GXutil.strcmp(T01NT15_A13339LDESFondo[0], A13339LDESFondo) == 0 ) )
         {
            RcdFound1825 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NT1825( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13345LDESUltLP = O13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         A13346LDESUltP = O13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         insert1NT1825( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1825 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) || ( GXutil.strcmp(A13337LDESComb, Z13337LDESComb) != 0 ) || ( GXutil.strcmp(A13339LDESFondo, Z13339LDESFondo) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13345LDESUltLP = O13345LDESUltLP ;
               n13345LDESUltLP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
               A13346LDESUltP = O13346LDESUltP ;
               n13346LDESUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A13345LDESUltLP = O13345LDESUltLP ;
               n13345LDESUltLP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
               A13346LDESUltP = O13346LDESUltP ;
               n13346LDESUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
               update1NT1825( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) || ( GXutil.strcmp(A13337LDESComb, Z13337LDESComb) != 0 ) || ( GXutil.strcmp(A13339LDESFondo, Z13339LDESFondo) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A13345LDESUltLP = O13345LDESUltLP ;
               n13345LDESUltLP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
               A13346LDESUltP = O13346LDESUltP ;
               n13346LDESUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
               insert1NT1825( ) ;
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
                  A13345LDESUltLP = O13345LDESUltLP ;
                  n13345LDESUltLP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
                  A13346LDESUltP = O13346LDESUltP ;
                  n13346LDESUltP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
                  insert1NT1825( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) || ( GXutil.strcmp(A13337LDESComb, Z13337LDESComb) != 0 ) || ( GXutil.strcmp(A13339LDESFondo, Z13339LDESFondo) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13345LDESUltLP = O13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         A13346LDESUltP = O13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
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
      getKey1NT1825( ) ;
      if ( RcdFound1825 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) || ( GXutil.strcmp(A13337LDESComb, Z13337LDESComb) != 0 ) || ( GXutil.strcmp(A13339LDESFondo, Z13339LDESFondo) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) || ( GXutil.strcmp(A13337LDESComb, Z13337LDESComb) != 0 ) || ( GXutil.strcmp(A13339LDESFondo, Z13339LDESFondo) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tldes02");
   }

   public void insert_check( )
   {
      confirm_1NT0( ) ;
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
      if ( RcdFound1825 == 0 )
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
      scanStart1NT1825( ) ;
      if ( RcdFound1825 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1NT1825( ) ;
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
      if ( RcdFound1825 == 0 )
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
      if ( RcdFound1825 == 0 )
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
      scanStart1NT1825( ) ;
      if ( RcdFound1825 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1825 != 0 )
         {
            scanNext1NT1825( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1NT1825( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1NT1825( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NT8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( Z13346LDESUltP != T01NT8_A13346LDESUltP[0] ) || ( Z13345LDESUltLP != T01NT8_A13345LDESUltLP[0] ) )
         {
            if ( Z13346LDESUltP != T01NT8_A13346LDESUltP[0] )
            {
               GXutil.writeLogln("tldes02:[seudo value changed for attri]"+"LDESUltP");
               GXutil.writeLogRaw("Old: ",Z13346LDESUltP);
               GXutil.writeLogRaw("Current: ",T01NT8_A13346LDESUltP[0]);
            }
            if ( Z13345LDESUltLP != T01NT8_A13345LDESUltLP[0] )
            {
               GXutil.writeLogln("tldes02:[seudo value changed for attri]"+"LDESUltLP");
               GXutil.writeLogRaw("Old: ",Z13345LDESUltLP);
               GXutil.writeLogRaw("Current: ",T01NT8_A13345LDESUltLP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NT1825( )
   {
      beforeValidate1NT1825( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NT1825( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NT1825( 0) ;
         checkOptimisticConcurrency1NT1825( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NT1825( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NT1825( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NT16 */
                  pr_default.execute(14, new Object[] {A13337LDESComb, A13339LDESFondo, Boolean.valueOf(n13346LDESUltP), Short.valueOf(A13346LDESUltP), Boolean.valueOf(n13345LDESUltLP), Short.valueOf(A13345LDESUltLP), A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1NT1825( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1NT0( ) ;
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
            load1NT1825( ) ;
         }
         endLevel1NT1825( ) ;
      }
      closeExtendedTableCursors1NT1825( ) ;
   }

   public void update1NT1825( )
   {
      beforeValidate1NT1825( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NT1825( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NT1825( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NT1825( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NT1825( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NT17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n13346LDESUltP), Short.valueOf(A13346LDESUltP), Boolean.valueOf(n13345LDESUltLP), Short.valueOf(A13345LDESUltLP), A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES02"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NT1825( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NT1825( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1NT0( ) ;
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
         endLevel1NT1825( ) ;
      }
      closeExtendedTableCursors1NT1825( ) ;
   }

   public void deferredUpdate1NT1825( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NT1825( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NT1825( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NT1825( ) ;
         afterConfirm1NT1825( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NT1825( ) ;
            if ( AnyError == 0 )
            {
               A13345LDESUltLP = O13345LDESUltLP ;
               n13345LDESUltLP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
               scanStart1NT1827( ) ;
               while ( RcdFound1827 != 0 )
               {
                  getByPrimaryKey1NT1827( ) ;
                  delete1NT1827( ) ;
                  scanNext1NT1827( ) ;
                  O13345LDESUltLP = A13345LDESUltLP ;
                  n13345LDESUltLP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
               }
               scanEnd1NT1827( ) ;
               A13346LDESUltP = O13346LDESUltP ;
               n13346LDESUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
               scanStart1NT1826( ) ;
               while ( RcdFound1826 != 0 )
               {
                  getByPrimaryKey1NT1826( ) ;
                  delete1NT1826( ) ;
                  scanNext1NT1826( ) ;
                  O13346LDESUltP = A13346LDESUltP ;
                  n13346LDESUltP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
               }
               scanEnd1NT1826( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NT18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1825 == 0 )
                        {
                           initAll1NT1825( ) ;
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
                        resetCaption1NT0( ) ;
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
      sMode1825 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NT1825( ) ;
      Gx_mode = sMode1825 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NT1825( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1NT1827( )
   {
      s13345LDESUltLP = O13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1NT1827( ) ;
         if ( ( nRcdExists_1827 != 0 ) || ( nIsMod_1827 != 0 ) )
         {
            standaloneNotModal1NT1827( ) ;
            getKey1NT1827( ) ;
            if ( ( nRcdExists_1827 == 0 ) && ( nRcdDeleted_1827 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NT1827( ) ;
            }
            else
            {
               if ( RcdFound1827 != 0 )
               {
                  if ( ( nRcdDeleted_1827 != 0 ) && ( nRcdExists_1827 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NT1827( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1827 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NT1827( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1827 == 0 )
                  {
                     GXCCtl = "LDESLINEA_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESLinea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13345LDESUltLP = A13345LDESUltLP ;
            n13345LDESUltLP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1827_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESLinea_Internalname, GXutil.ltrim( localUtil.ntoc( A13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtLDESCant_Internalname, GXutil.ltrim( localUtil.ntoc( A13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESUnd_Internalname, GXutil.rtrim( A13344LDESUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z13342LDESLinea_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13344LDESUnd_"+sGXsfl_60_idx, GXutil.rtrim( Z13344LDESUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z13343LDESCant_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_60_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1827_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1827_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1827_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1827 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1827_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1827_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESLINEA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCANT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESUND_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NT1827( ) ;
      if ( AnyError != 0 )
      {
         O13345LDESUltLP = s13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      }
      nRcdExists_1827 = (short)(0) ;
      nIsMod_1827 = (short)(0) ;
      nRcdDeleted_1827 = (short)(0) ;
   }

   public void processNestedLevel1NT1826( )
   {
      s13346LDESUltP = O13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1NT1826( ) ;
         if ( ( nRcdExists_1826 != 0 ) || ( nIsMod_1826 != 0 ) )
         {
            standaloneNotModal1NT1826( ) ;
            getKey1NT1826( ) ;
            if ( ( nRcdExists_1826 == 0 ) && ( nRcdDeleted_1826 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NT1826( ) ;
            }
            else
            {
               if ( RcdFound1826 != 0 )
               {
                  if ( ( nRcdDeleted_1826 != 0 ) && ( nRcdExists_1826 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NT1826( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1826 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NT1826( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1826 == 0 )
                  {
                     GXCCtl = "LDESLINP_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESLinP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13346LDESUltP = A13346LDESUltP ;
            n13346LDESUltP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1826_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESLinP_Internalname, GXutil.ltrim( localUtil.ntoc( A13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPasCod_Internalname, GXutil.rtrim( A2107PasCod)) ;
         httpContext.changePostValue( edtPasDsc_Internalname, GXutil.rtrim( A2108PasDsc)) ;
         httpContext.changePostValue( edtLDESCantP_Internalname, GXutil.ltrim( localUtil.ntoc( A13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13340LDESLinP_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13341LDESCantP_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_70_idx, GXutil.rtrim( Z2107PasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1826_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1826_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1826_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1826 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1826_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1826_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESLINP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASCOD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASDSC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCANTP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NT1826( ) ;
      if ( AnyError != 0 )
      {
         O13346LDESUltP = s13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      }
      nRcdExists_1826 = (short)(0) ;
      nIsMod_1826 = (short)(0) ;
      nRcdDeleted_1826 = (short)(0) ;
   }

   public void processLevel1NT1825( )
   {
      /* Save parent mode. */
      sMode1825 = Gx_mode ;
      processNestedLevel1NT1827( ) ;
      processNestedLevel1NT1826( ) ;
      if ( AnyError != 0 )
      {
         O13345LDESUltLP = s13345LDESUltLP ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
         O13346LDESUltP = s13346LDESUltP ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1825 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01NT19 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n13346LDESUltP), Short.valueOf(A13346LDESUltP), Boolean.valueOf(n13345LDESUltLP), Short.valueOf(A13345LDESUltLP), A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
   }

   public void endLevel1NT1825( )
   {
      pr_default.close(6);
      if ( AnyError == 0 )
      {
         beforeComplete1NT1825( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tldes02");
         if ( AnyError == 0 )
         {
            confirmValues1NT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tldes02");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NT1825( )
   {
      /* Scan By routine */
      /* Using cursor T01NT20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      RcdFound1825 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1825 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NT1825( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1825 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1825 = (short)(1) ;
      }
   }

   public void scanEnd1NT1825( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1NT1825( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NT1825( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NT1825( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NT1825( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NT1825( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NT1825( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NT1825( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtLDESID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESID_Enabled), 5, 0), true);
      edtLDESNPeque_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESNPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESNPeque_Enabled), 5, 0), true);
      edtLDESComb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), true);
      edtLDESFondo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), true);
      edtLDESUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), true);
      edtLDESUltLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), true);
   }

   public void zm1NT1827( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13344LDESUnd = T01NT6_A13344LDESUnd[0] ;
            Z13343LDESCant = T01NT6_A13343LDESCant[0] ;
            Z719PrdNum = T01NT6_A719PrdNum[0] ;
         }
         else
         {
            Z13344LDESUnd = A13344LDESUnd ;
            Z13343LDESCant = A13343LDESCant ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13342LDESLinea = A13342LDESLinea ;
         Z13344LDESUnd = A13344LDESUnd ;
         Z13343LDESCant = A13343LDESCant ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal1NT1827( )
   {
      edtLDESUltLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), true);
      edtLDESUltLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), true);
   }

   public void standaloneModal1NT1827( )
   {
      if ( isIns( )  )
      {
         A13345LDESUltLP = (short)(O13345LDESUltLP+10) ;
         n13345LDESUltLP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A13344LDESUnd)==0) && ( Gx_BScreen == 0 ) )
      {
         A13344LDESUnd = httpContext.getMessage( httpContext.getMessage( "GRM", ""), "") ;
         n13344LDESUnd = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13342LDESLinea = A13345LDESUltLP ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESLinea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtLDESLinea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1NT1827( )
   {
      /* Using cursor T01NT21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1827 = (short)(1) ;
         A13344LDESUnd = T01NT21_A13344LDESUnd[0] ;
         n13344LDESUnd = T01NT21_n13344LDESUnd[0] ;
         A718PrdNom = T01NT21_A718PrdNom[0] ;
         A13343LDESCant = T01NT21_A13343LDESCant[0] ;
         n13343LDESCant = T01NT21_n13343LDESCant[0] ;
         A719PrdNum = T01NT21_A719PrdNum[0] ;
         n719PrdNum = T01NT21_n719PrdNum[0] ;
         zm1NT1827( -14) ;
      }
      pr_default.close(19);
      onLoadActions1NT1827( ) ;
   }

   public void onLoadActions1NT1827( )
   {
   }

   public void checkExtendedTable1NT1827( )
   {
      nIsDirty_1827 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1NT1827( ) ;
      /* Using cursor T01NT7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01NT7_A718PrdNom[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1NT1827( )
   {
      pr_default.close(5);
   }

   public void enableDisable1NT1827( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01NT22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01NT22_A718PrdNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1NT1827( )
   {
      /* Using cursor T01NT23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1827 = (short)(1) ;
      }
      else
      {
         RcdFound1827 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1NT1827( )
   {
      /* Using cursor T01NT6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
      if ( (pr_default.getStatus(4) != 101) && ( T01NT6_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NT6_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) && ( GXutil.strcmp(T01NT6_A13337LDESComb[0], A13337LDESComb) == 0 ) && ( GXutil.strcmp(T01NT6_A13339LDESFondo[0], A13339LDESFondo) == 0 ) && ( GXutil.strcmp(T01NT6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NT1827( 14) ;
         RcdFound1827 = (short)(1) ;
         initializeNonKey1NT1827( ) ;
         A13342LDESLinea = T01NT6_A13342LDESLinea[0] ;
         A13344LDESUnd = T01NT6_A13344LDESUnd[0] ;
         n13344LDESUnd = T01NT6_n13344LDESUnd[0] ;
         A13343LDESCant = T01NT6_A13343LDESCant[0] ;
         n13343LDESCant = T01NT6_n13343LDESCant[0] ;
         A719PrdNum = T01NT6_A719PrdNum[0] ;
         n719PrdNum = T01NT6_n719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13342LDESLinea = A13342LDESLinea ;
         sMode1827 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NT1827( ) ;
         load1NT1827( ) ;
         Gx_mode = sMode1827 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1827 = (short)(0) ;
         initializeNonKey1NT1827( ) ;
         sMode1827 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NT1827( ) ;
         Gx_mode = sMode1827 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NT1827( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency1NT1827( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NT5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES04"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z13344LDESUnd, T01NT5_A13344LDESUnd[0]) != 0 ) || ( DecimalUtil.compareTo(Z13343LDESCant, T01NT5_A13343LDESCant[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01NT5_A719PrdNum[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13344LDESUnd, T01NT5_A13344LDESUnd[0]) != 0 )
            {
               GXutil.writeLogln("tldes02:[seudo value changed for attri]"+"LDESUnd");
               GXutil.writeLogRaw("Old: ",Z13344LDESUnd);
               GXutil.writeLogRaw("Current: ",T01NT5_A13344LDESUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z13343LDESCant, T01NT5_A13343LDESCant[0]) != 0 )
            {
               GXutil.writeLogln("tldes02:[seudo value changed for attri]"+"LDESCant");
               GXutil.writeLogRaw("Old: ",Z13343LDESCant);
               GXutil.writeLogRaw("Current: ",T01NT5_A13343LDESCant[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01NT5_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tldes02:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01NT5_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES04"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NT1827( )
   {
      beforeValidate1NT1827( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NT1827( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NT1827( 0) ;
         checkOptimisticConcurrency1NT1827( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NT1827( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NT1827( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NT24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea), Boolean.valueOf(n13344LDESUnd), A13344LDESUnd, Boolean.valueOf(n13343LDESCant), A13343LDESCant, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES04");
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
            load1NT1827( ) ;
         }
         endLevel1NT1827( ) ;
      }
      closeExtendedTableCursors1NT1827( ) ;
   }

   public void update1NT1827( )
   {
      beforeValidate1NT1827( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NT1827( ) ;
      }
      if ( ( nIsMod_1827 != 0 ) || ( nIsDirty_1827 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NT1827( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NT1827( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NT1827( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NT25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n13344LDESUnd), A13344LDESUnd, Boolean.valueOf(n13343LDESCant), A13343LDESCant, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES04");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES04"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NT1827( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NT1827( ) ;
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
            endLevel1NT1827( ) ;
         }
      }
      closeExtendedTableCursors1NT1827( ) ;
   }

   public void deferredUpdate1NT1827( )
   {
   }

   public void delete1NT1827( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NT1827( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NT1827( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NT1827( ) ;
         afterConfirm1NT1827( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NT1827( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NT26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES04");
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
      sMode1827 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NT1827( ) ;
      Gx_mode = sMode1827 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NT1827( )
   {
      standaloneModal1NT1827( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NT27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A718PrdNom = T01NT27_A718PrdNom[0] ;
         pr_default.close(25);
      }
   }

   public void endLevel1NT1827( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NT1827( )
   {
      /* Scan By routine */
      /* Using cursor T01NT28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      RcdFound1827 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1827 = (short)(1) ;
         A13342LDESLinea = T01NT28_A13342LDESLinea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NT1827( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1827 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1827 = (short)(1) ;
         A13342LDESLinea = T01NT28_A13342LDESLinea[0] ;
      }
   }

   public void scanEnd1NT1827( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1NT1827( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NT1827( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NT1827( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NT1827( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NT1827( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NT1827( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NT1827( )
   {
      edtLDESLinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtLDESCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCant_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtLDESUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUnd_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1NT1827( )
   {
   }

   public void zm1NT1826( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13341LDESCantP = T01NT3_A13341LDESCantP[0] ;
            Z2107PasCod = T01NT3_A2107PasCod[0] ;
         }
         else
         {
            Z13341LDESCantP = A13341LDESCantP ;
            Z2107PasCod = A2107PasCod ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13340LDESLinP = A13340LDESLinP ;
         Z13341LDESCantP = A13341LDESCantP ;
         Z396EmprCod = A396EmprCod ;
         Z2107PasCod = A2107PasCod ;
         Z2108PasDsc = A2108PasDsc ;
      }
   }

   public void standaloneNotModal1NT1826( )
   {
      edtLDESUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), true);
      edtLDESUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), true);
   }

   public void standaloneModal1NT1826( )
   {
      if ( isIns( )  )
      {
         A13346LDESUltP = (short)(O13346LDESUltP+10) ;
         n13346LDESUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A13341LDESCantP)==0) && ( Gx_BScreen == 0 ) )
      {
         A13341LDESCantP = DecimalUtil.doubleToDec(1) ;
         n13341LDESCantP = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13340LDESLinP = A13346LDESUltP ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESLinP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtLDESLinP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void load1NT1826( )
   {
      /* Using cursor T01NT29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1826 = (short)(1) ;
         A13341LDESCantP = T01NT29_A13341LDESCantP[0] ;
         n13341LDESCantP = T01NT29_n13341LDESCantP[0] ;
         A2108PasDsc = T01NT29_A2108PasDsc[0] ;
         n2108PasDsc = T01NT29_n2108PasDsc[0] ;
         A2107PasCod = T01NT29_A2107PasCod[0] ;
         n2107PasCod = T01NT29_n2107PasCod[0] ;
         zm1NT1826( -16) ;
      }
      pr_default.close(27);
      onLoadActions1NT1826( ) ;
   }

   public void onLoadActions1NT1826( )
   {
   }

   public void checkExtendedTable1NT1826( )
   {
      nIsDirty_1826 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1NT1826( ) ;
      /* Using cursor T01NT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PASCOD_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2108PasDsc = T01NT4_A2108PasDsc[0] ;
      n2108PasDsc = T01NT4_n2108PasDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1NT1826( )
   {
      pr_default.close(2);
   }

   public void enableDisable1NT1826( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          String A2107PasCod )
   {
      /* Using cursor T01NT30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         GXCCtl = "PASCOD_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2108PasDsc = T01NT30_A2108PasDsc[0] ;
      n2108PasDsc = T01NT30_n2108PasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2108PasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void getKey1NT1826( )
   {
      /* Using cursor T01NT31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1826 = (short)(1) ;
      }
      else
      {
         RcdFound1826 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey1NT1826( )
   {
      /* Using cursor T01NT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
      if ( (pr_default.getStatus(1) != 101) && ( T01NT3_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NT3_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) && ( GXutil.strcmp(T01NT3_A13337LDESComb[0], A13337LDESComb) == 0 ) && ( GXutil.strcmp(T01NT3_A13339LDESFondo[0], A13339LDESFondo) == 0 ) && ( GXutil.strcmp(T01NT3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NT1826( 16) ;
         RcdFound1826 = (short)(1) ;
         initializeNonKey1NT1826( ) ;
         A13340LDESLinP = T01NT3_A13340LDESLinP[0] ;
         A13341LDESCantP = T01NT3_A13341LDESCantP[0] ;
         n13341LDESCantP = T01NT3_n13341LDESCantP[0] ;
         A2107PasCod = T01NT3_A2107PasCod[0] ;
         n2107PasCod = T01NT3_n2107PasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13340LDESLinP = A13340LDESLinP ;
         sMode1826 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NT1826( ) ;
         load1NT1826( ) ;
         Gx_mode = sMode1826 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1826 = (short)(0) ;
         initializeNonKey1NT1826( ) ;
         sMode1826 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NT1826( ) ;
         Gx_mode = sMode1826 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NT1826( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NT1826( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES03"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13341LDESCantP, T01NT2_A13341LDESCantP[0]) != 0 ) || ( GXutil.strcmp(Z2107PasCod, T01NT2_A2107PasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z13341LDESCantP, T01NT2_A13341LDESCantP[0]) != 0 )
            {
               GXutil.writeLogln("tldes02:[seudo value changed for attri]"+"LDESCantP");
               GXutil.writeLogRaw("Old: ",Z13341LDESCantP);
               GXutil.writeLogRaw("Current: ",T01NT2_A13341LDESCantP[0]);
            }
            if ( GXutil.strcmp(Z2107PasCod, T01NT2_A2107PasCod[0]) != 0 )
            {
               GXutil.writeLogln("tldes02:[seudo value changed for attri]"+"PasCod");
               GXutil.writeLogRaw("Old: ",Z2107PasCod);
               GXutil.writeLogRaw("Current: ",T01NT2_A2107PasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES03"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NT1826( )
   {
      beforeValidate1NT1826( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NT1826( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NT1826( 0) ;
         checkOptimisticConcurrency1NT1826( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NT1826( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NT1826( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NT32 */
                  pr_default.execute(30, new Object[] {Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP), Boolean.valueOf(n13341LDESCantP), A13341LDESCantP, A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES03");
                  if ( (pr_default.getStatus(30) == 1) )
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
            load1NT1826( ) ;
         }
         endLevel1NT1826( ) ;
      }
      closeExtendedTableCursors1NT1826( ) ;
   }

   public void update1NT1826( )
   {
      beforeValidate1NT1826( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NT1826( ) ;
      }
      if ( ( nIsMod_1826 != 0 ) || ( nIsDirty_1826 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NT1826( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NT1826( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NT1826( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NT33 */
                     pr_default.execute(31, new Object[] {Boolean.valueOf(n13341LDESCantP), A13341LDESCantP, Boolean.valueOf(n2107PasCod), A2107PasCod, A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES03");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES03"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NT1826( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NT1826( ) ;
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
            endLevel1NT1826( ) ;
         }
      }
      closeExtendedTableCursors1NT1826( ) ;
   }

   public void deferredUpdate1NT1826( )
   {
   }

   public void delete1NT1826( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NT1826( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NT1826( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NT1826( ) ;
         afterConfirm1NT1826( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NT1826( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NT34 */
               pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES03");
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
      sMode1826 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NT1826( ) ;
      Gx_mode = sMode1826 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NT1826( )
   {
      standaloneModal1NT1826( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NT35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
         A2108PasDsc = T01NT35_A2108PasDsc[0] ;
         n2108PasDsc = T01NT35_n2108PasDsc[0] ;
         pr_default.close(33);
      }
   }

   public void endLevel1NT1826( )
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

   public void scanStart1NT1826( )
   {
      /* Scan By routine */
      /* Using cursor T01NT36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      RcdFound1826 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1826 = (short)(1) ;
         A13340LDESLinP = T01NT36_A13340LDESLinP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NT1826( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound1826 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1826 = (short)(1) ;
         A13340LDESLinP = T01NT36_A13340LDESLinP[0] ;
      }
   }

   public void scanEnd1NT1826( )
   {
      pr_default.close(34);
   }

   public void afterConfirm1NT1826( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NT1826( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NT1826( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NT1826( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NT1826( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NT1826( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NT1826( )
   {
      edtLDESLinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtPasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasCod_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtPasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasDsc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtLDESCantP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESCantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCantP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashes1NT1826( )
   {
   }

   public void send_integrity_lvl_hashes1NT1825( )
   {
   }

   public void subsflControlProps_601827( )
   {
      edtavnRcdDeleted_1827_Internalname = "vNRCDDELETED_1827_"+sGXsfl_60_idx ;
      edtLDESLinea_Internalname = "LDESLINEA_"+sGXsfl_60_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_60_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_60_idx ;
      edtLDESCant_Internalname = "LDESCANT_"+sGXsfl_60_idx ;
      edtLDESUnd_Internalname = "LDESUND_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601827( )
   {
      edtavnRcdDeleted_1827_Internalname = "vNRCDDELETED_1827_"+sGXsfl_60_fel_idx ;
      edtLDESLinea_Internalname = "LDESLINEA_"+sGXsfl_60_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_60_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_60_fel_idx ;
      edtLDESCant_Internalname = "LDESCANT_"+sGXsfl_60_fel_idx ;
      edtLDESUnd_Internalname = "LDESUND_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1NT1827( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601827( ) ;
      sendRow1NT1827( ) ;
   }

   public void sendRow1NT1827( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1827_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1827_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1827), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1827), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1827_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1827_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESLinea_Internalname,GXutil.ltrim( localUtil.ntoc( A13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13342LDESLinea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESLinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESLinea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESCant_Internalname,GXutil.ltrim( localUtil.ntoc( A13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESCant_Enabled!=0) ? localUtil.format( A13343LDESCant, "ZZZZZ9.999") : localUtil.format( A13343LDESCant, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESUnd_Internalname,GXutil.rtrim( A13344LDESUnd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1NT1827( ) ;
      GXCCtl = "Z13342LDESLinea_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13344LDESUnd_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13344LDESUnd));
      GXCCtl = "Z13343LDESCant_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1827_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1827_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1827_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1827_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1827_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESLINEA_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCANT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESUND_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1NT1827( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601827( ) ;
      edtavnRcdDeleted_1827_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1827_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESLINEA_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCANT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESUND_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1827_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1827_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1827");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1827_Internalname ;
         wbErr = true ;
         nRcdDeleted_1827 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1827 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1827_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LDESLINEA_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESLinea_Internalname ;
         wbErr = true ;
         A13342LDESLinea = (short)(0) ;
      }
      else
      {
         A13342LDESLinea = (short)(localUtil.ctol( httpContext.cgiGet( edtLDESLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLDESCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLDESCant_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "LDESCANT_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESCant_Internalname ;
         wbErr = true ;
         A13343LDESCant = DecimalUtil.ZERO ;
         n13343LDESCant = false ;
      }
      else
      {
         A13343LDESCant = localUtil.ctond( httpContext.cgiGet( edtLDESCant_Internalname)) ;
         n13343LDESCant = false ;
      }
      A13344LDESUnd = httpContext.cgiGet( edtLDESUnd_Internalname) ;
      n13344LDESUnd = false ;
      GXCCtl = "Z13342LDESLinea_" + sGXsfl_60_idx ;
      Z13342LDESLinea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13344LDESUnd_" + sGXsfl_60_idx ;
      Z13344LDESUnd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13343LDESCant_" + sGXsfl_60_idx ;
      Z13343LDESCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_60_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1827_" + sGXsfl_60_idx ;
      nRcdDeleted_1827 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1827_" + sGXsfl_60_idx ;
      nRcdExists_1827 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1827_" + sGXsfl_60_idx ;
      nIsMod_1827 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_701826( )
   {
      edtavnRcdDeleted_1826_Internalname = "vNRCDDELETED_1826_"+sGXsfl_70_idx ;
      edtLDESLinP_Internalname = "LDESLINP_"+sGXsfl_70_idx ;
      edtPasCod_Internalname = "PASCOD_"+sGXsfl_70_idx ;
      edtPasDsc_Internalname = "PASDSC_"+sGXsfl_70_idx ;
      edtLDESCantP_Internalname = "LDESCANTP_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701826( )
   {
      edtavnRcdDeleted_1826_Internalname = "vNRCDDELETED_1826_"+sGXsfl_70_fel_idx ;
      edtLDESLinP_Internalname = "LDESLINP_"+sGXsfl_70_fel_idx ;
      edtPasCod_Internalname = "PASCOD_"+sGXsfl_70_fel_idx ;
      edtPasDsc_Internalname = "PASDSC_"+sGXsfl_70_fel_idx ;
      edtLDESCantP_Internalname = "LDESCANTP_"+sGXsfl_70_fel_idx ;
   }

   public void addRow1NT1826( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701826( ) ;
      sendRow1NT1826( ) ;
   }

   public void sendRow1NT1826( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1826_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1826_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1826_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1826), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1826), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1826_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1826_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1826_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESLinP_Internalname,GXutil.ltrim( localUtil.ntoc( A13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13340LDESLinP), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESLinP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESLinP_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1826_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasCod_Internalname,GXutil.rtrim( A2107PasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasDsc_Internalname,GXutil.rtrim( A2108PasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1826_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESCantP_Internalname,GXutil.ltrim( localUtil.ntoc( A13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESCantP_Enabled!=0) ? localUtil.format( A13341LDESCantP, "ZZZZZ9.999") : localUtil.format( A13341LDESCantP, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESCantP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESCantP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1NT1826( ) ;
      GXCCtl = "Z13340LDESLinP_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13341LDESCantP_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2107PasCod_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2107PasCod));
      GXCCtl = "nRcdDeleted_1826_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1826_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1826_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1826_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1826_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESLINP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASCOD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASDSC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCANTP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1NT1826( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701826( ) ;
      edtavnRcdDeleted_1826_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1826_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESLinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESLINP_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASCOD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASDSC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESCantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCANTP_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1826_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1826_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1826");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1826_Internalname ;
         wbErr = true ;
         nRcdDeleted_1826 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1826 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1826_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESLinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESLinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LDESLINP_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESLinP_Internalname ;
         wbErr = true ;
         A13340LDESLinP = (short)(0) ;
      }
      else
      {
         A13340LDESLinP = (short)(localUtil.ctol( httpContext.cgiGet( edtLDESLinP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2107PasCod = httpContext.cgiGet( edtPasCod_Internalname) ;
      n2107PasCod = false ;
      A2108PasDsc = httpContext.cgiGet( edtPasDsc_Internalname) ;
      n2108PasDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLDESCantP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLDESCantP_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "LDESCANTP_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESCantP_Internalname ;
         wbErr = true ;
         A13341LDESCantP = DecimalUtil.ZERO ;
         n13341LDESCantP = false ;
      }
      else
      {
         A13341LDESCantP = localUtil.ctond( httpContext.cgiGet( edtLDESCantP_Internalname)) ;
         n13341LDESCantP = false ;
      }
      GXCCtl = "Z13340LDESLinP_" + sGXsfl_70_idx ;
      Z13340LDESLinP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13341LDESCantP_" + sGXsfl_70_idx ;
      Z13341LDESCantP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2107PasCod_" + sGXsfl_70_idx ;
      Z2107PasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1826_" + sGXsfl_70_idx ;
      nRcdDeleted_1826 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1826_" + sGXsfl_70_idx ;
      nRcdExists_1826 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1826_" + sGXsfl_70_idx ;
      nIsMod_1826 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLDESLinP_Enabled = edtLDESLinP_Enabled ;
      defedtLDESLinea_Enabled = edtLDESLinea_Enabled ;
   }

   public void confirmValues1NT0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601827( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601827( ) ;
         httpContext.changePostValue( "Z13342LDESLinea_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13342LDESLinea_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13342LDESLinea_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13344LDESUnd_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13344LDESUnd_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13344LDESUnd_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z13343LDESCant_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z13343LDESCant_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13343LDESCant_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_60_idx) ;
      }
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701826( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701826( ) ;
         httpContext.changePostValue( "Z13340LDESLinP_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z13340LDESLinP_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13340LDESLinP_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z13341LDESCantP_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z13341LDESCantP_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13341LDESCantP_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z2107PasCod_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z2107PasCod_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_70_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tldes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13324LDESID,8,0)),GXutil.URLEncode(GXutil.rtrim(A13333LDESNPeque)),GXutil.URLEncode(GXutil.rtrim(A13337LDESComb)),GXutil.URLEncode(GXutil.rtrim(A13339LDESFondo))}, new String[] {"EmprCod","LDESID","LDESNPeque","LDESComb","LDESFondo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13324LDESID", GXutil.ltrim( localUtil.ntoc( Z13324LDESID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13333LDESNPeque", GXutil.rtrim( Z13333LDESNPeque));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13337LDESComb", GXutil.rtrim( Z13337LDESComb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13339LDESFondo", GXutil.rtrim( Z13339LDESFondo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13346LDESUltP", GXutil.ltrim( localUtil.ntoc( Z13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13345LDESUltLP", GXutil.ltrim( localUtil.ntoc( Z13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13346LDESUltP", GXutil.ltrim( localUtil.ntoc( O13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13345LDESUltLP", GXutil.ltrim( localUtil.ntoc( O13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
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
      return formatLink("app.tldes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13324LDESID,8,0)),GXutil.URLEncode(GXutil.rtrim(A13333LDESNPeque)),GXutil.URLEncode(GXutil.rtrim(A13337LDESComb)),GXutil.URLEncode(GXutil.rtrim(A13339LDESFondo))}, new String[] {"EmprCod","LDESID","LDESNPeque","LDESComb","LDESFondo"})  ;
   }

   public String getPgmname( )
   {
      return "TLDES02" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Lab Dip Estampacion (Productos,Pasta)", "") ;
   }

   public void initializeNonKey1NT1825( )
   {
      A13346LDESUltP = (short)(0) ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      A13345LDESUltLP = (short)(0) ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      O13346LDESUltP = A13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      O13345LDESUltLP = A13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      Z13346LDESUltP = (short)(0) ;
      Z13345LDESUltLP = (short)(0) ;
   }

   public void initAll1NT1825( )
   {
      initializeNonKey1NT1825( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1NT1827( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A718PrdNom = "" ;
      A13343LDESCant = DecimalUtil.ZERO ;
      n13343LDESCant = false ;
      A13344LDESUnd = httpContext.getMessage( "GRM", "") ;
      n13344LDESUnd = false ;
      Z13344LDESUnd = "" ;
      Z13343LDESCant = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
   }

   public void initAll1NT1827( )
   {
      A13342LDESLinea = (short)(0) ;
      initializeNonKey1NT1827( ) ;
   }

   public void standaloneModalInsert1NT1827( )
   {
      A13345LDESUltLP = i13345LDESUltLP ;
      n13345LDESUltLP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13345LDESUltLP), 4, 0));
      A13344LDESUnd = i13344LDESUnd ;
      n13344LDESUnd = false ;
   }

   public void initializeNonKey1NT1826( )
   {
      A2107PasCod = "" ;
      n2107PasCod = false ;
      A2108PasDsc = "" ;
      n2108PasDsc = false ;
      A13341LDESCantP = DecimalUtil.doubleToDec(1) ;
      n13341LDESCantP = false ;
      Z13341LDESCantP = DecimalUtil.ZERO ;
      Z2107PasCod = "" ;
   }

   public void initAll1NT1826( )
   {
      A13340LDESLinP = (short)(0) ;
      initializeNonKey1NT1826( ) ;
   }

   public void standaloneModalInsert1NT1826( )
   {
      A13346LDESUltP = i13346LDESUltP ;
      n13346LDESUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13346LDESUltP), 4, 0));
      A13341LDESCantP = i13341LDESCantP ;
      n13341LDESCantP = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415102972", true, true);
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
      httpContext.AddJavascriptSource("tldes02.js", "?202682415102972", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1827( )
   {
      edtLDESLinea_Enabled = defedtLDESLinea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void init_level_properties1826( )
   {
      edtLDESLinP_Enabled = defedtLDESLinP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1827_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13342LDESLinea, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13343LDESCant, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13344LDESUnd));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol70( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1826_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13340LDESLinP, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A2107PasCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A2108PasDsc));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13341LDESCantP, (byte)(10), (byte)(3), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtLDESID_Internalname = "LDESID" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtLDESNPeque_Internalname = "LDESNPEQUE" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtLDESComb_Internalname = "LDESCOMB" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtLDESFondo_Internalname = "LDESFONDO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtLDESUltP_Internalname = "LDESULTP" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtLDESUltLP_Internalname = "LDESULTLP" ;
      edtavnRcdDeleted_1827_Internalname = "vNRCDDELETED_1827" ;
      edtLDESLinea_Internalname = "LDESLINEA" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtLDESCant_Internalname = "LDESCANT" ;
      edtLDESUnd_Internalname = "LDESUND" ;
      edtavnRcdDeleted_1826_Internalname = "vNRCDDELETED_1826" ;
      edtLDESLinP_Internalname = "LDESLINP" ;
      edtPasCod_Internalname = "PASCOD" ;
      edtPasDsc_Internalname = "PASDSC" ;
      edtLDESCantP_Internalname = "LDESCANTP" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Lab Dip Estampacion (Productos,Pasta)", "") );
      edtLDESCantP_Jsonclick = "" ;
      edtPasDsc_Jsonclick = "" ;
      edtPasCod_Jsonclick = "" ;
      edtLDESLinP_Jsonclick = "" ;
      edtavnRcdDeleted_1826_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtLDESUnd_Jsonclick = "" ;
      edtLDESCant_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtLDESLinea_Jsonclick = "" ;
      edtavnRcdDeleted_1827_Jsonclick = "" ;
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
      edtLDESCantP_Enabled = 1 ;
      edtPasDsc_Enabled = 0 ;
      edtPasCod_Enabled = 1 ;
      edtLDESLinP_Enabled = 1 ;
      edtavnRcdDeleted_1826_Enabled = 1 ;
      edtLDESUnd_Enabled = 1 ;
      edtLDESCant_Enabled = 1 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtLDESLinea_Enabled = 1 ;
      edtavnRcdDeleted_1827_Enabled = 1 ;
      edtLDESUltLP_Jsonclick = "" ;
      edtLDESUltLP_Backcolor = (int)(0xFFFFFF) ;
      edtLDESUltLP_Enabled = 0 ;
      edtLDESUltP_Jsonclick = "" ;
      edtLDESUltP_Backcolor = (int)(0xFFFFFF) ;
      edtLDESUltP_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtLDESFondo_Jsonclick = "" ;
      edtLDESFondo_Backcolor = (int)(0xFFFFFF) ;
      edtLDESFondo_Enabled = 0 ;
      edtLDESComb_Jsonclick = "" ;
      edtLDESComb_Backcolor = (int)(0xFFFFFF) ;
      edtLDESComb_Enabled = 0 ;
      edtLDESNPeque_Jsonclick = "" ;
      edtLDESNPeque_Backcolor = (int)(0xFFFFFF) ;
      edtLDESNPeque_Enabled = 0 ;
      edtLDESID_Jsonclick = "" ;
      edtLDESID_Backcolor = (int)(0xFFFFFF) ;
      edtLDESID_Enabled = 0 ;
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
      subsflControlProps_601827( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NT1827( ) ;
         standaloneModal1NT1827( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NT1827( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601827( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_701826( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NT1826( ) ;
         standaloneModal1NT1826( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NT1826( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701826( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T01NT37 */
      pr_default.execute(35, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NT37_A407EmprNom[0] ;
      n407EmprNom = T01NT37_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(35);
      /* Using cursor T01NT38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Peques", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LDESNPEQUE");
         AnyError = (short)(1) ;
      }
      pr_default.close(36);
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

   public void valid_Ldesfondo( )
   {
      n13346LDESUltP = false ;
      n13345LDESUltLP = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13346LDESUltP", GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13345LDESUltLP", GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13324LDESID", GXutil.ltrim( localUtil.ntoc( Z13324LDESID, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13333LDESNPeque", GXutil.rtrim( Z13333LDESNPeque));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13337LDESComb", GXutil.rtrim( Z13337LDESComb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13339LDESFondo", GXutil.rtrim( Z13339LDESFondo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13346LDESUltP", GXutil.ltrim( localUtil.ntoc( Z13346LDESUltP, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13345LDESUltLP", GXutil.ltrim( localUtil.ntoc( Z13345LDESUltLP, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O13346LDESUltP", GXutil.ltrim( localUtil.ntoc( O13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O13345LDESUltLP", GXutil.ltrim( localUtil.ntoc( O13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01NT27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01NT27_A718PrdNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
   }

   public void valid_Pascod( )
   {
      n2107PasCod = false ;
      n2108PasDsc = false ;
      /* Using cursor T01NT35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
      }
      A2108PasDsc = T01NT35_A2108PasDsc[0] ;
      n2108PasDsc = T01NT35_n2108PasDsc[0] ;
      pr_default.close(33);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2108PasDsc", GXutil.rtrim( A2108PasDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13324LDESID',fld:'LDESID',pic:'ZZZZZZZ9'},{av:'A13333LDESNPeque',fld:'LDESNPEQUE',pic:''},{av:'A13337LDESComb',fld:'LDESCOMB',pic:'@!'},{av:'A13339LDESFondo',fld:'LDESFONDO',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_LDESID","{handler:'valid_Ldesid',iparms:[]");
      setEventMetadata("VALID_LDESID",",oparms:[]}");
      setEventMetadata("VALID_LDESNPEQUE","{handler:'valid_Ldesnpeque',iparms:[]");
      setEventMetadata("VALID_LDESNPEQUE",",oparms:[]}");
      setEventMetadata("VALID_LDESCOMB","{handler:'valid_Ldescomb',iparms:[]");
      setEventMetadata("VALID_LDESCOMB",",oparms:[]}");
      setEventMetadata("VALID_LDESFONDO","{handler:'valid_Ldesfondo',iparms:[{av:'A13346LDESUltP',fld:'LDESULTP',pic:'ZZZ9'},{av:'A13345LDESUltLP',fld:'LDESULTLP',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13324LDESID',fld:'LDESID',pic:'ZZZZZZZ9'},{av:'A13333LDESNPeque',fld:'LDESNPEQUE',pic:''},{av:'A13337LDESComb',fld:'LDESCOMB',pic:'@!'},{av:'A13339LDESFondo',fld:'LDESFONDO',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LDESFONDO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13346LDESUltP',fld:'LDESULTP',pic:'ZZZ9'},{av:'A13345LDESUltLP',fld:'LDESULTLP',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13324LDESID'},{av:'Z13333LDESNPeque'},{av:'Z13337LDESComb'},{av:'Z13339LDESFondo'},{av:'Z407EmprNom'},{av:'Z13346LDESUltP'},{av:'Z13345LDESUltLP'},{av:'O13346LDESUltP'},{av:'O13345LDESUltLP'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_LDESULTP","{handler:'valid_Ldesultp',iparms:[]");
      setEventMetadata("VALID_LDESULTP",",oparms:[]}");
      setEventMetadata("VALID_LDESULTLP","{handler:'valid_Ldesultlp',iparms:[]");
      setEventMetadata("VALID_LDESULTLP",",oparms:[]}");
      setEventMetadata("VALID_LDESLINEA","{handler:'valid_Ldeslinea',iparms:[]");
      setEventMetadata("VALID_LDESLINEA",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ldesund',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_LDESLINP","{handler:'valid_Ldeslinp',iparms:[]");
      setEventMetadata("VALID_LDESLINP",",oparms:[]}");
      setEventMetadata("VALID_PASCOD","{handler:'valid_Pascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2107PasCod',fld:'PASCOD',pic:''},{av:'A2108PasDsc',fld:'PASDSC',pic:''}]");
      setEventMetadata("VALID_PASCOD",",oparms:[{av:'A2108PasDsc',fld:'PASDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ldescantp',iparms:[]");
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
      pr_default.close(33);
      pr_default.close(25);
      pr_default.close(35);
      pr_default.close(36);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA13333LDESNPeque = "" ;
      wcpOA13337LDESComb = "" ;
      wcpOA13339LDESFondo = "" ;
      Z396EmprCod = "" ;
      Z13333LDESNPeque = "" ;
      Z13337LDESComb = "" ;
      Z13339LDESFondo = "" ;
      Z13344LDESUnd = "" ;
      Z13343LDESCant = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z13341LDESCantP = DecimalUtil.ZERO ;
      Z2107PasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A2107PasCod = "" ;
      A13333LDESNPeque = "" ;
      A13337LDESComb = "" ;
      A13339LDESFondo = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1827 = "" ;
      GX_FocusControl = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1826 = "" ;
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
      sMode1825 = "" ;
      GXCCtl = "" ;
      A2108PasDsc = "" ;
      A13341LDESCantP = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A13343LDESCant = DecimalUtil.ZERO ;
      A13344LDESUnd = "" ;
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
      Z407EmprNom = "" ;
      T01NT10_A407EmprNom = new String[] {""} ;
      T01NT10_n407EmprNom = new boolean[] {false} ;
      T01NT11_A396EmprCod = new String[] {""} ;
      T01NT12_A13337LDESComb = new String[] {""} ;
      T01NT12_A13339LDESFondo = new String[] {""} ;
      T01NT12_A407EmprNom = new String[] {""} ;
      T01NT12_n407EmprNom = new boolean[] {false} ;
      T01NT12_A13346LDESUltP = new short[1] ;
      T01NT12_n13346LDESUltP = new boolean[] {false} ;
      T01NT12_A13345LDESUltLP = new short[1] ;
      T01NT12_n13345LDESUltLP = new boolean[] {false} ;
      T01NT12_A396EmprCod = new String[] {""} ;
      T01NT12_A13324LDESID = new int[1] ;
      T01NT12_A13333LDESNPeque = new String[] {""} ;
      T01NT13_A396EmprCod = new String[] {""} ;
      T01NT13_A13324LDESID = new int[1] ;
      T01NT13_A13333LDESNPeque = new String[] {""} ;
      T01NT13_A13337LDESComb = new String[] {""} ;
      T01NT13_A13339LDESFondo = new String[] {""} ;
      T01NT9_A13337LDESComb = new String[] {""} ;
      T01NT9_A13339LDESFondo = new String[] {""} ;
      T01NT9_A13346LDESUltP = new short[1] ;
      T01NT9_n13346LDESUltP = new boolean[] {false} ;
      T01NT9_A13345LDESUltLP = new short[1] ;
      T01NT9_n13345LDESUltLP = new boolean[] {false} ;
      T01NT9_A396EmprCod = new String[] {""} ;
      T01NT9_A13324LDESID = new int[1] ;
      T01NT9_A13333LDESNPeque = new String[] {""} ;
      T01NT14_A396EmprCod = new String[] {""} ;
      T01NT14_A13324LDESID = new int[1] ;
      T01NT14_A13333LDESNPeque = new String[] {""} ;
      T01NT14_A13337LDESComb = new String[] {""} ;
      T01NT14_A13339LDESFondo = new String[] {""} ;
      T01NT15_A396EmprCod = new String[] {""} ;
      T01NT15_A13324LDESID = new int[1] ;
      T01NT15_A13333LDESNPeque = new String[] {""} ;
      T01NT15_A13337LDESComb = new String[] {""} ;
      T01NT15_A13339LDESFondo = new String[] {""} ;
      T01NT8_A13337LDESComb = new String[] {""} ;
      T01NT8_A13339LDESFondo = new String[] {""} ;
      T01NT8_A13346LDESUltP = new short[1] ;
      T01NT8_n13346LDESUltP = new boolean[] {false} ;
      T01NT8_A13345LDESUltLP = new short[1] ;
      T01NT8_n13345LDESUltLP = new boolean[] {false} ;
      T01NT8_A396EmprCod = new String[] {""} ;
      T01NT8_A13324LDESID = new int[1] ;
      T01NT8_A13333LDESNPeque = new String[] {""} ;
      T01NT20_A396EmprCod = new String[] {""} ;
      T01NT20_A13324LDESID = new int[1] ;
      T01NT20_A13333LDESNPeque = new String[] {""} ;
      T01NT20_A13337LDESComb = new String[] {""} ;
      T01NT20_A13339LDESFondo = new String[] {""} ;
      Z718PrdNom = "" ;
      T01NT21_A13324LDESID = new int[1] ;
      T01NT21_A13333LDESNPeque = new String[] {""} ;
      T01NT21_A13337LDESComb = new String[] {""} ;
      T01NT21_A13339LDESFondo = new String[] {""} ;
      T01NT21_A13342LDESLinea = new short[1] ;
      T01NT21_A13344LDESUnd = new String[] {""} ;
      T01NT21_n13344LDESUnd = new boolean[] {false} ;
      T01NT21_A718PrdNom = new String[] {""} ;
      T01NT21_A13343LDESCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NT21_n13343LDESCant = new boolean[] {false} ;
      T01NT21_A396EmprCod = new String[] {""} ;
      T01NT21_A719PrdNum = new String[] {""} ;
      T01NT21_n719PrdNum = new boolean[] {false} ;
      T01NT7_A718PrdNom = new String[] {""} ;
      T01NT22_A718PrdNom = new String[] {""} ;
      T01NT23_A396EmprCod = new String[] {""} ;
      T01NT23_A13324LDESID = new int[1] ;
      T01NT23_A13333LDESNPeque = new String[] {""} ;
      T01NT23_A13337LDESComb = new String[] {""} ;
      T01NT23_A13339LDESFondo = new String[] {""} ;
      T01NT23_A13342LDESLinea = new short[1] ;
      T01NT6_A13324LDESID = new int[1] ;
      T01NT6_A13333LDESNPeque = new String[] {""} ;
      T01NT6_A13337LDESComb = new String[] {""} ;
      T01NT6_A13339LDESFondo = new String[] {""} ;
      T01NT6_A13342LDESLinea = new short[1] ;
      T01NT6_A13344LDESUnd = new String[] {""} ;
      T01NT6_n13344LDESUnd = new boolean[] {false} ;
      T01NT6_A13343LDESCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NT6_n13343LDESCant = new boolean[] {false} ;
      T01NT6_A396EmprCod = new String[] {""} ;
      T01NT6_A719PrdNum = new String[] {""} ;
      T01NT6_n719PrdNum = new boolean[] {false} ;
      T01NT5_A13324LDESID = new int[1] ;
      T01NT5_A13333LDESNPeque = new String[] {""} ;
      T01NT5_A13337LDESComb = new String[] {""} ;
      T01NT5_A13339LDESFondo = new String[] {""} ;
      T01NT5_A13342LDESLinea = new short[1] ;
      T01NT5_A13344LDESUnd = new String[] {""} ;
      T01NT5_n13344LDESUnd = new boolean[] {false} ;
      T01NT5_A13343LDESCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NT5_n13343LDESCant = new boolean[] {false} ;
      T01NT5_A396EmprCod = new String[] {""} ;
      T01NT5_A719PrdNum = new String[] {""} ;
      T01NT5_n719PrdNum = new boolean[] {false} ;
      T01NT27_A718PrdNom = new String[] {""} ;
      T01NT28_A396EmprCod = new String[] {""} ;
      T01NT28_A13324LDESID = new int[1] ;
      T01NT28_A13333LDESNPeque = new String[] {""} ;
      T01NT28_A13337LDESComb = new String[] {""} ;
      T01NT28_A13339LDESFondo = new String[] {""} ;
      T01NT28_A13342LDESLinea = new short[1] ;
      Z2108PasDsc = "" ;
      T01NT29_A13324LDESID = new int[1] ;
      T01NT29_A13333LDESNPeque = new String[] {""} ;
      T01NT29_A13337LDESComb = new String[] {""} ;
      T01NT29_A13339LDESFondo = new String[] {""} ;
      T01NT29_A13340LDESLinP = new short[1] ;
      T01NT29_A13341LDESCantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NT29_n13341LDESCantP = new boolean[] {false} ;
      T01NT29_A2108PasDsc = new String[] {""} ;
      T01NT29_n2108PasDsc = new boolean[] {false} ;
      T01NT29_A396EmprCod = new String[] {""} ;
      T01NT29_A2107PasCod = new String[] {""} ;
      T01NT29_n2107PasCod = new boolean[] {false} ;
      T01NT4_A2108PasDsc = new String[] {""} ;
      T01NT4_n2108PasDsc = new boolean[] {false} ;
      T01NT30_A2108PasDsc = new String[] {""} ;
      T01NT30_n2108PasDsc = new boolean[] {false} ;
      T01NT31_A396EmprCod = new String[] {""} ;
      T01NT31_A13324LDESID = new int[1] ;
      T01NT31_A13333LDESNPeque = new String[] {""} ;
      T01NT31_A13337LDESComb = new String[] {""} ;
      T01NT31_A13339LDESFondo = new String[] {""} ;
      T01NT31_A13340LDESLinP = new short[1] ;
      T01NT3_A13324LDESID = new int[1] ;
      T01NT3_A13333LDESNPeque = new String[] {""} ;
      T01NT3_A13337LDESComb = new String[] {""} ;
      T01NT3_A13339LDESFondo = new String[] {""} ;
      T01NT3_A13340LDESLinP = new short[1] ;
      T01NT3_A13341LDESCantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NT3_n13341LDESCantP = new boolean[] {false} ;
      T01NT3_A396EmprCod = new String[] {""} ;
      T01NT3_A2107PasCod = new String[] {""} ;
      T01NT3_n2107PasCod = new boolean[] {false} ;
      T01NT2_A13324LDESID = new int[1] ;
      T01NT2_A13333LDESNPeque = new String[] {""} ;
      T01NT2_A13337LDESComb = new String[] {""} ;
      T01NT2_A13339LDESFondo = new String[] {""} ;
      T01NT2_A13340LDESLinP = new short[1] ;
      T01NT2_A13341LDESCantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NT2_n13341LDESCantP = new boolean[] {false} ;
      T01NT2_A396EmprCod = new String[] {""} ;
      T01NT2_A2107PasCod = new String[] {""} ;
      T01NT2_n2107PasCod = new boolean[] {false} ;
      T01NT35_A2108PasDsc = new String[] {""} ;
      T01NT35_n2108PasDsc = new boolean[] {false} ;
      T01NT36_A396EmprCod = new String[] {""} ;
      T01NT36_A13324LDESID = new int[1] ;
      T01NT36_A13333LDESNPeque = new String[] {""} ;
      T01NT36_A13337LDESComb = new String[] {""} ;
      T01NT36_A13339LDESFondo = new String[] {""} ;
      T01NT36_A13340LDESLinP = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13344LDESUnd = "" ;
      i13341LDESCantP = DecimalUtil.ZERO ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01NT37_A407EmprNom = new String[] {""} ;
      T01NT37_n407EmprNom = new boolean[] {false} ;
      T01NT38_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ13333LDESNPeque = "" ;
      ZZ13337LDESComb = "" ;
      ZZ13339LDESFondo = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tldes02__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tldes02__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tldes02__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tldes02__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tldes02__default(),
         new Object[] {
             new Object[] {
            T01NT2_A13324LDESID, T01NT2_A13333LDESNPeque, T01NT2_A13337LDESComb, T01NT2_A13339LDESFondo, T01NT2_A13340LDESLinP, T01NT2_A13341LDESCantP, T01NT2_n13341LDESCantP, T01NT2_A396EmprCod, T01NT2_A2107PasCod, T01NT2_n2107PasCod
            }
            , new Object[] {
            T01NT3_A13324LDESID, T01NT3_A13333LDESNPeque, T01NT3_A13337LDESComb, T01NT3_A13339LDESFondo, T01NT3_A13340LDESLinP, T01NT3_A13341LDESCantP, T01NT3_n13341LDESCantP, T01NT3_A396EmprCod, T01NT3_A2107PasCod, T01NT3_n2107PasCod
            }
            , new Object[] {
            T01NT4_A2108PasDsc, T01NT4_n2108PasDsc
            }
            , new Object[] {
            T01NT5_A13324LDESID, T01NT5_A13333LDESNPeque, T01NT5_A13337LDESComb, T01NT5_A13339LDESFondo, T01NT5_A13342LDESLinea, T01NT5_A13344LDESUnd, T01NT5_n13344LDESUnd, T01NT5_A13343LDESCant, T01NT5_n13343LDESCant, T01NT5_A396EmprCod,
            T01NT5_A719PrdNum, T01NT5_n719PrdNum
            }
            , new Object[] {
            T01NT6_A13324LDESID, T01NT6_A13333LDESNPeque, T01NT6_A13337LDESComb, T01NT6_A13339LDESFondo, T01NT6_A13342LDESLinea, T01NT6_A13344LDESUnd, T01NT6_n13344LDESUnd, T01NT6_A13343LDESCant, T01NT6_n13343LDESCant, T01NT6_A396EmprCod,
            T01NT6_A719PrdNum, T01NT6_n719PrdNum
            }
            , new Object[] {
            T01NT7_A718PrdNom
            }
            , new Object[] {
            T01NT8_A13337LDESComb, T01NT8_A13339LDESFondo, T01NT8_A13346LDESUltP, T01NT8_n13346LDESUltP, T01NT8_A13345LDESUltLP, T01NT8_n13345LDESUltLP, T01NT8_A396EmprCod, T01NT8_A13324LDESID, T01NT8_A13333LDESNPeque
            }
            , new Object[] {
            T01NT9_A13337LDESComb, T01NT9_A13339LDESFondo, T01NT9_A13346LDESUltP, T01NT9_n13346LDESUltP, T01NT9_A13345LDESUltLP, T01NT9_n13345LDESUltLP, T01NT9_A396EmprCod, T01NT9_A13324LDESID, T01NT9_A13333LDESNPeque
            }
            , new Object[] {
            T01NT10_A407EmprNom, T01NT10_n407EmprNom
            }
            , new Object[] {
            T01NT11_A396EmprCod
            }
            , new Object[] {
            T01NT12_A13337LDESComb, T01NT12_A13339LDESFondo, T01NT12_A407EmprNom, T01NT12_n407EmprNom, T01NT12_A13346LDESUltP, T01NT12_n13346LDESUltP, T01NT12_A13345LDESUltLP, T01NT12_n13345LDESUltLP, T01NT12_A396EmprCod, T01NT12_A13324LDESID,
            T01NT12_A13333LDESNPeque
            }
            , new Object[] {
            T01NT13_A396EmprCod, T01NT13_A13324LDESID, T01NT13_A13333LDESNPeque, T01NT13_A13337LDESComb, T01NT13_A13339LDESFondo
            }
            , new Object[] {
            T01NT14_A396EmprCod, T01NT14_A13324LDESID, T01NT14_A13333LDESNPeque, T01NT14_A13337LDESComb, T01NT14_A13339LDESFondo
            }
            , new Object[] {
            T01NT15_A396EmprCod, T01NT15_A13324LDESID, T01NT15_A13333LDESNPeque, T01NT15_A13337LDESComb, T01NT15_A13339LDESFondo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NT20_A396EmprCod, T01NT20_A13324LDESID, T01NT20_A13333LDESNPeque, T01NT20_A13337LDESComb, T01NT20_A13339LDESFondo
            }
            , new Object[] {
            T01NT21_A13324LDESID, T01NT21_A13333LDESNPeque, T01NT21_A13337LDESComb, T01NT21_A13339LDESFondo, T01NT21_A13342LDESLinea, T01NT21_A13344LDESUnd, T01NT21_n13344LDESUnd, T01NT21_A718PrdNom, T01NT21_A13343LDESCant, T01NT21_n13343LDESCant,
            T01NT21_A396EmprCod, T01NT21_A719PrdNum, T01NT21_n719PrdNum
            }
            , new Object[] {
            T01NT22_A718PrdNom
            }
            , new Object[] {
            T01NT23_A396EmprCod, T01NT23_A13324LDESID, T01NT23_A13333LDESNPeque, T01NT23_A13337LDESComb, T01NT23_A13339LDESFondo, T01NT23_A13342LDESLinea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NT27_A718PrdNom
            }
            , new Object[] {
            T01NT28_A396EmprCod, T01NT28_A13324LDESID, T01NT28_A13333LDESNPeque, T01NT28_A13337LDESComb, T01NT28_A13339LDESFondo, T01NT28_A13342LDESLinea
            }
            , new Object[] {
            T01NT29_A13324LDESID, T01NT29_A13333LDESNPeque, T01NT29_A13337LDESComb, T01NT29_A13339LDESFondo, T01NT29_A13340LDESLinP, T01NT29_A13341LDESCantP, T01NT29_n13341LDESCantP, T01NT29_A2108PasDsc, T01NT29_n2108PasDsc, T01NT29_A396EmprCod,
            T01NT29_A2107PasCod, T01NT29_n2107PasCod
            }
            , new Object[] {
            T01NT30_A2108PasDsc, T01NT30_n2108PasDsc
            }
            , new Object[] {
            T01NT31_A396EmprCod, T01NT31_A13324LDESID, T01NT31_A13333LDESNPeque, T01NT31_A13337LDESComb, T01NT31_A13339LDESFondo, T01NT31_A13340LDESLinP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NT35_A2108PasDsc, T01NT35_n2108PasDsc
            }
            , new Object[] {
            T01NT36_A396EmprCod, T01NT36_A13324LDESID, T01NT36_A13333LDESNPeque, T01NT36_A13337LDESComb, T01NT36_A13339LDESFondo, T01NT36_A13340LDESLinP
            }
            , new Object[] {
            T01NT37_A407EmprNom, T01NT37_n407EmprNom
            }
            , new Object[] {
            T01NT38_A396EmprCod
            }
         }
      );
      Z13339LDESFondo = "" ;
      A13339LDESFondo = "" ;
      Z13337LDESComb = "" ;
      A13337LDESComb = "" ;
      Z13333LDESNPeque = "" ;
      A13333LDESNPeque = "" ;
      Z13324LDESID = 0 ;
      A13324LDESID = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TLDES02" ;
      Z13341LDESCantP = DecimalUtil.doubleToDec(1) ;
      n13341LDESCantP = false ;
      A13341LDESCantP = DecimalUtil.doubleToDec(1) ;
      n13341LDESCantP = false ;
      i13341LDESCantP = DecimalUtil.doubleToDec(1) ;
      n13341LDESCantP = false ;
      Z13344LDESUnd = httpContext.getMessage( "GRM", "") ;
      n13344LDESUnd = false ;
      A13344LDESUnd = httpContext.getMessage( "GRM", "") ;
      n13344LDESUnd = false ;
      i13344LDESUnd = httpContext.getMessage( "GRM", "") ;
      n13344LDESUnd = false ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV33ContCod1 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short Z13346LDESUltP ;
   private short Z13345LDESUltLP ;
   private short O13346LDESUltP ;
   private short O13345LDESUltLP ;
   private short Z13342LDESLinea ;
   private short nRcdDeleted_1827 ;
   private short nRcdExists_1827 ;
   private short nIsMod_1827 ;
   private short Z13340LDESLinP ;
   private short nRcdDeleted_1826 ;
   private short nRcdExists_1826 ;
   private short nIsMod_1826 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13345LDESUltLP ;
   private short A13346LDESUltP ;
   private short nBlankRcdCount1827 ;
   private short RcdFound1827 ;
   private short B13346LDESUltP ;
   private short B13345LDESUltLP ;
   private short nBlankRcdUsr1827 ;
   private short nBlankRcdCount1826 ;
   private short RcdFound1826 ;
   private short nBlankRcdUsr1826 ;
   private short s13346LDESUltP ;
   private short A13340LDESLinP ;
   private short s13345LDESUltLP ;
   private short A13342LDESLinea ;
   private short RcdFound1825 ;
   private short nIsDirty_1825 ;
   private short nIsDirty_1827 ;
   private short nIsDirty_1826 ;
   private short i13345LDESUltLP ;
   private short i13346LDESUltP ;
   private short ZZ13346LDESUltP ;
   private short ZZ13345LDESUltLP ;
   private short ZO13346LDESUltP ;
   private short ZO13345LDESUltLP ;
   private int wcpOA13324LDESID ;
   private int Z13324LDESID ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int A13324LDESID ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtLDESID_Enabled ;
   private int edtLDESNPeque_Enabled ;
   private int edtLDESComb_Enabled ;
   private int edtLDESFondo_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtLDESUltP_Enabled ;
   private int edtLDESUltLP_Enabled ;
   private int edtavnRcdDeleted_1827_Enabled ;
   private int edtLDESLinea_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtLDESCant_Enabled ;
   private int edtLDESUnd_Enabled ;
   private int fRowAdded ;
   private int edtavnRcdDeleted_1826_Enabled ;
   private int edtLDESLinP_Enabled ;
   private int edtPasCod_Enabled ;
   private int edtPasDsc_Enabled ;
   private int edtLDESCantP_Enabled ;
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
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtLDESLinP_Enabled ;
   private int defedtLDESLinea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtLDESUltLP_Backcolor ;
   private int edtLDESUltP_Backcolor ;
   private int edtLDESFondo_Backcolor ;
   private int edtLDESComb_Backcolor ;
   private int edtLDESNPeque_Backcolor ;
   private int edtLDESID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13324LDESID ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13343LDESCant ;
   private java.math.BigDecimal Z13341LDESCantP ;
   private java.math.BigDecimal A13341LDESCantP ;
   private java.math.BigDecimal A13343LDESCant ;
   private java.math.BigDecimal i13341LDESCantP ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA13333LDESNPeque ;
   private String wcpOA13337LDESComb ;
   private String wcpOA13339LDESFondo ;
   private String Z396EmprCod ;
   private String Z13333LDESNPeque ;
   private String Z13337LDESComb ;
   private String Z13339LDESFondo ;
   private String Z13344LDESUnd ;
   private String Z719PrdNum ;
   private String Z2107PasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A2107PasCod ;
   private String A13333LDESNPeque ;
   private String A13337LDESComb ;
   private String A13339LDESFondo ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_70_idx="0001" ;
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
   private String edtLDESID_Internalname ;
   private String edtLDESID_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtLDESNPeque_Internalname ;
   private String edtLDESNPeque_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtLDESComb_Internalname ;
   private String edtLDESComb_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtLDESFondo_Internalname ;
   private String edtLDESFondo_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtLDESUltP_Internalname ;
   private String edtLDESUltP_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtLDESUltLP_Internalname ;
   private String edtLDESUltLP_Jsonclick ;
   private String sMode1827 ;
   private String edtavnRcdDeleted_1827_Internalname ;
   private String edtLDESLinea_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtLDESCant_Internalname ;
   private String edtLDESUnd_Internalname ;
   private String GX_FocusControl ;
   private String subGrid1_Internalname ;
   private String sMode1826 ;
   private String edtavnRcdDeleted_1826_Internalname ;
   private String edtLDESLinP_Internalname ;
   private String edtPasCod_Internalname ;
   private String edtPasDsc_Internalname ;
   private String edtLDESCantP_Internalname ;
   private String subGrid2_Internalname ;
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
   private String sMode1825 ;
   private String GXCCtl ;
   private String A2108PasDsc ;
   private String A718PrdNom ;
   private String A13344LDESUnd ;
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
   private String Z718PrdNom ;
   private String Z2108PasDsc ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1827_Jsonclick ;
   private String edtLDESLinea_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtLDESCant_Jsonclick ;
   private String edtLDESUnd_Jsonclick ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1826_Jsonclick ;
   private String edtLDESLinP_Jsonclick ;
   private String edtPasCod_Jsonclick ;
   private String edtPasDsc_Jsonclick ;
   private String edtLDESCantP_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i13344LDESUnd ;
   private String subGrid1_Header ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ13333LDESNPeque ;
   private String ZZ13337LDESComb ;
   private String ZZ13339LDESFondo ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n2107PasCod ;
   private boolean wbErr ;
   private boolean n13345LDESUltLP ;
   private boolean n13346LDESUltP ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n13344LDESUnd ;
   private boolean n13343LDESCant ;
   private boolean n13341LDESCantP ;
   private boolean n2108PasDsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01NT10_A407EmprNom ;
   private boolean[] T01NT10_n407EmprNom ;
   private String[] T01NT11_A396EmprCod ;
   private String[] T01NT12_A13337LDESComb ;
   private String[] T01NT12_A13339LDESFondo ;
   private String[] T01NT12_A407EmprNom ;
   private boolean[] T01NT12_n407EmprNom ;
   private short[] T01NT12_A13346LDESUltP ;
   private boolean[] T01NT12_n13346LDESUltP ;
   private short[] T01NT12_A13345LDESUltLP ;
   private boolean[] T01NT12_n13345LDESUltLP ;
   private String[] T01NT12_A396EmprCod ;
   private int[] T01NT12_A13324LDESID ;
   private String[] T01NT12_A13333LDESNPeque ;
   private String[] T01NT13_A396EmprCod ;
   private int[] T01NT13_A13324LDESID ;
   private String[] T01NT13_A13333LDESNPeque ;
   private String[] T01NT13_A13337LDESComb ;
   private String[] T01NT13_A13339LDESFondo ;
   private String[] T01NT9_A13337LDESComb ;
   private String[] T01NT9_A13339LDESFondo ;
   private short[] T01NT9_A13346LDESUltP ;
   private boolean[] T01NT9_n13346LDESUltP ;
   private short[] T01NT9_A13345LDESUltLP ;
   private boolean[] T01NT9_n13345LDESUltLP ;
   private String[] T01NT9_A396EmprCod ;
   private int[] T01NT9_A13324LDESID ;
   private String[] T01NT9_A13333LDESNPeque ;
   private String[] T01NT14_A396EmprCod ;
   private int[] T01NT14_A13324LDESID ;
   private String[] T01NT14_A13333LDESNPeque ;
   private String[] T01NT14_A13337LDESComb ;
   private String[] T01NT14_A13339LDESFondo ;
   private String[] T01NT15_A396EmprCod ;
   private int[] T01NT15_A13324LDESID ;
   private String[] T01NT15_A13333LDESNPeque ;
   private String[] T01NT15_A13337LDESComb ;
   private String[] T01NT15_A13339LDESFondo ;
   private String[] T01NT8_A13337LDESComb ;
   private String[] T01NT8_A13339LDESFondo ;
   private short[] T01NT8_A13346LDESUltP ;
   private boolean[] T01NT8_n13346LDESUltP ;
   private short[] T01NT8_A13345LDESUltLP ;
   private boolean[] T01NT8_n13345LDESUltLP ;
   private String[] T01NT8_A396EmprCod ;
   private int[] T01NT8_A13324LDESID ;
   private String[] T01NT8_A13333LDESNPeque ;
   private String[] T01NT20_A396EmprCod ;
   private int[] T01NT20_A13324LDESID ;
   private String[] T01NT20_A13333LDESNPeque ;
   private String[] T01NT20_A13337LDESComb ;
   private String[] T01NT20_A13339LDESFondo ;
   private int[] T01NT21_A13324LDESID ;
   private String[] T01NT21_A13333LDESNPeque ;
   private String[] T01NT21_A13337LDESComb ;
   private String[] T01NT21_A13339LDESFondo ;
   private short[] T01NT21_A13342LDESLinea ;
   private String[] T01NT21_A13344LDESUnd ;
   private boolean[] T01NT21_n13344LDESUnd ;
   private String[] T01NT21_A718PrdNom ;
   private java.math.BigDecimal[] T01NT21_A13343LDESCant ;
   private boolean[] T01NT21_n13343LDESCant ;
   private String[] T01NT21_A396EmprCod ;
   private String[] T01NT21_A719PrdNum ;
   private boolean[] T01NT21_n719PrdNum ;
   private String[] T01NT7_A718PrdNom ;
   private String[] T01NT22_A718PrdNom ;
   private String[] T01NT23_A396EmprCod ;
   private int[] T01NT23_A13324LDESID ;
   private String[] T01NT23_A13333LDESNPeque ;
   private String[] T01NT23_A13337LDESComb ;
   private String[] T01NT23_A13339LDESFondo ;
   private short[] T01NT23_A13342LDESLinea ;
   private int[] T01NT6_A13324LDESID ;
   private String[] T01NT6_A13333LDESNPeque ;
   private String[] T01NT6_A13337LDESComb ;
   private String[] T01NT6_A13339LDESFondo ;
   private short[] T01NT6_A13342LDESLinea ;
   private String[] T01NT6_A13344LDESUnd ;
   private boolean[] T01NT6_n13344LDESUnd ;
   private java.math.BigDecimal[] T01NT6_A13343LDESCant ;
   private boolean[] T01NT6_n13343LDESCant ;
   private String[] T01NT6_A396EmprCod ;
   private String[] T01NT6_A719PrdNum ;
   private boolean[] T01NT6_n719PrdNum ;
   private int[] T01NT5_A13324LDESID ;
   private String[] T01NT5_A13333LDESNPeque ;
   private String[] T01NT5_A13337LDESComb ;
   private String[] T01NT5_A13339LDESFondo ;
   private short[] T01NT5_A13342LDESLinea ;
   private String[] T01NT5_A13344LDESUnd ;
   private boolean[] T01NT5_n13344LDESUnd ;
   private java.math.BigDecimal[] T01NT5_A13343LDESCant ;
   private boolean[] T01NT5_n13343LDESCant ;
   private String[] T01NT5_A396EmprCod ;
   private String[] T01NT5_A719PrdNum ;
   private boolean[] T01NT5_n719PrdNum ;
   private String[] T01NT27_A718PrdNom ;
   private String[] T01NT28_A396EmprCod ;
   private int[] T01NT28_A13324LDESID ;
   private String[] T01NT28_A13333LDESNPeque ;
   private String[] T01NT28_A13337LDESComb ;
   private String[] T01NT28_A13339LDESFondo ;
   private short[] T01NT28_A13342LDESLinea ;
   private int[] T01NT29_A13324LDESID ;
   private String[] T01NT29_A13333LDESNPeque ;
   private String[] T01NT29_A13337LDESComb ;
   private String[] T01NT29_A13339LDESFondo ;
   private short[] T01NT29_A13340LDESLinP ;
   private java.math.BigDecimal[] T01NT29_A13341LDESCantP ;
   private boolean[] T01NT29_n13341LDESCantP ;
   private String[] T01NT29_A2108PasDsc ;
   private boolean[] T01NT29_n2108PasDsc ;
   private String[] T01NT29_A396EmprCod ;
   private String[] T01NT29_A2107PasCod ;
   private boolean[] T01NT29_n2107PasCod ;
   private String[] T01NT4_A2108PasDsc ;
   private boolean[] T01NT4_n2108PasDsc ;
   private String[] T01NT30_A2108PasDsc ;
   private boolean[] T01NT30_n2108PasDsc ;
   private String[] T01NT31_A396EmprCod ;
   private int[] T01NT31_A13324LDESID ;
   private String[] T01NT31_A13333LDESNPeque ;
   private String[] T01NT31_A13337LDESComb ;
   private String[] T01NT31_A13339LDESFondo ;
   private short[] T01NT31_A13340LDESLinP ;
   private int[] T01NT3_A13324LDESID ;
   private String[] T01NT3_A13333LDESNPeque ;
   private String[] T01NT3_A13337LDESComb ;
   private String[] T01NT3_A13339LDESFondo ;
   private short[] T01NT3_A13340LDESLinP ;
   private java.math.BigDecimal[] T01NT3_A13341LDESCantP ;
   private boolean[] T01NT3_n13341LDESCantP ;
   private String[] T01NT3_A396EmprCod ;
   private String[] T01NT3_A2107PasCod ;
   private boolean[] T01NT3_n2107PasCod ;
   private int[] T01NT2_A13324LDESID ;
   private String[] T01NT2_A13333LDESNPeque ;
   private String[] T01NT2_A13337LDESComb ;
   private String[] T01NT2_A13339LDESFondo ;
   private short[] T01NT2_A13340LDESLinP ;
   private java.math.BigDecimal[] T01NT2_A13341LDESCantP ;
   private boolean[] T01NT2_n13341LDESCantP ;
   private String[] T01NT2_A396EmprCod ;
   private String[] T01NT2_A2107PasCod ;
   private boolean[] T01NT2_n2107PasCod ;
   private String[] T01NT35_A2108PasDsc ;
   private boolean[] T01NT35_n2108PasDsc ;
   private String[] T01NT36_A396EmprCod ;
   private int[] T01NT36_A13324LDESID ;
   private String[] T01NT36_A13333LDESNPeque ;
   private String[] T01NT36_A13337LDESComb ;
   private String[] T01NT36_A13339LDESFondo ;
   private short[] T01NT36_A13340LDESLinP ;
   private String[] T01NT37_A407EmprNom ;
   private boolean[] T01NT37_n407EmprNom ;
   private String[] T01NT38_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tldes02__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes02__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes02__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes02__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NT2", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP, LDESCantP, EmprCod, PasCod FROM TXPLDES03 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ?  FOR UPDATE OF LDESCantP, PasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NT3", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP, LDESCantP, EmprCod, PasCod FROM TXPLDES03 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NT4", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT5", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea, LDESUnd, LDESCant, EmprCod, PrdNum FROM TXPLDES04 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ?  FOR UPDATE OF LDESUnd, LDESCant, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NT6", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea, LDESUnd, LDESCant, EmprCod, PrdNum FROM TXPLDES04 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NT7", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT8", "SELECT LDESComb, LDESFondo, LDESUltP, LDESUltLP, EmprCod, LDESID, LDESNPeque FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?  FOR UPDATE OF LDESUltP, LDESUltLP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT9", "SELECT LDESComb, LDESFondo, LDESUltP, LDESUltLP, EmprCod, LDESID, LDESNPeque FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT11", "SELECT EmprCod FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT12", "SELECT /*+ FIRST_ROWS(1) */ TM1.LDESComb, TM1.LDESFondo, T2.EmprNom, TM1.LDESUltP, TM1.LDESUltLP, TM1.EmprCod, TM1.LDESID, TM1.LDESNPeque FROM (TXPLDES02 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.LDESID = ? and TM1.LDESNPeque = ? and TM1.LDESComb = ? and TM1.LDESFondo = ? ORDER BY TM1.EmprCod, TM1.LDESID, TM1.LDESNPeque, TM1.LDESComb, TM1.LDESFondo ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod DESC, LDESID DESC, LDESNPeque DESC, LDESComb DESC, LDESFondo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NT16", "INSERT INTO TXPLDES02(LDESComb, LDESFondo, LDESUltP, LDESUltLP, EmprCod, LDESID, LDESNPeque, LDESComdD, LDESFecEnv, LDESFecRep, LDESEstCb) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK, "TXPLDES02")
         ,new UpdateCursor("T01NT17", "UPDATE TXPLDES02 SET LDESUltP=?, LDESUltLP=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?", GX_NOMASK, "TXPLDES02")
         ,new UpdateCursor("T01NT18", "DELETE FROM TXPLDES02  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?", GX_NOMASK, "TXPLDES02")
         ,new UpdateCursor("T01NT19", "UPDATE TXPLDES02 SET LDESUltP=?, LDESUltLP=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?", GX_NOMASK, "TXPLDES02")
         ,new ForEachCursor("T01NT20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT21", "SELECT T1.LDESID, T1.LDESNPeque, T1.LDESComb, T1.LDESFondo, T1.LDESLinea, T1.LDESUnd, T2.PrdNom, T1.LDESCant, T1.EmprCod, T1.PrdNum FROM (TXPLDES04 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.LDESID = ? and T1.LDESNPeque = ? and T1.LDESComb = ? and T1.LDESFondo = ? and T1.LDESLinea = ? ORDER BY T1.EmprCod, T1.LDESID, T1.LDESNPeque, T1.LDESComb, T1.LDESFondo, T1.LDESLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NT22", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT23", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NT24", "INSERT INTO TXPLDES04(LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea, LDESUnd, LDESCant, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLDES04")
         ,new UpdateCursor("T01NT25", "UPDATE TXPLDES04 SET LDESUnd=?, LDESCant=?, PrdNum=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ?", GX_NOMASK, "TXPLDES04")
         ,new UpdateCursor("T01NT26", "DELETE FROM TXPLDES04  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ?", GX_NOMASK, "TXPLDES04")
         ,new ForEachCursor("T01NT27", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT28", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NT29", "SELECT T1.LDESID, T1.LDESNPeque, T1.LDESComb, T1.LDESFondo, T1.LDESLinP, T1.LDESCantP, T2.PasDsc, T1.EmprCod, T1.PasCod FROM (TXPLDES03 T1 LEFT JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.LDESID = ? and T1.LDESNPeque = ? and T1.LDESComb = ? and T1.LDESFondo = ? and T1.LDESLinP = ? ORDER BY T1.EmprCod, T1.LDESID, T1.LDESNPeque, T1.LDESComb, T1.LDESFondo, T1.LDESLinP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NT30", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT31", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP FROM TXPLDES03 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NT32", "INSERT INTO TXPLDES03(LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP, LDESCantP, EmprCod, PasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLDES03")
         ,new UpdateCursor("T01NT33", "UPDATE TXPLDES03 SET LDESCantP=?, PasCod=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ?", GX_NOMASK, "TXPLDES03")
         ,new UpdateCursor("T01NT34", "DELETE FROM TXPLDES03  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ?", GX_NOMASK, "TXPLDES03")
         ,new ForEachCursor("T01NT35", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT36", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP FROM TXPLDES03 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NT37", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NT38", "SELECT EmprCod FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 12);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 12);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
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
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 12);
               stmt.setString(2, (String)parms[1], 12);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setString(7, (String)parms[8], 12);
               return;
            case 15 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 12);
               stmt.setString(6, (String)parms[7], 12);
               stmt.setString(7, (String)parms[8], 12);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 17 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 12);
               stmt.setString(6, (String)parms[7], 12);
               stmt.setString(7, (String)parms[8], 12);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 3);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 3);
               }
               stmt.setString(8, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 6);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setString(3, (String)parms[5], 6);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               stmt.setString(8, (String)parms[10], 12);
               stmt.setShort(9, ((Number) parms[11]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 3);
               }
               stmt.setString(7, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 6);
               }
               return;
            case 31 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 12);
               stmt.setString(6, (String)parms[7], 12);
               stmt.setString(7, (String)parms[8], 12);
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
      }
   }

}

