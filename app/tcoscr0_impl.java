package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcoscr0_impl extends GXDataArea
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
         gx1asaforprod1BH1280( A396EmprCod, A9766ForProC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A831TipColCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
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
         A9766ForProC = httpContext.GetPar( "ForProC") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, A9766ForProC) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COSTE COLOR CON COSTE FABRICA COSTE AGUAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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
      nRC_GXsfl_85 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_85"))) ;
      nGXsfl_85_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_85_idx"))) ;
      sGXsfl_85_idx = httpContext.GetPar( "sGXsfl_85_idx") ;
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
      nRC_GXsfl_127 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_127"))) ;
      nGXsfl_127_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_127_idx"))) ;
      sGXsfl_127_idx = httpContext.GetPar( "sGXsfl_127_idx") ;
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

   public tcoscr0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcoscr0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcoscr0_impl.class ));
   }

   public tcoscr0_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCOSCR0.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtForSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Coste Formula", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCosForm_Internalname, GXutil.ltrim( localUtil.ntoc( A4380ForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCosForm_Enabled!=0) ? localUtil.format( A4380ForCosForm, "ZZZZ9.99999") : localUtil.format( A4380ForCosForm, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCosForm_Jsonclick, 0, "", "", "", "", "", 1, edtForCosForm_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Coste H20", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForcosH20_Internalname, GXutil.ltrim( localUtil.ntoc( A11279ForcosH20, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForcosH20_Enabled!=0) ? localUtil.format( A11279ForcosH20, "ZZZZ9.99999") : localUtil.format( A11279ForcosH20, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForcosH20_Jsonclick, 0, "", "", "", "", "", 1, edtForcosH20_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Coste Proceso Produccion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCosFab_Internalname, GXutil.ltrim( localUtil.ntoc( A11280ForCosFab, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCosFab_Enabled!=0) ? localUtil.format( A11280ForCosFab, "ZZZZ9.99999") : localUtil.format( A11280ForCosFab, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCosFab_Jsonclick, 0, "", "", "", "", "", 1, edtForCosFab_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Coste Final Color", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCosFin_Internalname, GXutil.ltrim( localUtil.ntoc( A11290ForCosFin, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCosFin_Enabled!=0) ? localUtil.format( A11290ForCosFin, "ZZZZ9.99999") : localUtil.format( A11290ForCosFin, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCosFin_Jsonclick, 0, "", "", "", "", "", 1, edtForCosFin_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSCR0.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol85( ) ;
      /* Save parent mode. */
      sMode1280 = Gx_mode ;
      nGXsfl_85_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1280 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1280 = (short)(1) ;
            scanStart1BH1280( ) ;
            while ( RcdFound1280 != 0 )
            {
               init_level_properties1280( ) ;
               getByPrimaryKey1BH1280( ) ;
               addRow1BH1280( ) ;
               scanNext1BH1280( ) ;
            }
            scanEnd1BH1280( ) ;
            nBlankRcdCount1280 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1BH1280( ) ;
         standaloneModal1BH1280( ) ;
         sMode1280 = Gx_mode ;
         while ( nGXsfl_85_idx < nRC_GXsfl_85 )
         {
            bGXsfl_85_Refreshing = true ;
            readRow1BH1280( ) ;
            edtForProC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtForProD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProD_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtForProUl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROUL_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProUl_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtForCosFbS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCOSFBS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForCosFbS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosFbS_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtForProKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROKGS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProKgs_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtFosCosFbk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FOSCOSFBK_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFosCosFbk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFosCosFbk_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            edtForcosCF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCOSCF_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForcosCF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForcosCF_Enabled), 5, 0), !bGXsfl_85_Refreshing);
            if ( ( nRcdExists_1280 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BH1280( ) ;
            }
            sendRow1BH1280( ) ;
            bGXsfl_85_Refreshing = false ;
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
            scanStart1BH1280( ) ;
            while ( RcdFound1280 != 0 )
            {
               sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_851280( ) ;
               init_level_properties1280( ) ;
               standaloneNotModal1BH1280( ) ;
               getByPrimaryKey1BH1280( ) ;
               standaloneModal1BH1280( ) ;
               addRow1BH1280( ) ;
               scanNext1BH1280( ) ;
            }
            scanEnd1BH1280( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1280 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_851280( ) ;
      initAll1BH1280( ) ;
      init_level_properties1280( ) ;
      nRcdExists_1280 = (short)(0) ;
      nIsMod_1280 = (short)(0) ;
      nRcdDeleted_1280 = (short)(0) ;
      nBlankRcdCount1280 = (short)(nBlankRcdUsr1280+nBlankRcdCount1280) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1280 > 0 )
      {
         standaloneNotModal1BH1280( ) ;
         standaloneModal1BH1280( ) ;
         addRow1BH1280( ) ;
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
      /* Restore parent mode. */
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSCR0.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCOSCR0.htm");
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
      e111BH2 ();
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
            Z5742ForSerDsc = httpContext.cgiGet( "Z5742ForSerDsc") ;
            Z4380ForCosForm = localUtil.ctond( httpContext.cgiGet( "Z4380ForCosForm")) ;
            Z11279ForcosH20 = localUtil.ctond( httpContext.cgiGet( "Z11279ForcosH20")) ;
            Z11280ForCosFab = localUtil.ctond( httpContext.cgiGet( "Z11280ForCosFab")) ;
            Z11290ForCosFin = localUtil.ctond( httpContext.cgiGet( "Z11290ForCosFin")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_85 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_85"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A483ForColNum = 0 ;
               n483ForColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            }
            else
            {
               A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n483ForColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A831TipColCod = (byte)(0) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            else
            {
               A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForCosForm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForCosForm_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOSFORM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForCosForm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4380ForCosForm = DecimalUtil.ZERO ;
               n4380ForCosForm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
            }
            else
            {
               A4380ForCosForm = localUtil.ctond( httpContext.cgiGet( edtForCosForm_Internalname)) ;
               n4380ForCosForm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForcosH20_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForcosH20_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOSH20");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForcosH20_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11279ForcosH20 = DecimalUtil.ZERO ;
               n11279ForcosH20 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11279ForcosH20", GXutil.ltrimstr( A11279ForcosH20, 11, 5));
            }
            else
            {
               A11279ForcosH20 = localUtil.ctond( httpContext.cgiGet( edtForcosH20_Internalname)) ;
               n11279ForcosH20 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11279ForcosH20", GXutil.ltrimstr( A11279ForcosH20, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForCosFab_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForCosFab_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOSFAB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForCosFab_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11280ForCosFab = DecimalUtil.ZERO ;
               n11280ForCosFab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11280ForCosFab", GXutil.ltrimstr( A11280ForCosFab, 11, 5));
            }
            else
            {
               A11280ForCosFab = localUtil.ctond( httpContext.cgiGet( edtForCosFab_Internalname)) ;
               n11280ForCosFab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11280ForCosFab", GXutil.ltrimstr( A11280ForCosFab, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForCosFin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForCosFin_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOSFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForCosFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11290ForCosFin = DecimalUtil.ZERO ;
               n11290ForCosFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11290ForCosFin", GXutil.ltrimstr( A11290ForCosFin, 11, 5));
            }
            else
            {
               A11290ForCosFin = localUtil.ctond( httpContext.cgiGet( edtForCosFin_Internalname)) ;
               n11290ForCosFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11290ForCosFin", GXutil.ltrimstr( A11290ForCosFin, 11, 5));
            }
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
                        e111BH2 ();
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
            initAll1BH47( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1506_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1506_Enabled), 5, 0), !bGXsfl_127_Refreshing);
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
      disableAttributes1BH47( ) ;
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

   public void confirm_1BH0( )
   {
      beforeValidate1BH47( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BH47( ) ;
         }
         else
         {
            checkExtendedTable1BH47( ) ;
            if ( AnyError == 0 )
            {
               zm1BH47( 5) ;
               zm1BH47( 6) ;
               zm1BH47( 7) ;
            }
            closeExtendedTableCursors1BH47( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode47 = Gx_mode ;
         confirm_1BH1280( ) ;
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
         confirmValues1BH0( ) ;
      }
   }

   public void confirm_1BH1506( )
   {
      s11287ForCosFbS = O11287ForCosFbS ;
      n11287ForCosFbS = false ;
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow1BH1506( ) ;
         if ( ( nRcdExists_1506 != 0 ) || ( nIsMod_1506 != 0 ) )
         {
            getKey1BH1506( ) ;
            if ( ( nRcdExists_1506 == 0 ) && ( nRcdDeleted_1506 == 0 ) )
            {
               if ( RcdFound1506 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BH1506( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BH1506( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BH1506( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11287ForCosFbS = A11287ForCosFbS ;
                     n11287ForCosFbS = false ;
                  }
               }
               else
               {
                  GXCCtl = "FORPROC_" + sGXsfl_85_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtForProC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1506 != 0 )
               {
                  if ( nRcdDeleted_1506 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BH1506( ) ;
                     load1BH1506( ) ;
                     beforeValidate1BH1506( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BH1506( ) ;
                        O11287ForCosFbS = A11287ForCosFbS ;
                        n11287ForCosFbS = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1506 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BH1506( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BH1506( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BH1506( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11287ForCosFbS = A11287ForCosFbS ;
                           n11287ForCosFbS = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1506 == 0 )
                  {
                     GXCCtl = "FORPROC_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForProC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1506_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11282ForProLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProFs_Internalname, GXutil.rtrim( A11284ForProFs)) ;
         httpContext.changePostValue( edtForProFsT_Internalname, GXutil.ltrim( localUtil.ntoc( A11285ForProFsT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProMq_Internalname, GXutil.rtrim( A11286ForProMq)) ;
         httpContext.changePostValue( edtForProMqC_Internalname, GXutil.ltrim( localUtil.ntoc( A11283ForProMqC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProCfl_Internalname, GXutil.ltrim( localUtil.ntoc( A11288ForProCfl, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11282ForProLn_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11282ForProLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11284ForProFs_"+sGXsfl_127_idx, GXutil.rtrim( Z11284ForProFs)) ;
         httpContext.changePostValue( "ZT_"+"Z11285ForProFsT_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11285ForProFsT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11286ForProMq_"+sGXsfl_127_idx, GXutil.rtrim( Z11286ForProMq)) ;
         httpContext.changePostValue( "ZT_"+"Z11283ForProMqC_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11283ForProMqC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11288ForProCfl_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( O11288ForProCfl, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1506_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1506_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1506_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1506 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1506_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1506_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROLN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFS_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFST_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFsT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROMQ_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROMQC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMqC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROCFL_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProCfl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11287ForCosFbS = s11287ForCosFbS ;
      n11287ForCosFbS = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1BH1280( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow1BH1280( ) ;
         if ( ( nRcdExists_1280 != 0 ) || ( nIsMod_1280 != 0 ) )
         {
            getKey1BH1280( ) ;
            if ( ( nRcdExists_1280 == 0 ) && ( nRcdDeleted_1280 == 0 ) )
            {
               if ( RcdFound1280 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BH1280( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BH1280( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1BH1280( 9) ;
                     }
                     closeExtendedTableCursors1BH1280( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1280 = Gx_mode ;
                        confirm_1BH1506( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1280 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1280 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "FORPROC_" + sGXsfl_85_idx ;
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
                     getByPrimaryKey1BH1280( ) ;
                     load1BH1280( ) ;
                     beforeValidate1BH1280( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BH1280( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1280 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BH1280( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BH1280( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1BH1280( 9) ;
                           }
                           closeExtendedTableCursors1BH1280( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1280 = Gx_mode ;
                              confirm_1BH1506( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1280 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1280 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1280 == 0 )
                  {
                     GXCCtl = "FORPROC_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForProC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtForProC_Internalname, GXutil.rtrim( A9766ForProC)) ;
         httpContext.changePostValue( edtForProD_Internalname, GXutil.rtrim( A9767ForProD)) ;
         httpContext.changePostValue( edtForProUl_Internalname, GXutil.ltrim( localUtil.ntoc( A11281ForProUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForCosFbS_Internalname, GXutil.ltrim( localUtil.ntoc( A11287ForCosFbS, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A11289ForProKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFosCosFbk_Internalname, GXutil.ltrim( localUtil.ntoc( A11291FosCosFbk, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForcosCF_Internalname, GXutil.ltrim( localUtil.ntoc( A11292ForcosCF, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9766ForProC_"+sGXsfl_85_idx, GXutil.rtrim( Z9766ForProC)) ;
         httpContext.changePostValue( "ZT_"+"Z11281ForProUl_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11281ForProUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11289ForProKgs_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11289ForProKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11291FosCosFbk_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11291FosCosFbk, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11292ForcosCF_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11292ForcosCF, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11287ForCosFbS_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O11287ForCosFbS, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_127_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1280_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1280_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1280_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1280 != 0 )
         {
            httpContext.changePostValue( "FORPROC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROUL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProUl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCOSFBS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCosFbS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROKGS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FOSCOSFBK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFosCosFbk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCOSCF_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForcosCF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BH0( )
   {
   }

   public void e111BH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcoscr0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tcoscr0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcoscr0_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcoscr0_impl.this.A396EmprCod = GXv_char2[0] ;
      tcoscr0_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcoscr0_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1BH47( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5742ForSerDsc = T01BH9_A5742ForSerDsc[0] ;
            Z4380ForCosForm = T01BH9_A4380ForCosForm[0] ;
            Z11279ForcosH20 = T01BH9_A11279ForcosH20[0] ;
            Z11280ForCosFab = T01BH9_A11280ForCosFab[0] ;
            Z11290ForCosFin = T01BH9_A11290ForCosFin[0] ;
         }
         else
         {
            Z5742ForSerDsc = A5742ForSerDsc ;
            Z4380ForCosForm = A4380ForCosForm ;
            Z11279ForcosH20 = A11279ForcosH20 ;
            Z11280ForCosFab = A11280ForCosFab ;
            Z11290ForCosFin = A11290ForCosFin ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z5742ForSerDsc = A5742ForSerDsc ;
         Z4380ForCosForm = A4380ForCosForm ;
         Z11279ForcosH20 = A11279ForcosH20 ;
         Z11280ForCosFab = A11280ForCosFab ;
         Z11290ForCosFin = A11290ForCosFin ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TCOSCR0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01BH10 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BH10_A407EmprNom[0] ;
      n407EmprNom = T01BH10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void load1BH47( )
   {
      /* Using cursor T01BH13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A407EmprNom = T01BH13_A407EmprNom[0] ;
         n407EmprNom = T01BH13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01BH13_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5742ForSerDsc = T01BH13_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01BH13_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A4380ForCosForm = T01BH13_A4380ForCosForm[0] ;
         n4380ForCosForm = T01BH13_n4380ForCosForm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
         A11279ForcosH20 = T01BH13_A11279ForcosH20[0] ;
         n11279ForcosH20 = T01BH13_n11279ForcosH20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11279ForcosH20", GXutil.ltrimstr( A11279ForcosH20, 11, 5));
         A11280ForCosFab = T01BH13_A11280ForCosFab[0] ;
         n11280ForCosFab = T01BH13_n11280ForCosFab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11280ForCosFab", GXutil.ltrimstr( A11280ForCosFab, 11, 5));
         A11290ForCosFin = T01BH13_A11290ForCosFin[0] ;
         n11290ForCosFin = T01BH13_n11290ForCosFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11290ForCosFin", GXutil.ltrimstr( A11290ForCosFin, 11, 5));
         zm1BH47( -4) ;
      }
      pr_default.close(10);
      onLoadActions1BH47( ) ;
   }

   public void onLoadActions1BH47( )
   {
   }

   public void checkExtendedTable1BH47( )
   {
      nIsDirty_47 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01BH11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01BH11_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(8);
      /* Using cursor T01BH12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(9);
   }

   public void closeExtendedTableCursors1BH47( )
   {
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01BH14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01BH14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_7( String A396EmprCod ,
                         byte A831TipColCod )
   {
      /* Using cursor T01BH15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey1BH47( )
   {
      /* Using cursor T01BH16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BH9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01BH9_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BH47( 4) ;
         RcdFound47 = (short)(1) ;
         A494ForSer = T01BH9_A494ForSer[0] ;
         n494ForSer = T01BH9_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01BH9_A482ForColNom[0] ;
         n482ForColNom = T01BH9_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01BH9_A483ForColNum[0] ;
         n483ForColNum = T01BH9_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A5742ForSerDsc = T01BH9_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01BH9_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A4380ForCosForm = T01BH9_A4380ForCosForm[0] ;
         n4380ForCosForm = T01BH9_n4380ForCosForm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
         A11279ForcosH20 = T01BH9_A11279ForcosH20[0] ;
         n11279ForcosH20 = T01BH9_n11279ForcosH20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11279ForcosH20", GXutil.ltrimstr( A11279ForcosH20, 11, 5));
         A11280ForCosFab = T01BH9_A11280ForCosFab[0] ;
         n11280ForCosFab = T01BH9_n11280ForCosFab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11280ForCosFab", GXutil.ltrimstr( A11280ForCosFab, 11, 5));
         A11290ForCosFin = T01BH9_A11290ForCosFin[0] ;
         n11290ForCosFin = T01BH9_n11290ForCosFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11290ForCosFin", GXutil.ltrimstr( A11290ForCosFin, 11, 5));
         A252CliCod = T01BH9_A252CliCod[0] ;
         n252CliCod = T01BH9_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A831TipColCod = T01BH9_A831TipColCod[0] ;
         n831TipColCod = T01BH9_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
         load1BH47( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKey1BH47( ) ;
         }
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey1BH47( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1BH47( ) ;
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
      /* Using cursor T01BH17 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01BH17_A252CliCod[0] < A252CliCod ) || ( T01BH17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BH17_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T01BH17_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BH17_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T01BH17_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01BH17_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH17_A252CliCod[0] == A252CliCod ) && ( T01BH17_A483ForColNum[0] < A483ForColNum ) || ( T01BH17_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01BH17_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01BH17_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH17_A252CliCod[0] == A252CliCod ) && ( T01BH17_A831TipColCod[0] < A831TipColCod ) ) && ( GXutil.strcmp(T01BH17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01BH17_A252CliCod[0] > A252CliCod ) || ( T01BH17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BH17_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T01BH17_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BH17_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T01BH17_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01BH17_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH17_A252CliCod[0] == A252CliCod ) && ( T01BH17_A483ForColNum[0] > A483ForColNum ) || ( T01BH17_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01BH17_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01BH17_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH17_A252CliCod[0] == A252CliCod ) && ( T01BH17_A831TipColCod[0] > A831TipColCod ) ) && ( GXutil.strcmp(T01BH17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01BH17_A252CliCod[0] ;
            n252CliCod = T01BH17_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T01BH17_A494ForSer[0] ;
            n494ForSer = T01BH17_n494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T01BH17_A482ForColNom[0] ;
            n482ForColNom = T01BH17_n482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T01BH17_A483ForColNum[0] ;
            n483ForColNum = T01BH17_n483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T01BH17_A831TipColCod[0] ;
            n831TipColCod = T01BH17_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T01BH18 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T01BH18_A252CliCod[0] > A252CliCod ) || ( T01BH18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BH18_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T01BH18_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BH18_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T01BH18_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01BH18_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH18_A252CliCod[0] == A252CliCod ) && ( T01BH18_A483ForColNum[0] > A483ForColNum ) || ( T01BH18_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01BH18_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01BH18_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH18_A252CliCod[0] == A252CliCod ) && ( T01BH18_A831TipColCod[0] > A831TipColCod ) ) && ( GXutil.strcmp(T01BH18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T01BH18_A252CliCod[0] < A252CliCod ) || ( T01BH18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BH18_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T01BH18_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH18_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01BH18_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T01BH18_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01BH18_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH18_A252CliCod[0] == A252CliCod ) && ( T01BH18_A483ForColNum[0] < A483ForColNum ) || ( T01BH18_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01BH18_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01BH18_A494ForSer[0], A494ForSer) == 0 ) && ( T01BH18_A252CliCod[0] == A252CliCod ) && ( T01BH18_A831TipColCod[0] < A831TipColCod ) ) && ( GXutil.strcmp(T01BH18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01BH18_A252CliCod[0] ;
            n252CliCod = T01BH18_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T01BH18_A494ForSer[0] ;
            n494ForSer = T01BH18_n494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T01BH18_A482ForColNom[0] ;
            n482ForColNom = T01BH18_n482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T01BH18_A483ForColNum[0] ;
            n483ForColNum = T01BH18_n483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T01BH18_A831TipColCod[0] ;
            n831TipColCod = T01BH18_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BH47( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BH47( ) ;
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
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = Z494ForSer ;
               n494ForSer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = Z482ForColNom ;
               n482ForColNom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = Z483ForColNum ;
               n483ForColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = Z831TipColCod ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1BH47( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
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
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1BH47( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1BH47( ) ;
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
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = Z494ForSer ;
         n494ForSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = Z482ForColNom ;
         n482ForColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = Z483ForColNum ;
         n483ForColNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = Z831TipColCod ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      getKey1BH47( ) ;
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
            A252CliCod = Z252CliCod ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = Z494ForSer ;
            n494ForSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = Z482ForColNom ;
            n482ForColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = Z483ForColNum ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = Z831TipColCod ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcoscr0");
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1BH0( ) ;
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
      scanStart1BH47( ) ;
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
      scanEnd1BH47( ) ;
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
      scanStart1BH47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound47 != 0 )
         {
            scanNext1BH47( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BH47( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BH47( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BH8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z5742ForSerDsc, T01BH8_A5742ForSerDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z4380ForCosForm, T01BH8_A4380ForCosForm[0]) != 0 ) || ( DecimalUtil.compareTo(Z11279ForcosH20, T01BH8_A11279ForcosH20[0]) != 0 ) || ( DecimalUtil.compareTo(Z11280ForCosFab, T01BH8_A11280ForCosFab[0]) != 0 ) || ( DecimalUtil.compareTo(Z11290ForCosFin, T01BH8_A11290ForCosFin[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5742ForSerDsc, T01BH8_A5742ForSerDsc[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForSerDsc");
               GXutil.writeLogRaw("Old: ",Z5742ForSerDsc);
               GXutil.writeLogRaw("Current: ",T01BH8_A5742ForSerDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z4380ForCosForm, T01BH8_A4380ForCosForm[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForCosForm");
               GXutil.writeLogRaw("Old: ",Z4380ForCosForm);
               GXutil.writeLogRaw("Current: ",T01BH8_A4380ForCosForm[0]);
            }
            if ( DecimalUtil.compareTo(Z11279ForcosH20, T01BH8_A11279ForcosH20[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForcosH20");
               GXutil.writeLogRaw("Old: ",Z11279ForcosH20);
               GXutil.writeLogRaw("Current: ",T01BH8_A11279ForcosH20[0]);
            }
            if ( DecimalUtil.compareTo(Z11280ForCosFab, T01BH8_A11280ForCosFab[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForCosFab");
               GXutil.writeLogRaw("Old: ",Z11280ForCosFab);
               GXutil.writeLogRaw("Current: ",T01BH8_A11280ForCosFab[0]);
            }
            if ( DecimalUtil.compareTo(Z11290ForCosFin, T01BH8_A11290ForCosFin[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForCosFin");
               GXutil.writeLogRaw("Old: ",Z11290ForCosFin);
               GXutil.writeLogRaw("Current: ",T01BH8_A11290ForCosFin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BH47( )
   {
      beforeValidate1BH47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BH47( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BH47( 0) ;
         checkOptimisticConcurrency1BH47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BH47( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BH47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BH19 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n11279ForcosH20), A11279ForcosH20, Boolean.valueOf(n11280ForCosFab), A11280ForCosFab, Boolean.valueOf(n11290ForCosFin), A11290ForCosFin, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(16) == 1) )
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
                        processLevel1BH47( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BH0( ) ;
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
            load1BH47( ) ;
         }
         endLevel1BH47( ) ;
      }
      closeExtendedTableCursors1BH47( ) ;
   }

   public void update1BH47( )
   {
      beforeValidate1BH47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BH47( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BH47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BH47( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BH47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BH20 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, Boolean.valueOf(n4380ForCosForm), A4380ForCosForm, Boolean.valueOf(n11279ForcosH20), A11279ForcosH20, Boolean.valueOf(n11280ForCosFab), A11280ForCosFab, Boolean.valueOf(n11290ForCosFin), A11290ForCosFin, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BH47( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BH47( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BH0( ) ;
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
         endLevel1BH47( ) ;
      }
      closeExtendedTableCursors1BH47( ) ;
   }

   public void deferredUpdate1BH47( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BH47( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BH47( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BH47( ) ;
         afterConfirm1BH47( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BH47( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BH21 */
               pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
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
                        initAll1BH47( ) ;
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
                     resetCaption1BH0( ) ;
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
      sMode47 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BH47( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BH47( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01BH22 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01BH22_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01BH23 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01BH24 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CABECERA ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01BH25 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOPCD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01BH26 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01BH27 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCACP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01BH28 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORMQPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01BH29 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01BH30 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPDCL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01BH31 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01BH32 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01BH33 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01BH34 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01BH35 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01BH36 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01BH37 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOBFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
      }
   }

   public void processNestedLevel1BH1280( )
   {
      nGXsfl_85_idx = 0 ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         readRow1BH1280( ) ;
         if ( ( nRcdExists_1280 != 0 ) || ( nIsMod_1280 != 0 ) )
         {
            standaloneNotModal1BH1280( ) ;
            getKey1BH1280( ) ;
            if ( ( nRcdExists_1280 == 0 ) && ( nRcdDeleted_1280 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BH1280( ) ;
            }
            else
            {
               if ( RcdFound1280 != 0 )
               {
                  if ( ( nRcdDeleted_1280 != 0 ) && ( nRcdExists_1280 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BH1280( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1280 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BH1280( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1280 == 0 )
                  {
                     GXCCtl = "FORPROC_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForProC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtForProC_Internalname, GXutil.rtrim( A9766ForProC)) ;
         httpContext.changePostValue( edtForProD_Internalname, GXutil.rtrim( A9767ForProD)) ;
         httpContext.changePostValue( edtForProUl_Internalname, GXutil.ltrim( localUtil.ntoc( A11281ForProUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForCosFbS_Internalname, GXutil.ltrim( localUtil.ntoc( A11287ForCosFbS, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A11289ForProKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFosCosFbk_Internalname, GXutil.ltrim( localUtil.ntoc( A11291FosCosFbk, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForcosCF_Internalname, GXutil.ltrim( localUtil.ntoc( A11292ForcosCF, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9766ForProC_"+sGXsfl_85_idx, GXutil.rtrim( Z9766ForProC)) ;
         httpContext.changePostValue( "ZT_"+"Z11281ForProUl_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11281ForProUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11289ForProKgs_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11289ForProKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11291FosCosFbk_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11291FosCosFbk, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11292ForcosCF_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( Z11292ForcosCF, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11287ForCosFbS_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( O11287ForCosFbS, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_127_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_127, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1280_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1280_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1280_"+sGXsfl_85_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1280 != 0 )
         {
            httpContext.changePostValue( "FORPROC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROUL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProUl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCOSFBS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCosFbS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROKGS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FOSCOSFBK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFosCosFbk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCOSCF_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForcosCF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BH1280( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1280 = (short)(0) ;
      nIsMod_1280 = (short)(0) ;
      nRcdDeleted_1280 = (short)(0) ;
   }

   public void processLevel1BH47( )
   {
      /* Save parent mode. */
      sMode47 = Gx_mode ;
      processNestedLevel1BH1280( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BH47( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BH47( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcoscr0");
         if ( AnyError == 0 )
         {
            confirmValues1BH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcoscr0");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BH47( )
   {
      /* Scan By routine */
      /* Using cursor T01BH38 */
      pr_default.execute(35, new Object[] {A396EmprCod});
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A252CliCod = T01BH38_A252CliCod[0] ;
         n252CliCod = T01BH38_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T01BH38_A494ForSer[0] ;
         n494ForSer = T01BH38_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01BH38_A482ForColNom[0] ;
         n482ForColNom = T01BH38_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01BH38_A483ForColNum[0] ;
         n483ForColNum = T01BH38_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T01BH38_A831TipColCod[0] ;
         n831TipColCod = T01BH38_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BH47( )
   {
      /* Scan next routine */
      pr_default.readNext(35);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A252CliCod = T01BH38_A252CliCod[0] ;
         n252CliCod = T01BH38_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T01BH38_A494ForSer[0] ;
         n494ForSer = T01BH38_n494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01BH38_A482ForColNom[0] ;
         n482ForColNom = T01BH38_n482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01BH38_A483ForColNum[0] ;
         n483ForColNum = T01BH38_n483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T01BH38_A831TipColCod[0] ;
         n831TipColCod = T01BH38_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
   }

   public void scanEnd1BH47( )
   {
      pr_default.close(35);
   }

   public void afterConfirm1BH47( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BH47( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BH47( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BH47( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BH47( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BH47( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BH47( )
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
      edtForCosForm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCosForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosForm_Enabled), 5, 0), true);
      edtForcosH20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForcosH20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForcosH20_Enabled), 5, 0), true);
      edtForCosFab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCosFab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosFab_Enabled), 5, 0), true);
      edtForCosFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCosFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosFin_Enabled), 5, 0), true);
   }

   public void zm1BH1280( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11281ForProUl = T01BH5_A11281ForProUl[0] ;
            Z11289ForProKgs = T01BH5_A11289ForProKgs[0] ;
            Z11291FosCosFbk = T01BH5_A11291FosCosFbk[0] ;
            Z11292ForcosCF = T01BH5_A11292ForcosCF[0] ;
         }
         else
         {
            Z11281ForProUl = A11281ForProUl ;
            Z11289ForProKgs = A11289ForProKgs ;
            Z11291FosCosFbk = A11291FosCosFbk ;
            Z11292ForcosCF = A11292ForcosCF ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z11281ForProUl = A11281ForProUl ;
         Z11289ForProKgs = A11289ForProKgs ;
         Z11291FosCosFbk = A11291FosCosFbk ;
         Z11292ForcosCF = A11292ForcosCF ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z11287ForCosFbS = A11287ForCosFbS ;
      }
   }

   public void standaloneNotModal1BH1280( )
   {
   }

   public void standaloneModal1BH1280( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtForProC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
      else
      {
         edtForProC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      }
   }

   public void load1BH1280( )
   {
      /* Using cursor T01BH40 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1280 = (short)(1) ;
         A11281ForProUl = T01BH40_A11281ForProUl[0] ;
         n11281ForProUl = T01BH40_n11281ForProUl[0] ;
         A11289ForProKgs = T01BH40_A11289ForProKgs[0] ;
         n11289ForProKgs = T01BH40_n11289ForProKgs[0] ;
         A11291FosCosFbk = T01BH40_A11291FosCosFbk[0] ;
         n11291FosCosFbk = T01BH40_n11291FosCosFbk[0] ;
         A11292ForcosCF = T01BH40_A11292ForcosCF[0] ;
         n11292ForcosCF = T01BH40_n11292ForcosCF[0] ;
         A11287ForCosFbS = T01BH40_A11287ForCosFbS[0] ;
         n11287ForCosFbS = T01BH40_n11287ForCosFbS[0] ;
         zm1BH1280( -8) ;
      }
      pr_default.close(36);
      onLoadActions1BH1280( ) ;
   }

   public void onLoadActions1BH1280( )
   {
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tcoscr0_impl.this.A396EmprCod = GXv_char4[0] ;
      tcoscr0_impl.this.A9766ForProC = GXv_char3[0] ;
      tcoscr0_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9767ForProD = GXt_char1 ;
   }

   public void checkExtendedTable1BH1280( )
   {
      nIsDirty_1280 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BH1280( ) ;
      /* Using cursor T01BH7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A11287ForCosFbS = T01BH7_A11287ForCosFbS[0] ;
         n11287ForCosFbS = T01BH7_n11287ForCosFbS[0] ;
      }
      else
      {
         nIsDirty_1280 = (short)(1) ;
         A11287ForCosFbS = DecimalUtil.doubleToDec(0) ;
         n11287ForCosFbS = false ;
      }
      pr_default.close(4);
      nIsDirty_1280 = (short)(1) ;
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tcoscr0_impl.this.A396EmprCod = GXv_char4[0] ;
      tcoscr0_impl.this.A9766ForProC = GXv_char3[0] ;
      tcoscr0_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9767ForProD = GXt_char1 ;
   }

   public void closeExtendedTableCursors1BH1280( )
   {
      pr_default.close(4);
   }

   public void enableDisable1BH1280( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         int A252CliCod ,
                         String A494ForSer ,
                         String A482ForColNom ,
                         int A483ForColNum ,
                         byte A831TipColCod ,
                         String A9766ForProC )
   {
      /* Using cursor T01BH42 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(37) != 101) )
      {
         A11287ForCosFbS = T01BH42_A11287ForCosFbS[0] ;
         n11287ForCosFbS = T01BH42_n11287ForCosFbS[0] ;
      }
      else
      {
         A11287ForCosFbS = DecimalUtil.doubleToDec(0) ;
         n11287ForCosFbS = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11287ForCosFbS, (byte)(11), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(37) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(37);
   }

   public void getKey1BH1280( )
   {
      /* Using cursor T01BH43 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1280 = (short)(1) ;
      }
      else
      {
         RcdFound1280 = (short)(0) ;
      }
      pr_default.close(38);
   }

   public void getByPrimaryKey1BH1280( )
   {
      /* Using cursor T01BH5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01BH5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BH1280( 8) ;
         RcdFound1280 = (short)(1) ;
         initializeNonKey1BH1280( ) ;
         A9766ForProC = T01BH5_A9766ForProC[0] ;
         A11281ForProUl = T01BH5_A11281ForProUl[0] ;
         n11281ForProUl = T01BH5_n11281ForProUl[0] ;
         A11289ForProKgs = T01BH5_A11289ForProKgs[0] ;
         n11289ForProKgs = T01BH5_n11289ForProKgs[0] ;
         A11291FosCosFbk = T01BH5_A11291FosCosFbk[0] ;
         n11291FosCosFbk = T01BH5_n11291FosCosFbk[0] ;
         A11292ForcosCF = T01BH5_A11292ForcosCF[0] ;
         n11292ForcosCF = T01BH5_n11292ForcosCF[0] ;
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
         standaloneModal1BH1280( ) ;
         load1BH1280( ) ;
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1280 = (short)(0) ;
         initializeNonKey1BH1280( ) ;
         sMode1280 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BH1280( ) ;
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BH1280( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1BH1280( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11281ForProUl != T01BH4_A11281ForProUl[0] ) || ( DecimalUtil.compareTo(Z11289ForProKgs, T01BH4_A11289ForProKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z11291FosCosFbk, T01BH4_A11291FosCosFbk[0]) != 0 ) || ( DecimalUtil.compareTo(Z11292ForcosCF, T01BH4_A11292ForcosCF[0]) != 0 ) )
         {
            if ( Z11281ForProUl != T01BH4_A11281ForProUl[0] )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForProUl");
               GXutil.writeLogRaw("Old: ",Z11281ForProUl);
               GXutil.writeLogRaw("Current: ",T01BH4_A11281ForProUl[0]);
            }
            if ( DecimalUtil.compareTo(Z11289ForProKgs, T01BH4_A11289ForProKgs[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForProKgs");
               GXutil.writeLogRaw("Old: ",Z11289ForProKgs);
               GXutil.writeLogRaw("Current: ",T01BH4_A11289ForProKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z11291FosCosFbk, T01BH4_A11291FosCosFbk[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"FosCosFbk");
               GXutil.writeLogRaw("Old: ",Z11291FosCosFbk);
               GXutil.writeLogRaw("Current: ",T01BH4_A11291FosCosFbk[0]);
            }
            if ( DecimalUtil.compareTo(Z11292ForcosCF, T01BH4_A11292ForcosCF[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForcosCF");
               GXutil.writeLogRaw("Old: ",Z11292ForcosCF);
               GXutil.writeLogRaw("Current: ",T01BH4_A11292ForcosCF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLARPD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BH1280( )
   {
      beforeValidate1BH1280( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BH1280( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BH1280( 0) ;
         checkOptimisticConcurrency1BH1280( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BH1280( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BH1280( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BH44 */
                  pr_default.execute(39, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Boolean.valueOf(n11281ForProUl), Short.valueOf(A11281ForProUl), Boolean.valueOf(n11289ForProKgs), A11289ForProKgs, Boolean.valueOf(n11291FosCosFbk), A11291FosCosFbk, Boolean.valueOf(n11292ForcosCF), A11292ForcosCF, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
                  if ( (pr_default.getStatus(39) == 1) )
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
                        processLevel1BH1280( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load1BH1280( ) ;
         }
         endLevel1BH1280( ) ;
      }
      closeExtendedTableCursors1BH1280( ) ;
   }

   public void update1BH1280( )
   {
      beforeValidate1BH1280( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BH1280( ) ;
      }
      if ( ( nIsMod_1280 != 0 ) || ( nIsDirty_1280 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BH1280( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BH1280( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BH1280( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BH45 */
                     pr_default.execute(40, new Object[] {Boolean.valueOf(n11281ForProUl), Short.valueOf(A11281ForProUl), Boolean.valueOf(n11289ForProKgs), A11289ForProKgs, Boolean.valueOf(n11291FosCosFbk), A11291FosCosFbk, Boolean.valueOf(n11292ForcosCF), A11292ForcosCF, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
                     if ( (pr_default.getStatus(40) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BH1280( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1BH1280( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1BH1280( ) ;
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
            endLevel1BH1280( ) ;
         }
      }
      closeExtendedTableCursors1BH1280( ) ;
   }

   public void deferredUpdate1BH1280( )
   {
   }

   public void delete1BH1280( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BH1280( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BH1280( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BH1280( ) ;
         afterConfirm1BH1280( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BH1280( ) ;
            if ( AnyError == 0 )
            {
               A11287ForCosFbS = O11287ForCosFbS ;
               n11287ForCosFbS = false ;
               scanStart1BH1506( ) ;
               while ( RcdFound1506 != 0 )
               {
                  getByPrimaryKey1BH1506( ) ;
                  delete1BH1506( ) ;
                  scanNext1BH1506( ) ;
                  O11287ForCosFbS = A11287ForCosFbS ;
                  n11287ForCosFbS = false ;
               }
               scanEnd1BH1506( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BH46 */
                  pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
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
      }
      sMode1280 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BH1280( ) ;
      Gx_mode = sMode1280 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BH1280( )
   {
      standaloneModal1BH1280( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01BH48 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(42) != 101) )
         {
            A11287ForCosFbS = T01BH48_A11287ForCosFbS[0] ;
            n11287ForCosFbS = T01BH48_n11287ForCosFbS[0] ;
         }
         else
         {
            A11287ForCosFbS = DecimalUtil.doubleToDec(0) ;
            n11287ForCosFbS = false ;
         }
         pr_default.close(42);
         GXt_char1 = A9767ForProD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A9766ForProC ;
         GXv_char2[0] = GXt_char1 ;
         new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tcoscr0_impl.this.A396EmprCod = GXv_char4[0] ;
         tcoscr0_impl.this.A9766ForProC = GXv_char3[0] ;
         tcoscr0_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9767ForProD = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01BH49 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR0200", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01BH50 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPMn", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01BH51 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FPCC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
      }
   }

   public void processNestedLevel1BH1506( )
   {
      s11287ForCosFbS = O11287ForCosFbS ;
      n11287ForCosFbS = false ;
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow1BH1506( ) ;
         if ( ( nRcdExists_1506 != 0 ) || ( nIsMod_1506 != 0 ) )
         {
            standaloneNotModal1BH1506( ) ;
            getKey1BH1506( ) ;
            if ( ( nRcdExists_1506 == 0 ) && ( nRcdDeleted_1506 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BH1506( ) ;
            }
            else
            {
               if ( RcdFound1506 != 0 )
               {
                  if ( ( nRcdDeleted_1506 != 0 ) && ( nRcdExists_1506 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BH1506( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1506 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BH1506( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1506 == 0 )
                  {
                     GXCCtl = "FORPROC_" + sGXsfl_85_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForProC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11287ForCosFbS = A11287ForCosFbS ;
            n11287ForCosFbS = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1506_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11282ForProLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProFs_Internalname, GXutil.rtrim( A11284ForProFs)) ;
         httpContext.changePostValue( edtForProFsT_Internalname, GXutil.ltrim( localUtil.ntoc( A11285ForProFsT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProMq_Internalname, GXutil.rtrim( A11286ForProMq)) ;
         httpContext.changePostValue( edtForProMqC_Internalname, GXutil.ltrim( localUtil.ntoc( A11283ForProMqC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForProCfl_Internalname, GXutil.ltrim( localUtil.ntoc( A11288ForProCfl, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11282ForProLn_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11282ForProLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11284ForProFs_"+sGXsfl_127_idx, GXutil.rtrim( Z11284ForProFs)) ;
         httpContext.changePostValue( "ZT_"+"Z11285ForProFsT_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11285ForProFsT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11286ForProMq_"+sGXsfl_127_idx, GXutil.rtrim( Z11286ForProMq)) ;
         httpContext.changePostValue( "ZT_"+"Z11283ForProMqC_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z11283ForProMqC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11288ForProCfl_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( O11288ForProCfl, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1506_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1506_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1506_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1506 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1506_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1506_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROLN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFS_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROFST_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFsT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROMQ_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROMQC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMqC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPROCFL_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProCfl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BH1506( ) ;
      if ( AnyError != 0 )
      {
         O11287ForCosFbS = s11287ForCosFbS ;
         n11287ForCosFbS = false ;
      }
      nRcdExists_1506 = (short)(0) ;
      nIsMod_1506 = (short)(0) ;
      nRcdDeleted_1506 = (short)(0) ;
   }

   public void processLevel1BH1280( )
   {
      /* Save parent mode. */
      sMode1280 = Gx_mode ;
      processNestedLevel1BH1506( ) ;
      if ( AnyError != 0 )
      {
         O11287ForCosFbS = s11287ForCosFbS ;
         n11287ForCosFbS = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1280 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BH1280( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BH1280( )
   {
      /* Scan By routine */
      /* Using cursor T01BH52 */
      pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound1280 = (short)(0) ;
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound1280 = (short)(1) ;
         A9766ForProC = T01BH52_A9766ForProC[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BH1280( )
   {
      /* Scan next routine */
      pr_default.readNext(46);
      RcdFound1280 = (short)(0) ;
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound1280 = (short)(1) ;
         A9766ForProC = T01BH52_A9766ForProC[0] ;
      }
   }

   public void scanEnd1BH1280( )
   {
      pr_default.close(46);
   }

   public void afterConfirm1BH1280( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BH1280( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BH1280( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BH1280( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BH1280( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BH1280( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BH1280( )
   {
      edtForProC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtForProD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProD_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtForProUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProUl_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtForCosFbS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCosFbS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCosFbS_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtForProKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProKgs_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtFosCosFbk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFosCosFbk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFosCosFbk_Enabled), 5, 0), !bGXsfl_85_Refreshing);
      edtForcosCF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForcosCF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForcosCF_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void zm1BH1506( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11284ForProFs = T01BH3_A11284ForProFs[0] ;
            Z11285ForProFsT = T01BH3_A11285ForProFsT[0] ;
            Z11286ForProMq = T01BH3_A11286ForProMq[0] ;
            Z11283ForProMqC = T01BH3_A11283ForProMqC[0] ;
         }
         else
         {
            Z11284ForProFs = A11284ForProFs ;
            Z11285ForProFsT = A11285ForProFsT ;
            Z11286ForProMq = A11286ForProMq ;
            Z11283ForProMqC = A11283ForProMqC ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z11282ForProLn = A11282ForProLn ;
         Z11284ForProFs = A11284ForProFs ;
         Z11285ForProFsT = A11285ForProFsT ;
         Z11286ForProMq = A11286ForProMq ;
         Z11283ForProMqC = A11283ForProMqC ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1BH1506( )
   {
   }

   public void standaloneModal1BH1506( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtForProLn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForProLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProLn_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtForProLn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForProLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProLn_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      }
   }

   public void load1BH1506( )
   {
      /* Using cursor T01BH53 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A11282ForProLn)});
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound1506 = (short)(1) ;
         A11284ForProFs = T01BH53_A11284ForProFs[0] ;
         n11284ForProFs = T01BH53_n11284ForProFs[0] ;
         A11285ForProFsT = T01BH53_A11285ForProFsT[0] ;
         n11285ForProFsT = T01BH53_n11285ForProFsT[0] ;
         A11286ForProMq = T01BH53_A11286ForProMq[0] ;
         n11286ForProMq = T01BH53_n11286ForProMq[0] ;
         A11283ForProMqC = T01BH53_A11283ForProMqC[0] ;
         n11283ForProMqC = T01BH53_n11283ForProMqC[0] ;
         zm1BH1506( -10) ;
      }
      pr_default.close(47);
      onLoadActions1BH1506( ) ;
   }

   public void onLoadActions1BH1506( )
   {
      A11288ForProCfl = GXutil.roundDecimal( (A11283ForProMqC.multiply(DecimalUtil.doubleToDec(A11285ForProFsT))), 2) ;
      O11288ForProCfl = A11288ForProCfl ;
      if ( isIns( )  )
      {
         A11287ForCosFbS = O11287ForCosFbS.add(A11288ForProCfl) ;
         n11287ForCosFbS = false ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A11287ForCosFbS = O11287ForCosFbS.add(A11288ForProCfl).subtract(O11288ForProCfl) ;
            n11287ForCosFbS = false ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A11287ForCosFbS = O11287ForCosFbS.subtract(O11288ForProCfl) ;
               n11287ForCosFbS = false ;
            }
         }
      }
   }

   public void checkExtendedTable1BH1506( )
   {
      nIsDirty_1506 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BH1506( ) ;
      nIsDirty_1506 = (short)(1) ;
      A11288ForProCfl = GXutil.roundDecimal( (A11283ForProMqC.multiply(DecimalUtil.doubleToDec(A11285ForProFsT))), 2) ;
      if ( isIns( )  )
      {
         nIsDirty_1506 = (short)(1) ;
         A11287ForCosFbS = O11287ForCosFbS.add(A11288ForProCfl) ;
         n11287ForCosFbS = false ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1506 = (short)(1) ;
            A11287ForCosFbS = O11287ForCosFbS.add(A11288ForProCfl).subtract(O11288ForProCfl) ;
            n11287ForCosFbS = false ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1506 = (short)(1) ;
               A11287ForCosFbS = O11287ForCosFbS.subtract(O11288ForProCfl) ;
               n11287ForCosFbS = false ;
            }
         }
      }
   }

   public void closeExtendedTableCursors1BH1506( )
   {
   }

   public void enableDisable1BH1506( )
   {
   }

   public void getKey1BH1506( )
   {
      /* Using cursor T01BH54 */
      pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A11282ForProLn)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1506 = (short)(1) ;
      }
      else
      {
         RcdFound1506 = (short)(0) ;
      }
      pr_default.close(48);
   }

   public void getByPrimaryKey1BH1506( )
   {
      /* Using cursor T01BH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A11282ForProLn)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01BH3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BH1506( 10) ;
         RcdFound1506 = (short)(1) ;
         initializeNonKey1BH1506( ) ;
         A11282ForProLn = T01BH3_A11282ForProLn[0] ;
         A11284ForProFs = T01BH3_A11284ForProFs[0] ;
         n11284ForProFs = T01BH3_n11284ForProFs[0] ;
         A11285ForProFsT = T01BH3_A11285ForProFsT[0] ;
         n11285ForProFsT = T01BH3_n11285ForProFsT[0] ;
         A11286ForProMq = T01BH3_A11286ForProMq[0] ;
         n11286ForProMq = T01BH3_n11286ForProMq[0] ;
         A11283ForProMqC = T01BH3_A11283ForProMqC[0] ;
         n11283ForProMqC = T01BH3_n11283ForProMqC[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z11282ForProLn = A11282ForProLn ;
         sMode1506 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BH1506( ) ;
         load1BH1506( ) ;
         Gx_mode = sMode1506 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1506 = (short)(0) ;
         initializeNonKey1BH1506( ) ;
         sMode1506 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BH1506( ) ;
         Gx_mode = sMode1506 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BH1506( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BH1506( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A11282ForProLn)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSCR0"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11284ForProFs, T01BH2_A11284ForProFs[0]) != 0 ) || ( Z11285ForProFsT != T01BH2_A11285ForProFsT[0] ) || ( GXutil.strcmp(Z11286ForProMq, T01BH2_A11286ForProMq[0]) != 0 ) || ( DecimalUtil.compareTo(Z11283ForProMqC, T01BH2_A11283ForProMqC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11284ForProFs, T01BH2_A11284ForProFs[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForProFs");
               GXutil.writeLogRaw("Old: ",Z11284ForProFs);
               GXutil.writeLogRaw("Current: ",T01BH2_A11284ForProFs[0]);
            }
            if ( Z11285ForProFsT != T01BH2_A11285ForProFsT[0] )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForProFsT");
               GXutil.writeLogRaw("Old: ",Z11285ForProFsT);
               GXutil.writeLogRaw("Current: ",T01BH2_A11285ForProFsT[0]);
            }
            if ( GXutil.strcmp(Z11286ForProMq, T01BH2_A11286ForProMq[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForProMq");
               GXutil.writeLogRaw("Old: ",Z11286ForProMq);
               GXutil.writeLogRaw("Current: ",T01BH2_A11286ForProMq[0]);
            }
            if ( DecimalUtil.compareTo(Z11283ForProMqC, T01BH2_A11283ForProMqC[0]) != 0 )
            {
               GXutil.writeLogln("tcoscr0:[seudo value changed for attri]"+"ForProMqC");
               GXutil.writeLogRaw("Old: ",Z11283ForProMqC);
               GXutil.writeLogRaw("Current: ",T01BH2_A11283ForProMqC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCOSCR0"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BH1506( )
   {
      beforeValidate1BH1506( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BH1506( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BH1506( 0) ;
         checkOptimisticConcurrency1BH1506( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BH1506( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BH1506( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BH55 */
                  pr_default.execute(49, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A11282ForProLn), Boolean.valueOf(n11284ForProFs), A11284ForProFs, Boolean.valueOf(n11285ForProFsT), Short.valueOf(A11285ForProFsT), Boolean.valueOf(n11286ForProMq), A11286ForProMq, Boolean.valueOf(n11283ForProMqC), A11283ForProMqC, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSCR0");
                  if ( (pr_default.getStatus(49) == 1) )
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
            load1BH1506( ) ;
         }
         endLevel1BH1506( ) ;
      }
      closeExtendedTableCursors1BH1506( ) ;
   }

   public void update1BH1506( )
   {
      beforeValidate1BH1506( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BH1506( ) ;
      }
      if ( ( nIsMod_1506 != 0 ) || ( nIsDirty_1506 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BH1506( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BH1506( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BH1506( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BH56 */
                     pr_default.execute(50, new Object[] {Boolean.valueOf(n11284ForProFs), A11284ForProFs, Boolean.valueOf(n11285ForProFsT), Short.valueOf(A11285ForProFsT), Boolean.valueOf(n11286ForProMq), A11286ForProMq, Boolean.valueOf(n11283ForProMqC), A11283ForProMqC, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A11282ForProLn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSCR0");
                     if ( (pr_default.getStatus(50) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOSCR0"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BH1506( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BH1506( ) ;
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
            endLevel1BH1506( ) ;
         }
      }
      closeExtendedTableCursors1BH1506( ) ;
   }

   public void deferredUpdate1BH1506( )
   {
   }

   public void delete1BH1506( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BH1506( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BH1506( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BH1506( ) ;
         afterConfirm1BH1506( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BH1506( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BH57 */
               pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A11282ForProLn)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOSCR0");
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
      sMode1506 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BH1506( ) ;
      Gx_mode = sMode1506 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BH1506( )
   {
      standaloneModal1BH1506( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A11288ForProCfl = GXutil.roundDecimal( (A11283ForProMqC.multiply(DecimalUtil.doubleToDec(A11285ForProFsT))), 2) ;
         if ( isIns( )  )
         {
            A11287ForCosFbS = O11287ForCosFbS.add(A11288ForProCfl) ;
            n11287ForCosFbS = false ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A11287ForCosFbS = O11287ForCosFbS.add(A11288ForProCfl).subtract(O11288ForProCfl) ;
               n11287ForCosFbS = false ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A11287ForCosFbS = O11287ForCosFbS.subtract(O11288ForProCfl) ;
                  n11287ForCosFbS = false ;
               }
            }
         }
      }
   }

   public void endLevel1BH1506( )
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

   public void scanStart1BH1506( )
   {
      /* Scan By routine */
      /* Using cursor T01BH58 */
      pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      RcdFound1506 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound1506 = (short)(1) ;
         A11282ForProLn = T01BH58_A11282ForProLn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BH1506( )
   {
      /* Scan next routine */
      pr_default.readNext(52);
      RcdFound1506 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound1506 = (short)(1) ;
         A11282ForProLn = T01BH58_A11282ForProLn[0] ;
      }
   }

   public void scanEnd1BH1506( )
   {
      pr_default.close(52);
   }

   public void afterConfirm1BH1506( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BH1506( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BH1506( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BH1506( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BH1506( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BH1506( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BH1506( )
   {
      edtForProLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProLn_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtForProFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFs_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtForProFsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProFsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFsT_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtForProMq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProMq_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtForProMqC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProMqC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProMqC_Enabled), 5, 0), !bGXsfl_127_Refreshing);
      edtForProCfl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProCfl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProCfl_Enabled), 5, 0), !bGXsfl_127_Refreshing);
   }

   public void send_integrity_lvl_hashes1BH1506( )
   {
   }

   public void send_integrity_lvl_hashes1BH1280( )
   {
   }

   public void send_integrity_lvl_hashes1BH47( )
   {
   }

   public void subsflControlProps_851280( )
   {
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_85_idx ;
      edtForProC_Internalname = "FORPROC_"+sGXsfl_85_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_85_idx ;
      edtForProD_Internalname = "FORPROD_"+sGXsfl_85_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_85_idx ;
      edtForProUl_Internalname = "FORPROUL_"+sGXsfl_85_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_85_idx ;
      edtForCosFbS_Internalname = "FORCOSFBS_"+sGXsfl_85_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_85_idx ;
      edtForProKgs_Internalname = "FORPROKGS_"+sGXsfl_85_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_85_idx ;
      edtFosCosFbk_Internalname = "FOSCOSFBK_"+sGXsfl_85_idx ;
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_85_idx ;
      edtForcosCF_Internalname = "FORCOSCF_"+sGXsfl_85_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_85_idx ;
   }

   public void subsflControlProps_fel_851280( )
   {
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_85_fel_idx ;
      edtForProC_Internalname = "FORPROC_"+sGXsfl_85_fel_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_85_fel_idx ;
      edtForProD_Internalname = "FORPROD_"+sGXsfl_85_fel_idx ;
      lblTextblock16_Internalname = "TEXTBLOCK16_"+sGXsfl_85_fel_idx ;
      edtForProUl_Internalname = "FORPROUL_"+sGXsfl_85_fel_idx ;
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_85_fel_idx ;
      edtForCosFbS_Internalname = "FORCOSFBS_"+sGXsfl_85_fel_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_85_fel_idx ;
      edtForProKgs_Internalname = "FORPROKGS_"+sGXsfl_85_fel_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_85_fel_idx ;
      edtFosCosFbk_Internalname = "FOSCOSFBK_"+sGXsfl_85_fel_idx ;
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_85_fel_idx ;
      edtForcosCF_Internalname = "FORCOSCF_"+sGXsfl_85_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_85_fel_idx ;
   }

   public void addRow1BH1280( )
   {
      nRC_GXsfl_127 = 0 ;
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851280( ) ;
      sendRow1BH1280( ) ;
   }

   public void sendRow1BH1280( )
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
         if ( ((int)((nGXsfl_85_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_85_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_85_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_85_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "Proceso Produccion", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProC_Internalname,GXutil.rtrim( A9766ForProC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProC_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtForProC_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,httpContext.getMessage( "Descripcion", ""),"","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProD_Internalname,GXutil.rtrim( A9767ForProD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProD_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtForProD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock16_Internalname,httpContext.getMessage( "Ultima Linea", ""),"","",lblTextblock16_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProUl_Internalname,GXutil.ltrim( localUtil.ntoc( A11281ForProUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11281ForProUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11281ForProUl), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProUl_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtForProUl_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "Suma Coste Fab", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForCosFbS_Internalname,GXutil.ltrim( localUtil.ntoc( A11287ForCosFbS, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForCosFbS_Enabled!=0) ? localUtil.format( A11287ForCosFbS, "ZZZZ9.99999") : localUtil.format( A11287ForCosFbS, "ZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForCosFbS_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtForCosFbS_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(11),"chr",Integer.valueOf(1),"row",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock18_Internalname,httpContext.getMessage( "Kilos Simulacion Coste FAB", ""),"","",lblTextblock18_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A11289ForProKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProKgs_Enabled!=0) ? localUtil.format( A11289ForProKgs, "ZZZZZ9.99") : localUtil.format( A11289ForProKgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProKgs_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtForProKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock19_Internalname,httpContext.getMessage( "Coste Fab (Euro/kilo)", ""),"","",lblTextblock19_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFosCosFbk_Internalname,GXutil.ltrim( localUtil.ntoc( A11291FosCosFbk, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFosCosFbk_Enabled!=0) ? localUtil.format( A11291FosCosFbk, "ZZZZ9.99999") : localUtil.format( A11291FosCosFbk, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFosCosFbk_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFosCosFbk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(11),"chr",Integer.valueOf(1),"row",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock20_Internalname,httpContext.getMessage( "Coste Final Color por Procesos", ""),"","",lblTextblock20_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_85_idx + "',85)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForcosCF_Internalname,GXutil.ltrim( localUtil.ntoc( A11292ForcosCF, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForcosCF_Enabled!=0) ? localUtil.format( A11292ForcosCF, "ZZZZ9.99999") : localUtil.format( A11292ForcosCF, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForcosCF_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtForcosCF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(11),"chr",Integer.valueOf(1),"row",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(85),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol127( ) ;
      nGXsfl_127_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1506 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1506 = (short)(1) ;
            scanStart1BH1506( ) ;
            while ( RcdFound1506 != 0 )
            {
               init_level_properties1506( ) ;
               getByPrimaryKey1BH1506( ) ;
               addRow1BH1506( ) ;
               scanNext1BH1506( ) ;
            }
            scanEnd1BH1506( ) ;
            nBlankRcdCount1506 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11287ForCosFbS = A11287ForCosFbS ;
         n11287ForCosFbS = false ;
         standaloneNotModal1BH1506( ) ;
         standaloneModal1BH1506( ) ;
         sMode1506 = Gx_mode ;
         while ( nGXsfl_127_idx < nRC_GXsfl_127 )
         {
            bGXsfl_127_Refreshing = true ;
            readRow1BH1506( ) ;
            edtavnRcdDeleted_1506_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1506_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1506_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1506_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtForProLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROLN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProLn_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtForProFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFS_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFs_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtForProFsT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFST_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProFsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProFsT_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtForProMq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROMQ_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProMq_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtForProMqC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROMQC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProMqC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProMqC_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            edtForProCfl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROCFL_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForProCfl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProCfl_Enabled), 5, 0), !bGXsfl_127_Refreshing);
            if ( ( nRcdExists_1506 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BH1506( ) ;
            }
            sendRow1BH1506( ) ;
            bGXsfl_127_Refreshing = false ;
         }
         Gx_mode = sMode1506 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11287ForCosFbS = B11287ForCosFbS ;
         n11287ForCosFbS = false ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1506 = (short)(5) ;
         nRcdExists_1506 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BH1506( ) ;
            while ( RcdFound1506 != 0 )
            {
               sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx+1), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
               subsflControlProps_1271506( ) ;
               init_level_properties1506( ) ;
               standaloneNotModal1BH1506( ) ;
               getByPrimaryKey1BH1506( ) ;
               standaloneModal1BH1506( ) ;
               addRow1BH1506( ) ;
               scanNext1BH1506( ) ;
            }
            scanEnd1BH1506( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1506 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx+1), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
      subsflControlProps_1271506( ) ;
      initAll1BH1506( ) ;
      init_level_properties1506( ) ;
      B11287ForCosFbS = A11287ForCosFbS ;
      n11287ForCosFbS = false ;
      nRcdExists_1506 = (short)(0) ;
      nIsMod_1506 = (short)(0) ;
      nRcdDeleted_1506 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 85 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_85_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1506 = (short)(nBlankRcdUsr1506+nBlankRcdCount1506) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1506 > 0 )
      {
         standaloneNotModal1BH1506( ) ;
         standaloneModal1BH1506( ) ;
         addRow1BH1506( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtForProLn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1506 = (short)(nBlankRcdCount1506-1) ;
      }
      Gx_mode = sMode1506 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11287ForCosFbS = B11287ForCosFbS ;
      n11287ForCosFbS = false ;
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_85_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_85_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_85_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BH1280( ) ;
      GXCCtl = "Z9766ForProC_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9766ForProC));
      GXCCtl = "Z11281ForProUl_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11281ForProUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11289ForProKgs_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11289ForProKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11291FosCosFbk_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11291FosCosFbk, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11292ForcosCF_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11292ForcosCF, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O11287ForCosFbS_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11287ForCosFbS, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_127_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1280_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1280_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1280_" + sGXsfl_85_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1280, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROC_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROD_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROUL_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProUl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCOSFBS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCosFbS_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROKGS_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FOSCOSFBK_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFosCosFbk_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCOSCF_"+sGXsfl_85_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForcosCF_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_85_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BH1280( )
   {
      nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851280( ) ;
      edtForProC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROC_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROD_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProUl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROUL_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForCosFbS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCOSFBS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROKGS_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFosCosFbk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FOSCOSFBK_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForcosCF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCOSCF_"+sGXsfl_85_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A9766ForProC = httpContext.cgiGet( edtForProC_Internalname) ;
      A9767ForProD = httpContext.cgiGet( edtForProD_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForProUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForProUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FORPROUL_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProUl_Internalname ;
         wbErr = true ;
         A11281ForProUl = (short)(0) ;
         n11281ForProUl = false ;
      }
      else
      {
         A11281ForProUl = (short)(localUtil.ctol( httpContext.cgiGet( edtForProUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11281ForProUl = false ;
      }
      A11287ForCosFbS = localUtil.ctond( httpContext.cgiGet( edtForCosFbS_Internalname)) ;
      n11287ForCosFbS = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForProKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForProKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FORPROKGS_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProKgs_Internalname ;
         wbErr = true ;
         A11289ForProKgs = DecimalUtil.ZERO ;
         n11289ForProKgs = false ;
      }
      else
      {
         A11289ForProKgs = localUtil.ctond( httpContext.cgiGet( edtForProKgs_Internalname)) ;
         n11289ForProKgs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFosCosFbk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFosCosFbk_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "FOSCOSFBK_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFosCosFbk_Internalname ;
         wbErr = true ;
         A11291FosCosFbk = DecimalUtil.ZERO ;
         n11291FosCosFbk = false ;
      }
      else
      {
         A11291FosCosFbk = localUtil.ctond( httpContext.cgiGet( edtFosCosFbk_Internalname)) ;
         n11291FosCosFbk = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForcosCF_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForcosCF_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORCOSCF_" + sGXsfl_85_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForcosCF_Internalname ;
         wbErr = true ;
         A11292ForcosCF = DecimalUtil.ZERO ;
         n11292ForcosCF = false ;
      }
      else
      {
         A11292ForcosCF = localUtil.ctond( httpContext.cgiGet( edtForcosCF_Internalname)) ;
         n11292ForcosCF = false ;
      }
      GXCCtl = "Z9766ForProC_" + sGXsfl_85_idx ;
      Z9766ForProC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11281ForProUl_" + sGXsfl_85_idx ;
      Z11281ForProUl = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11289ForProKgs_" + sGXsfl_85_idx ;
      Z11289ForProKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11291FosCosFbk_" + sGXsfl_85_idx ;
      Z11291FosCosFbk = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11292ForcosCF_" + sGXsfl_85_idx ;
      Z11292ForcosCF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O11287ForCosFbS_" + sGXsfl_85_idx ;
      O11287ForCosFbS = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_85_idx ;
      nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1280_" + sGXsfl_85_idx ;
      nRcdDeleted_1280 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1280_" + sGXsfl_85_idx ;
      nRcdExists_1280 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1280_" + sGXsfl_85_idx ;
      nIsMod_1280 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_127_" + sGXsfl_85_idx ;
      nRC_GXsfl_127 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1271506( )
   {
      edtavnRcdDeleted_1506_Internalname = "vNRCDDELETED_1506_"+sGXsfl_127_idx ;
      edtForProLn_Internalname = "FORPROLN_"+sGXsfl_127_idx ;
      edtForProFs_Internalname = "FORPROFS_"+sGXsfl_127_idx ;
      edtForProFsT_Internalname = "FORPROFST_"+sGXsfl_127_idx ;
      edtForProMq_Internalname = "FORPROMQ_"+sGXsfl_127_idx ;
      edtForProMqC_Internalname = "FORPROMQC_"+sGXsfl_127_idx ;
      edtForProCfl_Internalname = "FORPROCFL_"+sGXsfl_127_idx ;
   }

   public void subsflControlProps_fel_1271506( )
   {
      edtavnRcdDeleted_1506_Internalname = "vNRCDDELETED_1506_"+sGXsfl_127_fel_idx ;
      edtForProLn_Internalname = "FORPROLN_"+sGXsfl_127_fel_idx ;
      edtForProFs_Internalname = "FORPROFS_"+sGXsfl_127_fel_idx ;
      edtForProFsT_Internalname = "FORPROFST_"+sGXsfl_127_fel_idx ;
      edtForProMq_Internalname = "FORPROMQ_"+sGXsfl_127_fel_idx ;
      edtForProMqC_Internalname = "FORPROMQC_"+sGXsfl_127_fel_idx ;
      edtForProCfl_Internalname = "FORPROCFL_"+sGXsfl_127_fel_idx ;
   }

   public void addRow1BH1506( )
   {
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
      subsflControlProps_1271506( ) ;
      sendRow1BH1506( ) ;
   }

   public void sendRow1BH1506( )
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
         if ( ((int)((nGXsfl_127_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1506_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1506_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1506_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1506), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1506), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1506_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1506_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1506_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProLn_Internalname,GXutil.ltrim( localUtil.ntoc( A11282ForProLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11282ForProLn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProLn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProLn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1506_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProFs_Internalname,GXutil.rtrim( A11284ForProFs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProFs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1506_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProFsT_Internalname,GXutil.ltrim( localUtil.ntoc( A11285ForProFsT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProFsT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11285ForProFsT), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11285ForProFsT), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProFsT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProFsT_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1506_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProMq_Internalname,GXutil.rtrim( A11286ForProMq),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProMq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProMq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1506_" + sGXsfl_127_idx + "',1);gx.fn.setControlValue('nIsMod_1280_" + sGXsfl_85_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProMqC_Internalname,GXutil.ltrim( localUtil.ntoc( A11283ForProMqC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProMqC_Enabled!=0) ? localUtil.format( A11283ForProMqC, "ZZZZZ9.99") : localUtil.format( A11283ForProMqC, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProMqC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProMqC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForProCfl_Internalname,GXutil.ltrim( localUtil.ntoc( A11288ForProCfl, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForProCfl_Enabled!=0) ? localUtil.format( A11288ForProCfl, "ZZZZ9.99999") : localUtil.format( A11288ForProCfl, "ZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForProCfl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForProCfl_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(127),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1BH1506( ) ;
      GXCCtl = "Z11282ForProLn_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11282ForProLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11284ForProFs_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11284ForProFs));
      GXCCtl = "Z11285ForProFsT_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11285ForProFsT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11286ForProMq_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11286ForProMq));
      GXCCtl = "Z11283ForProMqC_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11283ForProMqC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O11288ForProCfl_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11288ForProCfl, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1506_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1506_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1506_" + sGXsfl_127_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1506, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1506_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1506_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROLN_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROFS_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROFST_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFsT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROMQ_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROMQC_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMqC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPROCFL_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForProCfl_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1BH1506( )
   {
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
      subsflControlProps_1271506( ) ;
      edtavnRcdDeleted_1506_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1506_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROLN_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFS_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProFsT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROFST_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProMq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROMQ_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProMqC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROMQC_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForProCfl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPROCFL_"+sGXsfl_127_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1506_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1506_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1506");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1506_Internalname ;
         wbErr = true ;
         nRcdDeleted_1506 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1506 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1506_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForProLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForProLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FORPROLN_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProLn_Internalname ;
         wbErr = true ;
         A11282ForProLn = (short)(0) ;
      }
      else
      {
         A11282ForProLn = (short)(localUtil.ctol( httpContext.cgiGet( edtForProLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11284ForProFs = httpContext.cgiGet( edtForProFs_Internalname) ;
      n11284ForProFs = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForProFsT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForProFsT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FORPROFST_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProFsT_Internalname ;
         wbErr = true ;
         A11285ForProFsT = (short)(0) ;
         n11285ForProFsT = false ;
      }
      else
      {
         A11285ForProFsT = (short)(localUtil.ctol( httpContext.cgiGet( edtForProFsT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11285ForProFsT = false ;
      }
      A11286ForProMq = httpContext.cgiGet( edtForProMq_Internalname) ;
      n11286ForProMq = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForProMqC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForProMqC_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FORPROMQC_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForProMqC_Internalname ;
         wbErr = true ;
         A11283ForProMqC = DecimalUtil.ZERO ;
         n11283ForProMqC = false ;
      }
      else
      {
         A11283ForProMqC = localUtil.ctond( httpContext.cgiGet( edtForProMqC_Internalname)) ;
         n11283ForProMqC = false ;
      }
      A11288ForProCfl = localUtil.ctond( httpContext.cgiGet( edtForProCfl_Internalname)) ;
      GXCCtl = "Z11282ForProLn_" + sGXsfl_127_idx ;
      Z11282ForProLn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11284ForProFs_" + sGXsfl_127_idx ;
      Z11284ForProFs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11285ForProFsT_" + sGXsfl_127_idx ;
      Z11285ForProFsT = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11286ForProMq_" + sGXsfl_127_idx ;
      Z11286ForProMq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11283ForProMqC_" + sGXsfl_127_idx ;
      Z11283ForProMqC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O11288ForProCfl_" + sGXsfl_127_idx ;
      O11288ForProCfl = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1506_" + sGXsfl_127_idx ;
      nRcdDeleted_1506 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1506_" + sGXsfl_127_idx ;
      nRcdExists_1506 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1506_" + sGXsfl_127_idx ;
      nIsMod_1506 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtForProLn_Enabled = edtForProLn_Enabled ;
      defedtForProC_Enabled = edtForProC_Enabled ;
   }

   public void confirmValues1BH0( )
   {
      nGXsfl_85_idx = 0 ;
      sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_851280( ) ;
      while ( nGXsfl_85_idx < nRC_GXsfl_85 )
      {
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851280( ) ;
         httpContext.changePostValue( "Z9766ForProC_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z9766ForProC_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9766ForProC_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z11281ForProUl_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z11281ForProUl_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11281ForProUl_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z11289ForProKgs_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z11289ForProKgs_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11289ForProKgs_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z11291FosCosFbk_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z11291FosCosFbk_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11291FosCosFbk_"+sGXsfl_85_idx) ;
         httpContext.changePostValue( "Z11292ForcosCF_"+sGXsfl_85_idx, httpContext.cgiGet( "ZT_"+"Z11292ForcosCF_"+sGXsfl_85_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11292ForcosCF_"+sGXsfl_85_idx) ;
      }
      nGXsfl_127_idx = 0 ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
      subsflControlProps_1271506( ) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
         subsflControlProps_1271506( ) ;
         httpContext.changePostValue( "Z11282ForProLn_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z11282ForProLn_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11282ForProLn_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z11284ForProFs_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z11284ForProFs_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11284ForProFs_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z11285ForProFsT_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z11285ForProFsT_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11285ForProFsT_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z11286ForProMq_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z11286ForProMq_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11286ForProMq_"+sGXsfl_127_idx) ;
         httpContext.changePostValue( "Z11283ForProMqC_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z11283ForProMqC_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11283ForProMqC_"+sGXsfl_127_idx) ;
      }
      httpContext.changePostValue( "O11287ForCosFbS", httpContext.cgiGet( "T11287ForCosFbS")) ;
      httpContext.deletePostValue( "T11287ForCosFbS") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcoscr0", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4380ForCosForm", GXutil.ltrim( localUtil.ntoc( Z4380ForCosForm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11279ForcosH20", GXutil.ltrim( localUtil.ntoc( Z11279ForcosH20, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11280ForCosFab", GXutil.ltrim( localUtil.ntoc( Z11280ForCosFab, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11290ForCosFin", GXutil.ltrim( localUtil.ntoc( Z11290ForCosFin, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_85", GXutil.ltrim( localUtil.ntoc( nGXsfl_85_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcoscr0", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCOSCR0" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COSTE COLOR CON COSTE FABRICA COSTE AGUAS", "") ;
   }

   public void initializeNonKey1BH47( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A5742ForSerDsc = "" ;
      n5742ForSerDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      A4380ForCosForm = DecimalUtil.ZERO ;
      n4380ForCosForm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrimstr( A4380ForCosForm, 11, 5));
      A11279ForcosH20 = DecimalUtil.ZERO ;
      n11279ForcosH20 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11279ForcosH20", GXutil.ltrimstr( A11279ForcosH20, 11, 5));
      A11280ForCosFab = DecimalUtil.ZERO ;
      n11280ForCosFab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11280ForCosFab", GXutil.ltrimstr( A11280ForCosFab, 11, 5));
      A11290ForCosFin = DecimalUtil.ZERO ;
      n11290ForCosFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11290ForCosFin", GXutil.ltrimstr( A11290ForCosFin, 11, 5));
      Z5742ForSerDsc = "" ;
      Z4380ForCosForm = DecimalUtil.ZERO ;
      Z11279ForcosH20 = DecimalUtil.ZERO ;
      Z11280ForCosFab = DecimalUtil.ZERO ;
      Z11290ForCosFin = DecimalUtil.ZERO ;
   }

   public void initAll1BH47( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A494ForSer = "" ;
      n494ForSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      A482ForColNom = "" ;
      n482ForColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      A483ForColNum = 0 ;
      n483ForColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      initializeNonKey1BH47( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BH1280( )
   {
      A9767ForProD = "" ;
      A11281ForProUl = (short)(0) ;
      n11281ForProUl = false ;
      A11287ForCosFbS = DecimalUtil.ZERO ;
      n11287ForCosFbS = false ;
      A11289ForProKgs = DecimalUtil.ZERO ;
      n11289ForProKgs = false ;
      A11291FosCosFbk = DecimalUtil.ZERO ;
      n11291FosCosFbk = false ;
      A11292ForcosCF = DecimalUtil.ZERO ;
      n11292ForcosCF = false ;
      O11287ForCosFbS = A11287ForCosFbS ;
      n11287ForCosFbS = false ;
      Z11281ForProUl = (short)(0) ;
      Z11289ForProKgs = DecimalUtil.ZERO ;
      Z11291FosCosFbk = DecimalUtil.ZERO ;
      Z11292ForcosCF = DecimalUtil.ZERO ;
   }

   public void initAll1BH1280( )
   {
      A9766ForProC = "" ;
      initializeNonKey1BH1280( ) ;
   }

   public void standaloneModalInsert1BH1280( )
   {
   }

   public void initializeNonKey1BH1506( )
   {
      A11288ForProCfl = DecimalUtil.ZERO ;
      A11284ForProFs = "" ;
      n11284ForProFs = false ;
      A11285ForProFsT = (short)(0) ;
      n11285ForProFsT = false ;
      A11286ForProMq = "" ;
      n11286ForProMq = false ;
      A11283ForProMqC = DecimalUtil.ZERO ;
      n11283ForProMqC = false ;
      O11288ForProCfl = A11288ForProCfl ;
      Z11284ForProFs = "" ;
      Z11285ForProFsT = (short)(0) ;
      Z11286ForProMq = "" ;
      Z11283ForProMqC = DecimalUtil.ZERO ;
   }

   public void initAll1BH1506( )
   {
      A11282ForProLn = (short)(0) ;
      initializeNonKey1BH1506( ) ;
   }

   public void standaloneModalInsert1BH1506( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565397", true, true);
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
      httpContext.AddJavascriptSource("tcoscr0.js", "?20268241565397", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1280( )
   {
      edtForProC_Enabled = defedtForProC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), !bGXsfl_85_Refreshing);
   }

   public void init_level_properties1506( )
   {
      edtForProLn_Enabled = defedtForProLn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProLn_Enabled), 5, 0), !bGXsfl_127_Refreshing);
   }

   public void startgridcontrol85( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock14_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9766ForProC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock15_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9767ForProD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock16_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11281ForProUl, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProUl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock17_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11287ForCosFbS, (byte)(11), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForCosFbS_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock18_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11289ForProKgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock19_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11291FosCosFbk, (byte)(11), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFosCosFbk_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock20_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11292ForcosCF, (byte)(11), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForcosCF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol127( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1506, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1506_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11282ForProLn, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A11284ForProFs));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11285ForProFsT, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProFsT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A11286ForProMq));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11283ForProMqC, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProMqC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11288ForProCfl, (byte)(11), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForProCfl_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtForCosForm_Internalname = "FORCOSFORM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtForcosH20_Internalname = "FORCOSH20" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtForCosFab_Internalname = "FORCOSFAB" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtForCosFin_Internalname = "FORCOSFIN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtForProC_Internalname = "FORPROC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtForProD_Internalname = "FORPROD" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtForProUl_Internalname = "FORPROUL" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtForCosFbS_Internalname = "FORCOSFBS" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtForProKgs_Internalname = "FORPROKGS" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtFosCosFbk_Internalname = "FOSCOSFBK" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtForcosCF_Internalname = "FORCOSCF" ;
      edtavnRcdDeleted_1506_Internalname = "vNRCDDELETED_1506" ;
      edtForProLn_Internalname = "FORPROLN" ;
      edtForProFs_Internalname = "FORPROFS" ;
      edtForProFsT_Internalname = "FORPROFST" ;
      edtForProMq_Internalname = "FORPROMQ" ;
      edtForProMqC_Internalname = "FORPROMQC" ;
      edtForProCfl_Internalname = "FORPROCFL" ;
      tblTable3_Internalname = "TABLE3" ;
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
      lblTextblock20_Caption = httpContext.getMessage( "Coste Final Color por Procesos", "") ;
      lblTextblock19_Caption = httpContext.getMessage( "Coste Fab (Euro/kilo)", "") ;
      lblTextblock18_Caption = httpContext.getMessage( "Kilos Simulacion Coste FAB", "") ;
      lblTextblock17_Caption = httpContext.getMessage( "Suma Coste Fab", "") ;
      lblTextblock16_Caption = httpContext.getMessage( "Ultima Linea", "") ;
      lblTextblock15_Caption = httpContext.getMessage( "Descripcion", "") ;
      lblTextblock14_Caption = httpContext.getMessage( "Proceso Produccion", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "COSTE COLOR CON COSTE FABRICA COSTE AGUAS", "") );
      edtForProCfl_Jsonclick = "" ;
      edtForProMqC_Jsonclick = "" ;
      edtForProMq_Jsonclick = "" ;
      edtForProFsT_Jsonclick = "" ;
      edtForProFs_Jsonclick = "" ;
      edtForProLn_Jsonclick = "" ;
      edtavnRcdDeleted_1506_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtForcosCF_Jsonclick = "" ;
      edtFosCosFbk_Jsonclick = "" ;
      edtForProKgs_Jsonclick = "" ;
      edtForCosFbS_Jsonclick = "" ;
      edtForProUl_Jsonclick = "" ;
      edtForProD_Jsonclick = "" ;
      edtForProC_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtForProCfl_Enabled = 0 ;
      edtForProMqC_Enabled = 1 ;
      edtForProMq_Enabled = 1 ;
      edtForProFsT_Enabled = 1 ;
      edtForProFs_Enabled = 1 ;
      edtForProLn_Enabled = 1 ;
      edtavnRcdDeleted_1506_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtForcosCF_Enabled = 1 ;
      edtFosCosFbk_Enabled = 1 ;
      edtForProKgs_Enabled = 1 ;
      edtForCosFbS_Enabled = 0 ;
      edtForProUl_Enabled = 1 ;
      edtForProD_Enabled = 0 ;
      edtForProC_Enabled = 1 ;
      edtForCosFin_Jsonclick = "" ;
      edtForCosFin_Backcolor = (int)(0xFFFFFF) ;
      edtForCosFin_Enabled = 1 ;
      edtForCosFab_Jsonclick = "" ;
      edtForCosFab_Backcolor = (int)(0xFFFFFF) ;
      edtForCosFab_Enabled = 1 ;
      edtForcosH20_Jsonclick = "" ;
      edtForcosH20_Backcolor = (int)(0xFFFFFF) ;
      edtForcosH20_Enabled = 1 ;
      edtForCosForm_Jsonclick = "" ;
      edtForCosForm_Backcolor = (int)(0xFFFFFF) ;
      edtForCosForm_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 1 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Backcolor = (int)(0xFFFFFF) ;
      edtForColNum_Enabled = 1 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Backcolor = (int)(0xFFFFFF) ;
      edtForColNom_Enabled = 1 ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtForSerDsc_Enabled = 1 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Backcolor = (int)(0xFFFFFF) ;
      edtForSer_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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

   public void gx1asaforprod1BH1280( String A396EmprCod ,
                                     String A9766ForProC )
   {
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tcoscr0_impl.this.A396EmprCod = GXv_char4[0] ;
      tcoscr0_impl.this.A9766ForProC = GXv_char3[0] ;
      tcoscr0_impl.this.GXt_char1 = GXv_char2[0] ;
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
      subsflControlProps_851280( ) ;
      while ( nGXsfl_85_idx <= nRC_GXsfl_85 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BH1280( ) ;
         standaloneModal1BH1280( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BH1280( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_85_idx = (int)(nGXsfl_85_idx+1) ;
         sGXsfl_85_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_85_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_851280( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1271506( ) ;
      while ( nGXsfl_127_idx <= nRC_GXsfl_127 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BH1280( ) ;
         standaloneModal1BH1280( ) ;
         standaloneNotModal1BH1506( ) ;
         standaloneModal1BH1506( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BH1506( ) ;
         nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_127_idx), 4, 0), (short)(4), "0") + sGXsfl_85_idx ;
         subsflControlProps_1271506( ) ;
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
      /* Using cursor T01BH59 */
      pr_default.execute(53, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(53) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BH59_A407EmprNom[0] ;
      n407EmprNom = T01BH59_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(53);
      /* Using cursor T01BH22 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01BH22_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(19);
      /* Using cursor T01BH60 */
      pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(54);
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

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01BH22 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01BH22_A279CliNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      /* Using cursor T01BH60 */
      pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
      }
      pr_default.close(54);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", GXutil.rtrim( A5742ForSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4380ForCosForm", GXutil.ltrim( localUtil.ntoc( A4380ForCosForm, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11279ForcosH20", GXutil.ltrim( localUtil.ntoc( A11279ForcosH20, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11280ForCosFab", GXutil.ltrim( localUtil.ntoc( A11280ForCosFab, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11290ForCosFin", GXutil.ltrim( localUtil.ntoc( A11290ForCosFin, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4380ForCosForm", GXutil.ltrim( localUtil.ntoc( Z4380ForCosForm, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11279ForcosH20", GXutil.ltrim( localUtil.ntoc( Z11279ForcosH20, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11280ForCosFab", GXutil.ltrim( localUtil.ntoc( Z11280ForCosFab, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11290ForCosFin", GXutil.ltrim( localUtil.ntoc( Z11290ForCosFin, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Forproc( )
   {
      n252CliCod = false ;
      n494ForSer = false ;
      n482ForColNom = false ;
      n483ForColNum = false ;
      n831TipColCod = false ;
      n11287ForCosFbS = false ;
      /* Using cursor T01BH48 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(42) != 101) )
      {
         A11287ForCosFbS = T01BH48_A11287ForCosFbS[0] ;
         n11287ForCosFbS = T01BH48_n11287ForCosFbS[0] ;
      }
      else
      {
         A11287ForCosFbS = DecimalUtil.doubleToDec(0) ;
         n11287ForCosFbS = false ;
      }
      pr_default.close(42);
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tcoscr0_impl.this.A396EmprCod = GXv_char4[0] ;
      tcoscr0_impl.this.A9766ForProC = GXv_char3[0] ;
      tcoscr0_impl.this.GXt_char1 = GXv_char2[0] ;
      A9767ForProD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11287ForCosFbS", GXutil.ltrim( localUtil.ntoc( A11287ForCosFbS, (byte)(11), (byte)(5), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A5742ForSerDsc',fld:'FORSERDSC',pic:''},{av:'A4380ForCosForm',fld:'FORCOSFORM',pic:'ZZZZ9.99999'},{av:'A11279ForcosH20',fld:'FORCOSH20',pic:'ZZZZ9.99999'},{av:'A11280ForCosFab',fld:'FORCOSFAB',pic:'ZZZZ9.99999'},{av:'A11290ForCosFin',fld:'FORCOSFIN',pic:'ZZZZ9.99999'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z407EmprNom'},{av:'Z5742ForSerDsc'},{av:'Z4380ForCosForm'},{av:'Z11279ForcosH20'},{av:'Z11280ForCosFab'},{av:'Z11290ForCosFin'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FORPROC","{handler:'valid_Forproc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'A11287ForCosFbS',fld:'FORCOSFBS',pic:'ZZZZ9.99999'},{av:'A9767ForProD',fld:'FORPROD',pic:''}]");
      setEventMetadata("VALID_FORPROC",",oparms:[{av:'A11287ForCosFbS',fld:'FORCOSFBS',pic:'ZZZZ9.99999'},{av:'A9767ForProD',fld:'FORPROD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Forcoscf',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_FORPROLN","{handler:'valid_Forproln',iparms:[]");
      setEventMetadata("VALID_FORPROLN",",oparms:[]}");
      setEventMetadata("VALID_FORPROFST","{handler:'valid_Forprofst',iparms:[]");
      setEventMetadata("VALID_FORPROFST",",oparms:[]}");
      setEventMetadata("VALID_FORPROMQC","{handler:'valid_Forpromqc',iparms:[]");
      setEventMetadata("VALID_FORPROMQC",",oparms:[]}");
      setEventMetadata("VALID_FORPROCFL","{handler:'valid_Forprocfl',iparms:[]");
      setEventMetadata("VALID_FORPROCFL",",oparms:[]}");
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
      pr_default.close(42);
      pr_default.close(19);
      pr_default.close(53);
      pr_default.close(54);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z5742ForSerDsc = "" ;
      Z4380ForCosForm = DecimalUtil.ZERO ;
      Z11279ForcosH20 = DecimalUtil.ZERO ;
      Z11280ForCosFab = DecimalUtil.ZERO ;
      Z11290ForCosFin = DecimalUtil.ZERO ;
      Z9766ForProC = "" ;
      Z11289ForProKgs = DecimalUtil.ZERO ;
      Z11291FosCosFbk = DecimalUtil.ZERO ;
      Z11292ForcosCF = DecimalUtil.ZERO ;
      O11287ForCosFbS = DecimalUtil.ZERO ;
      Z11284ForProFs = "" ;
      Z11286ForProMq = "" ;
      Z11283ForProMqC = DecimalUtil.ZERO ;
      O11288ForProCfl = DecimalUtil.ZERO ;
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
      A4380ForCosForm = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A11279ForcosH20 = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A11280ForCosFab = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A11290ForCosFin = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1280 = "" ;
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
      sMode47 = "" ;
      s11287ForCosFbS = DecimalUtil.ZERO ;
      A11287ForCosFbS = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A11284ForProFs = "" ;
      A11286ForProMq = "" ;
      A11283ForProMqC = DecimalUtil.ZERO ;
      A11288ForProCfl = DecimalUtil.ZERO ;
      T11288ForProCfl = DecimalUtil.ZERO ;
      A9767ForProD = "" ;
      A11289ForProKgs = DecimalUtil.ZERO ;
      A11291FosCosFbk = DecimalUtil.ZERO ;
      A11292ForcosCF = DecimalUtil.ZERO ;
      T11287ForCosFbS = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01BH10_A407EmprNom = new String[] {""} ;
      T01BH10_n407EmprNom = new boolean[] {false} ;
      T01BH13_A494ForSer = new String[] {""} ;
      T01BH13_n494ForSer = new boolean[] {false} ;
      T01BH13_A482ForColNom = new String[] {""} ;
      T01BH13_n482ForColNom = new boolean[] {false} ;
      T01BH13_A483ForColNum = new int[1] ;
      T01BH13_n483ForColNum = new boolean[] {false} ;
      T01BH13_A407EmprNom = new String[] {""} ;
      T01BH13_n407EmprNom = new boolean[] {false} ;
      T01BH13_A279CliNom = new String[] {""} ;
      T01BH13_A5742ForSerDsc = new String[] {""} ;
      T01BH13_n5742ForSerDsc = new boolean[] {false} ;
      T01BH13_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH13_n4380ForCosForm = new boolean[] {false} ;
      T01BH13_A11279ForcosH20 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH13_n11279ForcosH20 = new boolean[] {false} ;
      T01BH13_A11280ForCosFab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH13_n11280ForCosFab = new boolean[] {false} ;
      T01BH13_A11290ForCosFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH13_n11290ForCosFin = new boolean[] {false} ;
      T01BH13_A396EmprCod = new String[] {""} ;
      T01BH13_A252CliCod = new int[1] ;
      T01BH13_n252CliCod = new boolean[] {false} ;
      T01BH13_A831TipColCod = new byte[1] ;
      T01BH13_n831TipColCod = new boolean[] {false} ;
      T01BH11_A279CliNom = new String[] {""} ;
      T01BH12_A396EmprCod = new String[] {""} ;
      T01BH14_A279CliNom = new String[] {""} ;
      T01BH15_A396EmprCod = new String[] {""} ;
      T01BH16_A396EmprCod = new String[] {""} ;
      T01BH16_A252CliCod = new int[1] ;
      T01BH16_n252CliCod = new boolean[] {false} ;
      T01BH16_A494ForSer = new String[] {""} ;
      T01BH16_n494ForSer = new boolean[] {false} ;
      T01BH16_A482ForColNom = new String[] {""} ;
      T01BH16_n482ForColNom = new boolean[] {false} ;
      T01BH16_A483ForColNum = new int[1] ;
      T01BH16_n483ForColNum = new boolean[] {false} ;
      T01BH16_A831TipColCod = new byte[1] ;
      T01BH16_n831TipColCod = new boolean[] {false} ;
      T01BH9_A494ForSer = new String[] {""} ;
      T01BH9_n494ForSer = new boolean[] {false} ;
      T01BH9_A482ForColNom = new String[] {""} ;
      T01BH9_n482ForColNom = new boolean[] {false} ;
      T01BH9_A483ForColNum = new int[1] ;
      T01BH9_n483ForColNum = new boolean[] {false} ;
      T01BH9_A5742ForSerDsc = new String[] {""} ;
      T01BH9_n5742ForSerDsc = new boolean[] {false} ;
      T01BH9_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH9_n4380ForCosForm = new boolean[] {false} ;
      T01BH9_A11279ForcosH20 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH9_n11279ForcosH20 = new boolean[] {false} ;
      T01BH9_A11280ForCosFab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH9_n11280ForCosFab = new boolean[] {false} ;
      T01BH9_A11290ForCosFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH9_n11290ForCosFin = new boolean[] {false} ;
      T01BH9_A396EmprCod = new String[] {""} ;
      T01BH9_A252CliCod = new int[1] ;
      T01BH9_n252CliCod = new boolean[] {false} ;
      T01BH9_A831TipColCod = new byte[1] ;
      T01BH9_n831TipColCod = new boolean[] {false} ;
      T01BH17_A396EmprCod = new String[] {""} ;
      T01BH17_A252CliCod = new int[1] ;
      T01BH17_n252CliCod = new boolean[] {false} ;
      T01BH17_A494ForSer = new String[] {""} ;
      T01BH17_n494ForSer = new boolean[] {false} ;
      T01BH17_A482ForColNom = new String[] {""} ;
      T01BH17_n482ForColNom = new boolean[] {false} ;
      T01BH17_A483ForColNum = new int[1] ;
      T01BH17_n483ForColNum = new boolean[] {false} ;
      T01BH17_A831TipColCod = new byte[1] ;
      T01BH17_n831TipColCod = new boolean[] {false} ;
      T01BH18_A396EmprCod = new String[] {""} ;
      T01BH18_A252CliCod = new int[1] ;
      T01BH18_n252CliCod = new boolean[] {false} ;
      T01BH18_A494ForSer = new String[] {""} ;
      T01BH18_n494ForSer = new boolean[] {false} ;
      T01BH18_A482ForColNom = new String[] {""} ;
      T01BH18_n482ForColNom = new boolean[] {false} ;
      T01BH18_A483ForColNum = new int[1] ;
      T01BH18_n483ForColNum = new boolean[] {false} ;
      T01BH18_A831TipColCod = new byte[1] ;
      T01BH18_n831TipColCod = new boolean[] {false} ;
      T01BH8_A494ForSer = new String[] {""} ;
      T01BH8_n494ForSer = new boolean[] {false} ;
      T01BH8_A482ForColNom = new String[] {""} ;
      T01BH8_n482ForColNom = new boolean[] {false} ;
      T01BH8_A483ForColNum = new int[1] ;
      T01BH8_n483ForColNum = new boolean[] {false} ;
      T01BH8_A5742ForSerDsc = new String[] {""} ;
      T01BH8_n5742ForSerDsc = new boolean[] {false} ;
      T01BH8_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH8_n4380ForCosForm = new boolean[] {false} ;
      T01BH8_A11279ForcosH20 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH8_n11279ForcosH20 = new boolean[] {false} ;
      T01BH8_A11280ForCosFab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH8_n11280ForCosFab = new boolean[] {false} ;
      T01BH8_A11290ForCosFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH8_n11290ForCosFin = new boolean[] {false} ;
      T01BH8_A396EmprCod = new String[] {""} ;
      T01BH8_A252CliCod = new int[1] ;
      T01BH8_n252CliCod = new boolean[] {false} ;
      T01BH8_A831TipColCod = new byte[1] ;
      T01BH8_n831TipColCod = new boolean[] {false} ;
      T01BH22_A279CliNom = new String[] {""} ;
      T01BH23_A396EmprCod = new String[] {""} ;
      T01BH23_A252CliCod = new int[1] ;
      T01BH23_n252CliCod = new boolean[] {false} ;
      T01BH23_A494ForSer = new String[] {""} ;
      T01BH23_n494ForSer = new boolean[] {false} ;
      T01BH23_A482ForColNom = new String[] {""} ;
      T01BH23_n482ForColNom = new boolean[] {false} ;
      T01BH23_A483ForColNum = new int[1] ;
      T01BH23_n483ForColNum = new boolean[] {false} ;
      T01BH23_A831TipColCod = new byte[1] ;
      T01BH23_n831TipColCod = new boolean[] {false} ;
      T01BH23_A13377ForNormaID = new String[] {""} ;
      T01BH24_A396EmprCod = new String[] {""} ;
      T01BH24_A252CliCod = new int[1] ;
      T01BH24_n252CliCod = new boolean[] {false} ;
      T01BH24_A494ForSer = new String[] {""} ;
      T01BH24_n494ForSer = new boolean[] {false} ;
      T01BH24_A482ForColNom = new String[] {""} ;
      T01BH24_n482ForColNom = new boolean[] {false} ;
      T01BH24_A483ForColNum = new int[1] ;
      T01BH24_n483ForColNum = new boolean[] {false} ;
      T01BH24_A831TipColCod = new byte[1] ;
      T01BH24_n831TipColCod = new boolean[] {false} ;
      T01BH24_A3571EnsCod = new String[] {""} ;
      T01BH25_A396EmprCod = new String[] {""} ;
      T01BH25_A252CliCod = new int[1] ;
      T01BH25_n252CliCod = new boolean[] {false} ;
      T01BH25_A494ForSer = new String[] {""} ;
      T01BH25_n494ForSer = new boolean[] {false} ;
      T01BH25_A482ForColNom = new String[] {""} ;
      T01BH25_n482ForColNom = new boolean[] {false} ;
      T01BH25_A483ForColNum = new int[1] ;
      T01BH25_n483ForColNum = new boolean[] {false} ;
      T01BH25_A831TipColCod = new byte[1] ;
      T01BH25_n831TipColCod = new boolean[] {false} ;
      T01BH25_A7270Procod_c = new String[] {""} ;
      T01BH25_A7272CliCod_d = new int[1] ;
      T01BH26_A396EmprCod = new String[] {""} ;
      T01BH26_A252CliCod = new int[1] ;
      T01BH26_n252CliCod = new boolean[] {false} ;
      T01BH26_A494ForSer = new String[] {""} ;
      T01BH26_n494ForSer = new boolean[] {false} ;
      T01BH26_A482ForColNom = new String[] {""} ;
      T01BH26_n482ForColNom = new boolean[] {false} ;
      T01BH26_A483ForColNum = new int[1] ;
      T01BH26_n483ForColNum = new boolean[] {false} ;
      T01BH26_A831TipColCod = new byte[1] ;
      T01BH26_n831TipColCod = new boolean[] {false} ;
      T01BH26_A6525ColAqP = new String[] {""} ;
      T01BH27_A396EmprCod = new String[] {""} ;
      T01BH27_A252CliCod = new int[1] ;
      T01BH27_n252CliCod = new boolean[] {false} ;
      T01BH27_A494ForSer = new String[] {""} ;
      T01BH27_n494ForSer = new boolean[] {false} ;
      T01BH27_A482ForColNom = new String[] {""} ;
      T01BH27_n482ForColNom = new boolean[] {false} ;
      T01BH27_A483ForColNum = new int[1] ;
      T01BH27_n483ForColNum = new boolean[] {false} ;
      T01BH27_A831TipColCod = new byte[1] ;
      T01BH27_n831TipColCod = new boolean[] {false} ;
      T01BH27_A7262CACPP = new String[] {""} ;
      T01BH28_A396EmprCod = new String[] {""} ;
      T01BH28_A252CliCod = new int[1] ;
      T01BH28_n252CliCod = new boolean[] {false} ;
      T01BH28_A494ForSer = new String[] {""} ;
      T01BH28_n494ForSer = new boolean[] {false} ;
      T01BH28_A482ForColNom = new String[] {""} ;
      T01BH28_n482ForColNom = new boolean[] {false} ;
      T01BH28_A483ForColNum = new int[1] ;
      T01BH28_n483ForColNum = new boolean[] {false} ;
      T01BH28_A831TipColCod = new byte[1] ;
      T01BH28_n831TipColCod = new boolean[] {false} ;
      T01BH28_A6037Mq_Grupo = new byte[1] ;
      T01BH29_A396EmprCod = new String[] {""} ;
      T01BH29_A252CliCod = new int[1] ;
      T01BH29_n252CliCod = new boolean[] {false} ;
      T01BH29_A494ForSer = new String[] {""} ;
      T01BH29_n494ForSer = new boolean[] {false} ;
      T01BH29_A482ForColNom = new String[] {""} ;
      T01BH29_n482ForColNom = new boolean[] {false} ;
      T01BH29_A483ForColNum = new int[1] ;
      T01BH29_n483ForColNum = new boolean[] {false} ;
      T01BH29_A831TipColCod = new byte[1] ;
      T01BH29_n831TipColCod = new boolean[] {false} ;
      T01BH29_A853For_ProC = new String[] {""} ;
      T01BH30_A396EmprCod = new String[] {""} ;
      T01BH30_A252CliCod = new int[1] ;
      T01BH30_n252CliCod = new boolean[] {false} ;
      T01BH30_A494ForSer = new String[] {""} ;
      T01BH30_n494ForSer = new boolean[] {false} ;
      T01BH30_A482ForColNom = new String[] {""} ;
      T01BH30_n482ForColNom = new boolean[] {false} ;
      T01BH30_A483ForColNum = new int[1] ;
      T01BH30_n483ForColNum = new boolean[] {false} ;
      T01BH30_A831TipColCod = new byte[1] ;
      T01BH30_n831TipColCod = new boolean[] {false} ;
      T01BH30_A9766ForProC = new String[] {""} ;
      T01BH31_A396EmprCod = new String[] {""} ;
      T01BH31_A252CliCod = new int[1] ;
      T01BH31_n252CliCod = new boolean[] {false} ;
      T01BH31_A494ForSer = new String[] {""} ;
      T01BH31_n494ForSer = new boolean[] {false} ;
      T01BH31_A482ForColNom = new String[] {""} ;
      T01BH31_n482ForColNom = new boolean[] {false} ;
      T01BH31_A483ForColNum = new int[1] ;
      T01BH31_n483ForColNum = new boolean[] {false} ;
      T01BH31_A831TipColCod = new byte[1] ;
      T01BH31_n831TipColCod = new boolean[] {false} ;
      T01BH31_A7797Sim_lin = new short[1] ;
      T01BH32_A396EmprCod = new String[] {""} ;
      T01BH32_A252CliCod = new int[1] ;
      T01BH32_n252CliCod = new boolean[] {false} ;
      T01BH32_A494ForSer = new String[] {""} ;
      T01BH32_n494ForSer = new boolean[] {false} ;
      T01BH32_A482ForColNom = new String[] {""} ;
      T01BH32_n482ForColNom = new boolean[] {false} ;
      T01BH32_A483ForColNum = new int[1] ;
      T01BH32_n483ForColNum = new boolean[] {false} ;
      T01BH32_A831TipColCod = new byte[1] ;
      T01BH32_n831TipColCod = new boolean[] {false} ;
      T01BH32_A7094Acab_Ter = new String[] {""} ;
      T01BH33_A396EmprCod = new String[] {""} ;
      T01BH33_A252CliCod = new int[1] ;
      T01BH33_n252CliCod = new boolean[] {false} ;
      T01BH33_A494ForSer = new String[] {""} ;
      T01BH33_n494ForSer = new boolean[] {false} ;
      T01BH33_A482ForColNom = new String[] {""} ;
      T01BH33_n482ForColNom = new boolean[] {false} ;
      T01BH33_A483ForColNum = new int[1] ;
      T01BH33_n483ForColNum = new boolean[] {false} ;
      T01BH33_A831TipColCod = new byte[1] ;
      T01BH33_n831TipColCod = new boolean[] {false} ;
      T01BH33_A3689ComForLin = new short[1] ;
      T01BH34_A396EmprCod = new String[] {""} ;
      T01BH34_A252CliCod = new int[1] ;
      T01BH34_n252CliCod = new boolean[] {false} ;
      T01BH34_A494ForSer = new String[] {""} ;
      T01BH34_n494ForSer = new boolean[] {false} ;
      T01BH34_A482ForColNom = new String[] {""} ;
      T01BH34_n482ForColNom = new boolean[] {false} ;
      T01BH34_A483ForColNum = new int[1] ;
      T01BH34_n483ForColNum = new boolean[] {false} ;
      T01BH34_A831TipColCod = new byte[1] ;
      T01BH34_n831TipColCod = new boolean[] {false} ;
      T01BH34_A1519RecCorLin = new byte[1] ;
      T01BH35_A396EmprCod = new String[] {""} ;
      T01BH35_A252CliCod = new int[1] ;
      T01BH35_n252CliCod = new boolean[] {false} ;
      T01BH35_A494ForSer = new String[] {""} ;
      T01BH35_n494ForSer = new boolean[] {false} ;
      T01BH35_A482ForColNom = new String[] {""} ;
      T01BH35_n482ForColNom = new boolean[] {false} ;
      T01BH35_A483ForColNum = new int[1] ;
      T01BH35_n483ForColNum = new boolean[] {false} ;
      T01BH35_A831TipColCod = new byte[1] ;
      T01BH35_n831TipColCod = new boolean[] {false} ;
      T01BH35_A1160ProForL = new short[1] ;
      T01BH36_A396EmprCod = new String[] {""} ;
      T01BH36_A910Workstat = new String[] {""} ;
      T01BH36_A880EscLin = new short[1] ;
      T01BH37_A396EmprCod = new String[] {""} ;
      T01BH37_A252CliCod = new int[1] ;
      T01BH37_n252CliCod = new boolean[] {false} ;
      T01BH37_A494ForSer = new String[] {""} ;
      T01BH37_n494ForSer = new boolean[] {false} ;
      T01BH37_A482ForColNom = new String[] {""} ;
      T01BH37_n482ForColNom = new boolean[] {false} ;
      T01BH37_A483ForColNum = new int[1] ;
      T01BH37_n483ForColNum = new boolean[] {false} ;
      T01BH37_A831TipColCod = new byte[1] ;
      T01BH37_n831TipColCod = new boolean[] {false} ;
      T01BH37_A650ObsLin = new short[1] ;
      T01BH38_A396EmprCod = new String[] {""} ;
      T01BH38_A252CliCod = new int[1] ;
      T01BH38_n252CliCod = new boolean[] {false} ;
      T01BH38_A494ForSer = new String[] {""} ;
      T01BH38_n494ForSer = new boolean[] {false} ;
      T01BH38_A482ForColNom = new String[] {""} ;
      T01BH38_n482ForColNom = new boolean[] {false} ;
      T01BH38_A483ForColNum = new int[1] ;
      T01BH38_n483ForColNum = new boolean[] {false} ;
      T01BH38_A831TipColCod = new byte[1] ;
      T01BH38_n831TipColCod = new boolean[] {false} ;
      Z11287ForCosFbS = DecimalUtil.ZERO ;
      T01BH40_A494ForSer = new String[] {""} ;
      T01BH40_n494ForSer = new boolean[] {false} ;
      T01BH40_A482ForColNom = new String[] {""} ;
      T01BH40_n482ForColNom = new boolean[] {false} ;
      T01BH40_A483ForColNum = new int[1] ;
      T01BH40_n483ForColNum = new boolean[] {false} ;
      T01BH40_A831TipColCod = new byte[1] ;
      T01BH40_n831TipColCod = new boolean[] {false} ;
      T01BH40_A9766ForProC = new String[] {""} ;
      T01BH40_A11281ForProUl = new short[1] ;
      T01BH40_n11281ForProUl = new boolean[] {false} ;
      T01BH40_A11289ForProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH40_n11289ForProKgs = new boolean[] {false} ;
      T01BH40_A11291FosCosFbk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH40_n11291FosCosFbk = new boolean[] {false} ;
      T01BH40_A11292ForcosCF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH40_n11292ForcosCF = new boolean[] {false} ;
      T01BH40_A396EmprCod = new String[] {""} ;
      T01BH40_A252CliCod = new int[1] ;
      T01BH40_n252CliCod = new boolean[] {false} ;
      T01BH40_A11287ForCosFbS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH40_n11287ForCosFbS = new boolean[] {false} ;
      T01BH7_A11287ForCosFbS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH7_n11287ForCosFbS = new boolean[] {false} ;
      T01BH42_A11287ForCosFbS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH42_n11287ForCosFbS = new boolean[] {false} ;
      T01BH43_A396EmprCod = new String[] {""} ;
      T01BH43_A252CliCod = new int[1] ;
      T01BH43_n252CliCod = new boolean[] {false} ;
      T01BH43_A494ForSer = new String[] {""} ;
      T01BH43_n494ForSer = new boolean[] {false} ;
      T01BH43_A482ForColNom = new String[] {""} ;
      T01BH43_n482ForColNom = new boolean[] {false} ;
      T01BH43_A483ForColNum = new int[1] ;
      T01BH43_n483ForColNum = new boolean[] {false} ;
      T01BH43_A831TipColCod = new byte[1] ;
      T01BH43_n831TipColCod = new boolean[] {false} ;
      T01BH43_A9766ForProC = new String[] {""} ;
      T01BH5_A494ForSer = new String[] {""} ;
      T01BH5_n494ForSer = new boolean[] {false} ;
      T01BH5_A482ForColNom = new String[] {""} ;
      T01BH5_n482ForColNom = new boolean[] {false} ;
      T01BH5_A483ForColNum = new int[1] ;
      T01BH5_n483ForColNum = new boolean[] {false} ;
      T01BH5_A831TipColCod = new byte[1] ;
      T01BH5_n831TipColCod = new boolean[] {false} ;
      T01BH5_A9766ForProC = new String[] {""} ;
      T01BH5_A11281ForProUl = new short[1] ;
      T01BH5_n11281ForProUl = new boolean[] {false} ;
      T01BH5_A11289ForProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH5_n11289ForProKgs = new boolean[] {false} ;
      T01BH5_A11291FosCosFbk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH5_n11291FosCosFbk = new boolean[] {false} ;
      T01BH5_A11292ForcosCF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH5_n11292ForcosCF = new boolean[] {false} ;
      T01BH5_A396EmprCod = new String[] {""} ;
      T01BH5_A252CliCod = new int[1] ;
      T01BH5_n252CliCod = new boolean[] {false} ;
      T01BH4_A494ForSer = new String[] {""} ;
      T01BH4_n494ForSer = new boolean[] {false} ;
      T01BH4_A482ForColNom = new String[] {""} ;
      T01BH4_n482ForColNom = new boolean[] {false} ;
      T01BH4_A483ForColNum = new int[1] ;
      T01BH4_n483ForColNum = new boolean[] {false} ;
      T01BH4_A831TipColCod = new byte[1] ;
      T01BH4_n831TipColCod = new boolean[] {false} ;
      T01BH4_A9766ForProC = new String[] {""} ;
      T01BH4_A11281ForProUl = new short[1] ;
      T01BH4_n11281ForProUl = new boolean[] {false} ;
      T01BH4_A11289ForProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH4_n11289ForProKgs = new boolean[] {false} ;
      T01BH4_A11291FosCosFbk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH4_n11291FosCosFbk = new boolean[] {false} ;
      T01BH4_A11292ForcosCF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH4_n11292ForcosCF = new boolean[] {false} ;
      T01BH4_A396EmprCod = new String[] {""} ;
      T01BH4_A252CliCod = new int[1] ;
      T01BH4_n252CliCod = new boolean[] {false} ;
      T01BH48_A11287ForCosFbS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH48_n11287ForCosFbS = new boolean[] {false} ;
      T01BH49_A396EmprCod = new String[] {""} ;
      T01BH49_A252CliCod = new int[1] ;
      T01BH49_n252CliCod = new boolean[] {false} ;
      T01BH49_A494ForSer = new String[] {""} ;
      T01BH49_n494ForSer = new boolean[] {false} ;
      T01BH49_A482ForColNom = new String[] {""} ;
      T01BH49_n482ForColNom = new boolean[] {false} ;
      T01BH49_A483ForColNum = new int[1] ;
      T01BH49_n483ForColNum = new boolean[] {false} ;
      T01BH49_A831TipColCod = new byte[1] ;
      T01BH49_n831TipColCod = new boolean[] {false} ;
      T01BH49_A9766ForProC = new String[] {""} ;
      T01BH49_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01BH50_A396EmprCod = new String[] {""} ;
      T01BH50_A252CliCod = new int[1] ;
      T01BH50_n252CliCod = new boolean[] {false} ;
      T01BH50_A494ForSer = new String[] {""} ;
      T01BH50_n494ForSer = new boolean[] {false} ;
      T01BH50_A482ForColNom = new String[] {""} ;
      T01BH50_n482ForColNom = new boolean[] {false} ;
      T01BH50_A483ForColNum = new int[1] ;
      T01BH50_n483ForColNum = new boolean[] {false} ;
      T01BH50_A831TipColCod = new byte[1] ;
      T01BH50_n831TipColCod = new boolean[] {false} ;
      T01BH50_A9766ForProC = new String[] {""} ;
      T01BH50_A1067ForLinN = new short[1] ;
      T01BH51_A396EmprCod = new String[] {""} ;
      T01BH51_A252CliCod = new int[1] ;
      T01BH51_n252CliCod = new boolean[] {false} ;
      T01BH51_A494ForSer = new String[] {""} ;
      T01BH51_n494ForSer = new boolean[] {false} ;
      T01BH51_A482ForColNom = new String[] {""} ;
      T01BH51_n482ForColNom = new boolean[] {false} ;
      T01BH51_A483ForColNum = new int[1] ;
      T01BH51_n483ForColNum = new boolean[] {false} ;
      T01BH51_A831TipColCod = new byte[1] ;
      T01BH51_n831TipColCod = new boolean[] {false} ;
      T01BH51_A9766ForProC = new String[] {""} ;
      T01BH51_A9847ForProL = new short[1] ;
      T01BH52_A396EmprCod = new String[] {""} ;
      T01BH52_A252CliCod = new int[1] ;
      T01BH52_n252CliCod = new boolean[] {false} ;
      T01BH52_A494ForSer = new String[] {""} ;
      T01BH52_n494ForSer = new boolean[] {false} ;
      T01BH52_A482ForColNom = new String[] {""} ;
      T01BH52_n482ForColNom = new boolean[] {false} ;
      T01BH52_A483ForColNum = new int[1] ;
      T01BH52_n483ForColNum = new boolean[] {false} ;
      T01BH52_A831TipColCod = new byte[1] ;
      T01BH52_n831TipColCod = new boolean[] {false} ;
      T01BH52_A9766ForProC = new String[] {""} ;
      T01BH53_A494ForSer = new String[] {""} ;
      T01BH53_n494ForSer = new boolean[] {false} ;
      T01BH53_A482ForColNom = new String[] {""} ;
      T01BH53_n482ForColNom = new boolean[] {false} ;
      T01BH53_A483ForColNum = new int[1] ;
      T01BH53_n483ForColNum = new boolean[] {false} ;
      T01BH53_A831TipColCod = new byte[1] ;
      T01BH53_n831TipColCod = new boolean[] {false} ;
      T01BH53_A9766ForProC = new String[] {""} ;
      T01BH53_A11282ForProLn = new short[1] ;
      T01BH53_A11284ForProFs = new String[] {""} ;
      T01BH53_n11284ForProFs = new boolean[] {false} ;
      T01BH53_A11285ForProFsT = new short[1] ;
      T01BH53_n11285ForProFsT = new boolean[] {false} ;
      T01BH53_A11286ForProMq = new String[] {""} ;
      T01BH53_n11286ForProMq = new boolean[] {false} ;
      T01BH53_A11283ForProMqC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH53_n11283ForProMqC = new boolean[] {false} ;
      T01BH53_A396EmprCod = new String[] {""} ;
      T01BH53_A252CliCod = new int[1] ;
      T01BH53_n252CliCod = new boolean[] {false} ;
      T01BH54_A396EmprCod = new String[] {""} ;
      T01BH54_A252CliCod = new int[1] ;
      T01BH54_n252CliCod = new boolean[] {false} ;
      T01BH54_A494ForSer = new String[] {""} ;
      T01BH54_n494ForSer = new boolean[] {false} ;
      T01BH54_A482ForColNom = new String[] {""} ;
      T01BH54_n482ForColNom = new boolean[] {false} ;
      T01BH54_A483ForColNum = new int[1] ;
      T01BH54_n483ForColNum = new boolean[] {false} ;
      T01BH54_A831TipColCod = new byte[1] ;
      T01BH54_n831TipColCod = new boolean[] {false} ;
      T01BH54_A9766ForProC = new String[] {""} ;
      T01BH54_A11282ForProLn = new short[1] ;
      T01BH3_A494ForSer = new String[] {""} ;
      T01BH3_n494ForSer = new boolean[] {false} ;
      T01BH3_A482ForColNom = new String[] {""} ;
      T01BH3_n482ForColNom = new boolean[] {false} ;
      T01BH3_A483ForColNum = new int[1] ;
      T01BH3_n483ForColNum = new boolean[] {false} ;
      T01BH3_A831TipColCod = new byte[1] ;
      T01BH3_n831TipColCod = new boolean[] {false} ;
      T01BH3_A9766ForProC = new String[] {""} ;
      T01BH3_A11282ForProLn = new short[1] ;
      T01BH3_A11284ForProFs = new String[] {""} ;
      T01BH3_n11284ForProFs = new boolean[] {false} ;
      T01BH3_A11285ForProFsT = new short[1] ;
      T01BH3_n11285ForProFsT = new boolean[] {false} ;
      T01BH3_A11286ForProMq = new String[] {""} ;
      T01BH3_n11286ForProMq = new boolean[] {false} ;
      T01BH3_A11283ForProMqC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH3_n11283ForProMqC = new boolean[] {false} ;
      T01BH3_A396EmprCod = new String[] {""} ;
      T01BH3_A252CliCod = new int[1] ;
      T01BH3_n252CliCod = new boolean[] {false} ;
      sMode1506 = "" ;
      T01BH2_A494ForSer = new String[] {""} ;
      T01BH2_n494ForSer = new boolean[] {false} ;
      T01BH2_A482ForColNom = new String[] {""} ;
      T01BH2_n482ForColNom = new boolean[] {false} ;
      T01BH2_A483ForColNum = new int[1] ;
      T01BH2_n483ForColNum = new boolean[] {false} ;
      T01BH2_A831TipColCod = new byte[1] ;
      T01BH2_n831TipColCod = new boolean[] {false} ;
      T01BH2_A9766ForProC = new String[] {""} ;
      T01BH2_A11282ForProLn = new short[1] ;
      T01BH2_A11284ForProFs = new String[] {""} ;
      T01BH2_n11284ForProFs = new boolean[] {false} ;
      T01BH2_A11285ForProFsT = new short[1] ;
      T01BH2_n11285ForProFsT = new boolean[] {false} ;
      T01BH2_A11286ForProMq = new String[] {""} ;
      T01BH2_n11286ForProMq = new boolean[] {false} ;
      T01BH2_A11283ForProMqC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BH2_n11283ForProMqC = new boolean[] {false} ;
      T01BH2_A396EmprCod = new String[] {""} ;
      T01BH2_A252CliCod = new int[1] ;
      T01BH2_n252CliCod = new boolean[] {false} ;
      T01BH58_A396EmprCod = new String[] {""} ;
      T01BH58_A252CliCod = new int[1] ;
      T01BH58_n252CliCod = new boolean[] {false} ;
      T01BH58_A494ForSer = new String[] {""} ;
      T01BH58_n494ForSer = new boolean[] {false} ;
      T01BH58_A482ForColNom = new String[] {""} ;
      T01BH58_n482ForColNom = new boolean[] {false} ;
      T01BH58_A483ForColNum = new int[1] ;
      T01BH58_n483ForColNum = new boolean[] {false} ;
      T01BH58_A831TipColCod = new byte[1] ;
      T01BH58_n831TipColCod = new boolean[] {false} ;
      T01BH58_A9766ForProC = new String[] {""} ;
      T01BH58_A11282ForProLn = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock14_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      B11287ForCosFbS = DecimalUtil.ZERO ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01BH59_A407EmprNom = new String[] {""} ;
      T01BH59_n407EmprNom = new boolean[] {false} ;
      T01BH60_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ5742ForSerDsc = "" ;
      ZZ4380ForCosForm = DecimalUtil.ZERO ;
      ZZ11279ForcosH20 = DecimalUtil.ZERO ;
      ZZ11280ForCosFab = DecimalUtil.ZERO ;
      ZZ11290ForCosFin = DecimalUtil.ZERO ;
      ZZ279CliNom = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z9767ForProD = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcoscr0__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcoscr0__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcoscr0__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcoscr0__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcoscr0__default(),
         new Object[] {
             new Object[] {
            T01BH2_A494ForSer, T01BH2_A482ForColNom, T01BH2_A483ForColNum, T01BH2_A831TipColCod, T01BH2_A9766ForProC, T01BH2_A11282ForProLn, T01BH2_A11284ForProFs, T01BH2_n11284ForProFs, T01BH2_A11285ForProFsT, T01BH2_n11285ForProFsT,
            T01BH2_A11286ForProMq, T01BH2_n11286ForProMq, T01BH2_A11283ForProMqC, T01BH2_n11283ForProMqC, T01BH2_A396EmprCod, T01BH2_A252CliCod
            }
            , new Object[] {
            T01BH3_A494ForSer, T01BH3_A482ForColNom, T01BH3_A483ForColNum, T01BH3_A831TipColCod, T01BH3_A9766ForProC, T01BH3_A11282ForProLn, T01BH3_A11284ForProFs, T01BH3_n11284ForProFs, T01BH3_A11285ForProFsT, T01BH3_n11285ForProFsT,
            T01BH3_A11286ForProMq, T01BH3_n11286ForProMq, T01BH3_A11283ForProMqC, T01BH3_n11283ForProMqC, T01BH3_A396EmprCod, T01BH3_A252CliCod
            }
            , new Object[] {
            T01BH4_A494ForSer, T01BH4_A482ForColNom, T01BH4_A483ForColNum, T01BH4_A831TipColCod, T01BH4_A9766ForProC, T01BH4_A11281ForProUl, T01BH4_n11281ForProUl, T01BH4_A11289ForProKgs, T01BH4_n11289ForProKgs, T01BH4_A11291FosCosFbk,
            T01BH4_n11291FosCosFbk, T01BH4_A11292ForcosCF, T01BH4_n11292ForcosCF, T01BH4_A396EmprCod, T01BH4_A252CliCod
            }
            , new Object[] {
            T01BH5_A494ForSer, T01BH5_A482ForColNom, T01BH5_A483ForColNum, T01BH5_A831TipColCod, T01BH5_A9766ForProC, T01BH5_A11281ForProUl, T01BH5_n11281ForProUl, T01BH5_A11289ForProKgs, T01BH5_n11289ForProKgs, T01BH5_A11291FosCosFbk,
            T01BH5_n11291FosCosFbk, T01BH5_A11292ForcosCF, T01BH5_n11292ForcosCF, T01BH5_A396EmprCod, T01BH5_A252CliCod
            }
            , new Object[] {
            T01BH7_A11287ForCosFbS, T01BH7_n11287ForCosFbS
            }
            , new Object[] {
            T01BH8_A494ForSer, T01BH8_A482ForColNom, T01BH8_A483ForColNum, T01BH8_A5742ForSerDsc, T01BH8_n5742ForSerDsc, T01BH8_A4380ForCosForm, T01BH8_n4380ForCosForm, T01BH8_A11279ForcosH20, T01BH8_n11279ForcosH20, T01BH8_A11280ForCosFab,
            T01BH8_n11280ForCosFab, T01BH8_A11290ForCosFin, T01BH8_n11290ForCosFin, T01BH8_A396EmprCod, T01BH8_A252CliCod, T01BH8_A831TipColCod
            }
            , new Object[] {
            T01BH9_A494ForSer, T01BH9_A482ForColNom, T01BH9_A483ForColNum, T01BH9_A5742ForSerDsc, T01BH9_n5742ForSerDsc, T01BH9_A4380ForCosForm, T01BH9_n4380ForCosForm, T01BH9_A11279ForcosH20, T01BH9_n11279ForcosH20, T01BH9_A11280ForCosFab,
            T01BH9_n11280ForCosFab, T01BH9_A11290ForCosFin, T01BH9_n11290ForCosFin, T01BH9_A396EmprCod, T01BH9_A252CliCod, T01BH9_A831TipColCod
            }
            , new Object[] {
            T01BH10_A407EmprNom, T01BH10_n407EmprNom
            }
            , new Object[] {
            T01BH11_A279CliNom
            }
            , new Object[] {
            T01BH12_A396EmprCod
            }
            , new Object[] {
            T01BH13_A494ForSer, T01BH13_A482ForColNom, T01BH13_A483ForColNum, T01BH13_A407EmprNom, T01BH13_n407EmprNom, T01BH13_A279CliNom, T01BH13_A5742ForSerDsc, T01BH13_n5742ForSerDsc, T01BH13_A4380ForCosForm, T01BH13_n4380ForCosForm,
            T01BH13_A11279ForcosH20, T01BH13_n11279ForcosH20, T01BH13_A11280ForCosFab, T01BH13_n11280ForCosFab, T01BH13_A11290ForCosFin, T01BH13_n11290ForCosFin, T01BH13_A396EmprCod, T01BH13_A252CliCod, T01BH13_A831TipColCod
            }
            , new Object[] {
            T01BH14_A279CliNom
            }
            , new Object[] {
            T01BH15_A396EmprCod
            }
            , new Object[] {
            T01BH16_A396EmprCod, T01BH16_A252CliCod, T01BH16_A494ForSer, T01BH16_A482ForColNom, T01BH16_A483ForColNum, T01BH16_A831TipColCod
            }
            , new Object[] {
            T01BH17_A396EmprCod, T01BH17_A252CliCod, T01BH17_A494ForSer, T01BH17_A482ForColNom, T01BH17_A483ForColNum, T01BH17_A831TipColCod
            }
            , new Object[] {
            T01BH18_A396EmprCod, T01BH18_A252CliCod, T01BH18_A494ForSer, T01BH18_A482ForColNom, T01BH18_A483ForColNum, T01BH18_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BH22_A279CliNom
            }
            , new Object[] {
            T01BH23_A396EmprCod, T01BH23_A252CliCod, T01BH23_A494ForSer, T01BH23_A482ForColNom, T01BH23_A483ForColNum, T01BH23_A831TipColCod, T01BH23_A13377ForNormaID
            }
            , new Object[] {
            T01BH24_A396EmprCod, T01BH24_A252CliCod, T01BH24_A494ForSer, T01BH24_A482ForColNom, T01BH24_A483ForColNum, T01BH24_A831TipColCod, T01BH24_A3571EnsCod
            }
            , new Object[] {
            T01BH25_A396EmprCod, T01BH25_A252CliCod, T01BH25_A494ForSer, T01BH25_A482ForColNom, T01BH25_A483ForColNum, T01BH25_A831TipColCod, T01BH25_A7270Procod_c, T01BH25_A7272CliCod_d
            }
            , new Object[] {
            T01BH26_A396EmprCod, T01BH26_A252CliCod, T01BH26_A494ForSer, T01BH26_A482ForColNom, T01BH26_A483ForColNum, T01BH26_A831TipColCod, T01BH26_A6525ColAqP
            }
            , new Object[] {
            T01BH27_A396EmprCod, T01BH27_A252CliCod, T01BH27_A494ForSer, T01BH27_A482ForColNom, T01BH27_A483ForColNum, T01BH27_A831TipColCod, T01BH27_A7262CACPP
            }
            , new Object[] {
            T01BH28_A396EmprCod, T01BH28_A252CliCod, T01BH28_A494ForSer, T01BH28_A482ForColNom, T01BH28_A483ForColNum, T01BH28_A831TipColCod, T01BH28_A6037Mq_Grupo
            }
            , new Object[] {
            T01BH29_A396EmprCod, T01BH29_A252CliCod, T01BH29_A494ForSer, T01BH29_A482ForColNom, T01BH29_A483ForColNum, T01BH29_A831TipColCod, T01BH29_A853For_ProC
            }
            , new Object[] {
            T01BH30_A396EmprCod, T01BH30_A252CliCod, T01BH30_A494ForSer, T01BH30_A482ForColNom, T01BH30_A483ForColNum, T01BH30_A831TipColCod, T01BH30_A9766ForProC
            }
            , new Object[] {
            T01BH31_A396EmprCod, T01BH31_A252CliCod, T01BH31_A494ForSer, T01BH31_A482ForColNom, T01BH31_A483ForColNum, T01BH31_A831TipColCod, T01BH31_A7797Sim_lin
            }
            , new Object[] {
            T01BH32_A396EmprCod, T01BH32_A252CliCod, T01BH32_A494ForSer, T01BH32_A482ForColNom, T01BH32_A483ForColNum, T01BH32_A831TipColCod, T01BH32_A7094Acab_Ter
            }
            , new Object[] {
            T01BH33_A396EmprCod, T01BH33_A252CliCod, T01BH33_A494ForSer, T01BH33_A482ForColNom, T01BH33_A483ForColNum, T01BH33_A831TipColCod, T01BH33_A3689ComForLin
            }
            , new Object[] {
            T01BH34_A396EmprCod, T01BH34_A252CliCod, T01BH34_A494ForSer, T01BH34_A482ForColNom, T01BH34_A483ForColNum, T01BH34_A831TipColCod, T01BH34_A1519RecCorLin
            }
            , new Object[] {
            T01BH35_A396EmprCod, T01BH35_A252CliCod, T01BH35_A494ForSer, T01BH35_A482ForColNom, T01BH35_A483ForColNum, T01BH35_A831TipColCod, T01BH35_A1160ProForL
            }
            , new Object[] {
            T01BH36_A396EmprCod, T01BH36_A910Workstat, T01BH36_A880EscLin
            }
            , new Object[] {
            T01BH37_A396EmprCod, T01BH37_A252CliCod, T01BH37_A494ForSer, T01BH37_A482ForColNom, T01BH37_A483ForColNum, T01BH37_A831TipColCod, T01BH37_A650ObsLin
            }
            , new Object[] {
            T01BH38_A396EmprCod, T01BH38_A252CliCod, T01BH38_A494ForSer, T01BH38_A482ForColNom, T01BH38_A483ForColNum, T01BH38_A831TipColCod
            }
            , new Object[] {
            T01BH40_A494ForSer, T01BH40_A482ForColNom, T01BH40_A483ForColNum, T01BH40_A831TipColCod, T01BH40_A9766ForProC, T01BH40_A11281ForProUl, T01BH40_n11281ForProUl, T01BH40_A11289ForProKgs, T01BH40_n11289ForProKgs, T01BH40_A11291FosCosFbk,
            T01BH40_n11291FosCosFbk, T01BH40_A11292ForcosCF, T01BH40_n11292ForcosCF, T01BH40_A396EmprCod, T01BH40_A252CliCod, T01BH40_A11287ForCosFbS, T01BH40_n11287ForCosFbS
            }
            , new Object[] {
            T01BH42_A11287ForCosFbS, T01BH42_n11287ForCosFbS
            }
            , new Object[] {
            T01BH43_A396EmprCod, T01BH43_A252CliCod, T01BH43_A494ForSer, T01BH43_A482ForColNom, T01BH43_A483ForColNum, T01BH43_A831TipColCod, T01BH43_A9766ForProC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BH48_A11287ForCosFbS, T01BH48_n11287ForCosFbS
            }
            , new Object[] {
            T01BH49_A396EmprCod, T01BH49_A252CliCod, T01BH49_A494ForSer, T01BH49_A482ForColNom, T01BH49_A483ForColNum, T01BH49_A831TipColCod, T01BH49_A9766ForProC, T01BH49_A10288Hp_dia
            }
            , new Object[] {
            T01BH50_A396EmprCod, T01BH50_A252CliCod, T01BH50_A494ForSer, T01BH50_A482ForColNom, T01BH50_A483ForColNum, T01BH50_A831TipColCod, T01BH50_A9766ForProC, T01BH50_A1067ForLinN
            }
            , new Object[] {
            T01BH51_A396EmprCod, T01BH51_A252CliCod, T01BH51_A494ForSer, T01BH51_A482ForColNom, T01BH51_A483ForColNum, T01BH51_A831TipColCod, T01BH51_A9766ForProC, T01BH51_A9847ForProL
            }
            , new Object[] {
            T01BH52_A396EmprCod, T01BH52_A252CliCod, T01BH52_A494ForSer, T01BH52_A482ForColNom, T01BH52_A483ForColNum, T01BH52_A831TipColCod, T01BH52_A9766ForProC
            }
            , new Object[] {
            T01BH53_A494ForSer, T01BH53_A482ForColNom, T01BH53_A483ForColNum, T01BH53_A831TipColCod, T01BH53_A9766ForProC, T01BH53_A11282ForProLn, T01BH53_A11284ForProFs, T01BH53_n11284ForProFs, T01BH53_A11285ForProFsT, T01BH53_n11285ForProFsT,
            T01BH53_A11286ForProMq, T01BH53_n11286ForProMq, T01BH53_A11283ForProMqC, T01BH53_n11283ForProMqC, T01BH53_A396EmprCod, T01BH53_A252CliCod
            }
            , new Object[] {
            T01BH54_A396EmprCod, T01BH54_A252CliCod, T01BH54_A494ForSer, T01BH54_A482ForColNom, T01BH54_A483ForColNum, T01BH54_A831TipColCod, T01BH54_A9766ForProC, T01BH54_A11282ForProLn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BH58_A396EmprCod, T01BH58_A252CliCod, T01BH58_A494ForSer, T01BH58_A482ForColNom, T01BH58_A483ForColNum, T01BH58_A831TipColCod, T01BH58_A9766ForProC, T01BH58_A11282ForProLn
            }
            , new Object[] {
            T01BH59_A407EmprNom, T01BH59_n407EmprNom
            }
            , new Object[] {
            T01BH60_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TCOSCR0" ;
   }

   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
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
   private byte ZZ831TipColCod ;
   private short Z11281ForProUl ;
   private short nRcdDeleted_1280 ;
   private short nRcdExists_1280 ;
   private short nIsMod_1280 ;
   private short Z11282ForProLn ;
   private short Z11285ForProFsT ;
   private short nRcdDeleted_1506 ;
   private short nRcdExists_1506 ;
   private short nIsMod_1506 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1280 ;
   private short RcdFound1280 ;
   private short nBlankRcdUsr1280 ;
   private short RcdFound1506 ;
   private short A11282ForProLn ;
   private short A11285ForProFsT ;
   private short A11281ForProUl ;
   private short RcdFound47 ;
   private short nIsDirty_47 ;
   private short nIsDirty_1280 ;
   private short nIsDirty_1506 ;
   private short nBlankRcdCount1506 ;
   private short nBlankRcdUsr1506 ;
   private short subGrid1_Borderwidth ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int nRC_GXsfl_85 ;
   private int nGXsfl_85_idx=1 ;
   private int nRC_GXsfl_127 ;
   private int nGXsfl_127_idx=1 ;
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
   private int edtForCosForm_Enabled ;
   private int edtForcosH20_Enabled ;
   private int edtForCosFab_Enabled ;
   private int edtForCosFin_Enabled ;
   private int edtForProC_Enabled ;
   private int edtForProD_Enabled ;
   private int edtForProUl_Enabled ;
   private int edtForCosFbS_Enabled ;
   private int edtForProKgs_Enabled ;
   private int edtFosCosFbk_Enabled ;
   private int edtForcosCF_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1506_Enabled ;
   private int edtForProLn_Enabled ;
   private int edtForProFs_Enabled ;
   private int edtForProFsT_Enabled ;
   private int edtForProMq_Enabled ;
   private int edtForProMqC_Enabled ;
   private int edtForProCfl_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtForProLn_Enabled ;
   private int defedtForProC_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtForCosFin_Backcolor ;
   private int edtForCosFab_Backcolor ;
   private int edtForcosH20_Backcolor ;
   private int edtForCosForm_Backcolor ;
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
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z4380ForCosForm ;
   private java.math.BigDecimal Z11279ForcosH20 ;
   private java.math.BigDecimal Z11280ForCosFab ;
   private java.math.BigDecimal Z11290ForCosFin ;
   private java.math.BigDecimal Z11289ForProKgs ;
   private java.math.BigDecimal Z11291FosCosFbk ;
   private java.math.BigDecimal Z11292ForcosCF ;
   private java.math.BigDecimal O11287ForCosFbS ;
   private java.math.BigDecimal Z11283ForProMqC ;
   private java.math.BigDecimal O11288ForProCfl ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A11279ForcosH20 ;
   private java.math.BigDecimal A11280ForCosFab ;
   private java.math.BigDecimal A11290ForCosFin ;
   private java.math.BigDecimal s11287ForCosFbS ;
   private java.math.BigDecimal A11287ForCosFbS ;
   private java.math.BigDecimal A11283ForProMqC ;
   private java.math.BigDecimal A11288ForProCfl ;
   private java.math.BigDecimal T11288ForProCfl ;
   private java.math.BigDecimal A11289ForProKgs ;
   private java.math.BigDecimal A11291FosCosFbk ;
   private java.math.BigDecimal A11292ForcosCF ;
   private java.math.BigDecimal T11287ForCosFbS ;
   private java.math.BigDecimal Z11287ForCosFbS ;
   private java.math.BigDecimal B11287ForCosFbS ;
   private java.math.BigDecimal ZZ4380ForCosForm ;
   private java.math.BigDecimal ZZ11279ForcosH20 ;
   private java.math.BigDecimal ZZ11280ForCosFab ;
   private java.math.BigDecimal ZZ11290ForCosFin ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z5742ForSerDsc ;
   private String Z9766ForProC ;
   private String Z11284ForProFs ;
   private String Z11286ForProMq ;
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
   private String edtCliCod_Internalname ;
   private String sGXsfl_85_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_127_idx="0001" ;
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
   private String edtForSerDsc_Internalname ;
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
   private String edtForCosForm_Internalname ;
   private String edtForCosForm_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtForcosH20_Internalname ;
   private String edtForcosH20_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtForCosFab_Internalname ;
   private String edtForCosFab_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtForCosFin_Internalname ;
   private String edtForCosFin_Jsonclick ;
   private String sMode1280 ;
   private String edtForProC_Internalname ;
   private String edtForProD_Internalname ;
   private String edtForProUl_Internalname ;
   private String edtForCosFbS_Internalname ;
   private String edtForProKgs_Internalname ;
   private String edtFosCosFbk_Internalname ;
   private String edtForcosCF_Internalname ;
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
   private String edtavnRcdDeleted_1506_Internalname ;
   private String sMode47 ;
   private String GXCCtl ;
   private String edtForProLn_Internalname ;
   private String edtForProFs_Internalname ;
   private String A11284ForProFs ;
   private String edtForProFsT_Internalname ;
   private String edtForProMq_Internalname ;
   private String A11286ForProMq ;
   private String edtForProMqC_Internalname ;
   private String edtForProCfl_Internalname ;
   private String A9767ForProD ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode1506 ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock20_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_85_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String ROClassString ;
   private String edtForProC_Jsonclick ;
   private String lblTextblock15_Jsonclick ;
   private String edtForProD_Jsonclick ;
   private String lblTextblock16_Jsonclick ;
   private String edtForProUl_Jsonclick ;
   private String lblTextblock17_Jsonclick ;
   private String edtForCosFbS_Jsonclick ;
   private String lblTextblock18_Jsonclick ;
   private String edtForProKgs_Jsonclick ;
   private String lblTextblock19_Jsonclick ;
   private String edtFosCosFbk_Jsonclick ;
   private String lblTextblock20_Jsonclick ;
   private String edtForcosCF_Jsonclick ;
   private String sGXsfl_127_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1506_Jsonclick ;
   private String edtForProLn_Jsonclick ;
   private String edtForProFs_Jsonclick ;
   private String edtForProFsT_Jsonclick ;
   private String edtForProMq_Jsonclick ;
   private String edtForProMqC_Jsonclick ;
   private String edtForProCfl_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock14_Caption ;
   private String lblTextblock15_Caption ;
   private String lblTextblock16_Caption ;
   private String lblTextblock17_Caption ;
   private String lblTextblock18_Caption ;
   private String lblTextblock19_Caption ;
   private String lblTextblock20_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ407EmprNom ;
   private String ZZ5742ForSerDsc ;
   private String ZZ279CliNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z9767ForProD ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n831TipColCod ;
   private boolean n494ForSer ;
   private boolean n482ForColNom ;
   private boolean n483ForColNum ;
   private boolean wbErr ;
   private boolean bGXsfl_85_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5742ForSerDsc ;
   private boolean n4380ForCosForm ;
   private boolean n11279ForcosH20 ;
   private boolean n11280ForCosFab ;
   private boolean n11290ForCosFin ;
   private boolean bGXsfl_127_Refreshing=false ;
   private boolean n11287ForCosFbS ;
   private boolean returnInSub ;
   private boolean n11281ForProUl ;
   private boolean n11289ForProKgs ;
   private boolean n11291FosCosFbk ;
   private boolean n11292ForcosCF ;
   private boolean n11284ForProFs ;
   private boolean n11285ForProFsT ;
   private boolean n11286ForProMq ;
   private boolean n11283ForProMqC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01BH10_A407EmprNom ;
   private boolean[] T01BH10_n407EmprNom ;
   private String[] T01BH13_A494ForSer ;
   private boolean[] T01BH13_n494ForSer ;
   private String[] T01BH13_A482ForColNom ;
   private boolean[] T01BH13_n482ForColNom ;
   private int[] T01BH13_A483ForColNum ;
   private boolean[] T01BH13_n483ForColNum ;
   private String[] T01BH13_A407EmprNom ;
   private boolean[] T01BH13_n407EmprNom ;
   private String[] T01BH13_A279CliNom ;
   private String[] T01BH13_A5742ForSerDsc ;
   private boolean[] T01BH13_n5742ForSerDsc ;
   private java.math.BigDecimal[] T01BH13_A4380ForCosForm ;
   private boolean[] T01BH13_n4380ForCosForm ;
   private java.math.BigDecimal[] T01BH13_A11279ForcosH20 ;
   private boolean[] T01BH13_n11279ForcosH20 ;
   private java.math.BigDecimal[] T01BH13_A11280ForCosFab ;
   private boolean[] T01BH13_n11280ForCosFab ;
   private java.math.BigDecimal[] T01BH13_A11290ForCosFin ;
   private boolean[] T01BH13_n11290ForCosFin ;
   private String[] T01BH13_A396EmprCod ;
   private int[] T01BH13_A252CliCod ;
   private boolean[] T01BH13_n252CliCod ;
   private byte[] T01BH13_A831TipColCod ;
   private boolean[] T01BH13_n831TipColCod ;
   private String[] T01BH11_A279CliNom ;
   private String[] T01BH12_A396EmprCod ;
   private String[] T01BH14_A279CliNom ;
   private String[] T01BH15_A396EmprCod ;
   private String[] T01BH16_A396EmprCod ;
   private int[] T01BH16_A252CliCod ;
   private boolean[] T01BH16_n252CliCod ;
   private String[] T01BH16_A494ForSer ;
   private boolean[] T01BH16_n494ForSer ;
   private String[] T01BH16_A482ForColNom ;
   private boolean[] T01BH16_n482ForColNom ;
   private int[] T01BH16_A483ForColNum ;
   private boolean[] T01BH16_n483ForColNum ;
   private byte[] T01BH16_A831TipColCod ;
   private boolean[] T01BH16_n831TipColCod ;
   private String[] T01BH9_A494ForSer ;
   private boolean[] T01BH9_n494ForSer ;
   private String[] T01BH9_A482ForColNom ;
   private boolean[] T01BH9_n482ForColNom ;
   private int[] T01BH9_A483ForColNum ;
   private boolean[] T01BH9_n483ForColNum ;
   private String[] T01BH9_A5742ForSerDsc ;
   private boolean[] T01BH9_n5742ForSerDsc ;
   private java.math.BigDecimal[] T01BH9_A4380ForCosForm ;
   private boolean[] T01BH9_n4380ForCosForm ;
   private java.math.BigDecimal[] T01BH9_A11279ForcosH20 ;
   private boolean[] T01BH9_n11279ForcosH20 ;
   private java.math.BigDecimal[] T01BH9_A11280ForCosFab ;
   private boolean[] T01BH9_n11280ForCosFab ;
   private java.math.BigDecimal[] T01BH9_A11290ForCosFin ;
   private boolean[] T01BH9_n11290ForCosFin ;
   private String[] T01BH9_A396EmprCod ;
   private int[] T01BH9_A252CliCod ;
   private boolean[] T01BH9_n252CliCod ;
   private byte[] T01BH9_A831TipColCod ;
   private boolean[] T01BH9_n831TipColCod ;
   private String[] T01BH17_A396EmprCod ;
   private int[] T01BH17_A252CliCod ;
   private boolean[] T01BH17_n252CliCod ;
   private String[] T01BH17_A494ForSer ;
   private boolean[] T01BH17_n494ForSer ;
   private String[] T01BH17_A482ForColNom ;
   private boolean[] T01BH17_n482ForColNom ;
   private int[] T01BH17_A483ForColNum ;
   private boolean[] T01BH17_n483ForColNum ;
   private byte[] T01BH17_A831TipColCod ;
   private boolean[] T01BH17_n831TipColCod ;
   private String[] T01BH18_A396EmprCod ;
   private int[] T01BH18_A252CliCod ;
   private boolean[] T01BH18_n252CliCod ;
   private String[] T01BH18_A494ForSer ;
   private boolean[] T01BH18_n494ForSer ;
   private String[] T01BH18_A482ForColNom ;
   private boolean[] T01BH18_n482ForColNom ;
   private int[] T01BH18_A483ForColNum ;
   private boolean[] T01BH18_n483ForColNum ;
   private byte[] T01BH18_A831TipColCod ;
   private boolean[] T01BH18_n831TipColCod ;
   private String[] T01BH8_A494ForSer ;
   private boolean[] T01BH8_n494ForSer ;
   private String[] T01BH8_A482ForColNom ;
   private boolean[] T01BH8_n482ForColNom ;
   private int[] T01BH8_A483ForColNum ;
   private boolean[] T01BH8_n483ForColNum ;
   private String[] T01BH8_A5742ForSerDsc ;
   private boolean[] T01BH8_n5742ForSerDsc ;
   private java.math.BigDecimal[] T01BH8_A4380ForCosForm ;
   private boolean[] T01BH8_n4380ForCosForm ;
   private java.math.BigDecimal[] T01BH8_A11279ForcosH20 ;
   private boolean[] T01BH8_n11279ForcosH20 ;
   private java.math.BigDecimal[] T01BH8_A11280ForCosFab ;
   private boolean[] T01BH8_n11280ForCosFab ;
   private java.math.BigDecimal[] T01BH8_A11290ForCosFin ;
   private boolean[] T01BH8_n11290ForCosFin ;
   private String[] T01BH8_A396EmprCod ;
   private int[] T01BH8_A252CliCod ;
   private boolean[] T01BH8_n252CliCod ;
   private byte[] T01BH8_A831TipColCod ;
   private boolean[] T01BH8_n831TipColCod ;
   private String[] T01BH22_A279CliNom ;
   private String[] T01BH23_A396EmprCod ;
   private int[] T01BH23_A252CliCod ;
   private boolean[] T01BH23_n252CliCod ;
   private String[] T01BH23_A494ForSer ;
   private boolean[] T01BH23_n494ForSer ;
   private String[] T01BH23_A482ForColNom ;
   private boolean[] T01BH23_n482ForColNom ;
   private int[] T01BH23_A483ForColNum ;
   private boolean[] T01BH23_n483ForColNum ;
   private byte[] T01BH23_A831TipColCod ;
   private boolean[] T01BH23_n831TipColCod ;
   private String[] T01BH23_A13377ForNormaID ;
   private String[] T01BH24_A396EmprCod ;
   private int[] T01BH24_A252CliCod ;
   private boolean[] T01BH24_n252CliCod ;
   private String[] T01BH24_A494ForSer ;
   private boolean[] T01BH24_n494ForSer ;
   private String[] T01BH24_A482ForColNom ;
   private boolean[] T01BH24_n482ForColNom ;
   private int[] T01BH24_A483ForColNum ;
   private boolean[] T01BH24_n483ForColNum ;
   private byte[] T01BH24_A831TipColCod ;
   private boolean[] T01BH24_n831TipColCod ;
   private String[] T01BH24_A3571EnsCod ;
   private String[] T01BH25_A396EmprCod ;
   private int[] T01BH25_A252CliCod ;
   private boolean[] T01BH25_n252CliCod ;
   private String[] T01BH25_A494ForSer ;
   private boolean[] T01BH25_n494ForSer ;
   private String[] T01BH25_A482ForColNom ;
   private boolean[] T01BH25_n482ForColNom ;
   private int[] T01BH25_A483ForColNum ;
   private boolean[] T01BH25_n483ForColNum ;
   private byte[] T01BH25_A831TipColCod ;
   private boolean[] T01BH25_n831TipColCod ;
   private String[] T01BH25_A7270Procod_c ;
   private int[] T01BH25_A7272CliCod_d ;
   private String[] T01BH26_A396EmprCod ;
   private int[] T01BH26_A252CliCod ;
   private boolean[] T01BH26_n252CliCod ;
   private String[] T01BH26_A494ForSer ;
   private boolean[] T01BH26_n494ForSer ;
   private String[] T01BH26_A482ForColNom ;
   private boolean[] T01BH26_n482ForColNom ;
   private int[] T01BH26_A483ForColNum ;
   private boolean[] T01BH26_n483ForColNum ;
   private byte[] T01BH26_A831TipColCod ;
   private boolean[] T01BH26_n831TipColCod ;
   private String[] T01BH26_A6525ColAqP ;
   private String[] T01BH27_A396EmprCod ;
   private int[] T01BH27_A252CliCod ;
   private boolean[] T01BH27_n252CliCod ;
   private String[] T01BH27_A494ForSer ;
   private boolean[] T01BH27_n494ForSer ;
   private String[] T01BH27_A482ForColNom ;
   private boolean[] T01BH27_n482ForColNom ;
   private int[] T01BH27_A483ForColNum ;
   private boolean[] T01BH27_n483ForColNum ;
   private byte[] T01BH27_A831TipColCod ;
   private boolean[] T01BH27_n831TipColCod ;
   private String[] T01BH27_A7262CACPP ;
   private String[] T01BH28_A396EmprCod ;
   private int[] T01BH28_A252CliCod ;
   private boolean[] T01BH28_n252CliCod ;
   private String[] T01BH28_A494ForSer ;
   private boolean[] T01BH28_n494ForSer ;
   private String[] T01BH28_A482ForColNom ;
   private boolean[] T01BH28_n482ForColNom ;
   private int[] T01BH28_A483ForColNum ;
   private boolean[] T01BH28_n483ForColNum ;
   private byte[] T01BH28_A831TipColCod ;
   private boolean[] T01BH28_n831TipColCod ;
   private byte[] T01BH28_A6037Mq_Grupo ;
   private String[] T01BH29_A396EmprCod ;
   private int[] T01BH29_A252CliCod ;
   private boolean[] T01BH29_n252CliCod ;
   private String[] T01BH29_A494ForSer ;
   private boolean[] T01BH29_n494ForSer ;
   private String[] T01BH29_A482ForColNom ;
   private boolean[] T01BH29_n482ForColNom ;
   private int[] T01BH29_A483ForColNum ;
   private boolean[] T01BH29_n483ForColNum ;
   private byte[] T01BH29_A831TipColCod ;
   private boolean[] T01BH29_n831TipColCod ;
   private String[] T01BH29_A853For_ProC ;
   private String[] T01BH30_A396EmprCod ;
   private int[] T01BH30_A252CliCod ;
   private boolean[] T01BH30_n252CliCod ;
   private String[] T01BH30_A494ForSer ;
   private boolean[] T01BH30_n494ForSer ;
   private String[] T01BH30_A482ForColNom ;
   private boolean[] T01BH30_n482ForColNom ;
   private int[] T01BH30_A483ForColNum ;
   private boolean[] T01BH30_n483ForColNum ;
   private byte[] T01BH30_A831TipColCod ;
   private boolean[] T01BH30_n831TipColCod ;
   private String[] T01BH30_A9766ForProC ;
   private String[] T01BH31_A396EmprCod ;
   private int[] T01BH31_A252CliCod ;
   private boolean[] T01BH31_n252CliCod ;
   private String[] T01BH31_A494ForSer ;
   private boolean[] T01BH31_n494ForSer ;
   private String[] T01BH31_A482ForColNom ;
   private boolean[] T01BH31_n482ForColNom ;
   private int[] T01BH31_A483ForColNum ;
   private boolean[] T01BH31_n483ForColNum ;
   private byte[] T01BH31_A831TipColCod ;
   private boolean[] T01BH31_n831TipColCod ;
   private short[] T01BH31_A7797Sim_lin ;
   private String[] T01BH32_A396EmprCod ;
   private int[] T01BH32_A252CliCod ;
   private boolean[] T01BH32_n252CliCod ;
   private String[] T01BH32_A494ForSer ;
   private boolean[] T01BH32_n494ForSer ;
   private String[] T01BH32_A482ForColNom ;
   private boolean[] T01BH32_n482ForColNom ;
   private int[] T01BH32_A483ForColNum ;
   private boolean[] T01BH32_n483ForColNum ;
   private byte[] T01BH32_A831TipColCod ;
   private boolean[] T01BH32_n831TipColCod ;
   private String[] T01BH32_A7094Acab_Ter ;
   private String[] T01BH33_A396EmprCod ;
   private int[] T01BH33_A252CliCod ;
   private boolean[] T01BH33_n252CliCod ;
   private String[] T01BH33_A494ForSer ;
   private boolean[] T01BH33_n494ForSer ;
   private String[] T01BH33_A482ForColNom ;
   private boolean[] T01BH33_n482ForColNom ;
   private int[] T01BH33_A483ForColNum ;
   private boolean[] T01BH33_n483ForColNum ;
   private byte[] T01BH33_A831TipColCod ;
   private boolean[] T01BH33_n831TipColCod ;
   private short[] T01BH33_A3689ComForLin ;
   private String[] T01BH34_A396EmprCod ;
   private int[] T01BH34_A252CliCod ;
   private boolean[] T01BH34_n252CliCod ;
   private String[] T01BH34_A494ForSer ;
   private boolean[] T01BH34_n494ForSer ;
   private String[] T01BH34_A482ForColNom ;
   private boolean[] T01BH34_n482ForColNom ;
   private int[] T01BH34_A483ForColNum ;
   private boolean[] T01BH34_n483ForColNum ;
   private byte[] T01BH34_A831TipColCod ;
   private boolean[] T01BH34_n831TipColCod ;
   private byte[] T01BH34_A1519RecCorLin ;
   private String[] T01BH35_A396EmprCod ;
   private int[] T01BH35_A252CliCod ;
   private boolean[] T01BH35_n252CliCod ;
   private String[] T01BH35_A494ForSer ;
   private boolean[] T01BH35_n494ForSer ;
   private String[] T01BH35_A482ForColNom ;
   private boolean[] T01BH35_n482ForColNom ;
   private int[] T01BH35_A483ForColNum ;
   private boolean[] T01BH35_n483ForColNum ;
   private byte[] T01BH35_A831TipColCod ;
   private boolean[] T01BH35_n831TipColCod ;
   private short[] T01BH35_A1160ProForL ;
   private String[] T01BH36_A396EmprCod ;
   private String[] T01BH36_A910Workstat ;
   private short[] T01BH36_A880EscLin ;
   private String[] T01BH37_A396EmprCod ;
   private int[] T01BH37_A252CliCod ;
   private boolean[] T01BH37_n252CliCod ;
   private String[] T01BH37_A494ForSer ;
   private boolean[] T01BH37_n494ForSer ;
   private String[] T01BH37_A482ForColNom ;
   private boolean[] T01BH37_n482ForColNom ;
   private int[] T01BH37_A483ForColNum ;
   private boolean[] T01BH37_n483ForColNum ;
   private byte[] T01BH37_A831TipColCod ;
   private boolean[] T01BH37_n831TipColCod ;
   private short[] T01BH37_A650ObsLin ;
   private String[] T01BH38_A396EmprCod ;
   private int[] T01BH38_A252CliCod ;
   private boolean[] T01BH38_n252CliCod ;
   private String[] T01BH38_A494ForSer ;
   private boolean[] T01BH38_n494ForSer ;
   private String[] T01BH38_A482ForColNom ;
   private boolean[] T01BH38_n482ForColNom ;
   private int[] T01BH38_A483ForColNum ;
   private boolean[] T01BH38_n483ForColNum ;
   private byte[] T01BH38_A831TipColCod ;
   private boolean[] T01BH38_n831TipColCod ;
   private String[] T01BH40_A494ForSer ;
   private boolean[] T01BH40_n494ForSer ;
   private String[] T01BH40_A482ForColNom ;
   private boolean[] T01BH40_n482ForColNom ;
   private int[] T01BH40_A483ForColNum ;
   private boolean[] T01BH40_n483ForColNum ;
   private byte[] T01BH40_A831TipColCod ;
   private boolean[] T01BH40_n831TipColCod ;
   private String[] T01BH40_A9766ForProC ;
   private short[] T01BH40_A11281ForProUl ;
   private boolean[] T01BH40_n11281ForProUl ;
   private java.math.BigDecimal[] T01BH40_A11289ForProKgs ;
   private boolean[] T01BH40_n11289ForProKgs ;
   private java.math.BigDecimal[] T01BH40_A11291FosCosFbk ;
   private boolean[] T01BH40_n11291FosCosFbk ;
   private java.math.BigDecimal[] T01BH40_A11292ForcosCF ;
   private boolean[] T01BH40_n11292ForcosCF ;
   private String[] T01BH40_A396EmprCod ;
   private int[] T01BH40_A252CliCod ;
   private boolean[] T01BH40_n252CliCod ;
   private java.math.BigDecimal[] T01BH40_A11287ForCosFbS ;
   private boolean[] T01BH40_n11287ForCosFbS ;
   private java.math.BigDecimal[] T01BH7_A11287ForCosFbS ;
   private boolean[] T01BH7_n11287ForCosFbS ;
   private java.math.BigDecimal[] T01BH42_A11287ForCosFbS ;
   private boolean[] T01BH42_n11287ForCosFbS ;
   private String[] T01BH43_A396EmprCod ;
   private int[] T01BH43_A252CliCod ;
   private boolean[] T01BH43_n252CliCod ;
   private String[] T01BH43_A494ForSer ;
   private boolean[] T01BH43_n494ForSer ;
   private String[] T01BH43_A482ForColNom ;
   private boolean[] T01BH43_n482ForColNom ;
   private int[] T01BH43_A483ForColNum ;
   private boolean[] T01BH43_n483ForColNum ;
   private byte[] T01BH43_A831TipColCod ;
   private boolean[] T01BH43_n831TipColCod ;
   private String[] T01BH43_A9766ForProC ;
   private String[] T01BH5_A494ForSer ;
   private boolean[] T01BH5_n494ForSer ;
   private String[] T01BH5_A482ForColNom ;
   private boolean[] T01BH5_n482ForColNom ;
   private int[] T01BH5_A483ForColNum ;
   private boolean[] T01BH5_n483ForColNum ;
   private byte[] T01BH5_A831TipColCod ;
   private boolean[] T01BH5_n831TipColCod ;
   private String[] T01BH5_A9766ForProC ;
   private short[] T01BH5_A11281ForProUl ;
   private boolean[] T01BH5_n11281ForProUl ;
   private java.math.BigDecimal[] T01BH5_A11289ForProKgs ;
   private boolean[] T01BH5_n11289ForProKgs ;
   private java.math.BigDecimal[] T01BH5_A11291FosCosFbk ;
   private boolean[] T01BH5_n11291FosCosFbk ;
   private java.math.BigDecimal[] T01BH5_A11292ForcosCF ;
   private boolean[] T01BH5_n11292ForcosCF ;
   private String[] T01BH5_A396EmprCod ;
   private int[] T01BH5_A252CliCod ;
   private boolean[] T01BH5_n252CliCod ;
   private String[] T01BH4_A494ForSer ;
   private boolean[] T01BH4_n494ForSer ;
   private String[] T01BH4_A482ForColNom ;
   private boolean[] T01BH4_n482ForColNom ;
   private int[] T01BH4_A483ForColNum ;
   private boolean[] T01BH4_n483ForColNum ;
   private byte[] T01BH4_A831TipColCod ;
   private boolean[] T01BH4_n831TipColCod ;
   private String[] T01BH4_A9766ForProC ;
   private short[] T01BH4_A11281ForProUl ;
   private boolean[] T01BH4_n11281ForProUl ;
   private java.math.BigDecimal[] T01BH4_A11289ForProKgs ;
   private boolean[] T01BH4_n11289ForProKgs ;
   private java.math.BigDecimal[] T01BH4_A11291FosCosFbk ;
   private boolean[] T01BH4_n11291FosCosFbk ;
   private java.math.BigDecimal[] T01BH4_A11292ForcosCF ;
   private boolean[] T01BH4_n11292ForcosCF ;
   private String[] T01BH4_A396EmprCod ;
   private int[] T01BH4_A252CliCod ;
   private boolean[] T01BH4_n252CliCod ;
   private java.math.BigDecimal[] T01BH48_A11287ForCosFbS ;
   private boolean[] T01BH48_n11287ForCosFbS ;
   private String[] T01BH49_A396EmprCod ;
   private int[] T01BH49_A252CliCod ;
   private boolean[] T01BH49_n252CliCod ;
   private String[] T01BH49_A494ForSer ;
   private boolean[] T01BH49_n494ForSer ;
   private String[] T01BH49_A482ForColNom ;
   private boolean[] T01BH49_n482ForColNom ;
   private int[] T01BH49_A483ForColNum ;
   private boolean[] T01BH49_n483ForColNum ;
   private byte[] T01BH49_A831TipColCod ;
   private boolean[] T01BH49_n831TipColCod ;
   private String[] T01BH49_A9766ForProC ;
   private java.util.Date[] T01BH49_A10288Hp_dia ;
   private String[] T01BH50_A396EmprCod ;
   private int[] T01BH50_A252CliCod ;
   private boolean[] T01BH50_n252CliCod ;
   private String[] T01BH50_A494ForSer ;
   private boolean[] T01BH50_n494ForSer ;
   private String[] T01BH50_A482ForColNom ;
   private boolean[] T01BH50_n482ForColNom ;
   private int[] T01BH50_A483ForColNum ;
   private boolean[] T01BH50_n483ForColNum ;
   private byte[] T01BH50_A831TipColCod ;
   private boolean[] T01BH50_n831TipColCod ;
   private String[] T01BH50_A9766ForProC ;
   private short[] T01BH50_A1067ForLinN ;
   private String[] T01BH51_A396EmprCod ;
   private int[] T01BH51_A252CliCod ;
   private boolean[] T01BH51_n252CliCod ;
   private String[] T01BH51_A494ForSer ;
   private boolean[] T01BH51_n494ForSer ;
   private String[] T01BH51_A482ForColNom ;
   private boolean[] T01BH51_n482ForColNom ;
   private int[] T01BH51_A483ForColNum ;
   private boolean[] T01BH51_n483ForColNum ;
   private byte[] T01BH51_A831TipColCod ;
   private boolean[] T01BH51_n831TipColCod ;
   private String[] T01BH51_A9766ForProC ;
   private short[] T01BH51_A9847ForProL ;
   private String[] T01BH52_A396EmprCod ;
   private int[] T01BH52_A252CliCod ;
   private boolean[] T01BH52_n252CliCod ;
   private String[] T01BH52_A494ForSer ;
   private boolean[] T01BH52_n494ForSer ;
   private String[] T01BH52_A482ForColNom ;
   private boolean[] T01BH52_n482ForColNom ;
   private int[] T01BH52_A483ForColNum ;
   private boolean[] T01BH52_n483ForColNum ;
   private byte[] T01BH52_A831TipColCod ;
   private boolean[] T01BH52_n831TipColCod ;
   private String[] T01BH52_A9766ForProC ;
   private String[] T01BH53_A494ForSer ;
   private boolean[] T01BH53_n494ForSer ;
   private String[] T01BH53_A482ForColNom ;
   private boolean[] T01BH53_n482ForColNom ;
   private int[] T01BH53_A483ForColNum ;
   private boolean[] T01BH53_n483ForColNum ;
   private byte[] T01BH53_A831TipColCod ;
   private boolean[] T01BH53_n831TipColCod ;
   private String[] T01BH53_A9766ForProC ;
   private short[] T01BH53_A11282ForProLn ;
   private String[] T01BH53_A11284ForProFs ;
   private boolean[] T01BH53_n11284ForProFs ;
   private short[] T01BH53_A11285ForProFsT ;
   private boolean[] T01BH53_n11285ForProFsT ;
   private String[] T01BH53_A11286ForProMq ;
   private boolean[] T01BH53_n11286ForProMq ;
   private java.math.BigDecimal[] T01BH53_A11283ForProMqC ;
   private boolean[] T01BH53_n11283ForProMqC ;
   private String[] T01BH53_A396EmprCod ;
   private int[] T01BH53_A252CliCod ;
   private boolean[] T01BH53_n252CliCod ;
   private String[] T01BH54_A396EmprCod ;
   private int[] T01BH54_A252CliCod ;
   private boolean[] T01BH54_n252CliCod ;
   private String[] T01BH54_A494ForSer ;
   private boolean[] T01BH54_n494ForSer ;
   private String[] T01BH54_A482ForColNom ;
   private boolean[] T01BH54_n482ForColNom ;
   private int[] T01BH54_A483ForColNum ;
   private boolean[] T01BH54_n483ForColNum ;
   private byte[] T01BH54_A831TipColCod ;
   private boolean[] T01BH54_n831TipColCod ;
   private String[] T01BH54_A9766ForProC ;
   private short[] T01BH54_A11282ForProLn ;
   private String[] T01BH3_A494ForSer ;
   private boolean[] T01BH3_n494ForSer ;
   private String[] T01BH3_A482ForColNom ;
   private boolean[] T01BH3_n482ForColNom ;
   private int[] T01BH3_A483ForColNum ;
   private boolean[] T01BH3_n483ForColNum ;
   private byte[] T01BH3_A831TipColCod ;
   private boolean[] T01BH3_n831TipColCod ;
   private String[] T01BH3_A9766ForProC ;
   private short[] T01BH3_A11282ForProLn ;
   private String[] T01BH3_A11284ForProFs ;
   private boolean[] T01BH3_n11284ForProFs ;
   private short[] T01BH3_A11285ForProFsT ;
   private boolean[] T01BH3_n11285ForProFsT ;
   private String[] T01BH3_A11286ForProMq ;
   private boolean[] T01BH3_n11286ForProMq ;
   private java.math.BigDecimal[] T01BH3_A11283ForProMqC ;
   private boolean[] T01BH3_n11283ForProMqC ;
   private String[] T01BH3_A396EmprCod ;
   private int[] T01BH3_A252CliCod ;
   private boolean[] T01BH3_n252CliCod ;
   private String[] T01BH2_A494ForSer ;
   private boolean[] T01BH2_n494ForSer ;
   private String[] T01BH2_A482ForColNom ;
   private boolean[] T01BH2_n482ForColNom ;
   private int[] T01BH2_A483ForColNum ;
   private boolean[] T01BH2_n483ForColNum ;
   private byte[] T01BH2_A831TipColCod ;
   private boolean[] T01BH2_n831TipColCod ;
   private String[] T01BH2_A9766ForProC ;
   private short[] T01BH2_A11282ForProLn ;
   private String[] T01BH2_A11284ForProFs ;
   private boolean[] T01BH2_n11284ForProFs ;
   private short[] T01BH2_A11285ForProFsT ;
   private boolean[] T01BH2_n11285ForProFsT ;
   private String[] T01BH2_A11286ForProMq ;
   private boolean[] T01BH2_n11286ForProMq ;
   private java.math.BigDecimal[] T01BH2_A11283ForProMqC ;
   private boolean[] T01BH2_n11283ForProMqC ;
   private String[] T01BH2_A396EmprCod ;
   private int[] T01BH2_A252CliCod ;
   private boolean[] T01BH2_n252CliCod ;
   private String[] T01BH58_A396EmprCod ;
   private int[] T01BH58_A252CliCod ;
   private boolean[] T01BH58_n252CliCod ;
   private String[] T01BH58_A494ForSer ;
   private boolean[] T01BH58_n494ForSer ;
   private String[] T01BH58_A482ForColNom ;
   private boolean[] T01BH58_n482ForColNom ;
   private int[] T01BH58_A483ForColNum ;
   private boolean[] T01BH58_n483ForColNum ;
   private byte[] T01BH58_A831TipColCod ;
   private boolean[] T01BH58_n831TipColCod ;
   private String[] T01BH58_A9766ForProC ;
   private short[] T01BH58_A11282ForProLn ;
   private String[] T01BH59_A407EmprNom ;
   private boolean[] T01BH59_n407EmprNom ;
   private String[] T01BH60_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcoscr0__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcoscr0__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcoscr0__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcoscr0__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcoscr0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BH2", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn, ForProFs, ForProFsT, ForProMq, ForProMqC, EmprCod, CliCod FROM TXPCOSCR0 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProLn = ?  FOR UPDATE OF ForProFs, ForProFsT, ForProMq, ForProMqC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH3", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn, ForProFs, ForProFsT, ForProMq, ForProMqC, EmprCod, CliCod FROM TXPCOSCR0 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH4", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProUl, ForProKgs, FosCosFbk, ForcosCF, EmprCod, CliCod FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?  FOR UPDATE OF ForProUl, ForProKgs, FosCosFbk, ForcosCF NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH5", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProUl, ForProKgs, FosCosFbk, ForcosCF, EmprCod, CliCod FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH7", "SELECT COALESCE( T1.ForCosFbS, 0) AS ForCosFbS FROM (SELECT SUM(ROUND(( COALESCE( ForProMqC, 0) * CAST(COALESCE( ForProFsT, 0) AS NUMERIC(19,10))), 2)) AS ForCosFbS, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCOSCR0 GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.ForSer = ? AND T1.ForColNom = ? AND T1.ForColNum = ? AND T1.TipColCod = ? AND T1.ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH8", "SELECT ForSer, ForColNom, ForColNum, ForSerDsc, ForCosForm, ForcosH20, ForCosFab, ForCosFin, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?  FOR UPDATE OF ForSerDsc, ForCosForm, ForcosH20, ForCosFab, ForCosFin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH9", "SELECT ForSer, ForColNom, ForColNum, ForSerDsc, ForCosForm, ForcosH20, ForCosFab, ForCosFin, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH12", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH13", "SELECT /*+ FIRST_ROWS(100) */ TM1.ForSer, TM1.ForColNom, TM1.ForColNum, T2.EmprNom, T3.CliNom, TM1.ForSerDsc, TM1.ForCosForm, TM1.ForcosH20, TM1.ForCosFab, TM1.ForCosFin, TM1.EmprCod, TM1.CliCod, TM1.TipColCod FROM ((TXPCFORMU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH15", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE ( CliCod > ? or CliCod = ? and ForSer > ? or ForSer = ? and CliCod = ? and ForColNom > ? or ForColNom = ? and ForSer = ? and CliCod = ? and ForColNum > ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and TipColCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE ( CliCod < ? or CliCod = ? and ForSer < ? or ForSer = ? and CliCod = ? and ForColNom < ? or ForColNom = ? and ForSer = ? and CliCod = ? and ForColNum < ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and TipColCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BH19", "INSERT INTO TXPCFORMU(ForSer, ForColNom, ForColNum, ForSerDsc, ForCosForm, ForcosH20, ForCosFab, ForCosFin, EmprCod, CliCod, TipColCod, ForNumCol, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, ComUltLin, MacProCod, ForCosUti, ForRGB, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForObsFac, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T01BH20", "UPDATE TXPCFORMU SET ForSerDsc=?, ForCosForm=?, ForcosH20=?, ForCosFab=?, ForCosFin=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T01BH21", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new ForEachCursor("T01BH22", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH23", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNormaID FROM TXPFORNOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH24", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod FROM TXPENSCAB WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH25", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH26", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ColAqP FROM TXPPCOLAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH27", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH28", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH29", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC FROM TXPTAB000 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH30", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH31", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH32", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH33", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH34", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH35", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH36", "SELECT * FROM (SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH37", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH38", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH40", "SELECT T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForProC, T1.ForProUl, T1.ForProKgs, T1.FosCosFbk, T1.ForcosCF, T1.EmprCod, T1.CliCod, COALESCE( T2.ForCosFbS, 0) AS ForCosFbS FROM (TXPCLARPD T1 LEFT JOIN (SELECT SUM(ROUND(( COALESCE( ForProMqC, 0) * CAST(COALESCE( ForProFsT, 0) AS NUMERIC(19,10))), 2)) AS ForCosFbS, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCOSCR0 GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod AND T2.ForProC = T1.ForProC) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? and T1.ForProC = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForProC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH42", "SELECT COALESCE( T1.ForCosFbS, 0) AS ForCosFbS FROM (SELECT SUM(ROUND(( COALESCE( ForProMqC, 0) * CAST(COALESCE( ForProFsT, 0) AS NUMERIC(19,10))), 2)) AS ForCosFbS, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCOSCR0 GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.ForSer = ? AND T1.ForColNom = ? AND T1.ForColNum = ? AND T1.TipColCod = ? AND T1.ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH43", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BH44", "INSERT INTO TXPCLARPD(ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProUl, ForProKgs, FosCosFbk, ForcosCF, EmprCod, CliCod, ForProPK, ForProPM, ForProFe, FacLam, ForUltLr, ForKgsMn, ForProMc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0)", GX_NOMASK, "TXPCLARPD")
         ,new UpdateCursor("T01BH45", "UPDATE TXPCLARPD SET ForProUl=?, ForProKgs=?, FosCosFbk=?, ForcosCF=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new UpdateCursor("T01BH46", "DELETE FROM TXPCLARPD  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new ForEachCursor("T01BH48", "SELECT COALESCE( T1.ForCosFbS, 0) AS ForCosFbS FROM (SELECT SUM(ROUND(( COALESCE( ForProMqC, 0) * CAST(COALESCE( ForProFsT, 0) AS NUMERIC(19,10))), 2)) AS ForCosFbS, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCOSCR0 GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.ForSer = ? AND T1.ForColNom = ? AND T1.ForColNum = ? AND T1.TipColCod = ? AND T1.ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH49", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH50", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN FROM TXPCLARPM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH51", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL FROM TXPFPCC WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BH52", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH53", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn, ForProFs, ForProFsT, ForProMq, ForProMqC, EmprCod, CliCod FROM TXPCOSCR0 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and ForProLn = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH54", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn FROM TXPCOSCR0 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BH55", "INSERT INTO TXPCOSCR0(ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn, ForProFs, ForProFsT, ForProMq, ForProMqC, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCOSCR0")
         ,new UpdateCursor("T01BH56", "UPDATE TXPCOSCR0 SET ForProFs=?, ForProFsT=?, ForProMq=?, ForProMqC=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProLn = ?", GX_NOMASK, "TXPCOSCR0")
         ,new UpdateCursor("T01BH57", "DELETE FROM TXPCOSCR0  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForProLn = ?", GX_NOMASK, "TXPCOSCR0")
         ,new ForEachCursor("T01BH58", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn FROM TXPCOSCR0 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH59", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BH60", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
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
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 37 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 42 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 3);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
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
               stmt.setString(7, (String)parms[11], 8);
               stmt.setShort(8, ((Number) parms[12]).shortValue());
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
               stmt.setShort(8, ((Number) parms[12]).shortValue());
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(7, (String)parms[11], 8);
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 9 :
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
               return;
            case 12 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 16);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 13);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 16);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               stmt.setString(16, (String)parms[30], 3);
               return;
            case 15 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 16);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 13);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 16);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               stmt.setString(16, (String)parms[30], 3);
               return;
            case 16 :
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               stmt.setString(9, (String)parms[16], 3);
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
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
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
               return;
            case 32 :
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
            case 33 :
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
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 5);
               }
               stmt.setString(10, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               return;
            case 40 :
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               stmt.setString(11, (String)parms[19], 8);
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
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 48 :
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
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 49 :
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
               stmt.setShort(6, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 6);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 2);
               }
               stmt.setString(11, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[20]).intValue());
               }
               return;
            case 50 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               stmt.setString(11, (String)parms[19], 8);
               stmt.setShort(12, ((Number) parms[20]).shortValue());
               return;
            case 51 :
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
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 52 :
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
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 54 :
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

