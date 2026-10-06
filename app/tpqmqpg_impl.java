package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpqmqpg_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action4") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A5191ProForLC = (short)(GXutil.lval( httpContext.GetPar( "ProForLC"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_4_1F9759( Gx_mode, A396EmprCod, A764ProForCod, A5191ProForLC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A6229ProFoMaq = httpContext.GetPar( "ProFoMaq") ;
         n6229ProFoMaq = false ;
         AV33Ya_existe = httpContext.GetPar( "Ya_existe") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ya_existe", AV33Ya_existe);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_1F9759( Gx_mode, A396EmprCod, A764ProForCod, A6229ProFoMaq, AV33Ya_existe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"PROFOQUD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6286ProFoQuC = httpContext.GetPar( "ProFoQuC") ;
         n6286ProFoQuC = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaprofoqud1F9759( A396EmprCod, A6286ProFoQuC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6229ProFoMaq = httpContext.GetPar( "ProFoMaq") ;
         n6229ProFoMaq = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A6229ProFoMaq) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6286ProFoQuC = httpContext.GetPar( "ProFoQuC") ;
         n6286ProFoQuC = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A6286ProFoQuC) ;
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
            A764ProForCod = httpContext.GetPar( "ProForCod") ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PQUIMICOS F(MAQUINA) PROGRAMAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProForDsc_Internalname ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
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

   public tpqmqpg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpqmqpg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpqmqpg_impl.class ));
   }

   public tpqmqpg_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPQMQPG.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Proceso Formula ID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "", "", "", "", "", 1, edtProForCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripción 2", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2), GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc2_Jsonclick, 0, "", "", "", "", "", 1, edtProForDsc2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Num Programa Microprocesador", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumPro_Internalname, GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumPro_Jsonclick, 0, "", "", "", "", "", 1, edtProNumPro_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Tiempo de Pausa", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForPau_Internalname, GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForPau_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForPau_Jsonclick, 0, "", "", "", "", "", 1, edtProForPau_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Relacion Baño Optima Proceso", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRb_Jsonclick, 0, "", "", "", "", "", 1, edtProForRb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Ultima Linea claves", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProFoLCU_Internalname, GXutil.ltrim( localUtil.ntoc( A5190ProFoLCU, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProFoLCU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5190ProFoLCU), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5190ProFoLCU), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProFoLCU_Jsonclick, 0, "", "", "", "", "", 1, edtProFoLCU_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPQMQPG.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount759 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_759 = (short)(1) ;
            scanStart1F9759( ) ;
            while ( RcdFound759 != 0 )
            {
               init_level_properties759( ) ;
               getByPrimaryKey1F9759( ) ;
               addRow1F9759( ) ;
               scanNext1F9759( ) ;
            }
            scanEnd1F9759( ) ;
            nBlankRcdCount759 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1F9759( ) ;
         standaloneModal1F9759( ) ;
         sMode759 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1F9759( ) ;
            edtavnRcdDeleted_759_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_759_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_759_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_759_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProForLC_Title = httpContext.cgiGet( "PROFORLC_"+sGXsfl_65_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForLC_Internalname, "Title", edtProForLC_Title, !bGXsfl_65_Refreshing);
            edtProForLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORLC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProFoPgC_Title = httpContext.cgiGet( "PROFOPGC_"+sGXsfl_65_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoPgC_Internalname, "Title", edtProFoPgC_Title, !bGXsfl_65_Refreshing);
            edtProFoPgC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOPGC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoPgC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoPgC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProFoTmC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOTMC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoTmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoTmC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProFoCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOCLA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoCla_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProFoRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORB_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoRb_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProFoMaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOMAQ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoMaq_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProFoMad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOMAD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoMad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoMad_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProFoQuC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOQUC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoQuC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoQuC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtProFoQuD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOQUD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFoQuD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoQuD_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_759 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1F9759( ) ;
            }
            sendRow1F9759( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode759 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount759 = (short)(5) ;
         nRcdExists_759 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1F9759( ) ;
            while ( RcdFound759 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_65759( ) ;
               init_level_properties759( ) ;
               standaloneNotModal1F9759( ) ;
               getByPrimaryKey1F9759( ) ;
               standaloneModal1F9759( ) ;
               addRow1F9759( ) ;
               scanNext1F9759( ) ;
            }
            scanEnd1F9759( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode759 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_65759( ) ;
      initAll1F9759( ) ;
      init_level_properties759( ) ;
      nRcdExists_759 = (short)(0) ;
      nIsMod_759 = (short)(0) ;
      nRcdDeleted_759 = (short)(0) ;
      nBlankRcdCount759 = (short)(nBlankRcdUsr759+nBlankRcdCount759) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount759 > 0 )
      {
         standaloneNotModal1F9759( ) ;
         standaloneModal1F9759( ) ;
         addRow1F9759( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProForLC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount759 = (short)(nBlankRcdCount759-1) ;
      }
      Gx_mode = sMode759 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPQMQPG.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPQMQPG.htm");
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
      e111F92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            Z766ProForDsc = httpContext.cgiGet( "Z766ProForDsc") ;
            Z4715ProForDsc2 = httpContext.cgiGet( "Z4715ProForDsc2") ;
            Z2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( "Z2392ProNumPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( "Z4705ProForPau"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( "Z4706ProForRb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5190ProFoLCU = (short)(localUtil.ctol( httpContext.cgiGet( "Z5190ProFoLCU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19Lit7 = httpContext.cgiGet( "vLIT7") ;
            AV20Lit8 = httpContext.cgiGet( "vLIT8") ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV33Ya_existe = httpContext.cgiGet( "vYA_EXISTE") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
            A4715ProForDsc2 = httpContext.cgiGet( edtProForDsc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProNumPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2392ProNumPro = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            }
            else
            {
               A2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORPAU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForPau_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4705ProForPau = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            }
            else
            {
               A4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORRB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForRb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4706ProForRb = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            }
            else
            {
               A4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFoLCU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFoLCU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFOLCU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProFoLCU_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5190ProFoLCU = (short)(0) ;
               n5190ProFoLCU = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5190ProFoLCU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5190ProFoLCU), 4, 0));
            }
            else
            {
               A5190ProFoLCU = (short)(localUtil.ctol( httpContext.cgiGet( edtProFoLCU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5190ProFoLCU = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5190ProFoLCU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5190ProFoLCU), 4, 0));
            }
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
               A764ProForCod = httpContext.GetPar( "ProForCod") ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
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
                        e111F92 ();
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
            initAll1F989( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_759_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_759_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes1F989( ) ;
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

   public void confirm_1F90( )
   {
      beforeValidate1F989( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1F989( ) ;
         }
         else
         {
            checkExtendedTable1F989( ) ;
            if ( AnyError == 0 )
            {
               zm1F989( 9) ;
            }
            closeExtendedTableCursors1F989( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode89 = Gx_mode ;
         confirm_1F9759( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode89 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1F90( ) ;
      }
   }

   public void confirm_1F9759( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1F9759( ) ;
         if ( ( nRcdExists_759 != 0 ) || ( nIsMod_759 != 0 ) )
         {
            getKey1F9759( ) ;
            if ( ( nRcdExists_759 == 0 ) && ( nRcdDeleted_759 == 0 ) )
            {
               if ( RcdFound759 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1F9759( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1F9759( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1F9759( 11) ;
                        zm1F9759( 12) ;
                     }
                     closeExtendedTableCursors1F9759( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROFORLC_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForLC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound759 != 0 )
               {
                  if ( nRcdDeleted_759 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1F9759( ) ;
                     load1F9759( ) ;
                     beforeValidate1F9759( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1F9759( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_759 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1F9759( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1F9759( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1F9759( 11) ;
                              zm1F9759( 12) ;
                           }
                           closeExtendedTableCursors1F9759( ) ;
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
                  if ( nRcdDeleted_759 == 0 )
                  {
                     GXCCtl = "PROFORLC_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_759_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForLC_Internalname, GXutil.ltrim( localUtil.ntoc( A5191ProForLC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoPgC_Internalname, GXutil.ltrim( localUtil.ntoc( A5192ProFoPgC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoTmC_Internalname, GXutil.ltrim( localUtil.ntoc( A5193ProFoTmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoCla_Internalname, GXutil.rtrim( A5194ProFoCla)) ;
         httpContext.changePostValue( edtProFoRb_Internalname, GXutil.ltrim( localUtil.ntoc( A5951ProFoRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoMaq_Internalname, GXutil.rtrim( A6229ProFoMaq)) ;
         httpContext.changePostValue( edtProFoMad_Internalname, GXutil.rtrim( A6230ProFoMad)) ;
         httpContext.changePostValue( edtProFoQuC_Internalname, GXutil.rtrim( A6286ProFoQuC)) ;
         httpContext.changePostValue( edtProFoQuD_Internalname, GXutil.rtrim( A6287ProFoQuD)) ;
         httpContext.changePostValue( "ZT_"+"Z5191ProForLC_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5191ProForLC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5192ProFoPgC_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5192ProFoPgC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5193ProFoTmC_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5193ProFoTmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5194ProFoCla_"+sGXsfl_65_idx, GXutil.rtrim( Z5194ProFoCla)) ;
         httpContext.changePostValue( "ZT_"+"Z5951ProFoRb_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5951ProFoRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6229ProFoMaq_"+sGXsfl_65_idx, GXutil.rtrim( Z6229ProFoMaq)) ;
         httpContext.changePostValue( "ZT_"+"Z6286ProFoQuC_"+sGXsfl_65_idx, GXutil.rtrim( Z6286ProFoQuC)) ;
         httpContext.changePostValue( "nRcdDeleted_759_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_759_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_759_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_759 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_759_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_759_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORLC_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtProForLC_Title)) ;
            httpContext.changePostValue( "PROFORLC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOPGC_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtProFoPgC_Title)) ;
            httpContext.changePostValue( "PROFOPGC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoPgC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOTMC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoTmC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOCLA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOMAQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoMaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOMAD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoMad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOQUC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoQuC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOQUD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoQuD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1F90( )
   {
   }

   public void e111F92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN210_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT118_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT408_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT409_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT118_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN448_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit10", AV21Lit10);
      GXt_char1 = AV32Msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char2) ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Msg0", AV32Msg0);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpqmqpg_impl.this.A396EmprCod = GXv_char2[0] ;
      tpqmqpg_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpqmqpg_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1F989( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z766ProForDsc = T01F97_A766ProForDsc[0] ;
            Z4715ProForDsc2 = T01F97_A4715ProForDsc2[0] ;
            Z2392ProNumPro = T01F97_A2392ProNumPro[0] ;
            Z4705ProForPau = T01F97_A4705ProForPau[0] ;
            Z4706ProForRb = T01F97_A4706ProForRb[0] ;
            Z5190ProFoLCU = T01F97_A5190ProFoLCU[0] ;
         }
         else
         {
            Z766ProForDsc = A766ProForDsc ;
            Z4715ProForDsc2 = A4715ProForDsc2 ;
            Z2392ProNumPro = A2392ProNumPro ;
            Z4705ProForPau = A4705ProForPau ;
            Z4706ProForRb = A4706ProForRb ;
            Z5190ProFoLCU = A5190ProFoLCU ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
         Z4715ProForDsc2 = A4715ProForDsc2 ;
         Z2392ProNumPro = A2392ProNumPro ;
         Z4705ProForPau = A4705ProForPau ;
         Z4706ProForRb = A4706ProForRb ;
         Z5190ProFoLCU = A5190ProFoLCU ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TPQMQPG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T01F98 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01F98_A407EmprNom[0] ;
      n407EmprNom = T01F98_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      edtProForLC_Title = AV19Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLC_Internalname, "Title", edtProForLC_Title, !bGXsfl_65_Refreshing);
      edtProFoPgC_Title = AV20Lit8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoPgC_Internalname, "Title", edtProFoPgC_Title, !bGXsfl_65_Refreshing);
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

   public void load1F989( )
   {
      /* Using cursor T01F99 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A766ProForDsc = T01F99_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01F99_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A407EmprNom = T01F99_A407EmprNom[0] ;
         n407EmprNom = T01F99_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2392ProNumPro = T01F99_A2392ProNumPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A4705ProForPau = T01F99_A4705ProForPau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A4706ProForRb = T01F99_A4706ProForRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A5190ProFoLCU = T01F99_A5190ProFoLCU[0] ;
         n5190ProFoLCU = T01F99_n5190ProFoLCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5190ProFoLCU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5190ProFoLCU), 4, 0));
         zm1F989( -8) ;
      }
      pr_default.close(7);
      onLoadActions1F989( ) ;
   }

   public void onLoadActions1F989( )
   {
   }

   public void checkExtendedTable1F989( )
   {
      nIsDirty_89 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1F989( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1F989( )
   {
      /* Using cursor T01F910 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
      else
      {
         RcdFound89 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01F97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01F97_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01F97_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1F989( 8) ;
         RcdFound89 = (short)(1) ;
         A766ProForDsc = T01F97_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01F97_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A2392ProNumPro = T01F97_A2392ProNumPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A4705ProForPau = T01F97_A4705ProForPau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A4706ProForRb = T01F97_A4706ProForRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A5190ProFoLCU = T01F97_A5190ProFoLCU[0] ;
         n5190ProFoLCU = T01F97_n5190ProFoLCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5190ProFoLCU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5190ProFoLCU), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1F989( ) ;
         if ( AnyError == 1 )
         {
            RcdFound89 = (short)(0) ;
            initializeNonKey1F989( ) ;
         }
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound89 = (short)(0) ;
         initializeNonKey1F989( ) ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1F989( ) ;
      if ( RcdFound89 == 0 )
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
      RcdFound89 = (short)(0) ;
      /* Using cursor T01F911 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01F911_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F911_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01F911_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F911_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T01F912 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01F912_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F912_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01F912_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F912_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F989( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProForDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1F989( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound89 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
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
               GX_FocusControl = edtProForDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1F989( ) ;
               GX_FocusControl = edtProForDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtProForDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1F989( ) ;
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
                  GX_FocusControl = edtProForDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1F989( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
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
         GX_FocusControl = edtProForDsc_Internalname ;
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
      getKey1F989( ) ;
      if ( RcdFound89 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpqmqpg");
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1F90( ) ;
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
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1F989( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F989( ) ;
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
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
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
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
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
      scanStart1F989( ) ;
      if ( RcdFound89 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound89 != 0 )
         {
            scanNext1F989( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProForDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F989( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1F989( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F96 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z766ProForDsc, T01F96_A766ProForDsc[0]) != 0 ) || ( GXutil.strcmp(Z4715ProForDsc2, T01F96_A4715ProForDsc2[0]) != 0 ) || ( Z2392ProNumPro != T01F96_A2392ProNumPro[0] ) || ( Z4705ProForPau != T01F96_A4705ProForPau[0] ) || ( Z4706ProForRb != T01F96_A4706ProForRb[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5190ProFoLCU != T01F96_A5190ProFoLCU[0] ) )
         {
            if ( GXutil.strcmp(Z766ProForDsc, T01F96_A766ProForDsc[0]) != 0 )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProForDsc");
               GXutil.writeLogRaw("Old: ",Z766ProForDsc);
               GXutil.writeLogRaw("Current: ",T01F96_A766ProForDsc[0]);
            }
            if ( GXutil.strcmp(Z4715ProForDsc2, T01F96_A4715ProForDsc2[0]) != 0 )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProForDsc2");
               GXutil.writeLogRaw("Old: ",Z4715ProForDsc2);
               GXutil.writeLogRaw("Current: ",T01F96_A4715ProForDsc2[0]);
            }
            if ( Z2392ProNumPro != T01F96_A2392ProNumPro[0] )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProNumPro");
               GXutil.writeLogRaw("Old: ",Z2392ProNumPro);
               GXutil.writeLogRaw("Current: ",T01F96_A2392ProNumPro[0]);
            }
            if ( Z4705ProForPau != T01F96_A4705ProForPau[0] )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProForPau");
               GXutil.writeLogRaw("Old: ",Z4705ProForPau);
               GXutil.writeLogRaw("Current: ",T01F96_A4705ProForPau[0]);
            }
            if ( Z4706ProForRb != T01F96_A4706ProForRb[0] )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProForRb");
               GXutil.writeLogRaw("Old: ",Z4706ProForRb);
               GXutil.writeLogRaw("Current: ",T01F96_A4706ProForRb[0]);
            }
            if ( Z5190ProFoLCU != T01F96_A5190ProFoLCU[0] )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProFoLCU");
               GXutil.writeLogRaw("Old: ",Z5190ProFoLCU);
               GXutil.writeLogRaw("Current: ",T01F96_A5190ProFoLCU[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F989( )
   {
      beforeValidate1F989( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F989( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F989( 0) ;
         checkOptimisticConcurrency1F989( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F989( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F989( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F913 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A766ProForDsc, A4715ProForDsc2, Integer.valueOf(A2392ProNumPro), Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), Boolean.valueOf(n5190ProFoLCU), Short.valueOf(A5190ProFoLCU), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
                        processLevel1F989( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1F90( ) ;
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
            load1F989( ) ;
         }
         endLevel1F989( ) ;
      }
      closeExtendedTableCursors1F989( ) ;
   }

   public void update1F989( )
   {
      beforeValidate1F989( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F989( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F989( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F989( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F989( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F914 */
                  pr_default.execute(12, new Object[] {A766ProForDsc, A4715ProForDsc2, Integer.valueOf(A2392ProNumPro), Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), Boolean.valueOf(n5190ProFoLCU), Short.valueOf(A5190ProFoLCU), A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F989( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1F989( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1F90( ) ;
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
         endLevel1F989( ) ;
      }
      closeExtendedTableCursors1F989( ) ;
   }

   public void deferredUpdate1F989( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F989( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F989( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F989( ) ;
         afterConfirm1F989( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F989( ) ;
            if ( AnyError == 0 )
            {
               scanStart1F9759( ) ;
               while ( RcdFound759 != 0 )
               {
                  getByPrimaryKey1F9759( ) ;
                  delete1F9759( ) ;
                  scanNext1F9759( ) ;
               }
               scanEnd1F9759( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F915 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound89 == 0 )
                        {
                           initAll1F989( ) ;
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
                        resetCaption1F90( ) ;
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
      sMode89 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F989( ) ;
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F989( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01F916 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01F917 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01F918 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01F919 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01F920 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01F921 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FTPQS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01F922 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01F923 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PQPRGNO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01F924 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01F925 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01F926 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01F927 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01F928 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01F929 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")+" ("+httpContext.getMessage( "PQuimicos", "")+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01F930 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01F931 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01F932 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas de Formulación por Fase", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01F933 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01F934 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01F935 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01F936 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01F937 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01F938 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPROFO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
      }
   }

   public void processNestedLevel1F9759( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1F9759( ) ;
         if ( ( nRcdExists_759 != 0 ) || ( nIsMod_759 != 0 ) )
         {
            standaloneNotModal1F9759( ) ;
            getKey1F9759( ) ;
            if ( ( nRcdExists_759 == 0 ) && ( nRcdDeleted_759 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1F9759( ) ;
            }
            else
            {
               if ( RcdFound759 != 0 )
               {
                  if ( ( nRcdDeleted_759 != 0 ) && ( nRcdExists_759 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1F9759( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_759 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1F9759( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_759 == 0 )
                  {
                     GXCCtl = "PROFORLC_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForLC_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_759_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForLC_Internalname, GXutil.ltrim( localUtil.ntoc( A5191ProForLC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoPgC_Internalname, GXutil.ltrim( localUtil.ntoc( A5192ProFoPgC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoTmC_Internalname, GXutil.ltrim( localUtil.ntoc( A5193ProFoTmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoCla_Internalname, GXutil.rtrim( A5194ProFoCla)) ;
         httpContext.changePostValue( edtProFoRb_Internalname, GXutil.ltrim( localUtil.ntoc( A5951ProFoRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProFoMaq_Internalname, GXutil.rtrim( A6229ProFoMaq)) ;
         httpContext.changePostValue( edtProFoMad_Internalname, GXutil.rtrim( A6230ProFoMad)) ;
         httpContext.changePostValue( edtProFoQuC_Internalname, GXutil.rtrim( A6286ProFoQuC)) ;
         httpContext.changePostValue( edtProFoQuD_Internalname, GXutil.rtrim( A6287ProFoQuD)) ;
         httpContext.changePostValue( "ZT_"+"Z5191ProForLC_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5191ProForLC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5192ProFoPgC_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5192ProFoPgC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5193ProFoTmC_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5193ProFoTmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5194ProFoCla_"+sGXsfl_65_idx, GXutil.rtrim( Z5194ProFoCla)) ;
         httpContext.changePostValue( "ZT_"+"Z5951ProFoRb_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5951ProFoRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6229ProFoMaq_"+sGXsfl_65_idx, GXutil.rtrim( Z6229ProFoMaq)) ;
         httpContext.changePostValue( "ZT_"+"Z6286ProFoQuC_"+sGXsfl_65_idx, GXutil.rtrim( Z6286ProFoQuC)) ;
         httpContext.changePostValue( "nRcdDeleted_759_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_759_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_759_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_759 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_759_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_759_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORLC_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtProForLC_Title)) ;
            httpContext.changePostValue( "PROFORLC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOPGC_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtProFoPgC_Title)) ;
            httpContext.changePostValue( "PROFOPGC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoPgC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOTMC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoTmC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOCLA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOMAQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoMaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOMAD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoMad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOQUC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoQuC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFOQUD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoQuD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1F9759( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_759 = (short)(0) ;
      nIsMod_759 = (short)(0) ;
      nRcdDeleted_759 = (short)(0) ;
   }

   public void processLevel1F989( )
   {
      /* Save parent mode. */
      sMode89 = Gx_mode ;
      processNestedLevel1F9759( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1F989( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F989( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpqmqpg");
         if ( AnyError == 0 )
         {
            confirmValues1F90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpqmqpg");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1F989( )
   {
      /* Scan By routine */
      /* Using cursor T01F939 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F989( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
   }

   public void scanEnd1F989( )
   {
      pr_default.close(37);
   }

   public void afterConfirm1F989( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F989( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F989( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F989( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F989( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F989( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F989( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtProForDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtProNumPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumPro_Enabled), 5, 0), true);
      edtProForPau_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Enabled), 5, 0), true);
      edtProForRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRb_Enabled), 5, 0), true);
      edtProFoLCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoLCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoLCU_Enabled), 5, 0), true);
   }

   public void zm1F9759( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5192ProFoPgC = T01F93_A5192ProFoPgC[0] ;
            Z5193ProFoTmC = T01F93_A5193ProFoTmC[0] ;
            Z5194ProFoCla = T01F93_A5194ProFoCla[0] ;
            Z5951ProFoRb = T01F93_A5951ProFoRb[0] ;
            Z6229ProFoMaq = T01F93_A6229ProFoMaq[0] ;
            Z6286ProFoQuC = T01F93_A6286ProFoQuC[0] ;
         }
         else
         {
            Z5192ProFoPgC = A5192ProFoPgC ;
            Z5193ProFoTmC = A5193ProFoTmC ;
            Z5194ProFoCla = A5194ProFoCla ;
            Z5951ProFoRb = A5951ProFoRb ;
            Z6229ProFoMaq = A6229ProFoMaq ;
            Z6286ProFoQuC = A6286ProFoQuC ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z764ProForCod = A764ProForCod ;
         Z5191ProForLC = A5191ProForLC ;
         Z5192ProFoPgC = A5192ProFoPgC ;
         Z5193ProFoTmC = A5193ProFoTmC ;
         Z5194ProFoCla = A5194ProFoCla ;
         Z5951ProFoRb = A5951ProFoRb ;
         Z396EmprCod = A396EmprCod ;
         Z6229ProFoMaq = A6229ProFoMaq ;
         Z6286ProFoQuC = A6286ProFoQuC ;
         Z6230ProFoMad = A6230ProFoMad ;
      }
   }

   public void standaloneNotModal1F9759( )
   {
   }

   public void standaloneModal1F9759( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProForLC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtProForLC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load1F9759( )
   {
      /* Using cursor T01F940 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A5191ProForLC)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound759 = (short)(1) ;
         A5192ProFoPgC = T01F940_A5192ProFoPgC[0] ;
         n5192ProFoPgC = T01F940_n5192ProFoPgC[0] ;
         A5193ProFoTmC = T01F940_A5193ProFoTmC[0] ;
         n5193ProFoTmC = T01F940_n5193ProFoTmC[0] ;
         A5194ProFoCla = T01F940_A5194ProFoCla[0] ;
         n5194ProFoCla = T01F940_n5194ProFoCla[0] ;
         A5951ProFoRb = T01F940_A5951ProFoRb[0] ;
         n5951ProFoRb = T01F940_n5951ProFoRb[0] ;
         A6230ProFoMad = T01F940_A6230ProFoMad[0] ;
         n6230ProFoMad = T01F940_n6230ProFoMad[0] ;
         A6229ProFoMaq = T01F940_A6229ProFoMaq[0] ;
         n6229ProFoMaq = T01F940_n6229ProFoMaq[0] ;
         A6286ProFoQuC = T01F940_A6286ProFoQuC[0] ;
         n6286ProFoQuC = T01F940_n6286ProFoQuC[0] ;
         zm1F9759( -10) ;
      }
      pr_default.close(38);
      onLoadActions1F9759( ) ;
   }

   public void onLoadActions1F9759( )
   {
      GXt_char1 = A6287ProFoQuD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A6286ProFoQuC ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tpqmqpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tpqmqpg_impl.this.A6286ProFoQuC = GXv_char3[0] ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6287ProFoQuD = GXt_char1 ;
   }

   public void checkExtendedTable1F9759( )
   {
      nIsDirty_759 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1F9759( ) ;
      /* Using cursor T01F94 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n6229ProFoMaq), A6229ProFoMaq});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFOMAQ_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaquinasPquimicos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoMaq_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6230ProFoMad = T01F94_A6230ProFoMad[0] ;
      n6230ProFoMad = T01F94_n6230ProFoMad[0] ;
      pr_default.close(2);
      /* Using cursor T01F95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n6286ProFoQuC), A6286ProFoQuC});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PROFOQUC_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PQuimicos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoQuC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      nIsDirty_759 = (short)(1) ;
      GXt_char1 = A6287ProFoQuD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A6286ProFoQuC ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tpqmqpg_impl.this.A396EmprCod = GXv_char4[0] ;
      tpqmqpg_impl.this.A6286ProFoQuC = GXv_char3[0] ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6287ProFoQuD = GXt_char1 ;
      if ( true /* After */ && isIns( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A764ProForCod ;
         GXv_char2[0] = A6229ProFoMaq ;
         GXv_char5[0] = AV33Ya_existe ;
         new app.ppqmqpg(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char5) ;
         tpqmqpg_impl.this.A396EmprCod = GXv_char4[0] ;
         tpqmqpg_impl.this.A764ProForCod = GXv_char3[0] ;
         tpqmqpg_impl.this.A6229ProFoMaq = GXv_char2[0] ;
         tpqmqpg_impl.this.AV33Ya_existe = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ya_existe", AV33Ya_existe);
      }
      if ( true /* After */ && ( GXutil.strcmp(AV33Ya_existe, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  )
      {
         GXCCtl = "PROFOMAQ_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Existe ya esta Maquina ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoMaq_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A6287ProFoQuD, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A6286ProFoQuC)==0) )
      {
         GXCCtl = "PROFOQUC_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoQuC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1F9759( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1F9759( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          String A6229ProFoMaq )
   {
      /* Using cursor T01F941 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n6229ProFoMaq), A6229ProFoMaq});
      if ( (pr_default.getStatus(39) == 101) )
      {
         GXCCtl = "PROFOMAQ_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaquinasPquimicos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoMaq_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6230ProFoMad = T01F941_A6230ProFoMad[0] ;
      n6230ProFoMad = T01F941_n6230ProFoMad[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6230ProFoMad))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(39) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(39);
   }

   public void gxload_12( String A396EmprCod ,
                          String A6286ProFoQuC )
   {
      /* Using cursor T01F942 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n6286ProFoQuC), A6286ProFoQuC});
      if ( (pr_default.getStatus(40) == 101) )
      {
         GXCCtl = "PROFOQUC_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PQuimicos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoQuC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(40) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(40);
   }

   public void getKey1F9759( )
   {
      /* Using cursor T01F943 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A5191ProForLC)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound759 = (short)(1) ;
      }
      else
      {
         RcdFound759 = (short)(0) ;
      }
      pr_default.close(41);
   }

   public void getByPrimaryKey1F9759( )
   {
      /* Using cursor T01F93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A5191ProForLC)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01F93_A764ProForCod[0], A764ProForCod) == 0 ) && ( GXutil.strcmp(T01F93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1F9759( 10) ;
         RcdFound759 = (short)(1) ;
         initializeNonKey1F9759( ) ;
         A5191ProForLC = T01F93_A5191ProForLC[0] ;
         A5192ProFoPgC = T01F93_A5192ProFoPgC[0] ;
         n5192ProFoPgC = T01F93_n5192ProFoPgC[0] ;
         A5193ProFoTmC = T01F93_A5193ProFoTmC[0] ;
         n5193ProFoTmC = T01F93_n5193ProFoTmC[0] ;
         A5194ProFoCla = T01F93_A5194ProFoCla[0] ;
         n5194ProFoCla = T01F93_n5194ProFoCla[0] ;
         A5951ProFoRb = T01F93_A5951ProFoRb[0] ;
         n5951ProFoRb = T01F93_n5951ProFoRb[0] ;
         A6229ProFoMaq = T01F93_A6229ProFoMaq[0] ;
         n6229ProFoMaq = T01F93_n6229ProFoMaq[0] ;
         A6286ProFoQuC = T01F93_A6286ProFoQuC[0] ;
         n6286ProFoQuC = T01F93_n6286ProFoQuC[0] ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z5191ProForLC = A5191ProForLC ;
         sMode759 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F9759( ) ;
         load1F9759( ) ;
         Gx_mode = sMode759 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound759 = (short)(0) ;
         initializeNonKey1F9759( ) ;
         sMode759 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F9759( ) ;
         Gx_mode = sMode759 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1F9759( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1F9759( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A5191ProForLC)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROFOC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z5192ProFoPgC != T01F92_A5192ProFoPgC[0] ) || ( Z5193ProFoTmC != T01F92_A5193ProFoTmC[0] ) || ( GXutil.strcmp(Z5194ProFoCla, T01F92_A5194ProFoCla[0]) != 0 ) || ( Z5951ProFoRb != T01F92_A5951ProFoRb[0] ) || ( GXutil.strcmp(Z6229ProFoMaq, T01F92_A6229ProFoMaq[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6286ProFoQuC, T01F92_A6286ProFoQuC[0]) != 0 ) )
         {
            if ( Z5192ProFoPgC != T01F92_A5192ProFoPgC[0] )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProFoPgC");
               GXutil.writeLogRaw("Old: ",Z5192ProFoPgC);
               GXutil.writeLogRaw("Current: ",T01F92_A5192ProFoPgC[0]);
            }
            if ( Z5193ProFoTmC != T01F92_A5193ProFoTmC[0] )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProFoTmC");
               GXutil.writeLogRaw("Old: ",Z5193ProFoTmC);
               GXutil.writeLogRaw("Current: ",T01F92_A5193ProFoTmC[0]);
            }
            if ( GXutil.strcmp(Z5194ProFoCla, T01F92_A5194ProFoCla[0]) != 0 )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProFoCla");
               GXutil.writeLogRaw("Old: ",Z5194ProFoCla);
               GXutil.writeLogRaw("Current: ",T01F92_A5194ProFoCla[0]);
            }
            if ( Z5951ProFoRb != T01F92_A5951ProFoRb[0] )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProFoRb");
               GXutil.writeLogRaw("Old: ",Z5951ProFoRb);
               GXutil.writeLogRaw("Current: ",T01F92_A5951ProFoRb[0]);
            }
            if ( GXutil.strcmp(Z6229ProFoMaq, T01F92_A6229ProFoMaq[0]) != 0 )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProFoMaq");
               GXutil.writeLogRaw("Old: ",Z6229ProFoMaq);
               GXutil.writeLogRaw("Current: ",T01F92_A6229ProFoMaq[0]);
            }
            if ( GXutil.strcmp(Z6286ProFoQuC, T01F92_A6286ProFoQuC[0]) != 0 )
            {
               GXutil.writeLogln("tpqmqpg:[seudo value changed for attri]"+"ProFoQuC");
               GXutil.writeLogRaw("Old: ",Z6286ProFoQuC);
               GXutil.writeLogRaw("Current: ",T01F92_A6286ProFoQuC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROFOC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F9759( )
   {
      beforeValidate1F9759( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F9759( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F9759( 0) ;
         checkOptimisticConcurrency1F9759( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F9759( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F9759( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F944 */
                  pr_default.execute(42, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A5191ProForLC), Boolean.valueOf(n5192ProFoPgC), Short.valueOf(A5192ProFoPgC), Boolean.valueOf(n5193ProFoTmC), Short.valueOf(A5193ProFoTmC), Boolean.valueOf(n5194ProFoCla), A5194ProFoCla, Boolean.valueOf(n5951ProFoRb), Short.valueOf(A5951ProFoRb), A396EmprCod, Boolean.valueOf(n6229ProFoMaq), A6229ProFoMaq, Boolean.valueOf(n6286ProFoQuC), A6286ProFoQuC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROFOC");
                  if ( (pr_default.getStatus(42) == 1) )
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
            load1F9759( ) ;
         }
         endLevel1F9759( ) ;
      }
      closeExtendedTableCursors1F9759( ) ;
   }

   public void update1F9759( )
   {
      beforeValidate1F9759( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F9759( ) ;
      }
      if ( ( nIsMod_759 != 0 ) || ( nIsDirty_759 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1F9759( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1F9759( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1F9759( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01F945 */
                     pr_default.execute(43, new Object[] {Boolean.valueOf(n5192ProFoPgC), Short.valueOf(A5192ProFoPgC), Boolean.valueOf(n5193ProFoTmC), Short.valueOf(A5193ProFoTmC), Boolean.valueOf(n5194ProFoCla), A5194ProFoCla, Boolean.valueOf(n5951ProFoRb), Short.valueOf(A5951ProFoRb), Boolean.valueOf(n6229ProFoMaq), A6229ProFoMaq, Boolean.valueOf(n6286ProFoQuC), A6286ProFoQuC, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A5191ProForLC)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROFOC");
                     if ( (pr_default.getStatus(43) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROFOC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1F9759( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1F9759( ) ;
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
            endLevel1F9759( ) ;
         }
      }
      closeExtendedTableCursors1F9759( ) ;
   }

   public void deferredUpdate1F9759( )
   {
   }

   public void delete1F9759( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F9759( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F9759( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F9759( ) ;
         afterConfirm1F9759( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F9759( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01F946 */
               pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod, Short.valueOf(A5191ProForLC)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROFOC");
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
      sMode759 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F9759( ) ;
      Gx_mode = sMode759 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F9759( )
   {
      standaloneModal1F9759( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* After */ && isIns( )  )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = A764ProForCod ;
            GXv_char3[0] = A6229ProFoMaq ;
            GXv_char2[0] = AV33Ya_existe ;
            new app.ppqmqpg(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            tpqmqpg_impl.this.A396EmprCod = GXv_char5[0] ;
            tpqmqpg_impl.this.A764ProForCod = GXv_char4[0] ;
            tpqmqpg_impl.this.A6229ProFoMaq = GXv_char3[0] ;
            tpqmqpg_impl.this.AV33Ya_existe = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV33Ya_existe", AV33Ya_existe);
         }
         if ( true /* After */ && ( GXutil.strcmp(AV33Ya_existe, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  )
         {
            GXCCtl = "PROFOMAQ_" + sGXsfl_65_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Existe ya esta Maquina ¡¡¡", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtProFoMaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01F947 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n6229ProFoMaq), A6229ProFoMaq});
         A6230ProFoMad = T01F947_A6230ProFoMad[0] ;
         n6230ProFoMad = T01F947_n6230ProFoMad[0] ;
         pr_default.close(45);
         GXt_char1 = A6287ProFoQuD ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A6286ProFoQuC ;
         GXv_char3[0] = GXt_char1 ;
         new app.ppreqd1(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         tpqmqpg_impl.this.A396EmprCod = GXv_char5[0] ;
         tpqmqpg_impl.this.A6286ProFoQuC = GXv_char4[0] ;
         tpqmqpg_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6287ProFoQuD = GXt_char1 ;
      }
   }

   public void endLevel1F9759( )
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

   public void scanStart1F9759( )
   {
      /* Scan By routine */
      /* Using cursor T01F948 */
      pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      RcdFound759 = (short)(0) ;
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound759 = (short)(1) ;
         A5191ProForLC = T01F948_A5191ProForLC[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F9759( )
   {
      /* Scan next routine */
      pr_default.readNext(46);
      RcdFound759 = (short)(0) ;
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound759 = (short)(1) ;
         A5191ProForLC = T01F948_A5191ProForLC[0] ;
      }
   }

   public void scanEnd1F9759( )
   {
      pr_default.close(46);
   }

   public void afterConfirm1F9759( )
   {
      /* After Confirm Rules */
      if ( (0==A5191ProForLC) && isIns( )  && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A764ProForCod ;
         GXv_int6[0] = A5191ProForLC ;
         new app.plinproc(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int6) ;
         tpqmqpg_impl.this.A396EmprCod = GXv_char5[0] ;
         tpqmqpg_impl.this.A764ProForCod = GXv_char4[0] ;
         tpqmqpg_impl.this.A5191ProForLC = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
   }

   public void beforeInsert1F9759( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F9759( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F9759( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F9759( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F9759( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F9759( )
   {
      edtProForLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtProFoPgC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoPgC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoPgC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtProFoTmC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoTmC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoTmC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtProFoCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoCla_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtProFoRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoRb_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtProFoMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoMaq_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtProFoMad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoMad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoMad_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtProFoQuC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoQuC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoQuC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtProFoQuD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoQuD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoQuD_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1F9759( )
   {
   }

   public void send_integrity_lvl_hashes1F989( )
   {
   }

   public void subsflControlProps_65759( )
   {
      edtavnRcdDeleted_759_Internalname = "vNRCDDELETED_759_"+sGXsfl_65_idx ;
      edtProForLC_Internalname = "PROFORLC_"+sGXsfl_65_idx ;
      edtProFoPgC_Internalname = "PROFOPGC_"+sGXsfl_65_idx ;
      edtProFoTmC_Internalname = "PROFOTMC_"+sGXsfl_65_idx ;
      edtProFoCla_Internalname = "PROFOCLA_"+sGXsfl_65_idx ;
      edtProFoRb_Internalname = "PROFORB_"+sGXsfl_65_idx ;
      edtProFoMaq_Internalname = "PROFOMAQ_"+sGXsfl_65_idx ;
      edtProFoMad_Internalname = "PROFOMAD_"+sGXsfl_65_idx ;
      edtProFoQuC_Internalname = "PROFOQUC_"+sGXsfl_65_idx ;
      edtProFoQuD_Internalname = "PROFOQUD_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_65759( )
   {
      edtavnRcdDeleted_759_Internalname = "vNRCDDELETED_759_"+sGXsfl_65_fel_idx ;
      edtProForLC_Internalname = "PROFORLC_"+sGXsfl_65_fel_idx ;
      edtProFoPgC_Internalname = "PROFOPGC_"+sGXsfl_65_fel_idx ;
      edtProFoTmC_Internalname = "PROFOTMC_"+sGXsfl_65_fel_idx ;
      edtProFoCla_Internalname = "PROFOCLA_"+sGXsfl_65_fel_idx ;
      edtProFoRb_Internalname = "PROFORB_"+sGXsfl_65_fel_idx ;
      edtProFoMaq_Internalname = "PROFOMAQ_"+sGXsfl_65_fel_idx ;
      edtProFoMad_Internalname = "PROFOMAD_"+sGXsfl_65_fel_idx ;
      edtProFoQuC_Internalname = "PROFOQUC_"+sGXsfl_65_fel_idx ;
      edtProFoQuD_Internalname = "PROFOQUD_"+sGXsfl_65_fel_idx ;
   }

   public void addRow1F9759( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65759( ) ;
      sendRow1F9759( ) ;
   }

   public void sendRow1F9759( )
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_759_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_759_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_759_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_759), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_759), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_759_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_759_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_759_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLC_Internalname,GXutil.ltrim( localUtil.ntoc( A5191ProForLC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5191ProForLC), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForLC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForLC_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_759_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoPgC_Internalname,GXutil.ltrim( localUtil.ntoc( A5192ProFoPgC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFoPgC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5192ProFoPgC), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5192ProFoPgC), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoPgC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoPgC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_759_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoTmC_Internalname,GXutil.ltrim( localUtil.ntoc( A5193ProFoTmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFoTmC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5193ProFoTmC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5193ProFoTmC), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoTmC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoTmC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_759_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoCla_Internalname,GXutil.rtrim( A5194ProFoCla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoCla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_759_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoRb_Internalname,GXutil.ltrim( localUtil.ntoc( A5951ProFoRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProFoRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5951ProFoRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5951ProFoRb), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoRb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoRb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_759_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoMaq_Internalname,GXutil.rtrim( A6229ProFoMaq),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoMaq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoMad_Internalname,GXutil.rtrim( A6230ProFoMad),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoMad_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoMad_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_759_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoQuC_Internalname,GXutil.rtrim( A6286ProFoQuC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoQuC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoQuC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoQuD_Internalname,GXutil.rtrim( A6287ProFoQuD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoQuD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFoQuD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1F9759( ) ;
      GXCCtl = "Z5191ProForLC_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5191ProForLC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5192ProFoPgC_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5192ProFoPgC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5193ProFoTmC_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5193ProFoTmC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5194ProFoCla_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5194ProFoCla));
      GXCCtl = "Z5951ProFoRb_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5951ProFoRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6229ProFoMaq_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6229ProFoMaq));
      GXCCtl = "Z6286ProFoQuC_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6286ProFoQuC));
      GXCCtl = "nRcdDeleted_759_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_759_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_759_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_759, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_759_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_759_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLC_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtProForLC_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORLC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFOPGC_"+sGXsfl_65_idx+"Title", GXutil.rtrim( edtProFoPgC_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFOPGC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoPgC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFOTMC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoTmC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFOCLA_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORB_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFOMAQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoMaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFOMAD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoMad_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFOQUC_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoQuC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFOQUD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoQuD_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1F9759( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65759( ) ;
      edtavnRcdDeleted_759_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_759_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForLC_Title = httpContext.cgiGet( "PROFORLC_"+sGXsfl_65_idx+"Title") ;
      edtProForLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORLC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoPgC_Title = httpContext.cgiGet( "PROFOPGC_"+sGXsfl_65_idx+"Title") ;
      edtProFoPgC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOPGC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoTmC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOTMC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOCLA_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORB_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoMaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOMAQ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoMad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOMAD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoQuC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOQUC_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFoQuD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFOQUD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_759_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_759_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_759");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_759_Internalname ;
         wbErr = true ;
         nRcdDeleted_759 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_759 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_759_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForLC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForLC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFORLC_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForLC_Internalname ;
         wbErr = true ;
         A5191ProForLC = (short)(0) ;
      }
      else
      {
         A5191ProForLC = (short)(localUtil.ctol( httpContext.cgiGet( edtProForLC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFoPgC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFoPgC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PROFOPGC_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoPgC_Internalname ;
         wbErr = true ;
         A5192ProFoPgC = (short)(0) ;
         n5192ProFoPgC = false ;
      }
      else
      {
         A5192ProFoPgC = (short)(localUtil.ctol( httpContext.cgiGet( edtProFoPgC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5192ProFoPgC = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFoTmC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFoTmC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFOTMC_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoTmC_Internalname ;
         wbErr = true ;
         A5193ProFoTmC = (short)(0) ;
         n5193ProFoTmC = false ;
      }
      else
      {
         A5193ProFoTmC = (short)(localUtil.ctol( httpContext.cgiGet( edtProFoTmC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5193ProFoTmC = false ;
      }
      A5194ProFoCla = httpContext.cgiGet( edtProFoCla_Internalname) ;
      n5194ProFoCla = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFoRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFoRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PROFORB_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoRb_Internalname ;
         wbErr = true ;
         A5951ProFoRb = (short)(0) ;
         n5951ProFoRb = false ;
      }
      else
      {
         A5951ProFoRb = (short)(localUtil.ctol( httpContext.cgiGet( edtProFoRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5951ProFoRb = false ;
      }
      A6229ProFoMaq = httpContext.cgiGet( edtProFoMaq_Internalname) ;
      n6229ProFoMaq = false ;
      A6230ProFoMad = httpContext.cgiGet( edtProFoMad_Internalname) ;
      n6230ProFoMad = false ;
      A6286ProFoQuC = httpContext.cgiGet( edtProFoQuC_Internalname) ;
      n6286ProFoQuC = false ;
      A6287ProFoQuD = httpContext.cgiGet( edtProFoQuD_Internalname) ;
      GXCCtl = "Z5191ProForLC_" + sGXsfl_65_idx ;
      Z5191ProForLC = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5192ProFoPgC_" + sGXsfl_65_idx ;
      Z5192ProFoPgC = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5193ProFoTmC_" + sGXsfl_65_idx ;
      Z5193ProFoTmC = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5194ProFoCla_" + sGXsfl_65_idx ;
      Z5194ProFoCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5951ProFoRb_" + sGXsfl_65_idx ;
      Z5951ProFoRb = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6229ProFoMaq_" + sGXsfl_65_idx ;
      Z6229ProFoMaq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6286ProFoQuC_" + sGXsfl_65_idx ;
      Z6286ProFoQuC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_759_" + sGXsfl_65_idx ;
      nRcdDeleted_759 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_759_" + sGXsfl_65_idx ;
      nRcdExists_759 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_759_" + sGXsfl_65_idx ;
      nIsMod_759 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtProForLC_Enabled = edtProForLC_Enabled ;
   }

   public void confirmValues1F90( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65759( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65759( ) ;
         httpContext.changePostValue( "Z5191ProForLC_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5191ProForLC_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5191ProForLC_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5192ProFoPgC_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5192ProFoPgC_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5192ProFoPgC_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5193ProFoTmC_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5193ProFoTmC_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5193ProFoTmC_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5194ProFoCla_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5194ProFoCla_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5194ProFoCla_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5951ProFoRb_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5951ProFoRb_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5951ProFoRb_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6229ProFoMaq_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6229ProFoMaq_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6229ProFoMaq_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z6286ProFoQuC_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z6286ProFoQuC_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6286ProFoQuC_"+sGXsfl_65_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpqmqpg", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod))}, new String[] {"EmprCod","ProForCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2392ProNumPro", GXutil.ltrim( localUtil.ntoc( Z2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4705ProForPau", GXutil.ltrim( localUtil.ntoc( Z4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4706ProForRb", GXutil.ltrim( localUtil.ntoc( Z4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5190ProFoLCU", GXutil.ltrim( localUtil.ntoc( Z5190ProFoLCU, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT7", GXutil.rtrim( AV19Lit7));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT8", GXutil.rtrim( AV20Lit8));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vYA_EXISTE", GXutil.rtrim( AV33Ya_existe));
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
      return formatLink("app.tpqmqpg", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod))}, new String[] {"EmprCod","ProForCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPQMQPG" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PQUIMICOS F(MAQUINA) PROGRAMAS", "") ;
   }

   public void initializeNonKey1F989( )
   {
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      A2392ProNumPro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
      A4705ProForPau = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
      A4706ProForRb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
      A5190ProFoLCU = (short)(0) ;
      n5190ProFoLCU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5190ProFoLCU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5190ProFoLCU), 4, 0));
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z2392ProNumPro = 0 ;
      Z4705ProForPau = (short)(0) ;
      Z4706ProForRb = (short)(0) ;
      Z5190ProFoLCU = (short)(0) ;
   }

   public void initAll1F989( )
   {
      initializeNonKey1F989( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1F9759( )
   {
      AV33Ya_existe = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ya_existe", AV33Ya_existe);
      A6287ProFoQuD = "" ;
      A5192ProFoPgC = (short)(0) ;
      n5192ProFoPgC = false ;
      A5193ProFoTmC = (short)(0) ;
      n5193ProFoTmC = false ;
      A5194ProFoCla = "" ;
      n5194ProFoCla = false ;
      A5951ProFoRb = (short)(0) ;
      n5951ProFoRb = false ;
      A6229ProFoMaq = "" ;
      n6229ProFoMaq = false ;
      A6230ProFoMad = "" ;
      n6230ProFoMad = false ;
      A6286ProFoQuC = "" ;
      n6286ProFoQuC = false ;
      Z5192ProFoPgC = (short)(0) ;
      Z5193ProFoTmC = (short)(0) ;
      Z5194ProFoCla = "" ;
      Z5951ProFoRb = (short)(0) ;
      Z6229ProFoMaq = "" ;
      Z6286ProFoQuC = "" ;
   }

   public void initAll1F9759( )
   {
      A5191ProForLC = (short)(0) ;
      initializeNonKey1F9759( ) ;
   }

   public void standaloneModalInsert1F9759( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241571680", true, true);
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
      httpContext.AddJavascriptSource("tpqmqpg.js", "?20268241571680", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties759( )
   {
      edtProForLC_Enabled = defedtProForLC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLC_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_759, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_759_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5191ProForLC, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtProForLC_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5192ProFoPgC, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtProFoPgC_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoPgC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5193ProFoTmC, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoTmC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5194ProFoCla));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5951ProFoRb, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6229ProFoMaq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoMaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6230ProFoMad));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoMad_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6286ProFoQuC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoQuC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6287ProFoQuD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFoQuD_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtProForCod_Internalname = "PROFORCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtProForDsc2_Internalname = "PROFORDSC2" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProNumPro_Internalname = "PRONUMPRO" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtProForPau_Internalname = "PROFORPAU" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtProForRb_Internalname = "PROFORRB" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtProFoLCU_Internalname = "PROFOLCU" ;
      edtavnRcdDeleted_759_Internalname = "vNRCDDELETED_759" ;
      edtProForLC_Internalname = "PROFORLC" ;
      edtProFoPgC_Internalname = "PROFOPGC" ;
      edtProFoTmC_Internalname = "PROFOTMC" ;
      edtProFoCla_Internalname = "PROFOCLA" ;
      edtProFoRb_Internalname = "PROFORB" ;
      edtProFoMaq_Internalname = "PROFOMAQ" ;
      edtProFoMad_Internalname = "PROFOMAD" ;
      edtProFoQuC_Internalname = "PROFOQUC" ;
      edtProFoQuD_Internalname = "PROFOQUD" ;
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
      Form.setCaption( httpContext.getMessage( "PQUIMICOS F(MAQUINA) PROGRAMAS", "") );
      edtProFoQuD_Jsonclick = "" ;
      edtProFoQuC_Jsonclick = "" ;
      edtProFoMad_Jsonclick = "" ;
      edtProFoMaq_Jsonclick = "" ;
      edtProFoRb_Jsonclick = "" ;
      edtProFoCla_Jsonclick = "" ;
      edtProFoTmC_Jsonclick = "" ;
      edtProFoPgC_Jsonclick = "" ;
      edtProForLC_Jsonclick = "" ;
      edtavnRcdDeleted_759_Jsonclick = "" ;
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
      edtProFoQuD_Enabled = 0 ;
      edtProFoQuC_Enabled = 1 ;
      edtProFoMad_Enabled = 0 ;
      edtProFoMaq_Enabled = 1 ;
      edtProFoRb_Enabled = 1 ;
      edtProFoCla_Enabled = 1 ;
      edtProFoTmC_Enabled = 1 ;
      edtProFoPgC_Enabled = 1 ;
      edtProFoPgC_Title = httpContext.getMessage( "Nº Programa", "") ;
      edtProForLC_Enabled = 1 ;
      edtProForLC_Title = httpContext.getMessage( "Linea Claves", "") ;
      edtavnRcdDeleted_759_Enabled = 1 ;
      edtProFoLCU_Jsonclick = "" ;
      edtProFoLCU_Backcolor = (int)(0xFFFFFF) ;
      edtProFoLCU_Enabled = 1 ;
      edtProForRb_Jsonclick = "" ;
      edtProForRb_Backcolor = (int)(0xFFFFFF) ;
      edtProForRb_Enabled = 1 ;
      edtProForPau_Jsonclick = "" ;
      edtProForPau_Backcolor = (int)(0xFFFFFF) ;
      edtProForPau_Enabled = 1 ;
      edtProNumPro_Jsonclick = "" ;
      edtProNumPro_Backcolor = (int)(0xFFFFFF) ;
      edtProNumPro_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtProForDsc2_Jsonclick = "" ;
      edtProForDsc2_Backcolor = (int)(0xFFFFFF) ;
      edtProForDsc2_Enabled = 1 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProForDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Backcolor = (int)(0xFFFFFF) ;
      edtProForCod_Enabled = 0 ;
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

   public void gx3asaprofoqud1F9759( String A396EmprCod ,
                                     String A6286ProFoQuC )
   {
      GXt_char1 = A6287ProFoQuD ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = A6286ProFoQuC ;
      GXv_char3[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
      tpqmqpg_impl.this.A396EmprCod = GXv_char5[0] ;
      tpqmqpg_impl.this.A6286ProFoQuC = GXv_char4[0] ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6287ProFoQuD = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6287ProFoQuD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_4_1F9759( String Gx_mode ,
                            String A396EmprCod ,
                            String A764ProForCod ,
                            short A5191ProForLC )
   {
      if ( (0==A5191ProForLC) && isIns( )  && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A764ProForCod ;
         GXv_int6[0] = A5191ProForLC ;
         new app.plinproc(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int6) ;
         A396EmprCod = GXv_char5[0] ;
         A764ProForCod = GXv_char4[0] ;
         A5191ProForLC = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A764ProForCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5191ProForLC, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_5_1F9759( String Gx_mode ,
                            String A396EmprCod ,
                            String A764ProForCod ,
                            String A6229ProFoMaq ,
                            String AV33Ya_existe )
   {
      if ( true /* After */ && isIns( )  )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A764ProForCod ;
         GXv_char3[0] = A6229ProFoMaq ;
         GXv_char2[0] = AV33Ya_existe ;
         new app.ppqmqpg(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char5[0] ;
         A764ProForCod = GXv_char4[0] ;
         A6229ProFoMaq = GXv_char3[0] ;
         AV33Ya_existe = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ya_existe", AV33Ya_existe);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A764ProForCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6229ProFoMaq))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV33Ya_existe))+"\"") ;
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
      subsflControlProps_65759( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1F9759( ) ;
         standaloneModal1F9759( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1F9759( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65759( ) ;
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
      /* Using cursor T01F949 */
      pr_default.execute(47, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(47) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01F949_A407EmprNom[0] ;
      n407EmprNom = T01F949_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(47);
      GX_FocusControl = edtProForDsc_Internalname ;
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

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", GXutil.rtrim( A4715ProForDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5190ProFoLCU", GXutil.ltrim( localUtil.ntoc( A5190ProFoLCU, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2392ProNumPro", GXutil.ltrim( localUtil.ntoc( Z2392ProNumPro, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4705ProForPau", GXutil.ltrim( localUtil.ntoc( Z4705ProForPau, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4706ProForRb", GXutil.ltrim( localUtil.ntoc( Z4706ProForRb, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5190ProFoLCU", GXutil.ltrim( localUtil.ntoc( Z5190ProFoLCU, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Profomaq( )
   {
      n764ProForCod = false ;
      n6229ProFoMaq = false ;
      n6230ProFoMad = false ;
      /* Using cursor T01F947 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n6229ProFoMaq), A6229ProFoMaq});
      if ( (pr_default.getStatus(45) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaquinasPquimicos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFOMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoMaq_Internalname ;
      }
      A6230ProFoMad = T01F947_A6230ProFoMad[0] ;
      n6230ProFoMad = T01F947_n6230ProFoMad[0] ;
      pr_default.close(45);
      if ( true /* After */ && isIns( )  )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A764ProForCod ;
         GXv_char3[0] = A6229ProFoMaq ;
         GXv_char2[0] = AV33Ya_existe ;
         new app.ppqmqpg(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         tpqmqpg_impl.this.A396EmprCod = GXv_char5[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpqmqpg_impl.this.A764ProForCod = GXv_char4[0] ;
         A764ProForCod = this.A764ProForCod ;
         tpqmqpg_impl.this.A6229ProFoMaq = GXv_char3[0] ;
         A6229ProFoMaq = this.A6229ProFoMaq ;
         tpqmqpg_impl.this.AV33Ya_existe = GXv_char2[0] ;
         AV33Ya_existe = this.AV33Ya_existe ;
      }
      if ( true /* After */ && ( GXutil.strcmp(AV33Ya_existe, httpContext.getMessage( "S", "")) == 0 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Existe ya esta Maquina ¡¡¡", ""), 1, "PROFOMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoMaq_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6230ProFoMad", GXutil.rtrim( A6230ProFoMad));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", GXutil.rtrim( A764ProForCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6229ProFoMaq", GXutil.rtrim( A6229ProFoMaq));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ya_existe", GXutil.rtrim( AV33Ya_existe));
   }

   public void valid_Profoquc( )
   {
      n6286ProFoQuC = false ;
      /* Using cursor T01F950 */
      pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n6286ProFoQuC), A6286ProFoQuC});
      if ( (pr_default.getStatus(48) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PQuimicos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFOQUC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoQuC_Internalname ;
      }
      pr_default.close(48);
      GXt_char1 = A6287ProFoQuD ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = A6286ProFoQuC ;
      GXv_char3[0] = GXt_char1 ;
      new app.ppreqd1(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
      tpqmqpg_impl.this.A396EmprCod = GXv_char5[0] ;
      tpqmqpg_impl.this.A6286ProFoQuC = GXv_char4[0] ;
      tpqmqpg_impl.this.GXt_char1 = GXv_char3[0] ;
      A6287ProFoQuD = GXt_char1 ;
      if ( ( GXutil.strcmp(A6287ProFoQuD, httpContext.getMessage( "Error", "")) == 0 ) && true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A6286ProFoQuC)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Inexistente", ""), 1, "PROFOQUC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProFoQuC_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6287ProFoQuD", GXutil.rtrim( A6287ProFoQuD));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV19Lit7',fld:'vLIT7',pic:''},{av:'AV20Lit8',fld:'vLIT8',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2392ProNumPro',fld:'PRONUMPRO',pic:'ZZZZ9'},{av:'A4705ProForPau',fld:'PROFORPAU',pic:'ZZZ9'},{av:'A4706ProForRb',fld:'PROFORRB',pic:'ZZZ9'},{av:'A5190ProFoLCU',fld:'PROFOLCU',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z764ProForCod'},{av:'Z766ProForDsc'},{av:'Z4715ProForDsc2'},{av:'Z407EmprNom'},{av:'Z2392ProNumPro'},{av:'Z4705ProForPau'},{av:'Z4706ProForRb'},{av:'Z5190ProFoLCU'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PROFORLC","{handler:'valid_Proforlc',iparms:[]");
      setEventMetadata("VALID_PROFORLC",",oparms:[]}");
      setEventMetadata("VALID_PROFOMAQ","{handler:'valid_Profomaq',iparms:[{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6229ProFoMaq',fld:'PROFOMAQ',pic:''},{av:'A6230ProFoMad',fld:'PROFOMAD',pic:''},{av:'AV33Ya_existe',fld:'vYA_EXISTE',pic:''}]");
      setEventMetadata("VALID_PROFOMAQ",",oparms:[{av:'A6230ProFoMad',fld:'PROFOMAD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A6229ProFoMaq',fld:'PROFOMAQ',pic:''},{av:'AV33Ya_existe',fld:'vYA_EXISTE',pic:''}]}");
      setEventMetadata("VALID_PROFOQUC","{handler:'valid_Profoquc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6286ProFoQuC',fld:'PROFOQUC',pic:''},{av:'A6287ProFoQuD',fld:'PROFOQUD',pic:''}]");
      setEventMetadata("VALID_PROFOQUC",",oparms:[{av:'A6287ProFoQuD',fld:'PROFOQUD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Profoqud',iparms:[]");
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
      pr_default.close(45);
      pr_default.close(48);
      pr_default.close(47);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA764ProForCod = "" ;
      Z396EmprCod = "" ;
      Z764ProForCod = "" ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z5194ProFoCla = "" ;
      Z6229ProFoMaq = "" ;
      Z6286ProFoQuC = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A6229ProFoMaq = "" ;
      AV33Ya_existe = "" ;
      A6286ProFoQuC = "" ;
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
      A766ProForDsc = "" ;
      lblTextblock4_Jsonclick = "" ;
      A4715ProForDsc2 = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode759 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode89 = "" ;
      GXCCtl = "" ;
      A5194ProFoCla = "" ;
      A6230ProFoMad = "" ;
      A6287ProFoQuD = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV13Lit9 = "" ;
      AV21Lit10 = "" ;
      AV32Msg0 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T01F98_A407EmprNom = new String[] {""} ;
      T01F98_n407EmprNom = new boolean[] {false} ;
      T01F99_A764ProForCod = new String[] {""} ;
      T01F99_n764ProForCod = new boolean[] {false} ;
      T01F99_A766ProForDsc = new String[] {""} ;
      T01F99_A4715ProForDsc2 = new String[] {""} ;
      T01F99_A407EmprNom = new String[] {""} ;
      T01F99_n407EmprNom = new boolean[] {false} ;
      T01F99_A2392ProNumPro = new int[1] ;
      T01F99_A4705ProForPau = new short[1] ;
      T01F99_A4706ProForRb = new short[1] ;
      T01F99_A5190ProFoLCU = new short[1] ;
      T01F99_n5190ProFoLCU = new boolean[] {false} ;
      T01F99_A396EmprCod = new String[] {""} ;
      T01F910_A396EmprCod = new String[] {""} ;
      T01F910_A764ProForCod = new String[] {""} ;
      T01F910_n764ProForCod = new boolean[] {false} ;
      T01F97_A764ProForCod = new String[] {""} ;
      T01F97_n764ProForCod = new boolean[] {false} ;
      T01F97_A766ProForDsc = new String[] {""} ;
      T01F97_A4715ProForDsc2 = new String[] {""} ;
      T01F97_A2392ProNumPro = new int[1] ;
      T01F97_A4705ProForPau = new short[1] ;
      T01F97_A4706ProForRb = new short[1] ;
      T01F97_A5190ProFoLCU = new short[1] ;
      T01F97_n5190ProFoLCU = new boolean[] {false} ;
      T01F97_A396EmprCod = new String[] {""} ;
      T01F911_A396EmprCod = new String[] {""} ;
      T01F911_A764ProForCod = new String[] {""} ;
      T01F911_n764ProForCod = new boolean[] {false} ;
      T01F912_A396EmprCod = new String[] {""} ;
      T01F912_A764ProForCod = new String[] {""} ;
      T01F912_n764ProForCod = new boolean[] {false} ;
      T01F96_A764ProForCod = new String[] {""} ;
      T01F96_n764ProForCod = new boolean[] {false} ;
      T01F96_A766ProForDsc = new String[] {""} ;
      T01F96_A4715ProForDsc2 = new String[] {""} ;
      T01F96_A2392ProNumPro = new int[1] ;
      T01F96_A4705ProForPau = new short[1] ;
      T01F96_A4706ProForRb = new short[1] ;
      T01F96_A5190ProFoLCU = new short[1] ;
      T01F96_n5190ProFoLCU = new boolean[] {false} ;
      T01F96_A396EmprCod = new String[] {""} ;
      T01F916_A396EmprCod = new String[] {""} ;
      T01F916_A252CliCod = new int[1] ;
      T01F916_A13381CliProQui = new String[] {""} ;
      T01F917_A396EmprCod = new String[] {""} ;
      T01F917_A13026PedDGId = new int[1] ;
      T01F917_A758ProCod = new String[] {""} ;
      T01F917_A13045PedDGFasLi = new short[1] ;
      T01F917_A13057PedDGPQLin = new short[1] ;
      T01F918_A396EmprCod = new String[] {""} ;
      T01F918_A12673LavMqId = new int[1] ;
      T01F918_A12692LavMqLnPq = new short[1] ;
      T01F919_A396EmprCod = new String[] {""} ;
      T01F919_A129BarCod = new int[1] ;
      T01F919_A132BarCodReo = new byte[1] ;
      T01F919_A130BarCodPar = new String[] {""} ;
      T01F919_A4075recestncol = new byte[1] ;
      T01F919_A4076recestnpro = new byte[1] ;
      T01F920_A396EmprCod = new String[] {""} ;
      T01F920_A4052EstNumFor = new int[1] ;
      T01F920_A4053EstNumCol = new byte[1] ;
      T01F920_A4057EstNumLin = new byte[1] ;
      T01F921_A396EmprCod = new String[] {""} ;
      T01F921_A6380Ft_procod = new String[] {""} ;
      T01F921_A6383Ft_ProLin = new short[1] ;
      T01F922_A396EmprCod = new String[] {""} ;
      T01F922_A11270Pot_num = new int[1] ;
      T01F923_A396EmprCod = new String[] {""} ;
      T01F923_A764ProForCod = new String[] {""} ;
      T01F923_n764ProForCod = new boolean[] {false} ;
      T01F923_A8877Prg_Cod = new int[1] ;
      T01F924_A396EmprCod = new String[] {""} ;
      T01F924_A252CliCod = new int[1] ;
      T01F924_A494ForSer = new String[] {""} ;
      T01F924_A482ForColNom = new String[] {""} ;
      T01F924_A483ForColNum = new int[1] ;
      T01F924_A831TipColCod = new byte[1] ;
      T01F924_A7094Acab_Ter = new String[] {""} ;
      T01F925_A396EmprCod = new String[] {""} ;
      T01F925_A758ProCod = new String[] {""} ;
      T01F925_A774ProNumLin = new short[1] ;
      T01F925_A6438ProFsaL = new short[1] ;
      T01F926_A396EmprCod = new String[] {""} ;
      T01F926_A6319C_Barcod = new int[1] ;
      T01F926_A6320C_Barcodre = new byte[1] ;
      T01F926_A6321C_Barcodpa = new String[] {""} ;
      T01F926_A6322C_Reclinma = new short[1] ;
      T01F926_A6323C_Reclinpr = new byte[1] ;
      T01F927_A396EmprCod = new String[] {""} ;
      T01F927_A361DisCod = new int[1] ;
      T01F927_A758ProCod = new String[] {""} ;
      T01F927_A368DisFasLin = new short[1] ;
      T01F927_A5377DisQuiLin = new short[1] ;
      T01F928_A396EmprCod = new String[] {""} ;
      T01F928_A129BarCod = new int[1] ;
      T01F928_A132BarCodReo = new byte[1] ;
      T01F928_A130BarCodPar = new String[] {""} ;
      T01F928_A758ProCod = new String[] {""} ;
      T01F928_A194BarOrdLin = new short[1] ;
      T01F928_A5371FasQuiLin = new short[1] ;
      T01F929_A396EmprCod = new String[] {""} ;
      T01F929_A764ProForCod = new String[] {""} ;
      T01F929_n764ProForCod = new boolean[] {false} ;
      T01F929_A5191ProForLC = new short[1] ;
      T01F930_A396EmprCod = new String[] {""} ;
      T01F930_A831TipColCod = new byte[1] ;
      T01F930_A5162TipColLin = new short[1] ;
      T01F931_A396EmprCod = new String[] {""} ;
      T01F931_A4744RecPreCod = new int[1] ;
      T01F931_A4762RecPreLin = new short[1] ;
      T01F932_A396EmprCod = new String[] {""} ;
      T01F932_A252CliCod = new int[1] ;
      T01F932_A65ArtCod = new String[] {""} ;
      T01F932_A4658MdlCod = new String[] {""} ;
      T01F932_A457FasCod = new String[] {""} ;
      T01F932_A4660FasProLin = new short[1] ;
      T01F933_A396EmprCod = new String[] {""} ;
      T01F933_A457FasCod = new String[] {""} ;
      T01F933_A4650FasForLin = new short[1] ;
      T01F934_A396EmprCod = new String[] {""} ;
      T01F934_A129BarCod = new int[1] ;
      T01F934_A132BarCodReo = new byte[1] ;
      T01F934_A130BarCodPar = new String[] {""} ;
      T01F934_A2804RecLinMaq = new short[1] ;
      T01F934_A1273RecLinPro = new byte[1] ;
      T01F935_A396EmprCod = new String[] {""} ;
      T01F935_A1514MacProCod = new String[] {""} ;
      T01F935_A1517MacProLin = new short[1] ;
      T01F936_A396EmprCod = new String[] {""} ;
      T01F936_A252CliCod = new int[1] ;
      T01F936_A494ForSer = new String[] {""} ;
      T01F936_A482ForColNom = new String[] {""} ;
      T01F936_A483ForColNum = new int[1] ;
      T01F936_A831TipColCod = new byte[1] ;
      T01F936_A1160ProForL = new short[1] ;
      T01F937_A396EmprCod = new String[] {""} ;
      T01F937_A910Workstat = new String[] {""} ;
      T01F937_A887EscMLin = new int[1] ;
      T01F938_A396EmprCod = new String[] {""} ;
      T01F938_A764ProForCod = new String[] {""} ;
      T01F938_n764ProForCod = new boolean[] {false} ;
      T01F938_A767ProForLin = new short[1] ;
      T01F939_A396EmprCod = new String[] {""} ;
      T01F939_A764ProForCod = new String[] {""} ;
      T01F939_n764ProForCod = new boolean[] {false} ;
      Z6230ProFoMad = "" ;
      T01F940_A764ProForCod = new String[] {""} ;
      T01F940_n764ProForCod = new boolean[] {false} ;
      T01F940_A5191ProForLC = new short[1] ;
      T01F940_A5192ProFoPgC = new short[1] ;
      T01F940_n5192ProFoPgC = new boolean[] {false} ;
      T01F940_A5193ProFoTmC = new short[1] ;
      T01F940_n5193ProFoTmC = new boolean[] {false} ;
      T01F940_A5194ProFoCla = new String[] {""} ;
      T01F940_n5194ProFoCla = new boolean[] {false} ;
      T01F940_A5951ProFoRb = new short[1] ;
      T01F940_n5951ProFoRb = new boolean[] {false} ;
      T01F940_A6230ProFoMad = new String[] {""} ;
      T01F940_n6230ProFoMad = new boolean[] {false} ;
      T01F940_A396EmprCod = new String[] {""} ;
      T01F940_A6229ProFoMaq = new String[] {""} ;
      T01F940_n6229ProFoMaq = new boolean[] {false} ;
      T01F940_A6286ProFoQuC = new String[] {""} ;
      T01F940_n6286ProFoQuC = new boolean[] {false} ;
      T01F94_A6230ProFoMad = new String[] {""} ;
      T01F94_n6230ProFoMad = new boolean[] {false} ;
      T01F95_A396EmprCod = new String[] {""} ;
      T01F941_A6230ProFoMad = new String[] {""} ;
      T01F941_n6230ProFoMad = new boolean[] {false} ;
      T01F942_A396EmprCod = new String[] {""} ;
      T01F943_A396EmprCod = new String[] {""} ;
      T01F943_A764ProForCod = new String[] {""} ;
      T01F943_n764ProForCod = new boolean[] {false} ;
      T01F943_A5191ProForLC = new short[1] ;
      T01F93_A764ProForCod = new String[] {""} ;
      T01F93_n764ProForCod = new boolean[] {false} ;
      T01F93_A5191ProForLC = new short[1] ;
      T01F93_A5192ProFoPgC = new short[1] ;
      T01F93_n5192ProFoPgC = new boolean[] {false} ;
      T01F93_A5193ProFoTmC = new short[1] ;
      T01F93_n5193ProFoTmC = new boolean[] {false} ;
      T01F93_A5194ProFoCla = new String[] {""} ;
      T01F93_n5194ProFoCla = new boolean[] {false} ;
      T01F93_A5951ProFoRb = new short[1] ;
      T01F93_n5951ProFoRb = new boolean[] {false} ;
      T01F93_A396EmprCod = new String[] {""} ;
      T01F93_A6229ProFoMaq = new String[] {""} ;
      T01F93_n6229ProFoMaq = new boolean[] {false} ;
      T01F93_A6286ProFoQuC = new String[] {""} ;
      T01F93_n6286ProFoQuC = new boolean[] {false} ;
      T01F92_A764ProForCod = new String[] {""} ;
      T01F92_n764ProForCod = new boolean[] {false} ;
      T01F92_A5191ProForLC = new short[1] ;
      T01F92_A5192ProFoPgC = new short[1] ;
      T01F92_n5192ProFoPgC = new boolean[] {false} ;
      T01F92_A5193ProFoTmC = new short[1] ;
      T01F92_n5193ProFoTmC = new boolean[] {false} ;
      T01F92_A5194ProFoCla = new String[] {""} ;
      T01F92_n5194ProFoCla = new boolean[] {false} ;
      T01F92_A5951ProFoRb = new short[1] ;
      T01F92_n5951ProFoRb = new boolean[] {false} ;
      T01F92_A396EmprCod = new String[] {""} ;
      T01F92_A6229ProFoMaq = new String[] {""} ;
      T01F92_n6229ProFoMaq = new boolean[] {false} ;
      T01F92_A6286ProFoQuC = new String[] {""} ;
      T01F92_n6286ProFoQuC = new boolean[] {false} ;
      T01F947_A6230ProFoMad = new String[] {""} ;
      T01F947_n6230ProFoMad = new boolean[] {false} ;
      T01F948_A396EmprCod = new String[] {""} ;
      T01F948_A764ProForCod = new String[] {""} ;
      T01F948_n764ProForCod = new boolean[] {false} ;
      T01F948_A5191ProForLC = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int6 = new short[1] ;
      T01F949_A407EmprNom = new String[] {""} ;
      T01F949_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ764ProForCod = "" ;
      ZZ766ProForDsc = "" ;
      ZZ4715ProForDsc2 = "" ;
      ZZ407EmprNom = "" ;
      GXv_char2 = new String[1] ;
      ZV33Ya_existe = "" ;
      T01F950_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      Z6287ProFoQuD = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpqmqpg__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpqmqpg__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpqmqpg__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpqmqpg__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpqmqpg__default(),
         new Object[] {
             new Object[] {
            T01F92_A764ProForCod, T01F92_A5191ProForLC, T01F92_A5192ProFoPgC, T01F92_n5192ProFoPgC, T01F92_A5193ProFoTmC, T01F92_n5193ProFoTmC, T01F92_A5194ProFoCla, T01F92_n5194ProFoCla, T01F92_A5951ProFoRb, T01F92_n5951ProFoRb,
            T01F92_A396EmprCod, T01F92_A6229ProFoMaq, T01F92_n6229ProFoMaq, T01F92_A6286ProFoQuC, T01F92_n6286ProFoQuC
            }
            , new Object[] {
            T01F93_A764ProForCod, T01F93_A5191ProForLC, T01F93_A5192ProFoPgC, T01F93_n5192ProFoPgC, T01F93_A5193ProFoTmC, T01F93_n5193ProFoTmC, T01F93_A5194ProFoCla, T01F93_n5194ProFoCla, T01F93_A5951ProFoRb, T01F93_n5951ProFoRb,
            T01F93_A396EmprCod, T01F93_A6229ProFoMaq, T01F93_n6229ProFoMaq, T01F93_A6286ProFoQuC, T01F93_n6286ProFoQuC
            }
            , new Object[] {
            T01F94_A6230ProFoMad, T01F94_n6230ProFoMad
            }
            , new Object[] {
            T01F95_A396EmprCod
            }
            , new Object[] {
            T01F96_A764ProForCod, T01F96_A766ProForDsc, T01F96_A4715ProForDsc2, T01F96_A2392ProNumPro, T01F96_A4705ProForPau, T01F96_A4706ProForRb, T01F96_A5190ProFoLCU, T01F96_n5190ProFoLCU, T01F96_A396EmprCod
            }
            , new Object[] {
            T01F97_A764ProForCod, T01F97_A766ProForDsc, T01F97_A4715ProForDsc2, T01F97_A2392ProNumPro, T01F97_A4705ProForPau, T01F97_A4706ProForRb, T01F97_A5190ProFoLCU, T01F97_n5190ProFoLCU, T01F97_A396EmprCod
            }
            , new Object[] {
            T01F98_A407EmprNom, T01F98_n407EmprNom
            }
            , new Object[] {
            T01F99_A764ProForCod, T01F99_A766ProForDsc, T01F99_A4715ProForDsc2, T01F99_A407EmprNom, T01F99_n407EmprNom, T01F99_A2392ProNumPro, T01F99_A4705ProForPau, T01F99_A4706ProForRb, T01F99_A5190ProFoLCU, T01F99_n5190ProFoLCU,
            T01F99_A396EmprCod
            }
            , new Object[] {
            T01F910_A396EmprCod, T01F910_A764ProForCod
            }
            , new Object[] {
            T01F911_A396EmprCod, T01F911_A764ProForCod
            }
            , new Object[] {
            T01F912_A396EmprCod, T01F912_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F916_A396EmprCod, T01F916_A252CliCod, T01F916_A13381CliProQui
            }
            , new Object[] {
            T01F917_A396EmprCod, T01F917_A13026PedDGId, T01F917_A758ProCod, T01F917_A13045PedDGFasLi, T01F917_A13057PedDGPQLin
            }
            , new Object[] {
            T01F918_A396EmprCod, T01F918_A12673LavMqId, T01F918_A12692LavMqLnPq
            }
            , new Object[] {
            T01F919_A396EmprCod, T01F919_A129BarCod, T01F919_A132BarCodReo, T01F919_A130BarCodPar, T01F919_A4075recestncol, T01F919_A4076recestnpro
            }
            , new Object[] {
            T01F920_A396EmprCod, T01F920_A4052EstNumFor, T01F920_A4053EstNumCol, T01F920_A4057EstNumLin
            }
            , new Object[] {
            T01F921_A396EmprCod, T01F921_A6380Ft_procod, T01F921_A6383Ft_ProLin
            }
            , new Object[] {
            T01F922_A396EmprCod, T01F922_A11270Pot_num
            }
            , new Object[] {
            T01F923_A396EmprCod, T01F923_A764ProForCod, T01F923_A8877Prg_Cod
            }
            , new Object[] {
            T01F924_A396EmprCod, T01F924_A252CliCod, T01F924_A494ForSer, T01F924_A482ForColNom, T01F924_A483ForColNum, T01F924_A831TipColCod, T01F924_A7094Acab_Ter
            }
            , new Object[] {
            T01F925_A396EmprCod, T01F925_A758ProCod, T01F925_A774ProNumLin, T01F925_A6438ProFsaL
            }
            , new Object[] {
            T01F926_A396EmprCod, T01F926_A6319C_Barcod, T01F926_A6320C_Barcodre, T01F926_A6321C_Barcodpa, T01F926_A6322C_Reclinma, T01F926_A6323C_Reclinpr
            }
            , new Object[] {
            T01F927_A396EmprCod, T01F927_A361DisCod, T01F927_A758ProCod, T01F927_A368DisFasLin, T01F927_A5377DisQuiLin
            }
            , new Object[] {
            T01F928_A396EmprCod, T01F928_A129BarCod, T01F928_A132BarCodReo, T01F928_A130BarCodPar, T01F928_A758ProCod, T01F928_A194BarOrdLin, T01F928_A5371FasQuiLin
            }
            , new Object[] {
            T01F929_A396EmprCod, T01F929_A764ProForCod, T01F929_A5191ProForLC
            }
            , new Object[] {
            T01F930_A396EmprCod, T01F930_A831TipColCod, T01F930_A5162TipColLin
            }
            , new Object[] {
            T01F931_A396EmprCod, T01F931_A4744RecPreCod, T01F931_A4762RecPreLin
            }
            , new Object[] {
            T01F932_A396EmprCod, T01F932_A252CliCod, T01F932_A65ArtCod, T01F932_A4658MdlCod, T01F932_A457FasCod, T01F932_A4660FasProLin
            }
            , new Object[] {
            T01F933_A396EmprCod, T01F933_A457FasCod, T01F933_A4650FasForLin
            }
            , new Object[] {
            T01F934_A396EmprCod, T01F934_A129BarCod, T01F934_A132BarCodReo, T01F934_A130BarCodPar, T01F934_A2804RecLinMaq, T01F934_A1273RecLinPro
            }
            , new Object[] {
            T01F935_A396EmprCod, T01F935_A1514MacProCod, T01F935_A1517MacProLin
            }
            , new Object[] {
            T01F936_A396EmprCod, T01F936_A252CliCod, T01F936_A494ForSer, T01F936_A482ForColNom, T01F936_A483ForColNum, T01F936_A831TipColCod, T01F936_A1160ProForL
            }
            , new Object[] {
            T01F937_A396EmprCod, T01F937_A910Workstat, T01F937_A887EscMLin
            }
            , new Object[] {
            T01F938_A396EmprCod, T01F938_A764ProForCod, T01F938_A767ProForLin
            }
            , new Object[] {
            T01F939_A396EmprCod, T01F939_A764ProForCod
            }
            , new Object[] {
            T01F940_A764ProForCod, T01F940_A5191ProForLC, T01F940_A5192ProFoPgC, T01F940_n5192ProFoPgC, T01F940_A5193ProFoTmC, T01F940_n5193ProFoTmC, T01F940_A5194ProFoCla, T01F940_n5194ProFoCla, T01F940_A5951ProFoRb, T01F940_n5951ProFoRb,
            T01F940_A6230ProFoMad, T01F940_n6230ProFoMad, T01F940_A396EmprCod, T01F940_A6229ProFoMaq, T01F940_n6229ProFoMaq, T01F940_A6286ProFoQuC, T01F940_n6286ProFoQuC
            }
            , new Object[] {
            T01F941_A6230ProFoMad, T01F941_n6230ProFoMad
            }
            , new Object[] {
            T01F942_A396EmprCod
            }
            , new Object[] {
            T01F943_A396EmprCod, T01F943_A764ProForCod, T01F943_A5191ProForLC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F947_A6230ProFoMad, T01F947_n6230ProFoMad
            }
            , new Object[] {
            T01F948_A396EmprCod, T01F948_A764ProForCod, T01F948_A5191ProForLC
            }
            , new Object[] {
            T01F949_A407EmprNom, T01F949_n407EmprNom
            }
            , new Object[] {
            T01F950_A396EmprCod
            }
         }
      );
      Z764ProForCod = "" ;
      n764ProForCod = false ;
      A764ProForCod = "" ;
      n764ProForCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TPQMQPG" ;
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
   private short Z4705ProForPau ;
   private short Z4706ProForRb ;
   private short Z5190ProFoLCU ;
   private short Z5191ProForLC ;
   private short Z5192ProFoPgC ;
   private short Z5193ProFoTmC ;
   private short Z5951ProFoRb ;
   private short nRcdDeleted_759 ;
   private short nRcdExists_759 ;
   private short nIsMod_759 ;
   private short A5191ProForLC ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4705ProForPau ;
   private short A4706ProForRb ;
   private short A5190ProFoLCU ;
   private short nBlankRcdCount759 ;
   private short RcdFound759 ;
   private short nBlankRcdUsr759 ;
   private short A5192ProFoPgC ;
   private short A5193ProFoTmC ;
   private short A5951ProFoRb ;
   private short RcdFound89 ;
   private short nIsDirty_89 ;
   private short nIsDirty_759 ;
   private short GXv_int6[] ;
   private short ZZ4705ProForPau ;
   private short ZZ4706ProForRb ;
   private short ZZ5190ProFoLCU ;
   private int Z2392ProNumPro ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtProForCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForDsc2_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A2392ProNumPro ;
   private int edtProNumPro_Enabled ;
   private int edtProForPau_Enabled ;
   private int edtProForRb_Enabled ;
   private int edtProFoLCU_Enabled ;
   private int edtavnRcdDeleted_759_Enabled ;
   private int edtProForLC_Enabled ;
   private int edtProFoPgC_Enabled ;
   private int edtProFoTmC_Enabled ;
   private int edtProFoCla_Enabled ;
   private int edtProFoRb_Enabled ;
   private int edtProFoMaq_Enabled ;
   private int edtProFoMad_Enabled ;
   private int edtProFoQuC_Enabled ;
   private int edtProFoQuD_Enabled ;
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
   private int defedtProForLC_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtProFoLCU_Backcolor ;
   private int edtProForRb_Backcolor ;
   private int edtProForPau_Backcolor ;
   private int edtProNumPro_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtProForDsc2_Backcolor ;
   private int edtProForDsc_Backcolor ;
   private int edtProForCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ2392ProNumPro ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA764ProForCod ;
   private String Z396EmprCod ;
   private String Z764ProForCod ;
   private String Z766ProForDsc ;
   private String Z4715ProForDsc2 ;
   private String Z5194ProFoCla ;
   private String Z6229ProFoMaq ;
   private String Z6286ProFoQuC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A6229ProFoMaq ;
   private String AV33Ya_existe ;
   private String A6286ProFoQuC ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProForDsc_Internalname ;
   private String sGXsfl_65_idx="0001" ;
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
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtProForDsc2_Internalname ;
   private String A4715ProForDsc2 ;
   private String edtProForDsc2_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProNumPro_Internalname ;
   private String edtProNumPro_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtProForPau_Internalname ;
   private String edtProForPau_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtProForRb_Internalname ;
   private String edtProForRb_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtProFoLCU_Internalname ;
   private String edtProFoLCU_Jsonclick ;
   private String sMode759 ;
   private String edtavnRcdDeleted_759_Internalname ;
   private String edtProForLC_Title ;
   private String edtProForLC_Internalname ;
   private String edtProFoPgC_Title ;
   private String edtProFoPgC_Internalname ;
   private String edtProFoTmC_Internalname ;
   private String edtProFoCla_Internalname ;
   private String edtProFoRb_Internalname ;
   private String edtProFoMaq_Internalname ;
   private String edtProFoMad_Internalname ;
   private String edtProFoQuC_Internalname ;
   private String edtProFoQuD_Internalname ;
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
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode89 ;
   private String GXCCtl ;
   private String A5194ProFoCla ;
   private String A6230ProFoMad ;
   private String A6287ProFoQuD ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV13Lit9 ;
   private String AV21Lit10 ;
   private String AV32Msg0 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z6230ProFoMad ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_759_Jsonclick ;
   private String edtProForLC_Jsonclick ;
   private String edtProFoPgC_Jsonclick ;
   private String edtProFoTmC_Jsonclick ;
   private String edtProFoCla_Jsonclick ;
   private String edtProFoRb_Jsonclick ;
   private String edtProFoMaq_Jsonclick ;
   private String edtProFoMad_Jsonclick ;
   private String edtProFoQuC_Jsonclick ;
   private String edtProFoQuD_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ764ProForCod ;
   private String ZZ766ProForDsc ;
   private String ZZ4715ProForDsc2 ;
   private String ZZ407EmprNom ;
   private String GXv_char2[] ;
   private String ZV33Ya_existe ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z6287ProFoQuD ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n764ProForCod ;
   private boolean n6229ProFoMaq ;
   private boolean n6286ProFoQuC ;
   private boolean wbErr ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5190ProFoLCU ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n5192ProFoPgC ;
   private boolean n5193ProFoTmC ;
   private boolean n5194ProFoCla ;
   private boolean n5951ProFoRb ;
   private boolean n6230ProFoMad ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01F98_A407EmprNom ;
   private boolean[] T01F98_n407EmprNom ;
   private String[] T01F99_A764ProForCod ;
   private boolean[] T01F99_n764ProForCod ;
   private String[] T01F99_A766ProForDsc ;
   private String[] T01F99_A4715ProForDsc2 ;
   private String[] T01F99_A407EmprNom ;
   private boolean[] T01F99_n407EmprNom ;
   private int[] T01F99_A2392ProNumPro ;
   private short[] T01F99_A4705ProForPau ;
   private short[] T01F99_A4706ProForRb ;
   private short[] T01F99_A5190ProFoLCU ;
   private boolean[] T01F99_n5190ProFoLCU ;
   private String[] T01F99_A396EmprCod ;
   private String[] T01F910_A396EmprCod ;
   private String[] T01F910_A764ProForCod ;
   private boolean[] T01F910_n764ProForCod ;
   private String[] T01F97_A764ProForCod ;
   private boolean[] T01F97_n764ProForCod ;
   private String[] T01F97_A766ProForDsc ;
   private String[] T01F97_A4715ProForDsc2 ;
   private int[] T01F97_A2392ProNumPro ;
   private short[] T01F97_A4705ProForPau ;
   private short[] T01F97_A4706ProForRb ;
   private short[] T01F97_A5190ProFoLCU ;
   private boolean[] T01F97_n5190ProFoLCU ;
   private String[] T01F97_A396EmprCod ;
   private String[] T01F911_A396EmprCod ;
   private String[] T01F911_A764ProForCod ;
   private boolean[] T01F911_n764ProForCod ;
   private String[] T01F912_A396EmprCod ;
   private String[] T01F912_A764ProForCod ;
   private boolean[] T01F912_n764ProForCod ;
   private String[] T01F96_A764ProForCod ;
   private boolean[] T01F96_n764ProForCod ;
   private String[] T01F96_A766ProForDsc ;
   private String[] T01F96_A4715ProForDsc2 ;
   private int[] T01F96_A2392ProNumPro ;
   private short[] T01F96_A4705ProForPau ;
   private short[] T01F96_A4706ProForRb ;
   private short[] T01F96_A5190ProFoLCU ;
   private boolean[] T01F96_n5190ProFoLCU ;
   private String[] T01F96_A396EmprCod ;
   private String[] T01F916_A396EmprCod ;
   private int[] T01F916_A252CliCod ;
   private String[] T01F916_A13381CliProQui ;
   private String[] T01F917_A396EmprCod ;
   private int[] T01F917_A13026PedDGId ;
   private String[] T01F917_A758ProCod ;
   private short[] T01F917_A13045PedDGFasLi ;
   private short[] T01F917_A13057PedDGPQLin ;
   private String[] T01F918_A396EmprCod ;
   private int[] T01F918_A12673LavMqId ;
   private short[] T01F918_A12692LavMqLnPq ;
   private String[] T01F919_A396EmprCod ;
   private int[] T01F919_A129BarCod ;
   private byte[] T01F919_A132BarCodReo ;
   private String[] T01F919_A130BarCodPar ;
   private byte[] T01F919_A4075recestncol ;
   private byte[] T01F919_A4076recestnpro ;
   private String[] T01F920_A396EmprCod ;
   private int[] T01F920_A4052EstNumFor ;
   private byte[] T01F920_A4053EstNumCol ;
   private byte[] T01F920_A4057EstNumLin ;
   private String[] T01F921_A396EmprCod ;
   private String[] T01F921_A6380Ft_procod ;
   private short[] T01F921_A6383Ft_ProLin ;
   private String[] T01F922_A396EmprCod ;
   private int[] T01F922_A11270Pot_num ;
   private String[] T01F923_A396EmprCod ;
   private String[] T01F923_A764ProForCod ;
   private boolean[] T01F923_n764ProForCod ;
   private int[] T01F923_A8877Prg_Cod ;
   private String[] T01F924_A396EmprCod ;
   private int[] T01F924_A252CliCod ;
   private String[] T01F924_A494ForSer ;
   private String[] T01F924_A482ForColNom ;
   private int[] T01F924_A483ForColNum ;
   private byte[] T01F924_A831TipColCod ;
   private String[] T01F924_A7094Acab_Ter ;
   private String[] T01F925_A396EmprCod ;
   private String[] T01F925_A758ProCod ;
   private short[] T01F925_A774ProNumLin ;
   private short[] T01F925_A6438ProFsaL ;
   private String[] T01F926_A396EmprCod ;
   private int[] T01F926_A6319C_Barcod ;
   private byte[] T01F926_A6320C_Barcodre ;
   private String[] T01F926_A6321C_Barcodpa ;
   private short[] T01F926_A6322C_Reclinma ;
   private byte[] T01F926_A6323C_Reclinpr ;
   private String[] T01F927_A396EmprCod ;
   private int[] T01F927_A361DisCod ;
   private String[] T01F927_A758ProCod ;
   private short[] T01F927_A368DisFasLin ;
   private short[] T01F927_A5377DisQuiLin ;
   private String[] T01F928_A396EmprCod ;
   private int[] T01F928_A129BarCod ;
   private byte[] T01F928_A132BarCodReo ;
   private String[] T01F928_A130BarCodPar ;
   private String[] T01F928_A758ProCod ;
   private short[] T01F928_A194BarOrdLin ;
   private short[] T01F928_A5371FasQuiLin ;
   private String[] T01F929_A396EmprCod ;
   private String[] T01F929_A764ProForCod ;
   private boolean[] T01F929_n764ProForCod ;
   private short[] T01F929_A5191ProForLC ;
   private String[] T01F930_A396EmprCod ;
   private byte[] T01F930_A831TipColCod ;
   private short[] T01F930_A5162TipColLin ;
   private String[] T01F931_A396EmprCod ;
   private int[] T01F931_A4744RecPreCod ;
   private short[] T01F931_A4762RecPreLin ;
   private String[] T01F932_A396EmprCod ;
   private int[] T01F932_A252CliCod ;
   private String[] T01F932_A65ArtCod ;
   private String[] T01F932_A4658MdlCod ;
   private String[] T01F932_A457FasCod ;
   private short[] T01F932_A4660FasProLin ;
   private String[] T01F933_A396EmprCod ;
   private String[] T01F933_A457FasCod ;
   private short[] T01F933_A4650FasForLin ;
   private String[] T01F934_A396EmprCod ;
   private int[] T01F934_A129BarCod ;
   private byte[] T01F934_A132BarCodReo ;
   private String[] T01F934_A130BarCodPar ;
   private short[] T01F934_A2804RecLinMaq ;
   private byte[] T01F934_A1273RecLinPro ;
   private String[] T01F935_A396EmprCod ;
   private String[] T01F935_A1514MacProCod ;
   private short[] T01F935_A1517MacProLin ;
   private String[] T01F936_A396EmprCod ;
   private int[] T01F936_A252CliCod ;
   private String[] T01F936_A494ForSer ;
   private String[] T01F936_A482ForColNom ;
   private int[] T01F936_A483ForColNum ;
   private byte[] T01F936_A831TipColCod ;
   private short[] T01F936_A1160ProForL ;
   private String[] T01F937_A396EmprCod ;
   private String[] T01F937_A910Workstat ;
   private int[] T01F937_A887EscMLin ;
   private String[] T01F938_A396EmprCod ;
   private String[] T01F938_A764ProForCod ;
   private boolean[] T01F938_n764ProForCod ;
   private short[] T01F938_A767ProForLin ;
   private String[] T01F939_A396EmprCod ;
   private String[] T01F939_A764ProForCod ;
   private boolean[] T01F939_n764ProForCod ;
   private String[] T01F940_A764ProForCod ;
   private boolean[] T01F940_n764ProForCod ;
   private short[] T01F940_A5191ProForLC ;
   private short[] T01F940_A5192ProFoPgC ;
   private boolean[] T01F940_n5192ProFoPgC ;
   private short[] T01F940_A5193ProFoTmC ;
   private boolean[] T01F940_n5193ProFoTmC ;
   private String[] T01F940_A5194ProFoCla ;
   private boolean[] T01F940_n5194ProFoCla ;
   private short[] T01F940_A5951ProFoRb ;
   private boolean[] T01F940_n5951ProFoRb ;
   private String[] T01F940_A6230ProFoMad ;
   private boolean[] T01F940_n6230ProFoMad ;
   private String[] T01F940_A396EmprCod ;
   private String[] T01F940_A6229ProFoMaq ;
   private boolean[] T01F940_n6229ProFoMaq ;
   private String[] T01F940_A6286ProFoQuC ;
   private boolean[] T01F940_n6286ProFoQuC ;
   private String[] T01F94_A6230ProFoMad ;
   private boolean[] T01F94_n6230ProFoMad ;
   private String[] T01F95_A396EmprCod ;
   private String[] T01F941_A6230ProFoMad ;
   private boolean[] T01F941_n6230ProFoMad ;
   private String[] T01F942_A396EmprCod ;
   private String[] T01F943_A396EmprCod ;
   private String[] T01F943_A764ProForCod ;
   private boolean[] T01F943_n764ProForCod ;
   private short[] T01F943_A5191ProForLC ;
   private String[] T01F93_A764ProForCod ;
   private boolean[] T01F93_n764ProForCod ;
   private short[] T01F93_A5191ProForLC ;
   private short[] T01F93_A5192ProFoPgC ;
   private boolean[] T01F93_n5192ProFoPgC ;
   private short[] T01F93_A5193ProFoTmC ;
   private boolean[] T01F93_n5193ProFoTmC ;
   private String[] T01F93_A5194ProFoCla ;
   private boolean[] T01F93_n5194ProFoCla ;
   private short[] T01F93_A5951ProFoRb ;
   private boolean[] T01F93_n5951ProFoRb ;
   private String[] T01F93_A396EmprCod ;
   private String[] T01F93_A6229ProFoMaq ;
   private boolean[] T01F93_n6229ProFoMaq ;
   private String[] T01F93_A6286ProFoQuC ;
   private boolean[] T01F93_n6286ProFoQuC ;
   private String[] T01F92_A764ProForCod ;
   private boolean[] T01F92_n764ProForCod ;
   private short[] T01F92_A5191ProForLC ;
   private short[] T01F92_A5192ProFoPgC ;
   private boolean[] T01F92_n5192ProFoPgC ;
   private short[] T01F92_A5193ProFoTmC ;
   private boolean[] T01F92_n5193ProFoTmC ;
   private String[] T01F92_A5194ProFoCla ;
   private boolean[] T01F92_n5194ProFoCla ;
   private short[] T01F92_A5951ProFoRb ;
   private boolean[] T01F92_n5951ProFoRb ;
   private String[] T01F92_A396EmprCod ;
   private String[] T01F92_A6229ProFoMaq ;
   private boolean[] T01F92_n6229ProFoMaq ;
   private String[] T01F92_A6286ProFoQuC ;
   private boolean[] T01F92_n6286ProFoQuC ;
   private String[] T01F947_A6230ProFoMad ;
   private boolean[] T01F947_n6230ProFoMad ;
   private String[] T01F948_A396EmprCod ;
   private String[] T01F948_A764ProForCod ;
   private boolean[] T01F948_n764ProForCod ;
   private short[] T01F948_A5191ProForLC ;
   private String[] T01F949_A407EmprNom ;
   private boolean[] T01F949_n407EmprNom ;
   private String[] T01F950_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpqmqpg__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpqmqpg__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpqmqpg__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpqmqpg__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpqmqpg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01F92", "SELECT ProForCod, ProForLC, ProFoPgC, ProFoTmC, ProFoCla, ProFoRb, EmprCod, ProFoMaq, ProFoQuC FROM TXPPROFOC WHERE EmprCod = ? AND ProForCod = ? AND ProForLC = ?  FOR UPDATE OF ProFoPgC, ProFoTmC, ProFoCla, ProFoRb, ProFoMaq, ProFoQuC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F93", "SELECT ProForCod, ProForLC, ProFoPgC, ProFoTmC, ProFoCla, ProFoRb, EmprCod, ProFoMaq, ProFoQuC FROM TXPPROFOC WHERE EmprCod = ? AND ProForCod = ? AND ProForLC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F94", "SELECT MaqDsc AS ProFoMad FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F95", "SELECT EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F96", "SELECT ProForCod, ProForDsc, ProForDsc2, ProNumPro, ProForPau, ProForRb, ProFoLCU, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ?  FOR UPDATE OF ProForDsc, ProForDsc2, ProNumPro, ProForPau, ProForRb, ProFoLCU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F97", "SELECT ProForCod, ProForDsc, ProForDsc2, ProNumPro, ProForPau, ProForRb, ProFoLCU, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F98", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F99", "SELECT /*+ FIRST_ROWS(1) */ TM1.ProForCod, TM1.ProForDsc, TM1.ProForDsc2, T2.EmprNom, TM1.ProNumPro, TM1.ProForPau, TM1.ProForRb, TM1.ProFoLCU, TM1.EmprCod FROM (TXPCPROFO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ProForCod = ? ORDER BY TM1.EmprCod, TM1.ProForCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F910", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F911", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F912", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod DESC, ProForCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01F913", "INSERT INTO TXPCPROFO(ProForCod, ProForDsc, ProForDsc2, ProNumPro, ProForPau, ProForRb, ProFoLCU, EmprCod, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumRec, ProRev, ProForObs, ProForCCi, ProForDCi, ProForFac, IntCodF2, ProForTip, ProForFab, ProForLab, ProForCol, ProForPhx, ProForPhn, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProNh2o, ProForAct, ProForRs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ')", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T01F914", "UPDATE TXPCPROFO SET ProForDsc=?, ProForDsc2=?, ProNumPro=?, ProForPau=?, ProForRb=?, ProFoLCU=?  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T01F915", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new ForEachCursor("T01F916", "SELECT * FROM (SELECT EmprCod, CliCod, CliProQui FROM TXPCLIPQU WHERE EmprCod = ? AND CliProQui = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F917", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F918", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq FROM TXPLAVMQ1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F919", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F920", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstNumLin FROM TXPLCoPro WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F921", "SELECT * FROM (SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F922", "SELECT * FROM (SELECT EmprCod, Pot_num FROM TXPRECPOT WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F923", "SELECT * FROM (SELECT EmprCod, ProForCod, Prg_Cod FROM TXPPQPRGN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F924", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND Acab_Ter = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F925", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F926", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma, C_Reclinpr FROM TXPCRECE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F927", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F928", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F929", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoQuC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F930", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F931", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin FROM TXPPRERE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F932", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod, FasProLin FROM TXPLForFa WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F933", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F934", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F935", "SELECT * FROM (SELECT EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F936", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F937", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F938", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F939", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F940", "SELECT T1.ProForCod, T1.ProForLC, T1.ProFoPgC, T1.ProFoTmC, T1.ProFoCla, T1.ProFoRb, T2.MaqDsc AS ProFoMad, T1.EmprCod, T1.ProFoMaq AS ProFoMaq, T1.ProFoQuC AS ProFoQuC FROM (TXPPROFOC T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.ProFoMaq) WHERE T1.EmprCod = ? and T1.ProForCod = ? and T1.ProForLC = ? ORDER BY T1.EmprCod, T1.ProForCod, T1.ProForLC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F941", "SELECT MaqDsc AS ProFoMad FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F942", "SELECT EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F943", "SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProForCod = ? AND ProForLC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01F944", "INSERT INTO TXPPROFOC(ProForCod, ProForLC, ProFoPgC, ProFoTmC, ProFoCla, ProFoRb, EmprCod, ProFoMaq, ProFoQuC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPROFOC")
         ,new UpdateCursor("T01F945", "UPDATE TXPPROFOC SET ProFoPgC=?, ProFoTmC=?, ProFoCla=?, ProFoRb=?, ProFoMaq=?, ProFoQuC=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLC = ?", GX_NOMASK, "TXPPROFOC")
         ,new UpdateCursor("T01F946", "DELETE FROM TXPPROFOC  WHERE EmprCod = ? AND ProForCod = ? AND ProForLC = ?", GX_NOMASK, "TXPPROFOC")
         ,new ForEachCursor("T01F947", "SELECT MaqDsc AS ProFoMad FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F948", "SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F949", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F950", "SELECT EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 48 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
               return;
            case 9 :
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
            case 10 :
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
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 30);
               stmt.setString(3, (String)parms[3], 40);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               stmt.setString(8, (String)parms[9], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 30);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               stmt.setString(7, (String)parms[11], 3);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 6);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 6);
               }
               return;
            case 43 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
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
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 6);
               }
               stmt.setShort(9, ((Number) parms[15]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
      }
   }

}

