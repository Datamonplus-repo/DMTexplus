package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcontin_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CONTROL TINTE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public tcontin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcontin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcontin_impl.class ));
   }

   public tcontin_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCONTIN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Año", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3646EstTinAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3646EstTinAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3646EstTinAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinAny_Jsonclick, 0, "", "", "", "", "", 1, edtEstTinAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Mes", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinMes_Internalname, GXutil.ltrim( localUtil.ntoc( A3647EstTinMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3647EstTinMes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3647EstTinMes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinMes_Jsonclick, 0, "", "", "", "", "", 1, edtEstTinMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dia", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinDia_Internalname, GXutil.ltrim( localUtil.ntoc( A3648EstTinDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinDia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3648EstTinDia), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3648EstTinDia), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinDia_Jsonclick, 0, "", "", "", "", "", 1, edtEstTinDia_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinUL_Internalname, GXutil.ltrim( localUtil.ntoc( A3649EstTinUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3649EstTinUL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3649EstTinUL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinUL_Jsonclick, 0, "", "", "", "", "", 1, edtEstTinUL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCONTIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount510 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_510 = (short)(1) ;
            scanStartDP510( ) ;
            while ( RcdFound510 != 0 )
            {
               init_level_properties510( ) ;
               getByPrimaryKeyDP510( ) ;
               addRowDP510( ) ;
               scanNextDP510( ) ;
            }
            scanEndDP510( ) ;
            nBlankRcdCount510 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalDP510( ) ;
         standaloneModalDP510( ) ;
         sMode510 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRowDP510( ) ;
            edtavnRcdDeleted_510_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_510_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_510_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_510_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtEstTinNr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTTINNR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstTinNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCodTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarReoTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARREOTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarReoTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReoTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarParTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarParTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarSerTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSerTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDscTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDSCTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDscTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDscTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarArtTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARARTTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarArtTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarArtTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarColNoT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNoT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNoT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarColNuT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNuT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNuT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarTipCoT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCOT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipCoT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCoT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarNomClT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOMCLT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNomClT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomClT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarNumClT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMCLT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumClT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumClT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarMaqTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMAQTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMaqTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarVolTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARVOLTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarVolTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarKgmTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGMTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKgmTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgmTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarMtrTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMTRTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMtrTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtrTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarPieTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIETIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarEstTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARESTTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEstTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarAgrLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRLOT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAgrLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrLot_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarNumAna_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMANA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumAna_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumAna_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarTipDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPDEF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDef_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarIntens_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARINTENS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarIntens_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarIntens_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarPriCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPRICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPriCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCosPD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSPD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCosPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosPD_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCosPA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSPA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCosPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosPA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCosAD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSAD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCosAD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAD_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCosAA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSAA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCosAA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCosCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSCOL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCosCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosCol_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCosAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSANC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCosAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAnc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarNumActx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMACTX_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumActx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumActx_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarNumPda_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMPDA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumPda_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarFaseCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASECOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFaseCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFaseCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarFaseOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEORD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFaseOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFaseOrd_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarReoNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARREONUM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarReoNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReoNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarTipDTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPDTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipDTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarTipCTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipCTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarTipNTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPNTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTipNTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipNTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCosttTi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSTTTI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCosttTi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosttTi_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarRbTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARRBTEO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarRbTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRbTeo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarNumTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarCausa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCAUSA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCausa_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarRecAcb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARRECACB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarRecAcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRecAcb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarKgsTt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGSTT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKgsTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsTt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFamCodT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FAMCODT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFamCodT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFamCodT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarForNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFORNUM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarForNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarForNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarNTint_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNTINT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNTint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNTint_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarAcs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARACS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAcs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarNprg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNPRG_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNprg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNprg_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarLts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARLTS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarLts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLts_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarLtsV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARLTSV_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarLtsV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLtsV_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarFecIt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECIT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecIt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecIt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarFecFt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECFT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecFt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecFt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarColNm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarColNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNm_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarDispCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDISPCLI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDispCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDispCli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtBarMtsTt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMTSTT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMtsTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtsTt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_510 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalDP510( ) ;
            }
            sendRowDP510( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode510 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount510 = (short)(5) ;
         nRcdExists_510 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartDP510( ) ;
            while ( RcdFound510 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_50510( ) ;
               init_level_properties510( ) ;
               standaloneNotModalDP510( ) ;
               getByPrimaryKeyDP510( ) ;
               standaloneModalDP510( ) ;
               addRowDP510( ) ;
               scanNextDP510( ) ;
            }
            scanEndDP510( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode510 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_50510( ) ;
      initAllDP510( ) ;
      init_level_properties510( ) ;
      nRcdExists_510 = (short)(0) ;
      nIsMod_510 = (short)(0) ;
      nRcdDeleted_510 = (short)(0) ;
      nBlankRcdCount510 = (short)(nBlankRcdUsr510+nBlankRcdCount510) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount510 > 0 )
      {
         standaloneNotModalDP510( ) ;
         standaloneModalDP510( ) ;
         addRowDP510( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEstTinNr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount510 = (short)(nBlankRcdCount510-1) ;
      }
      Gx_mode = sMode510 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONTIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCONTIN.htm");
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
      e11DP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z3646EstTinAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z3646EstTinAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3647EstTinMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3647EstTinMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3648EstTinDia = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3648EstTinDia"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3649EstTinUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z3649EstTinUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13841Barnhdr_lc = httpContext.cgiGet( "BARNHDR_LC") ;
            A13759EstFecCier = localUtil.ctod( httpContext.cgiGet( "ESTFECCIER"), 0) ;
            A13760EstCdn1 = (short)(localUtil.ctol( httpContext.cgiGet( "ESTCDN1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13761EstCdn2 = httpContext.cgiGet( "ESTCDN2") ;
            A13762EstCtw = httpContext.cgiGet( "ESTCTW") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstTinAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3646EstTinAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            }
            else
            {
               A3646EstTinAny = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINMES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstTinMes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3647EstTinMes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            }
            else
            {
               A3647EstTinMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINDIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstTinDia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3648EstTinDia = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            }
            else
            {
               A3648EstTinDia = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINUL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstTinUL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3649EstTinUL = (short)(0) ;
               n3649EstTinUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3649EstTinUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3649EstTinUL), 4, 0));
            }
            else
            {
               A3649EstTinUL = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3649EstTinUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3649EstTinUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3649EstTinUL), 4, 0));
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
               A3646EstTinAny = (short)(GXutil.lval( httpContext.GetPar( "EstTinAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
               A3647EstTinMes = (byte)(GXutil.lval( httpContext.GetPar( "EstTinMes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
               A3648EstTinDia = (byte)(GXutil.lval( httpContext.GetPar( "EstTinDia"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
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
                        e11DP2 ();
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
            initAllDP509( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_510_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_510_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributesDP509( ) ;
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

   public void confirm_DP0( )
   {
      beforeValidateDP509( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsDP509( ) ;
         }
         else
         {
            checkExtendedTableDP509( ) ;
            if ( AnyError == 0 )
            {
               zmDP509( 4) ;
            }
            closeExtendedTableCursorsDP509( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode509 = Gx_mode ;
         confirm_DP510( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode509 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesDP0( ) ;
      }
   }

   public void confirm_DP510( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowDP510( ) ;
         if ( ( nRcdExists_510 != 0 ) || ( nIsMod_510 != 0 ) )
         {
            getKeyDP510( ) ;
            if ( ( nRcdExists_510 == 0 ) && ( nRcdDeleted_510 == 0 ) )
            {
               if ( RcdFound510 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateDP510( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableDP510( ) ;
                     if ( AnyError == 0 )
                     {
                        zmDP510( 6) ;
                     }
                     closeExtendedTableCursorsDP510( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ESTTINNR_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEstTinNr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound510 != 0 )
               {
                  if ( nRcdDeleted_510 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyDP510( ) ;
                     loadDP510( ) ;
                     beforeValidateDP510( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsDP510( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_510 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateDP510( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableDP510( ) ;
                           if ( AnyError == 0 )
                           {
                              zmDP510( 6) ;
                           }
                           closeExtendedTableCursorsDP510( ) ;
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
                  if ( nRcdDeleted_510 == 0 )
                  {
                     GXCCtl = "ESTTINNR_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstTinNr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_510_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstTinNr_Internalname, GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarReoTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarParTin_Internalname, GXutil.rtrim( A1935BarParTin)) ;
         httpContext.changePostValue( edtBarSerTin_Internalname, GXutil.rtrim( A1936BarSerTin)) ;
         httpContext.changePostValue( edtBarDscTin_Internalname, GXutil.rtrim( A1937BarDscTin)) ;
         httpContext.changePostValue( edtBarArtTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarColNoT_Internalname, GXutil.rtrim( A1940BarColNoT)) ;
         httpContext.changePostValue( edtBarColNuT_Internalname, GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipCoT_Internalname, GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNomClT_Internalname, GXutil.rtrim( A1943BarNomClT)) ;
         httpContext.changePostValue( edtBarNumClT_Internalname, GXutil.ltrim( localUtil.ntoc( A1944BarNumClT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMaqTin_Internalname, GXutil.rtrim( A1945BarMaqTin)) ;
         httpContext.changePostValue( edtBarVolTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKgmTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMtrTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1949BarPieTin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEstTin_Internalname, GXutil.ltrim( localUtil.ntoc( A2304BarEstTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrLot_Internalname, GXutil.rtrim( A2316BarAgrLot)) ;
         httpContext.changePostValue( edtBarNumAna_Internalname, GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipDef_Internalname, GXutil.ltrim( localUtil.ntoc( A3651BarTipDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarIntens_Internalname, GXutil.ltrim( localUtil.ntoc( A3652BarIntens, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPriCod_Internalname, GXutil.rtrim( A3653BarPriCod)) ;
         httpContext.changePostValue( edtBarCosPD_Internalname, GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosPA_Internalname, GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosAD_Internalname, GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosAA_Internalname, GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNumActx_Internalname, GXutil.ltrim( localUtil.ntoc( A4923BarNumActx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNumPda_Internalname, GXutil.ltrim( localUtil.ntoc( A4924BarNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFaseCod_Internalname, GXutil.rtrim( A4925BarFaseCod)) ;
         httpContext.changePostValue( edtBarFaseOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarReoNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4977BarReoNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipDTin_Internalname, GXutil.rtrim( A5169BarTipDTin)) ;
         httpContext.changePostValue( edtBarTipCTin_Internalname, GXutil.rtrim( A5170BarTipCTin)) ;
         httpContext.changePostValue( edtBarTipNTin_Internalname, GXutil.rtrim( A5171BarTipNTin)) ;
         httpContext.changePostValue( edtBarCosttTi_Internalname, GXutil.ltrim( localUtil.ntoc( A5899BarCosttTi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarRbTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A5900BarRbTeo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNumTin_Internalname, GXutil.ltrim( localUtil.ntoc( A6177BarNumTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCausa_Internalname, GXutil.ltrim( localUtil.ntoc( A6431BarCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarRecAcb_Internalname, GXutil.rtrim( A6634BarRecAcb)) ;
         httpContext.changePostValue( edtBarKgsTt_Internalname, GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFamCodT_Internalname, GXutil.ltrim( localUtil.ntoc( A8584FamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarForNum_Internalname, GXutil.ltrim( localUtil.ntoc( A8609BarForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNTint_Internalname, GXutil.ltrim( localUtil.ntoc( A9754BarNTint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAcs_Internalname, GXutil.rtrim( A10539BarAcs)) ;
         httpContext.changePostValue( edtBarNprg_Internalname, GXutil.rtrim( A10540BarNprg)) ;
         httpContext.changePostValue( edtBarLts_Internalname, GXutil.ltrim( localUtil.ntoc( A10541BarLts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarLtsV_Internalname, GXutil.ltrim( localUtil.ntoc( A10546BarLtsV, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFecIt_Internalname, localUtil.ttoc( A11177BarFecIt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBarFecFt_Internalname, localUtil.ttoc( A11178BarFecFt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBarColNm_Internalname, GXutil.rtrim( A11179BarColNm)) ;
         httpContext.changePostValue( edtBarDispCli_Internalname, GXutil.rtrim( A11762BarDispCli)) ;
         httpContext.changePostValue( edtBarMtsTt_Internalname, GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1929EstTinNr_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1933BarCodTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1934BarReoTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1935BarParTin_"+sGXsfl_50_idx, GXutil.rtrim( Z1935BarParTin)) ;
         httpContext.changePostValue( "ZT_"+"Z1936BarSerTin_"+sGXsfl_50_idx, GXutil.rtrim( Z1936BarSerTin)) ;
         httpContext.changePostValue( "ZT_"+"Z1937BarDscTin_"+sGXsfl_50_idx, GXutil.rtrim( Z1937BarDscTin)) ;
         httpContext.changePostValue( "ZT_"+"Z1939BarArtTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1940BarColNoT_"+sGXsfl_50_idx, GXutil.rtrim( Z1940BarColNoT)) ;
         httpContext.changePostValue( "ZT_"+"Z1941BarColNuT_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1942BarTipCoT_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1943BarNomClT_"+sGXsfl_50_idx, GXutil.rtrim( Z1943BarNomClT)) ;
         httpContext.changePostValue( "ZT_"+"Z1944BarNumClT_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1944BarNumClT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1945BarMaqTin_"+sGXsfl_50_idx, GXutil.rtrim( Z1945BarMaqTin)) ;
         httpContext.changePostValue( "ZT_"+"Z1946BarVolTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1947BarKgmTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1948BarMtrTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1949BarPieTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1949BarPieTin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2304BarEstTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2304BarEstTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2316BarAgrLot_"+sGXsfl_50_idx, GXutil.rtrim( Z2316BarAgrLot)) ;
         httpContext.changePostValue( "ZT_"+"Z3650BarNumAna_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3651BarTipDef_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3651BarTipDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3652BarIntens_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3652BarIntens, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3653BarPriCod_"+sGXsfl_50_idx, GXutil.rtrim( Z3653BarPriCod)) ;
         httpContext.changePostValue( "ZT_"+"Z3654BarCosPD_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3658BarCosPA_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3656BarCosAD_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3657BarCosAA_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3705BarCosCol_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3706BarCosAnc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4923BarNumActx_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4923BarNumActx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4924BarNumPda_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4924BarNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4925BarFaseCod_"+sGXsfl_50_idx, GXutil.rtrim( Z4925BarFaseCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4926BarFaseOrd_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4977BarReoNum_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4977BarReoNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5169BarTipDTin_"+sGXsfl_50_idx, GXutil.rtrim( Z5169BarTipDTin)) ;
         httpContext.changePostValue( "ZT_"+"Z5170BarTipCTin_"+sGXsfl_50_idx, GXutil.rtrim( Z5170BarTipCTin)) ;
         httpContext.changePostValue( "ZT_"+"Z5171BarTipNTin_"+sGXsfl_50_idx, GXutil.rtrim( Z5171BarTipNTin)) ;
         httpContext.changePostValue( "ZT_"+"Z5899BarCosttTi_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z5899BarCosttTi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5900BarRbTeo_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z5900BarRbTeo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6177BarNumTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6177BarNumTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6431BarCausa_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6431BarCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6634BarRecAcb_"+sGXsfl_50_idx, GXutil.rtrim( Z6634BarRecAcb)) ;
         httpContext.changePostValue( "ZT_"+"Z8563BarKgsTt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8584FamCodT_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8584FamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8609BarForNum_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8609BarForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9754BarNTint_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z9754BarNTint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10539BarAcs_"+sGXsfl_50_idx, GXutil.rtrim( Z10539BarAcs)) ;
         httpContext.changePostValue( "ZT_"+"Z10540BarNprg_"+sGXsfl_50_idx, GXutil.rtrim( Z10540BarNprg)) ;
         httpContext.changePostValue( "ZT_"+"Z10541BarLts_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10541BarLts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10546BarLtsV_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10546BarLtsV, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11177BarFecIt_"+sGXsfl_50_idx, localUtil.ttoc( Z11177BarFecIt, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11178BarFecFt_"+sGXsfl_50_idx, localUtil.ttoc( Z11178BarFecFt, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11179BarColNm_"+sGXsfl_50_idx, GXutil.rtrim( Z11179BarColNm)) ;
         httpContext.changePostValue( "ZT_"+"Z11762BarDispCli_"+sGXsfl_50_idx, GXutil.rtrim( Z11762BarDispCli)) ;
         httpContext.changePostValue( "ZT_"+"Z12993BarMtsTt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13759EstFecCier_"+sGXsfl_50_idx, localUtil.dtoc( Z13759EstFecCier, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13760EstCdn1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13760EstCdn1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13761EstCdn2_"+sGXsfl_50_idx, GXutil.rtrim( Z13761EstCdn2)) ;
         httpContext.changePostValue( "ZT_"+"Z13762EstCtw_"+sGXsfl_50_idx, GXutil.rtrim( Z13762EstCtw)) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_510_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_510_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_510_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_510 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_510_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_510_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTTINNR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstTinNr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARREOTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReoTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPARTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDSCTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDscTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARARTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarArtTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNoT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNuT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCoT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNOMCLT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomClT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMCLT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumClT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMAQTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMaqTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARVOLTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarVolTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGMTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgmTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMTRTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMtrTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIETIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARESTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRLOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMANA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumAna_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPDEF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARINTENS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarIntens_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPRICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPriCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSPD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosPD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSPA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosPA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSAD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSAA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSCOL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSANC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMACTX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumActx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMPDA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumPda_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASECOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFaseCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEORD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFaseOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARREONUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReoNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPDTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPNTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipNTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSTTTI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosttTi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARRBTEO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarRbTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCAUSA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCausa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARRECACB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarRecAcb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGSTT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgsTt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FAMCODT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFamCodT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFORNUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarForNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNTINT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNTint_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARACS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAcs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNPRG_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNprg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARLTS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARLTSV_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLtsV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECIT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecIt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECFT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecFt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDISPCLI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDispCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMTSTT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMtsTt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionDP0( )
   {
   }

   public void e11DP2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zmDP509( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3649EstTinUL = T00DP6_A3649EstTinUL[0] ;
         }
         else
         {
            Z3649EstTinUL = A3649EstTinUL ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z3646EstTinAny = A3646EstTinAny ;
         Z3647EstTinMes = A3647EstTinMes ;
         Z3648EstTinDia = A3648EstTinDia ;
         Z3649EstTinUL = A3649EstTinUL ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void loadDP509( )
   {
      /* Using cursor T00DP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound509 = (short)(1) ;
         A407EmprNom = T00DP8_A407EmprNom[0] ;
         n407EmprNom = T00DP8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3649EstTinUL = T00DP8_A3649EstTinUL[0] ;
         n3649EstTinUL = T00DP8_n3649EstTinUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3649EstTinUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3649EstTinUL), 4, 0));
         zmDP509( -3) ;
      }
      pr_default.close(6);
      onLoadActionsDP509( ) ;
   }

   public void onLoadActionsDP509( )
   {
   }

   public void checkExtendedTableDP509( )
   {
      nIsDirty_509 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00DP7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00DP7_A407EmprNom[0] ;
      n407EmprNom = T00DP7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsDP509( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T00DP9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00DP9_A407EmprNom[0] ;
      n407EmprNom = T00DP9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKeyDP509( )
   {
      /* Using cursor T00DP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound509 = (short)(1) ;
      }
      else
      {
         RcdFound509 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00DP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zmDP509( 3) ;
         RcdFound509 = (short)(1) ;
         A3646EstTinAny = T00DP6_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T00DP6_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T00DP6_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A3649EstTinUL = T00DP6_A3649EstTinUL[0] ;
         n3649EstTinUL = T00DP6_n3649EstTinUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3649EstTinUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3649EstTinUL), 4, 0));
         A396EmprCod = T00DP6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z3646EstTinAny = A3646EstTinAny ;
         Z3647EstTinMes = A3647EstTinMes ;
         Z3648EstTinDia = A3648EstTinDia ;
         sMode509 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadDP509( ) ;
         if ( AnyError == 1 )
         {
            RcdFound509 = (short)(0) ;
            initializeNonKeyDP509( ) ;
         }
         Gx_mode = sMode509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound509 = (short)(0) ;
         initializeNonKeyDP509( ) ;
         sMode509 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode509 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyDP509( ) ;
      if ( RcdFound509 == 0 )
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
      RcdFound509 = (short)(0) ;
      /* Using cursor T00DP11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A3646EstTinAny), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00DP11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00DP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP11_A3646EstTinAny[0] < A3646EstTinAny ) || ( T00DP11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T00DP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP11_A3647EstTinMes[0] < A3647EstTinMes ) || ( T00DP11_A3647EstTinMes[0] == A3647EstTinMes ) && ( T00DP11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T00DP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP11_A3648EstTinDia[0] < A3648EstTinDia ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00DP11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00DP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP11_A3646EstTinAny[0] > A3646EstTinAny ) || ( T00DP11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T00DP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP11_A3647EstTinMes[0] > A3647EstTinMes ) || ( T00DP11_A3647EstTinMes[0] == A3647EstTinMes ) && ( T00DP11_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T00DP11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP11_A3648EstTinDia[0] > A3648EstTinDia ) ) )
         {
            A396EmprCod = T00DP11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3646EstTinAny = T00DP11_A3646EstTinAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = T00DP11_A3647EstTinMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = T00DP11_A3648EstTinDia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            RcdFound509 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound509 = (short)(0) ;
      /* Using cursor T00DP12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A3646EstTinAny), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00DP12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00DP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP12_A3646EstTinAny[0] > A3646EstTinAny ) || ( T00DP12_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T00DP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP12_A3647EstTinMes[0] > A3647EstTinMes ) || ( T00DP12_A3647EstTinMes[0] == A3647EstTinMes ) && ( T00DP12_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T00DP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP12_A3648EstTinDia[0] > A3648EstTinDia ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00DP12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00DP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP12_A3646EstTinAny[0] < A3646EstTinAny ) || ( T00DP12_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T00DP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP12_A3647EstTinMes[0] < A3647EstTinMes ) || ( T00DP12_A3647EstTinMes[0] == A3647EstTinMes ) && ( T00DP12_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T00DP12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00DP12_A3648EstTinDia[0] < A3648EstTinDia ) ) )
         {
            A396EmprCod = T00DP12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3646EstTinAny = T00DP12_A3646EstTinAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = T00DP12_A3647EstTinMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = T00DP12_A3648EstTinDia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            RcdFound509 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyDP509( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertDP509( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound509 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A3646EstTinAny = Z3646EstTinAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
               A3647EstTinMes = Z3647EstTinMes ;
               httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
               A3648EstTinDia = Z3648EstTinDia ;
               httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateDP509( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertDP509( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertDP509( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = Z3646EstTinAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = Z3647EstTinMes ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = Z3648EstTinDia ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKeyDP509( ) ;
      if ( RcdFound509 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3646EstTinAny = Z3646EstTinAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = Z3647EstTinMes ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = Z3648EstTinDia ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcontin");
      GX_FocusControl = edtEstTinUL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_DP0( ) ;
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
      if ( RcdFound509 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEstTinUL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartDP509( ) ;
      if ( RcdFound509 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstTinUL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndDP509( ) ;
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
      if ( RcdFound509 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstTinUL_Internalname ;
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
      if ( RcdFound509 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstTinUL_Internalname ;
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
      scanStartDP509( ) ;
      if ( RcdFound509 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound509 != 0 )
         {
            scanNextDP509( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstTinUL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndDP509( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyDP509( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00DP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONTIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z3649EstTinUL != T00DP5_A3649EstTinUL[0] ) )
         {
            if ( Z3649EstTinUL != T00DP5_A3649EstTinUL[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"EstTinUL");
               GXutil.writeLogRaw("Old: ",Z3649EstTinUL);
               GXutil.writeLogRaw("Current: ",T00DP5_A3649EstTinUL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCONTIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertDP509( )
   {
      beforeValidateDP509( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDP509( ) ;
      }
      if ( AnyError == 0 )
      {
         zmDP509( 0) ;
         checkOptimisticConcurrencyDP509( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDP509( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertDP509( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DP13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Boolean.valueOf(n3649EstTinUL), Short.valueOf(A3649EstTinUL), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTIN");
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
                        processLevelDP509( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionDP0( ) ;
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
            loadDP509( ) ;
         }
         endLevelDP509( ) ;
      }
      closeExtendedTableCursorsDP509( ) ;
   }

   public void updateDP509( )
   {
      beforeValidateDP509( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDP509( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDP509( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDP509( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateDP509( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DP14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n3649EstTinUL), Short.valueOf(A3649EstTinUL), A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTIN");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONTIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateDP509( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelDP509( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionDP0( ) ;
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
         endLevelDP509( ) ;
      }
      closeExtendedTableCursorsDP509( ) ;
   }

   public void deferredUpdateDP509( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateDP509( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDP509( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsDP509( ) ;
         afterConfirmDP509( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteDP509( ) ;
            if ( AnyError == 0 )
            {
               scanStartDP510( ) ;
               while ( RcdFound510 != 0 )
               {
                  getByPrimaryKeyDP510( ) ;
                  deleteDP510( ) ;
                  scanNextDP510( ) ;
               }
               scanEndDP510( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DP15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound509 == 0 )
                        {
                           initAllDP509( ) ;
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
                        resetCaptionDP0( ) ;
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
      sMode509 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelDP509( ) ;
      Gx_mode = sMode509 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsDP509( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00DP16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T00DP16_A407EmprNom[0] ;
         n407EmprNom = T00DP16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00DP17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevelDP510( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowDP510( ) ;
         if ( ( nRcdExists_510 != 0 ) || ( nIsMod_510 != 0 ) )
         {
            standaloneNotModalDP510( ) ;
            getKeyDP510( ) ;
            if ( ( nRcdExists_510 == 0 ) && ( nRcdDeleted_510 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertDP510( ) ;
            }
            else
            {
               if ( RcdFound510 != 0 )
               {
                  if ( ( nRcdDeleted_510 != 0 ) && ( nRcdExists_510 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteDP510( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_510 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateDP510( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_510 == 0 )
                  {
                     GXCCtl = "ESTTINNR_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstTinNr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_510_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstTinNr_Internalname, GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarReoTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarParTin_Internalname, GXutil.rtrim( A1935BarParTin)) ;
         httpContext.changePostValue( edtBarSerTin_Internalname, GXutil.rtrim( A1936BarSerTin)) ;
         httpContext.changePostValue( edtBarDscTin_Internalname, GXutil.rtrim( A1937BarDscTin)) ;
         httpContext.changePostValue( edtBarArtTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarColNoT_Internalname, GXutil.rtrim( A1940BarColNoT)) ;
         httpContext.changePostValue( edtBarColNuT_Internalname, GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipCoT_Internalname, GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNomClT_Internalname, GXutil.rtrim( A1943BarNomClT)) ;
         httpContext.changePostValue( edtBarNumClT_Internalname, GXutil.ltrim( localUtil.ntoc( A1944BarNumClT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMaqTin_Internalname, GXutil.rtrim( A1945BarMaqTin)) ;
         httpContext.changePostValue( edtBarVolTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKgmTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMtrTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1949BarPieTin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEstTin_Internalname, GXutil.ltrim( localUtil.ntoc( A2304BarEstTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAgrLot_Internalname, GXutil.rtrim( A2316BarAgrLot)) ;
         httpContext.changePostValue( edtBarNumAna_Internalname, GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipDef_Internalname, GXutil.ltrim( localUtil.ntoc( A3651BarTipDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarIntens_Internalname, GXutil.ltrim( localUtil.ntoc( A3652BarIntens, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPriCod_Internalname, GXutil.rtrim( A3653BarPriCod)) ;
         httpContext.changePostValue( edtBarCosPD_Internalname, GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosPA_Internalname, GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosAD_Internalname, GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosAA_Internalname, GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCosAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNumActx_Internalname, GXutil.ltrim( localUtil.ntoc( A4923BarNumActx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNumPda_Internalname, GXutil.ltrim( localUtil.ntoc( A4924BarNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFaseCod_Internalname, GXutil.rtrim( A4925BarFaseCod)) ;
         httpContext.changePostValue( edtBarFaseOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarReoNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4977BarReoNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTipDTin_Internalname, GXutil.rtrim( A5169BarTipDTin)) ;
         httpContext.changePostValue( edtBarTipCTin_Internalname, GXutil.rtrim( A5170BarTipCTin)) ;
         httpContext.changePostValue( edtBarTipNTin_Internalname, GXutil.rtrim( A5171BarTipNTin)) ;
         httpContext.changePostValue( edtBarCosttTi_Internalname, GXutil.ltrim( localUtil.ntoc( A5899BarCosttTi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarRbTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A5900BarRbTeo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNumTin_Internalname, GXutil.ltrim( localUtil.ntoc( A6177BarNumTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCausa_Internalname, GXutil.ltrim( localUtil.ntoc( A6431BarCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarRecAcb_Internalname, GXutil.rtrim( A6634BarRecAcb)) ;
         httpContext.changePostValue( edtBarKgsTt_Internalname, GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFamCodT_Internalname, GXutil.ltrim( localUtil.ntoc( A8584FamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarForNum_Internalname, GXutil.ltrim( localUtil.ntoc( A8609BarForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarNTint_Internalname, GXutil.ltrim( localUtil.ntoc( A9754BarNTint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAcs_Internalname, GXutil.rtrim( A10539BarAcs)) ;
         httpContext.changePostValue( edtBarNprg_Internalname, GXutil.rtrim( A10540BarNprg)) ;
         httpContext.changePostValue( edtBarLts_Internalname, GXutil.ltrim( localUtil.ntoc( A10541BarLts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarLtsV_Internalname, GXutil.ltrim( localUtil.ntoc( A10546BarLtsV, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFecIt_Internalname, localUtil.ttoc( A11177BarFecIt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBarFecFt_Internalname, localUtil.ttoc( A11178BarFecFt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBarColNm_Internalname, GXutil.rtrim( A11179BarColNm)) ;
         httpContext.changePostValue( edtBarDispCli_Internalname, GXutil.rtrim( A11762BarDispCli)) ;
         httpContext.changePostValue( edtBarMtsTt_Internalname, GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1929EstTinNr_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1933BarCodTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1934BarReoTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1935BarParTin_"+sGXsfl_50_idx, GXutil.rtrim( Z1935BarParTin)) ;
         httpContext.changePostValue( "ZT_"+"Z1936BarSerTin_"+sGXsfl_50_idx, GXutil.rtrim( Z1936BarSerTin)) ;
         httpContext.changePostValue( "ZT_"+"Z1937BarDscTin_"+sGXsfl_50_idx, GXutil.rtrim( Z1937BarDscTin)) ;
         httpContext.changePostValue( "ZT_"+"Z1939BarArtTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1940BarColNoT_"+sGXsfl_50_idx, GXutil.rtrim( Z1940BarColNoT)) ;
         httpContext.changePostValue( "ZT_"+"Z1941BarColNuT_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1942BarTipCoT_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1943BarNomClT_"+sGXsfl_50_idx, GXutil.rtrim( Z1943BarNomClT)) ;
         httpContext.changePostValue( "ZT_"+"Z1944BarNumClT_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1944BarNumClT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1945BarMaqTin_"+sGXsfl_50_idx, GXutil.rtrim( Z1945BarMaqTin)) ;
         httpContext.changePostValue( "ZT_"+"Z1946BarVolTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1947BarKgmTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1948BarMtrTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1949BarPieTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z1949BarPieTin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2304BarEstTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2304BarEstTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2316BarAgrLot_"+sGXsfl_50_idx, GXutil.rtrim( Z2316BarAgrLot)) ;
         httpContext.changePostValue( "ZT_"+"Z3650BarNumAna_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3651BarTipDef_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3651BarTipDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3652BarIntens_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3652BarIntens, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3653BarPriCod_"+sGXsfl_50_idx, GXutil.rtrim( Z3653BarPriCod)) ;
         httpContext.changePostValue( "ZT_"+"Z3654BarCosPD_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3658BarCosPA_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3656BarCosAD_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3657BarCosAA_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3705BarCosCol_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3706BarCosAnc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4923BarNumActx_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4923BarNumActx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4924BarNumPda_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4924BarNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4925BarFaseCod_"+sGXsfl_50_idx, GXutil.rtrim( Z4925BarFaseCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4926BarFaseOrd_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4977BarReoNum_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z4977BarReoNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5169BarTipDTin_"+sGXsfl_50_idx, GXutil.rtrim( Z5169BarTipDTin)) ;
         httpContext.changePostValue( "ZT_"+"Z5170BarTipCTin_"+sGXsfl_50_idx, GXutil.rtrim( Z5170BarTipCTin)) ;
         httpContext.changePostValue( "ZT_"+"Z5171BarTipNTin_"+sGXsfl_50_idx, GXutil.rtrim( Z5171BarTipNTin)) ;
         httpContext.changePostValue( "ZT_"+"Z5899BarCosttTi_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z5899BarCosttTi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5900BarRbTeo_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z5900BarRbTeo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6177BarNumTin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6177BarNumTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6431BarCausa_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6431BarCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6634BarRecAcb_"+sGXsfl_50_idx, GXutil.rtrim( Z6634BarRecAcb)) ;
         httpContext.changePostValue( "ZT_"+"Z8563BarKgsTt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8584FamCodT_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8584FamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8609BarForNum_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8609BarForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9754BarNTint_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z9754BarNTint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10539BarAcs_"+sGXsfl_50_idx, GXutil.rtrim( Z10539BarAcs)) ;
         httpContext.changePostValue( "ZT_"+"Z10540BarNprg_"+sGXsfl_50_idx, GXutil.rtrim( Z10540BarNprg)) ;
         httpContext.changePostValue( "ZT_"+"Z10541BarLts_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10541BarLts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10546BarLtsV_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10546BarLtsV, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11177BarFecIt_"+sGXsfl_50_idx, localUtil.ttoc( Z11177BarFecIt, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11178BarFecFt_"+sGXsfl_50_idx, localUtil.ttoc( Z11178BarFecFt, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z11179BarColNm_"+sGXsfl_50_idx, GXutil.rtrim( Z11179BarColNm)) ;
         httpContext.changePostValue( "ZT_"+"Z11762BarDispCli_"+sGXsfl_50_idx, GXutil.rtrim( Z11762BarDispCli)) ;
         httpContext.changePostValue( "ZT_"+"Z12993BarMtsTt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13759EstFecCier_"+sGXsfl_50_idx, localUtil.dtoc( Z13759EstFecCier, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13760EstCdn1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13760EstCdn1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13761EstCdn2_"+sGXsfl_50_idx, GXutil.rtrim( Z13761EstCdn2)) ;
         httpContext.changePostValue( "ZT_"+"Z13762EstCtw_"+sGXsfl_50_idx, GXutil.rtrim( Z13762EstCtw)) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_510_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_510_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_510_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_510 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_510_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_510_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTTINNR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstTinNr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARREOTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReoTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPARTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSERTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDSCTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDscTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARARTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarArtTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNoT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNUT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNuT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCoT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNOMCLT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomClT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMCLT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumClT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMAQTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMaqTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARVOLTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarVolTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGMTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgmTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMTRTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMtrTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIETIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARESTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAGRLOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMANA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumAna_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPDEF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARINTENS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarIntens_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPRICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPriCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSPD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosPD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSPA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosPA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSAD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSAA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSCOL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSANC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMACTX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumActx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMPDA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumPda_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASECOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFaseCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEORD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFaseOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARREONUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReoNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPDTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPCTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIPNTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipNTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOSTTTI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosttTi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARRBTEO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarRbTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCAUSA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCausa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARRECACB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarRecAcb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKGSTT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgsTt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FAMCODT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFamCodT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFORNUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarForNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNTINT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNTint_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARACS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAcs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNPRG_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNprg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARLTS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARLTSV_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLtsV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECIT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecIt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECFT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecFt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCOLNM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDISPCLI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDispCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMTSTT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMtsTt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllDP510( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_510 = (short)(0) ;
      nIsMod_510 = (short)(0) ;
      nRcdDeleted_510 = (short)(0) ;
   }

   public void processLevelDP509( )
   {
      /* Save parent mode. */
      sMode509 = Gx_mode ;
      processNestedLevelDP510( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode509 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelDP509( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteDP509( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcontin");
         if ( AnyError == 0 )
         {
            confirmValuesDP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcontin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartDP509( )
   {
      /* Using cursor T00DP18 */
      pr_default.execute(16);
      RcdFound509 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound509 = (short)(1) ;
         A396EmprCod = T00DP18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = T00DP18_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T00DP18_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T00DP18_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextDP509( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound509 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound509 = (short)(1) ;
         A396EmprCod = T00DP18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = T00DP18_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T00DP18_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T00DP18_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
      }
   }

   public void scanEndDP509( )
   {
      pr_default.close(16);
   }

   public void afterConfirmDP509( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertDP509( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateDP509( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteDP509( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteDP509( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateDP509( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesDP509( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEstTinAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinAny_Enabled), 5, 0), true);
      edtEstTinMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinMes_Enabled), 5, 0), true);
      edtEstTinDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinDia_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEstTinUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinUL_Enabled), 5, 0), true);
   }

   public void zmDP510( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1933BarCodTin = T00DP3_A1933BarCodTin[0] ;
            Z1934BarReoTin = T00DP3_A1934BarReoTin[0] ;
            Z1935BarParTin = T00DP3_A1935BarParTin[0] ;
            Z1936BarSerTin = T00DP3_A1936BarSerTin[0] ;
            Z1937BarDscTin = T00DP3_A1937BarDscTin[0] ;
            Z1939BarArtTin = T00DP3_A1939BarArtTin[0] ;
            Z1940BarColNoT = T00DP3_A1940BarColNoT[0] ;
            Z1941BarColNuT = T00DP3_A1941BarColNuT[0] ;
            Z1942BarTipCoT = T00DP3_A1942BarTipCoT[0] ;
            Z1943BarNomClT = T00DP3_A1943BarNomClT[0] ;
            Z1944BarNumClT = T00DP3_A1944BarNumClT[0] ;
            Z1945BarMaqTin = T00DP3_A1945BarMaqTin[0] ;
            Z1946BarVolTin = T00DP3_A1946BarVolTin[0] ;
            Z1947BarKgmTin = T00DP3_A1947BarKgmTin[0] ;
            Z1948BarMtrTin = T00DP3_A1948BarMtrTin[0] ;
            Z1949BarPieTin = T00DP3_A1949BarPieTin[0] ;
            Z2304BarEstTin = T00DP3_A2304BarEstTin[0] ;
            Z2316BarAgrLot = T00DP3_A2316BarAgrLot[0] ;
            Z3650BarNumAna = T00DP3_A3650BarNumAna[0] ;
            Z3651BarTipDef = T00DP3_A3651BarTipDef[0] ;
            Z3652BarIntens = T00DP3_A3652BarIntens[0] ;
            Z3653BarPriCod = T00DP3_A3653BarPriCod[0] ;
            Z3654BarCosPD = T00DP3_A3654BarCosPD[0] ;
            Z3658BarCosPA = T00DP3_A3658BarCosPA[0] ;
            Z3656BarCosAD = T00DP3_A3656BarCosAD[0] ;
            Z3657BarCosAA = T00DP3_A3657BarCosAA[0] ;
            Z3705BarCosCol = T00DP3_A3705BarCosCol[0] ;
            Z3706BarCosAnc = T00DP3_A3706BarCosAnc[0] ;
            Z4923BarNumActx = T00DP3_A4923BarNumActx[0] ;
            Z4924BarNumPda = T00DP3_A4924BarNumPda[0] ;
            Z4925BarFaseCod = T00DP3_A4925BarFaseCod[0] ;
            Z4926BarFaseOrd = T00DP3_A4926BarFaseOrd[0] ;
            Z4977BarReoNum = T00DP3_A4977BarReoNum[0] ;
            Z5169BarTipDTin = T00DP3_A5169BarTipDTin[0] ;
            Z5170BarTipCTin = T00DP3_A5170BarTipCTin[0] ;
            Z5171BarTipNTin = T00DP3_A5171BarTipNTin[0] ;
            Z5899BarCosttTi = T00DP3_A5899BarCosttTi[0] ;
            Z5900BarRbTeo = T00DP3_A5900BarRbTeo[0] ;
            Z6177BarNumTin = T00DP3_A6177BarNumTin[0] ;
            Z6431BarCausa = T00DP3_A6431BarCausa[0] ;
            Z6634BarRecAcb = T00DP3_A6634BarRecAcb[0] ;
            Z8563BarKgsTt = T00DP3_A8563BarKgsTt[0] ;
            Z8584FamCodT = T00DP3_A8584FamCodT[0] ;
            Z8609BarForNum = T00DP3_A8609BarForNum[0] ;
            Z9754BarNTint = T00DP3_A9754BarNTint[0] ;
            Z10539BarAcs = T00DP3_A10539BarAcs[0] ;
            Z10540BarNprg = T00DP3_A10540BarNprg[0] ;
            Z10541BarLts = T00DP3_A10541BarLts[0] ;
            Z10546BarLtsV = T00DP3_A10546BarLtsV[0] ;
            Z11177BarFecIt = T00DP3_A11177BarFecIt[0] ;
            Z11178BarFecFt = T00DP3_A11178BarFecFt[0] ;
            Z11179BarColNm = T00DP3_A11179BarColNm[0] ;
            Z11762BarDispCli = T00DP3_A11762BarDispCli[0] ;
            Z12993BarMtsTt = T00DP3_A12993BarMtsTt[0] ;
            Z13759EstFecCier = T00DP3_A13759EstFecCier[0] ;
            Z13760EstCdn1 = T00DP3_A13760EstCdn1[0] ;
            Z13761EstCdn2 = T00DP3_A13761EstCdn2[0] ;
            Z13762EstCtw = T00DP3_A13762EstCtw[0] ;
            Z252CliCod = T00DP3_A252CliCod[0] ;
         }
         else
         {
            Z1933BarCodTin = A1933BarCodTin ;
            Z1934BarReoTin = A1934BarReoTin ;
            Z1935BarParTin = A1935BarParTin ;
            Z1936BarSerTin = A1936BarSerTin ;
            Z1937BarDscTin = A1937BarDscTin ;
            Z1939BarArtTin = A1939BarArtTin ;
            Z1940BarColNoT = A1940BarColNoT ;
            Z1941BarColNuT = A1941BarColNuT ;
            Z1942BarTipCoT = A1942BarTipCoT ;
            Z1943BarNomClT = A1943BarNomClT ;
            Z1944BarNumClT = A1944BarNumClT ;
            Z1945BarMaqTin = A1945BarMaqTin ;
            Z1946BarVolTin = A1946BarVolTin ;
            Z1947BarKgmTin = A1947BarKgmTin ;
            Z1948BarMtrTin = A1948BarMtrTin ;
            Z1949BarPieTin = A1949BarPieTin ;
            Z2304BarEstTin = A2304BarEstTin ;
            Z2316BarAgrLot = A2316BarAgrLot ;
            Z3650BarNumAna = A3650BarNumAna ;
            Z3651BarTipDef = A3651BarTipDef ;
            Z3652BarIntens = A3652BarIntens ;
            Z3653BarPriCod = A3653BarPriCod ;
            Z3654BarCosPD = A3654BarCosPD ;
            Z3658BarCosPA = A3658BarCosPA ;
            Z3656BarCosAD = A3656BarCosAD ;
            Z3657BarCosAA = A3657BarCosAA ;
            Z3705BarCosCol = A3705BarCosCol ;
            Z3706BarCosAnc = A3706BarCosAnc ;
            Z4923BarNumActx = A4923BarNumActx ;
            Z4924BarNumPda = A4924BarNumPda ;
            Z4925BarFaseCod = A4925BarFaseCod ;
            Z4926BarFaseOrd = A4926BarFaseOrd ;
            Z4977BarReoNum = A4977BarReoNum ;
            Z5169BarTipDTin = A5169BarTipDTin ;
            Z5170BarTipCTin = A5170BarTipCTin ;
            Z5171BarTipNTin = A5171BarTipNTin ;
            Z5899BarCosttTi = A5899BarCosttTi ;
            Z5900BarRbTeo = A5900BarRbTeo ;
            Z6177BarNumTin = A6177BarNumTin ;
            Z6431BarCausa = A6431BarCausa ;
            Z6634BarRecAcb = A6634BarRecAcb ;
            Z8563BarKgsTt = A8563BarKgsTt ;
            Z8584FamCodT = A8584FamCodT ;
            Z8609BarForNum = A8609BarForNum ;
            Z9754BarNTint = A9754BarNTint ;
            Z10539BarAcs = A10539BarAcs ;
            Z10540BarNprg = A10540BarNprg ;
            Z10541BarLts = A10541BarLts ;
            Z10546BarLtsV = A10546BarLtsV ;
            Z11177BarFecIt = A11177BarFecIt ;
            Z11178BarFecFt = A11178BarFecFt ;
            Z11179BarColNm = A11179BarColNm ;
            Z11762BarDispCli = A11762BarDispCli ;
            Z12993BarMtsTt = A12993BarMtsTt ;
            Z13759EstFecCier = A13759EstFecCier ;
            Z13760EstCdn1 = A13760EstCdn1 ;
            Z13761EstCdn2 = A13761EstCdn2 ;
            Z13762EstCtw = A13762EstCtw ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z3646EstTinAny = A3646EstTinAny ;
         Z3647EstTinMes = A3647EstTinMes ;
         Z3648EstTinDia = A3648EstTinDia ;
         Z1929EstTinNr = A1929EstTinNr ;
         Z1933BarCodTin = A1933BarCodTin ;
         Z1934BarReoTin = A1934BarReoTin ;
         Z1935BarParTin = A1935BarParTin ;
         Z1936BarSerTin = A1936BarSerTin ;
         Z1937BarDscTin = A1937BarDscTin ;
         Z1939BarArtTin = A1939BarArtTin ;
         Z1940BarColNoT = A1940BarColNoT ;
         Z1941BarColNuT = A1941BarColNuT ;
         Z1942BarTipCoT = A1942BarTipCoT ;
         Z1943BarNomClT = A1943BarNomClT ;
         Z1944BarNumClT = A1944BarNumClT ;
         Z1945BarMaqTin = A1945BarMaqTin ;
         Z1946BarVolTin = A1946BarVolTin ;
         Z1947BarKgmTin = A1947BarKgmTin ;
         Z1948BarMtrTin = A1948BarMtrTin ;
         Z1949BarPieTin = A1949BarPieTin ;
         Z2304BarEstTin = A2304BarEstTin ;
         Z2316BarAgrLot = A2316BarAgrLot ;
         Z3650BarNumAna = A3650BarNumAna ;
         Z3651BarTipDef = A3651BarTipDef ;
         Z3652BarIntens = A3652BarIntens ;
         Z3653BarPriCod = A3653BarPriCod ;
         Z3654BarCosPD = A3654BarCosPD ;
         Z3658BarCosPA = A3658BarCosPA ;
         Z3656BarCosAD = A3656BarCosAD ;
         Z3657BarCosAA = A3657BarCosAA ;
         Z3705BarCosCol = A3705BarCosCol ;
         Z3706BarCosAnc = A3706BarCosAnc ;
         Z4923BarNumActx = A4923BarNumActx ;
         Z4924BarNumPda = A4924BarNumPda ;
         Z4925BarFaseCod = A4925BarFaseCod ;
         Z4926BarFaseOrd = A4926BarFaseOrd ;
         Z4977BarReoNum = A4977BarReoNum ;
         Z5169BarTipDTin = A5169BarTipDTin ;
         Z5170BarTipCTin = A5170BarTipCTin ;
         Z5171BarTipNTin = A5171BarTipNTin ;
         Z5899BarCosttTi = A5899BarCosttTi ;
         Z5900BarRbTeo = A5900BarRbTeo ;
         Z6177BarNumTin = A6177BarNumTin ;
         Z6431BarCausa = A6431BarCausa ;
         Z6634BarRecAcb = A6634BarRecAcb ;
         Z8563BarKgsTt = A8563BarKgsTt ;
         Z8584FamCodT = A8584FamCodT ;
         Z8609BarForNum = A8609BarForNum ;
         Z9754BarNTint = A9754BarNTint ;
         Z10539BarAcs = A10539BarAcs ;
         Z10540BarNprg = A10540BarNprg ;
         Z10541BarLts = A10541BarLts ;
         Z10546BarLtsV = A10546BarLtsV ;
         Z11177BarFecIt = A11177BarFecIt ;
         Z11178BarFecFt = A11178BarFecFt ;
         Z11179BarColNm = A11179BarColNm ;
         Z11762BarDispCli = A11762BarDispCli ;
         Z12993BarMtsTt = A12993BarMtsTt ;
         Z13759EstFecCier = A13759EstFecCier ;
         Z13760EstCdn1 = A13760EstCdn1 ;
         Z13761EstCdn2 = A13761EstCdn2 ;
         Z13762EstCtw = A13762EstCtw ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModalDP510( )
   {
   }

   public void standaloneModalDP510( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEstTinNr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstTinNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtEstTinNr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstTinNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void loadDP510( )
   {
      /* Using cursor T00DP19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound510 = (short)(1) ;
         A1933BarCodTin = T00DP19_A1933BarCodTin[0] ;
         n1933BarCodTin = T00DP19_n1933BarCodTin[0] ;
         A1934BarReoTin = T00DP19_A1934BarReoTin[0] ;
         n1934BarReoTin = T00DP19_n1934BarReoTin[0] ;
         A1935BarParTin = T00DP19_A1935BarParTin[0] ;
         n1935BarParTin = T00DP19_n1935BarParTin[0] ;
         A1936BarSerTin = T00DP19_A1936BarSerTin[0] ;
         n1936BarSerTin = T00DP19_n1936BarSerTin[0] ;
         A1937BarDscTin = T00DP19_A1937BarDscTin[0] ;
         n1937BarDscTin = T00DP19_n1937BarDscTin[0] ;
         A1939BarArtTin = T00DP19_A1939BarArtTin[0] ;
         n1939BarArtTin = T00DP19_n1939BarArtTin[0] ;
         A1940BarColNoT = T00DP19_A1940BarColNoT[0] ;
         n1940BarColNoT = T00DP19_n1940BarColNoT[0] ;
         A1941BarColNuT = T00DP19_A1941BarColNuT[0] ;
         n1941BarColNuT = T00DP19_n1941BarColNuT[0] ;
         A1942BarTipCoT = T00DP19_A1942BarTipCoT[0] ;
         n1942BarTipCoT = T00DP19_n1942BarTipCoT[0] ;
         A1943BarNomClT = T00DP19_A1943BarNomClT[0] ;
         n1943BarNomClT = T00DP19_n1943BarNomClT[0] ;
         A1944BarNumClT = T00DP19_A1944BarNumClT[0] ;
         n1944BarNumClT = T00DP19_n1944BarNumClT[0] ;
         A1945BarMaqTin = T00DP19_A1945BarMaqTin[0] ;
         n1945BarMaqTin = T00DP19_n1945BarMaqTin[0] ;
         A1946BarVolTin = T00DP19_A1946BarVolTin[0] ;
         n1946BarVolTin = T00DP19_n1946BarVolTin[0] ;
         A1947BarKgmTin = T00DP19_A1947BarKgmTin[0] ;
         n1947BarKgmTin = T00DP19_n1947BarKgmTin[0] ;
         A1948BarMtrTin = T00DP19_A1948BarMtrTin[0] ;
         n1948BarMtrTin = T00DP19_n1948BarMtrTin[0] ;
         A1949BarPieTin = T00DP19_A1949BarPieTin[0] ;
         n1949BarPieTin = T00DP19_n1949BarPieTin[0] ;
         A2304BarEstTin = T00DP19_A2304BarEstTin[0] ;
         n2304BarEstTin = T00DP19_n2304BarEstTin[0] ;
         A2316BarAgrLot = T00DP19_A2316BarAgrLot[0] ;
         n2316BarAgrLot = T00DP19_n2316BarAgrLot[0] ;
         A3650BarNumAna = T00DP19_A3650BarNumAna[0] ;
         n3650BarNumAna = T00DP19_n3650BarNumAna[0] ;
         A3651BarTipDef = T00DP19_A3651BarTipDef[0] ;
         n3651BarTipDef = T00DP19_n3651BarTipDef[0] ;
         A3652BarIntens = T00DP19_A3652BarIntens[0] ;
         n3652BarIntens = T00DP19_n3652BarIntens[0] ;
         A3653BarPriCod = T00DP19_A3653BarPriCod[0] ;
         n3653BarPriCod = T00DP19_n3653BarPriCod[0] ;
         A3654BarCosPD = T00DP19_A3654BarCosPD[0] ;
         n3654BarCosPD = T00DP19_n3654BarCosPD[0] ;
         A3658BarCosPA = T00DP19_A3658BarCosPA[0] ;
         n3658BarCosPA = T00DP19_n3658BarCosPA[0] ;
         A3656BarCosAD = T00DP19_A3656BarCosAD[0] ;
         n3656BarCosAD = T00DP19_n3656BarCosAD[0] ;
         A3657BarCosAA = T00DP19_A3657BarCosAA[0] ;
         n3657BarCosAA = T00DP19_n3657BarCosAA[0] ;
         A3705BarCosCol = T00DP19_A3705BarCosCol[0] ;
         n3705BarCosCol = T00DP19_n3705BarCosCol[0] ;
         A3706BarCosAnc = T00DP19_A3706BarCosAnc[0] ;
         n3706BarCosAnc = T00DP19_n3706BarCosAnc[0] ;
         A4923BarNumActx = T00DP19_A4923BarNumActx[0] ;
         n4923BarNumActx = T00DP19_n4923BarNumActx[0] ;
         A4924BarNumPda = T00DP19_A4924BarNumPda[0] ;
         n4924BarNumPda = T00DP19_n4924BarNumPda[0] ;
         A4925BarFaseCod = T00DP19_A4925BarFaseCod[0] ;
         n4925BarFaseCod = T00DP19_n4925BarFaseCod[0] ;
         A4926BarFaseOrd = T00DP19_A4926BarFaseOrd[0] ;
         n4926BarFaseOrd = T00DP19_n4926BarFaseOrd[0] ;
         A4977BarReoNum = T00DP19_A4977BarReoNum[0] ;
         n4977BarReoNum = T00DP19_n4977BarReoNum[0] ;
         A5169BarTipDTin = T00DP19_A5169BarTipDTin[0] ;
         n5169BarTipDTin = T00DP19_n5169BarTipDTin[0] ;
         A5170BarTipCTin = T00DP19_A5170BarTipCTin[0] ;
         n5170BarTipCTin = T00DP19_n5170BarTipCTin[0] ;
         A5171BarTipNTin = T00DP19_A5171BarTipNTin[0] ;
         n5171BarTipNTin = T00DP19_n5171BarTipNTin[0] ;
         A5899BarCosttTi = T00DP19_A5899BarCosttTi[0] ;
         n5899BarCosttTi = T00DP19_n5899BarCosttTi[0] ;
         A5900BarRbTeo = T00DP19_A5900BarRbTeo[0] ;
         n5900BarRbTeo = T00DP19_n5900BarRbTeo[0] ;
         A6177BarNumTin = T00DP19_A6177BarNumTin[0] ;
         n6177BarNumTin = T00DP19_n6177BarNumTin[0] ;
         A6431BarCausa = T00DP19_A6431BarCausa[0] ;
         n6431BarCausa = T00DP19_n6431BarCausa[0] ;
         A6634BarRecAcb = T00DP19_A6634BarRecAcb[0] ;
         n6634BarRecAcb = T00DP19_n6634BarRecAcb[0] ;
         A8563BarKgsTt = T00DP19_A8563BarKgsTt[0] ;
         n8563BarKgsTt = T00DP19_n8563BarKgsTt[0] ;
         A8584FamCodT = T00DP19_A8584FamCodT[0] ;
         n8584FamCodT = T00DP19_n8584FamCodT[0] ;
         A8609BarForNum = T00DP19_A8609BarForNum[0] ;
         n8609BarForNum = T00DP19_n8609BarForNum[0] ;
         A9754BarNTint = T00DP19_A9754BarNTint[0] ;
         n9754BarNTint = T00DP19_n9754BarNTint[0] ;
         A10539BarAcs = T00DP19_A10539BarAcs[0] ;
         n10539BarAcs = T00DP19_n10539BarAcs[0] ;
         A10540BarNprg = T00DP19_A10540BarNprg[0] ;
         n10540BarNprg = T00DP19_n10540BarNprg[0] ;
         A10541BarLts = T00DP19_A10541BarLts[0] ;
         n10541BarLts = T00DP19_n10541BarLts[0] ;
         A10546BarLtsV = T00DP19_A10546BarLtsV[0] ;
         n10546BarLtsV = T00DP19_n10546BarLtsV[0] ;
         A11177BarFecIt = T00DP19_A11177BarFecIt[0] ;
         n11177BarFecIt = T00DP19_n11177BarFecIt[0] ;
         A11178BarFecFt = T00DP19_A11178BarFecFt[0] ;
         n11178BarFecFt = T00DP19_n11178BarFecFt[0] ;
         A11179BarColNm = T00DP19_A11179BarColNm[0] ;
         n11179BarColNm = T00DP19_n11179BarColNm[0] ;
         A11762BarDispCli = T00DP19_A11762BarDispCli[0] ;
         n11762BarDispCli = T00DP19_n11762BarDispCli[0] ;
         A12993BarMtsTt = T00DP19_A12993BarMtsTt[0] ;
         n12993BarMtsTt = T00DP19_n12993BarMtsTt[0] ;
         A13759EstFecCier = T00DP19_A13759EstFecCier[0] ;
         A13760EstCdn1 = T00DP19_A13760EstCdn1[0] ;
         A13761EstCdn2 = T00DP19_A13761EstCdn2[0] ;
         A13762EstCtw = T00DP19_A13762EstCtw[0] ;
         A252CliCod = T00DP19_A252CliCod[0] ;
         zmDP510( -5) ;
      }
      pr_default.close(17);
      onLoadActionsDP510( ) ;
   }

   public void onLoadActionsDP510( )
   {
      A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
      httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
   }

   public void checkExtendedTableDP510( )
   {
      nIsDirty_510 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalDP510( ) ;
      /* Using cursor T00DP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      nIsDirty_510 = (short)(1) ;
      A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
      httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
      if ( ! ( ( GXutil.strcmp(A3653BarPriCod, "0") == 0 ) || ( GXutil.strcmp(A3653BarPriCod, "1") == 0 ) ) )
      {
         GXCCtl = "BARPRICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPriCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsDP510( )
   {
      pr_default.close(2);
   }

   public void enableDisableDP510( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T00DP20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKeyDP510( )
   {
      /* Using cursor T00DP21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound510 = (short)(1) ;
      }
      else
      {
         RcdFound510 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKeyDP510( )
   {
      /* Using cursor T00DP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmDP510( 5) ;
         RcdFound510 = (short)(1) ;
         initializeNonKeyDP510( ) ;
         A1929EstTinNr = T00DP3_A1929EstTinNr[0] ;
         A1933BarCodTin = T00DP3_A1933BarCodTin[0] ;
         n1933BarCodTin = T00DP3_n1933BarCodTin[0] ;
         A1934BarReoTin = T00DP3_A1934BarReoTin[0] ;
         n1934BarReoTin = T00DP3_n1934BarReoTin[0] ;
         A1935BarParTin = T00DP3_A1935BarParTin[0] ;
         n1935BarParTin = T00DP3_n1935BarParTin[0] ;
         A1936BarSerTin = T00DP3_A1936BarSerTin[0] ;
         n1936BarSerTin = T00DP3_n1936BarSerTin[0] ;
         A1937BarDscTin = T00DP3_A1937BarDscTin[0] ;
         n1937BarDscTin = T00DP3_n1937BarDscTin[0] ;
         A1939BarArtTin = T00DP3_A1939BarArtTin[0] ;
         n1939BarArtTin = T00DP3_n1939BarArtTin[0] ;
         A1940BarColNoT = T00DP3_A1940BarColNoT[0] ;
         n1940BarColNoT = T00DP3_n1940BarColNoT[0] ;
         A1941BarColNuT = T00DP3_A1941BarColNuT[0] ;
         n1941BarColNuT = T00DP3_n1941BarColNuT[0] ;
         A1942BarTipCoT = T00DP3_A1942BarTipCoT[0] ;
         n1942BarTipCoT = T00DP3_n1942BarTipCoT[0] ;
         A1943BarNomClT = T00DP3_A1943BarNomClT[0] ;
         n1943BarNomClT = T00DP3_n1943BarNomClT[0] ;
         A1944BarNumClT = T00DP3_A1944BarNumClT[0] ;
         n1944BarNumClT = T00DP3_n1944BarNumClT[0] ;
         A1945BarMaqTin = T00DP3_A1945BarMaqTin[0] ;
         n1945BarMaqTin = T00DP3_n1945BarMaqTin[0] ;
         A1946BarVolTin = T00DP3_A1946BarVolTin[0] ;
         n1946BarVolTin = T00DP3_n1946BarVolTin[0] ;
         A1947BarKgmTin = T00DP3_A1947BarKgmTin[0] ;
         n1947BarKgmTin = T00DP3_n1947BarKgmTin[0] ;
         A1948BarMtrTin = T00DP3_A1948BarMtrTin[0] ;
         n1948BarMtrTin = T00DP3_n1948BarMtrTin[0] ;
         A1949BarPieTin = T00DP3_A1949BarPieTin[0] ;
         n1949BarPieTin = T00DP3_n1949BarPieTin[0] ;
         A2304BarEstTin = T00DP3_A2304BarEstTin[0] ;
         n2304BarEstTin = T00DP3_n2304BarEstTin[0] ;
         A2316BarAgrLot = T00DP3_A2316BarAgrLot[0] ;
         n2316BarAgrLot = T00DP3_n2316BarAgrLot[0] ;
         A3650BarNumAna = T00DP3_A3650BarNumAna[0] ;
         n3650BarNumAna = T00DP3_n3650BarNumAna[0] ;
         A3651BarTipDef = T00DP3_A3651BarTipDef[0] ;
         n3651BarTipDef = T00DP3_n3651BarTipDef[0] ;
         A3652BarIntens = T00DP3_A3652BarIntens[0] ;
         n3652BarIntens = T00DP3_n3652BarIntens[0] ;
         A3653BarPriCod = T00DP3_A3653BarPriCod[0] ;
         n3653BarPriCod = T00DP3_n3653BarPriCod[0] ;
         A3654BarCosPD = T00DP3_A3654BarCosPD[0] ;
         n3654BarCosPD = T00DP3_n3654BarCosPD[0] ;
         A3658BarCosPA = T00DP3_A3658BarCosPA[0] ;
         n3658BarCosPA = T00DP3_n3658BarCosPA[0] ;
         A3656BarCosAD = T00DP3_A3656BarCosAD[0] ;
         n3656BarCosAD = T00DP3_n3656BarCosAD[0] ;
         A3657BarCosAA = T00DP3_A3657BarCosAA[0] ;
         n3657BarCosAA = T00DP3_n3657BarCosAA[0] ;
         A3705BarCosCol = T00DP3_A3705BarCosCol[0] ;
         n3705BarCosCol = T00DP3_n3705BarCosCol[0] ;
         A3706BarCosAnc = T00DP3_A3706BarCosAnc[0] ;
         n3706BarCosAnc = T00DP3_n3706BarCosAnc[0] ;
         A4923BarNumActx = T00DP3_A4923BarNumActx[0] ;
         n4923BarNumActx = T00DP3_n4923BarNumActx[0] ;
         A4924BarNumPda = T00DP3_A4924BarNumPda[0] ;
         n4924BarNumPda = T00DP3_n4924BarNumPda[0] ;
         A4925BarFaseCod = T00DP3_A4925BarFaseCod[0] ;
         n4925BarFaseCod = T00DP3_n4925BarFaseCod[0] ;
         A4926BarFaseOrd = T00DP3_A4926BarFaseOrd[0] ;
         n4926BarFaseOrd = T00DP3_n4926BarFaseOrd[0] ;
         A4977BarReoNum = T00DP3_A4977BarReoNum[0] ;
         n4977BarReoNum = T00DP3_n4977BarReoNum[0] ;
         A5169BarTipDTin = T00DP3_A5169BarTipDTin[0] ;
         n5169BarTipDTin = T00DP3_n5169BarTipDTin[0] ;
         A5170BarTipCTin = T00DP3_A5170BarTipCTin[0] ;
         n5170BarTipCTin = T00DP3_n5170BarTipCTin[0] ;
         A5171BarTipNTin = T00DP3_A5171BarTipNTin[0] ;
         n5171BarTipNTin = T00DP3_n5171BarTipNTin[0] ;
         A5899BarCosttTi = T00DP3_A5899BarCosttTi[0] ;
         n5899BarCosttTi = T00DP3_n5899BarCosttTi[0] ;
         A5900BarRbTeo = T00DP3_A5900BarRbTeo[0] ;
         n5900BarRbTeo = T00DP3_n5900BarRbTeo[0] ;
         A6177BarNumTin = T00DP3_A6177BarNumTin[0] ;
         n6177BarNumTin = T00DP3_n6177BarNumTin[0] ;
         A6431BarCausa = T00DP3_A6431BarCausa[0] ;
         n6431BarCausa = T00DP3_n6431BarCausa[0] ;
         A6634BarRecAcb = T00DP3_A6634BarRecAcb[0] ;
         n6634BarRecAcb = T00DP3_n6634BarRecAcb[0] ;
         A8563BarKgsTt = T00DP3_A8563BarKgsTt[0] ;
         n8563BarKgsTt = T00DP3_n8563BarKgsTt[0] ;
         A8584FamCodT = T00DP3_A8584FamCodT[0] ;
         n8584FamCodT = T00DP3_n8584FamCodT[0] ;
         A8609BarForNum = T00DP3_A8609BarForNum[0] ;
         n8609BarForNum = T00DP3_n8609BarForNum[0] ;
         A9754BarNTint = T00DP3_A9754BarNTint[0] ;
         n9754BarNTint = T00DP3_n9754BarNTint[0] ;
         A10539BarAcs = T00DP3_A10539BarAcs[0] ;
         n10539BarAcs = T00DP3_n10539BarAcs[0] ;
         A10540BarNprg = T00DP3_A10540BarNprg[0] ;
         n10540BarNprg = T00DP3_n10540BarNprg[0] ;
         A10541BarLts = T00DP3_A10541BarLts[0] ;
         n10541BarLts = T00DP3_n10541BarLts[0] ;
         A10546BarLtsV = T00DP3_A10546BarLtsV[0] ;
         n10546BarLtsV = T00DP3_n10546BarLtsV[0] ;
         A11177BarFecIt = T00DP3_A11177BarFecIt[0] ;
         n11177BarFecIt = T00DP3_n11177BarFecIt[0] ;
         A11178BarFecFt = T00DP3_A11178BarFecFt[0] ;
         n11178BarFecFt = T00DP3_n11178BarFecFt[0] ;
         A11179BarColNm = T00DP3_A11179BarColNm[0] ;
         n11179BarColNm = T00DP3_n11179BarColNm[0] ;
         A11762BarDispCli = T00DP3_A11762BarDispCli[0] ;
         n11762BarDispCli = T00DP3_n11762BarDispCli[0] ;
         A12993BarMtsTt = T00DP3_A12993BarMtsTt[0] ;
         n12993BarMtsTt = T00DP3_n12993BarMtsTt[0] ;
         A13759EstFecCier = T00DP3_A13759EstFecCier[0] ;
         A13760EstCdn1 = T00DP3_A13760EstCdn1[0] ;
         A13761EstCdn2 = T00DP3_A13761EstCdn2[0] ;
         A13762EstCtw = T00DP3_A13762EstCtw[0] ;
         A252CliCod = T00DP3_A252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3646EstTinAny = A3646EstTinAny ;
         Z3647EstTinMes = A3647EstTinMes ;
         Z3648EstTinDia = A3648EstTinDia ;
         Z1929EstTinNr = A1929EstTinNr ;
         sMode510 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalDP510( ) ;
         loadDP510( ) ;
         Gx_mode = sMode510 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound510 = (short)(0) ;
         initializeNonKeyDP510( ) ;
         sMode510 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalDP510( ) ;
         Gx_mode = sMode510 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesDP510( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyDP510( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00DP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCONTI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1933BarCodTin != T00DP2_A1933BarCodTin[0] ) || ( Z1934BarReoTin != T00DP2_A1934BarReoTin[0] ) || ( GXutil.strcmp(Z1935BarParTin, T00DP2_A1935BarParTin[0]) != 0 ) || ( GXutil.strcmp(Z1936BarSerTin, T00DP2_A1936BarSerTin[0]) != 0 ) || ( GXutil.strcmp(Z1937BarDscTin, T00DP2_A1937BarDscTin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1939BarArtTin != T00DP2_A1939BarArtTin[0] ) || ( GXutil.strcmp(Z1940BarColNoT, T00DP2_A1940BarColNoT[0]) != 0 ) || ( Z1941BarColNuT != T00DP2_A1941BarColNuT[0] ) || ( Z1942BarTipCoT != T00DP2_A1942BarTipCoT[0] ) || ( GXutil.strcmp(Z1943BarNomClT, T00DP2_A1943BarNomClT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1944BarNumClT != T00DP2_A1944BarNumClT[0] ) || ( GXutil.strcmp(Z1945BarMaqTin, T00DP2_A1945BarMaqTin[0]) != 0 ) || ( Z1946BarVolTin != T00DP2_A1946BarVolTin[0] ) || ( DecimalUtil.compareTo(Z1947BarKgmTin, T00DP2_A1947BarKgmTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z1948BarMtrTin, T00DP2_A1948BarMtrTin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1949BarPieTin != T00DP2_A1949BarPieTin[0] ) || ( Z2304BarEstTin != T00DP2_A2304BarEstTin[0] ) || ( GXutil.strcmp(Z2316BarAgrLot, T00DP2_A2316BarAgrLot[0]) != 0 ) || ( Z3650BarNumAna != T00DP2_A3650BarNumAna[0] ) || ( Z3651BarTipDef != T00DP2_A3651BarTipDef[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3652BarIntens != T00DP2_A3652BarIntens[0] ) || ( GXutil.strcmp(Z3653BarPriCod, T00DP2_A3653BarPriCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z3654BarCosPD, T00DP2_A3654BarCosPD[0]) != 0 ) || ( DecimalUtil.compareTo(Z3658BarCosPA, T00DP2_A3658BarCosPA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3656BarCosAD, T00DP2_A3656BarCosAD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3657BarCosAA, T00DP2_A3657BarCosAA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3705BarCosCol, T00DP2_A3705BarCosCol[0]) != 0 ) || ( DecimalUtil.compareTo(Z3706BarCosAnc, T00DP2_A3706BarCosAnc[0]) != 0 ) || ( Z4923BarNumActx != T00DP2_A4923BarNumActx[0] ) || ( Z4924BarNumPda != T00DP2_A4924BarNumPda[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4925BarFaseCod, T00DP2_A4925BarFaseCod[0]) != 0 ) || ( Z4926BarFaseOrd != T00DP2_A4926BarFaseOrd[0] ) || ( Z4977BarReoNum != T00DP2_A4977BarReoNum[0] ) || ( GXutil.strcmp(Z5169BarTipDTin, T00DP2_A5169BarTipDTin[0]) != 0 ) || ( GXutil.strcmp(Z5170BarTipCTin, T00DP2_A5170BarTipCTin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5171BarTipNTin, T00DP2_A5171BarTipNTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z5899BarCosttTi, T00DP2_A5899BarCosttTi[0]) != 0 ) || ( Z5900BarRbTeo != T00DP2_A5900BarRbTeo[0] ) || ( Z6177BarNumTin != T00DP2_A6177BarNumTin[0] ) || ( Z6431BarCausa != T00DP2_A6431BarCausa[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6634BarRecAcb, T00DP2_A6634BarRecAcb[0]) != 0 ) || ( DecimalUtil.compareTo(Z8563BarKgsTt, T00DP2_A8563BarKgsTt[0]) != 0 ) || ( Z8584FamCodT != T00DP2_A8584FamCodT[0] ) || ( Z8609BarForNum != T00DP2_A8609BarForNum[0] ) || ( Z9754BarNTint != T00DP2_A9754BarNTint[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10539BarAcs, T00DP2_A10539BarAcs[0]) != 0 ) || ( GXutil.strcmp(Z10540BarNprg, T00DP2_A10540BarNprg[0]) != 0 ) || ( Z10541BarLts != T00DP2_A10541BarLts[0] ) || ( DecimalUtil.compareTo(Z10546BarLtsV, T00DP2_A10546BarLtsV[0]) != 0 ) || !( GXutil.dateCompare(Z11177BarFecIt, T00DP2_A11177BarFecIt[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z11178BarFecFt, T00DP2_A11178BarFecFt[0]) ) || ( GXutil.strcmp(Z11179BarColNm, T00DP2_A11179BarColNm[0]) != 0 ) || ( GXutil.strcmp(Z11762BarDispCli, T00DP2_A11762BarDispCli[0]) != 0 ) || ( DecimalUtil.compareTo(Z12993BarMtsTt, T00DP2_A12993BarMtsTt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13759EstFecCier), GXutil.resetTime(T00DP2_A13759EstFecCier[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13760EstCdn1 != T00DP2_A13760EstCdn1[0] ) || ( GXutil.strcmp(Z13761EstCdn2, T00DP2_A13761EstCdn2[0]) != 0 ) || ( GXutil.strcmp(Z13762EstCtw, T00DP2_A13762EstCtw[0]) != 0 ) || ( Z252CliCod != T00DP2_A252CliCod[0] ) )
         {
            if ( Z1933BarCodTin != T00DP2_A1933BarCodTin[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCodTin");
               GXutil.writeLogRaw("Old: ",Z1933BarCodTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1933BarCodTin[0]);
            }
            if ( Z1934BarReoTin != T00DP2_A1934BarReoTin[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarReoTin");
               GXutil.writeLogRaw("Old: ",Z1934BarReoTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1934BarReoTin[0]);
            }
            if ( GXutil.strcmp(Z1935BarParTin, T00DP2_A1935BarParTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarParTin");
               GXutil.writeLogRaw("Old: ",Z1935BarParTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1935BarParTin[0]);
            }
            if ( GXutil.strcmp(Z1936BarSerTin, T00DP2_A1936BarSerTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarSerTin");
               GXutil.writeLogRaw("Old: ",Z1936BarSerTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1936BarSerTin[0]);
            }
            if ( GXutil.strcmp(Z1937BarDscTin, T00DP2_A1937BarDscTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarDscTin");
               GXutil.writeLogRaw("Old: ",Z1937BarDscTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1937BarDscTin[0]);
            }
            if ( Z1939BarArtTin != T00DP2_A1939BarArtTin[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarArtTin");
               GXutil.writeLogRaw("Old: ",Z1939BarArtTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1939BarArtTin[0]);
            }
            if ( GXutil.strcmp(Z1940BarColNoT, T00DP2_A1940BarColNoT[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarColNoT");
               GXutil.writeLogRaw("Old: ",Z1940BarColNoT);
               GXutil.writeLogRaw("Current: ",T00DP2_A1940BarColNoT[0]);
            }
            if ( Z1941BarColNuT != T00DP2_A1941BarColNuT[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarColNuT");
               GXutil.writeLogRaw("Old: ",Z1941BarColNuT);
               GXutil.writeLogRaw("Current: ",T00DP2_A1941BarColNuT[0]);
            }
            if ( Z1942BarTipCoT != T00DP2_A1942BarTipCoT[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarTipCoT");
               GXutil.writeLogRaw("Old: ",Z1942BarTipCoT);
               GXutil.writeLogRaw("Current: ",T00DP2_A1942BarTipCoT[0]);
            }
            if ( GXutil.strcmp(Z1943BarNomClT, T00DP2_A1943BarNomClT[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarNomClT");
               GXutil.writeLogRaw("Old: ",Z1943BarNomClT);
               GXutil.writeLogRaw("Current: ",T00DP2_A1943BarNomClT[0]);
            }
            if ( Z1944BarNumClT != T00DP2_A1944BarNumClT[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarNumClT");
               GXutil.writeLogRaw("Old: ",Z1944BarNumClT);
               GXutil.writeLogRaw("Current: ",T00DP2_A1944BarNumClT[0]);
            }
            if ( GXutil.strcmp(Z1945BarMaqTin, T00DP2_A1945BarMaqTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarMaqTin");
               GXutil.writeLogRaw("Old: ",Z1945BarMaqTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1945BarMaqTin[0]);
            }
            if ( Z1946BarVolTin != T00DP2_A1946BarVolTin[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarVolTin");
               GXutil.writeLogRaw("Old: ",Z1946BarVolTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1946BarVolTin[0]);
            }
            if ( DecimalUtil.compareTo(Z1947BarKgmTin, T00DP2_A1947BarKgmTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarKgmTin");
               GXutil.writeLogRaw("Old: ",Z1947BarKgmTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1947BarKgmTin[0]);
            }
            if ( DecimalUtil.compareTo(Z1948BarMtrTin, T00DP2_A1948BarMtrTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarMtrTin");
               GXutil.writeLogRaw("Old: ",Z1948BarMtrTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1948BarMtrTin[0]);
            }
            if ( Z1949BarPieTin != T00DP2_A1949BarPieTin[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarPieTin");
               GXutil.writeLogRaw("Old: ",Z1949BarPieTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A1949BarPieTin[0]);
            }
            if ( Z2304BarEstTin != T00DP2_A2304BarEstTin[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarEstTin");
               GXutil.writeLogRaw("Old: ",Z2304BarEstTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A2304BarEstTin[0]);
            }
            if ( GXutil.strcmp(Z2316BarAgrLot, T00DP2_A2316BarAgrLot[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarAgrLot");
               GXutil.writeLogRaw("Old: ",Z2316BarAgrLot);
               GXutil.writeLogRaw("Current: ",T00DP2_A2316BarAgrLot[0]);
            }
            if ( Z3650BarNumAna != T00DP2_A3650BarNumAna[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarNumAna");
               GXutil.writeLogRaw("Old: ",Z3650BarNumAna);
               GXutil.writeLogRaw("Current: ",T00DP2_A3650BarNumAna[0]);
            }
            if ( Z3651BarTipDef != T00DP2_A3651BarTipDef[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarTipDef");
               GXutil.writeLogRaw("Old: ",Z3651BarTipDef);
               GXutil.writeLogRaw("Current: ",T00DP2_A3651BarTipDef[0]);
            }
            if ( Z3652BarIntens != T00DP2_A3652BarIntens[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarIntens");
               GXutil.writeLogRaw("Old: ",Z3652BarIntens);
               GXutil.writeLogRaw("Current: ",T00DP2_A3652BarIntens[0]);
            }
            if ( GXutil.strcmp(Z3653BarPriCod, T00DP2_A3653BarPriCod[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarPriCod");
               GXutil.writeLogRaw("Old: ",Z3653BarPriCod);
               GXutil.writeLogRaw("Current: ",T00DP2_A3653BarPriCod[0]);
            }
            if ( DecimalUtil.compareTo(Z3654BarCosPD, T00DP2_A3654BarCosPD[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCosPD");
               GXutil.writeLogRaw("Old: ",Z3654BarCosPD);
               GXutil.writeLogRaw("Current: ",T00DP2_A3654BarCosPD[0]);
            }
            if ( DecimalUtil.compareTo(Z3658BarCosPA, T00DP2_A3658BarCosPA[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCosPA");
               GXutil.writeLogRaw("Old: ",Z3658BarCosPA);
               GXutil.writeLogRaw("Current: ",T00DP2_A3658BarCosPA[0]);
            }
            if ( DecimalUtil.compareTo(Z3656BarCosAD, T00DP2_A3656BarCosAD[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCosAD");
               GXutil.writeLogRaw("Old: ",Z3656BarCosAD);
               GXutil.writeLogRaw("Current: ",T00DP2_A3656BarCosAD[0]);
            }
            if ( DecimalUtil.compareTo(Z3657BarCosAA, T00DP2_A3657BarCosAA[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCosAA");
               GXutil.writeLogRaw("Old: ",Z3657BarCosAA);
               GXutil.writeLogRaw("Current: ",T00DP2_A3657BarCosAA[0]);
            }
            if ( DecimalUtil.compareTo(Z3705BarCosCol, T00DP2_A3705BarCosCol[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCosCol");
               GXutil.writeLogRaw("Old: ",Z3705BarCosCol);
               GXutil.writeLogRaw("Current: ",T00DP2_A3705BarCosCol[0]);
            }
            if ( DecimalUtil.compareTo(Z3706BarCosAnc, T00DP2_A3706BarCosAnc[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCosAnc");
               GXutil.writeLogRaw("Old: ",Z3706BarCosAnc);
               GXutil.writeLogRaw("Current: ",T00DP2_A3706BarCosAnc[0]);
            }
            if ( Z4923BarNumActx != T00DP2_A4923BarNumActx[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarNumActx");
               GXutil.writeLogRaw("Old: ",Z4923BarNumActx);
               GXutil.writeLogRaw("Current: ",T00DP2_A4923BarNumActx[0]);
            }
            if ( Z4924BarNumPda != T00DP2_A4924BarNumPda[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarNumPda");
               GXutil.writeLogRaw("Old: ",Z4924BarNumPda);
               GXutil.writeLogRaw("Current: ",T00DP2_A4924BarNumPda[0]);
            }
            if ( GXutil.strcmp(Z4925BarFaseCod, T00DP2_A4925BarFaseCod[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarFaseCod");
               GXutil.writeLogRaw("Old: ",Z4925BarFaseCod);
               GXutil.writeLogRaw("Current: ",T00DP2_A4925BarFaseCod[0]);
            }
            if ( Z4926BarFaseOrd != T00DP2_A4926BarFaseOrd[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarFaseOrd");
               GXutil.writeLogRaw("Old: ",Z4926BarFaseOrd);
               GXutil.writeLogRaw("Current: ",T00DP2_A4926BarFaseOrd[0]);
            }
            if ( Z4977BarReoNum != T00DP2_A4977BarReoNum[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarReoNum");
               GXutil.writeLogRaw("Old: ",Z4977BarReoNum);
               GXutil.writeLogRaw("Current: ",T00DP2_A4977BarReoNum[0]);
            }
            if ( GXutil.strcmp(Z5169BarTipDTin, T00DP2_A5169BarTipDTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarTipDTin");
               GXutil.writeLogRaw("Old: ",Z5169BarTipDTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A5169BarTipDTin[0]);
            }
            if ( GXutil.strcmp(Z5170BarTipCTin, T00DP2_A5170BarTipCTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarTipCTin");
               GXutil.writeLogRaw("Old: ",Z5170BarTipCTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A5170BarTipCTin[0]);
            }
            if ( GXutil.strcmp(Z5171BarTipNTin, T00DP2_A5171BarTipNTin[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarTipNTin");
               GXutil.writeLogRaw("Old: ",Z5171BarTipNTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A5171BarTipNTin[0]);
            }
            if ( DecimalUtil.compareTo(Z5899BarCosttTi, T00DP2_A5899BarCosttTi[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCosttTi");
               GXutil.writeLogRaw("Old: ",Z5899BarCosttTi);
               GXutil.writeLogRaw("Current: ",T00DP2_A5899BarCosttTi[0]);
            }
            if ( Z5900BarRbTeo != T00DP2_A5900BarRbTeo[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarRbTeo");
               GXutil.writeLogRaw("Old: ",Z5900BarRbTeo);
               GXutil.writeLogRaw("Current: ",T00DP2_A5900BarRbTeo[0]);
            }
            if ( Z6177BarNumTin != T00DP2_A6177BarNumTin[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarNumTin");
               GXutil.writeLogRaw("Old: ",Z6177BarNumTin);
               GXutil.writeLogRaw("Current: ",T00DP2_A6177BarNumTin[0]);
            }
            if ( Z6431BarCausa != T00DP2_A6431BarCausa[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarCausa");
               GXutil.writeLogRaw("Old: ",Z6431BarCausa);
               GXutil.writeLogRaw("Current: ",T00DP2_A6431BarCausa[0]);
            }
            if ( GXutil.strcmp(Z6634BarRecAcb, T00DP2_A6634BarRecAcb[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarRecAcb");
               GXutil.writeLogRaw("Old: ",Z6634BarRecAcb);
               GXutil.writeLogRaw("Current: ",T00DP2_A6634BarRecAcb[0]);
            }
            if ( DecimalUtil.compareTo(Z8563BarKgsTt, T00DP2_A8563BarKgsTt[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarKgsTt");
               GXutil.writeLogRaw("Old: ",Z8563BarKgsTt);
               GXutil.writeLogRaw("Current: ",T00DP2_A8563BarKgsTt[0]);
            }
            if ( Z8584FamCodT != T00DP2_A8584FamCodT[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"FamCodT");
               GXutil.writeLogRaw("Old: ",Z8584FamCodT);
               GXutil.writeLogRaw("Current: ",T00DP2_A8584FamCodT[0]);
            }
            if ( Z8609BarForNum != T00DP2_A8609BarForNum[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarForNum");
               GXutil.writeLogRaw("Old: ",Z8609BarForNum);
               GXutil.writeLogRaw("Current: ",T00DP2_A8609BarForNum[0]);
            }
            if ( Z9754BarNTint != T00DP2_A9754BarNTint[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarNTint");
               GXutil.writeLogRaw("Old: ",Z9754BarNTint);
               GXutil.writeLogRaw("Current: ",T00DP2_A9754BarNTint[0]);
            }
            if ( GXutil.strcmp(Z10539BarAcs, T00DP2_A10539BarAcs[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarAcs");
               GXutil.writeLogRaw("Old: ",Z10539BarAcs);
               GXutil.writeLogRaw("Current: ",T00DP2_A10539BarAcs[0]);
            }
            if ( GXutil.strcmp(Z10540BarNprg, T00DP2_A10540BarNprg[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarNprg");
               GXutil.writeLogRaw("Old: ",Z10540BarNprg);
               GXutil.writeLogRaw("Current: ",T00DP2_A10540BarNprg[0]);
            }
            if ( Z10541BarLts != T00DP2_A10541BarLts[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarLts");
               GXutil.writeLogRaw("Old: ",Z10541BarLts);
               GXutil.writeLogRaw("Current: ",T00DP2_A10541BarLts[0]);
            }
            if ( DecimalUtil.compareTo(Z10546BarLtsV, T00DP2_A10546BarLtsV[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarLtsV");
               GXutil.writeLogRaw("Old: ",Z10546BarLtsV);
               GXutil.writeLogRaw("Current: ",T00DP2_A10546BarLtsV[0]);
            }
            if ( !( GXutil.dateCompare(Z11177BarFecIt, T00DP2_A11177BarFecIt[0]) ) )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarFecIt");
               GXutil.writeLogRaw("Old: ",Z11177BarFecIt);
               GXutil.writeLogRaw("Current: ",T00DP2_A11177BarFecIt[0]);
            }
            if ( !( GXutil.dateCompare(Z11178BarFecFt, T00DP2_A11178BarFecFt[0]) ) )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarFecFt");
               GXutil.writeLogRaw("Old: ",Z11178BarFecFt);
               GXutil.writeLogRaw("Current: ",T00DP2_A11178BarFecFt[0]);
            }
            if ( GXutil.strcmp(Z11179BarColNm, T00DP2_A11179BarColNm[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarColNm");
               GXutil.writeLogRaw("Old: ",Z11179BarColNm);
               GXutil.writeLogRaw("Current: ",T00DP2_A11179BarColNm[0]);
            }
            if ( GXutil.strcmp(Z11762BarDispCli, T00DP2_A11762BarDispCli[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarDispCli");
               GXutil.writeLogRaw("Old: ",Z11762BarDispCli);
               GXutil.writeLogRaw("Current: ",T00DP2_A11762BarDispCli[0]);
            }
            if ( DecimalUtil.compareTo(Z12993BarMtsTt, T00DP2_A12993BarMtsTt[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"BarMtsTt");
               GXutil.writeLogRaw("Old: ",Z12993BarMtsTt);
               GXutil.writeLogRaw("Current: ",T00DP2_A12993BarMtsTt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13759EstFecCier), GXutil.resetTime(T00DP2_A13759EstFecCier[0])) ) )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"EstFecCier");
               GXutil.writeLogRaw("Old: ",Z13759EstFecCier);
               GXutil.writeLogRaw("Current: ",T00DP2_A13759EstFecCier[0]);
            }
            if ( Z13760EstCdn1 != T00DP2_A13760EstCdn1[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"EstCdn1");
               GXutil.writeLogRaw("Old: ",Z13760EstCdn1);
               GXutil.writeLogRaw("Current: ",T00DP2_A13760EstCdn1[0]);
            }
            if ( GXutil.strcmp(Z13761EstCdn2, T00DP2_A13761EstCdn2[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"EstCdn2");
               GXutil.writeLogRaw("Old: ",Z13761EstCdn2);
               GXutil.writeLogRaw("Current: ",T00DP2_A13761EstCdn2[0]);
            }
            if ( GXutil.strcmp(Z13762EstCtw, T00DP2_A13762EstCtw[0]) != 0 )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"EstCtw");
               GXutil.writeLogRaw("Old: ",Z13762EstCtw);
               GXutil.writeLogRaw("Current: ",T00DP2_A13762EstCtw[0]);
            }
            if ( Z252CliCod != T00DP2_A252CliCod[0] )
            {
               GXutil.writeLogln("tcontin:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00DP2_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLCONTI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertDP510( )
   {
      beforeValidateDP510( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDP510( ) ;
      }
      if ( AnyError == 0 )
      {
         zmDP510( 0) ;
         checkOptimisticConcurrencyDP510( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmDP510( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertDP510( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00DP22 */
                  pr_default.execute(20, new Object[] {Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), Boolean.valueOf(n1933BarCodTin), Integer.valueOf(A1933BarCodTin), Boolean.valueOf(n1934BarReoTin), Byte.valueOf(A1934BarReoTin), Boolean.valueOf(n1935BarParTin), A1935BarParTin, Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1937BarDscTin), A1937BarDscTin, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin), Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT), Boolean.valueOf(n1943BarNomClT), A1943BarNomClT, Boolean.valueOf(n1944BarNumClT), Integer.valueOf(A1944BarNumClT), Boolean.valueOf(n1945BarMaqTin), A1945BarMaqTin, Boolean.valueOf(n1946BarVolTin), Integer.valueOf(A1946BarVolTin), Boolean.valueOf(n1947BarKgmTin), A1947BarKgmTin, Boolean.valueOf(n1948BarMtrTin), A1948BarMtrTin, Boolean.valueOf(n1949BarPieTin), Integer.valueOf(A1949BarPieTin), Boolean.valueOf(n2304BarEstTin), Byte.valueOf(A2304BarEstTin), Boolean.valueOf(n2316BarAgrLot), A2316BarAgrLot, Boolean.valueOf(n3650BarNumAna), Short.valueOf(A3650BarNumAna), Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef), Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens), Boolean.valueOf(n3653BarPriCod), A3653BarPriCod, Boolean.valueOf(n3654BarCosPD), A3654BarCosPD, Boolean.valueOf(n3658BarCosPA), A3658BarCosPA, Boolean.valueOf(n3656BarCosAD), A3656BarCosAD, Boolean.valueOf(n3657BarCosAA), A3657BarCosAA, Boolean.valueOf(n3705BarCosCol), A3705BarCosCol, Boolean.valueOf(n3706BarCosAnc), A3706BarCosAnc, Boolean.valueOf(n4923BarNumActx), Short.valueOf(A4923BarNumActx), Boolean.valueOf(n4924BarNumPda), Integer.valueOf(A4924BarNumPda), Boolean.valueOf(n4925BarFaseCod), A4925BarFaseCod, Boolean.valueOf(n4926BarFaseOrd), Short.valueOf(A4926BarFaseOrd), Boolean.valueOf(n4977BarReoNum), Short.valueOf(A4977BarReoNum), Boolean.valueOf(n5169BarTipDTin), A5169BarTipDTin, Boolean.valueOf(n5170BarTipCTin), A5170BarTipCTin, Boolean.valueOf(n5171BarTipNTin), A5171BarTipNTin, Boolean.valueOf(n5899BarCosttTi), A5899BarCosttTi, Boolean.valueOf(n5900BarRbTeo), Short.valueOf(A5900BarRbTeo), Boolean.valueOf(n6177BarNumTin), Integer.valueOf(A6177BarNumTin), Boolean.valueOf(n6431BarCausa), Short.valueOf(A6431BarCausa), Boolean.valueOf(n6634BarRecAcb), A6634BarRecAcb, Boolean.valueOf(n8563BarKgsTt), A8563BarKgsTt, Boolean.valueOf(n8584FamCodT), Short.valueOf(A8584FamCodT), Boolean.valueOf(n8609BarForNum), Integer.valueOf(A8609BarForNum), Boolean.valueOf(n9754BarNTint), Byte.valueOf(A9754BarNTint), Boolean.valueOf(n10539BarAcs), A10539BarAcs, Boolean.valueOf(n10540BarNprg), A10540BarNprg, Boolean.valueOf(n10541BarLts), Integer.valueOf(A10541BarLts), Boolean.valueOf(n10546BarLtsV), A10546BarLtsV, Boolean.valueOf(n11177BarFecIt), A11177BarFecIt, Boolean.valueOf(n11178BarFecFt), A11178BarFecFt, Boolean.valueOf(n11179BarColNm), A11179BarColNm, Boolean.valueOf(n11762BarDispCli), A11762BarDispCli, Boolean.valueOf(n12993BarMtsTt), A12993BarMtsTt, A13759EstFecCier, Short.valueOf(A13760EstCdn1), A13761EstCdn2, A13762EstCtw, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONTI");
                  if ( (pr_default.getStatus(20) == 1) )
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
            loadDP510( ) ;
         }
         endLevelDP510( ) ;
      }
      closeExtendedTableCursorsDP510( ) ;
   }

   public void updateDP510( )
   {
      beforeValidateDP510( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableDP510( ) ;
      }
      if ( ( nIsMod_510 != 0 ) || ( nIsDirty_510 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyDP510( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmDP510( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateDP510( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00DP23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n1933BarCodTin), Integer.valueOf(A1933BarCodTin), Boolean.valueOf(n1934BarReoTin), Byte.valueOf(A1934BarReoTin), Boolean.valueOf(n1935BarParTin), A1935BarParTin, Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1937BarDscTin), A1937BarDscTin, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin), Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT), Boolean.valueOf(n1943BarNomClT), A1943BarNomClT, Boolean.valueOf(n1944BarNumClT), Integer.valueOf(A1944BarNumClT), Boolean.valueOf(n1945BarMaqTin), A1945BarMaqTin, Boolean.valueOf(n1946BarVolTin), Integer.valueOf(A1946BarVolTin), Boolean.valueOf(n1947BarKgmTin), A1947BarKgmTin, Boolean.valueOf(n1948BarMtrTin), A1948BarMtrTin, Boolean.valueOf(n1949BarPieTin), Integer.valueOf(A1949BarPieTin), Boolean.valueOf(n2304BarEstTin), Byte.valueOf(A2304BarEstTin), Boolean.valueOf(n2316BarAgrLot), A2316BarAgrLot, Boolean.valueOf(n3650BarNumAna), Short.valueOf(A3650BarNumAna), Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef), Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens), Boolean.valueOf(n3653BarPriCod), A3653BarPriCod, Boolean.valueOf(n3654BarCosPD), A3654BarCosPD, Boolean.valueOf(n3658BarCosPA), A3658BarCosPA, Boolean.valueOf(n3656BarCosAD), A3656BarCosAD, Boolean.valueOf(n3657BarCosAA), A3657BarCosAA, Boolean.valueOf(n3705BarCosCol), A3705BarCosCol, Boolean.valueOf(n3706BarCosAnc), A3706BarCosAnc, Boolean.valueOf(n4923BarNumActx), Short.valueOf(A4923BarNumActx), Boolean.valueOf(n4924BarNumPda), Integer.valueOf(A4924BarNumPda), Boolean.valueOf(n4925BarFaseCod), A4925BarFaseCod, Boolean.valueOf(n4926BarFaseOrd), Short.valueOf(A4926BarFaseOrd), Boolean.valueOf(n4977BarReoNum), Short.valueOf(A4977BarReoNum), Boolean.valueOf(n5169BarTipDTin), A5169BarTipDTin, Boolean.valueOf(n5170BarTipCTin), A5170BarTipCTin, Boolean.valueOf(n5171BarTipNTin), A5171BarTipNTin, Boolean.valueOf(n5899BarCosttTi), A5899BarCosttTi, Boolean.valueOf(n5900BarRbTeo), Short.valueOf(A5900BarRbTeo), Boolean.valueOf(n6177BarNumTin), Integer.valueOf(A6177BarNumTin), Boolean.valueOf(n6431BarCausa), Short.valueOf(A6431BarCausa), Boolean.valueOf(n6634BarRecAcb), A6634BarRecAcb, Boolean.valueOf(n8563BarKgsTt), A8563BarKgsTt, Boolean.valueOf(n8584FamCodT), Short.valueOf(A8584FamCodT), Boolean.valueOf(n8609BarForNum), Integer.valueOf(A8609BarForNum), Boolean.valueOf(n9754BarNTint), Byte.valueOf(A9754BarNTint), Boolean.valueOf(n10539BarAcs), A10539BarAcs, Boolean.valueOf(n10540BarNprg), A10540BarNprg, Boolean.valueOf(n10541BarLts), Integer.valueOf(A10541BarLts), Boolean.valueOf(n10546BarLtsV), A10546BarLtsV, Boolean.valueOf(n11177BarFecIt), A11177BarFecIt, Boolean.valueOf(n11178BarFecFt), A11178BarFecFt, Boolean.valueOf(n11179BarColNm), A11179BarColNm, Boolean.valueOf(n11762BarDispCli), A11762BarDispCli, Boolean.valueOf(n12993BarMtsTt), A12993BarMtsTt, A13759EstFecCier, Short.valueOf(A13760EstCdn1), A13761EstCdn2, A13762EstCtw, Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONTI");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCONTI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateDP510( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyDP510( ) ;
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
            endLevelDP510( ) ;
         }
      }
      closeExtendedTableCursorsDP510( ) ;
   }

   public void deferredUpdateDP510( )
   {
   }

   public void deleteDP510( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateDP510( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyDP510( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsDP510( ) ;
         afterConfirmDP510( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteDP510( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00DP24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONTI");
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
      sMode510 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelDP510( ) ;
      Gx_mode = sMode510 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsDP510( )
   {
      standaloneModalDP510( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00DP25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void endLevelDP510( )
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

   public void scanStartDP510( )
   {
      /* Scan By routine */
      /* Using cursor T00DP26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
      RcdFound510 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound510 = (short)(1) ;
         A1929EstTinNr = T00DP26_A1929EstTinNr[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextDP510( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound510 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound510 = (short)(1) ;
         A1929EstTinNr = T00DP26_A1929EstTinNr[0] ;
      }
   }

   public void scanEndDP510( )
   {
      pr_default.close(24);
   }

   public void afterConfirmDP510( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertDP510( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateDP510( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteDP510( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteDP510( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateDP510( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesDP510( )
   {
      edtEstTinNr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCodTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarReoTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarReoTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReoTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarParTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarSerTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDscTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDscTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDscTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarArtTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarArtTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarArtTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarColNoT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNoT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNoT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarColNuT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNuT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNuT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarTipCoT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCoT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCoT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarNomClT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomClT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomClT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarNumClT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumClT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumClT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarMaqTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarVolTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarKgmTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgmTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgmTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarMtrTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtrTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtrTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarPieTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarEstTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEstTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarAgrLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrLot_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarNumAna_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumAna_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumAna_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarTipDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDef_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarIntens_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarIntens_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarIntens_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarPriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPriCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCosPD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosPD_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCosPA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosPA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCosAD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosAD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAD_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCosAA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosAA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCosCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosCol_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCosAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAnc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarNumActx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumActx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumActx_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarNumPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumPda_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarFaseCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFaseCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFaseCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarFaseOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFaseOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFaseOrd_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarReoNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarReoNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReoNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarTipDTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarTipCTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarTipNTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipNTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipNTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCosttTi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosttTi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosttTi_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarRbTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRbTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRbTeo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarNumTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarCausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCausa_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarRecAcb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRecAcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRecAcb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarKgsTt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgsTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsTt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFamCodT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFamCodT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFamCodT_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarForNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarForNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarForNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarNTint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNTint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNTint_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarAcs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarNprg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNprg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNprg_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarLts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarLts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLts_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarLtsV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarLtsV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLtsV_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarFecIt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecIt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecIt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarFecFt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecFt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecFt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarColNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNm_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarDispCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDispCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDispCli_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtBarMtsTt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtsTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtsTt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashesDP510( )
   {
   }

   public void send_integrity_lvl_hashesDP509( )
   {
   }

   public void subsflControlProps_50510( )
   {
      edtavnRcdDeleted_510_Internalname = "vNRCDDELETED_510_"+sGXsfl_50_idx ;
      edtEstTinNr_Internalname = "ESTTINNR_"+sGXsfl_50_idx ;
      edtBarCodTin_Internalname = "BARCODTIN_"+sGXsfl_50_idx ;
      edtBarReoTin_Internalname = "BARREOTIN_"+sGXsfl_50_idx ;
      edtBarParTin_Internalname = "BARPARTIN_"+sGXsfl_50_idx ;
      edtBarSerTin_Internalname = "BARSERTIN_"+sGXsfl_50_idx ;
      edtBarDscTin_Internalname = "BARDSCTIN_"+sGXsfl_50_idx ;
      edtBarArtTin_Internalname = "BARARTTIN_"+sGXsfl_50_idx ;
      edtBarColNoT_Internalname = "BARCOLNOT_"+sGXsfl_50_idx ;
      edtBarColNuT_Internalname = "BARCOLNUT_"+sGXsfl_50_idx ;
      edtBarTipCoT_Internalname = "BARTIPCOT_"+sGXsfl_50_idx ;
      edtBarNomClT_Internalname = "BARNOMCLT_"+sGXsfl_50_idx ;
      edtBarNumClT_Internalname = "BARNUMCLT_"+sGXsfl_50_idx ;
      edtBarMaqTin_Internalname = "BARMAQTIN_"+sGXsfl_50_idx ;
      edtBarVolTin_Internalname = "BARVOLTIN_"+sGXsfl_50_idx ;
      edtBarKgmTin_Internalname = "BARKGMTIN_"+sGXsfl_50_idx ;
      edtBarMtrTin_Internalname = "BARMTRTIN_"+sGXsfl_50_idx ;
      edtBarPieTin_Internalname = "BARPIETIN_"+sGXsfl_50_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_50_idx ;
      edtBarEstTin_Internalname = "BARESTTIN_"+sGXsfl_50_idx ;
      edtBarAgrLot_Internalname = "BARAGRLOT_"+sGXsfl_50_idx ;
      edtBarNumAna_Internalname = "BARNUMANA_"+sGXsfl_50_idx ;
      edtBarTipDef_Internalname = "BARTIPDEF_"+sGXsfl_50_idx ;
      edtBarIntens_Internalname = "BARINTENS_"+sGXsfl_50_idx ;
      edtBarPriCod_Internalname = "BARPRICOD_"+sGXsfl_50_idx ;
      edtBarCosPD_Internalname = "BARCOSPD_"+sGXsfl_50_idx ;
      edtBarCosPA_Internalname = "BARCOSPA_"+sGXsfl_50_idx ;
      edtBarCosAD_Internalname = "BARCOSAD_"+sGXsfl_50_idx ;
      edtBarCosAA_Internalname = "BARCOSAA_"+sGXsfl_50_idx ;
      edtBarCosCol_Internalname = "BARCOSCOL_"+sGXsfl_50_idx ;
      edtBarCosAnc_Internalname = "BARCOSANC_"+sGXsfl_50_idx ;
      edtBarNumActx_Internalname = "BARNUMACTX_"+sGXsfl_50_idx ;
      edtBarNumPda_Internalname = "BARNUMPDA_"+sGXsfl_50_idx ;
      edtBarFaseCod_Internalname = "BARFASECOD_"+sGXsfl_50_idx ;
      edtBarFaseOrd_Internalname = "BARFASEORD_"+sGXsfl_50_idx ;
      edtBarReoNum_Internalname = "BARREONUM_"+sGXsfl_50_idx ;
      edtBarTipDTin_Internalname = "BARTIPDTIN_"+sGXsfl_50_idx ;
      edtBarTipCTin_Internalname = "BARTIPCTIN_"+sGXsfl_50_idx ;
      edtBarTipNTin_Internalname = "BARTIPNTIN_"+sGXsfl_50_idx ;
      edtBarCosttTi_Internalname = "BARCOSTTTI_"+sGXsfl_50_idx ;
      edtBarRbTeo_Internalname = "BARRBTEO_"+sGXsfl_50_idx ;
      edtBarNumTin_Internalname = "BARNUMTIN_"+sGXsfl_50_idx ;
      edtBarCausa_Internalname = "BARCAUSA_"+sGXsfl_50_idx ;
      edtBarRecAcb_Internalname = "BARRECACB_"+sGXsfl_50_idx ;
      edtBarKgsTt_Internalname = "BARKGSTT_"+sGXsfl_50_idx ;
      edtFamCodT_Internalname = "FAMCODT_"+sGXsfl_50_idx ;
      edtBarForNum_Internalname = "BARFORNUM_"+sGXsfl_50_idx ;
      edtBarNTint_Internalname = "BARNTINT_"+sGXsfl_50_idx ;
      edtBarAcs_Internalname = "BARACS_"+sGXsfl_50_idx ;
      edtBarNprg_Internalname = "BARNPRG_"+sGXsfl_50_idx ;
      edtBarLts_Internalname = "BARLTS_"+sGXsfl_50_idx ;
      edtBarLtsV_Internalname = "BARLTSV_"+sGXsfl_50_idx ;
      edtBarFecIt_Internalname = "BARFECIT_"+sGXsfl_50_idx ;
      edtBarFecFt_Internalname = "BARFECFT_"+sGXsfl_50_idx ;
      edtBarColNm_Internalname = "BARCOLNM_"+sGXsfl_50_idx ;
      edtBarDispCli_Internalname = "BARDISPCLI_"+sGXsfl_50_idx ;
      edtBarMtsTt_Internalname = "BARMTSTT_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_50510( )
   {
      edtavnRcdDeleted_510_Internalname = "vNRCDDELETED_510_"+sGXsfl_50_fel_idx ;
      edtEstTinNr_Internalname = "ESTTINNR_"+sGXsfl_50_fel_idx ;
      edtBarCodTin_Internalname = "BARCODTIN_"+sGXsfl_50_fel_idx ;
      edtBarReoTin_Internalname = "BARREOTIN_"+sGXsfl_50_fel_idx ;
      edtBarParTin_Internalname = "BARPARTIN_"+sGXsfl_50_fel_idx ;
      edtBarSerTin_Internalname = "BARSERTIN_"+sGXsfl_50_fel_idx ;
      edtBarDscTin_Internalname = "BARDSCTIN_"+sGXsfl_50_fel_idx ;
      edtBarArtTin_Internalname = "BARARTTIN_"+sGXsfl_50_fel_idx ;
      edtBarColNoT_Internalname = "BARCOLNOT_"+sGXsfl_50_fel_idx ;
      edtBarColNuT_Internalname = "BARCOLNUT_"+sGXsfl_50_fel_idx ;
      edtBarTipCoT_Internalname = "BARTIPCOT_"+sGXsfl_50_fel_idx ;
      edtBarNomClT_Internalname = "BARNOMCLT_"+sGXsfl_50_fel_idx ;
      edtBarNumClT_Internalname = "BARNUMCLT_"+sGXsfl_50_fel_idx ;
      edtBarMaqTin_Internalname = "BARMAQTIN_"+sGXsfl_50_fel_idx ;
      edtBarVolTin_Internalname = "BARVOLTIN_"+sGXsfl_50_fel_idx ;
      edtBarKgmTin_Internalname = "BARKGMTIN_"+sGXsfl_50_fel_idx ;
      edtBarMtrTin_Internalname = "BARMTRTIN_"+sGXsfl_50_fel_idx ;
      edtBarPieTin_Internalname = "BARPIETIN_"+sGXsfl_50_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_50_fel_idx ;
      edtBarEstTin_Internalname = "BARESTTIN_"+sGXsfl_50_fel_idx ;
      edtBarAgrLot_Internalname = "BARAGRLOT_"+sGXsfl_50_fel_idx ;
      edtBarNumAna_Internalname = "BARNUMANA_"+sGXsfl_50_fel_idx ;
      edtBarTipDef_Internalname = "BARTIPDEF_"+sGXsfl_50_fel_idx ;
      edtBarIntens_Internalname = "BARINTENS_"+sGXsfl_50_fel_idx ;
      edtBarPriCod_Internalname = "BARPRICOD_"+sGXsfl_50_fel_idx ;
      edtBarCosPD_Internalname = "BARCOSPD_"+sGXsfl_50_fel_idx ;
      edtBarCosPA_Internalname = "BARCOSPA_"+sGXsfl_50_fel_idx ;
      edtBarCosAD_Internalname = "BARCOSAD_"+sGXsfl_50_fel_idx ;
      edtBarCosAA_Internalname = "BARCOSAA_"+sGXsfl_50_fel_idx ;
      edtBarCosCol_Internalname = "BARCOSCOL_"+sGXsfl_50_fel_idx ;
      edtBarCosAnc_Internalname = "BARCOSANC_"+sGXsfl_50_fel_idx ;
      edtBarNumActx_Internalname = "BARNUMACTX_"+sGXsfl_50_fel_idx ;
      edtBarNumPda_Internalname = "BARNUMPDA_"+sGXsfl_50_fel_idx ;
      edtBarFaseCod_Internalname = "BARFASECOD_"+sGXsfl_50_fel_idx ;
      edtBarFaseOrd_Internalname = "BARFASEORD_"+sGXsfl_50_fel_idx ;
      edtBarReoNum_Internalname = "BARREONUM_"+sGXsfl_50_fel_idx ;
      edtBarTipDTin_Internalname = "BARTIPDTIN_"+sGXsfl_50_fel_idx ;
      edtBarTipCTin_Internalname = "BARTIPCTIN_"+sGXsfl_50_fel_idx ;
      edtBarTipNTin_Internalname = "BARTIPNTIN_"+sGXsfl_50_fel_idx ;
      edtBarCosttTi_Internalname = "BARCOSTTTI_"+sGXsfl_50_fel_idx ;
      edtBarRbTeo_Internalname = "BARRBTEO_"+sGXsfl_50_fel_idx ;
      edtBarNumTin_Internalname = "BARNUMTIN_"+sGXsfl_50_fel_idx ;
      edtBarCausa_Internalname = "BARCAUSA_"+sGXsfl_50_fel_idx ;
      edtBarRecAcb_Internalname = "BARRECACB_"+sGXsfl_50_fel_idx ;
      edtBarKgsTt_Internalname = "BARKGSTT_"+sGXsfl_50_fel_idx ;
      edtFamCodT_Internalname = "FAMCODT_"+sGXsfl_50_fel_idx ;
      edtBarForNum_Internalname = "BARFORNUM_"+sGXsfl_50_fel_idx ;
      edtBarNTint_Internalname = "BARNTINT_"+sGXsfl_50_fel_idx ;
      edtBarAcs_Internalname = "BARACS_"+sGXsfl_50_fel_idx ;
      edtBarNprg_Internalname = "BARNPRG_"+sGXsfl_50_fel_idx ;
      edtBarLts_Internalname = "BARLTS_"+sGXsfl_50_fel_idx ;
      edtBarLtsV_Internalname = "BARLTSV_"+sGXsfl_50_fel_idx ;
      edtBarFecIt_Internalname = "BARFECIT_"+sGXsfl_50_fel_idx ;
      edtBarFecFt_Internalname = "BARFECFT_"+sGXsfl_50_fel_idx ;
      edtBarColNm_Internalname = "BARCOLNM_"+sGXsfl_50_fel_idx ;
      edtBarDispCli_Internalname = "BARDISPCLI_"+sGXsfl_50_fel_idx ;
      edtBarMtsTt_Internalname = "BARMTSTT_"+sGXsfl_50_fel_idx ;
   }

   public void addRowDP510( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50510( ) ;
      sendRowDP510( ) ;
   }

   public void sendRowDP510( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_510_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_510_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_510), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_510), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_510_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_510_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstTinNr_Internalname,GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1929EstTinNr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstTinNr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstTinNr_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCodTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1933BarCodTin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1933BarCodTin), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCodTin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarReoTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarReoTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1934BarReoTin), "9") : localUtil.format( DecimalUtil.doubleToDec(A1934BarReoTin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarReoTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarReoTin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarParTin_Internalname,GXutil.rtrim( A1935BarParTin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarParTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarParTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerTin_Internalname,GXutil.rtrim( A1936BarSerTin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarSerTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDscTin_Internalname,GXutil.rtrim( A1937BarDscTin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDscTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDscTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarArtTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarArtTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1939BarArtTin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1939BarArtTin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarArtTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarArtTin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNoT_Internalname,GXutil.rtrim( A1940BarColNoT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNoT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNoT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNuT_Internalname,GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarColNuT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1941BarColNuT), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1941BarColNuT), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNuT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNuT_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCoT_Internalname,GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTipCoT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1942BarTipCoT), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1942BarTipCoT), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCoT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTipCoT_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomClT_Internalname,GXutil.rtrim( A1943BarNomClT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomClT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNomClT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumClT_Internalname,GXutil.ltrim( localUtil.ntoc( A1944BarNumClT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNumClT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1944BarNumClT), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1944BarNumClT), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumClT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNumClT_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMaqTin_Internalname,GXutil.rtrim( A1945BarMaqTin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMaqTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarMaqTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarVolTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarVolTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1946BarVolTin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1946BarVolTin), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarVolTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarVolTin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgmTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKgmTin_Enabled!=0) ? localUtil.format( A1947BarKgmTin, "ZZZZZ9.99") : localUtil.format( A1947BarKgmTin, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgmTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarKgmTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtrTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarMtrTin_Enabled!=0) ? localUtil.format( A1948BarMtrTin, "ZZZZZ9.99") : localUtil.format( A1948BarMtrTin, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtrTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarMtrTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1949BarPieTin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1949BarPieTin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1949BarPieTin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieTin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEstTin_Internalname,GXutil.ltrim( localUtil.ntoc( A2304BarEstTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarEstTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2304BarEstTin), "9") : localUtil.format( DecimalUtil.doubleToDec(A2304BarEstTin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEstTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEstTin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrLot_Internalname,GXutil.rtrim( A2316BarAgrLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAgrLot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumAna_Internalname,GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNumAna_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3650BarNumAna), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3650BarNumAna), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumAna_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNumAna_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipDef_Internalname,GXutil.ltrim( localUtil.ntoc( A3651BarTipDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTipDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3651BarTipDef), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3651BarTipDef), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTipDef_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarIntens_Internalname,GXutil.ltrim( localUtil.ntoc( A3652BarIntens, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarIntens_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3652BarIntens), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3652BarIntens), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarIntens_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarIntens_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPriCod_Internalname,GXutil.rtrim( A3653BarPriCod),GXutil.rtrim( localUtil.format( A3653BarPriCod, "9")),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPriCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPriCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCosPD_Internalname,GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCosPD_Enabled!=0) ? localUtil.format( A3654BarCosPD, "ZZZZZZ9.99") : localUtil.format( A3654BarCosPD, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCosPD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCosPD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCosPA_Internalname,GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCosPA_Enabled!=0) ? localUtil.format( A3658BarCosPA, "ZZZZZZ9.99") : localUtil.format( A3658BarCosPA, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCosPA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCosPA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCosAD_Internalname,GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCosAD_Enabled!=0) ? localUtil.format( A3656BarCosAD, "ZZZZZZ9.99") : localUtil.format( A3656BarCosAD, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCosAD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCosAD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCosAA_Internalname,GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCosAA_Enabled!=0) ? localUtil.format( A3657BarCosAA, "ZZZZZZ9.99") : localUtil.format( A3657BarCosAA, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCosAA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCosAA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCosCol_Internalname,GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCosCol_Enabled!=0) ? localUtil.format( A3705BarCosCol, "ZZZZZZ9.99") : localUtil.format( A3705BarCosCol, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCosCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCosCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCosAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCosAnc_Enabled!=0) ? localUtil.format( A3706BarCosAnc, "ZZZZZZ9.99") : localUtil.format( A3706BarCosAnc, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCosAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCosAnc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumActx_Internalname,GXutil.ltrim( localUtil.ntoc( A4923BarNumActx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNumActx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4923BarNumActx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4923BarNumActx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumActx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNumActx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumPda_Internalname,GXutil.ltrim( localUtil.ntoc( A4924BarNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNumPda_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4924BarNumPda), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4924BarNumPda), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumPda_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNumPda_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFaseCod_Internalname,GXutil.rtrim( A4925BarFaseCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFaseCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFaseCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFaseOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFaseOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4926BarFaseOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4926BarFaseOrd), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFaseOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFaseOrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarReoNum_Internalname,GXutil.ltrim( localUtil.ntoc( A4977BarReoNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarReoNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4977BarReoNum), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4977BarReoNum), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarReoNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarReoNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipDTin_Internalname,GXutil.rtrim( A5169BarTipDTin),GXutil.rtrim( localUtil.format( A5169BarTipDTin, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipDTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTipDTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCTin_Internalname,GXutil.rtrim( A5170BarTipCTin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTipCTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipNTin_Internalname,GXutil.rtrim( A5171BarTipNTin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipNTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTipNTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCosttTi_Internalname,GXutil.ltrim( localUtil.ntoc( A5899BarCosttTi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCosttTi_Enabled!=0) ? localUtil.format( A5899BarCosttTi, "ZZZZ9.99999") : localUtil.format( A5899BarCosttTi, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCosttTi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCosttTi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarRbTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A5900BarRbTeo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarRbTeo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5900BarRbTeo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5900BarRbTeo), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarRbTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarRbTeo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumTin_Internalname,GXutil.ltrim( localUtil.ntoc( A6177BarNumTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNumTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6177BarNumTin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6177BarNumTin), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNumTin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCausa_Internalname,GXutil.ltrim( localUtil.ntoc( A6431BarCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarCausa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6431BarCausa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6431BarCausa), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarCausa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarRecAcb_Internalname,GXutil.rtrim( A6634BarRecAcb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarRecAcb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarRecAcb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgsTt_Internalname,GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKgsTt_Enabled!=0) ? localUtil.format( A8563BarKgsTt, "ZZZZZZ9.99") : localUtil.format( A8563BarKgsTt, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgsTt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarKgsTt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFamCodT_Internalname,GXutil.ltrim( localUtil.ntoc( A8584FamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFamCodT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8584FamCodT), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8584FamCodT), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFamCodT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFamCodT_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarForNum_Internalname,GXutil.ltrim( localUtil.ntoc( A8609BarForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarForNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8609BarForNum), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8609BarForNum), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarForNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarForNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNTint_Internalname,GXutil.ltrim( localUtil.ntoc( A9754BarNTint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNTint_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9754BarNTint), "9") : localUtil.format( DecimalUtil.doubleToDec(A9754BarNTint), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNTint_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNTint_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAcs_Internalname,GXutil.rtrim( A10539BarAcs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAcs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAcs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNprg_Internalname,GXutil.rtrim( A10540BarNprg),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNprg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNprg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarLts_Internalname,GXutil.ltrim( localUtil.ntoc( A10541BarLts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarLts_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10541BarLts), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10541BarLts), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarLts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarLts_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarLtsV_Internalname,GXutil.ltrim( localUtil.ntoc( A10546BarLtsV, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarLtsV_Enabled!=0) ? localUtil.format( A10546BarLtsV, "ZZZZZZ9.99") : localUtil.format( A10546BarLtsV, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarLtsV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarLtsV_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecIt_Internalname,localUtil.ttoc( A11177BarFecIt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11177BarFecIt, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecIt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecIt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFt_Internalname,localUtil.ttoc( A11178BarFecFt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11178BarFecFt, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecFt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNm_Internalname,GXutil.rtrim( A11179BarColNm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarColNm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDispCli_Internalname,GXutil.rtrim( A11762BarDispCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDispCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarDispCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_510_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtsTt_Internalname,GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarMtsTt_Enabled!=0) ? localUtil.format( A12993BarMtsTt, "ZZZZZZ9.99") : localUtil.format( A12993BarMtsTt, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtsTt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarMtsTt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesDP510( ) ;
      GXCCtl = "Z1929EstTinNr_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1933BarCodTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1934BarReoTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1935BarParTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1935BarParTin));
      GXCCtl = "Z1936BarSerTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1936BarSerTin));
      GXCCtl = "Z1937BarDscTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1937BarDscTin));
      GXCCtl = "Z1939BarArtTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1940BarColNoT_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1940BarColNoT));
      GXCCtl = "Z1941BarColNuT_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1942BarTipCoT_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1943BarNomClT_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1943BarNomClT));
      GXCCtl = "Z1944BarNumClT_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1944BarNumClT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1945BarMaqTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1945BarMaqTin));
      GXCCtl = "Z1946BarVolTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1947BarKgmTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1948BarMtrTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1949BarPieTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1949BarPieTin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2304BarEstTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2304BarEstTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2316BarAgrLot_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2316BarAgrLot));
      GXCCtl = "Z3650BarNumAna_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3651BarTipDef_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3651BarTipDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3652BarIntens_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3652BarIntens, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3653BarPriCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3653BarPriCod));
      GXCCtl = "Z3654BarCosPD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3658BarCosPA_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3656BarCosAD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3657BarCosAA_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3705BarCosCol_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3706BarCosAnc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4923BarNumActx_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4923BarNumActx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4924BarNumPda_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4924BarNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4925BarFaseCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4925BarFaseCod));
      GXCCtl = "Z4926BarFaseOrd_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4977BarReoNum_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4977BarReoNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5169BarTipDTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5169BarTipDTin));
      GXCCtl = "Z5170BarTipCTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5170BarTipCTin));
      GXCCtl = "Z5171BarTipNTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5171BarTipNTin));
      GXCCtl = "Z5899BarCosttTi_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5899BarCosttTi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5900BarRbTeo_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5900BarRbTeo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6177BarNumTin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6177BarNumTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6431BarCausa_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6431BarCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6634BarRecAcb_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6634BarRecAcb));
      GXCCtl = "Z8563BarKgsTt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8584FamCodT_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8584FamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8609BarForNum_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8609BarForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9754BarNTint_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9754BarNTint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10539BarAcs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10539BarAcs));
      GXCCtl = "Z10540BarNprg_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10540BarNprg));
      GXCCtl = "Z10541BarLts_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10541BarLts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10546BarLtsV_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10546BarLtsV, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11177BarFecIt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z11177BarFecIt, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z11178BarFecFt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z11178BarFecFt, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z11179BarColNm_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11179BarColNm));
      GXCCtl = "Z11762BarDispCli_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11762BarDispCli));
      GXCCtl = "Z12993BarMtsTt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13759EstFecCier_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z13759EstFecCier, 0, "/"));
      GXCCtl = "Z13760EstCdn1_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13760EstCdn1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13761EstCdn2_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13761EstCdn2));
      GXCCtl = "Z13762EstCtw_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13762EstCtw));
      GXCCtl = "Z252CliCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_510_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_510_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_510_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_510, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_510_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_510_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTTINNR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstTinNr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARREOTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReoTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDSCTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDscTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARARTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarArtTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNoT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNuT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCoT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOMCLT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomClT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMCLT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumClT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMaqTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARVOLTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarVolTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGMTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgmTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTRTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMtrTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIETIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARESTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRLOT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMANA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumAna_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPDEF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARINTENS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarIntens_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPriCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSPD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosPD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSPA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosPA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSAD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSAA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSCOL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSANC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMACTX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumActx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMPDA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumPda_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASECOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFaseCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEORD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFaseOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARREONUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReoNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPDTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPNTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipNTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSTTTI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosttTi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRBTEO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarRbTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCAUSA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCausa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRECACB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarRecAcb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGSTT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgsTt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FAMCODT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFamCodT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFORNUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarForNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNTINT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNTint_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAcs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNPRG_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNprg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARLTS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARLTSV_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLtsV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECIT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecIt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECFT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecFt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISPCLI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDispCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTSTT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMtsTt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowDP510( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50510( ) ;
      edtavnRcdDeleted_510_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_510_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstTinNr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTTINNR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarReoTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARREOTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarParTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSerTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSERTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDscTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDSCTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarArtTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARARTTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNoT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNOT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNuT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNUT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipCoT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCOT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNomClT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNOMCLT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumClT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMCLT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMaqTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMAQTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarVolTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARVOLTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKgmTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGMTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMtrTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMTRTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIETIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEstTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARESTTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAgrLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAGRLOT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumAna_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMANA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPDEF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarIntens_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARINTENS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPriCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPRICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCosPD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSPD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCosPA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSPA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCosAD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSAD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCosAA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSAA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCosCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSCOL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCosAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSANC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumActx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMACTX_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumPda_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMPDA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFaseCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASECOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFaseOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEORD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarReoNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARREONUM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipDTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPDTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipCTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPCTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTipNTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIPNTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCosttTi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOSTTTI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarRbTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARRBTEO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCausa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCAUSA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarRecAcb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARRECACB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKgsTt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKGSTT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFamCodT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FAMCODT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarForNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFORNUM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNTint_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNTINT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAcs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARACS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNprg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNPRG_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarLts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARLTS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarLtsV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARLTSV_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecIt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECIT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecFt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECFT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarColNm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOLNM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDispCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDISPCLI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMtsTt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMTSTT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_510_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_510_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_510");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_510_Internalname ;
         wbErr = true ;
         nRcdDeleted_510 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_510 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_510_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ESTTINNR_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstTinNr_Internalname ;
         wbErr = true ;
         A1929EstTinNr = (short)(0) ;
      }
      else
      {
         A1929EstTinNr = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCODTIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodTin_Internalname ;
         wbErr = true ;
         A1933BarCodTin = 0 ;
         n1933BarCodTin = false ;
      }
      else
      {
         A1933BarCodTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1933BarCodTin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarReoTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarReoTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARREOTIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarReoTin_Internalname ;
         wbErr = true ;
         A1934BarReoTin = (byte)(0) ;
         n1934BarReoTin = false ;
      }
      else
      {
         A1934BarReoTin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarReoTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1934BarReoTin = false ;
      }
      A1935BarParTin = httpContext.cgiGet( edtBarParTin_Internalname) ;
      n1935BarParTin = false ;
      A1936BarSerTin = httpContext.cgiGet( edtBarSerTin_Internalname) ;
      n1936BarSerTin = false ;
      A1937BarDscTin = httpContext.cgiGet( edtBarDscTin_Internalname) ;
      n1937BarDscTin = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarArtTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarArtTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARARTTIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarArtTin_Internalname ;
         wbErr = true ;
         A1939BarArtTin = (short)(0) ;
         n1939BarArtTin = false ;
      }
      else
      {
         A1939BarArtTin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarArtTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1939BarArtTin = false ;
      }
      A1940BarColNoT = httpContext.cgiGet( edtBarColNoT_Internalname) ;
      n1940BarColNoT = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNuT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNuT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARCOLNUT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarColNuT_Internalname ;
         wbErr = true ;
         A1941BarColNuT = 0 ;
         n1941BarColNuT = false ;
      }
      else
      {
         A1941BarColNuT = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNuT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1941BarColNuT = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipCoT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipCoT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "BARTIPCOT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTipCoT_Internalname ;
         wbErr = true ;
         A1942BarTipCoT = (byte)(0) ;
         n1942BarTipCoT = false ;
      }
      else
      {
         A1942BarTipCoT = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCoT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1942BarTipCoT = false ;
      }
      A1943BarNomClT = httpContext.cgiGet( edtBarNomClT_Internalname) ;
      n1943BarNomClT = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumClT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumClT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARNUMCLT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarNumClT_Internalname ;
         wbErr = true ;
         A1944BarNumClT = 0 ;
         n1944BarNumClT = false ;
      }
      else
      {
         A1944BarNumClT = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumClT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1944BarNumClT = false ;
      }
      A1945BarMaqTin = httpContext.cgiGet( edtBarMaqTin_Internalname) ;
      n1945BarMaqTin = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarVolTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarVolTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "BARVOLTIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarVolTin_Internalname ;
         wbErr = true ;
         A1946BarVolTin = 0 ;
         n1946BarVolTin = false ;
      }
      else
      {
         A1946BarVolTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1946BarVolTin = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgmTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgmTin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARKGMTIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarKgmTin_Internalname ;
         wbErr = true ;
         A1947BarKgmTin = DecimalUtil.ZERO ;
         n1947BarKgmTin = false ;
      }
      else
      {
         A1947BarKgmTin = localUtil.ctond( httpContext.cgiGet( edtBarKgmTin_Internalname)) ;
         n1947BarKgmTin = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMtrTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMtrTin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARMTRTIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarMtrTin_Internalname ;
         wbErr = true ;
         A1948BarMtrTin = DecimalUtil.ZERO ;
         n1948BarMtrTin = false ;
      }
      else
      {
         A1948BarMtrTin = localUtil.ctond( httpContext.cgiGet( edtBarMtrTin_Internalname)) ;
         n1948BarMtrTin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARPIETIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieTin_Internalname ;
         wbErr = true ;
         A1949BarPieTin = 0 ;
         n1949BarPieTin = false ;
      }
      else
      {
         A1949BarPieTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1949BarPieTin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         wbErr = true ;
         A252CliCod = 0 ;
      }
      else
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEstTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEstTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARESTTIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarEstTin_Internalname ;
         wbErr = true ;
         A2304BarEstTin = (byte)(0) ;
         n2304BarEstTin = false ;
      }
      else
      {
         A2304BarEstTin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarEstTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2304BarEstTin = false ;
      }
      A2316BarAgrLot = httpContext.cgiGet( edtBarAgrLot_Internalname) ;
      n2316BarAgrLot = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumAna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumAna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "BARNUMANA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarNumAna_Internalname ;
         wbErr = true ;
         A3650BarNumAna = (short)(0) ;
         n3650BarNumAna = false ;
      }
      else
      {
         A3650BarNumAna = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumAna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3650BarNumAna = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARTIPDEF_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTipDef_Internalname ;
         wbErr = true ;
         A3651BarTipDef = (short)(0) ;
         n3651BarTipDef = false ;
      }
      else
      {
         A3651BarTipDef = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3651BarTipDef = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarIntens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarIntens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "BARINTENS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarIntens_Internalname ;
         wbErr = true ;
         A3652BarIntens = (byte)(0) ;
         n3652BarIntens = false ;
      }
      else
      {
         A3652BarIntens = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarIntens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3652BarIntens = false ;
      }
      A3653BarPriCod = httpContext.cgiGet( edtBarPriCod_Internalname) ;
      n3653BarPriCod = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosPD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosPD_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARCOSPD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCosPD_Internalname ;
         wbErr = true ;
         A3654BarCosPD = DecimalUtil.ZERO ;
         n3654BarCosPD = false ;
      }
      else
      {
         A3654BarCosPD = localUtil.ctond( httpContext.cgiGet( edtBarCosPD_Internalname)) ;
         n3654BarCosPD = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosPA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosPA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARCOSPA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCosPA_Internalname ;
         wbErr = true ;
         A3658BarCosPA = DecimalUtil.ZERO ;
         n3658BarCosPA = false ;
      }
      else
      {
         A3658BarCosPA = localUtil.ctond( httpContext.cgiGet( edtBarCosPA_Internalname)) ;
         n3658BarCosPA = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosAD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosAD_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARCOSAD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCosAD_Internalname ;
         wbErr = true ;
         A3656BarCosAD = DecimalUtil.ZERO ;
         n3656BarCosAD = false ;
      }
      else
      {
         A3656BarCosAD = localUtil.ctond( httpContext.cgiGet( edtBarCosAD_Internalname)) ;
         n3656BarCosAD = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosAA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosAA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARCOSAA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCosAA_Internalname ;
         wbErr = true ;
         A3657BarCosAA = DecimalUtil.ZERO ;
         n3657BarCosAA = false ;
      }
      else
      {
         A3657BarCosAA = localUtil.ctond( httpContext.cgiGet( edtBarCosAA_Internalname)) ;
         n3657BarCosAA = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosCol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosCol_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARCOSCOL_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCosCol_Internalname ;
         wbErr = true ;
         A3705BarCosCol = DecimalUtil.ZERO ;
         n3705BarCosCol = false ;
      }
      else
      {
         A3705BarCosCol = localUtil.ctond( httpContext.cgiGet( edtBarCosCol_Internalname)) ;
         n3705BarCosCol = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosAnc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosAnc_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARCOSANC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCosAnc_Internalname ;
         wbErr = true ;
         A3706BarCosAnc = DecimalUtil.ZERO ;
         n3706BarCosAnc = false ;
      }
      else
      {
         A3706BarCosAnc = localUtil.ctond( httpContext.cgiGet( edtBarCosAnc_Internalname)) ;
         n3706BarCosAnc = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumActx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumActx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARNUMACTX_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarNumActx_Internalname ;
         wbErr = true ;
         A4923BarNumActx = (short)(0) ;
         n4923BarNumActx = false ;
      }
      else
      {
         A4923BarNumActx = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumActx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4923BarNumActx = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARNUMPDA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarNumPda_Internalname ;
         wbErr = true ;
         A4924BarNumPda = 0 ;
         n4924BarNumPda = false ;
      }
      else
      {
         A4924BarNumPda = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4924BarNumPda = false ;
      }
      A4925BarFaseCod = httpContext.cgiGet( edtBarFaseCod_Internalname) ;
      n4925BarFaseCod = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFaseOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFaseOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARFASEORD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFaseOrd_Internalname ;
         wbErr = true ;
         A4926BarFaseOrd = (short)(0) ;
         n4926BarFaseOrd = false ;
      }
      else
      {
         A4926BarFaseOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtBarFaseOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4926BarFaseOrd = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarReoNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarReoNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARREONUM_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarReoNum_Internalname ;
         wbErr = true ;
         A4977BarReoNum = (short)(0) ;
         n4977BarReoNum = false ;
      }
      else
      {
         A4977BarReoNum = (short)(localUtil.ctol( httpContext.cgiGet( edtBarReoNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4977BarReoNum = false ;
      }
      A5169BarTipDTin = GXutil.upper( httpContext.cgiGet( edtBarTipDTin_Internalname)) ;
      n5169BarTipDTin = false ;
      A5170BarTipCTin = httpContext.cgiGet( edtBarTipCTin_Internalname) ;
      n5170BarTipCTin = false ;
      A5171BarTipNTin = httpContext.cgiGet( edtBarTipNTin_Internalname) ;
      n5171BarTipNTin = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosttTi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosttTi_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "BARCOSTTTI_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCosttTi_Internalname ;
         wbErr = true ;
         A5899BarCosttTi = DecimalUtil.ZERO ;
         n5899BarCosttTi = false ;
      }
      else
      {
         A5899BarCosttTi = localUtil.ctond( httpContext.cgiGet( edtBarCosttTi_Internalname)) ;
         n5899BarCosttTi = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarRbTeo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarRbTeo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARRBTEO_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarRbTeo_Internalname ;
         wbErr = true ;
         A5900BarRbTeo = (short)(0) ;
         n5900BarRbTeo = false ;
      }
      else
      {
         A5900BarRbTeo = (short)(localUtil.ctol( httpContext.cgiGet( edtBarRbTeo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5900BarRbTeo = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARNUMTIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarNumTin_Internalname ;
         wbErr = true ;
         A6177BarNumTin = 0 ;
         n6177BarNumTin = false ;
      }
      else
      {
         A6177BarNumTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6177BarNumTin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARCAUSA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCausa_Internalname ;
         wbErr = true ;
         A6431BarCausa = (short)(0) ;
         n6431BarCausa = false ;
      }
      else
      {
         A6431BarCausa = (short)(localUtil.ctol( httpContext.cgiGet( edtBarCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6431BarCausa = false ;
      }
      A6634BarRecAcb = httpContext.cgiGet( edtBarRecAcb_Internalname) ;
      n6634BarRecAcb = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgsTt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgsTt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARKGSTT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarKgsTt_Internalname ;
         wbErr = true ;
         A8563BarKgsTt = DecimalUtil.ZERO ;
         n8563BarKgsTt = false ;
      }
      else
      {
         A8563BarKgsTt = localUtil.ctond( httpContext.cgiGet( edtBarKgsTt_Internalname)) ;
         n8563BarKgsTt = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FAMCODT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFamCodT_Internalname ;
         wbErr = true ;
         A8584FamCodT = (short)(0) ;
         n8584FamCodT = false ;
      }
      else
      {
         A8584FamCodT = (short)(localUtil.ctol( httpContext.cgiGet( edtFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8584FamCodT = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARFORNUM_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarForNum_Internalname ;
         wbErr = true ;
         A8609BarForNum = 0 ;
         n8609BarForNum = false ;
      }
      else
      {
         A8609BarForNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8609BarForNum = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNTint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNTint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARNTINT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarNTint_Internalname ;
         wbErr = true ;
         A9754BarNTint = (byte)(0) ;
         n9754BarNTint = false ;
      }
      else
      {
         A9754BarNTint = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarNTint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9754BarNTint = false ;
      }
      A10539BarAcs = httpContext.cgiGet( edtBarAcs_Internalname) ;
      n10539BarAcs = false ;
      A10540BarNprg = httpContext.cgiGet( edtBarNprg_Internalname) ;
      n10540BarNprg = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarLts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarLts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "BARLTS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarLts_Internalname ;
         wbErr = true ;
         A10541BarLts = 0 ;
         n10541BarLts = false ;
      }
      else
      {
         A10541BarLts = (int)(localUtil.ctol( httpContext.cgiGet( edtBarLts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10541BarLts = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarLtsV_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarLtsV_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARLTSV_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarLtsV_Internalname ;
         wbErr = true ;
         A10546BarLtsV = DecimalUtil.ZERO ;
         n10546BarLtsV = false ;
      }
      else
      {
         A10546BarLtsV = localUtil.ctond( httpContext.cgiGet( edtBarLtsV_Internalname)) ;
         n10546BarLtsV = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtBarFecIt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "BARFECIT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFecIt_Internalname ;
         wbErr = true ;
         A11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
         n11177BarFecIt = false ;
      }
      else
      {
         A11177BarFecIt = localUtil.ctot( httpContext.cgiGet( edtBarFecIt_Internalname)) ;
         n11177BarFecIt = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtBarFecFt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "BARFECFT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFecFt_Internalname ;
         wbErr = true ;
         A11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
         n11178BarFecFt = false ;
      }
      else
      {
         A11178BarFecFt = localUtil.ctot( httpContext.cgiGet( edtBarFecFt_Internalname)) ;
         n11178BarFecFt = false ;
      }
      A11179BarColNm = httpContext.cgiGet( edtBarColNm_Internalname) ;
      n11179BarColNm = false ;
      A11762BarDispCli = httpContext.cgiGet( edtBarDispCli_Internalname) ;
      n11762BarDispCli = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMtsTt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMtsTt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARMTSTT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarMtsTt_Internalname ;
         wbErr = true ;
         A12993BarMtsTt = DecimalUtil.ZERO ;
         n12993BarMtsTt = false ;
      }
      else
      {
         A12993BarMtsTt = localUtil.ctond( httpContext.cgiGet( edtBarMtsTt_Internalname)) ;
         n12993BarMtsTt = false ;
      }
      GXCCtl = "Z1929EstTinNr_" + sGXsfl_50_idx ;
      Z1929EstTinNr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1933BarCodTin_" + sGXsfl_50_idx ;
      Z1933BarCodTin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1934BarReoTin_" + sGXsfl_50_idx ;
      Z1934BarReoTin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1935BarParTin_" + sGXsfl_50_idx ;
      Z1935BarParTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1936BarSerTin_" + sGXsfl_50_idx ;
      Z1936BarSerTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1937BarDscTin_" + sGXsfl_50_idx ;
      Z1937BarDscTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1939BarArtTin_" + sGXsfl_50_idx ;
      Z1939BarArtTin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1940BarColNoT_" + sGXsfl_50_idx ;
      Z1940BarColNoT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1941BarColNuT_" + sGXsfl_50_idx ;
      Z1941BarColNuT = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1942BarTipCoT_" + sGXsfl_50_idx ;
      Z1942BarTipCoT = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1943BarNomClT_" + sGXsfl_50_idx ;
      Z1943BarNomClT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1944BarNumClT_" + sGXsfl_50_idx ;
      Z1944BarNumClT = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1945BarMaqTin_" + sGXsfl_50_idx ;
      Z1945BarMaqTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1946BarVolTin_" + sGXsfl_50_idx ;
      Z1946BarVolTin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1947BarKgmTin_" + sGXsfl_50_idx ;
      Z1947BarKgmTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1948BarMtrTin_" + sGXsfl_50_idx ;
      Z1948BarMtrTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1949BarPieTin_" + sGXsfl_50_idx ;
      Z1949BarPieTin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2304BarEstTin_" + sGXsfl_50_idx ;
      Z2304BarEstTin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2316BarAgrLot_" + sGXsfl_50_idx ;
      Z2316BarAgrLot = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3650BarNumAna_" + sGXsfl_50_idx ;
      Z3650BarNumAna = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3651BarTipDef_" + sGXsfl_50_idx ;
      Z3651BarTipDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3652BarIntens_" + sGXsfl_50_idx ;
      Z3652BarIntens = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3653BarPriCod_" + sGXsfl_50_idx ;
      Z3653BarPriCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3654BarCosPD_" + sGXsfl_50_idx ;
      Z3654BarCosPD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3658BarCosPA_" + sGXsfl_50_idx ;
      Z3658BarCosPA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3656BarCosAD_" + sGXsfl_50_idx ;
      Z3656BarCosAD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3657BarCosAA_" + sGXsfl_50_idx ;
      Z3657BarCosAA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3705BarCosCol_" + sGXsfl_50_idx ;
      Z3705BarCosCol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3706BarCosAnc_" + sGXsfl_50_idx ;
      Z3706BarCosAnc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4923BarNumActx_" + sGXsfl_50_idx ;
      Z4923BarNumActx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4924BarNumPda_" + sGXsfl_50_idx ;
      Z4924BarNumPda = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4925BarFaseCod_" + sGXsfl_50_idx ;
      Z4925BarFaseCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4926BarFaseOrd_" + sGXsfl_50_idx ;
      Z4926BarFaseOrd = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4977BarReoNum_" + sGXsfl_50_idx ;
      Z4977BarReoNum = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5169BarTipDTin_" + sGXsfl_50_idx ;
      Z5169BarTipDTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5170BarTipCTin_" + sGXsfl_50_idx ;
      Z5170BarTipCTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5171BarTipNTin_" + sGXsfl_50_idx ;
      Z5171BarTipNTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5899BarCosttTi_" + sGXsfl_50_idx ;
      Z5899BarCosttTi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5900BarRbTeo_" + sGXsfl_50_idx ;
      Z5900BarRbTeo = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6177BarNumTin_" + sGXsfl_50_idx ;
      Z6177BarNumTin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6431BarCausa_" + sGXsfl_50_idx ;
      Z6431BarCausa = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6634BarRecAcb_" + sGXsfl_50_idx ;
      Z6634BarRecAcb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8563BarKgsTt_" + sGXsfl_50_idx ;
      Z8563BarKgsTt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8584FamCodT_" + sGXsfl_50_idx ;
      Z8584FamCodT = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8609BarForNum_" + sGXsfl_50_idx ;
      Z8609BarForNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9754BarNTint_" + sGXsfl_50_idx ;
      Z9754BarNTint = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10539BarAcs_" + sGXsfl_50_idx ;
      Z10539BarAcs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10540BarNprg_" + sGXsfl_50_idx ;
      Z10540BarNprg = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10541BarLts_" + sGXsfl_50_idx ;
      Z10541BarLts = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10546BarLtsV_" + sGXsfl_50_idx ;
      Z10546BarLtsV = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11177BarFecIt_" + sGXsfl_50_idx ;
      Z11177BarFecIt = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11178BarFecFt_" + sGXsfl_50_idx ;
      Z11178BarFecFt = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11179BarColNm_" + sGXsfl_50_idx ;
      Z11179BarColNm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11762BarDispCli_" + sGXsfl_50_idx ;
      Z11762BarDispCli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12993BarMtsTt_" + sGXsfl_50_idx ;
      Z12993BarMtsTt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13759EstFecCier_" + sGXsfl_50_idx ;
      Z13759EstFecCier = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13760EstCdn1_" + sGXsfl_50_idx ;
      Z13760EstCdn1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13761EstCdn2_" + sGXsfl_50_idx ;
      Z13761EstCdn2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13762EstCtw_" + sGXsfl_50_idx ;
      Z13762EstCtw = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z252CliCod_" + sGXsfl_50_idx ;
      Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13759EstFecCier_" + sGXsfl_50_idx ;
      A13759EstFecCier = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13760EstCdn1_" + sGXsfl_50_idx ;
      A13760EstCdn1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13761EstCdn2_" + sGXsfl_50_idx ;
      A13761EstCdn2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13762EstCtw_" + sGXsfl_50_idx ;
      A13762EstCtw = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_510_" + sGXsfl_50_idx ;
      nRcdDeleted_510 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_510_" + sGXsfl_50_idx ;
      nRcdExists_510 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_510_" + sGXsfl_50_idx ;
      nIsMod_510 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEstTinNr_Enabled = edtEstTinNr_Enabled ;
   }

   public void confirmValuesDP0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50510( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50510( ) ;
         httpContext.changePostValue( "Z1929EstTinNr_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1929EstTinNr_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1929EstTinNr_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1933BarCodTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1933BarCodTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1933BarCodTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1934BarReoTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1934BarReoTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1934BarReoTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1935BarParTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1935BarParTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1935BarParTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1936BarSerTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1936BarSerTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1936BarSerTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1937BarDscTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1937BarDscTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1937BarDscTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1939BarArtTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1939BarArtTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1939BarArtTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1940BarColNoT_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1940BarColNoT_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1940BarColNoT_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1941BarColNuT_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1941BarColNuT_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1941BarColNuT_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1942BarTipCoT_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1942BarTipCoT_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1942BarTipCoT_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1943BarNomClT_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1943BarNomClT_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1943BarNomClT_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1944BarNumClT_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1944BarNumClT_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1944BarNumClT_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1945BarMaqTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1945BarMaqTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1945BarMaqTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1946BarVolTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1946BarVolTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1946BarVolTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1947BarKgmTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1947BarKgmTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1947BarKgmTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1948BarMtrTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1948BarMtrTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1948BarMtrTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z1949BarPieTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z1949BarPieTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1949BarPieTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2304BarEstTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2304BarEstTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2304BarEstTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2316BarAgrLot_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2316BarAgrLot_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2316BarAgrLot_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3650BarNumAna_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3650BarNumAna_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3650BarNumAna_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3651BarTipDef_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3651BarTipDef_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3651BarTipDef_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3652BarIntens_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3652BarIntens_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3652BarIntens_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3653BarPriCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3653BarPriCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3653BarPriCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3654BarCosPD_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3654BarCosPD_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3654BarCosPD_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3658BarCosPA_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3658BarCosPA_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3658BarCosPA_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3656BarCosAD_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3656BarCosAD_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3656BarCosAD_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3657BarCosAA_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3657BarCosAA_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3657BarCosAA_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3705BarCosCol_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3705BarCosCol_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3705BarCosCol_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3706BarCosAnc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3706BarCosAnc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3706BarCosAnc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4923BarNumActx_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4923BarNumActx_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4923BarNumActx_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4924BarNumPda_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4924BarNumPda_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4924BarNumPda_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4925BarFaseCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4925BarFaseCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4925BarFaseCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4926BarFaseOrd_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4926BarFaseOrd_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4926BarFaseOrd_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z4977BarReoNum_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z4977BarReoNum_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4977BarReoNum_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z5169BarTipDTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z5169BarTipDTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5169BarTipDTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z5170BarTipCTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z5170BarTipCTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5170BarTipCTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z5171BarTipNTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z5171BarTipNTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5171BarTipNTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z5899BarCosttTi_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z5899BarCosttTi_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5899BarCosttTi_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z5900BarRbTeo_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z5900BarRbTeo_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5900BarRbTeo_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6177BarNumTin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6177BarNumTin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6177BarNumTin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6431BarCausa_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6431BarCausa_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6431BarCausa_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6634BarRecAcb_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6634BarRecAcb_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6634BarRecAcb_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8563BarKgsTt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8563BarKgsTt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8563BarKgsTt_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8584FamCodT_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8584FamCodT_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8584FamCodT_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8609BarForNum_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8609BarForNum_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8609BarForNum_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z9754BarNTint_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z9754BarNTint_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9754BarNTint_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10539BarAcs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10539BarAcs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10539BarAcs_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10540BarNprg_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10540BarNprg_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10540BarNprg_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10541BarLts_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10541BarLts_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10541BarLts_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10546BarLtsV_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10546BarLtsV_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10546BarLtsV_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11177BarFecIt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11177BarFecIt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11177BarFecIt_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11178BarFecFt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11178BarFecFt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11178BarFecFt_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11179BarColNm_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11179BarColNm_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11179BarColNm_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11762BarDispCli_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11762BarDispCli_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11762BarDispCli_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12993BarMtsTt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12993BarMtsTt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12993BarMtsTt_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13759EstFecCier_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13759EstFecCier_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13759EstFecCier_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13760EstCdn1_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13760EstCdn1_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13760EstCdn1_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13761EstCdn2_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13761EstCdn2_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13761EstCdn2_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13762EstCtw_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13762EstCtw_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13762EstCtw_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z252CliCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcontin", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3646EstTinAny", GXutil.ltrim( localUtil.ntoc( Z3646EstTinAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3647EstTinMes", GXutil.ltrim( localUtil.ntoc( Z3647EstTinMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3648EstTinDia", GXutil.ltrim( localUtil.ntoc( Z3648EstTinDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3649EstTinUL", GXutil.ltrim( localUtil.ntoc( Z3649EstTinUL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNHDR_LC", GXutil.rtrim( A13841Barnhdr_lc));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTFECCIER", localUtil.dtoc( A13759EstFecCier, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCDN1", GXutil.ltrim( localUtil.ntoc( A13760EstCdn1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCDN2", GXutil.rtrim( A13761EstCdn2));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTCTW", GXutil.rtrim( A13762EstCtw));
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
      return formatLink("app.tcontin", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCONTIN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CONTROL TINTE", "") ;
   }

   public void initializeNonKeyDP509( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3649EstTinUL = (short)(0) ;
      n3649EstTinUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3649EstTinUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3649EstTinUL), 4, 0));
      Z3649EstTinUL = (short)(0) ;
   }

   public void initAllDP509( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A3646EstTinAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
      A3647EstTinMes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
      A3648EstTinDia = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
      initializeNonKeyDP509( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyDP510( )
   {
      A13841Barnhdr_lc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
      A252CliCod = 0 ;
      A1933BarCodTin = 0 ;
      n1933BarCodTin = false ;
      A1934BarReoTin = (byte)(0) ;
      n1934BarReoTin = false ;
      A1935BarParTin = "" ;
      n1935BarParTin = false ;
      A1936BarSerTin = "" ;
      n1936BarSerTin = false ;
      A1937BarDscTin = "" ;
      n1937BarDscTin = false ;
      A1939BarArtTin = (short)(0) ;
      n1939BarArtTin = false ;
      A1940BarColNoT = "" ;
      n1940BarColNoT = false ;
      A1941BarColNuT = 0 ;
      n1941BarColNuT = false ;
      A1942BarTipCoT = (byte)(0) ;
      n1942BarTipCoT = false ;
      A1943BarNomClT = "" ;
      n1943BarNomClT = false ;
      A1944BarNumClT = 0 ;
      n1944BarNumClT = false ;
      A1945BarMaqTin = "" ;
      n1945BarMaqTin = false ;
      A1946BarVolTin = 0 ;
      n1946BarVolTin = false ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      n1947BarKgmTin = false ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      n1948BarMtrTin = false ;
      A1949BarPieTin = 0 ;
      n1949BarPieTin = false ;
      A2304BarEstTin = (byte)(0) ;
      n2304BarEstTin = false ;
      A2316BarAgrLot = "" ;
      n2316BarAgrLot = false ;
      A3650BarNumAna = (short)(0) ;
      n3650BarNumAna = false ;
      A3651BarTipDef = (short)(0) ;
      n3651BarTipDef = false ;
      A3652BarIntens = (byte)(0) ;
      n3652BarIntens = false ;
      A3653BarPriCod = "" ;
      n3653BarPriCod = false ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      n3654BarCosPD = false ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      n3658BarCosPA = false ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      n3656BarCosAD = false ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      n3657BarCosAA = false ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      n3705BarCosCol = false ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      n3706BarCosAnc = false ;
      A4923BarNumActx = (short)(0) ;
      n4923BarNumActx = false ;
      A4924BarNumPda = 0 ;
      n4924BarNumPda = false ;
      A4925BarFaseCod = "" ;
      n4925BarFaseCod = false ;
      A4926BarFaseOrd = (short)(0) ;
      n4926BarFaseOrd = false ;
      A4977BarReoNum = (short)(0) ;
      n4977BarReoNum = false ;
      A5169BarTipDTin = "" ;
      n5169BarTipDTin = false ;
      A5170BarTipCTin = "" ;
      n5170BarTipCTin = false ;
      A5171BarTipNTin = "" ;
      n5171BarTipNTin = false ;
      A5899BarCosttTi = DecimalUtil.ZERO ;
      n5899BarCosttTi = false ;
      A5900BarRbTeo = (short)(0) ;
      n5900BarRbTeo = false ;
      A6177BarNumTin = 0 ;
      n6177BarNumTin = false ;
      A6431BarCausa = (short)(0) ;
      n6431BarCausa = false ;
      A6634BarRecAcb = "" ;
      n6634BarRecAcb = false ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      n8563BarKgsTt = false ;
      A8584FamCodT = (short)(0) ;
      n8584FamCodT = false ;
      A8609BarForNum = 0 ;
      n8609BarForNum = false ;
      A9754BarNTint = (byte)(0) ;
      n9754BarNTint = false ;
      A10539BarAcs = "" ;
      n10539BarAcs = false ;
      A10540BarNprg = "" ;
      n10540BarNprg = false ;
      A10541BarLts = 0 ;
      n10541BarLts = false ;
      A10546BarLtsV = DecimalUtil.ZERO ;
      n10546BarLtsV = false ;
      A11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      n11177BarFecIt = false ;
      A11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      n11178BarFecFt = false ;
      A11179BarColNm = "" ;
      n11179BarColNm = false ;
      A11762BarDispCli = "" ;
      n11762BarDispCli = false ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      n12993BarMtsTt = false ;
      A13759EstFecCier = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13759EstFecCier", localUtil.format(A13759EstFecCier, "99/99/99"));
      A13760EstCdn1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13760EstCdn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13760EstCdn1), 4, 0));
      A13761EstCdn2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13761EstCdn2", A13761EstCdn2);
      A13762EstCtw = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13762EstCtw", A13762EstCtw);
      Z1933BarCodTin = 0 ;
      Z1934BarReoTin = (byte)(0) ;
      Z1935BarParTin = "" ;
      Z1936BarSerTin = "" ;
      Z1937BarDscTin = "" ;
      Z1939BarArtTin = (short)(0) ;
      Z1940BarColNoT = "" ;
      Z1941BarColNuT = 0 ;
      Z1942BarTipCoT = (byte)(0) ;
      Z1943BarNomClT = "" ;
      Z1944BarNumClT = 0 ;
      Z1945BarMaqTin = "" ;
      Z1946BarVolTin = 0 ;
      Z1947BarKgmTin = DecimalUtil.ZERO ;
      Z1948BarMtrTin = DecimalUtil.ZERO ;
      Z1949BarPieTin = 0 ;
      Z2304BarEstTin = (byte)(0) ;
      Z2316BarAgrLot = "" ;
      Z3650BarNumAna = (short)(0) ;
      Z3651BarTipDef = (short)(0) ;
      Z3652BarIntens = (byte)(0) ;
      Z3653BarPriCod = "" ;
      Z3654BarCosPD = DecimalUtil.ZERO ;
      Z3658BarCosPA = DecimalUtil.ZERO ;
      Z3656BarCosAD = DecimalUtil.ZERO ;
      Z3657BarCosAA = DecimalUtil.ZERO ;
      Z3705BarCosCol = DecimalUtil.ZERO ;
      Z3706BarCosAnc = DecimalUtil.ZERO ;
      Z4923BarNumActx = (short)(0) ;
      Z4924BarNumPda = 0 ;
      Z4925BarFaseCod = "" ;
      Z4926BarFaseOrd = (short)(0) ;
      Z4977BarReoNum = (short)(0) ;
      Z5169BarTipDTin = "" ;
      Z5170BarTipCTin = "" ;
      Z5171BarTipNTin = "" ;
      Z5899BarCosttTi = DecimalUtil.ZERO ;
      Z5900BarRbTeo = (short)(0) ;
      Z6177BarNumTin = 0 ;
      Z6431BarCausa = (short)(0) ;
      Z6634BarRecAcb = "" ;
      Z8563BarKgsTt = DecimalUtil.ZERO ;
      Z8584FamCodT = (short)(0) ;
      Z8609BarForNum = 0 ;
      Z9754BarNTint = (byte)(0) ;
      Z10539BarAcs = "" ;
      Z10540BarNprg = "" ;
      Z10541BarLts = 0 ;
      Z10546BarLtsV = DecimalUtil.ZERO ;
      Z11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      Z11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      Z11179BarColNm = "" ;
      Z11762BarDispCli = "" ;
      Z12993BarMtsTt = DecimalUtil.ZERO ;
      Z13759EstFecCier = GXutil.nullDate() ;
      Z13760EstCdn1 = (short)(0) ;
      Z13761EstCdn2 = "" ;
      Z13762EstCtw = "" ;
      Z252CliCod = 0 ;
   }

   public void initAllDP510( )
   {
      A1929EstTinNr = (short)(0) ;
      initializeNonKeyDP510( ) ;
   }

   public void standaloneModalInsertDP510( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241514658", true, true);
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
      httpContext.AddJavascriptSource("tcontin.js", "?20268241514658", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties510( )
   {
      edtEstTinNr_Enabled = defedtEstTinNr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_510, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_510_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstTinNr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReoTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1935BarParTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1936BarSerTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSerTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1937BarDscTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDscTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1939BarArtTin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarArtTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1940BarColNoT));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNoT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNuT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCoT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1943BarNomClT));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNomClT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1944BarNumClT, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumClT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1945BarMaqTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMaqTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarVolTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgmTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMtrTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1949BarPieTin, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2304BarEstTin, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2316BarAgrLot));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAgrLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumAna_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3651BarTipDef, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3652BarIntens, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarIntens_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3653BarPriCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPriCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosPD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosPA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4923BarNumActx, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumActx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4924BarNumPda, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumPda_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4925BarFaseCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFaseCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4926BarFaseOrd, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFaseOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4977BarReoNum, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarReoNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5169BarTipDTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipDTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5170BarTipCTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipCTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5171BarTipNTin));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTipNTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5899BarCosttTi, (byte)(11), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCosttTi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5900BarRbTeo, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarRbTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6177BarNumTin, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6431BarCausa, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCausa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6634BarRecAcb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarRecAcb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKgsTt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8584FamCodT, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFamCodT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8609BarForNum, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarForNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9754BarNTint, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNTint_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10539BarAcs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAcs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10540BarNprg));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNprg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10541BarLts, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10546BarLtsV, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarLtsV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A11177BarFecIt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecIt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A11178BarFecFt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecFt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11179BarColNm));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarColNm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11762BarDispCli));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDispCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMtsTt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEstTinAny_Internalname = "ESTTINANY" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEstTinMes_Internalname = "ESTTINMES" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEstTinDia_Internalname = "ESTTINDIA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEstTinUL_Internalname = "ESTTINUL" ;
      edtavnRcdDeleted_510_Internalname = "vNRCDDELETED_510" ;
      edtEstTinNr_Internalname = "ESTTINNR" ;
      edtBarCodTin_Internalname = "BARCODTIN" ;
      edtBarReoTin_Internalname = "BARREOTIN" ;
      edtBarParTin_Internalname = "BARPARTIN" ;
      edtBarSerTin_Internalname = "BARSERTIN" ;
      edtBarDscTin_Internalname = "BARDSCTIN" ;
      edtBarArtTin_Internalname = "BARARTTIN" ;
      edtBarColNoT_Internalname = "BARCOLNOT" ;
      edtBarColNuT_Internalname = "BARCOLNUT" ;
      edtBarTipCoT_Internalname = "BARTIPCOT" ;
      edtBarNomClT_Internalname = "BARNOMCLT" ;
      edtBarNumClT_Internalname = "BARNUMCLT" ;
      edtBarMaqTin_Internalname = "BARMAQTIN" ;
      edtBarVolTin_Internalname = "BARVOLTIN" ;
      edtBarKgmTin_Internalname = "BARKGMTIN" ;
      edtBarMtrTin_Internalname = "BARMTRTIN" ;
      edtBarPieTin_Internalname = "BARPIETIN" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarEstTin_Internalname = "BARESTTIN" ;
      edtBarAgrLot_Internalname = "BARAGRLOT" ;
      edtBarNumAna_Internalname = "BARNUMANA" ;
      edtBarTipDef_Internalname = "BARTIPDEF" ;
      edtBarIntens_Internalname = "BARINTENS" ;
      edtBarPriCod_Internalname = "BARPRICOD" ;
      edtBarCosPD_Internalname = "BARCOSPD" ;
      edtBarCosPA_Internalname = "BARCOSPA" ;
      edtBarCosAD_Internalname = "BARCOSAD" ;
      edtBarCosAA_Internalname = "BARCOSAA" ;
      edtBarCosCol_Internalname = "BARCOSCOL" ;
      edtBarCosAnc_Internalname = "BARCOSANC" ;
      edtBarNumActx_Internalname = "BARNUMACTX" ;
      edtBarNumPda_Internalname = "BARNUMPDA" ;
      edtBarFaseCod_Internalname = "BARFASECOD" ;
      edtBarFaseOrd_Internalname = "BARFASEORD" ;
      edtBarReoNum_Internalname = "BARREONUM" ;
      edtBarTipDTin_Internalname = "BARTIPDTIN" ;
      edtBarTipCTin_Internalname = "BARTIPCTIN" ;
      edtBarTipNTin_Internalname = "BARTIPNTIN" ;
      edtBarCosttTi_Internalname = "BARCOSTTTI" ;
      edtBarRbTeo_Internalname = "BARRBTEO" ;
      edtBarNumTin_Internalname = "BARNUMTIN" ;
      edtBarCausa_Internalname = "BARCAUSA" ;
      edtBarRecAcb_Internalname = "BARRECACB" ;
      edtBarKgsTt_Internalname = "BARKGSTT" ;
      edtFamCodT_Internalname = "FAMCODT" ;
      edtBarForNum_Internalname = "BARFORNUM" ;
      edtBarNTint_Internalname = "BARNTINT" ;
      edtBarAcs_Internalname = "BARACS" ;
      edtBarNprg_Internalname = "BARNPRG" ;
      edtBarLts_Internalname = "BARLTS" ;
      edtBarLtsV_Internalname = "BARLTSV" ;
      edtBarFecIt_Internalname = "BARFECIT" ;
      edtBarFecFt_Internalname = "BARFECFT" ;
      edtBarColNm_Internalname = "BARCOLNM" ;
      edtBarDispCli_Internalname = "BARDISPCLI" ;
      edtBarMtsTt_Internalname = "BARMTSTT" ;
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
      Form.setCaption( httpContext.getMessage( "CONTROL TINTE", "") );
      edtBarMtsTt_Jsonclick = "" ;
      edtBarDispCli_Jsonclick = "" ;
      edtBarColNm_Jsonclick = "" ;
      edtBarFecFt_Jsonclick = "" ;
      edtBarFecIt_Jsonclick = "" ;
      edtBarLtsV_Jsonclick = "" ;
      edtBarLts_Jsonclick = "" ;
      edtBarNprg_Jsonclick = "" ;
      edtBarAcs_Jsonclick = "" ;
      edtBarNTint_Jsonclick = "" ;
      edtBarForNum_Jsonclick = "" ;
      edtFamCodT_Jsonclick = "" ;
      edtBarKgsTt_Jsonclick = "" ;
      edtBarRecAcb_Jsonclick = "" ;
      edtBarCausa_Jsonclick = "" ;
      edtBarNumTin_Jsonclick = "" ;
      edtBarRbTeo_Jsonclick = "" ;
      edtBarCosttTi_Jsonclick = "" ;
      edtBarTipNTin_Jsonclick = "" ;
      edtBarTipCTin_Jsonclick = "" ;
      edtBarTipDTin_Jsonclick = "" ;
      edtBarReoNum_Jsonclick = "" ;
      edtBarFaseOrd_Jsonclick = "" ;
      edtBarFaseCod_Jsonclick = "" ;
      edtBarNumPda_Jsonclick = "" ;
      edtBarNumActx_Jsonclick = "" ;
      edtBarCosAnc_Jsonclick = "" ;
      edtBarCosCol_Jsonclick = "" ;
      edtBarCosAA_Jsonclick = "" ;
      edtBarCosAD_Jsonclick = "" ;
      edtBarCosPA_Jsonclick = "" ;
      edtBarCosPD_Jsonclick = "" ;
      edtBarPriCod_Jsonclick = "" ;
      edtBarIntens_Jsonclick = "" ;
      edtBarTipDef_Jsonclick = "" ;
      edtBarNumAna_Jsonclick = "" ;
      edtBarAgrLot_Jsonclick = "" ;
      edtBarEstTin_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarPieTin_Jsonclick = "" ;
      edtBarMtrTin_Jsonclick = "" ;
      edtBarKgmTin_Jsonclick = "" ;
      edtBarVolTin_Jsonclick = "" ;
      edtBarMaqTin_Jsonclick = "" ;
      edtBarNumClT_Jsonclick = "" ;
      edtBarNomClT_Jsonclick = "" ;
      edtBarTipCoT_Jsonclick = "" ;
      edtBarColNuT_Jsonclick = "" ;
      edtBarColNoT_Jsonclick = "" ;
      edtBarArtTin_Jsonclick = "" ;
      edtBarDscTin_Jsonclick = "" ;
      edtBarSerTin_Jsonclick = "" ;
      edtBarParTin_Jsonclick = "" ;
      edtBarReoTin_Jsonclick = "" ;
      edtBarCodTin_Jsonclick = "" ;
      edtEstTinNr_Jsonclick = "" ;
      edtavnRcdDeleted_510_Jsonclick = "" ;
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
      edtBarMtsTt_Enabled = 1 ;
      edtBarDispCli_Enabled = 1 ;
      edtBarColNm_Enabled = 1 ;
      edtBarFecFt_Enabled = 1 ;
      edtBarFecIt_Enabled = 1 ;
      edtBarLtsV_Enabled = 1 ;
      edtBarLts_Enabled = 1 ;
      edtBarNprg_Enabled = 1 ;
      edtBarAcs_Enabled = 1 ;
      edtBarNTint_Enabled = 1 ;
      edtBarForNum_Enabled = 1 ;
      edtFamCodT_Enabled = 1 ;
      edtBarKgsTt_Enabled = 1 ;
      edtBarRecAcb_Enabled = 1 ;
      edtBarCausa_Enabled = 1 ;
      edtBarNumTin_Enabled = 1 ;
      edtBarRbTeo_Enabled = 1 ;
      edtBarCosttTi_Enabled = 1 ;
      edtBarTipNTin_Enabled = 1 ;
      edtBarTipCTin_Enabled = 1 ;
      edtBarTipDTin_Enabled = 1 ;
      edtBarReoNum_Enabled = 1 ;
      edtBarFaseOrd_Enabled = 1 ;
      edtBarFaseCod_Enabled = 1 ;
      edtBarNumPda_Enabled = 1 ;
      edtBarNumActx_Enabled = 1 ;
      edtBarCosAnc_Enabled = 1 ;
      edtBarCosCol_Enabled = 1 ;
      edtBarCosAA_Enabled = 1 ;
      edtBarCosAD_Enabled = 1 ;
      edtBarCosPA_Enabled = 1 ;
      edtBarCosPD_Enabled = 1 ;
      edtBarPriCod_Enabled = 1 ;
      edtBarIntens_Enabled = 1 ;
      edtBarTipDef_Enabled = 1 ;
      edtBarNumAna_Enabled = 1 ;
      edtBarAgrLot_Enabled = 1 ;
      edtBarEstTin_Enabled = 1 ;
      edtCliCod_Enabled = 1 ;
      edtBarPieTin_Enabled = 1 ;
      edtBarMtrTin_Enabled = 1 ;
      edtBarKgmTin_Enabled = 1 ;
      edtBarVolTin_Enabled = 1 ;
      edtBarMaqTin_Enabled = 1 ;
      edtBarNumClT_Enabled = 1 ;
      edtBarNomClT_Enabled = 1 ;
      edtBarTipCoT_Enabled = 1 ;
      edtBarColNuT_Enabled = 1 ;
      edtBarColNoT_Enabled = 1 ;
      edtBarArtTin_Enabled = 1 ;
      edtBarDscTin_Enabled = 1 ;
      edtBarSerTin_Enabled = 1 ;
      edtBarParTin_Enabled = 1 ;
      edtBarReoTin_Enabled = 1 ;
      edtBarCodTin_Enabled = 1 ;
      edtEstTinNr_Enabled = 1 ;
      edtavnRcdDeleted_510_Enabled = 1 ;
      edtEstTinUL_Jsonclick = "" ;
      edtEstTinUL_Backcolor = (int)(0xFFFFFF) ;
      edtEstTinUL_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEstTinDia_Jsonclick = "" ;
      edtEstTinDia_Backcolor = (int)(0xFFFFFF) ;
      edtEstTinDia_Enabled = 1 ;
      edtEstTinMes_Jsonclick = "" ;
      edtEstTinMes_Backcolor = (int)(0xFFFFFF) ;
      edtEstTinMes_Enabled = 1 ;
      edtEstTinAny_Jsonclick = "" ;
      edtEstTinAny_Backcolor = (int)(0xFFFFFF) ;
      edtEstTinAny_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      subsflControlProps_50510( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalDP510( ) ;
         standaloneModalDP510( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowDP510( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50510( ) ;
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
      /* Using cursor T00DP16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00DP16_A407EmprNom[0] ;
      n407EmprNom = T00DP16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      GX_FocusControl = edtEstTinUL_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T00DP16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00DP16_A407EmprNom[0] ;
      n407EmprNom = T00DP16_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Esttindia( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3649EstTinUL", GXutil.ltrim( localUtil.ntoc( A3649EstTinUL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3646EstTinAny", GXutil.ltrim( localUtil.ntoc( Z3646EstTinAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3647EstTinMes", GXutil.ltrim( localUtil.ntoc( Z3647EstTinMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3648EstTinDia", GXutil.ltrim( localUtil.ntoc( Z3648EstTinDia, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3649EstTinUL", GXutil.ltrim( localUtil.ntoc( Z3649EstTinUL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      /* Using cursor T00DP27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_ESTTINANY","{handler:'valid_Esttinany',iparms:[]");
      setEventMetadata("VALID_ESTTINANY",",oparms:[]}");
      setEventMetadata("VALID_ESTTINMES","{handler:'valid_Esttinmes',iparms:[]");
      setEventMetadata("VALID_ESTTINMES",",oparms:[]}");
      setEventMetadata("VALID_ESTTINDIA","{handler:'valid_Esttindia',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3646EstTinAny',fld:'ESTTINANY',pic:'ZZZ9'},{av:'A3647EstTinMes',fld:'ESTTINMES',pic:'Z9'},{av:'A3648EstTinDia',fld:'ESTTINDIA',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTTINDIA",",oparms:[{av:'A3649EstTinUL',fld:'ESTTINUL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3646EstTinAny'},{av:'Z3647EstTinMes'},{av:'Z3648EstTinDia'},{av:'Z3649EstTinUL'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESTTINNR","{handler:'valid_Esttinnr',iparms:[]");
      setEventMetadata("VALID_ESTTINNR",",oparms:[]}");
      setEventMetadata("VALID_BARCODTIN","{handler:'valid_Barcodtin',iparms:[]");
      setEventMetadata("VALID_BARCODTIN",",oparms:[]}");
      setEventMetadata("VALID_BARREOTIN","{handler:'valid_Barreotin',iparms:[]");
      setEventMetadata("VALID_BARREOTIN",",oparms:[]}");
      setEventMetadata("VALID_BARPARTIN","{handler:'valid_Barpartin',iparms:[]");
      setEventMetadata("VALID_BARPARTIN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARPRICOD","{handler:'valid_Barpricod',iparms:[]");
      setEventMetadata("VALID_BARPRICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barmtstt',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z1935BarParTin = "" ;
      Z1936BarSerTin = "" ;
      Z1937BarDscTin = "" ;
      Z1940BarColNoT = "" ;
      Z1943BarNomClT = "" ;
      Z1945BarMaqTin = "" ;
      Z1947BarKgmTin = DecimalUtil.ZERO ;
      Z1948BarMtrTin = DecimalUtil.ZERO ;
      Z2316BarAgrLot = "" ;
      Z3653BarPriCod = "" ;
      Z3654BarCosPD = DecimalUtil.ZERO ;
      Z3658BarCosPA = DecimalUtil.ZERO ;
      Z3656BarCosAD = DecimalUtil.ZERO ;
      Z3657BarCosAA = DecimalUtil.ZERO ;
      Z3705BarCosCol = DecimalUtil.ZERO ;
      Z3706BarCosAnc = DecimalUtil.ZERO ;
      Z4925BarFaseCod = "" ;
      Z5169BarTipDTin = "" ;
      Z5170BarTipCTin = "" ;
      Z5171BarTipNTin = "" ;
      Z5899BarCosttTi = DecimalUtil.ZERO ;
      Z6634BarRecAcb = "" ;
      Z8563BarKgsTt = DecimalUtil.ZERO ;
      Z10539BarAcs = "" ;
      Z10540BarNprg = "" ;
      Z10546BarLtsV = DecimalUtil.ZERO ;
      Z11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      Z11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      Z11179BarColNm = "" ;
      Z11762BarDispCli = "" ;
      Z12993BarMtsTt = DecimalUtil.ZERO ;
      Z13759EstFecCier = GXutil.nullDate() ;
      Z13761EstCdn2 = "" ;
      Z13762EstCtw = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode510 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A13841Barnhdr_lc = "" ;
      A13759EstFecCier = GXutil.nullDate() ;
      A13761EstCdn2 = "" ;
      A13762EstCtw = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode509 = "" ;
      GXCCtl = "" ;
      A1935BarParTin = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A1940BarColNoT = "" ;
      A1943BarNomClT = "" ;
      A1945BarMaqTin = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A2316BarAgrLot = "" ;
      A3653BarPriCod = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A4925BarFaseCod = "" ;
      A5169BarTipDTin = "" ;
      A5170BarTipCTin = "" ;
      A5171BarTipNTin = "" ;
      A5899BarCosttTi = DecimalUtil.ZERO ;
      A6634BarRecAcb = "" ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A10539BarAcs = "" ;
      A10540BarNprg = "" ;
      A10546BarLtsV = DecimalUtil.ZERO ;
      A11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      A11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      A11179BarColNm = "" ;
      A11762BarDispCli = "" ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      T00DP8_A3646EstTinAny = new short[1] ;
      T00DP8_A3647EstTinMes = new byte[1] ;
      T00DP8_A3648EstTinDia = new byte[1] ;
      T00DP8_A407EmprNom = new String[] {""} ;
      T00DP8_n407EmprNom = new boolean[] {false} ;
      T00DP8_A3649EstTinUL = new short[1] ;
      T00DP8_n3649EstTinUL = new boolean[] {false} ;
      T00DP8_A396EmprCod = new String[] {""} ;
      T00DP7_A407EmprNom = new String[] {""} ;
      T00DP7_n407EmprNom = new boolean[] {false} ;
      T00DP9_A407EmprNom = new String[] {""} ;
      T00DP9_n407EmprNom = new boolean[] {false} ;
      T00DP10_A396EmprCod = new String[] {""} ;
      T00DP10_A3646EstTinAny = new short[1] ;
      T00DP10_A3647EstTinMes = new byte[1] ;
      T00DP10_A3648EstTinDia = new byte[1] ;
      T00DP6_A3646EstTinAny = new short[1] ;
      T00DP6_A3647EstTinMes = new byte[1] ;
      T00DP6_A3648EstTinDia = new byte[1] ;
      T00DP6_A3649EstTinUL = new short[1] ;
      T00DP6_n3649EstTinUL = new boolean[] {false} ;
      T00DP6_A396EmprCod = new String[] {""} ;
      T00DP11_A396EmprCod = new String[] {""} ;
      T00DP11_A3646EstTinAny = new short[1] ;
      T00DP11_A3647EstTinMes = new byte[1] ;
      T00DP11_A3648EstTinDia = new byte[1] ;
      T00DP12_A396EmprCod = new String[] {""} ;
      T00DP12_A3646EstTinAny = new short[1] ;
      T00DP12_A3647EstTinMes = new byte[1] ;
      T00DP12_A3648EstTinDia = new byte[1] ;
      T00DP5_A3646EstTinAny = new short[1] ;
      T00DP5_A3647EstTinMes = new byte[1] ;
      T00DP5_A3648EstTinDia = new byte[1] ;
      T00DP5_A3649EstTinUL = new short[1] ;
      T00DP5_n3649EstTinUL = new boolean[] {false} ;
      T00DP5_A396EmprCod = new String[] {""} ;
      T00DP16_A407EmprNom = new String[] {""} ;
      T00DP16_n407EmprNom = new boolean[] {false} ;
      T00DP17_A396EmprCod = new String[] {""} ;
      T00DP17_A3646EstTinAny = new short[1] ;
      T00DP17_A3647EstTinMes = new byte[1] ;
      T00DP17_A3648EstTinDia = new byte[1] ;
      T00DP17_A1929EstTinNr = new short[1] ;
      T00DP17_A13944EstNormaId = new String[] {""} ;
      T00DP18_A396EmprCod = new String[] {""} ;
      T00DP18_A3646EstTinAny = new short[1] ;
      T00DP18_A3647EstTinMes = new byte[1] ;
      T00DP18_A3648EstTinDia = new byte[1] ;
      T00DP19_A3646EstTinAny = new short[1] ;
      T00DP19_A3647EstTinMes = new byte[1] ;
      T00DP19_A3648EstTinDia = new byte[1] ;
      T00DP19_A1929EstTinNr = new short[1] ;
      T00DP19_A1933BarCodTin = new int[1] ;
      T00DP19_n1933BarCodTin = new boolean[] {false} ;
      T00DP19_A1934BarReoTin = new byte[1] ;
      T00DP19_n1934BarReoTin = new boolean[] {false} ;
      T00DP19_A1935BarParTin = new String[] {""} ;
      T00DP19_n1935BarParTin = new boolean[] {false} ;
      T00DP19_A1936BarSerTin = new String[] {""} ;
      T00DP19_n1936BarSerTin = new boolean[] {false} ;
      T00DP19_A1937BarDscTin = new String[] {""} ;
      T00DP19_n1937BarDscTin = new boolean[] {false} ;
      T00DP19_A1939BarArtTin = new short[1] ;
      T00DP19_n1939BarArtTin = new boolean[] {false} ;
      T00DP19_A1940BarColNoT = new String[] {""} ;
      T00DP19_n1940BarColNoT = new boolean[] {false} ;
      T00DP19_A1941BarColNuT = new int[1] ;
      T00DP19_n1941BarColNuT = new boolean[] {false} ;
      T00DP19_A1942BarTipCoT = new byte[1] ;
      T00DP19_n1942BarTipCoT = new boolean[] {false} ;
      T00DP19_A1943BarNomClT = new String[] {""} ;
      T00DP19_n1943BarNomClT = new boolean[] {false} ;
      T00DP19_A1944BarNumClT = new int[1] ;
      T00DP19_n1944BarNumClT = new boolean[] {false} ;
      T00DP19_A1945BarMaqTin = new String[] {""} ;
      T00DP19_n1945BarMaqTin = new boolean[] {false} ;
      T00DP19_A1946BarVolTin = new int[1] ;
      T00DP19_n1946BarVolTin = new boolean[] {false} ;
      T00DP19_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n1947BarKgmTin = new boolean[] {false} ;
      T00DP19_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n1948BarMtrTin = new boolean[] {false} ;
      T00DP19_A1949BarPieTin = new int[1] ;
      T00DP19_n1949BarPieTin = new boolean[] {false} ;
      T00DP19_A2304BarEstTin = new byte[1] ;
      T00DP19_n2304BarEstTin = new boolean[] {false} ;
      T00DP19_A2316BarAgrLot = new String[] {""} ;
      T00DP19_n2316BarAgrLot = new boolean[] {false} ;
      T00DP19_A3650BarNumAna = new short[1] ;
      T00DP19_n3650BarNumAna = new boolean[] {false} ;
      T00DP19_A3651BarTipDef = new short[1] ;
      T00DP19_n3651BarTipDef = new boolean[] {false} ;
      T00DP19_A3652BarIntens = new byte[1] ;
      T00DP19_n3652BarIntens = new boolean[] {false} ;
      T00DP19_A3653BarPriCod = new String[] {""} ;
      T00DP19_n3653BarPriCod = new boolean[] {false} ;
      T00DP19_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n3654BarCosPD = new boolean[] {false} ;
      T00DP19_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n3658BarCosPA = new boolean[] {false} ;
      T00DP19_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n3656BarCosAD = new boolean[] {false} ;
      T00DP19_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n3657BarCosAA = new boolean[] {false} ;
      T00DP19_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n3705BarCosCol = new boolean[] {false} ;
      T00DP19_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n3706BarCosAnc = new boolean[] {false} ;
      T00DP19_A4923BarNumActx = new short[1] ;
      T00DP19_n4923BarNumActx = new boolean[] {false} ;
      T00DP19_A4924BarNumPda = new int[1] ;
      T00DP19_n4924BarNumPda = new boolean[] {false} ;
      T00DP19_A4925BarFaseCod = new String[] {""} ;
      T00DP19_n4925BarFaseCod = new boolean[] {false} ;
      T00DP19_A4926BarFaseOrd = new short[1] ;
      T00DP19_n4926BarFaseOrd = new boolean[] {false} ;
      T00DP19_A4977BarReoNum = new short[1] ;
      T00DP19_n4977BarReoNum = new boolean[] {false} ;
      T00DP19_A5169BarTipDTin = new String[] {""} ;
      T00DP19_n5169BarTipDTin = new boolean[] {false} ;
      T00DP19_A5170BarTipCTin = new String[] {""} ;
      T00DP19_n5170BarTipCTin = new boolean[] {false} ;
      T00DP19_A5171BarTipNTin = new String[] {""} ;
      T00DP19_n5171BarTipNTin = new boolean[] {false} ;
      T00DP19_A5899BarCosttTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n5899BarCosttTi = new boolean[] {false} ;
      T00DP19_A5900BarRbTeo = new short[1] ;
      T00DP19_n5900BarRbTeo = new boolean[] {false} ;
      T00DP19_A6177BarNumTin = new int[1] ;
      T00DP19_n6177BarNumTin = new boolean[] {false} ;
      T00DP19_A6431BarCausa = new short[1] ;
      T00DP19_n6431BarCausa = new boolean[] {false} ;
      T00DP19_A6634BarRecAcb = new String[] {""} ;
      T00DP19_n6634BarRecAcb = new boolean[] {false} ;
      T00DP19_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n8563BarKgsTt = new boolean[] {false} ;
      T00DP19_A8584FamCodT = new short[1] ;
      T00DP19_n8584FamCodT = new boolean[] {false} ;
      T00DP19_A8609BarForNum = new int[1] ;
      T00DP19_n8609BarForNum = new boolean[] {false} ;
      T00DP19_A9754BarNTint = new byte[1] ;
      T00DP19_n9754BarNTint = new boolean[] {false} ;
      T00DP19_A10539BarAcs = new String[] {""} ;
      T00DP19_n10539BarAcs = new boolean[] {false} ;
      T00DP19_A10540BarNprg = new String[] {""} ;
      T00DP19_n10540BarNprg = new boolean[] {false} ;
      T00DP19_A10541BarLts = new int[1] ;
      T00DP19_n10541BarLts = new boolean[] {false} ;
      T00DP19_A10546BarLtsV = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n10546BarLtsV = new boolean[] {false} ;
      T00DP19_A11177BarFecIt = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP19_n11177BarFecIt = new boolean[] {false} ;
      T00DP19_A11178BarFecFt = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP19_n11178BarFecFt = new boolean[] {false} ;
      T00DP19_A11179BarColNm = new String[] {""} ;
      T00DP19_n11179BarColNm = new boolean[] {false} ;
      T00DP19_A11762BarDispCli = new String[] {""} ;
      T00DP19_n11762BarDispCli = new boolean[] {false} ;
      T00DP19_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP19_n12993BarMtsTt = new boolean[] {false} ;
      T00DP19_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP19_A13760EstCdn1 = new short[1] ;
      T00DP19_A13761EstCdn2 = new String[] {""} ;
      T00DP19_A13762EstCtw = new String[] {""} ;
      T00DP19_A396EmprCod = new String[] {""} ;
      T00DP19_A252CliCod = new int[1] ;
      T00DP4_A396EmprCod = new String[] {""} ;
      T00DP20_A396EmprCod = new String[] {""} ;
      T00DP21_A396EmprCod = new String[] {""} ;
      T00DP21_A3646EstTinAny = new short[1] ;
      T00DP21_A3647EstTinMes = new byte[1] ;
      T00DP21_A3648EstTinDia = new byte[1] ;
      T00DP21_A1929EstTinNr = new short[1] ;
      T00DP3_A3646EstTinAny = new short[1] ;
      T00DP3_A3647EstTinMes = new byte[1] ;
      T00DP3_A3648EstTinDia = new byte[1] ;
      T00DP3_A1929EstTinNr = new short[1] ;
      T00DP3_A1933BarCodTin = new int[1] ;
      T00DP3_n1933BarCodTin = new boolean[] {false} ;
      T00DP3_A1934BarReoTin = new byte[1] ;
      T00DP3_n1934BarReoTin = new boolean[] {false} ;
      T00DP3_A1935BarParTin = new String[] {""} ;
      T00DP3_n1935BarParTin = new boolean[] {false} ;
      T00DP3_A1936BarSerTin = new String[] {""} ;
      T00DP3_n1936BarSerTin = new boolean[] {false} ;
      T00DP3_A1937BarDscTin = new String[] {""} ;
      T00DP3_n1937BarDscTin = new boolean[] {false} ;
      T00DP3_A1939BarArtTin = new short[1] ;
      T00DP3_n1939BarArtTin = new boolean[] {false} ;
      T00DP3_A1940BarColNoT = new String[] {""} ;
      T00DP3_n1940BarColNoT = new boolean[] {false} ;
      T00DP3_A1941BarColNuT = new int[1] ;
      T00DP3_n1941BarColNuT = new boolean[] {false} ;
      T00DP3_A1942BarTipCoT = new byte[1] ;
      T00DP3_n1942BarTipCoT = new boolean[] {false} ;
      T00DP3_A1943BarNomClT = new String[] {""} ;
      T00DP3_n1943BarNomClT = new boolean[] {false} ;
      T00DP3_A1944BarNumClT = new int[1] ;
      T00DP3_n1944BarNumClT = new boolean[] {false} ;
      T00DP3_A1945BarMaqTin = new String[] {""} ;
      T00DP3_n1945BarMaqTin = new boolean[] {false} ;
      T00DP3_A1946BarVolTin = new int[1] ;
      T00DP3_n1946BarVolTin = new boolean[] {false} ;
      T00DP3_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n1947BarKgmTin = new boolean[] {false} ;
      T00DP3_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n1948BarMtrTin = new boolean[] {false} ;
      T00DP3_A1949BarPieTin = new int[1] ;
      T00DP3_n1949BarPieTin = new boolean[] {false} ;
      T00DP3_A2304BarEstTin = new byte[1] ;
      T00DP3_n2304BarEstTin = new boolean[] {false} ;
      T00DP3_A2316BarAgrLot = new String[] {""} ;
      T00DP3_n2316BarAgrLot = new boolean[] {false} ;
      T00DP3_A3650BarNumAna = new short[1] ;
      T00DP3_n3650BarNumAna = new boolean[] {false} ;
      T00DP3_A3651BarTipDef = new short[1] ;
      T00DP3_n3651BarTipDef = new boolean[] {false} ;
      T00DP3_A3652BarIntens = new byte[1] ;
      T00DP3_n3652BarIntens = new boolean[] {false} ;
      T00DP3_A3653BarPriCod = new String[] {""} ;
      T00DP3_n3653BarPriCod = new boolean[] {false} ;
      T00DP3_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n3654BarCosPD = new boolean[] {false} ;
      T00DP3_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n3658BarCosPA = new boolean[] {false} ;
      T00DP3_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n3656BarCosAD = new boolean[] {false} ;
      T00DP3_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n3657BarCosAA = new boolean[] {false} ;
      T00DP3_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n3705BarCosCol = new boolean[] {false} ;
      T00DP3_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n3706BarCosAnc = new boolean[] {false} ;
      T00DP3_A4923BarNumActx = new short[1] ;
      T00DP3_n4923BarNumActx = new boolean[] {false} ;
      T00DP3_A4924BarNumPda = new int[1] ;
      T00DP3_n4924BarNumPda = new boolean[] {false} ;
      T00DP3_A4925BarFaseCod = new String[] {""} ;
      T00DP3_n4925BarFaseCod = new boolean[] {false} ;
      T00DP3_A4926BarFaseOrd = new short[1] ;
      T00DP3_n4926BarFaseOrd = new boolean[] {false} ;
      T00DP3_A4977BarReoNum = new short[1] ;
      T00DP3_n4977BarReoNum = new boolean[] {false} ;
      T00DP3_A5169BarTipDTin = new String[] {""} ;
      T00DP3_n5169BarTipDTin = new boolean[] {false} ;
      T00DP3_A5170BarTipCTin = new String[] {""} ;
      T00DP3_n5170BarTipCTin = new boolean[] {false} ;
      T00DP3_A5171BarTipNTin = new String[] {""} ;
      T00DP3_n5171BarTipNTin = new boolean[] {false} ;
      T00DP3_A5899BarCosttTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n5899BarCosttTi = new boolean[] {false} ;
      T00DP3_A5900BarRbTeo = new short[1] ;
      T00DP3_n5900BarRbTeo = new boolean[] {false} ;
      T00DP3_A6177BarNumTin = new int[1] ;
      T00DP3_n6177BarNumTin = new boolean[] {false} ;
      T00DP3_A6431BarCausa = new short[1] ;
      T00DP3_n6431BarCausa = new boolean[] {false} ;
      T00DP3_A6634BarRecAcb = new String[] {""} ;
      T00DP3_n6634BarRecAcb = new boolean[] {false} ;
      T00DP3_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n8563BarKgsTt = new boolean[] {false} ;
      T00DP3_A8584FamCodT = new short[1] ;
      T00DP3_n8584FamCodT = new boolean[] {false} ;
      T00DP3_A8609BarForNum = new int[1] ;
      T00DP3_n8609BarForNum = new boolean[] {false} ;
      T00DP3_A9754BarNTint = new byte[1] ;
      T00DP3_n9754BarNTint = new boolean[] {false} ;
      T00DP3_A10539BarAcs = new String[] {""} ;
      T00DP3_n10539BarAcs = new boolean[] {false} ;
      T00DP3_A10540BarNprg = new String[] {""} ;
      T00DP3_n10540BarNprg = new boolean[] {false} ;
      T00DP3_A10541BarLts = new int[1] ;
      T00DP3_n10541BarLts = new boolean[] {false} ;
      T00DP3_A10546BarLtsV = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n10546BarLtsV = new boolean[] {false} ;
      T00DP3_A11177BarFecIt = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP3_n11177BarFecIt = new boolean[] {false} ;
      T00DP3_A11178BarFecFt = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP3_n11178BarFecFt = new boolean[] {false} ;
      T00DP3_A11179BarColNm = new String[] {""} ;
      T00DP3_n11179BarColNm = new boolean[] {false} ;
      T00DP3_A11762BarDispCli = new String[] {""} ;
      T00DP3_n11762BarDispCli = new boolean[] {false} ;
      T00DP3_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP3_n12993BarMtsTt = new boolean[] {false} ;
      T00DP3_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP3_A13760EstCdn1 = new short[1] ;
      T00DP3_A13761EstCdn2 = new String[] {""} ;
      T00DP3_A13762EstCtw = new String[] {""} ;
      T00DP3_A396EmprCod = new String[] {""} ;
      T00DP3_A252CliCod = new int[1] ;
      T00DP2_A3646EstTinAny = new short[1] ;
      T00DP2_A3647EstTinMes = new byte[1] ;
      T00DP2_A3648EstTinDia = new byte[1] ;
      T00DP2_A1929EstTinNr = new short[1] ;
      T00DP2_A1933BarCodTin = new int[1] ;
      T00DP2_n1933BarCodTin = new boolean[] {false} ;
      T00DP2_A1934BarReoTin = new byte[1] ;
      T00DP2_n1934BarReoTin = new boolean[] {false} ;
      T00DP2_A1935BarParTin = new String[] {""} ;
      T00DP2_n1935BarParTin = new boolean[] {false} ;
      T00DP2_A1936BarSerTin = new String[] {""} ;
      T00DP2_n1936BarSerTin = new boolean[] {false} ;
      T00DP2_A1937BarDscTin = new String[] {""} ;
      T00DP2_n1937BarDscTin = new boolean[] {false} ;
      T00DP2_A1939BarArtTin = new short[1] ;
      T00DP2_n1939BarArtTin = new boolean[] {false} ;
      T00DP2_A1940BarColNoT = new String[] {""} ;
      T00DP2_n1940BarColNoT = new boolean[] {false} ;
      T00DP2_A1941BarColNuT = new int[1] ;
      T00DP2_n1941BarColNuT = new boolean[] {false} ;
      T00DP2_A1942BarTipCoT = new byte[1] ;
      T00DP2_n1942BarTipCoT = new boolean[] {false} ;
      T00DP2_A1943BarNomClT = new String[] {""} ;
      T00DP2_n1943BarNomClT = new boolean[] {false} ;
      T00DP2_A1944BarNumClT = new int[1] ;
      T00DP2_n1944BarNumClT = new boolean[] {false} ;
      T00DP2_A1945BarMaqTin = new String[] {""} ;
      T00DP2_n1945BarMaqTin = new boolean[] {false} ;
      T00DP2_A1946BarVolTin = new int[1] ;
      T00DP2_n1946BarVolTin = new boolean[] {false} ;
      T00DP2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n1947BarKgmTin = new boolean[] {false} ;
      T00DP2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n1948BarMtrTin = new boolean[] {false} ;
      T00DP2_A1949BarPieTin = new int[1] ;
      T00DP2_n1949BarPieTin = new boolean[] {false} ;
      T00DP2_A2304BarEstTin = new byte[1] ;
      T00DP2_n2304BarEstTin = new boolean[] {false} ;
      T00DP2_A2316BarAgrLot = new String[] {""} ;
      T00DP2_n2316BarAgrLot = new boolean[] {false} ;
      T00DP2_A3650BarNumAna = new short[1] ;
      T00DP2_n3650BarNumAna = new boolean[] {false} ;
      T00DP2_A3651BarTipDef = new short[1] ;
      T00DP2_n3651BarTipDef = new boolean[] {false} ;
      T00DP2_A3652BarIntens = new byte[1] ;
      T00DP2_n3652BarIntens = new boolean[] {false} ;
      T00DP2_A3653BarPriCod = new String[] {""} ;
      T00DP2_n3653BarPriCod = new boolean[] {false} ;
      T00DP2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n3654BarCosPD = new boolean[] {false} ;
      T00DP2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n3658BarCosPA = new boolean[] {false} ;
      T00DP2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n3656BarCosAD = new boolean[] {false} ;
      T00DP2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n3657BarCosAA = new boolean[] {false} ;
      T00DP2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n3705BarCosCol = new boolean[] {false} ;
      T00DP2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n3706BarCosAnc = new boolean[] {false} ;
      T00DP2_A4923BarNumActx = new short[1] ;
      T00DP2_n4923BarNumActx = new boolean[] {false} ;
      T00DP2_A4924BarNumPda = new int[1] ;
      T00DP2_n4924BarNumPda = new boolean[] {false} ;
      T00DP2_A4925BarFaseCod = new String[] {""} ;
      T00DP2_n4925BarFaseCod = new boolean[] {false} ;
      T00DP2_A4926BarFaseOrd = new short[1] ;
      T00DP2_n4926BarFaseOrd = new boolean[] {false} ;
      T00DP2_A4977BarReoNum = new short[1] ;
      T00DP2_n4977BarReoNum = new boolean[] {false} ;
      T00DP2_A5169BarTipDTin = new String[] {""} ;
      T00DP2_n5169BarTipDTin = new boolean[] {false} ;
      T00DP2_A5170BarTipCTin = new String[] {""} ;
      T00DP2_n5170BarTipCTin = new boolean[] {false} ;
      T00DP2_A5171BarTipNTin = new String[] {""} ;
      T00DP2_n5171BarTipNTin = new boolean[] {false} ;
      T00DP2_A5899BarCosttTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n5899BarCosttTi = new boolean[] {false} ;
      T00DP2_A5900BarRbTeo = new short[1] ;
      T00DP2_n5900BarRbTeo = new boolean[] {false} ;
      T00DP2_A6177BarNumTin = new int[1] ;
      T00DP2_n6177BarNumTin = new boolean[] {false} ;
      T00DP2_A6431BarCausa = new short[1] ;
      T00DP2_n6431BarCausa = new boolean[] {false} ;
      T00DP2_A6634BarRecAcb = new String[] {""} ;
      T00DP2_n6634BarRecAcb = new boolean[] {false} ;
      T00DP2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n8563BarKgsTt = new boolean[] {false} ;
      T00DP2_A8584FamCodT = new short[1] ;
      T00DP2_n8584FamCodT = new boolean[] {false} ;
      T00DP2_A8609BarForNum = new int[1] ;
      T00DP2_n8609BarForNum = new boolean[] {false} ;
      T00DP2_A9754BarNTint = new byte[1] ;
      T00DP2_n9754BarNTint = new boolean[] {false} ;
      T00DP2_A10539BarAcs = new String[] {""} ;
      T00DP2_n10539BarAcs = new boolean[] {false} ;
      T00DP2_A10540BarNprg = new String[] {""} ;
      T00DP2_n10540BarNprg = new boolean[] {false} ;
      T00DP2_A10541BarLts = new int[1] ;
      T00DP2_n10541BarLts = new boolean[] {false} ;
      T00DP2_A10546BarLtsV = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n10546BarLtsV = new boolean[] {false} ;
      T00DP2_A11177BarFecIt = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP2_n11177BarFecIt = new boolean[] {false} ;
      T00DP2_A11178BarFecFt = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP2_n11178BarFecFt = new boolean[] {false} ;
      T00DP2_A11179BarColNm = new String[] {""} ;
      T00DP2_n11179BarColNm = new boolean[] {false} ;
      T00DP2_A11762BarDispCli = new String[] {""} ;
      T00DP2_n11762BarDispCli = new boolean[] {false} ;
      T00DP2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00DP2_n12993BarMtsTt = new boolean[] {false} ;
      T00DP2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      T00DP2_A13760EstCdn1 = new short[1] ;
      T00DP2_A13761EstCdn2 = new String[] {""} ;
      T00DP2_A13762EstCtw = new String[] {""} ;
      T00DP2_A396EmprCod = new String[] {""} ;
      T00DP2_A252CliCod = new int[1] ;
      T00DP25_A396EmprCod = new String[] {""} ;
      T00DP25_A3646EstTinAny = new short[1] ;
      T00DP25_A3647EstTinMes = new byte[1] ;
      T00DP25_A3648EstTinDia = new byte[1] ;
      T00DP25_A1929EstTinNr = new short[1] ;
      T00DP25_A13944EstNormaId = new String[] {""} ;
      T00DP26_A396EmprCod = new String[] {""} ;
      T00DP26_A3646EstTinAny = new short[1] ;
      T00DP26_A3647EstTinMes = new byte[1] ;
      T00DP26_A3648EstTinDia = new byte[1] ;
      T00DP26_A1929EstTinNr = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      T00DP27_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcontin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcontin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcontin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcontin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcontin__default(),
         new Object[] {
             new Object[] {
            T00DP2_A3646EstTinAny, T00DP2_A3647EstTinMes, T00DP2_A3648EstTinDia, T00DP2_A1929EstTinNr, T00DP2_A1933BarCodTin, T00DP2_n1933BarCodTin, T00DP2_A1934BarReoTin, T00DP2_n1934BarReoTin, T00DP2_A1935BarParTin, T00DP2_n1935BarParTin,
            T00DP2_A1936BarSerTin, T00DP2_n1936BarSerTin, T00DP2_A1937BarDscTin, T00DP2_n1937BarDscTin, T00DP2_A1939BarArtTin, T00DP2_n1939BarArtTin, T00DP2_A1940BarColNoT, T00DP2_n1940BarColNoT, T00DP2_A1941BarColNuT, T00DP2_n1941BarColNuT,
            T00DP2_A1942BarTipCoT, T00DP2_n1942BarTipCoT, T00DP2_A1943BarNomClT, T00DP2_n1943BarNomClT, T00DP2_A1944BarNumClT, T00DP2_n1944BarNumClT, T00DP2_A1945BarMaqTin, T00DP2_n1945BarMaqTin, T00DP2_A1946BarVolTin, T00DP2_n1946BarVolTin,
            T00DP2_A1947BarKgmTin, T00DP2_n1947BarKgmTin, T00DP2_A1948BarMtrTin, T00DP2_n1948BarMtrTin, T00DP2_A1949BarPieTin, T00DP2_n1949BarPieTin, T00DP2_A2304BarEstTin, T00DP2_n2304BarEstTin, T00DP2_A2316BarAgrLot, T00DP2_n2316BarAgrLot,
            T00DP2_A3650BarNumAna, T00DP2_n3650BarNumAna, T00DP2_A3651BarTipDef, T00DP2_n3651BarTipDef, T00DP2_A3652BarIntens, T00DP2_n3652BarIntens, T00DP2_A3653BarPriCod, T00DP2_n3653BarPriCod, T00DP2_A3654BarCosPD, T00DP2_n3654BarCosPD,
            T00DP2_A3658BarCosPA, T00DP2_n3658BarCosPA, T00DP2_A3656BarCosAD, T00DP2_n3656BarCosAD, T00DP2_A3657BarCosAA, T00DP2_n3657BarCosAA, T00DP2_A3705BarCosCol, T00DP2_n3705BarCosCol, T00DP2_A3706BarCosAnc, T00DP2_n3706BarCosAnc,
            T00DP2_A4923BarNumActx, T00DP2_n4923BarNumActx, T00DP2_A4924BarNumPda, T00DP2_n4924BarNumPda, T00DP2_A4925BarFaseCod, T00DP2_n4925BarFaseCod, T00DP2_A4926BarFaseOrd, T00DP2_n4926BarFaseOrd, T00DP2_A4977BarReoNum, T00DP2_n4977BarReoNum,
            T00DP2_A5169BarTipDTin, T00DP2_n5169BarTipDTin, T00DP2_A5170BarTipCTin, T00DP2_n5170BarTipCTin, T00DP2_A5171BarTipNTin, T00DP2_n5171BarTipNTin, T00DP2_A5899BarCosttTi, T00DP2_n5899BarCosttTi, T00DP2_A5900BarRbTeo, T00DP2_n5900BarRbTeo,
            T00DP2_A6177BarNumTin, T00DP2_n6177BarNumTin, T00DP2_A6431BarCausa, T00DP2_n6431BarCausa, T00DP2_A6634BarRecAcb, T00DP2_n6634BarRecAcb, T00DP2_A8563BarKgsTt, T00DP2_n8563BarKgsTt, T00DP2_A8584FamCodT, T00DP2_n8584FamCodT,
            T00DP2_A8609BarForNum, T00DP2_n8609BarForNum, T00DP2_A9754BarNTint, T00DP2_n9754BarNTint, T00DP2_A10539BarAcs, T00DP2_n10539BarAcs, T00DP2_A10540BarNprg, T00DP2_n10540BarNprg, T00DP2_A10541BarLts, T00DP2_n10541BarLts,
            T00DP2_A10546BarLtsV, T00DP2_n10546BarLtsV, T00DP2_A11177BarFecIt, T00DP2_n11177BarFecIt, T00DP2_A11178BarFecFt, T00DP2_n11178BarFecFt, T00DP2_A11179BarColNm, T00DP2_n11179BarColNm, T00DP2_A11762BarDispCli, T00DP2_n11762BarDispCli,
            T00DP2_A12993BarMtsTt, T00DP2_n12993BarMtsTt, T00DP2_A13759EstFecCier, T00DP2_A13760EstCdn1, T00DP2_A13761EstCdn2, T00DP2_A13762EstCtw, T00DP2_A396EmprCod, T00DP2_A252CliCod
            }
            , new Object[] {
            T00DP3_A3646EstTinAny, T00DP3_A3647EstTinMes, T00DP3_A3648EstTinDia, T00DP3_A1929EstTinNr, T00DP3_A1933BarCodTin, T00DP3_n1933BarCodTin, T00DP3_A1934BarReoTin, T00DP3_n1934BarReoTin, T00DP3_A1935BarParTin, T00DP3_n1935BarParTin,
            T00DP3_A1936BarSerTin, T00DP3_n1936BarSerTin, T00DP3_A1937BarDscTin, T00DP3_n1937BarDscTin, T00DP3_A1939BarArtTin, T00DP3_n1939BarArtTin, T00DP3_A1940BarColNoT, T00DP3_n1940BarColNoT, T00DP3_A1941BarColNuT, T00DP3_n1941BarColNuT,
            T00DP3_A1942BarTipCoT, T00DP3_n1942BarTipCoT, T00DP3_A1943BarNomClT, T00DP3_n1943BarNomClT, T00DP3_A1944BarNumClT, T00DP3_n1944BarNumClT, T00DP3_A1945BarMaqTin, T00DP3_n1945BarMaqTin, T00DP3_A1946BarVolTin, T00DP3_n1946BarVolTin,
            T00DP3_A1947BarKgmTin, T00DP3_n1947BarKgmTin, T00DP3_A1948BarMtrTin, T00DP3_n1948BarMtrTin, T00DP3_A1949BarPieTin, T00DP3_n1949BarPieTin, T00DP3_A2304BarEstTin, T00DP3_n2304BarEstTin, T00DP3_A2316BarAgrLot, T00DP3_n2316BarAgrLot,
            T00DP3_A3650BarNumAna, T00DP3_n3650BarNumAna, T00DP3_A3651BarTipDef, T00DP3_n3651BarTipDef, T00DP3_A3652BarIntens, T00DP3_n3652BarIntens, T00DP3_A3653BarPriCod, T00DP3_n3653BarPriCod, T00DP3_A3654BarCosPD, T00DP3_n3654BarCosPD,
            T00DP3_A3658BarCosPA, T00DP3_n3658BarCosPA, T00DP3_A3656BarCosAD, T00DP3_n3656BarCosAD, T00DP3_A3657BarCosAA, T00DP3_n3657BarCosAA, T00DP3_A3705BarCosCol, T00DP3_n3705BarCosCol, T00DP3_A3706BarCosAnc, T00DP3_n3706BarCosAnc,
            T00DP3_A4923BarNumActx, T00DP3_n4923BarNumActx, T00DP3_A4924BarNumPda, T00DP3_n4924BarNumPda, T00DP3_A4925BarFaseCod, T00DP3_n4925BarFaseCod, T00DP3_A4926BarFaseOrd, T00DP3_n4926BarFaseOrd, T00DP3_A4977BarReoNum, T00DP3_n4977BarReoNum,
            T00DP3_A5169BarTipDTin, T00DP3_n5169BarTipDTin, T00DP3_A5170BarTipCTin, T00DP3_n5170BarTipCTin, T00DP3_A5171BarTipNTin, T00DP3_n5171BarTipNTin, T00DP3_A5899BarCosttTi, T00DP3_n5899BarCosttTi, T00DP3_A5900BarRbTeo, T00DP3_n5900BarRbTeo,
            T00DP3_A6177BarNumTin, T00DP3_n6177BarNumTin, T00DP3_A6431BarCausa, T00DP3_n6431BarCausa, T00DP3_A6634BarRecAcb, T00DP3_n6634BarRecAcb, T00DP3_A8563BarKgsTt, T00DP3_n8563BarKgsTt, T00DP3_A8584FamCodT, T00DP3_n8584FamCodT,
            T00DP3_A8609BarForNum, T00DP3_n8609BarForNum, T00DP3_A9754BarNTint, T00DP3_n9754BarNTint, T00DP3_A10539BarAcs, T00DP3_n10539BarAcs, T00DP3_A10540BarNprg, T00DP3_n10540BarNprg, T00DP3_A10541BarLts, T00DP3_n10541BarLts,
            T00DP3_A10546BarLtsV, T00DP3_n10546BarLtsV, T00DP3_A11177BarFecIt, T00DP3_n11177BarFecIt, T00DP3_A11178BarFecFt, T00DP3_n11178BarFecFt, T00DP3_A11179BarColNm, T00DP3_n11179BarColNm, T00DP3_A11762BarDispCli, T00DP3_n11762BarDispCli,
            T00DP3_A12993BarMtsTt, T00DP3_n12993BarMtsTt, T00DP3_A13759EstFecCier, T00DP3_A13760EstCdn1, T00DP3_A13761EstCdn2, T00DP3_A13762EstCtw, T00DP3_A396EmprCod, T00DP3_A252CliCod
            }
            , new Object[] {
            T00DP4_A396EmprCod
            }
            , new Object[] {
            T00DP5_A3646EstTinAny, T00DP5_A3647EstTinMes, T00DP5_A3648EstTinDia, T00DP5_A3649EstTinUL, T00DP5_n3649EstTinUL, T00DP5_A396EmprCod
            }
            , new Object[] {
            T00DP6_A3646EstTinAny, T00DP6_A3647EstTinMes, T00DP6_A3648EstTinDia, T00DP6_A3649EstTinUL, T00DP6_n3649EstTinUL, T00DP6_A396EmprCod
            }
            , new Object[] {
            T00DP7_A407EmprNom, T00DP7_n407EmprNom
            }
            , new Object[] {
            T00DP8_A3646EstTinAny, T00DP8_A3647EstTinMes, T00DP8_A3648EstTinDia, T00DP8_A407EmprNom, T00DP8_n407EmprNom, T00DP8_A3649EstTinUL, T00DP8_n3649EstTinUL, T00DP8_A396EmprCod
            }
            , new Object[] {
            T00DP9_A407EmprNom, T00DP9_n407EmprNom
            }
            , new Object[] {
            T00DP10_A396EmprCod, T00DP10_A3646EstTinAny, T00DP10_A3647EstTinMes, T00DP10_A3648EstTinDia
            }
            , new Object[] {
            T00DP11_A396EmprCod, T00DP11_A3646EstTinAny, T00DP11_A3647EstTinMes, T00DP11_A3648EstTinDia
            }
            , new Object[] {
            T00DP12_A396EmprCod, T00DP12_A3646EstTinAny, T00DP12_A3647EstTinMes, T00DP12_A3648EstTinDia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00DP16_A407EmprNom, T00DP16_n407EmprNom
            }
            , new Object[] {
            T00DP17_A396EmprCod, T00DP17_A3646EstTinAny, T00DP17_A3647EstTinMes, T00DP17_A3648EstTinDia, T00DP17_A1929EstTinNr, T00DP17_A13944EstNormaId
            }
            , new Object[] {
            T00DP18_A396EmprCod, T00DP18_A3646EstTinAny, T00DP18_A3647EstTinMes, T00DP18_A3648EstTinDia
            }
            , new Object[] {
            T00DP19_A3646EstTinAny, T00DP19_A3647EstTinMes, T00DP19_A3648EstTinDia, T00DP19_A1929EstTinNr, T00DP19_A1933BarCodTin, T00DP19_n1933BarCodTin, T00DP19_A1934BarReoTin, T00DP19_n1934BarReoTin, T00DP19_A1935BarParTin, T00DP19_n1935BarParTin,
            T00DP19_A1936BarSerTin, T00DP19_n1936BarSerTin, T00DP19_A1937BarDscTin, T00DP19_n1937BarDscTin, T00DP19_A1939BarArtTin, T00DP19_n1939BarArtTin, T00DP19_A1940BarColNoT, T00DP19_n1940BarColNoT, T00DP19_A1941BarColNuT, T00DP19_n1941BarColNuT,
            T00DP19_A1942BarTipCoT, T00DP19_n1942BarTipCoT, T00DP19_A1943BarNomClT, T00DP19_n1943BarNomClT, T00DP19_A1944BarNumClT, T00DP19_n1944BarNumClT, T00DP19_A1945BarMaqTin, T00DP19_n1945BarMaqTin, T00DP19_A1946BarVolTin, T00DP19_n1946BarVolTin,
            T00DP19_A1947BarKgmTin, T00DP19_n1947BarKgmTin, T00DP19_A1948BarMtrTin, T00DP19_n1948BarMtrTin, T00DP19_A1949BarPieTin, T00DP19_n1949BarPieTin, T00DP19_A2304BarEstTin, T00DP19_n2304BarEstTin, T00DP19_A2316BarAgrLot, T00DP19_n2316BarAgrLot,
            T00DP19_A3650BarNumAna, T00DP19_n3650BarNumAna, T00DP19_A3651BarTipDef, T00DP19_n3651BarTipDef, T00DP19_A3652BarIntens, T00DP19_n3652BarIntens, T00DP19_A3653BarPriCod, T00DP19_n3653BarPriCod, T00DP19_A3654BarCosPD, T00DP19_n3654BarCosPD,
            T00DP19_A3658BarCosPA, T00DP19_n3658BarCosPA, T00DP19_A3656BarCosAD, T00DP19_n3656BarCosAD, T00DP19_A3657BarCosAA, T00DP19_n3657BarCosAA, T00DP19_A3705BarCosCol, T00DP19_n3705BarCosCol, T00DP19_A3706BarCosAnc, T00DP19_n3706BarCosAnc,
            T00DP19_A4923BarNumActx, T00DP19_n4923BarNumActx, T00DP19_A4924BarNumPda, T00DP19_n4924BarNumPda, T00DP19_A4925BarFaseCod, T00DP19_n4925BarFaseCod, T00DP19_A4926BarFaseOrd, T00DP19_n4926BarFaseOrd, T00DP19_A4977BarReoNum, T00DP19_n4977BarReoNum,
            T00DP19_A5169BarTipDTin, T00DP19_n5169BarTipDTin, T00DP19_A5170BarTipCTin, T00DP19_n5170BarTipCTin, T00DP19_A5171BarTipNTin, T00DP19_n5171BarTipNTin, T00DP19_A5899BarCosttTi, T00DP19_n5899BarCosttTi, T00DP19_A5900BarRbTeo, T00DP19_n5900BarRbTeo,
            T00DP19_A6177BarNumTin, T00DP19_n6177BarNumTin, T00DP19_A6431BarCausa, T00DP19_n6431BarCausa, T00DP19_A6634BarRecAcb, T00DP19_n6634BarRecAcb, T00DP19_A8563BarKgsTt, T00DP19_n8563BarKgsTt, T00DP19_A8584FamCodT, T00DP19_n8584FamCodT,
            T00DP19_A8609BarForNum, T00DP19_n8609BarForNum, T00DP19_A9754BarNTint, T00DP19_n9754BarNTint, T00DP19_A10539BarAcs, T00DP19_n10539BarAcs, T00DP19_A10540BarNprg, T00DP19_n10540BarNprg, T00DP19_A10541BarLts, T00DP19_n10541BarLts,
            T00DP19_A10546BarLtsV, T00DP19_n10546BarLtsV, T00DP19_A11177BarFecIt, T00DP19_n11177BarFecIt, T00DP19_A11178BarFecFt, T00DP19_n11178BarFecFt, T00DP19_A11179BarColNm, T00DP19_n11179BarColNm, T00DP19_A11762BarDispCli, T00DP19_n11762BarDispCli,
            T00DP19_A12993BarMtsTt, T00DP19_n12993BarMtsTt, T00DP19_A13759EstFecCier, T00DP19_A13760EstCdn1, T00DP19_A13761EstCdn2, T00DP19_A13762EstCtw, T00DP19_A396EmprCod, T00DP19_A252CliCod
            }
            , new Object[] {
            T00DP20_A396EmprCod
            }
            , new Object[] {
            T00DP21_A396EmprCod, T00DP21_A3646EstTinAny, T00DP21_A3647EstTinMes, T00DP21_A3648EstTinDia, T00DP21_A1929EstTinNr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00DP25_A396EmprCod, T00DP25_A3646EstTinAny, T00DP25_A3647EstTinMes, T00DP25_A3648EstTinDia, T00DP25_A1929EstTinNr, T00DP25_A13944EstNormaId
            }
            , new Object[] {
            T00DP26_A396EmprCod, T00DP26_A3646EstTinAny, T00DP26_A3647EstTinMes, T00DP26_A3648EstTinDia, T00DP26_A1929EstTinNr
            }
            , new Object[] {
            T00DP27_A396EmprCod
            }
         }
      );
   }

   private byte Z3647EstTinMes ;
   private byte Z3648EstTinDia ;
   private byte Z1934BarReoTin ;
   private byte Z1942BarTipCoT ;
   private byte Z2304BarEstTin ;
   private byte Z3652BarIntens ;
   private byte Z9754BarNTint ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte A2304BarEstTin ;
   private byte A3652BarIntens ;
   private byte A9754BarNTint ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ3647EstTinMes ;
   private byte ZZ3648EstTinDia ;
   private short Z3646EstTinAny ;
   private short Z3649EstTinUL ;
   private short Z1929EstTinNr ;
   private short Z1939BarArtTin ;
   private short Z3650BarNumAna ;
   private short Z3651BarTipDef ;
   private short Z4923BarNumActx ;
   private short Z4926BarFaseOrd ;
   private short Z4977BarReoNum ;
   private short Z5900BarRbTeo ;
   private short Z6431BarCausa ;
   private short Z8584FamCodT ;
   private short Z13760EstCdn1 ;
   private short nRcdDeleted_510 ;
   private short nRcdExists_510 ;
   private short nIsMod_510 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3646EstTinAny ;
   private short A3649EstTinUL ;
   private short nBlankRcdCount510 ;
   private short RcdFound510 ;
   private short nBlankRcdUsr510 ;
   private short A13760EstCdn1 ;
   private short A1929EstTinNr ;
   private short A1939BarArtTin ;
   private short A3650BarNumAna ;
   private short A3651BarTipDef ;
   private short A4923BarNumActx ;
   private short A4926BarFaseOrd ;
   private short A4977BarReoNum ;
   private short A5900BarRbTeo ;
   private short A6431BarCausa ;
   private short A8584FamCodT ;
   private short RcdFound509 ;
   private short nIsDirty_509 ;
   private short nIsDirty_510 ;
   private short ZZ3646EstTinAny ;
   private short ZZ3649EstTinUL ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z1933BarCodTin ;
   private int Z1941BarColNuT ;
   private int Z1944BarNumClT ;
   private int Z1946BarVolTin ;
   private int Z1949BarPieTin ;
   private int Z4924BarNumPda ;
   private int Z6177BarNumTin ;
   private int Z8609BarForNum ;
   private int Z10541BarLts ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEstTinAny_Enabled ;
   private int edtEstTinMes_Enabled ;
   private int edtEstTinDia_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEstTinUL_Enabled ;
   private int edtavnRcdDeleted_510_Enabled ;
   private int edtEstTinNr_Enabled ;
   private int edtBarCodTin_Enabled ;
   private int edtBarReoTin_Enabled ;
   private int edtBarParTin_Enabled ;
   private int edtBarSerTin_Enabled ;
   private int edtBarDscTin_Enabled ;
   private int edtBarArtTin_Enabled ;
   private int edtBarColNoT_Enabled ;
   private int edtBarColNuT_Enabled ;
   private int edtBarTipCoT_Enabled ;
   private int edtBarNomClT_Enabled ;
   private int edtBarNumClT_Enabled ;
   private int edtBarMaqTin_Enabled ;
   private int edtBarVolTin_Enabled ;
   private int edtBarKgmTin_Enabled ;
   private int edtBarMtrTin_Enabled ;
   private int edtBarPieTin_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtBarEstTin_Enabled ;
   private int edtBarAgrLot_Enabled ;
   private int edtBarNumAna_Enabled ;
   private int edtBarTipDef_Enabled ;
   private int edtBarIntens_Enabled ;
   private int edtBarPriCod_Enabled ;
   private int edtBarCosPD_Enabled ;
   private int edtBarCosPA_Enabled ;
   private int edtBarCosAD_Enabled ;
   private int edtBarCosAA_Enabled ;
   private int edtBarCosCol_Enabled ;
   private int edtBarCosAnc_Enabled ;
   private int edtBarNumActx_Enabled ;
   private int edtBarNumPda_Enabled ;
   private int edtBarFaseCod_Enabled ;
   private int edtBarFaseOrd_Enabled ;
   private int edtBarReoNum_Enabled ;
   private int edtBarTipDTin_Enabled ;
   private int edtBarTipCTin_Enabled ;
   private int edtBarTipNTin_Enabled ;
   private int edtBarCosttTi_Enabled ;
   private int edtBarRbTeo_Enabled ;
   private int edtBarNumTin_Enabled ;
   private int edtBarCausa_Enabled ;
   private int edtBarRecAcb_Enabled ;
   private int edtBarKgsTt_Enabled ;
   private int edtFamCodT_Enabled ;
   private int edtBarForNum_Enabled ;
   private int edtBarNTint_Enabled ;
   private int edtBarAcs_Enabled ;
   private int edtBarNprg_Enabled ;
   private int edtBarLts_Enabled ;
   private int edtBarLtsV_Enabled ;
   private int edtBarFecIt_Enabled ;
   private int edtBarFecFt_Enabled ;
   private int edtBarColNm_Enabled ;
   private int edtBarDispCli_Enabled ;
   private int edtBarMtsTt_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A1933BarCodTin ;
   private int A1941BarColNuT ;
   private int A1944BarNumClT ;
   private int A1946BarVolTin ;
   private int A1949BarPieTin ;
   private int A4924BarNumPda ;
   private int A6177BarNumTin ;
   private int A8609BarForNum ;
   private int A10541BarLts ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtEstTinNr_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEstTinUL_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEstTinDia_Backcolor ;
   private int edtEstTinMes_Backcolor ;
   private int edtEstTinAny_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z1947BarKgmTin ;
   private java.math.BigDecimal Z1948BarMtrTin ;
   private java.math.BigDecimal Z3654BarCosPD ;
   private java.math.BigDecimal Z3658BarCosPA ;
   private java.math.BigDecimal Z3656BarCosAD ;
   private java.math.BigDecimal Z3657BarCosAA ;
   private java.math.BigDecimal Z3705BarCosCol ;
   private java.math.BigDecimal Z3706BarCosAnc ;
   private java.math.BigDecimal Z5899BarCosttTi ;
   private java.math.BigDecimal Z8563BarKgsTt ;
   private java.math.BigDecimal Z10546BarLtsV ;
   private java.math.BigDecimal Z12993BarMtsTt ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A5899BarCosttTi ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A10546BarLtsV ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z1935BarParTin ;
   private String Z1936BarSerTin ;
   private String Z1937BarDscTin ;
   private String Z1940BarColNoT ;
   private String Z1943BarNomClT ;
   private String Z1945BarMaqTin ;
   private String Z2316BarAgrLot ;
   private String Z3653BarPriCod ;
   private String Z4925BarFaseCod ;
   private String Z5169BarTipDTin ;
   private String Z5170BarTipCTin ;
   private String Z5171BarTipNTin ;
   private String Z6634BarRecAcb ;
   private String Z10539BarAcs ;
   private String Z10540BarNprg ;
   private String Z11179BarColNm ;
   private String Z11762BarDispCli ;
   private String Z13761EstCdn2 ;
   private String Z13762EstCtw ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEstTinAny_Internalname ;
   private String edtEstTinAny_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEstTinMes_Internalname ;
   private String edtEstTinMes_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEstTinDia_Internalname ;
   private String edtEstTinDia_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEstTinUL_Internalname ;
   private String edtEstTinUL_Jsonclick ;
   private String sMode510 ;
   private String edtavnRcdDeleted_510_Internalname ;
   private String edtEstTinNr_Internalname ;
   private String edtBarCodTin_Internalname ;
   private String edtBarReoTin_Internalname ;
   private String edtBarParTin_Internalname ;
   private String edtBarSerTin_Internalname ;
   private String edtBarDscTin_Internalname ;
   private String edtBarArtTin_Internalname ;
   private String edtBarColNoT_Internalname ;
   private String edtBarColNuT_Internalname ;
   private String edtBarTipCoT_Internalname ;
   private String edtBarNomClT_Internalname ;
   private String edtBarNumClT_Internalname ;
   private String edtBarMaqTin_Internalname ;
   private String edtBarVolTin_Internalname ;
   private String edtBarKgmTin_Internalname ;
   private String edtBarMtrTin_Internalname ;
   private String edtBarPieTin_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtBarEstTin_Internalname ;
   private String edtBarAgrLot_Internalname ;
   private String edtBarNumAna_Internalname ;
   private String edtBarTipDef_Internalname ;
   private String edtBarIntens_Internalname ;
   private String edtBarPriCod_Internalname ;
   private String edtBarCosPD_Internalname ;
   private String edtBarCosPA_Internalname ;
   private String edtBarCosAD_Internalname ;
   private String edtBarCosAA_Internalname ;
   private String edtBarCosCol_Internalname ;
   private String edtBarCosAnc_Internalname ;
   private String edtBarNumActx_Internalname ;
   private String edtBarNumPda_Internalname ;
   private String edtBarFaseCod_Internalname ;
   private String edtBarFaseOrd_Internalname ;
   private String edtBarReoNum_Internalname ;
   private String edtBarTipDTin_Internalname ;
   private String edtBarTipCTin_Internalname ;
   private String edtBarTipNTin_Internalname ;
   private String edtBarCosttTi_Internalname ;
   private String edtBarRbTeo_Internalname ;
   private String edtBarNumTin_Internalname ;
   private String edtBarCausa_Internalname ;
   private String edtBarRecAcb_Internalname ;
   private String edtBarKgsTt_Internalname ;
   private String edtFamCodT_Internalname ;
   private String edtBarForNum_Internalname ;
   private String edtBarNTint_Internalname ;
   private String edtBarAcs_Internalname ;
   private String edtBarNprg_Internalname ;
   private String edtBarLts_Internalname ;
   private String edtBarLtsV_Internalname ;
   private String edtBarFecIt_Internalname ;
   private String edtBarFecFt_Internalname ;
   private String edtBarColNm_Internalname ;
   private String edtBarDispCli_Internalname ;
   private String edtBarMtsTt_Internalname ;
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
   private String A13841Barnhdr_lc ;
   private String A13761EstCdn2 ;
   private String A13762EstCtw ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode509 ;
   private String GXCCtl ;
   private String A1935BarParTin ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A1940BarColNoT ;
   private String A1943BarNomClT ;
   private String A1945BarMaqTin ;
   private String A2316BarAgrLot ;
   private String A3653BarPriCod ;
   private String A4925BarFaseCod ;
   private String A5169BarTipDTin ;
   private String A5170BarTipCTin ;
   private String A5171BarTipNTin ;
   private String A6634BarRecAcb ;
   private String A10539BarAcs ;
   private String A10540BarNprg ;
   private String A11179BarColNm ;
   private String A11762BarDispCli ;
   private String Z407EmprNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_510_Jsonclick ;
   private String edtEstTinNr_Jsonclick ;
   private String edtBarCodTin_Jsonclick ;
   private String edtBarReoTin_Jsonclick ;
   private String edtBarParTin_Jsonclick ;
   private String edtBarSerTin_Jsonclick ;
   private String edtBarDscTin_Jsonclick ;
   private String edtBarArtTin_Jsonclick ;
   private String edtBarColNoT_Jsonclick ;
   private String edtBarColNuT_Jsonclick ;
   private String edtBarTipCoT_Jsonclick ;
   private String edtBarNomClT_Jsonclick ;
   private String edtBarNumClT_Jsonclick ;
   private String edtBarMaqTin_Jsonclick ;
   private String edtBarVolTin_Jsonclick ;
   private String edtBarKgmTin_Jsonclick ;
   private String edtBarMtrTin_Jsonclick ;
   private String edtBarPieTin_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarEstTin_Jsonclick ;
   private String edtBarAgrLot_Jsonclick ;
   private String edtBarNumAna_Jsonclick ;
   private String edtBarTipDef_Jsonclick ;
   private String edtBarIntens_Jsonclick ;
   private String edtBarPriCod_Jsonclick ;
   private String edtBarCosPD_Jsonclick ;
   private String edtBarCosPA_Jsonclick ;
   private String edtBarCosAD_Jsonclick ;
   private String edtBarCosAA_Jsonclick ;
   private String edtBarCosCol_Jsonclick ;
   private String edtBarCosAnc_Jsonclick ;
   private String edtBarNumActx_Jsonclick ;
   private String edtBarNumPda_Jsonclick ;
   private String edtBarFaseCod_Jsonclick ;
   private String edtBarFaseOrd_Jsonclick ;
   private String edtBarReoNum_Jsonclick ;
   private String edtBarTipDTin_Jsonclick ;
   private String edtBarTipCTin_Jsonclick ;
   private String edtBarTipNTin_Jsonclick ;
   private String edtBarCosttTi_Jsonclick ;
   private String edtBarRbTeo_Jsonclick ;
   private String edtBarNumTin_Jsonclick ;
   private String edtBarCausa_Jsonclick ;
   private String edtBarRecAcb_Jsonclick ;
   private String edtBarKgsTt_Jsonclick ;
   private String edtFamCodT_Jsonclick ;
   private String edtBarForNum_Jsonclick ;
   private String edtBarNTint_Jsonclick ;
   private String edtBarAcs_Jsonclick ;
   private String edtBarNprg_Jsonclick ;
   private String edtBarLts_Jsonclick ;
   private String edtBarLtsV_Jsonclick ;
   private String edtBarFecIt_Jsonclick ;
   private String edtBarFecFt_Jsonclick ;
   private String edtBarColNm_Jsonclick ;
   private String edtBarDispCli_Jsonclick ;
   private String edtBarMtsTt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z11177BarFecIt ;
   private java.util.Date Z11178BarFecFt ;
   private java.util.Date A11177BarFecIt ;
   private java.util.Date A11178BarFecFt ;
   private java.util.Date Z13759EstFecCier ;
   private java.util.Date A13759EstFecCier ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3649EstTinUL ;
   private boolean returnInSub ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private boolean n1936BarSerTin ;
   private boolean n1937BarDscTin ;
   private boolean n1939BarArtTin ;
   private boolean n1940BarColNoT ;
   private boolean n1941BarColNuT ;
   private boolean n1942BarTipCoT ;
   private boolean n1943BarNomClT ;
   private boolean n1944BarNumClT ;
   private boolean n1945BarMaqTin ;
   private boolean n1946BarVolTin ;
   private boolean n1947BarKgmTin ;
   private boolean n1948BarMtrTin ;
   private boolean n1949BarPieTin ;
   private boolean n2304BarEstTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3650BarNumAna ;
   private boolean n3651BarTipDef ;
   private boolean n3652BarIntens ;
   private boolean n3653BarPriCod ;
   private boolean n3654BarCosPD ;
   private boolean n3658BarCosPA ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n3705BarCosCol ;
   private boolean n3706BarCosAnc ;
   private boolean n4923BarNumActx ;
   private boolean n4924BarNumPda ;
   private boolean n4925BarFaseCod ;
   private boolean n4926BarFaseOrd ;
   private boolean n4977BarReoNum ;
   private boolean n5169BarTipDTin ;
   private boolean n5170BarTipCTin ;
   private boolean n5171BarTipNTin ;
   private boolean n5899BarCosttTi ;
   private boolean n5900BarRbTeo ;
   private boolean n6177BarNumTin ;
   private boolean n6431BarCausa ;
   private boolean n6634BarRecAcb ;
   private boolean n8563BarKgsTt ;
   private boolean n8584FamCodT ;
   private boolean n8609BarForNum ;
   private boolean n9754BarNTint ;
   private boolean n10539BarAcs ;
   private boolean n10540BarNprg ;
   private boolean n10541BarLts ;
   private boolean n10546BarLtsV ;
   private boolean n11177BarFecIt ;
   private boolean n11178BarFecFt ;
   private boolean n11179BarColNm ;
   private boolean n11762BarDispCli ;
   private boolean n12993BarMtsTt ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private short[] T00DP8_A3646EstTinAny ;
   private byte[] T00DP8_A3647EstTinMes ;
   private byte[] T00DP8_A3648EstTinDia ;
   private String[] T00DP8_A407EmprNom ;
   private boolean[] T00DP8_n407EmprNom ;
   private short[] T00DP8_A3649EstTinUL ;
   private boolean[] T00DP8_n3649EstTinUL ;
   private String[] T00DP8_A396EmprCod ;
   private String[] T00DP7_A407EmprNom ;
   private boolean[] T00DP7_n407EmprNom ;
   private String[] T00DP9_A407EmprNom ;
   private boolean[] T00DP9_n407EmprNom ;
   private String[] T00DP10_A396EmprCod ;
   private short[] T00DP10_A3646EstTinAny ;
   private byte[] T00DP10_A3647EstTinMes ;
   private byte[] T00DP10_A3648EstTinDia ;
   private short[] T00DP6_A3646EstTinAny ;
   private byte[] T00DP6_A3647EstTinMes ;
   private byte[] T00DP6_A3648EstTinDia ;
   private short[] T00DP6_A3649EstTinUL ;
   private boolean[] T00DP6_n3649EstTinUL ;
   private String[] T00DP6_A396EmprCod ;
   private String[] T00DP11_A396EmprCod ;
   private short[] T00DP11_A3646EstTinAny ;
   private byte[] T00DP11_A3647EstTinMes ;
   private byte[] T00DP11_A3648EstTinDia ;
   private String[] T00DP12_A396EmprCod ;
   private short[] T00DP12_A3646EstTinAny ;
   private byte[] T00DP12_A3647EstTinMes ;
   private byte[] T00DP12_A3648EstTinDia ;
   private short[] T00DP5_A3646EstTinAny ;
   private byte[] T00DP5_A3647EstTinMes ;
   private byte[] T00DP5_A3648EstTinDia ;
   private short[] T00DP5_A3649EstTinUL ;
   private boolean[] T00DP5_n3649EstTinUL ;
   private String[] T00DP5_A396EmprCod ;
   private String[] T00DP16_A407EmprNom ;
   private boolean[] T00DP16_n407EmprNom ;
   private String[] T00DP17_A396EmprCod ;
   private short[] T00DP17_A3646EstTinAny ;
   private byte[] T00DP17_A3647EstTinMes ;
   private byte[] T00DP17_A3648EstTinDia ;
   private short[] T00DP17_A1929EstTinNr ;
   private String[] T00DP17_A13944EstNormaId ;
   private String[] T00DP18_A396EmprCod ;
   private short[] T00DP18_A3646EstTinAny ;
   private byte[] T00DP18_A3647EstTinMes ;
   private byte[] T00DP18_A3648EstTinDia ;
   private short[] T00DP19_A3646EstTinAny ;
   private byte[] T00DP19_A3647EstTinMes ;
   private byte[] T00DP19_A3648EstTinDia ;
   private short[] T00DP19_A1929EstTinNr ;
   private int[] T00DP19_A1933BarCodTin ;
   private boolean[] T00DP19_n1933BarCodTin ;
   private byte[] T00DP19_A1934BarReoTin ;
   private boolean[] T00DP19_n1934BarReoTin ;
   private String[] T00DP19_A1935BarParTin ;
   private boolean[] T00DP19_n1935BarParTin ;
   private String[] T00DP19_A1936BarSerTin ;
   private boolean[] T00DP19_n1936BarSerTin ;
   private String[] T00DP19_A1937BarDscTin ;
   private boolean[] T00DP19_n1937BarDscTin ;
   private short[] T00DP19_A1939BarArtTin ;
   private boolean[] T00DP19_n1939BarArtTin ;
   private String[] T00DP19_A1940BarColNoT ;
   private boolean[] T00DP19_n1940BarColNoT ;
   private int[] T00DP19_A1941BarColNuT ;
   private boolean[] T00DP19_n1941BarColNuT ;
   private byte[] T00DP19_A1942BarTipCoT ;
   private boolean[] T00DP19_n1942BarTipCoT ;
   private String[] T00DP19_A1943BarNomClT ;
   private boolean[] T00DP19_n1943BarNomClT ;
   private int[] T00DP19_A1944BarNumClT ;
   private boolean[] T00DP19_n1944BarNumClT ;
   private String[] T00DP19_A1945BarMaqTin ;
   private boolean[] T00DP19_n1945BarMaqTin ;
   private int[] T00DP19_A1946BarVolTin ;
   private boolean[] T00DP19_n1946BarVolTin ;
   private java.math.BigDecimal[] T00DP19_A1947BarKgmTin ;
   private boolean[] T00DP19_n1947BarKgmTin ;
   private java.math.BigDecimal[] T00DP19_A1948BarMtrTin ;
   private boolean[] T00DP19_n1948BarMtrTin ;
   private int[] T00DP19_A1949BarPieTin ;
   private boolean[] T00DP19_n1949BarPieTin ;
   private byte[] T00DP19_A2304BarEstTin ;
   private boolean[] T00DP19_n2304BarEstTin ;
   private String[] T00DP19_A2316BarAgrLot ;
   private boolean[] T00DP19_n2316BarAgrLot ;
   private short[] T00DP19_A3650BarNumAna ;
   private boolean[] T00DP19_n3650BarNumAna ;
   private short[] T00DP19_A3651BarTipDef ;
   private boolean[] T00DP19_n3651BarTipDef ;
   private byte[] T00DP19_A3652BarIntens ;
   private boolean[] T00DP19_n3652BarIntens ;
   private String[] T00DP19_A3653BarPriCod ;
   private boolean[] T00DP19_n3653BarPriCod ;
   private java.math.BigDecimal[] T00DP19_A3654BarCosPD ;
   private boolean[] T00DP19_n3654BarCosPD ;
   private java.math.BigDecimal[] T00DP19_A3658BarCosPA ;
   private boolean[] T00DP19_n3658BarCosPA ;
   private java.math.BigDecimal[] T00DP19_A3656BarCosAD ;
   private boolean[] T00DP19_n3656BarCosAD ;
   private java.math.BigDecimal[] T00DP19_A3657BarCosAA ;
   private boolean[] T00DP19_n3657BarCosAA ;
   private java.math.BigDecimal[] T00DP19_A3705BarCosCol ;
   private boolean[] T00DP19_n3705BarCosCol ;
   private java.math.BigDecimal[] T00DP19_A3706BarCosAnc ;
   private boolean[] T00DP19_n3706BarCosAnc ;
   private short[] T00DP19_A4923BarNumActx ;
   private boolean[] T00DP19_n4923BarNumActx ;
   private int[] T00DP19_A4924BarNumPda ;
   private boolean[] T00DP19_n4924BarNumPda ;
   private String[] T00DP19_A4925BarFaseCod ;
   private boolean[] T00DP19_n4925BarFaseCod ;
   private short[] T00DP19_A4926BarFaseOrd ;
   private boolean[] T00DP19_n4926BarFaseOrd ;
   private short[] T00DP19_A4977BarReoNum ;
   private boolean[] T00DP19_n4977BarReoNum ;
   private String[] T00DP19_A5169BarTipDTin ;
   private boolean[] T00DP19_n5169BarTipDTin ;
   private String[] T00DP19_A5170BarTipCTin ;
   private boolean[] T00DP19_n5170BarTipCTin ;
   private String[] T00DP19_A5171BarTipNTin ;
   private boolean[] T00DP19_n5171BarTipNTin ;
   private java.math.BigDecimal[] T00DP19_A5899BarCosttTi ;
   private boolean[] T00DP19_n5899BarCosttTi ;
   private short[] T00DP19_A5900BarRbTeo ;
   private boolean[] T00DP19_n5900BarRbTeo ;
   private int[] T00DP19_A6177BarNumTin ;
   private boolean[] T00DP19_n6177BarNumTin ;
   private short[] T00DP19_A6431BarCausa ;
   private boolean[] T00DP19_n6431BarCausa ;
   private String[] T00DP19_A6634BarRecAcb ;
   private boolean[] T00DP19_n6634BarRecAcb ;
   private java.math.BigDecimal[] T00DP19_A8563BarKgsTt ;
   private boolean[] T00DP19_n8563BarKgsTt ;
   private short[] T00DP19_A8584FamCodT ;
   private boolean[] T00DP19_n8584FamCodT ;
   private int[] T00DP19_A8609BarForNum ;
   private boolean[] T00DP19_n8609BarForNum ;
   private byte[] T00DP19_A9754BarNTint ;
   private boolean[] T00DP19_n9754BarNTint ;
   private String[] T00DP19_A10539BarAcs ;
   private boolean[] T00DP19_n10539BarAcs ;
   private String[] T00DP19_A10540BarNprg ;
   private boolean[] T00DP19_n10540BarNprg ;
   private int[] T00DP19_A10541BarLts ;
   private boolean[] T00DP19_n10541BarLts ;
   private java.math.BigDecimal[] T00DP19_A10546BarLtsV ;
   private boolean[] T00DP19_n10546BarLtsV ;
   private java.util.Date[] T00DP19_A11177BarFecIt ;
   private boolean[] T00DP19_n11177BarFecIt ;
   private java.util.Date[] T00DP19_A11178BarFecFt ;
   private boolean[] T00DP19_n11178BarFecFt ;
   private String[] T00DP19_A11179BarColNm ;
   private boolean[] T00DP19_n11179BarColNm ;
   private String[] T00DP19_A11762BarDispCli ;
   private boolean[] T00DP19_n11762BarDispCli ;
   private java.math.BigDecimal[] T00DP19_A12993BarMtsTt ;
   private boolean[] T00DP19_n12993BarMtsTt ;
   private java.util.Date[] T00DP19_A13759EstFecCier ;
   private short[] T00DP19_A13760EstCdn1 ;
   private String[] T00DP19_A13761EstCdn2 ;
   private String[] T00DP19_A13762EstCtw ;
   private String[] T00DP19_A396EmprCod ;
   private int[] T00DP19_A252CliCod ;
   private String[] T00DP4_A396EmprCod ;
   private String[] T00DP20_A396EmprCod ;
   private String[] T00DP21_A396EmprCod ;
   private short[] T00DP21_A3646EstTinAny ;
   private byte[] T00DP21_A3647EstTinMes ;
   private byte[] T00DP21_A3648EstTinDia ;
   private short[] T00DP21_A1929EstTinNr ;
   private short[] T00DP3_A3646EstTinAny ;
   private byte[] T00DP3_A3647EstTinMes ;
   private byte[] T00DP3_A3648EstTinDia ;
   private short[] T00DP3_A1929EstTinNr ;
   private int[] T00DP3_A1933BarCodTin ;
   private boolean[] T00DP3_n1933BarCodTin ;
   private byte[] T00DP3_A1934BarReoTin ;
   private boolean[] T00DP3_n1934BarReoTin ;
   private String[] T00DP3_A1935BarParTin ;
   private boolean[] T00DP3_n1935BarParTin ;
   private String[] T00DP3_A1936BarSerTin ;
   private boolean[] T00DP3_n1936BarSerTin ;
   private String[] T00DP3_A1937BarDscTin ;
   private boolean[] T00DP3_n1937BarDscTin ;
   private short[] T00DP3_A1939BarArtTin ;
   private boolean[] T00DP3_n1939BarArtTin ;
   private String[] T00DP3_A1940BarColNoT ;
   private boolean[] T00DP3_n1940BarColNoT ;
   private int[] T00DP3_A1941BarColNuT ;
   private boolean[] T00DP3_n1941BarColNuT ;
   private byte[] T00DP3_A1942BarTipCoT ;
   private boolean[] T00DP3_n1942BarTipCoT ;
   private String[] T00DP3_A1943BarNomClT ;
   private boolean[] T00DP3_n1943BarNomClT ;
   private int[] T00DP3_A1944BarNumClT ;
   private boolean[] T00DP3_n1944BarNumClT ;
   private String[] T00DP3_A1945BarMaqTin ;
   private boolean[] T00DP3_n1945BarMaqTin ;
   private int[] T00DP3_A1946BarVolTin ;
   private boolean[] T00DP3_n1946BarVolTin ;
   private java.math.BigDecimal[] T00DP3_A1947BarKgmTin ;
   private boolean[] T00DP3_n1947BarKgmTin ;
   private java.math.BigDecimal[] T00DP3_A1948BarMtrTin ;
   private boolean[] T00DP3_n1948BarMtrTin ;
   private int[] T00DP3_A1949BarPieTin ;
   private boolean[] T00DP3_n1949BarPieTin ;
   private byte[] T00DP3_A2304BarEstTin ;
   private boolean[] T00DP3_n2304BarEstTin ;
   private String[] T00DP3_A2316BarAgrLot ;
   private boolean[] T00DP3_n2316BarAgrLot ;
   private short[] T00DP3_A3650BarNumAna ;
   private boolean[] T00DP3_n3650BarNumAna ;
   private short[] T00DP3_A3651BarTipDef ;
   private boolean[] T00DP3_n3651BarTipDef ;
   private byte[] T00DP3_A3652BarIntens ;
   private boolean[] T00DP3_n3652BarIntens ;
   private String[] T00DP3_A3653BarPriCod ;
   private boolean[] T00DP3_n3653BarPriCod ;
   private java.math.BigDecimal[] T00DP3_A3654BarCosPD ;
   private boolean[] T00DP3_n3654BarCosPD ;
   private java.math.BigDecimal[] T00DP3_A3658BarCosPA ;
   private boolean[] T00DP3_n3658BarCosPA ;
   private java.math.BigDecimal[] T00DP3_A3656BarCosAD ;
   private boolean[] T00DP3_n3656BarCosAD ;
   private java.math.BigDecimal[] T00DP3_A3657BarCosAA ;
   private boolean[] T00DP3_n3657BarCosAA ;
   private java.math.BigDecimal[] T00DP3_A3705BarCosCol ;
   private boolean[] T00DP3_n3705BarCosCol ;
   private java.math.BigDecimal[] T00DP3_A3706BarCosAnc ;
   private boolean[] T00DP3_n3706BarCosAnc ;
   private short[] T00DP3_A4923BarNumActx ;
   private boolean[] T00DP3_n4923BarNumActx ;
   private int[] T00DP3_A4924BarNumPda ;
   private boolean[] T00DP3_n4924BarNumPda ;
   private String[] T00DP3_A4925BarFaseCod ;
   private boolean[] T00DP3_n4925BarFaseCod ;
   private short[] T00DP3_A4926BarFaseOrd ;
   private boolean[] T00DP3_n4926BarFaseOrd ;
   private short[] T00DP3_A4977BarReoNum ;
   private boolean[] T00DP3_n4977BarReoNum ;
   private String[] T00DP3_A5169BarTipDTin ;
   private boolean[] T00DP3_n5169BarTipDTin ;
   private String[] T00DP3_A5170BarTipCTin ;
   private boolean[] T00DP3_n5170BarTipCTin ;
   private String[] T00DP3_A5171BarTipNTin ;
   private boolean[] T00DP3_n5171BarTipNTin ;
   private java.math.BigDecimal[] T00DP3_A5899BarCosttTi ;
   private boolean[] T00DP3_n5899BarCosttTi ;
   private short[] T00DP3_A5900BarRbTeo ;
   private boolean[] T00DP3_n5900BarRbTeo ;
   private int[] T00DP3_A6177BarNumTin ;
   private boolean[] T00DP3_n6177BarNumTin ;
   private short[] T00DP3_A6431BarCausa ;
   private boolean[] T00DP3_n6431BarCausa ;
   private String[] T00DP3_A6634BarRecAcb ;
   private boolean[] T00DP3_n6634BarRecAcb ;
   private java.math.BigDecimal[] T00DP3_A8563BarKgsTt ;
   private boolean[] T00DP3_n8563BarKgsTt ;
   private short[] T00DP3_A8584FamCodT ;
   private boolean[] T00DP3_n8584FamCodT ;
   private int[] T00DP3_A8609BarForNum ;
   private boolean[] T00DP3_n8609BarForNum ;
   private byte[] T00DP3_A9754BarNTint ;
   private boolean[] T00DP3_n9754BarNTint ;
   private String[] T00DP3_A10539BarAcs ;
   private boolean[] T00DP3_n10539BarAcs ;
   private String[] T00DP3_A10540BarNprg ;
   private boolean[] T00DP3_n10540BarNprg ;
   private int[] T00DP3_A10541BarLts ;
   private boolean[] T00DP3_n10541BarLts ;
   private java.math.BigDecimal[] T00DP3_A10546BarLtsV ;
   private boolean[] T00DP3_n10546BarLtsV ;
   private java.util.Date[] T00DP3_A11177BarFecIt ;
   private boolean[] T00DP3_n11177BarFecIt ;
   private java.util.Date[] T00DP3_A11178BarFecFt ;
   private boolean[] T00DP3_n11178BarFecFt ;
   private String[] T00DP3_A11179BarColNm ;
   private boolean[] T00DP3_n11179BarColNm ;
   private String[] T00DP3_A11762BarDispCli ;
   private boolean[] T00DP3_n11762BarDispCli ;
   private java.math.BigDecimal[] T00DP3_A12993BarMtsTt ;
   private boolean[] T00DP3_n12993BarMtsTt ;
   private java.util.Date[] T00DP3_A13759EstFecCier ;
   private short[] T00DP3_A13760EstCdn1 ;
   private String[] T00DP3_A13761EstCdn2 ;
   private String[] T00DP3_A13762EstCtw ;
   private String[] T00DP3_A396EmprCod ;
   private int[] T00DP3_A252CliCod ;
   private short[] T00DP2_A3646EstTinAny ;
   private byte[] T00DP2_A3647EstTinMes ;
   private byte[] T00DP2_A3648EstTinDia ;
   private short[] T00DP2_A1929EstTinNr ;
   private int[] T00DP2_A1933BarCodTin ;
   private boolean[] T00DP2_n1933BarCodTin ;
   private byte[] T00DP2_A1934BarReoTin ;
   private boolean[] T00DP2_n1934BarReoTin ;
   private String[] T00DP2_A1935BarParTin ;
   private boolean[] T00DP2_n1935BarParTin ;
   private String[] T00DP2_A1936BarSerTin ;
   private boolean[] T00DP2_n1936BarSerTin ;
   private String[] T00DP2_A1937BarDscTin ;
   private boolean[] T00DP2_n1937BarDscTin ;
   private short[] T00DP2_A1939BarArtTin ;
   private boolean[] T00DP2_n1939BarArtTin ;
   private String[] T00DP2_A1940BarColNoT ;
   private boolean[] T00DP2_n1940BarColNoT ;
   private int[] T00DP2_A1941BarColNuT ;
   private boolean[] T00DP2_n1941BarColNuT ;
   private byte[] T00DP2_A1942BarTipCoT ;
   private boolean[] T00DP2_n1942BarTipCoT ;
   private String[] T00DP2_A1943BarNomClT ;
   private boolean[] T00DP2_n1943BarNomClT ;
   private int[] T00DP2_A1944BarNumClT ;
   private boolean[] T00DP2_n1944BarNumClT ;
   private String[] T00DP2_A1945BarMaqTin ;
   private boolean[] T00DP2_n1945BarMaqTin ;
   private int[] T00DP2_A1946BarVolTin ;
   private boolean[] T00DP2_n1946BarVolTin ;
   private java.math.BigDecimal[] T00DP2_A1947BarKgmTin ;
   private boolean[] T00DP2_n1947BarKgmTin ;
   private java.math.BigDecimal[] T00DP2_A1948BarMtrTin ;
   private boolean[] T00DP2_n1948BarMtrTin ;
   private int[] T00DP2_A1949BarPieTin ;
   private boolean[] T00DP2_n1949BarPieTin ;
   private byte[] T00DP2_A2304BarEstTin ;
   private boolean[] T00DP2_n2304BarEstTin ;
   private String[] T00DP2_A2316BarAgrLot ;
   private boolean[] T00DP2_n2316BarAgrLot ;
   private short[] T00DP2_A3650BarNumAna ;
   private boolean[] T00DP2_n3650BarNumAna ;
   private short[] T00DP2_A3651BarTipDef ;
   private boolean[] T00DP2_n3651BarTipDef ;
   private byte[] T00DP2_A3652BarIntens ;
   private boolean[] T00DP2_n3652BarIntens ;
   private String[] T00DP2_A3653BarPriCod ;
   private boolean[] T00DP2_n3653BarPriCod ;
   private java.math.BigDecimal[] T00DP2_A3654BarCosPD ;
   private boolean[] T00DP2_n3654BarCosPD ;
   private java.math.BigDecimal[] T00DP2_A3658BarCosPA ;
   private boolean[] T00DP2_n3658BarCosPA ;
   private java.math.BigDecimal[] T00DP2_A3656BarCosAD ;
   private boolean[] T00DP2_n3656BarCosAD ;
   private java.math.BigDecimal[] T00DP2_A3657BarCosAA ;
   private boolean[] T00DP2_n3657BarCosAA ;
   private java.math.BigDecimal[] T00DP2_A3705BarCosCol ;
   private boolean[] T00DP2_n3705BarCosCol ;
   private java.math.BigDecimal[] T00DP2_A3706BarCosAnc ;
   private boolean[] T00DP2_n3706BarCosAnc ;
   private short[] T00DP2_A4923BarNumActx ;
   private boolean[] T00DP2_n4923BarNumActx ;
   private int[] T00DP2_A4924BarNumPda ;
   private boolean[] T00DP2_n4924BarNumPda ;
   private String[] T00DP2_A4925BarFaseCod ;
   private boolean[] T00DP2_n4925BarFaseCod ;
   private short[] T00DP2_A4926BarFaseOrd ;
   private boolean[] T00DP2_n4926BarFaseOrd ;
   private short[] T00DP2_A4977BarReoNum ;
   private boolean[] T00DP2_n4977BarReoNum ;
   private String[] T00DP2_A5169BarTipDTin ;
   private boolean[] T00DP2_n5169BarTipDTin ;
   private String[] T00DP2_A5170BarTipCTin ;
   private boolean[] T00DP2_n5170BarTipCTin ;
   private String[] T00DP2_A5171BarTipNTin ;
   private boolean[] T00DP2_n5171BarTipNTin ;
   private java.math.BigDecimal[] T00DP2_A5899BarCosttTi ;
   private boolean[] T00DP2_n5899BarCosttTi ;
   private short[] T00DP2_A5900BarRbTeo ;
   private boolean[] T00DP2_n5900BarRbTeo ;
   private int[] T00DP2_A6177BarNumTin ;
   private boolean[] T00DP2_n6177BarNumTin ;
   private short[] T00DP2_A6431BarCausa ;
   private boolean[] T00DP2_n6431BarCausa ;
   private String[] T00DP2_A6634BarRecAcb ;
   private boolean[] T00DP2_n6634BarRecAcb ;
   private java.math.BigDecimal[] T00DP2_A8563BarKgsTt ;
   private boolean[] T00DP2_n8563BarKgsTt ;
   private short[] T00DP2_A8584FamCodT ;
   private boolean[] T00DP2_n8584FamCodT ;
   private int[] T00DP2_A8609BarForNum ;
   private boolean[] T00DP2_n8609BarForNum ;
   private byte[] T00DP2_A9754BarNTint ;
   private boolean[] T00DP2_n9754BarNTint ;
   private String[] T00DP2_A10539BarAcs ;
   private boolean[] T00DP2_n10539BarAcs ;
   private String[] T00DP2_A10540BarNprg ;
   private boolean[] T00DP2_n10540BarNprg ;
   private int[] T00DP2_A10541BarLts ;
   private boolean[] T00DP2_n10541BarLts ;
   private java.math.BigDecimal[] T00DP2_A10546BarLtsV ;
   private boolean[] T00DP2_n10546BarLtsV ;
   private java.util.Date[] T00DP2_A11177BarFecIt ;
   private boolean[] T00DP2_n11177BarFecIt ;
   private java.util.Date[] T00DP2_A11178BarFecFt ;
   private boolean[] T00DP2_n11178BarFecFt ;
   private String[] T00DP2_A11179BarColNm ;
   private boolean[] T00DP2_n11179BarColNm ;
   private String[] T00DP2_A11762BarDispCli ;
   private boolean[] T00DP2_n11762BarDispCli ;
   private java.math.BigDecimal[] T00DP2_A12993BarMtsTt ;
   private boolean[] T00DP2_n12993BarMtsTt ;
   private java.util.Date[] T00DP2_A13759EstFecCier ;
   private short[] T00DP2_A13760EstCdn1 ;
   private String[] T00DP2_A13761EstCdn2 ;
   private String[] T00DP2_A13762EstCtw ;
   private String[] T00DP2_A396EmprCod ;
   private int[] T00DP2_A252CliCod ;
   private String[] T00DP25_A396EmprCod ;
   private short[] T00DP25_A3646EstTinAny ;
   private byte[] T00DP25_A3647EstTinMes ;
   private byte[] T00DP25_A3648EstTinDia ;
   private short[] T00DP25_A1929EstTinNr ;
   private String[] T00DP25_A13944EstNormaId ;
   private String[] T00DP26_A396EmprCod ;
   private short[] T00DP26_A3646EstTinAny ;
   private byte[] T00DP26_A3647EstTinMes ;
   private byte[] T00DP26_A3648EstTinDia ;
   private short[] T00DP26_A1929EstTinNr ;
   private String[] T00DP27_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcontin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcontin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcontin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcontin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcontin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00DP2", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, EmprCod, CliCod FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ?  FOR UPDATE OF BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP3", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, EmprCod, CliCod FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP4", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP5", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinUL, EmprCod FROM TXPCONTIN WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ?  FOR UPDATE OF EstTinUL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP6", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinUL, EmprCod FROM TXPCONTIN WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP8", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstTinAny, TM1.EstTinMes, TM1.EstTinDia, T2.EmprNom, TM1.EstTinUL, TM1.EmprCod FROM (TXPCONTIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.EstTinAny = ? and TM1.EstTinMes = ? and TM1.EstTinDia = ? ORDER BY TM1.EmprCod, TM1.EstTinAny, TM1.EstTinMes, TM1.EstTinDia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia FROM TXPCONTIN WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia FROM TXPCONTIN WHERE ( EmprCod > ? or EmprCod = ? and EstTinAny > ? or EstTinAny = ? and EmprCod = ? and EstTinMes > ? or EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinDia > ?) ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DP12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia FROM TXPCONTIN WHERE ( EmprCod < ? or EmprCod = ? and EstTinAny < ? or EstTinAny = ? and EmprCod = ? and EstTinMes < ? or EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinDia < ?) ORDER BY EmprCod DESC, EstTinAny DESC, EstTinMes DESC, EstTinDia DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00DP13", "INSERT INTO TXPCONTIN(EstTinAny, EstTinMes, EstTinDia, EstTinUL, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCONTIN")
         ,new UpdateCursor("T00DP14", "UPDATE TXPCONTIN SET EstTinUL=?  WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ?", GX_NOMASK, "TXPCONTIN")
         ,new UpdateCursor("T00DP15", "DELETE FROM TXPCONTIN  WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ?", GX_NOMASK, "TXPCONTIN")
         ,new ForEachCursor("T00DP16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP17", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId FROM TXPCONTI1 WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DP18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, EstTinAny, EstTinMes, EstTinDia FROM TXPCONTIN ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP19", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, EmprCod, CliCod FROM TXPLCONTI WHERE EmprCod = ? and EstTinAny = ? and EstTinMes = ? and EstTinDia = ? and EstTinNr = ? ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP20", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP21", "SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00DP22", "INSERT INTO TXPLCONTI(EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLCONTI")
         ,new UpdateCursor("T00DP23", "UPDATE TXPLCONTI SET BarCodTin=?, BarReoTin=?, BarParTin=?, BarSerTin=?, BarDscTin=?, BarArtTin=?, BarColNoT=?, BarColNuT=?, BarTipCoT=?, BarNomClT=?, BarNumClT=?, BarMaqTin=?, BarVolTin=?, BarKgmTin=?, BarMtrTin=?, BarPieTin=?, BarEstTin=?, BarAgrLot=?, BarNumAna=?, BarTipDef=?, BarIntens=?, BarPriCod=?, BarCosPD=?, BarCosPA=?, BarCosAD=?, BarCosAA=?, BarCosCol=?, BarCosAnc=?, BarNumActx=?, BarNumPda=?, BarFaseCod=?, BarFaseOrd=?, BarReoNum=?, BarTipDTin=?, BarTipCTin=?, BarTipNTin=?, BarCosttTi=?, BarRbTeo=?, BarNumTin=?, BarCausa=?, BarRecAcb=?, BarKgsTt=?, FamCodT=?, BarForNum=?, BarNTint=?, BarAcs=?, BarNprg=?, BarLts=?, BarLtsV=?, BarFecIt=?, BarFecFt=?, BarColNm=?, BarDispCli=?, BarMtsTt=?, EstFecCier=?, EstCdn1=?, EstCdn2=?, EstCtw=?, CliCod=?  WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ?", GX_NOMASK, "TXPLCONTI")
         ,new UpdateCursor("T00DP24", "DELETE FROM TXPLCONTI  WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ?", GX_NOMASK, "TXPLCONTI")
         ,new ForEachCursor("T00DP25", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId FROM TXPCONTI1 WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00DP26", "SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? and EstTinAny = ? and EstTinMes = ? and EstTinDia = ? ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00DP27", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 8);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(37);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 10);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(41,5);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((int[]) buf[80])[0] = rslt.getInt(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((int[]) buf[90])[0] = rslt.getInt(48);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((byte[]) buf[92])[0] = rslt.getByte(49);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(50, 6);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(51, 6);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((int[]) buf[98])[0] = rslt.getInt(52);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[102])[0] = rslt.getGXDateTime(54);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[104])[0] = rslt.getGXDateTime(55);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 30);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 20);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[110])[0] = rslt.getBigDecimal(58,2);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[112])[0] = rslt.getGXDate(59);
               ((short[]) buf[113])[0] = rslt.getShort(60);
               ((String[]) buf[114])[0] = rslt.getString(61, 4);
               ((String[]) buf[115])[0] = rslt.getString(62, 4);
               ((String[]) buf[116])[0] = rslt.getString(63, 3);
               ((int[]) buf[117])[0] = rslt.getInt(64);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 8);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(37);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 10);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(41,5);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((int[]) buf[80])[0] = rslt.getInt(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((int[]) buf[90])[0] = rslt.getInt(48);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((byte[]) buf[92])[0] = rslt.getByte(49);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(50, 6);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(51, 6);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((int[]) buf[98])[0] = rslt.getInt(52);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[102])[0] = rslt.getGXDateTime(54);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[104])[0] = rslt.getGXDateTime(55);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 30);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 20);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[110])[0] = rslt.getBigDecimal(58,2);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[112])[0] = rslt.getGXDate(59);
               ((short[]) buf[113])[0] = rslt.getShort(60);
               ((String[]) buf[114])[0] = rslt.getString(61, 4);
               ((String[]) buf[115])[0] = rslt.getString(62, 4);
               ((String[]) buf[116])[0] = rslt.getString(63, 3);
               ((int[]) buf[117])[0] = rslt.getInt(64);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(21);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(33);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 8);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(37);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(40, 10);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(41,5);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((int[]) buf[80])[0] = rslt.getInt(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((int[]) buf[90])[0] = rslt.getInt(48);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((byte[]) buf[92])[0] = rslt.getByte(49);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(50, 6);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(51, 6);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((int[]) buf[98])[0] = rslt.getInt(52);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[102])[0] = rslt.getGXDateTime(54);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[104])[0] = rslt.getGXDateTime(55);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 30);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 20);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[110])[0] = rslt.getBigDecimal(58,2);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[112])[0] = rslt.getGXDate(59);
               ((short[]) buf[113])[0] = rslt.getShort(60);
               ((String[]) buf[114])[0] = rslt.getString(61, 4);
               ((String[]) buf[115])[0] = rslt.getString(62, 4);
               ((String[]) buf[116])[0] = rslt.getString(63, 3);
               ((int[]) buf[117])[0] = rslt.getInt(64);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 20 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 26);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 13);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 13);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 6);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[35]).intValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 10);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[63]).intValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[65], 8);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[75], 10);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[81]).intValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[85], 1);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(48, ((Number) parms[91]).intValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(49, ((Number) parms[93]).byteValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[95], 6);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[97], 6);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(52, ((Number) parms[99]).intValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(53, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(54, (java.util.Date)parms[103], false);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(55, (java.util.Date)parms[105], false);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[107], 30);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[109], 20);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[111], 2);
               }
               stmt.setDate(59, (java.util.Date)parms[112]);
               stmt.setShort(60, ((Number) parms[113]).shortValue());
               stmt.setString(61, (String)parms[114], 4);
               stmt.setString(62, (String)parms[115], 4);
               stmt.setString(63, (String)parms[116], 3);
               stmt.setInt(64, ((Number) parms[117]).intValue());
               return;
            case 21 :
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
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 26);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 13);
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
                  stmt.setString(12, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 10);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[59]).intValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 8);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 10);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[73], 5);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[75]).shortValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(39, ((Number) parms[77]).intValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[81], 1);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(44, ((Number) parms[87]).intValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(45, ((Number) parms[89]).byteValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[91], 6);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[93], 6);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(48, ((Number) parms[95]).intValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(50, (java.util.Date)parms[99], false);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(51, (java.util.Date)parms[101], false);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 30);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 20);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[107], 2);
               }
               stmt.setDate(55, (java.util.Date)parms[108]);
               stmt.setShort(56, ((Number) parms[109]).shortValue());
               stmt.setString(57, (String)parms[110], 4);
               stmt.setString(58, (String)parms[111], 4);
               stmt.setInt(59, ((Number) parms[112]).intValue());
               stmt.setString(60, (String)parms[113], 3);
               stmt.setShort(61, ((Number) parms[114]).shortValue());
               stmt.setByte(62, ((Number) parms[115]).byteValue());
               stmt.setByte(63, ((Number) parms[116]).byteValue());
               stmt.setShort(64, ((Number) parms[117]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

