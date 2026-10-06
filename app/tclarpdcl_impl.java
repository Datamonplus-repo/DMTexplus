package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclarpdcl_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"FORPROD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9766ForProC = httpContext.GetPar( "ForProC") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaforprod1741280( A396EmprCod, A9766ForProC) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO CLIENTE-ART-COL-PROCESO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtForSerDsc_Internalname ;
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

   public tclarpdcl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclarpdcl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclarpdcl_impl.class ));
   }

   public tclarpdcl_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCLARPDCL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtForSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPDCL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPDCL.htm");
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
         nBlankRcdCount1280 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1280 = (short)(1) ;
            scanStart1741280( ) ;
            while ( RcdFound1280 != 0 )
            {
               init_level_properties1280( ) ;
               getByPrimaryKey1741280( ) ;
               addRow1741280( ) ;
               scanNext1741280( ) ;
            }
            scanEnd1741280( ) ;
            nBlankRcdCount1280 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1741280( ) ;
         standaloneModal1741280( ) ;
         sMode1280 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow1741280( ) ;
            edtavnRcdDeleted_1280_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1280_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1280_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1280_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtForProC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtForProD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProD_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtForProPK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROPK_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProPK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProPK_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtForProPM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROPM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProPM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtForProFe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFE_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProFe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFe_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtFacLam_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACLAM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacLam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLam_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtForProMc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROMC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProMc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProMc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1280 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1741280( ) ;
            }
            sendRow1741280( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1280 = (short)(5) ;
         nRcdExists_1280 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1741280( ) ;
            while ( RcdFound1280 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701280( ) ;
               init_level_properties1280( ) ;
               standaloneNotModal1741280( ) ;
               getByPrimaryKey1741280( ) ;
               standaloneModal1741280( ) ;
               addRow1741280( ) ;
               scanNext1741280( ) ;
            }
            scanEnd1741280( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1280 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701280( ) ;
      initAll1741280( ) ;
      init_level_properties1280( ) ;
      nRcdExists_1280 = (short)(0) ;
      nIsMod_1280 = (short)(0) ;
      nRcdDeleted_1280 = (short)(0) ;
      nBlankRcdCount1280 = (short)(nBlankRcdUsr1280+nBlankRcdCount1280) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1280 > 0 )
      {
         standaloneNotModal1741280( ) ;
         standaloneModal1741280( ) ;
         addRow1741280( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtForProC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1280 = (short)(nBlankRcdCount1280-1) ;
      }
      Gx_mode = sMode1280 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPDCL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCLARPDCL.htm");
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
         Z5742ForSerDsc = httpContext.cgiGet( "Z5742ForSerDsc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
         n494ForSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
         n5742ForSerDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
         n482ForColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n483ForColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
         n832TipColDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
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
            initAll17447( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1280_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1280_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributes17447( ) ;
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

   public void confirm_1740( )
   {
      beforeValidate17447( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17447( ) ;
         }
         else
         {
            checkExtendedTable17447( ) ;
            if ( AnyError == 0 )
            {
               zm17447( 3) ;
               zm17447( 4) ;
               zm17447( 5) ;
            }
            closeExtendedTableCursors17447( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode47 = Gx_mode ;
         confirm_1741280( ) ;
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
         confirmValues1740( ) ;
      }
   }

   public void confirm_1741280( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1741280( ) ;
         if ( ( nRcdExists_1280 != 0 ) || ( nIsMod_1280 != 0 ) )
         {
            getKey1741280( ) ;
            if ( ( nRcdExists_1280 == 0 ) && ( nRcdDeleted_1280 == 0 ) )
            {
               if ( RcdFound1280 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1741280( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1741280( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1741280( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FORPROC_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtForProC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1280 != 0 )
               {
                  if ( nRcdDeleted_1280 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1741280( ) ;
                     load1741280( ) ;
                     beforeValidate1741280( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1741280( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1280 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1741280( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1741280( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1741280( ) ;
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
                  if ( nRcdDeleted_1280 == 0 )
                  {
                     GXCCtl = "FORPROC_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForProC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1280_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProC_Internalname, GXutil.rtrim( A9766ForProC)) ;
         httpContext.changePostValue( edtForProD_Internalname, GXutil.rtrim( A9767ForProD)) ;
         httpContext.changePostValue( edtForProPK_Internalname, GXutil.ltrim( localUtil.ntoc( A9768ForProPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProPM_Internalname, GXutil.ltrim( localUtil.ntoc( A9769ForProPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProFe_Internalname, localUtil.format(A9770ForProFe, "99/99/99")) ;
         httpContext.changePostValue( edtFacLam_Internalname, GXutil.rtrim( A10137FacLam)) ;
         httpContext.changePostValue( edtForProMc_Internalname, GXutil.ltrim( localUtil.ntoc( A10389ForProMc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9766ForProC_"+sGXsfl_70_idx, GXutil.rtrim( Z9766ForProC)) ;
         httpContext.changePostValue( "ZT_"+"Z9768ForProPK_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z9768ForProPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9769ForProPM_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z9769ForProPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9770ForProFe_"+sGXsfl_70_idx, localUtil.dtoc( Z9770ForProFe, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10137FacLam_"+sGXsfl_70_idx, GXutil.rtrim( Z10137FacLam)) ;
         httpContext.changePostValue( "ZT_"+"Z10389ForProMc_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10389ForProMc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1280_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1280_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1280_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1280 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1280_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1280_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROPK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProPK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROPM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProPM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACLAM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLam_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROMC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1740( )
   {
   }

   public void zm17447( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5742ForSerDsc = T01745_A5742ForSerDsc[0] ;
         }
         else
         {
            Z5742ForSerDsc = A5742ForSerDsc ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z5742ForSerDsc = A5742ForSerDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z832TipColDsc = A832TipColDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01746 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01746_A407EmprNom[0] ;
      n407EmprNom = T01746_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01747 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01747_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01748 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01748_A832TipColDsc[0] ;
      n832TipColDsc = T01748_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(6);
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

   public void load17447( )
   {
      /* Using cursor T01749 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A407EmprNom = T01749_A407EmprNom[0] ;
         n407EmprNom = T01749_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01749_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5742ForSerDsc = T01749_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01749_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A832TipColDsc = T01749_A832TipColDsc[0] ;
         n832TipColDsc = T01749_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         zm17447( -2) ;
      }
      pr_default.close(7);
      onLoadActions17447( ) ;
   }

   public void onLoadActions17447( )
   {
   }

   public void checkExtendedTable17447( )
   {
      nIsDirty_47 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17447( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17447( )
   {
      /* Using cursor T017410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01745 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01745_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01745_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01745_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01745_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01745_A252CliCod[0] == A252CliCod ) && ( T01745_A831TipColCod[0] == A831TipColCod ) )
      {
         zm17447( 2) ;
         RcdFound47 = (short)(1) ;
         A5742ForSerDsc = T01745_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01745_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
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
         load17447( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKey17447( ) ;
         }
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey17447( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey17447( ) ;
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
      /* Using cursor T017411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017411_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017411_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017411_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017411_A483ForColNum[0] == A483ForColNum ) && ( T017411_A831TipColCod[0] == A831TipColCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017411_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017411_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017411_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017411_A483ForColNum[0] == A483ForColNum ) && ( T017411_A831TipColCod[0] == A831TipColCod ) )
         {
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T017412 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T017412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017412_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017412_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017412_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017412_A483ForColNum[0] == A483ForColNum ) && ( T017412_A831TipColCod[0] == A831TipColCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T017412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017412_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017412_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017412_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017412_A483ForColNum[0] == A483ForColNum ) && ( T017412_A831TipColCod[0] == A831TipColCod ) )
         {
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17447( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtForSerDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17447( ) ;
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
               GX_FocusControl = edtForSerDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17447( ) ;
               GX_FocusControl = edtForSerDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtForSerDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17447( ) ;
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
                  GX_FocusControl = edtForSerDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17447( ) ;
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
         GX_FocusControl = edtForSerDsc_Internalname ;
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
      getKey17447( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tclarpdcl");
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1740( ) ;
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
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17447( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17447( ) ;
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
      GX_FocusControl = edtForSerDsc_Internalname ;
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
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForSerDsc_Internalname ;
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
      scanStart17447( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound47 != 0 )
         {
            scanNext17447( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17447( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17447( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01744 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z5742ForSerDsc, T01744_A5742ForSerDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5742ForSerDsc, T01744_A5742ForSerDsc[0]) != 0 )
            {
               GXutil.writeLogln("tclarpdcl:[seudo value changed for attri]"+"ForSerDsc");
               GXutil.writeLogRaw("Old: ",Z5742ForSerDsc);
               GXutil.writeLogRaw("Current: ",T01744_A5742ForSerDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17447( )
   {
      beforeValidate17447( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17447( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17447( 0) ;
         checkOptimisticConcurrency17447( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17447( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17447( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017413 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
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
                        processLevel17447( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1740( ) ;
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
            load17447( ) ;
         }
         endLevel17447( ) ;
      }
      closeExtendedTableCursors17447( ) ;
   }

   public void update17447( )
   {
      beforeValidate17447( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17447( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17447( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17447( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17447( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017414 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17447( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel17447( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1740( ) ;
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
         endLevel17447( ) ;
      }
      closeExtendedTableCursors17447( ) ;
   }

   public void deferredUpdate17447( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17447( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17447( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17447( ) ;
         afterConfirm17447( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17447( ) ;
            if ( AnyError == 0 )
            {
               scanStart1741280( ) ;
               while ( RcdFound1280 != 0 )
               {
                  getByPrimaryKey1741280( ) ;
                  delete1741280( ) ;
                  scanNext1741280( ) ;
               }
               scanEnd1741280( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017415 */
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
                           initAll17447( ) ;
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
                        resetCaption1740( ) ;
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
      endLevel17447( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17447( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T017416 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T017417 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CABECERA ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T017418 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOPCD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T017419 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T017420 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCACP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T017421 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORMQPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T017422 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T017423 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FPCC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T017424 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T017425 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T017426 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T017427 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T017428 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T017429 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T017430 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOBFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void processNestedLevel1741280( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1741280( ) ;
         if ( ( nRcdExists_1280 != 0 ) || ( nIsMod_1280 != 0 ) )
         {
            standaloneNotModal1741280( ) ;
            getKey1741280( ) ;
            if ( ( nRcdExists_1280 == 0 ) && ( nRcdDeleted_1280 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1741280( ) ;
            }
            else
            {
               if ( RcdFound1280 != 0 )
               {
                  if ( ( nRcdDeleted_1280 != 0 ) && ( nRcdExists_1280 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1741280( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1280 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1741280( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1280 == 0 )
                  {
                     GXCCtl = "FORPROC_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForProC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1280_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProC_Internalname, GXutil.rtrim( A9766ForProC)) ;
         httpContext.changePostValue( edtForProD_Internalname, GXutil.rtrim( A9767ForProD)) ;
         httpContext.changePostValue( edtForProPK_Internalname, GXutil.ltrim( localUtil.ntoc( A9768ForProPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProPM_Internalname, GXutil.ltrim( localUtil.ntoc( A9769ForProPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProFe_Internalname, localUtil.format(A9770ForProFe, "99/99/99")) ;
         httpContext.changePostValue( edtFacLam_Internalname, GXutil.rtrim( A10137FacLam)) ;
         httpContext.changePostValue( edtForProMc_Internalname, GXutil.ltrim( localUtil.ntoc( A10389ForProMc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9766ForProC_"+sGXsfl_70_idx, GXutil.rtrim( Z9766ForProC)) ;
         httpContext.changePostValue( "ZT_"+"Z9768ForProPK_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z9768ForProPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9769ForProPM_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z9769ForProPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9770ForProFe_"+sGXsfl_70_idx, localUtil.dtoc( Z9770ForProFe, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z10137FacLam_"+sGXsfl_70_idx, GXutil.rtrim( Z10137FacLam)) ;
         httpContext.changePostValue( "ZT_"+"Z10389ForProMc_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10389ForProMc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1280_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1280_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1280_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1280 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1280_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1280_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROPK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProPK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROPM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProPM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACLAM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLam_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROMC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1741280( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1280 = (short)(0) ;
      nIsMod_1280 = (short)(0) ;
      nRcdDeleted_1280 = (short)(0) ;
   }

   public void processLevel17447( )
   {
      /* Save parent mode. */
      sMode47 = Gx_mode ;
      processNestedLevel1741280( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel17447( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17447( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclarpdcl");
         if ( AnyError == 0 )
         {
            confirmValues1740( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclarpdcl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17447( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A494ForSer = A494ForSer ;
      this.A482ForColNom = A482ForColNom ;
      this.A483ForColNum = A483ForColNum ;
      this.A831TipColCod = A831TipColCod ;
      /* Scan By routine */
      /* Using cursor T017431 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17447( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
   }

   public void scanEnd17447( )
   {
      pr_default.close(29);
   }

   public void afterConfirm17447( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17447( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17447( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17447( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17447( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17447( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17447( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
   }

   public void zm1741280( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9768ForProPK = T01743_A9768ForProPK[0] ;
            Z9769ForProPM = T01743_A9769ForProPM[0] ;
            Z9770ForProFe = T01743_A9770ForProFe[0] ;
            Z10137FacLam = T01743_A10137FacLam[0] ;
            Z10389ForProMc = T01743_A10389ForProMc[0] ;
         }
         else
         {
            Z9768ForProPK = A9768ForProPK ;
            Z9769ForProPM = A9769ForProPM ;
            Z9770ForProFe = A9770ForProFe ;
            Z10137FacLam = A10137FacLam ;
            Z10389ForProMc = A10389ForProMc ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z9768ForProPK = A9768ForProPK ;
         Z9769ForProPM = A9769ForProPM ;
         Z9770ForProFe = A9770ForProFe ;
         Z10137FacLam = A10137FacLam ;
         Z10389ForProMc = A10389ForProMc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1741280( )
   {
   }

   public void standaloneModal1741280( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtForProC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtForProC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void load1741280( )
   {
      /* Using cursor T017432 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1280 = (short)(1) ;
         A9768ForProPK = T017432_A9768ForProPK[0] ;
         n9768ForProPK = T017432_n9768ForProPK[0] ;
         A9769ForProPM = T017432_A9769ForProPM[0] ;
         n9769ForProPM = T017432_n9769ForProPM[0] ;
         A9770ForProFe = T017432_A9770ForProFe[0] ;
         n9770ForProFe = T017432_n9770ForProFe[0] ;
         A10137FacLam = T017432_A10137FacLam[0] ;
         n10137FacLam = T017432_n10137FacLam[0] ;
         A10389ForProMc = T017432_A10389ForProMc[0] ;
         n10389ForProMc = T017432_n10389ForProMc[0] ;
         zm1741280( -6) ;
      }
      pr_default.close(30);
      onLoadActions1741280( ) ;
   }

   public void onLoadActions1741280( )
   {
      GXt_char1 = A9767ForProD ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      tclarpdcl_impl.this.A396EmprCod = GXv_char2[0] ;
      tclarpdcl_impl.this.A9766ForProC = GXv_char3[0] ;
      tclarpdcl_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9767ForProD = GXt_char1 ;
   }

   public void checkExtendedTable1741280( )
   {
      nIsDirty_1280 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1741280( ) ;
      nIsDirty_1280 = (short)(1) ;
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclarpdcl_impl.this.A396EmprCod = GXv_char4[0] ;
      tclarpdcl_impl.this.A9766ForProC = GXv_char3[0] ;
      tclarpdcl_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9767ForProD = GXt_char1 ;
   }

   public void closeExtendedTableCursors1741280( )
   {
   }

   public void enableDisable1741280( )
   {
   }

   public void getKey1741280( )
   {
      /* Using cursor T017433 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1280 = (short)(1) ;
      }
      else
      {
         RcdFound1280 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey1741280( )
   {
      /* Using cursor T01743 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01743_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01743_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01743_A483ForColNum[0] == A483ForColNum ) && ( T01743_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01743_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01743_A252CliCod[0] == A252CliCod ) )
      {
         zm1741280( 6) ;
         RcdFound1280 = (short)(1) ;
         initializeNonKey1741280( ) ;
         A9766ForProC = T01743_A9766ForProC[0] ;
         A9768ForProPK = T01743_A9768ForProPK[0] ;
         n9768ForProPK = T01743_n9768ForProPK[0] ;
         A9769ForProPM = T01743_A9769ForProPM[0] ;
         n9769ForProPM = T01743_n9769ForProPM[0] ;
         A9770ForProFe = T01743_A9770ForProFe[0] ;
         n9770ForProFe = T01743_n9770ForProFe[0] ;
         A10137FacLam = T01743_A10137FacLam[0] ;
         n10137FacLam = T01743_n10137FacLam[0] ;
         A10389ForProMc = T01743_A10389ForProMc[0] ;
         n10389ForProMc = T01743_n10389ForProMc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         sMode1280 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1741280( ) ;
         load1741280( ) ;
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1280 = (short)(0) ;
         initializeNonKey1741280( ) ;
         sMode1280 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1741280( ) ;
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1741280( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1741280( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01742 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9768ForProPK, T01742_A9768ForProPK[0]) != 0 ) || ( DecimalUtil.compareTo(Z9769ForProPM, T01742_A9769ForProPM[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9770ForProFe), GXutil.resetTime(T01742_A9770ForProFe[0])) ) || ( GXutil.strcmp(Z10137FacLam, T01742_A10137FacLam[0]) != 0 ) || ( Z10389ForProMc != T01742_A10389ForProMc[0] ) )
         {
            if ( DecimalUtil.compareTo(Z9768ForProPK, T01742_A9768ForProPK[0]) != 0 )
            {
               GXutil.writeLogln("tclarpdcl:[seudo value changed for attri]"+"ForProPK");
               GXutil.writeLogRaw("Old: ",Z9768ForProPK);
               GXutil.writeLogRaw("Current: ",T01742_A9768ForProPK[0]);
            }
            if ( DecimalUtil.compareTo(Z9769ForProPM, T01742_A9769ForProPM[0]) != 0 )
            {
               GXutil.writeLogln("tclarpdcl:[seudo value changed for attri]"+"ForProPM");
               GXutil.writeLogRaw("Old: ",Z9769ForProPM);
               GXutil.writeLogRaw("Current: ",T01742_A9769ForProPM[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9770ForProFe), GXutil.resetTime(T01742_A9770ForProFe[0])) ) )
            {
               GXutil.writeLogln("tclarpdcl:[seudo value changed for attri]"+"ForProFe");
               GXutil.writeLogRaw("Old: ",Z9770ForProFe);
               GXutil.writeLogRaw("Current: ",T01742_A9770ForProFe[0]);
            }
            if ( GXutil.strcmp(Z10137FacLam, T01742_A10137FacLam[0]) != 0 )
            {
               GXutil.writeLogln("tclarpdcl:[seudo value changed for attri]"+"FacLam");
               GXutil.writeLogRaw("Old: ",Z10137FacLam);
               GXutil.writeLogRaw("Current: ",T01742_A10137FacLam[0]);
            }
            if ( Z10389ForProMc != T01742_A10389ForProMc[0] )
            {
               GXutil.writeLogln("tclarpdcl:[seudo value changed for attri]"+"ForProMc");
               GXutil.writeLogRaw("Old: ",Z10389ForProMc);
               GXutil.writeLogRaw("Current: ",T01742_A10389ForProMc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLARPD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1741280( )
   {
      beforeValidate1741280( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1741280( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1741280( 0) ;
         checkOptimisticConcurrency1741280( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1741280( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1741280( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017434 */
                  pr_default.execute(32, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Boolean.valueOf(n9768ForProPK), A9768ForProPK, Boolean.valueOf(n9769ForProPM), A9769ForProPM, Boolean.valueOf(n9770ForProFe), A9770ForProFe, Boolean.valueOf(n10137FacLam), A10137FacLam, Boolean.valueOf(n10389ForProMc), Byte.valueOf(A10389ForProMc), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
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
            load1741280( ) ;
         }
         endLevel1741280( ) ;
      }
      closeExtendedTableCursors1741280( ) ;
   }

   public void update1741280( )
   {
      beforeValidate1741280( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1741280( ) ;
      }
      if ( ( nIsMod_1280 != 0 ) || ( nIsDirty_1280 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1741280( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1741280( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1741280( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017435 */
                     pr_default.execute(33, new Object[] {Boolean.valueOf(n9768ForProPK), A9768ForProPK, Boolean.valueOf(n9769ForProPM), A9769ForProPM, Boolean.valueOf(n9770ForProFe), A9770ForProFe, Boolean.valueOf(n10137FacLam), A10137FacLam, Boolean.valueOf(n10389ForProMc), Byte.valueOf(A10389ForProMc), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
                     if ( (pr_default.getStatus(33) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1741280( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1741280( ) ;
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
            endLevel1741280( ) ;
         }
      }
      closeExtendedTableCursors1741280( ) ;
   }

   public void deferredUpdate1741280( )
   {
   }

   public void delete1741280( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1741280( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1741280( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1741280( ) ;
         afterConfirm1741280( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1741280( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017436 */
               pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
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
      sMode1280 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1741280( ) ;
      Gx_mode = sMode1280 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1741280( )
   {
      standaloneModal1741280( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A9767ForProD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A9766ForProC ;
         GXv_char2[0] = GXt_char1 ;
         new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tclarpdcl_impl.this.A396EmprCod = GXv_char4[0] ;
         tclarpdcl_impl.this.A9766ForProC = GXv_char3[0] ;
         tclarpdcl_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9767ForProD = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T017437 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T017438 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR0200", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T017439 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPMn", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T017440 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FPCC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
      }
   }

   public void endLevel1741280( )
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

   public void scanStart1741280( )
   {
      /* Scan By routine */
      /* Using cursor T017441 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound1280 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1280 = (short)(1) ;
         A9766ForProC = T017441_A9766ForProC[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1741280( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound1280 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1280 = (short)(1) ;
         A9766ForProC = T017441_A9766ForProC[0] ;
      }
   }

   public void scanEnd1741280( )
   {
      pr_default.close(39);
   }

   public void afterConfirm1741280( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1741280( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1741280( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1741280( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1741280( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1741280( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1741280( )
   {
      edtForProC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtForProD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProD_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtForProPK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProPK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProPK_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtForProPM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProPM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtForProFe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProFe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFe_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtFacLam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacLam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLam_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtForProMc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProMc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProMc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashes1741280( )
   {
   }

   public void send_integrity_lvl_hashes17447( )
   {
   }

   public void subsflControlProps_701280( )
   {
      edtavnRcdDeleted_1280_Internalname = "vNRCDDELETED_1280_"+sGXsfl_70_idx ;
      edtForProC_Internalname = "FORPROC_"+sGXsfl_70_idx ;
      edtForProD_Internalname = "FORPROD_"+sGXsfl_70_idx ;
      edtForProPK_Internalname = "FORPROPK_"+sGXsfl_70_idx ;
      edtForProPM_Internalname = "FORPROPM_"+sGXsfl_70_idx ;
      edtForProFe_Internalname = "FORPROFE_"+sGXsfl_70_idx ;
      edtFacLam_Internalname = "FACLAM_"+sGXsfl_70_idx ;
      edtForProMc_Internalname = "FORPROMC_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701280( )
   {
      edtavnRcdDeleted_1280_Internalname = "vNRCDDELETED_1280_"+sGXsfl_70_fel_idx ;
      edtForProC_Internalname = "FORPROC_"+sGXsfl_70_fel_idx ;
      edtForProD_Internalname = "FORPROD_"+sGXsfl_70_fel_idx ;
      edtForProPK_Internalname = "FORPROPK_"+sGXsfl_70_fel_idx ;
      edtForProPM_Internalname = "FORPROPM_"+sGXsfl_70_fel_idx ;
      edtForProFe_Internalname = "FORPROFE_"+sGXsfl_70_fel_idx ;
      edtFacLam_Internalname = "FACLAM_"+sGXsfl_70_fel_idx ;
      edtForProMc_Internalname = "FORPROMC_"+sGXsfl_70_fel_idx ;
   }

   public void addRow1741280( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701280( ) ;
      sendRow1741280( ) ;
   }

   public void sendRow1741280( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1280_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1280_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1280), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1280), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1280_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1280_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProC_Internalname,GXutil.rtrim( A9766ForProC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProC_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProD_Internalname,GXutil.rtrim( A9767ForProD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProPK_Internalname,GXutil.ltrim( localUtil.ntoc( A9768ForProPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProPK_Enabled!=0) ? localUtil.format( A9768ForProPK, "ZZZZZ9.99999") : localUtil.format( A9768ForProPK, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProPK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProPK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProPM_Internalname,GXutil.ltrim( localUtil.ntoc( A9769ForProPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProPM_Enabled!=0) ? localUtil.format( A9769ForProPM, "ZZZZZ9.99999") : localUtil.format( A9769ForProPM, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProPM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProPM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProFe_Internalname,localUtil.format(A9770ForProFe, "99/99/99"),localUtil.format( A9770ForProFe, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProFe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProFe_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacLam_Internalname,GXutil.rtrim( A10137FacLam),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacLam_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFacLam_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProMc_Internalname,GXutil.ltrim( localUtil.ntoc( A10389ForProMc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProMc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10389ForProMc), "9") : localUtil.format( DecimalUtil.doubleToDec(A10389ForProMc), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProMc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProMc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1741280( ) ;
      GXCCtl = "Z9766ForProC_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9766ForProC));
      GXCCtl = "Z9768ForProPK_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9768ForProPK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9769ForProPM_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9769ForProPM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9770ForProFe_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z9770ForProFe, 0, "/"));
      GXCCtl = "Z10137FacLam_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10137FacLam));
      GXCCtl = "Z10389ForProMc_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10389ForProMc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1280_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1280_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1280_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1280_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1280_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROD_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROPK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProPK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROPM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProPM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROFE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLAM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLam_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROMC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1741280( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701280( ) ;
      edtavnRcdDeleted_1280_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1280_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROD_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProPK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROPK_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProPM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROPM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProFe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFE_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacLam_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACLAM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProMc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROMC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1280_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1280_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1280");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1280_Internalname ;
         wbErr = true ;
         nRcdDeleted_1280 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1280 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1280_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9766ForProC = httpContext.cgiGet( edtForProC_Internalname) ;
      A9767ForProD = httpContext.cgiGet( edtForProD_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForProPK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForProPK_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORPROPK_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProPK_Internalname ;
         wbErr = true ;
         A9768ForProPK = DecimalUtil.ZERO ;
         n9768ForProPK = false ;
      }
      else
      {
         A9768ForProPK = localUtil.ctond( httpContext.cgiGet( edtForProPK_Internalname)) ;
         n9768ForProPK = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForProPM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForProPM_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORPROPM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProPM_Internalname ;
         wbErr = true ;
         A9769ForProPM = DecimalUtil.ZERO ;
         n9769ForProPM = false ;
      }
      else
      {
         A9769ForProPM = localUtil.ctond( httpContext.cgiGet( edtForProPM_Internalname)) ;
         n9769ForProPM = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtForProFe_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "FORPROFE_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProFe_Internalname ;
         wbErr = true ;
         A9770ForProFe = GXutil.nullDate() ;
         n9770ForProFe = false ;
      }
      else
      {
         A9770ForProFe = localUtil.ctod( httpContext.cgiGet( edtForProFe_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n9770ForProFe = false ;
      }
      A10137FacLam = httpContext.cgiGet( edtFacLam_Internalname) ;
      n10137FacLam = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForProMc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForProMc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPROMC_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProMc_Internalname ;
         wbErr = true ;
         A10389ForProMc = (byte)(0) ;
         n10389ForProMc = false ;
      }
      else
      {
         A10389ForProMc = (byte)(localUtil.ctol( httpContext.cgiGet( edtForProMc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10389ForProMc = false ;
      }
      GXCCtl = "Z9766ForProC_" + sGXsfl_70_idx ;
      Z9766ForProC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9768ForProPK_" + sGXsfl_70_idx ;
      Z9768ForProPK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9769ForProPM_" + sGXsfl_70_idx ;
      Z9769ForProPM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9770ForProFe_" + sGXsfl_70_idx ;
      Z9770ForProFe = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10137FacLam_" + sGXsfl_70_idx ;
      Z10137FacLam = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10389ForProMc_" + sGXsfl_70_idx ;
      Z10389ForProMc = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1280_" + sGXsfl_70_idx ;
      nRcdDeleted_1280 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1280_" + sGXsfl_70_idx ;
      nRcdExists_1280 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1280_" + sGXsfl_70_idx ;
      nIsMod_1280 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtForProC_Enabled = edtForProC_Enabled ;
   }

   public void confirmValues1740( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701280( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701280( ) ;
         httpContext.changePostValue( "Z9766ForProC_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z9766ForProC_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9766ForProC_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z9768ForProPK_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z9768ForProPK_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9768ForProPK_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z9769ForProPM_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z9769ForProPM_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9769ForProPM_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z9770ForProFe_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z9770ForProFe_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9770ForProFe_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10137FacLam_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10137FacLam_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10137FacLam_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10389ForProMc_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10389ForProMc_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10389ForProMc_"+sGXsfl_70_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tclarpdcl", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tclarpdcl", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCLARPDCL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO CLIENTE-ART-COL-PROCESO", "") ;
   }

   public void initializeNonKey17447( )
   {
      A5742ForSerDsc = "" ;
      n5742ForSerDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      Z5742ForSerDsc = "" ;
   }

   public void initAll17447( )
   {
      initializeNonKey17447( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1741280( )
   {
      A9767ForProD = "" ;
      A9768ForProPK = DecimalUtil.ZERO ;
      n9768ForProPK = false ;
      A9769ForProPM = DecimalUtil.ZERO ;
      n9769ForProPM = false ;
      A9770ForProFe = GXutil.nullDate() ;
      n9770ForProFe = false ;
      A10137FacLam = "" ;
      n10137FacLam = false ;
      A10389ForProMc = (byte)(0) ;
      n10389ForProMc = false ;
      Z9768ForProPK = DecimalUtil.ZERO ;
      Z9769ForProPM = DecimalUtil.ZERO ;
      Z9770ForProFe = GXutil.nullDate() ;
      Z10137FacLam = "" ;
      Z10389ForProMc = (byte)(0) ;
   }

   public void initAll1741280( )
   {
      A9766ForProC = "" ;
      initializeNonKey1741280( ) ;
   }

   public void standaloneModalInsert1741280( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415591", true, true);
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
      httpContext.AddJavascriptSource("tclarpdcl.js", "?202682415591", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1280( )
   {
      edtForProC_Enabled = defedtForProC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1280_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9766ForProC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9767ForProD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9768ForProPK, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProPK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9769ForProPM, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProPM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A9770ForProFe, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10137FacLam));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLam_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10389ForProMc, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForSer_Internalname = "FORSER" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      edtavnRcdDeleted_1280_Internalname = "vNRCDDELETED_1280" ;
      edtForProC_Internalname = "FORPROC" ;
      edtForProD_Internalname = "FORPROD" ;
      edtForProPK_Internalname = "FORPROPK" ;
      edtForProPM_Internalname = "FORPROPM" ;
      edtForProFe_Internalname = "FORPROFE" ;
      edtFacLam_Internalname = "FACLAM" ;
      edtForProMc_Internalname = "FORPROMC" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIO CLIENTE-ART-COL-PROCESO", "") );
      edtForProMc_Jsonclick = "" ;
      edtFacLam_Jsonclick = "" ;
      edtForProFe_Jsonclick = "" ;
      edtForProPM_Jsonclick = "" ;
      edtForProPK_Jsonclick = "" ;
      edtForProD_Jsonclick = "" ;
      edtForProC_Jsonclick = "" ;
      edtavnRcdDeleted_1280_Jsonclick = "" ;
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
      edtForProMc_Enabled = 1 ;
      edtFacLam_Enabled = 1 ;
      edtForProFe_Enabled = 1 ;
      edtForProPM_Enabled = 1 ;
      edtForProPK_Enabled = 1 ;
      edtForProD_Enabled = 0 ;
      edtForProC_Enabled = 1 ;
      edtavnRcdDeleted_1280_Enabled = 1 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipColDsc_Enabled = 0 ;
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
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtForSerDsc_Enabled = 1 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Backcolor = (int)(0xFFFFFF) ;
      edtForSer_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
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

   public void gx1asaforprod1741280( String A396EmprCod ,
                                     String A9766ForProC )
   {
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclarpdcl_impl.this.A396EmprCod = GXv_char4[0] ;
      tclarpdcl_impl.this.A9766ForProC = GXv_char3[0] ;
      tclarpdcl_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9767ForProD = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9767ForProD))+"\"") ;
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
      subsflControlProps_701280( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1741280( ) ;
         standaloneModal1741280( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1741280( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701280( ) ;
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
      /* Using cursor T017442 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017442_A407EmprNom[0] ;
      n407EmprNom = T017442_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(40);
      /* Using cursor T017443 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T017443_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(41);
      /* Using cursor T017444 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T017444_A832TipColDsc[0] ;
      n832TipColDsc = T017444_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(42);
      GX_FocusControl = edtForSerDsc_Internalname ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", GXutil.rtrim( A5742ForSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Forproc( )
   {
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclarpdcl_impl.this.A396EmprCod = GXv_char4[0] ;
      tclarpdcl_impl.this.A9766ForProC = GXv_char3[0] ;
      tclarpdcl_impl.this.GXt_char1 = GXv_char2[0] ;
      A9767ForProD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9767ForProD", GXutil.rtrim( A9767ForProD));
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
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5742ForSerDsc',fld:'FORSERDSC',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z5742ForSerDsc'},{av:'Z832TipColDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FORPROC","{handler:'valid_Forproc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'A9767ForProD',fld:'FORPROD',pic:''}]");
      setEventMetadata("VALID_FORPROC",",oparms:[{av:'A9767ForProD',fld:'FORPROD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Forpromc',iparms:[]");
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
      pr_default.close(41);
      pr_default.close(40);
      pr_default.close(42);
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
      Z5742ForSerDsc = "" ;
      Z9766ForProC = "" ;
      Z9768ForProPK = DecimalUtil.ZERO ;
      Z9769ForProPM = DecimalUtil.ZERO ;
      Z9770ForProFe = GXutil.nullDate() ;
      Z10137FacLam = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9766ForProC = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
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
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A5742ForSerDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A832TipColDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1280 = "" ;
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
      A9767ForProD = "" ;
      A9768ForProPK = DecimalUtil.ZERO ;
      A9769ForProPM = DecimalUtil.ZERO ;
      A9770ForProFe = GXutil.nullDate() ;
      A10137FacLam = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z832TipColDsc = "" ;
      T01746_A407EmprNom = new String[] {""} ;
      T01746_n407EmprNom = new boolean[] {false} ;
      T01747_A279CliNom = new String[] {""} ;
      T01748_A832TipColDsc = new String[] {""} ;
      T01748_n832TipColDsc = new boolean[] {false} ;
      T01749_A494ForSer = new String[] {""} ;
      T01749_n494ForSer = new boolean[] {false} ;
      T01749_A482ForColNom = new String[] {""} ;
      T01749_n482ForColNom = new boolean[] {false} ;
      T01749_A483ForColNum = new int[1] ;
      T01749_n483ForColNum = new boolean[] {false} ;
      T01749_A407EmprNom = new String[] {""} ;
      T01749_n407EmprNom = new boolean[] {false} ;
      T01749_A279CliNom = new String[] {""} ;
      T01749_A5742ForSerDsc = new String[] {""} ;
      T01749_n5742ForSerDsc = new boolean[] {false} ;
      T01749_A832TipColDsc = new String[] {""} ;
      T01749_n832TipColDsc = new boolean[] {false} ;
      T01749_A396EmprCod = new String[] {""} ;
      T01749_A252CliCod = new int[1] ;
      T01749_n252CliCod = new boolean[] {false} ;
      T01749_A831TipColCod = new byte[1] ;
      T01749_n831TipColCod = new boolean[] {false} ;
      T017410_A396EmprCod = new String[] {""} ;
      T017410_A252CliCod = new int[1] ;
      T017410_n252CliCod = new boolean[] {false} ;
      T017410_A494ForSer = new String[] {""} ;
      T017410_n494ForSer = new boolean[] {false} ;
      T017410_A482ForColNom = new String[] {""} ;
      T017410_n482ForColNom = new boolean[] {false} ;
      T017410_A483ForColNum = new int[1] ;
      T017410_n483ForColNum = new boolean[] {false} ;
      T017410_A831TipColCod = new byte[1] ;
      T017410_n831TipColCod = new boolean[] {false} ;
      T01745_A494ForSer = new String[] {""} ;
      T01745_n494ForSer = new boolean[] {false} ;
      T01745_A482ForColNom = new String[] {""} ;
      T01745_n482ForColNom = new boolean[] {false} ;
      T01745_A483ForColNum = new int[1] ;
      T01745_n483ForColNum = new boolean[] {false} ;
      T01745_A5742ForSerDsc = new String[] {""} ;
      T01745_n5742ForSerDsc = new boolean[] {false} ;
      T01745_A396EmprCod = new String[] {""} ;
      T01745_A252CliCod = new int[1] ;
      T01745_n252CliCod = new boolean[] {false} ;
      T01745_A831TipColCod = new byte[1] ;
      T01745_n831TipColCod = new boolean[] {false} ;
      T017411_A396EmprCod = new String[] {""} ;
      T017411_A252CliCod = new int[1] ;
      T017411_n252CliCod = new boolean[] {false} ;
      T017411_A494ForSer = new String[] {""} ;
      T017411_n494ForSer = new boolean[] {false} ;
      T017411_A482ForColNom = new String[] {""} ;
      T017411_n482ForColNom = new boolean[] {false} ;
      T017411_A483ForColNum = new int[1] ;
      T017411_n483ForColNum = new boolean[] {false} ;
      T017411_A831TipColCod = new byte[1] ;
      T017411_n831TipColCod = new boolean[] {false} ;
      T017412_A396EmprCod = new String[] {""} ;
      T017412_A252CliCod = new int[1] ;
      T017412_n252CliCod = new boolean[] {false} ;
      T017412_A494ForSer = new String[] {""} ;
      T017412_n494ForSer = new boolean[] {false} ;
      T017412_A482ForColNom = new String[] {""} ;
      T017412_n482ForColNom = new boolean[] {false} ;
      T017412_A483ForColNum = new int[1] ;
      T017412_n483ForColNum = new boolean[] {false} ;
      T017412_A831TipColCod = new byte[1] ;
      T017412_n831TipColCod = new boolean[] {false} ;
      T01744_A494ForSer = new String[] {""} ;
      T01744_n494ForSer = new boolean[] {false} ;
      T01744_A482ForColNom = new String[] {""} ;
      T01744_n482ForColNom = new boolean[] {false} ;
      T01744_A483ForColNum = new int[1] ;
      T01744_n483ForColNum = new boolean[] {false} ;
      T01744_A5742ForSerDsc = new String[] {""} ;
      T01744_n5742ForSerDsc = new boolean[] {false} ;
      T01744_A396EmprCod = new String[] {""} ;
      T01744_A252CliCod = new int[1] ;
      T01744_n252CliCod = new boolean[] {false} ;
      T01744_A831TipColCod = new byte[1] ;
      T01744_n831TipColCod = new boolean[] {false} ;
      T017416_A396EmprCod = new String[] {""} ;
      T017416_A252CliCod = new int[1] ;
      T017416_n252CliCod = new boolean[] {false} ;
      T017416_A494ForSer = new String[] {""} ;
      T017416_n494ForSer = new boolean[] {false} ;
      T017416_A482ForColNom = new String[] {""} ;
      T017416_n482ForColNom = new boolean[] {false} ;
      T017416_A483ForColNum = new int[1] ;
      T017416_n483ForColNum = new boolean[] {false} ;
      T017416_A831TipColCod = new byte[1] ;
      T017416_n831TipColCod = new boolean[] {false} ;
      T017416_A13377ForNormaID = new String[] {""} ;
      T017417_A396EmprCod = new String[] {""} ;
      T017417_A252CliCod = new int[1] ;
      T017417_n252CliCod = new boolean[] {false} ;
      T017417_A494ForSer = new String[] {""} ;
      T017417_n494ForSer = new boolean[] {false} ;
      T017417_A482ForColNom = new String[] {""} ;
      T017417_n482ForColNom = new boolean[] {false} ;
      T017417_A483ForColNum = new int[1] ;
      T017417_n483ForColNum = new boolean[] {false} ;
      T017417_A831TipColCod = new byte[1] ;
      T017417_n831TipColCod = new boolean[] {false} ;
      T017417_A3571EnsCod = new String[] {""} ;
      T017418_A396EmprCod = new String[] {""} ;
      T017418_A252CliCod = new int[1] ;
      T017418_n252CliCod = new boolean[] {false} ;
      T017418_A494ForSer = new String[] {""} ;
      T017418_n494ForSer = new boolean[] {false} ;
      T017418_A482ForColNom = new String[] {""} ;
      T017418_n482ForColNom = new boolean[] {false} ;
      T017418_A483ForColNum = new int[1] ;
      T017418_n483ForColNum = new boolean[] {false} ;
      T017418_A831TipColCod = new byte[1] ;
      T017418_n831TipColCod = new boolean[] {false} ;
      T017418_A7270Procod_c = new String[] {""} ;
      T017418_A7272CliCod_d = new int[1] ;
      T017419_A396EmprCod = new String[] {""} ;
      T017419_A252CliCod = new int[1] ;
      T017419_n252CliCod = new boolean[] {false} ;
      T017419_A494ForSer = new String[] {""} ;
      T017419_n494ForSer = new boolean[] {false} ;
      T017419_A482ForColNom = new String[] {""} ;
      T017419_n482ForColNom = new boolean[] {false} ;
      T017419_A483ForColNum = new int[1] ;
      T017419_n483ForColNum = new boolean[] {false} ;
      T017419_A831TipColCod = new byte[1] ;
      T017419_n831TipColCod = new boolean[] {false} ;
      T017419_A6525ColAqP = new String[] {""} ;
      T017420_A396EmprCod = new String[] {""} ;
      T017420_A252CliCod = new int[1] ;
      T017420_n252CliCod = new boolean[] {false} ;
      T017420_A494ForSer = new String[] {""} ;
      T017420_n494ForSer = new boolean[] {false} ;
      T017420_A482ForColNom = new String[] {""} ;
      T017420_n482ForColNom = new boolean[] {false} ;
      T017420_A483ForColNum = new int[1] ;
      T017420_n483ForColNum = new boolean[] {false} ;
      T017420_A831TipColCod = new byte[1] ;
      T017420_n831TipColCod = new boolean[] {false} ;
      T017420_A7262CACPP = new String[] {""} ;
      T017421_A396EmprCod = new String[] {""} ;
      T017421_A252CliCod = new int[1] ;
      T017421_n252CliCod = new boolean[] {false} ;
      T017421_A494ForSer = new String[] {""} ;
      T017421_n494ForSer = new boolean[] {false} ;
      T017421_A482ForColNom = new String[] {""} ;
      T017421_n482ForColNom = new boolean[] {false} ;
      T017421_A483ForColNum = new int[1] ;
      T017421_n483ForColNum = new boolean[] {false} ;
      T017421_A831TipColCod = new byte[1] ;
      T017421_n831TipColCod = new boolean[] {false} ;
      T017421_A6037Mq_Grupo = new byte[1] ;
      T017422_A396EmprCod = new String[] {""} ;
      T017422_A252CliCod = new int[1] ;
      T017422_n252CliCod = new boolean[] {false} ;
      T017422_A494ForSer = new String[] {""} ;
      T017422_n494ForSer = new boolean[] {false} ;
      T017422_A482ForColNom = new String[] {""} ;
      T017422_n482ForColNom = new boolean[] {false} ;
      T017422_A483ForColNum = new int[1] ;
      T017422_n483ForColNum = new boolean[] {false} ;
      T017422_A831TipColCod = new byte[1] ;
      T017422_n831TipColCod = new boolean[] {false} ;
      T017422_A853For_ProC = new String[] {""} ;
      T017423_A396EmprCod = new String[] {""} ;
      T017423_A252CliCod = new int[1] ;
      T017423_n252CliCod = new boolean[] {false} ;
      T017423_A494ForSer = new String[] {""} ;
      T017423_n494ForSer = new boolean[] {false} ;
      T017423_A482ForColNom = new String[] {""} ;
      T017423_n482ForColNom = new boolean[] {false} ;
      T017423_A483ForColNum = new int[1] ;
      T017423_n483ForColNum = new boolean[] {false} ;
      T017423_A831TipColCod = new byte[1] ;
      T017423_n831TipColCod = new boolean[] {false} ;
      T017423_A9766ForProC = new String[] {""} ;
      T017423_A9847ForProL = new short[1] ;
      T017424_A396EmprCod = new String[] {""} ;
      T017424_A252CliCod = new int[1] ;
      T017424_n252CliCod = new boolean[] {false} ;
      T017424_A494ForSer = new String[] {""} ;
      T017424_n494ForSer = new boolean[] {false} ;
      T017424_A482ForColNom = new String[] {""} ;
      T017424_n482ForColNom = new boolean[] {false} ;
      T017424_A483ForColNum = new int[1] ;
      T017424_n483ForColNum = new boolean[] {false} ;
      T017424_A831TipColCod = new byte[1] ;
      T017424_n831TipColCod = new boolean[] {false} ;
      T017424_A7797Sim_lin = new short[1] ;
      T017425_A396EmprCod = new String[] {""} ;
      T017425_A252CliCod = new int[1] ;
      T017425_n252CliCod = new boolean[] {false} ;
      T017425_A494ForSer = new String[] {""} ;
      T017425_n494ForSer = new boolean[] {false} ;
      T017425_A482ForColNom = new String[] {""} ;
      T017425_n482ForColNom = new boolean[] {false} ;
      T017425_A483ForColNum = new int[1] ;
      T017425_n483ForColNum = new boolean[] {false} ;
      T017425_A831TipColCod = new byte[1] ;
      T017425_n831TipColCod = new boolean[] {false} ;
      T017425_A7094Acab_Ter = new String[] {""} ;
      T017426_A396EmprCod = new String[] {""} ;
      T017426_A252CliCod = new int[1] ;
      T017426_n252CliCod = new boolean[] {false} ;
      T017426_A494ForSer = new String[] {""} ;
      T017426_n494ForSer = new boolean[] {false} ;
      T017426_A482ForColNom = new String[] {""} ;
      T017426_n482ForColNom = new boolean[] {false} ;
      T017426_A483ForColNum = new int[1] ;
      T017426_n483ForColNum = new boolean[] {false} ;
      T017426_A831TipColCod = new byte[1] ;
      T017426_n831TipColCod = new boolean[] {false} ;
      T017426_A3689ComForLin = new short[1] ;
      T017427_A396EmprCod = new String[] {""} ;
      T017427_A252CliCod = new int[1] ;
      T017427_n252CliCod = new boolean[] {false} ;
      T017427_A494ForSer = new String[] {""} ;
      T017427_n494ForSer = new boolean[] {false} ;
      T017427_A482ForColNom = new String[] {""} ;
      T017427_n482ForColNom = new boolean[] {false} ;
      T017427_A483ForColNum = new int[1] ;
      T017427_n483ForColNum = new boolean[] {false} ;
      T017427_A831TipColCod = new byte[1] ;
      T017427_n831TipColCod = new boolean[] {false} ;
      T017427_A1519RecCorLin = new byte[1] ;
      T017428_A396EmprCod = new String[] {""} ;
      T017428_A252CliCod = new int[1] ;
      T017428_n252CliCod = new boolean[] {false} ;
      T017428_A494ForSer = new String[] {""} ;
      T017428_n494ForSer = new boolean[] {false} ;
      T017428_A482ForColNom = new String[] {""} ;
      T017428_n482ForColNom = new boolean[] {false} ;
      T017428_A483ForColNum = new int[1] ;
      T017428_n483ForColNum = new boolean[] {false} ;
      T017428_A831TipColCod = new byte[1] ;
      T017428_n831TipColCod = new boolean[] {false} ;
      T017428_A1160ProForL = new short[1] ;
      T017429_A396EmprCod = new String[] {""} ;
      T017429_A910Workstat = new String[] {""} ;
      T017429_A880EscLin = new short[1] ;
      T017430_A396EmprCod = new String[] {""} ;
      T017430_A252CliCod = new int[1] ;
      T017430_n252CliCod = new boolean[] {false} ;
      T017430_A494ForSer = new String[] {""} ;
      T017430_n494ForSer = new boolean[] {false} ;
      T017430_A482ForColNom = new String[] {""} ;
      T017430_n482ForColNom = new boolean[] {false} ;
      T017430_A483ForColNum = new int[1] ;
      T017430_n483ForColNum = new boolean[] {false} ;
      T017430_A831TipColCod = new byte[1] ;
      T017430_n831TipColCod = new boolean[] {false} ;
      T017430_A650ObsLin = new short[1] ;
      T017431_A396EmprCod = new String[] {""} ;
      T017431_A252CliCod = new int[1] ;
      T017431_n252CliCod = new boolean[] {false} ;
      T017431_A494ForSer = new String[] {""} ;
      T017431_n494ForSer = new boolean[] {false} ;
      T017431_A482ForColNom = new String[] {""} ;
      T017431_n482ForColNom = new boolean[] {false} ;
      T017431_A483ForColNum = new int[1] ;
      T017431_n483ForColNum = new boolean[] {false} ;
      T017431_A831TipColCod = new byte[1] ;
      T017431_n831TipColCod = new boolean[] {false} ;
      T017432_A494ForSer = new String[] {""} ;
      T017432_n494ForSer = new boolean[] {false} ;
      T017432_A482ForColNom = new String[] {""} ;
      T017432_n482ForColNom = new boolean[] {false} ;
      T017432_A483ForColNum = new int[1] ;
      T017432_n483ForColNum = new boolean[] {false} ;
      T017432_A831TipColCod = new byte[1] ;
      T017432_n831TipColCod = new boolean[] {false} ;
      T017432_A9766ForProC = new String[] {""} ;
      T017432_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017432_n9768ForProPK = new boolean[] {false} ;
      T017432_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017432_n9769ForProPM = new boolean[] {false} ;
      T017432_A9770ForProFe = new java.util.Date[] {GXutil.nullDate()} ;
      T017432_n9770ForProFe = new boolean[] {false} ;
      T017432_A10137FacLam = new String[] {""} ;
      T017432_n10137FacLam = new boolean[] {false} ;
      T017432_A10389ForProMc = new byte[1] ;
      T017432_n10389ForProMc = new boolean[] {false} ;
      T017432_A396EmprCod = new String[] {""} ;
      T017432_A252CliCod = new int[1] ;
      T017432_n252CliCod = new boolean[] {false} ;
      T017433_A396EmprCod = new String[] {""} ;
      T017433_A252CliCod = new int[1] ;
      T017433_n252CliCod = new boolean[] {false} ;
      T017433_A494ForSer = new String[] {""} ;
      T017433_n494ForSer = new boolean[] {false} ;
      T017433_A482ForColNom = new String[] {""} ;
      T017433_n482ForColNom = new boolean[] {false} ;
      T017433_A483ForColNum = new int[1] ;
      T017433_n483ForColNum = new boolean[] {false} ;
      T017433_A831TipColCod = new byte[1] ;
      T017433_n831TipColCod = new boolean[] {false} ;
      T017433_A9766ForProC = new String[] {""} ;
      T01743_A494ForSer = new String[] {""} ;
      T01743_n494ForSer = new boolean[] {false} ;
      T01743_A482ForColNom = new String[] {""} ;
      T01743_n482ForColNom = new boolean[] {false} ;
      T01743_A483ForColNum = new int[1] ;
      T01743_n483ForColNum = new boolean[] {false} ;
      T01743_A831TipColCod = new byte[1] ;
      T01743_n831TipColCod = new boolean[] {false} ;
      T01743_A9766ForProC = new String[] {""} ;
      T01743_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01743_n9768ForProPK = new boolean[] {false} ;
      T01743_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01743_n9769ForProPM = new boolean[] {false} ;
      T01743_A9770ForProFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01743_n9770ForProFe = new boolean[] {false} ;
      T01743_A10137FacLam = new String[] {""} ;
      T01743_n10137FacLam = new boolean[] {false} ;
      T01743_A10389ForProMc = new byte[1] ;
      T01743_n10389ForProMc = new boolean[] {false} ;
      T01743_A396EmprCod = new String[] {""} ;
      T01743_A252CliCod = new int[1] ;
      T01743_n252CliCod = new boolean[] {false} ;
      T01742_A494ForSer = new String[] {""} ;
      T01742_n494ForSer = new boolean[] {false} ;
      T01742_A482ForColNom = new String[] {""} ;
      T01742_n482ForColNom = new boolean[] {false} ;
      T01742_A483ForColNum = new int[1] ;
      T01742_n483ForColNum = new boolean[] {false} ;
      T01742_A831TipColCod = new byte[1] ;
      T01742_n831TipColCod = new boolean[] {false} ;
      T01742_A9766ForProC = new String[] {""} ;
      T01742_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01742_n9768ForProPK = new boolean[] {false} ;
      T01742_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01742_n9769ForProPM = new boolean[] {false} ;
      T01742_A9770ForProFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01742_n9770ForProFe = new boolean[] {false} ;
      T01742_A10137FacLam = new String[] {""} ;
      T01742_n10137FacLam = new boolean[] {false} ;
      T01742_A10389ForProMc = new byte[1] ;
      T01742_n10389ForProMc = new boolean[] {false} ;
      T01742_A396EmprCod = new String[] {""} ;
      T01742_A252CliCod = new int[1] ;
      T01742_n252CliCod = new boolean[] {false} ;
      T017437_A396EmprCod = new String[] {""} ;
      T017437_A252CliCod = new int[1] ;
      T017437_n252CliCod = new boolean[] {false} ;
      T017437_A494ForSer = new String[] {""} ;
      T017437_n494ForSer = new boolean[] {false} ;
      T017437_A482ForColNom = new String[] {""} ;
      T017437_n482ForColNom = new boolean[] {false} ;
      T017437_A483ForColNum = new int[1] ;
      T017437_n483ForColNum = new boolean[] {false} ;
      T017437_A831TipColCod = new byte[1] ;
      T017437_n831TipColCod = new boolean[] {false} ;
      T017437_A9766ForProC = new String[] {""} ;
      T017437_A11282ForProLn = new short[1] ;
      T017438_A396EmprCod = new String[] {""} ;
      T017438_A252CliCod = new int[1] ;
      T017438_n252CliCod = new boolean[] {false} ;
      T017438_A494ForSer = new String[] {""} ;
      T017438_n494ForSer = new boolean[] {false} ;
      T017438_A482ForColNom = new String[] {""} ;
      T017438_n482ForColNom = new boolean[] {false} ;
      T017438_A483ForColNum = new int[1] ;
      T017438_n483ForColNum = new boolean[] {false} ;
      T017438_A831TipColCod = new byte[1] ;
      T017438_n831TipColCod = new boolean[] {false} ;
      T017438_A9766ForProC = new String[] {""} ;
      T017438_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017439_A396EmprCod = new String[] {""} ;
      T017439_A252CliCod = new int[1] ;
      T017439_n252CliCod = new boolean[] {false} ;
      T017439_A494ForSer = new String[] {""} ;
      T017439_n494ForSer = new boolean[] {false} ;
      T017439_A482ForColNom = new String[] {""} ;
      T017439_n482ForColNom = new boolean[] {false} ;
      T017439_A483ForColNum = new int[1] ;
      T017439_n483ForColNum = new boolean[] {false} ;
      T017439_A831TipColCod = new byte[1] ;
      T017439_n831TipColCod = new boolean[] {false} ;
      T017439_A9766ForProC = new String[] {""} ;
      T017439_A1067ForLinN = new short[1] ;
      T017440_A396EmprCod = new String[] {""} ;
      T017440_A252CliCod = new int[1] ;
      T017440_n252CliCod = new boolean[] {false} ;
      T017440_A494ForSer = new String[] {""} ;
      T017440_n494ForSer = new boolean[] {false} ;
      T017440_A482ForColNom = new String[] {""} ;
      T017440_n482ForColNom = new boolean[] {false} ;
      T017440_A483ForColNum = new int[1] ;
      T017440_n483ForColNum = new boolean[] {false} ;
      T017440_A831TipColCod = new byte[1] ;
      T017440_n831TipColCod = new boolean[] {false} ;
      T017440_A9766ForProC = new String[] {""} ;
      T017440_A9847ForProL = new short[1] ;
      T017441_A396EmprCod = new String[] {""} ;
      T017441_A252CliCod = new int[1] ;
      T017441_n252CliCod = new boolean[] {false} ;
      T017441_A494ForSer = new String[] {""} ;
      T017441_n494ForSer = new boolean[] {false} ;
      T017441_A482ForColNom = new String[] {""} ;
      T017441_n482ForColNom = new boolean[] {false} ;
      T017441_A483ForColNum = new int[1] ;
      T017441_n483ForColNum = new boolean[] {false} ;
      T017441_A831TipColCod = new byte[1] ;
      T017441_n831TipColCod = new boolean[] {false} ;
      T017441_A9766ForProC = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017442_A407EmprNom = new String[] {""} ;
      T017442_n407EmprNom = new boolean[] {false} ;
      T017443_A279CliNom = new String[] {""} ;
      T017444_A832TipColDsc = new String[] {""} ;
      T017444_n832TipColDsc = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ5742ForSerDsc = "" ;
      ZZ832TipColDsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z9767ForProD = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclarpdcl__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclarpdcl__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclarpdcl__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclarpdcl__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclarpdcl__default(),
         new Object[] {
             new Object[] {
            T01742_A494ForSer, T01742_A482ForColNom, T01742_A483ForColNum, T01742_A831TipColCod, T01742_A9766ForProC, T01742_A9768ForProPK, T01742_n9768ForProPK, T01742_A9769ForProPM, T01742_n9769ForProPM, T01742_A9770ForProFe,
            T01742_n9770ForProFe, T01742_A10137FacLam, T01742_n10137FacLam, T01742_A10389ForProMc, T01742_n10389ForProMc, T01742_A396EmprCod, T01742_A252CliCod
            }
            , new Object[] {
            T01743_A494ForSer, T01743_A482ForColNom, T01743_A483ForColNum, T01743_A831TipColCod, T01743_A9766ForProC, T01743_A9768ForProPK, T01743_n9768ForProPK, T01743_A9769ForProPM, T01743_n9769ForProPM, T01743_A9770ForProFe,
            T01743_n9770ForProFe, T01743_A10137FacLam, T01743_n10137FacLam, T01743_A10389ForProMc, T01743_n10389ForProMc, T01743_A396EmprCod, T01743_A252CliCod
            }
            , new Object[] {
            T01744_A494ForSer, T01744_A482ForColNom, T01744_A483ForColNum, T01744_A5742ForSerDsc, T01744_n5742ForSerDsc, T01744_A396EmprCod, T01744_A252CliCod, T01744_A831TipColCod
            }
            , new Object[] {
            T01745_A494ForSer, T01745_A482ForColNom, T01745_A483ForColNum, T01745_A5742ForSerDsc, T01745_n5742ForSerDsc, T01745_A396EmprCod, T01745_A252CliCod, T01745_A831TipColCod
            }
            , new Object[] {
            T01746_A407EmprNom, T01746_n407EmprNom
            }
            , new Object[] {
            T01747_A279CliNom
            }
            , new Object[] {
            T01748_A832TipColDsc, T01748_n832TipColDsc
            }
            , new Object[] {
            T01749_A494ForSer, T01749_A482ForColNom, T01749_A483ForColNum, T01749_A407EmprNom, T01749_n407EmprNom, T01749_A279CliNom, T01749_A5742ForSerDsc, T01749_n5742ForSerDsc, T01749_A832TipColDsc, T01749_n832TipColDsc,
            T01749_A396EmprCod, T01749_A252CliCod, T01749_A831TipColCod
            }
            , new Object[] {
            T017410_A396EmprCod, T017410_A252CliCod, T017410_A494ForSer, T017410_A482ForColNom, T017410_A483ForColNum, T017410_A831TipColCod
            }
            , new Object[] {
            T017411_A396EmprCod, T017411_A252CliCod, T017411_A494ForSer, T017411_A482ForColNom, T017411_A483ForColNum, T017411_A831TipColCod
            }
            , new Object[] {
            T017412_A396EmprCod, T017412_A252CliCod, T017412_A494ForSer, T017412_A482ForColNom, T017412_A483ForColNum, T017412_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017416_A396EmprCod, T017416_A252CliCod, T017416_A494ForSer, T017416_A482ForColNom, T017416_A483ForColNum, T017416_A831TipColCod, T017416_A13377ForNormaID
            }
            , new Object[] {
            T017417_A396EmprCod, T017417_A252CliCod, T017417_A494ForSer, T017417_A482ForColNom, T017417_A483ForColNum, T017417_A831TipColCod, T017417_A3571EnsCod
            }
            , new Object[] {
            T017418_A396EmprCod, T017418_A252CliCod, T017418_A494ForSer, T017418_A482ForColNom, T017418_A483ForColNum, T017418_A831TipColCod, T017418_A7270Procod_c, T017418_A7272CliCod_d
            }
            , new Object[] {
            T017419_A396EmprCod, T017419_A252CliCod, T017419_A494ForSer, T017419_A482ForColNom, T017419_A483ForColNum, T017419_A831TipColCod, T017419_A6525ColAqP
            }
            , new Object[] {
            T017420_A396EmprCod, T017420_A252CliCod, T017420_A494ForSer, T017420_A482ForColNom, T017420_A483ForColNum, T017420_A831TipColCod, T017420_A7262CACPP
            }
            , new Object[] {
            T017421_A396EmprCod, T017421_A252CliCod, T017421_A494ForSer, T017421_A482ForColNom, T017421_A483ForColNum, T017421_A831TipColCod, T017421_A6037Mq_Grupo
            }
            , new Object[] {
            T017422_A396EmprCod, T017422_A252CliCod, T017422_A494ForSer, T017422_A482ForColNom, T017422_A483ForColNum, T017422_A831TipColCod, T017422_A853For_ProC
            }
            , new Object[] {
            T017423_A396EmprCod, T017423_A252CliCod, T017423_A494ForSer, T017423_A482ForColNom, T017423_A483ForColNum, T017423_A831TipColCod, T017423_A9766ForProC, T017423_A9847ForProL
            }
            , new Object[] {
            T017424_A396EmprCod, T017424_A252CliCod, T017424_A494ForSer, T017424_A482ForColNom, T017424_A483ForColNum, T017424_A831TipColCod, T017424_A7797Sim_lin
            }
            , new Object[] {
            T017425_A396EmprCod, T017425_A252CliCod, T017425_A494ForSer, T017425_A482ForColNom, T017425_A483ForColNum, T017425_A831TipColCod, T017425_A7094Acab_Ter
            }
            , new Object[] {
            T017426_A396EmprCod, T017426_A252CliCod, T017426_A494ForSer, T017426_A482ForColNom, T017426_A483ForColNum, T017426_A831TipColCod, T017426_A3689ComForLin
            }
            , new Object[] {
            T017427_A396EmprCod, T017427_A252CliCod, T017427_A494ForSer, T017427_A482ForColNom, T017427_A483ForColNum, T017427_A831TipColCod, T017427_A1519RecCorLin
            }
            , new Object[] {
            T017428_A396EmprCod, T017428_A252CliCod, T017428_A494ForSer, T017428_A482ForColNom, T017428_A483ForColNum, T017428_A831TipColCod, T017428_A1160ProForL
            }
            , new Object[] {
            T017429_A396EmprCod, T017429_A910Workstat, T017429_A880EscLin
            }
            , new Object[] {
            T017430_A396EmprCod, T017430_A252CliCod, T017430_A494ForSer, T017430_A482ForColNom, T017430_A483ForColNum, T017430_A831TipColCod, T017430_A650ObsLin
            }
            , new Object[] {
            T017431_A396EmprCod, T017431_A252CliCod, T017431_A494ForSer, T017431_A482ForColNom, T017431_A483ForColNum, T017431_A831TipColCod
            }
            , new Object[] {
            T017432_A494ForSer, T017432_A482ForColNom, T017432_A483ForColNum, T017432_A831TipColCod, T017432_A9766ForProC, T017432_A9768ForProPK, T017432_n9768ForProPK, T017432_A9769ForProPM, T017432_n9769ForProPM, T017432_A9770ForProFe,
            T017432_n9770ForProFe, T017432_A10137FacLam, T017432_n10137FacLam, T017432_A10389ForProMc, T017432_n10389ForProMc, T017432_A396EmprCod, T017432_A252CliCod
            }
            , new Object[] {
            T017433_A396EmprCod, T017433_A252CliCod, T017433_A494ForSer, T017433_A482ForColNom, T017433_A483ForColNum, T017433_A831TipColCod, T017433_A9766ForProC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017437_A396EmprCod, T017437_A252CliCod, T017437_A494ForSer, T017437_A482ForColNom, T017437_A483ForColNum, T017437_A831TipColCod, T017437_A9766ForProC, T017437_A11282ForProLn
            }
            , new Object[] {
            T017438_A396EmprCod, T017438_A252CliCod, T017438_A494ForSer, T017438_A482ForColNom, T017438_A483ForColNum, T017438_A831TipColCod, T017438_A9766ForProC, T017438_A10288Hp_dia
            }
            , new Object[] {
            T017439_A396EmprCod, T017439_A252CliCod, T017439_A494ForSer, T017439_A482ForColNom, T017439_A483ForColNum, T017439_A831TipColCod, T017439_A9766ForProC, T017439_A1067ForLinN
            }
            , new Object[] {
            T017440_A396EmprCod, T017440_A252CliCod, T017440_A494ForSer, T017440_A482ForColNom, T017440_A483ForColNum, T017440_A831TipColCod, T017440_A9766ForProC, T017440_A9847ForProL
            }
            , new Object[] {
            T017441_A396EmprCod, T017441_A252CliCod, T017441_A494ForSer, T017441_A482ForColNom, T017441_A483ForColNum, T017441_A831TipColCod, T017441_A9766ForProC
            }
            , new Object[] {
            T017442_A407EmprNom, T017442_n407EmprNom
            }
            , new Object[] {
            T017443_A279CliNom
            }
            , new Object[] {
            T017444_A832TipColDsc, T017444_n832TipColDsc
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
   private byte Z10389ForProMc ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte A10389ForProMc ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private short nRcdDeleted_1280 ;
   private short nRcdExists_1280 ;
   private short nIsMod_1280 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1280 ;
   private short RcdFound1280 ;
   private short nBlankRcdUsr1280 ;
   private short RcdFound47 ;
   private short nIsDirty_47 ;
   private short nIsDirty_1280 ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForSerDsc_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtavnRcdDeleted_1280_Enabled ;
   private int edtForProC_Enabled ;
   private int edtForProD_Enabled ;
   private int edtForProPK_Enabled ;
   private int edtForProPM_Enabled ;
   private int edtForProFe_Enabled ;
   private int edtFacLam_Enabled ;
   private int edtForProMc_Enabled ;
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
   private int defedtForProC_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTipColDsc_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSerDsc_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9768ForProPK ;
   private java.math.BigDecimal Z9769ForProPM ;
   private java.math.BigDecimal A9768ForProPK ;
   private java.math.BigDecimal A9769ForProPM ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z5742ForSerDsc ;
   private String Z9766ForProC ;
   private String Z10137FacLam ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9766ForProC ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtForSerDsc_Internalname ;
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
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String sMode1280 ;
   private String edtavnRcdDeleted_1280_Internalname ;
   private String edtForProC_Internalname ;
   private String edtForProD_Internalname ;
   private String edtForProPK_Internalname ;
   private String edtForProPM_Internalname ;
   private String edtForProFe_Internalname ;
   private String edtFacLam_Internalname ;
   private String edtForProMc_Internalname ;
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
   private String A9767ForProD ;
   private String A10137FacLam ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z832TipColDsc ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1280_Jsonclick ;
   private String edtForProC_Jsonclick ;
   private String edtForProD_Jsonclick ;
   private String edtForProPK_Jsonclick ;
   private String edtForProPM_Jsonclick ;
   private String edtForProFe_Jsonclick ;
   private String edtFacLam_Jsonclick ;
   private String edtForProMc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ5742ForSerDsc ;
   private String ZZ832TipColDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z9767ForProD ;
   private java.util.Date Z9770ForProFe ;
   private java.util.Date A9770ForProFe ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n494ForSer ;
   private boolean n482ForColNom ;
   private boolean n483ForColNum ;
   private boolean n831TipColCod ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5742ForSerDsc ;
   private boolean n832TipColDsc ;
   private boolean n9768ForProPK ;
   private boolean n9769ForProPM ;
   private boolean n9770ForProFe ;
   private boolean n10137FacLam ;
   private boolean n10389ForProMc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01746_A407EmprNom ;
   private boolean[] T01746_n407EmprNom ;
   private String[] T01747_A279CliNom ;
   private String[] T01748_A832TipColDsc ;
   private boolean[] T01748_n832TipColDsc ;
   private String[] T01749_A494ForSer ;
   private boolean[] T01749_n494ForSer ;
   private String[] T01749_A482ForColNom ;
   private boolean[] T01749_n482ForColNom ;
   private int[] T01749_A483ForColNum ;
   private boolean[] T01749_n483ForColNum ;
   private String[] T01749_A407EmprNom ;
   private boolean[] T01749_n407EmprNom ;
   private String[] T01749_A279CliNom ;
   private String[] T01749_A5742ForSerDsc ;
   private boolean[] T01749_n5742ForSerDsc ;
   private String[] T01749_A832TipColDsc ;
   private boolean[] T01749_n832TipColDsc ;
   private String[] T01749_A396EmprCod ;
   private int[] T01749_A252CliCod ;
   private boolean[] T01749_n252CliCod ;
   private byte[] T01749_A831TipColCod ;
   private boolean[] T01749_n831TipColCod ;
   private String[] T017410_A396EmprCod ;
   private int[] T017410_A252CliCod ;
   private boolean[] T017410_n252CliCod ;
   private String[] T017410_A494ForSer ;
   private boolean[] T017410_n494ForSer ;
   private String[] T017410_A482ForColNom ;
   private boolean[] T017410_n482ForColNom ;
   private int[] T017410_A483ForColNum ;
   private boolean[] T017410_n483ForColNum ;
   private byte[] T017410_A831TipColCod ;
   private boolean[] T017410_n831TipColCod ;
   private String[] T01745_A494ForSer ;
   private boolean[] T01745_n494ForSer ;
   private String[] T01745_A482ForColNom ;
   private boolean[] T01745_n482ForColNom ;
   private int[] T01745_A483ForColNum ;
   private boolean[] T01745_n483ForColNum ;
   private String[] T01745_A5742ForSerDsc ;
   private boolean[] T01745_n5742ForSerDsc ;
   private String[] T01745_A396EmprCod ;
   private int[] T01745_A252CliCod ;
   private boolean[] T01745_n252CliCod ;
   private byte[] T01745_A831TipColCod ;
   private boolean[] T01745_n831TipColCod ;
   private String[] T017411_A396EmprCod ;
   private int[] T017411_A252CliCod ;
   private boolean[] T017411_n252CliCod ;
   private String[] T017411_A494ForSer ;
   private boolean[] T017411_n494ForSer ;
   private String[] T017411_A482ForColNom ;
   private boolean[] T017411_n482ForColNom ;
   private int[] T017411_A483ForColNum ;
   private boolean[] T017411_n483ForColNum ;
   private byte[] T017411_A831TipColCod ;
   private boolean[] T017411_n831TipColCod ;
   private String[] T017412_A396EmprCod ;
   private int[] T017412_A252CliCod ;
   private boolean[] T017412_n252CliCod ;
   private String[] T017412_A494ForSer ;
   private boolean[] T017412_n494ForSer ;
   private String[] T017412_A482ForColNom ;
   private boolean[] T017412_n482ForColNom ;
   private int[] T017412_A483ForColNum ;
   private boolean[] T017412_n483ForColNum ;
   private byte[] T017412_A831TipColCod ;
   private boolean[] T017412_n831TipColCod ;
   private String[] T01744_A494ForSer ;
   private boolean[] T01744_n494ForSer ;
   private String[] T01744_A482ForColNom ;
   private boolean[] T01744_n482ForColNom ;
   private int[] T01744_A483ForColNum ;
   private boolean[] T01744_n483ForColNum ;
   private String[] T01744_A5742ForSerDsc ;
   private boolean[] T01744_n5742ForSerDsc ;
   private String[] T01744_A396EmprCod ;
   private int[] T01744_A252CliCod ;
   private boolean[] T01744_n252CliCod ;
   private byte[] T01744_A831TipColCod ;
   private boolean[] T01744_n831TipColCod ;
   private String[] T017416_A396EmprCod ;
   private int[] T017416_A252CliCod ;
   private boolean[] T017416_n252CliCod ;
   private String[] T017416_A494ForSer ;
   private boolean[] T017416_n494ForSer ;
   private String[] T017416_A482ForColNom ;
   private boolean[] T017416_n482ForColNom ;
   private int[] T017416_A483ForColNum ;
   private boolean[] T017416_n483ForColNum ;
   private byte[] T017416_A831TipColCod ;
   private boolean[] T017416_n831TipColCod ;
   private String[] T017416_A13377ForNormaID ;
   private String[] T017417_A396EmprCod ;
   private int[] T017417_A252CliCod ;
   private boolean[] T017417_n252CliCod ;
   private String[] T017417_A494ForSer ;
   private boolean[] T017417_n494ForSer ;
   private String[] T017417_A482ForColNom ;
   private boolean[] T017417_n482ForColNom ;
   private int[] T017417_A483ForColNum ;
   private boolean[] T017417_n483ForColNum ;
   private byte[] T017417_A831TipColCod ;
   private boolean[] T017417_n831TipColCod ;
   private String[] T017417_A3571EnsCod ;
   private String[] T017418_A396EmprCod ;
   private int[] T017418_A252CliCod ;
   private boolean[] T017418_n252CliCod ;
   private String[] T017418_A494ForSer ;
   private boolean[] T017418_n494ForSer ;
   private String[] T017418_A482ForColNom ;
   private boolean[] T017418_n482ForColNom ;
   private int[] T017418_A483ForColNum ;
   private boolean[] T017418_n483ForColNum ;
   private byte[] T017418_A831TipColCod ;
   private boolean[] T017418_n831TipColCod ;
   private String[] T017418_A7270Procod_c ;
   private int[] T017418_A7272CliCod_d ;
   private String[] T017419_A396EmprCod ;
   private int[] T017419_A252CliCod ;
   private boolean[] T017419_n252CliCod ;
   private String[] T017419_A494ForSer ;
   private boolean[] T017419_n494ForSer ;
   private String[] T017419_A482ForColNom ;
   private boolean[] T017419_n482ForColNom ;
   private int[] T017419_A483ForColNum ;
   private boolean[] T017419_n483ForColNum ;
   private byte[] T017419_A831TipColCod ;
   private boolean[] T017419_n831TipColCod ;
   private String[] T017419_A6525ColAqP ;
   private String[] T017420_A396EmprCod ;
   private int[] T017420_A252CliCod ;
   private boolean[] T017420_n252CliCod ;
   private String[] T017420_A494ForSer ;
   private boolean[] T017420_n494ForSer ;
   private String[] T017420_A482ForColNom ;
   private boolean[] T017420_n482ForColNom ;
   private int[] T017420_A483ForColNum ;
   private boolean[] T017420_n483ForColNum ;
   private byte[] T017420_A831TipColCod ;
   private boolean[] T017420_n831TipColCod ;
   private String[] T017420_A7262CACPP ;
   private String[] T017421_A396EmprCod ;
   private int[] T017421_A252CliCod ;
   private boolean[] T017421_n252CliCod ;
   private String[] T017421_A494ForSer ;
   private boolean[] T017421_n494ForSer ;
   private String[] T017421_A482ForColNom ;
   private boolean[] T017421_n482ForColNom ;
   private int[] T017421_A483ForColNum ;
   private boolean[] T017421_n483ForColNum ;
   private byte[] T017421_A831TipColCod ;
   private boolean[] T017421_n831TipColCod ;
   private byte[] T017421_A6037Mq_Grupo ;
   private String[] T017422_A396EmprCod ;
   private int[] T017422_A252CliCod ;
   private boolean[] T017422_n252CliCod ;
   private String[] T017422_A494ForSer ;
   private boolean[] T017422_n494ForSer ;
   private String[] T017422_A482ForColNom ;
   private boolean[] T017422_n482ForColNom ;
   private int[] T017422_A483ForColNum ;
   private boolean[] T017422_n483ForColNum ;
   private byte[] T017422_A831TipColCod ;
   private boolean[] T017422_n831TipColCod ;
   private String[] T017422_A853For_ProC ;
   private String[] T017423_A396EmprCod ;
   private int[] T017423_A252CliCod ;
   private boolean[] T017423_n252CliCod ;
   private String[] T017423_A494ForSer ;
   private boolean[] T017423_n494ForSer ;
   private String[] T017423_A482ForColNom ;
   private boolean[] T017423_n482ForColNom ;
   private int[] T017423_A483ForColNum ;
   private boolean[] T017423_n483ForColNum ;
   private byte[] T017423_A831TipColCod ;
   private boolean[] T017423_n831TipColCod ;
   private String[] T017423_A9766ForProC ;
   private short[] T017423_A9847ForProL ;
   private String[] T017424_A396EmprCod ;
   private int[] T017424_A252CliCod ;
   private boolean[] T017424_n252CliCod ;
   private String[] T017424_A494ForSer ;
   private boolean[] T017424_n494ForSer ;
   private String[] T017424_A482ForColNom ;
   private boolean[] T017424_n482ForColNom ;
   private int[] T017424_A483ForColNum ;
   private boolean[] T017424_n483ForColNum ;
   private byte[] T017424_A831TipColCod ;
   private boolean[] T017424_n831TipColCod ;
   private short[] T017424_A7797Sim_lin ;
   private String[] T017425_A396EmprCod ;
   private int[] T017425_A252CliCod ;
   private boolean[] T017425_n252CliCod ;
   private String[] T017425_A494ForSer ;
   private boolean[] T017425_n494ForSer ;
   private String[] T017425_A482ForColNom ;
   private boolean[] T017425_n482ForColNom ;
   private int[] T017425_A483ForColNum ;
   private boolean[] T017425_n483ForColNum ;
   private byte[] T017425_A831TipColCod ;
   private boolean[] T017425_n831TipColCod ;
   private String[] T017425_A7094Acab_Ter ;
   private String[] T017426_A396EmprCod ;
   private int[] T017426_A252CliCod ;
   private boolean[] T017426_n252CliCod ;
   private String[] T017426_A494ForSer ;
   private boolean[] T017426_n494ForSer ;
   private String[] T017426_A482ForColNom ;
   private boolean[] T017426_n482ForColNom ;
   private int[] T017426_A483ForColNum ;
   private boolean[] T017426_n483ForColNum ;
   private byte[] T017426_A831TipColCod ;
   private boolean[] T017426_n831TipColCod ;
   private short[] T017426_A3689ComForLin ;
   private String[] T017427_A396EmprCod ;
   private int[] T017427_A252CliCod ;
   private boolean[] T017427_n252CliCod ;
   private String[] T017427_A494ForSer ;
   private boolean[] T017427_n494ForSer ;
   private String[] T017427_A482ForColNom ;
   private boolean[] T017427_n482ForColNom ;
   private int[] T017427_A483ForColNum ;
   private boolean[] T017427_n483ForColNum ;
   private byte[] T017427_A831TipColCod ;
   private boolean[] T017427_n831TipColCod ;
   private byte[] T017427_A1519RecCorLin ;
   private String[] T017428_A396EmprCod ;
   private int[] T017428_A252CliCod ;
   private boolean[] T017428_n252CliCod ;
   private String[] T017428_A494ForSer ;
   private boolean[] T017428_n494ForSer ;
   private String[] T017428_A482ForColNom ;
   private boolean[] T017428_n482ForColNom ;
   private int[] T017428_A483ForColNum ;
   private boolean[] T017428_n483ForColNum ;
   private byte[] T017428_A831TipColCod ;
   private boolean[] T017428_n831TipColCod ;
   private short[] T017428_A1160ProForL ;
   private String[] T017429_A396EmprCod ;
   private String[] T017429_A910Workstat ;
   private short[] T017429_A880EscLin ;
   private String[] T017430_A396EmprCod ;
   private int[] T017430_A252CliCod ;
   private boolean[] T017430_n252CliCod ;
   private String[] T017430_A494ForSer ;
   private boolean[] T017430_n494ForSer ;
   private String[] T017430_A482ForColNom ;
   private boolean[] T017430_n482ForColNom ;
   private int[] T017430_A483ForColNum ;
   private boolean[] T017430_n483ForColNum ;
   private byte[] T017430_A831TipColCod ;
   private boolean[] T017430_n831TipColCod ;
   private short[] T017430_A650ObsLin ;
   private String[] T017431_A396EmprCod ;
   private int[] T017431_A252CliCod ;
   private boolean[] T017431_n252CliCod ;
   private String[] T017431_A494ForSer ;
   private boolean[] T017431_n494ForSer ;
   private String[] T017431_A482ForColNom ;
   private boolean[] T017431_n482ForColNom ;
   private int[] T017431_A483ForColNum ;
   private boolean[] T017431_n483ForColNum ;
   private byte[] T017431_A831TipColCod ;
   private boolean[] T017431_n831TipColCod ;
   private String[] T017432_A494ForSer ;
   private boolean[] T017432_n494ForSer ;
   private String[] T017432_A482ForColNom ;
   private boolean[] T017432_n482ForColNom ;
   private int[] T017432_A483ForColNum ;
   private boolean[] T017432_n483ForColNum ;
   private byte[] T017432_A831TipColCod ;
   private boolean[] T017432_n831TipColCod ;
   private String[] T017432_A9766ForProC ;
   private java.math.BigDecimal[] T017432_A9768ForProPK ;
   private boolean[] T017432_n9768ForProPK ;
   private java.math.BigDecimal[] T017432_A9769ForProPM ;
   private boolean[] T017432_n9769ForProPM ;
   private java.util.Date[] T017432_A9770ForProFe ;
   private boolean[] T017432_n9770ForProFe ;
   private String[] T017432_A10137FacLam ;
   private boolean[] T017432_n10137FacLam ;
   private byte[] T017432_A10389ForProMc ;
   private boolean[] T017432_n10389ForProMc ;
   private String[] T017432_A396EmprCod ;
   private int[] T017432_A252CliCod ;
   private boolean[] T017432_n252CliCod ;
   private String[] T017433_A396EmprCod ;
   private int[] T017433_A252CliCod ;
   private boolean[] T017433_n252CliCod ;
   private String[] T017433_A494ForSer ;
   private boolean[] T017433_n494ForSer ;
   private String[] T017433_A482ForColNom ;
   private boolean[] T017433_n482ForColNom ;
   private int[] T017433_A483ForColNum ;
   private boolean[] T017433_n483ForColNum ;
   private byte[] T017433_A831TipColCod ;
   private boolean[] T017433_n831TipColCod ;
   private String[] T017433_A9766ForProC ;
   private String[] T01743_A494ForSer ;
   private boolean[] T01743_n494ForSer ;
   private String[] T01743_A482ForColNom ;
   private boolean[] T01743_n482ForColNom ;
   private int[] T01743_A483ForColNum ;
   private boolean[] T01743_n483ForColNum ;
   private byte[] T01743_A831TipColCod ;
   private boolean[] T01743_n831TipColCod ;
   private String[] T01743_A9766ForProC ;
   private java.math.BigDecimal[] T01743_A9768ForProPK ;
   private boolean[] T01743_n9768ForProPK ;
   private java.math.BigDecimal[] T01743_A9769ForProPM ;
   private boolean[] T01743_n9769ForProPM ;
   private java.util.Date[] T01743_A9770ForProFe ;
   private boolean[] T01743_n9770ForProFe ;
   private String[] T01743_A10137FacLam ;
   private boolean[] T01743_n10137FacLam ;
   private byte[] T01743_A10389ForProMc ;
   private boolean[] T01743_n10389ForProMc ;
   private String[] T01743_A396EmprCod ;
   private int[] T01743_A252CliCod ;
   private boolean[] T01743_n252CliCod ;
   private String[] T01742_A494ForSer ;
   private boolean[] T01742_n494ForSer ;
   private String[] T01742_A482ForColNom ;
   private boolean[] T01742_n482ForColNom ;
   private int[] T01742_A483ForColNum ;
   private boolean[] T01742_n483ForColNum ;
   private byte[] T01742_A831TipColCod ;
   private boolean[] T01742_n831TipColCod ;
   private String[] T01742_A9766ForProC ;
   private java.math.BigDecimal[] T01742_A9768ForProPK ;
   private boolean[] T01742_n9768ForProPK ;
   private java.math.BigDecimal[] T01742_A9769ForProPM ;
   private boolean[] T01742_n9769ForProPM ;
   private java.util.Date[] T01742_A9770ForProFe ;
   private boolean[] T01742_n9770ForProFe ;
   private String[] T01742_A10137FacLam ;
   private boolean[] T01742_n10137FacLam ;
   private byte[] T01742_A10389ForProMc ;
   private boolean[] T01742_n10389ForProMc ;
   private String[] T01742_A396EmprCod ;
   private int[] T01742_A252CliCod ;
   private boolean[] T01742_n252CliCod ;
   private String[] T017437_A396EmprCod ;
   private int[] T017437_A252CliCod ;
   private boolean[] T017437_n252CliCod ;
   private String[] T017437_A494ForSer ;
   private boolean[] T017437_n494ForSer ;
   private String[] T017437_A482ForColNom ;
   private boolean[] T017437_n482ForColNom ;
   private int[] T017437_A483ForColNum ;
   private boolean[] T017437_n483ForColNum ;
   private byte[] T017437_A831TipColCod ;
   private boolean[] T017437_n831TipColCod ;
   private String[] T017437_A9766ForProC ;
   private short[] T017437_A11282ForProLn ;
   private String[] T017438_A396EmprCod ;
   private int[] T017438_A252CliCod ;
   private boolean[] T017438_n252CliCod ;
   private String[] T017438_A494ForSer ;
   private boolean[] T017438_n494ForSer ;
   private String[] T017438_A482ForColNom ;
   private boolean[] T017438_n482ForColNom ;
   private int[] T017438_A483ForColNum ;
   private boolean[] T017438_n483ForColNum ;
   private byte[] T017438_A831TipColCod ;
   private boolean[] T017438_n831TipColCod ;
   private String[] T017438_A9766ForProC ;
   private java.util.Date[] T017438_A10288Hp_dia ;
   private String[] T017439_A396EmprCod ;
   private int[] T017439_A252CliCod ;
   private boolean[] T017439_n252CliCod ;
   private String[] T017439_A494ForSer ;
   private boolean[] T017439_n494ForSer ;
   private String[] T017439_A482ForColNom ;
   private boolean[] T017439_n482ForColNom ;
   private int[] T017439_A483ForColNum ;
   private boolean[] T017439_n483ForColNum ;
   private byte[] T017439_A831TipColCod ;
   private boolean[] T017439_n831TipColCod ;
   private String[] T017439_A9766ForProC ;
   private short[] T017439_A1067ForLinN ;
   private String[] T017440_A396EmprCod ;
   private int[] T017440_A252CliCod ;
   private boolean[] T017440_n252CliCod ;
   private String[] T017440_A494ForSer ;
   private boolean[] T017440_n494ForSer ;
   private String[] T017440_A482ForColNom ;
   private boolean[] T017440_n482ForColNom ;
   private int[] T017440_A483ForColNum ;
   private boolean[] T017440_n483ForColNum ;
   private byte[] T017440_A831TipColCod ;
   private boolean[] T017440_n831TipColCod ;
   private String[] T017440_A9766ForProC ;
   private short[] T017440_A9847ForProL ;
   private String[] T017441_A396EmprCod ;
   private int[] T017441_A252CliCod ;
   private boolean[] T017441_n252CliCod ;
   private String[] T017441_A494ForSer ;
   private boolean[] T017441_n494ForSer ;
   private String[] T017441_A482ForColNom ;
   private boolean[] T017441_n482ForColNom ;
   private int[] T017441_A483ForColNum ;
   private boolean[] T017441_n483ForColNum ;
   private byte[] T017441_A831TipColCod ;
   private boolean[] T017441_n831TipColCod ;
   private String[] T017441_A9766ForProC ;
   private String[] T017442_A407EmprNom ;
   private boolean[] T017442_n407EmprNom ;
   private String[] T017443_A279CliNom ;
   private String[] T017444_A832TipColDsc ;
   private boolean[] T017444_n832TipColDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tclarpdcl__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpdcl__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpdcl__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpdcl__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpdcl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01742", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProPK, ForProPM, ForProFe, FacLam, ForProMc, EmprCod, CliCod FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?  FOR UPDATE OF ForProPK, ForProPM, ForProFe, FacLam, ForProMc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01743", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProPK, ForProPM, ForProFe, FacLam, ForProMc, EmprCod, CliCod FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01744", "SELECT ForSer, ForColNom, ForColNum, ForSerDsc, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?  FOR UPDATE OF ForSerDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01745", "SELECT ForSer, ForColNom, ForColNum, ForSerDsc, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01746", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01747", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01748", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01749", "SELECT /*+ FIRST_ROWS(1) */ TM1.ForSer, TM1.ForColNom, TM1.ForColNum, T2.EmprNom, T3.CliNom, TM1.ForSerDsc, T4.TipColDsc, TM1.EmprCod, TM1.CliCod, TM1.TipColCod FROM (((TXPCFORMU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipColCod = TM1.TipColCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017410", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017411", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017412", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017413", "INSERT INTO TXPCFORMU(ForSer, ForColNom, ForColNum, ForSerDsc, EmprCod, CliCod, TipColCod, ForNumCol, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, ComUltLin, MacProCod, ForCosUti, ForRGB, ForCosForm, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForcosH20, ForCosFab, ForCosFin, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForObsFac, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T017414", "UPDATE TXPCFORMU SET ForSerDsc=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T017415", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new ForEachCursor("T017416", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNormaID FROM TXPFORNOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017417", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod FROM TXPENSCAB WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017418", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017419", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ColAqP FROM TXPPCOLAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017420", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017421", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017422", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC FROM TXPTAB000 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017423", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL FROM TXPFPCC WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017424", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017425", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017426", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017427", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017428", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017429", "SELECT * FROM (SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017430", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017431", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017432", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProPK, ForProPM, ForProFe, FacLam, ForProMc, EmprCod, CliCod FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017433", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017434", "INSERT INTO TXPCLARPD(ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProPK, ForProPM, ForProFe, FacLam, ForProMc, EmprCod, CliCod, ForUltLr, ForKgsMn, ForProUl, ForProKgs, FosCosFbk, ForcosCF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCLARPD")
         ,new UpdateCursor("T017435", "UPDATE TXPCLARPD SET ForProPK=?, ForProPM=?, ForProFe=?, FacLam=?, ForProMc=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new UpdateCursor("T017436", "DELETE FROM TXPCLARPD  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new ForEachCursor("T017437", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn FROM TXPCOSCR0 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017438", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017439", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN FROM TXPCLARPM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017440", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL FROM TXPFPCC WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017441", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017442", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017443", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017444", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 3);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 42 :
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(7, (String)parms[11], 8);
               return;
            case 2 :
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
               return;
            case 5 :
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
            case 6 :
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
            case 7 :
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 26);
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 13);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(5, (String)parms[8], 8);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[14]);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               stmt.setString(11, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[21]).intValue());
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 16);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 13);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[20]).byteValue());
               }
               stmt.setString(12, (String)parms[21], 8);
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
               stmt.setString(7, (String)parms[11], 8);
               return;
            case 35 :
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(7, (String)parms[11], 8);
               return;
            case 37 :
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(7, (String)parms[11], 8);
               return;
            case 39 :
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
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
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
            case 42 :
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

