package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class textsal_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_7I305( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         A2256SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_22_7I306( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A457FasCod, A2256SalExtFec, A2253SalExtAlb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_7I306( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_7I306( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"vKILOS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx13asakilos7I306( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"vMETROS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx14asametros7I306( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod, A2248ManCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_33( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ORDEN DE TRABAJO EXTERIOR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSalExtAlb_Internalname ;
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
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public textsal_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public textsal_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( textsal_impl.class ));
   }

   public textsal_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e117I2 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TEXTSAL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cod Albaran Salida", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAlb_Jsonclick, 0, "", "", "", "", "", 1, edtSalExtAlb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtManCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "", "", "", "", "", 1, edtManCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Manuf", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtManNom_Internalname, GXutil.rtrim( A2249ManNom), GXutil.rtrim( localUtil.format( A2249ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManNom_Jsonclick, 0, "", "", "", "", "", 1, edtManNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Transportista", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Salida", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSalExtFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtFec_Internalname, localUtil.format(A2256SalExtFec, "99/99/99"), localUtil.format( A2256SalExtFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtFec_Jsonclick, 0, "", "", "", "", "", 1, edtSalExtFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTSAL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalExtFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalExtFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TEXTSAL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Estado Albaran", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2257SalExtEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2257SalExtEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A2257SalExtEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtEst_Jsonclick, 0, "", "", "", "", "", 1, edtSalExtEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Listado? 0=N,1=S", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtLis_Internalname, GXutil.ltrim( localUtil.ntoc( A2258SalExtLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalExtLis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2258SalExtLis), "9") : localUtil.format( DecimalUtil.doubleToDec(A2258SalExtLis), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtLis_Jsonclick, 0, "", "", "", "", "", 1, edtSalExtLis_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Seccion", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtSec_Internalname, GXutil.rtrim( A2254SalExtSec), GXutil.rtrim( localUtil.format( A2254SalExtSec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtSec_Jsonclick, 0, "", "", "", "", "", 1, edtSalExtSec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEXTSAL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount306 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_306 = (short)(1) ;
            scanStart7I306( ) ;
            while ( RcdFound306 != 0 )
            {
               init_level_properties306( ) ;
               getByPrimaryKey7I306( ) ;
               addRow7I306( ) ;
               scanNext7I306( ) ;
            }
            scanEnd7I306( ) ;
            nBlankRcdCount306 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal7I306( ) ;
         standaloneModal7I306( ) ;
         sMode306 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow7I306( ) ;
            edtavnRcdDeleted_306_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_306_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_306_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_306_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarExt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAREXT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarExt_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarMat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMAT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarNMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNMTR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNMtr_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarPieNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIENDES_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieNDes_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtTipConCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCONCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipConCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtTipConDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCONDSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipConDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipConDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtObs1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTOBS1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtObs1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtObs1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtFeR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTFER_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtFeR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtFeR_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtKgR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTKGR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtKgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtKgR_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtCoR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTCOR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtCoR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtCoR_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtEsB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTESB_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtEsB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtEsB_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtPrT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTPRT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtPrT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPrT_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtPoT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTPOT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtPoT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPoT_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTENT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtEnt_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtMtR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTMTR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtMtR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtMtR_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtKgE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTKGE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtKgE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtKgE_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtCoE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTCOE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtCoE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtCoE_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtSalExtMtE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTMTE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtMtE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtMtE_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_306 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal7I306( ) ;
            }
            sendRow7I306( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode306 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount306 = (short)(5) ;
         nRcdExists_306 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart7I306( ) ;
            while ( RcdFound306 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_75306( ) ;
               init_level_properties306( ) ;
               standaloneNotModal7I306( ) ;
               getByPrimaryKey7I306( ) ;
               standaloneModal7I306( ) ;
               addRow7I306( ) ;
               scanNext7I306( ) ;
            }
            scanEnd7I306( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode306 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_75306( ) ;
      initAll7I306( ) ;
      init_level_properties306( ) ;
      nRcdExists_306 = (short)(0) ;
      nIsMod_306 = (short)(0) ;
      nRcdDeleted_306 = (short)(0) ;
      nBlankRcdCount306 = (short)(nBlankRcdUsr306+nBlankRcdCount306) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount306 > 0 )
      {
         standaloneNotModal7I306( ) ;
         standaloneModal7I306( ) ;
         addRow7I306( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount306 = (short)(nBlankRcdCount306-1) ;
      }
      Gx_mode = sMode306 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEXTSAL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TEXTSAL.htm");
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
      e127I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( "Z2253SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2256SalExtFec = localUtil.ctod( httpContext.cgiGet( "Z2256SalExtFec"), 0) ;
            Z2257SalExtEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2257SalExtEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2258SalExtLis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2258SalExtLis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2254SalExtSec = httpContext.cgiGet( "Z2254SalExtSec") ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Modo = httpContext.cgiGet( "MODO") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV20Modo = httpContext.cgiGet( "vMODO") ;
            AV21EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22SalExtALb = (int)(localUtil.ctol( httpContext.cgiGet( "vSALEXTALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23Kilos = localUtil.ctond( httpContext.cgiGet( "vKILOS")) ;
            AV26Metros = localUtil.ctond( httpContext.cgiGet( "vMETROS")) ;
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2253SalExtAlb = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            }
            else
            {
               A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2248ManCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            }
            else
            {
               A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
            n2249ManNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A840TrnCod = (short)(0) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            if ( localUtil.vcdate( httpContext.cgiGet( edtSalExtFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SALEXTFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2256SalExtFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
            }
            else
            {
               A2256SalExtFec = localUtil.ctod( httpContext.cgiGet( edtSalExtFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2257SalExtEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
            }
            else
            {
               A2257SalExtEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalExtEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTLIS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtLis_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2258SalExtLis = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
            }
            else
            {
               A2258SalExtLis = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalExtLis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
            }
            A2254SalExtSec = httpContext.cgiGet( edtSalExtSec_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TEXTSAL");
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV20Modo, "")));
            forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( AV21EmprCod, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A2253SalExtAlb != Z2253SalExtAlb ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("textsal:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
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
                        e127I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIMINAR HDR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Eliminar HDR' */
                        e137I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIMINAR ALBARAN'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Eliminar Albaran' */
                        e147I2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e117I2 ();
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
            initAll7I305( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_306_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_306_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributes7I305( ) ;
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

   public void confirm_7I0( )
   {
      beforeValidate7I305( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls7I305( ) ;
         }
         else
         {
            checkExtendedTable7I305( ) ;
            if ( AnyError == 0 )
            {
               zm7I305( 26) ;
               zm7I305( 27) ;
               zm7I305( 28) ;
            }
            closeExtendedTableCursors7I305( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode305 = Gx_mode ;
         confirm_7I306( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode305 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode305 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues7I0( ) ;
      }
   }

   public void confirm_7I306( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow7I306( ) ;
         if ( ( nRcdExists_306 != 0 ) || ( nIsMod_306 != 0 ) )
         {
            getKey7I306( ) ;
            if ( ( nRcdExists_306 == 0 ) && ( nRcdDeleted_306 == 0 ) )
            {
               if ( RcdFound306 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate7I306( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable7I306( ) ;
                     if ( AnyError == 0 )
                     {
                        zm7I306( 30) ;
                        zm7I306( 31) ;
                        zm7I306( 32) ;
                        zm7I306( 33) ;
                     }
                     closeExtendedTableCursors7I306( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound306 != 0 )
               {
                  if ( nRcdDeleted_306 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey7I306( ) ;
                     load7I306( ) ;
                     beforeValidate7I306( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls7I306( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_306 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate7I306( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable7I306( ) ;
                           if ( AnyError == 0 )
                           {
                              zm7I306( 30) ;
                              zm7I306( 31) ;
                              zm7I306( 32) ;
                              zm7I306( 33) ;
                           }
                           closeExtendedTableCursors7I306( ) ;
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
                  if ( nRcdDeleted_306 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_306_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarExt_Internalname, GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarMat_Internalname, GXutil.rtrim( A182BarMat)) ;
         httpContext.changePostValue( edtBarNMtr_Internalname, GXutil.rtrim( A1500BarNMtr)) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtBarPieNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipConCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1157TipConCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipConDsc_Internalname, GXutil.rtrim( A997TipConDsc)) ;
         httpContext.changePostValue( edtSalExtObs1_Internalname, GXutil.rtrim( A2255SalExtObs1)) ;
         httpContext.changePostValue( edtSalExtFeR_Internalname, localUtil.format(A2259SalExtFeR, "99/99/99")) ;
         httpContext.changePostValue( edtSalExtKgR_Internalname, GXutil.ltrim( localUtil.ntoc( A2260SalExtKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtCoR_Internalname, GXutil.ltrim( localUtil.ntoc( A2261SalExtCoR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtEsB_Internalname, GXutil.ltrim( localUtil.ntoc( A2262SalExtEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtPrT_Internalname, GXutil.rtrim( A2263SalExtPrT)) ;
         httpContext.changePostValue( edtSalExtPoT_Internalname, GXutil.rtrim( A2264SalExtPoT)) ;
         httpContext.changePostValue( edtSalExtEnt_Internalname, GXutil.rtrim( A2757SalExtEnt)) ;
         httpContext.changePostValue( edtSalExtMtR_Internalname, GXutil.ltrim( localUtil.ntoc( A2840SalExtMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtKgE_Internalname, GXutil.ltrim( localUtil.ntoc( A3555SalExtKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtCoE_Internalname, GXutil.ltrim( localUtil.ntoc( A3556SalExtCoE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtMtE_Internalname, GXutil.ltrim( localUtil.ntoc( A3557SalExtMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_75_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z3556SalExtCoE_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z3556SalExtCoE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2255SalExtObs1_"+sGXsfl_75_idx, GXutil.rtrim( Z2255SalExtObs1)) ;
         httpContext.changePostValue( "ZT_"+"Z2259SalExtFeR_"+sGXsfl_75_idx, localUtil.dtoc( Z2259SalExtFeR, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z2260SalExtKgR_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2260SalExtKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2261SalExtCoR_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2261SalExtCoR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2262SalExtEsB_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2262SalExtEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2263SalExtPrT_"+sGXsfl_75_idx, GXutil.rtrim( Z2263SalExtPrT)) ;
         httpContext.changePostValue( "ZT_"+"Z2264SalExtPoT_"+sGXsfl_75_idx, GXutil.rtrim( Z2264SalExtPoT)) ;
         httpContext.changePostValue( "ZT_"+"Z2757SalExtEnt_"+sGXsfl_75_idx, GXutil.rtrim( Z2757SalExtEnt)) ;
         httpContext.changePostValue( "ZT_"+"Z2840SalExtMtR_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2840SalExtMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3555SalExtKgE_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z3555SalExtKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3557SalExtMtE_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z3557SalExtMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_75_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_306_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_306_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_306_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_306 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_306_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_306_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAREXT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarExt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMAT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIENDES_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCONCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipConCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCONDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipConDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTOBS1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtObs1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTFER_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtFeR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTKGR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtKgR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTCOR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtCoR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTESB_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtEsB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTPRT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtPrT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTPOT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtPoT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTENT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtMtR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTKGE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtKgE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTCOE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtCoE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTMTE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtMtE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption7I0( )
   {
   }

   public void e127I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV19Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char1, GXv_char2, GXv_char3) ;
      textsal_impl.this.A396EmprCod = GXv_char1[0] ;
      textsal_impl.this.AV16EmprNom = GXv_char2[0] ;
      textsal_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV24Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      textsal_impl.this.GXt_char4 = GXv_char3[0] ;
      AV24Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit0", AV24Lit0);
      GXt_char4 = AV25LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      textsal_impl.this.GXt_char4 = GXv_char3[0] ;
      AV25LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25LitFe", AV25LitFe);
      AV34Lit2 = httpContext.getMessage( "ORDEN TRABAJO EXTERNO", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit2", AV34Lit2);
      GXt_char4 = AV29Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN570_", ""), (byte)(99), GXv_char3) ;
      textsal_impl.this.GXt_char4 = GXv_char3[0] ;
      AV29Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit3", AV29Lit3);
      GXt_char4 = AV32Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT126_", ""), (byte)(99), GXv_char3) ;
      textsal_impl.this.GXt_char4 = GXv_char3[0] ;
      AV32Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit4", AV32Lit4);
      GXt_char4 = AV33Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1411_", ""), (byte)(99), GXv_char3) ;
      textsal_impl.this.GXt_char4 = GXv_char3[0] ;
      AV33Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit5", AV33Lit5);
      GXt_char4 = AV30Lit6 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT43_", ""), (byte)(99), GXv_char3) ;
      textsal_impl.this.GXt_char4 = GXv_char3[0] ;
      AV30Lit6 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit6", AV30Lit6);
      GXt_char4 = AV31Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      textsal_impl.this.GXt_char4 = GXv_char3[0] ;
      AV31Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit7", AV31Lit7);
      AV27Siltek = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Siltek", GXutil.str( AV27Siltek, 1, 0));
      GXv_int5[0] = AV27Siltek ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SILTEK", ""), GXv_int5) ;
      textsal_impl.this.AV27Siltek = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Siltek", GXutil.str( AV27Siltek, 1, 0));
      AV28Tespec = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Tespec", GXutil.str( AV28Tespec, 1, 0));
      GXv_int5[0] = AV28Tespec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TESPEC", ""), GXv_int5) ;
      textsal_impl.this.AV28Tespec = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Tespec", GXutil.str( AV28Tespec, 1, 0));
   }

   public void e137I2( )
   {
      /* 'Eliminar HDR' Routine */
      returnInSub = false ;
      if ( A2265BarExt < 2 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A2253SalExtAlb ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         new app.phdrde1(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int7, GXv_int5, GXv_char2) ;
         textsal_impl.this.A396EmprCod = GXv_char3[0] ;
         textsal_impl.this.A2253SalExtAlb = GXv_int6[0] ;
         textsal_impl.this.A129BarCod = GXv_int7[0] ;
         textsal_impl.this.A132BarCodReo = GXv_int5[0] ;
         textsal_impl.this.A130BarCodPar = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Eliminacion no permitida", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e147I2( )
   {
      /* 'Eliminar Albaran' Routine */
      returnInSub = false ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int7[0] = A2253SalExtAlb ;
      new app.phdrde2(remoteHandle, context).execute( GXv_char3, GXv_int7) ;
      textsal_impl.this.A396EmprCod = GXv_char3[0] ;
      textsal_impl.this.A2253SalExtAlb = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      /*  Sending Event outputs  */
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e117I2 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e117I2( )
   {
      /* Exit Routine */
      returnInSub = false ;
      GXv_char3[0] = AV21EmprCod ;
      GXv_int7[0] = AV22SalExtALb ;
      new app.phdrde3(remoteHandle, context).execute( GXv_char3, GXv_int7) ;
      textsal_impl.this.AV21EmprCod = GXv_char3[0] ;
      textsal_impl.this.AV22SalExtALb = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22SalExtALb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22SalExtALb), 8, 0));
      /*  Sending Event outputs  */
   }

   public void zm7I305( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2256SalExtFec = T007I10_A2256SalExtFec[0] ;
            Z2257SalExtEst = T007I10_A2257SalExtEst[0] ;
            Z2258SalExtLis = T007I10_A2258SalExtLis[0] ;
            Z2254SalExtSec = T007I10_A2254SalExtSec[0] ;
            Z840TrnCod = T007I10_A840TrnCod[0] ;
            Z2248ManCod = T007I10_A2248ManCod[0] ;
         }
         else
         {
            Z2256SalExtFec = A2256SalExtFec ;
            Z2257SalExtEst = A2257SalExtEst ;
            Z2258SalExtLis = A2258SalExtLis ;
            Z2254SalExtSec = A2254SalExtSec ;
            Z840TrnCod = A840TrnCod ;
            Z2248ManCod = A2248ManCod ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z2256SalExtFec = A2256SalExtFec ;
         Z2257SalExtEst = A2257SalExtEst ;
         Z2258SalExtLis = A2258SalExtLis ;
         Z2254SalExtSec = A2254SalExtSec ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z2248ManCod = A2248ManCod ;
         Z407EmprNom = A407EmprNom ;
         Z2249ManNom = A2249ManNom ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      /* Using cursor T007I11 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T007I11_A407EmprNom[0] ;
      n407EmprNom = T007I11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      AV21EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  )
      {
         AV20Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      }
      else
      {
         if ( isIns( )  )
         {
            AV20Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
         }
         else
         {
            if ( isDlt( )  )
            {
               AV20Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
            }
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida, pulse funcion Fn", ""), 1, "");
         AnyError = (short)(1) ;
      }
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A2256SalExtFec)) && ( Gx_BScreen == 0 ) )
      {
         A2256SalExtFec = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
      if ( isIns( )  && (0==A2257SalExtEst) && ( Gx_BScreen == 0 ) )
      {
         A2257SalExtEst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      }
      if ( isIns( )  && (0==A2258SalExtLis) && ( Gx_BScreen == 0 ) )
      {
         A2258SalExtLis = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
      }
   }

   public void load7I305( )
   {
      /* Using cursor T007I14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A407EmprNom = T007I14_A407EmprNom[0] ;
         n407EmprNom = T007I14_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2249ManNom = T007I14_A2249ManNom[0] ;
         n2249ManNom = T007I14_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         A841TrnNom = T007I14_A841TrnNom[0] ;
         n841TrnNom = T007I14_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A2256SalExtFec = T007I14_A2256SalExtFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A2257SalExtEst = T007I14_A2257SalExtEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
         A2258SalExtLis = T007I14_A2258SalExtLis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
         A2254SalExtSec = T007I14_A2254SalExtSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
         A840TrnCod = T007I14_A840TrnCod[0] ;
         n840TrnCod = T007I14_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A2248ManCod = T007I14_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         zm7I305( -25) ;
      }
      pr_default.close(11);
      onLoadActions7I305( ) ;
   }

   public void onLoadActions7I305( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable7I305( )
   {
      nIsDirty_305 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T007I12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T007I12_A841TrnNom[0] ;
      n841TrnNom = T007I12_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(9);
      /* Using cursor T007I13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Manufacturador Inexistente", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T007I13_A2249ManNom[0] ;
      n2249ManNom = T007I13_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      pr_default.close(10);
      if ( isIns( )  && ( ! (0==A2253SalExtAlb) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Albaran Inexistente", ""), 1, "SALEXTALB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (0==A2253SalExtAlb) )
      {
         GXv_int7[0] = A2253SalExtAlb ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTSAL", ""), GXv_int7) ;
         textsal_impl.this.A2253SalExtAlb = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
   }

   public void closeExtendedTableCursors7I305( )
   {
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_27( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T007I15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T007I15_A841TrnNom[0] ;
      n841TrnNom = T007I15_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_28( String A396EmprCod ,
                          short A2248ManCod )
   {
      /* Using cursor T007I16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Manufacturador Inexistente", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T007I16_A2249ManNom[0] ;
      n2249ManNom = T007I16_n2249ManNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2249ManNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey7I305( )
   {
      /* Using cursor T007I17 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound305 = (short)(1) ;
      }
      else
      {
         RcdFound305 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T007I10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T007I10_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm7I305( 25) ;
         RcdFound305 = (short)(1) ;
         A2253SalExtAlb = T007I10_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A2256SalExtFec = T007I10_A2256SalExtFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A2257SalExtEst = T007I10_A2257SalExtEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
         A2258SalExtLis = T007I10_A2258SalExtLis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
         A2254SalExtSec = T007I10_A2254SalExtSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
         A840TrnCod = T007I10_A840TrnCod[0] ;
         n840TrnCod = T007I10_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A2248ManCod = T007I10_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         sMode305 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load7I305( ) ;
         if ( AnyError == 1 )
         {
            RcdFound305 = (short)(0) ;
            initializeNonKey7I305( ) ;
         }
         Gx_mode = sMode305 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound305 = (short)(0) ;
         initializeNonKey7I305( ) ;
         sMode305 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode305 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey7I305( ) ;
      if ( RcdFound305 == 0 )
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
      RcdFound305 = (short)(0) ;
      /* Using cursor T007I18 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A2253SalExtAlb), A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T007I18_A2253SalExtAlb[0] < A2253SalExtAlb ) ) && ( GXutil.strcmp(T007I18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T007I18_A2253SalExtAlb[0] > A2253SalExtAlb ) ) && ( GXutil.strcmp(T007I18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A2253SalExtAlb = T007I18_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound305 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound305 = (short)(0) ;
      /* Using cursor T007I19 */
      pr_default.execute(16, new Object[] {Integer.valueOf(A2253SalExtAlb), A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( T007I19_A2253SalExtAlb[0] > A2253SalExtAlb ) ) && ( GXutil.strcmp(T007I19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( T007I19_A2253SalExtAlb[0] < A2253SalExtAlb ) ) && ( GXutil.strcmp(T007I19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A2253SalExtAlb = T007I19_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound305 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey7I305( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert7I305( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound305 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
            {
               A2253SalExtAlb = Z2253SalExtAlb ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update7I305( ) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert7I305( ) ;
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
                  GX_FocusControl = edtSalExtAlb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert7I305( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
      {
         A2253SalExtAlb = Z2253SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
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
      getKey7I305( ) ;
      if ( RcdFound305 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
         {
            A2253SalExtAlb = Z2253SalExtAlb ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "textsal");
      GX_FocusControl = edtManCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_7I0( ) ;
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
      if ( RcdFound305 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtManCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart7I305( ) ;
      if ( RcdFound305 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtManCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd7I305( ) ;
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
      if ( RcdFound305 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtManCod_Internalname ;
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
      if ( RcdFound305 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtManCod_Internalname ;
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
      scanStart7I305( ) ;
      if ( RcdFound305 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound305 != 0 )
         {
            scanNext7I305( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtManCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd7I305( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency7I305( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T007I9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXTSA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z2256SalExtFec), GXutil.resetTime(T007I9_A2256SalExtFec[0])) ) || ( Z2257SalExtEst != T007I9_A2257SalExtEst[0] ) || ( Z2258SalExtLis != T007I9_A2258SalExtLis[0] ) || ( GXutil.strcmp(Z2254SalExtSec, T007I9_A2254SalExtSec[0]) != 0 ) || ( Z840TrnCod != T007I9_A840TrnCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2248ManCod != T007I9_A2248ManCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2256SalExtFec), GXutil.resetTime(T007I9_A2256SalExtFec[0])) ) )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtFec");
               GXutil.writeLogRaw("Old: ",Z2256SalExtFec);
               GXutil.writeLogRaw("Current: ",T007I9_A2256SalExtFec[0]);
            }
            if ( Z2257SalExtEst != T007I9_A2257SalExtEst[0] )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtEst");
               GXutil.writeLogRaw("Old: ",Z2257SalExtEst);
               GXutil.writeLogRaw("Current: ",T007I9_A2257SalExtEst[0]);
            }
            if ( Z2258SalExtLis != T007I9_A2258SalExtLis[0] )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtLis");
               GXutil.writeLogRaw("Old: ",Z2258SalExtLis);
               GXutil.writeLogRaw("Current: ",T007I9_A2258SalExtLis[0]);
            }
            if ( GXutil.strcmp(Z2254SalExtSec, T007I9_A2254SalExtSec[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtSec");
               GXutil.writeLogRaw("Old: ",Z2254SalExtSec);
               GXutil.writeLogRaw("Current: ",T007I9_A2254SalExtSec[0]);
            }
            if ( Z840TrnCod != T007I9_A840TrnCod[0] )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T007I9_A840TrnCod[0]);
            }
            if ( Z2248ManCod != T007I9_A2248ManCod[0] )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"ManCod");
               GXutil.writeLogRaw("Old: ",Z2248ManCod);
               GXutil.writeLogRaw("Current: ",T007I9_A2248ManCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCEXTSA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert7I305( )
   {
      beforeValidate7I305( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7I305( ) ;
      }
      if ( AnyError == 0 )
      {
         zm7I305( 0) ;
         checkOptimisticConcurrency7I305( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm7I305( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert7I305( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007I20 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A2253SalExtAlb), A2256SalExtFec, Byte.valueOf(A2257SalExtEst), Byte.valueOf(A2258SalExtLis), A2254SalExtSec, A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Short.valueOf(A2248ManCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        processLevel7I305( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption7I0( ) ;
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
            load7I305( ) ;
         }
         endLevel7I305( ) ;
      }
      closeExtendedTableCursors7I305( ) ;
   }

   public void update7I305( )
   {
      beforeValidate7I305( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7I305( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency7I305( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm7I305( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate7I305( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007I21 */
                  pr_default.execute(18, new Object[] {A2256SalExtFec, Byte.valueOf(A2257SalExtEst), Byte.valueOf(A2258SalExtLis), A2254SalExtSec, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Short.valueOf(A2248ManCod), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXTSA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate7I305( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel7I305( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption7I0( ) ;
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
         endLevel7I305( ) ;
      }
      closeExtendedTableCursors7I305( ) ;
   }

   public void deferredUpdate7I305( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate7I305( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency7I305( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls7I305( ) ;
         afterConfirm7I305( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete7I305( ) ;
            if ( AnyError == 0 )
            {
               scanStart7I306( ) ;
               while ( RcdFound306 != 0 )
               {
                  getByPrimaryKey7I306( ) ;
                  delete7I306( ) ;
                  scanNext7I306( ) ;
               }
               scanEnd7I306( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007I22 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound305 == 0 )
                        {
                           initAll7I305( ) ;
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
                        resetCaption7I0( ) ;
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
      sMode305 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel7I305( ) ;
      Gx_mode = sMode305 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls7I305( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( ! (0==A2253SalExtAlb) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Albaran Inexistente", ""), 1, "SALEXTALB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSalExtAlb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  && (0==A2253SalExtAlb) )
         {
            GXv_int7[0] = A2253SalExtAlb ;
            new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTSAL", ""), GXv_int7) ;
            textsal_impl.this.A2253SalExtAlb = GXv_int7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         }
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T007I23 */
         pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T007I23_A2249ManNom[0] ;
         n2249ManNom = T007I23_n2249ManNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
         pr_default.close(20);
         /* Using cursor T007I24 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T007I24_A841TrnNom[0] ;
         n841TrnNom = T007I24_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(21);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T007I25 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EXHDPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void processNestedLevel7I306( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow7I306( ) ;
         if ( ( nRcdExists_306 != 0 ) || ( nIsMod_306 != 0 ) )
         {
            standaloneNotModal7I306( ) ;
            getKey7I306( ) ;
            if ( ( nRcdExists_306 == 0 ) && ( nRcdDeleted_306 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert7I306( ) ;
            }
            else
            {
               if ( RcdFound306 != 0 )
               {
                  if ( ( nRcdDeleted_306 != 0 ) && ( nRcdExists_306 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete7I306( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_306 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update7I306( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_306 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_306_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarExt_Internalname, GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarMat_Internalname, GXutil.rtrim( A182BarMat)) ;
         httpContext.changePostValue( edtBarNMtr_Internalname, GXutil.rtrim( A1500BarNMtr)) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtBarPieNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipConCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1157TipConCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipConDsc_Internalname, GXutil.rtrim( A997TipConDsc)) ;
         httpContext.changePostValue( edtSalExtObs1_Internalname, GXutil.rtrim( A2255SalExtObs1)) ;
         httpContext.changePostValue( edtSalExtFeR_Internalname, localUtil.format(A2259SalExtFeR, "99/99/99")) ;
         httpContext.changePostValue( edtSalExtKgR_Internalname, GXutil.ltrim( localUtil.ntoc( A2260SalExtKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtCoR_Internalname, GXutil.ltrim( localUtil.ntoc( A2261SalExtCoR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtEsB_Internalname, GXutil.ltrim( localUtil.ntoc( A2262SalExtEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtPrT_Internalname, GXutil.rtrim( A2263SalExtPrT)) ;
         httpContext.changePostValue( edtSalExtPoT_Internalname, GXutil.rtrim( A2264SalExtPoT)) ;
         httpContext.changePostValue( edtSalExtEnt_Internalname, GXutil.rtrim( A2757SalExtEnt)) ;
         httpContext.changePostValue( edtSalExtMtR_Internalname, GXutil.ltrim( localUtil.ntoc( A2840SalExtMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtKgE_Internalname, GXutil.ltrim( localUtil.ntoc( A3555SalExtKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtCoE_Internalname, GXutil.ltrim( localUtil.ntoc( A3556SalExtCoE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSalExtMtE_Internalname, GXutil.ltrim( localUtil.ntoc( A3557SalExtMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_75_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z3556SalExtCoE_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z3556SalExtCoE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2255SalExtObs1_"+sGXsfl_75_idx, GXutil.rtrim( Z2255SalExtObs1)) ;
         httpContext.changePostValue( "ZT_"+"Z2259SalExtFeR_"+sGXsfl_75_idx, localUtil.dtoc( Z2259SalExtFeR, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z2260SalExtKgR_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2260SalExtKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2261SalExtCoR_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2261SalExtCoR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2262SalExtEsB_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2262SalExtEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2263SalExtPrT_"+sGXsfl_75_idx, GXutil.rtrim( Z2263SalExtPrT)) ;
         httpContext.changePostValue( "ZT_"+"Z2264SalExtPoT_"+sGXsfl_75_idx, GXutil.rtrim( Z2264SalExtPoT)) ;
         httpContext.changePostValue( "ZT_"+"Z2757SalExtEnt_"+sGXsfl_75_idx, GXutil.rtrim( Z2757SalExtEnt)) ;
         httpContext.changePostValue( "ZT_"+"Z2840SalExtMtR_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2840SalExtMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3555SalExtKgE_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z3555SalExtKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3557SalExtMtE_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z3557SalExtMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_75_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_306_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_306_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_306_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_306 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_306_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_306_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAREXT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarExt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMAT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIENDES_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieNDes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCONCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipConCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCONDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipConDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTOBS1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtObs1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTFER_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtFeR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTKGR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtKgR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTCOR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtCoR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTESB_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtEsB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTPRT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtPrT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTPOT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtPoT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTENT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtMtR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTKGE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtKgE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTCOE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtCoE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SALEXTMTE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtMtE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll7I306( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_306 = (short)(0) ;
      nIsMod_306 = (short)(0) ;
      nRcdDeleted_306 = (short)(0) ;
   }

   public void processLevel7I305( )
   {
      /* Save parent mode. */
      sMode305 = Gx_mode ;
      processNestedLevel7I306( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode305 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel7I305( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete7I305( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "textsal");
         if ( AnyError == 0 )
         {
            confirmValues7I0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "textsal");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart7I305( )
   {
      /* Scan By routine */
      /* Using cursor T007I26 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      RcdFound305 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A2253SalExtAlb = T007I26_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext7I305( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound305 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A2253SalExtAlb = T007I26_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
   }

   public void scanEnd7I305( )
   {
      pr_default.close(23);
   }

   public void afterConfirm7I305( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert7I305( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate7I305( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete7I305( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete7I305( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate7I305( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes7I305( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtSalExtAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtManNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManNom_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtSalExtFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtFec_Enabled), 5, 0), true);
      edtSalExtEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtEst_Enabled), 5, 0), true);
      edtSalExtLis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtLis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtLis_Enabled), 5, 0), true);
      edtSalExtSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtSec_Enabled), 5, 0), true);
   }

   public void zm7I306( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3556SalExtCoE = T007I3_A3556SalExtCoE[0] ;
            Z2255SalExtObs1 = T007I3_A2255SalExtObs1[0] ;
            Z2259SalExtFeR = T007I3_A2259SalExtFeR[0] ;
            Z2260SalExtKgR = T007I3_A2260SalExtKgR[0] ;
            Z2261SalExtCoR = T007I3_A2261SalExtCoR[0] ;
            Z2262SalExtEsB = T007I3_A2262SalExtEsB[0] ;
            Z2263SalExtPrT = T007I3_A2263SalExtPrT[0] ;
            Z2264SalExtPoT = T007I3_A2264SalExtPoT[0] ;
            Z2757SalExtEnt = T007I3_A2757SalExtEnt[0] ;
            Z2840SalExtMtR = T007I3_A2840SalExtMtR[0] ;
            Z3555SalExtKgE = T007I3_A3555SalExtKgE[0] ;
            Z3557SalExtMtE = T007I3_A3557SalExtMtE[0] ;
            Z457FasCod = T007I3_A457FasCod[0] ;
         }
         else
         {
            Z3556SalExtCoE = A3556SalExtCoE ;
            Z2255SalExtObs1 = A2255SalExtObs1 ;
            Z2259SalExtFeR = A2259SalExtFeR ;
            Z2260SalExtKgR = A2260SalExtKgR ;
            Z2261SalExtCoR = A2261SalExtCoR ;
            Z2262SalExtEsB = A2262SalExtEsB ;
            Z2263SalExtPrT = A2263SalExtPrT ;
            Z2264SalExtPoT = A2264SalExtPoT ;
            Z2757SalExtEnt = A2757SalExtEnt ;
            Z2840SalExtMtR = A2840SalExtMtR ;
            Z3555SalExtKgE = A3555SalExtKgE ;
            Z3557SalExtMtE = A3557SalExtMtE ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z3556SalExtCoE = A3556SalExtCoE ;
         Z2255SalExtObs1 = A2255SalExtObs1 ;
         Z2259SalExtFeR = A2259SalExtFeR ;
         Z2260SalExtKgR = A2260SalExtKgR ;
         Z2261SalExtCoR = A2261SalExtCoR ;
         Z2262SalExtEsB = A2262SalExtEsB ;
         Z2263SalExtPrT = A2263SalExtPrT ;
         Z2264SalExtPoT = A2264SalExtPoT ;
         Z2757SalExtEnt = A2757SalExtEnt ;
         Z2840SalExtMtR = A2840SalExtMtR ;
         Z3555SalExtKgE = A3555SalExtKgE ;
         Z3557SalExtMtE = A3557SalExtMtE ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z361DisCod = A361DisCod ;
         Z2265BarExt = A2265BarExt ;
         Z212BarSer = A212BarSer ;
         Z182BarMat = A182BarMat ;
         Z1500BarNMtr = A1500BarNMtr ;
         Z1157TipConCod = A1157TipConCod ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal7I306( )
   {
      edtTipConCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipConCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      if ( true /* Level */ )
      {
         AV22SalExtALb = A2253SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22SalExtALb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22SalExtALb), 8, 0));
      }
   }

   public void standaloneModal7I306( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida, pulse funcion Fn", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load7I306( )
   {
      /* Using cursor T007I28 */
      pr_default.execute(24, new Object[] {Integer.valueOf(A2253SalExtAlb), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound306 = (short)(1) ;
         A361DisCod = T007I28_A361DisCod[0] ;
         A3556SalExtCoE = T007I28_A3556SalExtCoE[0] ;
         n3556SalExtCoE = T007I28_n3556SalExtCoE[0] ;
         A2265BarExt = T007I28_A2265BarExt[0] ;
         n2265BarExt = T007I28_n2265BarExt[0] ;
         A212BarSer = T007I28_A212BarSer[0] ;
         A182BarMat = T007I28_A182BarMat[0] ;
         A1500BarNMtr = T007I28_A1500BarNMtr[0] ;
         A460FasDsc = T007I28_A460FasDsc[0] ;
         A2255SalExtObs1 = T007I28_A2255SalExtObs1[0] ;
         n2255SalExtObs1 = T007I28_n2255SalExtObs1[0] ;
         A2259SalExtFeR = T007I28_A2259SalExtFeR[0] ;
         n2259SalExtFeR = T007I28_n2259SalExtFeR[0] ;
         A2260SalExtKgR = T007I28_A2260SalExtKgR[0] ;
         n2260SalExtKgR = T007I28_n2260SalExtKgR[0] ;
         A2261SalExtCoR = T007I28_A2261SalExtCoR[0] ;
         n2261SalExtCoR = T007I28_n2261SalExtCoR[0] ;
         A2262SalExtEsB = T007I28_A2262SalExtEsB[0] ;
         n2262SalExtEsB = T007I28_n2262SalExtEsB[0] ;
         A2263SalExtPrT = T007I28_A2263SalExtPrT[0] ;
         n2263SalExtPrT = T007I28_n2263SalExtPrT[0] ;
         A2264SalExtPoT = T007I28_A2264SalExtPoT[0] ;
         n2264SalExtPoT = T007I28_n2264SalExtPoT[0] ;
         A2757SalExtEnt = T007I28_A2757SalExtEnt[0] ;
         n2757SalExtEnt = T007I28_n2757SalExtEnt[0] ;
         A2840SalExtMtR = T007I28_A2840SalExtMtR[0] ;
         n2840SalExtMtR = T007I28_n2840SalExtMtR[0] ;
         A3555SalExtKgE = T007I28_A3555SalExtKgE[0] ;
         n3555SalExtKgE = T007I28_n3555SalExtKgE[0] ;
         A3557SalExtMtE = T007I28_A3557SalExtMtE[0] ;
         n3557SalExtMtE = T007I28_n3557SalExtMtE[0] ;
         A457FasCod = T007I28_A457FasCod[0] ;
         n457FasCod = T007I28_n457FasCod[0] ;
         A1157TipConCod = T007I28_A1157TipConCod[0] ;
         n1157TipConCod = T007I28_n1157TipConCod[0] ;
         A898BarPieNDes = T007I28_A898BarPieNDes[0] ;
         n898BarPieNDes = T007I28_n898BarPieNDes[0] ;
         zm7I306( -29) ;
      }
      pr_default.close(24);
      onLoadActions7I306( ) ;
   }

   public void onLoadActions7I306( )
   {
      if ( true /* After */ )
      {
         GXt_decimal8 = AV23Kilos ;
         GXv_decimal9[0] = GXt_decimal8 ;
         new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal9) ;
         textsal_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
         AV23Kilos = GXt_decimal8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
      }
      if ( true /* After */ )
      {
         GXt_decimal8 = AV26Metros ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_decimal9[0] = GXt_decimal8 ;
         new app.pmtsext(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int5, GXv_char2, GXv_decimal9) ;
         textsal_impl.this.A396EmprCod = GXv_char3[0] ;
         textsal_impl.this.A129BarCod = GXv_int7[0] ;
         textsal_impl.this.A132BarCodReo = GXv_int5[0] ;
         textsal_impl.this.A130BarCodPar = GXv_char2[0] ;
         textsal_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV26Metros = GXt_decimal8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
      }
   }

   public void checkExtendedTable7I306( )
   {
      nIsDirty_306 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal7I306( ) ;
      /* Using cursor T007I4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T007I4_A460FasDsc[0] ;
      pr_default.close(2);
      if ( ( A2265BarExt == 2 ) && true /* After */ && true /* Level */ )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "HDR ya Recepcionada", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T007I5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hdr Inexistente", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T007I5_A361DisCod[0] ;
      A2265BarExt = T007I5_A2265BarExt[0] ;
      n2265BarExt = T007I5_n2265BarExt[0] ;
      A212BarSer = T007I5_A212BarSer[0] ;
      A182BarMat = T007I5_A182BarMat[0] ;
      A1500BarNMtr = T007I5_A1500BarNMtr[0] ;
      pr_default.close(3);
      /* Using cursor T007I6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A1157TipConCod = T007I6_A1157TipConCod[0] ;
      n1157TipConCod = T007I6_n1157TipConCod[0] ;
      pr_default.close(4);
      /* Using cursor T007I8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A898BarPieNDes = T007I8_A898BarPieNDes[0] ;
         n898BarPieNDes = T007I8_n898BarPieNDes[0] ;
      }
      else
      {
         nIsDirty_306 = (short)(1) ;
         A898BarPieNDes = 0 ;
         n898BarPieNDes = false ;
      }
      pr_default.close(5);
      if ( true /* After */ )
      {
         GXt_decimal8 = AV23Kilos ;
         GXv_decimal9[0] = GXt_decimal8 ;
         new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal9) ;
         textsal_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
         AV23Kilos = GXt_decimal8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
      }
      if ( true /* After */ )
      {
         GXt_decimal8 = AV26Metros ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_decimal9[0] = GXt_decimal8 ;
         new app.pmtsext(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int5, GXv_char2, GXv_decimal9) ;
         textsal_impl.this.A396EmprCod = GXv_char3[0] ;
         textsal_impl.this.A129BarCod = GXv_int7[0] ;
         textsal_impl.this.A132BarCodReo = GXv_int5[0] ;
         textsal_impl.this.A130BarCodPar = GXv_char2[0] ;
         textsal_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV26Metros = GXt_decimal8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
      }
      if ( ! ( ( GXutil.strcmp(A2263SalExtPrT, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A2263SalExtPrT, httpContext.getMessage( "N", "")) == 0 ) ) )
      {
         GXCCtl = "SALEXTPRT_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor diferente de S o N", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtPrT_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A2264SalExtPoT, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A2264SalExtPoT, httpContext.getMessage( "N", "")) == 0 ) ) )
      {
         GXCCtl = "SALEXTPOT_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor diferente de S o N", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtPoT_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors7I306( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable7I306( )
   {
   }

   public void gxload_30( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T007I29 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T007I29_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void gxload_31( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T007I30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hdr Inexistente", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T007I30_A361DisCod[0] ;
      A2265BarExt = T007I30_A2265BarExt[0] ;
      n2265BarExt = T007I30_n2265BarExt[0] ;
      A212BarSer = T007I30_A212BarSer[0] ;
      A182BarMat = T007I30_A182BarMat[0] ;
      A1500BarNMtr = T007I30_A1500BarNMtr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A182BarMat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1500BarNMtr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void gxload_32( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T007I31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A1157TipConCod = T007I31_A1157TipConCod[0] ;
      n1157TipConCod = T007I31_n1157TipConCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1157TipConCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(27) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(27);
   }

   public void gxload_33( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T007I33 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A898BarPieNDes = T007I33_A898BarPieNDes[0] ;
         n898BarPieNDes = T007I33_n898BarPieNDes[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         n898BarPieNDes = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void getKey7I306( )
   {
      /* Using cursor T007I34 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound306 = (short)(1) ;
      }
      else
      {
         RcdFound306 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey7I306( )
   {
      /* Using cursor T007I3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T007I3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm7I306( 29) ;
         RcdFound306 = (short)(1) ;
         initializeNonKey7I306( ) ;
         A3556SalExtCoE = T007I3_A3556SalExtCoE[0] ;
         n3556SalExtCoE = T007I3_n3556SalExtCoE[0] ;
         A2255SalExtObs1 = T007I3_A2255SalExtObs1[0] ;
         n2255SalExtObs1 = T007I3_n2255SalExtObs1[0] ;
         A2259SalExtFeR = T007I3_A2259SalExtFeR[0] ;
         n2259SalExtFeR = T007I3_n2259SalExtFeR[0] ;
         A2260SalExtKgR = T007I3_A2260SalExtKgR[0] ;
         n2260SalExtKgR = T007I3_n2260SalExtKgR[0] ;
         A2261SalExtCoR = T007I3_A2261SalExtCoR[0] ;
         n2261SalExtCoR = T007I3_n2261SalExtCoR[0] ;
         A2262SalExtEsB = T007I3_A2262SalExtEsB[0] ;
         n2262SalExtEsB = T007I3_n2262SalExtEsB[0] ;
         A2263SalExtPrT = T007I3_A2263SalExtPrT[0] ;
         n2263SalExtPrT = T007I3_n2263SalExtPrT[0] ;
         A2264SalExtPoT = T007I3_A2264SalExtPoT[0] ;
         n2264SalExtPoT = T007I3_n2264SalExtPoT[0] ;
         A2757SalExtEnt = T007I3_A2757SalExtEnt[0] ;
         n2757SalExtEnt = T007I3_n2757SalExtEnt[0] ;
         A2840SalExtMtR = T007I3_A2840SalExtMtR[0] ;
         n2840SalExtMtR = T007I3_n2840SalExtMtR[0] ;
         A3555SalExtKgE = T007I3_A3555SalExtKgE[0] ;
         n3555SalExtKgE = T007I3_n3555SalExtKgE[0] ;
         A3557SalExtMtE = T007I3_A3557SalExtMtE[0] ;
         n3557SalExtMtE = T007I3_n3557SalExtMtE[0] ;
         A457FasCod = T007I3_A457FasCod[0] ;
         n457FasCod = T007I3_n457FasCod[0] ;
         A129BarCod = T007I3_A129BarCod[0] ;
         A132BarCodReo = T007I3_A132BarCodReo[0] ;
         A130BarCodPar = T007I3_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode306 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal7I306( ) ;
         load7I306( ) ;
         Gx_mode = sMode306 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound306 = (short)(0) ;
         initializeNonKey7I306( ) ;
         sMode306 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal7I306( ) ;
         Gx_mode = sMode306 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes7I306( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency7I306( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T007I2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLEXTSA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z3556SalExtCoE != T007I2_A3556SalExtCoE[0] ) || ( GXutil.strcmp(Z2255SalExtObs1, T007I2_A2255SalExtObs1[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z2259SalExtFeR), GXutil.resetTime(T007I2_A2259SalExtFeR[0])) ) || ( DecimalUtil.compareTo(Z2260SalExtKgR, T007I2_A2260SalExtKgR[0]) != 0 ) || ( Z2261SalExtCoR != T007I2_A2261SalExtCoR[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2262SalExtEsB != T007I2_A2262SalExtEsB[0] ) || ( GXutil.strcmp(Z2263SalExtPrT, T007I2_A2263SalExtPrT[0]) != 0 ) || ( GXutil.strcmp(Z2264SalExtPoT, T007I2_A2264SalExtPoT[0]) != 0 ) || ( GXutil.strcmp(Z2757SalExtEnt, T007I2_A2757SalExtEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z2840SalExtMtR, T007I2_A2840SalExtMtR[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3555SalExtKgE, T007I2_A3555SalExtKgE[0]) != 0 ) || ( DecimalUtil.compareTo(Z3557SalExtMtE, T007I2_A3557SalExtMtE[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T007I2_A457FasCod[0]) != 0 ) )
         {
            if ( Z3556SalExtCoE != T007I2_A3556SalExtCoE[0] )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtCoE");
               GXutil.writeLogRaw("Old: ",Z3556SalExtCoE);
               GXutil.writeLogRaw("Current: ",T007I2_A3556SalExtCoE[0]);
            }
            if ( GXutil.strcmp(Z2255SalExtObs1, T007I2_A2255SalExtObs1[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtObs1");
               GXutil.writeLogRaw("Old: ",Z2255SalExtObs1);
               GXutil.writeLogRaw("Current: ",T007I2_A2255SalExtObs1[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2259SalExtFeR), GXutil.resetTime(T007I2_A2259SalExtFeR[0])) ) )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtFeR");
               GXutil.writeLogRaw("Old: ",Z2259SalExtFeR);
               GXutil.writeLogRaw("Current: ",T007I2_A2259SalExtFeR[0]);
            }
            if ( DecimalUtil.compareTo(Z2260SalExtKgR, T007I2_A2260SalExtKgR[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtKgR");
               GXutil.writeLogRaw("Old: ",Z2260SalExtKgR);
               GXutil.writeLogRaw("Current: ",T007I2_A2260SalExtKgR[0]);
            }
            if ( Z2261SalExtCoR != T007I2_A2261SalExtCoR[0] )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtCoR");
               GXutil.writeLogRaw("Old: ",Z2261SalExtCoR);
               GXutil.writeLogRaw("Current: ",T007I2_A2261SalExtCoR[0]);
            }
            if ( Z2262SalExtEsB != T007I2_A2262SalExtEsB[0] )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtEsB");
               GXutil.writeLogRaw("Old: ",Z2262SalExtEsB);
               GXutil.writeLogRaw("Current: ",T007I2_A2262SalExtEsB[0]);
            }
            if ( GXutil.strcmp(Z2263SalExtPrT, T007I2_A2263SalExtPrT[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtPrT");
               GXutil.writeLogRaw("Old: ",Z2263SalExtPrT);
               GXutil.writeLogRaw("Current: ",T007I2_A2263SalExtPrT[0]);
            }
            if ( GXutil.strcmp(Z2264SalExtPoT, T007I2_A2264SalExtPoT[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtPoT");
               GXutil.writeLogRaw("Old: ",Z2264SalExtPoT);
               GXutil.writeLogRaw("Current: ",T007I2_A2264SalExtPoT[0]);
            }
            if ( GXutil.strcmp(Z2757SalExtEnt, T007I2_A2757SalExtEnt[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtEnt");
               GXutil.writeLogRaw("Old: ",Z2757SalExtEnt);
               GXutil.writeLogRaw("Current: ",T007I2_A2757SalExtEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z2840SalExtMtR, T007I2_A2840SalExtMtR[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtMtR");
               GXutil.writeLogRaw("Old: ",Z2840SalExtMtR);
               GXutil.writeLogRaw("Current: ",T007I2_A2840SalExtMtR[0]);
            }
            if ( DecimalUtil.compareTo(Z3555SalExtKgE, T007I2_A3555SalExtKgE[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtKgE");
               GXutil.writeLogRaw("Old: ",Z3555SalExtKgE);
               GXutil.writeLogRaw("Current: ",T007I2_A3555SalExtKgE[0]);
            }
            if ( DecimalUtil.compareTo(Z3557SalExtMtE, T007I2_A3557SalExtMtE[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"SalExtMtE");
               GXutil.writeLogRaw("Old: ",Z3557SalExtMtE);
               GXutil.writeLogRaw("Current: ",T007I2_A3557SalExtMtE[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T007I2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("textsal:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T007I2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLEXTSA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert7I306( )
   {
      beforeValidate7I306( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7I306( ) ;
      }
      if ( AnyError == 0 )
      {
         zm7I306( 0) ;
         checkOptimisticConcurrency7I306( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm7I306( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert7I306( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T007I35 */
                  pr_default.execute(30, new Object[] {Integer.valueOf(A2253SalExtAlb), Boolean.valueOf(n3556SalExtCoE), Short.valueOf(A3556SalExtCoE), Boolean.valueOf(n2255SalExtObs1), A2255SalExtObs1, Boolean.valueOf(n2259SalExtFeR), A2259SalExtFeR, Boolean.valueOf(n2260SalExtKgR), A2260SalExtKgR, Boolean.valueOf(n2261SalExtCoR), Short.valueOf(A2261SalExtCoR), Boolean.valueOf(n2262SalExtEsB), Byte.valueOf(A2262SalExtEsB), Boolean.valueOf(n2263SalExtPrT), A2263SalExtPrT, Boolean.valueOf(n2264SalExtPoT), A2264SalExtPoT, Boolean.valueOf(n2757SalExtEnt), A2757SalExtEnt, Boolean.valueOf(n2840SalExtMtR), A2840SalExtMtR, Boolean.valueOf(n3555SalExtKgE), A3555SalExtKgE, Boolean.valueOf(n3557SalExtMtE), A3557SalExtMtE, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTSA");
                  if ( (pr_default.getStatus(30) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* Level */ && true /* After */ )
                     {
                        GXv_char3[0] = A396EmprCod ;
                        GXv_int7[0] = A129BarCod ;
                        GXv_int5[0] = A132BarCodReo ;
                        GXv_char2[0] = A130BarCodPar ;
                        GXv_char1[0] = A457FasCod ;
                        GXv_date10[0] = A2256SalExtFec ;
                        GXv_int11[0] = (byte)(1) ;
                        GXv_int6[0] = A2253SalExtAlb ;
                        new app.phdrext(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int5, GXv_char2, GXv_char1, GXv_date10, GXv_int11, GXv_int6) ;
                        textsal_impl.this.A396EmprCod = GXv_char3[0] ;
                        textsal_impl.this.A129BarCod = GXv_int7[0] ;
                        textsal_impl.this.A132BarCodReo = GXv_int5[0] ;
                        textsal_impl.this.A130BarCodPar = GXv_char2[0] ;
                        textsal_impl.this.A457FasCod = GXv_char1[0] ;
                        textsal_impl.this.A2256SalExtFec = GXv_date10[0] ;
                        textsal_impl.this.A2253SalExtAlb = GXv_int6[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
                        httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
                     }
                     if ( true /* Level */ && true /* After */ )
                     {
                        GXv_char3[0] = A396EmprCod ;
                        GXv_int12[0] = A2248ManCod ;
                        GXv_char2[0] = A457FasCod ;
                        GXv_char1[0] = httpContext.getMessage( "E", "") ;
                        GXv_int7[0] = A2253SalExtAlb ;
                        GXv_decimal9[0] = AV23Kilos ;
                        GXv_decimal13[0] = AV26Metros ;
                        GXv_int14[0] = (short)(A898BarPieNDes) ;
                        GXv_date10[0] = A2256SalExtFec ;
                        GXv_int6[0] = A129BarCod ;
                        GXv_int11[0] = A132BarCodReo ;
                        GXv_char15[0] = A130BarCodPar ;
                        new app.pamvhdr(remoteHandle, context).execute( GXv_char3, GXv_int12, GXv_char2, GXv_char1, GXv_int7, GXv_decimal9, GXv_decimal13, GXv_int14, GXv_date10, GXv_int6, GXv_int11, GXv_char15) ;
                        textsal_impl.this.A396EmprCod = GXv_char3[0] ;
                        textsal_impl.this.A2248ManCod = GXv_int12[0] ;
                        textsal_impl.this.A457FasCod = GXv_char2[0] ;
                        textsal_impl.this.A2253SalExtAlb = GXv_int7[0] ;
                        textsal_impl.this.AV23Kilos = GXv_decimal9[0] ;
                        textsal_impl.this.AV26Metros = GXv_decimal13[0] ;
                        textsal_impl.this.A898BarPieNDes = GXv_int14[0] ;
                        textsal_impl.this.A2256SalExtFec = GXv_date10[0] ;
                        textsal_impl.this.A129BarCod = GXv_int6[0] ;
                        textsal_impl.this.A132BarCodReo = GXv_int11[0] ;
                        textsal_impl.this.A130BarCodPar = GXv_char15[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
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
            load7I306( ) ;
         }
         endLevel7I306( ) ;
      }
      closeExtendedTableCursors7I306( ) ;
   }

   public void update7I306( )
   {
      beforeValidate7I306( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable7I306( ) ;
      }
      if ( ( nIsMod_306 != 0 ) || ( nIsDirty_306 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency7I306( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm7I306( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate7I306( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T007I36 */
                     pr_default.execute(31, new Object[] {Boolean.valueOf(n3556SalExtCoE), Short.valueOf(A3556SalExtCoE), Boolean.valueOf(n2255SalExtObs1), A2255SalExtObs1, Boolean.valueOf(n2259SalExtFeR), A2259SalExtFeR, Boolean.valueOf(n2260SalExtKgR), A2260SalExtKgR, Boolean.valueOf(n2261SalExtCoR), Short.valueOf(A2261SalExtCoR), Boolean.valueOf(n2262SalExtEsB), Byte.valueOf(A2262SalExtEsB), Boolean.valueOf(n2263SalExtPrT), A2263SalExtPrT, Boolean.valueOf(n2264SalExtPoT), A2264SalExtPoT, Boolean.valueOf(n2757SalExtEnt), A2757SalExtEnt, Boolean.valueOf(n2840SalExtMtR), A2840SalExtMtR, Boolean.valueOf(n3555SalExtKgE), A3555SalExtKgE, Boolean.valueOf(n3557SalExtMtE), A3557SalExtMtE, Boolean.valueOf(n457FasCod), A457FasCod, A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTSA");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLEXTSA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate7I306( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* Level */ && true /* After */ )
                        {
                           GXv_char15[0] = A396EmprCod ;
                           GXv_int14[0] = A2248ManCod ;
                           GXv_char3[0] = A457FasCod ;
                           GXv_char2[0] = httpContext.getMessage( "E", "") ;
                           GXv_int7[0] = A2253SalExtAlb ;
                           GXv_int6[0] = A129BarCod ;
                           GXv_int11[0] = A132BarCodReo ;
                           GXv_char1[0] = A130BarCodPar ;
                           GXv_decimal13[0] = AV23Kilos ;
                           GXv_decimal9[0] = AV23Kilos ;
                           GXv_decimal16[0] = AV26Metros ;
                           GXv_decimal17[0] = AV26Metros ;
                           GXv_int12[0] = (short)(A898BarPieNDes) ;
                           GXv_int18[0] = (short)(A898BarPieNDes) ;
                           GXv_date10[0] = A2256SalExtFec ;
                           new app.pmmvhdr(remoteHandle, context).execute( GXv_char15, GXv_int14, GXv_char3, GXv_char2, GXv_int7, GXv_int6, GXv_int11, GXv_char1, GXv_decimal13, GXv_decimal9, GXv_decimal16, GXv_decimal17, GXv_int12, GXv_int18, GXv_date10) ;
                           textsal_impl.this.A396EmprCod = GXv_char15[0] ;
                           textsal_impl.this.A2248ManCod = GXv_int14[0] ;
                           textsal_impl.this.A457FasCod = GXv_char3[0] ;
                           textsal_impl.this.A2253SalExtAlb = GXv_int7[0] ;
                           textsal_impl.this.A129BarCod = GXv_int6[0] ;
                           textsal_impl.this.A132BarCodReo = GXv_int11[0] ;
                           textsal_impl.this.A130BarCodPar = GXv_char1[0] ;
                           textsal_impl.this.AV23Kilos = GXv_decimal13[0] ;
                           textsal_impl.this.AV23Kilos = GXv_decimal9[0] ;
                           textsal_impl.this.AV26Metros = GXv_decimal16[0] ;
                           textsal_impl.this.AV26Metros = GXv_decimal17[0] ;
                           textsal_impl.this.A898BarPieNDes = GXv_int12[0] ;
                           textsal_impl.this.A898BarPieNDes = GXv_int18[0] ;
                           textsal_impl.this.A2256SalExtFec = GXv_date10[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey7I306( ) ;
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
            endLevel7I306( ) ;
         }
      }
      closeExtendedTableCursors7I306( ) ;
   }

   public void deferredUpdate7I306( )
   {
   }

   public void delete7I306( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate7I306( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency7I306( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls7I306( ) ;
         afterConfirm7I306( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete7I306( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T007I37 */
               pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTSA");
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
      sMode306 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel7I306( ) ;
      Gx_mode = sMode306 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls7I306( )
   {
      standaloneModal7I306( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T007I38 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A361DisCod = T007I38_A361DisCod[0] ;
         A2265BarExt = T007I38_A2265BarExt[0] ;
         n2265BarExt = T007I38_n2265BarExt[0] ;
         A212BarSer = T007I38_A212BarSer[0] ;
         A182BarMat = T007I38_A182BarMat[0] ;
         A1500BarNMtr = T007I38_A1500BarNMtr[0] ;
         pr_default.close(33);
         /* Using cursor T007I39 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A1157TipConCod = T007I39_A1157TipConCod[0] ;
         n1157TipConCod = T007I39_n1157TipConCod[0] ;
         pr_default.close(34);
         /* Using cursor T007I41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            A898BarPieNDes = T007I41_A898BarPieNDes[0] ;
            n898BarPieNDes = T007I41_n898BarPieNDes[0] ;
         }
         else
         {
            A898BarPieNDes = 0 ;
            n898BarPieNDes = false ;
         }
         pr_default.close(35);
         if ( true /* After */ )
         {
            GXt_decimal8 = AV23Kilos ;
            GXv_decimal17[0] = GXt_decimal8 ;
            new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal17) ;
            textsal_impl.this.GXt_decimal8 = GXv_decimal17[0] ;
            AV23Kilos = GXt_decimal8 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
         }
         if ( true /* After */ )
         {
            GXt_decimal8 = AV26Metros ;
            GXv_char15[0] = A396EmprCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int11[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            GXv_decimal17[0] = GXt_decimal8 ;
            new app.pmtsext(remoteHandle, context).execute( GXv_char15, GXv_int7, GXv_int11, GXv_char3, GXv_decimal17) ;
            textsal_impl.this.A396EmprCod = GXv_char15[0] ;
            textsal_impl.this.A129BarCod = GXv_int7[0] ;
            textsal_impl.this.A132BarCodReo = GXv_int11[0] ;
            textsal_impl.this.A130BarCodPar = GXv_char3[0] ;
            textsal_impl.this.GXt_decimal8 = GXv_decimal17[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            AV26Metros = GXt_decimal8 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
         }
         /* Using cursor T007I42 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         A460FasDsc = T007I42_A460FasDsc[0] ;
         pr_default.close(36);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T007I43 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EXHDPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
      }
   }

   public void endLevel7I306( )
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

   public void scanStart7I306( )
   {
      /* Scan By routine */
      /* Using cursor T007I44 */
      pr_default.execute(38, new Object[] {Integer.valueOf(A2253SalExtAlb), A396EmprCod});
      RcdFound306 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound306 = (short)(1) ;
         A129BarCod = T007I44_A129BarCod[0] ;
         A132BarCodReo = T007I44_A132BarCodReo[0] ;
         A130BarCodPar = T007I44_A130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext7I306( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound306 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound306 = (short)(1) ;
         A129BarCod = T007I44_A129BarCod[0] ;
         A132BarCodReo = T007I44_A132BarCodReo[0] ;
         A130BarCodPar = T007I44_A130BarCodPar[0] ;
      }
   }

   public void scanEnd7I306( )
   {
      pr_default.close(38);
   }

   public void afterConfirm7I306( )
   {
      /* After Confirm Rules */
      if ( true /* After */ )
      {
         A3555SalExtKgE = AV23Kilos ;
         n3555SalExtKgE = false ;
      }
      if ( true /* After */ )
      {
         A3557SalExtMtE = AV26Metros ;
         n3557SalExtMtE = false ;
      }
      if ( true /* After */ )
      {
         A3556SalExtCoE = (short)(A898BarPieNDes) ;
         n3556SalExtCoE = false ;
      }
   }

   public void beforeInsert7I306( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate7I306( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete7I306( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete7I306( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate7I306( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes7I306( )
   {
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarExt_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarNMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNMtr_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarPieNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieNDes_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtTipConCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipConCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtTipConDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipConDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipConDsc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtObs1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtObs1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtObs1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtFeR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtFeR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtFeR_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtKgR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtKgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtKgR_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtCoR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtCoR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtCoR_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtEsB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtEsB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtEsB_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtPrT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtPrT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPrT_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtPoT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtPoT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtPoT_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtEnt_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtMtR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtMtR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtMtR_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtKgE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtKgE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtKgE_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtCoE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtCoE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtCoE_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtSalExtMtE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtMtE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtMtE_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes7I306( )
   {
   }

   public void send_integrity_lvl_hashes7I305( )
   {
   }

   public void subsflControlProps_75306( )
   {
      edtavnRcdDeleted_306_Internalname = "vNRCDDELETED_306_"+sGXsfl_75_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_75_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_75_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_75_idx ;
      edtBarExt_Internalname = "BAREXT_"+sGXsfl_75_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_75_idx ;
      edtBarMat_Internalname = "BARMAT_"+sGXsfl_75_idx ;
      edtBarNMtr_Internalname = "BARNMTR_"+sGXsfl_75_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_75_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_75_idx ;
      edtBarPieNDes_Internalname = "BARPIENDES_"+sGXsfl_75_idx ;
      edtTipConCod_Internalname = "TIPCONCOD_"+sGXsfl_75_idx ;
      edtTipConDsc_Internalname = "TIPCONDSC_"+sGXsfl_75_idx ;
      edtSalExtObs1_Internalname = "SALEXTOBS1_"+sGXsfl_75_idx ;
      edtSalExtFeR_Internalname = "SALEXTFER_"+sGXsfl_75_idx ;
      edtSalExtKgR_Internalname = "SALEXTKGR_"+sGXsfl_75_idx ;
      edtSalExtCoR_Internalname = "SALEXTCOR_"+sGXsfl_75_idx ;
      edtSalExtEsB_Internalname = "SALEXTESB_"+sGXsfl_75_idx ;
      edtSalExtPrT_Internalname = "SALEXTPRT_"+sGXsfl_75_idx ;
      edtSalExtPoT_Internalname = "SALEXTPOT_"+sGXsfl_75_idx ;
      edtSalExtEnt_Internalname = "SALEXTENT_"+sGXsfl_75_idx ;
      edtSalExtMtR_Internalname = "SALEXTMTR_"+sGXsfl_75_idx ;
      edtSalExtKgE_Internalname = "SALEXTKGE_"+sGXsfl_75_idx ;
      edtSalExtCoE_Internalname = "SALEXTCOE_"+sGXsfl_75_idx ;
      edtSalExtMtE_Internalname = "SALEXTMTE_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_75306( )
   {
      edtavnRcdDeleted_306_Internalname = "vNRCDDELETED_306_"+sGXsfl_75_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_75_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_75_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_75_fel_idx ;
      edtBarExt_Internalname = "BAREXT_"+sGXsfl_75_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_75_fel_idx ;
      edtBarMat_Internalname = "BARMAT_"+sGXsfl_75_fel_idx ;
      edtBarNMtr_Internalname = "BARNMTR_"+sGXsfl_75_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_75_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_75_fel_idx ;
      edtBarPieNDes_Internalname = "BARPIENDES_"+sGXsfl_75_fel_idx ;
      edtTipConCod_Internalname = "TIPCONCOD_"+sGXsfl_75_fel_idx ;
      edtTipConDsc_Internalname = "TIPCONDSC_"+sGXsfl_75_fel_idx ;
      edtSalExtObs1_Internalname = "SALEXTOBS1_"+sGXsfl_75_fel_idx ;
      edtSalExtFeR_Internalname = "SALEXTFER_"+sGXsfl_75_fel_idx ;
      edtSalExtKgR_Internalname = "SALEXTKGR_"+sGXsfl_75_fel_idx ;
      edtSalExtCoR_Internalname = "SALEXTCOR_"+sGXsfl_75_fel_idx ;
      edtSalExtEsB_Internalname = "SALEXTESB_"+sGXsfl_75_fel_idx ;
      edtSalExtPrT_Internalname = "SALEXTPRT_"+sGXsfl_75_fel_idx ;
      edtSalExtPoT_Internalname = "SALEXTPOT_"+sGXsfl_75_fel_idx ;
      edtSalExtEnt_Internalname = "SALEXTENT_"+sGXsfl_75_fel_idx ;
      edtSalExtMtR_Internalname = "SALEXTMTR_"+sGXsfl_75_fel_idx ;
      edtSalExtKgE_Internalname = "SALEXTKGE_"+sGXsfl_75_fel_idx ;
      edtSalExtCoE_Internalname = "SALEXTCOE_"+sGXsfl_75_fel_idx ;
      edtSalExtMtE_Internalname = "SALEXTMTE_"+sGXsfl_75_fel_idx ;
   }

   public void addRow7I306( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75306( ) ;
      sendRow7I306( ) ;
   }

   public void sendRow7I306( )
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
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_306_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_306_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_306), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_306), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_306_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_306_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarExt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9") : localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarExt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMat_Internalname,GXutil.rtrim( A182BarMat),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarMat_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNMtr_Internalname,GXutil.rtrim( A1500BarNMtr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieNDes_Internalname,GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieNDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieNDes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipConCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1157TipConCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTipConCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1157TipConCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1157TipConCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipConCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipConCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipConDsc_Internalname,GXutil.rtrim( A997TipConDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipConDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipConDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtObs1_Internalname,GXutil.rtrim( A2255SalExtObs1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtObs1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtObs1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtFeR_Internalname,localUtil.format(A2259SalExtFeR, "99/99/99"),localUtil.format( A2259SalExtFeR, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtFeR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtFeR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtKgR_Internalname,GXutil.ltrim( localUtil.ntoc( A2260SalExtKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExtKgR_Enabled!=0) ? localUtil.format( A2260SalExtKgR, "ZZZZZ9.99") : localUtil.format( A2260SalExtKgR, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtKgR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtKgR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtCoR_Internalname,GXutil.ltrim( localUtil.ntoc( A2261SalExtCoR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExtCoR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2261SalExtCoR), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2261SalExtCoR), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtCoR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtCoR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtEsB_Internalname,GXutil.ltrim( localUtil.ntoc( A2262SalExtEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExtEsB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2262SalExtEsB), "9") : localUtil.format( DecimalUtil.doubleToDec(A2262SalExtEsB), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtEsB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtEsB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtPrT_Internalname,GXutil.rtrim( A2263SalExtPrT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtPrT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtPrT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtPoT_Internalname,GXutil.rtrim( A2264SalExtPoT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtPoT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtPoT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtEnt_Internalname,GXutil.rtrim( A2757SalExtEnt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtMtR_Internalname,GXutil.ltrim( localUtil.ntoc( A2840SalExtMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExtMtR_Enabled!=0) ? localUtil.format( A2840SalExtMtR, "ZZZZZ9.99") : localUtil.format( A2840SalExtMtR, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtMtR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtMtR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtKgE_Internalname,GXutil.ltrim( localUtil.ntoc( A3555SalExtKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExtKgE_Enabled!=0) ? localUtil.format( A3555SalExtKgE, "ZZZZZ9.99") : localUtil.format( A3555SalExtKgE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtKgE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtKgE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtCoE_Internalname,GXutil.ltrim( localUtil.ntoc( A3556SalExtCoE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExtCoE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3556SalExtCoE), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3556SalExtCoE), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtCoE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtCoE_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_306_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtMtE_Internalname,GXutil.ltrim( localUtil.ntoc( A3557SalExtMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSalExtMtE_Enabled!=0) ? localUtil.format( A3557SalExtMtE, "ZZZZZ9.99") : localUtil.format( A3557SalExtMtE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtMtE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSalExtMtE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes7I306( ) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "Z3556SalExtCoE_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3556SalExtCoE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2255SalExtObs1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2255SalExtObs1));
      GXCCtl = "Z2259SalExtFeR_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z2259SalExtFeR, 0, "/"));
      GXCCtl = "Z2260SalExtKgR_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2260SalExtKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2261SalExtCoR_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2261SalExtCoR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2262SalExtEsB_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2262SalExtEsB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2263SalExtPrT_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2263SalExtPrT));
      GXCCtl = "Z2264SalExtPoT_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2264SalExtPoT));
      GXCCtl = "Z2757SalExtEnt_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2757SalExtEnt));
      GXCCtl = "Z2840SalExtMtR_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2840SalExtMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3555SalExtKgE_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3555SalExtKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3557SalExtMtE_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3557SalExtMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_306_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_306_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_306_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_306, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV21EmprCod));
      GXCCtl = "vSALEXTALB_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV22SalExtALb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_306_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_306_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAREXT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarExt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMat_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCONCOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipConCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCONDSC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipConDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTOBS1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtObs1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTFER_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtFeR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTKGR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtKgR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTCOR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtCoR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTESB_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtEsB_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTPRT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtPrT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTPOT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtPoT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTENT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTMTR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtMtR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTKGE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtKgE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTCOE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtCoE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTMTE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtMtE_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow7I306( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75306( ) ;
      edtavnRcdDeleted_306_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_306_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarExt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAREXT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMAT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNMTR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieNDes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIENDES_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipConCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCONCOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipConDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCONDSC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtObs1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTOBS1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtFeR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTFER_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtKgR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTKGR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtCoR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTCOR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtEsB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTESB_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtPrT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTPRT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtPoT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTPOT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTENT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtMtR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTMTR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtKgE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTKGE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtCoE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTCOE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSalExtMtE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTMTE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_306_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_306_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_306");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_306_Internalname ;
         wbErr = true ;
         nRcdDeleted_306 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_306 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_306_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         wbErr = true ;
         A129BarCod = 0 ;
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         wbErr = true ;
         A132BarCodReo = (byte)(0) ;
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
      A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n2265BarExt = false ;
      A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
      A182BarMat = httpContext.cgiGet( edtBarMat_Internalname) ;
      A1500BarNMtr = httpContext.cgiGet( edtBarNMtr_Internalname) ;
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      n457FasCod = false ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n898BarPieNDes = false ;
      A1157TipConCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n1157TipConCod = false ;
      A997TipConDsc = httpContext.cgiGet( edtTipConDsc_Internalname) ;
      A2255SalExtObs1 = httpContext.cgiGet( edtSalExtObs1_Internalname) ;
      n2255SalExtObs1 = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtSalExtFeR_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "SALEXTFER_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtFeR_Internalname ;
         wbErr = true ;
         A2259SalExtFeR = GXutil.nullDate() ;
         n2259SalExtFeR = false ;
      }
      else
      {
         A2259SalExtFeR = localUtil.ctod( httpContext.cgiGet( edtSalExtFeR_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n2259SalExtFeR = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExtKgR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExtKgR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "SALEXTKGR_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtKgR_Internalname ;
         wbErr = true ;
         A2260SalExtKgR = DecimalUtil.ZERO ;
         n2260SalExtKgR = false ;
      }
      else
      {
         A2260SalExtKgR = localUtil.ctond( httpContext.cgiGet( edtSalExtKgR_Internalname)) ;
         n2260SalExtKgR = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtCoR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtCoR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "SALEXTCOR_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtCoR_Internalname ;
         wbErr = true ;
         A2261SalExtCoR = (short)(0) ;
         n2261SalExtCoR = false ;
      }
      else
      {
         A2261SalExtCoR = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExtCoR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2261SalExtCoR = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtEsB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtEsB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "SALEXTESB_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtEsB_Internalname ;
         wbErr = true ;
         A2262SalExtEsB = (byte)(0) ;
         n2262SalExtEsB = false ;
      }
      else
      {
         A2262SalExtEsB = (byte)(localUtil.ctol( httpContext.cgiGet( edtSalExtEsB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2262SalExtEsB = false ;
      }
      A2263SalExtPrT = httpContext.cgiGet( edtSalExtPrT_Internalname) ;
      n2263SalExtPrT = false ;
      A2264SalExtPoT = httpContext.cgiGet( edtSalExtPoT_Internalname) ;
      n2264SalExtPoT = false ;
      A2757SalExtEnt = httpContext.cgiGet( edtSalExtEnt_Internalname) ;
      n2757SalExtEnt = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExtMtR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExtMtR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "SALEXTMTR_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtMtR_Internalname ;
         wbErr = true ;
         A2840SalExtMtR = DecimalUtil.ZERO ;
         n2840SalExtMtR = false ;
      }
      else
      {
         A2840SalExtMtR = localUtil.ctond( httpContext.cgiGet( edtSalExtMtR_Internalname)) ;
         n2840SalExtMtR = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExtKgE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExtKgE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "SALEXTKGE_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtKgE_Internalname ;
         wbErr = true ;
         A3555SalExtKgE = DecimalUtil.ZERO ;
         n3555SalExtKgE = false ;
      }
      else
      {
         A3555SalExtKgE = localUtil.ctond( httpContext.cgiGet( edtSalExtKgE_Internalname)) ;
         n3555SalExtKgE = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "SALEXTCOE_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtCoE_Internalname ;
         wbErr = true ;
         A3556SalExtCoE = (short)(0) ;
         n3556SalExtCoE = false ;
      }
      else
      {
         A3556SalExtCoE = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExtCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3556SalExtCoE = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSalExtMtE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSalExtMtE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "SALEXTMTE_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtMtE_Internalname ;
         wbErr = true ;
         A3557SalExtMtE = DecimalUtil.ZERO ;
         n3557SalExtMtE = false ;
      }
      else
      {
         A3557SalExtMtE = localUtil.ctond( httpContext.cgiGet( edtSalExtMtE_Internalname)) ;
         n3557SalExtMtE = false ;
      }
      GXCCtl = "Z129BarCod_" + sGXsfl_75_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_75_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_75_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3556SalExtCoE_" + sGXsfl_75_idx ;
      Z3556SalExtCoE = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2255SalExtObs1_" + sGXsfl_75_idx ;
      Z2255SalExtObs1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2259SalExtFeR_" + sGXsfl_75_idx ;
      Z2259SalExtFeR = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z2260SalExtKgR_" + sGXsfl_75_idx ;
      Z2260SalExtKgR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2261SalExtCoR_" + sGXsfl_75_idx ;
      Z2261SalExtCoR = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2262SalExtEsB_" + sGXsfl_75_idx ;
      Z2262SalExtEsB = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2263SalExtPrT_" + sGXsfl_75_idx ;
      Z2263SalExtPrT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2264SalExtPoT_" + sGXsfl_75_idx ;
      Z2264SalExtPoT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2757SalExtEnt_" + sGXsfl_75_idx ;
      Z2757SalExtEnt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2840SalExtMtR_" + sGXsfl_75_idx ;
      Z2840SalExtMtR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3555SalExtKgE_" + sGXsfl_75_idx ;
      Z3555SalExtKgE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3557SalExtMtE_" + sGXsfl_75_idx ;
      Z3557SalExtMtE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_75_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_306_" + sGXsfl_75_idx ;
      nRcdDeleted_306 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_306_" + sGXsfl_75_idx ;
      nRcdExists_306 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_306_" + sGXsfl_75_idx ;
      nIsMod_306 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTipConCod_Enabled = edtTipConCod_Enabled ;
      defedtBarCodPar_Enabled = edtBarCodPar_Enabled ;
      defedtBarCodReo_Enabled = edtBarCodReo_Enabled ;
      defedtBarCod_Enabled = edtBarCod_Enabled ;
   }

   public void confirmValues7I0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75306( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75306( ) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z3556SalExtCoE_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z3556SalExtCoE_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3556SalExtCoE_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2255SalExtObs1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2255SalExtObs1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2255SalExtObs1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2259SalExtFeR_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2259SalExtFeR_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2259SalExtFeR_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2260SalExtKgR_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2260SalExtKgR_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2260SalExtKgR_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2261SalExtCoR_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2261SalExtCoR_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2261SalExtCoR_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2262SalExtEsB_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2262SalExtEsB_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2262SalExtEsB_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2263SalExtPrT_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2263SalExtPrT_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2263SalExtPrT_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2264SalExtPoT_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2264SalExtPoT_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2264SalExtPoT_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2757SalExtEnt_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2757SalExtEnt_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2757SalExtEnt_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2840SalExtMtR_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2840SalExtMtR_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2840SalExtMtR_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z3555SalExtKgE_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z3555SalExtKgE_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3555SalExtKgE_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z3557SalExtMtE_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z3557SalExtMtE_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3557SalExtMtE_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_75_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.textsal", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TEXTSAL");
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV20Modo, "")));
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( AV21EmprCod, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("textsal:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( Z2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2256SalExtFec", localUtil.dtoc( Z2256SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2257SalExtEst", GXutil.ltrim( localUtil.ntoc( Z2257SalExtEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2258SalExtLis", GXutil.ltrim( localUtil.ntoc( Z2258SalExtLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2254SalExtSec", GXutil.rtrim( Z2254SalExtSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV20Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV20Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV21EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV22SalExtALb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV23Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV26Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.textsal", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TEXTSAL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ORDEN DE TRABAJO EXTERIOR", "") ;
   }

   public void initializeNonKey7I305( )
   {
      AV20Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      A2248ManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      A2249ManNom = "" ;
      n2249ManNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A2254SalExtSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
      A2256SalExtFec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      A2257SalExtEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      A2258SalExtLis = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
      Z2256SalExtFec = GXutil.nullDate() ;
      Z2257SalExtEst = (byte)(0) ;
      Z2258SalExtLis = (byte)(0) ;
      Z2254SalExtSec = "" ;
      Z840TrnCod = (short)(0) ;
      Z2248ManCod = (short)(0) ;
   }

   public void initAll7I305( )
   {
      A2253SalExtAlb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      initializeNonKey7I305( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV20Modo = iV20Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      A2256SalExtFec = i2256SalExtFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      A2257SalExtEst = i2257SalExtEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      A2258SalExtLis = i2258SalExtLis ;
      httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
   }

   public void initializeNonKey7I306( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      AV23Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
      AV26Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
      A3556SalExtCoE = (short)(0) ;
      n3556SalExtCoE = false ;
      A2265BarExt = (byte)(0) ;
      n2265BarExt = false ;
      A212BarSer = "" ;
      A182BarMat = "" ;
      A1500BarNMtr = "" ;
      A457FasCod = "" ;
      n457FasCod = false ;
      A460FasDsc = "" ;
      A898BarPieNDes = 0 ;
      n898BarPieNDes = false ;
      A1157TipConCod = (short)(0) ;
      n1157TipConCod = false ;
      A997TipConDsc = "" ;
      A2255SalExtObs1 = "" ;
      n2255SalExtObs1 = false ;
      A2259SalExtFeR = GXutil.nullDate() ;
      n2259SalExtFeR = false ;
      A2260SalExtKgR = DecimalUtil.ZERO ;
      n2260SalExtKgR = false ;
      A2261SalExtCoR = (short)(0) ;
      n2261SalExtCoR = false ;
      A2262SalExtEsB = (byte)(0) ;
      n2262SalExtEsB = false ;
      A2263SalExtPrT = "" ;
      n2263SalExtPrT = false ;
      A2264SalExtPoT = "" ;
      n2264SalExtPoT = false ;
      A2757SalExtEnt = "" ;
      n2757SalExtEnt = false ;
      A2840SalExtMtR = DecimalUtil.ZERO ;
      n2840SalExtMtR = false ;
      A3555SalExtKgE = DecimalUtil.ZERO ;
      n3555SalExtKgE = false ;
      A3557SalExtMtE = DecimalUtil.ZERO ;
      n3557SalExtMtE = false ;
      Z3556SalExtCoE = (short)(0) ;
      Z2255SalExtObs1 = "" ;
      Z2259SalExtFeR = GXutil.nullDate() ;
      Z2260SalExtKgR = DecimalUtil.ZERO ;
      Z2261SalExtCoR = (short)(0) ;
      Z2262SalExtEsB = (byte)(0) ;
      Z2263SalExtPrT = "" ;
      Z2264SalExtPoT = "" ;
      Z2757SalExtEnt = "" ;
      Z2840SalExtMtR = DecimalUtil.ZERO ;
      Z3555SalExtKgE = DecimalUtil.ZERO ;
      Z3557SalExtMtE = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
   }

   public void initAll7I306( )
   {
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      initializeNonKey7I306( ) ;
   }

   public void standaloneModalInsert7I306( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824151378", true, true);
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
      httpContext.AddJavascriptSource("textsal.js", "?2026824151379", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties306( )
   {
      edtTipConCod_Enabled = defedtTipConCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipConCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipConCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarCodPar_Enabled = defedtBarCodPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarCodReo_Enabled = defedtBarCodReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarCod_Enabled = defedtBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_306, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_306_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarExt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A182BarMat));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMat_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1500BarNMtr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieNDes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1157TipConCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipConCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A997TipConDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipConDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2255SalExtObs1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtObs1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A2259SalExtFeR, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtFeR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2260SalExtKgR, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtKgR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2261SalExtCoR, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtCoR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2262SalExtEsB, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtEsB_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2263SalExtPrT));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtPrT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2264SalExtPoT));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtPoT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2757SalExtEnt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2840SalExtMtR, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtMtR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3555SalExtKgE, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtKgE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3556SalExtCoE, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtCoE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3557SalExtMtE, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSalExtMtE_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSalExtAlb_Internalname = "SALEXTALB" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtManCod_Internalname = "MANCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtManNom_Internalname = "MANNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSalExtFec_Internalname = "SALEXTFEC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSalExtEst_Internalname = "SALEXTEST" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSalExtLis_Internalname = "SALEXTLIS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtSalExtSec_Internalname = "SALEXTSEC" ;
      edtavnRcdDeleted_306_Internalname = "vNRCDDELETED_306" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarExt_Internalname = "BAREXT" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarMat_Internalname = "BARMAT" ;
      edtBarNMtr_Internalname = "BARNMTR" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtBarPieNDes_Internalname = "BARPIENDES" ;
      edtTipConCod_Internalname = "TIPCONCOD" ;
      edtTipConDsc_Internalname = "TIPCONDSC" ;
      edtSalExtObs1_Internalname = "SALEXTOBS1" ;
      edtSalExtFeR_Internalname = "SALEXTFER" ;
      edtSalExtKgR_Internalname = "SALEXTKGR" ;
      edtSalExtCoR_Internalname = "SALEXTCOR" ;
      edtSalExtEsB_Internalname = "SALEXTESB" ;
      edtSalExtPrT_Internalname = "SALEXTPRT" ;
      edtSalExtPoT_Internalname = "SALEXTPOT" ;
      edtSalExtEnt_Internalname = "SALEXTENT" ;
      edtSalExtMtR_Internalname = "SALEXTMTR" ;
      edtSalExtKgE_Internalname = "SALEXTKGE" ;
      edtSalExtCoE_Internalname = "SALEXTCOE" ;
      edtSalExtMtE_Internalname = "SALEXTMTE" ;
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
      Form.setCaption( httpContext.getMessage( "ORDEN DE TRABAJO EXTERIOR", "") );
      edtSalExtMtE_Jsonclick = "" ;
      edtSalExtCoE_Jsonclick = "" ;
      edtSalExtKgE_Jsonclick = "" ;
      edtSalExtMtR_Jsonclick = "" ;
      edtSalExtEnt_Jsonclick = "" ;
      edtSalExtPoT_Jsonclick = "" ;
      edtSalExtPrT_Jsonclick = "" ;
      edtSalExtEsB_Jsonclick = "" ;
      edtSalExtCoR_Jsonclick = "" ;
      edtSalExtKgR_Jsonclick = "" ;
      edtSalExtFeR_Jsonclick = "" ;
      edtSalExtObs1_Jsonclick = "" ;
      edtTipConDsc_Jsonclick = "" ;
      edtTipConCod_Jsonclick = "" ;
      edtBarPieNDes_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarNMtr_Jsonclick = "" ;
      edtBarMat_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarExt_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtavnRcdDeleted_306_Jsonclick = "" ;
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
      edtSalExtMtE_Enabled = 1 ;
      edtSalExtCoE_Enabled = 1 ;
      edtSalExtKgE_Enabled = 1 ;
      edtSalExtMtR_Enabled = 1 ;
      edtSalExtEnt_Enabled = 1 ;
      edtSalExtPoT_Enabled = 1 ;
      edtSalExtPrT_Enabled = 1 ;
      edtSalExtEsB_Enabled = 1 ;
      edtSalExtCoR_Enabled = 1 ;
      edtSalExtKgR_Enabled = 1 ;
      edtSalExtFeR_Enabled = 1 ;
      edtSalExtObs1_Enabled = 1 ;
      edtTipConDsc_Enabled = 0 ;
      edtTipConCod_Enabled = 0 ;
      edtBarPieNDes_Enabled = 0 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtBarNMtr_Enabled = 0 ;
      edtBarMat_Enabled = 0 ;
      edtBarSer_Enabled = 0 ;
      edtBarExt_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtavnRcdDeleted_306_Enabled = 1 ;
      edtSalExtSec_Jsonclick = "" ;
      edtSalExtSec_Backcolor = (int)(0xFFFFFF) ;
      edtSalExtSec_Enabled = 1 ;
      edtSalExtLis_Jsonclick = "" ;
      edtSalExtLis_Backcolor = (int)(0xFFFFFF) ;
      edtSalExtLis_Enabled = 1 ;
      edtSalExtEst_Jsonclick = "" ;
      edtSalExtEst_Backcolor = (int)(0xFFFFFF) ;
      edtSalExtEst_Enabled = 1 ;
      edtSalExtFec_Jsonclick = "" ;
      edtSalExtFec_Backcolor = (int)(0xFFFFFF) ;
      edtSalExtFec_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Backcolor = (int)(0xFFFFFF) ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
      edtManNom_Jsonclick = "" ;
      edtManNom_Backcolor = (int)(0xFFFFFF) ;
      edtManNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Backcolor = (int)(0xFFFFFF) ;
      edtManCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtSalExtAlb_Jsonclick = "" ;
      edtSalExtAlb_Backcolor = (int)(0xFFFFFF) ;
      edtSalExtAlb_Enabled = 1 ;
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

   public void gx13asakilos7I306( String A396EmprCod ,
                                  int A129BarCod ,
                                  byte A132BarCodReo ,
                                  String A130BarCodPar )
   {
      if ( true /* After */ )
      {
         GXt_decimal8 = AV23Kilos ;
         GXv_decimal17[0] = GXt_decimal8 ;
         new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal17) ;
         textsal_impl.this.GXt_decimal8 = GXv_decimal17[0] ;
         AV23Kilos = GXt_decimal8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV23Kilos, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx14asametros7I306( String A396EmprCod ,
                                   int A129BarCod ,
                                   byte A132BarCodReo ,
                                   String A130BarCodPar )
   {
      if ( true /* After */ )
      {
         GXt_decimal8 = AV26Metros ;
         GXv_char15[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_decimal17[0] = GXt_decimal8 ;
         new app.pmtsext(remoteHandle, context).execute( GXv_char15, GXv_int7, GXv_int11, GXv_char3, GXv_decimal17) ;
         textsal_impl.this.A396EmprCod = GXv_char15[0] ;
         textsal_impl.this.A129BarCod = GXv_int7[0] ;
         textsal_impl.this.A132BarCodReo = GXv_int11[0] ;
         textsal_impl.this.A130BarCodPar = GXv_char3[0] ;
         textsal_impl.this.GXt_decimal8 = GXv_decimal17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV26Metros = GXt_decimal8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV26Metros, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_10_7I305( )
   {
      if ( isIns( )  && (0==A2253SalExtAlb) )
      {
         GXv_int7[0] = A2253SalExtAlb ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTSAL", ""), GXv_int7) ;
         A2253SalExtAlb = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_22_7I306( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            String A457FasCod ,
                            java.util.Date A2256SalExtFec ,
                            int A2253SalExtAlb )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A457FasCod ;
         GXv_date10[0] = A2256SalExtFec ;
         GXv_int5[0] = (byte)(1) ;
         GXv_int6[0] = A2253SalExtAlb ;
         new app.phdrext(remoteHandle, context).execute( GXv_char15, GXv_int7, GXv_int11, GXv_char3, GXv_char2, GXv_date10, GXv_int5, GXv_int6) ;
         A396EmprCod = GXv_char15[0] ;
         A129BarCod = GXv_int7[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char3[0] ;
         A457FasCod = GXv_char2[0] ;
         A2256SalExtFec = GXv_date10[0] ;
         A2253SalExtAlb = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A2256SalExtFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_7I306( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_int18[0] = A2248ManCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_char2[0] = httpContext.getMessage( "E", "") ;
         GXv_int7[0] = A2253SalExtAlb ;
         GXv_decimal17[0] = AV23Kilos ;
         GXv_decimal16[0] = AV26Metros ;
         GXv_int14[0] = (short)(A898BarPieNDes) ;
         GXv_date10[0] = A2256SalExtFec ;
         GXv_int6[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         new app.pamvhdr(remoteHandle, context).execute( GXv_char15, GXv_int18, GXv_char3, GXv_char2, GXv_int7, GXv_decimal17, GXv_decimal16, GXv_int14, GXv_date10, GXv_int6, GXv_int11, GXv_char1) ;
         A396EmprCod = GXv_char15[0] ;
         A2248ManCod = GXv_int18[0] ;
         A457FasCod = GXv_char3[0] ;
         A2253SalExtAlb = GXv_int7[0] ;
         AV23Kilos = GXv_decimal17[0] ;
         AV26Metros = GXv_decimal16[0] ;
         A898BarPieNDes = GXv_int14[0] ;
         A2256SalExtFec = GXv_date10[0] ;
         A129BarCod = GXv_int6[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_24_7I306( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char15[0] = A396EmprCod ;
         GXv_int18[0] = A2248ManCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_char2[0] = httpContext.getMessage( "E", "") ;
         GXv_int7[0] = A2253SalExtAlb ;
         GXv_int6[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         GXv_decimal17[0] = AV23Kilos ;
         GXv_decimal16[0] = AV23Kilos ;
         GXv_decimal13[0] = AV26Metros ;
         GXv_decimal9[0] = AV26Metros ;
         GXv_int14[0] = (short)(A898BarPieNDes) ;
         GXv_int12[0] = (short)(A898BarPieNDes) ;
         GXv_date10[0] = A2256SalExtFec ;
         new app.pmmvhdr(remoteHandle, context).execute( GXv_char15, GXv_int18, GXv_char3, GXv_char2, GXv_int7, GXv_int6, GXv_int11, GXv_char1, GXv_decimal17, GXv_decimal16, GXv_decimal13, GXv_decimal9, GXv_int14, GXv_int12, GXv_date10) ;
         A396EmprCod = GXv_char15[0] ;
         A2248ManCod = GXv_int18[0] ;
         A457FasCod = GXv_char3[0] ;
         A2253SalExtAlb = GXv_int7[0] ;
         A129BarCod = GXv_int6[0] ;
         A132BarCodReo = GXv_int11[0] ;
         A130BarCodPar = GXv_char1[0] ;
         AV23Kilos = GXv_decimal17[0] ;
         AV23Kilos = GXv_decimal16[0] ;
         AV26Metros = GXv_decimal13[0] ;
         AV26Metros = GXv_decimal9[0] ;
         A898BarPieNDes = GXv_int14[0] ;
         A898BarPieNDes = GXv_int12[0] ;
         A2256SalExtFec = GXv_date10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrimstr( AV23Kilos, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrimstr( AV26Metros, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
      subsflControlProps_75306( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal7I306( ) ;
         standaloneModal7I306( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow7I306( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75306( ) ;
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
      /* Using cursor T007I45 */
      pr_default.execute(39, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T007I45_A407EmprNom[0] ;
      n407EmprNom = T007I45_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(39);
      GX_FocusControl = edtManCod_Internalname ;
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

   public void valid_Salextalb( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( isIns( )  && ( ! (0==A2253SalExtAlb) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero Albaran Inexistente", ""), 1, "SALEXTALB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
      }
      if ( isIns( )  && (0==A2253SalExtAlb) )
      {
         GXv_int7[0] = A2253SalExtAlb ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTSAL", ""), GXv_int7) ;
         textsal_impl.this.A2253SalExtAlb = GXv_int7[0] ;
         A2253SalExtAlb = this.A2253SalExtAlb ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.ltrim( localUtil.ntoc( A2257SalExtEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.ltrim( localUtil.ntoc( A2258SalExtLis, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", GXutil.rtrim( A2254SalExtSec));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2256SalExtFec", localUtil.format(Z2256SalExtFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2257SalExtEst", GXutil.ltrim( localUtil.ntoc( Z2257SalExtEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2258SalExtLis", GXutil.ltrim( localUtil.ntoc( Z2258SalExtLis, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2254SalExtSec", GXutil.rtrim( Z2254SalExtSec));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2249ManNom", GXutil.rtrim( Z2249ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( Z2253SalExtAlb, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mancod( )
   {
      n2249ManNom = false ;
      /* Using cursor T007I23 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Manufacturador Inexistente", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
      }
      A2249ManNom = T007I23_A2249ManNom[0] ;
      n2249ManNom = T007I23_n2249ManNom[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T007I24 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T007I24_A841TrnNom[0] ;
      n841TrnNom = T007I24_n841TrnNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Barcodreo( )
   {
      if ( ( A2265BarExt == 2 ) && true /* After */ && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "HDR ya Recepcionada", ""), 1, "BARCODREO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barcodpar( )
   {
      n2265BarExt = false ;
      n1157TipConCod = false ;
      n898BarPieNDes = false ;
      /* Using cursor T007I38 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hdr Inexistente", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A361DisCod = T007I38_A361DisCod[0] ;
      A2265BarExt = T007I38_A2265BarExt[0] ;
      n2265BarExt = T007I38_n2265BarExt[0] ;
      A212BarSer = T007I38_A212BarSer[0] ;
      A182BarMat = T007I38_A182BarMat[0] ;
      A1500BarNMtr = T007I38_A1500BarNMtr[0] ;
      pr_default.close(33);
      /* Using cursor T007I39 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A1157TipConCod = T007I39_A1157TipConCod[0] ;
      n1157TipConCod = T007I39_n1157TipConCod[0] ;
      pr_default.close(34);
      /* Using cursor T007I41 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(35) != 101) )
      {
         A898BarPieNDes = T007I41_A898BarPieNDes[0] ;
         n898BarPieNDes = T007I41_n898BarPieNDes[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         n898BarPieNDes = false ;
      }
      pr_default.close(35);
      if ( true /* After */ )
      {
         GXt_decimal8 = AV23Kilos ;
         GXv_decimal17[0] = GXt_decimal8 ;
         new app.pkgsext(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal17) ;
         textsal_impl.this.GXt_decimal8 = GXv_decimal17[0] ;
         AV23Kilos = GXt_decimal8 ;
      }
      if ( true /* After */ )
      {
         GXt_decimal8 = AV26Metros ;
         GXv_char15[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int11[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_decimal17[0] = GXt_decimal8 ;
         new app.pmtsext(remoteHandle, context).execute( GXv_char15, GXv_int7, GXv_int11, GXv_char3, GXv_decimal17) ;
         textsal_impl.this.A396EmprCod = GXv_char15[0] ;
         textsal_impl.this.A129BarCod = GXv_int7[0] ;
         textsal_impl.this.A132BarCodReo = GXv_int11[0] ;
         textsal_impl.this.A130BarCodPar = GXv_char3[0] ;
         textsal_impl.this.GXt_decimal8 = GXv_decimal17[0] ;
         AV26Metros = GXt_decimal8 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2265BarExt", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", GXutil.rtrim( A182BarMat));
      httpContext.ajax_rsp_assign_attri("", false, "A1500BarNMtr", GXutil.rtrim( A1500BarNMtr));
      httpContext.ajax_rsp_assign_attri("", false, "A1157TipConCod", GXutil.ltrim( localUtil.ntoc( A1157TipConCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Kilos", GXutil.ltrim( localUtil.ntoc( AV23Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Metros", GXutil.ltrim( localUtil.ntoc( AV26Metros, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Fascod( )
   {
      n457FasCod = false ;
      /* Using cursor T007I42 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T007I42_A460FasDsc[0] ;
      pr_default.close(36);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV20Modo',fld:'vMODO',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'ELIMINAR HDR'","{handler:'e137I2',iparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'ELIMINAR HDR'",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'ELIMINAR ALBARAN'","{handler:'e147I2',iparms:[{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'ELIMINAR ALBARAN'",",oparms:[{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("EXIT","{handler:'e117I2',iparms:[{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22SalExtALb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("EXIT",",oparms:[{av:'AV22SalExtALb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_SALEXTALB","{handler:'valid_Salextalb',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV20Modo',fld:'vMODO',pic:''},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A2257SalExtEst',fld:'SALEXTEST',pic:'9'},{av:'A2258SalExtLis',fld:'SALEXTLIS',pic:'9'},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_SALEXTALB",",oparms:[{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A2257SalExtEst',fld:'SALEXTEST',pic:'9'},{av:'A2258SalExtLis',fld:'SALEXTLIS',pic:'9'},{av:'A2254SalExtSec',fld:'SALEXTSEC',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A2249ManNom',fld:'MANNOM',pic:''},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2248ManCod'},{av:'Z407EmprNom'},{av:'Z840TrnCod'},{av:'Z2256SalExtFec'},{av:'Z2257SalExtEst'},{av:'Z2258SalExtLis'},{av:'Z2254SalExtSec'},{av:'ZV17UsurCod'},{av:'Z841TrnNom'},{av:'Z2249ManNom'},{av:'Z2253SalExtAlb'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''}]");
      setEventMetadata("VALID_MANCOD",",oparms:[{av:'A2249ManNom',fld:'MANNOM',pic:''}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_SALEXTFEC","{handler:'valid_Salextfec',iparms:[]");
      setEventMetadata("VALID_SALEXTFEC",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A1500BarNMtr',fld:'BARNMTR',pic:''},{av:'A1157TipConCod',fld:'TIPCONCOD',pic:'ZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'AV23Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV26Metros',fld:'vMETROS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A1500BarNMtr',fld:'BARNMTR',pic:''},{av:'A1157TipConCod',fld:'TIPCONCOD',pic:'ZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'AV23Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV26Metros',fld:'vMETROS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_BARPIENDES","{handler:'valid_Barpiendes',iparms:[]");
      setEventMetadata("VALID_BARPIENDES",",oparms:[]}");
      setEventMetadata("VALID_SALEXTPRT","{handler:'valid_Salextprt',iparms:[]");
      setEventMetadata("VALID_SALEXTPRT",",oparms:[]}");
      setEventMetadata("VALID_SALEXTPOT","{handler:'valid_Salextpot',iparms:[]");
      setEventMetadata("VALID_SALEXTPOT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Salextmte',iparms:[]");
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
      pr_default.close(36);
      pr_default.close(33);
      pr_default.close(34);
      pr_default.close(35);
      pr_default.close(39);
      pr_default.close(21);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2256SalExtFec = GXutil.nullDate() ;
      Z2254SalExtSec = "" ;
      Z130BarCodPar = "" ;
      Z2255SalExtObs1 = "" ;
      Z2259SalExtFeR = GXutil.nullDate() ;
      Z2260SalExtKgR = DecimalUtil.ZERO ;
      Z2263SalExtPrT = "" ;
      Z2264SalExtPoT = "" ;
      Z2757SalExtEnt = "" ;
      Z2840SalExtMtR = DecimalUtil.ZERO ;
      Z3555SalExtKgE = DecimalUtil.ZERO ;
      Z3557SalExtMtE = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A457FasCod = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A2249ManNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A841TrnNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A2254SalExtSec = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode306 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV20Modo = "" ;
      AV17UsurCod = "" ;
      AV21EmprCod = "" ;
      AV23Kilos = DecimalUtil.ZERO ;
      AV26Metros = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode305 = "" ;
      GXCCtl = "" ;
      A212BarSer = "" ;
      A182BarMat = "" ;
      A1500BarNMtr = "" ;
      A460FasDsc = "" ;
      A997TipConDsc = "" ;
      A2255SalExtObs1 = "" ;
      A2259SalExtFeR = GXutil.nullDate() ;
      A2260SalExtKgR = DecimalUtil.ZERO ;
      A2263SalExtPrT = "" ;
      A2264SalExtPoT = "" ;
      A2757SalExtEnt = "" ;
      A2840SalExtMtR = DecimalUtil.ZERO ;
      A3555SalExtKgE = DecimalUtil.ZERO ;
      A3557SalExtMtE = DecimalUtil.ZERO ;
      AV19Station = "" ;
      AV16EmprNom = "" ;
      AV24Lit0 = "" ;
      AV25LitFe = "" ;
      AV34Lit2 = "" ;
      AV29Lit3 = "" ;
      AV32Lit4 = "" ;
      AV33Lit5 = "" ;
      AV30Lit6 = "" ;
      AV31Lit7 = "" ;
      GXt_char4 = "" ;
      Z407EmprNom = "" ;
      Z2249ManNom = "" ;
      Z841TrnNom = "" ;
      T007I11_A407EmprNom = new String[] {""} ;
      T007I11_n407EmprNom = new boolean[] {false} ;
      T007I14_A2253SalExtAlb = new int[1] ;
      T007I14_A407EmprNom = new String[] {""} ;
      T007I14_n407EmprNom = new boolean[] {false} ;
      T007I14_A2249ManNom = new String[] {""} ;
      T007I14_n2249ManNom = new boolean[] {false} ;
      T007I14_A841TrnNom = new String[] {""} ;
      T007I14_n841TrnNom = new boolean[] {false} ;
      T007I14_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T007I14_A2257SalExtEst = new byte[1] ;
      T007I14_A2258SalExtLis = new byte[1] ;
      T007I14_A2254SalExtSec = new String[] {""} ;
      T007I14_A396EmprCod = new String[] {""} ;
      T007I14_A840TrnCod = new short[1] ;
      T007I14_n840TrnCod = new boolean[] {false} ;
      T007I14_A2248ManCod = new short[1] ;
      T007I12_A841TrnNom = new String[] {""} ;
      T007I12_n841TrnNom = new boolean[] {false} ;
      T007I13_A2249ManNom = new String[] {""} ;
      T007I13_n2249ManNom = new boolean[] {false} ;
      T007I15_A841TrnNom = new String[] {""} ;
      T007I15_n841TrnNom = new boolean[] {false} ;
      T007I16_A2249ManNom = new String[] {""} ;
      T007I16_n2249ManNom = new boolean[] {false} ;
      T007I17_A396EmprCod = new String[] {""} ;
      T007I17_A2253SalExtAlb = new int[1] ;
      T007I10_A2253SalExtAlb = new int[1] ;
      T007I10_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T007I10_A2257SalExtEst = new byte[1] ;
      T007I10_A2258SalExtLis = new byte[1] ;
      T007I10_A2254SalExtSec = new String[] {""} ;
      T007I10_A396EmprCod = new String[] {""} ;
      T007I10_A840TrnCod = new short[1] ;
      T007I10_n840TrnCod = new boolean[] {false} ;
      T007I10_A2248ManCod = new short[1] ;
      T007I18_A396EmprCod = new String[] {""} ;
      T007I18_A2253SalExtAlb = new int[1] ;
      T007I19_A396EmprCod = new String[] {""} ;
      T007I19_A2253SalExtAlb = new int[1] ;
      T007I9_A2253SalExtAlb = new int[1] ;
      T007I9_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T007I9_A2257SalExtEst = new byte[1] ;
      T007I9_A2258SalExtLis = new byte[1] ;
      T007I9_A2254SalExtSec = new String[] {""} ;
      T007I9_A396EmprCod = new String[] {""} ;
      T007I9_A840TrnCod = new short[1] ;
      T007I9_n840TrnCod = new boolean[] {false} ;
      T007I9_A2248ManCod = new short[1] ;
      T007I23_A2249ManNom = new String[] {""} ;
      T007I23_n2249ManNom = new boolean[] {false} ;
      T007I24_A841TrnNom = new String[] {""} ;
      T007I24_n841TrnNom = new boolean[] {false} ;
      T007I25_A396EmprCod = new String[] {""} ;
      T007I25_A2253SalExtAlb = new int[1] ;
      T007I25_A6248SalExNln = new short[1] ;
      T007I26_A396EmprCod = new String[] {""} ;
      T007I26_A2253SalExtAlb = new int[1] ;
      Z212BarSer = "" ;
      Z182BarMat = "" ;
      Z1500BarNMtr = "" ;
      Z460FasDsc = "" ;
      T007I28_A361DisCod = new int[1] ;
      T007I28_A2253SalExtAlb = new int[1] ;
      T007I28_A3556SalExtCoE = new short[1] ;
      T007I28_n3556SalExtCoE = new boolean[] {false} ;
      T007I28_A2265BarExt = new byte[1] ;
      T007I28_n2265BarExt = new boolean[] {false} ;
      T007I28_A212BarSer = new String[] {""} ;
      T007I28_A182BarMat = new String[] {""} ;
      T007I28_A1500BarNMtr = new String[] {""} ;
      T007I28_A460FasDsc = new String[] {""} ;
      T007I28_A2255SalExtObs1 = new String[] {""} ;
      T007I28_n2255SalExtObs1 = new boolean[] {false} ;
      T007I28_A2259SalExtFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T007I28_n2259SalExtFeR = new boolean[] {false} ;
      T007I28_A2260SalExtKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I28_n2260SalExtKgR = new boolean[] {false} ;
      T007I28_A2261SalExtCoR = new short[1] ;
      T007I28_n2261SalExtCoR = new boolean[] {false} ;
      T007I28_A2262SalExtEsB = new byte[1] ;
      T007I28_n2262SalExtEsB = new boolean[] {false} ;
      T007I28_A2263SalExtPrT = new String[] {""} ;
      T007I28_n2263SalExtPrT = new boolean[] {false} ;
      T007I28_A2264SalExtPoT = new String[] {""} ;
      T007I28_n2264SalExtPoT = new boolean[] {false} ;
      T007I28_A2757SalExtEnt = new String[] {""} ;
      T007I28_n2757SalExtEnt = new boolean[] {false} ;
      T007I28_A2840SalExtMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I28_n2840SalExtMtR = new boolean[] {false} ;
      T007I28_A3555SalExtKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I28_n3555SalExtKgE = new boolean[] {false} ;
      T007I28_A3557SalExtMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I28_n3557SalExtMtE = new boolean[] {false} ;
      T007I28_A396EmprCod = new String[] {""} ;
      T007I28_A457FasCod = new String[] {""} ;
      T007I28_n457FasCod = new boolean[] {false} ;
      T007I28_A129BarCod = new int[1] ;
      T007I28_A132BarCodReo = new byte[1] ;
      T007I28_A130BarCodPar = new String[] {""} ;
      T007I28_A1157TipConCod = new short[1] ;
      T007I28_n1157TipConCod = new boolean[] {false} ;
      T007I28_A898BarPieNDes = new int[1] ;
      T007I28_n898BarPieNDes = new boolean[] {false} ;
      T007I4_A460FasDsc = new String[] {""} ;
      T007I5_A361DisCod = new int[1] ;
      T007I5_A2265BarExt = new byte[1] ;
      T007I5_n2265BarExt = new boolean[] {false} ;
      T007I5_A212BarSer = new String[] {""} ;
      T007I5_A182BarMat = new String[] {""} ;
      T007I5_A1500BarNMtr = new String[] {""} ;
      T007I6_A1157TipConCod = new short[1] ;
      T007I6_n1157TipConCod = new boolean[] {false} ;
      T007I8_A898BarPieNDes = new int[1] ;
      T007I8_n898BarPieNDes = new boolean[] {false} ;
      T007I29_A460FasDsc = new String[] {""} ;
      T007I30_A361DisCod = new int[1] ;
      T007I30_A2265BarExt = new byte[1] ;
      T007I30_n2265BarExt = new boolean[] {false} ;
      T007I30_A212BarSer = new String[] {""} ;
      T007I30_A182BarMat = new String[] {""} ;
      T007I30_A1500BarNMtr = new String[] {""} ;
      T007I31_A1157TipConCod = new short[1] ;
      T007I31_n1157TipConCod = new boolean[] {false} ;
      T007I33_A898BarPieNDes = new int[1] ;
      T007I33_n898BarPieNDes = new boolean[] {false} ;
      T007I34_A396EmprCod = new String[] {""} ;
      T007I34_A2253SalExtAlb = new int[1] ;
      T007I34_A129BarCod = new int[1] ;
      T007I34_A132BarCodReo = new byte[1] ;
      T007I34_A130BarCodPar = new String[] {""} ;
      T007I3_A2253SalExtAlb = new int[1] ;
      T007I3_A3556SalExtCoE = new short[1] ;
      T007I3_n3556SalExtCoE = new boolean[] {false} ;
      T007I3_A2255SalExtObs1 = new String[] {""} ;
      T007I3_n2255SalExtObs1 = new boolean[] {false} ;
      T007I3_A2259SalExtFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T007I3_n2259SalExtFeR = new boolean[] {false} ;
      T007I3_A2260SalExtKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I3_n2260SalExtKgR = new boolean[] {false} ;
      T007I3_A2261SalExtCoR = new short[1] ;
      T007I3_n2261SalExtCoR = new boolean[] {false} ;
      T007I3_A2262SalExtEsB = new byte[1] ;
      T007I3_n2262SalExtEsB = new boolean[] {false} ;
      T007I3_A2263SalExtPrT = new String[] {""} ;
      T007I3_n2263SalExtPrT = new boolean[] {false} ;
      T007I3_A2264SalExtPoT = new String[] {""} ;
      T007I3_n2264SalExtPoT = new boolean[] {false} ;
      T007I3_A2757SalExtEnt = new String[] {""} ;
      T007I3_n2757SalExtEnt = new boolean[] {false} ;
      T007I3_A2840SalExtMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I3_n2840SalExtMtR = new boolean[] {false} ;
      T007I3_A3555SalExtKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I3_n3555SalExtKgE = new boolean[] {false} ;
      T007I3_A3557SalExtMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I3_n3557SalExtMtE = new boolean[] {false} ;
      T007I3_A396EmprCod = new String[] {""} ;
      T007I3_A457FasCod = new String[] {""} ;
      T007I3_n457FasCod = new boolean[] {false} ;
      T007I3_A129BarCod = new int[1] ;
      T007I3_A132BarCodReo = new byte[1] ;
      T007I3_A130BarCodPar = new String[] {""} ;
      T007I2_A2253SalExtAlb = new int[1] ;
      T007I2_A3556SalExtCoE = new short[1] ;
      T007I2_n3556SalExtCoE = new boolean[] {false} ;
      T007I2_A2255SalExtObs1 = new String[] {""} ;
      T007I2_n2255SalExtObs1 = new boolean[] {false} ;
      T007I2_A2259SalExtFeR = new java.util.Date[] {GXutil.nullDate()} ;
      T007I2_n2259SalExtFeR = new boolean[] {false} ;
      T007I2_A2260SalExtKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I2_n2260SalExtKgR = new boolean[] {false} ;
      T007I2_A2261SalExtCoR = new short[1] ;
      T007I2_n2261SalExtCoR = new boolean[] {false} ;
      T007I2_A2262SalExtEsB = new byte[1] ;
      T007I2_n2262SalExtEsB = new boolean[] {false} ;
      T007I2_A2263SalExtPrT = new String[] {""} ;
      T007I2_n2263SalExtPrT = new boolean[] {false} ;
      T007I2_A2264SalExtPoT = new String[] {""} ;
      T007I2_n2264SalExtPoT = new boolean[] {false} ;
      T007I2_A2757SalExtEnt = new String[] {""} ;
      T007I2_n2757SalExtEnt = new boolean[] {false} ;
      T007I2_A2840SalExtMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I2_n2840SalExtMtR = new boolean[] {false} ;
      T007I2_A3555SalExtKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I2_n3555SalExtKgE = new boolean[] {false} ;
      T007I2_A3557SalExtMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T007I2_n3557SalExtMtE = new boolean[] {false} ;
      T007I2_A396EmprCod = new String[] {""} ;
      T007I2_A457FasCod = new String[] {""} ;
      T007I2_n457FasCod = new boolean[] {false} ;
      T007I2_A129BarCod = new int[1] ;
      T007I2_A132BarCodReo = new byte[1] ;
      T007I2_A130BarCodPar = new String[] {""} ;
      T007I38_A361DisCod = new int[1] ;
      T007I38_A2265BarExt = new byte[1] ;
      T007I38_n2265BarExt = new boolean[] {false} ;
      T007I38_A212BarSer = new String[] {""} ;
      T007I38_A182BarMat = new String[] {""} ;
      T007I38_A1500BarNMtr = new String[] {""} ;
      T007I39_A1157TipConCod = new short[1] ;
      T007I39_n1157TipConCod = new boolean[] {false} ;
      T007I41_A898BarPieNDes = new int[1] ;
      T007I41_n898BarPieNDes = new boolean[] {false} ;
      T007I42_A460FasDsc = new String[] {""} ;
      T007I43_A396EmprCod = new String[] {""} ;
      T007I43_A2253SalExtAlb = new int[1] ;
      T007I43_A6248SalExNln = new short[1] ;
      T007I44_A396EmprCod = new String[] {""} ;
      T007I44_A2253SalExtAlb = new int[1] ;
      T007I44_A129BarCod = new int[1] ;
      T007I44_A132BarCodReo = new byte[1] ;
      T007I44_A130BarCodPar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV20Modo = "" ;
      i2256SalExtFec = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int5 = new byte[1] ;
      GXv_int18 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int14 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_date10 = new java.util.Date[1] ;
      T007I45_A407EmprNom = new String[] {""} ;
      T007I45_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ2256SalExtFec = GXutil.nullDate() ;
      ZZ2254SalExtSec = "" ;
      ZZV17UsurCod = "" ;
      ZZ841TrnNom = "" ;
      ZZ2249ManNom = "" ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_char15 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      ZV23Kilos = DecimalUtil.ZERO ;
      ZV26Metros = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.textsal__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.textsal__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.textsal__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.textsal__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.textsal__default(),
         new Object[] {
             new Object[] {
            T007I2_A2253SalExtAlb, T007I2_A3556SalExtCoE, T007I2_n3556SalExtCoE, T007I2_A2255SalExtObs1, T007I2_n2255SalExtObs1, T007I2_A2259SalExtFeR, T007I2_n2259SalExtFeR, T007I2_A2260SalExtKgR, T007I2_n2260SalExtKgR, T007I2_A2261SalExtCoR,
            T007I2_n2261SalExtCoR, T007I2_A2262SalExtEsB, T007I2_n2262SalExtEsB, T007I2_A2263SalExtPrT, T007I2_n2263SalExtPrT, T007I2_A2264SalExtPoT, T007I2_n2264SalExtPoT, T007I2_A2757SalExtEnt, T007I2_n2757SalExtEnt, T007I2_A2840SalExtMtR,
            T007I2_n2840SalExtMtR, T007I2_A3555SalExtKgE, T007I2_n3555SalExtKgE, T007I2_A3557SalExtMtE, T007I2_n3557SalExtMtE, T007I2_A396EmprCod, T007I2_A457FasCod, T007I2_n457FasCod, T007I2_A129BarCod, T007I2_A132BarCodReo,
            T007I2_A130BarCodPar
            }
            , new Object[] {
            T007I3_A2253SalExtAlb, T007I3_A3556SalExtCoE, T007I3_n3556SalExtCoE, T007I3_A2255SalExtObs1, T007I3_n2255SalExtObs1, T007I3_A2259SalExtFeR, T007I3_n2259SalExtFeR, T007I3_A2260SalExtKgR, T007I3_n2260SalExtKgR, T007I3_A2261SalExtCoR,
            T007I3_n2261SalExtCoR, T007I3_A2262SalExtEsB, T007I3_n2262SalExtEsB, T007I3_A2263SalExtPrT, T007I3_n2263SalExtPrT, T007I3_A2264SalExtPoT, T007I3_n2264SalExtPoT, T007I3_A2757SalExtEnt, T007I3_n2757SalExtEnt, T007I3_A2840SalExtMtR,
            T007I3_n2840SalExtMtR, T007I3_A3555SalExtKgE, T007I3_n3555SalExtKgE, T007I3_A3557SalExtMtE, T007I3_n3557SalExtMtE, T007I3_A396EmprCod, T007I3_A457FasCod, T007I3_n457FasCod, T007I3_A129BarCod, T007I3_A132BarCodReo,
            T007I3_A130BarCodPar
            }
            , new Object[] {
            T007I4_A460FasDsc
            }
            , new Object[] {
            T007I5_A361DisCod, T007I5_A2265BarExt, T007I5_n2265BarExt, T007I5_A212BarSer, T007I5_A182BarMat, T007I5_A1500BarNMtr
            }
            , new Object[] {
            T007I6_A1157TipConCod, T007I6_n1157TipConCod
            }
            , new Object[] {
            T007I8_A898BarPieNDes, T007I8_n898BarPieNDes
            }
            , new Object[] {
            T007I9_A2253SalExtAlb, T007I9_A2256SalExtFec, T007I9_A2257SalExtEst, T007I9_A2258SalExtLis, T007I9_A2254SalExtSec, T007I9_A396EmprCod, T007I9_A840TrnCod, T007I9_n840TrnCod, T007I9_A2248ManCod
            }
            , new Object[] {
            T007I10_A2253SalExtAlb, T007I10_A2256SalExtFec, T007I10_A2257SalExtEst, T007I10_A2258SalExtLis, T007I10_A2254SalExtSec, T007I10_A396EmprCod, T007I10_A840TrnCod, T007I10_n840TrnCod, T007I10_A2248ManCod
            }
            , new Object[] {
            T007I11_A407EmprNom, T007I11_n407EmprNom
            }
            , new Object[] {
            T007I12_A841TrnNom, T007I12_n841TrnNom
            }
            , new Object[] {
            T007I13_A2249ManNom, T007I13_n2249ManNom
            }
            , new Object[] {
            T007I14_A2253SalExtAlb, T007I14_A407EmprNom, T007I14_n407EmprNom, T007I14_A2249ManNom, T007I14_n2249ManNom, T007I14_A841TrnNom, T007I14_n841TrnNom, T007I14_A2256SalExtFec, T007I14_A2257SalExtEst, T007I14_A2258SalExtLis,
            T007I14_A2254SalExtSec, T007I14_A396EmprCod, T007I14_A840TrnCod, T007I14_n840TrnCod, T007I14_A2248ManCod
            }
            , new Object[] {
            T007I15_A841TrnNom, T007I15_n841TrnNom
            }
            , new Object[] {
            T007I16_A2249ManNom, T007I16_n2249ManNom
            }
            , new Object[] {
            T007I17_A396EmprCod, T007I17_A2253SalExtAlb
            }
            , new Object[] {
            T007I18_A396EmprCod, T007I18_A2253SalExtAlb
            }
            , new Object[] {
            T007I19_A396EmprCod, T007I19_A2253SalExtAlb
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T007I23_A2249ManNom, T007I23_n2249ManNom
            }
            , new Object[] {
            T007I24_A841TrnNom, T007I24_n841TrnNom
            }
            , new Object[] {
            T007I25_A396EmprCod, T007I25_A2253SalExtAlb, T007I25_A6248SalExNln
            }
            , new Object[] {
            T007I26_A396EmprCod, T007I26_A2253SalExtAlb
            }
            , new Object[] {
            T007I28_A361DisCod, T007I28_A2253SalExtAlb, T007I28_A3556SalExtCoE, T007I28_n3556SalExtCoE, T007I28_A2265BarExt, T007I28_n2265BarExt, T007I28_A212BarSer, T007I28_A182BarMat, T007I28_A1500BarNMtr, T007I28_A460FasDsc,
            T007I28_A2255SalExtObs1, T007I28_n2255SalExtObs1, T007I28_A2259SalExtFeR, T007I28_n2259SalExtFeR, T007I28_A2260SalExtKgR, T007I28_n2260SalExtKgR, T007I28_A2261SalExtCoR, T007I28_n2261SalExtCoR, T007I28_A2262SalExtEsB, T007I28_n2262SalExtEsB,
            T007I28_A2263SalExtPrT, T007I28_n2263SalExtPrT, T007I28_A2264SalExtPoT, T007I28_n2264SalExtPoT, T007I28_A2757SalExtEnt, T007I28_n2757SalExtEnt, T007I28_A2840SalExtMtR, T007I28_n2840SalExtMtR, T007I28_A3555SalExtKgE, T007I28_n3555SalExtKgE,
            T007I28_A3557SalExtMtE, T007I28_n3557SalExtMtE, T007I28_A396EmprCod, T007I28_A457FasCod, T007I28_n457FasCod, T007I28_A129BarCod, T007I28_A132BarCodReo, T007I28_A130BarCodPar, T007I28_A1157TipConCod, T007I28_n1157TipConCod,
            T007I28_A898BarPieNDes, T007I28_n898BarPieNDes
            }
            , new Object[] {
            T007I29_A460FasDsc
            }
            , new Object[] {
            T007I30_A361DisCod, T007I30_A2265BarExt, T007I30_n2265BarExt, T007I30_A212BarSer, T007I30_A182BarMat, T007I30_A1500BarNMtr
            }
            , new Object[] {
            T007I31_A1157TipConCod, T007I31_n1157TipConCod
            }
            , new Object[] {
            T007I33_A898BarPieNDes, T007I33_n898BarPieNDes
            }
            , new Object[] {
            T007I34_A396EmprCod, T007I34_A2253SalExtAlb, T007I34_A129BarCod, T007I34_A132BarCodReo, T007I34_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T007I38_A361DisCod, T007I38_A2265BarExt, T007I38_n2265BarExt, T007I38_A212BarSer, T007I38_A182BarMat, T007I38_A1500BarNMtr
            }
            , new Object[] {
            T007I39_A1157TipConCod, T007I39_n1157TipConCod
            }
            , new Object[] {
            T007I41_A898BarPieNDes, T007I41_n898BarPieNDes
            }
            , new Object[] {
            T007I42_A460FasDsc
            }
            , new Object[] {
            T007I43_A396EmprCod, T007I43_A2253SalExtAlb, T007I43_A6248SalExNln
            }
            , new Object[] {
            T007I44_A396EmprCod, T007I44_A2253SalExtAlb, T007I44_A129BarCod, T007I44_A132BarCodReo, T007I44_A130BarCodPar
            }
            , new Object[] {
            T007I45_A407EmprNom, T007I45_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z2258SalExtLis = (byte)(0) ;
      A2258SalExtLis = (byte)(0) ;
      i2258SalExtLis = (byte)(0) ;
      Z2257SalExtEst = (byte)(0) ;
      A2257SalExtEst = (byte)(0) ;
      i2257SalExtEst = (byte)(0) ;
      Z2256SalExtFec = GXutil.today( ) ;
      i2256SalExtFec = GXutil.today( ) ;
      A2256SalExtFec = GXutil.today( ) ;
   }

   private byte Z2257SalExtEst ;
   private byte Z2258SalExtLis ;
   private byte Z132BarCodReo ;
   private byte Z2262SalExtEsB ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A2257SalExtEst ;
   private byte A2258SalExtLis ;
   private byte Gx_BScreen ;
   private byte A2265BarExt ;
   private byte A2262SalExtEsB ;
   private byte AV27Siltek ;
   private byte AV28Tespec ;
   private byte Z2265BarExt ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2257SalExtEst ;
   private byte i2258SalExtLis ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int5[] ;
   private byte ZZ2257SalExtEst ;
   private byte ZZ2258SalExtLis ;
   private byte GXv_int11[] ;
   private short Z840TrnCod ;
   private short Z2248ManCod ;
   private short Z3556SalExtCoE ;
   private short Z2261SalExtCoR ;
   private short nRcdDeleted_306 ;
   private short nRcdExists_306 ;
   private short nIsMod_306 ;
   private short A840TrnCod ;
   private short A2248ManCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount306 ;
   private short RcdFound306 ;
   private short nBlankRcdUsr306 ;
   private short A1157TipConCod ;
   private short A2261SalExtCoR ;
   private short A3556SalExtCoE ;
   private short RcdFound305 ;
   private short nIsDirty_305 ;
   private short Z1157TipConCod ;
   private short nIsDirty_306 ;
   private short GXv_int18[] ;
   private short GXv_int14[] ;
   private short GXv_int12[] ;
   private short ZZ2248ManCod ;
   private short ZZ840TrnCod ;
   private int Z2253SalExtAlb ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int A2253SalExtAlb ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtSalExtAlb_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtManCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtManNom_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtSalExtFec_Enabled ;
   private int edtSalExtEst_Enabled ;
   private int edtSalExtLis_Enabled ;
   private int edtSalExtSec_Enabled ;
   private int edtavnRcdDeleted_306_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarExt_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarMat_Enabled ;
   private int edtBarNMtr_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtBarPieNDes_Enabled ;
   private int edtTipConCod_Enabled ;
   private int edtTipConDsc_Enabled ;
   private int edtSalExtObs1_Enabled ;
   private int edtSalExtFeR_Enabled ;
   private int edtSalExtKgR_Enabled ;
   private int edtSalExtCoR_Enabled ;
   private int edtSalExtEsB_Enabled ;
   private int edtSalExtPrT_Enabled ;
   private int edtSalExtPoT_Enabled ;
   private int edtSalExtEnt_Enabled ;
   private int edtSalExtMtR_Enabled ;
   private int edtSalExtKgE_Enabled ;
   private int edtSalExtCoE_Enabled ;
   private int edtSalExtMtE_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV22SalExtALb ;
   private int A898BarPieNDes ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int Z898BarPieNDes ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtTipConCod_Enabled ;
   private int defedtBarCodPar_Enabled ;
   private int defedtBarCodReo_Enabled ;
   private int defedtBarCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSalExtSec_Backcolor ;
   private int edtSalExtLis_Backcolor ;
   private int edtSalExtEst_Backcolor ;
   private int edtSalExtFec_Backcolor ;
   private int edtTrnNom_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtManNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtManCod_Backcolor ;
   private int edtSalExtAlb_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int6[] ;
   private int ZZ2253SalExtAlb ;
   private int GXv_int7[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2260SalExtKgR ;
   private java.math.BigDecimal Z2840SalExtMtR ;
   private java.math.BigDecimal Z3555SalExtKgE ;
   private java.math.BigDecimal Z3557SalExtMtE ;
   private java.math.BigDecimal AV23Kilos ;
   private java.math.BigDecimal AV26Metros ;
   private java.math.BigDecimal A2260SalExtKgR ;
   private java.math.BigDecimal A2840SalExtMtR ;
   private java.math.BigDecimal A3555SalExtKgE ;
   private java.math.BigDecimal A3557SalExtMtE ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal ZV23Kilos ;
   private java.math.BigDecimal ZV26Metros ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2254SalExtSec ;
   private String Z130BarCodPar ;
   private String Z2255SalExtObs1 ;
   private String Z2263SalExtPrT ;
   private String Z2264SalExtPoT ;
   private String Z2757SalExtEnt ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSalExtAlb_Internalname ;
   private String sGXsfl_75_idx="0001" ;
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
   private String edtSalExtAlb_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtManNom_Internalname ;
   private String A2249ManNom ;
   private String edtManNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSalExtFec_Internalname ;
   private String edtSalExtFec_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSalExtEst_Internalname ;
   private String edtSalExtEst_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSalExtLis_Internalname ;
   private String edtSalExtLis_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtSalExtSec_Internalname ;
   private String A2254SalExtSec ;
   private String edtSalExtSec_Jsonclick ;
   private String sMode306 ;
   private String edtavnRcdDeleted_306_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtBarExt_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarMat_Internalname ;
   private String edtBarNMtr_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtBarPieNDes_Internalname ;
   private String edtTipConCod_Internalname ;
   private String edtTipConDsc_Internalname ;
   private String edtSalExtObs1_Internalname ;
   private String edtSalExtFeR_Internalname ;
   private String edtSalExtKgR_Internalname ;
   private String edtSalExtCoR_Internalname ;
   private String edtSalExtEsB_Internalname ;
   private String edtSalExtPrT_Internalname ;
   private String edtSalExtPoT_Internalname ;
   private String edtSalExtEnt_Internalname ;
   private String edtSalExtMtR_Internalname ;
   private String edtSalExtKgE_Internalname ;
   private String edtSalExtCoE_Internalname ;
   private String edtSalExtMtE_Internalname ;
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
   private String AV20Modo ;
   private String AV17UsurCod ;
   private String AV21EmprCod ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode305 ;
   private String GXCCtl ;
   private String A212BarSer ;
   private String A182BarMat ;
   private String A1500BarNMtr ;
   private String A460FasDsc ;
   private String A997TipConDsc ;
   private String A2255SalExtObs1 ;
   private String A2263SalExtPrT ;
   private String A2264SalExtPoT ;
   private String A2757SalExtEnt ;
   private String AV19Station ;
   private String AV16EmprNom ;
   private String AV24Lit0 ;
   private String AV25LitFe ;
   private String AV34Lit2 ;
   private String AV29Lit3 ;
   private String AV32Lit4 ;
   private String AV33Lit5 ;
   private String AV30Lit6 ;
   private String AV31Lit7 ;
   private String GXt_char4 ;
   private String Z407EmprNom ;
   private String Z2249ManNom ;
   private String Z841TrnNom ;
   private String Z212BarSer ;
   private String Z182BarMat ;
   private String Z1500BarNMtr ;
   private String Z460FasDsc ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_306_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarMat_Jsonclick ;
   private String edtBarNMtr_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtBarPieNDes_Jsonclick ;
   private String edtTipConCod_Jsonclick ;
   private String edtTipConDsc_Jsonclick ;
   private String edtSalExtObs1_Jsonclick ;
   private String edtSalExtFeR_Jsonclick ;
   private String edtSalExtKgR_Jsonclick ;
   private String edtSalExtCoR_Jsonclick ;
   private String edtSalExtEsB_Jsonclick ;
   private String edtSalExtPrT_Jsonclick ;
   private String edtSalExtPoT_Jsonclick ;
   private String edtSalExtEnt_Jsonclick ;
   private String edtSalExtMtR_Jsonclick ;
   private String edtSalExtKgE_Jsonclick ;
   private String edtSalExtCoE_Jsonclick ;
   private String edtSalExtMtE_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV20Modo ;
   private String subGrid1_Header ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ2254SalExtSec ;
   private String ZZV17UsurCod ;
   private String ZZ841TrnNom ;
   private String ZZ2249ManNom ;
   private String GXv_char15[] ;
   private String GXv_char3[] ;
   private java.util.Date Z2256SalExtFec ;
   private java.util.Date Z2259SalExtFeR ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A2259SalExtFeR ;
   private java.util.Date i2256SalExtFec ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date ZZ2256SalExtFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n457FasCod ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n2249ManNom ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n3556SalExtCoE ;
   private boolean n2265BarExt ;
   private boolean n2255SalExtObs1 ;
   private boolean n2259SalExtFeR ;
   private boolean n2260SalExtKgR ;
   private boolean n2261SalExtCoR ;
   private boolean n2262SalExtEsB ;
   private boolean n2263SalExtPrT ;
   private boolean n2264SalExtPoT ;
   private boolean n2757SalExtEnt ;
   private boolean n2840SalExtMtR ;
   private boolean n3555SalExtKgE ;
   private boolean n3557SalExtMtE ;
   private boolean n1157TipConCod ;
   private boolean n898BarPieNDes ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T007I11_A407EmprNom ;
   private boolean[] T007I11_n407EmprNom ;
   private int[] T007I14_A2253SalExtAlb ;
   private String[] T007I14_A407EmprNom ;
   private boolean[] T007I14_n407EmprNom ;
   private String[] T007I14_A2249ManNom ;
   private boolean[] T007I14_n2249ManNom ;
   private String[] T007I14_A841TrnNom ;
   private boolean[] T007I14_n841TrnNom ;
   private java.util.Date[] T007I14_A2256SalExtFec ;
   private byte[] T007I14_A2257SalExtEst ;
   private byte[] T007I14_A2258SalExtLis ;
   private String[] T007I14_A2254SalExtSec ;
   private String[] T007I14_A396EmprCod ;
   private short[] T007I14_A840TrnCod ;
   private boolean[] T007I14_n840TrnCod ;
   private short[] T007I14_A2248ManCod ;
   private String[] T007I12_A841TrnNom ;
   private boolean[] T007I12_n841TrnNom ;
   private String[] T007I13_A2249ManNom ;
   private boolean[] T007I13_n2249ManNom ;
   private String[] T007I15_A841TrnNom ;
   private boolean[] T007I15_n841TrnNom ;
   private String[] T007I16_A2249ManNom ;
   private boolean[] T007I16_n2249ManNom ;
   private String[] T007I17_A396EmprCod ;
   private int[] T007I17_A2253SalExtAlb ;
   private int[] T007I10_A2253SalExtAlb ;
   private java.util.Date[] T007I10_A2256SalExtFec ;
   private byte[] T007I10_A2257SalExtEst ;
   private byte[] T007I10_A2258SalExtLis ;
   private String[] T007I10_A2254SalExtSec ;
   private String[] T007I10_A396EmprCod ;
   private short[] T007I10_A840TrnCod ;
   private boolean[] T007I10_n840TrnCod ;
   private short[] T007I10_A2248ManCod ;
   private String[] T007I18_A396EmprCod ;
   private int[] T007I18_A2253SalExtAlb ;
   private String[] T007I19_A396EmprCod ;
   private int[] T007I19_A2253SalExtAlb ;
   private int[] T007I9_A2253SalExtAlb ;
   private java.util.Date[] T007I9_A2256SalExtFec ;
   private byte[] T007I9_A2257SalExtEst ;
   private byte[] T007I9_A2258SalExtLis ;
   private String[] T007I9_A2254SalExtSec ;
   private String[] T007I9_A396EmprCod ;
   private short[] T007I9_A840TrnCod ;
   private boolean[] T007I9_n840TrnCod ;
   private short[] T007I9_A2248ManCod ;
   private String[] T007I23_A2249ManNom ;
   private boolean[] T007I23_n2249ManNom ;
   private String[] T007I24_A841TrnNom ;
   private boolean[] T007I24_n841TrnNom ;
   private String[] T007I25_A396EmprCod ;
   private int[] T007I25_A2253SalExtAlb ;
   private short[] T007I25_A6248SalExNln ;
   private String[] T007I26_A396EmprCod ;
   private int[] T007I26_A2253SalExtAlb ;
   private int[] T007I28_A361DisCod ;
   private int[] T007I28_A2253SalExtAlb ;
   private short[] T007I28_A3556SalExtCoE ;
   private boolean[] T007I28_n3556SalExtCoE ;
   private byte[] T007I28_A2265BarExt ;
   private boolean[] T007I28_n2265BarExt ;
   private String[] T007I28_A212BarSer ;
   private String[] T007I28_A182BarMat ;
   private String[] T007I28_A1500BarNMtr ;
   private String[] T007I28_A460FasDsc ;
   private String[] T007I28_A2255SalExtObs1 ;
   private boolean[] T007I28_n2255SalExtObs1 ;
   private java.util.Date[] T007I28_A2259SalExtFeR ;
   private boolean[] T007I28_n2259SalExtFeR ;
   private java.math.BigDecimal[] T007I28_A2260SalExtKgR ;
   private boolean[] T007I28_n2260SalExtKgR ;
   private short[] T007I28_A2261SalExtCoR ;
   private boolean[] T007I28_n2261SalExtCoR ;
   private byte[] T007I28_A2262SalExtEsB ;
   private boolean[] T007I28_n2262SalExtEsB ;
   private String[] T007I28_A2263SalExtPrT ;
   private boolean[] T007I28_n2263SalExtPrT ;
   private String[] T007I28_A2264SalExtPoT ;
   private boolean[] T007I28_n2264SalExtPoT ;
   private String[] T007I28_A2757SalExtEnt ;
   private boolean[] T007I28_n2757SalExtEnt ;
   private java.math.BigDecimal[] T007I28_A2840SalExtMtR ;
   private boolean[] T007I28_n2840SalExtMtR ;
   private java.math.BigDecimal[] T007I28_A3555SalExtKgE ;
   private boolean[] T007I28_n3555SalExtKgE ;
   private java.math.BigDecimal[] T007I28_A3557SalExtMtE ;
   private boolean[] T007I28_n3557SalExtMtE ;
   private String[] T007I28_A396EmprCod ;
   private String[] T007I28_A457FasCod ;
   private boolean[] T007I28_n457FasCod ;
   private int[] T007I28_A129BarCod ;
   private byte[] T007I28_A132BarCodReo ;
   private String[] T007I28_A130BarCodPar ;
   private short[] T007I28_A1157TipConCod ;
   private boolean[] T007I28_n1157TipConCod ;
   private int[] T007I28_A898BarPieNDes ;
   private boolean[] T007I28_n898BarPieNDes ;
   private String[] T007I4_A460FasDsc ;
   private int[] T007I5_A361DisCod ;
   private byte[] T007I5_A2265BarExt ;
   private boolean[] T007I5_n2265BarExt ;
   private String[] T007I5_A212BarSer ;
   private String[] T007I5_A182BarMat ;
   private String[] T007I5_A1500BarNMtr ;
   private short[] T007I6_A1157TipConCod ;
   private boolean[] T007I6_n1157TipConCod ;
   private int[] T007I8_A898BarPieNDes ;
   private boolean[] T007I8_n898BarPieNDes ;
   private String[] T007I29_A460FasDsc ;
   private int[] T007I30_A361DisCod ;
   private byte[] T007I30_A2265BarExt ;
   private boolean[] T007I30_n2265BarExt ;
   private String[] T007I30_A212BarSer ;
   private String[] T007I30_A182BarMat ;
   private String[] T007I30_A1500BarNMtr ;
   private short[] T007I31_A1157TipConCod ;
   private boolean[] T007I31_n1157TipConCod ;
   private int[] T007I33_A898BarPieNDes ;
   private boolean[] T007I33_n898BarPieNDes ;
   private String[] T007I34_A396EmprCod ;
   private int[] T007I34_A2253SalExtAlb ;
   private int[] T007I34_A129BarCod ;
   private byte[] T007I34_A132BarCodReo ;
   private String[] T007I34_A130BarCodPar ;
   private int[] T007I3_A2253SalExtAlb ;
   private short[] T007I3_A3556SalExtCoE ;
   private boolean[] T007I3_n3556SalExtCoE ;
   private String[] T007I3_A2255SalExtObs1 ;
   private boolean[] T007I3_n2255SalExtObs1 ;
   private java.util.Date[] T007I3_A2259SalExtFeR ;
   private boolean[] T007I3_n2259SalExtFeR ;
   private java.math.BigDecimal[] T007I3_A2260SalExtKgR ;
   private boolean[] T007I3_n2260SalExtKgR ;
   private short[] T007I3_A2261SalExtCoR ;
   private boolean[] T007I3_n2261SalExtCoR ;
   private byte[] T007I3_A2262SalExtEsB ;
   private boolean[] T007I3_n2262SalExtEsB ;
   private String[] T007I3_A2263SalExtPrT ;
   private boolean[] T007I3_n2263SalExtPrT ;
   private String[] T007I3_A2264SalExtPoT ;
   private boolean[] T007I3_n2264SalExtPoT ;
   private String[] T007I3_A2757SalExtEnt ;
   private boolean[] T007I3_n2757SalExtEnt ;
   private java.math.BigDecimal[] T007I3_A2840SalExtMtR ;
   private boolean[] T007I3_n2840SalExtMtR ;
   private java.math.BigDecimal[] T007I3_A3555SalExtKgE ;
   private boolean[] T007I3_n3555SalExtKgE ;
   private java.math.BigDecimal[] T007I3_A3557SalExtMtE ;
   private boolean[] T007I3_n3557SalExtMtE ;
   private String[] T007I3_A396EmprCod ;
   private String[] T007I3_A457FasCod ;
   private boolean[] T007I3_n457FasCod ;
   private int[] T007I3_A129BarCod ;
   private byte[] T007I3_A132BarCodReo ;
   private String[] T007I3_A130BarCodPar ;
   private int[] T007I2_A2253SalExtAlb ;
   private short[] T007I2_A3556SalExtCoE ;
   private boolean[] T007I2_n3556SalExtCoE ;
   private String[] T007I2_A2255SalExtObs1 ;
   private boolean[] T007I2_n2255SalExtObs1 ;
   private java.util.Date[] T007I2_A2259SalExtFeR ;
   private boolean[] T007I2_n2259SalExtFeR ;
   private java.math.BigDecimal[] T007I2_A2260SalExtKgR ;
   private boolean[] T007I2_n2260SalExtKgR ;
   private short[] T007I2_A2261SalExtCoR ;
   private boolean[] T007I2_n2261SalExtCoR ;
   private byte[] T007I2_A2262SalExtEsB ;
   private boolean[] T007I2_n2262SalExtEsB ;
   private String[] T007I2_A2263SalExtPrT ;
   private boolean[] T007I2_n2263SalExtPrT ;
   private String[] T007I2_A2264SalExtPoT ;
   private boolean[] T007I2_n2264SalExtPoT ;
   private String[] T007I2_A2757SalExtEnt ;
   private boolean[] T007I2_n2757SalExtEnt ;
   private java.math.BigDecimal[] T007I2_A2840SalExtMtR ;
   private boolean[] T007I2_n2840SalExtMtR ;
   private java.math.BigDecimal[] T007I2_A3555SalExtKgE ;
   private boolean[] T007I2_n3555SalExtKgE ;
   private java.math.BigDecimal[] T007I2_A3557SalExtMtE ;
   private boolean[] T007I2_n3557SalExtMtE ;
   private String[] T007I2_A396EmprCod ;
   private String[] T007I2_A457FasCod ;
   private boolean[] T007I2_n457FasCod ;
   private int[] T007I2_A129BarCod ;
   private byte[] T007I2_A132BarCodReo ;
   private String[] T007I2_A130BarCodPar ;
   private int[] T007I38_A361DisCod ;
   private byte[] T007I38_A2265BarExt ;
   private boolean[] T007I38_n2265BarExt ;
   private String[] T007I38_A212BarSer ;
   private String[] T007I38_A182BarMat ;
   private String[] T007I38_A1500BarNMtr ;
   private short[] T007I39_A1157TipConCod ;
   private boolean[] T007I39_n1157TipConCod ;
   private int[] T007I41_A898BarPieNDes ;
   private boolean[] T007I41_n898BarPieNDes ;
   private String[] T007I42_A460FasDsc ;
   private String[] T007I43_A396EmprCod ;
   private int[] T007I43_A2253SalExtAlb ;
   private short[] T007I43_A6248SalExNln ;
   private String[] T007I44_A396EmprCod ;
   private int[] T007I44_A2253SalExtAlb ;
   private int[] T007I44_A129BarCod ;
   private byte[] T007I44_A132BarCodReo ;
   private String[] T007I44_A130BarCodPar ;
   private String[] T007I45_A407EmprNom ;
   private boolean[] T007I45_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class textsal__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class textsal__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class textsal__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class textsal__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class textsal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T007I2", "SELECT SalExtAlb, SalExtCoE, SalExtObs1, SalExtFeR, SalExtKgR, SalExtCoR, SalExtEsB, SalExtPrT, SalExtPoT, SalExtEnt, SalExtMtR, SalExtKgE, SalExtMtE, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF SalExtCoE, SalExtObs1, SalExtFeR, SalExtKgR, SalExtCoR, SalExtEsB, SalExtPrT, SalExtPoT, SalExtEnt, SalExtMtR, SalExtKgE, SalExtMtE, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I3", "SELECT SalExtAlb, SalExtCoE, SalExtObs1, SalExtFeR, SalExtKgR, SalExtCoR, SalExtEsB, SalExtPrT, SalExtPoT, SalExtEnt, SalExtMtR, SalExtKgE, SalExtMtE, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I4", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I5", "SELECT DisCod, BarExt, BarSer, BarMat, BarNMtr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I6", "SELECT TipConCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I8", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I9", "SELECT SalExtAlb, SalExtFec, SalExtEst, SalExtLis, SalExtSec, EmprCod, TrnCod, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ?  FOR UPDATE OF SalExtFec, SalExtEst, SalExtLis, SalExtSec, TrnCod, ManCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I10", "SELECT SalExtAlb, SalExtFec, SalExtEst, SalExtLis, SalExtSec, EmprCod, TrnCod, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I12", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I13", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I14", "SELECT /*+ FIRST_ROWS(100) */ TM1.SalExtAlb, T2.EmprNom, T3.ManNom, T4.TrnNom, TM1.SalExtFec, TM1.SalExtEst, TM1.SalExtLis, TM1.SalExtSec, TM1.EmprCod, TM1.TrnCod, TM1.ManCod FROM (((TXPCEXTSA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = TM1.EmprCod AND T3.ManCod = TM1.ManCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.SalExtAlb = ? ORDER BY TM1.EmprCod, TM1.SalExtAlb ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I15", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I16", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE ( SalExtAlb > ?) and EmprCod = ? ORDER BY EmprCod, SalExtAlb) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007I19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE ( SalExtAlb < ?) and EmprCod = ? ORDER BY EmprCod DESC, SalExtAlb DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T007I20", "INSERT INTO TXPCEXTSA(SalExtAlb, SalExtFec, SalExtEst, SalExtLis, SalExtSec, EmprCod, TrnCod, ManCod, SalExtObs, SalExUln, SalExtHor, SalExtMat, SalExtUsu, SalExtRec, ManCod_o, SalFecEnt, SalFhh, SalFmd, SalGrossT, SalFmdD, SalSts, SalEnvAT, SalCodeID, SalExtAT, SalExtFen, SalExtPre1, SalExtATCU, SalExtSerA, SalExtTipA, SalFecSal) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCEXTSA")
         ,new UpdateCursor("T007I21", "UPDATE TXPCEXTSA SET SalExtFec=?, SalExtEst=?, SalExtLis=?, SalExtSec=?, TrnCod=?, ManCod=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK, "TXPCEXTSA")
         ,new UpdateCursor("T007I22", "DELETE FROM TXPCEXTSA  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK, "TXPCEXTSA")
         ,new ForEachCursor("T007I23", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I24", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I25", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007I26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I28", "SELECT T2.DisCod, T1.SalExtAlb, T1.SalExtCoE, T2.BarExt, T2.BarSer, T2.BarMat, T2.BarNMtr, T5.FasDsc, T1.SalExtObs1, T1.SalExtFeR, T1.SalExtKgR, T1.SalExtCoR, T1.SalExtEsB, T1.SalExtPrT, T1.SalExtPoT, T1.SalExtEnt, T1.SalExtMtR, T1.SalExtKgE, T1.SalExtMtE, T1.EmprCod, T1.FasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.TipConCod, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes FROM ((((TXPLEXTSA T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPFASPRO T5 ON T5.EmprCod = T1.EmprCod AND T5.FasCod = T1.FasCod) WHERE T1.SalExtAlb = ? and T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I29", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I30", "SELECT DisCod, BarExt, BarSer, BarMat, BarNMtr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I31", "SELECT TipConCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I33", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I34", "SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T007I35", "INSERT INTO TXPLEXTSA(SalExtAlb, SalExtCoE, SalExtObs1, SalExtFeR, SalExtKgR, SalExtCoR, SalExtEsB, SalExtPrT, SalExtPoT, SalExtEnt, SalExtMtR, SalExtKgE, SalExtMtE, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, SalExtFt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPLEXTSA")
         ,new UpdateCursor("T007I36", "UPDATE TXPLEXTSA SET SalExtCoE=?, SalExtObs1=?, SalExtFeR=?, SalExtKgR=?, SalExtCoR=?, SalExtEsB=?, SalExtPrT=?, SalExtPoT=?, SalExtEnt=?, SalExtMtR=?, SalExtKgE=?, SalExtMtE=?, FasCod=?  WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPLEXTSA")
         ,new UpdateCursor("T007I37", "DELETE FROM TXPLEXTSA  WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPLEXTSA")
         ,new ForEachCursor("T007I38", "SELECT DisCod, BarExt, BarSer, BarMat, BarNMtr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I39", "SELECT TipConCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I41", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I42", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I43", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T007I44", "SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE SalExtAlb = ? and EmprCod = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T007I45", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((String[]) buf[26])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((byte[]) buf[29])[0] = rslt.getByte(17);
               ((String[]) buf[30])[0] = rslt.getString(18, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((String[]) buf[26])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((byte[]) buf[29])[0] = rslt.getByte(17);
               ((String[]) buf[30])[0] = rslt.getString(18, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((String[]) buf[9])[0] = rslt.getString(8, 28);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 3);
               ((String[]) buf[33])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(22);
               ((byte[]) buf[36])[0] = rslt.getByte(23);
               ((String[]) buf[37])[0] = rslt.getString(24, 1);
               ((short[]) buf[38])[0] = rslt.getShort(25);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               return;
            case 27 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               return;
            case 34 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 39 :
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 18 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setString(7, (String)parms[7], 3);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 1);
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 2);
               }
               stmt.setString(14, (String)parms[25], 3);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[27], 8);
               }
               stmt.setInt(16, ((Number) parms[28]).intValue());
               stmt.setByte(17, ((Number) parms[29]).byteValue());
               stmt.setString(18, (String)parms[30], 1);
               return;
            case 31 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 8);
               }
               stmt.setString(14, (String)parms[26], 3);
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setInt(16, ((Number) parms[28]).intValue());
               stmt.setByte(17, ((Number) parms[29]).byteValue());
               stmt.setString(18, (String)parms[30], 1);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 38 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

