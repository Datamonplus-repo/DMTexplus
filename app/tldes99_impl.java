package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tldes99_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"LDESTIPODS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13330LDESTipoFa = (byte)(GXutil.lval( httpContext.GetPar( "LDESTipoFa"))) ;
         n13330LDESTipoFa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13330LDESTipoFa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13330LDESTipoFa), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaldestipods1NU1823( A396EmprCod, A13330LDESTipoFa) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
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
         gxload_4( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1005GrabCod = (short)(GXutil.lval( httpContext.GetPar( "GrabCod"))) ;
         n1005GrabCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1005GrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1005GrabCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A1005GrabCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
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
         gxload_9( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
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
         gxload_11( A396EmprCod, A2107PasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
      {
         gxnrgrid3_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid4") == 0 )
      {
         gxnrgrid4_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Definicion todas las TABLAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLDESID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_132 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_132"))) ;
      nGXsfl_132_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_132_idx"))) ;
      sGXsfl_132_idx = httpContext.GetPar( "sGXsfl_132_idx") ;
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

   public void gxnrgrid3_newrow_invoke( )
   {
      nRC_GXsfl_179 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_179"))) ;
      nGXsfl_179_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_179_idx"))) ;
      sGXsfl_179_idx = httpContext.GetPar( "sGXsfl_179_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid3_newrow( ) ;
      /* End function gxnrGrid3_newrow_invoke */
   }

   public void gxnrgrid4_newrow_invoke( )
   {
      nRC_GXsfl_189 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_189"))) ;
      nGXsfl_189_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_189_idx"))) ;
      sGXsfl_189_idx = httpContext.GetPar( "sGXsfl_189_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid4_newrow( ) ;
      /* End function gxnrGrid4_newrow_invoke */
   }

   public tldes99_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tldes99_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tldes99_impl.class ));
   }

   public tldes99_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLDES99.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "ID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESID_Internalname, GXutil.ltrim( localUtil.ntoc( A13324LDESID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLDESID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13324LDESID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13324LDESID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESID_Jsonclick, 0, "", "", "", "", "", 1, edtLDESID_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Grabador", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrabCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1005GrabCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrabCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1005GrabCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1005GrabCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrabCod_Jsonclick, 0, "", "", "", "", "", 1, edtGrabCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrabNom_Internalname, GXutil.rtrim( A1006GrabNom), GXutil.rtrim( localUtil.format( A1006GrabNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrabNom_Jsonclick, 0, "", "", "", "", "", 1, edtGrabNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Dibujo Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESDibCli_Internalname, GXutil.rtrim( A13325LDESDibCli), GXutil.rtrim( localUtil.format( A13325LDESDibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtLDESDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A13326LDESDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLDESDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13326LDESDibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13326LDESDibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtLDESDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESArtcod_Internalname, GXutil.rtrim( A13327LDESArtcod), GXutil.rtrim( localUtil.format( A13327LDESArtcod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESArtcod_Jsonclick, 0, "", "", "", "", "", 1, edtLDESArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESArtDsc_Internalname, GXutil.rtrim( A13328LDESArtDsc), GXutil.rtrim( localUtil.format( A13328LDESArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtLDESArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Referencia Grabador", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESRefGra_Internalname, GXutil.rtrim( A13329LDESRefGra), GXutil.rtrim( localUtil.format( A13329LDESRefGra, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESRefGra_Jsonclick, 0, "", "", "", "", "", 1, edtLDESRefGra_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Tipo Fabricacion (Familia Productos)", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESTipoFa_Internalname, GXutil.ltrim( localUtil.ntoc( A13330LDESTipoFa, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLDESTipoFa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13330LDESTipoFa), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13330LDESTipoFa), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESTipoFa_Jsonclick, 0, "", "", "", "", "", 1, edtLDESTipoFa_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESTipoDs_Internalname, GXutil.rtrim( A13387LDESTipoDs), GXutil.rtrim( localUtil.format( A13387LDESTipoDs, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESTipoDs_Jsonclick, 0, "", "", "", "", "", 1, edtLDESTipoDs_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLDESFechaE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESFechaE_Internalname, localUtil.format(A13331LDESFechaE, "99/99/99"), localUtil.format( A13331LDESFechaE, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESFechaE_Jsonclick, 0, "", "", "", "", "", 1, edtLDESFechaE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES99.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLDESFechaE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLDESFechaE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TLDES99.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Estado LAB DIP", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A13332LDESEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLDESEstado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13332LDESEstado), "9") : localUtil.format( DecimalUtil.doubleToDec(A13332LDESEstado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESEstado_Jsonclick, 0, "", "", "", "", "", 1, edtLDESEstado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES99.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol100( ) ;
      /* Save parent mode. */
      sMode1824 = Gx_mode ;
      nGXsfl_100_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1824 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1824 = (short)(1) ;
            scanStart1NU1824( ) ;
            while ( RcdFound1824 != 0 )
            {
               init_level_properties1824( ) ;
               getByPrimaryKey1NU1824( ) ;
               addRow1NU1824( ) ;
               scanNext1NU1824( ) ;
            }
            scanEnd1NU1824( ) ;
            nBlankRcdCount1824 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NU1824( ) ;
         standaloneModal1NU1824( ) ;
         sMode1824 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRow1NU1824( ) ;
            edtLDESNPeque_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESNPEQUE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESNPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESNPeque_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtLDESDPeque_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESDPEQUE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESDPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESDPeque_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtLDESMedida_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESMEDIDA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESMedida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESMedida_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtLDESMalla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESMALLA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESMalla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESMalla_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtLDESCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOB_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCob_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            if ( ( nRcdExists_1824 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NU1824( ) ;
            }
            sendRow1NU1824( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode1824 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1824 = (short)(5) ;
         nRcdExists_1824 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NU1824( ) ;
            while ( RcdFound1824 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1001824( ) ;
               init_level_properties1824( ) ;
               standaloneNotModal1NU1824( ) ;
               getByPrimaryKey1NU1824( ) ;
               standaloneModal1NU1824( ) ;
               addRow1NU1824( ) ;
               scanNext1NU1824( ) ;
            }
            scanEnd1NU1824( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1824 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001824( ) ;
      initAll1NU1824( ) ;
      init_level_properties1824( ) ;
      nRcdExists_1824 = (short)(0) ;
      nIsMod_1824 = (short)(0) ;
      nRcdDeleted_1824 = (short)(0) ;
      nBlankRcdCount1824 = (short)(nBlankRcdUsr1824+nBlankRcdCount1824) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1824 > 0 )
      {
         standaloneNotModal1NU1824( ) ;
         standaloneModal1NU1824( ) ;
         addRow1NU1824( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLDESNPeque_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1824 = (short)(nBlankRcdCount1824-1) ;
      }
      Gx_mode = sMode1824 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1824 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 198,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES99.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TLDES99.htm");
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
      e111NU2 ();
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
            Z13325LDESDibCli = httpContext.cgiGet( "Z13325LDESDibCli") ;
            Z13326LDESDibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z13326LDESDibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13327LDESArtcod = httpContext.cgiGet( "Z13327LDESArtcod") ;
            Z13328LDESArtDsc = httpContext.cgiGet( "Z13328LDESArtDsc") ;
            Z13329LDESRefGra = httpContext.cgiGet( "Z13329LDESRefGra") ;
            Z13330LDESTipoFa = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13330LDESTipoFa"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13331LDESFechaE = localUtil.ctod( httpContext.cgiGet( "Z13331LDESFechaE"), 0) ;
            Z13332LDESEstado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13332LDESEstado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1005GrabCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1005GrabCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LDESID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLDESID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13324LDESID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
            }
            else
            {
               A13324LDESID = (int)(localUtil.ctol( httpContext.cgiGet( edtLDESID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
            }
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRABCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGrabCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1005GrabCod = (short)(0) ;
               n1005GrabCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1005GrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1005GrabCod), 4, 0));
            }
            else
            {
               A1005GrabCod = (short)(localUtil.ctol( httpContext.cgiGet( edtGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1005GrabCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1005GrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1005GrabCod), 4, 0));
            }
            A1006GrabNom = httpContext.cgiGet( edtGrabNom_Internalname) ;
            n1006GrabNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1006GrabNom", A1006GrabNom);
            A13325LDESDibCli = httpContext.cgiGet( edtLDESDibCli_Internalname) ;
            n13325LDESDibCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13325LDESDibCli", A13325LDESDibCli);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LDESDIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLDESDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13326LDESDibInt = 0 ;
               n13326LDESDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13326LDESDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13326LDESDibInt), 8, 0));
            }
            else
            {
               A13326LDESDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtLDESDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13326LDESDibInt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13326LDESDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13326LDESDibInt), 8, 0));
            }
            A13327LDESArtcod = httpContext.cgiGet( edtLDESArtcod_Internalname) ;
            n13327LDESArtcod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13327LDESArtcod", A13327LDESArtcod);
            A13328LDESArtDsc = httpContext.cgiGet( edtLDESArtDsc_Internalname) ;
            n13328LDESArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13328LDESArtDsc", A13328LDESArtDsc);
            A13329LDESRefGra = httpContext.cgiGet( edtLDESRefGra_Internalname) ;
            n13329LDESRefGra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13329LDESRefGra", A13329LDESRefGra);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESTipoFa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESTipoFa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LDESTIPOFA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLDESTipoFa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13330LDESTipoFa = (byte)(0) ;
               n13330LDESTipoFa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13330LDESTipoFa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13330LDESTipoFa), 2, 0));
            }
            else
            {
               A13330LDESTipoFa = (byte)(localUtil.ctol( httpContext.cgiGet( edtLDESTipoFa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13330LDESTipoFa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13330LDESTipoFa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13330LDESTipoFa), 2, 0));
            }
            A13387LDESTipoDs = httpContext.cgiGet( edtLDESTipoDs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13387LDESTipoDs", A13387LDESTipoDs);
            if ( localUtil.vcdate( httpContext.cgiGet( edtLDESFechaE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LDESFECHAE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLDESFechaE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13331LDESFechaE = GXutil.nullDate() ;
               n13331LDESFechaE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13331LDESFechaE", localUtil.format(A13331LDESFechaE, "99/99/99"));
            }
            else
            {
               A13331LDESFechaE = localUtil.ctod( httpContext.cgiGet( edtLDESFechaE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13331LDESFechaE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13331LDESFechaE", localUtil.format(A13331LDESFechaE, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LDESESTADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLDESEstado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13332LDESEstado = (byte)(0) ;
               n13332LDESEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13332LDESEstado", GXutil.str( A13332LDESEstado, 1, 0));
            }
            else
            {
               A13332LDESEstado = (byte)(localUtil.ctol( httpContext.cgiGet( edtLDESEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13332LDESEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13332LDESEstado", GXutil.str( A13332LDESEstado, 1, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
            /* Check if conditions changed and reset current page numbers */
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
                        e111NU2 ();
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
            initAll1NU1823( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1827_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1827_Enabled), 5, 0), !bGXsfl_179_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1826_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1826_Enabled), 5, 0), !bGXsfl_189_Refreshing);
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
      disableAttributes1NU1823( ) ;
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

   public void confirm_1NU0( )
   {
      beforeValidate1NU1823( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NU1823( ) ;
         }
         else
         {
            checkExtendedTable1NU1823( ) ;
            if ( AnyError == 0 )
            {
               zm1NU1823( 3) ;
               zm1NU1823( 4) ;
               zm1NU1823( 5) ;
            }
            closeExtendedTableCursors1NU1823( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1823 = Gx_mode ;
         confirm_1NU1824( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1823 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1823 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1NU0( ) ;
      }
   }

   public void confirm_1NU1826( )
   {
      nGXsfl_189_idx = 0 ;
      while ( nGXsfl_189_idx < nRC_GXsfl_189 )
      {
         readRow1NU1826( ) ;
         if ( ( nRcdExists_1826 != 0 ) || ( nIsMod_1826 != 0 ) )
         {
            getKey1NU1826( ) ;
            if ( ( nRcdExists_1826 == 0 ) && ( nRcdDeleted_1826 == 0 ) )
            {
               if ( RcdFound1826 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NU1826( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NU1826( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1NU1826( 11) ;
                     }
                     closeExtendedTableCursors1NU1826( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLDESNPeque_Internalname ;
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
                     getByPrimaryKey1NU1826( ) ;
                     load1NU1826( ) ;
                     beforeValidate1NU1826( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NU1826( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1826 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NU1826( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NU1826( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1NU1826( 11) ;
                           }
                           closeExtendedTableCursors1NU1826( ) ;
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
                  if ( nRcdDeleted_1826 == 0 )
                  {
                     GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESNPeque_Internalname ;
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
         httpContext.changePostValue( "ZT_"+"Z13340LDESLinP_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( Z13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13341LDESCantP_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( Z13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_189_idx, GXutil.rtrim( Z2107PasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1826_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1826_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1826_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1826 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1826_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1826_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESLINP_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASCOD_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASDSC_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCANTP_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1NU1827( )
   {
      nGXsfl_179_idx = 0 ;
      while ( nGXsfl_179_idx < nRC_GXsfl_179 )
      {
         readRow1NU1827( ) ;
         if ( ( nRcdExists_1827 != 0 ) || ( nIsMod_1827 != 0 ) )
         {
            getKey1NU1827( ) ;
            if ( ( nRcdExists_1827 == 0 ) && ( nRcdDeleted_1827 == 0 ) )
            {
               if ( RcdFound1827 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NU1827( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NU1827( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1NU1827( 9) ;
                     }
                     closeExtendedTableCursors1NU1827( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLDESNPeque_Internalname ;
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
                     getByPrimaryKey1NU1827( ) ;
                     load1NU1827( ) ;
                     beforeValidate1NU1827( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NU1827( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1827 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NU1827( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NU1827( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1NU1827( 9) ;
                           }
                           closeExtendedTableCursors1NU1827( ) ;
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
                  if ( nRcdDeleted_1827 == 0 )
                  {
                     GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESNPeque_Internalname ;
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
         httpContext.changePostValue( "ZT_"+"Z13342LDESLinea_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( Z13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13343LDESCant_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( Z13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13344LDESUnd_"+sGXsfl_179_idx, GXutil.rtrim( Z13344LDESUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_179_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1827_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1827_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1827_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1827 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1827_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1827_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESLINEA_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCANT_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESUND_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1NU1825( )
   {
      nGXsfl_132_idx = 0 ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         readRow1NU1825( ) ;
         if ( ( nRcdExists_1825 != 0 ) || ( nIsMod_1825 != 0 ) )
         {
            getKey1NU1825( ) ;
            if ( ( nRcdExists_1825 == 0 ) && ( nRcdDeleted_1825 == 0 ) )
            {
               if ( RcdFound1825 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NU1825( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NU1825( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1NU1825( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1825 = Gx_mode ;
                        confirm_1NU1827( ) ;
                        if ( AnyError == 0 )
                        {
                           confirm_1NU1826( ) ;
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
                  }
               }
               else
               {
                  GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLDESNPeque_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1825 != 0 )
               {
                  if ( nRcdDeleted_1825 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NU1825( ) ;
                     load1NU1825( ) ;
                     beforeValidate1NU1825( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NU1825( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1825 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NU1825( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NU1825( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1NU1825( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1825 = Gx_mode ;
                              confirm_1NU1827( ) ;
                              if ( AnyError == 0 )
                              {
                                 confirm_1NU1826( ) ;
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
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1825 == 0 )
                  {
                     GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESNPeque_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLDESComb_Internalname, GXutil.rtrim( A13337LDESComb)) ;
         httpContext.changePostValue( edtLDESComdD_Internalname, GXutil.rtrim( A13338LDESComdD)) ;
         httpContext.changePostValue( edtLDESFondo_Internalname, GXutil.rtrim( A13339LDESFondo)) ;
         httpContext.changePostValue( edtLDESUltLP_Internalname, GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESUltP_Internalname, GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESFecEnv_Internalname, localUtil.format(A13384LDESFecEnv, "99/99/99")) ;
         httpContext.changePostValue( edtLDESFecRep_Internalname, localUtil.format(A13385LDESFecRep, "99/99/99")) ;
         httpContext.changePostValue( edtLDESEstCb_Internalname, GXutil.ltrim( localUtil.ntoc( A13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13337LDESComb_"+sGXsfl_132_idx, GXutil.rtrim( Z13337LDESComb)) ;
         httpContext.changePostValue( "ZT_"+"Z13339LDESFondo_"+sGXsfl_132_idx, GXutil.rtrim( Z13339LDESFondo)) ;
         httpContext.changePostValue( "ZT_"+"Z13338LDESComdD_"+sGXsfl_132_idx, GXutil.rtrim( Z13338LDESComdD)) ;
         httpContext.changePostValue( "ZT_"+"Z13345LDESUltLP_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13346LDESUltP_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13384LDESFecEnv_"+sGXsfl_132_idx, localUtil.dtoc( Z13384LDESFecEnv, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13385LDESFecRep_"+sGXsfl_132_idx, localUtil.dtoc( Z13385LDESFecRep, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13386LDESEstCb_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_179_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_179, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_189_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_189, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1825_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1825_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1825_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1825 != 0 )
         {
            httpContext.changePostValue( "LDESCOMB_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCOMDD_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComdD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESFONDO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFondo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESULTLP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltLP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESULTP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESFECENV_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFecEnv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESFECREP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFecRep_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESESTCB_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESEstCb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1NU1824( )
   {
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1NU1824( ) ;
         if ( ( nRcdExists_1824 != 0 ) || ( nIsMod_1824 != 0 ) )
         {
            getKey1NU1824( ) ;
            if ( ( nRcdExists_1824 == 0 ) && ( nRcdDeleted_1824 == 0 ) )
            {
               if ( RcdFound1824 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NU1824( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NU1824( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1NU1824( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1824 = Gx_mode ;
                        confirm_1NU1825( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1824 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1824 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLDESNPeque_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1824 != 0 )
               {
                  if ( nRcdDeleted_1824 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NU1824( ) ;
                     load1NU1824( ) ;
                     beforeValidate1NU1824( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NU1824( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1824 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NU1824( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NU1824( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1NU1824( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1824 = Gx_mode ;
                              confirm_1NU1825( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1824 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1824 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1824 == 0 )
                  {
                     GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESNPeque_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLDESNPeque_Internalname, GXutil.rtrim( A13333LDESNPeque)) ;
         httpContext.changePostValue( edtLDESDPeque_Internalname, GXutil.rtrim( A13334LDESDPeque)) ;
         httpContext.changePostValue( edtLDESMedida_Internalname, GXutil.rtrim( A13335LDESMedida)) ;
         httpContext.changePostValue( edtLDESMalla_Internalname, GXutil.rtrim( A13336LDESMalla)) ;
         httpContext.changePostValue( edtLDESCob_Internalname, GXutil.ltrim( localUtil.ntoc( A13347LDESCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13333LDESNPeque_"+sGXsfl_100_idx, GXutil.rtrim( Z13333LDESNPeque)) ;
         httpContext.changePostValue( "ZT_"+"Z13334LDESDPeque_"+sGXsfl_100_idx, GXutil.rtrim( Z13334LDESDPeque)) ;
         httpContext.changePostValue( "ZT_"+"Z13335LDESMedida_"+sGXsfl_100_idx, GXutil.rtrim( Z13335LDESMedida)) ;
         httpContext.changePostValue( "ZT_"+"Z13336LDESMalla_"+sGXsfl_100_idx, GXutil.rtrim( Z13336LDESMalla)) ;
         httpContext.changePostValue( "ZT_"+"Z13347LDESCob_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z13347LDESCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_132_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_132, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1824_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1824_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1824_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1824 != 0 )
         {
            httpContext.changePostValue( "LDESNPEQUE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESNPeque_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESDPEQUE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESDPeque_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESMEDIDA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESMedida_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESMALLA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESMalla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCOB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NU0( )
   {
   }

   public void e111NU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tldes99_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tldes99_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tldes99_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tldes99_impl.this.A396EmprCod = GXv_char2[0] ;
      tldes99_impl.this.AV11EmprNom = GXv_char3[0] ;
      tldes99_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV33ContCod1 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LDES00", ""), GXv_int6) ;
      tldes99_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33ContCod1 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod1", GXutil.str( AV33ContCod1, 1, 0));
      if ( AV33ContCod1 == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Falta crear el contador de LAB DIP, LDES00", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(14);
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(9);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void zm1NU1823( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13325LDESDibCli = T01NU13_A13325LDESDibCli[0] ;
            Z13326LDESDibInt = T01NU13_A13326LDESDibInt[0] ;
            Z13327LDESArtcod = T01NU13_A13327LDESArtcod[0] ;
            Z13328LDESArtDsc = T01NU13_A13328LDESArtDsc[0] ;
            Z13329LDESRefGra = T01NU13_A13329LDESRefGra[0] ;
            Z13330LDESTipoFa = T01NU13_A13330LDESTipoFa[0] ;
            Z13331LDESFechaE = T01NU13_A13331LDESFechaE[0] ;
            Z13332LDESEstado = T01NU13_A13332LDESEstado[0] ;
            Z252CliCod = T01NU13_A252CliCod[0] ;
            Z1005GrabCod = T01NU13_A1005GrabCod[0] ;
         }
         else
         {
            Z13325LDESDibCli = A13325LDESDibCli ;
            Z13326LDESDibInt = A13326LDESDibInt ;
            Z13327LDESArtcod = A13327LDESArtcod ;
            Z13328LDESArtDsc = A13328LDESArtDsc ;
            Z13329LDESRefGra = A13329LDESRefGra ;
            Z13330LDESTipoFa = A13330LDESTipoFa ;
            Z13331LDESFechaE = A13331LDESFechaE ;
            Z13332LDESEstado = A13332LDESEstado ;
            Z252CliCod = A252CliCod ;
            Z1005GrabCod = A1005GrabCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z13324LDESID = A13324LDESID ;
         Z13325LDESDibCli = A13325LDESDibCli ;
         Z13326LDESDibInt = A13326LDESDibInt ;
         Z13327LDESArtcod = A13327LDESArtcod ;
         Z13328LDESArtDsc = A13328LDESArtDsc ;
         Z13329LDESRefGra = A13329LDESRefGra ;
         Z13330LDESTipoFa = A13330LDESTipoFa ;
         Z13331LDESFechaE = A13331LDESFechaE ;
         Z13332LDESEstado = A13332LDESEstado ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1005GrabCod = A1005GrabCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z1006GrabNom = A1006GrabNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV35Pgmname = "TLDES99" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      /* Using cursor T01NU14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NU14_A407EmprNom[0] ;
      n407EmprNom = T01NU14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
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

   public void load1NU1823( )
   {
      /* Using cursor T01NU17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1823 = (short)(1) ;
         A407EmprNom = T01NU17_A407EmprNom[0] ;
         n407EmprNom = T01NU17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01NU17_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1006GrabNom = T01NU17_A1006GrabNom[0] ;
         n1006GrabNom = T01NU17_n1006GrabNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1006GrabNom", A1006GrabNom);
         A13325LDESDibCli = T01NU17_A13325LDESDibCli[0] ;
         n13325LDESDibCli = T01NU17_n13325LDESDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13325LDESDibCli", A13325LDESDibCli);
         A13326LDESDibInt = T01NU17_A13326LDESDibInt[0] ;
         n13326LDESDibInt = T01NU17_n13326LDESDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13326LDESDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13326LDESDibInt), 8, 0));
         A13327LDESArtcod = T01NU17_A13327LDESArtcod[0] ;
         n13327LDESArtcod = T01NU17_n13327LDESArtcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13327LDESArtcod", A13327LDESArtcod);
         A13328LDESArtDsc = T01NU17_A13328LDESArtDsc[0] ;
         n13328LDESArtDsc = T01NU17_n13328LDESArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13328LDESArtDsc", A13328LDESArtDsc);
         A13329LDESRefGra = T01NU17_A13329LDESRefGra[0] ;
         n13329LDESRefGra = T01NU17_n13329LDESRefGra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13329LDESRefGra", A13329LDESRefGra);
         A13330LDESTipoFa = T01NU17_A13330LDESTipoFa[0] ;
         n13330LDESTipoFa = T01NU17_n13330LDESTipoFa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13330LDESTipoFa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13330LDESTipoFa), 2, 0));
         A13331LDESFechaE = T01NU17_A13331LDESFechaE[0] ;
         n13331LDESFechaE = T01NU17_n13331LDESFechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13331LDESFechaE", localUtil.format(A13331LDESFechaE, "99/99/99"));
         A13332LDESEstado = T01NU17_A13332LDESEstado[0] ;
         n13332LDESEstado = T01NU17_n13332LDESEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13332LDESEstado", GXutil.str( A13332LDESEstado, 1, 0));
         A252CliCod = T01NU17_A252CliCod[0] ;
         n252CliCod = T01NU17_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1005GrabCod = T01NU17_A1005GrabCod[0] ;
         n1005GrabCod = T01NU17_n1005GrabCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1005GrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1005GrabCod), 4, 0));
         zm1NU1823( -2) ;
      }
      pr_default.close(15);
      onLoadActions1NU1823( ) ;
   }

   public void onLoadActions1NU1823( )
   {
      GXt_char1 = A13387LDESTipoDs ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pdscgrpfam(remoteHandle, context).execute( A396EmprCod, A13330LDESTipoFa, GXv_char4) ;
      tldes99_impl.this.GXt_char1 = GXv_char4[0] ;
      A13387LDESTipoDs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13387LDESTipoDs", A13387LDESTipoDs);
   }

   public void checkExtendedTable1NU1823( )
   {
      nIsDirty_1823 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01NU15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01NU15_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(13);
      /* Using cursor T01NU16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRABAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrabCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1006GrabNom = T01NU16_A1006GrabNom[0] ;
      n1006GrabNom = T01NU16_n1006GrabNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1006GrabNom", A1006GrabNom);
      pr_default.close(14);
      nIsDirty_1823 = (short)(1) ;
      GXt_char1 = A13387LDESTipoDs ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pdscgrpfam(remoteHandle, context).execute( A396EmprCod, A13330LDESTipoFa, GXv_char4) ;
      tldes99_impl.this.GXt_char1 = GXv_char4[0] ;
      A13387LDESTipoDs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13387LDESTipoDs", A13387LDESTipoDs);
   }

   public void closeExtendedTableCursors1NU1823( )
   {
      pr_default.close(13);
      pr_default.close(14);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01NU18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01NU18_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_5( String A396EmprCod ,
                         short A1005GrabCod )
   {
      /* Using cursor T01NU19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRABAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrabCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1006GrabNom = T01NU19_A1006GrabNom[0] ;
      n1006GrabNom = T01NU19_n1006GrabNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1006GrabNom", A1006GrabNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1006GrabNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1NU1823( )
   {
      /* Using cursor T01NU20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1823 = (short)(1) ;
      }
      else
      {
         RcdFound1823 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NU13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
      if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01NU13_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NU1823( 2) ;
         RcdFound1823 = (short)(1) ;
         A13324LDESID = T01NU13_A13324LDESID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
         A13325LDESDibCli = T01NU13_A13325LDESDibCli[0] ;
         n13325LDESDibCli = T01NU13_n13325LDESDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13325LDESDibCli", A13325LDESDibCli);
         A13326LDESDibInt = T01NU13_A13326LDESDibInt[0] ;
         n13326LDESDibInt = T01NU13_n13326LDESDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13326LDESDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13326LDESDibInt), 8, 0));
         A13327LDESArtcod = T01NU13_A13327LDESArtcod[0] ;
         n13327LDESArtcod = T01NU13_n13327LDESArtcod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13327LDESArtcod", A13327LDESArtcod);
         A13328LDESArtDsc = T01NU13_A13328LDESArtDsc[0] ;
         n13328LDESArtDsc = T01NU13_n13328LDESArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13328LDESArtDsc", A13328LDESArtDsc);
         A13329LDESRefGra = T01NU13_A13329LDESRefGra[0] ;
         n13329LDESRefGra = T01NU13_n13329LDESRefGra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13329LDESRefGra", A13329LDESRefGra);
         A13330LDESTipoFa = T01NU13_A13330LDESTipoFa[0] ;
         n13330LDESTipoFa = T01NU13_n13330LDESTipoFa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13330LDESTipoFa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13330LDESTipoFa), 2, 0));
         A13331LDESFechaE = T01NU13_A13331LDESFechaE[0] ;
         n13331LDESFechaE = T01NU13_n13331LDESFechaE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13331LDESFechaE", localUtil.format(A13331LDESFechaE, "99/99/99"));
         A13332LDESEstado = T01NU13_A13332LDESEstado[0] ;
         n13332LDESEstado = T01NU13_n13332LDESEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13332LDESEstado", GXutil.str( A13332LDESEstado, 1, 0));
         A252CliCod = T01NU13_A252CliCod[0] ;
         n252CliCod = T01NU13_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1005GrabCod = T01NU13_A1005GrabCod[0] ;
         n1005GrabCod = T01NU13_n1005GrabCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1005GrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1005GrabCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         sMode1823 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1NU1823( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1823 = (short)(0) ;
            initializeNonKey1NU1823( ) ;
         }
         Gx_mode = sMode1823 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1823 = (short)(0) ;
         initializeNonKey1NU1823( ) ;
         sMode1823 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1823 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(11);
   }

   public void getEqualNoModal( )
   {
      getKey1NU1823( ) ;
      if ( RcdFound1823 == 0 )
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
      RcdFound1823 = (short)(0) ;
      /* Using cursor T01NU21 */
      pr_default.execute(19, new Object[] {Integer.valueOf(A13324LDESID), A396EmprCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( T01NU21_A13324LDESID[0] < A13324LDESID ) ) && ( GXutil.strcmp(T01NU21_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( T01NU21_A13324LDESID[0] > A13324LDESID ) ) && ( GXutil.strcmp(T01NU21_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13324LDESID = T01NU21_A13324LDESID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
            RcdFound1823 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound1823 = (short)(0) ;
      /* Using cursor T01NU22 */
      pr_default.execute(20, new Object[] {Integer.valueOf(A13324LDESID), A396EmprCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( T01NU22_A13324LDESID[0] > A13324LDESID ) ) && ( GXutil.strcmp(T01NU22_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( T01NU22_A13324LDESID[0] < A13324LDESID ) ) && ( GXutil.strcmp(T01NU22_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13324LDESID = T01NU22_A13324LDESID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
            RcdFound1823 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NU1823( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLDESID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1NU1823( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1823 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) )
            {
               A13324LDESID = Z13324LDESID ;
               httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLDESID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1NU1823( ) ;
               GX_FocusControl = edtLDESID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtLDESID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1NU1823( ) ;
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
                  GX_FocusControl = edtLDESID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1NU1823( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) )
      {
         A13324LDESID = Z13324LDESID ;
         httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLDESID_Internalname ;
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
      getKey1NU1823( ) ;
      if ( RcdFound1823 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) )
         {
            A13324LDESID = Z13324LDESID ;
            httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tldes99");
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1NU0( ) ;
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
      if ( RcdFound1823 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1NU1823( ) ;
      if ( RcdFound1823 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1NU1823( ) ;
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
      if ( RcdFound1823 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      if ( RcdFound1823 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      scanStart1NU1823( ) ;
      if ( RcdFound1823 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1823 != 0 )
         {
            scanNext1NU1823( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1NU1823( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1NU1823( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NU12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
         if ( (pr_default.getStatus(10) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES00"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(10) == 101) || ( GXutil.strcmp(Z13325LDESDibCli, T01NU12_A13325LDESDibCli[0]) != 0 ) || ( Z13326LDESDibInt != T01NU12_A13326LDESDibInt[0] ) || ( GXutil.strcmp(Z13327LDESArtcod, T01NU12_A13327LDESArtcod[0]) != 0 ) || ( GXutil.strcmp(Z13328LDESArtDsc, T01NU12_A13328LDESArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z13329LDESRefGra, T01NU12_A13329LDESRefGra[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13330LDESTipoFa != T01NU12_A13330LDESTipoFa[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z13331LDESFechaE), GXutil.resetTime(T01NU12_A13331LDESFechaE[0])) ) || ( Z13332LDESEstado != T01NU12_A13332LDESEstado[0] ) || ( Z252CliCod != T01NU12_A252CliCod[0] ) || ( Z1005GrabCod != T01NU12_A1005GrabCod[0] ) )
         {
            if ( GXutil.strcmp(Z13325LDESDibCli, T01NU12_A13325LDESDibCli[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESDibCli");
               GXutil.writeLogRaw("Old: ",Z13325LDESDibCli);
               GXutil.writeLogRaw("Current: ",T01NU12_A13325LDESDibCli[0]);
            }
            if ( Z13326LDESDibInt != T01NU12_A13326LDESDibInt[0] )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESDibInt");
               GXutil.writeLogRaw("Old: ",Z13326LDESDibInt);
               GXutil.writeLogRaw("Current: ",T01NU12_A13326LDESDibInt[0]);
            }
            if ( GXutil.strcmp(Z13327LDESArtcod, T01NU12_A13327LDESArtcod[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESArtcod");
               GXutil.writeLogRaw("Old: ",Z13327LDESArtcod);
               GXutil.writeLogRaw("Current: ",T01NU12_A13327LDESArtcod[0]);
            }
            if ( GXutil.strcmp(Z13328LDESArtDsc, T01NU12_A13328LDESArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESArtDsc");
               GXutil.writeLogRaw("Old: ",Z13328LDESArtDsc);
               GXutil.writeLogRaw("Current: ",T01NU12_A13328LDESArtDsc[0]);
            }
            if ( GXutil.strcmp(Z13329LDESRefGra, T01NU12_A13329LDESRefGra[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESRefGra");
               GXutil.writeLogRaw("Old: ",Z13329LDESRefGra);
               GXutil.writeLogRaw("Current: ",T01NU12_A13329LDESRefGra[0]);
            }
            if ( Z13330LDESTipoFa != T01NU12_A13330LDESTipoFa[0] )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESTipoFa");
               GXutil.writeLogRaw("Old: ",Z13330LDESTipoFa);
               GXutil.writeLogRaw("Current: ",T01NU12_A13330LDESTipoFa[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13331LDESFechaE), GXutil.resetTime(T01NU12_A13331LDESFechaE[0])) ) )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESFechaE");
               GXutil.writeLogRaw("Old: ",Z13331LDESFechaE);
               GXutil.writeLogRaw("Current: ",T01NU12_A13331LDESFechaE[0]);
            }
            if ( Z13332LDESEstado != T01NU12_A13332LDESEstado[0] )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESEstado");
               GXutil.writeLogRaw("Old: ",Z13332LDESEstado);
               GXutil.writeLogRaw("Current: ",T01NU12_A13332LDESEstado[0]);
            }
            if ( Z252CliCod != T01NU12_A252CliCod[0] )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01NU12_A252CliCod[0]);
            }
            if ( Z1005GrabCod != T01NU12_A1005GrabCod[0] )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"GrabCod");
               GXutil.writeLogRaw("Old: ",Z1005GrabCod);
               GXutil.writeLogRaw("Current: ",T01NU12_A1005GrabCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES00"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NU1823( )
   {
      beforeValidate1NU1823( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1823( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NU1823( 0) ;
         checkOptimisticConcurrency1NU1823( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NU1823( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NU1823( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NU23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A13324LDESID), Boolean.valueOf(n13325LDESDibCli), A13325LDESDibCli, Boolean.valueOf(n13326LDESDibInt), Integer.valueOf(A13326LDESDibInt), Boolean.valueOf(n13327LDESArtcod), A13327LDESArtcod, Boolean.valueOf(n13328LDESArtDsc), A13328LDESArtDsc, Boolean.valueOf(n13329LDESRefGra), A13329LDESRefGra, Boolean.valueOf(n13330LDESTipoFa), Byte.valueOf(A13330LDESTipoFa), Boolean.valueOf(n13331LDESFechaE), A13331LDESFechaE, Boolean.valueOf(n13332LDESEstado), Byte.valueOf(A13332LDESEstado), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES00");
                  if ( (pr_default.getStatus(21) == 1) )
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
                        processLevel1NU1823( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1NU0( ) ;
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
            load1NU1823( ) ;
         }
         endLevel1NU1823( ) ;
      }
      closeExtendedTableCursors1NU1823( ) ;
   }

   public void update1NU1823( )
   {
      beforeValidate1NU1823( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1823( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NU1823( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NU1823( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NU1823( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NU24 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n13325LDESDibCli), A13325LDESDibCli, Boolean.valueOf(n13326LDESDibInt), Integer.valueOf(A13326LDESDibInt), Boolean.valueOf(n13327LDESArtcod), A13327LDESArtcod, Boolean.valueOf(n13328LDESArtDsc), A13328LDESArtDsc, Boolean.valueOf(n13329LDESRefGra), A13329LDESRefGra, Boolean.valueOf(n13330LDESTipoFa), Byte.valueOf(A13330LDESTipoFa), Boolean.valueOf(n13331LDESFechaE), A13331LDESFechaE, Boolean.valueOf(n13332LDESEstado), Byte.valueOf(A13332LDESEstado), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod), A396EmprCod, Integer.valueOf(A13324LDESID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES00");
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES00"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NU1823( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NU1823( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1NU0( ) ;
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
         endLevel1NU1823( ) ;
      }
      closeExtendedTableCursors1NU1823( ) ;
   }

   public void deferredUpdate1NU1823( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NU1823( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NU1823( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NU1823( ) ;
         afterConfirm1NU1823( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NU1823( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NU25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES00");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1823 == 0 )
                     {
                        initAll1NU1823( ) ;
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
                     resetCaption1NU0( ) ;
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
      sMode1823 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NU1823( ) ;
      Gx_mode = sMode1823 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NU1823( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NU26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01NU26_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(24);
         /* Using cursor T01NU27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod)});
         A1006GrabNom = T01NU27_A1006GrabNom[0] ;
         n1006GrabNom = T01NU27_n1006GrabNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1006GrabNom", A1006GrabNom);
         pr_default.close(25);
         GXt_char1 = A13387LDESTipoDs ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pdscgrpfam(remoteHandle, context).execute( A396EmprCod, A13330LDESTipoFa, GXv_char4) ;
         tldes99_impl.this.GXt_char1 = GXv_char4[0] ;
         A13387LDESTipoDs = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13387LDESTipoDs", A13387LDESTipoDs);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01NU28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Peques", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel1NU1824( )
   {
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1NU1824( ) ;
         if ( ( nRcdExists_1824 != 0 ) || ( nIsMod_1824 != 0 ) )
         {
            standaloneNotModal1NU1824( ) ;
            getKey1NU1824( ) ;
            if ( ( nRcdExists_1824 == 0 ) && ( nRcdDeleted_1824 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NU1824( ) ;
            }
            else
            {
               if ( RcdFound1824 != 0 )
               {
                  if ( ( nRcdDeleted_1824 != 0 ) && ( nRcdExists_1824 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NU1824( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1824 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NU1824( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1824 == 0 )
                  {
                     GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESNPeque_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLDESNPeque_Internalname, GXutil.rtrim( A13333LDESNPeque)) ;
         httpContext.changePostValue( edtLDESDPeque_Internalname, GXutil.rtrim( A13334LDESDPeque)) ;
         httpContext.changePostValue( edtLDESMedida_Internalname, GXutil.rtrim( A13335LDESMedida)) ;
         httpContext.changePostValue( edtLDESMalla_Internalname, GXutil.rtrim( A13336LDESMalla)) ;
         httpContext.changePostValue( edtLDESCob_Internalname, GXutil.ltrim( localUtil.ntoc( A13347LDESCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13333LDESNPeque_"+sGXsfl_100_idx, GXutil.rtrim( Z13333LDESNPeque)) ;
         httpContext.changePostValue( "ZT_"+"Z13334LDESDPeque_"+sGXsfl_100_idx, GXutil.rtrim( Z13334LDESDPeque)) ;
         httpContext.changePostValue( "ZT_"+"Z13335LDESMedida_"+sGXsfl_100_idx, GXutil.rtrim( Z13335LDESMedida)) ;
         httpContext.changePostValue( "ZT_"+"Z13336LDESMalla_"+sGXsfl_100_idx, GXutil.rtrim( Z13336LDESMalla)) ;
         httpContext.changePostValue( "ZT_"+"Z13347LDESCob_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z13347LDESCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_132_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_132, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1824_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1824_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1824_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1824 != 0 )
         {
            httpContext.changePostValue( "LDESNPEQUE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESNPeque_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESDPEQUE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESDPeque_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESMEDIDA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESMedida_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESMALLA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESMalla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCOB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NU1824( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1824 = (short)(0) ;
      nIsMod_1824 = (short)(0) ;
      nRcdDeleted_1824 = (short)(0) ;
   }

   public void processLevel1NU1823( )
   {
      /* Save parent mode. */
      sMode1823 = Gx_mode ;
      processNestedLevel1NU1824( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1823 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NU1823( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(10);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NU1823( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tldes99");
         if ( AnyError == 0 )
         {
            confirmValues1NU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tldes99");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NU1823( )
   {
      /* Scan By routine */
      /* Using cursor T01NU29 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      RcdFound1823 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1823 = (short)(1) ;
         A13324LDESID = T01NU29_A13324LDESID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NU1823( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound1823 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1823 = (short)(1) ;
         A13324LDESID = T01NU29_A13324LDESID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
      }
   }

   public void scanEnd1NU1823( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1NU1823( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NU1823( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NU1823( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NU1823( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NU1823( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NU1823( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NU1823( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtLDESID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESID_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtGrabCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrabCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrabCod_Enabled), 5, 0), true);
      edtGrabNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrabNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrabNom_Enabled), 5, 0), true);
      edtLDESDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESDibCli_Enabled), 5, 0), true);
      edtLDESDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESDibInt_Enabled), 5, 0), true);
      edtLDESArtcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESArtcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESArtcod_Enabled), 5, 0), true);
      edtLDESArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESArtDsc_Enabled), 5, 0), true);
      edtLDESRefGra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESRefGra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESRefGra_Enabled), 5, 0), true);
      edtLDESTipoFa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESTipoFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESTipoFa_Enabled), 5, 0), true);
      edtLDESTipoDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESTipoDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESTipoDs_Enabled), 5, 0), true);
      edtLDESFechaE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESFechaE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFechaE_Enabled), 5, 0), true);
      edtLDESEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESEstado_Enabled), 5, 0), true);
   }

   public void zm1NU1824( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13334LDESDPeque = T01NU11_A13334LDESDPeque[0] ;
            Z13335LDESMedida = T01NU11_A13335LDESMedida[0] ;
            Z13336LDESMalla = T01NU11_A13336LDESMalla[0] ;
            Z13347LDESCob = T01NU11_A13347LDESCob[0] ;
         }
         else
         {
            Z13334LDESDPeque = A13334LDESDPeque ;
            Z13335LDESMedida = A13335LDESMedida ;
            Z13336LDESMalla = A13336LDESMalla ;
            Z13347LDESCob = A13347LDESCob ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13334LDESDPeque = A13334LDESDPeque ;
         Z13335LDESMedida = A13335LDESMedida ;
         Z13336LDESMalla = A13336LDESMalla ;
         Z13347LDESCob = A13347LDESCob ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1NU1824( )
   {
   }

   public void standaloneModal1NU1824( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESNPeque_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESNPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESNPeque_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
      else
      {
         edtLDESNPeque_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESNPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESNPeque_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
   }

   public void load1NU1824( )
   {
      /* Using cursor T01NU30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1824 = (short)(1) ;
         A13334LDESDPeque = T01NU30_A13334LDESDPeque[0] ;
         n13334LDESDPeque = T01NU30_n13334LDESDPeque[0] ;
         A13335LDESMedida = T01NU30_A13335LDESMedida[0] ;
         n13335LDESMedida = T01NU30_n13335LDESMedida[0] ;
         A13336LDESMalla = T01NU30_A13336LDESMalla[0] ;
         n13336LDESMalla = T01NU30_n13336LDESMalla[0] ;
         A13347LDESCob = T01NU30_A13347LDESCob[0] ;
         n13347LDESCob = T01NU30_n13347LDESCob[0] ;
         zm1NU1824( -6) ;
      }
      pr_default.close(28);
      onLoadActions1NU1824( ) ;
   }

   public void onLoadActions1NU1824( )
   {
   }

   public void checkExtendedTable1NU1824( )
   {
      nIsDirty_1824 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NU1824( ) ;
   }

   public void closeExtendedTableCursors1NU1824( )
   {
   }

   public void enableDisable1NU1824( )
   {
   }

   public void getKey1NU1824( )
   {
      /* Using cursor T01NU31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1824 = (short)(1) ;
      }
      else
      {
         RcdFound1824 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey1NU1824( )
   {
      /* Using cursor T01NU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01NU11_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NU1824( 6) ;
         RcdFound1824 = (short)(1) ;
         initializeNonKey1NU1824( ) ;
         A13333LDESNPeque = T01NU11_A13333LDESNPeque[0] ;
         A13334LDESDPeque = T01NU11_A13334LDESDPeque[0] ;
         n13334LDESDPeque = T01NU11_n13334LDESDPeque[0] ;
         A13335LDESMedida = T01NU11_A13335LDESMedida[0] ;
         n13335LDESMedida = T01NU11_n13335LDESMedida[0] ;
         A13336LDESMalla = T01NU11_A13336LDESMalla[0] ;
         n13336LDESMalla = T01NU11_n13336LDESMalla[0] ;
         A13347LDESCob = T01NU11_A13347LDESCob[0] ;
         n13347LDESCob = T01NU11_n13347LDESCob[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         sMode1824 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NU1824( ) ;
         load1NU1824( ) ;
         Gx_mode = sMode1824 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1824 = (short)(0) ;
         initializeNonKey1NU1824( ) ;
         sMode1824 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NU1824( ) ;
         Gx_mode = sMode1824 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NU1824( ) ;
      }
      pr_default.close(9);
   }

   public void checkOptimisticConcurrency1NU1824( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NU10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(8) == 101) || ( GXutil.strcmp(Z13334LDESDPeque, T01NU10_A13334LDESDPeque[0]) != 0 ) || ( GXutil.strcmp(Z13335LDESMedida, T01NU10_A13335LDESMedida[0]) != 0 ) || ( GXutil.strcmp(Z13336LDESMalla, T01NU10_A13336LDESMalla[0]) != 0 ) || ( DecimalUtil.compareTo(Z13347LDESCob, T01NU10_A13347LDESCob[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13334LDESDPeque, T01NU10_A13334LDESDPeque[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESDPeque");
               GXutil.writeLogRaw("Old: ",Z13334LDESDPeque);
               GXutil.writeLogRaw("Current: ",T01NU10_A13334LDESDPeque[0]);
            }
            if ( GXutil.strcmp(Z13335LDESMedida, T01NU10_A13335LDESMedida[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESMedida");
               GXutil.writeLogRaw("Old: ",Z13335LDESMedida);
               GXutil.writeLogRaw("Current: ",T01NU10_A13335LDESMedida[0]);
            }
            if ( GXutil.strcmp(Z13336LDESMalla, T01NU10_A13336LDESMalla[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESMalla");
               GXutil.writeLogRaw("Old: ",Z13336LDESMalla);
               GXutil.writeLogRaw("Current: ",T01NU10_A13336LDESMalla[0]);
            }
            if ( DecimalUtil.compareTo(Z13347LDESCob, T01NU10_A13347LDESCob[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESCob");
               GXutil.writeLogRaw("Old: ",Z13347LDESCob);
               GXutil.writeLogRaw("Current: ",T01NU10_A13347LDESCob[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NU1824( )
   {
      beforeValidate1NU1824( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1824( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NU1824( 0) ;
         checkOptimisticConcurrency1NU1824( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NU1824( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NU1824( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NU32 */
                  pr_default.execute(30, new Object[] {Integer.valueOf(A13324LDESID), A13333LDESNPeque, Boolean.valueOf(n13334LDESDPeque), A13334LDESDPeque, Boolean.valueOf(n13335LDESMedida), A13335LDESMedida, Boolean.valueOf(n13336LDESMalla), A13336LDESMalla, Boolean.valueOf(n13347LDESCob), A13347LDESCob, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES01");
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
                        processLevel1NU1824( ) ;
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
            load1NU1824( ) ;
         }
         endLevel1NU1824( ) ;
      }
      closeExtendedTableCursors1NU1824( ) ;
   }

   public void update1NU1824( )
   {
      beforeValidate1NU1824( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1824( ) ;
      }
      if ( ( nIsMod_1824 != 0 ) || ( nIsDirty_1824 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NU1824( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NU1824( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NU1824( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NU33 */
                     pr_default.execute(31, new Object[] {Boolean.valueOf(n13334LDESDPeque), A13334LDESDPeque, Boolean.valueOf(n13335LDESMedida), A13335LDESMedida, Boolean.valueOf(n13336LDESMalla), A13336LDESMalla, Boolean.valueOf(n13347LDESCob), A13347LDESCob, A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES01");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES01"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NU1824( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1NU1824( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1NU1824( ) ;
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
            endLevel1NU1824( ) ;
         }
      }
      closeExtendedTableCursors1NU1824( ) ;
   }

   public void deferredUpdate1NU1824( )
   {
   }

   public void delete1NU1824( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NU1824( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NU1824( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NU1824( ) ;
         afterConfirm1NU1824( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NU1824( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NU34 */
               pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES01");
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
      sMode1824 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NU1824( ) ;
      Gx_mode = sMode1824 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NU1824( )
   {
      standaloneModal1NU1824( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01NU35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Combinaciones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void processNestedLevel1NU1825( )
   {
      nGXsfl_132_idx = 0 ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         readRow1NU1825( ) ;
         if ( ( nRcdExists_1825 != 0 ) || ( nIsMod_1825 != 0 ) )
         {
            standaloneNotModal1NU1825( ) ;
            getKey1NU1825( ) ;
            if ( ( nRcdExists_1825 == 0 ) && ( nRcdDeleted_1825 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NU1825( ) ;
            }
            else
            {
               if ( RcdFound1825 != 0 )
               {
                  if ( ( nRcdDeleted_1825 != 0 ) && ( nRcdExists_1825 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NU1825( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1825 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NU1825( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1825 == 0 )
                  {
                     GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESNPeque_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLDESComb_Internalname, GXutil.rtrim( A13337LDESComb)) ;
         httpContext.changePostValue( edtLDESComdD_Internalname, GXutil.rtrim( A13338LDESComdD)) ;
         httpContext.changePostValue( edtLDESFondo_Internalname, GXutil.rtrim( A13339LDESFondo)) ;
         httpContext.changePostValue( edtLDESUltLP_Internalname, GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESUltP_Internalname, GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESFecEnv_Internalname, localUtil.format(A13384LDESFecEnv, "99/99/99")) ;
         httpContext.changePostValue( edtLDESFecRep_Internalname, localUtil.format(A13385LDESFecRep, "99/99/99")) ;
         httpContext.changePostValue( edtLDESEstCb_Internalname, GXutil.ltrim( localUtil.ntoc( A13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13337LDESComb_"+sGXsfl_132_idx, GXutil.rtrim( Z13337LDESComb)) ;
         httpContext.changePostValue( "ZT_"+"Z13339LDESFondo_"+sGXsfl_132_idx, GXutil.rtrim( Z13339LDESFondo)) ;
         httpContext.changePostValue( "ZT_"+"Z13338LDESComdD_"+sGXsfl_132_idx, GXutil.rtrim( Z13338LDESComdD)) ;
         httpContext.changePostValue( "ZT_"+"Z13345LDESUltLP_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13346LDESUltP_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13384LDESFecEnv_"+sGXsfl_132_idx, localUtil.dtoc( Z13384LDESFecEnv, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13385LDESFecRep_"+sGXsfl_132_idx, localUtil.dtoc( Z13385LDESFecRep, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13386LDESEstCb_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( Z13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_179_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_179, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_189_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_189, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1825_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1825_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1825_"+sGXsfl_132_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1825 != 0 )
         {
            httpContext.changePostValue( "LDESCOMB_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCOMDD_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComdD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESFONDO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFondo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESULTLP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltLP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESULTP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESFECENV_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFecEnv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESFECREP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFecRep_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESESTCB_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESEstCb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NU1825( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1825 = (short)(0) ;
      nIsMod_1825 = (short)(0) ;
      nRcdDeleted_1825 = (short)(0) ;
   }

   public void processLevel1NU1824( )
   {
      /* Save parent mode. */
      sMode1824 = Gx_mode ;
      processNestedLevel1NU1825( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1824 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NU1824( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(8);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NU1824( )
   {
      /* Scan By routine */
      /* Using cursor T01NU36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
      RcdFound1824 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1824 = (short)(1) ;
         A13333LDESNPeque = T01NU36_A13333LDESNPeque[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NU1824( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound1824 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1824 = (short)(1) ;
         A13333LDESNPeque = T01NU36_A13333LDESNPeque[0] ;
      }
   }

   public void scanEnd1NU1824( )
   {
      pr_default.close(34);
   }

   public void afterConfirm1NU1824( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NU1824( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NU1824( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NU1824( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NU1824( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NU1824( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NU1824( )
   {
      edtLDESNPeque_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESNPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESNPeque_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtLDESDPeque_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESDPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESDPeque_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtLDESMedida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESMedida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESMedida_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtLDESMalla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESMalla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESMalla_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtLDESCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCob_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void zm1NU1825( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13338LDESComdD = T01NU9_A13338LDESComdD[0] ;
            Z13345LDESUltLP = T01NU9_A13345LDESUltLP[0] ;
            Z13346LDESUltP = T01NU9_A13346LDESUltP[0] ;
            Z13384LDESFecEnv = T01NU9_A13384LDESFecEnv[0] ;
            Z13385LDESFecRep = T01NU9_A13385LDESFecRep[0] ;
            Z13386LDESEstCb = T01NU9_A13386LDESEstCb[0] ;
         }
         else
         {
            Z13338LDESComdD = A13338LDESComdD ;
            Z13345LDESUltLP = A13345LDESUltLP ;
            Z13346LDESUltP = A13346LDESUltP ;
            Z13384LDESFecEnv = A13384LDESFecEnv ;
            Z13385LDESFecRep = A13385LDESFecRep ;
            Z13386LDESEstCb = A13386LDESEstCb ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13338LDESComdD = A13338LDESComdD ;
         Z13345LDESUltLP = A13345LDESUltLP ;
         Z13346LDESUltP = A13346LDESUltP ;
         Z13384LDESFecEnv = A13384LDESFecEnv ;
         Z13385LDESFecRep = A13385LDESFecRep ;
         Z13386LDESEstCb = A13386LDESEstCb ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1NU1825( )
   {
   }

   public void standaloneModal1NU1825( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESComb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      }
      else
      {
         edtLDESComb_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESFondo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      }
      else
      {
         edtLDESFondo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      }
   }

   public void load1NU1825( )
   {
      /* Using cursor T01NU37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound1825 = (short)(1) ;
         A13338LDESComdD = T01NU37_A13338LDESComdD[0] ;
         n13338LDESComdD = T01NU37_n13338LDESComdD[0] ;
         A13345LDESUltLP = T01NU37_A13345LDESUltLP[0] ;
         n13345LDESUltLP = T01NU37_n13345LDESUltLP[0] ;
         A13346LDESUltP = T01NU37_A13346LDESUltP[0] ;
         n13346LDESUltP = T01NU37_n13346LDESUltP[0] ;
         A13384LDESFecEnv = T01NU37_A13384LDESFecEnv[0] ;
         n13384LDESFecEnv = T01NU37_n13384LDESFecEnv[0] ;
         A13385LDESFecRep = T01NU37_A13385LDESFecRep[0] ;
         n13385LDESFecRep = T01NU37_n13385LDESFecRep[0] ;
         A13386LDESEstCb = T01NU37_A13386LDESEstCb[0] ;
         n13386LDESEstCb = T01NU37_n13386LDESEstCb[0] ;
         zm1NU1825( -7) ;
      }
      pr_default.close(35);
      onLoadActions1NU1825( ) ;
   }

   public void onLoadActions1NU1825( )
   {
   }

   public void checkExtendedTable1NU1825( )
   {
      nIsDirty_1825 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NU1825( ) ;
   }

   public void closeExtendedTableCursors1NU1825( )
   {
   }

   public void enableDisable1NU1825( )
   {
   }

   public void getKey1NU1825( )
   {
      /* Using cursor T01NU38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1825 = (short)(1) ;
      }
      else
      {
         RcdFound1825 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKey1NU1825( )
   {
      /* Using cursor T01NU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01NU9_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NU1825( 7) ;
         RcdFound1825 = (short)(1) ;
         initializeNonKey1NU1825( ) ;
         A13337LDESComb = T01NU9_A13337LDESComb[0] ;
         A13339LDESFondo = T01NU9_A13339LDESFondo[0] ;
         A13338LDESComdD = T01NU9_A13338LDESComdD[0] ;
         n13338LDESComdD = T01NU9_n13338LDESComdD[0] ;
         A13345LDESUltLP = T01NU9_A13345LDESUltLP[0] ;
         n13345LDESUltLP = T01NU9_n13345LDESUltLP[0] ;
         A13346LDESUltP = T01NU9_A13346LDESUltP[0] ;
         n13346LDESUltP = T01NU9_n13346LDESUltP[0] ;
         A13384LDESFecEnv = T01NU9_A13384LDESFecEnv[0] ;
         n13384LDESFecEnv = T01NU9_n13384LDESFecEnv[0] ;
         A13385LDESFecRep = T01NU9_A13385LDESFecRep[0] ;
         n13385LDESFecRep = T01NU9_n13385LDESFecRep[0] ;
         A13386LDESEstCb = T01NU9_A13386LDESEstCb[0] ;
         n13386LDESEstCb = T01NU9_n13386LDESEstCb[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         sMode1825 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NU1825( ) ;
         load1NU1825( ) ;
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1825 = (short)(0) ;
         initializeNonKey1NU1825( ) ;
         sMode1825 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NU1825( ) ;
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NU1825( ) ;
      }
      pr_default.close(7);
   }

   public void checkOptimisticConcurrency1NU1825( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NU8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z13338LDESComdD, T01NU8_A13338LDESComdD[0]) != 0 ) || ( Z13345LDESUltLP != T01NU8_A13345LDESUltLP[0] ) || ( Z13346LDESUltP != T01NU8_A13346LDESUltP[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z13384LDESFecEnv), GXutil.resetTime(T01NU8_A13384LDESFecEnv[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z13385LDESFecRep), GXutil.resetTime(T01NU8_A13385LDESFecRep[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13386LDESEstCb != T01NU8_A13386LDESEstCb[0] ) )
         {
            if ( GXutil.strcmp(Z13338LDESComdD, T01NU8_A13338LDESComdD[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESComdD");
               GXutil.writeLogRaw("Old: ",Z13338LDESComdD);
               GXutil.writeLogRaw("Current: ",T01NU8_A13338LDESComdD[0]);
            }
            if ( Z13345LDESUltLP != T01NU8_A13345LDESUltLP[0] )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESUltLP");
               GXutil.writeLogRaw("Old: ",Z13345LDESUltLP);
               GXutil.writeLogRaw("Current: ",T01NU8_A13345LDESUltLP[0]);
            }
            if ( Z13346LDESUltP != T01NU8_A13346LDESUltP[0] )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESUltP");
               GXutil.writeLogRaw("Old: ",Z13346LDESUltP);
               GXutil.writeLogRaw("Current: ",T01NU8_A13346LDESUltP[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13384LDESFecEnv), GXutil.resetTime(T01NU8_A13384LDESFecEnv[0])) ) )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESFecEnv");
               GXutil.writeLogRaw("Old: ",Z13384LDESFecEnv);
               GXutil.writeLogRaw("Current: ",T01NU8_A13384LDESFecEnv[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13385LDESFecRep), GXutil.resetTime(T01NU8_A13385LDESFecRep[0])) ) )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESFecRep");
               GXutil.writeLogRaw("Old: ",Z13385LDESFecRep);
               GXutil.writeLogRaw("Current: ",T01NU8_A13385LDESFecRep[0]);
            }
            if ( Z13386LDESEstCb != T01NU8_A13386LDESEstCb[0] )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESEstCb");
               GXutil.writeLogRaw("Old: ",Z13386LDESEstCb);
               GXutil.writeLogRaw("Current: ",T01NU8_A13386LDESEstCb[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NU1825( )
   {
      beforeValidate1NU1825( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1825( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NU1825( 0) ;
         checkOptimisticConcurrency1NU1825( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NU1825( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NU1825( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NU39 */
                  pr_default.execute(37, new Object[] {Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Boolean.valueOf(n13338LDESComdD), A13338LDESComdD, Boolean.valueOf(n13345LDESUltLP), Short.valueOf(A13345LDESUltLP), Boolean.valueOf(n13346LDESUltP), Short.valueOf(A13346LDESUltP), Boolean.valueOf(n13384LDESFecEnv), A13384LDESFecEnv, Boolean.valueOf(n13385LDESFecRep), A13385LDESFecRep, Boolean.valueOf(n13386LDESEstCb), Byte.valueOf(A13386LDESEstCb), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
                  if ( (pr_default.getStatus(37) == 1) )
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
                        processLevel1NU1825( ) ;
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
            load1NU1825( ) ;
         }
         endLevel1NU1825( ) ;
      }
      closeExtendedTableCursors1NU1825( ) ;
   }

   public void update1NU1825( )
   {
      beforeValidate1NU1825( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1825( ) ;
      }
      if ( ( nIsMod_1825 != 0 ) || ( nIsDirty_1825 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NU1825( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NU1825( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NU1825( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NU40 */
                     pr_default.execute(38, new Object[] {Boolean.valueOf(n13338LDESComdD), A13338LDESComdD, Boolean.valueOf(n13345LDESUltLP), Short.valueOf(A13345LDESUltLP), Boolean.valueOf(n13346LDESUltP), Short.valueOf(A13346LDESUltP), Boolean.valueOf(n13384LDESFecEnv), A13384LDESFecEnv, Boolean.valueOf(n13385LDESFecRep), A13385LDESFecRep, Boolean.valueOf(n13386LDESEstCb), Byte.valueOf(A13386LDESEstCb), A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
                     if ( (pr_default.getStatus(38) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES02"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NU1825( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1NU1825( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1NU1825( ) ;
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
            endLevel1NU1825( ) ;
         }
      }
      closeExtendedTableCursors1NU1825( ) ;
   }

   public void deferredUpdate1NU1825( )
   {
   }

   public void delete1NU1825( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NU1825( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NU1825( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NU1825( ) ;
         afterConfirm1NU1825( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NU1825( ) ;
            if ( AnyError == 0 )
            {
               scanStart1NU1827( ) ;
               while ( RcdFound1827 != 0 )
               {
                  getByPrimaryKey1NU1827( ) ;
                  delete1NU1827( ) ;
                  scanNext1NU1827( ) ;
               }
               scanEnd1NU1827( ) ;
               scanStart1NU1826( ) ;
               while ( RcdFound1826 != 0 )
               {
                  getByPrimaryKey1NU1826( ) ;
                  delete1NU1826( ) ;
                  scanNext1NU1826( ) ;
               }
               scanEnd1NU1826( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NU41 */
                  pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
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
      sMode1825 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NU1825( ) ;
      Gx_mode = sMode1825 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NU1825( )
   {
      standaloneModal1NU1825( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1NU1827( )
   {
      nGXsfl_179_idx = 0 ;
      while ( nGXsfl_179_idx < nRC_GXsfl_179 )
      {
         readRow1NU1827( ) ;
         if ( ( nRcdExists_1827 != 0 ) || ( nIsMod_1827 != 0 ) )
         {
            standaloneNotModal1NU1827( ) ;
            getKey1NU1827( ) ;
            if ( ( nRcdExists_1827 == 0 ) && ( nRcdDeleted_1827 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NU1827( ) ;
            }
            else
            {
               if ( RcdFound1827 != 0 )
               {
                  if ( ( nRcdDeleted_1827 != 0 ) && ( nRcdExists_1827 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NU1827( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1827 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NU1827( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1827 == 0 )
                  {
                     GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESNPeque_Internalname ;
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
         httpContext.changePostValue( "ZT_"+"Z13342LDESLinea_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( Z13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13343LDESCant_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( Z13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13344LDESUnd_"+sGXsfl_179_idx, GXutil.rtrim( Z13344LDESUnd)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_179_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1827_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1827_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1827_"+sGXsfl_179_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1827 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1827_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1827_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESLINEA_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCANT_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESUND_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NU1827( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1827 = (short)(0) ;
      nIsMod_1827 = (short)(0) ;
      nRcdDeleted_1827 = (short)(0) ;
   }

   public void processNestedLevel1NU1826( )
   {
      nGXsfl_189_idx = 0 ;
      while ( nGXsfl_189_idx < nRC_GXsfl_189 )
      {
         readRow1NU1826( ) ;
         if ( ( nRcdExists_1826 != 0 ) || ( nIsMod_1826 != 0 ) )
         {
            standaloneNotModal1NU1826( ) ;
            getKey1NU1826( ) ;
            if ( ( nRcdExists_1826 == 0 ) && ( nRcdDeleted_1826 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NU1826( ) ;
            }
            else
            {
               if ( RcdFound1826 != 0 )
               {
                  if ( ( nRcdDeleted_1826 != 0 ) && ( nRcdExists_1826 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NU1826( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1826 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NU1826( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1826 == 0 )
                  {
                     GXCCtl = "LDESNPEQUE_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESNPeque_Internalname ;
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
         httpContext.changePostValue( "ZT_"+"Z13340LDESLinP_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( Z13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13341LDESCantP_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( Z13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_189_idx, GXutil.rtrim( Z2107PasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1826_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1826_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1826_"+sGXsfl_189_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1826 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1826_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1826_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESLINP_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASCOD_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASDSC_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCANTP_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCantP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NU1826( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1826 = (short)(0) ;
      nIsMod_1826 = (short)(0) ;
      nRcdDeleted_1826 = (short)(0) ;
   }

   public void processLevel1NU1825( )
   {
      /* Save parent mode. */
      sMode1825 = Gx_mode ;
      processNestedLevel1NU1827( ) ;
      processNestedLevel1NU1826( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1825 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NU1825( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NU1825( )
   {
      /* Scan By routine */
      /* Using cursor T01NU42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      RcdFound1825 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound1825 = (short)(1) ;
         A13337LDESComb = T01NU42_A13337LDESComb[0] ;
         A13339LDESFondo = T01NU42_A13339LDESFondo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NU1825( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound1825 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound1825 = (short)(1) ;
         A13337LDESComb = T01NU42_A13337LDESComb[0] ;
         A13339LDESFondo = T01NU42_A13339LDESFondo[0] ;
      }
   }

   public void scanEnd1NU1825( )
   {
      pr_default.close(40);
   }

   public void afterConfirm1NU1825( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NU1825( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NU1825( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NU1825( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NU1825( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NU1825( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NU1825( )
   {
      edtLDESComb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtLDESComdD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESComdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComdD_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtLDESFondo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtLDESUltLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtLDESUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtLDESFecEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESFecEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFecEnv_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtLDESFecRep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESFecRep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFecRep_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtLDESEstCb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESEstCb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESEstCb_Enabled), 5, 0), !bGXsfl_132_Refreshing);
   }

   public void zm1NU1827( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13343LDESCant = T01NU6_A13343LDESCant[0] ;
            Z13344LDESUnd = T01NU6_A13344LDESUnd[0] ;
            Z719PrdNum = T01NU6_A719PrdNum[0] ;
         }
         else
         {
            Z13343LDESCant = A13343LDESCant ;
            Z13344LDESUnd = A13344LDESUnd ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13342LDESLinea = A13342LDESLinea ;
         Z13343LDESCant = A13343LDESCant ;
         Z13344LDESUnd = A13344LDESUnd ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal1NU1827( )
   {
   }

   public void standaloneModal1NU1827( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESLinea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_179_Refreshing);
      }
      else
      {
         edtLDESLinea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_179_Refreshing);
      }
   }

   public void load1NU1827( )
   {
      /* Using cursor T01NU43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound1827 = (short)(1) ;
         A718PrdNom = T01NU43_A718PrdNom[0] ;
         A13343LDESCant = T01NU43_A13343LDESCant[0] ;
         n13343LDESCant = T01NU43_n13343LDESCant[0] ;
         A13344LDESUnd = T01NU43_A13344LDESUnd[0] ;
         n13344LDESUnd = T01NU43_n13344LDESUnd[0] ;
         A719PrdNum = T01NU43_A719PrdNum[0] ;
         n719PrdNum = T01NU43_n719PrdNum[0] ;
         zm1NU1827( -8) ;
      }
      pr_default.close(41);
      onLoadActions1NU1827( ) ;
   }

   public void onLoadActions1NU1827( )
   {
   }

   public void checkExtendedTable1NU1827( )
   {
      nIsDirty_1827 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NU1827( ) ;
      /* Using cursor T01NU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_179_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01NU7_A718PrdNom[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1NU1827( )
   {
      pr_default.close(5);
   }

   public void enableDisable1NU1827( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01NU44 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(42) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_179_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01NU44_A718PrdNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(42) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(42);
   }

   public void getKey1NU1827( )
   {
      /* Using cursor T01NU45 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound1827 = (short)(1) ;
      }
      else
      {
         RcdFound1827 = (short)(0) ;
      }
      pr_default.close(43);
   }

   public void getByPrimaryKey1NU1827( )
   {
      /* Using cursor T01NU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01NU6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NU1827( 8) ;
         RcdFound1827 = (short)(1) ;
         initializeNonKey1NU1827( ) ;
         A13342LDESLinea = T01NU6_A13342LDESLinea[0] ;
         A13343LDESCant = T01NU6_A13343LDESCant[0] ;
         n13343LDESCant = T01NU6_n13343LDESCant[0] ;
         A13344LDESUnd = T01NU6_A13344LDESUnd[0] ;
         n13344LDESUnd = T01NU6_n13344LDESUnd[0] ;
         A719PrdNum = T01NU6_A719PrdNum[0] ;
         n719PrdNum = T01NU6_n719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13342LDESLinea = A13342LDESLinea ;
         sMode1827 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NU1827( ) ;
         load1NU1827( ) ;
         Gx_mode = sMode1827 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1827 = (short)(0) ;
         initializeNonKey1NU1827( ) ;
         sMode1827 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NU1827( ) ;
         Gx_mode = sMode1827 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NU1827( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency1NU1827( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NU5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES04"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z13343LDESCant, T01NU5_A13343LDESCant[0]) != 0 ) || ( GXutil.strcmp(Z13344LDESUnd, T01NU5_A13344LDESUnd[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01NU5_A719PrdNum[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z13343LDESCant, T01NU5_A13343LDESCant[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESCant");
               GXutil.writeLogRaw("Old: ",Z13343LDESCant);
               GXutil.writeLogRaw("Current: ",T01NU5_A13343LDESCant[0]);
            }
            if ( GXutil.strcmp(Z13344LDESUnd, T01NU5_A13344LDESUnd[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESUnd");
               GXutil.writeLogRaw("Old: ",Z13344LDESUnd);
               GXutil.writeLogRaw("Current: ",T01NU5_A13344LDESUnd[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01NU5_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01NU5_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES04"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NU1827( )
   {
      beforeValidate1NU1827( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1827( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NU1827( 0) ;
         checkOptimisticConcurrency1NU1827( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NU1827( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NU1827( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NU46 */
                  pr_default.execute(44, new Object[] {Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea), Boolean.valueOf(n13343LDESCant), A13343LDESCant, Boolean.valueOf(n13344LDESUnd), A13344LDESUnd, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES04");
                  if ( (pr_default.getStatus(44) == 1) )
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
            load1NU1827( ) ;
         }
         endLevel1NU1827( ) ;
      }
      closeExtendedTableCursors1NU1827( ) ;
   }

   public void update1NU1827( )
   {
      beforeValidate1NU1827( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1827( ) ;
      }
      if ( ( nIsMod_1827 != 0 ) || ( nIsDirty_1827 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NU1827( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NU1827( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NU1827( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NU47 */
                     pr_default.execute(45, new Object[] {Boolean.valueOf(n13343LDESCant), A13343LDESCant, Boolean.valueOf(n13344LDESUnd), A13344LDESUnd, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES04");
                     if ( (pr_default.getStatus(45) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES04"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NU1827( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NU1827( ) ;
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
            endLevel1NU1827( ) ;
         }
      }
      closeExtendedTableCursors1NU1827( ) ;
   }

   public void deferredUpdate1NU1827( )
   {
   }

   public void delete1NU1827( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NU1827( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NU1827( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NU1827( ) ;
         afterConfirm1NU1827( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NU1827( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NU48 */
               pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13342LDESLinea)});
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
      endLevel1NU1827( ) ;
      Gx_mode = sMode1827 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NU1827( )
   {
      standaloneModal1NU1827( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NU49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A718PrdNom = T01NU49_A718PrdNom[0] ;
         pr_default.close(47);
      }
   }

   public void endLevel1NU1827( )
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

   public void scanStart1NU1827( )
   {
      /* Scan By routine */
      /* Using cursor T01NU50 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      RcdFound1827 = (short)(0) ;
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1827 = (short)(1) ;
         A13342LDESLinea = T01NU50_A13342LDESLinea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NU1827( )
   {
      /* Scan next routine */
      pr_default.readNext(48);
      RcdFound1827 = (short)(0) ;
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound1827 = (short)(1) ;
         A13342LDESLinea = T01NU50_A13342LDESLinea[0] ;
      }
   }

   public void scanEnd1NU1827( )
   {
      pr_default.close(48);
   }

   public void afterConfirm1NU1827( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NU1827( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NU1827( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NU1827( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NU1827( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NU1827( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NU1827( )
   {
      edtLDESLinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_179_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_179_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_179_Refreshing);
      edtLDESCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCant_Enabled), 5, 0), !bGXsfl_179_Refreshing);
      edtLDESUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUnd_Enabled), 5, 0), !bGXsfl_179_Refreshing);
   }

   public void send_integrity_lvl_hashes1NU1827( )
   {
   }

   public void zm1NU1826( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13341LDESCantP = T01NU3_A13341LDESCantP[0] ;
            Z2107PasCod = T01NU3_A2107PasCod[0] ;
         }
         else
         {
            Z13341LDESCantP = A13341LDESCantP ;
            Z2107PasCod = A2107PasCod ;
         }
      }
      if ( GX_JID == -10 )
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

   public void standaloneNotModal1NU1826( )
   {
   }

   public void standaloneModal1NU1826( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESLinP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_189_Refreshing);
      }
      else
      {
         edtLDESLinP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_189_Refreshing);
      }
   }

   public void load1NU1826( )
   {
      /* Using cursor T01NU51 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound1826 = (short)(1) ;
         A2108PasDsc = T01NU51_A2108PasDsc[0] ;
         n2108PasDsc = T01NU51_n2108PasDsc[0] ;
         A13341LDESCantP = T01NU51_A13341LDESCantP[0] ;
         n13341LDESCantP = T01NU51_n13341LDESCantP[0] ;
         A2107PasCod = T01NU51_A2107PasCod[0] ;
         n2107PasCod = T01NU51_n2107PasCod[0] ;
         zm1NU1826( -10) ;
      }
      pr_default.close(49);
      onLoadActions1NU1826( ) ;
   }

   public void onLoadActions1NU1826( )
   {
   }

   public void checkExtendedTable1NU1826( )
   {
      nIsDirty_1826 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NU1826( ) ;
      /* Using cursor T01NU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PASCOD_" + sGXsfl_189_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2108PasDsc = T01NU4_A2108PasDsc[0] ;
      n2108PasDsc = T01NU4_n2108PasDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1NU1826( )
   {
      pr_default.close(2);
   }

   public void enableDisable1NU1826( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          String A2107PasCod )
   {
      /* Using cursor T01NU52 */
      pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(50) == 101) )
      {
         GXCCtl = "PASCOD_" + sGXsfl_189_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2108PasDsc = T01NU52_A2108PasDsc[0] ;
      n2108PasDsc = T01NU52_n2108PasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2108PasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(50) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(50);
   }

   public void getKey1NU1826( )
   {
      /* Using cursor T01NU53 */
      pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound1826 = (short)(1) ;
      }
      else
      {
         RcdFound1826 = (short)(0) ;
      }
      pr_default.close(51);
   }

   public void getByPrimaryKey1NU1826( )
   {
      /* Using cursor T01NU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01NU3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NU1826( 10) ;
         RcdFound1826 = (short)(1) ;
         initializeNonKey1NU1826( ) ;
         A13340LDESLinP = T01NU3_A13340LDESLinP[0] ;
         A13341LDESCantP = T01NU3_A13341LDESCantP[0] ;
         n13341LDESCantP = T01NU3_n13341LDESCantP[0] ;
         A2107PasCod = T01NU3_A2107PasCod[0] ;
         n2107PasCod = T01NU3_n2107PasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13340LDESLinP = A13340LDESLinP ;
         sMode1826 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NU1826( ) ;
         load1NU1826( ) ;
         Gx_mode = sMode1826 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1826 = (short)(0) ;
         initializeNonKey1NU1826( ) ;
         sMode1826 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NU1826( ) ;
         Gx_mode = sMode1826 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NU1826( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NU1826( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES03"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13341LDESCantP, T01NU2_A13341LDESCantP[0]) != 0 ) || ( GXutil.strcmp(Z2107PasCod, T01NU2_A2107PasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z13341LDESCantP, T01NU2_A13341LDESCantP[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"LDESCantP");
               GXutil.writeLogRaw("Old: ",Z13341LDESCantP);
               GXutil.writeLogRaw("Current: ",T01NU2_A13341LDESCantP[0]);
            }
            if ( GXutil.strcmp(Z2107PasCod, T01NU2_A2107PasCod[0]) != 0 )
            {
               GXutil.writeLogln("tldes99:[seudo value changed for attri]"+"PasCod");
               GXutil.writeLogRaw("Old: ",Z2107PasCod);
               GXutil.writeLogRaw("Current: ",T01NU2_A2107PasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES03"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NU1826( )
   {
      beforeValidate1NU1826( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1826( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NU1826( 0) ;
         checkOptimisticConcurrency1NU1826( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NU1826( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NU1826( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NU54 */
                  pr_default.execute(52, new Object[] {Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP), Boolean.valueOf(n13341LDESCantP), A13341LDESCantP, A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES03");
                  if ( (pr_default.getStatus(52) == 1) )
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
            load1NU1826( ) ;
         }
         endLevel1NU1826( ) ;
      }
      closeExtendedTableCursors1NU1826( ) ;
   }

   public void update1NU1826( )
   {
      beforeValidate1NU1826( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NU1826( ) ;
      }
      if ( ( nIsMod_1826 != 0 ) || ( nIsDirty_1826 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NU1826( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NU1826( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NU1826( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NU55 */
                     pr_default.execute(53, new Object[] {Boolean.valueOf(n13341LDESCantP), A13341LDESCantP, Boolean.valueOf(n2107PasCod), A2107PasCod, A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES03");
                     if ( (pr_default.getStatus(53) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES03"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NU1826( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NU1826( ) ;
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
            endLevel1NU1826( ) ;
         }
      }
      closeExtendedTableCursors1NU1826( ) ;
   }

   public void deferredUpdate1NU1826( )
   {
   }

   public void delete1NU1826( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NU1826( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NU1826( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NU1826( ) ;
         afterConfirm1NU1826( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NU1826( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NU56 */
               pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Short.valueOf(A13340LDESLinP)});
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
      endLevel1NU1826( ) ;
      Gx_mode = sMode1826 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NU1826( )
   {
      standaloneModal1NU1826( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01NU57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
         A2108PasDsc = T01NU57_A2108PasDsc[0] ;
         n2108PasDsc = T01NU57_n2108PasDsc[0] ;
         pr_default.close(55);
      }
   }

   public void endLevel1NU1826( )
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

   public void scanStart1NU1826( )
   {
      /* Scan By routine */
      /* Using cursor T01NU58 */
      pr_default.execute(56, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      RcdFound1826 = (short)(0) ;
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound1826 = (short)(1) ;
         A13340LDESLinP = T01NU58_A13340LDESLinP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NU1826( )
   {
      /* Scan next routine */
      pr_default.readNext(56);
      RcdFound1826 = (short)(0) ;
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound1826 = (short)(1) ;
         A13340LDESLinP = T01NU58_A13340LDESLinP[0] ;
      }
   }

   public void scanEnd1NU1826( )
   {
      pr_default.close(56);
   }

   public void afterConfirm1NU1826( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NU1826( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NU1826( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NU1826( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NU1826( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NU1826( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NU1826( )
   {
      edtLDESLinP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_189_Refreshing);
      edtPasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasCod_Enabled), 5, 0), !bGXsfl_189_Refreshing);
      edtPasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasDsc_Enabled), 5, 0), !bGXsfl_189_Refreshing);
      edtLDESCantP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESCantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCantP_Enabled), 5, 0), !bGXsfl_189_Refreshing);
   }

   public void send_integrity_lvl_hashes1NU1826( )
   {
   }

   public void send_integrity_lvl_hashes1NU1825( )
   {
   }

   public void send_integrity_lvl_hashes1NU1824( )
   {
   }

   public void send_integrity_lvl_hashes1NU1823( )
   {
   }

   public void subsflControlProps_1001824( )
   {
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_100_idx ;
      edtLDESNPeque_Internalname = "LDESNPEQUE_"+sGXsfl_100_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_100_idx ;
      edtLDESDPeque_Internalname = "LDESDPEQUE_"+sGXsfl_100_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_100_idx ;
      edtLDESMedida_Internalname = "LDESMEDIDA_"+sGXsfl_100_idx ;
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_100_idx ;
      edtLDESMalla_Internalname = "LDESMALLA_"+sGXsfl_100_idx ;
      lblTextblock21_Internalname = "TEXTBLOCK21_"+sGXsfl_100_idx ;
      edtLDESCob_Internalname = "LDESCOB_"+sGXsfl_100_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_1001824( )
   {
      lblTextblock17_Internalname = "TEXTBLOCK17_"+sGXsfl_100_fel_idx ;
      edtLDESNPeque_Internalname = "LDESNPEQUE_"+sGXsfl_100_fel_idx ;
      lblTextblock18_Internalname = "TEXTBLOCK18_"+sGXsfl_100_fel_idx ;
      edtLDESDPeque_Internalname = "LDESDPEQUE_"+sGXsfl_100_fel_idx ;
      lblTextblock19_Internalname = "TEXTBLOCK19_"+sGXsfl_100_fel_idx ;
      edtLDESMedida_Internalname = "LDESMEDIDA_"+sGXsfl_100_fel_idx ;
      lblTextblock20_Internalname = "TEXTBLOCK20_"+sGXsfl_100_fel_idx ;
      edtLDESMalla_Internalname = "LDESMALLA_"+sGXsfl_100_fel_idx ;
      lblTextblock21_Internalname = "TEXTBLOCK21_"+sGXsfl_100_fel_idx ;
      edtLDESCob_Internalname = "LDESCOB_"+sGXsfl_100_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_100_fel_idx ;
   }

   public void addRow1NU1824( )
   {
      nRC_GXsfl_132 = 0 ;
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001824( ) ;
      sendRow1NU1824( ) ;
   }

   public void sendRow1NU1824( )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_100_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_100_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_100_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock17_Internalname,httpContext.getMessage( "N Peque", ""),"","",lblTextblock17_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESNPeque_Internalname,GXutil.rtrim( A13333LDESNPeque),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESNPeque_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESNPeque_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(12),"chr",Integer.valueOf(1),"row",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock18_Internalname,httpContext.getMessage( "Descripcion del Peque", ""),"","",lblTextblock18_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESDPeque_Internalname,GXutil.rtrim( A13334LDESDPeque),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESDPeque_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESDPeque_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock19_Internalname,httpContext.getMessage( "Medidas del Peque", ""),"","",lblTextblock19_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESMedida_Internalname,GXutil.rtrim( A13335LDESMedida),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESMedida_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESMedida_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock20_Internalname,httpContext.getMessage( "Malla", ""),"","",lblTextblock20_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESMalla_Internalname,GXutil.rtrim( A13336LDESMalla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESMalla_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESMalla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock21_Internalname,httpContext.getMessage( "Cobertura", ""),"","",lblTextblock21_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESCob_Internalname,GXutil.ltrim( localUtil.ntoc( A13347LDESCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESCob_Enabled!=0) ? localUtil.format( A13347LDESCob, "ZZ9.99") : localUtil.format( A13347LDESCob, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESCob_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESCob_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol132( ) ;
      /* Save parent mode. */
      sMode1825 = Gx_mode ;
      nGXsfl_132_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1825 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1825 = (short)(1) ;
            scanStart1NU1825( ) ;
            while ( RcdFound1825 != 0 )
            {
               init_level_properties1825( ) ;
               getByPrimaryKey1NU1825( ) ;
               addRow1NU1825( ) ;
               scanNext1NU1825( ) ;
            }
            scanEnd1NU1825( ) ;
            nBlankRcdCount1825 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NU1825( ) ;
         standaloneModal1NU1825( ) ;
         sMode1825 = Gx_mode ;
         while ( nGXsfl_132_idx < nRC_GXsfl_132 )
         {
            bGXsfl_132_Refreshing = true ;
            readRow1NU1825( ) ;
            edtLDESComb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOMB_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtLDESComdD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOMDD_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESComdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComdD_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtLDESFondo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESFONDO_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtLDESUltLP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESULTLP_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtLDESUltP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESULTP_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtLDESFecEnv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESFECENV_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESFecEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFecEnv_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtLDESFecRep_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESFECREP_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESFecRep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFecRep_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            edtLDESEstCb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESESTCB_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESEstCb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESEstCb_Enabled), 5, 0), !bGXsfl_132_Refreshing);
            if ( ( nRcdExists_1825 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NU1825( ) ;
            }
            sendRow1NU1825( ) ;
            bGXsfl_132_Refreshing = false ;
         }
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1825 = (short)(5) ;
         nRcdExists_1825 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NU1825( ) ;
            while ( RcdFound1825 != 0 )
            {
               sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx+1), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
               subsflControlProps_1321825( ) ;
               init_level_properties1825( ) ;
               standaloneNotModal1NU1825( ) ;
               getByPrimaryKey1NU1825( ) ;
               standaloneModal1NU1825( ) ;
               addRow1NU1825( ) ;
               scanNext1NU1825( ) ;
            }
            scanEnd1NU1825( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1825 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx+1), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
      subsflControlProps_1321825( ) ;
      initAll1NU1825( ) ;
      init_level_properties1825( ) ;
      nRcdExists_1825 = (short)(0) ;
      nIsMod_1825 = (short)(0) ;
      nRcdDeleted_1825 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 100 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_100_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1825 = (short)(nBlankRcdUsr1825+nBlankRcdCount1825) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1825 > 0 )
      {
         standaloneNotModal1NU1825( ) ;
         standaloneModal1NU1825( ) ;
         addRow1NU1825( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLDESComb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1825 = (short)(nBlankRcdCount1825-1) ;
      }
      Gx_mode = sMode1825 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1825 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_100_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_100_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_100_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1NU1824( ) ;
      GXCCtl = "Z13333LDESNPeque_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13333LDESNPeque));
      GXCCtl = "Z13334LDESDPeque_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13334LDESDPeque));
      GXCCtl = "Z13335LDESMedida_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13335LDESMedida));
      GXCCtl = "Z13336LDESMalla_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13336LDESMalla));
      GXCCtl = "Z13347LDESCob_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13347LDESCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_132_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_132_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1824_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1824_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1824_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1824, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESNPEQUE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESNPeque_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESDPEQUE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESDPeque_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESMEDIDA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESMedida_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESMALLA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESMalla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCOB_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_100_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1NU1824( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001824( ) ;
      edtLDESNPeque_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESNPEQUE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESDPeque_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESDPEQUE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESMedida_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESMEDIDA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESMalla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESMALLA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOB_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A13333LDESNPeque = httpContext.cgiGet( edtLDESNPeque_Internalname) ;
      A13334LDESDPeque = httpContext.cgiGet( edtLDESDPeque_Internalname) ;
      n13334LDESDPeque = false ;
      A13335LDESMedida = httpContext.cgiGet( edtLDESMedida_Internalname) ;
      n13335LDESMedida = false ;
      A13336LDESMalla = httpContext.cgiGet( edtLDESMalla_Internalname) ;
      n13336LDESMalla = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLDESCob_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLDESCob_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "LDESCOB_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESCob_Internalname ;
         wbErr = true ;
         A13347LDESCob = DecimalUtil.ZERO ;
         n13347LDESCob = false ;
      }
      else
      {
         A13347LDESCob = localUtil.ctond( httpContext.cgiGet( edtLDESCob_Internalname)) ;
         n13347LDESCob = false ;
      }
      GXCCtl = "Z13333LDESNPeque_" + sGXsfl_100_idx ;
      Z13333LDESNPeque = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13334LDESDPeque_" + sGXsfl_100_idx ;
      Z13334LDESDPeque = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13335LDESMedida_" + sGXsfl_100_idx ;
      Z13335LDESMedida = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13336LDESMalla_" + sGXsfl_100_idx ;
      Z13336LDESMalla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13347LDESCob_" + sGXsfl_100_idx ;
      Z13347LDESCob = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRC_GXsfl_132_" + sGXsfl_100_idx ;
      nRC_GXsfl_132 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1824_" + sGXsfl_100_idx ;
      nRcdDeleted_1824 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1824_" + sGXsfl_100_idx ;
      nRcdExists_1824 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1824_" + sGXsfl_100_idx ;
      nIsMod_1824 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_132_" + sGXsfl_100_idx ;
      nRC_GXsfl_132 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1321825( )
   {
      lblTextblock22_Internalname = "TEXTBLOCK22_"+sGXsfl_132_idx ;
      edtLDESComb_Internalname = "LDESCOMB_"+sGXsfl_132_idx ;
      lblTextblock23_Internalname = "TEXTBLOCK23_"+sGXsfl_132_idx ;
      edtLDESComdD_Internalname = "LDESCOMDD_"+sGXsfl_132_idx ;
      lblTextblock24_Internalname = "TEXTBLOCK24_"+sGXsfl_132_idx ;
      edtLDESFondo_Internalname = "LDESFONDO_"+sGXsfl_132_idx ;
      lblTextblock25_Internalname = "TEXTBLOCK25_"+sGXsfl_132_idx ;
      edtLDESUltLP_Internalname = "LDESULTLP_"+sGXsfl_132_idx ;
      lblTextblock26_Internalname = "TEXTBLOCK26_"+sGXsfl_132_idx ;
      edtLDESUltP_Internalname = "LDESULTP_"+sGXsfl_132_idx ;
      lblTextblock27_Internalname = "TEXTBLOCK27_"+sGXsfl_132_idx ;
      edtLDESFecEnv_Internalname = "LDESFECENV_"+sGXsfl_132_idx ;
      lblTextblock28_Internalname = "TEXTBLOCK28_"+sGXsfl_132_idx ;
      edtLDESFecRep_Internalname = "LDESFECREP_"+sGXsfl_132_idx ;
      lblTextblock29_Internalname = "TEXTBLOCK29_"+sGXsfl_132_idx ;
      edtLDESEstCb_Internalname = "LDESESTCB_"+sGXsfl_132_idx ;
      subGrid3_Internalname = "GRID3_"+sGXsfl_132_idx ;
      subGrid4_Internalname = "GRID4_"+sGXsfl_132_idx ;
   }

   public void subsflControlProps_fel_1321825( )
   {
      lblTextblock22_Internalname = "TEXTBLOCK22_"+sGXsfl_132_fel_idx ;
      edtLDESComb_Internalname = "LDESCOMB_"+sGXsfl_132_fel_idx ;
      lblTextblock23_Internalname = "TEXTBLOCK23_"+sGXsfl_132_fel_idx ;
      edtLDESComdD_Internalname = "LDESCOMDD_"+sGXsfl_132_fel_idx ;
      lblTextblock24_Internalname = "TEXTBLOCK24_"+sGXsfl_132_fel_idx ;
      edtLDESFondo_Internalname = "LDESFONDO_"+sGXsfl_132_fel_idx ;
      lblTextblock25_Internalname = "TEXTBLOCK25_"+sGXsfl_132_fel_idx ;
      edtLDESUltLP_Internalname = "LDESULTLP_"+sGXsfl_132_fel_idx ;
      lblTextblock26_Internalname = "TEXTBLOCK26_"+sGXsfl_132_fel_idx ;
      edtLDESUltP_Internalname = "LDESULTP_"+sGXsfl_132_fel_idx ;
      lblTextblock27_Internalname = "TEXTBLOCK27_"+sGXsfl_132_fel_idx ;
      edtLDESFecEnv_Internalname = "LDESFECENV_"+sGXsfl_132_fel_idx ;
      lblTextblock28_Internalname = "TEXTBLOCK28_"+sGXsfl_132_fel_idx ;
      edtLDESFecRep_Internalname = "LDESFECREP_"+sGXsfl_132_fel_idx ;
      lblTextblock29_Internalname = "TEXTBLOCK29_"+sGXsfl_132_fel_idx ;
      edtLDESEstCb_Internalname = "LDESESTCB_"+sGXsfl_132_fel_idx ;
      subGrid3_Internalname = "GRID3_"+sGXsfl_132_fel_idx ;
      subGrid4_Internalname = "GRID4_"+sGXsfl_132_fel_idx ;
   }

   public void addRow1NU1825( )
   {
      nRC_GXsfl_179 = 0 ;
      nRC_GXsfl_189 = 0 ;
      nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
      subsflControlProps_1321825( ) ;
      sendRow1NU1825( ) ;
   }

   public void sendRow1NU1825( )
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
         if ( ((int)((nGXsfl_132_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_132_idx+"\">") ;
      }
      if ( GRID2_IsPaging == 0 )
      {
         GXCCtl = "GRID3_nFirstRecordOnPage_" + sGXsfl_132_idx ;
         GRID3_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GXCCtl = "GRID4_nFirstRecordOnPage_" + sGXsfl_132_idx ;
         GRID4_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID3_nFirstRecordOnPage = 0 ;
         GRID4_nFirstRecordOnPage = 0 ;
      }
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid2Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable4_Internalname+"_"+sGXsfl_132_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock22_Internalname,httpContext.getMessage( "Combinacion", ""),"","",lblTextblock22_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 140,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESComb_Internalname,GXutil.rtrim( A13337LDESComb),GXutil.rtrim( localUtil.format( A13337LDESComb, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,140);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESComb_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESComb_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(12),"chr",Integer.valueOf(1),"row",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock23_Internalname,httpContext.getMessage( "Descripcion", ""),"","",lblTextblock23_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 145,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESComdD_Internalname,GXutil.rtrim( A13338LDESComdD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESComdD_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESComdD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock24_Internalname,httpContext.getMessage( "Fondo", ""),"","",lblTextblock24_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESFondo_Internalname,GXutil.rtrim( A13339LDESFondo),GXutil.rtrim( localUtil.format( A13339LDESFondo, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,150);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESFondo_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESFondo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(12),"chr",Integer.valueOf(1),"row",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock25_Internalname,httpContext.getMessage( "Ultima Linea Productos", ""),"","",lblTextblock25_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 155,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESUltLP_Internalname,GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESUltLP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13345LDESUltLP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13345LDESUltLP), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,155);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESUltLP_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESUltLP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock26_Internalname,httpContext.getMessage( "Ultima linea Pastas", ""),"","",lblTextblock26_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESUltP_Internalname,GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESUltP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13346LDESUltP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13346LDESUltP), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,160);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESUltP_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESUltP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock27_Internalname,httpContext.getMessage( "Fecha Envio", ""),"","",lblTextblock27_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 165,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESFecEnv_Internalname,localUtil.format(A13384LDESFecEnv, "99/99/99"),localUtil.format( A13384LDESFecEnv, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,165);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESFecEnv_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESFecEnv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock28_Internalname,httpContext.getMessage( "Fecha Recepcion", ""),"","",lblTextblock28_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 170,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESFecRep_Internalname,localUtil.format(A13385LDESFecRep, "99/99/99"),localUtil.format( A13385LDESFecRep, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,170);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESFecRep_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESFecRep_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock29_Internalname,httpContext.getMessage( "Estado Combinacion", ""),"","",lblTextblock29_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 175,'',false,'" + sGXsfl_132_idx + "',132)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESEstCb_Internalname,GXutil.ltrim( localUtil.ntoc( A13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESEstCb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13386LDESEstCb), "9") : localUtil.format( DecimalUtil.doubleToDec(A13386LDESEstCb), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,175);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESEstCb_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLDESEstCb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(132),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid2Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid3Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid3Container.Clear();
      }
      startgridcontrol179( ) ;
      nGXsfl_179_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1827 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1827 = (short)(1) ;
            scanStart1NU1827( ) ;
            while ( RcdFound1827 != 0 )
            {
               init_level_properties1827( ) ;
               getByPrimaryKey1NU1827( ) ;
               addRow1NU1827( ) ;
               scanNext1NU1827( ) ;
            }
            scanEnd1NU1827( ) ;
            nBlankRcdCount1827 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NU1827( ) ;
         standaloneModal1NU1827( ) ;
         sMode1827 = Gx_mode ;
         while ( nGXsfl_179_idx < nRC_GXsfl_179 )
         {
            bGXsfl_179_Refreshing = true ;
            readRow1NU1827( ) ;
            edtavnRcdDeleted_1827_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1827_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1827_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1827_Enabled), 5, 0), !bGXsfl_179_Refreshing);
            edtLDESLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESLINEA_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_179_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_179_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_179_Refreshing);
            edtLDESCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCANT_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCant_Enabled), 5, 0), !bGXsfl_179_Refreshing);
            edtLDESUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESUND_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUnd_Enabled), 5, 0), !bGXsfl_179_Refreshing);
            if ( ( nRcdExists_1827 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NU1827( ) ;
            }
            sendRow1NU1827( ) ;
            bGXsfl_179_Refreshing = false ;
         }
         Gx_mode = sMode1827 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1827 = (short)(5) ;
         nRcdExists_1827 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NU1827( ) ;
            while ( RcdFound1827 != 0 )
            {
               sGXsfl_179_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_179_idx+1), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
               subsflControlProps_1791827( ) ;
               init_level_properties1827( ) ;
               standaloneNotModal1NU1827( ) ;
               getByPrimaryKey1NU1827( ) ;
               standaloneModal1NU1827( ) ;
               addRow1NU1827( ) ;
               scanNext1NU1827( ) ;
            }
            scanEnd1NU1827( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1827 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_179_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_179_idx+1), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
      subsflControlProps_1791827( ) ;
      initAll1NU1827( ) ;
      init_level_properties1827( ) ;
      nRcdExists_1827 = (short)(0) ;
      nIsMod_1827 = (short)(0) ;
      nRcdDeleted_1827 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 132 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_132_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1827 = (short)(nBlankRcdUsr1827+nBlankRcdCount1827) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1827 > 0 )
      {
         standaloneNotModal1NU1827( ) ;
         standaloneModal1NU1827( ) ;
         addRow1NU1827( ) ;
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
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"_"+sGXsfl_132_idx, Grid3Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid2Row.AddGrid("Grid3", Grid3Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V_"+sGXsfl_132_idx, Grid3Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V_"+sGXsfl_132_idx+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
      }
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid2Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid4Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid4Container.Clear();
      }
      startgridcontrol189( ) ;
      nGXsfl_189_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1826 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1826 = (short)(1) ;
            scanStart1NU1826( ) ;
            while ( RcdFound1826 != 0 )
            {
               init_level_properties1826( ) ;
               getByPrimaryKey1NU1826( ) ;
               addRow1NU1826( ) ;
               scanNext1NU1826( ) ;
            }
            scanEnd1NU1826( ) ;
            nBlankRcdCount1826 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NU1826( ) ;
         standaloneModal1NU1826( ) ;
         sMode1826 = Gx_mode ;
         while ( nGXsfl_189_idx < nRC_GXsfl_189 )
         {
            bGXsfl_189_Refreshing = true ;
            readRow1NU1826( ) ;
            edtavnRcdDeleted_1826_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1826_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1826_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1826_Enabled), 5, 0), !bGXsfl_189_Refreshing);
            edtLDESLinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESLINP_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_189_Refreshing);
            edtPasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASCOD_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasCod_Enabled), 5, 0), !bGXsfl_189_Refreshing);
            edtPasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASDSC_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasDsc_Enabled), 5, 0), !bGXsfl_189_Refreshing);
            edtLDESCantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCANTP_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESCantP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESCantP_Enabled), 5, 0), !bGXsfl_189_Refreshing);
            if ( ( nRcdExists_1826 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NU1826( ) ;
            }
            sendRow1NU1826( ) ;
            bGXsfl_189_Refreshing = false ;
         }
         Gx_mode = sMode1826 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1826 = (short)(5) ;
         nRcdExists_1826 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NU1826( ) ;
            while ( RcdFound1826 != 0 )
            {
               sGXsfl_189_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_189_idx+1), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
               subsflControlProps_1891826( ) ;
               init_level_properties1826( ) ;
               standaloneNotModal1NU1826( ) ;
               getByPrimaryKey1NU1826( ) ;
               standaloneModal1NU1826( ) ;
               addRow1NU1826( ) ;
               scanNext1NU1826( ) ;
            }
            scanEnd1NU1826( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1826 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_189_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_189_idx+1), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
      subsflControlProps_1891826( ) ;
      initAll1NU1826( ) ;
      init_level_properties1826( ) ;
      nRcdExists_1826 = (short)(0) ;
      nIsMod_1826 = (short)(0) ;
      nRcdDeleted_1826 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 132 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_132_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1826 = (short)(nBlankRcdUsr1826+nBlankRcdCount1826) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1826 > 0 )
      {
         standaloneNotModal1NU1826( ) ;
         standaloneModal1NU1826( ) ;
         addRow1NU1826( ) ;
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
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData"+"_"+sGXsfl_132_idx, Grid4Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid2Row.AddGrid("Grid4", Grid4Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData"+"V_"+sGXsfl_132_idx, Grid4Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid4ContainerData"+"V_"+sGXsfl_132_idx+"\" value='"+Grid4Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1NU1825( ) ;
      GXCCtl = "Z13337LDESComb_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13337LDESComb));
      GXCCtl = "Z13339LDESFondo_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13339LDESFondo));
      GXCCtl = "Z13338LDESComdD_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13338LDESComdD));
      GXCCtl = "Z13345LDESUltLP_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13346LDESUltP_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13384LDESFecEnv_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z13384LDESFecEnv, 0, "/"));
      GXCCtl = "Z13385LDESFecRep_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z13385LDESFecRep, 0, "/"));
      GXCCtl = "Z13386LDESEstCb_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_179_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_179_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_189_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_189_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1825_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1825_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1825_" + sGXsfl_132_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCOMB_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCOMDD_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComdD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESFONDO_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFondo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESULTLP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltLP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESULTP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESFECENV_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFecEnv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESFECREP_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFecRep_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESESTCB_"+sGXsfl_132_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESEstCb_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID3_nFirstRecordOnPage = 0 ;
      GRID3_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_132_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1NU1825( )
   {
      nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
      subsflControlProps_1321825( ) ;
      edtLDESComb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOMB_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESComdD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOMDD_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESFondo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESFONDO_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESUltLP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESULTLP_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESUltP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESULTP_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESFecEnv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESFECENV_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESFecRep_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESFECREP_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESEstCb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESESTCB_"+sGXsfl_132_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A13337LDESComb = GXutil.upper( httpContext.cgiGet( edtLDESComb_Internalname)) ;
      A13338LDESComdD = httpContext.cgiGet( edtLDESComdD_Internalname) ;
      n13338LDESComdD = false ;
      A13339LDESFondo = GXutil.upper( httpContext.cgiGet( edtLDESFondo_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESUltLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESUltLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LDESULTLP_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESUltLP_Internalname ;
         wbErr = true ;
         A13345LDESUltLP = (short)(0) ;
         n13345LDESUltLP = false ;
      }
      else
      {
         A13345LDESUltLP = (short)(localUtil.ctol( httpContext.cgiGet( edtLDESUltLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13345LDESUltLP = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LDESULTP_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESUltP_Internalname ;
         wbErr = true ;
         A13346LDESUltP = (short)(0) ;
         n13346LDESUltP = false ;
      }
      else
      {
         A13346LDESUltP = (short)(localUtil.ctol( httpContext.cgiGet( edtLDESUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13346LDESUltP = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtLDESFecEnv_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "LDESFECENV_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESFecEnv_Internalname ;
         wbErr = true ;
         A13384LDESFecEnv = GXutil.nullDate() ;
         n13384LDESFecEnv = false ;
      }
      else
      {
         A13384LDESFecEnv = localUtil.ctod( httpContext.cgiGet( edtLDESFecEnv_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n13384LDESFecEnv = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtLDESFecRep_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "LDESFECREP_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESFecRep_Internalname ;
         wbErr = true ;
         A13385LDESFecRep = GXutil.nullDate() ;
         n13385LDESFecRep = false ;
      }
      else
      {
         A13385LDESFecRep = localUtil.ctod( httpContext.cgiGet( edtLDESFecRep_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n13385LDESFecRep = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESEstCb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESEstCb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "LDESESTCB_" + sGXsfl_132_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESEstCb_Internalname ;
         wbErr = true ;
         A13386LDESEstCb = (byte)(0) ;
         n13386LDESEstCb = false ;
      }
      else
      {
         A13386LDESEstCb = (byte)(localUtil.ctol( httpContext.cgiGet( edtLDESEstCb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13386LDESEstCb = false ;
      }
      GXCCtl = "Z13337LDESComb_" + sGXsfl_132_idx ;
      Z13337LDESComb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13339LDESFondo_" + sGXsfl_132_idx ;
      Z13339LDESFondo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13338LDESComdD_" + sGXsfl_132_idx ;
      Z13338LDESComdD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13345LDESUltLP_" + sGXsfl_132_idx ;
      Z13345LDESUltLP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13346LDESUltP_" + sGXsfl_132_idx ;
      Z13346LDESUltP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13384LDESFecEnv_" + sGXsfl_132_idx ;
      Z13384LDESFecEnv = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13385LDESFecRep_" + sGXsfl_132_idx ;
      Z13385LDESFecRep = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13386LDESEstCb_" + sGXsfl_132_idx ;
      Z13386LDESEstCb = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_179_" + sGXsfl_132_idx ;
      nRC_GXsfl_179 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_189_" + sGXsfl_132_idx ;
      nRC_GXsfl_189 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1825_" + sGXsfl_132_idx ;
      nRcdDeleted_1825 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1825_" + sGXsfl_132_idx ;
      nRcdExists_1825 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1825_" + sGXsfl_132_idx ;
      nIsMod_1825 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_179_" + sGXsfl_132_idx ;
      nRC_GXsfl_179 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_189_" + sGXsfl_132_idx ;
      nRC_GXsfl_189 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1791827( )
   {
      edtavnRcdDeleted_1827_Internalname = "vNRCDDELETED_1827_"+sGXsfl_179_idx ;
      edtLDESLinea_Internalname = "LDESLINEA_"+sGXsfl_179_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_179_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_179_idx ;
      edtLDESCant_Internalname = "LDESCANT_"+sGXsfl_179_idx ;
      edtLDESUnd_Internalname = "LDESUND_"+sGXsfl_179_idx ;
   }

   public void subsflControlProps_fel_1791827( )
   {
      edtavnRcdDeleted_1827_Internalname = "vNRCDDELETED_1827_"+sGXsfl_179_fel_idx ;
      edtLDESLinea_Internalname = "LDESLINEA_"+sGXsfl_179_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_179_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_179_fel_idx ;
      edtLDESCant_Internalname = "LDESCANT_"+sGXsfl_179_fel_idx ;
      edtLDESUnd_Internalname = "LDESUND_"+sGXsfl_179_fel_idx ;
   }

   public void addRow1NU1827( )
   {
      nGXsfl_179_idx = (int)(nGXsfl_179_idx+1) ;
      sGXsfl_179_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_179_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
      subsflControlProps_1791827( ) ;
      sendRow1NU1827( ) ;
   }

   public void sendRow1NU1827( )
   {
      Grid3Row = GXWebRow.GetNew(context) ;
      if ( subGrid3_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         subGrid3_Backcolor = subGrid3_Allbackcolor ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Uniform" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
         subGrid3_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid3_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_179_idx) % (2))) == 0 )
         {
            subGrid3_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Even" ;
            }
         }
         else
         {
            subGrid3_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_179_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 180,'',false,'" + sGXsfl_179_idx + "',179)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1827_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1827_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1827), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1827), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,180);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1827_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1827_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(179),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_179_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_179_idx + "',179)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESLinea_Internalname,GXutil.ltrim( localUtil.ntoc( A13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13342LDESLinea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESLinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESLinea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(179),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_179_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_179_idx + "',179)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(179),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(179),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_179_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_179_idx + "',179)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESCant_Internalname,GXutil.ltrim( localUtil.ntoc( A13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESCant_Enabled!=0) ? localUtil.format( A13343LDESCant, "ZZZZZ9.999") : localUtil.format( A13343LDESCant, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,184);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(179),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1827_" + sGXsfl_179_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_179_idx + "',179)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESUnd_Internalname,GXutil.rtrim( A13344LDESUnd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,185);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(179),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid3Row);
      send_integrity_lvl_hashes1NU1827( ) ;
      GXCCtl = "Z13342LDESLinea_" + sGXsfl_179_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13342LDESLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13343LDESCant_" + sGXsfl_179_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13343LDESCant, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13344LDESUnd_" + sGXsfl_179_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13344LDESUnd));
      GXCCtl = "Z719PrdNum_" + sGXsfl_179_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1827_" + sGXsfl_179_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1827_" + sGXsfl_179_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1827_" + sGXsfl_179_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1827, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1827_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1827_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESLINEA_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCANT_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESUND_"+sGXsfl_179_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid3Container.AddRow(Grid3Row);
   }

   public void readRow1NU1827( )
   {
      nGXsfl_179_idx = (int)(nGXsfl_179_idx+1) ;
      sGXsfl_179_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_179_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
      subsflControlProps_1791827( ) ;
      edtavnRcdDeleted_1827_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1827_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESLINEA_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCANT_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESUND_"+sGXsfl_179_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         GXCCtl = "LDESLINEA_" + sGXsfl_179_idx ;
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
         GXCCtl = "LDESCANT_" + sGXsfl_179_idx ;
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
      GXCCtl = "Z13342LDESLinea_" + sGXsfl_179_idx ;
      Z13342LDESLinea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13343LDESCant_" + sGXsfl_179_idx ;
      Z13343LDESCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13344LDESUnd_" + sGXsfl_179_idx ;
      Z13344LDESUnd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_179_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1827_" + sGXsfl_179_idx ;
      nRcdDeleted_1827 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1827_" + sGXsfl_179_idx ;
      nRcdExists_1827 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1827_" + sGXsfl_179_idx ;
      nIsMod_1827 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1891826( )
   {
      edtavnRcdDeleted_1826_Internalname = "vNRCDDELETED_1826_"+sGXsfl_189_idx ;
      edtLDESLinP_Internalname = "LDESLINP_"+sGXsfl_189_idx ;
      edtPasCod_Internalname = "PASCOD_"+sGXsfl_189_idx ;
      edtPasDsc_Internalname = "PASDSC_"+sGXsfl_189_idx ;
      edtLDESCantP_Internalname = "LDESCANTP_"+sGXsfl_189_idx ;
   }

   public void subsflControlProps_fel_1891826( )
   {
      edtavnRcdDeleted_1826_Internalname = "vNRCDDELETED_1826_"+sGXsfl_189_fel_idx ;
      edtLDESLinP_Internalname = "LDESLINP_"+sGXsfl_189_fel_idx ;
      edtPasCod_Internalname = "PASCOD_"+sGXsfl_189_fel_idx ;
      edtPasDsc_Internalname = "PASDSC_"+sGXsfl_189_fel_idx ;
      edtLDESCantP_Internalname = "LDESCANTP_"+sGXsfl_189_fel_idx ;
   }

   public void addRow1NU1826( )
   {
      nGXsfl_189_idx = (int)(nGXsfl_189_idx+1) ;
      sGXsfl_189_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_189_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
      subsflControlProps_1891826( ) ;
      sendRow1NU1826( ) ;
   }

   public void sendRow1NU1826( )
   {
      Grid4Row = GXWebRow.GetNew(context) ;
      if ( subGrid4_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid4_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Odd" ;
         }
      }
      else if ( subGrid4_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid4_Backstyle = (byte)(0) ;
         subGrid4_Backcolor = subGrid4_Allbackcolor ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Uniform" ;
         }
      }
      else if ( subGrid4_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid4_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Odd" ;
         }
         subGrid4_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid4_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid4_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_189_idx) % (2))) == 0 )
         {
            subGrid4_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Even" ;
            }
         }
         else
         {
            subGrid4_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1826_" + sGXsfl_189_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_189_idx + "',189)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1826_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1826_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1826), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1826), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,190);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1826_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1826_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(189),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1826_" + sGXsfl_189_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_189_idx + "',189)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESLinP_Internalname,GXutil.ltrim( localUtil.ntoc( A13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13340LDESLinP), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESLinP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESLinP_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(189),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1826_" + sGXsfl_189_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 192,'',false,'" + sGXsfl_189_idx + "',189)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasCod_Internalname,GXutil.rtrim( A2107PasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,192);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(189),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasDsc_Internalname,GXutil.rtrim( A2108PasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(189),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1826_" + sGXsfl_189_idx + "',1);gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_132_idx + "',1);gx.fn.setControlValue('nIsMod_1824_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 194,'',false,'" + sGXsfl_189_idx + "',189)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESCantP_Internalname,GXutil.ltrim( localUtil.ntoc( A13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESCantP_Enabled!=0) ? localUtil.format( A13341LDESCantP, "ZZZZZ9.999") : localUtil.format( A13341LDESCantP, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,194);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESCantP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESCantP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(189),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid4Row);
      send_integrity_lvl_hashes1NU1826( ) ;
      GXCCtl = "Z13340LDESLinP_" + sGXsfl_189_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13340LDESLinP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13341LDESCantP_" + sGXsfl_189_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13341LDESCantP, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2107PasCod_" + sGXsfl_189_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2107PasCod));
      GXCCtl = "nRcdDeleted_1826_" + sGXsfl_189_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1826_" + sGXsfl_189_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1826_" + sGXsfl_189_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1826, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1826_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1826_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESLINP_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASCOD_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASDSC_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCANTP_"+sGXsfl_189_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid4Container.AddRow(Grid4Row);
   }

   public void readRow1NU1826( )
   {
      nGXsfl_189_idx = (int)(nGXsfl_189_idx+1) ;
      sGXsfl_189_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_189_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
      subsflControlProps_1891826( ) ;
      edtavnRcdDeleted_1826_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1826_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESLinP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESLINP_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASCOD_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASDSC_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESCantP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCANTP_"+sGXsfl_189_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         GXCCtl = "LDESLINP_" + sGXsfl_189_idx ;
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
         GXCCtl = "LDESCANTP_" + sGXsfl_189_idx ;
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
      GXCCtl = "Z13340LDESLinP_" + sGXsfl_189_idx ;
      Z13340LDESLinP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13341LDESCantP_" + sGXsfl_189_idx ;
      Z13341LDESCantP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2107PasCod_" + sGXsfl_189_idx ;
      Z2107PasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1826_" + sGXsfl_189_idx ;
      nRcdDeleted_1826 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1826_" + sGXsfl_189_idx ;
      nRcdExists_1826 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1826_" + sGXsfl_189_idx ;
      nIsMod_1826 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLDESFondo_Enabled = edtLDESFondo_Enabled ;
      defedtLDESComb_Enabled = edtLDESComb_Enabled ;
      defedtLDESLinea_Enabled = edtLDESLinea_Enabled ;
      defedtLDESLinP_Enabled = edtLDESLinP_Enabled ;
      defedtLDESNPeque_Enabled = edtLDESNPeque_Enabled ;
   }

   public void confirmValues1NU0( )
   {
      nGXsfl_132_idx = 0 ;
      sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
      subsflControlProps_1321825( ) ;
      while ( nGXsfl_132_idx < nRC_GXsfl_132 )
      {
         nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
         sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
         subsflControlProps_1321825( ) ;
         httpContext.changePostValue( "Z13337LDESComb_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13337LDESComb_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13337LDESComb_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13339LDESFondo_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13339LDESFondo_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13339LDESFondo_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13338LDESComdD_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13338LDESComdD_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13338LDESComdD_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13345LDESUltLP_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13345LDESUltLP_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13345LDESUltLP_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13346LDESUltP_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13346LDESUltP_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13346LDESUltP_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13384LDESFecEnv_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13384LDESFecEnv_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13384LDESFecEnv_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13385LDESFecRep_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13385LDESFecRep_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13385LDESFecRep_"+sGXsfl_132_idx) ;
         httpContext.changePostValue( "Z13386LDESEstCb_"+sGXsfl_132_idx, httpContext.cgiGet( "ZT_"+"Z13386LDESEstCb_"+sGXsfl_132_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13386LDESEstCb_"+sGXsfl_132_idx) ;
      }
      nGXsfl_100_idx = 0 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001824( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001824( ) ;
         httpContext.changePostValue( "Z13333LDESNPeque_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z13333LDESNPeque_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13333LDESNPeque_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z13334LDESDPeque_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z13334LDESDPeque_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13334LDESDPeque_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z13335LDESMedida_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z13335LDESMedida_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13335LDESMedida_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z13336LDESMalla_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z13336LDESMalla_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13336LDESMalla_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z13347LDESCob_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z13347LDESCob_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13347LDESCob_"+sGXsfl_100_idx) ;
      }
      nGXsfl_179_idx = 0 ;
      sGXsfl_179_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_179_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
      subsflControlProps_1791827( ) ;
      while ( nGXsfl_179_idx < nRC_GXsfl_179 )
      {
         nGXsfl_179_idx = (int)(nGXsfl_179_idx+1) ;
         sGXsfl_179_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_179_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
         subsflControlProps_1791827( ) ;
         httpContext.changePostValue( "Z13342LDESLinea_"+sGXsfl_179_idx, httpContext.cgiGet( "ZT_"+"Z13342LDESLinea_"+sGXsfl_179_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13342LDESLinea_"+sGXsfl_179_idx) ;
         httpContext.changePostValue( "Z13343LDESCant_"+sGXsfl_179_idx, httpContext.cgiGet( "ZT_"+"Z13343LDESCant_"+sGXsfl_179_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13343LDESCant_"+sGXsfl_179_idx) ;
         httpContext.changePostValue( "Z13344LDESUnd_"+sGXsfl_179_idx, httpContext.cgiGet( "ZT_"+"Z13344LDESUnd_"+sGXsfl_179_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13344LDESUnd_"+sGXsfl_179_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_179_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_179_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_179_idx) ;
      }
      nGXsfl_189_idx = 0 ;
      sGXsfl_189_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_189_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
      subsflControlProps_1891826( ) ;
      while ( nGXsfl_189_idx < nRC_GXsfl_189 )
      {
         nGXsfl_189_idx = (int)(nGXsfl_189_idx+1) ;
         sGXsfl_189_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_189_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
         subsflControlProps_1891826( ) ;
         httpContext.changePostValue( "Z13340LDESLinP_"+sGXsfl_189_idx, httpContext.cgiGet( "ZT_"+"Z13340LDESLinP_"+sGXsfl_189_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13340LDESLinP_"+sGXsfl_189_idx) ;
         httpContext.changePostValue( "Z13341LDESCantP_"+sGXsfl_189_idx, httpContext.cgiGet( "ZT_"+"Z13341LDESCantP_"+sGXsfl_189_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13341LDESCantP_"+sGXsfl_189_idx) ;
         httpContext.changePostValue( "Z2107PasCod_"+sGXsfl_189_idx, httpContext.cgiGet( "ZT_"+"Z2107PasCod_"+sGXsfl_189_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2107PasCod_"+sGXsfl_189_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tldes99", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13325LDESDibCli", GXutil.rtrim( Z13325LDESDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13326LDESDibInt", GXutil.ltrim( localUtil.ntoc( Z13326LDESDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13327LDESArtcod", GXutil.rtrim( Z13327LDESArtcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13328LDESArtDsc", GXutil.rtrim( Z13328LDESArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13329LDESRefGra", GXutil.rtrim( Z13329LDESRefGra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13330LDESTipoFa", GXutil.ltrim( localUtil.ntoc( Z13330LDESTipoFa, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13331LDESFechaE", localUtil.dtoc( Z13331LDESFechaE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13332LDESEstado", GXutil.ltrim( localUtil.ntoc( Z13332LDESEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1005GrabCod", GXutil.ltrim( localUtil.ntoc( Z1005GrabCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
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
      return formatLink("app.tldes99", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TLDES99" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Definicion todas las TABLAS", "") ;
   }

   public void initializeNonKey1NU1823( )
   {
      A13387LDESTipoDs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13387LDESTipoDs", A13387LDESTipoDs);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A1005GrabCod = (short)(0) ;
      n1005GrabCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1005GrabCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1005GrabCod), 4, 0));
      A1006GrabNom = "" ;
      n1006GrabNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1006GrabNom", A1006GrabNom);
      A13325LDESDibCli = "" ;
      n13325LDESDibCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13325LDESDibCli", A13325LDESDibCli);
      A13326LDESDibInt = 0 ;
      n13326LDESDibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13326LDESDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13326LDESDibInt), 8, 0));
      A13327LDESArtcod = "" ;
      n13327LDESArtcod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13327LDESArtcod", A13327LDESArtcod);
      A13328LDESArtDsc = "" ;
      n13328LDESArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13328LDESArtDsc", A13328LDESArtDsc);
      A13329LDESRefGra = "" ;
      n13329LDESRefGra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13329LDESRefGra", A13329LDESRefGra);
      A13330LDESTipoFa = (byte)(0) ;
      n13330LDESTipoFa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13330LDESTipoFa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13330LDESTipoFa), 2, 0));
      A13331LDESFechaE = GXutil.nullDate() ;
      n13331LDESFechaE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13331LDESFechaE", localUtil.format(A13331LDESFechaE, "99/99/99"));
      A13332LDESEstado = (byte)(0) ;
      n13332LDESEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13332LDESEstado", GXutil.str( A13332LDESEstado, 1, 0));
      Z13325LDESDibCli = "" ;
      Z13326LDESDibInt = 0 ;
      Z13327LDESArtcod = "" ;
      Z13328LDESArtDsc = "" ;
      Z13329LDESRefGra = "" ;
      Z13330LDESTipoFa = (byte)(0) ;
      Z13331LDESFechaE = GXutil.nullDate() ;
      Z13332LDESEstado = (byte)(0) ;
      Z252CliCod = 0 ;
      Z1005GrabCod = (short)(0) ;
   }

   public void initAll1NU1823( )
   {
      A13324LDESID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
      initializeNonKey1NU1823( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1NU1824( )
   {
      A13334LDESDPeque = "" ;
      n13334LDESDPeque = false ;
      A13335LDESMedida = "" ;
      n13335LDESMedida = false ;
      A13336LDESMalla = "" ;
      n13336LDESMalla = false ;
      A13347LDESCob = DecimalUtil.ZERO ;
      n13347LDESCob = false ;
      Z13334LDESDPeque = "" ;
      Z13335LDESMedida = "" ;
      Z13336LDESMalla = "" ;
      Z13347LDESCob = DecimalUtil.ZERO ;
   }

   public void initAll1NU1824( )
   {
      A13333LDESNPeque = "" ;
      initializeNonKey1NU1824( ) ;
   }

   public void standaloneModalInsert1NU1824( )
   {
   }

   public void initializeNonKey1NU1825( )
   {
      A13338LDESComdD = "" ;
      n13338LDESComdD = false ;
      A13345LDESUltLP = (short)(0) ;
      n13345LDESUltLP = false ;
      A13346LDESUltP = (short)(0) ;
      n13346LDESUltP = false ;
      A13384LDESFecEnv = GXutil.nullDate() ;
      n13384LDESFecEnv = false ;
      A13385LDESFecRep = GXutil.nullDate() ;
      n13385LDESFecRep = false ;
      A13386LDESEstCb = (byte)(0) ;
      n13386LDESEstCb = false ;
      Z13338LDESComdD = "" ;
      Z13345LDESUltLP = (short)(0) ;
      Z13346LDESUltP = (short)(0) ;
      Z13384LDESFecEnv = GXutil.nullDate() ;
      Z13385LDESFecRep = GXutil.nullDate() ;
      Z13386LDESEstCb = (byte)(0) ;
   }

   public void initAll1NU1825( )
   {
      A13337LDESComb = "" ;
      A13339LDESFondo = "" ;
      initializeNonKey1NU1825( ) ;
   }

   public void standaloneModalInsert1NU1825( )
   {
   }

   public void initializeNonKey1NU1827( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A718PrdNom = "" ;
      A13343LDESCant = DecimalUtil.ZERO ;
      n13343LDESCant = false ;
      A13344LDESUnd = "" ;
      n13344LDESUnd = false ;
      Z13343LDESCant = DecimalUtil.ZERO ;
      Z13344LDESUnd = "" ;
      Z719PrdNum = "" ;
   }

   public void initAll1NU1827( )
   {
      A13342LDESLinea = (short)(0) ;
      initializeNonKey1NU1827( ) ;
   }

   public void standaloneModalInsert1NU1827( )
   {
   }

   public void initializeNonKey1NU1826( )
   {
      A2107PasCod = "" ;
      n2107PasCod = false ;
      A2108PasDsc = "" ;
      n2108PasDsc = false ;
      A13341LDESCantP = DecimalUtil.ZERO ;
      n13341LDESCantP = false ;
      Z13341LDESCantP = DecimalUtil.ZERO ;
      Z2107PasCod = "" ;
   }

   public void initAll1NU1826( )
   {
      A13340LDESLinP = (short)(0) ;
      initializeNonKey1NU1826( ) ;
   }

   public void standaloneModalInsert1NU1826( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415103345", true, true);
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
      httpContext.AddJavascriptSource("tldes99.js", "?202682415103345", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1824( )
   {
      edtLDESNPeque_Enabled = defedtLDESNPeque_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESNPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESNPeque_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void init_level_properties1825( )
   {
      edtLDESFondo_Enabled = defedtLDESFondo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_132_Refreshing);
      edtLDESComb_Enabled = defedtLDESComb_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_132_Refreshing);
   }

   public void init_level_properties1827( )
   {
      edtLDESLinea_Enabled = defedtLDESLinea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinea_Enabled), 5, 0), !bGXsfl_179_Refreshing);
   }

   public void init_level_properties1826( )
   {
      edtLDESLinP_Enabled = defedtLDESLinP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESLinP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESLinP_Enabled), 5, 0), !bGXsfl_189_Refreshing);
   }

   public void startgridcontrol100( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock17_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13333LDESNPeque));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESNPeque_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13334LDESDPeque));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESDPeque_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13335LDESMedida));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESMedida_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13336LDESMalla));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESMalla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock21_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13347LDESCob, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCob_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol132( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock22_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A13337LDESComb));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock11_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A13338LDESComdD));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComdD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock24_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A13339LDESFondo));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFondo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock25_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltLP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock26_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock27_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A13384LDESFecEnv, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFecEnv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock28_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", localUtil.format(A13385LDESFecRep, "99/99/99"));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFecRep_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock29_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13386LDESEstCb, (byte)(1), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESEstCb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol179( )
   {
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("Header", subGrid3_Header);
      Grid3Container.AddObjectProperty("Class", "");
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("CmpContext", "");
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1827, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1827_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13342LDESLinea, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13343LDESCant, (byte)(10), (byte)(3), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A13344LDESUnd));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol189( )
   {
      Grid4Container.AddObjectProperty("GridName", "Grid4");
      Grid4Container.AddObjectProperty("Header", subGrid4_Header);
      Grid4Container.AddObjectProperty("Class", "");
      Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("CmpContext", "");
      Grid4Container.AddObjectProperty("InMasterPage", "false");
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1826, (byte)(4), (byte)(0), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1826_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13340LDESLinP, (byte)(4), (byte)(0), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESLinP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.rtrim( A2107PasCod));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.rtrim( A2108PasDsc));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13341LDESCantP, (byte)(10), (byte)(3), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESCantP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtGrabCod_Internalname = "GRABCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtGrabNom_Internalname = "GRABNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtLDESDibCli_Internalname = "LDESDIBCLI" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtLDESDibInt_Internalname = "LDESDIBINT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtLDESArtcod_Internalname = "LDESARTCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtLDESArtDsc_Internalname = "LDESARTDSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtLDESRefGra_Internalname = "LDESREFGRA" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtLDESTipoFa_Internalname = "LDESTIPOFA" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtLDESTipoDs_Internalname = "LDESTIPODS" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtLDESFechaE_Internalname = "LDESFECHAE" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtLDESEstado_Internalname = "LDESESTADO" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtLDESNPeque_Internalname = "LDESNPEQUE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtLDESDPeque_Internalname = "LDESDPEQUE" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtLDESMedida_Internalname = "LDESMEDIDA" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtLDESMalla_Internalname = "LDESMALLA" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtLDESCob_Internalname = "LDESCOB" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtLDESComb_Internalname = "LDESCOMB" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtLDESComdD_Internalname = "LDESCOMDD" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtLDESFondo_Internalname = "LDESFONDO" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtLDESUltLP_Internalname = "LDESULTLP" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtLDESUltP_Internalname = "LDESULTP" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtLDESFecEnv_Internalname = "LDESFECENV" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtLDESFecRep_Internalname = "LDESFECREP" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtLDESEstCb_Internalname = "LDESESTCB" ;
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
      tblTable4_Internalname = "TABLE4" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid2_Internalname = "GRID2" ;
      subGrid1_Internalname = "GRID1" ;
      subGrid3_Internalname = "GRID3" ;
      subGrid4_Internalname = "GRID4" ;
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
      subGrid4_Allowcollapsing = (byte)(0) ;
      subGrid4_Allowselection = (byte)(0) ;
      subGrid4_Header = "" ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      subGrid3_Allowselection = (byte)(0) ;
      subGrid3_Header = "" ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      lblTextblock29_Caption = httpContext.getMessage( "Estado Combinacion", "") ;
      lblTextblock28_Caption = httpContext.getMessage( "Fecha Recepcion", "") ;
      lblTextblock27_Caption = httpContext.getMessage( "Fecha Envio", "") ;
      lblTextblock26_Caption = httpContext.getMessage( "Ultima linea Pastas", "") ;
      lblTextblock25_Caption = httpContext.getMessage( "Ultima Linea Productos", "") ;
      lblTextblock24_Caption = httpContext.getMessage( "Fondo", "") ;
      lblTextblock11_Caption = httpContext.getMessage( "Descripcion", "") ;
      lblTextblock22_Caption = httpContext.getMessage( "Combinacion", "") ;
      subGrid2_Borderwidth = (short)(1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock21_Caption = httpContext.getMessage( "Cobertura", "") ;
      lblTextblock20_Caption = httpContext.getMessage( "Malla", "") ;
      lblTextblock19_Caption = httpContext.getMessage( "Medidas del Peque", "") ;
      lblTextblock18_Caption = httpContext.getMessage( "Descripcion del Peque", "") ;
      lblTextblock17_Caption = httpContext.getMessage( "N Peque", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Definicion todas las TABLAS", "") );
      edtLDESCantP_Jsonclick = "" ;
      edtPasDsc_Jsonclick = "" ;
      edtPasCod_Jsonclick = "" ;
      edtLDESLinP_Jsonclick = "" ;
      edtavnRcdDeleted_1826_Jsonclick = "" ;
      subGrid4_Class = "" ;
      subGrid4_Backcolorstyle = (byte)(2) ;
      edtLDESUnd_Jsonclick = "" ;
      edtLDESCant_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtLDESLinea_Jsonclick = "" ;
      edtavnRcdDeleted_1827_Jsonclick = "" ;
      subGrid3_Class = "" ;
      subGrid3_Backcolorstyle = (byte)(2) ;
      edtLDESEstCb_Jsonclick = "" ;
      edtLDESFecRep_Jsonclick = "" ;
      edtLDESFecEnv_Jsonclick = "" ;
      edtLDESUltP_Jsonclick = "" ;
      edtLDESUltLP_Jsonclick = "" ;
      edtLDESFondo_Jsonclick = "" ;
      edtLDESComdD_Jsonclick = "" ;
      edtLDESComb_Jsonclick = "" ;
      subGrid2_Class = "FreeStyleGrid" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtLDESCob_Jsonclick = "" ;
      edtLDESMalla_Jsonclick = "" ;
      edtLDESMedida_Jsonclick = "" ;
      edtLDESDPeque_Jsonclick = "" ;
      edtLDESNPeque_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtLDESEstCb_Enabled = 1 ;
      edtLDESFecRep_Enabled = 1 ;
      edtLDESFecEnv_Enabled = 1 ;
      edtLDESUltP_Enabled = 1 ;
      edtLDESUltLP_Enabled = 1 ;
      edtLDESFondo_Enabled = 1 ;
      edtLDESComdD_Enabled = 1 ;
      edtLDESComb_Enabled = 1 ;
      edtLDESUnd_Enabled = 1 ;
      edtLDESCant_Enabled = 1 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtLDESLinea_Enabled = 1 ;
      edtLDESCantP_Enabled = 1 ;
      edtPasDsc_Enabled = 0 ;
      edtPasCod_Enabled = 1 ;
      edtLDESLinP_Enabled = 1 ;
      edtavnRcdDeleted_1826_Enabled = 1 ;
      edtavnRcdDeleted_1827_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtLDESCob_Enabled = 1 ;
      edtLDESMalla_Enabled = 1 ;
      edtLDESMedida_Enabled = 1 ;
      edtLDESDPeque_Enabled = 1 ;
      edtLDESNPeque_Enabled = 1 ;
      edtLDESEstado_Jsonclick = "" ;
      edtLDESEstado_Backcolor = (int)(0xFFFFFF) ;
      edtLDESEstado_Enabled = 1 ;
      edtLDESFechaE_Jsonclick = "" ;
      edtLDESFechaE_Backcolor = (int)(0xFFFFFF) ;
      edtLDESFechaE_Enabled = 1 ;
      edtLDESTipoDs_Jsonclick = "" ;
      edtLDESTipoDs_Backcolor = (int)(0xFFFFFF) ;
      edtLDESTipoDs_Enabled = 0 ;
      edtLDESTipoFa_Jsonclick = "" ;
      edtLDESTipoFa_Backcolor = (int)(0xFFFFFF) ;
      edtLDESTipoFa_Enabled = 1 ;
      edtLDESRefGra_Jsonclick = "" ;
      edtLDESRefGra_Backcolor = (int)(0xFFFFFF) ;
      edtLDESRefGra_Enabled = 1 ;
      edtLDESArtDsc_Jsonclick = "" ;
      edtLDESArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtLDESArtDsc_Enabled = 1 ;
      edtLDESArtcod_Jsonclick = "" ;
      edtLDESArtcod_Backcolor = (int)(0xFFFFFF) ;
      edtLDESArtcod_Enabled = 1 ;
      edtLDESDibInt_Jsonclick = "" ;
      edtLDESDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtLDESDibInt_Enabled = 1 ;
      edtLDESDibCli_Jsonclick = "" ;
      edtLDESDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtLDESDibCli_Enabled = 1 ;
      edtGrabNom_Jsonclick = "" ;
      edtGrabNom_Backcolor = (int)(0xFFFFFF) ;
      edtGrabNom_Enabled = 0 ;
      edtGrabCod_Jsonclick = "" ;
      edtGrabCod_Backcolor = (int)(0xFFFFFF) ;
      edtGrabCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtLDESID_Jsonclick = "" ;
      edtLDESID_Backcolor = (int)(0xFFFFFF) ;
      edtLDESID_Enabled = 1 ;
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

   public void gx1asaldestipods1NU1823( String A396EmprCod ,
                                        byte A13330LDESTipoFa )
   {
      GXt_char1 = A13387LDESTipoDs ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pdscgrpfam(remoteHandle, context).execute( A396EmprCod, A13330LDESTipoFa, GXv_char4) ;
      tldes99_impl.this.GXt_char1 = GXv_char4[0] ;
      A13387LDESTipoDs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13387LDESTipoDs", A13387LDESTipoDs);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13387LDESTipoDs))+"\"") ;
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
      subsflControlProps_1001824( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NU1824( ) ;
         standaloneModal1NU1824( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NU1824( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001824( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1321825( ) ;
      while ( nGXsfl_132_idx <= nRC_GXsfl_132 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NU1824( ) ;
         standaloneModal1NU1824( ) ;
         standaloneNotModal1NU1825( ) ;
         standaloneModal1NU1825( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NU1825( ) ;
         Grid2Row.AddGrid("Grid3", Grid3Container);
         Grid2Row.AddGrid("Grid4", Grid4Container);
         nGXsfl_132_idx = (int)(nGXsfl_132_idx+1) ;
         sGXsfl_132_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_132_idx), 4, 0), (short)(4), "0") + sGXsfl_100_idx ;
         subsflControlProps_1321825( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgrid3_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1791827( ) ;
      while ( nGXsfl_179_idx <= nRC_GXsfl_179 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NU1824( ) ;
         standaloneModal1NU1824( ) ;
         standaloneNotModal1NU1825( ) ;
         standaloneModal1NU1825( ) ;
         standaloneNotModal1NU1827( ) ;
         standaloneModal1NU1827( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NU1827( ) ;
         nGXsfl_179_idx = (int)(nGXsfl_179_idx+1) ;
         sGXsfl_179_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_179_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
         subsflControlProps_1791827( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid3Container)) ;
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid4_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1891826( ) ;
      while ( nGXsfl_189_idx <= nRC_GXsfl_189 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NU1824( ) ;
         standaloneModal1NU1824( ) ;
         standaloneNotModal1NU1825( ) ;
         standaloneModal1NU1825( ) ;
         standaloneNotModal1NU1826( ) ;
         standaloneModal1NU1826( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NU1826( ) ;
         nGXsfl_189_idx = (int)(nGXsfl_189_idx+1) ;
         sGXsfl_189_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_189_idx), 4, 0), (short)(4), "0") + sGXsfl_132_idx ;
         subsflControlProps_1891826( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid4Container)) ;
      /* End function gxnrGrid4_newrow */
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
      /* Using cursor T01NU59 */
      pr_default.execute(57, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(57) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NU59_A407EmprNom[0] ;
      n407EmprNom = T01NU59_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(57);
      GX_FocusControl = edtCliCod_Internalname ;
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

   public void valid_Ldesid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1005GrabCod", GXutil.ltrim( localUtil.ntoc( A1005GrabCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13325LDESDibCli", GXutil.rtrim( A13325LDESDibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A13326LDESDibInt", GXutil.ltrim( localUtil.ntoc( A13326LDESDibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13327LDESArtcod", GXutil.rtrim( A13327LDESArtcod));
      httpContext.ajax_rsp_assign_attri("", false, "A13328LDESArtDsc", GXutil.rtrim( A13328LDESArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13329LDESRefGra", GXutil.rtrim( A13329LDESRefGra));
      httpContext.ajax_rsp_assign_attri("", false, "A13330LDESTipoFa", GXutil.ltrim( localUtil.ntoc( A13330LDESTipoFa, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13331LDESFechaE", localUtil.format(A13331LDESFechaE, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13332LDESEstado", GXutil.ltrim( localUtil.ntoc( A13332LDESEstado, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1006GrabNom", GXutil.rtrim( A1006GrabNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13387LDESTipoDs", GXutil.rtrim( A13387LDESTipoDs));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13324LDESID", GXutil.ltrim( localUtil.ntoc( Z13324LDESID, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1005GrabCod", GXutil.ltrim( localUtil.ntoc( Z1005GrabCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13325LDESDibCli", GXutil.rtrim( Z13325LDESDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13326LDESDibInt", GXutil.ltrim( localUtil.ntoc( Z13326LDESDibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13327LDESArtcod", GXutil.rtrim( Z13327LDESArtcod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13328LDESArtDsc", GXutil.rtrim( Z13328LDESArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13329LDESRefGra", GXutil.rtrim( Z13329LDESRefGra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13330LDESTipoFa", GXutil.ltrim( localUtil.ntoc( Z13330LDESTipoFa, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13331LDESFechaE", localUtil.format(Z13331LDESFechaE, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13332LDESEstado", GXutil.ltrim( localUtil.ntoc( Z13332LDESEstado, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1006GrabNom", GXutil.rtrim( Z1006GrabNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13387LDESTipoDs", GXutil.rtrim( Z13387LDESTipoDs));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01NU26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01NU26_A279CliNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Grabcod( )
   {
      n1005GrabCod = false ;
      n1006GrabNom = false ;
      /* Using cursor T01NU27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n1005GrabCod), Short.valueOf(A1005GrabCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRABAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRABCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrabCod_Internalname ;
      }
      A1006GrabNom = T01NU27_A1006GrabNom[0] ;
      n1006GrabNom = T01NU27_n1006GrabNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1006GrabNom", GXutil.rtrim( A1006GrabNom));
   }

   public void valid_Ldestipofa( )
   {
      n13330LDESTipoFa = false ;
      GXt_char1 = A13387LDESTipoDs ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pdscgrpfam(remoteHandle, context).execute( A396EmprCod, A13330LDESTipoFa, GXv_char4) ;
      tldes99_impl.this.GXt_char1 = GXv_char4[0] ;
      A13387LDESTipoDs = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13387LDESTipoDs", GXutil.rtrim( A13387LDESTipoDs));
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01NU49 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(47) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01NU49_A718PrdNom[0] ;
      pr_default.close(47);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
   }

   public void valid_Pascod( )
   {
      n2107PasCod = false ;
      n2108PasDsc = false ;
      /* Using cursor T01NU57 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n2107PasCod), A2107PasCod});
      if ( (pr_default.getStatus(55) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPASTA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasCod_Internalname ;
      }
      A2108PasDsc = T01NU57_A2108PasDsc[0] ;
      n2108PasDsc = T01NU57_n2108PasDsc[0] ;
      pr_default.close(55);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_LDESID","{handler:'valid_Ldesid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13324LDESID',fld:'LDESID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LDESID",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1005GrabCod',fld:'GRABCOD',pic:'ZZZ9'},{av:'A13325LDESDibCli',fld:'LDESDIBCLI',pic:''},{av:'A13326LDESDibInt',fld:'LDESDIBINT',pic:'ZZZZZZZ9'},{av:'A13327LDESArtcod',fld:'LDESARTCOD',pic:''},{av:'A13328LDESArtDsc',fld:'LDESARTDSC',pic:''},{av:'A13329LDESRefGra',fld:'LDESREFGRA',pic:''},{av:'A13330LDESTipoFa',fld:'LDESTIPOFA',pic:'Z9'},{av:'A13331LDESFechaE',fld:'LDESFECHAE',pic:''},{av:'A13332LDESEstado',fld:'LDESESTADO',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1006GrabNom',fld:'GRABNOM',pic:''},{av:'A13387LDESTipoDs',fld:'LDESTIPODS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13324LDESID'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z1005GrabCod'},{av:'Z13325LDESDibCli'},{av:'Z13326LDESDibInt'},{av:'Z13327LDESArtcod'},{av:'Z13328LDESArtDsc'},{av:'Z13329LDESRefGra'},{av:'Z13330LDESTipoFa'},{av:'Z13331LDESFechaE'},{av:'Z13332LDESEstado'},{av:'Z279CliNom'},{av:'Z1006GrabNom'},{av:'Z13387LDESTipoDs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_GRABCOD","{handler:'valid_Grabcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1005GrabCod',fld:'GRABCOD',pic:'ZZZ9'},{av:'A1006GrabNom',fld:'GRABNOM',pic:''}]");
      setEventMetadata("VALID_GRABCOD",",oparms:[{av:'A1006GrabNom',fld:'GRABNOM',pic:''}]}");
      setEventMetadata("VALID_LDESTIPOFA","{handler:'valid_Ldestipofa',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13330LDESTipoFa',fld:'LDESTIPOFA',pic:'Z9'},{av:'A13387LDESTipoDs',fld:'LDESTIPODS',pic:''}]");
      setEventMetadata("VALID_LDESTIPOFA",",oparms:[{av:'A13387LDESTipoDs',fld:'LDESTIPODS',pic:''}]}");
      setEventMetadata("VALID_LDESNPEQUE","{handler:'valid_Ldesnpeque',iparms:[]");
      setEventMetadata("VALID_LDESNPEQUE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ldescob',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_LDESCOMB","{handler:'valid_Ldescomb',iparms:[]");
      setEventMetadata("VALID_LDESCOMB",",oparms:[]}");
      setEventMetadata("VALID_LDESFONDO","{handler:'valid_Ldesfondo',iparms:[]");
      setEventMetadata("VALID_LDESFONDO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ldesestcb',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(55);
      pr_default.close(47);
      pr_default.close(24);
      pr_default.close(57);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13325LDESDibCli = "" ;
      Z13327LDESArtcod = "" ;
      Z13328LDESArtDsc = "" ;
      Z13329LDESRefGra = "" ;
      Z13331LDESFechaE = GXutil.nullDate() ;
      Z13333LDESNPeque = "" ;
      Z13334LDESDPeque = "" ;
      Z13335LDESMedida = "" ;
      Z13336LDESMalla = "" ;
      Z13347LDESCob = DecimalUtil.ZERO ;
      Z13337LDESComb = "" ;
      Z13339LDESFondo = "" ;
      Z13338LDESComdD = "" ;
      Z13384LDESFecEnv = GXutil.nullDate() ;
      Z13385LDESFecRep = GXutil.nullDate() ;
      Z13343LDESCant = DecimalUtil.ZERO ;
      Z13344LDESUnd = "" ;
      Z719PrdNum = "" ;
      Z13341LDESCantP = DecimalUtil.ZERO ;
      Z2107PasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A2107PasCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1006GrabNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A13325LDESDibCli = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A13327LDESArtcod = "" ;
      lblTextblock11_Jsonclick = "" ;
      A13328LDESArtDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      A13329LDESRefGra = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A13387LDESTipoDs = "" ;
      lblTextblock15_Jsonclick = "" ;
      A13331LDESFechaE = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1824 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV35Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1823 = "" ;
      GXCCtl = "" ;
      A2108PasDsc = "" ;
      A13341LDESCantP = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A13343LDESCant = DecimalUtil.ZERO ;
      A13344LDESUnd = "" ;
      sMode1825 = "" ;
      A13337LDESComb = "" ;
      A13338LDESComdD = "" ;
      A13339LDESFondo = "" ;
      A13384LDESFecEnv = GXutil.nullDate() ;
      A13385LDESFecRep = GXutil.nullDate() ;
      A13333LDESNPeque = "" ;
      A13334LDESDPeque = "" ;
      A13335LDESMedida = "" ;
      A13336LDESMalla = "" ;
      A13347LDESCob = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z1006GrabNom = "" ;
      T01NU14_A407EmprNom = new String[] {""} ;
      T01NU14_n407EmprNom = new boolean[] {false} ;
      T01NU17_A13324LDESID = new int[1] ;
      T01NU17_A407EmprNom = new String[] {""} ;
      T01NU17_n407EmprNom = new boolean[] {false} ;
      T01NU17_A279CliNom = new String[] {""} ;
      T01NU17_A1006GrabNom = new String[] {""} ;
      T01NU17_n1006GrabNom = new boolean[] {false} ;
      T01NU17_A13325LDESDibCli = new String[] {""} ;
      T01NU17_n13325LDESDibCli = new boolean[] {false} ;
      T01NU17_A13326LDESDibInt = new int[1] ;
      T01NU17_n13326LDESDibInt = new boolean[] {false} ;
      T01NU17_A13327LDESArtcod = new String[] {""} ;
      T01NU17_n13327LDESArtcod = new boolean[] {false} ;
      T01NU17_A13328LDESArtDsc = new String[] {""} ;
      T01NU17_n13328LDESArtDsc = new boolean[] {false} ;
      T01NU17_A13329LDESRefGra = new String[] {""} ;
      T01NU17_n13329LDESRefGra = new boolean[] {false} ;
      T01NU17_A13330LDESTipoFa = new byte[1] ;
      T01NU17_n13330LDESTipoFa = new boolean[] {false} ;
      T01NU17_A13331LDESFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU17_n13331LDESFechaE = new boolean[] {false} ;
      T01NU17_A13332LDESEstado = new byte[1] ;
      T01NU17_n13332LDESEstado = new boolean[] {false} ;
      T01NU17_A396EmprCod = new String[] {""} ;
      T01NU17_A252CliCod = new int[1] ;
      T01NU17_n252CliCod = new boolean[] {false} ;
      T01NU17_A1005GrabCod = new short[1] ;
      T01NU17_n1005GrabCod = new boolean[] {false} ;
      T01NU15_A279CliNom = new String[] {""} ;
      T01NU16_A1006GrabNom = new String[] {""} ;
      T01NU16_n1006GrabNom = new boolean[] {false} ;
      T01NU18_A279CliNom = new String[] {""} ;
      T01NU19_A1006GrabNom = new String[] {""} ;
      T01NU19_n1006GrabNom = new boolean[] {false} ;
      T01NU20_A396EmprCod = new String[] {""} ;
      T01NU20_A13324LDESID = new int[1] ;
      T01NU13_A13324LDESID = new int[1] ;
      T01NU13_A13325LDESDibCli = new String[] {""} ;
      T01NU13_n13325LDESDibCli = new boolean[] {false} ;
      T01NU13_A13326LDESDibInt = new int[1] ;
      T01NU13_n13326LDESDibInt = new boolean[] {false} ;
      T01NU13_A13327LDESArtcod = new String[] {""} ;
      T01NU13_n13327LDESArtcod = new boolean[] {false} ;
      T01NU13_A13328LDESArtDsc = new String[] {""} ;
      T01NU13_n13328LDESArtDsc = new boolean[] {false} ;
      T01NU13_A13329LDESRefGra = new String[] {""} ;
      T01NU13_n13329LDESRefGra = new boolean[] {false} ;
      T01NU13_A13330LDESTipoFa = new byte[1] ;
      T01NU13_n13330LDESTipoFa = new boolean[] {false} ;
      T01NU13_A13331LDESFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU13_n13331LDESFechaE = new boolean[] {false} ;
      T01NU13_A13332LDESEstado = new byte[1] ;
      T01NU13_n13332LDESEstado = new boolean[] {false} ;
      T01NU13_A396EmprCod = new String[] {""} ;
      T01NU13_A252CliCod = new int[1] ;
      T01NU13_n252CliCod = new boolean[] {false} ;
      T01NU13_A1005GrabCod = new short[1] ;
      T01NU13_n1005GrabCod = new boolean[] {false} ;
      T01NU21_A396EmprCod = new String[] {""} ;
      T01NU21_A13324LDESID = new int[1] ;
      T01NU22_A396EmprCod = new String[] {""} ;
      T01NU22_A13324LDESID = new int[1] ;
      T01NU12_A13324LDESID = new int[1] ;
      T01NU12_A13325LDESDibCli = new String[] {""} ;
      T01NU12_n13325LDESDibCli = new boolean[] {false} ;
      T01NU12_A13326LDESDibInt = new int[1] ;
      T01NU12_n13326LDESDibInt = new boolean[] {false} ;
      T01NU12_A13327LDESArtcod = new String[] {""} ;
      T01NU12_n13327LDESArtcod = new boolean[] {false} ;
      T01NU12_A13328LDESArtDsc = new String[] {""} ;
      T01NU12_n13328LDESArtDsc = new boolean[] {false} ;
      T01NU12_A13329LDESRefGra = new String[] {""} ;
      T01NU12_n13329LDESRefGra = new boolean[] {false} ;
      T01NU12_A13330LDESTipoFa = new byte[1] ;
      T01NU12_n13330LDESTipoFa = new boolean[] {false} ;
      T01NU12_A13331LDESFechaE = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU12_n13331LDESFechaE = new boolean[] {false} ;
      T01NU12_A13332LDESEstado = new byte[1] ;
      T01NU12_n13332LDESEstado = new boolean[] {false} ;
      T01NU12_A396EmprCod = new String[] {""} ;
      T01NU12_A252CliCod = new int[1] ;
      T01NU12_n252CliCod = new boolean[] {false} ;
      T01NU12_A1005GrabCod = new short[1] ;
      T01NU12_n1005GrabCod = new boolean[] {false} ;
      T01NU26_A279CliNom = new String[] {""} ;
      T01NU27_A1006GrabNom = new String[] {""} ;
      T01NU27_n1006GrabNom = new boolean[] {false} ;
      T01NU28_A396EmprCod = new String[] {""} ;
      T01NU28_A13324LDESID = new int[1] ;
      T01NU28_A13333LDESNPeque = new String[] {""} ;
      T01NU29_A396EmprCod = new String[] {""} ;
      T01NU29_A13324LDESID = new int[1] ;
      T01NU30_A13324LDESID = new int[1] ;
      T01NU30_A13333LDESNPeque = new String[] {""} ;
      T01NU30_A13334LDESDPeque = new String[] {""} ;
      T01NU30_n13334LDESDPeque = new boolean[] {false} ;
      T01NU30_A13335LDESMedida = new String[] {""} ;
      T01NU30_n13335LDESMedida = new boolean[] {false} ;
      T01NU30_A13336LDESMalla = new String[] {""} ;
      T01NU30_n13336LDESMalla = new boolean[] {false} ;
      T01NU30_A13347LDESCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU30_n13347LDESCob = new boolean[] {false} ;
      T01NU30_A396EmprCod = new String[] {""} ;
      T01NU31_A396EmprCod = new String[] {""} ;
      T01NU31_A13324LDESID = new int[1] ;
      T01NU31_A13333LDESNPeque = new String[] {""} ;
      T01NU11_A13324LDESID = new int[1] ;
      T01NU11_A13333LDESNPeque = new String[] {""} ;
      T01NU11_A13334LDESDPeque = new String[] {""} ;
      T01NU11_n13334LDESDPeque = new boolean[] {false} ;
      T01NU11_A13335LDESMedida = new String[] {""} ;
      T01NU11_n13335LDESMedida = new boolean[] {false} ;
      T01NU11_A13336LDESMalla = new String[] {""} ;
      T01NU11_n13336LDESMalla = new boolean[] {false} ;
      T01NU11_A13347LDESCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU11_n13347LDESCob = new boolean[] {false} ;
      T01NU11_A396EmprCod = new String[] {""} ;
      T01NU10_A13324LDESID = new int[1] ;
      T01NU10_A13333LDESNPeque = new String[] {""} ;
      T01NU10_A13334LDESDPeque = new String[] {""} ;
      T01NU10_n13334LDESDPeque = new boolean[] {false} ;
      T01NU10_A13335LDESMedida = new String[] {""} ;
      T01NU10_n13335LDESMedida = new boolean[] {false} ;
      T01NU10_A13336LDESMalla = new String[] {""} ;
      T01NU10_n13336LDESMalla = new boolean[] {false} ;
      T01NU10_A13347LDESCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU10_n13347LDESCob = new boolean[] {false} ;
      T01NU10_A396EmprCod = new String[] {""} ;
      T01NU35_A396EmprCod = new String[] {""} ;
      T01NU35_A13324LDESID = new int[1] ;
      T01NU35_A13333LDESNPeque = new String[] {""} ;
      T01NU35_A13337LDESComb = new String[] {""} ;
      T01NU35_A13339LDESFondo = new String[] {""} ;
      T01NU36_A396EmprCod = new String[] {""} ;
      T01NU36_A13324LDESID = new int[1] ;
      T01NU36_A13333LDESNPeque = new String[] {""} ;
      T01NU37_A13324LDESID = new int[1] ;
      T01NU37_A13333LDESNPeque = new String[] {""} ;
      T01NU37_A13337LDESComb = new String[] {""} ;
      T01NU37_A13339LDESFondo = new String[] {""} ;
      T01NU37_A13338LDESComdD = new String[] {""} ;
      T01NU37_n13338LDESComdD = new boolean[] {false} ;
      T01NU37_A13345LDESUltLP = new short[1] ;
      T01NU37_n13345LDESUltLP = new boolean[] {false} ;
      T01NU37_A13346LDESUltP = new short[1] ;
      T01NU37_n13346LDESUltP = new boolean[] {false} ;
      T01NU37_A13384LDESFecEnv = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU37_n13384LDESFecEnv = new boolean[] {false} ;
      T01NU37_A13385LDESFecRep = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU37_n13385LDESFecRep = new boolean[] {false} ;
      T01NU37_A13386LDESEstCb = new byte[1] ;
      T01NU37_n13386LDESEstCb = new boolean[] {false} ;
      T01NU37_A396EmprCod = new String[] {""} ;
      T01NU38_A396EmprCod = new String[] {""} ;
      T01NU38_A13324LDESID = new int[1] ;
      T01NU38_A13333LDESNPeque = new String[] {""} ;
      T01NU38_A13337LDESComb = new String[] {""} ;
      T01NU38_A13339LDESFondo = new String[] {""} ;
      T01NU9_A13324LDESID = new int[1] ;
      T01NU9_A13333LDESNPeque = new String[] {""} ;
      T01NU9_A13337LDESComb = new String[] {""} ;
      T01NU9_A13339LDESFondo = new String[] {""} ;
      T01NU9_A13338LDESComdD = new String[] {""} ;
      T01NU9_n13338LDESComdD = new boolean[] {false} ;
      T01NU9_A13345LDESUltLP = new short[1] ;
      T01NU9_n13345LDESUltLP = new boolean[] {false} ;
      T01NU9_A13346LDESUltP = new short[1] ;
      T01NU9_n13346LDESUltP = new boolean[] {false} ;
      T01NU9_A13384LDESFecEnv = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU9_n13384LDESFecEnv = new boolean[] {false} ;
      T01NU9_A13385LDESFecRep = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU9_n13385LDESFecRep = new boolean[] {false} ;
      T01NU9_A13386LDESEstCb = new byte[1] ;
      T01NU9_n13386LDESEstCb = new boolean[] {false} ;
      T01NU9_A396EmprCod = new String[] {""} ;
      T01NU8_A13324LDESID = new int[1] ;
      T01NU8_A13333LDESNPeque = new String[] {""} ;
      T01NU8_A13337LDESComb = new String[] {""} ;
      T01NU8_A13339LDESFondo = new String[] {""} ;
      T01NU8_A13338LDESComdD = new String[] {""} ;
      T01NU8_n13338LDESComdD = new boolean[] {false} ;
      T01NU8_A13345LDESUltLP = new short[1] ;
      T01NU8_n13345LDESUltLP = new boolean[] {false} ;
      T01NU8_A13346LDESUltP = new short[1] ;
      T01NU8_n13346LDESUltP = new boolean[] {false} ;
      T01NU8_A13384LDESFecEnv = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU8_n13384LDESFecEnv = new boolean[] {false} ;
      T01NU8_A13385LDESFecRep = new java.util.Date[] {GXutil.nullDate()} ;
      T01NU8_n13385LDESFecRep = new boolean[] {false} ;
      T01NU8_A13386LDESEstCb = new byte[1] ;
      T01NU8_n13386LDESEstCb = new boolean[] {false} ;
      T01NU8_A396EmprCod = new String[] {""} ;
      T01NU42_A396EmprCod = new String[] {""} ;
      T01NU42_A13324LDESID = new int[1] ;
      T01NU42_A13333LDESNPeque = new String[] {""} ;
      T01NU42_A13337LDESComb = new String[] {""} ;
      T01NU42_A13339LDESFondo = new String[] {""} ;
      Z718PrdNom = "" ;
      T01NU43_A13324LDESID = new int[1] ;
      T01NU43_A13333LDESNPeque = new String[] {""} ;
      T01NU43_A13337LDESComb = new String[] {""} ;
      T01NU43_A13339LDESFondo = new String[] {""} ;
      T01NU43_A13342LDESLinea = new short[1] ;
      T01NU43_A718PrdNom = new String[] {""} ;
      T01NU43_A13343LDESCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU43_n13343LDESCant = new boolean[] {false} ;
      T01NU43_A13344LDESUnd = new String[] {""} ;
      T01NU43_n13344LDESUnd = new boolean[] {false} ;
      T01NU43_A396EmprCod = new String[] {""} ;
      T01NU43_A719PrdNum = new String[] {""} ;
      T01NU43_n719PrdNum = new boolean[] {false} ;
      T01NU7_A718PrdNom = new String[] {""} ;
      T01NU44_A718PrdNom = new String[] {""} ;
      T01NU45_A396EmprCod = new String[] {""} ;
      T01NU45_A13324LDESID = new int[1] ;
      T01NU45_A13333LDESNPeque = new String[] {""} ;
      T01NU45_A13337LDESComb = new String[] {""} ;
      T01NU45_A13339LDESFondo = new String[] {""} ;
      T01NU45_A13342LDESLinea = new short[1] ;
      T01NU6_A13324LDESID = new int[1] ;
      T01NU6_A13333LDESNPeque = new String[] {""} ;
      T01NU6_A13337LDESComb = new String[] {""} ;
      T01NU6_A13339LDESFondo = new String[] {""} ;
      T01NU6_A13342LDESLinea = new short[1] ;
      T01NU6_A13343LDESCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU6_n13343LDESCant = new boolean[] {false} ;
      T01NU6_A13344LDESUnd = new String[] {""} ;
      T01NU6_n13344LDESUnd = new boolean[] {false} ;
      T01NU6_A396EmprCod = new String[] {""} ;
      T01NU6_A719PrdNum = new String[] {""} ;
      T01NU6_n719PrdNum = new boolean[] {false} ;
      sMode1827 = "" ;
      T01NU5_A13324LDESID = new int[1] ;
      T01NU5_A13333LDESNPeque = new String[] {""} ;
      T01NU5_A13337LDESComb = new String[] {""} ;
      T01NU5_A13339LDESFondo = new String[] {""} ;
      T01NU5_A13342LDESLinea = new short[1] ;
      T01NU5_A13343LDESCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU5_n13343LDESCant = new boolean[] {false} ;
      T01NU5_A13344LDESUnd = new String[] {""} ;
      T01NU5_n13344LDESUnd = new boolean[] {false} ;
      T01NU5_A396EmprCod = new String[] {""} ;
      T01NU5_A719PrdNum = new String[] {""} ;
      T01NU5_n719PrdNum = new boolean[] {false} ;
      T01NU49_A718PrdNom = new String[] {""} ;
      T01NU50_A396EmprCod = new String[] {""} ;
      T01NU50_A13324LDESID = new int[1] ;
      T01NU50_A13333LDESNPeque = new String[] {""} ;
      T01NU50_A13337LDESComb = new String[] {""} ;
      T01NU50_A13339LDESFondo = new String[] {""} ;
      T01NU50_A13342LDESLinea = new short[1] ;
      Z2108PasDsc = "" ;
      T01NU51_A13324LDESID = new int[1] ;
      T01NU51_A13333LDESNPeque = new String[] {""} ;
      T01NU51_A13337LDESComb = new String[] {""} ;
      T01NU51_A13339LDESFondo = new String[] {""} ;
      T01NU51_A13340LDESLinP = new short[1] ;
      T01NU51_A2108PasDsc = new String[] {""} ;
      T01NU51_n2108PasDsc = new boolean[] {false} ;
      T01NU51_A13341LDESCantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU51_n13341LDESCantP = new boolean[] {false} ;
      T01NU51_A396EmprCod = new String[] {""} ;
      T01NU51_A2107PasCod = new String[] {""} ;
      T01NU51_n2107PasCod = new boolean[] {false} ;
      T01NU4_A2108PasDsc = new String[] {""} ;
      T01NU4_n2108PasDsc = new boolean[] {false} ;
      T01NU52_A2108PasDsc = new String[] {""} ;
      T01NU52_n2108PasDsc = new boolean[] {false} ;
      T01NU53_A396EmprCod = new String[] {""} ;
      T01NU53_A13324LDESID = new int[1] ;
      T01NU53_A13333LDESNPeque = new String[] {""} ;
      T01NU53_A13337LDESComb = new String[] {""} ;
      T01NU53_A13339LDESFondo = new String[] {""} ;
      T01NU53_A13340LDESLinP = new short[1] ;
      T01NU3_A13324LDESID = new int[1] ;
      T01NU3_A13333LDESNPeque = new String[] {""} ;
      T01NU3_A13337LDESComb = new String[] {""} ;
      T01NU3_A13339LDESFondo = new String[] {""} ;
      T01NU3_A13340LDESLinP = new short[1] ;
      T01NU3_A13341LDESCantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU3_n13341LDESCantP = new boolean[] {false} ;
      T01NU3_A396EmprCod = new String[] {""} ;
      T01NU3_A2107PasCod = new String[] {""} ;
      T01NU3_n2107PasCod = new boolean[] {false} ;
      sMode1826 = "" ;
      T01NU2_A13324LDESID = new int[1] ;
      T01NU2_A13333LDESNPeque = new String[] {""} ;
      T01NU2_A13337LDESComb = new String[] {""} ;
      T01NU2_A13339LDESFondo = new String[] {""} ;
      T01NU2_A13340LDESLinP = new short[1] ;
      T01NU2_A13341LDESCantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NU2_n13341LDESCantP = new boolean[] {false} ;
      T01NU2_A396EmprCod = new String[] {""} ;
      T01NU2_A2107PasCod = new String[] {""} ;
      T01NU2_n2107PasCod = new boolean[] {false} ;
      T01NU57_A2108PasDsc = new String[] {""} ;
      T01NU57_n2108PasDsc = new boolean[] {false} ;
      T01NU58_A396EmprCod = new String[] {""} ;
      T01NU58_A13324LDESID = new int[1] ;
      T01NU58_A13333LDESNPeque = new String[] {""} ;
      T01NU58_A13337LDESComb = new String[] {""} ;
      T01NU58_A13339LDESFondo = new String[] {""} ;
      T01NU58_A13340LDESLinP = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock17_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      subGrid4_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      subGrid2_Header = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      T01NU59_A407EmprNom = new String[] {""} ;
      T01NU59_n407EmprNom = new boolean[] {false} ;
      Z13387LDESTipoDs = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ13325LDESDibCli = "" ;
      ZZ13327LDESArtcod = "" ;
      ZZ13328LDESArtDsc = "" ;
      ZZ13329LDESRefGra = "" ;
      ZZ13331LDESFechaE = GXutil.nullDate() ;
      ZZ279CliNom = "" ;
      ZZ1006GrabNom = "" ;
      ZZ13387LDESTipoDs = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tldes99__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tldes99__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tldes99__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tldes99__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tldes99__default(),
         new Object[] {
             new Object[] {
            T01NU2_A13324LDESID, T01NU2_A13333LDESNPeque, T01NU2_A13337LDESComb, T01NU2_A13339LDESFondo, T01NU2_A13340LDESLinP, T01NU2_A13341LDESCantP, T01NU2_n13341LDESCantP, T01NU2_A396EmprCod, T01NU2_A2107PasCod, T01NU2_n2107PasCod
            }
            , new Object[] {
            T01NU3_A13324LDESID, T01NU3_A13333LDESNPeque, T01NU3_A13337LDESComb, T01NU3_A13339LDESFondo, T01NU3_A13340LDESLinP, T01NU3_A13341LDESCantP, T01NU3_n13341LDESCantP, T01NU3_A396EmprCod, T01NU3_A2107PasCod, T01NU3_n2107PasCod
            }
            , new Object[] {
            T01NU4_A2108PasDsc, T01NU4_n2108PasDsc
            }
            , new Object[] {
            T01NU5_A13324LDESID, T01NU5_A13333LDESNPeque, T01NU5_A13337LDESComb, T01NU5_A13339LDESFondo, T01NU5_A13342LDESLinea, T01NU5_A13343LDESCant, T01NU5_n13343LDESCant, T01NU5_A13344LDESUnd, T01NU5_n13344LDESUnd, T01NU5_A396EmprCod,
            T01NU5_A719PrdNum, T01NU5_n719PrdNum
            }
            , new Object[] {
            T01NU6_A13324LDESID, T01NU6_A13333LDESNPeque, T01NU6_A13337LDESComb, T01NU6_A13339LDESFondo, T01NU6_A13342LDESLinea, T01NU6_A13343LDESCant, T01NU6_n13343LDESCant, T01NU6_A13344LDESUnd, T01NU6_n13344LDESUnd, T01NU6_A396EmprCod,
            T01NU6_A719PrdNum, T01NU6_n719PrdNum
            }
            , new Object[] {
            T01NU7_A718PrdNom
            }
            , new Object[] {
            T01NU8_A13324LDESID, T01NU8_A13333LDESNPeque, T01NU8_A13337LDESComb, T01NU8_A13339LDESFondo, T01NU8_A13338LDESComdD, T01NU8_n13338LDESComdD, T01NU8_A13345LDESUltLP, T01NU8_n13345LDESUltLP, T01NU8_A13346LDESUltP, T01NU8_n13346LDESUltP,
            T01NU8_A13384LDESFecEnv, T01NU8_n13384LDESFecEnv, T01NU8_A13385LDESFecRep, T01NU8_n13385LDESFecRep, T01NU8_A13386LDESEstCb, T01NU8_n13386LDESEstCb, T01NU8_A396EmprCod
            }
            , new Object[] {
            T01NU9_A13324LDESID, T01NU9_A13333LDESNPeque, T01NU9_A13337LDESComb, T01NU9_A13339LDESFondo, T01NU9_A13338LDESComdD, T01NU9_n13338LDESComdD, T01NU9_A13345LDESUltLP, T01NU9_n13345LDESUltLP, T01NU9_A13346LDESUltP, T01NU9_n13346LDESUltP,
            T01NU9_A13384LDESFecEnv, T01NU9_n13384LDESFecEnv, T01NU9_A13385LDESFecRep, T01NU9_n13385LDESFecRep, T01NU9_A13386LDESEstCb, T01NU9_n13386LDESEstCb, T01NU9_A396EmprCod
            }
            , new Object[] {
            T01NU10_A13324LDESID, T01NU10_A13333LDESNPeque, T01NU10_A13334LDESDPeque, T01NU10_n13334LDESDPeque, T01NU10_A13335LDESMedida, T01NU10_n13335LDESMedida, T01NU10_A13336LDESMalla, T01NU10_n13336LDESMalla, T01NU10_A13347LDESCob, T01NU10_n13347LDESCob,
            T01NU10_A396EmprCod
            }
            , new Object[] {
            T01NU11_A13324LDESID, T01NU11_A13333LDESNPeque, T01NU11_A13334LDESDPeque, T01NU11_n13334LDESDPeque, T01NU11_A13335LDESMedida, T01NU11_n13335LDESMedida, T01NU11_A13336LDESMalla, T01NU11_n13336LDESMalla, T01NU11_A13347LDESCob, T01NU11_n13347LDESCob,
            T01NU11_A396EmprCod
            }
            , new Object[] {
            T01NU12_A13324LDESID, T01NU12_A13325LDESDibCli, T01NU12_n13325LDESDibCli, T01NU12_A13326LDESDibInt, T01NU12_n13326LDESDibInt, T01NU12_A13327LDESArtcod, T01NU12_n13327LDESArtcod, T01NU12_A13328LDESArtDsc, T01NU12_n13328LDESArtDsc, T01NU12_A13329LDESRefGra,
            T01NU12_n13329LDESRefGra, T01NU12_A13330LDESTipoFa, T01NU12_n13330LDESTipoFa, T01NU12_A13331LDESFechaE, T01NU12_n13331LDESFechaE, T01NU12_A13332LDESEstado, T01NU12_n13332LDESEstado, T01NU12_A396EmprCod, T01NU12_A252CliCod, T01NU12_n252CliCod,
            T01NU12_A1005GrabCod, T01NU12_n1005GrabCod
            }
            , new Object[] {
            T01NU13_A13324LDESID, T01NU13_A13325LDESDibCli, T01NU13_n13325LDESDibCli, T01NU13_A13326LDESDibInt, T01NU13_n13326LDESDibInt, T01NU13_A13327LDESArtcod, T01NU13_n13327LDESArtcod, T01NU13_A13328LDESArtDsc, T01NU13_n13328LDESArtDsc, T01NU13_A13329LDESRefGra,
            T01NU13_n13329LDESRefGra, T01NU13_A13330LDESTipoFa, T01NU13_n13330LDESTipoFa, T01NU13_A13331LDESFechaE, T01NU13_n13331LDESFechaE, T01NU13_A13332LDESEstado, T01NU13_n13332LDESEstado, T01NU13_A396EmprCod, T01NU13_A252CliCod, T01NU13_n252CliCod,
            T01NU13_A1005GrabCod, T01NU13_n1005GrabCod
            }
            , new Object[] {
            T01NU14_A407EmprNom, T01NU14_n407EmprNom
            }
            , new Object[] {
            T01NU15_A279CliNom
            }
            , new Object[] {
            T01NU16_A1006GrabNom, T01NU16_n1006GrabNom
            }
            , new Object[] {
            T01NU17_A13324LDESID, T01NU17_A407EmprNom, T01NU17_n407EmprNom, T01NU17_A279CliNom, T01NU17_A1006GrabNom, T01NU17_n1006GrabNom, T01NU17_A13325LDESDibCli, T01NU17_n13325LDESDibCli, T01NU17_A13326LDESDibInt, T01NU17_n13326LDESDibInt,
            T01NU17_A13327LDESArtcod, T01NU17_n13327LDESArtcod, T01NU17_A13328LDESArtDsc, T01NU17_n13328LDESArtDsc, T01NU17_A13329LDESRefGra, T01NU17_n13329LDESRefGra, T01NU17_A13330LDESTipoFa, T01NU17_n13330LDESTipoFa, T01NU17_A13331LDESFechaE, T01NU17_n13331LDESFechaE,
            T01NU17_A13332LDESEstado, T01NU17_n13332LDESEstado, T01NU17_A396EmprCod, T01NU17_A252CliCod, T01NU17_n252CliCod, T01NU17_A1005GrabCod, T01NU17_n1005GrabCod
            }
            , new Object[] {
            T01NU18_A279CliNom
            }
            , new Object[] {
            T01NU19_A1006GrabNom, T01NU19_n1006GrabNom
            }
            , new Object[] {
            T01NU20_A396EmprCod, T01NU20_A13324LDESID
            }
            , new Object[] {
            T01NU21_A396EmprCod, T01NU21_A13324LDESID
            }
            , new Object[] {
            T01NU22_A396EmprCod, T01NU22_A13324LDESID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NU26_A279CliNom
            }
            , new Object[] {
            T01NU27_A1006GrabNom, T01NU27_n1006GrabNom
            }
            , new Object[] {
            T01NU28_A396EmprCod, T01NU28_A13324LDESID, T01NU28_A13333LDESNPeque
            }
            , new Object[] {
            T01NU29_A396EmprCod, T01NU29_A13324LDESID
            }
            , new Object[] {
            T01NU30_A13324LDESID, T01NU30_A13333LDESNPeque, T01NU30_A13334LDESDPeque, T01NU30_n13334LDESDPeque, T01NU30_A13335LDESMedida, T01NU30_n13335LDESMedida, T01NU30_A13336LDESMalla, T01NU30_n13336LDESMalla, T01NU30_A13347LDESCob, T01NU30_n13347LDESCob,
            T01NU30_A396EmprCod
            }
            , new Object[] {
            T01NU31_A396EmprCod, T01NU31_A13324LDESID, T01NU31_A13333LDESNPeque
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NU35_A396EmprCod, T01NU35_A13324LDESID, T01NU35_A13333LDESNPeque, T01NU35_A13337LDESComb, T01NU35_A13339LDESFondo
            }
            , new Object[] {
            T01NU36_A396EmprCod, T01NU36_A13324LDESID, T01NU36_A13333LDESNPeque
            }
            , new Object[] {
            T01NU37_A13324LDESID, T01NU37_A13333LDESNPeque, T01NU37_A13337LDESComb, T01NU37_A13339LDESFondo, T01NU37_A13338LDESComdD, T01NU37_n13338LDESComdD, T01NU37_A13345LDESUltLP, T01NU37_n13345LDESUltLP, T01NU37_A13346LDESUltP, T01NU37_n13346LDESUltP,
            T01NU37_A13384LDESFecEnv, T01NU37_n13384LDESFecEnv, T01NU37_A13385LDESFecRep, T01NU37_n13385LDESFecRep, T01NU37_A13386LDESEstCb, T01NU37_n13386LDESEstCb, T01NU37_A396EmprCod
            }
            , new Object[] {
            T01NU38_A396EmprCod, T01NU38_A13324LDESID, T01NU38_A13333LDESNPeque, T01NU38_A13337LDESComb, T01NU38_A13339LDESFondo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NU42_A396EmprCod, T01NU42_A13324LDESID, T01NU42_A13333LDESNPeque, T01NU42_A13337LDESComb, T01NU42_A13339LDESFondo
            }
            , new Object[] {
            T01NU43_A13324LDESID, T01NU43_A13333LDESNPeque, T01NU43_A13337LDESComb, T01NU43_A13339LDESFondo, T01NU43_A13342LDESLinea, T01NU43_A718PrdNom, T01NU43_A13343LDESCant, T01NU43_n13343LDESCant, T01NU43_A13344LDESUnd, T01NU43_n13344LDESUnd,
            T01NU43_A396EmprCod, T01NU43_A719PrdNum, T01NU43_n719PrdNum
            }
            , new Object[] {
            T01NU44_A718PrdNom
            }
            , new Object[] {
            T01NU45_A396EmprCod, T01NU45_A13324LDESID, T01NU45_A13333LDESNPeque, T01NU45_A13337LDESComb, T01NU45_A13339LDESFondo, T01NU45_A13342LDESLinea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NU49_A718PrdNom
            }
            , new Object[] {
            T01NU50_A396EmprCod, T01NU50_A13324LDESID, T01NU50_A13333LDESNPeque, T01NU50_A13337LDESComb, T01NU50_A13339LDESFondo, T01NU50_A13342LDESLinea
            }
            , new Object[] {
            T01NU51_A13324LDESID, T01NU51_A13333LDESNPeque, T01NU51_A13337LDESComb, T01NU51_A13339LDESFondo, T01NU51_A13340LDESLinP, T01NU51_A2108PasDsc, T01NU51_n2108PasDsc, T01NU51_A13341LDESCantP, T01NU51_n13341LDESCantP, T01NU51_A396EmprCod,
            T01NU51_A2107PasCod, T01NU51_n2107PasCod
            }
            , new Object[] {
            T01NU52_A2108PasDsc, T01NU52_n2108PasDsc
            }
            , new Object[] {
            T01NU53_A396EmprCod, T01NU53_A13324LDESID, T01NU53_A13333LDESNPeque, T01NU53_A13337LDESComb, T01NU53_A13339LDESFondo, T01NU53_A13340LDESLinP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NU57_A2108PasDsc, T01NU57_n2108PasDsc
            }
            , new Object[] {
            T01NU58_A396EmprCod, T01NU58_A13324LDESID, T01NU58_A13333LDESNPeque, T01NU58_A13337LDESComb, T01NU58_A13339LDESFondo, T01NU58_A13340LDESLinP
            }
            , new Object[] {
            T01NU59_A407EmprNom, T01NU59_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TLDES99" ;
   }

   private byte Z13330LDESTipoFa ;
   private byte Z13332LDESEstado ;
   private byte Z13386LDESEstCb ;
   private byte GxWebError ;
   private byte A13330LDESTipoFa ;
   private byte nKeyPressed ;
   private byte A13332LDESEstado ;
   private byte A13386LDESEstCb ;
   private byte AV33ContCod1 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid4_Backcolorstyle ;
   private byte subGrid4_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte subGrid4_Allowselection ;
   private byte subGrid4_Allowhovering ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private byte ZZ13330LDESTipoFa ;
   private byte ZZ13332LDESEstado ;
   private short Z1005GrabCod ;
   private short nRcdDeleted_1824 ;
   private short nRcdExists_1824 ;
   private short nIsMod_1824 ;
   private short Z13345LDESUltLP ;
   private short Z13346LDESUltP ;
   private short nRcdDeleted_1825 ;
   private short nRcdExists_1825 ;
   private short nIsMod_1825 ;
   private short Z13342LDESLinea ;
   private short nRcdDeleted_1827 ;
   private short nRcdExists_1827 ;
   private short nIsMod_1827 ;
   private short Z13340LDESLinP ;
   private short nRcdDeleted_1826 ;
   private short nRcdExists_1826 ;
   private short nIsMod_1826 ;
   private short A1005GrabCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1824 ;
   private short RcdFound1824 ;
   private short nBlankRcdUsr1824 ;
   private short RcdFound1826 ;
   private short A13340LDESLinP ;
   private short RcdFound1827 ;
   private short A13342LDESLinea ;
   private short RcdFound1825 ;
   private short A13345LDESUltLP ;
   private short A13346LDESUltP ;
   private short RcdFound1823 ;
   private short nIsDirty_1823 ;
   private short nIsDirty_1824 ;
   private short nIsDirty_1825 ;
   private short nIsDirty_1827 ;
   private short nIsDirty_1826 ;
   private short nBlankRcdCount1825 ;
   private short nBlankRcdUsr1825 ;
   private short nBlankRcdCount1827 ;
   private short nBlankRcdUsr1827 ;
   private short nBlankRcdCount1826 ;
   private short nBlankRcdUsr1826 ;
   private short subGrid1_Borderwidth ;
   private short subGrid2_Borderwidth ;
   private short ZZ1005GrabCod ;
   private int Z13324LDESID ;
   private int Z13326LDESDibInt ;
   private int Z252CliCod ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int nRC_GXsfl_132 ;
   private int nGXsfl_132_idx=1 ;
   private int nRC_GXsfl_179 ;
   private int nGXsfl_179_idx=1 ;
   private int nRC_GXsfl_189 ;
   private int nGXsfl_189_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A13324LDESID ;
   private int edtLDESID_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtGrabCod_Enabled ;
   private int edtGrabNom_Enabled ;
   private int edtLDESDibCli_Enabled ;
   private int A13326LDESDibInt ;
   private int edtLDESDibInt_Enabled ;
   private int edtLDESArtcod_Enabled ;
   private int edtLDESArtDsc_Enabled ;
   private int edtLDESRefGra_Enabled ;
   private int edtLDESTipoFa_Enabled ;
   private int edtLDESTipoDs_Enabled ;
   private int edtLDESFechaE_Enabled ;
   private int edtLDESEstado_Enabled ;
   private int edtLDESNPeque_Enabled ;
   private int edtLDESDPeque_Enabled ;
   private int edtLDESMedida_Enabled ;
   private int edtLDESMalla_Enabled ;
   private int edtLDESCob_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1827_Enabled ;
   private int edtavnRcdDeleted_1826_Enabled ;
   private int edtLDESLinP_Enabled ;
   private int edtPasCod_Enabled ;
   private int edtPasDsc_Enabled ;
   private int edtLDESCantP_Enabled ;
   private int edtLDESLinea_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtLDESCant_Enabled ;
   private int edtLDESUnd_Enabled ;
   private int edtLDESComb_Enabled ;
   private int edtLDESComdD_Enabled ;
   private int edtLDESFondo_Enabled ;
   private int edtLDESUltLP_Enabled ;
   private int edtLDESUltP_Enabled ;
   private int edtLDESFecEnv_Enabled ;
   private int edtLDESFecRep_Enabled ;
   private int edtLDESEstCb_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int GRID2_IsPaging ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private int defedtLDESFondo_Enabled ;
   private int defedtLDESComb_Enabled ;
   private int defedtLDESLinea_Enabled ;
   private int defedtLDESLinP_Enabled ;
   private int defedtLDESNPeque_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid3_Selectedindex ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int subGrid4_Selectedindex ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private int edtLDESEstado_Backcolor ;
   private int edtLDESFechaE_Backcolor ;
   private int edtLDESTipoDs_Backcolor ;
   private int edtLDESTipoFa_Backcolor ;
   private int edtLDESRefGra_Backcolor ;
   private int edtLDESArtDsc_Backcolor ;
   private int edtLDESArtcod_Backcolor ;
   private int edtLDESDibInt_Backcolor ;
   private int edtLDESDibCli_Backcolor ;
   private int edtGrabNom_Backcolor ;
   private int edtGrabCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtLDESID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13324LDESID ;
   private int ZZ252CliCod ;
   private int ZZ13326LDESDibInt ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private long GRID4_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private long GRID3_nCurrentRecord ;
   private java.math.BigDecimal Z13347LDESCob ;
   private java.math.BigDecimal Z13343LDESCant ;
   private java.math.BigDecimal Z13341LDESCantP ;
   private java.math.BigDecimal A13341LDESCantP ;
   private java.math.BigDecimal A13343LDESCant ;
   private java.math.BigDecimal A13347LDESCob ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13325LDESDibCli ;
   private String Z13327LDESArtcod ;
   private String Z13328LDESArtDsc ;
   private String Z13329LDESRefGra ;
   private String Z13333LDESNPeque ;
   private String Z13334LDESDPeque ;
   private String Z13335LDESMedida ;
   private String Z13336LDESMalla ;
   private String Z13337LDESComb ;
   private String Z13339LDESFondo ;
   private String Z13338LDESComdD ;
   private String Z13344LDESUnd ;
   private String Z719PrdNum ;
   private String Z2107PasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A2107PasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLDESID_Internalname ;
   private String sGXsfl_132_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_100_idx="0001" ;
   private String sGXsfl_179_idx="0001" ;
   private String sGXsfl_189_idx="0001" ;
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
   private String edtLDESID_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtGrabCod_Internalname ;
   private String edtGrabCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtGrabNom_Internalname ;
   private String A1006GrabNom ;
   private String edtGrabNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtLDESDibCli_Internalname ;
   private String A13325LDESDibCli ;
   private String edtLDESDibCli_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtLDESDibInt_Internalname ;
   private String edtLDESDibInt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtLDESArtcod_Internalname ;
   private String A13327LDESArtcod ;
   private String edtLDESArtcod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtLDESArtDsc_Internalname ;
   private String A13328LDESArtDsc ;
   private String edtLDESArtDsc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtLDESRefGra_Internalname ;
   private String A13329LDESRefGra ;
   private String edtLDESRefGra_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtLDESTipoFa_Internalname ;
   private String edtLDESTipoFa_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtLDESTipoDs_Internalname ;
   private String A13387LDESTipoDs ;
   private String edtLDESTipoDs_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtLDESFechaE_Internalname ;
   private String edtLDESFechaE_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtLDESEstado_Internalname ;
   private String edtLDESEstado_Jsonclick ;
   private String sMode1824 ;
   private String edtLDESNPeque_Internalname ;
   private String edtLDESDPeque_Internalname ;
   private String edtLDESMedida_Internalname ;
   private String edtLDESMalla_Internalname ;
   private String edtLDESCob_Internalname ;
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
   private String AV35Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1827_Internalname ;
   private String edtavnRcdDeleted_1826_Internalname ;
   private String sMode1823 ;
   private String GXCCtl ;
   private String edtLDESLinP_Internalname ;
   private String edtPasCod_Internalname ;
   private String edtPasDsc_Internalname ;
   private String A2108PasDsc ;
   private String edtLDESCantP_Internalname ;
   private String edtLDESLinea_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtLDESCant_Internalname ;
   private String edtLDESUnd_Internalname ;
   private String A13344LDESUnd ;
   private String sMode1825 ;
   private String edtLDESComb_Internalname ;
   private String A13337LDESComb ;
   private String edtLDESComdD_Internalname ;
   private String A13338LDESComdD ;
   private String edtLDESFondo_Internalname ;
   private String A13339LDESFondo ;
   private String edtLDESUltLP_Internalname ;
   private String edtLDESUltP_Internalname ;
   private String edtLDESFecEnv_Internalname ;
   private String edtLDESFecRep_Internalname ;
   private String edtLDESEstCb_Internalname ;
   private String A13333LDESNPeque ;
   private String A13334LDESDPeque ;
   private String A13335LDESMedida ;
   private String A13336LDESMalla ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z1006GrabNom ;
   private String Z718PrdNom ;
   private String sMode1827 ;
   private String Z2108PasDsc ;
   private String sMode1826 ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock21_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String ROClassString ;
   private String edtLDESNPeque_Jsonclick ;
   private String lblTextblock18_Jsonclick ;
   private String edtLDESDPeque_Jsonclick ;
   private String lblTextblock19_Jsonclick ;
   private String edtLDESMedida_Jsonclick ;
   private String lblTextblock20_Jsonclick ;
   private String edtLDESMalla_Jsonclick ;
   private String lblTextblock21_Jsonclick ;
   private String edtLDESCob_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock29_Internalname ;
   private String subGrid3_Internalname ;
   private String subGrid4_Internalname ;
   private String sGXsfl_132_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTable4_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtLDESComb_Jsonclick ;
   private String lblTextblock23_Jsonclick ;
   private String edtLDESComdD_Jsonclick ;
   private String lblTextblock24_Jsonclick ;
   private String edtLDESFondo_Jsonclick ;
   private String lblTextblock25_Jsonclick ;
   private String edtLDESUltLP_Jsonclick ;
   private String lblTextblock26_Jsonclick ;
   private String edtLDESUltP_Jsonclick ;
   private String lblTextblock27_Jsonclick ;
   private String edtLDESFecEnv_Jsonclick ;
   private String lblTextblock28_Jsonclick ;
   private String edtLDESFecRep_Jsonclick ;
   private String lblTextblock29_Jsonclick ;
   private String edtLDESEstCb_Jsonclick ;
   private String sGXsfl_179_fel_idx="0001" ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavnRcdDeleted_1827_Jsonclick ;
   private String edtLDESLinea_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtLDESCant_Jsonclick ;
   private String edtLDESUnd_Jsonclick ;
   private String sGXsfl_189_fel_idx="0001" ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String edtavnRcdDeleted_1826_Jsonclick ;
   private String edtLDESLinP_Jsonclick ;
   private String edtPasCod_Jsonclick ;
   private String edtPasDsc_Jsonclick ;
   private String edtLDESCantP_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock17_Caption ;
   private String lblTextblock18_Caption ;
   private String lblTextblock19_Caption ;
   private String lblTextblock20_Caption ;
   private String lblTextblock21_Caption ;
   private String subGrid2_Header ;
   private String lblTextblock22_Caption ;
   private String lblTextblock11_Caption ;
   private String lblTextblock24_Caption ;
   private String lblTextblock25_Caption ;
   private String lblTextblock26_Caption ;
   private String lblTextblock27_Caption ;
   private String lblTextblock28_Caption ;
   private String lblTextblock29_Caption ;
   private String subGrid3_Header ;
   private String subGrid4_Header ;
   private String Z13387LDESTipoDs ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ13325LDESDibCli ;
   private String ZZ13327LDESArtcod ;
   private String ZZ13328LDESArtDsc ;
   private String ZZ13329LDESRefGra ;
   private String ZZ279CliNom ;
   private String ZZ1006GrabNom ;
   private String ZZ13387LDESTipoDs ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date Z13331LDESFechaE ;
   private java.util.Date Z13384LDESFecEnv ;
   private java.util.Date Z13385LDESFecRep ;
   private java.util.Date A13331LDESFechaE ;
   private java.util.Date A13384LDESFecEnv ;
   private java.util.Date A13385LDESFecRep ;
   private java.util.Date ZZ13331LDESFechaE ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13330LDESTipoFa ;
   private boolean n252CliCod ;
   private boolean n1005GrabCod ;
   private boolean n719PrdNum ;
   private boolean n2107PasCod ;
   private boolean wbErr ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n1006GrabNom ;
   private boolean n13325LDESDibCli ;
   private boolean n13326LDESDibInt ;
   private boolean n13327LDESArtcod ;
   private boolean n13328LDESArtDsc ;
   private boolean n13329LDESRefGra ;
   private boolean n13331LDESFechaE ;
   private boolean n13332LDESEstado ;
   private boolean bGXsfl_179_Refreshing=false ;
   private boolean bGXsfl_189_Refreshing=false ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n13334LDESDPeque ;
   private boolean n13335LDESMedida ;
   private boolean n13336LDESMalla ;
   private boolean n13347LDESCob ;
   private boolean bGXsfl_132_Refreshing=false ;
   private boolean n13338LDESComdD ;
   private boolean n13345LDESUltLP ;
   private boolean n13346LDESUltP ;
   private boolean n13384LDESFecEnv ;
   private boolean n13385LDESFecRep ;
   private boolean n13386LDESEstCb ;
   private boolean n13343LDESCant ;
   private boolean n13344LDESUnd ;
   private boolean n2108PasDsc ;
   private boolean n13341LDESCantP ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01NU14_A407EmprNom ;
   private boolean[] T01NU14_n407EmprNom ;
   private int[] T01NU17_A13324LDESID ;
   private String[] T01NU17_A407EmprNom ;
   private boolean[] T01NU17_n407EmprNom ;
   private String[] T01NU17_A279CliNom ;
   private String[] T01NU17_A1006GrabNom ;
   private boolean[] T01NU17_n1006GrabNom ;
   private String[] T01NU17_A13325LDESDibCli ;
   private boolean[] T01NU17_n13325LDESDibCli ;
   private int[] T01NU17_A13326LDESDibInt ;
   private boolean[] T01NU17_n13326LDESDibInt ;
   private String[] T01NU17_A13327LDESArtcod ;
   private boolean[] T01NU17_n13327LDESArtcod ;
   private String[] T01NU17_A13328LDESArtDsc ;
   private boolean[] T01NU17_n13328LDESArtDsc ;
   private String[] T01NU17_A13329LDESRefGra ;
   private boolean[] T01NU17_n13329LDESRefGra ;
   private byte[] T01NU17_A13330LDESTipoFa ;
   private boolean[] T01NU17_n13330LDESTipoFa ;
   private java.util.Date[] T01NU17_A13331LDESFechaE ;
   private boolean[] T01NU17_n13331LDESFechaE ;
   private byte[] T01NU17_A13332LDESEstado ;
   private boolean[] T01NU17_n13332LDESEstado ;
   private String[] T01NU17_A396EmprCod ;
   private int[] T01NU17_A252CliCod ;
   private boolean[] T01NU17_n252CliCod ;
   private short[] T01NU17_A1005GrabCod ;
   private boolean[] T01NU17_n1005GrabCod ;
   private String[] T01NU15_A279CliNom ;
   private String[] T01NU16_A1006GrabNom ;
   private boolean[] T01NU16_n1006GrabNom ;
   private String[] T01NU18_A279CliNom ;
   private String[] T01NU19_A1006GrabNom ;
   private boolean[] T01NU19_n1006GrabNom ;
   private String[] T01NU20_A396EmprCod ;
   private int[] T01NU20_A13324LDESID ;
   private int[] T01NU13_A13324LDESID ;
   private String[] T01NU13_A13325LDESDibCli ;
   private boolean[] T01NU13_n13325LDESDibCli ;
   private int[] T01NU13_A13326LDESDibInt ;
   private boolean[] T01NU13_n13326LDESDibInt ;
   private String[] T01NU13_A13327LDESArtcod ;
   private boolean[] T01NU13_n13327LDESArtcod ;
   private String[] T01NU13_A13328LDESArtDsc ;
   private boolean[] T01NU13_n13328LDESArtDsc ;
   private String[] T01NU13_A13329LDESRefGra ;
   private boolean[] T01NU13_n13329LDESRefGra ;
   private byte[] T01NU13_A13330LDESTipoFa ;
   private boolean[] T01NU13_n13330LDESTipoFa ;
   private java.util.Date[] T01NU13_A13331LDESFechaE ;
   private boolean[] T01NU13_n13331LDESFechaE ;
   private byte[] T01NU13_A13332LDESEstado ;
   private boolean[] T01NU13_n13332LDESEstado ;
   private String[] T01NU13_A396EmprCod ;
   private int[] T01NU13_A252CliCod ;
   private boolean[] T01NU13_n252CliCod ;
   private short[] T01NU13_A1005GrabCod ;
   private boolean[] T01NU13_n1005GrabCod ;
   private String[] T01NU21_A396EmprCod ;
   private int[] T01NU21_A13324LDESID ;
   private String[] T01NU22_A396EmprCod ;
   private int[] T01NU22_A13324LDESID ;
   private int[] T01NU12_A13324LDESID ;
   private String[] T01NU12_A13325LDESDibCli ;
   private boolean[] T01NU12_n13325LDESDibCli ;
   private int[] T01NU12_A13326LDESDibInt ;
   private boolean[] T01NU12_n13326LDESDibInt ;
   private String[] T01NU12_A13327LDESArtcod ;
   private boolean[] T01NU12_n13327LDESArtcod ;
   private String[] T01NU12_A13328LDESArtDsc ;
   private boolean[] T01NU12_n13328LDESArtDsc ;
   private String[] T01NU12_A13329LDESRefGra ;
   private boolean[] T01NU12_n13329LDESRefGra ;
   private byte[] T01NU12_A13330LDESTipoFa ;
   private boolean[] T01NU12_n13330LDESTipoFa ;
   private java.util.Date[] T01NU12_A13331LDESFechaE ;
   private boolean[] T01NU12_n13331LDESFechaE ;
   private byte[] T01NU12_A13332LDESEstado ;
   private boolean[] T01NU12_n13332LDESEstado ;
   private String[] T01NU12_A396EmprCod ;
   private int[] T01NU12_A252CliCod ;
   private boolean[] T01NU12_n252CliCod ;
   private short[] T01NU12_A1005GrabCod ;
   private boolean[] T01NU12_n1005GrabCod ;
   private String[] T01NU26_A279CliNom ;
   private String[] T01NU27_A1006GrabNom ;
   private boolean[] T01NU27_n1006GrabNom ;
   private String[] T01NU28_A396EmprCod ;
   private int[] T01NU28_A13324LDESID ;
   private String[] T01NU28_A13333LDESNPeque ;
   private String[] T01NU29_A396EmprCod ;
   private int[] T01NU29_A13324LDESID ;
   private int[] T01NU30_A13324LDESID ;
   private String[] T01NU30_A13333LDESNPeque ;
   private String[] T01NU30_A13334LDESDPeque ;
   private boolean[] T01NU30_n13334LDESDPeque ;
   private String[] T01NU30_A13335LDESMedida ;
   private boolean[] T01NU30_n13335LDESMedida ;
   private String[] T01NU30_A13336LDESMalla ;
   private boolean[] T01NU30_n13336LDESMalla ;
   private java.math.BigDecimal[] T01NU30_A13347LDESCob ;
   private boolean[] T01NU30_n13347LDESCob ;
   private String[] T01NU30_A396EmprCod ;
   private String[] T01NU31_A396EmprCod ;
   private int[] T01NU31_A13324LDESID ;
   private String[] T01NU31_A13333LDESNPeque ;
   private int[] T01NU11_A13324LDESID ;
   private String[] T01NU11_A13333LDESNPeque ;
   private String[] T01NU11_A13334LDESDPeque ;
   private boolean[] T01NU11_n13334LDESDPeque ;
   private String[] T01NU11_A13335LDESMedida ;
   private boolean[] T01NU11_n13335LDESMedida ;
   private String[] T01NU11_A13336LDESMalla ;
   private boolean[] T01NU11_n13336LDESMalla ;
   private java.math.BigDecimal[] T01NU11_A13347LDESCob ;
   private boolean[] T01NU11_n13347LDESCob ;
   private String[] T01NU11_A396EmprCod ;
   private int[] T01NU10_A13324LDESID ;
   private String[] T01NU10_A13333LDESNPeque ;
   private String[] T01NU10_A13334LDESDPeque ;
   private boolean[] T01NU10_n13334LDESDPeque ;
   private String[] T01NU10_A13335LDESMedida ;
   private boolean[] T01NU10_n13335LDESMedida ;
   private String[] T01NU10_A13336LDESMalla ;
   private boolean[] T01NU10_n13336LDESMalla ;
   private java.math.BigDecimal[] T01NU10_A13347LDESCob ;
   private boolean[] T01NU10_n13347LDESCob ;
   private String[] T01NU10_A396EmprCod ;
   private String[] T01NU35_A396EmprCod ;
   private int[] T01NU35_A13324LDESID ;
   private String[] T01NU35_A13333LDESNPeque ;
   private String[] T01NU35_A13337LDESComb ;
   private String[] T01NU35_A13339LDESFondo ;
   private String[] T01NU36_A396EmprCod ;
   private int[] T01NU36_A13324LDESID ;
   private String[] T01NU36_A13333LDESNPeque ;
   private int[] T01NU37_A13324LDESID ;
   private String[] T01NU37_A13333LDESNPeque ;
   private String[] T01NU37_A13337LDESComb ;
   private String[] T01NU37_A13339LDESFondo ;
   private String[] T01NU37_A13338LDESComdD ;
   private boolean[] T01NU37_n13338LDESComdD ;
   private short[] T01NU37_A13345LDESUltLP ;
   private boolean[] T01NU37_n13345LDESUltLP ;
   private short[] T01NU37_A13346LDESUltP ;
   private boolean[] T01NU37_n13346LDESUltP ;
   private java.util.Date[] T01NU37_A13384LDESFecEnv ;
   private boolean[] T01NU37_n13384LDESFecEnv ;
   private java.util.Date[] T01NU37_A13385LDESFecRep ;
   private boolean[] T01NU37_n13385LDESFecRep ;
   private byte[] T01NU37_A13386LDESEstCb ;
   private boolean[] T01NU37_n13386LDESEstCb ;
   private String[] T01NU37_A396EmprCod ;
   private String[] T01NU38_A396EmprCod ;
   private int[] T01NU38_A13324LDESID ;
   private String[] T01NU38_A13333LDESNPeque ;
   private String[] T01NU38_A13337LDESComb ;
   private String[] T01NU38_A13339LDESFondo ;
   private int[] T01NU9_A13324LDESID ;
   private String[] T01NU9_A13333LDESNPeque ;
   private String[] T01NU9_A13337LDESComb ;
   private String[] T01NU9_A13339LDESFondo ;
   private String[] T01NU9_A13338LDESComdD ;
   private boolean[] T01NU9_n13338LDESComdD ;
   private short[] T01NU9_A13345LDESUltLP ;
   private boolean[] T01NU9_n13345LDESUltLP ;
   private short[] T01NU9_A13346LDESUltP ;
   private boolean[] T01NU9_n13346LDESUltP ;
   private java.util.Date[] T01NU9_A13384LDESFecEnv ;
   private boolean[] T01NU9_n13384LDESFecEnv ;
   private java.util.Date[] T01NU9_A13385LDESFecRep ;
   private boolean[] T01NU9_n13385LDESFecRep ;
   private byte[] T01NU9_A13386LDESEstCb ;
   private boolean[] T01NU9_n13386LDESEstCb ;
   private String[] T01NU9_A396EmprCod ;
   private int[] T01NU8_A13324LDESID ;
   private String[] T01NU8_A13333LDESNPeque ;
   private String[] T01NU8_A13337LDESComb ;
   private String[] T01NU8_A13339LDESFondo ;
   private String[] T01NU8_A13338LDESComdD ;
   private boolean[] T01NU8_n13338LDESComdD ;
   private short[] T01NU8_A13345LDESUltLP ;
   private boolean[] T01NU8_n13345LDESUltLP ;
   private short[] T01NU8_A13346LDESUltP ;
   private boolean[] T01NU8_n13346LDESUltP ;
   private java.util.Date[] T01NU8_A13384LDESFecEnv ;
   private boolean[] T01NU8_n13384LDESFecEnv ;
   private java.util.Date[] T01NU8_A13385LDESFecRep ;
   private boolean[] T01NU8_n13385LDESFecRep ;
   private byte[] T01NU8_A13386LDESEstCb ;
   private boolean[] T01NU8_n13386LDESEstCb ;
   private String[] T01NU8_A396EmprCod ;
   private String[] T01NU42_A396EmprCod ;
   private int[] T01NU42_A13324LDESID ;
   private String[] T01NU42_A13333LDESNPeque ;
   private String[] T01NU42_A13337LDESComb ;
   private String[] T01NU42_A13339LDESFondo ;
   private int[] T01NU43_A13324LDESID ;
   private String[] T01NU43_A13333LDESNPeque ;
   private String[] T01NU43_A13337LDESComb ;
   private String[] T01NU43_A13339LDESFondo ;
   private short[] T01NU43_A13342LDESLinea ;
   private String[] T01NU43_A718PrdNom ;
   private java.math.BigDecimal[] T01NU43_A13343LDESCant ;
   private boolean[] T01NU43_n13343LDESCant ;
   private String[] T01NU43_A13344LDESUnd ;
   private boolean[] T01NU43_n13344LDESUnd ;
   private String[] T01NU43_A396EmprCod ;
   private String[] T01NU43_A719PrdNum ;
   private boolean[] T01NU43_n719PrdNum ;
   private String[] T01NU7_A718PrdNom ;
   private String[] T01NU44_A718PrdNom ;
   private String[] T01NU45_A396EmprCod ;
   private int[] T01NU45_A13324LDESID ;
   private String[] T01NU45_A13333LDESNPeque ;
   private String[] T01NU45_A13337LDESComb ;
   private String[] T01NU45_A13339LDESFondo ;
   private short[] T01NU45_A13342LDESLinea ;
   private int[] T01NU6_A13324LDESID ;
   private String[] T01NU6_A13333LDESNPeque ;
   private String[] T01NU6_A13337LDESComb ;
   private String[] T01NU6_A13339LDESFondo ;
   private short[] T01NU6_A13342LDESLinea ;
   private java.math.BigDecimal[] T01NU6_A13343LDESCant ;
   private boolean[] T01NU6_n13343LDESCant ;
   private String[] T01NU6_A13344LDESUnd ;
   private boolean[] T01NU6_n13344LDESUnd ;
   private String[] T01NU6_A396EmprCod ;
   private String[] T01NU6_A719PrdNum ;
   private boolean[] T01NU6_n719PrdNum ;
   private int[] T01NU5_A13324LDESID ;
   private String[] T01NU5_A13333LDESNPeque ;
   private String[] T01NU5_A13337LDESComb ;
   private String[] T01NU5_A13339LDESFondo ;
   private short[] T01NU5_A13342LDESLinea ;
   private java.math.BigDecimal[] T01NU5_A13343LDESCant ;
   private boolean[] T01NU5_n13343LDESCant ;
   private String[] T01NU5_A13344LDESUnd ;
   private boolean[] T01NU5_n13344LDESUnd ;
   private String[] T01NU5_A396EmprCod ;
   private String[] T01NU5_A719PrdNum ;
   private boolean[] T01NU5_n719PrdNum ;
   private String[] T01NU49_A718PrdNom ;
   private String[] T01NU50_A396EmprCod ;
   private int[] T01NU50_A13324LDESID ;
   private String[] T01NU50_A13333LDESNPeque ;
   private String[] T01NU50_A13337LDESComb ;
   private String[] T01NU50_A13339LDESFondo ;
   private short[] T01NU50_A13342LDESLinea ;
   private int[] T01NU51_A13324LDESID ;
   private String[] T01NU51_A13333LDESNPeque ;
   private String[] T01NU51_A13337LDESComb ;
   private String[] T01NU51_A13339LDESFondo ;
   private short[] T01NU51_A13340LDESLinP ;
   private String[] T01NU51_A2108PasDsc ;
   private boolean[] T01NU51_n2108PasDsc ;
   private java.math.BigDecimal[] T01NU51_A13341LDESCantP ;
   private boolean[] T01NU51_n13341LDESCantP ;
   private String[] T01NU51_A396EmprCod ;
   private String[] T01NU51_A2107PasCod ;
   private boolean[] T01NU51_n2107PasCod ;
   private String[] T01NU4_A2108PasDsc ;
   private boolean[] T01NU4_n2108PasDsc ;
   private String[] T01NU52_A2108PasDsc ;
   private boolean[] T01NU52_n2108PasDsc ;
   private String[] T01NU53_A396EmprCod ;
   private int[] T01NU53_A13324LDESID ;
   private String[] T01NU53_A13333LDESNPeque ;
   private String[] T01NU53_A13337LDESComb ;
   private String[] T01NU53_A13339LDESFondo ;
   private short[] T01NU53_A13340LDESLinP ;
   private int[] T01NU3_A13324LDESID ;
   private String[] T01NU3_A13333LDESNPeque ;
   private String[] T01NU3_A13337LDESComb ;
   private String[] T01NU3_A13339LDESFondo ;
   private short[] T01NU3_A13340LDESLinP ;
   private java.math.BigDecimal[] T01NU3_A13341LDESCantP ;
   private boolean[] T01NU3_n13341LDESCantP ;
   private String[] T01NU3_A396EmprCod ;
   private String[] T01NU3_A2107PasCod ;
   private boolean[] T01NU3_n2107PasCod ;
   private int[] T01NU2_A13324LDESID ;
   private String[] T01NU2_A13333LDESNPeque ;
   private String[] T01NU2_A13337LDESComb ;
   private String[] T01NU2_A13339LDESFondo ;
   private short[] T01NU2_A13340LDESLinP ;
   private java.math.BigDecimal[] T01NU2_A13341LDESCantP ;
   private boolean[] T01NU2_n13341LDESCantP ;
   private String[] T01NU2_A396EmprCod ;
   private String[] T01NU2_A2107PasCod ;
   private boolean[] T01NU2_n2107PasCod ;
   private String[] T01NU57_A2108PasDsc ;
   private boolean[] T01NU57_n2108PasDsc ;
   private String[] T01NU58_A396EmprCod ;
   private int[] T01NU58_A13324LDESID ;
   private String[] T01NU58_A13333LDESNPeque ;
   private String[] T01NU58_A13337LDESComb ;
   private String[] T01NU58_A13339LDESFondo ;
   private short[] T01NU58_A13340LDESLinP ;
   private String[] T01NU59_A407EmprNom ;
   private boolean[] T01NU59_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tldes99__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes99__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes99__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes99__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes99__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NU2", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP, LDESCantP, EmprCod, PasCod FROM TXPLDES03 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ?  FOR UPDATE OF LDESCantP, PasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU3", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP, LDESCantP, EmprCod, PasCod FROM TXPLDES03 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU4", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU5", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea, LDESCant, LDESUnd, EmprCod, PrdNum FROM TXPLDES04 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ?  FOR UPDATE OF LDESCant, LDESUnd, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU6", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea, LDESCant, LDESUnd, EmprCod, PrdNum FROM TXPLDES04 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU7", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU8", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESComdD, LDESUltLP, LDESUltP, LDESFecEnv, LDESFecRep, LDESEstCb, EmprCod FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?  FOR UPDATE OF LDESComdD, LDESUltLP, LDESUltP, LDESFecEnv, LDESFecRep, LDESEstCb NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU9", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESComdD, LDESUltLP, LDESUltP, LDESFecEnv, LDESFecRep, LDESEstCb, EmprCod FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU10", "SELECT LDESID, LDESNPeque, LDESDPeque, LDESMedida, LDESMalla, LDESCob, EmprCod FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ?  FOR UPDATE OF LDESDPeque, LDESMedida, LDESMalla, LDESCob NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU11", "SELECT LDESID, LDESNPeque, LDESDPeque, LDESMedida, LDESMalla, LDESCob, EmprCod FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU12", "SELECT LDESID, LDESDibCli, LDESDibInt, LDESArtcod, LDESArtDsc, LDESRefGra, LDESTipoFa, LDESFechaE, LDESEstado, EmprCod, CliCod, GrabCod FROM TXPLDES00 WHERE EmprCod = ? AND LDESID = ?  FOR UPDATE OF LDESDibCli, LDESDibInt, LDESArtcod, LDESArtDsc, LDESRefGra, LDESTipoFa, LDESFechaE, LDESEstado, CliCod, GrabCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU13", "SELECT LDESID, LDESDibCli, LDESDibInt, LDESArtcod, LDESArtDsc, LDESRefGra, LDESTipoFa, LDESFechaE, LDESEstado, EmprCod, CliCod, GrabCod FROM TXPLDES00 WHERE EmprCod = ? AND LDESID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU16", "SELECT GrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU17", "SELECT /*+ FIRST_ROWS(100) */ TM1.LDESID, T2.EmprNom, T3.CliNom, T4.GrabNom, TM1.LDESDibCli, TM1.LDESDibInt, TM1.LDESArtcod, TM1.LDESArtDsc, TM1.LDESRefGra, TM1.LDESTipoFa, TM1.LDESFechaE, TM1.LDESEstado, TM1.EmprCod, TM1.CliCod, TM1.GrabCod FROM (((TXPLDES00 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPGRABAD T4 ON T4.EmprCod = TM1.EmprCod AND T4.GrabCod = TM1.GrabCod) WHERE TM1.EmprCod = ? and TM1.LDESID = ? ORDER BY TM1.EmprCod, TM1.LDESID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU19", "SELECT GrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID FROM TXPLDES00 WHERE EmprCod = ? AND LDESID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID FROM TXPLDES00 WHERE ( LDESID > ?) and EmprCod = ? ORDER BY EmprCod, LDESID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NU22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID FROM TXPLDES00 WHERE ( LDESID < ?) and EmprCod = ? ORDER BY EmprCod DESC, LDESID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NU23", "INSERT INTO TXPLDES00(LDESID, LDESDibCli, LDESDibInt, LDESArtcod, LDESArtDsc, LDESRefGra, LDESTipoFa, LDESFechaE, LDESEstado, EmprCod, CliCod, GrabCod, PEQId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPLDES00")
         ,new UpdateCursor("T01NU24", "UPDATE TXPLDES00 SET LDESDibCli=?, LDESDibInt=?, LDESArtcod=?, LDESArtDsc=?, LDESRefGra=?, LDESTipoFa=?, LDESFechaE=?, LDESEstado=?, CliCod=?, GrabCod=?  WHERE EmprCod = ? AND LDESID = ?", GX_NOMASK, "TXPLDES00")
         ,new UpdateCursor("T01NU25", "DELETE FROM TXPLDES00  WHERE EmprCod = ? AND LDESID = ?", GX_NOMASK, "TXPLDES00")
         ,new ForEachCursor("T01NU26", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU27", "SELECT GrabNom FROM TXPGRABAD WHERE EmprCod = ? AND GrabCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU28", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NU29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, LDESID FROM TXPLDES00 WHERE EmprCod = ? ORDER BY EmprCod, LDESID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU30", "SELECT LDESID, LDESNPeque, LDESDPeque, LDESMedida, LDESMalla, LDESCob, EmprCod FROM TXPLDES01 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? ORDER BY EmprCod, LDESID, LDESNPeque ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU31", "SELECT EmprCod, LDESID, LDESNPeque FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NU32", "INSERT INTO TXPLDES01(LDESID, LDESNPeque, LDESDPeque, LDESMedida, LDESMalla, LDESCob, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLDES01")
         ,new UpdateCursor("T01NU33", "UPDATE TXPLDES01 SET LDESDPeque=?, LDESMedida=?, LDESMalla=?, LDESCob=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ?", GX_NOMASK, "TXPLDES01")
         ,new UpdateCursor("T01NU34", "DELETE FROM TXPLDES01  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ?", GX_NOMASK, "TXPLDES01")
         ,new ForEachCursor("T01NU35", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NU36", "SELECT EmprCod, LDESID, LDESNPeque FROM TXPLDES01 WHERE EmprCod = ? and LDESID = ? ORDER BY EmprCod, LDESID, LDESNPeque ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU37", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESComdD, LDESUltLP, LDESUltP, LDESFecEnv, LDESFecRep, LDESEstCb, EmprCod FROM TXPLDES02 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU38", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NU39", "INSERT INTO TXPLDES02(LDESID, LDESNPeque, LDESComb, LDESFondo, LDESComdD, LDESUltLP, LDESUltP, LDESFecEnv, LDESFecRep, LDESEstCb, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLDES02")
         ,new UpdateCursor("T01NU40", "UPDATE TXPLDES02 SET LDESComdD=?, LDESUltLP=?, LDESUltP=?, LDESFecEnv=?, LDESFecRep=?, LDESEstCb=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?", GX_NOMASK, "TXPLDES02")
         ,new UpdateCursor("T01NU41", "DELETE FROM TXPLDES02  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?", GX_NOMASK, "TXPLDES02")
         ,new ForEachCursor("T01NU42", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU43", "SELECT T1.LDESID, T1.LDESNPeque, T1.LDESComb, T1.LDESFondo, T1.LDESLinea, T2.PrdNom, T1.LDESCant, T1.LDESUnd, T1.EmprCod, T1.PrdNum FROM (TXPLDES04 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.LDESID = ? and T1.LDESNPeque = ? and T1.LDESComb = ? and T1.LDESFondo = ? and T1.LDESLinea = ? ORDER BY T1.EmprCod, T1.LDESID, T1.LDESNPeque, T1.LDESComb, T1.LDESFondo, T1.LDESLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU44", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU45", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NU46", "INSERT INTO TXPLDES04(LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea, LDESCant, LDESUnd, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLDES04")
         ,new UpdateCursor("T01NU47", "UPDATE TXPLDES04 SET LDESCant=?, LDESUnd=?, PrdNum=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ?", GX_NOMASK, "TXPLDES04")
         ,new UpdateCursor("T01NU48", "DELETE FROM TXPLDES04  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinea = ?", GX_NOMASK, "TXPLDES04")
         ,new ForEachCursor("T01NU49", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU50", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU51", "SELECT T1.LDESID, T1.LDESNPeque, T1.LDESComb, T1.LDESFondo, T1.LDESLinP, T2.PasDsc, T1.LDESCantP, T1.EmprCod, T1.PasCod FROM (TXPLDES03 T1 LEFT JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.LDESID = ? and T1.LDESNPeque = ? and T1.LDESComb = ? and T1.LDESFondo = ? and T1.LDESLinP = ? ORDER BY T1.EmprCod, T1.LDESID, T1.LDESNPeque, T1.LDESComb, T1.LDESFondo, T1.LDESLinP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU52", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU53", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP FROM TXPLDES03 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NU54", "INSERT INTO TXPLDES03(LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP, LDESCantP, EmprCod, PasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLDES03")
         ,new UpdateCursor("T01NU55", "UPDATE TXPLDES03 SET LDESCantP=?, PasCod=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ?", GX_NOMASK, "TXPLDES03")
         ,new UpdateCursor("T01NU56", "DELETE FROM TXPLDES03  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? AND LDESLinP = ?", GX_NOMASK, "TXPLDES03")
         ,new ForEachCursor("T01NU57", "SELECT PasDsc FROM TXPCPASTA WHERE EmprCod = ? AND PasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU58", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP FROM TXPLDES03 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NU59", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 35 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 41 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 49 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 57 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 14 :
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 17 :
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
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
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
                  stmt.setString(5, (String)parms[8], 26);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 20);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
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
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[21]).shortValue());
               }
               return;
            case 22 :
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
                  stmt.setString(4, (String)parms[7], 26);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
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
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setInt(12, ((Number) parms[21]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               }
               stmt.setString(7, (String)parms[10], 3);
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 12);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 37 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[15]).byteValue());
               }
               stmt.setString(11, (String)parms[16], 3);
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 12);
               stmt.setString(10, (String)parms[15], 12);
               stmt.setString(11, (String)parms[16], 12);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 44 :
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
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 3);
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
            case 45 :
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
                  stmt.setString(2, (String)parms[3], 3);
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
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 52 :
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
            case 53 :
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
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

