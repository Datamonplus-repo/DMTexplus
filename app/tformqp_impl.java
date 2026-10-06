package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tformqp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"MQ_PROGD1") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6186Mq_Prog = (int)(GXutil.lval( httpContext.GetPar( "Mq_Prog"))) ;
         n6186Mq_Prog = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asamq_progd11EP1550( A396EmprCod, A6186Mq_Prog) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"MQ_PROGD2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6267Mq_Prog2 = (int)(GXutil.lval( httpContext.GetPar( "Mq_Prog2"))) ;
         n6267Mq_Prog2 = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asamq_progd21EP1550( A396EmprCod, A6267Mq_Prog2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"MQ_PROGD3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6268Mq_Prog3 = (int)(GXutil.lval( httpContext.GetPar( "Mq_Prog3"))) ;
         n6268Mq_Prog3 = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asamq_progd31EP1550( A396EmprCod, A6268Mq_Prog3) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6037Mq_Grupo = (byte)(GXutil.lval( httpContext.GetPar( "Mq_Grupo"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A6037Mq_Grupo) ;
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
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.GetPar( "ForSer") ;
            n494ForSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            n482ForColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RELACION COLOR-MAQ-PROGRAMAS", ""), (short)(0)) ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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

   public tformqp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tformqp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tformqp_impl.class ));
   }

   public tformqp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFORMQP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORMQP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1550 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1550 = (short)(1) ;
            scanStart1EP1550( ) ;
            while ( RcdFound1550 != 0 )
            {
               init_level_properties1550( ) ;
               getByPrimaryKey1EP1550( ) ;
               addRow1EP1550( ) ;
               scanNext1EP1550( ) ;
            }
            scanEnd1EP1550( ) ;
            nBlankRcdCount1550 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1EP1550( ) ;
         standaloneModal1EP1550( ) ;
         sMode1550 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1EP1550( ) ;
            edtavnRcdDeleted_1550_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1550_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1550_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1550_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtMq_Grupo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_GRUPO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtMq_Desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_DESC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Desc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtMq_Prog_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROG_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Prog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Prog_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtMq_ProgD1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROGD1_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_ProgD1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ProgD1_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtMq_Prog2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROG2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Prog2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Prog2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtMq_ProgD2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROGD2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_ProgD2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ProgD2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtMq_Prog3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROG3_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Prog3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Prog3_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtMq_ProgD3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROGD3_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_ProgD3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ProgD3_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1550 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1EP1550( ) ;
            }
            sendRow1EP1550( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1550 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1550 = (short)(5) ;
         nRcdExists_1550 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1EP1550( ) ;
            while ( RcdFound1550 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551550( ) ;
               init_level_properties1550( ) ;
               standaloneNotModal1EP1550( ) ;
               getByPrimaryKey1EP1550( ) ;
               standaloneModal1EP1550( ) ;
               addRow1EP1550( ) ;
               scanNext1EP1550( ) ;
            }
            scanEnd1EP1550( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1550 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551550( ) ;
      initAll1EP1550( ) ;
      init_level_properties1550( ) ;
      nRcdExists_1550 = (short)(0) ;
      nIsMod_1550 = (short)(0) ;
      nRcdDeleted_1550 = (short)(0) ;
      nBlankRcdCount1550 = (short)(nBlankRcdUsr1550+nBlankRcdCount1550) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1550 > 0 )
      {
         standaloneNotModal1EP1550( ) ;
         standaloneModal1EP1550( ) ;
         addRow1EP1550( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMq_Grupo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1550 = (short)(nBlankRcdCount1550-1) ;
      }
      Gx_mode = sMode1550 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORMQP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFORMQP.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z494ForSer = httpContext.cgiGet( "Z494ForSer") ;
         Z482ForColNom = httpContext.cgiGet( "Z482ForColNom") ;
         Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
         n494ForSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
         n482ForColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n483ForColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.GetPar( "ForSer") ;
            n494ForSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            n482ForColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
            initAll1EP47( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1550_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1550_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1EP47( ) ;
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

   public void confirm_1EP0( )
   {
      beforeValidate1EP47( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EP47( ) ;
         }
         else
         {
            checkExtendedTable1EP47( ) ;
            if ( AnyError == 0 )
            {
               zm1EP47( 5) ;
               zm1EP47( 6) ;
               zm1EP47( 7) ;
            }
            closeExtendedTableCursors1EP47( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode47 = Gx_mode ;
         confirm_1EP1550( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode47 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1EP0( ) ;
      }
   }

   public void confirm_1EP1550( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1EP1550( ) ;
         if ( ( nRcdExists_1550 != 0 ) || ( nIsMod_1550 != 0 ) )
         {
            getKey1EP1550( ) ;
            if ( ( nRcdExists_1550 == 0 ) && ( nRcdDeleted_1550 == 0 ) )
            {
               if ( RcdFound1550 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1EP1550( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1EP1550( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1EP1550( 9) ;
                     }
                     closeExtendedTableCursors1EP1550( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MQ_GRUPO_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMq_Grupo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1550 != 0 )
               {
                  if ( nRcdDeleted_1550 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1EP1550( ) ;
                     load1EP1550( ) ;
                     beforeValidate1EP1550( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1EP1550( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1550 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1EP1550( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1EP1550( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1EP1550( 9) ;
                           }
                           closeExtendedTableCursors1EP1550( ) ;
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
                  if ( nRcdDeleted_1550 == 0 )
                  {
                     GXCCtl = "MQ_GRUPO_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMq_Grupo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1550_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Grupo_Internalname, GXutil.ltrim( localUtil.ntoc( A6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Desc_Internalname, GXutil.rtrim( A6038Mq_Desc)) ;
         httpContext.changePostValue( edtMq_Prog_Internalname, GXutil.ltrim( localUtil.ntoc( A6186Mq_Prog, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_ProgD1_Internalname, GXutil.rtrim( A6304Mq_ProgD1)) ;
         httpContext.changePostValue( edtMq_Prog2_Internalname, GXutil.ltrim( localUtil.ntoc( A6267Mq_Prog2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_ProgD2_Internalname, GXutil.rtrim( A6305Mq_ProgD2)) ;
         httpContext.changePostValue( edtMq_Prog3_Internalname, GXutil.ltrim( localUtil.ntoc( A6268Mq_Prog3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_ProgD3_Internalname, GXutil.rtrim( A6306Mq_ProgD3)) ;
         httpContext.changePostValue( "ZT_"+"Z6037Mq_Grupo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6186Mq_Prog_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6186Mq_Prog, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6267Mq_Prog2_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6267Mq_Prog2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6268Mq_Prog3_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6268Mq_Prog3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1550_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1550_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1550_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1550 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1550_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1550_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_GRUPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Grupo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_DESC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROG_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROGD1_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROG2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROGD2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROG3_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROGD3_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1EP0( )
   {
   }

   public void zm1EP47( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -4 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01EP7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EP7_A407EmprNom[0] ;
      n407EmprNom = T01EP7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01EP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      /* Using cursor T01EP9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
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

   public void load1EP47( )
   {
      /* Using cursor T01EP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A407EmprNom = T01EP10_A407EmprNom[0] ;
         n407EmprNom = T01EP10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1EP47( -4) ;
      }
      pr_default.close(8);
      onLoadActions1EP47( ) ;
   }

   public void onLoadActions1EP47( )
   {
   }

   public void checkExtendedTable1EP47( )
   {
      nIsDirty_47 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1EP47( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1EP47( )
   {
      /* Using cursor T01EP11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01EP6_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01EP6_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01EP6_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01EP6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EP6_A252CliCod[0] == A252CliCod ) && ( T01EP6_A831TipColCod[0] == A831TipColCod ) )
      {
         zm1EP47( 4) ;
         RcdFound47 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1EP47( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKey1EP47( ) ;
         }
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey1EP47( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1EP47( ) ;
      if ( RcdFound47 == 0 )
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
      RcdFound47 = (short)(0) ;
      /* Using cursor T01EP12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01EP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EP12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EP12_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01EP12_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01EP12_A483ForColNum[0] == A483ForColNum ) && ( T01EP12_A831TipColCod[0] == A831TipColCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01EP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EP12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EP12_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01EP12_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01EP12_A483ForColNum[0] == A483ForColNum ) && ( T01EP12_A831TipColCod[0] == A831TipColCod ) )
         {
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T01EP13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01EP13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EP13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EP13_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01EP13_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01EP13_A483ForColNum[0] == A483ForColNum ) && ( T01EP13_A831TipColCod[0] == A831TipColCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01EP13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EP13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EP13_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01EP13_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01EP13_A483ForColNum[0] == A483ForColNum ) && ( T01EP13_A831TipColCod[0] == A831TipColCod ) )
         {
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EP47( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1EP47( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound47 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
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
               update1EP47( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1EP47( ) ;
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
                  insert1EP47( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
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
      getKey1EP47( ) ;
      if ( RcdFound47 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tformqp");
   }

   public void insert_check( )
   {
      confirm_1EP0( ) ;
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
      if ( RcdFound47 == 0 )
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
      scanStart1EP47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1EP47( ) ;
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
      if ( RcdFound47 == 0 )
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
      if ( RcdFound47 == 0 )
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
      scanStart1EP47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound47 != 0 )
         {
            scanNext1EP47( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1EP47( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1EP47( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EP47( )
   {
      beforeValidate1EP47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EP47( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EP47( 0) ;
         checkOptimisticConcurrency1EP47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EP47( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EP47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EP14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
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
                        processLevel1EP47( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1EP0( ) ;
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
            load1EP47( ) ;
         }
         endLevel1EP47( ) ;
      }
      closeExtendedTableCursors1EP47( ) ;
   }

   public void update1EP47( )
   {
      beforeValidate1EP47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EP47( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EP47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EP47( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EP47( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCFORMU */
                  deferredUpdate1EP47( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1EP47( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1EP0( ) ;
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
         endLevel1EP47( ) ;
      }
      closeExtendedTableCursors1EP47( ) ;
   }

   public void deferredUpdate1EP47( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EP47( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EP47( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EP47( ) ;
         afterConfirm1EP47( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EP47( ) ;
            if ( AnyError == 0 )
            {
               scanStart1EP1550( ) ;
               while ( RcdFound1550 != 0 )
               {
                  getByPrimaryKey1EP1550( ) ;
                  delete1EP1550( ) ;
                  scanNext1EP1550( ) ;
               }
               scanEnd1EP1550( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EP15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound47 == 0 )
                        {
                           initAll1EP47( ) ;
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
                        resetCaption1EP0( ) ;
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
      sMode47 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EP47( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EP47( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01EP16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01EP17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CABECERA ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01EP18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOPCD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01EP19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01EP20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCACP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01EP21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01EP22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPDCL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01EP23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01EP24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01EP25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01EP26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01EP27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01EP28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01EP29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOBFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevel1EP1550( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1EP1550( ) ;
         if ( ( nRcdExists_1550 != 0 ) || ( nIsMod_1550 != 0 ) )
         {
            standaloneNotModal1EP1550( ) ;
            getKey1EP1550( ) ;
            if ( ( nRcdExists_1550 == 0 ) && ( nRcdDeleted_1550 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1EP1550( ) ;
            }
            else
            {
               if ( RcdFound1550 != 0 )
               {
                  if ( ( nRcdDeleted_1550 != 0 ) && ( nRcdExists_1550 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1EP1550( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1550 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1EP1550( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1550 == 0 )
                  {
                     GXCCtl = "MQ_GRUPO_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMq_Grupo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1550_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Grupo_Internalname, GXutil.ltrim( localUtil.ntoc( A6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Desc_Internalname, GXutil.rtrim( A6038Mq_Desc)) ;
         httpContext.changePostValue( edtMq_Prog_Internalname, GXutil.ltrim( localUtil.ntoc( A6186Mq_Prog, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_ProgD1_Internalname, GXutil.rtrim( A6304Mq_ProgD1)) ;
         httpContext.changePostValue( edtMq_Prog2_Internalname, GXutil.ltrim( localUtil.ntoc( A6267Mq_Prog2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_ProgD2_Internalname, GXutil.rtrim( A6305Mq_ProgD2)) ;
         httpContext.changePostValue( edtMq_Prog3_Internalname, GXutil.ltrim( localUtil.ntoc( A6268Mq_Prog3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_ProgD3_Internalname, GXutil.rtrim( A6306Mq_ProgD3)) ;
         httpContext.changePostValue( "ZT_"+"Z6037Mq_Grupo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6186Mq_Prog_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6186Mq_Prog, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6267Mq_Prog2_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6267Mq_Prog2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6268Mq_Prog3_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z6268Mq_Prog3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1550_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1550_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1550_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1550 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1550_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1550_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_GRUPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Grupo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_DESC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROG_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROGD1_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROG2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROGD2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROG3_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_PROGD3_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1EP1550( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1550 = (short)(0) ;
      nIsMod_1550 = (short)(0) ;
      nRcdDeleted_1550 = (short)(0) ;
   }

   public void processLevel1EP47( )
   {
      /* Save parent mode. */
      sMode47 = Gx_mode ;
      processNestedLevel1EP1550( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1EP47( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1EP47( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tformqp");
         if ( AnyError == 0 )
         {
            confirmValues1EP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tformqp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EP47( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A494ForSer = A494ForSer ;
      this.A482ForColNom = A482ForColNom ;
      this.A483ForColNum = A483ForColNum ;
      this.A831TipColCod = A831TipColCod ;
      /* Scan By routine */
      /* Using cursor T01EP30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EP47( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
   }

   public void scanEnd1EP47( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1EP47( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EP47( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EP47( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EP47( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EP47( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EP47( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EP47( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
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
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1EP1550( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6186Mq_Prog = T01EP3_A6186Mq_Prog[0] ;
            Z6267Mq_Prog2 = T01EP3_A6267Mq_Prog2[0] ;
            Z6268Mq_Prog3 = T01EP3_A6268Mq_Prog3[0] ;
         }
         else
         {
            Z6186Mq_Prog = A6186Mq_Prog ;
            Z6267Mq_Prog2 = A6267Mq_Prog2 ;
            Z6268Mq_Prog3 = A6268Mq_Prog3 ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z6186Mq_Prog = A6186Mq_Prog ;
         Z6267Mq_Prog2 = A6267Mq_Prog2 ;
         Z6268Mq_Prog3 = A6268Mq_Prog3 ;
         Z396EmprCod = A396EmprCod ;
         Z6037Mq_Grupo = A6037Mq_Grupo ;
         Z252CliCod = A252CliCod ;
         Z6038Mq_Desc = A6038Mq_Desc ;
      }
   }

   public void standaloneNotModal1EP1550( )
   {
   }

   public void standaloneModal1EP1550( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMq_Grupo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtMq_Grupo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1EP1550( )
   {
      /* Using cursor T01EP31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1550 = (short)(1) ;
         A6038Mq_Desc = T01EP31_A6038Mq_Desc[0] ;
         n6038Mq_Desc = T01EP31_n6038Mq_Desc[0] ;
         A6186Mq_Prog = T01EP31_A6186Mq_Prog[0] ;
         n6186Mq_Prog = T01EP31_n6186Mq_Prog[0] ;
         A6267Mq_Prog2 = T01EP31_A6267Mq_Prog2[0] ;
         n6267Mq_Prog2 = T01EP31_n6267Mq_Prog2[0] ;
         A6268Mq_Prog3 = T01EP31_A6268Mq_Prog3[0] ;
         n6268Mq_Prog3 = T01EP31_n6268Mq_Prog3[0] ;
         zm1EP1550( -8) ;
      }
      pr_default.close(29);
      onLoadActions1EP1550( ) ;
   }

   public void onLoadActions1EP1550( )
   {
      GXt_char1 = A6304Mq_ProgD1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6186Mq_Prog, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6304Mq_ProgD1 = GXt_char1 ;
      GXt_char1 = A6305Mq_ProgD2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6267Mq_Prog2, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6305Mq_ProgD2 = GXt_char1 ;
      GXt_char1 = A6306Mq_ProgD3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6268Mq_Prog3, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6306Mq_ProgD3 = GXt_char1 ;
   }

   public void checkExtendedTable1EP1550( )
   {
      nIsDirty_1550 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1EP1550( ) ;
      nIsDirty_1550 = (short)(1) ;
      GXt_char1 = A6304Mq_ProgD1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6186Mq_Prog, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6304Mq_ProgD1 = GXt_char1 ;
      nIsDirty_1550 = (short)(1) ;
      GXt_char1 = A6305Mq_ProgD2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6267Mq_Prog2, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6305Mq_ProgD2 = GXt_char1 ;
      nIsDirty_1550 = (short)(1) ;
      GXt_char1 = A6306Mq_ProgD3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6268Mq_Prog3, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6306Mq_ProgD3 = GXt_char1 ;
      /* Using cursor T01EP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MQ_GRUPO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQGRP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Grupo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6038Mq_Desc = T01EP4_A6038Mq_Desc[0] ;
      n6038Mq_Desc = T01EP4_n6038Mq_Desc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1EP1550( )
   {
      pr_default.close(2);
   }

   public void enableDisable1EP1550( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         byte A6037Mq_Grupo )
   {
      /* Using cursor T01EP32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "MQ_GRUPO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQGRP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Grupo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6038Mq_Desc = T01EP32_A6038Mq_Desc[0] ;
      n6038Mq_Desc = T01EP32_n6038Mq_Desc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6038Mq_Desc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void getKey1EP1550( )
   {
      /* Using cursor T01EP33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1550 = (short)(1) ;
      }
      else
      {
         RcdFound1550 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey1EP1550( )
   {
      /* Using cursor T01EP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01EP3_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01EP3_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01EP3_A483ForColNum[0] == A483ForColNum ) && ( T01EP3_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01EP3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01EP3_A252CliCod[0] == A252CliCod ) )
      {
         zm1EP1550( 8) ;
         RcdFound1550 = (short)(1) ;
         initializeNonKey1EP1550( ) ;
         A6186Mq_Prog = T01EP3_A6186Mq_Prog[0] ;
         n6186Mq_Prog = T01EP3_n6186Mq_Prog[0] ;
         A6267Mq_Prog2 = T01EP3_A6267Mq_Prog2[0] ;
         n6267Mq_Prog2 = T01EP3_n6267Mq_Prog2[0] ;
         A6268Mq_Prog3 = T01EP3_A6268Mq_Prog3[0] ;
         n6268Mq_Prog3 = T01EP3_n6268Mq_Prog3[0] ;
         A6037Mq_Grupo = T01EP3_A6037Mq_Grupo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z6037Mq_Grupo = A6037Mq_Grupo ;
         sMode1550 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EP1550( ) ;
         load1EP1550( ) ;
         Gx_mode = sMode1550 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1550 = (short)(0) ;
         initializeNonKey1EP1550( ) ;
         sMode1550 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EP1550( ) ;
         Gx_mode = sMode1550 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1EP1550( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1EP1550( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A6037Mq_Grupo)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFORMQP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z6186Mq_Prog != T01EP2_A6186Mq_Prog[0] ) || ( Z6267Mq_Prog2 != T01EP2_A6267Mq_Prog2[0] ) || ( Z6268Mq_Prog3 != T01EP2_A6268Mq_Prog3[0] ) )
         {
            if ( Z6186Mq_Prog != T01EP2_A6186Mq_Prog[0] )
            {
               GXutil.writeLogln("tformqp:[seudo value changed for attri]"+"Mq_Prog");
               GXutil.writeLogRaw("Old: ",Z6186Mq_Prog);
               GXutil.writeLogRaw("Current: ",T01EP2_A6186Mq_Prog[0]);
            }
            if ( Z6267Mq_Prog2 != T01EP2_A6267Mq_Prog2[0] )
            {
               GXutil.writeLogln("tformqp:[seudo value changed for attri]"+"Mq_Prog2");
               GXutil.writeLogRaw("Old: ",Z6267Mq_Prog2);
               GXutil.writeLogRaw("Current: ",T01EP2_A6267Mq_Prog2[0]);
            }
            if ( Z6268Mq_Prog3 != T01EP2_A6268Mq_Prog3[0] )
            {
               GXutil.writeLogln("tformqp:[seudo value changed for attri]"+"Mq_Prog3");
               GXutil.writeLogRaw("Old: ",Z6268Mq_Prog3);
               GXutil.writeLogRaw("Current: ",T01EP2_A6268Mq_Prog3[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFORMQP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EP1550( )
   {
      beforeValidate1EP1550( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EP1550( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EP1550( 0) ;
         checkOptimisticConcurrency1EP1550( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EP1550( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EP1550( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EP34 */
                  pr_default.execute(32, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Boolean.valueOf(n6186Mq_Prog), Integer.valueOf(A6186Mq_Prog), Boolean.valueOf(n6267Mq_Prog2), Integer.valueOf(A6267Mq_Prog2), Boolean.valueOf(n6268Mq_Prog3), Integer.valueOf(A6268Mq_Prog3), A396EmprCod, Byte.valueOf(A6037Mq_Grupo), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORMQP");
                  if ( (pr_default.getStatus(32) == 1) )
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
            load1EP1550( ) ;
         }
         endLevel1EP1550( ) ;
      }
      closeExtendedTableCursors1EP1550( ) ;
   }

   public void update1EP1550( )
   {
      beforeValidate1EP1550( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EP1550( ) ;
      }
      if ( ( nIsMod_1550 != 0 ) || ( nIsDirty_1550 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1EP1550( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1EP1550( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1EP1550( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01EP35 */
                     pr_default.execute(33, new Object[] {Boolean.valueOf(n6186Mq_Prog), Integer.valueOf(A6186Mq_Prog), Boolean.valueOf(n6267Mq_Prog2), Integer.valueOf(A6267Mq_Prog2), Boolean.valueOf(n6268Mq_Prog3), Integer.valueOf(A6268Mq_Prog3), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A6037Mq_Grupo)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORMQP");
                     if ( (pr_default.getStatus(33) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFORMQP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1EP1550( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1EP1550( ) ;
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
            endLevel1EP1550( ) ;
         }
      }
      closeExtendedTableCursors1EP1550( ) ;
   }

   public void deferredUpdate1EP1550( )
   {
   }

   public void delete1EP1550( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EP1550( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EP1550( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EP1550( ) ;
         afterConfirm1EP1550( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EP1550( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EP36 */
               pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A6037Mq_Grupo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORMQP");
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
      sMode1550 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EP1550( ) ;
      Gx_mode = sMode1550 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EP1550( )
   {
      standaloneModal1EP1550( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01EP37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
         A6038Mq_Desc = T01EP37_A6038Mq_Desc[0] ;
         n6038Mq_Desc = T01EP37_n6038Mq_Desc[0] ;
         pr_default.close(35);
         GXt_char1 = A6304Mq_ProgD1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6186Mq_Prog, GXv_char2) ;
         tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
         A6304Mq_ProgD1 = GXt_char1 ;
         GXt_char1 = A6305Mq_ProgD2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6267Mq_Prog2, GXv_char2) ;
         tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
         A6305Mq_ProgD2 = GXt_char1 ;
         GXt_char1 = A6306Mq_ProgD3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6268Mq_Prog3, GXv_char2) ;
         tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
         A6306Mq_ProgD3 = GXt_char1 ;
      }
   }

   public void endLevel1EP1550( )
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

   public void scanStart1EP1550( )
   {
      /* Scan By routine */
      /* Using cursor T01EP38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound1550 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1550 = (short)(1) ;
         A6037Mq_Grupo = T01EP38_A6037Mq_Grupo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EP1550( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound1550 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1550 = (short)(1) ;
         A6037Mq_Grupo = T01EP38_A6037Mq_Grupo[0] ;
      }
   }

   public void scanEnd1EP1550( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1EP1550( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EP1550( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EP1550( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EP1550( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EP1550( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EP1550( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EP1550( )
   {
      edtMq_Grupo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtMq_Desc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Desc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtMq_Prog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Prog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Prog_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtMq_ProgD1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ProgD1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ProgD1_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtMq_Prog2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Prog2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Prog2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtMq_ProgD2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ProgD2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ProgD2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtMq_Prog3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Prog3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Prog3_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtMq_ProgD3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_ProgD3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_ProgD3_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1EP1550( )
   {
   }

   public void send_integrity_lvl_hashes1EP47( )
   {
   }

   public void subsflControlProps_551550( )
   {
      edtavnRcdDeleted_1550_Internalname = "vNRCDDELETED_1550_"+sGXsfl_55_idx ;
      edtMq_Grupo_Internalname = "MQ_GRUPO_"+sGXsfl_55_idx ;
      edtMq_Desc_Internalname = "MQ_DESC_"+sGXsfl_55_idx ;
      edtMq_Prog_Internalname = "MQ_PROG_"+sGXsfl_55_idx ;
      edtMq_ProgD1_Internalname = "MQ_PROGD1_"+sGXsfl_55_idx ;
      edtMq_Prog2_Internalname = "MQ_PROG2_"+sGXsfl_55_idx ;
      edtMq_ProgD2_Internalname = "MQ_PROGD2_"+sGXsfl_55_idx ;
      edtMq_Prog3_Internalname = "MQ_PROG3_"+sGXsfl_55_idx ;
      edtMq_ProgD3_Internalname = "MQ_PROGD3_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551550( )
   {
      edtavnRcdDeleted_1550_Internalname = "vNRCDDELETED_1550_"+sGXsfl_55_fel_idx ;
      edtMq_Grupo_Internalname = "MQ_GRUPO_"+sGXsfl_55_fel_idx ;
      edtMq_Desc_Internalname = "MQ_DESC_"+sGXsfl_55_fel_idx ;
      edtMq_Prog_Internalname = "MQ_PROG_"+sGXsfl_55_fel_idx ;
      edtMq_ProgD1_Internalname = "MQ_PROGD1_"+sGXsfl_55_fel_idx ;
      edtMq_Prog2_Internalname = "MQ_PROG2_"+sGXsfl_55_fel_idx ;
      edtMq_ProgD2_Internalname = "MQ_PROGD2_"+sGXsfl_55_fel_idx ;
      edtMq_Prog3_Internalname = "MQ_PROG3_"+sGXsfl_55_fel_idx ;
      edtMq_ProgD3_Internalname = "MQ_PROGD3_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1EP1550( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551550( ) ;
      sendRow1EP1550( ) ;
   }

   public void sendRow1EP1550( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1550_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1550_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1550_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1550), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1550), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1550_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1550_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1550_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Grupo_Internalname,GXutil.ltrim( localUtil.ntoc( A6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6037Mq_Grupo), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Grupo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Grupo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Desc_Internalname,GXutil.rtrim( A6038Mq_Desc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Desc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Desc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1550_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Prog_Internalname,GXutil.ltrim( localUtil.ntoc( A6186Mq_Prog, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMq_Prog_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6186Mq_Prog), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6186Mq_Prog), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Prog_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Prog_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_ProgD1_Internalname,GXutil.rtrim( A6304Mq_ProgD1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_ProgD1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_ProgD1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1550_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Prog2_Internalname,GXutil.ltrim( localUtil.ntoc( A6267Mq_Prog2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMq_Prog2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6267Mq_Prog2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6267Mq_Prog2), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Prog2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Prog2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_ProgD2_Internalname,GXutil.rtrim( A6305Mq_ProgD2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_ProgD2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_ProgD2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1550_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Prog3_Internalname,GXutil.ltrim( localUtil.ntoc( A6268Mq_Prog3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMq_Prog3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6268Mq_Prog3), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6268Mq_Prog3), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Prog3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Prog3_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_ProgD3_Internalname,GXutil.rtrim( A6306Mq_ProgD3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_ProgD3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_ProgD3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1EP1550( ) ;
      GXCCtl = "Z6037Mq_Grupo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6037Mq_Grupo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6186Mq_Prog_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6186Mq_Prog, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6267Mq_Prog2_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6267Mq_Prog2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6268Mq_Prog3_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6268Mq_Prog3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1550_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1550_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1550_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1550, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1550_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1550_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_GRUPO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Grupo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_DESC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_PROG_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_PROGD1_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_PROG2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_PROGD2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_PROG3_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_PROGD3_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD3_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1EP1550( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551550( ) ;
      edtavnRcdDeleted_1550_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1550_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Grupo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_GRUPO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_DESC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Prog_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROG_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_ProgD1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROGD1_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Prog2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROG2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_ProgD2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROGD2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Prog3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROG3_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_ProgD3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_PROGD3_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1550_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1550_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1550");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1550_Internalname ;
         wbErr = true ;
         nRcdDeleted_1550 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1550 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1550_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Grupo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Grupo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MQ_GRUPO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Grupo_Internalname ;
         wbErr = true ;
         A6037Mq_Grupo = (byte)(0) ;
      }
      else
      {
         A6037Mq_Grupo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMq_Grupo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6038Mq_Desc = httpContext.cgiGet( edtMq_Desc_Internalname) ;
      n6038Mq_Desc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Prog_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Prog_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "MQ_PROG_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Prog_Internalname ;
         wbErr = true ;
         A6186Mq_Prog = 0 ;
         n6186Mq_Prog = false ;
      }
      else
      {
         A6186Mq_Prog = (int)(localUtil.ctol( httpContext.cgiGet( edtMq_Prog_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6186Mq_Prog = false ;
      }
      A6304Mq_ProgD1 = httpContext.cgiGet( edtMq_ProgD1_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Prog2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Prog2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "MQ_PROG2_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Prog2_Internalname ;
         wbErr = true ;
         A6267Mq_Prog2 = 0 ;
         n6267Mq_Prog2 = false ;
      }
      else
      {
         A6267Mq_Prog2 = (int)(localUtil.ctol( httpContext.cgiGet( edtMq_Prog2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6267Mq_Prog2 = false ;
      }
      A6305Mq_ProgD2 = httpContext.cgiGet( edtMq_ProgD2_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Prog3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Prog3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "MQ_PROG3_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Prog3_Internalname ;
         wbErr = true ;
         A6268Mq_Prog3 = 0 ;
         n6268Mq_Prog3 = false ;
      }
      else
      {
         A6268Mq_Prog3 = (int)(localUtil.ctol( httpContext.cgiGet( edtMq_Prog3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6268Mq_Prog3 = false ;
      }
      A6306Mq_ProgD3 = httpContext.cgiGet( edtMq_ProgD3_Internalname) ;
      GXCCtl = "Z6037Mq_Grupo_" + sGXsfl_55_idx ;
      Z6037Mq_Grupo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6186Mq_Prog_" + sGXsfl_55_idx ;
      Z6186Mq_Prog = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6267Mq_Prog2_" + sGXsfl_55_idx ;
      Z6267Mq_Prog2 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6268Mq_Prog3_" + sGXsfl_55_idx ;
      Z6268Mq_Prog3 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1550_" + sGXsfl_55_idx ;
      nRcdDeleted_1550 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1550_" + sGXsfl_55_idx ;
      nRcdExists_1550 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1550_" + sGXsfl_55_idx ;
      nIsMod_1550 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMq_Grupo_Enabled = edtMq_Grupo_Enabled ;
   }

   public void confirmValues1EP0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551550( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551550( ) ;
         httpContext.changePostValue( "Z6037Mq_Grupo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z6037Mq_Grupo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6037Mq_Grupo_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z6186Mq_Prog_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z6186Mq_Prog_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6186Mq_Prog_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z6267Mq_Prog2_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z6267Mq_Prog2_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6267Mq_Prog2_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z6268Mq_Prog3_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z6268Mq_Prog3_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6268Mq_Prog3_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tformqp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tformqp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"})  ;
   }

   public String getPgmname( )
   {
      return "TFORMQP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RELACION COLOR-MAQ-PROGRAMAS", "") ;
   }

   public void initializeNonKey1EP47( )
   {
   }

   public void initAll1EP47( )
   {
      initializeNonKey1EP47( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1EP1550( )
   {
      A6306Mq_ProgD3 = "" ;
      A6305Mq_ProgD2 = "" ;
      A6304Mq_ProgD1 = "" ;
      A6038Mq_Desc = "" ;
      n6038Mq_Desc = false ;
      A6186Mq_Prog = 0 ;
      n6186Mq_Prog = false ;
      A6267Mq_Prog2 = 0 ;
      n6267Mq_Prog2 = false ;
      A6268Mq_Prog3 = 0 ;
      n6268Mq_Prog3 = false ;
      Z6186Mq_Prog = 0 ;
      Z6267Mq_Prog2 = 0 ;
      Z6268Mq_Prog3 = 0 ;
   }

   public void initAll1EP1550( )
   {
      A6037Mq_Grupo = (byte)(0) ;
      initializeNonKey1EP1550( ) ;
   }

   public void standaloneModalInsert1EP1550( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565986", true, true);
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
      httpContext.AddJavascriptSource("tformqp.js", "?20268241565987", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1550( )
   {
      edtMq_Grupo_Enabled = defedtMq_Grupo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Grupo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1550, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1550_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6037Mq_Grupo, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Grupo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6038Mq_Desc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6186Mq_Prog, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6304Mq_ProgD1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6267Mq_Prog2, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6305Mq_ProgD2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6268Mq_Prog3, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Prog3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6306Mq_ProgD3));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_ProgD3_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtForSer_Internalname = "FORSER" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1550_Internalname = "vNRCDDELETED_1550" ;
      edtMq_Grupo_Internalname = "MQ_GRUPO" ;
      edtMq_Desc_Internalname = "MQ_DESC" ;
      edtMq_Prog_Internalname = "MQ_PROG" ;
      edtMq_ProgD1_Internalname = "MQ_PROGD1" ;
      edtMq_Prog2_Internalname = "MQ_PROG2" ;
      edtMq_ProgD2_Internalname = "MQ_PROGD2" ;
      edtMq_Prog3_Internalname = "MQ_PROG3" ;
      edtMq_ProgD3_Internalname = "MQ_PROGD3" ;
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
      Form.setCaption( httpContext.getMessage( "RELACION COLOR-MAQ-PROGRAMAS", "") );
      edtMq_ProgD3_Jsonclick = "" ;
      edtMq_Prog3_Jsonclick = "" ;
      edtMq_ProgD2_Jsonclick = "" ;
      edtMq_Prog2_Jsonclick = "" ;
      edtMq_ProgD1_Jsonclick = "" ;
      edtMq_Prog_Jsonclick = "" ;
      edtMq_Desc_Jsonclick = "" ;
      edtMq_Grupo_Jsonclick = "" ;
      edtavnRcdDeleted_1550_Jsonclick = "" ;
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
      edtMq_ProgD3_Enabled = 0 ;
      edtMq_Prog3_Enabled = 1 ;
      edtMq_ProgD2_Enabled = 0 ;
      edtMq_Prog2_Enabled = 1 ;
      edtMq_ProgD1_Enabled = 0 ;
      edtMq_Prog_Enabled = 1 ;
      edtMq_Desc_Enabled = 0 ;
      edtMq_Grupo_Enabled = 1 ;
      edtavnRcdDeleted_1550_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void gx1asamq_progd11EP1550( String A396EmprCod ,
                                       int A6186Mq_Prog )
   {
      GXt_char1 = A6304Mq_ProgD1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6186Mq_Prog, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6304Mq_ProgD1 = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6304Mq_ProgD1))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asamq_progd21EP1550( String A396EmprCod ,
                                       int A6267Mq_Prog2 )
   {
      GXt_char1 = A6305Mq_ProgD2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6267Mq_Prog2, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6305Mq_ProgD2 = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6305Mq_ProgD2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asamq_progd31EP1550( String A396EmprCod ,
                                       int A6268Mq_Prog3 )
   {
      GXt_char1 = A6306Mq_ProgD3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6268Mq_Prog3, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6306Mq_ProgD3 = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6306Mq_ProgD3))+"\"") ;
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
      subsflControlProps_551550( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1EP1550( ) ;
         standaloneModal1EP1550( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1EP1550( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551550( ) ;
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
      /* Using cursor T01EP39 */
      pr_default.execute(37, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EP39_A407EmprNom[0] ;
      n407EmprNom = T01EP39_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(37);
      /* Using cursor T01EP40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(38);
      /* Using cursor T01EP41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(39);
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

   public void valid_Tipcolcod( )
   {
      n252CliCod = false ;
      n494ForSer = false ;
      n482ForColNom = false ;
      n483ForColNum = false ;
      n831TipColCod = false ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mq_grupo( )
   {
      n6038Mq_Desc = false ;
      /* Using cursor T01EP37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Byte.valueOf(A6037Mq_Grupo)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQGRP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MQ_GRUPO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Grupo_Internalname ;
      }
      A6038Mq_Desc = T01EP37_A6038Mq_Desc[0] ;
      n6038Mq_Desc = T01EP37_n6038Mq_Desc[0] ;
      pr_default.close(35);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6038Mq_Desc", GXutil.rtrim( A6038Mq_Desc));
   }

   public void valid_Mq_prog( )
   {
      n6186Mq_Prog = false ;
      GXt_char1 = A6304Mq_ProgD1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6186Mq_Prog, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6304Mq_ProgD1 = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6304Mq_ProgD1", GXutil.rtrim( A6304Mq_ProgD1));
   }

   public void valid_Mq_prog2( )
   {
      n6267Mq_Prog2 = false ;
      GXt_char1 = A6305Mq_ProgD2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6267Mq_Prog2, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6305Mq_ProgD2 = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6305Mq_ProgD2", GXutil.rtrim( A6305Mq_ProgD2));
   }

   public void valid_Mq_prog3( )
   {
      n6268Mq_Prog3 = false ;
      GXt_char1 = A6306Mq_ProgD3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pfindft(remoteHandle, context).execute( A396EmprCod, A6268Mq_Prog3, GXv_char2) ;
      tformqp_impl.this.GXt_char1 = GXv_char2[0] ;
      A6306Mq_ProgD3 = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6306Mq_ProgD3", GXutil.rtrim( A6306Mq_ProgD3));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
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
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MQ_GRUPO","{handler:'valid_Mq_grupo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6037Mq_Grupo',fld:'MQ_GRUPO',pic:'Z9'},{av:'A6038Mq_Desc',fld:'MQ_DESC',pic:''}]");
      setEventMetadata("VALID_MQ_GRUPO",",oparms:[{av:'A6038Mq_Desc',fld:'MQ_DESC',pic:''}]}");
      setEventMetadata("VALID_MQ_PROG","{handler:'valid_Mq_prog',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6186Mq_Prog',fld:'MQ_PROG',pic:'ZZZZZ9'},{av:'A6304Mq_ProgD1',fld:'MQ_PROGD1',pic:''}]");
      setEventMetadata("VALID_MQ_PROG",",oparms:[{av:'A6304Mq_ProgD1',fld:'MQ_PROGD1',pic:''}]}");
      setEventMetadata("VALID_MQ_PROG2","{handler:'valid_Mq_prog2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6267Mq_Prog2',fld:'MQ_PROG2',pic:'ZZZZZ9'},{av:'A6305Mq_ProgD2',fld:'MQ_PROGD2',pic:''}]");
      setEventMetadata("VALID_MQ_PROG2",",oparms:[{av:'A6305Mq_ProgD2',fld:'MQ_PROGD2',pic:''}]}");
      setEventMetadata("VALID_MQ_PROG3","{handler:'valid_Mq_prog3',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6268Mq_Prog3',fld:'MQ_PROG3',pic:'ZZZZZ9'},{av:'A6306Mq_ProgD3',fld:'MQ_PROGD3',pic:''}]");
      setEventMetadata("VALID_MQ_PROG3",",oparms:[{av:'A6306Mq_ProgD3',fld:'MQ_PROGD3',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Mq_progd3',iparms:[]");
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
      pr_default.close(35);
      pr_default.close(38);
      pr_default.close(37);
      pr_default.close(39);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1550 = "" ;
      GX_FocusControl = "" ;
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
      sMode47 = "" ;
      GXCCtl = "" ;
      A6038Mq_Desc = "" ;
      A6304Mq_ProgD1 = "" ;
      A6305Mq_ProgD2 = "" ;
      A6306Mq_ProgD3 = "" ;
      Z407EmprNom = "" ;
      T01EP7_A407EmprNom = new String[] {""} ;
      T01EP7_n407EmprNom = new boolean[] {false} ;
      T01EP8_A396EmprCod = new String[] {""} ;
      T01EP9_A396EmprCod = new String[] {""} ;
      T01EP10_A494ForSer = new String[] {""} ;
      T01EP10_n494ForSer = new boolean[] {false} ;
      T01EP10_A482ForColNom = new String[] {""} ;
      T01EP10_n482ForColNom = new boolean[] {false} ;
      T01EP10_A483ForColNum = new int[1] ;
      T01EP10_n483ForColNum = new boolean[] {false} ;
      T01EP10_A407EmprNom = new String[] {""} ;
      T01EP10_n407EmprNom = new boolean[] {false} ;
      T01EP10_A396EmprCod = new String[] {""} ;
      T01EP10_A252CliCod = new int[1] ;
      T01EP10_n252CliCod = new boolean[] {false} ;
      T01EP10_A831TipColCod = new byte[1] ;
      T01EP10_n831TipColCod = new boolean[] {false} ;
      T01EP11_A396EmprCod = new String[] {""} ;
      T01EP11_A252CliCod = new int[1] ;
      T01EP11_n252CliCod = new boolean[] {false} ;
      T01EP11_A494ForSer = new String[] {""} ;
      T01EP11_n494ForSer = new boolean[] {false} ;
      T01EP11_A482ForColNom = new String[] {""} ;
      T01EP11_n482ForColNom = new boolean[] {false} ;
      T01EP11_A483ForColNum = new int[1] ;
      T01EP11_n483ForColNum = new boolean[] {false} ;
      T01EP11_A831TipColCod = new byte[1] ;
      T01EP11_n831TipColCod = new boolean[] {false} ;
      T01EP6_A494ForSer = new String[] {""} ;
      T01EP6_n494ForSer = new boolean[] {false} ;
      T01EP6_A482ForColNom = new String[] {""} ;
      T01EP6_n482ForColNom = new boolean[] {false} ;
      T01EP6_A483ForColNum = new int[1] ;
      T01EP6_n483ForColNum = new boolean[] {false} ;
      T01EP6_A396EmprCod = new String[] {""} ;
      T01EP6_A252CliCod = new int[1] ;
      T01EP6_n252CliCod = new boolean[] {false} ;
      T01EP6_A831TipColCod = new byte[1] ;
      T01EP6_n831TipColCod = new boolean[] {false} ;
      T01EP12_A396EmprCod = new String[] {""} ;
      T01EP12_A252CliCod = new int[1] ;
      T01EP12_n252CliCod = new boolean[] {false} ;
      T01EP12_A494ForSer = new String[] {""} ;
      T01EP12_n494ForSer = new boolean[] {false} ;
      T01EP12_A482ForColNom = new String[] {""} ;
      T01EP12_n482ForColNom = new boolean[] {false} ;
      T01EP12_A483ForColNum = new int[1] ;
      T01EP12_n483ForColNum = new boolean[] {false} ;
      T01EP12_A831TipColCod = new byte[1] ;
      T01EP12_n831TipColCod = new boolean[] {false} ;
      T01EP13_A396EmprCod = new String[] {""} ;
      T01EP13_A252CliCod = new int[1] ;
      T01EP13_n252CliCod = new boolean[] {false} ;
      T01EP13_A494ForSer = new String[] {""} ;
      T01EP13_n494ForSer = new boolean[] {false} ;
      T01EP13_A482ForColNom = new String[] {""} ;
      T01EP13_n482ForColNom = new boolean[] {false} ;
      T01EP13_A483ForColNum = new int[1] ;
      T01EP13_n483ForColNum = new boolean[] {false} ;
      T01EP13_A831TipColCod = new byte[1] ;
      T01EP13_n831TipColCod = new boolean[] {false} ;
      T01EP5_A494ForSer = new String[] {""} ;
      T01EP5_n494ForSer = new boolean[] {false} ;
      T01EP5_A482ForColNom = new String[] {""} ;
      T01EP5_n482ForColNom = new boolean[] {false} ;
      T01EP5_A483ForColNum = new int[1] ;
      T01EP5_n483ForColNum = new boolean[] {false} ;
      T01EP5_A396EmprCod = new String[] {""} ;
      T01EP5_A252CliCod = new int[1] ;
      T01EP5_n252CliCod = new boolean[] {false} ;
      T01EP5_A831TipColCod = new byte[1] ;
      T01EP5_n831TipColCod = new boolean[] {false} ;
      T01EP16_A396EmprCod = new String[] {""} ;
      T01EP16_A252CliCod = new int[1] ;
      T01EP16_n252CliCod = new boolean[] {false} ;
      T01EP16_A494ForSer = new String[] {""} ;
      T01EP16_n494ForSer = new boolean[] {false} ;
      T01EP16_A482ForColNom = new String[] {""} ;
      T01EP16_n482ForColNom = new boolean[] {false} ;
      T01EP16_A483ForColNum = new int[1] ;
      T01EP16_n483ForColNum = new boolean[] {false} ;
      T01EP16_A831TipColCod = new byte[1] ;
      T01EP16_n831TipColCod = new boolean[] {false} ;
      T01EP16_A13377ForNormaID = new String[] {""} ;
      T01EP17_A396EmprCod = new String[] {""} ;
      T01EP17_A252CliCod = new int[1] ;
      T01EP17_n252CliCod = new boolean[] {false} ;
      T01EP17_A494ForSer = new String[] {""} ;
      T01EP17_n494ForSer = new boolean[] {false} ;
      T01EP17_A482ForColNom = new String[] {""} ;
      T01EP17_n482ForColNom = new boolean[] {false} ;
      T01EP17_A483ForColNum = new int[1] ;
      T01EP17_n483ForColNum = new boolean[] {false} ;
      T01EP17_A831TipColCod = new byte[1] ;
      T01EP17_n831TipColCod = new boolean[] {false} ;
      T01EP17_A3571EnsCod = new String[] {""} ;
      T01EP18_A396EmprCod = new String[] {""} ;
      T01EP18_A252CliCod = new int[1] ;
      T01EP18_n252CliCod = new boolean[] {false} ;
      T01EP18_A494ForSer = new String[] {""} ;
      T01EP18_n494ForSer = new boolean[] {false} ;
      T01EP18_A482ForColNom = new String[] {""} ;
      T01EP18_n482ForColNom = new boolean[] {false} ;
      T01EP18_A483ForColNum = new int[1] ;
      T01EP18_n483ForColNum = new boolean[] {false} ;
      T01EP18_A831TipColCod = new byte[1] ;
      T01EP18_n831TipColCod = new boolean[] {false} ;
      T01EP18_A7270Procod_c = new String[] {""} ;
      T01EP18_A7272CliCod_d = new int[1] ;
      T01EP19_A396EmprCod = new String[] {""} ;
      T01EP19_A252CliCod = new int[1] ;
      T01EP19_n252CliCod = new boolean[] {false} ;
      T01EP19_A494ForSer = new String[] {""} ;
      T01EP19_n494ForSer = new boolean[] {false} ;
      T01EP19_A482ForColNom = new String[] {""} ;
      T01EP19_n482ForColNom = new boolean[] {false} ;
      T01EP19_A483ForColNum = new int[1] ;
      T01EP19_n483ForColNum = new boolean[] {false} ;
      T01EP19_A831TipColCod = new byte[1] ;
      T01EP19_n831TipColCod = new boolean[] {false} ;
      T01EP19_A6525ColAqP = new String[] {""} ;
      T01EP20_A396EmprCod = new String[] {""} ;
      T01EP20_A252CliCod = new int[1] ;
      T01EP20_n252CliCod = new boolean[] {false} ;
      T01EP20_A494ForSer = new String[] {""} ;
      T01EP20_n494ForSer = new boolean[] {false} ;
      T01EP20_A482ForColNom = new String[] {""} ;
      T01EP20_n482ForColNom = new boolean[] {false} ;
      T01EP20_A483ForColNum = new int[1] ;
      T01EP20_n483ForColNum = new boolean[] {false} ;
      T01EP20_A831TipColCod = new byte[1] ;
      T01EP20_n831TipColCod = new boolean[] {false} ;
      T01EP20_A7262CACPP = new String[] {""} ;
      T01EP21_A396EmprCod = new String[] {""} ;
      T01EP21_A252CliCod = new int[1] ;
      T01EP21_n252CliCod = new boolean[] {false} ;
      T01EP21_A494ForSer = new String[] {""} ;
      T01EP21_n494ForSer = new boolean[] {false} ;
      T01EP21_A482ForColNom = new String[] {""} ;
      T01EP21_n482ForColNom = new boolean[] {false} ;
      T01EP21_A483ForColNum = new int[1] ;
      T01EP21_n483ForColNum = new boolean[] {false} ;
      T01EP21_A831TipColCod = new byte[1] ;
      T01EP21_n831TipColCod = new boolean[] {false} ;
      T01EP21_A853For_ProC = new String[] {""} ;
      T01EP22_A396EmprCod = new String[] {""} ;
      T01EP22_A252CliCod = new int[1] ;
      T01EP22_n252CliCod = new boolean[] {false} ;
      T01EP22_A494ForSer = new String[] {""} ;
      T01EP22_n494ForSer = new boolean[] {false} ;
      T01EP22_A482ForColNom = new String[] {""} ;
      T01EP22_n482ForColNom = new boolean[] {false} ;
      T01EP22_A483ForColNum = new int[1] ;
      T01EP22_n483ForColNum = new boolean[] {false} ;
      T01EP22_A831TipColCod = new byte[1] ;
      T01EP22_n831TipColCod = new boolean[] {false} ;
      T01EP22_A9766ForProC = new String[] {""} ;
      T01EP23_A396EmprCod = new String[] {""} ;
      T01EP23_A252CliCod = new int[1] ;
      T01EP23_n252CliCod = new boolean[] {false} ;
      T01EP23_A494ForSer = new String[] {""} ;
      T01EP23_n494ForSer = new boolean[] {false} ;
      T01EP23_A482ForColNom = new String[] {""} ;
      T01EP23_n482ForColNom = new boolean[] {false} ;
      T01EP23_A483ForColNum = new int[1] ;
      T01EP23_n483ForColNum = new boolean[] {false} ;
      T01EP23_A831TipColCod = new byte[1] ;
      T01EP23_n831TipColCod = new boolean[] {false} ;
      T01EP23_A7797Sim_lin = new short[1] ;
      T01EP24_A396EmprCod = new String[] {""} ;
      T01EP24_A252CliCod = new int[1] ;
      T01EP24_n252CliCod = new boolean[] {false} ;
      T01EP24_A494ForSer = new String[] {""} ;
      T01EP24_n494ForSer = new boolean[] {false} ;
      T01EP24_A482ForColNom = new String[] {""} ;
      T01EP24_n482ForColNom = new boolean[] {false} ;
      T01EP24_A483ForColNum = new int[1] ;
      T01EP24_n483ForColNum = new boolean[] {false} ;
      T01EP24_A831TipColCod = new byte[1] ;
      T01EP24_n831TipColCod = new boolean[] {false} ;
      T01EP24_A7094Acab_Ter = new String[] {""} ;
      T01EP25_A396EmprCod = new String[] {""} ;
      T01EP25_A252CliCod = new int[1] ;
      T01EP25_n252CliCod = new boolean[] {false} ;
      T01EP25_A494ForSer = new String[] {""} ;
      T01EP25_n494ForSer = new boolean[] {false} ;
      T01EP25_A482ForColNom = new String[] {""} ;
      T01EP25_n482ForColNom = new boolean[] {false} ;
      T01EP25_A483ForColNum = new int[1] ;
      T01EP25_n483ForColNum = new boolean[] {false} ;
      T01EP25_A831TipColCod = new byte[1] ;
      T01EP25_n831TipColCod = new boolean[] {false} ;
      T01EP25_A3689ComForLin = new short[1] ;
      T01EP26_A396EmprCod = new String[] {""} ;
      T01EP26_A252CliCod = new int[1] ;
      T01EP26_n252CliCod = new boolean[] {false} ;
      T01EP26_A494ForSer = new String[] {""} ;
      T01EP26_n494ForSer = new boolean[] {false} ;
      T01EP26_A482ForColNom = new String[] {""} ;
      T01EP26_n482ForColNom = new boolean[] {false} ;
      T01EP26_A483ForColNum = new int[1] ;
      T01EP26_n483ForColNum = new boolean[] {false} ;
      T01EP26_A831TipColCod = new byte[1] ;
      T01EP26_n831TipColCod = new boolean[] {false} ;
      T01EP26_A1519RecCorLin = new byte[1] ;
      T01EP27_A396EmprCod = new String[] {""} ;
      T01EP27_A252CliCod = new int[1] ;
      T01EP27_n252CliCod = new boolean[] {false} ;
      T01EP27_A494ForSer = new String[] {""} ;
      T01EP27_n494ForSer = new boolean[] {false} ;
      T01EP27_A482ForColNom = new String[] {""} ;
      T01EP27_n482ForColNom = new boolean[] {false} ;
      T01EP27_A483ForColNum = new int[1] ;
      T01EP27_n483ForColNum = new boolean[] {false} ;
      T01EP27_A831TipColCod = new byte[1] ;
      T01EP27_n831TipColCod = new boolean[] {false} ;
      T01EP27_A1160ProForL = new short[1] ;
      T01EP28_A396EmprCod = new String[] {""} ;
      T01EP28_A910Workstat = new String[] {""} ;
      T01EP28_A880EscLin = new short[1] ;
      T01EP29_A396EmprCod = new String[] {""} ;
      T01EP29_A252CliCod = new int[1] ;
      T01EP29_n252CliCod = new boolean[] {false} ;
      T01EP29_A494ForSer = new String[] {""} ;
      T01EP29_n494ForSer = new boolean[] {false} ;
      T01EP29_A482ForColNom = new String[] {""} ;
      T01EP29_n482ForColNom = new boolean[] {false} ;
      T01EP29_A483ForColNum = new int[1] ;
      T01EP29_n483ForColNum = new boolean[] {false} ;
      T01EP29_A831TipColCod = new byte[1] ;
      T01EP29_n831TipColCod = new boolean[] {false} ;
      T01EP29_A650ObsLin = new short[1] ;
      T01EP30_A396EmprCod = new String[] {""} ;
      T01EP30_A252CliCod = new int[1] ;
      T01EP30_n252CliCod = new boolean[] {false} ;
      T01EP30_A494ForSer = new String[] {""} ;
      T01EP30_n494ForSer = new boolean[] {false} ;
      T01EP30_A482ForColNom = new String[] {""} ;
      T01EP30_n482ForColNom = new boolean[] {false} ;
      T01EP30_A483ForColNum = new int[1] ;
      T01EP30_n483ForColNum = new boolean[] {false} ;
      T01EP30_A831TipColCod = new byte[1] ;
      T01EP30_n831TipColCod = new boolean[] {false} ;
      Z6038Mq_Desc = "" ;
      T01EP31_A494ForSer = new String[] {""} ;
      T01EP31_n494ForSer = new boolean[] {false} ;
      T01EP31_A482ForColNom = new String[] {""} ;
      T01EP31_n482ForColNom = new boolean[] {false} ;
      T01EP31_A483ForColNum = new int[1] ;
      T01EP31_n483ForColNum = new boolean[] {false} ;
      T01EP31_A831TipColCod = new byte[1] ;
      T01EP31_n831TipColCod = new boolean[] {false} ;
      T01EP31_A6038Mq_Desc = new String[] {""} ;
      T01EP31_n6038Mq_Desc = new boolean[] {false} ;
      T01EP31_A6186Mq_Prog = new int[1] ;
      T01EP31_n6186Mq_Prog = new boolean[] {false} ;
      T01EP31_A6267Mq_Prog2 = new int[1] ;
      T01EP31_n6267Mq_Prog2 = new boolean[] {false} ;
      T01EP31_A6268Mq_Prog3 = new int[1] ;
      T01EP31_n6268Mq_Prog3 = new boolean[] {false} ;
      T01EP31_A396EmprCod = new String[] {""} ;
      T01EP31_A6037Mq_Grupo = new byte[1] ;
      T01EP31_A252CliCod = new int[1] ;
      T01EP31_n252CliCod = new boolean[] {false} ;
      T01EP4_A6038Mq_Desc = new String[] {""} ;
      T01EP4_n6038Mq_Desc = new boolean[] {false} ;
      T01EP32_A6038Mq_Desc = new String[] {""} ;
      T01EP32_n6038Mq_Desc = new boolean[] {false} ;
      T01EP33_A396EmprCod = new String[] {""} ;
      T01EP33_A252CliCod = new int[1] ;
      T01EP33_n252CliCod = new boolean[] {false} ;
      T01EP33_A494ForSer = new String[] {""} ;
      T01EP33_n494ForSer = new boolean[] {false} ;
      T01EP33_A482ForColNom = new String[] {""} ;
      T01EP33_n482ForColNom = new boolean[] {false} ;
      T01EP33_A483ForColNum = new int[1] ;
      T01EP33_n483ForColNum = new boolean[] {false} ;
      T01EP33_A831TipColCod = new byte[1] ;
      T01EP33_n831TipColCod = new boolean[] {false} ;
      T01EP33_A6037Mq_Grupo = new byte[1] ;
      T01EP3_A494ForSer = new String[] {""} ;
      T01EP3_n494ForSer = new boolean[] {false} ;
      T01EP3_A482ForColNom = new String[] {""} ;
      T01EP3_n482ForColNom = new boolean[] {false} ;
      T01EP3_A483ForColNum = new int[1] ;
      T01EP3_n483ForColNum = new boolean[] {false} ;
      T01EP3_A831TipColCod = new byte[1] ;
      T01EP3_n831TipColCod = new boolean[] {false} ;
      T01EP3_A6186Mq_Prog = new int[1] ;
      T01EP3_n6186Mq_Prog = new boolean[] {false} ;
      T01EP3_A6267Mq_Prog2 = new int[1] ;
      T01EP3_n6267Mq_Prog2 = new boolean[] {false} ;
      T01EP3_A6268Mq_Prog3 = new int[1] ;
      T01EP3_n6268Mq_Prog3 = new boolean[] {false} ;
      T01EP3_A396EmprCod = new String[] {""} ;
      T01EP3_A6037Mq_Grupo = new byte[1] ;
      T01EP3_A252CliCod = new int[1] ;
      T01EP3_n252CliCod = new boolean[] {false} ;
      T01EP2_A494ForSer = new String[] {""} ;
      T01EP2_n494ForSer = new boolean[] {false} ;
      T01EP2_A482ForColNom = new String[] {""} ;
      T01EP2_n482ForColNom = new boolean[] {false} ;
      T01EP2_A483ForColNum = new int[1] ;
      T01EP2_n483ForColNum = new boolean[] {false} ;
      T01EP2_A831TipColCod = new byte[1] ;
      T01EP2_n831TipColCod = new boolean[] {false} ;
      T01EP2_A6186Mq_Prog = new int[1] ;
      T01EP2_n6186Mq_Prog = new boolean[] {false} ;
      T01EP2_A6267Mq_Prog2 = new int[1] ;
      T01EP2_n6267Mq_Prog2 = new boolean[] {false} ;
      T01EP2_A6268Mq_Prog3 = new int[1] ;
      T01EP2_n6268Mq_Prog3 = new boolean[] {false} ;
      T01EP2_A396EmprCod = new String[] {""} ;
      T01EP2_A6037Mq_Grupo = new byte[1] ;
      T01EP2_A252CliCod = new int[1] ;
      T01EP2_n252CliCod = new boolean[] {false} ;
      T01EP37_A6038Mq_Desc = new String[] {""} ;
      T01EP37_n6038Mq_Desc = new boolean[] {false} ;
      T01EP38_A396EmprCod = new String[] {""} ;
      T01EP38_A252CliCod = new int[1] ;
      T01EP38_n252CliCod = new boolean[] {false} ;
      T01EP38_A494ForSer = new String[] {""} ;
      T01EP38_n494ForSer = new boolean[] {false} ;
      T01EP38_A482ForColNom = new String[] {""} ;
      T01EP38_n482ForColNom = new boolean[] {false} ;
      T01EP38_A483ForColNum = new int[1] ;
      T01EP38_n483ForColNum = new boolean[] {false} ;
      T01EP38_A831TipColCod = new byte[1] ;
      T01EP38_n831TipColCod = new boolean[] {false} ;
      T01EP38_A6037Mq_Grupo = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01EP39_A407EmprNom = new String[] {""} ;
      T01EP39_n407EmprNom = new boolean[] {false} ;
      T01EP40_A396EmprCod = new String[] {""} ;
      T01EP41_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ407EmprNom = "" ;
      Z6304Mq_ProgD1 = "" ;
      Z6305Mq_ProgD2 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Z6306Mq_ProgD3 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tformqp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tformqp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tformqp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tformqp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tformqp__default(),
         new Object[] {
             new Object[] {
            T01EP2_A494ForSer, T01EP2_A482ForColNom, T01EP2_A483ForColNum, T01EP2_A831TipColCod, T01EP2_A6186Mq_Prog, T01EP2_n6186Mq_Prog, T01EP2_A6267Mq_Prog2, T01EP2_n6267Mq_Prog2, T01EP2_A6268Mq_Prog3, T01EP2_n6268Mq_Prog3,
            T01EP2_A396EmprCod, T01EP2_A6037Mq_Grupo, T01EP2_A252CliCod
            }
            , new Object[] {
            T01EP3_A494ForSer, T01EP3_A482ForColNom, T01EP3_A483ForColNum, T01EP3_A831TipColCod, T01EP3_A6186Mq_Prog, T01EP3_n6186Mq_Prog, T01EP3_A6267Mq_Prog2, T01EP3_n6267Mq_Prog2, T01EP3_A6268Mq_Prog3, T01EP3_n6268Mq_Prog3,
            T01EP3_A396EmprCod, T01EP3_A6037Mq_Grupo, T01EP3_A252CliCod
            }
            , new Object[] {
            T01EP4_A6038Mq_Desc, T01EP4_n6038Mq_Desc
            }
            , new Object[] {
            T01EP5_A494ForSer, T01EP5_A482ForColNom, T01EP5_A483ForColNum, T01EP5_A396EmprCod, T01EP5_A252CliCod, T01EP5_A831TipColCod
            }
            , new Object[] {
            T01EP6_A494ForSer, T01EP6_A482ForColNom, T01EP6_A483ForColNum, T01EP6_A396EmprCod, T01EP6_A252CliCod, T01EP6_A831TipColCod
            }
            , new Object[] {
            T01EP7_A407EmprNom, T01EP7_n407EmprNom
            }
            , new Object[] {
            T01EP8_A396EmprCod
            }
            , new Object[] {
            T01EP9_A396EmprCod
            }
            , new Object[] {
            T01EP10_A494ForSer, T01EP10_A482ForColNom, T01EP10_A483ForColNum, T01EP10_A407EmprNom, T01EP10_n407EmprNom, T01EP10_A396EmprCod, T01EP10_A252CliCod, T01EP10_A831TipColCod
            }
            , new Object[] {
            T01EP11_A396EmprCod, T01EP11_A252CliCod, T01EP11_A494ForSer, T01EP11_A482ForColNom, T01EP11_A483ForColNum, T01EP11_A831TipColCod
            }
            , new Object[] {
            T01EP12_A396EmprCod, T01EP12_A252CliCod, T01EP12_A494ForSer, T01EP12_A482ForColNom, T01EP12_A483ForColNum, T01EP12_A831TipColCod
            }
            , new Object[] {
            T01EP13_A396EmprCod, T01EP13_A252CliCod, T01EP13_A494ForSer, T01EP13_A482ForColNom, T01EP13_A483ForColNum, T01EP13_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EP16_A396EmprCod, T01EP16_A252CliCod, T01EP16_A494ForSer, T01EP16_A482ForColNom, T01EP16_A483ForColNum, T01EP16_A831TipColCod, T01EP16_A13377ForNormaID
            }
            , new Object[] {
            T01EP17_A396EmprCod, T01EP17_A252CliCod, T01EP17_A494ForSer, T01EP17_A482ForColNom, T01EP17_A483ForColNum, T01EP17_A831TipColCod, T01EP17_A3571EnsCod
            }
            , new Object[] {
            T01EP18_A396EmprCod, T01EP18_A252CliCod, T01EP18_A494ForSer, T01EP18_A482ForColNom, T01EP18_A483ForColNum, T01EP18_A831TipColCod, T01EP18_A7270Procod_c, T01EP18_A7272CliCod_d
            }
            , new Object[] {
            T01EP19_A396EmprCod, T01EP19_A252CliCod, T01EP19_A494ForSer, T01EP19_A482ForColNom, T01EP19_A483ForColNum, T01EP19_A831TipColCod, T01EP19_A6525ColAqP
            }
            , new Object[] {
            T01EP20_A396EmprCod, T01EP20_A252CliCod, T01EP20_A494ForSer, T01EP20_A482ForColNom, T01EP20_A483ForColNum, T01EP20_A831TipColCod, T01EP20_A7262CACPP
            }
            , new Object[] {
            T01EP21_A396EmprCod, T01EP21_A252CliCod, T01EP21_A494ForSer, T01EP21_A482ForColNom, T01EP21_A483ForColNum, T01EP21_A831TipColCod, T01EP21_A853For_ProC
            }
            , new Object[] {
            T01EP22_A396EmprCod, T01EP22_A252CliCod, T01EP22_A494ForSer, T01EP22_A482ForColNom, T01EP22_A483ForColNum, T01EP22_A831TipColCod, T01EP22_A9766ForProC
            }
            , new Object[] {
            T01EP23_A396EmprCod, T01EP23_A252CliCod, T01EP23_A494ForSer, T01EP23_A482ForColNom, T01EP23_A483ForColNum, T01EP23_A831TipColCod, T01EP23_A7797Sim_lin
            }
            , new Object[] {
            T01EP24_A396EmprCod, T01EP24_A252CliCod, T01EP24_A494ForSer, T01EP24_A482ForColNom, T01EP24_A483ForColNum, T01EP24_A831TipColCod, T01EP24_A7094Acab_Ter
            }
            , new Object[] {
            T01EP25_A396EmprCod, T01EP25_A252CliCod, T01EP25_A494ForSer, T01EP25_A482ForColNom, T01EP25_A483ForColNum, T01EP25_A831TipColCod, T01EP25_A3689ComForLin
            }
            , new Object[] {
            T01EP26_A396EmprCod, T01EP26_A252CliCod, T01EP26_A494ForSer, T01EP26_A482ForColNom, T01EP26_A483ForColNum, T01EP26_A831TipColCod, T01EP26_A1519RecCorLin
            }
            , new Object[] {
            T01EP27_A396EmprCod, T01EP27_A252CliCod, T01EP27_A494ForSer, T01EP27_A482ForColNom, T01EP27_A483ForColNum, T01EP27_A831TipColCod, T01EP27_A1160ProForL
            }
            , new Object[] {
            T01EP28_A396EmprCod, T01EP28_A910Workstat, T01EP28_A880EscLin
            }
            , new Object[] {
            T01EP29_A396EmprCod, T01EP29_A252CliCod, T01EP29_A494ForSer, T01EP29_A482ForColNom, T01EP29_A483ForColNum, T01EP29_A831TipColCod, T01EP29_A650ObsLin
            }
            , new Object[] {
            T01EP30_A396EmprCod, T01EP30_A252CliCod, T01EP30_A494ForSer, T01EP30_A482ForColNom, T01EP30_A483ForColNum, T01EP30_A831TipColCod
            }
            , new Object[] {
            T01EP31_A494ForSer, T01EP31_A482ForColNom, T01EP31_A483ForColNum, T01EP31_A831TipColCod, T01EP31_A6038Mq_Desc, T01EP31_n6038Mq_Desc, T01EP31_A6186Mq_Prog, T01EP31_n6186Mq_Prog, T01EP31_A6267Mq_Prog2, T01EP31_n6267Mq_Prog2,
            T01EP31_A6268Mq_Prog3, T01EP31_n6268Mq_Prog3, T01EP31_A396EmprCod, T01EP31_A6037Mq_Grupo, T01EP31_A252CliCod
            }
            , new Object[] {
            T01EP32_A6038Mq_Desc, T01EP32_n6038Mq_Desc
            }
            , new Object[] {
            T01EP33_A396EmprCod, T01EP33_A252CliCod, T01EP33_A494ForSer, T01EP33_A482ForColNom, T01EP33_A483ForColNum, T01EP33_A831TipColCod, T01EP33_A6037Mq_Grupo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EP37_A6038Mq_Desc, T01EP37_n6038Mq_Desc
            }
            , new Object[] {
            T01EP38_A396EmprCod, T01EP38_A252CliCod, T01EP38_A494ForSer, T01EP38_A482ForColNom, T01EP38_A483ForColNum, T01EP38_A831TipColCod, T01EP38_A6037Mq_Grupo
            }
            , new Object[] {
            T01EP39_A407EmprNom, T01EP39_n407EmprNom
            }
            , new Object[] {
            T01EP40_A396EmprCod
            }
            , new Object[] {
            T01EP41_A396EmprCod
            }
         }
      );
      Z831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      Z483ForColNum = 0 ;
      n483ForColNum = false ;
      A483ForColNum = 0 ;
      n483ForColNum = false ;
      Z482ForColNom = "" ;
      n482ForColNom = false ;
      A482ForColNom = "" ;
      n482ForColNom = false ;
      Z494ForSer = "" ;
      n494ForSer = false ;
      A494ForSer = "" ;
      n494ForSer = false ;
      Z252CliCod = 0 ;
      n252CliCod = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA831TipColCod ;
   private byte Z831TipColCod ;
   private byte Z6037Mq_Grupo ;
   private byte GxWebError ;
   private byte A6037Mq_Grupo ;
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
   private short nRcdDeleted_1550 ;
   private short nRcdExists_1550 ;
   private short nIsMod_1550 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1550 ;
   private short RcdFound1550 ;
   private short nBlankRcdUsr1550 ;
   private short RcdFound47 ;
   private short nIsDirty_47 ;
   private short nIsDirty_1550 ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z6186Mq_Prog ;
   private int Z6267Mq_Prog2 ;
   private int Z6268Mq_Prog3 ;
   private int A6186Mq_Prog ;
   private int A6267Mq_Prog2 ;
   private int A6268Mq_Prog3 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1550_Enabled ;
   private int edtMq_Grupo_Enabled ;
   private int edtMq_Desc_Enabled ;
   private int edtMq_Prog_Enabled ;
   private int edtMq_ProgD1_Enabled ;
   private int edtMq_Prog2_Enabled ;
   private int edtMq_ProgD2_Enabled ;
   private int edtMq_Prog3_Enabled ;
   private int edtMq_ProgD3_Enabled ;
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
   private int defedtMq_Grupo_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1550 ;
   private String edtavnRcdDeleted_1550_Internalname ;
   private String edtMq_Grupo_Internalname ;
   private String edtMq_Desc_Internalname ;
   private String edtMq_Prog_Internalname ;
   private String edtMq_ProgD1_Internalname ;
   private String edtMq_Prog2_Internalname ;
   private String edtMq_ProgD2_Internalname ;
   private String edtMq_Prog3_Internalname ;
   private String edtMq_ProgD3_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode47 ;
   private String GXCCtl ;
   private String A6038Mq_Desc ;
   private String A6304Mq_ProgD1 ;
   private String A6305Mq_ProgD2 ;
   private String A6306Mq_ProgD3 ;
   private String Z407EmprNom ;
   private String Z6038Mq_Desc ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1550_Jsonclick ;
   private String edtMq_Grupo_Jsonclick ;
   private String edtMq_Desc_Jsonclick ;
   private String edtMq_Prog_Jsonclick ;
   private String edtMq_ProgD1_Jsonclick ;
   private String edtMq_Prog2_Jsonclick ;
   private String edtMq_ProgD2_Jsonclick ;
   private String edtMq_Prog3_Jsonclick ;
   private String edtMq_ProgD3_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ407EmprNom ;
   private String Z6304Mq_ProgD1 ;
   private String Z6305Mq_ProgD2 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z6306Mq_ProgD3 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6186Mq_Prog ;
   private boolean n6267Mq_Prog2 ;
   private boolean n6268Mq_Prog3 ;
   private boolean n252CliCod ;
   private boolean n494ForSer ;
   private boolean n482ForColNom ;
   private boolean n483ForColNum ;
   private boolean n831TipColCod ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n6038Mq_Desc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01EP7_A407EmprNom ;
   private boolean[] T01EP7_n407EmprNom ;
   private String[] T01EP8_A396EmprCod ;
   private String[] T01EP9_A396EmprCod ;
   private String[] T01EP10_A494ForSer ;
   private boolean[] T01EP10_n494ForSer ;
   private String[] T01EP10_A482ForColNom ;
   private boolean[] T01EP10_n482ForColNom ;
   private int[] T01EP10_A483ForColNum ;
   private boolean[] T01EP10_n483ForColNum ;
   private String[] T01EP10_A407EmprNom ;
   private boolean[] T01EP10_n407EmprNom ;
   private String[] T01EP10_A396EmprCod ;
   private int[] T01EP10_A252CliCod ;
   private boolean[] T01EP10_n252CliCod ;
   private byte[] T01EP10_A831TipColCod ;
   private boolean[] T01EP10_n831TipColCod ;
   private String[] T01EP11_A396EmprCod ;
   private int[] T01EP11_A252CliCod ;
   private boolean[] T01EP11_n252CliCod ;
   private String[] T01EP11_A494ForSer ;
   private boolean[] T01EP11_n494ForSer ;
   private String[] T01EP11_A482ForColNom ;
   private boolean[] T01EP11_n482ForColNom ;
   private int[] T01EP11_A483ForColNum ;
   private boolean[] T01EP11_n483ForColNum ;
   private byte[] T01EP11_A831TipColCod ;
   private boolean[] T01EP11_n831TipColCod ;
   private String[] T01EP6_A494ForSer ;
   private boolean[] T01EP6_n494ForSer ;
   private String[] T01EP6_A482ForColNom ;
   private boolean[] T01EP6_n482ForColNom ;
   private int[] T01EP6_A483ForColNum ;
   private boolean[] T01EP6_n483ForColNum ;
   private String[] T01EP6_A396EmprCod ;
   private int[] T01EP6_A252CliCod ;
   private boolean[] T01EP6_n252CliCod ;
   private byte[] T01EP6_A831TipColCod ;
   private boolean[] T01EP6_n831TipColCod ;
   private String[] T01EP12_A396EmprCod ;
   private int[] T01EP12_A252CliCod ;
   private boolean[] T01EP12_n252CliCod ;
   private String[] T01EP12_A494ForSer ;
   private boolean[] T01EP12_n494ForSer ;
   private String[] T01EP12_A482ForColNom ;
   private boolean[] T01EP12_n482ForColNom ;
   private int[] T01EP12_A483ForColNum ;
   private boolean[] T01EP12_n483ForColNum ;
   private byte[] T01EP12_A831TipColCod ;
   private boolean[] T01EP12_n831TipColCod ;
   private String[] T01EP13_A396EmprCod ;
   private int[] T01EP13_A252CliCod ;
   private boolean[] T01EP13_n252CliCod ;
   private String[] T01EP13_A494ForSer ;
   private boolean[] T01EP13_n494ForSer ;
   private String[] T01EP13_A482ForColNom ;
   private boolean[] T01EP13_n482ForColNom ;
   private int[] T01EP13_A483ForColNum ;
   private boolean[] T01EP13_n483ForColNum ;
   private byte[] T01EP13_A831TipColCod ;
   private boolean[] T01EP13_n831TipColCod ;
   private String[] T01EP5_A494ForSer ;
   private boolean[] T01EP5_n494ForSer ;
   private String[] T01EP5_A482ForColNom ;
   private boolean[] T01EP5_n482ForColNom ;
   private int[] T01EP5_A483ForColNum ;
   private boolean[] T01EP5_n483ForColNum ;
   private String[] T01EP5_A396EmprCod ;
   private int[] T01EP5_A252CliCod ;
   private boolean[] T01EP5_n252CliCod ;
   private byte[] T01EP5_A831TipColCod ;
   private boolean[] T01EP5_n831TipColCod ;
   private String[] T01EP16_A396EmprCod ;
   private int[] T01EP16_A252CliCod ;
   private boolean[] T01EP16_n252CliCod ;
   private String[] T01EP16_A494ForSer ;
   private boolean[] T01EP16_n494ForSer ;
   private String[] T01EP16_A482ForColNom ;
   private boolean[] T01EP16_n482ForColNom ;
   private int[] T01EP16_A483ForColNum ;
   private boolean[] T01EP16_n483ForColNum ;
   private byte[] T01EP16_A831TipColCod ;
   private boolean[] T01EP16_n831TipColCod ;
   private String[] T01EP16_A13377ForNormaID ;
   private String[] T01EP17_A396EmprCod ;
   private int[] T01EP17_A252CliCod ;
   private boolean[] T01EP17_n252CliCod ;
   private String[] T01EP17_A494ForSer ;
   private boolean[] T01EP17_n494ForSer ;
   private String[] T01EP17_A482ForColNom ;
   private boolean[] T01EP17_n482ForColNom ;
   private int[] T01EP17_A483ForColNum ;
   private boolean[] T01EP17_n483ForColNum ;
   private byte[] T01EP17_A831TipColCod ;
   private boolean[] T01EP17_n831TipColCod ;
   private String[] T01EP17_A3571EnsCod ;
   private String[] T01EP18_A396EmprCod ;
   private int[] T01EP18_A252CliCod ;
   private boolean[] T01EP18_n252CliCod ;
   private String[] T01EP18_A494ForSer ;
   private boolean[] T01EP18_n494ForSer ;
   private String[] T01EP18_A482ForColNom ;
   private boolean[] T01EP18_n482ForColNom ;
   private int[] T01EP18_A483ForColNum ;
   private boolean[] T01EP18_n483ForColNum ;
   private byte[] T01EP18_A831TipColCod ;
   private boolean[] T01EP18_n831TipColCod ;
   private String[] T01EP18_A7270Procod_c ;
   private int[] T01EP18_A7272CliCod_d ;
   private String[] T01EP19_A396EmprCod ;
   private int[] T01EP19_A252CliCod ;
   private boolean[] T01EP19_n252CliCod ;
   private String[] T01EP19_A494ForSer ;
   private boolean[] T01EP19_n494ForSer ;
   private String[] T01EP19_A482ForColNom ;
   private boolean[] T01EP19_n482ForColNom ;
   private int[] T01EP19_A483ForColNum ;
   private boolean[] T01EP19_n483ForColNum ;
   private byte[] T01EP19_A831TipColCod ;
   private boolean[] T01EP19_n831TipColCod ;
   private String[] T01EP19_A6525ColAqP ;
   private String[] T01EP20_A396EmprCod ;
   private int[] T01EP20_A252CliCod ;
   private boolean[] T01EP20_n252CliCod ;
   private String[] T01EP20_A494ForSer ;
   private boolean[] T01EP20_n494ForSer ;
   private String[] T01EP20_A482ForColNom ;
   private boolean[] T01EP20_n482ForColNom ;
   private int[] T01EP20_A483ForColNum ;
   private boolean[] T01EP20_n483ForColNum ;
   private byte[] T01EP20_A831TipColCod ;
   private boolean[] T01EP20_n831TipColCod ;
   private String[] T01EP20_A7262CACPP ;
   private String[] T01EP21_A396EmprCod ;
   private int[] T01EP21_A252CliCod ;
   private boolean[] T01EP21_n252CliCod ;
   private String[] T01EP21_A494ForSer ;
   private boolean[] T01EP21_n494ForSer ;
   private String[] T01EP21_A482ForColNom ;
   private boolean[] T01EP21_n482ForColNom ;
   private int[] T01EP21_A483ForColNum ;
   private boolean[] T01EP21_n483ForColNum ;
   private byte[] T01EP21_A831TipColCod ;
   private boolean[] T01EP21_n831TipColCod ;
   private String[] T01EP21_A853For_ProC ;
   private String[] T01EP22_A396EmprCod ;
   private int[] T01EP22_A252CliCod ;
   private boolean[] T01EP22_n252CliCod ;
   private String[] T01EP22_A494ForSer ;
   private boolean[] T01EP22_n494ForSer ;
   private String[] T01EP22_A482ForColNom ;
   private boolean[] T01EP22_n482ForColNom ;
   private int[] T01EP22_A483ForColNum ;
   private boolean[] T01EP22_n483ForColNum ;
   private byte[] T01EP22_A831TipColCod ;
   private boolean[] T01EP22_n831TipColCod ;
   private String[] T01EP22_A9766ForProC ;
   private String[] T01EP23_A396EmprCod ;
   private int[] T01EP23_A252CliCod ;
   private boolean[] T01EP23_n252CliCod ;
   private String[] T01EP23_A494ForSer ;
   private boolean[] T01EP23_n494ForSer ;
   private String[] T01EP23_A482ForColNom ;
   private boolean[] T01EP23_n482ForColNom ;
   private int[] T01EP23_A483ForColNum ;
   private boolean[] T01EP23_n483ForColNum ;
   private byte[] T01EP23_A831TipColCod ;
   private boolean[] T01EP23_n831TipColCod ;
   private short[] T01EP23_A7797Sim_lin ;
   private String[] T01EP24_A396EmprCod ;
   private int[] T01EP24_A252CliCod ;
   private boolean[] T01EP24_n252CliCod ;
   private String[] T01EP24_A494ForSer ;
   private boolean[] T01EP24_n494ForSer ;
   private String[] T01EP24_A482ForColNom ;
   private boolean[] T01EP24_n482ForColNom ;
   private int[] T01EP24_A483ForColNum ;
   private boolean[] T01EP24_n483ForColNum ;
   private byte[] T01EP24_A831TipColCod ;
   private boolean[] T01EP24_n831TipColCod ;
   private String[] T01EP24_A7094Acab_Ter ;
   private String[] T01EP25_A396EmprCod ;
   private int[] T01EP25_A252CliCod ;
   private boolean[] T01EP25_n252CliCod ;
   private String[] T01EP25_A494ForSer ;
   private boolean[] T01EP25_n494ForSer ;
   private String[] T01EP25_A482ForColNom ;
   private boolean[] T01EP25_n482ForColNom ;
   private int[] T01EP25_A483ForColNum ;
   private boolean[] T01EP25_n483ForColNum ;
   private byte[] T01EP25_A831TipColCod ;
   private boolean[] T01EP25_n831TipColCod ;
   private short[] T01EP25_A3689ComForLin ;
   private String[] T01EP26_A396EmprCod ;
   private int[] T01EP26_A252CliCod ;
   private boolean[] T01EP26_n252CliCod ;
   private String[] T01EP26_A494ForSer ;
   private boolean[] T01EP26_n494ForSer ;
   private String[] T01EP26_A482ForColNom ;
   private boolean[] T01EP26_n482ForColNom ;
   private int[] T01EP26_A483ForColNum ;
   private boolean[] T01EP26_n483ForColNum ;
   private byte[] T01EP26_A831TipColCod ;
   private boolean[] T01EP26_n831TipColCod ;
   private byte[] T01EP26_A1519RecCorLin ;
   private String[] T01EP27_A396EmprCod ;
   private int[] T01EP27_A252CliCod ;
   private boolean[] T01EP27_n252CliCod ;
   private String[] T01EP27_A494ForSer ;
   private boolean[] T01EP27_n494ForSer ;
   private String[] T01EP27_A482ForColNom ;
   private boolean[] T01EP27_n482ForColNom ;
   private int[] T01EP27_A483ForColNum ;
   private boolean[] T01EP27_n483ForColNum ;
   private byte[] T01EP27_A831TipColCod ;
   private boolean[] T01EP27_n831TipColCod ;
   private short[] T01EP27_A1160ProForL ;
   private String[] T01EP28_A396EmprCod ;
   private String[] T01EP28_A910Workstat ;
   private short[] T01EP28_A880EscLin ;
   private String[] T01EP29_A396EmprCod ;
   private int[] T01EP29_A252CliCod ;
   private boolean[] T01EP29_n252CliCod ;
   private String[] T01EP29_A494ForSer ;
   private boolean[] T01EP29_n494ForSer ;
   private String[] T01EP29_A482ForColNom ;
   private boolean[] T01EP29_n482ForColNom ;
   private int[] T01EP29_A483ForColNum ;
   private boolean[] T01EP29_n483ForColNum ;
   private byte[] T01EP29_A831TipColCod ;
   private boolean[] T01EP29_n831TipColCod ;
   private short[] T01EP29_A650ObsLin ;
   private String[] T01EP30_A396EmprCod ;
   private int[] T01EP30_A252CliCod ;
   private boolean[] T01EP30_n252CliCod ;
   private String[] T01EP30_A494ForSer ;
   private boolean[] T01EP30_n494ForSer ;
   private String[] T01EP30_A482ForColNom ;
   private boolean[] T01EP30_n482ForColNom ;
   private int[] T01EP30_A483ForColNum ;
   private boolean[] T01EP30_n483ForColNum ;
   private byte[] T01EP30_A831TipColCod ;
   private boolean[] T01EP30_n831TipColCod ;
   private String[] T01EP31_A494ForSer ;
   private boolean[] T01EP31_n494ForSer ;
   private String[] T01EP31_A482ForColNom ;
   private boolean[] T01EP31_n482ForColNom ;
   private int[] T01EP31_A483ForColNum ;
   private boolean[] T01EP31_n483ForColNum ;
   private byte[] T01EP31_A831TipColCod ;
   private boolean[] T01EP31_n831TipColCod ;
   private String[] T01EP31_A6038Mq_Desc ;
   private boolean[] T01EP31_n6038Mq_Desc ;
   private int[] T01EP31_A6186Mq_Prog ;
   private boolean[] T01EP31_n6186Mq_Prog ;
   private int[] T01EP31_A6267Mq_Prog2 ;
   private boolean[] T01EP31_n6267Mq_Prog2 ;
   private int[] T01EP31_A6268Mq_Prog3 ;
   private boolean[] T01EP31_n6268Mq_Prog3 ;
   private String[] T01EP31_A396EmprCod ;
   private byte[] T01EP31_A6037Mq_Grupo ;
   private int[] T01EP31_A252CliCod ;
   private boolean[] T01EP31_n252CliCod ;
   private String[] T01EP4_A6038Mq_Desc ;
   private boolean[] T01EP4_n6038Mq_Desc ;
   private String[] T01EP32_A6038Mq_Desc ;
   private boolean[] T01EP32_n6038Mq_Desc ;
   private String[] T01EP33_A396EmprCod ;
   private int[] T01EP33_A252CliCod ;
   private boolean[] T01EP33_n252CliCod ;
   private String[] T01EP33_A494ForSer ;
   private boolean[] T01EP33_n494ForSer ;
   private String[] T01EP33_A482ForColNom ;
   private boolean[] T01EP33_n482ForColNom ;
   private int[] T01EP33_A483ForColNum ;
   private boolean[] T01EP33_n483ForColNum ;
   private byte[] T01EP33_A831TipColCod ;
   private boolean[] T01EP33_n831TipColCod ;
   private byte[] T01EP33_A6037Mq_Grupo ;
   private String[] T01EP3_A494ForSer ;
   private boolean[] T01EP3_n494ForSer ;
   private String[] T01EP3_A482ForColNom ;
   private boolean[] T01EP3_n482ForColNom ;
   private int[] T01EP3_A483ForColNum ;
   private boolean[] T01EP3_n483ForColNum ;
   private byte[] T01EP3_A831TipColCod ;
   private boolean[] T01EP3_n831TipColCod ;
   private int[] T01EP3_A6186Mq_Prog ;
   private boolean[] T01EP3_n6186Mq_Prog ;
   private int[] T01EP3_A6267Mq_Prog2 ;
   private boolean[] T01EP3_n6267Mq_Prog2 ;
   private int[] T01EP3_A6268Mq_Prog3 ;
   private boolean[] T01EP3_n6268Mq_Prog3 ;
   private String[] T01EP3_A396EmprCod ;
   private byte[] T01EP3_A6037Mq_Grupo ;
   private int[] T01EP3_A252CliCod ;
   private boolean[] T01EP3_n252CliCod ;
   private String[] T01EP2_A494ForSer ;
   private boolean[] T01EP2_n494ForSer ;
   private String[] T01EP2_A482ForColNom ;
   private boolean[] T01EP2_n482ForColNom ;
   private int[] T01EP2_A483ForColNum ;
   private boolean[] T01EP2_n483ForColNum ;
   private byte[] T01EP2_A831TipColCod ;
   private boolean[] T01EP2_n831TipColCod ;
   private int[] T01EP2_A6186Mq_Prog ;
   private boolean[] T01EP2_n6186Mq_Prog ;
   private int[] T01EP2_A6267Mq_Prog2 ;
   private boolean[] T01EP2_n6267Mq_Prog2 ;
   private int[] T01EP2_A6268Mq_Prog3 ;
   private boolean[] T01EP2_n6268Mq_Prog3 ;
   private String[] T01EP2_A396EmprCod ;
   private byte[] T01EP2_A6037Mq_Grupo ;
   private int[] T01EP2_A252CliCod ;
   private boolean[] T01EP2_n252CliCod ;
   private String[] T01EP37_A6038Mq_Desc ;
   private boolean[] T01EP37_n6038Mq_Desc ;
   private String[] T01EP38_A396EmprCod ;
   private int[] T01EP38_A252CliCod ;
   private boolean[] T01EP38_n252CliCod ;
   private String[] T01EP38_A494ForSer ;
   private boolean[] T01EP38_n494ForSer ;
   private String[] T01EP38_A482ForColNom ;
   private boolean[] T01EP38_n482ForColNom ;
   private int[] T01EP38_A483ForColNum ;
   private boolean[] T01EP38_n483ForColNum ;
   private byte[] T01EP38_A831TipColCod ;
   private boolean[] T01EP38_n831TipColCod ;
   private byte[] T01EP38_A6037Mq_Grupo ;
   private String[] T01EP39_A407EmprNom ;
   private boolean[] T01EP39_n407EmprNom ;
   private String[] T01EP40_A396EmprCod ;
   private String[] T01EP41_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tformqp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tformqp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tformqp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tformqp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tformqp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EP2", "SELECT ForSer, ForColNom, ForColNum, TipColCod, Mq_Prog, Mq_Prog2, Mq_Prog3, EmprCod, Mq_Grupo, CliCod FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Mq_Grupo = ?  FOR UPDATE OF Mq_Prog, Mq_Prog2, Mq_Prog3 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EP3", "SELECT ForSer, ForColNom, ForColNum, TipColCod, Mq_Prog, Mq_Prog2, Mq_Prog3, EmprCod, Mq_Grupo, CliCod FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EP4", "SELECT Mq_Desc FROM TXPMAQGRP WHERE EmprCod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP5", "SELECT ForSer, ForColNom, ForColNum, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?  FOR UPDATE OF ForSer NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP6", "SELECT ForSer, ForColNom, ForColNum, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP8", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP9", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP10", "SELECT /*+ FIRST_ROWS(1) */ TM1.ForSer, TM1.ForColNom, TM1.ForColNum, T2.EmprNom, TM1.EmprCod, TM1.CliCod, TM1.TipColCod FROM (TXPCFORMU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EP14", "INSERT INTO TXPCFORMU(ForSer, ForColNom, ForColNum, EmprCod, CliCod, TipColCod, ForNumCol, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, ComUltLin, MacProCod, ForCosUti, ForRGB, ForCosForm, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForcosH20, ForCosFab, ForCosFin, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForObsFac, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T01EP15", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new ForEachCursor("T01EP16", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNormaID FROM TXPFORNOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP17", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod FROM TXPENSCAB WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP18", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP19", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ColAqP FROM TXPPCOLAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP20", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP21", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC FROM TXPTAB000 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP22", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP23", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP24", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP25", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP26", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP27", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP28", "SELECT * FROM (SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP29", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP30", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EP31", "SELECT T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T2.Mq_Desc, T1.Mq_Prog, T1.Mq_Prog2, T1.Mq_Prog3, T1.EmprCod, T1.Mq_Grupo, T1.CliCod FROM (TXPFORMQP T1 INNER JOIN TXPMAQGRP T2 ON T2.EmprCod = T1.EmprCod AND T2.Mq_Grupo = T1.Mq_Grupo) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? and T1.Mq_Grupo = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.Mq_Grupo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EP32", "SELECT Mq_Desc FROM TXPMAQGRP WHERE EmprCod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EP33", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01EP34", "INSERT INTO TXPFORMQP(ForSer, ForColNom, ForColNum, TipColCod, Mq_Prog, Mq_Prog2, Mq_Prog3, EmprCod, Mq_Grupo, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFORMQP")
         ,new UpdateCursor("T01EP35", "UPDATE TXPFORMQP SET Mq_Prog=?, Mq_Prog2=?, Mq_Prog3=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Mq_Grupo = ?", GX_NOMASK, "TXPFORMQP")
         ,new UpdateCursor("T01EP36", "DELETE FROM TXPFORMQP  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Mq_Grupo = ?", GX_NOMASK, "TXPFORMQP")
         ,new ForEachCursor("T01EP37", "SELECT Mq_Desc FROM TXPMAQGRP WHERE EmprCod = ? AND Mq_Grupo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EP38", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EP39", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EP40", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EP41", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 39 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setByte(7, ((Number) parms[11]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setByte(7, ((Number) parms[11]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
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
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setByte(7, ((Number) parms[11]).byteValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setByte(7, ((Number) parms[11]).byteValue());
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setByte(9, ((Number) parms[15]).byteValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               stmt.setByte(10, ((Number) parms[17]).byteValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setByte(7, ((Number) parms[11]).byteValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
      }
   }

}

