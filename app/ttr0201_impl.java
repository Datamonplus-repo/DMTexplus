package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr0201_impl extends GXDataArea
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
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.GetPar( "ForSer") ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A9766ForProC = httpContext.GetPar( "ForProC") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
            A10288Hp_dia = localUtil.parseDateParm( httpContext.GetPar( "Hp_dia")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
            A10290Hp_lin = (int)(GXutil.lval( httpContext.GetPar( "Hp_lin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10290Hp_lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10290Hp_lin), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO PRECIOS-DETALLE", ""), (short)(0)) ;
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
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
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

   public ttr0201_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr0201_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr0201_impl.class ));
   }

   public ttr0201_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR0201.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForProC_Internalname, GXutil.rtrim( A9766ForProC), GXutil.rtrim( localUtil.format( A9766ForProC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForProC_Jsonclick, 0, "", "", "", "", "", 1, edtForProC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Dia Modificacion Precio", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtHp_dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHp_dia_Internalname, localUtil.format(A10288Hp_dia, "99/99/99"), localUtil.format( A10288Hp_dia, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHp_dia_Jsonclick, 0, "", "", "", "", "", 1, edtHp_dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0201.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHp_dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHp_dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTR0201.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0201.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHp_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10290Hp_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHp_lin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10290Hp_lin), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10290Hp_lin), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHp_lin_Jsonclick, 0, "", "", "", "", "", 1, edtHp_lin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
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
         nBlankRcdCount1399 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1399 = (short)(1) ;
            scanStart17T1399( ) ;
            while ( RcdFound1399 != 0 )
            {
               init_level_properties1399( ) ;
               getByPrimaryKey17T1399( ) ;
               addRow17T1399( ) ;
               scanNext17T1399( ) ;
            }
            scanEnd17T1399( ) ;
            nBlankRcdCount1399 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal17T1399( ) ;
         standaloneModal17T1399( ) ;
         sMode1399 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow17T1399( ) ;
            edtavnRcdDeleted_1399_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1399_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1399_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1399_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_Ld_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_LD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_Ld_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Ld_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_Fs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_FS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_Fs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Fs_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_Df_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_DF_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_Df_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Df_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_pkd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_PKD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_pkd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_pkd_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_pmd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_PMD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_pmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_pmd_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1399 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal17T1399( ) ;
            }
            sendRow17T1399( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1399 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1399 = (short)(5) ;
         nRcdExists_1399 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart17T1399( ) ;
            while ( RcdFound1399 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701399( ) ;
               init_level_properties1399( ) ;
               standaloneNotModal17T1399( ) ;
               getByPrimaryKey17T1399( ) ;
               standaloneModal17T1399( ) ;
               addRow17T1399( ) ;
               scanNext17T1399( ) ;
            }
            scanEnd17T1399( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1399 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701399( ) ;
      initAll17T1399( ) ;
      init_level_properties1399( ) ;
      nRcdExists_1399 = (short)(0) ;
      nIsMod_1399 = (short)(0) ;
      nRcdDeleted_1399 = (short)(0) ;
      nBlankRcdCount1399 = (short)(nBlankRcdUsr1399+nBlankRcdCount1399) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1399 > 0 )
      {
         standaloneNotModal17T1399( ) ;
         standaloneModal17T1399( ) ;
         addRow17T1399( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHp_Ld_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1399 = (short)(nBlankRcdCount1399-1) ;
      }
      Gx_mode = sMode1399 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0201.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR0201.htm");
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
      e1117T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z494ForSer = httpContext.cgiGet( "Z494ForSer") ;
            Z482ForColNom = httpContext.cgiGet( "Z482ForColNom") ;
            Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9766ForProC = httpContext.cgiGet( "Z9766ForProC") ;
            Z10288Hp_dia = localUtil.ctod( httpContext.cgiGet( "Z10288Hp_dia"), 0) ;
            Z10290Hp_lin = (int)(localUtil.ctol( httpContext.cgiGet( "Z10290Hp_lin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A9766ForProC = httpContext.cgiGet( edtForProC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
            A10288Hp_dia = localUtil.ctod( httpContext.cgiGet( edtHp_dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
            A10290Hp_lin = (int)(localUtil.ctol( httpContext.cgiGet( edtHp_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10290Hp_lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10290Hp_lin), 6, 0));
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A9766ForProC = httpContext.GetPar( "ForProC") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
               A10288Hp_dia = localUtil.parseDateParm( httpContext.GetPar( "Hp_dia")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
               A10290Hp_lin = (int)(GXutil.lval( httpContext.GetPar( "Hp_lin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10290Hp_lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10290Hp_lin), 6, 0));
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
                        e1117T2 ();
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
            initAll17T1398( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1399_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1399_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributes17T1398( ) ;
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

   public void confirm_17T0( )
   {
      beforeValidate17T1398( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17T1398( ) ;
         }
         else
         {
            checkExtendedTable17T1398( ) ;
            if ( AnyError == 0 )
            {
               zm17T1398( 2) ;
               zm17T1398( 3) ;
            }
            closeExtendedTableCursors17T1398( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1398 = Gx_mode ;
         confirm_17T1399( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1398 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1398 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues17T0( ) ;
      }
   }

   public void confirm_17T1399( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow17T1399( ) ;
         if ( ( nRcdExists_1399 != 0 ) || ( nIsMod_1399 != 0 ) )
         {
            getKey17T1399( ) ;
            if ( ( nRcdExists_1399 == 0 ) && ( nRcdDeleted_1399 == 0 ) )
            {
               if ( RcdFound1399 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate17T1399( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable17T1399( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors17T1399( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HP_LD_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHp_Ld_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1399 != 0 )
               {
                  if ( nRcdDeleted_1399 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey17T1399( ) ;
                     load17T1399( ) ;
                     beforeValidate17T1399( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls17T1399( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1399 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate17T1399( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable17T1399( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors17T1399( ) ;
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
                  if ( nRcdDeleted_1399 == 0 )
                  {
                     GXCCtl = "HP_LD_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHp_Ld_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1399_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_Ld_Internalname, GXutil.ltrim( localUtil.ntoc( A10296Hp_Ld, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_Fs_Internalname, GXutil.rtrim( A10297Hp_Fs)) ;
         httpContext.changePostValue( edtHp_Df_Internalname, GXutil.rtrim( A10298Hp_Df)) ;
         httpContext.changePostValue( edtHp_pkd_Internalname, GXutil.ltrim( localUtil.ntoc( A10299Hp_pkd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_pmd_Internalname, GXutil.ltrim( localUtil.ntoc( A10300Hp_pmd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10296Hp_Ld_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10296Hp_Ld, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10297Hp_Fs_"+sGXsfl_70_idx, GXutil.rtrim( Z10297Hp_Fs)) ;
         httpContext.changePostValue( "ZT_"+"Z10298Hp_Df_"+sGXsfl_70_idx, GXutil.rtrim( Z10298Hp_Df)) ;
         httpContext.changePostValue( "ZT_"+"Z10299Hp_pkd_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10299Hp_pkd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10300Hp_pmd_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10300Hp_pmd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1399_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1399_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1399_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1399 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1399_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1399_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_LD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Ld_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_FS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Fs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_DF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Df_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_PKD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pkd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_PMD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pmd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption17T0( )
   {
   }

   public void e1117T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr0201_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttr0201_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr0201_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Cliente", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Articulo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Color", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV17Lit5 = httpContext.getMessage( "Tc", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttr0201_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr0201_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr0201_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17T1398( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z10290Hp_lin = A10290Hp_lin ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z9766ForProC = A9766ForProC ;
         Z10288Hp_dia = A10288Hp_dia ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TTR0201" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T017T6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017T6_A407EmprNom[0] ;
      n407EmprNom = T017T6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T017T7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR0200", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HP_DIA");
         AnyError = (short)(1) ;
      }
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

   public void load17T1398( )
   {
      /* Using cursor T017T8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1398 = (short)(1) ;
         A407EmprNom = T017T8_A407EmprNom[0] ;
         n407EmprNom = T017T8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm17T1398( -1) ;
      }
      pr_default.close(6);
      onLoadActions17T1398( ) ;
   }

   public void onLoadActions17T1398( )
   {
   }

   public void checkExtendedTable17T1398( )
   {
      nIsDirty_1398 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17T1398( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17T1398( )
   {
      /* Using cursor T017T9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1398 = (short)(1) ;
      }
      else
      {
         RcdFound1398 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017T5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      if ( (pr_default.getStatus(3) != 101) && ( T017T5_A10290Hp_lin[0] == A10290Hp_lin ) && ( GXutil.strcmp(T017T5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017T5_A252CliCod[0] == A252CliCod ) && ( T017T5_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017T5_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017T5_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017T5_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T017T5_A9766ForProC[0], A9766ForProC) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017T5_A10288Hp_dia[0]), GXutil.resetTime(A10288Hp_dia)) )
      {
         zm17T1398( 1) ;
         RcdFound1398 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z10288Hp_dia = A10288Hp_dia ;
         Z10290Hp_lin = A10290Hp_lin ;
         sMode1398 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17T1398( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1398 = (short)(0) ;
            initializeNonKey17T1398( ) ;
         }
         Gx_mode = sMode1398 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1398 = (short)(0) ;
         initializeNonKey17T1398( ) ;
         sMode1398 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1398 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey17T1398( ) ;
      if ( RcdFound1398 == 0 )
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
      RcdFound1398 = (short)(0) ;
      /* Using cursor T017T10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T017T10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017T10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017T10_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017T10_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017T10_A483ForColNum[0] == A483ForColNum ) && ( T017T10_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017T10_A9766ForProC[0], A9766ForProC) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017T10_A10288Hp_dia[0]), GXutil.resetTime(A10288Hp_dia)) && ( T017T10_A10290Hp_lin[0] == A10290Hp_lin ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T017T10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017T10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017T10_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017T10_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017T10_A483ForColNum[0] == A483ForColNum ) && ( T017T10_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017T10_A9766ForProC[0], A9766ForProC) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017T10_A10288Hp_dia[0]), GXutil.resetTime(A10288Hp_dia)) && ( T017T10_A10290Hp_lin[0] == A10290Hp_lin ) )
         {
            RcdFound1398 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1398 = (short)(0) ;
      /* Using cursor T017T11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017T11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017T11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017T11_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017T11_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017T11_A483ForColNum[0] == A483ForColNum ) && ( T017T11_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017T11_A9766ForProC[0], A9766ForProC) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017T11_A10288Hp_dia[0]), GXutil.resetTime(A10288Hp_dia)) && ( T017T11_A10290Hp_lin[0] == A10290Hp_lin ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017T11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017T11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017T11_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017T11_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017T11_A483ForColNum[0] == A483ForColNum ) && ( T017T11_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017T11_A9766ForProC[0], A9766ForProC) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017T11_A10288Hp_dia[0]), GXutil.resetTime(A10288Hp_dia)) && ( T017T11_A10290Hp_lin[0] == A10290Hp_lin ) )
         {
            RcdFound1398 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17T1398( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert17T1398( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1398 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) || ( A10290Hp_lin != Z10290Hp_lin ) )
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
               update17T1398( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) || ( A10290Hp_lin != Z10290Hp_lin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert17T1398( ) ;
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
                  insert17T1398( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) || ( A10290Hp_lin != Z10290Hp_lin ) )
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
      getKey17T1398( ) ;
      if ( RcdFound1398 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) || ( A10290Hp_lin != Z10290Hp_lin ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) || ( A10290Hp_lin != Z10290Hp_lin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0201");
   }

   public void insert_check( )
   {
      confirm_17T0( ) ;
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
      if ( RcdFound1398 == 0 )
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
      scanStart17T1398( ) ;
      if ( RcdFound1398 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17T1398( ) ;
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
      if ( RcdFound1398 == 0 )
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
      if ( RcdFound1398 == 0 )
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
      scanStart17T1398( ) ;
      if ( RcdFound1398 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1398 != 0 )
         {
            scanNext17T1398( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17T1398( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17T1398( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017T4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0201"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0201"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17T1398( )
   {
      beforeValidate17T1398( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17T1398( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17T1398( 0) ;
         checkOptimisticConcurrency17T1398( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17T1398( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17T1398( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017T12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A10290Hp_lin), A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), A9766ForProC, A10288Hp_dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0201");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel17T1398( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption17T0( ) ;
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
            load17T1398( ) ;
         }
         endLevel17T1398( ) ;
      }
      closeExtendedTableCursors17T1398( ) ;
   }

   public void update17T1398( )
   {
      beforeValidate17T1398( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17T1398( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17T1398( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17T1398( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17T1398( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPTR0201 */
                  deferredUpdate17T1398( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel17T1398( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption17T0( ) ;
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
         endLevel17T1398( ) ;
      }
      closeExtendedTableCursors17T1398( ) ;
   }

   public void deferredUpdate17T1398( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17T1398( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17T1398( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17T1398( ) ;
         afterConfirm17T1398( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17T1398( ) ;
            if ( AnyError == 0 )
            {
               scanStart17T1399( ) ;
               while ( RcdFound1399 != 0 )
               {
                  getByPrimaryKey17T1399( ) ;
                  delete17T1399( ) ;
                  scanNext17T1399( ) ;
               }
               scanEnd17T1399( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017T13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0201");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1398 == 0 )
                        {
                           initAll17T1398( ) ;
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
                        resetCaption17T0( ) ;
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
      sMode1398 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17T1398( ) ;
      Gx_mode = sMode1398 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17T1398( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel17T1399( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow17T1399( ) ;
         if ( ( nRcdExists_1399 != 0 ) || ( nIsMod_1399 != 0 ) )
         {
            standaloneNotModal17T1399( ) ;
            getKey17T1399( ) ;
            if ( ( nRcdExists_1399 == 0 ) && ( nRcdDeleted_1399 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert17T1399( ) ;
            }
            else
            {
               if ( RcdFound1399 != 0 )
               {
                  if ( ( nRcdDeleted_1399 != 0 ) && ( nRcdExists_1399 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete17T1399( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1399 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update17T1399( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1399 == 0 )
                  {
                     GXCCtl = "HP_LD_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHp_Ld_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1399_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_Ld_Internalname, GXutil.ltrim( localUtil.ntoc( A10296Hp_Ld, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_Fs_Internalname, GXutil.rtrim( A10297Hp_Fs)) ;
         httpContext.changePostValue( edtHp_Df_Internalname, GXutil.rtrim( A10298Hp_Df)) ;
         httpContext.changePostValue( edtHp_pkd_Internalname, GXutil.ltrim( localUtil.ntoc( A10299Hp_pkd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_pmd_Internalname, GXutil.ltrim( localUtil.ntoc( A10300Hp_pmd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10296Hp_Ld_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10296Hp_Ld, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10297Hp_Fs_"+sGXsfl_70_idx, GXutil.rtrim( Z10297Hp_Fs)) ;
         httpContext.changePostValue( "ZT_"+"Z10298Hp_Df_"+sGXsfl_70_idx, GXutil.rtrim( Z10298Hp_Df)) ;
         httpContext.changePostValue( "ZT_"+"Z10299Hp_pkd_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10299Hp_pkd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10300Hp_pmd_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10300Hp_pmd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1399_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1399_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1399_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1399 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1399_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1399_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_LD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Ld_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_FS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Fs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_DF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Df_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_PKD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pkd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_PMD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pmd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll17T1399( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1399 = (short)(0) ;
      nIsMod_1399 = (short)(0) ;
      nRcdDeleted_1399 = (short)(0) ;
   }

   public void processLevel17T1398( )
   {
      /* Save parent mode. */
      sMode1398 = Gx_mode ;
      processNestedLevel17T1399( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1398 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel17T1398( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17T1398( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr0201");
         if ( AnyError == 0 )
         {
            confirmValues17T0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0201");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17T1398( )
   {
      /* Scan By routine */
      /* Using cursor T017T14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      RcdFound1398 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1398 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17T1398( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1398 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1398 = (short)(1) ;
      }
   }

   public void scanEnd17T1398( )
   {
      pr_default.close(12);
   }

   public void afterConfirm17T1398( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17T1398( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17T1398( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17T1398( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17T1398( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17T1398( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17T1398( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtForProC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), true);
      edtHp_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_dia_Enabled), 5, 0), true);
      edtHp_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_lin_Enabled), 5, 0), true);
   }

   public void zm17T1399( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10297Hp_Fs = T017T3_A10297Hp_Fs[0] ;
            Z10298Hp_Df = T017T3_A10298Hp_Df[0] ;
            Z10299Hp_pkd = T017T3_A10299Hp_pkd[0] ;
            Z10300Hp_pmd = T017T3_A10300Hp_pmd[0] ;
         }
         else
         {
            Z10297Hp_Fs = A10297Hp_Fs ;
            Z10298Hp_Df = A10298Hp_Df ;
            Z10299Hp_pkd = A10299Hp_pkd ;
            Z10300Hp_pmd = A10300Hp_pmd ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z10288Hp_dia = A10288Hp_dia ;
         Z10290Hp_lin = A10290Hp_lin ;
         Z10296Hp_Ld = A10296Hp_Ld ;
         Z10297Hp_Fs = A10297Hp_Fs ;
         Z10298Hp_Df = A10298Hp_Df ;
         Z10299Hp_pkd = A10299Hp_pkd ;
         Z10300Hp_pmd = A10300Hp_pmd ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal17T1399( )
   {
   }

   public void standaloneModal17T1399( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHp_Ld_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHp_Ld_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Ld_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtHp_Ld_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHp_Ld_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Ld_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void load17T1399( )
   {
      /* Using cursor T017T15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin), Short.valueOf(A10296Hp_Ld)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1399 = (short)(1) ;
         A10297Hp_Fs = T017T15_A10297Hp_Fs[0] ;
         n10297Hp_Fs = T017T15_n10297Hp_Fs[0] ;
         A10298Hp_Df = T017T15_A10298Hp_Df[0] ;
         n10298Hp_Df = T017T15_n10298Hp_Df[0] ;
         A10299Hp_pkd = T017T15_A10299Hp_pkd[0] ;
         n10299Hp_pkd = T017T15_n10299Hp_pkd[0] ;
         A10300Hp_pmd = T017T15_A10300Hp_pmd[0] ;
         n10300Hp_pmd = T017T15_n10300Hp_pmd[0] ;
         zm17T1399( -4) ;
      }
      pr_default.close(13);
      onLoadActions17T1399( ) ;
   }

   public void onLoadActions17T1399( )
   {
   }

   public void checkExtendedTable17T1399( )
   {
      nIsDirty_1399 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal17T1399( ) ;
   }

   public void closeExtendedTableCursors17T1399( )
   {
   }

   public void enableDisable17T1399( )
   {
   }

   public void getKey17T1399( )
   {
      /* Using cursor T017T16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin), Short.valueOf(A10296Hp_Ld)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1399 = (short)(1) ;
      }
      else
      {
         RcdFound1399 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey17T1399( )
   {
      /* Using cursor T017T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin), Short.valueOf(A10296Hp_Ld)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017T3_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017T3_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017T3_A483ForColNum[0] == A483ForColNum ) && ( T017T3_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017T3_A9766ForProC[0], A9766ForProC) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017T3_A10288Hp_dia[0]), GXutil.resetTime(A10288Hp_dia)) && ( T017T3_A10290Hp_lin[0] == A10290Hp_lin ) && ( GXutil.strcmp(T017T3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017T3_A252CliCod[0] == A252CliCod ) )
      {
         zm17T1399( 4) ;
         RcdFound1399 = (short)(1) ;
         initializeNonKey17T1399( ) ;
         A10296Hp_Ld = T017T3_A10296Hp_Ld[0] ;
         A10297Hp_Fs = T017T3_A10297Hp_Fs[0] ;
         n10297Hp_Fs = T017T3_n10297Hp_Fs[0] ;
         A10298Hp_Df = T017T3_A10298Hp_Df[0] ;
         n10298Hp_Df = T017T3_n10298Hp_Df[0] ;
         A10299Hp_pkd = T017T3_A10299Hp_pkd[0] ;
         n10299Hp_pkd = T017T3_n10299Hp_pkd[0] ;
         A10300Hp_pmd = T017T3_A10300Hp_pmd[0] ;
         n10300Hp_pmd = T017T3_n10300Hp_pmd[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z10288Hp_dia = A10288Hp_dia ;
         Z10290Hp_lin = A10290Hp_lin ;
         Z10296Hp_Ld = A10296Hp_Ld ;
         sMode1399 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17T1399( ) ;
         load17T1399( ) ;
         Gx_mode = sMode1399 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1399 = (short)(0) ;
         initializeNonKey17T1399( ) ;
         sMode1399 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17T1399( ) ;
         Gx_mode = sMode1399 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes17T1399( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency17T1399( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017T2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin), Short.valueOf(A10296Hp_Ld)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0202"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10297Hp_Fs, T017T2_A10297Hp_Fs[0]) != 0 ) || ( GXutil.strcmp(Z10298Hp_Df, T017T2_A10298Hp_Df[0]) != 0 ) || ( DecimalUtil.compareTo(Z10299Hp_pkd, T017T2_A10299Hp_pkd[0]) != 0 ) || ( DecimalUtil.compareTo(Z10300Hp_pmd, T017T2_A10300Hp_pmd[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10297Hp_Fs, T017T2_A10297Hp_Fs[0]) != 0 )
            {
               GXutil.writeLogln("ttr0201:[seudo value changed for attri]"+"Hp_Fs");
               GXutil.writeLogRaw("Old: ",Z10297Hp_Fs);
               GXutil.writeLogRaw("Current: ",T017T2_A10297Hp_Fs[0]);
            }
            if ( GXutil.strcmp(Z10298Hp_Df, T017T2_A10298Hp_Df[0]) != 0 )
            {
               GXutil.writeLogln("ttr0201:[seudo value changed for attri]"+"Hp_Df");
               GXutil.writeLogRaw("Old: ",Z10298Hp_Df);
               GXutil.writeLogRaw("Current: ",T017T2_A10298Hp_Df[0]);
            }
            if ( DecimalUtil.compareTo(Z10299Hp_pkd, T017T2_A10299Hp_pkd[0]) != 0 )
            {
               GXutil.writeLogln("ttr0201:[seudo value changed for attri]"+"Hp_pkd");
               GXutil.writeLogRaw("Old: ",Z10299Hp_pkd);
               GXutil.writeLogRaw("Current: ",T017T2_A10299Hp_pkd[0]);
            }
            if ( DecimalUtil.compareTo(Z10300Hp_pmd, T017T2_A10300Hp_pmd[0]) != 0 )
            {
               GXutil.writeLogln("ttr0201:[seudo value changed for attri]"+"Hp_pmd");
               GXutil.writeLogRaw("Old: ",Z10300Hp_pmd);
               GXutil.writeLogRaw("Current: ",T017T2_A10300Hp_pmd[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0202"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17T1399( )
   {
      beforeValidate17T1399( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17T1399( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17T1399( 0) ;
         checkOptimisticConcurrency17T1399( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17T1399( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17T1399( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017T17 */
                  pr_default.execute(15, new Object[] {A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin), Short.valueOf(A10296Hp_Ld), Boolean.valueOf(n10297Hp_Fs), A10297Hp_Fs, Boolean.valueOf(n10298Hp_Df), A10298Hp_Df, Boolean.valueOf(n10299Hp_pkd), A10299Hp_pkd, Boolean.valueOf(n10300Hp_pmd), A10300Hp_pmd, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0202");
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
            load17T1399( ) ;
         }
         endLevel17T1399( ) ;
      }
      closeExtendedTableCursors17T1399( ) ;
   }

   public void update17T1399( )
   {
      beforeValidate17T1399( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17T1399( ) ;
      }
      if ( ( nIsMod_1399 != 0 ) || ( nIsDirty_1399 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency17T1399( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm17T1399( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate17T1399( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017T18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n10297Hp_Fs), A10297Hp_Fs, Boolean.valueOf(n10298Hp_Df), A10298Hp_Df, Boolean.valueOf(n10299Hp_pkd), A10299Hp_pkd, Boolean.valueOf(n10300Hp_pmd), A10300Hp_pmd, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin), Short.valueOf(A10296Hp_Ld)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0202");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0202"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate17T1399( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey17T1399( ) ;
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
            endLevel17T1399( ) ;
         }
      }
      closeExtendedTableCursors17T1399( ) ;
   }

   public void deferredUpdate17T1399( )
   {
   }

   public void delete17T1399( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17T1399( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17T1399( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17T1399( ) ;
         afterConfirm17T1399( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17T1399( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017T19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin), Short.valueOf(A10296Hp_Ld)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0202");
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
      sMode1399 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17T1399( ) ;
      Gx_mode = sMode1399 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17T1399( )
   {
      standaloneModal17T1399( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel17T1399( )
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

   public void scanStart17T1399( )
   {
      /* Scan By routine */
      /* Using cursor T017T20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      RcdFound1399 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1399 = (short)(1) ;
         A10296Hp_Ld = T017T20_A10296Hp_Ld[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17T1399( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1399 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1399 = (short)(1) ;
         A10296Hp_Ld = T017T20_A10296Hp_Ld[0] ;
      }
   }

   public void scanEnd17T1399( )
   {
      pr_default.close(18);
   }

   public void afterConfirm17T1399( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17T1399( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17T1399( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17T1399( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17T1399( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17T1399( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17T1399( )
   {
      edtHp_Ld_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_Ld_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Ld_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_Fs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_Fs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Fs_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_Df_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_Df_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Df_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_pkd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_pkd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_pkd_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_pmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_pmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_pmd_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashes17T1399( )
   {
   }

   public void send_integrity_lvl_hashes17T1398( )
   {
   }

   public void subsflControlProps_701399( )
   {
      edtavnRcdDeleted_1399_Internalname = "vNRCDDELETED_1399_"+sGXsfl_70_idx ;
      edtHp_Ld_Internalname = "HP_LD_"+sGXsfl_70_idx ;
      edtHp_Fs_Internalname = "HP_FS_"+sGXsfl_70_idx ;
      edtHp_Df_Internalname = "HP_DF_"+sGXsfl_70_idx ;
      edtHp_pkd_Internalname = "HP_PKD_"+sGXsfl_70_idx ;
      edtHp_pmd_Internalname = "HP_PMD_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701399( )
   {
      edtavnRcdDeleted_1399_Internalname = "vNRCDDELETED_1399_"+sGXsfl_70_fel_idx ;
      edtHp_Ld_Internalname = "HP_LD_"+sGXsfl_70_fel_idx ;
      edtHp_Fs_Internalname = "HP_FS_"+sGXsfl_70_fel_idx ;
      edtHp_Df_Internalname = "HP_DF_"+sGXsfl_70_fel_idx ;
      edtHp_pkd_Internalname = "HP_PKD_"+sGXsfl_70_fel_idx ;
      edtHp_pmd_Internalname = "HP_PMD_"+sGXsfl_70_fel_idx ;
   }

   public void addRow17T1399( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701399( ) ;
      sendRow17T1399( ) ;
   }

   public void sendRow17T1399( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1399_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1399_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1399_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1399), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1399), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1399_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1399_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1399_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_Ld_Internalname,GXutil.ltrim( localUtil.ntoc( A10296Hp_Ld, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10296Hp_Ld), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_Ld_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_Ld_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1399_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_Fs_Internalname,GXutil.rtrim( A10297Hp_Fs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_Fs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_Fs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1399_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_Df_Internalname,GXutil.rtrim( A10298Hp_Df),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_Df_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_Df_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1399_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_pkd_Internalname,GXutil.ltrim( localUtil.ntoc( A10299Hp_pkd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHp_pkd_Enabled!=0) ? localUtil.format( A10299Hp_pkd, "ZZZZZZ9.99999") : localUtil.format( A10299Hp_pkd, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_pkd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_pkd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1399_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_pmd_Internalname,GXutil.ltrim( localUtil.ntoc( A10300Hp_pmd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHp_pmd_Enabled!=0) ? localUtil.format( A10300Hp_pmd, "ZZZZZZ9.99999") : localUtil.format( A10300Hp_pmd, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_pmd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_pmd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes17T1399( ) ;
      GXCCtl = "Z10296Hp_Ld_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10296Hp_Ld, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10297Hp_Fs_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10297Hp_Fs));
      GXCCtl = "Z10298Hp_Df_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10298Hp_Df));
      GXCCtl = "Z10299Hp_pkd_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10299Hp_pkd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10300Hp_pmd_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10300Hp_pmd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1399_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1399_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1399_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1399, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1399_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1399_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_LD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Ld_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_FS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Fs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_DF_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Df_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_PKD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pkd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_PMD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pmd_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow17T1399( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701399( ) ;
      edtavnRcdDeleted_1399_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1399_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_Ld_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_LD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_Fs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_FS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_Df_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_DF_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_pkd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_PKD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_pmd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_PMD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1399_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1399_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1399");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1399_Internalname ;
         wbErr = true ;
         nRcdDeleted_1399 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1399 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1399_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHp_Ld_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHp_Ld_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HP_LD_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_Ld_Internalname ;
         wbErr = true ;
         A10296Hp_Ld = (short)(0) ;
      }
      else
      {
         A10296Hp_Ld = (short)(localUtil.ctol( httpContext.cgiGet( edtHp_Ld_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10297Hp_Fs = httpContext.cgiGet( edtHp_Fs_Internalname) ;
      n10297Hp_Fs = false ;
      A10298Hp_Df = httpContext.cgiGet( edtHp_Df_Internalname) ;
      n10298Hp_Df = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHp_pkd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHp_pkd_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "HP_PKD_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_pkd_Internalname ;
         wbErr = true ;
         A10299Hp_pkd = DecimalUtil.ZERO ;
         n10299Hp_pkd = false ;
      }
      else
      {
         A10299Hp_pkd = localUtil.ctond( httpContext.cgiGet( edtHp_pkd_Internalname)) ;
         n10299Hp_pkd = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHp_pmd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHp_pmd_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "HP_PMD_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_pmd_Internalname ;
         wbErr = true ;
         A10300Hp_pmd = DecimalUtil.ZERO ;
         n10300Hp_pmd = false ;
      }
      else
      {
         A10300Hp_pmd = localUtil.ctond( httpContext.cgiGet( edtHp_pmd_Internalname)) ;
         n10300Hp_pmd = false ;
      }
      GXCCtl = "Z10296Hp_Ld_" + sGXsfl_70_idx ;
      Z10296Hp_Ld = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10297Hp_Fs_" + sGXsfl_70_idx ;
      Z10297Hp_Fs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10298Hp_Df_" + sGXsfl_70_idx ;
      Z10298Hp_Df = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10299Hp_pkd_" + sGXsfl_70_idx ;
      Z10299Hp_pkd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10300Hp_pmd_" + sGXsfl_70_idx ;
      Z10300Hp_pmd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1399_" + sGXsfl_70_idx ;
      nRcdDeleted_1399 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1399_" + sGXsfl_70_idx ;
      nRcdExists_1399 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1399_" + sGXsfl_70_idx ;
      nIsMod_1399 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHp_Ld_Enabled = edtHp_Ld_Enabled ;
   }

   public void confirmValues17T0( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701399( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701399( ) ;
         httpContext.changePostValue( "Z10296Hp_Ld_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10296Hp_Ld_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10296Hp_Ld_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10297Hp_Fs_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10297Hp_Fs_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10297Hp_Fs_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10298Hp_Df_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10298Hp_Df_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10298Hp_Df_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10299Hp_pkd_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10299Hp_pkd_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10299Hp_pkd_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10300Hp_pmd_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10300Hp_pmd_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10300Hp_pmd_"+sGXsfl_70_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr0201", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC)),GXutil.URLEncode(GXutil.formatDateParm(A10288Hp_dia)),GXutil.URLEncode(GXutil.ltrimstr(A10290Hp_lin,6,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC","Hp_dia","Hp_lin"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9766ForProC", GXutil.rtrim( Z9766ForProC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10288Hp_dia", localUtil.dtoc( Z10288Hp_dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10290Hp_lin", GXutil.ltrim( localUtil.ntoc( Z10290Hp_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.ttr0201", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC)),GXutil.URLEncode(GXutil.formatDateParm(A10288Hp_dia)),GXutil.URLEncode(GXutil.ltrimstr(A10290Hp_lin,6,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC","Hp_dia","Hp_lin"})  ;
   }

   public String getPgmname( )
   {
      return "TTR0201" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO PRECIOS-DETALLE", "") ;
   }

   public void initializeNonKey17T1398( )
   {
   }

   public void initAll17T1398( )
   {
      initializeNonKey17T1398( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey17T1399( )
   {
      A10297Hp_Fs = "" ;
      n10297Hp_Fs = false ;
      A10298Hp_Df = "" ;
      n10298Hp_Df = false ;
      A10299Hp_pkd = DecimalUtil.ZERO ;
      n10299Hp_pkd = false ;
      A10300Hp_pmd = DecimalUtil.ZERO ;
      n10300Hp_pmd = false ;
      Z10297Hp_Fs = "" ;
      Z10298Hp_Df = "" ;
      Z10299Hp_pkd = DecimalUtil.ZERO ;
      Z10300Hp_pmd = DecimalUtil.ZERO ;
   }

   public void initAll17T1399( )
   {
      A10296Hp_Ld = (short)(0) ;
      initializeNonKey17T1399( ) ;
   }

   public void standaloneModalInsert17T1399( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241552733", true, true);
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
      httpContext.AddJavascriptSource("ttr0201.js", "?20268241552733", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1399( )
   {
      edtHp_Ld_Enabled = defedtHp_Ld_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_Ld_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Ld_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1399, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1399_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10296Hp_Ld, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Ld_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10297Hp_Fs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Fs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10298Hp_Df));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Df_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10299Hp_pkd, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pkd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10300Hp_pmd, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pmd_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtForSer_Internalname = "FORSER" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtForProC_Internalname = "FORPROC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtHp_dia_Internalname = "HP_DIA" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtHp_lin_Internalname = "HP_LIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1399_Internalname = "vNRCDDELETED_1399" ;
      edtHp_Ld_Internalname = "HP_LD" ;
      edtHp_Fs_Internalname = "HP_FS" ;
      edtHp_Df_Internalname = "HP_DF" ;
      edtHp_pkd_Internalname = "HP_PKD" ;
      edtHp_pmd_Internalname = "HP_PMD" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO PRECIOS-DETALLE", "") );
      edtHp_pmd_Jsonclick = "" ;
      edtHp_pkd_Jsonclick = "" ;
      edtHp_Df_Jsonclick = "" ;
      edtHp_Fs_Jsonclick = "" ;
      edtHp_Ld_Jsonclick = "" ;
      edtavnRcdDeleted_1399_Jsonclick = "" ;
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
      edtHp_pmd_Enabled = 1 ;
      edtHp_pkd_Enabled = 1 ;
      edtHp_Df_Enabled = 1 ;
      edtHp_Fs_Enabled = 1 ;
      edtHp_Ld_Enabled = 1 ;
      edtavnRcdDeleted_1399_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHp_lin_Jsonclick = "" ;
      edtHp_lin_Backcolor = (int)(0xFFFFFF) ;
      edtHp_lin_Enabled = 0 ;
      edtHp_dia_Jsonclick = "" ;
      edtHp_dia_Backcolor = (int)(0xFFFFFF) ;
      edtHp_dia_Enabled = 0 ;
      edtForProC_Jsonclick = "" ;
      edtForProC_Backcolor = (int)(0xFFFFFF) ;
      edtForProC_Enabled = 0 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 0 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Backcolor = (int)(0xFFFFFF) ;
      edtForColNum_Enabled = 0 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Backcolor = (int)(0xFFFFFF) ;
      edtForColNom_Enabled = 0 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Backcolor = (int)(0xFFFFFF) ;
      edtForSer_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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
      subsflControlProps_701399( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal17T1399( ) ;
         standaloneModal17T1399( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow17T1399( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701399( ) ;
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
      /* Using cursor T017T21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017T21_A407EmprNom[0] ;
      n407EmprNom = T017T21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      /* Using cursor T017T22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TR0200", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HP_DIA");
         AnyError = (short)(1) ;
      }
      pr_default.close(20);
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

   public void valid_Hp_lin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9766ForProC", GXutil.rtrim( Z9766ForProC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10288Hp_dia", localUtil.format(Z10288Hp_dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10290Hp_lin", GXutil.ltrim( localUtil.ntoc( Z10290Hp_lin, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'A10288Hp_dia',fld:'HP_DIA',pic:''},{av:'A10290Hp_lin',fld:'HP_LIN',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_FORPROC","{handler:'valid_Forproc',iparms:[]");
      setEventMetadata("VALID_FORPROC",",oparms:[]}");
      setEventMetadata("VALID_HP_DIA","{handler:'valid_Hp_dia',iparms:[]");
      setEventMetadata("VALID_HP_DIA",",oparms:[]}");
      setEventMetadata("VALID_HP_LIN","{handler:'valid_Hp_lin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'A10288Hp_dia',fld:'HP_DIA',pic:''},{av:'A10290Hp_lin',fld:'HP_LIN',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HP_LIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z9766ForProC'},{av:'Z10288Hp_dia'},{av:'Z10290Hp_lin'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HP_LD","{handler:'valid_Hp_ld',iparms:[]");
      setEventMetadata("VALID_HP_LD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hp_pmd',iparms:[]");
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
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      wcpOA9766ForProC = "" ;
      wcpOA10288Hp_dia = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z9766ForProC = "" ;
      Z10288Hp_dia = GXutil.nullDate() ;
      Z10297Hp_Fs = "" ;
      Z10298Hp_Df = "" ;
      Z10299Hp_pkd = DecimalUtil.ZERO ;
      Z10300Hp_pmd = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A9766ForProC = "" ;
      A10288Hp_dia = GXutil.nullDate() ;
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
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1399 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1398 = "" ;
      GXCCtl = "" ;
      A10297Hp_Fs = "" ;
      A10298Hp_Df = "" ;
      A10299Hp_pkd = DecimalUtil.ZERO ;
      A10300Hp_pmd = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T017T6_A407EmprNom = new String[] {""} ;
      T017T6_n407EmprNom = new boolean[] {false} ;
      T017T7_A396EmprCod = new String[] {""} ;
      T017T8_A10290Hp_lin = new int[1] ;
      T017T8_A407EmprNom = new String[] {""} ;
      T017T8_n407EmprNom = new boolean[] {false} ;
      T017T8_A396EmprCod = new String[] {""} ;
      T017T8_A252CliCod = new int[1] ;
      T017T8_A831TipColCod = new byte[1] ;
      T017T8_A494ForSer = new String[] {""} ;
      T017T8_A482ForColNom = new String[] {""} ;
      T017T8_A483ForColNum = new int[1] ;
      T017T8_A9766ForProC = new String[] {""} ;
      T017T8_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T9_A396EmprCod = new String[] {""} ;
      T017T9_A252CliCod = new int[1] ;
      T017T9_A494ForSer = new String[] {""} ;
      T017T9_A482ForColNom = new String[] {""} ;
      T017T9_A483ForColNum = new int[1] ;
      T017T9_A831TipColCod = new byte[1] ;
      T017T9_A9766ForProC = new String[] {""} ;
      T017T9_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T9_A10290Hp_lin = new int[1] ;
      T017T5_A10290Hp_lin = new int[1] ;
      T017T5_A396EmprCod = new String[] {""} ;
      T017T5_A252CliCod = new int[1] ;
      T017T5_A831TipColCod = new byte[1] ;
      T017T5_A494ForSer = new String[] {""} ;
      T017T5_A482ForColNom = new String[] {""} ;
      T017T5_A483ForColNum = new int[1] ;
      T017T5_A9766ForProC = new String[] {""} ;
      T017T5_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T10_A396EmprCod = new String[] {""} ;
      T017T10_A252CliCod = new int[1] ;
      T017T10_A494ForSer = new String[] {""} ;
      T017T10_A482ForColNom = new String[] {""} ;
      T017T10_A483ForColNum = new int[1] ;
      T017T10_A831TipColCod = new byte[1] ;
      T017T10_A9766ForProC = new String[] {""} ;
      T017T10_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T10_A10290Hp_lin = new int[1] ;
      T017T11_A396EmprCod = new String[] {""} ;
      T017T11_A252CliCod = new int[1] ;
      T017T11_A494ForSer = new String[] {""} ;
      T017T11_A482ForColNom = new String[] {""} ;
      T017T11_A483ForColNum = new int[1] ;
      T017T11_A831TipColCod = new byte[1] ;
      T017T11_A9766ForProC = new String[] {""} ;
      T017T11_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T11_A10290Hp_lin = new int[1] ;
      T017T4_A10290Hp_lin = new int[1] ;
      T017T4_A396EmprCod = new String[] {""} ;
      T017T4_A252CliCod = new int[1] ;
      T017T4_A831TipColCod = new byte[1] ;
      T017T4_A494ForSer = new String[] {""} ;
      T017T4_A482ForColNom = new String[] {""} ;
      T017T4_A483ForColNum = new int[1] ;
      T017T4_A9766ForProC = new String[] {""} ;
      T017T4_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T14_A396EmprCod = new String[] {""} ;
      T017T14_A252CliCod = new int[1] ;
      T017T14_A494ForSer = new String[] {""} ;
      T017T14_A482ForColNom = new String[] {""} ;
      T017T14_A483ForColNum = new int[1] ;
      T017T14_A831TipColCod = new byte[1] ;
      T017T14_A9766ForProC = new String[] {""} ;
      T017T14_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T14_A10290Hp_lin = new int[1] ;
      T017T15_A494ForSer = new String[] {""} ;
      T017T15_A482ForColNom = new String[] {""} ;
      T017T15_A483ForColNum = new int[1] ;
      T017T15_A831TipColCod = new byte[1] ;
      T017T15_A9766ForProC = new String[] {""} ;
      T017T15_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T15_A10290Hp_lin = new int[1] ;
      T017T15_A10296Hp_Ld = new short[1] ;
      T017T15_A10297Hp_Fs = new String[] {""} ;
      T017T15_n10297Hp_Fs = new boolean[] {false} ;
      T017T15_A10298Hp_Df = new String[] {""} ;
      T017T15_n10298Hp_Df = new boolean[] {false} ;
      T017T15_A10299Hp_pkd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017T15_n10299Hp_pkd = new boolean[] {false} ;
      T017T15_A10300Hp_pmd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017T15_n10300Hp_pmd = new boolean[] {false} ;
      T017T15_A396EmprCod = new String[] {""} ;
      T017T15_A252CliCod = new int[1] ;
      T017T16_A396EmprCod = new String[] {""} ;
      T017T16_A252CliCod = new int[1] ;
      T017T16_A494ForSer = new String[] {""} ;
      T017T16_A482ForColNom = new String[] {""} ;
      T017T16_A483ForColNum = new int[1] ;
      T017T16_A831TipColCod = new byte[1] ;
      T017T16_A9766ForProC = new String[] {""} ;
      T017T16_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T16_A10290Hp_lin = new int[1] ;
      T017T16_A10296Hp_Ld = new short[1] ;
      T017T3_A494ForSer = new String[] {""} ;
      T017T3_A482ForColNom = new String[] {""} ;
      T017T3_A483ForColNum = new int[1] ;
      T017T3_A831TipColCod = new byte[1] ;
      T017T3_A9766ForProC = new String[] {""} ;
      T017T3_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T3_A10290Hp_lin = new int[1] ;
      T017T3_A10296Hp_Ld = new short[1] ;
      T017T3_A10297Hp_Fs = new String[] {""} ;
      T017T3_n10297Hp_Fs = new boolean[] {false} ;
      T017T3_A10298Hp_Df = new String[] {""} ;
      T017T3_n10298Hp_Df = new boolean[] {false} ;
      T017T3_A10299Hp_pkd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017T3_n10299Hp_pkd = new boolean[] {false} ;
      T017T3_A10300Hp_pmd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017T3_n10300Hp_pmd = new boolean[] {false} ;
      T017T3_A396EmprCod = new String[] {""} ;
      T017T3_A252CliCod = new int[1] ;
      T017T2_A494ForSer = new String[] {""} ;
      T017T2_A482ForColNom = new String[] {""} ;
      T017T2_A483ForColNum = new int[1] ;
      T017T2_A831TipColCod = new byte[1] ;
      T017T2_A9766ForProC = new String[] {""} ;
      T017T2_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T2_A10290Hp_lin = new int[1] ;
      T017T2_A10296Hp_Ld = new short[1] ;
      T017T2_A10297Hp_Fs = new String[] {""} ;
      T017T2_n10297Hp_Fs = new boolean[] {false} ;
      T017T2_A10298Hp_Df = new String[] {""} ;
      T017T2_n10298Hp_Df = new boolean[] {false} ;
      T017T2_A10299Hp_pkd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017T2_n10299Hp_pkd = new boolean[] {false} ;
      T017T2_A10300Hp_pmd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017T2_n10300Hp_pmd = new boolean[] {false} ;
      T017T2_A396EmprCod = new String[] {""} ;
      T017T2_A252CliCod = new int[1] ;
      T017T20_A396EmprCod = new String[] {""} ;
      T017T20_A252CliCod = new int[1] ;
      T017T20_A494ForSer = new String[] {""} ;
      T017T20_A482ForColNom = new String[] {""} ;
      T017T20_A483ForColNum = new int[1] ;
      T017T20_A831TipColCod = new byte[1] ;
      T017T20_A9766ForProC = new String[] {""} ;
      T017T20_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017T20_A10290Hp_lin = new int[1] ;
      T017T20_A10296Hp_Ld = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017T21_A407EmprNom = new String[] {""} ;
      T017T21_n407EmprNom = new boolean[] {false} ;
      T017T22_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ9766ForProC = "" ;
      ZZ10288Hp_dia = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr0201__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr0201__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr0201__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr0201__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr0201__default(),
         new Object[] {
             new Object[] {
            T017T2_A494ForSer, T017T2_A482ForColNom, T017T2_A483ForColNum, T017T2_A831TipColCod, T017T2_A9766ForProC, T017T2_A10288Hp_dia, T017T2_A10290Hp_lin, T017T2_A10296Hp_Ld, T017T2_A10297Hp_Fs, T017T2_n10297Hp_Fs,
            T017T2_A10298Hp_Df, T017T2_n10298Hp_Df, T017T2_A10299Hp_pkd, T017T2_n10299Hp_pkd, T017T2_A10300Hp_pmd, T017T2_n10300Hp_pmd, T017T2_A396EmprCod, T017T2_A252CliCod
            }
            , new Object[] {
            T017T3_A494ForSer, T017T3_A482ForColNom, T017T3_A483ForColNum, T017T3_A831TipColCod, T017T3_A9766ForProC, T017T3_A10288Hp_dia, T017T3_A10290Hp_lin, T017T3_A10296Hp_Ld, T017T3_A10297Hp_Fs, T017T3_n10297Hp_Fs,
            T017T3_A10298Hp_Df, T017T3_n10298Hp_Df, T017T3_A10299Hp_pkd, T017T3_n10299Hp_pkd, T017T3_A10300Hp_pmd, T017T3_n10300Hp_pmd, T017T3_A396EmprCod, T017T3_A252CliCod
            }
            , new Object[] {
            T017T4_A10290Hp_lin, T017T4_A396EmprCod, T017T4_A252CliCod, T017T4_A831TipColCod, T017T4_A494ForSer, T017T4_A482ForColNom, T017T4_A483ForColNum, T017T4_A9766ForProC, T017T4_A10288Hp_dia
            }
            , new Object[] {
            T017T5_A10290Hp_lin, T017T5_A396EmprCod, T017T5_A252CliCod, T017T5_A831TipColCod, T017T5_A494ForSer, T017T5_A482ForColNom, T017T5_A483ForColNum, T017T5_A9766ForProC, T017T5_A10288Hp_dia
            }
            , new Object[] {
            T017T6_A407EmprNom, T017T6_n407EmprNom
            }
            , new Object[] {
            T017T7_A396EmprCod
            }
            , new Object[] {
            T017T8_A10290Hp_lin, T017T8_A407EmprNom, T017T8_n407EmprNom, T017T8_A396EmprCod, T017T8_A252CliCod, T017T8_A831TipColCod, T017T8_A494ForSer, T017T8_A482ForColNom, T017T8_A483ForColNum, T017T8_A9766ForProC,
            T017T8_A10288Hp_dia
            }
            , new Object[] {
            T017T9_A396EmprCod, T017T9_A252CliCod, T017T9_A494ForSer, T017T9_A482ForColNom, T017T9_A483ForColNum, T017T9_A831TipColCod, T017T9_A9766ForProC, T017T9_A10288Hp_dia, T017T9_A10290Hp_lin
            }
            , new Object[] {
            T017T10_A396EmprCod, T017T10_A252CliCod, T017T10_A494ForSer, T017T10_A482ForColNom, T017T10_A483ForColNum, T017T10_A831TipColCod, T017T10_A9766ForProC, T017T10_A10288Hp_dia, T017T10_A10290Hp_lin
            }
            , new Object[] {
            T017T11_A396EmprCod, T017T11_A252CliCod, T017T11_A494ForSer, T017T11_A482ForColNom, T017T11_A483ForColNum, T017T11_A831TipColCod, T017T11_A9766ForProC, T017T11_A10288Hp_dia, T017T11_A10290Hp_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017T14_A396EmprCod, T017T14_A252CliCod, T017T14_A494ForSer, T017T14_A482ForColNom, T017T14_A483ForColNum, T017T14_A831TipColCod, T017T14_A9766ForProC, T017T14_A10288Hp_dia, T017T14_A10290Hp_lin
            }
            , new Object[] {
            T017T15_A494ForSer, T017T15_A482ForColNom, T017T15_A483ForColNum, T017T15_A831TipColCod, T017T15_A9766ForProC, T017T15_A10288Hp_dia, T017T15_A10290Hp_lin, T017T15_A10296Hp_Ld, T017T15_A10297Hp_Fs, T017T15_n10297Hp_Fs,
            T017T15_A10298Hp_Df, T017T15_n10298Hp_Df, T017T15_A10299Hp_pkd, T017T15_n10299Hp_pkd, T017T15_A10300Hp_pmd, T017T15_n10300Hp_pmd, T017T15_A396EmprCod, T017T15_A252CliCod
            }
            , new Object[] {
            T017T16_A396EmprCod, T017T16_A252CliCod, T017T16_A494ForSer, T017T16_A482ForColNom, T017T16_A483ForColNum, T017T16_A831TipColCod, T017T16_A9766ForProC, T017T16_A10288Hp_dia, T017T16_A10290Hp_lin, T017T16_A10296Hp_Ld
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017T20_A396EmprCod, T017T20_A252CliCod, T017T20_A494ForSer, T017T20_A482ForColNom, T017T20_A483ForColNum, T017T20_A831TipColCod, T017T20_A9766ForProC, T017T20_A10288Hp_dia, T017T20_A10290Hp_lin, T017T20_A10296Hp_Ld
            }
            , new Object[] {
            T017T21_A407EmprNom, T017T21_n407EmprNom
            }
            , new Object[] {
            T017T22_A396EmprCod
            }
         }
      );
      Z10290Hp_lin = 0 ;
      A10290Hp_lin = 0 ;
      Z10288Hp_dia = GXutil.nullDate() ;
      A10288Hp_dia = GXutil.nullDate() ;
      Z9766ForProC = "" ;
      A9766ForProC = "" ;
      Z831TipColCod = (byte)(0) ;
      A831TipColCod = (byte)(0) ;
      Z483ForColNum = 0 ;
      A483ForColNum = 0 ;
      Z482ForColNom = "" ;
      A482ForColNom = "" ;
      Z494ForSer = "" ;
      A494ForSer = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TTR0201" ;
   }

   private byte wcpOA831TipColCod ;
   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private short Z10296Hp_Ld ;
   private short nRcdDeleted_1399 ;
   private short nRcdExists_1399 ;
   private short nIsMod_1399 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1399 ;
   private short RcdFound1399 ;
   private short nBlankRcdUsr1399 ;
   private short A10296Hp_Ld ;
   private short RcdFound1398 ;
   private short nIsDirty_1398 ;
   private short nIsDirty_1399 ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int wcpOA10290Hp_lin ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z10290Hp_lin ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A10290Hp_lin ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtForProC_Enabled ;
   private int edtHp_dia_Enabled ;
   private int edtHp_lin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1399_Enabled ;
   private int edtHp_Ld_Enabled ;
   private int edtHp_Fs_Enabled ;
   private int edtHp_Df_Enabled ;
   private int edtHp_pkd_Enabled ;
   private int edtHp_pmd_Enabled ;
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
   private int defedtHp_Ld_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtHp_lin_Backcolor ;
   private int edtHp_dia_Backcolor ;
   private int edtForProC_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private int ZZ10290Hp_lin ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10299Hp_pkd ;
   private java.math.BigDecimal Z10300Hp_pmd ;
   private java.math.BigDecimal A10299Hp_pkd ;
   private java.math.BigDecimal A10300Hp_pmd ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String wcpOA9766ForProC ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z9766ForProC ;
   private String Z10297Hp_Fs ;
   private String Z10298Hp_Df ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A9766ForProC ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_70_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtForProC_Internalname ;
   private String edtForProC_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtHp_dia_Internalname ;
   private String edtHp_dia_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtHp_lin_Internalname ;
   private String edtHp_lin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1399 ;
   private String edtavnRcdDeleted_1399_Internalname ;
   private String edtHp_Ld_Internalname ;
   private String edtHp_Fs_Internalname ;
   private String edtHp_Df_Internalname ;
   private String edtHp_pkd_Internalname ;
   private String edtHp_pmd_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1398 ;
   private String GXCCtl ;
   private String A10297Hp_Fs ;
   private String A10298Hp_Df ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1399_Jsonclick ;
   private String edtHp_Ld_Jsonclick ;
   private String edtHp_Fs_Jsonclick ;
   private String edtHp_Df_Jsonclick ;
   private String edtHp_pkd_Jsonclick ;
   private String edtHp_pmd_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ9766ForProC ;
   private String ZZ407EmprNom ;
   private java.util.Date wcpOA10288Hp_dia ;
   private java.util.Date Z10288Hp_dia ;
   private java.util.Date A10288Hp_dia ;
   private java.util.Date ZZ10288Hp_dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10297Hp_Fs ;
   private boolean n10298Hp_Df ;
   private boolean n10299Hp_pkd ;
   private boolean n10300Hp_pmd ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T017T6_A407EmprNom ;
   private boolean[] T017T6_n407EmprNom ;
   private String[] T017T7_A396EmprCod ;
   private int[] T017T8_A10290Hp_lin ;
   private String[] T017T8_A407EmprNom ;
   private boolean[] T017T8_n407EmprNom ;
   private String[] T017T8_A396EmprCod ;
   private int[] T017T8_A252CliCod ;
   private byte[] T017T8_A831TipColCod ;
   private String[] T017T8_A494ForSer ;
   private String[] T017T8_A482ForColNom ;
   private int[] T017T8_A483ForColNum ;
   private String[] T017T8_A9766ForProC ;
   private java.util.Date[] T017T8_A10288Hp_dia ;
   private String[] T017T9_A396EmprCod ;
   private int[] T017T9_A252CliCod ;
   private String[] T017T9_A494ForSer ;
   private String[] T017T9_A482ForColNom ;
   private int[] T017T9_A483ForColNum ;
   private byte[] T017T9_A831TipColCod ;
   private String[] T017T9_A9766ForProC ;
   private java.util.Date[] T017T9_A10288Hp_dia ;
   private int[] T017T9_A10290Hp_lin ;
   private int[] T017T5_A10290Hp_lin ;
   private String[] T017T5_A396EmprCod ;
   private int[] T017T5_A252CliCod ;
   private byte[] T017T5_A831TipColCod ;
   private String[] T017T5_A494ForSer ;
   private String[] T017T5_A482ForColNom ;
   private int[] T017T5_A483ForColNum ;
   private String[] T017T5_A9766ForProC ;
   private java.util.Date[] T017T5_A10288Hp_dia ;
   private String[] T017T10_A396EmprCod ;
   private int[] T017T10_A252CliCod ;
   private String[] T017T10_A494ForSer ;
   private String[] T017T10_A482ForColNom ;
   private int[] T017T10_A483ForColNum ;
   private byte[] T017T10_A831TipColCod ;
   private String[] T017T10_A9766ForProC ;
   private java.util.Date[] T017T10_A10288Hp_dia ;
   private int[] T017T10_A10290Hp_lin ;
   private String[] T017T11_A396EmprCod ;
   private int[] T017T11_A252CliCod ;
   private String[] T017T11_A494ForSer ;
   private String[] T017T11_A482ForColNom ;
   private int[] T017T11_A483ForColNum ;
   private byte[] T017T11_A831TipColCod ;
   private String[] T017T11_A9766ForProC ;
   private java.util.Date[] T017T11_A10288Hp_dia ;
   private int[] T017T11_A10290Hp_lin ;
   private int[] T017T4_A10290Hp_lin ;
   private String[] T017T4_A396EmprCod ;
   private int[] T017T4_A252CliCod ;
   private byte[] T017T4_A831TipColCod ;
   private String[] T017T4_A494ForSer ;
   private String[] T017T4_A482ForColNom ;
   private int[] T017T4_A483ForColNum ;
   private String[] T017T4_A9766ForProC ;
   private java.util.Date[] T017T4_A10288Hp_dia ;
   private String[] T017T14_A396EmprCod ;
   private int[] T017T14_A252CliCod ;
   private String[] T017T14_A494ForSer ;
   private String[] T017T14_A482ForColNom ;
   private int[] T017T14_A483ForColNum ;
   private byte[] T017T14_A831TipColCod ;
   private String[] T017T14_A9766ForProC ;
   private java.util.Date[] T017T14_A10288Hp_dia ;
   private int[] T017T14_A10290Hp_lin ;
   private String[] T017T15_A494ForSer ;
   private String[] T017T15_A482ForColNom ;
   private int[] T017T15_A483ForColNum ;
   private byte[] T017T15_A831TipColCod ;
   private String[] T017T15_A9766ForProC ;
   private java.util.Date[] T017T15_A10288Hp_dia ;
   private int[] T017T15_A10290Hp_lin ;
   private short[] T017T15_A10296Hp_Ld ;
   private String[] T017T15_A10297Hp_Fs ;
   private boolean[] T017T15_n10297Hp_Fs ;
   private String[] T017T15_A10298Hp_Df ;
   private boolean[] T017T15_n10298Hp_Df ;
   private java.math.BigDecimal[] T017T15_A10299Hp_pkd ;
   private boolean[] T017T15_n10299Hp_pkd ;
   private java.math.BigDecimal[] T017T15_A10300Hp_pmd ;
   private boolean[] T017T15_n10300Hp_pmd ;
   private String[] T017T15_A396EmprCod ;
   private int[] T017T15_A252CliCod ;
   private String[] T017T16_A396EmprCod ;
   private int[] T017T16_A252CliCod ;
   private String[] T017T16_A494ForSer ;
   private String[] T017T16_A482ForColNom ;
   private int[] T017T16_A483ForColNum ;
   private byte[] T017T16_A831TipColCod ;
   private String[] T017T16_A9766ForProC ;
   private java.util.Date[] T017T16_A10288Hp_dia ;
   private int[] T017T16_A10290Hp_lin ;
   private short[] T017T16_A10296Hp_Ld ;
   private String[] T017T3_A494ForSer ;
   private String[] T017T3_A482ForColNom ;
   private int[] T017T3_A483ForColNum ;
   private byte[] T017T3_A831TipColCod ;
   private String[] T017T3_A9766ForProC ;
   private java.util.Date[] T017T3_A10288Hp_dia ;
   private int[] T017T3_A10290Hp_lin ;
   private short[] T017T3_A10296Hp_Ld ;
   private String[] T017T3_A10297Hp_Fs ;
   private boolean[] T017T3_n10297Hp_Fs ;
   private String[] T017T3_A10298Hp_Df ;
   private boolean[] T017T3_n10298Hp_Df ;
   private java.math.BigDecimal[] T017T3_A10299Hp_pkd ;
   private boolean[] T017T3_n10299Hp_pkd ;
   private java.math.BigDecimal[] T017T3_A10300Hp_pmd ;
   private boolean[] T017T3_n10300Hp_pmd ;
   private String[] T017T3_A396EmprCod ;
   private int[] T017T3_A252CliCod ;
   private String[] T017T2_A494ForSer ;
   private String[] T017T2_A482ForColNom ;
   private int[] T017T2_A483ForColNum ;
   private byte[] T017T2_A831TipColCod ;
   private String[] T017T2_A9766ForProC ;
   private java.util.Date[] T017T2_A10288Hp_dia ;
   private int[] T017T2_A10290Hp_lin ;
   private short[] T017T2_A10296Hp_Ld ;
   private String[] T017T2_A10297Hp_Fs ;
   private boolean[] T017T2_n10297Hp_Fs ;
   private String[] T017T2_A10298Hp_Df ;
   private boolean[] T017T2_n10298Hp_Df ;
   private java.math.BigDecimal[] T017T2_A10299Hp_pkd ;
   private boolean[] T017T2_n10299Hp_pkd ;
   private java.math.BigDecimal[] T017T2_A10300Hp_pmd ;
   private boolean[] T017T2_n10300Hp_pmd ;
   private String[] T017T2_A396EmprCod ;
   private int[] T017T2_A252CliCod ;
   private String[] T017T20_A396EmprCod ;
   private int[] T017T20_A252CliCod ;
   private String[] T017T20_A494ForSer ;
   private String[] T017T20_A482ForColNom ;
   private int[] T017T20_A483ForColNum ;
   private byte[] T017T20_A831TipColCod ;
   private String[] T017T20_A9766ForProC ;
   private java.util.Date[] T017T20_A10288Hp_dia ;
   private int[] T017T20_A10290Hp_lin ;
   private short[] T017T20_A10296Hp_Ld ;
   private String[] T017T21_A407EmprNom ;
   private boolean[] T017T21_n407EmprNom ;
   private String[] T017T22_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr0201__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0201__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0201__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0201__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0201__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017T2", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld, Hp_Fs, Hp_Df, Hp_pkd, Hp_pmd, EmprCod, CliCod FROM TXPTR0202 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? AND Hp_Ld = ?  FOR UPDATE OF Hp_Fs, Hp_Df, Hp_pkd, Hp_pmd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017T3", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld, Hp_Fs, Hp_Df, Hp_pkd, Hp_pmd, EmprCod, CliCod FROM TXPTR0202 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? AND Hp_Ld = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017T4", "SELECT Hp_lin, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC, Hp_dia FROM TXPTR0201 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ?  FOR UPDATE OF Hp_lin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T5", "SELECT Hp_lin, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC, Hp_dia FROM TXPTR0201 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T7", "SELECT EmprCod FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T8", "SELECT /*+ FIRST_ROWS(1) */ TM1.Hp_lin, T2.EmprNom, TM1.EmprCod, TM1.CliCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.ForProC, TM1.Hp_dia FROM (TXPTR0201 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.ForProC = ? and TM1.Hp_dia = ? and TM1.Hp_lin = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.ForProC, TM1.Hp_dia, TM1.Hp_lin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin FROM TXPTR0201 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin FROM TXPTR0201 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? and Hp_lin = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin FROM TXPTR0201 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? and Hp_lin = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, ForProC DESC, Hp_dia DESC, Hp_lin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017T12", "INSERT INTO TXPTR0201(Hp_lin, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC, Hp_dia, Hp_pk, Hp_pm, Hp_Term, Hp_usu, Hp_ddhh) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPTR0201")
         ,new UpdateCursor("T017T13", "DELETE FROM TXPTR0201  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ?", GX_NOMASK, "TXPTR0201")
         ,new ForEachCursor("T017T14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin FROM TXPTR0201 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? and Hp_lin = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T15", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld, Hp_Fs, Hp_Df, Hp_pkd, Hp_pmd, EmprCod, CliCod FROM TXPTR0202 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? and Hp_lin = ? and Hp_Ld = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017T16", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld FROM TXPTR0202 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? AND Hp_Ld = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017T17", "INSERT INTO TXPTR0202(ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld, Hp_Fs, Hp_Df, Hp_pkd, Hp_pmd, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR0202")
         ,new UpdateCursor("T017T18", "UPDATE TXPTR0202 SET Hp_Fs=?, Hp_Df=?, Hp_pkd=?, Hp_pmd=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? AND Hp_Ld = ?", GX_NOMASK, "TXPTR0202")
         ,new UpdateCursor("T017T19", "DELETE FROM TXPTR0202  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? AND Hp_Ld = ?", GX_NOMASK, "TXPTR0202")
         ,new ForEachCursor("T017T20", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld FROM TXPTR0202 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? and Hp_lin = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017T21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017T22", "SELECT EmprCod FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 28);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 3);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 28);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 3);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 28);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 3);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setDate(9, (java.util.Date)parms[8]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 28);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 5);
               }
               stmt.setString(13, (String)parms[16], 3);
               stmt.setInt(14, ((Number) parms[17]).intValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 28);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 16);
               stmt.setString(8, (String)parms[11], 13);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setString(11, (String)parms[14], 8);
               stmt.setDate(12, (java.util.Date)parms[15]);
               stmt.setInt(13, ((Number) parms[16]).intValue());
               stmt.setShort(14, ((Number) parms[17]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
      }
   }

}

